package com.storm.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * @author Gauss
 * 
 */
public abstract class MaskedImage extends ImageView {
	private Bitmap mask;
	private Paint paint;

	public MaskedImage(Context paramContext) {
		super(paramContext);
	}

	public MaskedImage(Context paramContext, AttributeSet paramAttributeSet) {
		super(paramContext, paramAttributeSet);
	}

	public MaskedImage(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
		super(paramContext, paramAttributeSet, paramInt);
	}

	public abstract Bitmap createMask();

	@SuppressLint("DrawAllocation")
	protected void onDraw(Canvas paramCanvas) {
		Drawable localDrawable = getDrawable();
		if (localDrawable == null)
			return;
		try {
			if (this.paint == null) {
				Paint localPaint1 = new Paint();
				this.paint = localPaint1;
				this.paint.setFilterBitmap(false);
			}
			float f1 = getWidth();
			float f2 = getHeight();
			int i = paramCanvas.saveLayer(0.0F, 0.0F, f1, f2, null, 31);
			int j = getWidth();
			int k = getHeight();
			localDrawable.setBounds(0, 0, j, k);
			localDrawable.draw(paramCanvas);
			if ((this.mask == null) || (this.mask.isRecycled())) {
				Bitmap localBitmap1 = createMask();
				this.mask = localBitmap1;
			}
			Bitmap localBitmap2 = this.mask;
			Paint localPaint3 = this.paint;
			paramCanvas.drawBitmap(localBitmap2, 0.0F, 0.0F, localPaint3);
			paramCanvas.restoreToCount(i);
			return;
		} catch (Exception localException) {
			StringBuilder localStringBuilder = new StringBuilder()
					.append("Attempting to draw with recycled bitmap. View ID = ");
			System.out.println("localStringBuilder==" + localStringBuilder);
		}
	}
}