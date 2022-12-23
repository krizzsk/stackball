package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

public final class wx0 extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private float f42316a;

    /* renamed from: b */
    private final int f42317b;

    /* renamed from: c */
    private final int f42318c;

    /* renamed from: d */
    private final int f42319d;

    /* renamed from: e */
    private final int f42320e;

    /* renamed from: f */
    private final int f42321f;

    /* renamed from: g */
    private final int f42322g;

    /* renamed from: h */
    private final int f42323h;

    /* renamed from: i */
    private final int f42324i;

    public wx0(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        int i2;
        this.f42316a = f5;
        this.f42317b = i;
        this.f42318c = MathKt.roundToInt(f);
        this.f42319d = MathKt.roundToInt(f2);
        this.f42320e = MathKt.roundToInt(f3);
        this.f42321f = MathKt.roundToInt(f4);
        this.f42322g = MathKt.roundToInt(this.f42316a + f6);
        int i3 = 0;
        if (i == 0) {
            i2 = MathKt.roundToInt(((this.f42316a + f6) * ((float) 2)) - f);
        } else if (i != 1) {
            i2 = 0;
        } else {
            i2 = MathKt.roundToInt(((this.f42316a + f6) * ((float) 2)) - f4);
        }
        this.f42323h = i2;
        if (i == 0) {
            i3 = MathKt.roundToInt(((this.f42316a + f6) * ((float) 2)) - f2);
        } else if (i == 1) {
            i3 = MathKt.roundToInt(((this.f42316a + f6) * ((float) 2)) - f3);
        }
        this.f42324i = i3;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z = false;
        boolean z2 = adapter != null && adapter.getItemCount() == 2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        boolean z3 = layoutManager != null && layoutManager.getPosition(view) == 0;
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 != null) {
            int position = layoutManager2.getPosition(view);
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            Intrinsics.checkNotNull(adapter2);
            if (position == adapter2.getItemCount() - 1) {
                z = true;
            }
        }
        int i5 = this.f42317b;
        if (i5 == 0) {
            if (z3) {
                i = this.f42318c;
            } else if (!z || z2) {
                i = this.f42322g;
            } else {
                i = this.f42324i;
            }
            int i6 = this.f42320e;
            if (z) {
                i2 = this.f42319d;
            } else if (!z3 || z2) {
                i2 = this.f42322g;
            } else {
                i2 = this.f42323h;
            }
            rect.set(i, i6, i2, this.f42321f);
        } else if (i5 == 1) {
            int i7 = this.f42318c;
            if (z3) {
                i3 = this.f42320e;
            } else if (!z || z2) {
                i3 = this.f42322g;
            } else {
                i3 = this.f42324i;
            }
            int i8 = this.f42319d;
            if (z) {
                i4 = this.f42321f;
            } else if (!z3 || z2) {
                i4 = this.f42322g;
            } else {
                i4 = this.f42323h;
            }
            rect.set(i7, i3, i8, i4);
        }
    }
}
