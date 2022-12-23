package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.kw */
public class C13789kw implements qh0, ci0<C13590jw> {

    /* renamed from: b */
    public static final C13793d f36430b = new C13793d((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final rh1<Double> f36431c = $$Lambda$kw$vnhssUTD3reZk34tZ49O8bz2OEA.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<Double> f36432d = $$Lambda$kw$Qwnz8qRsZIuaS6erOsLbVZDoxcQ.INSTANCE;

    /* renamed from: e */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f36433e = C13792c.f36438b;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Function2<ly0, JSONObject, C13789kw> f36434f = C13790a.f36436b;

    /* renamed from: a */
    public final v60<f50<Double>> f36435a;

    /* renamed from: com.yandex.mobile.ads.impl.kw$a */
    static final class C13790a extends Lambda implements Function2<ly0, JSONObject, C13789kw> {

        /* renamed from: b */
        public static final C13790a f36436b = new C13790a();

        C13790a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13789kw(ly0, (C13789kw) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kw$b */
    static final class C13791b extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13791b f36437b = new C13791b();

        C13791b() {
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

    /* renamed from: com.yandex.mobile.ads.impl.kw$c */
    static final class C13792c extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C13792c f36438b = new C13792c();

        C13792c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            f50 a = zh0.m44600a(jSONObject, str, (Function1) ky0.m38513c(), C13789kw.f36432d, ly0.mo66818b(), (cg1) dg1.f32576d);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, key… env, TYPE_HELPER_DOUBLE)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kw$d */
    public static final class C13793d {
        private C13793d() {
        }

        public /* synthetic */ C13793d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C13789kw> mo68278a() {
            return C13789kw.f36434f;
        }
    }

    static {
        C13791b bVar = C13791b.f36437b;
    }

    public C13789kw(ly0 ly0, C13789kw kwVar, boolean z, JSONObject jSONObject) {
        v60<f50<Double>> v60;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (kwVar == null) {
            v60 = null;
        } else {
            v60 = kwVar.f36435a;
        }
        v60<f50<f50<Double>>> a = di0.m35284a(jSONObject, "value", z, v60, ky0.m38513c(), f36431c, b, ly0, dg1.f32576d);
        Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(… env, TYPE_HELPER_DOUBLE)");
        this.f36435a = a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38501a(double d) {
        return d > 0.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38503b(double d) {
        return d > 0.0d;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C13590jw(w60.m43541b(this.f36435a, ly0, "value", jSONObject, f36433e));
    }
}
