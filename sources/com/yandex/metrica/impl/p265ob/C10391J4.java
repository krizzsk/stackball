package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.J4 */
public class C10391J4 {

    /* renamed from: a */
    private final HashMap<String, C11703r4> f24962a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<String, C10978Z3> f24963b = new HashMap<>();

    /* renamed from: c */
    private final Context f24964c;

    public C10391J4(Context context) {
        this.f24964c = context.getApplicationContext();
    }

    /* renamed from: a */
    public synchronized C11703r4 mo61597a(C11101c4 c4Var) {
        return this.f24962a.get(c4Var.toString());
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.yandex.metrica.impl.ob.h4, com.yandex.metrica.impl.ob.h4<com.yandex.metrica.impl.ob.r4>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.yandex.metrica.impl.p265ob.C11703r4 mo61598b(com.yandex.metrica.impl.p265ob.C11101c4 r2, com.yandex.metrica.impl.p265ob.C10910X3 r3, com.yandex.metrica.impl.p265ob.C11304h4<com.yandex.metrica.impl.p265ob.C11703r4> r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.r4> r0 = r1.f24962a     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.l4 r2 = r1.m26656a(r2, r3, r4, r0)     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.r4 r2 = (com.yandex.metrica.impl.p265ob.C11703r4) r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)
            return r2
        L_0x000b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10391J4.mo61598b(com.yandex.metrica.impl.ob.c4, com.yandex.metrica.impl.ob.X3, com.yandex.metrica.impl.ob.h4):com.yandex.metrica.impl.ob.r4");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.yandex.metrica.impl.ob.h4<com.yandex.metrica.impl.ob.Z3>, com.yandex.metrica.impl.ob.h4] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.yandex.metrica.impl.p265ob.C10978Z3 mo61596a(com.yandex.metrica.impl.p265ob.C11101c4 r2, com.yandex.metrica.impl.p265ob.C10910X3 r3, com.yandex.metrica.impl.p265ob.C11304h4<com.yandex.metrica.impl.p265ob.C10978Z3> r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.Z3> r0 = r1.f24963b     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.l4 r2 = r1.m26656a(r2, r3, r4, r0)     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.Z3 r2 = (com.yandex.metrica.impl.p265ob.C10978Z3) r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)
            return r2
        L_0x000b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10391J4.mo61596a(com.yandex.metrica.impl.ob.c4, com.yandex.metrica.impl.ob.X3, com.yandex.metrica.impl.ob.h4):com.yandex.metrica.impl.ob.Z3");
    }

    /* renamed from: a */
    private <T extends C11481l4> T m26656a(C11101c4 c4Var, C10910X3 x3, C11304h4<T> h4Var, Map<String, T> map) {
        T t = (C11481l4) map.get(c4Var.toString());
        if (t == null) {
            T a = h4Var.mo62634a(this.f24964c, c4Var, x3);
            map.put(c4Var.toString(), a);
            return a;
        }
        t.mo62565a(x3);
        return t;
    }
}
