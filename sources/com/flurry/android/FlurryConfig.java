package com.flurry.android;

import android.os.Handler;
import com.flurry.sdk.C2328a;
import com.flurry.sdk.C2473c;
import com.flurry.sdk.C2494ck;
import com.flurry.sdk.C2522d;
import com.flurry.sdk.C2653j;

public final class FlurryConfig {

    /* renamed from: a */
    private static FlurryConfig f5314a;

    /* renamed from: b */
    private C2522d f5315b = C2522d.m5445a();

    public static synchronized FlurryConfig getInstance() {
        FlurryConfig flurryConfig;
        synchronized (FlurryConfig.class) {
            if (f5314a == null) {
                if (C2494ck.m5371a() != null) {
                    f5314a = new FlurryConfig();
                } else {
                    throw new IllegalStateException("Flurry SDK must be initialized before starting config");
                }
            }
            flurryConfig = f5314a;
        }
        return flurryConfig;
    }

    private FlurryConfig() {
    }

    public final void fetchConfig() {
        this.f5315b.mo17740d();
    }

    public final boolean activateConfig() {
        return this.f5315b.mo17738a((C2653j) null);
    }

    public final void resetState() {
        this.f5315b.mo17741e();
    }

    public final void registerListener(FlurryConfigListener flurryConfigListener) {
        this.f5315b.mo17736a(flurryConfigListener, C2653j.f6229a, (Handler) null);
    }

    public final void registerListener(FlurryConfigListener flurryConfigListener, Handler handler) {
        this.f5315b.mo17736a(flurryConfigListener, C2653j.f6229a, handler);
    }

    public final void unregisterListener(FlurryConfigListener flurryConfigListener) {
        this.f5315b.mo17735a(flurryConfigListener);
    }

    public final String getString(String str, String str2) {
        return this.f5315b.mo17739c().mo17561a(str, str2, C2653j.f6229a);
    }

    public final boolean getBoolean(String str, boolean z) {
        C2328a c = this.f5315b.mo17739c();
        C2473c a = c.f5326b.mo17852a(str, C2653j.f6229a);
        if (a == null) {
            a = c.f5325a.mo17839a(str);
        }
        return a != null ? Boolean.parseBoolean(a.mo17664a()) : z;
    }

    public final int getInt(String str, int i) {
        return this.f5315b.mo17739c().mo17559a(str, i, C2653j.f6229a);
    }

    public final long getLong(String str, long j) {
        return this.f5315b.mo17739c().mo17560a(str, j, C2653j.f6229a);
    }

    public final double getDouble(String str, double d) {
        return this.f5315b.mo17739c().mo17557a(str, d, C2653j.f6229a);
    }

    public final float getFloat(String str, float f) {
        return this.f5315b.mo17739c().mo17558a(str, f, C2653j.f6229a);
    }

    public final String toString() {
        return this.f5315b.toString();
    }
}
