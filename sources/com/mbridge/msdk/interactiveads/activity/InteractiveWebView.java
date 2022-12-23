package com.mbridge.msdk.interactiveads.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

public class InteractiveWebView extends WebView {
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public InteractiveWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InteractiveWebView(Context context) {
        super(context);
    }
}
