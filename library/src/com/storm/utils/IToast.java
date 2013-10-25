/*
 * @creator Storm
 * @created_at 2013-7-1 下午5:36:23
 * Copyright (C) 2013 BOOHEE. All rights reserved.
 */

package com.storm.utils;

import android.content.Context;
import android.widget.Toast;

public class IToast {
	public static void showLong(Context context, String text) {
		Toast.makeText(context, text, Toast.LENGTH_LONG).show();
	}

	public static void showShort(Context context, String text) {
		Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
	}

	public static void showLong(Context context, int resId) {
		Toast.makeText(context, resId, Toast.LENGTH_LONG).show();
	}

	public static void showShort(Context context, int resId) {
		Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
	}
}
