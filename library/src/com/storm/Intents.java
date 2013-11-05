package com.storm;
import android.content.Intent;

/*
 * @creator Storm
 * @created_at Oct 31, 2013 4:25:11 PM
 * Copyright (C) 2013 BOOHEE. All rights reserved.
 */

/**
 * Helper for creating intents
 */
public class Intents {

	/**
	 * Prefix for all intents created
	 */
	public static final String INTENT_PREFIX = "com.storm.mobile";

	/**
	 * Builder for generating an intent configured with extra data
	 */
	public static class Builder {
		private final Intent intent;

		/**
		 * Create builder with suffix
		 * 
		 * @param actionSuffix
		 */
		public Builder(String actionSuffix) {
			// actionSuffix = e.g. "repos.VIEW"
			intent = new Intent(INTENT_PREFIX + actionSuffix);
		}

		/**
		 * Add extra field data value to intent being built up
		 * 
		 * @param fieldName
		 * @param value
		 * @return this builder
		 */
		public Builder add(String fieldName, String value) {
			intent.putExtra(fieldName, value);
			return this;
		}

		/**
		 * Add extra field data value to intent being built up
		 * 
		 * @param fieldName
		 * @param value
		 * @return this builder
		 */
		public Builder add(String fieldName, int value) {
			intent.putExtra(fieldName, value);
			return this;
		}

		/**
		 * Get built intent
		 * 
		 * @return intent
		 */
		public Intent toIntent() {
			return intent;
		}
	}
}
