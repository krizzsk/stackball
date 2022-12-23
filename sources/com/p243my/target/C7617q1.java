package com.p243my.target;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.my.target.q1 */
public final class C7617q1 {

    /* renamed from: A */
    public Boolean f19223A;

    /* renamed from: B */
    public Boolean f19224B;

    /* renamed from: C */
    public C7581o2 f19225C;

    /* renamed from: a */
    public final String f19226a;

    /* renamed from: b */
    public final String f19227b;

    /* renamed from: c */
    public final ArrayList<C7617q1> f19228c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<C7328b3> f19229d = new ArrayList<>();

    /* renamed from: e */
    public final C7343c3 f19230e = C7343c3.m18845f();

    /* renamed from: f */
    public ArrayList<C7328b3> f19231f;

    /* renamed from: g */
    public ArrayList<C7302a2> f19232g;

    /* renamed from: h */
    public C7617q1 f19233h;

    /* renamed from: i */
    public String f19234i;

    /* renamed from: j */
    public String f19235j;

    /* renamed from: k */
    public int f19236k;

    /* renamed from: l */
    public int f19237l = -1;

    /* renamed from: m */
    public int f19238m = -1;

    /* renamed from: n */
    public int f19239n = -1;

    /* renamed from: o */
    public float f19240o = -1.0f;

    /* renamed from: p */
    public float f19241p = -1.0f;

    /* renamed from: q */
    public boolean f19242q;

    /* renamed from: r */
    public boolean f19243r;

    /* renamed from: s */
    public boolean f19244s;

    /* renamed from: t */
    public float f19245t = -1.0f;

    /* renamed from: u */
    public Boolean f19246u;

    /* renamed from: v */
    public Boolean f19247v;

    /* renamed from: w */
    public Boolean f19248w;

    /* renamed from: x */
    public Boolean f19249x;

    /* renamed from: y */
    public Boolean f19250y;

    /* renamed from: z */
    public Boolean f19251z;

    public C7617q1(String str, String str2) {
        this.f19227b = str;
        this.f19226a = str2;
    }

    /* renamed from: a */
    public static C7617q1 m20129a(String str, String str2) {
        return new C7617q1(str, str2);
    }

    /* renamed from: b */
    public static C7617q1 m20130b(String str) {
        return m20129a(str, (String) null);
    }

    /* renamed from: a */
    public Boolean mo51362a() {
        return this.f19246u;
    }

    /* renamed from: a */
    public ArrayList<C7328b3> mo51363a(String str) {
        ArrayList<C7328b3> arrayList = new ArrayList<>();
        Iterator<C7328b3> it = this.f19229d.iterator();
        while (it.hasNext()) {
            C7328b3 next = it.next();
            if (str.equals(next.mo49727a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo51364a(float f) {
        this.f19245t = f;
    }

    /* renamed from: a */
    public void mo51365a(int i) {
        this.f19239n = i;
    }

    /* renamed from: a */
    public void mo51366a(C7328b3 b3Var) {
        this.f19229d.add(b3Var);
    }

    /* renamed from: a */
    public void mo51367a(C7581o2 o2Var) {
        this.f19225C = o2Var;
    }

    /* renamed from: a */
    public void mo51368a(C7617q1 q1Var) {
        this.f19228c.add(q1Var);
    }

    /* renamed from: a */
    public void mo51369a(Boolean bool) {
        this.f19246u = bool;
    }

    /* renamed from: a */
    public void mo51370a(ArrayList<C7328b3> arrayList) {
        ArrayList<C7328b3> arrayList2 = this.f19231f;
        if (arrayList2 == null) {
            this.f19231f = arrayList;
        } else if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
    }

    /* renamed from: a */
    public void mo51371a(boolean z) {
        this.f19242q = z;
    }

    /* renamed from: b */
    public float mo51372b() {
        return this.f19245t;
    }

    /* renamed from: b */
    public void mo51373b(float f) {
        this.f19240o = f;
    }

    /* renamed from: b */
    public void mo51374b(int i) {
        this.f19237l = i;
    }

    /* renamed from: b */
    public void mo51375b(C7617q1 q1Var) {
        this.f19233h = q1Var;
        if (q1Var != null) {
            q1Var.mo51381c(this.f19238m);
        }
    }

    /* renamed from: b */
    public void mo51376b(Boolean bool) {
        this.f19247v = bool;
    }

    /* renamed from: b */
    public void mo51377b(ArrayList<C7302a2> arrayList) {
        this.f19232g = arrayList;
    }

    /* renamed from: b */
    public void mo51378b(boolean z) {
        this.f19243r = z;
    }

    /* renamed from: c */
    public Boolean mo51379c() {
        return this.f19247v;
    }

    /* renamed from: c */
    public void mo51380c(float f) {
        this.f19241p = f;
    }

    /* renamed from: c */
    public void mo51381c(int i) {
        this.f19238m = i;
        C7617q1 q1Var = this.f19233h;
        if (q1Var != null) {
            q1Var.mo51381c(i);
        }
    }

    /* renamed from: c */
    public void mo51382c(Boolean bool) {
        this.f19224B = bool;
    }

    /* renamed from: c */
    public void mo51383c(String str) {
        this.f19235j = str;
    }

    /* renamed from: c */
    public void mo51384c(ArrayList<C7328b3> arrayList) {
        this.f19231f = arrayList;
    }

    /* renamed from: c */
    public void mo51385c(boolean z) {
        this.f19244s = z;
    }

    /* renamed from: d */
    public Boolean mo51386d() {
        return this.f19224B;
    }

    /* renamed from: d */
    public void mo51387d(int i) {
        this.f19236k = i;
    }

    /* renamed from: d */
    public void mo51388d(Boolean bool) {
        this.f19248w = bool;
    }

    /* renamed from: d */
    public void mo51389d(String str) {
        this.f19234i = str;
    }

    /* renamed from: e */
    public Boolean mo51390e() {
        return this.f19248w;
    }

    /* renamed from: e */
    public void mo51391e(Boolean bool) {
        this.f19249x = bool;
    }

    /* renamed from: f */
    public Boolean mo51392f() {
        return this.f19249x;
    }

    /* renamed from: f */
    public void mo51393f(Boolean bool) {
        this.f19250y = bool;
    }

    /* renamed from: g */
    public Boolean mo51394g() {
        return this.f19250y;
    }

    /* renamed from: g */
    public void mo51395g(Boolean bool) {
        this.f19251z = bool;
    }

    /* renamed from: h */
    public C7343c3 mo51396h() {
        return this.f19230e;
    }

    /* renamed from: h */
    public void mo51397h(Boolean bool) {
        this.f19223A = bool;
    }

    /* renamed from: i */
    public ArrayList<C7302a2> mo51398i() {
        return this.f19232g;
    }

    /* renamed from: j */
    public String mo51399j() {
        return this.f19235j;
    }

    /* renamed from: k */
    public Boolean mo51400k() {
        return this.f19251z;
    }

    /* renamed from: l */
    public int mo51401l() {
        return this.f19239n;
    }

    /* renamed from: m */
    public int mo51402m() {
        return this.f19237l;
    }

    /* renamed from: n */
    public ArrayList<C7328b3> mo51403n() {
        if (this.f19231f != null) {
            return new ArrayList<>(this.f19231f);
        }
        return null;
    }

    /* renamed from: o */
    public String mo51404o() {
        return this.f19234i;
    }

    /* renamed from: p */
    public C7581o2 mo51405p() {
        return this.f19225C;
    }

    /* renamed from: q */
    public C7617q1 mo51406q() {
        return this.f19233h;
    }

    /* renamed from: r */
    public Boolean mo51407r() {
        return this.f19223A;
    }

    /* renamed from: s */
    public float mo51408s() {
        return this.f19240o;
    }

    /* renamed from: t */
    public float mo51409t() {
        return this.f19241p;
    }

    /* renamed from: u */
    public int mo51410u() {
        return this.f19238m;
    }

    /* renamed from: v */
    public int mo51411v() {
        return this.f19236k;
    }

    /* renamed from: w */
    public ArrayList<C7617q1> mo51412w() {
        return this.f19228c;
    }

    /* renamed from: x */
    public boolean mo51413x() {
        return this.f19242q;
    }

    /* renamed from: y */
    public boolean mo51414y() {
        return this.f19243r;
    }

    /* renamed from: z */
    public boolean mo51415z() {
        return this.f19244s;
    }
}
