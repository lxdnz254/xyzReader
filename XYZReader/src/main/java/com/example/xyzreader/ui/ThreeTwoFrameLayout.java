package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by alex on 27/06/16.
 */
public class ThreeTwoFrameLayout extends FrameLayout {

    public ThreeTwoFrameLayout(Context context) {
        super(context);
    }

    public ThreeTwoFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threeTwoWidth = MeasureSpec.getSize(heightMeasureSpec) * 3/2;
        int threeTwoWidthSpec = MeasureSpec.makeMeasureSpec(threeTwoWidth, MeasureSpec.EXACTLY);
        super.onMeasure(threeTwoWidthSpec, heightMeasureSpec);
    }
}
