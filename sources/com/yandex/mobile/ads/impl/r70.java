package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public class r70 extends FrameLayout {

    /* renamed from: a */
    private final Rect f39374a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r70(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r70(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r70(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i;
        int i7 = i2;
        boolean z = (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) ? false : true;
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < childCount) {
            int i12 = i8 + 1;
            View childAt = getChildAt(i8);
            if (getMeasureAllChildren() || childAt.getVisibility() != 8) {
                View view = childAt;
                String str = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams";
                int i13 = i9;
                int i14 = i10;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    i10 = Math.max(i14, view.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
                    i11 = Math.max(i11, view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
                    i9 = FrameLayout.combineMeasuredStates(i13, view.getMeasuredState());
                    if (z && (layoutParams2.width == -1 || layoutParams2.height == -1)) {
                        arrayList.add(view);
                    }
                    i8 = i12;
                } else {
                    throw new NullPointerException(str);
                }
            } else {
                i8 = i12;
            }
        }
        String str2 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams";
        int i15 = i9;
        int max = Math.max(getPaddingLeft(), this.f39374a.left) + Math.max(getPaddingRight(), this.f39374a.right);
        int max2 = Math.max(getPaddingTop(), this.f39374a.top) + Math.max(getPaddingBottom(), this.f39374a.bottom);
        int coerceAtLeast = RangesKt.coerceAtLeast(i10 + max, getSuggestedMinimumWidth());
        int coerceAtLeast2 = RangesKt.coerceAtLeast(i11 + max2, getSuggestedMinimumHeight());
        Drawable foreground = getForeground();
        if (foreground != null) {
            coerceAtLeast = RangesKt.coerceAtLeast(coerceAtLeast, foreground.getMinimumWidth());
            coerceAtLeast2 = RangesKt.coerceAtLeast(coerceAtLeast2, foreground.getMinimumHeight());
        }
        setMeasuredDimension(FrameLayout.resolveSizeAndState(coerceAtLeast, i6, i15), FrameLayout.resolveSizeAndState(coerceAtLeast2, i7, i15 << 16));
        if (getChildCount() > 1) {
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                View view2 = (View) arrayList.get(i16);
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    int i18 = layoutParams4.leftMargin + max + layoutParams4.rightMargin;
                    int i19 = layoutParams4.topMargin + max2 + layoutParams4.bottomMargin;
                    int i20 = layoutParams4.width;
                    if (i20 == -1) {
                        i3 = 0;
                        i4 = View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtLeast(getMeasuredWidth() - i18, 0), 1073741824);
                    } else {
                        i3 = 0;
                        i4 = FrameLayout.getChildMeasureSpec(i6, i18, i20);
                    }
                    int i21 = layoutParams4.height;
                    if (i21 == -1) {
                        i5 = View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtLeast(getMeasuredHeight() - i19, i3), 1073741824);
                    } else {
                        i5 = FrameLayout.getChildMeasureSpec(i7, i19, i21);
                    }
                    view2.measure(i4, i5);
                    i16 = i17;
                } else {
                    throw new NullPointerException(str2);
                }
            }
        }
    }

    public void setForegroundGravity(int i) {
        super.setForegroundGravity(i);
        if (getForegroundGravity() != 119 || getForeground() == null) {
            this.f39374a.setEmpty();
        } else {
            getForeground().getPadding(this.f39374a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r70(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39374a = new Rect();
    }
}
