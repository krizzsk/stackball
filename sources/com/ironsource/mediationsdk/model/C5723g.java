package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C5789b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.g */
public final class C5723g {

    /* renamed from: a */
    public C5720d f13736a;

    /* renamed from: b */
    public long f13737b;

    /* renamed from: c */
    public ArrayList<C5724h> f13738c;

    /* renamed from: d */
    public C5724h f13739d;

    /* renamed from: e */
    public int f13740e;

    /* renamed from: f */
    public int f13741f;

    /* renamed from: g */
    public C5789b f13742g;

    /* renamed from: h */
    private int f13743h;

    public C5723g() {
        this.f13736a = new C5720d();
        this.f13738c = new ArrayList<>();
    }

    public C5723g(int i, long j, C5720d dVar, int i2, C5789b bVar, int i3) {
        this.f13738c = new ArrayList<>();
        this.f13743h = i;
        this.f13737b = j;
        this.f13736a = dVar;
        this.f13740e = i2;
        this.f13741f = i3;
        this.f13742g = bVar;
    }

    /* renamed from: a */
    public final C5724h mo41973a() {
        Iterator<C5724h> it = this.f13738c.iterator();
        while (it.hasNext()) {
            C5724h next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f13739d;
    }

    /* renamed from: a */
    public final C5724h mo41974a(String str) {
        Iterator<C5724h> it = this.f13738c.iterator();
        while (it.hasNext()) {
            C5724h next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
