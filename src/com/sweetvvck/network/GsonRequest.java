package com.sweetvvck.network;

import java.io.UnsupportedEncodingException;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;

public class GsonRequest<T> extends JsonRequest<T> {

	private Class<T> types;

	public GsonRequest(int method, String url, GsonObj obj,
			Listener<T> listener, ErrorListener errorListener, Class<T> types) {
		super(method, url, obj != null ? obj.toJson() : null, listener,
				errorListener);
		this.types = types;
	}

	@Override
	protected Response<T> parseNetworkResponse(NetworkResponse response) {
		try {
			String json = new String(response.data,
					HttpHeaderParser.parseCharset(response.headers));
			VolleyLog.d("json:%s", json);
			T t = GsonObj.fromJson(json, types);
			return Response.success(t,
					HttpHeaderParser.parseCacheHeaders(response));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
