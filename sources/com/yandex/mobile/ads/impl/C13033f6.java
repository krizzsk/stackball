package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.el0;

/* renamed from: com.yandex.mobile.ads.impl.f6 */
public class C13033f6 implements el0 {

    /* renamed from: a */
    private final Context f33246a;

    /* renamed from: b */
    private final C14191ol f33247b = new C14191ol();

    /* renamed from: c */
    private final C14393ql f33248c = new C14393ql();

    C13033f6(Context context) {
        this.f33246a = context.getApplicationContext();
    }

    /* renamed from: a */
    public el0.C12983a mo65798a(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            int e = lo1.m38875e(this.f33246a);
            int a = this.f33248c.mo69618a(this.f33246a, 420.0f);
            int i3 = this.f33246a.getResources().getConfiguration().orientation;
            if (!(this.f33247b.mo69198a(this.f33246a) == C14104nl.PHONE && i3 == 1)) {
                e = Math.min(e, a);
            }
            i = View.MeasureSpec.makeMeasureSpec(Math.min(e, size), 1073741824);
        }
        if (mode2 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(Math.min(lo1.m38871c(this.f33246a), this.f33248c.mo69618a(this.f33246a, 350.0f)), size2), 1073741824);
        }
        el0.C12983a aVar = new el0.C12983a();
        aVar.f33001b = i2;
        aVar.f33000a = i;
        return aVar;
    }
}
