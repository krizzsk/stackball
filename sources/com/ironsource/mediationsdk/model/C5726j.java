package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C5789b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.j */
public final class C5726j {

    /* renamed from: a */
    public ArrayList<InterstitialPlacement> f13749a;

    /* renamed from: b */
    public C5720d f13750b;

    /* renamed from: c */
    public int f13751c;

    /* renamed from: d */
    public boolean f13752d;

    /* renamed from: e */
    public int f13753e;

    /* renamed from: f */
    public int f13754f;

    /* renamed from: g */
    public String f13755g;

    /* renamed from: h */
    public String f13756h;

    /* renamed from: i */
    public C5789b f13757i;

    /* renamed from: j */
    public InterstitialPlacement f13758j;

    public C5726j() {
        this.f13749a = new ArrayList<>();
        this.f13750b = new C5720d();
    }

    public C5726j(int i, boolean z, int i2, C5720d dVar, C5789b bVar, int i3) {
        this.f13749a = new ArrayList<>();
        this.f13751c = i;
        this.f13752d = z;
        this.f13753e = i2;
        this.f13750b = dVar;
        this.f13757i = bVar;
        this.f13754f = i3;
    }

    /* renamed from: a */
    public final InterstitialPlacement mo41976a() {
        Iterator<InterstitialPlacement> it = this.f13749a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f13758j;
    }
}
