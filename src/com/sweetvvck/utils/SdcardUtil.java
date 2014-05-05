
package com.sweetvvck.utils;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import android.os.Environment;
import android.os.StatFs;

public class SdcardUtil {

    private static final String TAG = "SdcardUtil";

    public static boolean isSdcardExist() {
        return (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED));
    }

	public static long getSdcardAvailableSize() {
        long size = 0;
        if (isSdcardExist()) {
            File sdcardDir = Environment.getExternalStorageDirectory();
            StatFs sf = new StatFs(sdcardDir.getPath());
            long blockSize = sf.getBlockSize();
            long availCount = sf.getAvailableBlocks();
            size = blockSize * availCount;
        }

        return size;
    }

    public static String getRootPath() {
        return Environment.getExternalStorageDirectory().getPath();
    }

    public static String write2SDCard(String path, String filename, long startPos, byte[] data) {
        if (android.os.Environment.getExternalStorageState().equals(
                android.os.Environment.MEDIA_MOUNTED)) {
            return write(path, filename, startPos, data);
        } else {
            LogUtil.d(TAG, "no sdcard used");
            return null;
        }
    }

    private static String write(String path, String filename, long startPos, byte[] data) {
        File dir = new File(path);
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                LogUtil.d(TAG, "create path: " + path + " failed");
                return null;
            }
        }

        String fullname = null;
        RandomAccessFile raf = null;
        try {
            File f = new File(path, filename);
            if (!f.exists()) {
                if (!f.createNewFile()) {
                    LogUtil.d(TAG, "createNewFile failed");
                    return null;
                }
            }

            raf = new RandomAccessFile(f, "rw");
            raf.seek(startPos);
            raf.write(data, 0, data.length);

            fullname = f.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
            fullname = null;
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    raf = null;
                }
            }
        }

        return fullname;
    }

}
