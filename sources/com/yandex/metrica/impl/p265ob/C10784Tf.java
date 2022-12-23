package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Tf */
public final class C10784Tf extends C11169e {

    /* renamed from: r */
    private static volatile C10784Tf[] f25858r;

    /* renamed from: b */
    public int f25859b;

    /* renamed from: c */
    public int f25860c;

    /* renamed from: d */
    public int f25861d;

    /* renamed from: e */
    public int f25862e;

    /* renamed from: f */
    public int f25863f;

    /* renamed from: g */
    public String f25864g;

    /* renamed from: h */
    public boolean f25865h;

    /* renamed from: i */
    public int f25866i;

    /* renamed from: j */
    public int f25867j;

    /* renamed from: k */
    public long f25868k;

    /* renamed from: l */
    public int f25869l;

    /* renamed from: m */
    public int f25870m;

    /* renamed from: n */
    public int f25871n;

    /* renamed from: o */
    public int f25872o;

    /* renamed from: p */
    public int f25873p;

    /* renamed from: q */
    public int f25874q;

    public C10784Tf() {
        mo62301b();
    }

    /* renamed from: c */
    public static C10784Tf[] m27819c() {
        if (f25858r == null) {
            synchronized (C11095c.f26635a) {
                if (f25858r == null) {
                    f25858r = new C10784Tf[0];
                }
            }
        }
        return f25858r;
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        int i = this.f25859b;
        if (i != -1) {
            bVar.mo62677f(1, i);
        }
        int i2 = this.f25860c;
        if (i2 != 0) {
            bVar.mo62675e(2, i2);
        }
        int i3 = this.f25861d;
        if (i3 != -1) {
            bVar.mo62677f(3, i3);
        }
        int i4 = this.f25862e;
        if (i4 != -1) {
            bVar.mo62677f(4, i4);
        }
        int i5 = this.f25863f;
        if (i5 != -1) {
            bVar.mo62677f(5, i5);
        }
        if (!this.f25864g.equals("")) {
            bVar.mo62666b(6, this.f25864g);
        }
        boolean z = this.f25865h;
        if (z) {
            bVar.mo62667b(7, z);
        }
        int i6 = this.f25866i;
        if (i6 != 0) {
            bVar.mo62672d(8, i6);
        }
        int i7 = this.f25867j;
        if (i7 != -1) {
            bVar.mo62677f(9, i7);
        }
        long j = this.f25868k;
        if (j != 0) {
            bVar.mo62676e(10, j);
        }
        int i8 = this.f25869l;
        if (i8 != Integer.MAX_VALUE) {
            bVar.mo62675e(11, i8);
        }
        int i9 = this.f25870m;
        if (i9 != Integer.MAX_VALUE) {
            bVar.mo62675e(12, i9);
        }
        int i10 = this.f25871n;
        if (i10 != Integer.MAX_VALUE) {
            bVar.mo62675e(13, i10);
        }
        int i11 = this.f25872o;
        if (i11 != -1) {
            bVar.mo62677f(14, i11);
        }
        int i12 = this.f25873p;
        if (i12 != -1) {
            bVar.mo62677f(15, i12);
        }
        int i13 = this.f25874q;
        if (i13 != -1) {
            bVar.mo62677f(16, i13);
        }
    }

    /* renamed from: b */
    public C10784Tf mo62301b() {
        this.f25859b = -1;
        this.f25860c = 0;
        this.f25861d = -1;
        this.f25862e = -1;
        this.f25863f = -1;
        this.f25864g = "";
        this.f25865h = false;
        this.f25866i = 0;
        this.f25867j = -1;
        this.f25868k = 0;
        this.f25869l = Integer.MAX_VALUE;
        this.f25870m = Integer.MAX_VALUE;
        this.f25871n = Integer.MAX_VALUE;
        this.f25872o = -1;
        this.f25873p = -1;
        this.f25874q = -1;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        int i = this.f25859b;
        int i2 = 0;
        if (i != -1) {
            i2 = 0 + C11056b.m28535c(1, i);
        }
        int i3 = this.f25860c;
        if (i3 != 0) {
            i2 += C11056b.m28532b(2, i3);
        }
        int i4 = this.f25861d;
        if (i4 != -1) {
            i2 += C11056b.m28535c(3, i4);
        }
        int i5 = this.f25862e;
        if (i5 != -1) {
            i2 += C11056b.m28535c(4, i5);
        }
        int i6 = this.f25863f;
        if (i6 != -1) {
            i2 += C11056b.m28535c(5, i6);
        }
        if (!this.f25864g.equals("")) {
            i2 += C11056b.m28524a(6, this.f25864g);
        }
        boolean z = this.f25865h;
        if (z) {
            i2 += C11056b.m28525a(7, z);
        }
        int i7 = this.f25866i;
        if (i7 != 0) {
            i2 += C11056b.m28521a(8, i7);
        }
        int i8 = this.f25867j;
        if (i8 != -1) {
            i2 += C11056b.m28535c(9, i8);
        }
        long j = this.f25868k;
        if (j != 0) {
            i2 += C11056b.m28533b(10, j);
        }
        int i9 = this.f25869l;
        if (i9 != Integer.MAX_VALUE) {
            i2 += C11056b.m28532b(11, i9);
        }
        int i10 = this.f25870m;
        if (i10 != Integer.MAX_VALUE) {
            i2 += C11056b.m28532b(12, i10);
        }
        int i11 = this.f25871n;
        if (i11 != Integer.MAX_VALUE) {
            i2 += C11056b.m28532b(13, i11);
        }
        int i12 = this.f25872o;
        if (i12 != -1) {
            i2 += C11056b.m28535c(14, i12);
        }
        int i13 = this.f25873p;
        if (i13 != -1) {
            i2 += C11056b.m28535c(15, i13);
        }
        int i14 = this.f25874q;
        return i14 != -1 ? i2 + C11056b.m28535c(16, i14) : i2;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            switch (l) {
                case 0:
                    break;
                case 8:
                    this.f25859b = aVar.mo62624h();
                    continue;
                case 16:
                    this.f25860c = aVar.mo62626j();
                    continue;
                case 24:
                    this.f25861d = aVar.mo62624h();
                    continue;
                case 32:
                    this.f25862e = aVar.mo62624h();
                    continue;
                case 40:
                    this.f25863f = aVar.mo62624h();
                    continue;
                case 50:
                    this.f25864g = aVar.mo62627k();
                    continue;
                case 56:
                    this.f25865h = aVar.mo62615c();
                    continue;
                case 64:
                    int h = aVar.mo62624h();
                    if (h == 0 || h == 1 || h == 2 || h == 3 || h == 4) {
                        this.f25866i = h;
                        break;
                    } else {
                        continue;
                    }
                case 72:
                    this.f25867j = aVar.mo62624h();
                    continue;
                case 80:
                    this.f25868k = aVar.mo62625i();
                    continue;
                case 88:
                    this.f25869l = aVar.mo62626j();
                    continue;
                case 96:
                    this.f25870m = aVar.mo62626j();
                    continue;
                case 104:
                    this.f25871n = aVar.mo62626j();
                    continue;
                case 112:
                    this.f25872o = aVar.mo62624h();
                    continue;
                case 120:
                    this.f25873p = aVar.mo62624h();
                    continue;
                case 128:
                    this.f25874q = aVar.mo62624h();
                    continue;
                default:
                    if (!aVar.mo62621f(l)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }
}
