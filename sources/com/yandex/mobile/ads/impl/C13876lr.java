package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.tapjoy.TJAdUnitConstants;
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

/* renamed from: com.yandex.mobile.ads.impl.lr */
public class C13876lr implements qh0, ci0<C13776kr> {

    /* renamed from: f */
    public static final C13884h f36792f = new C13884h((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Integer> f36793g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final f50<Integer> f36794h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<Integer> f36795i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<Integer> f36796j;

    /* renamed from: k */
    private static final f50<C13794kx> f36797k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final cg1<C13794kx> f36798l = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13794kx.values()), C13882f.f36823b);

    /* renamed from: m */
    private static final rh1<Integer> f36799m = $$Lambda$lr$kTtJ99lk7OH3ZKes1D81aZl2zyc.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final rh1<Integer> f36800n = $$Lambda$lr$NNDACiK_CI41d_us0NMQREiJ4Q.INSTANCE;

    /* renamed from: o */
    private static final rh1<Integer> f36801o = $$Lambda$lr$ouFhMKQ_KDLuMUSGhfHJYdsFG2s.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final rh1<Integer> f36802p = $$Lambda$lr$TUfspKUAfPC6QYELLEkNrS2PM.INSTANCE;

    /* renamed from: q */
    private static final rh1<Integer> f36803q = $$Lambda$lr$HTeOiix4ykYAdg9Jk9huYyZbdSg.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final rh1<Integer> f36804r = $$Lambda$lr$iUm1dCDGygkEicgFKKxqUkU8aC0.INSTANCE;

    /* renamed from: s */
    private static final rh1<Integer> f36805s = $$Lambda$lr$gETQBS01vpFnET8bJPRG2pxfMI.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final rh1<Integer> f36806t = $$Lambda$lr$OdNPXecOwYyHKugxD8_DP9J0gVc.INSTANCE;

    /* renamed from: u */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f36807u = C13877a.f36818b;

    /* renamed from: v */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f36808v = C13879c.f36820b;

    /* renamed from: w */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f36809w = C13880d.f36821b;

    /* renamed from: x */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f36810x = C13881e.f36822b;

    /* renamed from: y */
    private static final Function3<String, JSONObject, ly0, f50<C13794kx>> f36811y = C13883g.f36824b;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final Function2<ly0, JSONObject, C13876lr> f36812z = C13878b.f36819b;

    /* renamed from: a */
    public final v60<f50<Integer>> f36813a;

    /* renamed from: b */
    public final v60<f50<Integer>> f36814b;

    /* renamed from: c */
    public final v60<f50<Integer>> f36815c;

    /* renamed from: d */
    public final v60<f50<Integer>> f36816d;

    /* renamed from: e */
    public final v60<f50<C13794kx>> f36817e;

    /* renamed from: com.yandex.mobile.ads.impl.lr$a */
    static final class C13877a extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C13877a f36818b = new C13877a();

        C13877a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C13876lr.f36800n, ly0.mo66818b(), C13876lr.f36793g, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lr$b */
    static final class C13878b extends Lambda implements Function2<ly0, JSONObject, C13876lr> {

        /* renamed from: b */
        public static final C13878b f36819b = new C13878b();

        C13878b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13876lr(ly0, (C13876lr) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lr$c */
    static final class C13879c extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C13879c f36820b = new C13879c();

        C13879c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C13876lr.f36802p, ly0.mo66818b(), C13876lr.f36794h, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lr$d */
    static final class C13880d extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C13880d f36821b = new C13880d();

        C13880d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C13876lr.f36804r, ly0.mo66818b(), C13876lr.f36795i, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lr$e */
    static final class C13881e extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C13881e f36822b = new C13881e();

        C13881e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C13876lr.f36806t, ly0.mo66818b(), C13876lr.f36796j, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lr$f */
    static final class C13882f extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13882f f36823b = new C13882f();

        C13882f() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13794kx);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lr$g */
    static final class C13883g extends Lambda implements Function3<String, JSONObject, ly0, f50<C13794kx>> {

        /* renamed from: b */
        public static final C13883g f36824b = new C13883g();

        C13883g() {
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
            return zh0.m44621b(jSONObject, str, C13794kx.f36441d, ly0.mo66818b(), ly0, C13876lr.f36798l);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lr$h */
    public static final class C13884h {
        private C13884h() {
        }

        public /* synthetic */ C13884h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C13876lr> mo68500a() {
            return C13876lr.f36812z;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f36793g = aVar.mo66929a(0);
        f36794h = aVar.mo66929a(0);
        f36795i = aVar.mo66929a(0);
        f36796j = aVar.mo66929a(0);
        f36797k = aVar.mo66929a(C13794kx.DP);
    }

    public C13876lr(ly0 ly0, C13876lr lrVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        v60<f50<Integer>> v602;
        v60<f50<Integer>> v603;
        v60<f50<Integer>> v604;
        v60<f50<C13794kx>> v605;
        C13876lr lrVar2 = lrVar;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (lrVar2 == null) {
            v60 = null;
        } else {
            v60 = lrVar2.f36813a;
        }
        Function1<Number, Integer> d = ky0.m38514d();
        rh1<Integer> rh1 = f36799m;
        cg1<Integer> cg1 = dg1.f32574b;
        v60<f50<f50<Integer>>> b2 = di0.m35295b(jSONObject, TJAdUnitConstants.String.BOTTOM, z, v60, d, rh1, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f36813a = b2;
        if (lrVar2 == null) {
            v602 = null;
        } else {
            v602 = lrVar2.f36814b;
        }
        String str = "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)";
        v60<f50<f50<Integer>>> b3 = di0.m35295b(jSONObject, "left", z, v602, ky0.m38514d(), f36801o, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b3, str);
        this.f36814b = b3;
        if (lrVar2 == null) {
            v603 = null;
        } else {
            v603 = lrVar2.f36815c;
        }
        v60<f50<f50<Integer>>> b4 = di0.m35295b(jSONObject, "right", z, v603, ky0.m38514d(), f36803q, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b4, str);
        this.f36815c = b4;
        if (lrVar2 == null) {
            v604 = null;
        } else {
            v604 = lrVar2.f36816d;
        }
        v60<f50<f50<Integer>>> b5 = di0.m35295b(jSONObject, "top", z, v604, ky0.m38514d(), f36805s, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b5, str);
        this.f36816d = b5;
        if (lrVar2 == null) {
            v605 = null;
        } else {
            v605 = lrVar2.f36817e;
        }
        v60<f50<f50<C13794kx>>> b6 = di0.m35293b(jSONObject, "unit", z, v605, C13794kx.f36440c.mo68280a(), b, ly0, f36798l);
        Intrinsics.checkNotNullExpressionValue(b6, "readOptionalFieldWithExp…r, env, TYPE_HELPER_UNIT)");
        this.f36817e = b6;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38898a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38900b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m38902c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m38904d(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m38906e(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m38908f(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m38910g(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m38912h(int i) {
        return i >= 0;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<Integer> d = w60.m43544d(this.f36813a, ly0, TJAdUnitConstants.String.BOTTOM, jSONObject, f36807u);
        if (d == null) {
            d = f36793g;
        }
        f50<Integer> f50 = d;
        f50<Integer> d2 = w60.m43544d(this.f36814b, ly0, "left", jSONObject, f36808v);
        if (d2 == null) {
            d2 = f36794h;
        }
        f50<Integer> f502 = d2;
        f50<Integer> d3 = w60.m43544d(this.f36815c, ly0, "right", jSONObject, f36809w);
        if (d3 == null) {
            d3 = f36795i;
        }
        f50<Integer> f503 = d3;
        f50<Integer> d4 = w60.m43544d(this.f36816d, ly0, "top", jSONObject, f36810x);
        if (d4 == null) {
            d4 = f36796j;
        }
        f50<Integer> f504 = d4;
        f50<C13794kx> f505 = (f50) w60.m43543c(this.f36817e, ly0, "unit", jSONObject, f36811y);
        if (f505 == null) {
            f505 = f36797k;
        }
        return new C13776kr(f50, f502, f503, f504, f505);
    }
}
