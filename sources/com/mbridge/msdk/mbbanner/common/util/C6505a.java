package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.mbbanner.common.p197b.C6469b;

/* renamed from: com.mbridge.msdk.mbbanner.common.util.a */
/* compiled from: BannerDelivery */
public class C6505a {

    /* renamed from: a */
    private static final String f16234a = C6505a.class.getSimpleName();

    /* renamed from: b */
    private final Handler f16235b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f16236c;

    /* renamed from: a */
    public final void mo44348a(boolean z) {
        this.f16236c = z;
    }

    /* renamed from: a */
    public final void mo44345a(final C6469b bVar, final CampaignUnit campaignUnit, final String str) {
        this.f16235b.post(new Runnable() {
            public final void run() {
                C6469b bVar = bVar;
                if (bVar != null) {
                    bVar.mo44267a(str, campaignUnit, C6505a.this.f16236c);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo44347a(final C6469b bVar, final String str, final String str2) {
        this.f16235b.post(new Runnable() {
            public final void run() {
                C6469b bVar = bVar;
                if (bVar != null) {
                    bVar.mo44268a(str2, str, C6505a.this.f16236c);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo44346a(final C6469b bVar, final String str) {
        this.f16235b.post(new Runnable() {
            public final void run() {
                C6469b bVar = bVar;
                if (bVar != null) {
                    bVar.mo44269a(str, C6505a.this.f16236c);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo44349b(final C6469b bVar, final String str) {
        this.f16235b.post(new Runnable() {
            public final void run() {
                C6469b bVar = bVar;
                if (bVar != null) {
                    bVar.mo44270b(str, C6505a.this.f16236c);
                }
            }
        });
    }
}
