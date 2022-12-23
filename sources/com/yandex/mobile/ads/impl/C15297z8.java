package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.IIdentifierCallback;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.z8 */
public class C15297z8 implements IIdentifierCallback {

    /* renamed from: g */
    private static final List<String> f43052g = Arrays.asList(new String[]{"yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id"});

    /* renamed from: h */
    private static final long f43053h = ((long) ac0.f30504a);

    /* renamed from: a */
    private final C14659t8 f43054a;

    /* renamed from: b */
    private final Handler f43055b;

    /* renamed from: c */
    private final C14745u8 f43056c;

    /* renamed from: d */
    private boolean f43057d;

    /* renamed from: e */
    private final C15155x8 f43058e;

    /* renamed from: f */
    private final Object f43059f = new Object();

    C15297z8(C14659t8 t8Var) {
        this.f43054a = t8Var;
        this.f43055b = new Handler(Looper.getMainLooper());
        this.f43056c = new C14745u8();
        this.f43058e = new C15155x8();
    }

    /* renamed from: b */
    private void m44499b() {
        this.f43055b.postDelayed(new Runnable() {
            public final void run() {
                C15297z8.this.m44497a();
            }
        }, f43053h);
    }

    /* renamed from: c */
    private void m44500c() {
        synchronized (this.f43059f) {
            this.f43055b.removeCallbacksAndMessages((Object) null);
            this.f43057d = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        m44500c();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71179a(android.content.Context r3, com.yandex.mobile.ads.impl.C15237y8 r4) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f43059f
            monitor-enter(r0)
            com.yandex.mobile.ads.impl.x8 r1 = r2.f43058e     // Catch:{ all -> 0x0022 }
            r1.mo70846a((com.yandex.mobile.ads.impl.C15237y8) r4)     // Catch:{ all -> 0x0022 }
            boolean r4 = r2.f43057d     // Catch:{ all -> 0x001d }
            if (r4 != 0) goto L_0x0020
            r4 = 1
            r2.f43057d = r4     // Catch:{ all -> 0x001d }
            r2.m44499b()     // Catch:{ all -> 0x001d }
            com.yandex.mobile.ads.impl.t8 r4 = r2.f43054a     // Catch:{ all -> 0x001d }
            java.util.List<java.lang.String> r1 = f43052g     // Catch:{ all -> 0x001d }
            r4.getClass()     // Catch:{ all -> 0x001d }
            com.yandex.metrica.C12046p.m31173a((android.content.Context) r3, (com.yandex.metrica.IIdentifierCallback) r2, (java.util.List<java.lang.String>) r1)     // Catch:{ all -> 0x001d }
            goto L_0x0020
        L_0x001d:
            r2.m44500c()     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15297z8.mo71179a(android.content.Context, com.yandex.mobile.ads.impl.y8):void");
    }

    public void onReceive(Map<String, String> map) {
        synchronized (this.f43059f) {
            m44500c();
            if (map != null) {
                this.f43058e.mo70845a(new C15035w8(map.get("yandex_mobile_metrica_get_ad_url"), map.get("yandex_mobile_metrica_device_id"), map.get("yandex_mobile_metrica_uuid")));
            } else {
                m44498a(this.f43056c.mo70305c());
            }
        }
    }

    public void onRequestError(IIdentifierCallback.Reason reason) {
        synchronized (this.f43059f) {
            m44500c();
            m44498a(this.f43056c.mo70303a(reason));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44497a() {
        m44500c();
        m44498a(this.f43056c.mo70302a());
    }

    /* renamed from: a */
    private void m44498a(String str) {
        synchronized (this.f43059f) {
            this.f43058e.mo70844a();
        }
    }
}
