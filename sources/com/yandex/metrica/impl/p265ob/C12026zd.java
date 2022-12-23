package com.yandex.metrica.impl.p265ob;

import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10883Wc;

/* renamed from: com.yandex.metrica.impl.ob.zd */
class C12026zd extends C11125d0<Location> {

    /* renamed from: b */
    private C10129B8 f28889b;

    /* renamed from: c */
    private C10161Cc f28890c;

    /* renamed from: d */
    private C10580Nm f28891d;

    /* renamed from: e */
    private final C10474M f28892e;

    /* renamed from: f */
    private final C10199E f28893f;

    C12026zd(C11125d0<Location> d0Var, C10129B8 b8, C10161Cc cc, C10580Nm nm, C10474M m, C10199E e) {
        super(d0Var);
        this.f28889b = b8;
        this.f28890c = cc;
        this.f28891d = nm;
        this.f28892e = m;
        this.f28893f = e;
    }

    /* renamed from: b */
    public void mo61325b(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            C10883Wc.C10884a a = C10883Wc.C10884a.m28132a(this.f28893f.mo61211c());
            this.f28891d.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            this.f28891d.getClass();
            C11630pd pdVar = new C11630pd(a, currentTimeMillis, SystemClock.elapsedRealtime(), location, this.f28892e.mo61752b(), (Long) null);
            String a2 = this.f28890c.mo61146a(pdVar);
            if (!TextUtils.isEmpty(a2)) {
                this.f28889b.mo63587a(pdVar.mo63482e(), a2);
            }
        }
    }
}
