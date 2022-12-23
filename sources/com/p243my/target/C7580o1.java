package com.p243my.target;

import android.graphics.Rect;

/* renamed from: com.my.target.o1 */
public class C7580o1 {

    /* renamed from: a */
    public final Rect f19115a = new Rect();

    /* renamed from: b */
    public final Rect f19116b = new Rect();

    /* renamed from: c */
    public final Rect f19117c = new Rect();

    /* renamed from: d */
    public final Rect f19118d = new Rect();

    /* renamed from: e */
    public final Rect f19119e = new Rect();

    /* renamed from: f */
    public final Rect f19120f = new Rect();

    /* renamed from: g */
    public final Rect f19121g = new Rect();

    /* renamed from: h */
    public final Rect f19122h = new Rect();

    /* renamed from: a */
    public static void m19987a(Rect rect, Rect rect2) {
        rect2.set(C7761y8.m20949c(rect.left), C7761y8.m20949c(rect.top), C7761y8.m20949c(rect.right), C7761y8.m20949c(rect.bottom));
    }

    /* renamed from: e */
    public static C7580o1 m19988e() {
        return new C7580o1();
    }

    /* renamed from: a */
    public Rect mo51271a() {
        return this.f19118d;
    }

    /* renamed from: a */
    public void mo51272a(int i, int i2) {
        this.f19115a.set(0, 0, i, i2);
        m19987a(this.f19115a, this.f19116b);
    }

    /* renamed from: a */
    public void mo51273a(int i, int i2, int i3, int i4) {
        this.f19117c.set(i, i2, i3, i4);
        m19987a(this.f19117c, this.f19118d);
    }

    /* renamed from: b */
    public Rect mo51274b() {
        return this.f19120f;
    }

    /* renamed from: b */
    public void mo51275b(int i, int i2, int i3, int i4) {
        this.f19119e.set(i, i2, i3, i4);
        m19987a(this.f19119e, this.f19120f);
    }

    /* renamed from: c */
    public Rect mo51276c() {
        return this.f19122h;
    }

    /* renamed from: c */
    public void mo51277c(int i, int i2, int i3, int i4) {
        this.f19121g.set(i, i2, i3, i4);
        m19987a(this.f19121g, this.f19122h);
    }

    /* renamed from: d */
    public Rect mo51278d() {
        return this.f19116b;
    }
}
