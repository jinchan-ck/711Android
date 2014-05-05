package com.sweetvvck.network;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.android.volley.AuthFailureError;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.JsonObjectRequest;

public class PostParamsReqest extends JsonObjectRequest {

	private HashMap<String, String> params = null;

	public PostParamsReqest(int method, String url,
			Listener<JSONObject> listener, ErrorListener errorListener,
			HashMap<String, String> params) {
		super(method, url, null, listener, errorListener);
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
