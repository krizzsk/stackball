package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

public class xq1 {

    /* renamed from: a */
    private final Context f42672a;

    /* renamed from: b */
    private final ai1 f42673b;

    /* renamed from: c */
    private int f42674c;

    public xq1(Context context, ai1 ai1) {
        this.f42672a = context.getApplicationContext();
        this.f42673b = ai1;
    }

    /* renamed from: a */
    public void mo70935a(Context context, List<lj1> list, r41<List<lj1>> r41) {
        int i = this.f42674c + 1;
        this.f42674c = i;
        if (i <= 5) {
            new yq1(this.f42672a, this.f42673b).mo71108a(context, list, r41);
        } else {
            r41.mo66589a(wj1.m43664b("Maximum count of VAST wrapper requests exceeded."));
        }
    }
}
