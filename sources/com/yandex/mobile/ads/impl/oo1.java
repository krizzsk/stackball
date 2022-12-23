package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

public final class oo1 extends ViewGroup {

    /* renamed from: com.yandex.mobile.ads.impl.oo1$a */
    public static final class C14204a extends ViewGroup.MarginLayoutParams {
        public C14204a(int i, int i2) {
            super(i, i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public oo1(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public oo1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public final View mo69242a() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 0) {
            super.addView(view, 0, layoutParams);
            return;
        }
        throw new IllegalArgumentException("ViewWrapper can host only one child view".toString());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null || !Intrinsics.areEqual((Object) layoutParams, (Object) getLayoutParams());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams == null ? new C14204a(-2, -2) : layoutParams;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new C14204a(-2, -2);
        }
        return po1.m40889a(layoutParams2, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View a = mo69242a();
        if (a != null) {
            a.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View a = mo69242a();
        if (a == null) {
            setMeasuredDimension(ViewGroup.resolveSizeAndState(getPaddingLeft() + getSuggestedMinimumWidth() + getPaddingRight(), i, 0), ViewGroup.resolveSizeAndState(getPaddingTop() + getSuggestedMinimumHeight() + getPaddingBottom(), i2, 0));
            return;
        }
        a.measure(i, i2);
        setMeasuredDimension(a.getMeasuredWidthAndState(), a.getMeasuredHeightAndState());
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        View a = mo69242a();
        if (a == null) {
            super.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams != null) {
            po1.m40889a(layoutParams, a.getLayoutParams());
        }
        super.setLayoutParams(layoutParams);
        a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oo1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
