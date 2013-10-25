/*
 * @creator Storm
 * @created_at Oct 21, 2013 10:46:35 AM
 * Copyright (C) 2013 BOOHEE. All rights reserved.
 */

package com.storm.utils;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class IKeyboard {
	// 关闭键盘
	public static void close(Context context, EditText editText) {
		InputMethodManager imm = (InputMethodManager) context
				.getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
	}

	// 打开键盘
	public static void open(Context context, EditText editText) {
		InputMethodManager imm = (InputMethodManager) context
				.getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.showSoftInput(editText, InputMethodManager.SHOW_FORCED);
	}

	// 切换键盘
	public static void toggle(Context context, EditText editText) {
		InputMethodManager imm = (InputMethodManager) context
				.getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.toggleSoftInputFromWindow(editText.getWindowToken(), InputMethodManager.SHOW_FORCED, 0);
	}

	// 整个页面关闭键盘
	public static void closeAll(Context context) {
		InputMethodManager imm = (InputMethodManager) context
				.getSystemService(Context.INPUT_METHOD_SERVICE);
		if (context instanceof Activity)
			imm.hideSoftInputFromWindow(((Activity) context).getCurrentFocus().getWindowToken(), 0);
	}
}
