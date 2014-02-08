package me.storm.util;

public class StringUtils {
	public static boolean isBlank(String str) {
		return (str == null || str.trim().length() == 0);
	}

	public static boolean isEmpty(String str) {
		return (str == null || str.length() == 0);
	}

	public static String htmlEscapeCharsToString(String source) {
		return isEmpty(source) ? source : source.replaceAll("&lt;", "<").replaceAll("&gt;", ">")
				.replaceAll("&amp;", "&").replaceAll("&quot;", "\"");
	}
}