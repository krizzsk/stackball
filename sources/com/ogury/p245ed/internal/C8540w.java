package com.ogury.p245ed.internal;

import android.app.Application;
import android.content.Context;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import java.util.List;
import p269io.presage.common.AdConfig;
import p269io.presage.interstitial.p270ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.w */
public final class C8540w {

    /* renamed from: a */
    private final Context f21757a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final FrameLayout f21758b;

    /* renamed from: c */
    private final C8539v f21759c;

    /* renamed from: d */
    private final C8544x f21760d;

    /* renamed from: e */
    private C8545y f21761e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8535u f21762f;

    /* renamed from: g */
    private C8408l f21763g;

    /* renamed from: h */
    private C8381k f21764h;

    /* renamed from: i */
    private C8408l f21765i;

    /* renamed from: j */
    private C8535u f21766j;

    /* renamed from: k */
    private C8109cn f21767k;

    private C8540w(Context context, FrameLayout frameLayout, C8539v vVar, C8544x xVar, C8545y yVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(frameLayout, TtmlNode.RUBY_CONTAINER);
        C8467mq.m23881b(vVar, "adControllerFactory");
        C8467mq.m23881b(xVar, "adsSourceFactory");
        C8467mq.m23881b(yVar, "bannerCallback");
        this.f21757a = context;
        this.f21758b = frameLayout;
        this.f21759c = vVar;
        this.f21760d = xVar;
        this.f21761e = yVar;
        yVar.mo54015a((C8431lj<C8386ke>) new C8431lj<C8386ke>(this) {
            /* renamed from: h */
            private void m24016h() {
                ((C8540w) this.f21679a).m24009e();
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo53190a() {
                m24016h();
                return C8386ke.f21633a;
            }
        });
    }

    public /* synthetic */ C8540w(Context context, FrameLayout frameLayout) {
        this(context, frameLayout, new C8539v(InterstitialActivity.f44191a), new C8544x(context), new C8545y());
    }

    /* renamed from: a */
    public final void mo54008a(C8280h hVar) {
        OguryIntegrationLogger.m22104d("[Ads][Banner View] Registering to ad listener");
        if (hVar == null) {
            OguryIntegrationLogger.m22104d("[Ads][Banner View] Ad listener is null");
        }
        this.f21761e.mo54014a(hVar);
        this.f21761e.mo54015a((C8431lj<C8386ke>) new C8542a(this));
    }

    /* renamed from: com.ogury.ed.internal.w$a */
    /* synthetic */ class C8542a extends C8466mp implements C8431lj<C8386ke> {
        C8542a(Object obj) {
            super(0, obj, C8540w.class, "onAdLoaded", "onAdLoaded()V");
        }

        /* renamed from: h */
        private void m24018h() {
            ((C8540w) this.f21679a).m24009e();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m24018h();
            return C8386ke.f21633a;
        }
    }

    /* renamed from: a */
    public final void mo54009a(C8381k kVar) {
        this.f21764h = kVar;
    }

    /* renamed from: a */
    public final void mo54010a(AdConfig adConfig, C8193ej ejVar, C8109cn cnVar) {
        C8467mq.m23881b(adConfig, "adConfig");
        C8467mq.m23881b(cnVar, "adSize");
        if (ejVar == null) {
            OguryIntegrationLogger.m22105e("[Ads][Banner View][load][" + adConfig.getAdUnitId() + "] Failed to load (invalid banner ad size)");
            throw new IllegalArgumentException("Ad size must be set before loading an ad".toString());
        } else if (ejVar.mo53407e()) {
            boolean z = false;
            if (adConfig.getAdUnitId().length() > 0) {
                this.f21767k = cnVar;
                C8408l lVar = this.f21763g;
                if (lVar != null && lVar.mo53934c()) {
                    z = true;
                }
                if (z) {
                    C8535u uVar = this.f21762f;
                    if (uVar != null) {
                        uVar.mo54005b();
                    }
                    C8408l lVar2 = this.f21763g;
                    if (lVar2 != null) {
                        lVar2.mo53936e();
                    }
                } else {
                    this.f21765i = this.f21763g;
                    this.f21766j = this.f21762f;
                }
                C8539v vVar = this.f21759c;
                Context applicationContext = this.f21757a.getApplicationContext();
                if (applicationContext != null) {
                    this.f21762f = vVar.mo54006a((Application) applicationContext);
                    C8408l a = this.f21760d.mo54013a(adConfig, ejVar);
                    this.f21763g = a;
                    if (a != null) {
                        a.mo53926a((C8280h) this.f21761e);
                    }
                    C8408l lVar3 = this.f21763g;
                    if (lVar3 != null) {
                        lVar3.mo53927a(this.f21764h);
                    }
                    C8408l lVar4 = this.f21763g;
                    if (lVar4 != null) {
                        lVar4.mo53935d();
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            OguryIntegrationLogger.m22105e("[Ads][" + ejVar.mo53404b() + "][load] Failed to load (invalid ad unit ID: \"" + adConfig.getAdUnitId() + "\")");
            throw new IllegalArgumentException("Ad unit must be set before loading an ad".toString());
        } else {
            OguryIntegrationLogger.m22105e("[Ads][Banner View][load][" + adConfig.getAdUnitId() + "] Failed to load (invalid ad type: " + ejVar.mo53404b() + ')');
            throw new IllegalArgumentException(("AdType " + ejVar + " is not a banner type").toString());
        }
    }

    /* renamed from: d */
    private final void m24008d() {
        if (this.f21763g == null) {
            this.f21761e.mo53468e();
        }
        C8408l lVar = this.f21763g;
        if (lVar != null) {
            lVar.mo53929a((C8534t) new C8543b(this));
        }
    }

    /* renamed from: com.ogury.ed.internal.w$b */
    public static final class C8543b implements C8534t {

        /* renamed from: a */
        final /* synthetic */ C8540w f21768a;

        C8543b(C8540w wVar) {
            this.f21768a = wVar;
        }

        /* renamed from: a */
        public final void mo53251a(Context context, List<C8185eb> list) {
            C8467mq.m23881b(context, "context");
            C8467mq.m23881b(list, CampaignUnit.JSON_KEY_ADS);
            C8535u b = this.f21768a.f21762f;
            if (b != null) {
                b.mo54002a(this.f21768a.f21758b, list);
            }
        }
    }

    /* renamed from: a */
    public final void mo54007a() {
        C8535u uVar;
        C8109cn cnVar = this.f21767k;
        if (cnVar != null && (uVar = this.f21762f) != null) {
            uVar.mo54003a(cnVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m24009e() {
        C8408l lVar = this.f21765i;
        if (lVar != null) {
            lVar.mo53936e();
        }
        C8535u uVar = this.f21766j;
        if (uVar != null) {
            uVar.mo54005b();
        }
        m24008d();
    }

    /* renamed from: b */
    public final void mo54011b() {
        C8535u uVar = this.f21762f;
        if (uVar != null) {
            uVar.mo54005b();
        }
        C8408l lVar = this.f21763g;
        if (lVar != null) {
            lVar.mo53936e();
        }
        this.f21762f = null;
        this.f21763g = null;
        this.f21761e.mo54015a((C8431lj<C8386ke>) null);
        this.f21761e.mo54014a((C8280h) null);
    }

    /* renamed from: c */
    public final boolean mo54012c() {
        C8535u uVar = this.f21762f;
        if (uVar == null) {
            return false;
        }
        return uVar.mo54004a();
    }
}
