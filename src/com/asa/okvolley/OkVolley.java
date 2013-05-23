package com.asa.okvolley;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * A convenience class for creating an {@link RequestQueue} using
 * {@link OkHttpStack}.
 */
public class OkVolley extends Volley {

	public static RequestQueue newRequestQueue(Context context) {
		return Volley.newRequestQueue(context, new OkHttpStack());
	}

}
