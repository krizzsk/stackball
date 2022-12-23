package com.ogury.p245ed.internal;

import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.network.NetworkRequest;
import com.ogury.core.internal.network.OguryNetworkClient;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.ogury.p245ed.internal.C8112cp;
import com.smaato.sdk.video.vast.model.C8937Ad;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;
import p269io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.dx */
public final class C8173dx implements C8171dv {

    /* renamed from: a */
    private final C8167ds f21150a;

    /* renamed from: b */
    private final C8216fa f21151b;

    /* renamed from: c */
    private final C8212ez f21152c;

    /* renamed from: d */
    private final C8132dc f21153d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final OguryNetworkClient f21154e;

    /* renamed from: f */
    private final C8169dt f21155f;

    /* renamed from: g */
    private final C8233fn f21156g;

    /* renamed from: h */
    private final C8202er f21157h;

    /* renamed from: i */
    private final C8244fx f21158i;

    private C8173dx(C8167ds dsVar, C8216fa faVar, C8212ez ezVar, C8132dc dcVar, OguryNetworkClient oguryNetworkClient, C8169dt dtVar, C8233fn fnVar, C8202er erVar, C8244fx fxVar) {
        C8467mq.m23881b(dsVar, "headersFactory");
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(ezVar, "androidDevice");
        C8467mq.m23881b(dcVar, "extraAdConfiguration");
        C8467mq.m23881b(oguryNetworkClient, "networkClient");
        C8467mq.m23881b(dtVar, "httpProfigChecker");
        C8467mq.m23881b(fnVar, "profigGateway");
        C8467mq.m23881b(erVar, "omidSdkChecker");
        C8467mq.m23881b(fxVar, "coreWrapper");
        this.f21150a = dsVar;
        this.f21151b = faVar;
        this.f21152c = ezVar;
        this.f21153d = dcVar;
        this.f21154e = oguryNetworkClient;
        this.f21155f = dtVar;
        this.f21156g = fnVar;
        this.f21157h = erVar;
        this.f21158i = fxVar;
    }

    public /* synthetic */ C8173dx(C8167ds dsVar, C8216fa faVar, C8212ez ezVar, C8132dc dcVar, OguryNetworkClient oguryNetworkClient, C8244fx fxVar) {
        this(dsVar, faVar, ezVar, dcVar, oguryNetworkClient, new C8169dt(), C8233fn.f21330a, C8202er.f21243a, fxVar);
    }

    /* renamed from: a */
    public final OguryNetworkResponse mo53320a(C8193ej ejVar, AdConfig adConfig, String str, C8203es esVar) {
        String str2 = str;
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        C8467mq.m23881b(str2, DataKeys.USER_ID);
        C8184ea eaVar = C8184ea.f21172a;
        String a = C8184ea.m22794a();
        String a2 = ejVar.mo53403a();
        String str3 = null;
        String adUnitId = adConfig == null ? null : adConfig.getAdUnitId();
        String campaignId = adConfig == null ? null : adConfig.getCampaignId();
        if (adConfig != null) {
            str3 = adConfig.getCreativeId();
        }
        C8186ec ecVar = new C8186ec(a2, adUnitId, campaignId, str3);
        C8191eh ehVar = new C8191eh(this.f21151b, this.f21152c, this.f21156g, this.f21157h, this.f21153d, this.f21158i);
        C8189ef efVar = C8189ef.f21209a;
        OguryNetworkResponse execute = this.f21154e.newCall(new NetworkRequest(a, "POST", C8189ef.m22870a(ehVar, ecVar, str2, esVar), this.f21150a.mo53317b())).execute();
        C8467mq.m23878a((Object) execute, "networkClient.newCall(request).execute()");
        return execute;
    }

    /* renamed from: b */
    public final OguryNetworkResponse mo53324b(String str) {
        C8467mq.m23881b(str, "url");
        OguryNetworkResponse execute = this.f21154e.newCall(new NetworkRequest(str, "GET", "", this.f21150a.mo53318c())).execute();
        C8467mq.m23878a((Object) execute, "networkClient.newCall(re…t)\n            .execute()");
        return execute;
    }

    /* renamed from: a */
    public final OguryNetworkResponse mo53321a(JSONObject jSONObject) {
        C8467mq.m23881b(jSONObject, "requestBody");
        boolean a = C8169dt.m22762a(jSONObject);
        C8184ea eaVar = C8184ea.f21172a;
        OguryNetworkResponse execute = this.f21154e.newCall(new NetworkRequest(C8184ea.m22796a(a), "POST", jSONObject.toString(), this.f21150a.mo53316a())).execute();
        C8467mq.m23878a((Object) execute, "networkClient.newCall(request).execute()");
        return execute;
    }

    /* renamed from: a */
    public final C8112cp mo53322a(JSONObject jSONObject, String str) {
        C8467mq.m23881b(jSONObject, "requestBody");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            C8184ea eaVar = C8184ea.f21172a;
            str = C8184ea.m22797b();
        }
        NetworkRequest networkRequest = new NetworkRequest(str, "POST", jSONObject.toString(), this.f21150a.mo53318c());
        C8112cp.C8113a aVar = C8112cp.f21042a;
        return C8112cp.C8113a.m22614a(new C8177d(this, networkRequest));
    }

    /* renamed from: com.ogury.ed.internal.dx$d */
    static final class C8177d extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8173dx f21162a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f21163b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8177d(C8173dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f21162a = dxVar;
            this.f21163b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22784b();
            return C8386ke.f21633a;
        }

        /* renamed from: b */
        private void m22784b() {
            OguryNetworkResponse execute = this.f21162a.f21154e.newCall(this.f21163b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C8467mq.m23878a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }

    /* renamed from: b */
    public final C8112cp mo53325b(JSONObject jSONObject, String str) {
        C8467mq.m23881b(jSONObject, "requestBody");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            C8184ea eaVar = C8184ea.f21172a;
            str = C8184ea.m22798c();
        }
        NetworkRequest networkRequest = new NetworkRequest(str, "POST", jSONObject.toString(), this.f21150a.mo53319d());
        C8112cp.C8113a aVar = C8112cp.f21042a;
        return C8112cp.C8113a.m22614a(new C8179f(this, networkRequest));
    }

    /* renamed from: com.ogury.ed.internal.dx$f */
    static final class C8179f extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8173dx f21166a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f21167b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8179f(C8173dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f21166a = dxVar;
            this.f21167b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22788b();
            return C8386ke.f21633a;
        }

        /* renamed from: b */
        private void m22788b() {
            OguryNetworkResponse execute = this.f21166a.f21154e.newCall(this.f21167b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C8467mq.m23878a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }

    /* renamed from: a */
    public final void mo53323a(String str) {
        C8467mq.m23881b(str, "url");
        NetworkRequest networkRequest = new NetworkRequest(str, "GET", "", this.f21150a.mo53319d());
        C8112cp.C8113a aVar = C8112cp.f21042a;
        C8112cp.C8113a.m22614a(new C8176c(this, networkRequest)).mo53279a((C8432lk<? super Throwable, C8386ke>) new C8174a(C8255gf.f21372a)).mo53280a((C8431lj<C8386ke>) C8175b.f21159a);
    }

    /* renamed from: com.ogury.ed.internal.dx$c */
    static final class C8176c extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8173dx f21160a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f21161b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8176c(C8173dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f21160a = dxVar;
            this.f21161b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22782b();
            return C8386ke.f21633a;
        }

        /* renamed from: b */
        private void m22782b() {
            OguryNetworkResponse execute = this.f21160a.f21154e.newCall(this.f21161b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C8467mq.m23878a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.dx$a */
    /* synthetic */ class C8174a extends C8466mp implements C8432lk<Throwable, C8386ke> {
        C8174a(Object obj) {
            super(1, obj, C8255gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m22779a(Throwable th) {
            C8467mq.m23881b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22779a((Throwable) obj);
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dx$b */
    static final class C8175b extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        public static final C8175b f21159a = new C8175b();

        C8175b() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53190a() {
            return C8386ke.f21633a;
        }
    }

    /* renamed from: c */
    public final C8112cp mo53326c(JSONObject jSONObject, String str) {
        C8467mq.m23881b(jSONObject, "requestBody");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            C8184ea eaVar = C8184ea.f21172a;
            str = C8184ea.m22799d();
        }
        NetworkRequest networkRequest = new NetworkRequest(str, "POST", jSONObject.toString(), this.f21150a.mo53319d());
        C8112cp.C8113a aVar = C8112cp.f21042a;
        return C8112cp.C8113a.m22614a(new C8178e(this, networkRequest));
    }

    /* renamed from: com.ogury.ed.internal.dx$e */
    static final class C8178e extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8173dx f21164a;

        /* renamed from: b */
        final /* synthetic */ NetworkRequest f21165b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8178e(C8173dx dxVar, NetworkRequest networkRequest) {
            super(0);
            this.f21164a = dxVar;
            this.f21165b = networkRequest;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22786b();
            return C8386ke.f21633a;
        }

        /* renamed from: b */
        private void m22786b() {
            OguryNetworkResponse execute = this.f21164a.f21154e.newCall(this.f21165b).execute();
            if (execute instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) execute).getException();
                C8467mq.m23878a((Object) exception, "response.exception");
                throw exception;
            }
        }
    }
}
