package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.hv */
public class C13350hv implements qh0, ci0<C13250gv> {

    /* renamed from: b */
    private static final rh1<Double> f34573b = $$Lambda$hv$_yDV4bGOJaDji4gkO0vzoG5tL1A.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final rh1<Double> f34574c = $$Lambda$hv$ntA4PTga2hOyPwmdHFv1aA_CfA.INSTANCE;

    /* renamed from: d */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f34575d = C13353c.f34579b;

    /* renamed from: a */
    public final v60<f50<Double>> f34576a;

    /* renamed from: com.yandex.mobile.ads.impl.hv$a */
    static final class C13351a extends Lambda implements Function2<ly0, JSONObject, C13350hv> {

        /* renamed from: b */
        public static final C13351a f34577b = new C13351a();

        C13351a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13350hv(ly0, (C13350hv) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hv$b */
    static final class C13352b extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13352b f34578b = new C13352b();

        C13352b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44607a(jSONObject, str, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hv$c */
    static final class C13353c extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C13353c f34579b = new C13353c();

        C13353c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38513c(), C13350hv.f34574c, ly0.mo66818b(), (f50) null, (cg1) dg1.f32576d);
        }
    }

    static {
        C13352b bVar = C13352b.f34578b;
        C13351a aVar = C13351a.f34577b;
    }

    public C13350hv(ly0 ly0, C13350hv hvVar, boolean z, JSONObject jSONObject) {
        v60<f50<Double>> v60;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (hvVar == null) {
            v60 = null;
        } else {
            v60 = hvVar.f34576a;
        }
        v60<f50<f50<Double>>> b2 = di0.m35295b(jSONObject, "weight", z, v60, ky0.m38513c(), f34573b, b, ly0, dg1.f32576d);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f34576a = b2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m37112a(double d) {
        return d > 0.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m37113b(double d) {
        return d > 0.0d;
    }

    /* renamed from: b */
    public C13250gv mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C13250gv(w60.m43544d(this.f34576a, ly0, "weight", jSONObject, f34575d));
    }
}
