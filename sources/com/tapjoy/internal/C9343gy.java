package com.tapjoy.internal;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.internal.C9232ev;
import com.tapjoy.internal.C9238ex;
import com.tapjoy.internal.C9256fd;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.gy */
public final class C9343gy {

    /* renamed from: a */
    final C9357hc f23102a;

    /* renamed from: b */
    final C9341gx f23103b;

    /* renamed from: c */
    long f23104c;

    /* renamed from: d */
    private int f23105d = 1;

    /* renamed from: e */
    private final C9238ex.C9239a f23106e = new C9238ex.C9239a();

    C9343gy(C9357hc hcVar, C9341gx gxVar) {
        this.f23102a = hcVar;
        this.f23103b = gxVar;
    }

    /* renamed from: a */
    public final void mo58236a(String str, String str2, double d, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        double d2;
        C9357hc hcVar = this.f23102a;
        synchronized (hcVar) {
            SharedPreferences.Editor a = hcVar.f23156c.mo58306a();
            int i = 1;
            if (str2.equals(hcVar.f23156c.f23209l.mo58486a())) {
                i = 1 + hcVar.f23156c.f23210m.mo58454b();
                hcVar.f23156c.f23210m.mo58450a(a, i);
                d2 = hcVar.f23156c.f23211n.mo58331a() + d;
                hcVar.f23156c.f23211n.mo58333a(a, d2);
                a.apply();
            } else {
                hcVar.f23156c.f23209l.mo58485a(a, str2);
                hcVar.f23156c.f23210m.mo58450a(a, 1);
                hcVar.f23156c.f23211n.mo58333a(a, d);
                hcVar.f23156c.f23212o.mo58481a(a);
                hcVar.f23156c.f23213p.mo58332a(a);
                a.apply();
                hcVar.f23155b.f22914l = str2;
                hcVar.f23155b.f22917o = null;
                hcVar.f23155b.f22918p = null;
                d2 = d;
            }
            hcVar.f23155b.f22915m = Integer.valueOf(i);
            hcVar.f23155b.f22916n = Double.valueOf(d2);
        }
        C9232ev.C9233a a2 = mo58234a(C9241ey.APP, FirebaseAnalytics.Event.PURCHASE);
        C9256fd.C9257a aVar = new C9256fd.C9257a();
        aVar.f22832c = str;
        if (str2 != null) {
            aVar.f22835f = str2;
        }
        aVar.f22834e = Double.valueOf(d);
        if (str5 != null) {
            aVar.f22842m = str5;
        }
        if (str3 != null) {
            aVar.f22844o = str3;
        }
        if (str4 != null) {
            aVar.f22845p = str4;
        }
        a2.f22722p = aVar.mo58111b();
        mo58235a(a2);
        C9357hc hcVar2 = this.f23102a;
        long longValue = a2.f22711e.longValue();
        synchronized (hcVar2) {
            SharedPreferences.Editor a3 = hcVar2.f23156c.mo58306a();
            hcVar2.f23156c.f23212o.mo58482a(a3, longValue);
            hcVar2.f23156c.f23213p.mo58333a(a3, d);
            a3.apply();
            hcVar2.f23155b.f22917o = Long.valueOf(longValue);
            hcVar2.f23155b.f22918p = Double.valueOf(d);
        }
    }

    /* renamed from: a */
    public final void mo58238a(String str, String str2, String str3, String str4, Map map) {
        C9232ev.C9233a a = mo58234a(C9241ey.CUSTOM, str2);
        a.f22726t = str;
        a.f22727u = str3;
        a.f22728v = str4;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                a.f22729w.add(new C9243ez((String) entry.getKey(), (Long) entry.getValue()));
            }
        }
        mo58235a(a);
    }

    /* renamed from: a */
    public final void mo58237a(String str, String str2, int i, long j, long j2, Map map) {
        C9232ev.C9233a a = mo58234a(C9241ey.USAGES, str);
        a.f22730x = str2;
        a.f22731y = Integer.valueOf(i);
        a.f22732z = Long.valueOf(j);
        a.f22708A = Long.valueOf(j2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                a.f22729w.add(new C9243ez((String) entry.getKey(), (Long) entry.getValue()));
            }
        }
        mo58235a(a);
    }

    /* renamed from: a */
    public final C9232ev.C9233a mo58234a(C9241ey eyVar, String str) {
        C9250fb b = this.f23102a.mo58290b();
        C9232ev.C9233a aVar = new C9232ev.C9233a();
        aVar.f22713g = C9357hc.f23153a;
        aVar.f22709c = eyVar;
        aVar.f22710d = str;
        if (C9503v.m25546c()) {
            aVar.f22711e = Long.valueOf(C9503v.m25545b());
            aVar.f22712f = Long.valueOf(System.currentTimeMillis());
        } else {
            aVar.f22711e = Long.valueOf(System.currentTimeMillis());
            aVar.f22714h = Long.valueOf(SystemClock.elapsedRealtime());
        }
        aVar.f22716j = b.f22800d;
        aVar.f22717k = b.f22801e;
        aVar.f22718l = b.f22802f;
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:12|13|15|16|17|18|19|20) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a A[SYNTHETIC, Splitter:B:37:0x006a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo58235a(com.tapjoy.internal.C9232ev.C9233a r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.tapjoy.internal.ey r0 = r5.f22709c     // Catch:{ all -> 0x0075 }
            com.tapjoy.internal.ey r1 = com.tapjoy.internal.C9241ey.USAGES     // Catch:{ all -> 0x0075 }
            if (r0 == r1) goto L_0x0033
            int r0 = r4.f23105d     // Catch:{ all -> 0x0075 }
            int r1 = r0 + 1
            r4.f23105d = r1     // Catch:{ all -> 0x0075 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0075 }
            r5.f22720n = r0     // Catch:{ all -> 0x0075 }
            com.tapjoy.internal.ex$a r0 = r4.f23106e     // Catch:{ all -> 0x0075 }
            com.tapjoy.internal.ey r0 = r0.f22741c     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0021
            com.tapjoy.internal.ex$a r0 = r4.f23106e     // Catch:{ all -> 0x0075 }
            com.tapjoy.internal.ex r0 = r0.mo58096b()     // Catch:{ all -> 0x0075 }
            r5.f22721o = r0     // Catch:{ all -> 0x0075 }
        L_0x0021:
            com.tapjoy.internal.ex$a r0 = r4.f23106e     // Catch:{ all -> 0x0075 }
            com.tapjoy.internal.ey r1 = r5.f22709c     // Catch:{ all -> 0x0075 }
            r0.f22741c = r1     // Catch:{ all -> 0x0075 }
            com.tapjoy.internal.ex$a r0 = r4.f23106e     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r5.f22710d     // Catch:{ all -> 0x0075 }
            r0.f22742d = r1     // Catch:{ all -> 0x0075 }
            com.tapjoy.internal.ex$a r0 = r4.f23106e     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r5.f22726t     // Catch:{ all -> 0x0075 }
            r0.f22743e = r1     // Catch:{ all -> 0x0075 }
        L_0x0033:
            com.tapjoy.internal.gx r0 = r4.f23103b     // Catch:{ all -> 0x0075 }
            com.tapjoy.internal.ev r5 = r5.mo58090b()     // Catch:{ all -> 0x0075 }
            com.tapjoy.internal.hl r1 = r0.f23096a     // Catch:{ Exception -> 0x0073 }
            java.lang.Object r2 = r1.f23230a     // Catch:{ Exception -> 0x0073 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0073 }
            com.tapjoy.internal.ax r3 = r1.f23231b     // Catch:{ Exception -> 0x0046 }
            r3.add(r5)     // Catch:{ Exception -> 0x0046 }
            goto L_0x004e
        L_0x0044:
            r5 = move-exception
            goto L_0x0071
        L_0x0046:
            r1.mo58309a()     // Catch:{ all -> 0x0044 }
            com.tapjoy.internal.ax r1 = r1.f23231b     // Catch:{ Exception -> 0x004e }
            r1.add(r5)     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            com.tapjoy.internal.cd r1 = r0.f23097b     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x006a
            boolean r1 = com.tapjoy.internal.C9340gw.f23095a     // Catch:{ all -> 0x0075 }
            if (r1 != 0) goto L_0x0064
            com.tapjoy.internal.ey r5 = r5.f22695n     // Catch:{ all -> 0x0075 }
            com.tapjoy.internal.ey r1 = com.tapjoy.internal.C9241ey.CUSTOM     // Catch:{ all -> 0x0075 }
            if (r5 == r1) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            r5 = 0
            r0.mo58231a(r5)     // Catch:{ all -> 0x0075 }
            monitor-exit(r4)
            return
        L_0x0064:
            r5 = 1
            r0.mo58231a(r5)     // Catch:{ all -> 0x0075 }
            monitor-exit(r4)
            return
        L_0x006a:
            com.tapjoy.internal.hl r5 = r0.f23096a     // Catch:{ all -> 0x0075 }
            r5.flush()     // Catch:{ all -> 0x0075 }
            monitor-exit(r4)
            return
        L_0x0071:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r5     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            monitor-exit(r4)
            return
        L_0x0075:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9343gy.mo58235a(com.tapjoy.internal.ev$a):void");
    }
}
