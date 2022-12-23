package com.ogury.p245ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p245ed.internal.C8091ca;
import com.ogury.p245ed.internal.C8122cw;
import java.util.Iterator;
import java.util.List;
import p269io.presage.common.AdConfig;
import p269io.presage.interstitial.p270ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.bv */
public final class C8081bv {

    /* renamed from: a */
    private final Context f20985a;

    /* renamed from: b */
    private final C8079bt f20986b;

    /* renamed from: c */
    private final C8448m f20987c;

    /* renamed from: d */
    private final C8095cd f20988d;

    /* renamed from: e */
    private final C8105ck f20989e;

    /* renamed from: f */
    private final C8233fn f20990f;

    /* renamed from: g */
    private final C8091ca.C8092a f20991g;

    /* renamed from: h */
    private C8280h f20992h;

    /* renamed from: i */
    private C8381k f20993i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C8076bs f20994j;

    /* renamed from: k */
    private C8408l f20995k;

    private C8081bv(Context context, C8079bt btVar, C8448m mVar, C8095cd cdVar, C8105ck ckVar, C8233fn fnVar, C8091ca.C8092a aVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(btVar, "adControllerFactory");
        C8467mq.m23881b(mVar, "adsSourceFactory");
        C8467mq.m23881b(cdVar, "publisherActivityFilter");
        C8467mq.m23881b(ckVar, "publisherFragmentFilter");
        C8467mq.m23881b(fnVar, "profigGateway");
        C8467mq.m23881b(aVar, "positionCalculatorFactory");
        this.f20985a = context;
        this.f20986b = btVar;
        this.f20987c = mVar;
        this.f20988d = cdVar;
        this.f20989e = ckVar;
        this.f20990f = fnVar;
        this.f20991g = aVar;
    }

    private /* synthetic */ C8081bv(Context context, C8079bt btVar, C8448m mVar) {
        this(context, btVar, mVar, new C8095cd(), new C8105ck(), C8233fn.f21330a, C8091ca.f21011a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8081bv(Context context, AdConfig adConfig) {
        this(context, new C8079bt(InterstitialActivity.f44191a), new C8448m(context, adConfig, C8193ej.OVERLAY_THUMBNAIL));
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(adConfig, "adConfig");
    }

    /* renamed from: a */
    public final void mo53242a(String str) {
        C8467mq.m23881b(str, "campaignId");
        this.f20987c.mo53960a(str);
    }

    /* renamed from: b */
    public final void mo53248b(String str) {
        C8467mq.m23881b(str, "creativeId");
        this.f20987c.mo53961b(str);
    }

    /* renamed from: a */
    public final boolean mo53245a() {
        C8408l lVar = this.f20995k;
        if (lVar == null) {
            return false;
        }
        return lVar.mo53931a();
    }

    /* renamed from: a */
    public final void mo53240a(C8280h hVar) {
        OguryIntegrationLogger.m22104d("[Ads][Thumbnail] Registering to ad listener");
        if (hVar == null) {
            OguryIntegrationLogger.m22104d("[Ads][Thumbnail] Ad listener is null");
        }
        this.f20992h = hVar;
        C8408l lVar = this.f20995k;
        if (lVar != null) {
            lVar.mo53926a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo53241a(C8381k kVar) {
        this.f20993i = kVar;
        C8408l lVar = this.f20995k;
        if (lVar != null) {
            lVar.mo53927a(kVar);
        }
    }

    /* renamed from: com.ogury.ed.internal.bv$b */
    static final class C8083b extends C8468mr implements C8432lk<C8205eu, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8081bv f20997a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8083b(C8081bv bvVar) {
            super(1);
            this.f20997a = bvVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22544a((C8205eu) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m22544a(C8205eu euVar) {
            C8467mq.m23881b(euVar, "it");
            this.f20997a.mo53237a(euVar.mo53444d(), euVar.mo53446e());
        }
    }

    /* renamed from: b */
    public final void mo53246b() {
        m22527d().mo53286b(new C8083b(this));
    }

    /* renamed from: a */
    public final void mo53237a(int i, int i2) {
        C8408l lVar = this.f20995k;
        boolean z = true;
        if (lVar == null || !lVar.mo53934c()) {
            z = false;
        }
        if (z) {
            C8076bs bsVar = this.f20994j;
            if (bsVar != null) {
                bsVar.mo53231a();
            }
            C8408l lVar2 = this.f20995k;
            if (lVar2 != null) {
                lVar2.mo53936e();
            }
        }
        m22526c();
        m22525b(i, i2);
        C8408l lVar3 = this.f20995k;
        if (lVar3 != null) {
            lVar3.mo53935d();
        }
    }

    /* renamed from: b */
    private final void m22525b(int i, int i2) {
        C8408l a = this.f20987c.mo53959a();
        this.f20995k = a;
        if (a != null) {
            a.mo53926a(this.f20992h);
        }
        C8408l lVar = this.f20995k;
        if (lVar != null) {
            lVar.mo53927a(this.f20993i);
        }
        C8408l lVar2 = this.f20995k;
        if (lVar2 != null) {
            lVar2.mo53925a(new C8203es(i, i2));
        }
    }

    /* renamed from: c */
    private final void m22526c() {
        C8079bt btVar = this.f20986b;
        Context applicationContext = this.f20985a.getApplicationContext();
        if (applicationContext != null) {
            this.f20994j = btVar.mo53234a((Application) applicationContext, this.f20988d, this.f20989e);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    /* renamed from: com.ogury.ed.internal.bv$c */
    static final class C8084c extends C8468mr implements C8432lk<C8205eu, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8081bv f20998a;

        /* renamed from: b */
        final /* synthetic */ Activity f20999b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8084c(C8081bv bvVar, Activity activity) {
            super(1);
            this.f20998a = bvVar;
            this.f20999b = activity;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22546a((C8205eu) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m22546a(C8205eu euVar) {
            C8467mq.m23881b(euVar, "it");
            this.f20998a.mo53239a(this.f20999b, new C8089bz(euVar.mo53438a(), euVar.mo53440b(), euVar.mo53442c()));
        }
    }

    /* renamed from: a */
    public final void mo53238a(Activity activity) {
        C8467mq.m23881b(activity, "activity");
        m22527d().mo53286b(new C8084c(this, activity));
    }

    /* renamed from: com.ogury.ed.internal.bv$a */
    static final class C8082a extends C8468mr implements C8431lj<C8205eu> {

        /* renamed from: a */
        final /* synthetic */ C8081bv f20996a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8082a(C8081bv bvVar) {
            super(0);
            this.f20996a = bvVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            return m22542b();
        }

        /* renamed from: b */
        private static C8205eu m22542b() {
            C8232fm a = C8233fn.m23112a();
            C8205eu p = a == null ? null : a.mo53557p();
            return p == null ? new C8205eu() : p;
        }
    }

    /* renamed from: d */
    private final C8122cw<C8205eu> m22527d() {
        C8122cw.C8123a aVar = C8122cw.f21054a;
        return C8122cw.C8123a.m22639a(new C8082a(this));
    }

    /* renamed from: a */
    public final void mo53239a(Activity activity, C8089bz bzVar) {
        C8467mq.m23881b(activity, "activity");
        C8467mq.m23881b(bzVar, "overlayPosition");
        if (this.f20995k == null) {
            OguryIntegrationLogger.m22105e("[Ads][Thumbnail][show] Failed to show (no ad loaded)");
            C8280h hVar = this.f20992h;
            if (hVar != null) {
                hVar.mo53468e();
            }
        }
        C8408l lVar = this.f20995k;
        if (lVar != null) {
            lVar.mo53929a((C8534t) new C8085d(this, activity, bzVar));
        }
    }

    /* renamed from: com.ogury.ed.internal.bv$d */
    public static final class C8085d implements C8534t {

        /* renamed from: a */
        final /* synthetic */ C8081bv f21000a;

        /* renamed from: b */
        final /* synthetic */ Activity f21001b;

        /* renamed from: c */
        final /* synthetic */ C8089bz f21002c;

        C8085d(C8081bv bvVar, Activity activity, C8089bz bzVar) {
            this.f21000a = bvVar;
            this.f21001b = activity;
            this.f21002c = bzVar;
        }

        /* renamed from: a */
        public final void mo53251a(Context context, List<C8185eb> list) {
            C8467mq.m23881b(context, "context");
            C8467mq.m23881b(list, CampaignUnit.JSON_KEY_ADS);
            C8204et a = C8081bv.m22524b(list);
            C8091ca a2 = C8091ca.C8092a.m22560a(this.f21001b);
            int a3 = a2.mo53260a(this.f21002c, a);
            int b = a2.mo53261b(this.f21002c, a);
            C8076bs a4 = this.f21000a.f20994j;
            if (a4 != null) {
                a4.mo53232a(this.f21001b, a3, b, list);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C8204et m22524b(List<C8185eb> list) {
        C8204et etVar;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            etVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((C8185eb) obj).mo53378u()) {
                break;
            }
        }
        C8185eb ebVar = (C8185eb) obj;
        if (ebVar != null) {
            etVar = ebVar.mo53363l();
        }
        return etVar == null ? new C8204et() : etVar;
    }

    /* renamed from: a */
    public final void mo53244a(String[] strArr) {
        C8467mq.m23881b(strArr, "packages");
        this.f20988d.mo53265a(C8388kg.m23749b(strArr));
    }

    /* renamed from: a */
    public final void mo53243a(Class<? extends Activity>[] clsArr) {
        C8467mq.m23881b(clsArr, "activities");
        this.f20988d.mo53267b(C8388kg.m23749b(clsArr));
    }

    /* renamed from: b */
    public final void mo53250b(String[] strArr) {
        C8467mq.m23881b(strArr, "packages");
        this.f20989e.mo53272a(C8388kg.m23745a(strArr));
    }

    /* renamed from: b */
    public final void mo53249b(Class<? extends Object>[] clsArr) {
        C8467mq.m23881b(clsArr, "fragments");
        this.f20989e.mo53274b(C8388kg.m23745a(clsArr));
    }

    /* renamed from: b */
    public final void mo53247b(Activity activity) {
        C8467mq.m23881b(activity, "activity");
        C8097cf cfVar = C8097cf.f21017a;
        C8097cf.m22570a(activity, this.f20988d, this.f20989e);
    }
}
