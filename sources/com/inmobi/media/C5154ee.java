package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.inmobi.media.ee */
/* compiled from: NativeContainerLayout */
public class C5154ee extends ViewGroup {

    /* renamed from: a */
    private static final String f11833a = C5154ee.class.getSimpleName();

    public C5154ee(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C5155a aVar = (C5155a) childAt.getLayoutParams();
                i4 = Math.max(i4, aVar.f11834a + childAt.getMeasuredWidth());
                i3 = Math.max(i3, aVar.f11835b + childAt.getMeasuredHeight());
            }
        }
        setMeasuredDimension(resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5155a(-2, -2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C5155a aVar = (C5155a) childAt.getLayoutParams();
                childAt.layout(aVar.f11834a, aVar.f11835b, aVar.f11834a + childAt.getMeasuredWidth(), aVar.f11835b + childAt.getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5155a;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C5155a(layoutParams);
    }

    /* renamed from: com.inmobi.media.ee$a */
    /* compiled from: NativeContainerLayout */
    public static class C5155a extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f11834a;

        /* renamed from: b */
        public int f11835b;

        public C5155a(int i, int i2) {
            super(i, i2);
        }

        public C5155a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
