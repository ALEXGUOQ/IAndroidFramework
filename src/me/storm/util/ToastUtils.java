/*
 * @creator Storm
 * @created_at 2013-7-1
 */

package com.storm.util;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public class ToastUtils {

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

	public static void showLong(final Activity activity, final int resId) {
		show(activity, resId, Toast.LENGTH_LONG);
	}

	public static void showShort(final Activity activity, final int resId) {
		show(activity, resId, Toast.LENGTH_SHORT);
	}

	public static void showLong(final Activity activity, final String message) {
		show(activity, message, Toast.LENGTH_LONG);
	}

	public static void showShort(final Activity activity, final String message) {
		show(activity, message, Toast.LENGTH_SHORT);
	}
}
