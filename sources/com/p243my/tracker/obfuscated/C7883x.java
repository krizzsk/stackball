package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.p243my.tracker.MyTrackerConfig;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.my.tracker.obfuscated.x */
public final class C7883x {

    /* renamed from: a */
    final AtomicReference<byte[]> f20200a = new AtomicReference<>();

    /* renamed from: b */
    final String f20201b;

    /* renamed from: c */
    final MyTrackerConfig.OkHttpClientProvider f20202c;

    /* renamed from: d */
    boolean f20203d = false;

    public C7883x(C7880v0 v0Var) {
        this.f20201b = m21601a(v0Var.mo52544k());
        this.f20202c = v0Var.mo52543j();
    }

    /* renamed from: a */
    static String m21601a(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://" + "ip4." + url.getAuthority();
        } catch (Throwable th) {
            C7877u0.m21548a("Ipv4DataProvider: error occurred while creating IPv4 url", th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m21602a() {
        /*
            r4 = this;
            java.lang.String r0 = "Ipv4DataProvider: get IPv4 address"
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r0)
            byte[] r0 = com.p243my.tracker.obfuscated.C7812g.f19878a
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r1 = r4.f20202c     // Catch:{ all -> 0x00a9 }
            com.my.tracker.obfuscated.t r1 = com.p243my.tracker.obfuscated.C7872t.m21531a((com.p243my.tracker.MyTrackerConfig.OkHttpClientProvider) r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r4.f20201b     // Catch:{ all -> 0x00a9 }
            com.my.tracker.obfuscated.t$b r1 = r1.mo52289a((java.lang.String) r2)     // Catch:{ all -> 0x00a9 }
            boolean r2 = r1.mo52505b()     // Catch:{ all -> 0x00a9 }
            if (r2 != 0) goto L_0x0030
            java.lang.String r1 = "Ipv4DataProvider: unsuccessful response from server"
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r1)     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = r4.f20200a
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f20200a     // Catch:{ all -> 0x002d }
            r2.set(r0)     // Catch:{ all -> 0x002d }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f20200a     // Catch:{ all -> 0x002d }
            r0.notify()     // Catch:{ all -> 0x002d }
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            throw r0
        L_0x0030:
            java.lang.Object r1 = r1.mo52504a()     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00a9 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x0053
            java.lang.String r1 = "Ipv4DataProvider: empty response from server"
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r1)     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = r4.f20200a
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f20200a     // Catch:{ all -> 0x0050 }
            r2.set(r0)     // Catch:{ all -> 0x0050 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f20200a     // Catch:{ all -> 0x0050 }
            r0.notify()     // Catch:{ all -> 0x0050 }
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            throw r0
        L_0x0053:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00a9 }
            r2.<init>(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "ip"
            java.lang.String r1 = r2.optString(r1)     // Catch:{ all -> 0x00a9 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x007b
            java.lang.String r1 = "Ipv4DataProvider: IP is empty"
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r1)     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = r4.f20200a
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f20200a     // Catch:{ all -> 0x0078 }
            r2.set(r0)     // Catch:{ all -> 0x0078 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f20200a     // Catch:{ all -> 0x0078 }
            r0.notify()     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            return
        L_0x0078:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r0
        L_0x007b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r2.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = "Ipv4DataProvider: IPv4 address is received "
            r2.append(r3)     // Catch:{ all -> 0x00a9 }
            r2.append(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a9 }
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r2)     // Catch:{ all -> 0x00a9 }
            java.net.InetAddress r1 = java.net.Inet4Address.getByName(r1)     // Catch:{ all -> 0x00a9 }
            byte[] r0 = r1.getAddress()     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = r4.f20200a
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f20200a     // Catch:{ all -> 0x00a6 }
            r2.set(r0)     // Catch:{ all -> 0x00a6 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f20200a     // Catch:{ all -> 0x00a6 }
            r0.notify()     // Catch:{ all -> 0x00a6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a6 }
            goto L_0x00bd
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a6 }
            throw r0
        L_0x00a9:
            r1 = move-exception
            java.lang.String r2 = "Ipv4DataProvider: failed to get IPv4 address"
            com.p243my.tracker.obfuscated.C7877u0.m21552b(r2, r1)     // Catch:{ all -> 0x00c1 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = r4.f20200a
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f20200a     // Catch:{ all -> 0x00be }
            r2.set(r0)     // Catch:{ all -> 0x00be }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f20200a     // Catch:{ all -> 0x00be }
            r0.notify()     // Catch:{ all -> 0x00be }
            monitor-exit(r1)     // Catch:{ all -> 0x00be }
        L_0x00bd:
            return
        L_0x00be:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00be }
            throw r0
        L_0x00c1:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = r4.f20200a
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicReference<byte[]> r3 = r4.f20200a     // Catch:{ all -> 0x00d1 }
            r3.set(r0)     // Catch:{ all -> 0x00d1 }
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = r4.f20200a     // Catch:{ all -> 0x00d1 }
            r0.notify()     // Catch:{ all -> 0x00d1 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d1 }
            throw r1
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.tracker.obfuscated.C7883x.m21602a():void");
    }

    /* renamed from: a */
    public void mo52553a(Context context) {
        if (!this.f20203d) {
            this.f20203d = true;
            if (TextUtils.isEmpty(this.f20201b)) {
                C7877u0.m21547a("Ipv4DataProvider: no IPv4 url");
                this.f20200a.set(C7812g.f19878a);
                return;
            }
            C7806d.m21131b(new Runnable() {
                public final void run() {
                    C7883x.this.m21602a();
                }
            });
            this.f20203d = true;
        }
    }

    /* renamed from: a */
    public void mo52554a(C7831m0 m0Var, Context context) {
        String str;
        byte[] bArr = this.f20200a.get();
        if (bArr == null) {
            try {
                C7877u0.m21547a("Ipv4DataProvider: waiting for collecting data");
                synchronized (this.f20200a) {
                    this.f20200a.wait(1000);
                }
                C7877u0.m21547a("Ipv4DataProvider: timeout for collecting IPv4 has exceeded");
                bArr = this.f20200a.get();
            } catch (Throwable unused) {
                C7877u0.m21547a("Ipv4DataProvider: attempt to block thread retrieving IPv4 finished unsuccessfully");
            }
        }
        if (bArr == null) {
            str = "Ipv4DataProvider: data hasn't been collected yet";
        } else if (bArr == C7812g.f19878a) {
            str = "Ipv4DataProvider: error occurred while collecting data";
        } else {
            m0Var.mo52404b(bArr);
            return;
        }
        C7877u0.m21547a(str);
    }

    /* renamed from: b */
    public void mo52555b(Context context) {
    }
}
