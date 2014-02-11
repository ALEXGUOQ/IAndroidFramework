/*
 * Created by Storm Zhang, 2014.
 */

package me.storm.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeUtils {

	public static CharSequence getListTime(String created_at) {
        Date date = null;
        SimpleDateFormat srcDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss Z", Locale.US);
        SimpleDateFormat dstDateFormat = new SimpleDateFormat("MMMM dd yyyy", Locale.US);
        try {
            date = srcDateFormat.parse(created_at);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dstDateFormat.format(date);
    }
}
