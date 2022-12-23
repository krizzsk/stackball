package com.ogury.p245ed.internal;

import com.ogury.core.internal.OguryIntegrationLogger;
import com.smaato.sdk.video.vast.model.C8937Ad;
import java.util.ArrayList;
import java.util.List;
import p269io.presage.common.AdConfig;
import p269io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.i */
public final class C8316i {

    /* renamed from: a */
    private C8431lj<C8386ke> f21485a;

    /* renamed from: b */
    private int f21486b;

    /* renamed from: c */
    private boolean f21487c = true;

    /* renamed from: d */
    private boolean f21488d = true;

    /* renamed from: e */
    private boolean f21489e = true;

    /* renamed from: f */
    private List<String> f21490f = new ArrayList();

    /* renamed from: g */
    private int f21491g;

    /* renamed from: h */
    private boolean f21492h;

    /* renamed from: a */
    public final void mo53726a(C8431lj<C8386ke> ljVar) {
        this.f21485a = ljVar;
    }

    /* renamed from: a */
    public final void mo53724a(int i) {
        this.f21486b = i;
    }

    /* renamed from: a */
    public final void mo53725a(C8287hf hfVar, C8193ej ejVar, AdConfig adConfig, C8280h hVar, C8432lk<? super RewardItem, C8386ke> lkVar, C8381k kVar) {
        C8467mq.m23881b(hfVar, "event");
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        if (C8467mq.m23880a((Object) hfVar.mo53655c(), (Object) "adDisplayed")) {
            m23446a(ejVar, adConfig, hVar);
        } else if (C8467mq.m23880a((Object) hfVar.mo53655c(), (Object) "adImpression")) {
            m23447a(ejVar, adConfig, hfVar.mo53654b(), kVar);
        } else if (C8467mq.m23880a((Object) hfVar.mo53655c(), (Object) "adClosed")) {
            m23455c(ejVar, adConfig, hVar);
        } else if (C8467mq.m23880a((Object) hfVar.mo53655c(), (Object) "closeWhithoutShowNextAd")) {
            m23456d(ejVar, adConfig, hVar);
        } else if (hfVar instanceof C8290hi) {
            m23450a((C8290hi) hfVar, ejVar, adConfig, lkVar);
        } else if (hfVar instanceof C8281ha) {
            m23454b(ejVar, adConfig, hVar);
        } else if (hfVar instanceof C8286he) {
            m23449a((C8286he) hfVar, ejVar, adConfig, hVar);
        }
    }

    /* renamed from: a */
    private final void m23446a(C8193ej ejVar, AdConfig adConfig, C8280h hVar) {
        if (this.f21487c) {
            this.f21487c = false;
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo53404b());
            sb.append("][show][");
            String str = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Ad successfully shown!");
            OguryIntegrationLogger.m22104d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo53404b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdDisplayed() callback");
            OguryIntegrationLogger.m22104d(sb2.toString());
            String b = ejVar.mo53404b();
            if (adConfig != null) {
                str = adConfig.getAdUnitId();
            }
            m23448a(hVar, b, str);
            if (hVar != null) {
                hVar.mo53469f();
            }
        }
    }

    /* renamed from: a */
    private final void m23447a(C8193ej ejVar, AdConfig adConfig, String str, C8381k kVar) {
        if (!this.f21490f.contains(str)) {
            this.f21490f.add(str);
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo53404b());
            sb.append("][show][");
            String str2 = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Impression");
            OguryIntegrationLogger.m22104d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo53404b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdImpression() callback");
            OguryIntegrationLogger.m22104d(sb2.toString());
            String b = ejVar.mo53404b();
            if (adConfig != null) {
                str2 = adConfig.getAdUnitId();
            }
            m23451a(kVar, b, str2);
            if (kVar != null) {
                kVar.mo53327a();
            }
        }
    }

    /* renamed from: b */
    private final void m23454b(C8193ej ejVar, AdConfig adConfig, C8280h hVar) {
        if (this.f21488d) {
            this.f21488d = false;
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo53404b());
            sb.append("][show][");
            String str = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Ad clicked");
            OguryIntegrationLogger.m22104d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo53404b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdClicked() callback");
            OguryIntegrationLogger.m22104d(sb2.toString());
            String b = ejVar.mo53404b();
            if (adConfig != null) {
                str = adConfig.getAdUnitId();
            }
            m23448a(hVar, b, str);
            if (hVar != null) {
                hVar.mo53203a();
            }
        }
    }

    /* renamed from: c */
    private final void m23455c(C8193ej ejVar, AdConfig adConfig, C8280h hVar) {
        this.f21491g++;
        m23457e(ejVar, adConfig, hVar);
    }

    /* renamed from: d */
    private final void m23456d(C8193ej ejVar, AdConfig adConfig, C8280h hVar) {
        this.f21492h = true;
        m23457e(ejVar, adConfig, hVar);
    }

    /* renamed from: e */
    private final void m23457e(C8193ej ejVar, AdConfig adConfig, C8280h hVar) {
        if (this.f21489e && m23453a()) {
            this.f21489e = false;
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo53404b());
            sb.append("][show][");
            String str = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Ad closed");
            OguryIntegrationLogger.m22104d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo53404b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdClosed() callback");
            OguryIntegrationLogger.m22104d(sb2.toString());
            String b = ejVar.mo53404b();
            if (adConfig != null) {
                str = adConfig.getAdUnitId();
            }
            m23448a(hVar, b, str);
            if (hVar != null) {
                hVar.mo53470g();
            }
            C8431lj<C8386ke> ljVar = this.f21485a;
            if (ljVar != null) {
                ljVar.mo53190a();
            }
        }
    }

    /* renamed from: a */
    private static void m23450a(C8290hi hiVar, C8193ej ejVar, AdConfig adConfig, C8432lk<? super RewardItem, C8386ke> lkVar) {
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(ejVar.mo53404b());
        sb.append("][show][");
        String str = null;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("] Reward: ");
        sb.append(hiVar.mo53656a().getValue());
        sb.append(' ');
        sb.append(hiVar.mo53656a().getName());
        OguryIntegrationLogger.m22104d(sb.toString());
        StringBuilder sb2 = new StringBuilder("[Ads][");
        sb2.append(ejVar.mo53404b());
        sb2.append("][show][");
        sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb2.append("] Triggering onAdRewarded() callback");
        OguryIntegrationLogger.m22104d(sb2.toString());
        String b = ejVar.mo53404b();
        if (adConfig != null) {
            str = adConfig.getAdUnitId();
        }
        m23452a(lkVar, b, str);
        if (lkVar != null) {
            lkVar.mo53077a(hiVar.mo53656a());
        }
    }

    /* renamed from: a */
    private static void m23449a(C8286he heVar, C8193ej ejVar, AdConfig adConfig, C8280h hVar) {
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(ejVar.mo53404b());
        sb.append("][show][");
        String str = null;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]* Failed to show (error code: ");
        sb.append(heVar.mo53653a());
        OguryIntegrationLogger.m22105e(sb.toString());
        StringBuilder sb2 = new StringBuilder("[Ads][");
        sb2.append(ejVar.mo53404b());
        sb2.append("][show][");
        sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb2.append("] Triggering onAdError() callback");
        OguryIntegrationLogger.m22104d(sb2.toString());
        String b = ejVar.mo53404b();
        if (adConfig != null) {
            str = adConfig.getAdUnitId();
        }
        m23448a(hVar, b, str);
        if (hVar != null) {
            hVar.mo53464a(heVar.mo53653a());
        }
    }

    /* renamed from: a */
    private final boolean m23453a() {
        return this.f21491g == this.f21486b || this.f21492h;
    }

    /* renamed from: a */
    private static void m23448a(C8280h hVar, String str, String str2) {
        if (hVar == null) {
            OguryIntegrationLogger.m22104d("[Ads][" + str + "][show][" + str2 + "] No ad listener registered");
        }
    }

    /* renamed from: a */
    private static void m23451a(C8381k kVar, String str, String str2) {
        if (kVar == null) {
            OguryIntegrationLogger.m22104d("[Ads][" + str + "][show][" + str2 + "] No impression listener registered");
        }
    }

    /* renamed from: a */
    private static void m23452a(C8432lk<? super RewardItem, C8386ke> lkVar, String str, String str2) {
        if (lkVar == null) {
            OguryIntegrationLogger.m22104d("[Ads][" + str + "][show][" + str2 + "] No ad listener registered");
        }
    }
}
