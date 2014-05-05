package com.sweetvvck.network;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

import com.google.gson.Gson;

public class GsonObj {

	private static Gson sGson;

	private static Gson gsonInstance() {
		if (sGson == null) {
			// sGson = new GsonBuilder()
			// .registerTypeAdapter(PageJob.class, new PageJobSerializer())
			// .registerTypeAdapter(Timestamp.class,
			// new TimestampSerializer())
			// .registerTypeAdapter(Date.class, new DateTimeSerializer())
			// .create();
			sGson = new Gson();
		}
		return sGson;
	}

	public static <T> T fromJson(String json, Class<T> classOfT) {
		Gson gson = gsonInstance();
		return gson.fromJson(json, classOfT);
	}

	@SuppressWarnings("unchecked")
	public static <T> T fromJson(String json, Type typeOfSrc) {
		Gson gson = gsonInstance();
		return (T) gson.fromJson(json, typeOfSrc);
	}

	public String toJson(Type typeOfSrc) {
		Gson gson = gsonInstance();
		return gson.toJson(this, typeOfSrc);
	}

	public <T> String toJson(Class<T> classOfT) {
		Gson gson = gsonInstance();
		return gson.toJson(this, classOfT);
	}

	public String toJson() {
		Gson gson = gsonInstance();
		return gson.toJson(this);
	}

	public String toGetParams() {
		StringBuffer result = new StringBuffer();
		Field[] fields = getClass().getDeclaredFields();
		String fieldName = "";
		String methodName = "";
		for (int i = 0; i < fields.length; i++) {
			fieldName = fields[i].getName();
			methodName = "get" + UpperCaseFstChar(fieldName);
			result.append(fieldName + "=");
			Object obj = null;
			try {
				obj = getClass().getDeclaredMethod(methodName, new Class[] {})
						.invoke(this, new Object[] {});
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
			if (obj == null)
				continue;
			result.append(obj + "&");
		}

		return result.toString().substring(0, result.length() - 1);
	}

	private static String UpperCaseFstChar(String content) {
		return content.substring(0, 1).toUpperCase() + content.substring(1);
	}
}
