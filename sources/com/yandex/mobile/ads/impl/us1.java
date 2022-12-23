package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class us1 {

    /* renamed from: c */
    private static us1 f40886c = new us1();

    /* renamed from: a */
    private final ArrayList<ts1> f40887a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<ts1> f40888b = new ArrayList<>();

    private us1() {
    }

    /* renamed from: a */
    public static us1 m42837a() {
        return f40886c;
    }

    /* renamed from: a */
    public void mo70399a(ts1 ts1) {
        this.f40887a.add(ts1);
    }

    /* renamed from: b */
    public Collection<ts1> mo70400b() {
        return Collections.unmodifiableCollection(this.f40887a);
    }

    /* renamed from: b */
    public void mo70401b(ts1 ts1) {
        boolean d = mo70404d();
        this.f40888b.add(ts1);
        if (!d) {
            bu1.m34401a().mo66124b();
        }
    }

    /* renamed from: c */
    public Collection<ts1> mo70402c() {
        return Collections.unmodifiableCollection(this.f40888b);
    }

    /* renamed from: c */
    public void mo70403c(ts1 ts1) {
        boolean d = mo70404d();
        this.f40887a.remove(ts1);
        this.f40888b.remove(ts1);
        if (d && !mo70404d()) {
            bu1.m34401a().mo66125c();
        }
    }

    /* renamed from: d */
    public boolean mo70404d() {
        return this.f40888b.size() > 0;
    }
}
