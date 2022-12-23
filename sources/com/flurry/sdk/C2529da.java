package com.flurry.sdk;

import com.flurry.android.FlurryAgent;

/* renamed from: com.flurry.sdk.da */
public final class C2529da {

    /* renamed from: a */
    public static final String f5934a = C2529da.class.getSimpleName();

    /* renamed from: c */
    private static C2529da f5935c = null;

    /* renamed from: b */
    public boolean f5936b = false;

    private C2529da() {
    }

    /* renamed from: a */
    public static synchronized C2529da m5470a() {
        C2529da daVar;
        synchronized (C2529da.class) {
            if (f5935c == null) {
                f5935c = new C2529da();
            }
            daVar = f5935c;
        }
        return daVar;
    }

    /* renamed from: b */
    public final synchronized String mo17746b() {
        if (!this.f5936b) {
            return null;
        }
        if (FlurryAgent.getInstantAppName() != null) {
            return FlurryAgent.getInstantAppName();
        }
        return C2499co.m5389a().mo17690d();
    }
}
