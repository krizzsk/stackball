package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.C14361q8;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.impl.s8 */
public class C14568s8 implements C14661ta {

    /* renamed from: f */
    private static final long f39869f = ((long) ac0.f30504a);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Object f39870g = new Object();

    /* renamed from: h */
    private static volatile C14568s8 f39871h;

    /* renamed from: a */
    private final C14361q8 f39872a = new C14361q8();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14745u8 f39873b = new C14745u8();

    /* renamed from: c */
    private final Handler f39874c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final WeakHashMap<C14749ua, Object> f39875d = new WeakHashMap<>();

    /* renamed from: e */
    private boolean f39876e;

    /* renamed from: com.yandex.mobile.ads.impl.s8$a */
    private class C14569a implements C14361q8.C14362a {
        private C14569a() {
        }

        /* synthetic */ C14569a(C14568s8 s8Var, C14443r8 r8Var) {
            this();
        }
    }

    private C14568s8() {
    }

    /* renamed from: a */
    static void m41839a(C14568s8 s8Var, String str) {
        s8Var.getClass();
        synchronized (f39870g) {
            s8Var.m41840a((String) null);
        }
    }

    /* renamed from: b */
    public static C14568s8 m41841b() {
        if (f39871h == null) {
            synchronized (f39870g) {
                if (f39871h == null) {
                    f39871h = new C14568s8();
                }
            }
        }
        return f39871h;
    }

    /* renamed from: a */
    public void mo69902a(C14749ua uaVar) {
        synchronized (f39870g) {
            this.f39875d.remove(uaVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m41840a(String str) {
        synchronized (f39870g) {
            this.f39874c.removeCallbacksAndMessages((Object) null);
            this.f39876e = false;
            for (C14749ua a : this.f39875d.keySet()) {
                a.mo64609a(str);
            }
            this.f39875d.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        monitor-enter(f39870g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        m41840a((java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5.f39873b.mo70304b();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69903b(com.yandex.mobile.ads.impl.C14749ua r6) {
        /*
            r5 = this;
            java.lang.Object r0 = f39870g
            monitor-enter(r0)
            java.util.WeakHashMap<com.yandex.mobile.ads.impl.ua, java.lang.Object> r1 = r5.f39875d     // Catch:{ all -> 0x0038 }
            r2 = 0
            r1.put(r6, r2)     // Catch:{ all -> 0x0038 }
            boolean r6 = r5.f39876e     // Catch:{ all -> 0x0027 }
            if (r6 != 0) goto L_0x0033
            r6 = 1
            r5.f39876e = r6     // Catch:{ all -> 0x0027 }
            android.os.Handler r6 = r5.f39874c     // Catch:{ all -> 0x0027 }
            com.yandex.mobile.ads.impl.r8 r1 = new com.yandex.mobile.ads.impl.r8     // Catch:{ all -> 0x0027 }
            r1.<init>(r5)     // Catch:{ all -> 0x0027 }
            long r3 = f39869f     // Catch:{ all -> 0x0027 }
            r6.postDelayed(r1, r3)     // Catch:{ all -> 0x0027 }
            com.yandex.mobile.ads.impl.q8 r6 = r5.f39872a     // Catch:{ all -> 0x0027 }
            com.yandex.mobile.ads.impl.s8$a r1 = new com.yandex.mobile.ads.impl.s8$a     // Catch:{ all -> 0x0027 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0027 }
            r6.mo69506b(r1)     // Catch:{ all -> 0x0027 }
            goto L_0x0033
        L_0x0027:
            com.yandex.mobile.ads.impl.u8 r6 = r5.f39873b     // Catch:{ all -> 0x0038 }
            r6.mo70304b()     // Catch:{ all -> 0x0038 }
            java.lang.Object r6 = f39870g     // Catch:{ all -> 0x0038 }
            monitor-enter(r6)     // Catch:{ all -> 0x0038 }
            r5.m41840a((java.lang.String) r2)     // Catch:{ all -> 0x0035 }
            monitor-exit(r6)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return
        L_0x0035:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0035 }
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14568s8.mo69903b(com.yandex.mobile.ads.impl.ua):void");
    }
}
