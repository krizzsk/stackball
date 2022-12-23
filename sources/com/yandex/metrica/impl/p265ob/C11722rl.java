package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.rl */
public class C11722rl {

    /* renamed from: a */
    private final List<C11722rl> f28090a = new ArrayList();

    /* renamed from: b */
    private final C10893Wl f28091b;

    /* renamed from: com.yandex.metrica.impl.ob.rl$a */
    static class C11723a {

        /* renamed from: a */
        final int f28092a;

        /* renamed from: b */
        final int f28093b;

        /* renamed from: c */
        final JSONObject f28094c;

        C11723a(int i, int i2, JSONObject jSONObject) {
            this.f28092a = i;
            this.f28093b = i2;
            this.f28094c = jSONObject;
        }
    }

    public C11722rl(C10893Wl wl) {
        this.f28091b = wl;
    }

    /* renamed from: a */
    public void mo63609a(C11722rl rlVar) {
        this.f28090a.add(rlVar);
    }

    /* renamed from: a */
    public C10893Wl mo63607a() {
        return this.f28091b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b A[Catch:{ all -> 0x0081 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p265ob.C11722rl.C11723a mo63608a(com.yandex.metrica.impl.p265ob.C10437Kl r8, com.yandex.metrica.impl.p265ob.C11090bl r9, int r10, int r11) {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r11 + 1
            com.yandex.metrica.impl.ob.Wl r2 = r7.f28091b     // Catch:{ all -> 0x0080 }
            com.yandex.metrica.impl.ob.Wl$b r2 = r2.mo61245a((com.yandex.metrica.impl.p265ob.C11090bl) r9)     // Catch:{ all -> 0x0080 }
            boolean r3 = r8.f25068f     // Catch:{ all -> 0x0080 }
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x001e
            com.yandex.metrica.impl.ob.Wl r3 = r7.f28091b     // Catch:{ all -> 0x0080 }
            boolean r3 = r3.mo61247a()     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r3 = 0
            goto L_0x001f
        L_0x001e:
            r3 = 1
        L_0x001f:
            if (r2 == 0) goto L_0x0027
            boolean r6 = r8.f25071i     // Catch:{ all -> 0x0080 }
            if (r6 != 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            if (r3 == 0) goto L_0x0031
            if (r5 == 0) goto L_0x0031
            com.yandex.metrica.impl.ob.Wl r3 = r7.f28091b     // Catch:{ all -> 0x0080 }
            org.json.JSONObject r0 = r3.mo62459a(r8, r2)     // Catch:{ all -> 0x0080 }
        L_0x0031:
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0080 }
            byte[] r2 = r2.getBytes()     // Catch:{ all -> 0x0080 }
            int r2 = r2.length     // Catch:{ all -> 0x0080 }
            int r2 = r2 + r10
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x0081 }
            r3.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = "ch"
            r0.put(r5, r3)     // Catch:{ all -> 0x0081 }
            int r2 = r2 + 8
            int r5 = r8.f25076n     // Catch:{ all -> 0x0081 }
            if (r2 > r5) goto L_0x0079
            int r5 = r8.f25075m     // Catch:{ all -> 0x0081 }
            if (r1 <= r5) goto L_0x0050
            goto L_0x0079
        L_0x0050:
            java.util.List<com.yandex.metrica.impl.ob.rl> r4 = r7.f28090a     // Catch:{ all -> 0x0081 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0081 }
        L_0x0056:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0081 }
            com.yandex.metrica.impl.ob.rl r5 = (com.yandex.metrica.impl.p265ob.C11722rl) r5     // Catch:{ all -> 0x0081 }
            int r6 = r2 + 1
            com.yandex.metrica.impl.ob.rl$a r5 = r5.mo63608a(r8, r9, r6, r1)     // Catch:{ all -> 0x0081 }
            org.json.JSONObject r6 = r5.f28094c     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x006f
            r3.put(r6)     // Catch:{ all -> 0x0081 }
        L_0x006f:
            int r6 = r5.f28092a     // Catch:{ all -> 0x0081 }
            if (r6 != 0) goto L_0x0074
            goto L_0x0081
        L_0x0074:
            int r5 = r5.f28093b     // Catch:{ all -> 0x0081 }
            int r1 = r1 + r5
            int r2 = r2 + r6
            goto L_0x0056
        L_0x0079:
            com.yandex.metrica.impl.ob.rl$a r8 = new com.yandex.metrica.impl.ob.rl$a     // Catch:{ all -> 0x0081 }
            r9 = 0
            r8.<init>(r4, r4, r9)     // Catch:{ all -> 0x0081 }
            return r8
        L_0x0080:
            r2 = r10
        L_0x0081:
            com.yandex.metrica.impl.ob.rl$a r8 = new com.yandex.metrica.impl.ob.rl$a
            int r2 = r2 - r10
            int r1 = r1 - r11
            r8.<init>(r2, r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11722rl.mo63608a(com.yandex.metrica.impl.ob.Kl, com.yandex.metrica.impl.ob.bl, int, int):com.yandex.metrica.impl.ob.rl$a");
    }
}
