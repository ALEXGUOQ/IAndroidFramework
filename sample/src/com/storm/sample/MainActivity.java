package com.storm.sample;

import com.storm.utils.ILog;
import com.storm.utils.IToast;
import com.storm.widgets.IDialog;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ILog.e(TAG, "onCreate");
		IToast.showShort(this, "你好，安卓");
		IDialog.create(this, "删除", "确定删除么？").show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
