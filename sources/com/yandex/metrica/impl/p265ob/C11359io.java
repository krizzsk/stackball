package com.yandex.metrica.impl.p265ob;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.io */
public class C11359io<D> implements C11295go<D> {

    /* renamed from: a */
    private final Comparator<D> f27132a;

    /* renamed from: b */
    private final int f27133b;

    /* renamed from: c */
    private final C10616Om f27134c;

    /* renamed from: d */
    final long f27135d;

    /* renamed from: e */
    private D f27136e;

    /* renamed from: f */
    private int f27137f;

    /* renamed from: g */
    private long f27138g;

    public C11359io(Comparator<D> comparator, C10616Om om, int i, long j) {
        this.f27132a = comparator;
        this.f27133b = i;
        this.f27134c = om;
        this.f27135d = TimeUnit.SECONDS.toMillis(j);
    }

    /* renamed from: a */
    private void m29243a() {
        this.f27137f = 0;
        this.f27138g = this.f27134c.mo61842c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p265ob.C11408jo<D> get(D r8) {
        /*
            r7 = this;
            D r0 = r7.f27136e
            r1 = 1
            r2 = 0
            if (r0 != r8) goto L_0x0008
        L_0x0006:
            r8 = 0
            goto L_0x0016
        L_0x0008:
            java.util.Comparator<D> r3 = r7.f27132a
            int r0 = r3.compare(r0, r8)
            if (r0 != 0) goto L_0x0013
            r7.f27136e = r8
            goto L_0x0006
        L_0x0013:
            r7.f27136e = r8
            r8 = 1
        L_0x0016:
            if (r8 == 0) goto L_0x0025
            r7.m29243a()
            com.yandex.metrica.impl.ob.jo r8 = new com.yandex.metrica.impl.ob.jo
            com.yandex.metrica.impl.ob.jo$a r0 = com.yandex.metrica.impl.p265ob.C11408jo.C11409a.NEW
            D r1 = r7.f27136e
            r8.<init>(r0, r1)
            return r8
        L_0x0025:
            int r8 = r7.f27137f
            int r8 = r8 + r1
            r7.f27137f = r8
            int r0 = r7.f27133b
            int r8 = r8 % r0
            r7.f27137f = r8
            com.yandex.metrica.impl.ob.Om r8 = r7.f27134c
            long r3 = r8.mo61842c()
            long r5 = r7.f27138g
            long r3 = r3 - r5
            long r5 = r7.f27135d
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x004f
            r7.m29243a()
            com.yandex.metrica.impl.ob.jo r8 = new com.yandex.metrica.impl.ob.jo
            com.yandex.metrica.impl.ob.jo$a r0 = com.yandex.metrica.impl.p265ob.C11408jo.C11409a.REFRESH
            D r1 = r7.f27136e
            r8.<init>(r0, r1)
            return r8
        L_0x004f:
            int r8 = r7.f27137f
            if (r8 != 0) goto L_0x0060
            r7.m29243a()
            com.yandex.metrica.impl.ob.jo r8 = new com.yandex.metrica.impl.ob.jo
            com.yandex.metrica.impl.ob.jo$a r0 = com.yandex.metrica.impl.p265ob.C11408jo.C11409a.REFRESH
            D r1 = r7.f27136e
            r8.<init>(r0, r1)
            return r8
        L_0x0060:
            com.yandex.metrica.impl.ob.jo r8 = new com.yandex.metrica.impl.ob.jo
            com.yandex.metrica.impl.ob.jo$a r0 = com.yandex.metrica.impl.p265ob.C11408jo.C11409a.NOT_CHANGED
            D r1 = r7.f27136e
            r8.<init>(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11359io.get(java.lang.Object):com.yandex.metrica.impl.ob.jo");
    }
}
