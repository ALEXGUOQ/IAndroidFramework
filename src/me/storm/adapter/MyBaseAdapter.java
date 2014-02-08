/*
 * @creator Storm
 * @created_at 2014-2-8
 */

package me.storm.adapter;

import java.util.List;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class MyBaseAdapter extends BaseAdapter {

	protected List<? extends Object> items;
	protected Activity activity;
	protected int size;

	protected MyBaseAdapter(Activity activity, List<? extends Object> items) {
		this.activity = activity;
		this.items = items;
		if (items != null)
			size = items.size();
	}

	@Override
	public int getCount() {
		return size;
	}

	@Override
	public Object getItem(int position) {
		return items != null && position < items.size() ? items.get(position) : null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return getItemView(position, convertView, parent);
	}

	protected abstract View getItemView(int position, View convertView, ViewGroup parent);
}
