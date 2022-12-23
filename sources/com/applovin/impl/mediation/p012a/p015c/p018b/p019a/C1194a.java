package com.applovin.impl.mediation.p012a.p015c.p018b.p019a;

import android.text.SpannedString;
import com.applovin.impl.mediation.p012a.p013a.C1174c;

/* renamed from: com.applovin.impl.mediation.a.c.b.a.a */
public class C1194a extends C1174c {

    /* renamed from: d */
    final String f2270d;

    /* renamed from: e */
    final int f2271e;

    /* renamed from: f */
    final int f2272f;

    /* renamed from: g */
    final boolean f2273g;

    /* renamed from: com.applovin.impl.mediation.a.c.b.a.a$a */
    public static class C1196a {

        /* renamed from: a */
        SpannedString f2274a;

        /* renamed from: b */
        SpannedString f2275b;

        /* renamed from: c */
        String f2276c;

        /* renamed from: d */
        C1174c.C1175a f2277d = C1174c.C1175a.DETAIL;

        /* renamed from: e */
        int f2278e;

        /* renamed from: f */
        int f2279f;

        /* renamed from: g */
        boolean f2280g = false;

        /* renamed from: a */
        public C1196a mo12224a(int i) {
            this.f2278e = i;
            return this;
        }

        /* renamed from: a */
        public C1196a mo12225a(SpannedString spannedString) {
            this.f2275b = spannedString;
            return this;
        }

        /* renamed from: a */
        public C1196a mo12226a(C1174c.C1175a aVar) {
            this.f2277d = aVar;
            return this;
        }

        /* renamed from: a */
        public C1196a mo12227a(String str) {
            this.f2274a = new SpannedString(str);
            return this;
        }

        /* renamed from: a */
        public C1196a mo12228a(boolean z) {
            this.f2280g = z;
            return this;
        }

        /* renamed from: a */
        public C1194a mo12229a() {
            return new C1194a(this);
        }

        /* renamed from: b */
        public C1196a mo12230b(int i) {
            this.f2279f = i;
            return this;
        }

        /* renamed from: b */
        public C1196a mo12231b(String str) {
            return mo12225a(new SpannedString(str));
        }

        /* renamed from: c */
        public C1196a mo12232c(String str) {
            this.f2276c = str;
            return this;
        }
    }

    private C1194a(C1196a aVar) {
        super(aVar.f2277d);
        this.f2205b = aVar.f2274a;
        this.f2206c = aVar.f2275b;
        this.f2270d = aVar.f2276c;
        this.f2271e = aVar.f2278e;
        this.f2272f = aVar.f2279f;
        this.f2273g = aVar.f2280g;
    }

    /* renamed from: l */
    public static C1196a m1944l() {
        return new C1196a();
    }

    /* renamed from: b */
    public boolean mo12157b() {
        return this.f2273g;
    }

    /* renamed from: i */
    public int mo12164i() {
        return this.f2271e;
    }

    /* renamed from: j */
    public int mo12165j() {
        return this.f2272f;
    }

    /* renamed from: k */
    public String mo12222k() {
        return this.f2270d;
    }

    public String toString() {
        return "NetworkDetailListItemViewModel{text=" + this.f2205b + ", detailText=" + this.f2205b + "}";
    }
}
