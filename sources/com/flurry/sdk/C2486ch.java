package com.flurry.sdk;

import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.ch */
public class C2486ch {

    /* renamed from: f */
    private static final String f5813f = C2486ch.class.getSimpleName();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public WeakReference<C2595eb> f5814a;

    /* renamed from: b */
    public volatile long f5815b = 0;

    /* renamed from: c */
    public volatile long f5816c = 0;

    /* renamed from: d */
    public volatile long f5817d = -1;

    /* renamed from: e */
    public volatile long f5818e = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2510cv<C2597ec> f5819g = new C2510cv<C2597ec>() {
        /* renamed from: a */
        public final /* synthetic */ void mo17521a(C2509cu cuVar) {
            C2597ec ecVar = (C2597ec) cuVar;
            if (C2486ch.this.f5814a == null || ecVar.f6084b == C2486ch.this.f5814a.get()) {
                int i = C24904.f5827a[ecVar.f6085d - 1];
                if (i == 1) {
                    C2486ch chVar = C2486ch.this;
                    C2595eb ebVar = ecVar.f6084b;
                    ecVar.f6083a.get();
                    chVar.f5814a = new WeakReference<>(ebVar);
                    chVar.f5815b = System.currentTimeMillis();
                    chVar.f5816c = SystemClock.elapsedRealtime();
                    C2494ck.m5371a().mo17685b(new C2621eo() {
                        /* renamed from: a */
                        public final void mo17573a() {
                            C2464bw.m5304a().mo17654e();
                        }
                    });
                } else if (i == 2) {
                    C2486ch chVar2 = C2486ch.this;
                    ecVar.f6083a.get();
                    chVar2.mo17672a();
                } else if (i == 3) {
                    C2486ch chVar3 = C2486ch.this;
                    ecVar.f6083a.get();
                    chVar3.f5817d = SystemClock.elapsedRealtime() - chVar3.f5816c;
                } else if (i == 4) {
                    C2511cw.m5419a().mo17724b("com.flurry.android.sdk.FlurrySessionEvent", C2486ch.this.f5819g);
                }
            }
        }
    };

    /* renamed from: h */
    private volatile long f5820h = 0;

    /* renamed from: i */
    private String f5821i;

    /* renamed from: j */
    private String f5822j;

    /* renamed from: k */
    private Map<String, String> f5823k;

    /* renamed from: com.flurry.sdk.ch$4 */
    static /* synthetic */ class C24904 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5827a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        static {
            /*
                int[] r0 = com.flurry.sdk.C2597ec.C2598a.m5641a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5827a = r0
                r1 = 1
                int r2 = com.flurry.sdk.C2597ec.C2598a.f6087a     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f5827a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.flurry.sdk.C2597ec.C2598a.f6088b     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f5827a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.flurry.sdk.C2597ec.C2598a.f6089c     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5827a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.flurry.sdk.C2597ec.C2598a.f6090d     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r1 = 4
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2486ch.C24904.<clinit>():void");
        }
    }

    public C2486ch() {
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.FlurrySessionEvent", this.f5819g);
        this.f5823k = new LinkedHashMap<String, String>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
                return size() > 10;
            }
        };
    }

    /* renamed from: a */
    public final synchronized void mo17672a() {
        long j = C2599ed.m5642a().f6095a;
        if (j > 0) {
            this.f5818e += System.currentTimeMillis() - j;
        }
    }

    /* renamed from: b */
    public final synchronized long mo17675b() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5816c;
        if (elapsedRealtime <= this.f5820h) {
            elapsedRealtime = this.f5820h + 1;
            this.f5820h = elapsedRealtime;
        }
        this.f5820h = elapsedRealtime;
        return this.f5820h;
    }

    /* renamed from: c */
    public final synchronized String mo17677c() {
        return this.f5821i;
    }

    /* renamed from: a */
    public final synchronized void mo17673a(String str) {
        this.f5821i = str;
    }

    /* renamed from: d */
    public final synchronized String mo17678d() {
        return this.f5822j;
    }

    /* renamed from: b */
    public final synchronized void mo17676b(String str) {
        this.f5822j = str;
    }

    /* renamed from: a */
    public final synchronized void mo17674a(String str, String str2) {
        this.f5823k.put(str, str2);
    }

    /* renamed from: e */
    public final synchronized Map<String, String> mo17679e() {
        return this.f5823k;
    }
}
