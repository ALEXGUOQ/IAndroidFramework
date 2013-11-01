package com.storm.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IValidate {
	public static final String CELLPHONE_CHECK = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
	public static final String EMAIL_CHECK = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

	public static boolean checkCellphone(String cellphone) {
		Pattern p = Pattern.compile(CELLPHONE_CHECK);
		Matcher m = p.matcher(cellphone);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkEmail(String email) {
		Pattern p = Pattern.compile(EMAIL_CHECK);
		Matcher m = p.matcher(email);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}
}
