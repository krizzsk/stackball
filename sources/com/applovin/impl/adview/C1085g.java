package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: com.applovin.impl.adview.g */
public class C1085g extends WebView {

    /* renamed from: a */
    private PointF f1958a = new PointF();

    public C1085g(Context context) {
        super(context);
    }

    public PointF getAndClearLastClickLocation() {
        PointF pointF = this.f1958a;
        this.f1958a = new PointF();
        return pointF;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f1958a = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        return super.onTouchEvent(motionEvent);
    }
}
