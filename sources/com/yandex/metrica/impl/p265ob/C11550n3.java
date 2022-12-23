package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C10086i;
import com.yandex.metrica.C12043l;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.n3 */
public class C11550n3 implements C11126d1 {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> f27762n;

    /* renamed from: a */
    private final Context f27763a;

    /* renamed from: b */
    private final C10248F9 f27764b;

    /* renamed from: c */
    private final C10373Ii f27765c;

    /* renamed from: d */
    private final C10191Dg f27766d;

    /* renamed from: e */
    private final C10797U3 f27767e;

    /* renamed from: f */
    private final C11478l2 f27768f;

    /* renamed from: g */
    private final C11544n2 f27769g;

    /* renamed from: h */
    private final C11801u0 f27770h;

    /* renamed from: i */
    private final C11031ab f27771i;

    /* renamed from: j */
    private final C10147C f27772j;

    /* renamed from: k */
    private final C10353I2 f27773k;

    /* renamed from: l */
    private volatile C11773t1 f27774l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public IIdentifierCallback f27775m;

    /* renamed from: com.yandex.metrica.impl.ob.n3$a */
    class C11551a implements IIdentifierCallback {

        /* renamed from: a */
        final /* synthetic */ AppMetricaDeviceIDListener f27776a;

        C11551a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f27776a = appMetricaDeviceIDListener;
        }

        public void onReceive(Map<String, String> map) {
            IIdentifierCallback unused = C11550n3.this.f27775m = null;
            this.f27776a.onLoaded(map.get("appmetrica_device_id_hash"));
        }

        public void onRequestError(IIdentifierCallback.Reason reason) {
            IIdentifierCallback unused = C11550n3.this.f27775m = null;
            this.f27776a.onError((AppMetricaDeviceIDListener.Reason) C11550n3.f27762n.get(reason));
        }
    }

    static {
        EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> enumMap = new EnumMap<>(IIdentifierCallback.Reason.class);
        f27762n = enumMap;
        enumMap.put(IIdentifierCallback.Reason.UNKNOWN, AppMetricaDeviceIDListener.Reason.UNKNOWN);
        enumMap.put(IIdentifierCallback.Reason.INVALID_RESPONSE, AppMetricaDeviceIDListener.Reason.INVALID_RESPONSE);
        enumMap.put(IIdentifierCallback.Reason.NETWORK, AppMetricaDeviceIDListener.Reason.NETWORK);
    }

    C11550n3(Context context, C11098c1 c1Var) {
        this(context.getApplicationContext(), c1Var, new C10248F9(C10663Qa.m27298a(context.getApplicationContext()).mo61960c()));
    }

    /* renamed from: b */
    public C10906X0 mo61836b() {
        return this.f27768f;
    }

    /* renamed from: c */
    public void mo61937c(C10086i iVar) {
        this.f27768f.mo63254c(iVar);
    }

    /* renamed from: d */
    public C11773t1 mo61938d() {
        return this.f27774l;
    }

    public void setStatisticsSending(boolean z) {
        this.f27774l.mo63697b().setStatisticsSending(z);
    }

    public void setUserProfileID(String str) {
        this.f27774l.mo63697b().setUserProfileID(str);
    }

    /* renamed from: a */
    public void mo61935a(YandexMetricaConfig yandexMetricaConfig, C12043l lVar) {
        this.f27771i.mo62641a(this.f27763a, this.f27765c).mo62572a(yandexMetricaConfig, this.f27765c.mo61554c());
        C10380Im b = C12038zm.m31087b(lVar.apiKey);
        C11959xm a = C12038zm.m31086a(lVar.apiKey);
        this.f27770h.getClass();
        if (this.f27774l == null) {
            this.f27766d.mo61191a();
            this.f27765c.mo61547a(b);
            this.f27765c.mo61550a(lVar.f28948d);
            this.f27765c.mo61551a(lVar.f28946b);
            this.f27765c.mo61549a(lVar.f28947c);
            if (C10796U2.m27891a((Object) lVar.f28947c)) {
                this.f27765c.mo61553b("api");
            }
            this.f27767e.mo62334b(lVar);
            this.f27769g.mo63345a(lVar.locationTracking, lVar.statisticsSending, (Boolean) null);
            C11729s1 a2 = this.f27768f.mo63253a(lVar, false, this.f27764b);
            this.f27774l = new C11773t1(a2, new C11699r0(a2));
            this.f27772j.mo61123a(this.f27774l.mo63696a());
            this.f27773k.mo61476a(a2);
            this.f27765c.mo61557g();
            Log.i("AppMetrica", "Activate AppMetrica with APIKey " + C10796U2.m27878a(lVar.apiKey));
            if (Boolean.TRUE.equals(lVar.logs)) {
                b.mo64229e();
                a.mo64229e();
                C10380Im.m26607g().mo64229e();
                C11959xm.m30860g().mo64229e();
                return;
            }
            b.mo64228d();
            a.mo64228d();
            C10380Im.m26607g().mo64228d();
            C11959xm.m30860g().mo64228d();
        } else if (b.mo64227c()) {
            b.mo64225c("Appmetrica already has been activated!");
        }
    }

    /* renamed from: b */
    public void mo61681b(boolean z) {
        this.f27774l.mo63697b().mo61681b(z);
    }

    /* renamed from: c */
    public String mo61936c() {
        return this.f27765c.mo61552b();
    }

    /* renamed from: c */
    public void mo61682c(String str, String str2) {
        this.f27774l.mo63697b().mo61682c(str, str2);
    }

    private C11550n3(Context context, C11098c1 c1Var, C10248F9 f9) {
        this(context, c1Var, f9, new C10899X(context), new C11585o3(), C10941Y.m28234g(), new C11031ab());
    }

    C11550n3(Context context, C11098c1 c1Var, C10248F9 f9, C10899X x, C11585o3 o3Var, C10941Y y, C11031ab abVar) {
        this.f27763a = context;
        this.f27764b = f9;
        Handler c = c1Var.mo61867c();
        C10797U3 a = o3Var.mo63421a(context, o3Var.mo63423a(c, this));
        this.f27767e = a;
        C11801u0 f = y.mo62502f();
        this.f27770h = f;
        C11544n2 a2 = o3Var.mo63424a(a, context, c1Var.mo61866b());
        this.f27769g = a2;
        f.mo63755a(a2);
        x.mo61945a(context);
        C10373Ii a3 = o3Var.mo63420a(context, a2, f9, c);
        this.f27765c = a3;
        this.f27772j = c1Var.mo61863a();
        this.f27771i = abVar;
        a2.mo63339a((C10434Ki) a3);
        this.f27766d = o3Var.mo63419a(a2, f9, c);
        this.f27768f = o3Var.mo63422a(context, a, a2, c, a3);
        this.f27773k = y.mo62506k();
    }

    /* renamed from: a */
    public void mo61558a(int i, Bundle bundle) {
        this.f27765c.mo61545a(bundle, (C11989yi) null);
    }

    /* renamed from: a */
    public void mo61933a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f27766d.mo61193a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void mo61932a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f27766d.mo61192a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public void mo61931a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        C11551a aVar = new C11551a(appMetricaDeviceIDListener);
        this.f27775m = aVar;
        this.f27765c.mo61546a(aVar, Collections.singletonList("appmetrica_device_id_hash"), this.f27767e.mo62329a());
    }

    /* renamed from: a */
    public C10868W0 mo61929a(C10086i iVar) {
        return this.f27768f.mo61835b(iVar);
    }

    /* renamed from: a */
    public String mo61930a() {
        return this.f27765c.mo61556e();
    }

    /* renamed from: a */
    public void mo61934a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f27765c.mo61546a(iIdentifierCallback, list, this.f27767e.mo62329a());
    }

    /* renamed from: a */
    public void mo61671a(Location location) {
        this.f27774l.mo63697b().mo61671a(location);
    }

    /* renamed from: a */
    public void mo61678a(boolean z) {
        this.f27774l.mo63697b().mo61678a(z);
    }
}
