package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Nk */
class C10578Nk implements C11121cm {

    /* renamed from: a */
    private final C10868W0 f25298a;

    /* renamed from: b */
    private final C10115Al f25299b;

    /* renamed from: c */
    private final C10616Om f25300c;

    /* renamed from: d */
    private Map<Long, Long> f25301d;

    C10578Nk() {
        this(C10611Oh.m27142a(), new C10115Al(), new C10580Nm());
    }

    /* renamed from: a */
    public synchronized void mo61837a(Activity activity, long j) {
        this.f25301d.put(Long.valueOf(j), Long.valueOf(this.f25300c.mo61840a()));
    }

    /* renamed from: a */
    public void mo61838a(Activity activity, boolean z) {
    }

    /* renamed from: a */
    public void mo61470a(Throwable th, C11091bm bmVar) {
    }

    /* renamed from: a */
    public boolean mo61471a(C10378Il il) {
        return false;
    }

    C10578Nk(C10868W0 w0, C10115Al al, C10616Om om) {
        this.f25301d = new HashMap();
        this.f25298a = w0;
        this.f25299b = al;
        this.f25300c = om;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0036 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo61469a(long r3, android.app.Activity r5, com.yandex.metrica.impl.p265ob.C10319Gl r6, java.util.List<com.yandex.metrica.impl.p265ob.C10893Wl> r7, com.yandex.metrica.impl.p265ob.C10378Il r8, com.yandex.metrica.impl.p265ob.C11119cl r9) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.Om r5 = r2.f25300c     // Catch:{ all -> 0x004e }
            long r5 = r5.mo61840a()     // Catch:{ all -> 0x004e }
            java.util.Map<java.lang.Long, java.lang.Long> r7 = r2.f25301d     // Catch:{ all -> 0x004e }
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x004e }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x004e }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x004e }
            if (r7 == 0) goto L_0x003e
            java.util.Map<java.lang.Long, java.lang.Long> r8 = r2.f25301d     // Catch:{ all -> 0x004e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x004e }
            r8.remove(r3)     // Catch:{ all -> 0x004e }
            com.yandex.metrica.impl.ob.W0 r3 = r2.f25298a     // Catch:{ all -> 0x004e }
            java.lang.String r4 = "ui_parsing_time"
            com.yandex.metrica.impl.ob.Al r8 = r2.f25299b     // Catch:{ all -> 0x004e }
            long r0 = r7.longValue()     // Catch:{ all -> 0x004e }
            long r5 = r5 - r0
            r8.getClass()     // Catch:{ all -> 0x004e }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x004e }
            r7.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r8 = "time_millis"
            r7.put(r8, r5)     // Catch:{ all -> 0x0036 }
        L_0x0036:
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x004e }
            r3.reportEvent((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x004e }
            goto L_0x004c
        L_0x003e:
            com.yandex.metrica.impl.ob.W0 r3 = r2.f25298a     // Catch:{ all -> 0x004e }
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "Unexpected situation: no start time"
            r4.<init>(r5)     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "ui_parsing_diagnostics"
            r3.reportError((java.lang.String) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r2)
            return
        L_0x004e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10578Nk.mo61469a(long, android.app.Activity, com.yandex.metrica.impl.ob.Gl, java.util.List, com.yandex.metrica.impl.ob.Il, com.yandex.metrica.impl.ob.cl):void");
    }
}
