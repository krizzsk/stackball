package com.yandex.mobile.ads.exo;

import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.le1;

/* renamed from: com.yandex.mobile.ads.exo.l */
final class C12226l {

    /* renamed from: n */
    private static final C12287f.C12288a f29846n = new C12287f.C12288a(new Object(), -1);

    /* renamed from: a */
    public final C12270q f29847a;

    /* renamed from: b */
    public final C12287f.C12288a f29848b;

    /* renamed from: c */
    public final long f29849c;

    /* renamed from: d */
    public final long f29850d;

    /* renamed from: e */
    public final int f29851e;

    /* renamed from: f */
    public final k40 f29852f;

    /* renamed from: g */
    public final boolean f29853g;

    /* renamed from: h */
    public final TrackGroupArray f29854h;

    /* renamed from: i */
    public final le1 f29855i;

    /* renamed from: j */
    public final C12287f.C12288a f29856j;

    /* renamed from: k */
    public volatile long f29857k;

    /* renamed from: l */
    public volatile long f29858l;

    /* renamed from: m */
    public volatile long f29859m;

    public C12226l(C12270q qVar, C12287f.C12288a aVar, long j, long j2, int i, k40 k40, boolean z, TrackGroupArray trackGroupArray, le1 le1, C12287f.C12288a aVar2, long j3, long j4, long j5) {
        this.f29847a = qVar;
        this.f29848b = aVar;
        this.f29849c = j;
        this.f29850d = j2;
        this.f29851e = i;
        this.f29852f = k40;
        this.f29853g = z;
        this.f29854h = trackGroupArray;
        this.f29855i = le1;
        this.f29856j = aVar2;
        this.f29857k = j3;
        this.f29858l = j4;
        this.f29859m = j5;
    }

    /* renamed from: a */
    public static C12226l m32012a(long j, le1 le1) {
        le1 le12 = le1;
        C12270q qVar = C12270q.f30037a;
        C12287f.C12288a aVar = f29846n;
        C12287f.C12288a aVar2 = aVar;
        return new C12226l(qVar, aVar, j, -9223372036854775807L, 1, (k40) null, false, TrackGroupArray.f30062e, le12, aVar2, j, 0, j);
    }

    /* renamed from: a */
    public C12287f.C12288a mo64983a(boolean z, C12270q.C12273c cVar, C12270q.C12272b bVar) {
        if (this.f29847a.mo65194d()) {
            return f29846n;
        }
        int a = this.f29847a.mo65184a();
        int i = this.f29847a.mo65190a(a, cVar, 0).f30053i;
        int a2 = this.f29847a.mo65186a(this.f29848b.f30085a);
        long j = -1;
        if (a2 != -1 && a == this.f29847a.mo65188a(a2, bVar, false).f30040c) {
            j = this.f29848b.f30088d;
        }
        return new C12287f.C12288a(this.f29847a.mo65191a(i), j);
    }

    /* renamed from: a */
    public C12226l mo64981a(C12287f.C12288a aVar, long j, long j2, long j3) {
        return new C12226l(this.f29847a, aVar, j, aVar.mo65283a() ? j2 : -9223372036854775807L, this.f29851e, this.f29852f, this.f29853g, this.f29854h, this.f29855i, this.f29856j, this.f29857k, j3, j);
    }

    /* renamed from: a */
    public C12226l mo64982a(k40 k40) {
        C12270q qVar = this.f29847a;
        return new C12226l(qVar, this.f29848b, this.f29849c, this.f29850d, this.f29851e, k40, this.f29853g, this.f29854h, this.f29855i, this.f29856j, this.f29857k, this.f29858l, this.f29859m);
    }

    /* renamed from: a */
    public C12226l mo64980a(TrackGroupArray trackGroupArray, le1 le1) {
        C12270q qVar = this.f29847a;
        return new C12226l(qVar, this.f29848b, this.f29849c, this.f29850d, this.f29851e, this.f29852f, this.f29853g, trackGroupArray, le1, this.f29856j, this.f29857k, this.f29858l, this.f29859m);
    }
}
