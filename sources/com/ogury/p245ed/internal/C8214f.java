package com.ogury.p245ed.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.core.OguryError;
import com.ogury.p245ed.OguryAdListener;

/* renamed from: com.ogury.ed.internal.f */
public final class C8214f implements C8280h {

    /* renamed from: a */
    public static final C8215a f21265a = new C8215a((byte) 0);

    /* renamed from: b */
    private final OguryAdListener f21266b;

    /* renamed from: b */
    public final void mo53465b() {
    }

    /* renamed from: com.ogury.ed.internal.f$a */
    public static final class C8215a {
        public /* synthetic */ C8215a(byte b) {
            this();
        }

        private C8215a() {
        }

        /* renamed from: a */
        public static C8214f m22993a(OguryAdListener oguryAdListener) {
            if (oguryAdListener != null) {
                return new C8214f(oguryAdListener);
            }
            return null;
        }
    }

    public C8214f(OguryAdListener oguryAdListener) {
        C8467mq.m23881b(oguryAdListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f21266b = oguryAdListener;
    }

    /* renamed from: c */
    public final void mo53466c() {
        this.f21266b.onAdError(new OguryError(2008, "The ad server doesn't have an ad to present to the user"));
    }

    /* renamed from: d */
    public final void mo53467d() {
        this.f21266b.onAdLoaded();
    }

    /* renamed from: e */
    public final void mo53468e() {
        this.f21266b.onAdError(new OguryError(2009, "The loading of the ad failed"));
    }

    /* renamed from: f */
    public final void mo53469f() {
        this.f21266b.onAdDisplayed();
    }

    /* renamed from: g */
    public final void mo53470g() {
        this.f21266b.onAdClosed();
    }

    /* renamed from: a */
    public final void mo53464a(int i) {
        C8128d dVar = C8128d.f21064a;
        this.f21266b.onAdError(C8128d.m22651a(i));
    }

    /* renamed from: a */
    public final void mo53203a() {
        this.f21266b.onAdClicked();
    }
}
