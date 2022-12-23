package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Uh */
public class C10815Uh {

    /* renamed from: a */
    private final Context f25956a;

    /* renamed from: b */
    private final C10442L0 f25957b;

    /* renamed from: c */
    private final C11769sn f25958c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10667Qd f25959d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10644Ph f25960e;

    /* renamed from: f */
    private final C10616Om f25961f;

    /* renamed from: g */
    private final C10808Ud f25962g;

    /* renamed from: h */
    private final C11892w f25963h;

    /* renamed from: i */
    private boolean f25964i;

    public C10815Uh(Context context) {
        this(context, new C10442L0(), new C10667Qd(), new C10580Nm(), new C10703Rd(context), C10619P0.m27164i().mo61891s().mo64214h(), C10619P0.m27164i().mo61893u(), C10619P0.m27164i().mo61872a());
    }

    /* renamed from: c */
    static void m27949c(C10815Uh uh) {
        synchronized (uh) {
            uh.f25964i = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo62364a(com.yandex.metrica.impl.p265ob.C10675Qi r11, com.yandex.metrica.impl.p265ob.C11211ei r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.yandex.metrica.impl.ob.Ei r5 = r11.mo61998M()     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0009
            monitor-exit(r10)
            return
        L_0x0009:
            com.yandex.metrica.impl.ob.L0 r0 = r10.f25957b     // Catch:{ all -> 0x0061 }
            android.content.Context r1 = r10.f25956a     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "certificate.p12"
            java.io.File r3 = r0.mo61697a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0061 }
            r0 = 1
            if (r3 == 0) goto L_0x001e
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r12.mo62835a((java.io.File) r3)     // Catch:{ all -> 0x0061 }
        L_0x0024:
            com.yandex.metrica.impl.ob.Om r2 = r10.f25961f     // Catch:{ all -> 0x0061 }
            long r6 = r2.mo61841b()     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.impl.ob.Ph r2 = r10.f25960e     // Catch:{ all -> 0x0061 }
            long r8 = r2.mo61502a()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0036
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
        L_0x0036:
            boolean r1 = r10.f25964i     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x005f
            java.lang.String r2 = r11.mo62013e()     // Catch:{ all -> 0x0061 }
            boolean r11 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0061 }
            if (r11 != 0) goto L_0x005f
            com.yandex.metrica.impl.ob.Ud r11 = r10.f25962g     // Catch:{ all -> 0x0061 }
            boolean r11 = r11.mo62128a()     // Catch:{ all -> 0x0061 }
            if (r11 == 0) goto L_0x005f
            r10.f25964i = r0     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.impl.ob.w r11 = r10.f25963h     // Catch:{ all -> 0x0061 }
            long r6 = com.yandex.metrica.impl.p265ob.C11892w.f28609c     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.impl.ob.sn r8 = r10.f25958c     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.impl.ob.Sh r9 = new com.yandex.metrica.impl.ob.Sh     // Catch:{ all -> 0x0061 }
            r0 = r9
            r1 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0061 }
            r11.mo63995a(r6, r8, r9)     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r10)
            return
        L_0x0061:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10815Uh.mo62364a(com.yandex.metrica.impl.ob.Qi, com.yandex.metrica.impl.ob.ei):void");
    }

    C10815Uh(Context context, C10442L0 l0, C10667Qd qd, C10616Om om, C10808Ud ud, C11769sn snVar, C10644Ph ph, C11892w wVar) {
        this.f25964i = false;
        this.f25956a = context;
        this.f25957b = l0;
        this.f25959d = qd;
        this.f25961f = om;
        this.f25962g = ud;
        this.f25958c = snVar;
        this.f25960e = ph;
        this.f25963h = wVar;
    }

    /* renamed from: a */
    static void m27947a(C10815Uh uh, long j) {
        uh.f25960e.mo61505a(uh.f25961f.mo61841b() + j);
    }
}
