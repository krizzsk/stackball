package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.customview.widget.ViewDragHelper;
import androidx.viewpager.widget.ViewPager;
import java.util.Set;

public class c71 extends ViewPager implements dx0 {

    /* renamed from: a */
    private final bv0 f31832a;

    /* renamed from: b */
    private ViewDragHelper f31833b;

    /* renamed from: c */
    private boolean f31834c;

    /* renamed from: d */
    private boolean f31835d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f31836e;

    /* renamed from: f */
    private boolean f31837f;

    /* renamed from: g */
    private Set<Integer> f31838g;

    /* renamed from: h */
    private cx0 f31839h;

    /* renamed from: com.yandex.mobile.ads.impl.c71$a */
    class C12707a extends ViewDragHelper.Callback {
        C12707a() {
        }

        public void onEdgeDragStarted(int i, int i2) {
            super.onEdgeDragStarted(i, i2);
            c71 c71 = c71.this;
            boolean z = true;
            if ((i & 2) == 0 && (i & 1) == 0) {
                z = false;
            }
            boolean unused = c71.f31836e = z;
        }

        public boolean tryCaptureView(View view, int i) {
            return false;
        }
    }

    public c71(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f31832a.mo66128a(motionEvent);
        return dispatchTouchEvent;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        cx0 cx0 = this.f31839h;
        if ((cx0 != null ? cx0.mo66357a(this, motionEvent) : false) || (m34613a(motionEvent) && super.onInterceptTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f31832a.mo66127a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return m34613a(motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setDisabledScrollPages(Set<Integer> set) {
        this.f31838g = set;
    }

    public void setEdgeScrollEnabled(boolean z) {
        this.f31835d = z;
        if (!z) {
            ViewDragHelper create = ViewDragHelper.create(this, new C12707a());
            this.f31833b = create;
            create.setEdgeTrackingEnabled(3);
        }
    }

    public void setOnInterceptTouchEventListener(cx0 cx0) {
        this.f31839h = cx0;
    }

    public void setScrollEnabled(boolean z) {
        this.f31834c = z;
    }

    public c71(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31832a = new bv0((ViewPager) this);
        this.f31834c = true;
        this.f31835d = true;
        this.f31836e = false;
        this.f31837f = false;
    }

    /* renamed from: a */
    private boolean m34613a(MotionEvent motionEvent) {
        if (!this.f31835d && this.f31833b != null) {
            if ((motionEvent.getAction() & 255) == 0) {
                this.f31836e = false;
            }
            this.f31833b.processTouchEvent(motionEvent);
        }
        Set<Integer> set = this.f31838g;
        if (set != null) {
            this.f31837f = this.f31834c && set.contains(Integer.valueOf(getCurrentItem()));
        }
        if (this.f31836e || this.f31837f || !this.f31834c) {
            return false;
        }
        return true;
    }
}
