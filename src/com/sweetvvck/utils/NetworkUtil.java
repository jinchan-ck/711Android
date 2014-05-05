
package com.sweetvvck.utils;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;

public class NetworkUtil {

    private static final String TAG = "NetworkUtil";

    private static Context sContext;

    private static final int S_DISCONNECT = 1;

    private static final int S_WIFI_ENABLED = 2;

    private static final int S_CMWAP_CONNECTED = 3;

    private static final int S_CMNET_CONNECTED = 4;

    private static int sLastState = S_DISCONNECT;

    public static void init(Context ctx) {
        sContext = ctx.getApplicationContext();
    }

    public static boolean isConnected() {
        return sLastState != S_DISCONNECT;
    }

    public static boolean isWifiConnected() {
        return sLastState == S_WIFI_ENABLED;
    }

    public static boolean isCmwapConnected() {
        return sLastState == S_CMWAP_CONNECTED;
    }

    public static boolean isGprsConnected() {
        return isConnected() && !isWifiConnected();
    }

    public static void checkNetworkState() {
        // Check connectivity state
        if(sContext == null){
            return;
        }
        ConnectivityManager cm = (ConnectivityManager) sContext
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo network = cm.getActiveNetworkInfo();
        if (network != null && network.isConnected()) {
            LogUtil.d(TAG, "getExtraInfo = " + network.getExtraInfo());
            LogUtil.d(TAG, "connected true");
            WifiManager wifiManager = (WifiManager) sContext.getSystemService(Context.WIFI_SERVICE);
            if (wifiManager.isWifiEnabled()) {
                LogUtil.d(TAG, "wifi true");
                sLastState = S_WIFI_ENABLED;
            } else if ("mobile".equalsIgnoreCase(network.getTypeName())
                    && "cmwap".equalsIgnoreCase(network.getExtraInfo())) {
                LogUtil.d(TAG, "cmwap true");
                sLastState = S_CMWAP_CONNECTED;
            } else { // TODO 有没有其他情况？
                LogUtil.d(TAG, "cmnet true");
                sLastState = S_CMNET_CONNECTED;
            }
        } else {
            LogUtil.d(TAG, "connected false");
            sLastState = S_DISCONNECT;
        }
    }

}
