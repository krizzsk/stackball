package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10149C0;
import com.yandex.metrica.impl.p265ob.C10235F0;

/* renamed from: com.yandex.metrica.impl.ob.B0 */
public class C10119B0<CANDIDATE, CHOSEN extends C10235F0, STORAGE extends C10149C0<CANDIDATE, CHOSEN>> {

    /* renamed from: a */
    private final Context f24349a;

    /* renamed from: b */
    private final C10662Q9<STORAGE> f24350b;

    /* renamed from: c */
    private final C10174D0<CHOSEN> f24351c;

    /* renamed from: d */
    private final C10769T2<CANDIDATE, CHOSEN> f24352d;

    /* renamed from: e */
    private final C10444L2<CANDIDATE, CHOSEN, STORAGE> f24353e;

    /* renamed from: f */
    private final C11834v2<CHOSEN> f24354f;

    /* renamed from: g */
    private final C11734s2 f24355g;

    /* renamed from: h */
    private final C11511m0 f24356h;

    /* renamed from: i */
    private STORAGE f24357i;

    public C10119B0(Context context, C10662Q9<STORAGE> q9, C10174D0<CHOSEN> d0, C10769T2<CANDIDATE, CHOSEN> t2, C10444L2<CANDIDATE, CHOSEN, STORAGE> l2, C11834v2<CHOSEN> v2Var, C11734s2 s2Var, C11511m0 m0Var, STORAGE storage, String str) {
        this.f24349a = context;
        this.f24350b = q9;
        this.f24351c = d0;
        this.f24352d = t2;
        this.f24353e = l2;
        this.f24354f = v2Var;
        this.f24355g = s2Var;
        this.f24356h = m0Var;
        this.f24357i = storage;
    }

    /* renamed from: a */
    public final CHOSEN mo61074a() {
        this.f24356h.mo61150a(this.f24349a);
        return m26001b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo61076b(CHOSEN r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.yandex.metrica.impl.ob.E0 r0 = r7.mo61253a()     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.E0 r1 = com.yandex.metrica.impl.p265ob.C10202E0.UNDEFINED     // Catch:{ all -> 0x0056 }
            r2 = 0
            if (r0 != r1) goto L_0x000c
            monitor-exit(r6)
            return r2
        L_0x000c:
            com.yandex.metrica.impl.ob.T2<CANDIDATE, CHOSEN> r0 = r6.f24352d     // Catch:{ all -> 0x0056 }
            STORAGE r1 = r6.f24357i     // Catch:{ all -> 0x0056 }
            java.util.List r1 = r1.mo61111a()     // Catch:{ all -> 0x0056 }
            java.lang.Object r0 = r0.invoke(r1, r7)     // Catch:{ all -> 0x0056 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0056 }
            r1 = 1
            if (r0 == 0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            STORAGE r0 = r6.f24357i     // Catch:{ all -> 0x0056 }
            java.util.List r0 = r0.mo61111a()     // Catch:{ all -> 0x0056 }
        L_0x0029:
            com.yandex.metrica.impl.ob.D0<CHOSEN> r4 = r6.f24351c     // Catch:{ all -> 0x0056 }
            STORAGE r5 = r6.f24357i     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r5.mo61112b()     // Catch:{ all -> 0x0056 }
            boolean r4 = r4.mo61162a(r7, r5)     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x0039
            r2 = 1
            goto L_0x0041
        L_0x0039:
            STORAGE r7 = r6.f24357i     // Catch:{ all -> 0x0056 }
            java.lang.Object r7 = r7.mo61112b()     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.F0 r7 = (com.yandex.metrica.impl.p265ob.C10235F0) r7     // Catch:{ all -> 0x0056 }
        L_0x0041:
            if (r2 != 0) goto L_0x0045
            if (r3 == 0) goto L_0x0054
        L_0x0045:
            com.yandex.metrica.impl.ob.L2<CANDIDATE, CHOSEN, STORAGE> r1 = r6.f24353e     // Catch:{ all -> 0x0056 }
            java.lang.Object r7 = r1.invoke(r7, r0)     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.C0 r7 = (com.yandex.metrica.impl.p265ob.C10149C0) r7     // Catch:{ all -> 0x0056 }
            r6.f24357i = r7     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.Q9<STORAGE> r0 = r6.f24350b     // Catch:{ all -> 0x0056 }
            r0.mo61952a(r7)     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r6)
            return r2
        L_0x0056:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10119B0.mo61076b(com.yandex.metrica.impl.ob.F0):boolean");
    }

    /* renamed from: a */
    public final CHOSEN mo61075a(CHOSEN chosen) {
        CHOSEN b;
        this.f24356h.mo61150a(this.f24349a);
        synchronized (this) {
            mo61076b(chosen);
            b = m26001b();
        }
        return b;
    }

    /* renamed from: b */
    private final synchronized CHOSEN m26001b() {
        if (!this.f24355g.mo61627a()) {
            C10235F0 f0 = (C10235F0) this.f24354f.invoke();
            this.f24355g.mo61628b();
            if (f0 != null) {
                mo61076b(f0);
            }
        }
        C10122B2.m26034a("Choosing distribution data: %s", this.f24357i);
        return (C10235F0) this.f24357i.mo61112b();
    }
}
