package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.i */
public final class C5699i {

    /* renamed from: b */
    private static C5699i f13588b;

    /* renamed from: a */
    int f13589a;

    /* renamed from: c */
    private long f13590c = 0;

    /* renamed from: d */
    private boolean f13591d = false;

    private C5699i() {
    }

    /* renamed from: a */
    public static synchronized C5699i m14030a() {
        C5699i iVar;
        synchronized (C5699i.class) {
            if (f13588b == null) {
                f13588b = new C5699i();
            }
            iVar = f13588b;
        }
        return iVar;
    }

    /* renamed from: a */
    public final void mo41856a(final IronSourceBannerLayout ironSourceBannerLayout, final IronSourceError ironSourceError) {
        synchronized (this) {
            if (!this.f13591d) {
                long currentTimeMillis = System.currentTimeMillis() - this.f13590c;
                if (currentTimeMillis > ((long) (this.f13589a * 1000))) {
                    mo41857b(ironSourceBannerLayout, ironSourceError);
                    return;
                }
                this.f13591d = true;
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        C5699i.this.mo41857b(ironSourceBannerLayout, ironSourceError);
                    }
                }, ((long) (this.f13589a * 1000)) - currentTimeMillis);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41857b(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        if (ironSourceBannerLayout != null) {
            this.f13590c = System.currentTimeMillis();
            this.f13591d = false;
            ironSourceBannerLayout.mo41464a(ironSourceError);
        }
    }

    /* renamed from: b */
    public final boolean mo41858b() {
        boolean z;
        synchronized (this) {
            z = this.f13591d;
        }
        return z;
    }
}
