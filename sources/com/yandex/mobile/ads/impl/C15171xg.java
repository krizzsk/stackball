package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.el0;

/* renamed from: com.yandex.mobile.ads.impl.xg */
public class C15171xg implements el0 {

    /* renamed from: a */
    private final el0.C12983a f42560a = new el0.C12983a();

    /* renamed from: b */
    private final el0[] f42561b;

    public C15171xg(el0... el0Arr) {
        this.f42561b = el0Arr;
    }

    /* renamed from: a */
    public el0.C12983a mo65798a(int i, int i2) {
        el0[] el0Arr = this.f42561b;
        int length = el0Arr.length;
        int i3 = 0;
        while (i3 < length) {
            el0.C12983a a = el0Arr[i3].mo65798a(i, i2);
            i3++;
            int i4 = a.f33000a;
            i2 = a.f33001b;
            i = i4;
        }
        el0.C12983a aVar = this.f42560a;
        aVar.f33000a = i;
        aVar.f33001b = i2;
        return aVar;
    }
}
