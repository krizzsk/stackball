package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.vungle.warren.VungleApiClient;
import com.yandex.mobile.ads.impl.C12992er;
import com.yandex.mobile.ads.impl.C13525jn;
import com.yandex.mobile.ads.impl.C13904lx;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.mx */
public class C14025mx implements qh0, ci0<C13904lx> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final f50<Integer> f37538f;

    /* renamed from: g */
    private static final f50<C13904lx.C13909e> f37539g;

    /* renamed from: h */
    private static final f50<C13525jn> f37540h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<Integer> f37541i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final cg1<C13904lx.C13909e> f37542j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final cg1<C13525jn> f37543k;

    /* renamed from: l */
    private static final rh1<Integer> f37544l = $$Lambda$mx$aoiIP1CWCCQlnmptoJwemVyoJQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final rh1<Integer> f37545m = $$Lambda$mx$TlPN2nAhDChSdUSse81ZIl7yzdE.INSTANCE;

    /* renamed from: n */
    private static final rh1<Integer> f37546n = $$Lambda$mx$7fUdVJf00RbKoz95GF9ngPSOiG0.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final rh1<Integer> f37547o = $$Lambda$mx$ZzGm28JqfemLnMczcTcRR54_SmQ.INSTANCE;

    /* renamed from: p */
    private static final Function3<String, JSONObject, ly0, C12992er> f37548p = C14027b.f37559b;

    /* renamed from: q */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f37549q = C14028c.f37560b;

    /* renamed from: r */
    private static final Function3<String, JSONObject, ly0, f50<C13904lx.C13909e>> f37550r = C14029d.f37561b;

    /* renamed from: s */
    private static final Function3<String, JSONObject, ly0, f50<C13525jn>> f37551s = C14030e.f37562b;

    /* renamed from: t */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f37552t = C14031f.f37563b;

    /* renamed from: a */
    public final v60<C13104fr> f37553a;

    /* renamed from: b */
    public final v60<f50<Integer>> f37554b;

    /* renamed from: c */
    public final v60<f50<C13904lx.C13909e>> f37555c;

    /* renamed from: d */
    public final v60<f50<C13525jn>> f37556d;

    /* renamed from: e */
    public final v60<f50<Integer>> f37557e;

    /* renamed from: com.yandex.mobile.ads.impl.mx$a */
    static final class C14026a extends Lambda implements Function2<ly0, JSONObject, C14025mx> {

        /* renamed from: b */
        public static final C14026a f37558b = new C14026a();

        C14026a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14025mx(ly0, (C14025mx) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mx$b */
    static final class C14027b extends Lambda implements Function3<String, JSONObject, ly0, C12992er> {

        /* renamed from: b */
        public static final C14027b f37559b = new C14027b();

        C14027b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C12992er.C12995c cVar = C12992er.f33046c;
            return (C12992er) zh0.m44622b(jSONObject, str, C12992er.f33049f, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mx$c */
    static final class C14028c extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14028c f37560b = new C14028c();

        C14028c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14025mx.f37545m, ly0.mo66818b(), C14025mx.f37538f, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mx$d */
    static final class C14029d extends Lambda implements Function3<String, JSONObject, ly0, f50<C13904lx.C13909e>> {

        /* renamed from: b */
        public static final C14029d f37561b = new C14029d();

        C14029d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C13904lx.C13909e.C13911b bVar = C13904lx.C13909e.f36954c;
            return zh0.m44621b(jSONObject, str, C13904lx.C13909e.f36955d, ly0.mo66818b(), ly0, C14025mx.f37542j);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mx$e */
    static final class C14030e extends Lambda implements Function3<String, JSONObject, ly0, f50<C13525jn>> {

        /* renamed from: b */
        public static final C14030e f37562b = new C14030e();

        C14030e() {
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
            return zh0.m44621b(jSONObject, str, C13525jn.f35401d, ly0.mo66818b(), ly0, C14025mx.f37543k);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mx$f */
    static final class C14031f extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14031f f37563b = new C14031f();

        C14031f() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14025mx.f37547o, ly0.mo66818b(), C14025mx.f37541i, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mx$g */
    static final class C14032g extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14032g f37564b = new C14032g();

        C14032g() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13904lx.C13909e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mx$h */
    static final class C14033h extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14033h f37565b = new C14033h();

        C14033h() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13525jn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mx$i */
    static final class C14034i extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C14034i f37566b = new C14034i();

        C14034i() {
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
        f37538f = aVar.mo66929a(200);
        f37539g = aVar.mo66929a(C13904lx.C13909e.BOTTOM);
        f37540h = aVar.mo66929a(C13525jn.EASE_IN_OUT);
        f37541i = aVar.mo66929a(0);
        cg1.C12733a aVar2 = cg1.f31917a;
        f37542j = aVar2.mo66293a(ArraysKt.first((T[]) C13904lx.C13909e.values()), C14032g.f37564b);
        f37543k = aVar2.mo66293a(ArraysKt.first((T[]) C13525jn.values()), C14033h.f37565b);
        C14034i iVar = C14034i.f37566b;
        C14026a aVar3 = C14026a.f37558b;
    }

    public C14025mx(ly0 ly0, C14025mx mxVar, boolean z, JSONObject jSONObject) {
        v60<C13104fr> v60;
        v60<f50<Integer>> v602;
        v60<f50<C13904lx.C13909e>> v603;
        v60<f50<C13525jn>> v604;
        v60<f50<Integer>> v605;
        C14025mx mxVar2 = mxVar;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (mxVar2 == null) {
            v60 = null;
        } else {
            v60 = mxVar2.f37553a;
        }
        v60<C13104fr> b2 = di0.m35297b(jSONObject, "distance", z, v60, C13104fr.f33574c.mo67068a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f37553a = b2;
        if (mxVar2 == null) {
            v602 = null;
        } else {
            v602 = mxVar2.f37554b;
        }
        Function1<Number, Integer> d = ky0.m38514d();
        rh1<Integer> rh1 = f37544l;
        cg1<Integer> cg1 = dg1.f32574b;
        v60<f50<f50<Integer>>> b3 = di0.m35295b(jSONObject, "duration", z, v602, d, rh1, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f37554b = b3;
        if (mxVar2 == null) {
            v603 = null;
        } else {
            v603 = mxVar2.f37555c;
        }
        v60<f50<f50<C13904lx.C13909e>>> b4 = di0.m35293b(jSONObject, VungleApiClient.ConnectionTypeDetail.EDGE, z, v603, C13904lx.C13909e.f36954c.mo68526a(), b, ly0, f37542j);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp…r, env, TYPE_HELPER_EDGE)");
        this.f37555c = b4;
        if (mxVar2 == null) {
            v604 = null;
        } else {
            v604 = mxVar2.f37556d;
        }
        v60<f50<f50<C13525jn>>> b5 = di0.m35293b(jSONObject, "interpolator", z, v604, C13525jn.f35400c.mo68068a(), b, ly0, f37543k);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalFieldWithExp…TYPE_HELPER_INTERPOLATOR)");
        this.f37556d = b5;
        if (mxVar2 == null) {
            v605 = null;
        } else {
            v605 = mxVar2.f37557e;
        }
        v60<f50<f50<Integer>>> b6 = di0.m35295b(jSONObject, "start_delay", z, v605, ky0.m38514d(), f37546n, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b6, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f37557e = b6;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m39750a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m39752b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m39754c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m39756d(int i) {
        return i >= 0;
    }

    /* renamed from: b */
    public C13904lx mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        C12992er erVar = (C12992er) w60.m43545e(this.f37553a, ly0, "distance", jSONObject, f37548p);
        f50<Integer> d = w60.m43544d(this.f37554b, ly0, "duration", jSONObject, f37549q);
        if (d == null) {
            d = f37538f;
        }
        f50<Integer> f50 = d;
        f50<C13904lx.C13909e> f502 = (f50) w60.m43543c(this.f37555c, ly0, VungleApiClient.ConnectionTypeDetail.EDGE, jSONObject, f37550r);
        if (f502 == null) {
            f502 = f37539g;
        }
        f50<C13904lx.C13909e> f503 = f502;
        f50<C13525jn> f504 = (f50) w60.m43543c(this.f37556d, ly0, "interpolator", jSONObject, f37551s);
        if (f504 == null) {
            f504 = f37540h;
        }
        f50<C13525jn> f505 = f504;
        f50<Integer> d2 = w60.m43544d(this.f37557e, ly0, "start_delay", jSONObject, f37552t);
        if (d2 == null) {
            d2 = f37541i;
        }
        return new C13904lx(erVar, f50, f503, f505, d2);
    }
}
