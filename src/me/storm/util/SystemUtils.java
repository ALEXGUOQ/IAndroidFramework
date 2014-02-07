/*
 * @creator Storm
 * @created_at 2013-7-1
 */

package com.storm.util;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

public class SystemUtils {
	// MAC地址(如:1C:B0:94:ED:6C:AC)
	public static String getMacAddress(Context context) {
		WifiManager manager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
		WifiInfo info = manager.getConnectionInfo();
		String address = info.getMacAddress();
		return address;
	}

	// API版本号(如:14)
	public static int getVersion() {
		return android.os.Build.VERSION.SDK_INT;
	}

	// 系统版本号(如:4.0)
	public static String getVersionCode() {
		return android.os.Build.VERSION.RELEASE;
	}

	// 手机型号(如:Galaxy Nexus)
	public static String getPhoneModel() {
		return android.os.Build.MODEL;
	}
}
