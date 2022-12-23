package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Pair;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p265ob.C11576o2;
import com.yandex.metrica.rtm.wrapper.C12060k;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.n2 */
public class C11544n2 implements C10975Z0 {

    /* renamed from: a */
    private final Context f27747a;

    /* renamed from: b */
    private C11928x1 f27748b;

    /* renamed from: c */
    private C11729s1 f27749c;

    /* renamed from: d */
    private final C11058b0 f27750d;

    /* renamed from: e */
    private C10434Ki f27751e;

    /* renamed from: f */
    private final C11937x7 f27752f;

    /* renamed from: g */
    private final C11135d7 f27753g;

    /* renamed from: h */
    private final C11576o2 f27754h = new C11576o2(this);

    /* renamed from: com.yandex.metrica.impl.ob.n2$a */
    class C11545a implements C11576o2.C11581e {

        /* renamed from: a */
        final /* synthetic */ Map f27755a;

        /* renamed from: b */
        final /* synthetic */ C11414k2 f27756b;

        C11545a(Map map, C11414k2 k2Var) {
            this.f27755a = map;
            this.f27756b = k2Var;
        }

        /* renamed from: a */
        public C11411k0 mo63364a(C11411k0 k0Var) {
            C11544n2 n2Var = C11544n2.this;
            C11411k0 f = k0Var.mo62216f(C11993ym.m30997g(this.f27755a));
            C11414k2 k2Var = this.f27756b;
            n2Var.getClass();
            if (C10385J0.m26648f(f.f27302e)) {
                f.mo63148c(k2Var.f27371c.mo61413a());
            }
            return f;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$b */
    class C11546b implements C11576o2.C11581e {

        /* renamed from: a */
        final /* synthetic */ C11042ag f27758a;

        C11546b(C11544n2 n2Var, C11042ag agVar) {
            this.f27758a = agVar;
        }

        /* renamed from: a */
        public C11411k0 mo63364a(C11411k0 k0Var) {
            return k0Var.mo62216f(new String(Base64.encode(C11169e.m28804a((C11169e) this.f27758a), 0)));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$c */
    class C11547c implements C11576o2.C11581e {

        /* renamed from: a */
        final /* synthetic */ String f27759a;

        C11547c(C11544n2 n2Var, String str) {
            this.f27759a = str;
        }

        /* renamed from: a */
        public C11411k0 mo63364a(C11411k0 k0Var) {
            return k0Var.mo62216f(this.f27759a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$d */
    class C11548d implements C11576o2.C11581e {

        /* renamed from: a */
        final /* synthetic */ C11670q2 f27760a;

        C11548d(C11544n2 n2Var, C11670q2 q2Var) {
            this.f27760a = q2Var;
        }

        /* renamed from: a */
        public C11411k0 mo63364a(C11411k0 k0Var) {
            Pair<byte[], Integer> a = this.f27760a.mo63527a();
            C11411k0 f = k0Var.mo62216f(new String(Base64.encode((byte[]) a.first, 0)));
            f.f27305h = ((Integer) a.second).intValue();
            return f;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$e */
    class C11549e implements C11576o2.C11581e {

        /* renamed from: a */
        final /* synthetic */ C11786tb f27761a;

        C11549e(C11544n2 n2Var, C11786tb tbVar) {
            this.f27761a = tbVar;
        }

        /* renamed from: a */
        public C11411k0 mo63364a(C11411k0 k0Var) {
            C11411k0 f = k0Var.mo62216f(C10823V0.m27963a(C11169e.m28804a((C11169e) this.f27761a.f28287a)));
            f.f27305h = this.f27761a.f28288b.mo61250a();
            return f;
        }
    }

    C11544n2(C10797U3 u3, Context context, C11928x1 x1Var, C11937x7 x7Var, C11135d7 d7Var) {
        this.f27748b = x1Var;
        this.f27747a = context;
        this.f27750d = new C11058b0(u3);
        this.f27752f = x7Var;
        this.f27753g = d7Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63344a(C11729s1 s1Var) {
        this.f27749c = s1Var;
    }

    /* renamed from: b */
    public void mo63354b(C11414k2 k2Var) {
        C10640Pe pe = k2Var.f27372d;
        String e = k2Var.mo63176e();
        C10380Im a = m29817a(k2Var);
        List<Integer> list = C10385J0.f24953i;
        JSONObject jSONObject = new JSONObject();
        if (pe != null) {
            pe.mo61925a(jSONObject);
        }
        mo63341a(new C10734S(jSONObject.toString(), "", C11413k1.EVENT_TYPE_ACTIVATION.mo63170b(), 0, a).mo62214d(e), k2Var);
    }

    /* renamed from: c */
    public void mo63359c(C11414k2 k2Var) {
        C11411k0 k0Var = new C11411k0();
        k0Var.f27302e = C11413k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED.mo63170b();
        m29818a(new C11576o2.C11582f(k0Var, k2Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo63360d() {
        this.f27748b.mo64061g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo63361e() {
        this.f27748b.mo64060f();
    }

    /* renamed from: f */
    public void mo63362f() {
        this.f27748b.mo64054a();
    }

    /* renamed from: g */
    public void mo63363g() {
        this.f27748b.mo64057c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63339a(C10434Ki ki) {
        this.f27751e = ki;
        this.f27750d.mo63171a(ki);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63345a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (C10796U2.m27891a((Object) bool)) {
            this.f27750d.mo62272b().mo60800b(bool.booleanValue());
        }
        if (C10796U2.m27891a((Object) bool2)) {
            this.f27750d.mo62272b().mo60802c(bool2.booleanValue());
        }
        if (C10796U2.m27891a((Object) bool3)) {
            this.f27750d.mo62272b().mo60797a(bool3.booleanValue());
        }
        C11411k0 k0Var = new C11411k0();
        k0Var.f27302e = C11413k1.EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG.mo63170b();
        mo63341a(k0Var, (C11414k2) this.f27750d);
    }

    /* renamed from: c */
    public C11928x1 mo63358c() {
        return this.f27748b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63347a(String str, C11414k2 k2Var) {
        byte[] bArr;
        try {
            C11937x7 x7Var = this.f27752f;
            if (str == null) {
                bArr = new byte[0];
            } else {
                bArr = str.getBytes("UTF-8");
            }
            mo63341a(C10385J0.m26644c(C10823V0.m27963a(C11169e.m28804a((C11169e) x7Var.mo61050b(new C10451L7(bArr, new C10422K7(C10590O7.USER, (String) null))))), m29817a(k2Var)), k2Var);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* renamed from: a */
    public Future<Void> mo63335a(C11411k0 k0Var, C11414k2 k2Var, Map<String, Object> map) {
        C11413k1 k1Var = C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        this.f27748b.mo64060f();
        C11576o2.C11582f fVar = new C11576o2.C11582f(k0Var, k2Var);
        if (!C10796U2.m27897b((Map) map)) {
            fVar.mo63411a((C11576o2.C11581e) new C11545a(map, k2Var));
        }
        return m29818a(fVar);
    }

    /* renamed from: a */
    public Future<Void> mo63334a(C10797U3 u3) {
        return this.f27754h.queuePauseUserSession(u3);
    }

    /* renamed from: a */
    public void mo63350a(List<String> list, ResultReceiver resultReceiver, Map<String, String> map) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.IdentifiersData", new C11222f1(list, map, resultReceiver));
        C11413k1 k1Var = C11413k1.EVENT_TYPE_STARTUP;
        int i = C12038zm.f28923e;
        C10380Im g = C10380Im.m26607g();
        List<Integer> list2 = C10385J0.f24953i;
        mo63341a(new C10734S("", "", k1Var.mo63170b(), 0, g).mo63147c(bundle), (C11414k2) this.f27750d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63341a(C11411k0 k0Var, C11414k2 k2Var) {
        if (C10385J0.m26648f(k0Var.f27302e)) {
            k0Var.mo63148c(k2Var.f27371c.mo61413a());
        }
        mo63335a(k0Var, k2Var, (Map<String, Object>) null);
    }

    /* renamed from: a */
    public void mo63338a(C10314Gg gg) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver", gg);
        int i = C12038zm.f28923e;
        C10380Im g = C10380Im.m26607g();
        List<Integer> list = C10385J0.f24953i;
        mo63341a(new C10734S("", "", C11413k1.EVENT_TYPE_REQUEST_REFERRER.mo63170b(), 0, g).mo63147c(bundle), (C11414k2) this.f27750d);
    }

    /* renamed from: b */
    public Future<Void> mo63353b(C10797U3 u3) {
        return this.f27754h.queueResumeUserSession(u3);
    }

    /* renamed from: b */
    public void mo63356b(String str) {
        this.f27750d.mo62271a().mo62335b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63355b(C11624p7 p7Var, C11414k2 k2Var) {
        this.f27748b.mo64060f();
        m29818a(this.f27753g.mo62746a(p7Var, k2Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63357b(String str, C11414k2 k2Var) {
        m29818a(new C11576o2.C11582f(C10734S.m27654a(str, m29817a(k2Var)), k2Var).mo63411a((C11576o2.C11581e) new C11547c(this, str)));
    }

    /* renamed from: b */
    public C12060k mo63352b() {
        return this.f27754h;
    }

    /* renamed from: a */
    public void mo63349a(List<String> list) {
        this.f27750d.mo62271a().mo62331a(list);
    }

    /* renamed from: a */
    public void mo63351a(Map<String, String> map) {
        this.f27750d.mo62271a().mo62332a(map);
    }

    /* renamed from: a */
    public void mo63346a(String str) {
        this.f27750d.mo62271a().mo62330a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63342a(C11624p7 p7Var, C11414k2 k2Var) {
        this.f27748b.mo64060f();
        C11576o2.C11582f a = this.f27753g.mo62746a(p7Var, k2Var);
        a.mo63410a().mo63171a(this.f27751e);
        this.f27754h.sendCrash(a);
    }

    /* renamed from: a */
    public void mo63348a(String str, String str2, C11414k2 k2Var) {
        C11411k0 k0Var = new C11411k0();
        k0Var.f27302e = C11413k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED.mo63170b();
        m29818a(new C11576o2.C11582f(k0Var.mo63143a(str, str2), k2Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63340a(C11042ag agVar, C11414k2 k2Var) {
        C11411k0 k0Var = new C11411k0();
        k0Var.f27302e = C11413k1.EVENT_TYPE_SEND_USER_PROFILE.mo63170b();
        m29818a(new C11576o2.C11582f(k0Var, k2Var).mo63411a((C11576o2.C11581e) new C11546b(this, agVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63343a(C11670q2 q2Var, C11414k2 k2Var) {
        C10734S s = new C10734S(m29817a(k2Var));
        s.f27302e = C11413k1.EVENT_TYPE_SEND_REVENUE_EVENT.mo63170b();
        m29818a(new C11576o2.C11582f(s, k2Var).mo63411a((C11576o2.C11581e) new C11548d(this, q2Var)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63337a(C10250Fb fb, C11414k2 k2Var) {
        for (C11786tb<C10705Rf, C10265Fn> eVar : fb.toProto()) {
            C10734S s = new C10734S(m29817a(k2Var));
            s.f27302e = C11413k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT.mo63170b();
            m29818a(new C11576o2.C11582f(s, k2Var).mo63411a((C11576o2.C11581e) new C11549e(this, eVar)));
        }
    }

    /* renamed from: a */
    public void mo63336a(IMetricaService iMetricaService, C11411k0 k0Var, C11414k2 k2Var) throws RemoteException {
        iMetricaService.reportData(k0Var.mo63144b(k2Var.mo63174c()));
        C11729s1 s1Var = this.f27749c;
        if (s1Var == null || s1Var.f24932b.mo62678f()) {
            this.f27748b.mo64061g();
        }
    }

    /* renamed from: a */
    private Future<Void> m29818a(C11576o2.C11582f fVar) {
        fVar.mo63410a().mo63171a(this.f27751e);
        return this.f27754h.queueReport(fVar);
    }

    /* renamed from: a */
    public Context mo63333a() {
        return this.f27747a;
    }

    /* renamed from: a */
    private C10380Im m29817a(C11414k2 k2Var) {
        return C12038zm.m31087b(k2Var.mo62272b().mo60794a());
    }
}
