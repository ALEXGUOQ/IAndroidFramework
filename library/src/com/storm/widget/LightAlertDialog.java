/*
 * @creator Storm
 * @created_at Oct 26, 2013 5:04:58 PM
 * Copyright (C) 2013 BOOHEE. All rights reserved.
 */

package com.storm.widget;

import android.app.AlertDialog;
import android.content.Context;

/**
 * Alert dialog in Holo Light theme
 */
public class LightAlertDialog extends AlertDialog {
	/**
	 * @param context
	 */
	protected LightAlertDialog(Context context) {
		super(context);
	}

	/**
	 * @param context
	 * @param theme
	 */
	protected LightAlertDialog(Context context, int theme) {
		super(context, theme);
	}

	/**
	 * Create light dialog
	 * 
	 * @param context
	 * @return light alert dialog
	 */
	public static LightAlertDialog create(Context context) {
		LightAlertDialog dialog;
		if (android.os.Build.VERSION.SDK_INT >= 14)
			dialog = new LightAlertDialog(context, THEME_HOLO_LIGHT);
		else {
			dialog = new LightAlertDialog(context);
			dialog.setInverseBackgroundForced(true);
		}
		return dialog;
	}

	/**
	 * Create light dialog with title and message
	 * 
	 * @param context
	 * @param title
	 * @param message
	 * @return alert dialog
	 */
	public static LightAlertDialog create(Context context, String title, String message) {
		LightAlertDialog dialog = create(context);
		dialog.setTitle(title);
		dialog.setMessage(message);
		return dialog;
	}

	/**
	 * Create light dialog with title and message
	 * 
	 * @param context
	 * @param title
	 * @param resId
	 * @return alert dialog
	 */
	public static LightAlertDialog create(Context context, int title, int resId) {
		LightAlertDialog dialog = create(context);
		dialog.setTitle(title);
		dialog.setMessage(context.getString(resId));
		return dialog;
	}

	/**
	 * Set positive button
	 * 
	 * @param redId
	 * @param listener
	 * @return this dialog
	 */
	public LightAlertDialog setPositiveButton(int redId, OnClickListener listener) {
		return setPositiveButton(getContext().getString(redId), listener);
	}

	/**
	 * Set positive button
	 * 
	 * @param listener
	 * @return this dialog
	 */
	public LightAlertDialog setPositiveButton(OnClickListener listener) {
		return setPositiveButton(android.R.string.ok, listener);
	}

	/**
	 * Set positive button
	 * 
	 * @param text
	 * @param listener
	 * @return this dialog
	 */
	public LightAlertDialog setPositiveButton(CharSequence text, OnClickListener listener) {
		setButton(BUTTON_POSITIVE, text, listener);
		return this;
	}

	/**
	 * Set negative button
	 * 
	 * @param resId
	 * @param listener
	 * @return this dialog
	 */
	public LightAlertDialog setNegativeButton(int resId, OnClickListener listener) {
		return setNegativeButton(getContext().getString(resId), listener);
	}

	/**
	 * Set negative button
	 * 
	 * @param listener
	 * @return this dialog
	 */
	public LightAlertDialog setNegativeButton(OnClickListener listener) {
		return setNegativeButton(android.R.string.cancel, listener);
	}

	/**
	 * Set negative button
	 * 
	 * @param text
	 * @param listener
	 * @return this dialog
	 */
	public LightAlertDialog setNegativeButton(CharSequence text, OnClickListener listener) {
		setButton(BUTTON_NEGATIVE, text, listener);
		return this;
	}
}
