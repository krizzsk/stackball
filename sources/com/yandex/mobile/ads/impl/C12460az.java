package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C13794kx;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.az */
public class C12460az implements qh0, ci0<C15405zy> {

    /* renamed from: d */
    public static final C12466f f30840d = new C12466f((DefaultConstructorMarker) null);

    /* renamed from: e */
    private static final f50<C13794kx> f30841e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final f50<Integer> f30842f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final cg1<C13794kx> f30843g = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13794kx.values()), C12463c.f30855b);

    /* renamed from: h */
    private static final rh1<Integer> f30844h = $$Lambda$az$X0eBOwMoUy_UOUuqfg2fH82r1s8.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final rh1<Integer> f30845i = $$Lambda$az$4zS5c70CJi7kifRFLK3Na33Muo.INSTANCE;

    /* renamed from: j */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f30846j = C12461a.f30853b;

    /* renamed from: k */
    private static final Function3<String, JSONObject, ly0, f50<C13794kx>> f30847k = C12464d.f30856b;

    /* renamed from: l */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f30848l = C12465e.f30857b;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Function2<ly0, JSONObject, C12460az> f30849m = C12462b.f30854b;

    /* renamed from: a */
    public final v60<f50<Integer>> f30850a;

    /* renamed from: b */
    public final v60<f50<C13794kx>> f30851b;

    /* renamed from: c */
    public final v60<f50<Integer>> f30852c;

    /* renamed from: com.yandex.mobile.ads.impl.az$a */
    static final class C12461a extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C12461a f30853b = new C12461a();

        C12461a() {
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

    /* renamed from: com.yandex.mobile.ads.impl.az$b */
    static final class C12462b extends Lambda implements Function2<ly0, JSONObject, C12460az> {

        /* renamed from: b */
        public static final C12462b f30854b = new C12462b();

        C12462b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C12460az(ly0, (C12460az) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.az$c */
    static final class C12463c extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C12463c f30855b = new C12463c();

        C12463c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13794kx);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.az$d */
    static final class C12464d extends Lambda implements Function3<String, JSONObject, ly0, f50<C13794kx>> {

        /* renamed from: b */
        public static final C12464d f30856b = new C12464d();

        C12464d() {
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
            return zh0.m44621b(jSONObject, str, C13794kx.f36441d, ly0.mo66818b(), ly0, C12460az.f30843g);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.az$e */
    static final class C12465e extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C12465e f30857b = new C12465e();

        C12465e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C12460az.f30845i, ly0.mo66818b(), C12460az.f30842f, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.az$f */
    public static final class C12466f {
        private C12466f() {
        }

        public /* synthetic */ C12466f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C12460az> mo65922a() {
            return C12460az.f30849m;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f30841e = aVar.mo66929a(C13794kx.DP);
        f30842f = aVar.mo66929a(1);
    }

    public C12460az(ly0 ly0, C12460az azVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        v60<f50<C13794kx>> v602;
        v60<f50<Integer>> v603;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (azVar == null) {
            v60 = null;
        } else {
            v60 = azVar.f30850a;
        }
        v60<f50<f50<Integer>>> a = di0.m35282a(jSONObject, "color", z, v60, ky0.m38515e(), b, ly0, dg1.f32578f);
        Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(…, env, TYPE_HELPER_COLOR)");
        this.f30850a = a;
        if (azVar == null) {
            v602 = null;
        } else {
            v602 = azVar.f30851b;
        }
        v60<f50<f50<C13794kx>>> b2 = di0.m35293b(jSONObject, "unit", z, v602, C13794kx.f36440c.mo68280a(), b, ly0, f30843g);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…r, env, TYPE_HELPER_UNIT)");
        this.f30851b = b2;
        if (azVar == null) {
            v603 = null;
        } else {
            v603 = azVar.f30852c;
        }
        v60<f50<f50<Integer>>> b3 = di0.m35295b(jSONObject, "width", z, v603, ky0.m38514d(), f30844h, b, ly0, dg1.f32574b);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f30852c = b3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m33966a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m33968b(int i) {
        return i >= 0;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<T> b = w60.m43541b(this.f30850a, ly0, "color", jSONObject, f30846j);
        f50<C13794kx> f50 = (f50) w60.m43543c(this.f30851b, ly0, "unit", jSONObject, f30847k);
        if (f50 == null) {
            f50 = f30841e;
        }
        f50<Integer> d = w60.m43544d(this.f30852c, ly0, "width", jSONObject, f30848l);
        if (d == null) {
            d = f30842f;
        }
        return new C15405zy(b, f50, d);
    }
}
