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

/* renamed from: com.yandex.mobile.ads.impl.fr */
public class C13104fr implements qh0, ci0<C12992er> {

    /* renamed from: c */
    public static final C13109e f33574c = new C13109e((DefaultConstructorMarker) null);

    /* renamed from: d */
    private static final f50<C13794kx> f33575d = f50.f33229a.mo66929a(C13794kx.DP);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final cg1<C13794kx> f33576e = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13794kx.values()), C13106b.f33583b);

    /* renamed from: f */
    private static final Function3<String, JSONObject, ly0, f50<C13794kx>> f33577f = C13107c.f33584b;

    /* renamed from: g */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f33578g = C13108d.f33585b;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Function2<ly0, JSONObject, C13104fr> f33579h = C13105a.f33582b;

    /* renamed from: a */
    public final v60<f50<C13794kx>> f33580a;

    /* renamed from: b */
    public final v60<f50<Double>> f33581b;

    /* renamed from: com.yandex.mobile.ads.impl.fr$a */
    static final class C13105a extends Lambda implements Function2<ly0, JSONObject, C13104fr> {

        /* renamed from: b */
        public static final C13105a f33582b = new C13105a();

        C13105a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13104fr(ly0, (C13104fr) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fr$b */
    static final class C13106b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13106b f33583b = new C13106b();

        C13106b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13794kx);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fr$c */
    static final class C13107c extends Lambda implements Function3<String, JSONObject, ly0, f50<C13794kx>> {

        /* renamed from: b */
        public static final C13107c f33584b = new C13107c();

        C13107c() {
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
            return zh0.m44621b(jSONObject, str, C13794kx.f36441d, ly0.mo66818b(), ly0, C13104fr.f33576e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fr$d */
    static final class C13108d extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C13108d f33585b = new C13108d();

        C13108d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            f50<Double> a = zh0.m44598a(jSONObject, str, ky0.m38513c(), ly0.mo66818b(), ly0, dg1.f32576d);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, key… env, TYPE_HELPER_DOUBLE)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fr$e */
    public static final class C13109e {
        private C13109e() {
        }

        public /* synthetic */ C13109e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C13104fr> mo67068a() {
            return C13104fr.f33579h;
        }
    }

    public C13104fr(ly0 ly0, C13104fr frVar, boolean z, JSONObject jSONObject) {
        v60<f50<C13794kx>> v60;
        v60<f50<Double>> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (frVar == null) {
            v60 = null;
        } else {
            v60 = frVar.f33580a;
        }
        v60<f50<f50<C13794kx>>> b2 = di0.m35293b(jSONObject, "unit", z, v60, C13794kx.f36440c.mo68280a(), b, ly0, f33576e);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…r, env, TYPE_HELPER_UNIT)");
        this.f33580a = b2;
        if (frVar == null) {
            v602 = null;
        } else {
            v602 = frVar.f33581b;
        }
        v60<f50<f50<Double>>> a = di0.m35282a(jSONObject, "value", z, v602, ky0.m38513c(), b, ly0, dg1.f32576d);
        Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(… env, TYPE_HELPER_DOUBLE)");
        this.f33581b = a;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<C13794kx> f50 = (f50) w60.m43543c(this.f33580a, ly0, "unit", jSONObject, f33577f);
        if (f50 == null) {
            f50 = f33575d;
        }
        return new C12992er(f50, w60.m43541b(this.f33581b, ly0, "value", jSONObject, f33578g));
    }
}
