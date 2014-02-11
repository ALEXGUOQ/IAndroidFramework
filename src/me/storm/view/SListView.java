/*
 * Created by Storm Zhang, 2014.
 */

package me.storm.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListView;

public class SListView extends ListView {
	private LoadingFooter mLoadingFooter;
	private SListViewListener mSListViewListener;

	public SListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public SListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public SListView(Context context) {
		super(context);
		init();
	}

	private void init() {
		mLoadingFooter = new LoadingFooter(getContext());
		mLoadingFooter.setState(LoadingFooter.State.Idle);
		addFooterView(mLoadingFooter.getView());
		setOnScrollListener(new AbsListView.OnScrollListener() {
			@Override
			public void onScrollStateChanged(AbsListView view, int scrollState) {

			}

			@Override
			public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount,
					int totalItemCount) {
				if (mLoadingFooter.getState() == LoadingFooter.State.Loading
						|| mLoadingFooter.getState() == LoadingFooter.State.TheEnd) {
					return;
				}
				if (firstVisibleItem + visibleItemCount >= totalItemCount && totalItemCount != 0
						&& totalItemCount != getHeaderViewsCount() + getFooterViewsCount()
						&& getAdapter().getCount() > 0) {
					if (mSListViewListener != null) {
						mLoadingFooter.setState(LoadingFooter.State.Loading);
						mSListViewListener.loadMore();
					}
				}
			}
		});
	}

	public void setSListViewListener(SListViewListener listener) {
		this.mSListViewListener = listener;
	}

	public interface SListViewListener {
		public void loadMore();
	}
}
