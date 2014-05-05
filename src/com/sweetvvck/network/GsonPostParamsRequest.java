package com.sweetvvck.network;

import java.util.HashMap;
import java.util.Map;

import com.android.volley.AuthFailureError;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;

public class GsonPostParamsRequest<T> extends GsonRequest<T> {
	private HashMap<String, String> params = null;

	public GsonPostParamsRequest(int method, String url, GsonObj obj,
			Listener<T> listener, ErrorListener errorListener, Class<T> types,
			HashMap<String, String> params) {
		super(method, url, obj, listener, errorListener, types);
		this.params = params;
	}

	@Override
	public String getBodyContentType() {
		return "application/x-www-form-urlencoded";
	}

	@Override
	protected Map<String, String> getParams() throws AuthFailureError {
		return params;
	}

	@Override
	public byte[] getBody() {
		if (params != null && params.size() > 0) {
			return encodeParameters(params, getParamsEncoding());
		}
		return null;
	}
}
