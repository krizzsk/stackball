package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.el0;

public class u11 implements el0 {

    /* renamed from: a */
    private final el0.C12983a f40542a = new el0.C12983a();

    /* renamed from: b */
    private final C13386i9 f40543b;

    /* renamed from: c */
    private final float f40544c;

    public u11(float f) {
        this.f40544c = f;
        this.f40543b = new C13386i9(f);
    }

    /* renamed from: a */
    public el0.C12983a mo65798a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = false;
        if (mode == 1073741824) {
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                int a = this.f40543b.mo67752a(size);
                if (mode2 == Integer.MIN_VALUE) {
                    a = Math.min(size2, a);
                }
                i2 = View.MeasureSpec.makeMeasureSpec(a, 1073741824);
                el0.C12983a aVar = this.f40542a;
                aVar.f33000a = i;
                aVar.f33001b = i2;
                return aVar;
            }
        }
        if (mode2 == 1073741824) {
            if (mode == Integer.MIN_VALUE || mode == 0) {
                z = true;
            }
            if (z) {
                int b = this.f40543b.mo67753b(size2);
                if (mode == Integer.MIN_VALUE) {
                    b = Math.min(size, b);
                }
                i = View.MeasureSpec.makeMeasureSpec(b, 1073741824);
                el0.C12983a aVar2 = this.f40542a;
                aVar2.f33000a = i;
                aVar2.f33001b = i2;
                return aVar2;
            }
        }
        if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            if (((float) size) / ((float) size2) > this.f40544c) {
                i = View.MeasureSpec.makeMeasureSpec(this.f40543b.mo67753b(size2), 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int a2 = this.f40543b.mo67752a(size);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(a2, 1073741824);
                i = makeMeasureSpec;
            }
        }
        el0.C12983a aVar22 = this.f40542a;
        aVar22.f33000a = i;
        aVar22.f33001b = i2;
        return aVar22;
    }
}
