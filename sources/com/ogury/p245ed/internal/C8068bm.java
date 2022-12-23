package com.ogury.p245ed.internal;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.smaato.sdk.video.vast.model.C8937Ad;
import p269io.presage.common.AdConfig;
import p269io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.bm */
public final class C8068bm {

    /* renamed from: a */
    private final Context f20944a;

    /* renamed from: b */
    private final AdConfig f20945b;

    /* renamed from: c */
    private final C8193ej f20946c;

    /* renamed from: d */
    private final C8448m f20947d;

    /* renamed from: e */
    private C8408l f20948e;

    /* renamed from: f */
    private C8280h f20949f;

    /* renamed from: g */
    private C8381k f20950g;

    /* renamed from: h */
    private String f20951h;

    /* renamed from: i */
    private String f20952i;

    /* renamed from: j */
    private C8432lk<? super RewardItem, C8386ke> f20953j;

    private C8068bm(Context context, AdConfig adConfig, C8193ej ejVar, C8448m mVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        C8467mq.m23881b(mVar, "adsSourceFactory");
        this.f20944a = context;
        this.f20945b = adConfig;
        this.f20946c = ejVar;
        this.f20947d = mVar;
        this.f20951h = "";
    }

    public /* synthetic */ C8068bm(Context context, AdConfig adConfig, C8193ej ejVar) {
        this(context, adConfig, ejVar, new C8448m(context, adConfig, ejVar));
    }

    /* renamed from: a */
    public final void mo53216a(C8432lk<? super RewardItem, C8386ke> lkVar) {
        this.f20953j = lkVar;
    }

    /* renamed from: a */
    public final void mo53213a() {
        C8408l lVar;
        C8408l lVar2 = this.f20948e;
        boolean z = true;
        if (lVar2 == null || !lVar2.mo53934c()) {
            z = false;
        }
        if (z && (lVar = this.f20948e) != null) {
            lVar.mo53936e();
        }
        C8408l c = m22472c();
        this.f20948e = c;
        String str = this.f20952i;
        if (str != null) {
            if (c != null) {
                c.mo53933b(str);
            }
        } else if (c != null) {
            c.mo53935d();
        }
    }

    /* renamed from: c */
    private final C8408l m22472c() {
        C8408l a = this.f20947d.mo53959a();
        a.mo53926a(this.f20949f);
        a.mo53928a(this.f20953j);
        a.mo53927a(this.f20950g);
        a.mo53930a(this.f20951h);
        return a;
    }

    /* renamed from: a */
    public final void mo53214a(C8280h hVar) {
        OguryIntegrationLogger.m22104d("[Ads][" + this.f20946c.mo53404b() + "] Registering to ad listener");
        if (hVar == null) {
            OguryIntegrationLogger.m22104d("[Ads][" + this.f20946c.mo53404b() + "] Ad listener is null");
        }
        this.f20949f = hVar;
        C8408l lVar = this.f20948e;
        if (lVar != null) {
            lVar.mo53926a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo53215a(C8381k kVar) {
        this.f20950g = kVar;
        C8408l lVar = this.f20948e;
        if (lVar != null) {
            lVar.mo53927a(kVar);
        }
    }

    /* renamed from: a */
    public final void mo53217a(C8534t tVar) {
        C8467mq.m23881b(tVar, "showAction");
        if (this.f20948e == null) {
            OguryIntegrationLogger.m22105e("[Ads][" + this.f20946c.mo53404b() + "][show] Failed to show (no ad loaded)");
            OguryIntegrationLogger.m22104d("[Ads][" + this.f20946c.mo53404b() + "][show] Triggering onAdError() callback");
            if (this.f20949f == null) {
                OguryIntegrationLogger.m22104d("[Ads][" + this.f20946c.mo53404b() + "][show] No ad listener registered");
            }
            C8280h hVar = this.f20949f;
            if (hVar != null) {
                hVar.mo53468e();
            }
        }
        C8408l lVar = this.f20948e;
        if (lVar != null) {
            lVar.mo53929a(tVar);
        }
    }

    /* renamed from: b */
    public final boolean mo53220b() {
        C8408l lVar = this.f20948e;
        if (lVar == null) {
            return false;
        }
        return lVar.mo53931a();
    }

    /* renamed from: a */
    public final void mo53218a(String str) {
        C8467mq.m23881b(str, DataKeys.USER_ID);
        this.f20951h = str;
    }

    /* renamed from: b */
    public final void mo53219b(String str) {
        C8467mq.m23881b(str, "campaignId");
        C8239ft.m23149a(this.f20945b, str);
    }

    /* renamed from: c */
    public final void mo53221c(String str) {
        C8467mq.m23881b(str, "creativeId");
        C8239ft.m23150b(this.f20945b, str);
    }

    /* renamed from: d */
    public final void mo53222d(String str) {
        C8467mq.m23881b(str, "adMarkup");
        this.f20952i = str;
    }
}
