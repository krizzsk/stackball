package com.yandex.mobile.ads.impl;

public class xm1 implements t11 {

    /* renamed from: a */
    private final C15146x4 f42634a;

    /* renamed from: b */
    private final cm1 f42635b;

    /* renamed from: c */
    private final a01 f42636c;

    /* renamed from: d */
    private final u01 f42637d;

    public xm1(C15146x4 x4Var, zz0 zz0, u01 u01) {
        this.f42634a = x4Var;
        this.f42636c = zz0.mo71287d();
        this.f42635b = zz0.mo71284a();
        this.f42637d = u01;
    }

    /* renamed from: a */
    public tz0 mo65690a() {
        Long l;
        t01 a = this.f42637d.mo70261a();
        t01 b = this.f42637d.mo70264b();
        if (a != null) {
            l = Long.valueOf(((e60) a).mo66770a());
        } else {
            l = (b == null || this.f42634a.mo70827c() || this.f42636c.mo65634c()) ? null : Long.valueOf(((xz0) b).mo70951a());
        }
        long j = -1;
        long longValue = l != null ? l.longValue() : -1;
        long a2 = this.f42635b.mo66332a();
        if (a2 != -9223372036854775807L) {
            j = a2;
        }
        return new tz0(longValue, j);
    }
}
