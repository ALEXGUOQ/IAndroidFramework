/*
 * @creator Storm
 * @created_at 2013-7-1 下午5:36:23
 * Copyright (C) 2013 BOOHEE. All rights reserved.
 */

package com.storm.utils;

import android.content.Context;
import android.widget.Toast;

public class IToast {
	public static void showLong(Context ctx, String text) {
		Toast.makeText(ctx, text, Toast.LENGTH_LONG).show();
	}

	public static void showShort(Context ctx, String text) {
		Toast.makeText(ctx, text, Toast.LENGTH_SHORT).show();
	}
}
