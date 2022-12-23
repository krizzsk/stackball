package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.p149f.C6001a;

/* renamed from: com.ironsource.mediationsdk.utils.m */
public final class C5804m {

    /* renamed from: f */
    private static C5804m f14111f;

    /* renamed from: a */
    private int f14112a = 1;

    /* renamed from: b */
    private int f14113b = 1;

    /* renamed from: c */
    private int f14114c = 1;

    /* renamed from: d */
    private int f14115d = 1;

    /* renamed from: e */
    private C6001a f14116e = new C6001a();

    /* renamed from: com.ironsource.mediationsdk.utils.m$1 */
    static /* synthetic */ class C58051 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14117a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14117a = r0
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14117a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14117a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14117a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C5804m.C58051.<clinit>():void");
        }
    }

    private C5804m() {
        m14362d(this.f14112a);
        m14363e(this.f14113b);
        m14364f(this.f14115d);
    }

    /* renamed from: a */
    public static synchronized C5804m m14360a() {
        C5804m mVar;
        synchronized (C5804m.class) {
            if (f14111f == null) {
                f14111f = new C5804m();
            }
            mVar = f14111f;
        }
        return mVar;
    }

    /* renamed from: c */
    private static IronSource.AD_UNIT m14361c(int i) {
        if (i == 0) {
            return IronSource.AD_UNIT.OFFERWALL;
        }
        if (i == 1) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i != 3) {
            return null;
        }
        return IronSource.AD_UNIT.BANNER;
    }

    /* renamed from: d */
    private void m14362d(int i) {
        this.f14112a = i;
        this.f14116e.mo42539b(i);
    }

    /* renamed from: e */
    private void m14363e(int i) {
        this.f14113b = i;
        this.f14116e.mo42538a(i);
    }

    /* renamed from: f */
    private void m14364f(int i) {
        this.f14115d = i;
        this.f14116e.mo42540c(i);
    }

    /* renamed from: a */
    public final synchronized void mo42134a(int i) {
        mo42135a(m14361c(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo42135a(com.ironsource.mediationsdk.IronSource.AD_UNIT r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            int[] r0 = com.ironsource.mediationsdk.utils.C5804m.C58051.f14117a     // Catch:{ all -> 0x0039 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0039 }
            r3 = r0[r3]     // Catch:{ all -> 0x0039 }
            r0 = 1
            if (r3 == r0) goto L_0x0032
            r1 = 2
            if (r3 == r1) goto L_0x002a
            r1 = 3
            if (r3 == r1) goto L_0x0022
            r1 = 4
            if (r3 == r1) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            int r3 = r2.f14115d     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m14364f(r3)     // Catch:{ all -> 0x0039 }
        L_0x0020:
            monitor-exit(r2)
            return
        L_0x0022:
            int r3 = r2.f14113b     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m14363e(r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x002a:
            int r3 = r2.f14112a     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m14362d(r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0032:
            int r3 = r2.f14114c     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.f14114c = r3     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0039:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C5804m.mo42135a(com.ironsource.mediationsdk.IronSource$AD_UNIT):void");
    }

    /* renamed from: b */
    public final synchronized int mo42136b(int i) {
        return mo42137b(m14361c(i));
    }

    /* renamed from: b */
    public final synchronized int mo42137b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return -1;
        }
        int i = C58051.f14117a[ad_unit.ordinal()];
        if (i == 1) {
            return this.f14114c;
        } else if (i == 2) {
            return this.f14112a;
        } else if (i == 3) {
            return this.f14113b;
        } else if (i != 4) {
            return -1;
        } else {
            return this.f14115d;
        }
    }
}
