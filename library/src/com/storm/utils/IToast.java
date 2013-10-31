/*
 * @creator Storm
 * @created_at 2013-7-1 下午5:36:23
 * Copyright (C) 2013 BOOHEE. All rights reserved.
 */

package com.storm.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Helper to show {@link Toast} notifications
 */
public class IToast {

	private static void show(final Activity activity, final int resId, final int duration) {
		if (activity == null)
			return;

		final Context context = activity.getApplication();
		activity.runOnUiThread(new Runnable() {
			public void run() {
				Toast.makeText(context, resId, duration).show();
			}
		});
	}

	private static void show(final Activity activity, final String message, final int duration) {
		if (activity == null)
			return;
		if (TextUtils.isEmpty(message))
			return;

		final Context context = activity.getApplication();
		activity.runOnUiThread(new Runnable() {
			public void run() {
				Toast.makeText(context, message, duration).show();
			}
		});
	}

	/**
	 * Show message in {@link Toast} with {@link Toast#LENGTH_LONG} duration
	 * 
	 * @param activity
	 * @param resId
	 */
	public static void showLong(final Activity activity, final int resId) {
		show(activity, resId, Toast.LENGTH_LONG);
	}

	/**
	 * Show message in {@link Toast} with {@link Toast#LENGTH_SHORT} duration
	 * 
	 * @param activity
	 * @param resId
	 */
	public static void showShort(final Activity activity, final int resId) {
		show(activity, resId, Toast.LENGTH_SHORT);
	}

	/**
	 * Show message in {@link Toast} with {@link Toast#LENGTH_LONG} duration
	 * 
	 * @param activity
	 * @param message
	 */
	public static void showLong(final Activity activity, final String message) {
		show(activity, message, Toast.LENGTH_LONG);
	}

	/**
	 * Show message in {@link Toast} with {@link Toast#LENGTH_SHORT} duration
	 * 
	 * @param activity
	 * @param message
	 */
	public static void showShort(final Activity activity, final String message) {
		show(activity, message, Toast.LENGTH_SHORT);
	}
}
