package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C13525jn;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.vr */
public class C14907vr implements qh0, ci0<C14777ur> {

    /* renamed from: e */
    public static final C14915h f41376e = new C14915h((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final f50<Double> f41377f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Integer> f41378g;

    /* renamed from: h */
    private static final f50<C13525jn> f41379h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<Integer> f41380i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final cg1<C13525jn> f41381j = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13525jn.values()), C14913f.f41402b);

    /* renamed from: k */
    private static final rh1<Double> f41382k = $$Lambda$vr$phKNmMQE_qXmK_BZ34GXP_roWZo.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final rh1<Double> f41383l = $$Lambda$vr$x1qnVl613GffVxu3wuudsqqUgA.INSTANCE;

    /* renamed from: m */
    private static final rh1<Integer> f41384m = $$Lambda$vr$Oidgr0QbtBri5CgNABbrXA1GsdQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final rh1<Integer> f41385n = $$Lambda$vr$MEP6eWw6wEnDiaiTQy_2crNAr6c.INSTANCE;

    /* renamed from: o */
    private static final rh1<Integer> f41386o = $$Lambda$vr$lOgkNUIZfiR7dCk31lUx3tYP3dk.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final rh1<Integer> f41387p = $$Lambda$vr$gaUkQqHZ6znwqWh1izzZHMg2Go.INSTANCE;

    /* renamed from: q */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f41388q = C14908a.f41397b;

    /* renamed from: r */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f41389r = C14910c.f41399b;

    /* renamed from: s */
    private static final Function3<String, JSONObject, ly0, f50<C13525jn>> f41390s = C14911d.f41400b;

    /* renamed from: t */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f41391t = C14912e.f41401b;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final Function2<ly0, JSONObject, C14907vr> f41392u = C14909b.f41398b;

    /* renamed from: a */
    public final v60<f50<Double>> f41393a;

    /* renamed from: b */
    public final v60<f50<Integer>> f41394b;

    /* renamed from: c */
    public final v60<f50<C13525jn>> f41395c;

    /* renamed from: d */
    public final v60<f50<Integer>> f41396d;

    /* renamed from: com.yandex.mobile.ads.impl.vr$a */
    static final class C14908a extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C14908a f41397b = new C14908a();

        C14908a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38513c(), C14907vr.f41383l, ly0.mo66818b(), C14907vr.f41377f, (cg1) dg1.f32576d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr$b */
    static final class C14909b extends Lambda implements Function2<ly0, JSONObject, C14907vr> {

        /* renamed from: b */
        public static final C14909b f41398b = new C14909b();

        C14909b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14907vr(ly0, (C14907vr) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr$c */
    static final class C14910c extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14910c f41399b = new C14910c();

        C14910c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14907vr.f41385n, ly0.mo66818b(), C14907vr.f41378g, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr$d */
    static final class C14911d extends Lambda implements Function3<String, JSONObject, ly0, f50<C13525jn>> {

        /* renamed from: b */
        public static final C14911d f41400b = new C14911d();

        C14911d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C13525jn.C13527b bVar = C13525jn.f35400c;
            return zh0.m44621b(jSONObject, str, C13525jn.f35401d, ly0.mo66818b(), ly0, C14907vr.f41381j);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr$e */
    static final class C14912e extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14912e f41401b = new C14912e();

        C14912e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14907vr.f41387p, ly0.mo66818b(), C14907vr.f41380i, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr$f */
    static final class C14913f extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14913f f41402b = new C14913f();

        C14913f() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13525jn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vr$g */
    static final class C14914g extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C14914g f41403b = new C14914g();

        C14914g() {
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

    /* renamed from: com.yandex.mobile.ads.impl.vr$h */
    public static final class C14915h {
        private C14915h() {
        }

        public /* synthetic */ C14915h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14907vr> mo70519a() {
            return C14907vr.f41392u;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f41377f = aVar.mo66929a(Double.valueOf(0.0d));
        f41378g = aVar.mo66929a(200);
        f41379h = aVar.mo66929a(C13525jn.EASE_IN_OUT);
        f41380i = aVar.mo66929a(0);
        C14914g gVar = C14914g.f41403b;
    }

    public C14907vr(ly0 ly0, C14907vr vrVar, boolean z, JSONObject jSONObject) {
        v60<f50<Double>> v60;
        v60<f50<Integer>> v602;
        v60<f50<C13525jn>> v603;
        v60<f50<Integer>> v604;
        C14907vr vrVar2 = vrVar;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (vrVar2 == null) {
            v60 = null;
        } else {
            v60 = vrVar2.f41393a;
        }
        v60<f50<f50<Double>>> b2 = di0.m35295b(jSONObject, "alpha", z, v60, ky0.m38513c(), f41382k, b, ly0, dg1.f32576d);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f41393a = b2;
        if (vrVar2 == null) {
            v602 = null;
        } else {
            v602 = vrVar2.f41394b;
        }
        Function1<Number, Integer> d = ky0.m38514d();
        rh1<Integer> rh1 = f41384m;
        cg1<Integer> cg1 = dg1.f32574b;
        v60<f50<f50<Integer>>> b3 = di0.m35295b(jSONObject, "duration", z, v602, d, rh1, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41394b = b3;
        if (vrVar2 == null) {
            v603 = null;
        } else {
            v603 = vrVar2.f41395c;
        }
        v60<f50<f50<C13525jn>>> b4 = di0.m35293b(jSONObject, "interpolator", z, v603, C13525jn.f35400c.mo68068a(), b, ly0, f41381j);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp…TYPE_HELPER_INTERPOLATOR)");
        this.f41395c = b4;
        if (vrVar2 == null) {
            v604 = null;
        } else {
            v604 = vrVar2.f41396d;
        }
        v60<f50<f50<Integer>>> b5 = di0.m35295b(jSONObject, "start_delay", z, v604, ky0.m38514d(), f41386o, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f41396d = b5;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m43195a(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m43196a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m43198b(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m43199b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m43201c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m43203d(int i) {
        return i >= 0;
    }

    /* renamed from: b */
    public C14777ur mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<Double> d = w60.m43544d(this.f41393a, ly0, "alpha", jSONObject, f41388q);
        if (d == null) {
            d = f41377f;
        }
        f50<Integer> d2 = w60.m43544d(this.f41394b, ly0, "duration", jSONObject, f41389r);
        if (d2 == null) {
            d2 = f41378g;
        }
        f50<C13525jn> f50 = (f50) w60.m43543c(this.f41395c, ly0, "interpolator", jSONObject, f41390s);
        if (f50 == null) {
            f50 = f41379h;
        }
        f50<Integer> d3 = w60.m43544d(this.f41396d, ly0, "start_delay", jSONObject, f41391t);
        if (d3 == null) {
            d3 = f41380i;
        }
        return new C14777ur(d, d2, f50, d3);
    }
}
