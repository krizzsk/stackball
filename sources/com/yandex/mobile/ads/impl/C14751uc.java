package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;
import com.yandex.mobile.ads.impl.el0;

/* renamed from: com.yandex.mobile.ads.impl.uc */
public class C14751uc extends FrameLayout {

    /* renamed from: a */
    private final C14393ql f40615a;

    /* renamed from: b */
    private final Paint f40616b = new Paint();

    /* renamed from: c */
    private final el0 f40617c = new d30();

    /* renamed from: d */
    private int f40618d;

    public C14751uc(Context context, C14393ql qlVar) {
        super(context);
        this.f40615a = qlVar;
        m42651a(context);
    }

    /* renamed from: a */
    private void m42651a(Context context) {
        int a = this.f40615a.mo69618a(context, 1.0f);
        this.f40618d = this.f40615a.mo69618a(context, 0.5f);
        this.f40616b.setStyle(Paint.Style.STROKE);
        this.f40616b.setStrokeWidth((float) a);
        this.f40616b.setColor(SupportMenu.CATEGORY_MASK);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (float) this.f40618d;
        canvas.drawRect(f, f, (float) (getWidth() - this.f40618d), (float) (getHeight() - this.f40618d), this.f40616b);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewParent parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            setLeft(0);
            setTop(0);
            setRight(measuredWidth);
            setBottom(measuredHeight);
            super.onLayout(z, 0, 0, measuredWidth, measuredHeight);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        el0.C12983a a = this.f40617c.mo65798a(i, i2);
        super.onMeasure(a.f33000a, a.f33001b);
    }

    public void setColor(int i) {
        if (this.f40616b.getColor() != i) {
            this.f40616b.setColor(i);
            requestLayout();
        }
    }
}
