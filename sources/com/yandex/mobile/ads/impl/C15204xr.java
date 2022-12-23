package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.xr */
public class C15204xr implements qh0, ci0<C15102wr> {

    /* renamed from: b */
    private static final rh1<Integer> f42675b = $$Lambda$xr$z0zp7oewWMoP09OtxwhEWQWeuwU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final rh1<Integer> f42676c = $$Lambda$xr$FRD7SBkUfifH4nKIu2BswWJzg.INSTANCE;

    /* renamed from: d */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f42677d = C15207c.f42681b;

    /* renamed from: a */
    public final v60<f50<Integer>> f42678a;

    /* renamed from: com.yandex.mobile.ads.impl.xr$a */
    static final class C15205a extends Lambda implements Function2<ly0, JSONObject, C15204xr> {

        /* renamed from: b */
        public static final C15205a f42679b = new C15205a();

        C15205a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C15204xr(ly0, (C15204xr) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xr$b */
    static final class C15206b extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C15206b f42680b = new C15206b();

        C15206b() {
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

    /* renamed from: com.yandex.mobile.ads.impl.xr$c */
    static final class C15207c extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C15207c f42681b = new C15207c();

        C15207c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            f50 a = zh0.m44600a(jSONObject, str, (Function1) ky0.m38514d(), C15204xr.f42676c, ly0.mo66818b(), (cg1) dg1.f32574b);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, key…er, env, TYPE_HELPER_INT)");
            return a;
        }
    }

    static {
        C15206b bVar = C15206b.f42680b;
        C15205a aVar = C15205a.f42679b;
    }

    public C15204xr(ly0 ly0, C15204xr xrVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (xrVar == null) {
            v60 = null;
        } else {
            v60 = xrVar.f42678a;
        }
        v60<f50<f50<Integer>>> a = di0.m35284a(jSONObject, "value", z, v60, ky0.m38514d(), f42675b, b, ly0, dg1.f32574b);
        Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(…er, env, TYPE_HELPER_INT)");
        this.f42678a = a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m44110a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m44111b(int i) {
        return i >= 0;
    }

    /* renamed from: b */
    public C15102wr mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C15102wr(w60.m43541b(this.f42678a, ly0, "value", jSONObject, f42677d));
    }
}
