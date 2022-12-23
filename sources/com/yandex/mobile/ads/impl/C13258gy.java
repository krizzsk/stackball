package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.gy */
public class C13258gy implements qh0, ci0<C13148fy> {

    /* renamed from: b */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f34168b = C13259a.f34170b;

    /* renamed from: a */
    public final v60<f50<Integer>> f34169a;

    /* renamed from: com.yandex.mobile.ads.impl.gy$a */
    static final class C13259a extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C13259a f34170b = new C13259a();

        C13259a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            f50<Integer> a = zh0.m44598a(jSONObject, str, ky0.m38515e(), ly0.mo66818b(), ly0, dg1.f32578f);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, key…, env, TYPE_HELPER_COLOR)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gy$b */
    static final class C13260b extends Lambda implements Function2<ly0, JSONObject, C13258gy> {

        /* renamed from: b */
        public static final C13260b f34171b = new C13260b();

        C13260b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13258gy(ly0, (C13258gy) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gy$c */
    static final class C13261c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13261c f34172b = new C13261c();

        C13261c() {
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

    static {
        C13261c cVar = C13261c.f34172b;
        C13260b bVar = C13260b.f34171b;
    }

    public C13258gy(ly0 ly0, C13258gy gyVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (gyVar == null) {
            v60 = null;
        } else {
            v60 = gyVar.f34169a;
        }
        v60<f50<f50<Integer>>> a = di0.m35282a(jSONObject, "color", z, v60, ky0.m38515e(), b, ly0, dg1.f32578f);
        Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(…, env, TYPE_HELPER_COLOR)");
        this.f34169a = a;
    }

    /* renamed from: b */
    public C13148fy mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C13148fy(w60.m43541b(this.f34169a, ly0, "color", jSONObject, f34168b));
    }
}
