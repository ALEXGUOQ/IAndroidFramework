/*
 * Copyright 2013 zhangqi <zhangqi.dev@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.storm.sample;

import android.app.Activity;
import android.os.Bundle;

import com.storm.ViewFinder;

public class BaseActivity extends Activity {

	protected ViewFinder finder;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		finder = new ViewFinder(this);
	}

	protected void onPause() {
		super.onPause();
	}

	protected void onDestroy() {
		super.onDestroy();
	}
}
