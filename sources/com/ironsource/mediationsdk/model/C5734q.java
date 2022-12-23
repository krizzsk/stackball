package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C5789b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.q */
public final class C5734q {

    /* renamed from: a */
    public ArrayList<Placement> f13791a;

    /* renamed from: b */
    public C5720d f13792b;

    /* renamed from: c */
    public int f13793c;

    /* renamed from: d */
    public boolean f13794d;

    /* renamed from: e */
    public int f13795e;

    /* renamed from: f */
    public String f13796f;

    /* renamed from: g */
    public String f13797g;

    /* renamed from: h */
    public int f13798h;

    /* renamed from: i */
    public int f13799i;

    /* renamed from: j */
    public Placement f13800j;

    /* renamed from: k */
    public C5789b f13801k;

    public C5734q() {
        this.f13791a = new ArrayList<>();
        this.f13792b = new C5720d();
    }

    public C5734q(int i, boolean z, int i2, int i3, int i4, C5720d dVar, C5789b bVar) {
        this.f13791a = new ArrayList<>();
        this.f13793c = i;
        this.f13794d = z;
        this.f13795e = i2;
        this.f13798h = i3;
        this.f13792b = dVar;
        this.f13799i = i4;
        this.f13801k = bVar;
    }

    /* renamed from: a */
    public final Placement mo41989a() {
        Iterator<Placement> it = this.f13791a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f13800j;
    }
}
