package com.ogury.p245ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.smaato.sdk.video.vast.model.C8937Ad;
import java.util.List;
import p269io.presage.common.PresageSdk;

/* renamed from: com.ogury.ed.internal.j */
public final class C8352j {

    /* renamed from: a */
    private final Context f21577a;

    /* renamed from: b */
    private final C8240fu f21578b;

    /* renamed from: c */
    private final C8251gb f21579c;

    /* renamed from: d */
    private final C8193ej f21580d;

    /* renamed from: e */
    private final C8233fn f21581e;

    /* renamed from: f */
    private final PresageSdk f21582f;

    /* renamed from: g */
    private final C8533s f21583g;

    /* renamed from: h */
    private C8232fm f21584h;

    private C8352j(Context context, C8240fu fuVar, C8251gb gbVar, C8193ej ejVar, C8233fn fnVar, PresageSdk presageSdk, C8533s sVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(fuVar, "appBackgroundChecker");
        C8467mq.m23881b(gbVar, "internetChecker");
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        C8467mq.m23881b(fnVar, "profigGateway");
        C8467mq.m23881b(presageSdk, "presageSdk");
        C8467mq.m23881b(sVar, "oguryAds");
        this.f21577a = context;
        this.f21578b = fuVar;
        this.f21579c = gbVar;
        this.f21580d = ejVar;
        this.f21581e = fnVar;
        this.f21582f = presageSdk;
        this.f21583g = sVar;
    }

    public /* synthetic */ C8352j(Context context, C8240fu fuVar, C8251gb gbVar, C8193ej ejVar) {
        this(context, fuVar, gbVar, ejVar, C8233fn.f21330a, PresageSdk.f44180a, C8533s.f21743a);
    }

    /* renamed from: a */
    public final boolean mo53795a(C8280h hVar, boolean z, List<C8185eb> list) {
        C8467mq.m23881b(list, CampaignUnit.JSON_KEY_ADS);
        if (m23658a()) {
            OguryIntegrationLogger.m22105e("[Ads][" + this.f21580d.mo53404b() + "][show] Failed to show (module not set up)");
            m23657a(hVar, 5);
            return false;
        }
        this.f21584h = C8233fn.m23113a(this.f21577a);
        if (!z || list.isEmpty()) {
            OguryIntegrationLogger.m22105e("[Ads][" + this.f21580d.mo53404b() + "][show] Failed to show (no ad loaded)");
            OguryIntegrationLogger.m22104d("[Ads][" + this.f21580d.mo53404b() + "][show] Triggering onAdError() callback");
            if (hVar == null) {
                OguryIntegrationLogger.m22104d("[Ads][" + this.f21580d.mo53404b() + "][show] No ad listener registered");
            }
            if (hVar != null) {
                hVar.mo53468e();
            }
            return false;
        }
        for (Number intValue : C8394km.m23757b(3, 2, 7, 8, 1)) {
            int intValue2 = intValue.intValue();
            if (m23659a(intValue2)) {
                m23660b(intValue2);
                m23657a(hVar, intValue2);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m23659a(int i) {
        if (i == 1) {
            return mo53796b();
        }
        if (i == 2) {
            return m23662d();
        }
        if (i == 3) {
            return m23661c();
        }
        if (i == 7) {
            return m23666h();
        }
        if (i == 8) {
            return m23665g();
        }
        OguryIntegrationLogger.m22105e("[Ads][" + this.f21580d.mo53404b() + "][show] Failed to show (error code: " + i + ')');
        throw new IllegalArgumentException(C8467mq.m23873a("Illegal argument ", (Object) Integer.valueOf(i)));
    }

    /* renamed from: b */
    private final void m23660b(int i) {
        if (i == 1) {
            OguryIntegrationLogger.m22105e("[Ads][" + this.f21580d.mo53404b() + "][show] Failed to show (No Internet connection)");
        } else if (i == 2) {
            OguryIntegrationLogger.m22105e("[Ads][" + this.f21580d.mo53404b() + "][show] Failed to show (Ad serving has been disabled)");
        } else if (i == 3) {
            OguryIntegrationLogger.m22105e("[Ads][" + this.f21580d.mo53404b() + "][show] Failed to show (missing configuration)");
        } else if (i == 7) {
            OguryIntegrationLogger.m22105e("[Ads][" + this.f21580d.mo53404b() + "][show] Failed to show (Activity in background)");
        } else if (i == 8) {
            OguryIntegrationLogger.m22105e("[Ads][" + this.f21580d.mo53404b() + "][show] Failed to show (Another ad already displayed)");
        }
    }

    /* renamed from: a */
    public static boolean m23658a() {
        return !PresageSdk.m45483b();
    }

    /* renamed from: c */
    private final boolean m23661c() {
        return this.f21584h == null;
    }

    /* renamed from: d */
    private final boolean m23662d() {
        if (!m23661c()) {
            C8232fm fmVar = this.f21584h;
            return fmVar != null && !fmVar.mo53532b();
        }
    }

    /* renamed from: e */
    private final boolean m23663e() {
        return this.f21580d.mo53405c() && C8533s.m23986b();
    }

    /* renamed from: f */
    private final boolean m23664f() {
        return this.f21580d.mo53406d() && C8533s.m23984a();
    }

    /* renamed from: g */
    private final boolean m23665g() {
        return m23663e() || m23664f();
    }

    /* renamed from: b */
    public final boolean mo53796b() {
        return !this.f21579c.mo53611a(this.f21577a);
    }

    /* renamed from: h */
    private boolean m23666h() {
        return C8240fu.m23151a(this.f21577a);
    }

    /* renamed from: a */
    private final void m23657a(C8280h hVar, int i) {
        OguryIntegrationLogger.m22104d("[Ads][" + this.f21580d.mo53404b() + "][show] Triggering onAdError() callback");
        if (hVar == null) {
            OguryIntegrationLogger.m22104d("[Ads][" + this.f21580d.mo53404b() + "][show] No ad listener registered");
        }
        if (hVar != null) {
            hVar.mo53464a(i);
        }
    }
}
