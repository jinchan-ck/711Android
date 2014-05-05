package com.sweetvvck.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SpfsUtil {

	private static SharedPreferences sharedPreferences;

	public static void init(Context c) {
		sharedPreferences = c.getSharedPreferences("unlock", 0);
	}

	public static void setUserAccount(String account) {
		sharedPreferences.edit().putString("UserAccount", account).commit();
	}

	public static String getUserAccount() {
		return sharedPreferences.getString("UserAccount", "");
	}

	public static void setUserId(String id) {
		sharedPreferences.edit().putString("UserId", id).commit();
	}

	public static String getUserId() {
		return sharedPreferences.getString("UserId", "");
	}

	public static void setUserSessionId(String SessionId) {
		sharedPreferences.edit().putString("UserSessionId", SessionId).commit();
	}

	public static String getUserSessionId() {
		return sharedPreferences.getString("UserSessionId", "");
	}

	public static void setUserName(String username) {
		sharedPreferences.edit().putString("UserName", username).commit();
	}

	public static String getUserName() {
		return sharedPreferences.getString("UserName", "");
	}

	public static void setLogin(boolean flag) {
		sharedPreferences.edit().putBoolean("islogin", flag).commit();
	}

	public static boolean isLogin() {
		return sharedPreferences.getBoolean("islogin", false);
	}

	public static void setPassWord(String pwd) {
		sharedPreferences.edit().putString("password", pwd).commit();
	}

	public static String getPassWord() {
		return sharedPreferences.getString("password", "");
	}

	public static void setCityId(String id) {
		sharedPreferences.edit().putString("cityid", id).commit();
	}

	public static String getCityId() {
		return sharedPreferences.getString("cityid", "");
	}

	public static void setCityName(String cityname) {
		sharedPreferences.edit().putString("cityname", cityname).commit();
	}

	public static String getCityName() {
		return sharedPreferences.getString("cityname", "");
	}

	public static void setSign(String sign) {
		sharedPreferences.edit().putString("sign", sign).commit();
	}

	public static String getSign() {
		return sharedPreferences.getString("sign", "");
	}

	public static void setRememberPassword(boolean sign) {
		sharedPreferences.edit().putBoolean("remember_password", sign).commit();
	}

	public static boolean getRememberPassword() {
		return sharedPreferences.getBoolean("remember_password", true);
	}

	public static void setIsBinded(boolean isBinded) {
		sharedPreferences.edit().putBoolean("isBinded", isBinded).commit();
	}
	
	public static boolean isBinded(){
		return sharedPreferences.getBoolean("isBinded", false);
	}
}
