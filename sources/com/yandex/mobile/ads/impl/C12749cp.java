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

/* renamed from: com.yandex.mobile.ads.impl.cp */
public class C12749cp implements qh0, ci0<C12600bp> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final f50<Integer> f31990e;

    /* renamed from: f */
    private static final f50<C13525jn> f31991f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Integer> f31992g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final cg1<C13525jn> f31993h = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13525jn.values()), C12755f.f32013b);

    /* renamed from: i */
    private static final rh1<Integer> f31994i = $$Lambda$cp$FQHzaW5YiPuaX1viXo76gPeQQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final rh1<Integer> f31995j = $$Lambda$cp$wrXF6YVNsH_ekbQTvishkNo74.INSTANCE;

    /* renamed from: k */
    private static final rh1<String> f31996k = $$Lambda$cp$VTdOrQZYeDtG0VEAmfV7CDtclZ0.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final rh1<String> f31997l = $$Lambda$cp$dyHJZY4feKbkrwnfpMOmcUcf9us.INSTANCE;

    /* renamed from: m */
    private static final rh1<Integer> f31998m = $$Lambda$cp$O4osaJqNHkiMTeGukQayuzHWQwc.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final rh1<Integer> f31999n = $$Lambda$cp$u4nqxL1KuxmmHps4H7U5ZfWyfc.INSTANCE;

    /* renamed from: o */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f32000o = C12751b.f32009b;

    /* renamed from: p */
    private static final Function3<String, JSONObject, ly0, f50<C13525jn>> f32001p = C12752c.f32010b;

    /* renamed from: q */
    private static final Function3<String, JSONObject, ly0, f50<String>> f32002q = C12753d.f32011b;

    /* renamed from: r */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f32003r = C12754e.f32012b;

    /* renamed from: a */
    public final v60<f50<Integer>> f32004a;

    /* renamed from: b */
    public final v60<f50<C13525jn>> f32005b;

    /* renamed from: c */
    public final v60<f50<String>> f32006c;

    /* renamed from: d */
    public final v60<f50<Integer>> f32007d;

    /* renamed from: com.yandex.mobile.ads.impl.cp$a */
    static final class C12750a extends Lambda implements Function2<ly0, JSONObject, C12749cp> {

        /* renamed from: b */
        public static final C12750a f32008b = new C12750a();

        C12750a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C12749cp(ly0, (C12749cp) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cp$b */
    static final class C12751b extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C12751b f32009b = new C12751b();

        C12751b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C12749cp.f31995j, ly0.mo66818b(), C12749cp.f31990e, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cp$c */
    static final class C12752c extends Lambda implements Function3<String, JSONObject, ly0, f50<C13525jn>> {

        /* renamed from: b */
        public static final C12752c f32010b = new C12752c();

        C12752c() {
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
            return zh0.m44621b(jSONObject, str, C13525jn.f35401d, ly0.mo66818b(), ly0, C12749cp.f31993h);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cp$d */
    static final class C12753d extends Lambda implements Function3<String, JSONObject, ly0, f50<String>> {

        /* renamed from: b */
        public static final C12753d f32011b = new C12753d();

        C12753d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44620b(jSONObject, str, C12749cp.f31997l, ly0.mo66818b(), ly0, dg1.f32575c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cp$e */
    static final class C12754e extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C12754e f32012b = new C12754e();

        C12754e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C12749cp.f31999n, ly0.mo66818b(), C12749cp.f31992g, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cp$f */
    static final class C12755f extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C12755f f32013b = new C12755f();

        C12755f() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13525jn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cp$g */
    static final class C12756g extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C12756g f32014b = new C12756g();

        C12756g() {
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
        f31990e = aVar.mo66929a(200);
        f31991f = aVar.mo66929a(C13525jn.EASE_IN_OUT);
        f31992g = aVar.mo66929a(0);
        C12756g gVar = C12756g.f32014b;
        C12750a aVar2 = C12750a.f32008b;
    }

    public C12749cp(ly0 ly0, C12749cp cpVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        v60<f50<C13525jn>> v602;
        v60<f50<String>> v603;
        v60<f50<Integer>> v604;
        C12749cp cpVar2 = cpVar;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (cpVar2 == null) {
            v60 = null;
        } else {
            v60 = cpVar2.f32004a;
        }
        Function1<Number, Integer> d = ky0.m38514d();
        rh1<Integer> rh1 = f31994i;
        cg1<Integer> cg1 = dg1.f32574b;
        v60<f50<f50<Integer>>> b2 = di0.m35295b(jSONObject, "duration", z, v60, d, rh1, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f32004a = b2;
        if (cpVar2 == null) {
            v602 = null;
        } else {
            v602 = cpVar2.f32005b;
        }
        v60<f50<f50<C13525jn>>> b3 = di0.m35293b(jSONObject, "interpolator", z, v602, C13525jn.f35400c.mo68068a(), b, ly0, f31993h);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp…TYPE_HELPER_INTERPOLATOR)");
        this.f32005b = b3;
        if (cpVar2 == null) {
            v603 = null;
        } else {
            v603 = cpVar2.f32006c;
        }
        v60<f50<f50<String>>> b4 = di0.m35292b(jSONObject, "path_motion", z, v603, f31996k, b, ly0, dg1.f32575c);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f32006c = b4;
        if (cpVar2 == null) {
            v604 = null;
        } else {
            v604 = cpVar2.f32007d;
        }
        v60<f50<f50<Integer>>> b5 = di0.m35295b(jSONObject, "start_delay", z, v604, ky0.m38514d(), f31998m, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f32007d = b5;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34790a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34793b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m34796c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m34798d(int i) {
        return i >= 0;
    }

    /* renamed from: b */
    public C12600bp mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<Integer> d = w60.m43544d(this.f32004a, ly0, "duration", jSONObject, f32000o);
        if (d == null) {
            d = f31990e;
        }
        f50<C13525jn> f50 = (f50) w60.m43543c(this.f32005b, ly0, "interpolator", jSONObject, f32001p);
        if (f50 == null) {
            f50 = f31991f;
        }
        f50<T> d2 = w60.m43544d(this.f32006c, ly0, "path_motion", jSONObject, f32002q);
        f50<Integer> d3 = w60.m43544d(this.f32007d, ly0, "start_delay", jSONObject, f32003r);
        if (d3 == null) {
            d3 = f31992g;
        }
        return new C12600bp(d, f50, d2, d3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34791a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34794b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
