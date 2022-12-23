package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.C13278h5;
import com.yandex.mobile.ads.nativeads.C15504k0;

/* renamed from: com.yandex.mobile.ads.nativeads.m */
public abstract class C15510m<T extends C15504k0> extends FrameLayout {

    /* renamed from: a */
    private T f43905a;

    public C15510m(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71704a(T t) {
        this.f43905a = t;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T t = this.f43905a;
        if (t != null) {
            t.mo71697e();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        T t = this.f43905a;
        if (t != null) {
            t.mo71698f();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        char c = (i != 0 || !isShown()) ? (char) 8 : 0;
        T t = this.f43905a;
        if (t != null) {
            int i2 = C13278h5.f34274b;
            t.toString();
            if (c == 0) {
                t.mo71697e();
            } else {
                t.mo71698f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        getVisibility();
        char c = (i == 0 && getVisibility() == 0) ? (char) 0 : 8;
        T t = this.f43905a;
        if (t != null) {
            int i2 = C13278h5.f34274b;
            t.toString();
            if (c == 0) {
                t.mo71697e();
            } else {
                t.mo71698f();
            }
        }
        super.onWindowVisibilityChanged(i);
    }

    public C15510m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C15510m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
