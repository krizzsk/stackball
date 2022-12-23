package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C13525jn;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.tw */
public class C14718tw implements qh0, ci0<C14634sw> {

    /* renamed from: A */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f40478A = C14723e.f40511b;

    /* renamed from: B */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f40479B = C14724f.f40512b;

    /* renamed from: C */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f40480C = C14725g.f40513b;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Integer> f40481g;

    /* renamed from: h */
    private static final f50<C13525jn> f40482h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<Double> f40483i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<Double> f40484j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final f50<Double> f40485k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final f50<Integer> f40486l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final cg1<C13525jn> f40487m = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13525jn.values()), C14726h.f40514b);

    /* renamed from: n */
    private static final rh1<Integer> f40488n = $$Lambda$tw$0etoGHLWk6cRq2aOeEKs2CwehI.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final rh1<Integer> f40489o = $$Lambda$tw$BuBrr9tWFx_9kzQEg8J_Yr2UY3o.INSTANCE;

    /* renamed from: p */
    private static final rh1<Double> f40490p = $$Lambda$tw$6DMHN7pjB5EloDsfcBmOhs2373k.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final rh1<Double> f40491q = $$Lambda$tw$D_wopGXNaX5i6_xe7jI8UXqEEjM.INSTANCE;

    /* renamed from: r */
    private static final rh1<Double> f40492r = $$Lambda$tw$EqBklDwcgMzfyTSMdh6gKRetm7E.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final rh1<Double> f40493s = $$Lambda$tw$z4CWGBFS3YyHujKV1DVF5fiiEo.INSTANCE;

    /* renamed from: t */
    private static final rh1<Double> f40494t = $$Lambda$tw$jmKqzSh56fZtlSA_mM2bBxT7mm0.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final rh1<Double> f40495u = $$Lambda$tw$JjMItmNNkKy4so3ATmo3nYR97k.INSTANCE;

    /* renamed from: v */
    private static final rh1<Integer> f40496v = $$Lambda$tw$SLVXW07mG_JFCulGIpNWl0FqjZM.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final rh1<Integer> f40497w = $$Lambda$tw$SaJdHsmaXrMBKbOzVvHMVXUb_Hc.INSTANCE;

    /* renamed from: x */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f40498x = C14720b.f40508b;

    /* renamed from: y */
    private static final Function3<String, JSONObject, ly0, f50<C13525jn>> f40499y = C14721c.f40509b;

    /* renamed from: z */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f40500z = C14722d.f40510b;

    /* renamed from: a */
    public final v60<f50<Integer>> f40501a;

    /* renamed from: b */
    public final v60<f50<C13525jn>> f40502b;

    /* renamed from: c */
    public final v60<f50<Double>> f40503c;

    /* renamed from: d */
    public final v60<f50<Double>> f40504d;

    /* renamed from: e */
    public final v60<f50<Double>> f40505e;

    /* renamed from: f */
    public final v60<f50<Integer>> f40506f;

    /* renamed from: com.yandex.mobile.ads.impl.tw$a */
    static final class C14719a extends Lambda implements Function2<ly0, JSONObject, C14718tw> {

        /* renamed from: b */
        public static final C14719a f40507b = new C14719a();

        C14719a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14718tw(ly0, (C14718tw) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$b */
    static final class C14720b extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14720b f40508b = new C14720b();

        C14720b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14718tw.f40489o, ly0.mo66818b(), C14718tw.f40481g, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$c */
    static final class C14721c extends Lambda implements Function3<String, JSONObject, ly0, f50<C13525jn>> {

        /* renamed from: b */
        public static final C14721c f40509b = new C14721c();

        C14721c() {
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
            return zh0.m44621b(jSONObject, str, C13525jn.f35401d, ly0.mo66818b(), ly0, C14718tw.f40487m);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$d */
    static final class C14722d extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C14722d f40510b = new C14722d();

        C14722d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38513c(), C14718tw.f40491q, ly0.mo66818b(), C14718tw.f40483i, (cg1) dg1.f32576d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$e */
    static final class C14723e extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C14723e f40511b = new C14723e();

        C14723e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38513c(), C14718tw.f40493s, ly0.mo66818b(), C14718tw.f40484j, (cg1) dg1.f32576d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$f */
    static final class C14724f extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C14724f f40512b = new C14724f();

        C14724f() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38513c(), C14718tw.f40495u, ly0.mo66818b(), C14718tw.f40485k, (cg1) dg1.f32576d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$g */
    static final class C14725g extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14725g f40513b = new C14725g();

        C14725g() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14718tw.f40497w, ly0.mo66818b(), C14718tw.f40486l, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$h */
    static final class C14726h extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14726h f40514b = new C14726h();

        C14726h() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13525jn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$i */
    static final class C14727i extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C14727i f40515b = new C14727i();

        C14727i() {
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
        f50.C13029a aVar = f50.f33229a;
        f40481g = aVar.mo66929a(200);
        f40482h = aVar.mo66929a(C13525jn.EASE_IN_OUT);
        Double valueOf = Double.valueOf(0.5d);
        f40483i = aVar.mo66929a(valueOf);
        f40484j = aVar.mo66929a(valueOf);
        f40485k = aVar.mo66929a(Double.valueOf(0.0d));
        f40486l = aVar.mo66929a(0);
        C14727i iVar = C14727i.f40515b;
        C14719a aVar2 = C14719a.f40507b;
    }

    public C14718tw(ly0 ly0, C14718tw twVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        v60<f50<C13525jn>> v602;
        v60<f50<Double>> v603;
        v60<f50<Double>> v604;
        v60<f50<Double>> v605;
        v60<f50<Integer>> v606;
        C14718tw twVar2 = twVar;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (twVar2 == null) {
            v60 = null;
        } else {
            v60 = twVar2.f40501a;
        }
        Function1<Number, Integer> d = ky0.m38514d();
        rh1<Integer> rh1 = f40488n;
        cg1<Integer> cg1 = dg1.f32574b;
        v60<f50<f50<Integer>>> b2 = di0.m35295b(jSONObject, "duration", z, v60, d, rh1, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f40501a = b2;
        if (twVar2 == null) {
            v602 = null;
        } else {
            v602 = twVar2.f40502b;
        }
        v60<f50<f50<C13525jn>>> b3 = di0.m35293b(jSONObject, "interpolator", z, v602, C13525jn.f35400c.mo68068a(), b, ly0, f40487m);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp…TYPE_HELPER_INTERPOLATOR)");
        this.f40502b = b3;
        if (twVar2 == null) {
            v603 = null;
        } else {
            v603 = twVar2.f40503c;
        }
        Function1<Number, Double> c = ky0.m38513c();
        rh1<Double> rh12 = f40490p;
        cg1<Double> cg12 = dg1.f32576d;
        String str = "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)";
        v60<f50<f50<Double>>> b4 = di0.m35295b(jSONObject, "pivot_x", z, v603, c, rh12, b, ly0, cg12);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f40503c = b4;
        if (twVar2 == null) {
            v604 = null;
        } else {
            v604 = twVar2.f40504d;
        }
        String str2 = "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)";
        v60<f50<f50<Double>>> b5 = di0.m35295b(jSONObject, "pivot_y", z, v604, ky0.m38513c(), f40492r, b, ly0, cg12);
        Intrinsics.checkNotNullExpressionValue(b5, str2);
        this.f40504d = b5;
        if (twVar2 == null) {
            v605 = null;
        } else {
            v605 = twVar2.f40505e;
        }
        v60<f50<f50<Double>>> b6 = di0.m35295b(jSONObject, "scale", z, v605, ky0.m38513c(), f40494t, b, ly0, cg12);
        Intrinsics.checkNotNullExpressionValue(b6, str2);
        this.f40505e = b6;
        if (twVar2 == null) {
            v606 = null;
        } else {
            v606 = twVar2.f40506f;
        }
        v60<f50<f50<Integer>>> b7 = di0.m35295b(jSONObject, "start_delay", z, v606, ky0.m38514d(), f40496v, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b7, str);
        this.f40506f = b7;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42513a(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42514a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42516b(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42517b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m42519c(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m42520c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m42522d(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m42523d(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m42525e(double d) {
        return d >= 0.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m42527f(double d) {
        return d >= 0.0d;
    }

    /* renamed from: b */
    public C14634sw mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<Integer> d = w60.m43544d(this.f40501a, ly0, "duration", jSONObject, f40498x);
        if (d == null) {
            d = f40481g;
        }
        f50<Integer> f50 = d;
        f50<C13525jn> f502 = (f50) w60.m43543c(this.f40502b, ly0, "interpolator", jSONObject, f40499y);
        if (f502 == null) {
            f502 = f40482h;
        }
        f50<C13525jn> f503 = f502;
        f50<Double> d2 = w60.m43544d(this.f40503c, ly0, "pivot_x", jSONObject, f40500z);
        if (d2 == null) {
            d2 = f40483i;
        }
        f50<Double> f504 = d2;
        f50<Double> d3 = w60.m43544d(this.f40504d, ly0, "pivot_y", jSONObject, f40478A);
        if (d3 == null) {
            d3 = f40484j;
        }
        f50<Double> f505 = d3;
        f50<Double> d4 = w60.m43544d(this.f40505e, ly0, "scale", jSONObject, f40479B);
        if (d4 == null) {
            d4 = f40485k;
        }
        f50<Double> f506 = d4;
        f50<Integer> d5 = w60.m43544d(this.f40506f, ly0, "start_delay", jSONObject, f40480C);
        if (d5 == null) {
            d5 = f40486l;
        }
        return new C14634sw(f50, f503, f504, f505, f506, d5);
    }
}
