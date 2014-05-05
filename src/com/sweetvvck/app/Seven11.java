package com.sweetvvck.app;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.sweetvvck.utils.NetworkUtil;
import com.sweetvvck.utils.SpfsUtil;
import com.sweetvvck.utils.ToastUtil;

public class Seven11 extends Application {
	private static RequestQueue queue;

	@Override
	public void onCreate() {
		super.onCreate();
		queue = Volley.newRequestQueue(this);
		ToastUtil.init(this);
		SpfsUtil.init(this);
		NetworkUtil.init(this);
	}

	public static RequestQueue getVolleyReqQueue() {
		return queue;
	}
}
