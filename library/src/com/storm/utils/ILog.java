/*
 * @creator Storm
 * @created_at 2013-7-2 下午1:48:02
 * Copyright (C) 2013 BOOHEE. All rights reserved.
 */

package com.storm.utils;

import android.database.sqlite.SQLiteException;

public class ILog {
	private static final boolean DEBUG = true;

	public static void i(String tag, String msg) {
		if (DEBUG)
			android.util.Log.i(tag, msg);
	}

	public static void e(String tag, String msg) {
		if (DEBUG)
			android.util.Log.e(tag, msg);
	}

	public static void d(String tag, String msg) {
		if (DEBUG)
			android.util.Log.d(tag, msg);
	}

	public static void v(String tag, String msg) {
		if (DEBUG)
			android.util.Log.v(tag, msg);
	}

	public static void w(String tag, String msg) {
		if (DEBUG)
			android.util.Log.w(tag, msg);
	}

	public static void e(String tag, String string, SQLiteException e) {
		if (DEBUG)
			android.util.Log.e(tag, string, e);
	}
}
