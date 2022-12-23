package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

public final class gk1 {

    /* renamed from: b */
    private static final Object f34016b = new Object();

    /* renamed from: c */
    private static volatile gk1 f34017c;

    /* renamed from: a */
    private final u41 f34018a;

    private gk1(u41 u41) {
        this.f34018a = u41;
    }

    /* renamed from: a */
    public void mo67317a(Context context, lj1 lj1, ai1 ai1, r41<List<lj1>> r41) {
        Context context2 = context;
        this.f34018a.mo70284a(new si1(context2, lj1.mo68465j(), new rp1(r41), lj1, new dr1(ai1)));
    }

    /* renamed from: a */
    public static gk1 m36632a(Context context) {
        if (f34017c == null) {
            synchronized (f34016b) {
                if (f34017c == null) {
                    f34017c = new gk1(kr1.m38478a(context, 1));
                }
            }
        }
        return f34017c;
    }

    /* renamed from: a */
    public void mo67318a(Context context, C14645t1 t1Var, jp1 jp1, Object obj, r41<ep1> r41) {
        this.f34018a.mo70284a(new lp1().mo68499a(context, t1Var, jp1, obj, r41));
    }

    /* renamed from: a */
    public void mo67319a(Context context, C14645t1 t1Var, ki1 ki1, Object obj, r41<ci1> r41) {
        this.f34018a.mo70284a(new li1().mo68437a(context, t1Var, ki1, obj, r41));
    }
}
