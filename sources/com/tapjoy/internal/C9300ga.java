package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.tapjoy.internal.ga */
public final class C9300ga {

    /* renamed from: b */
    private static final C9300ga f22994b;

    /* renamed from: c */
    private static C9300ga f22995c;

    /* renamed from: a */
    public final C9296fy f22996a = new C9296fy();

    /* renamed from: d */
    private Context f22997d;

    static {
        C9300ga gaVar = new C9300ga();
        f22994b = gaVar;
        f22995c = gaVar;
    }

    /* renamed from: a */
    public static C9300ga m24929a() {
        return f22995c;
    }

    /* renamed from: b */
    public static C9296fy m24930b() {
        return f22995c.f22996a;
    }

    C9300ga() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0030 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo58171a(android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0050
            android.content.Context r0 = r3.f22997d     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0050
            r3.f22997d = r4     // Catch:{ all -> 0x004d }
            android.content.SharedPreferences r4 = r3.mo58172c()     // Catch:{ all -> 0x004d }
            android.content.SharedPreferences r0 = r3.mo58172c()     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "configurations"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x003d
            com.tapjoy.internal.bn r0 = com.tapjoy.internal.C9101bn.m24359b(r0)     // Catch:{ Exception -> 0x0030 }
            java.util.Map r1 = r0.mo57860d()     // Catch:{ all -> 0x002b }
            r0.close()     // Catch:{ Exception -> 0x0030 }
            com.tapjoy.internal.fy r0 = r3.f22996a     // Catch:{ Exception -> 0x0030 }
            r0.mo58160a((java.util.Map) r1)     // Catch:{ Exception -> 0x0030 }
            goto L_0x003d
        L_0x002b:
            r1 = move-exception
            r0.close()     // Catch:{ Exception -> 0x0030 }
            throw r1     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "configurations"
            android.content.SharedPreferences$Editor r4 = r4.remove(r0)     // Catch:{ all -> 0x004d }
            r4.apply()     // Catch:{ all -> 0x004d }
        L_0x003d:
            com.tapjoy.internal.ga$1 r4 = new com.tapjoy.internal.ga$1     // Catch:{ all -> 0x004d }
            r4.<init>()     // Catch:{ all -> 0x004d }
            com.tapjoy.internal.fy r0 = r3.f22996a     // Catch:{ all -> 0x004d }
            r0.addObserver(r4)     // Catch:{ all -> 0x004d }
            com.tapjoy.internal.fy r0 = r3.f22996a     // Catch:{ all -> 0x004d }
            r4.update(r0, r2)     // Catch:{ all -> 0x004d }
            goto L_0x0050
        L_0x004d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0050:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9300ga.mo58171a(android.content.Context):void");
    }

    /* renamed from: c */
    public final SharedPreferences mo58172c() {
        return this.f22997d.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
    }
}
