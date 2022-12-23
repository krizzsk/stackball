package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C13794kx;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.zr */
public class C15347zr implements qh0, ci0<C15266yr> {

    /* renamed from: c */
    public static final C15353f f43304c = new C15353f((DefaultConstructorMarker) null);

    /* renamed from: d */
    private static final f50<C13794kx> f43305d = f50.f33229a.mo66929a(C13794kx.DP);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final cg1<C13794kx> f43306e = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13794kx.values()), C15349b.f43315b);

    /* renamed from: f */
    private static final rh1<Integer> f43307f = $$Lambda$zr$3pbw3ZgMO7tvgJ57V36czbLzwuM.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final rh1<Integer> f43308g = $$Lambda$zr$hal3Jskv_CJxRT39rsDtbvoYqhY.INSTANCE;

    /* renamed from: h */
    private static final Function3<String, JSONObject, ly0, f50<C13794kx>> f43309h = C15351d.f43317b;

    /* renamed from: i */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f43310i = C15352e.f43318b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Function2<ly0, JSONObject, C15347zr> f43311j = C15348a.f43314b;

    /* renamed from: a */
    public final v60<f50<C13794kx>> f43312a;

    /* renamed from: b */
    public final v60<f50<Integer>> f43313b;

    /* renamed from: com.yandex.mobile.ads.impl.zr$a */
    static final class C15348a extends Lambda implements Function2<ly0, JSONObject, C15347zr> {

        /* renamed from: b */
        public static final C15348a f43314b = new C15348a();

        C15348a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C15347zr(ly0, (C15347zr) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zr$b */
    static final class C15349b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C15349b f43315b = new C15349b();

        C15349b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13794kx);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zr$c */
    static final class C15350c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C15350c f43316b = new C15350c();

        C15350c() {
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

    /* renamed from: com.yandex.mobile.ads.impl.zr$d */
    static final class C15351d extends Lambda implements Function3<String, JSONObject, ly0, f50<C13794kx>> {

        /* renamed from: b */
        public static final C15351d f43317b = new C15351d();

        C15351d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C13794kx.C13796b bVar = C13794kx.f36440c;
            return zh0.m44621b(jSONObject, str, C13794kx.f36441d, ly0.mo66818b(), ly0, C15347zr.f43306e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zr$e */
    static final class C15352e extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C15352e f43318b = new C15352e();

        C15352e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            f50 a = zh0.m44600a(jSONObject, str, (Function1) ky0.m38514d(), C15347zr.f43308g, ly0.mo66818b(), (cg1) dg1.f32574b);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, key…er, env, TYPE_HELPER_INT)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zr$f */
    public static final class C15353f {
        private C15353f() {
        }

        public /* synthetic */ C15353f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C15347zr> mo71278a() {
            return C15347zr.f43311j;
        }
    }

    static {
        C15350c cVar = C15350c.f43316b;
    }

    public C15347zr(ly0 ly0, C15347zr zrVar, boolean z, JSONObject jSONObject) {
        v60<f50<C13794kx>> v60;
        v60<f50<Integer>> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (zrVar == null) {
            v60 = null;
        } else {
            v60 = zrVar.f43312a;
        }
        v60<f50<f50<C13794kx>>> b2 = di0.m35293b(jSONObject, "unit", z, v60, C13794kx.f36440c.mo68280a(), b, ly0, f43306e);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…r, env, TYPE_HELPER_UNIT)");
        this.f43312a = b2;
        if (zrVar == null) {
            v602 = null;
        } else {
            v602 = zrVar.f43313b;
        }
        v60<f50<f50<Integer>>> a = di0.m35284a(jSONObject, "value", z, v602, ky0.m38514d(), f43307f, b, ly0, dg1.f32574b);
        Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(…er, env, TYPE_HELPER_INT)");
        this.f43313b = a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m44773a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m44775b(int i) {
        return i >= 0;
    }

    /* renamed from: b */
    public C15266yr mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<C13794kx> f50 = (f50) w60.m43543c(this.f43312a, ly0, "unit", jSONObject, f43309h);
        if (f50 == null) {
            f50 = f43305d;
        }
        return new C15266yr(f50, w60.m43541b(this.f43313b, ly0, "value", jSONObject, f43310i));
    }
}
