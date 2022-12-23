package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C12927dx;
import com.yandex.mobile.ads.impl.C15405zy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.fx */
public class C13142fx implements qh0, ci0<C13013ex> {

    /* renamed from: d */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f33762d = C13143a.f33768b;

    /* renamed from: e */
    private static final Function3<String, JSONObject, ly0, C12927dx> f33763e = C13145c.f33770b;

    /* renamed from: f */
    private static final Function3<String, JSONObject, ly0, C15405zy> f33764f = C13146d.f33771b;

    /* renamed from: a */
    public final v60<f50<Integer>> f33765a;

    /* renamed from: b */
    public final v60<C13254gx> f33766b;

    /* renamed from: c */
    public final v60<C12460az> f33767c;

    /* renamed from: com.yandex.mobile.ads.impl.fx$a */
    static final class C13143a extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C13143a f33768b = new C13143a();

        C13143a() {
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

    /* renamed from: com.yandex.mobile.ads.impl.fx$b */
    static final class C13144b extends Lambda implements Function2<ly0, JSONObject, C13142fx> {

        /* renamed from: b */
        public static final C13144b f33769b = new C13144b();

        C13144b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13142fx(ly0, (C13142fx) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fx$c */
    static final class C13145c extends Lambda implements Function3<String, JSONObject, ly0, C12927dx> {

        /* renamed from: b */
        public static final C13145c f33770b = new C13145c();

        C13145c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C12927dx.C12929b bVar = C12927dx.f32794a;
            Object a = zh0.m44612a(jSONObject, str, C12927dx.f32795b, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, DivShape.CREATOR, env.logger, env)");
            return (C12927dx) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fx$d */
    static final class C13146d extends Lambda implements Function3<String, JSONObject, ly0, C15405zy> {

        /* renamed from: b */
        public static final C13146d f33771b = new C13146d();

        C13146d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C15405zy.C15408c cVar = C15405zy.f43497d;
            return (C15405zy) zh0.m44622b(jSONObject, str, C15405zy.f43502i, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fx$e */
    static final class C13147e extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13147e f33772b = new C13147e();

        C13147e() {
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
        C13147e eVar = C13147e.f33772b;
        C13144b bVar = C13144b.f33769b;
    }

    public C13142fx(ly0 ly0, C13142fx fxVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        v60<C13254gx> v602;
        v60<C12460az> v603;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (fxVar == null) {
            v60 = null;
        } else {
            v60 = fxVar.f33765a;
        }
        v60<f50<f50<Integer>>> a = di0.m35282a(jSONObject, "color", z, v60, ky0.m38515e(), b, ly0, dg1.f32578f);
        Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(…, env, TYPE_HELPER_COLOR)");
        this.f33765a = a;
        if (fxVar == null) {
            v602 = null;
        } else {
            v602 = fxVar.f33766b;
        }
        v60<C13254gx> a2 = di0.m35286a(jSONObject, "shape", z, v602, C13254gx.f34162a.mo67359a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a2, "readField(json, \"shape\",…ate.CREATOR, logger, env)");
        this.f33766b = a2;
        if (fxVar == null) {
            v603 = null;
        } else {
            v603 = fxVar.f33767c;
        }
        v60<C12460az> b2 = di0.m35297b(jSONObject, "stroke", z, v603, C12460az.f30840d.mo65922a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f33767c = b2;
    }

    /* renamed from: b */
    public C13013ex mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C13013ex(w60.m43541b(this.f33765a, ly0, "color", jSONObject, f33762d), (C12927dx) w60.m43546f(this.f33766b, ly0, "shape", jSONObject, f33763e), (C15405zy) w60.m43545e(this.f33767c, ly0, "stroke", jSONObject, f33764f));
    }
}
