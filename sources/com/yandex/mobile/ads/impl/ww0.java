package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

public class ww0 {

    /* renamed from: a */
    private final Context f42309a;

    /* renamed from: b */
    private final lw0 f42310b;

    /* renamed from: c */
    private final mw0 f42311c = mw0.m39747a();

    /* renamed from: d */
    private final xw0 f42312d = new xw0();

    public ww0(Context context, xi1 xi1) {
        this.f42309a = context.getApplicationContext();
        this.f42310b = new lw0(context, xi1);
    }

    /* renamed from: a */
    public vw0 mo70768a(List<vi1> list) {
        if (this.f42312d.mo70945b(this.f42309a)) {
            this.f42311c.mo68864a(this.f42309a);
            C14165o4 a = this.f42310b.mo68521a(list);
            if (a != null) {
                return new vw0(a, tl0.m42366a(a), C14861v1.m43013a(a));
            }
        }
        return null;
    }
}
