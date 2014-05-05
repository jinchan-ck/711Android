package com.sweetvvck.utils;

import android.util.Log;

public class LogUtil {

	public static void d(String tag, String msg) {
		if (Constants.DEBUG) {
			String log = (msg != null) ? msg : "";
			Log.d(tag, log);
		}
	}
}
