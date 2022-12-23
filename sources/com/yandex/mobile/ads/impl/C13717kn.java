package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.yandex.mobile.ads.impl.C13420in;
import com.yandex.mobile.ads.impl.C13525jn;
import com.yandex.mobile.ads.impl.C14121nq;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.f50;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.kn */
public class C13717kn implements qh0, ci0<C13420in> {

    /* renamed from: A */
    private static final Function3<String, JSONObject, ly0, C14121nq> f36172A = C13724g.f36208b;

    /* renamed from: B */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f36173B = C13725h.f36209b;

    /* renamed from: C */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f36174C = C13726i.f36210b;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public static final Function2<ly0, JSONObject, C13717kn> f36175D = C13718a.f36202b;

    /* renamed from: i */
    public static final C13729l f36176i = new C13729l((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<Integer> f36177j;

    /* renamed from: k */
    private static final f50<C13525jn> f36178k;

    /* renamed from: l */
    private static final C14121nq.C14125d f36179l = new C14121nq.C14125d(new C12654bu());
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final f50<Integer> f36180m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final cg1<C13525jn> f36181n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final cg1<C13420in.C13425e> f36182o;

    /* renamed from: p */
    private static final rh1<Integer> f36183p = $$Lambda$kn$mVwPr9dvKqBqQf2xSLd7Q1ZeMvQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final rh1<Integer> f36184q = $$Lambda$kn$3L5pWyQ7XRSO9QZPFjx8As6iIw8.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final gj0<C13420in> f36185r = $$Lambda$kn$LtSdrbLlv2E93F65N1KF1iIRzkI.INSTANCE;

    /* renamed from: s */
    private static final gj0<C13717kn> f36186s = $$Lambda$kn$JtT4Gpc1LjxAKniOZxEJ0X36vsM.INSTANCE;

    /* renamed from: t */
    private static final rh1<Integer> f36187t = $$Lambda$kn$DoKswBqDoIWbSrqjzPuGMYF3Pbw.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final rh1<Integer> f36188u = $$Lambda$kn$LiSoBuzffUVuAYt2gRBdtayUd3s.INSTANCE;

    /* renamed from: v */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f36189v = C13719b.f36203b;

    /* renamed from: w */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f36190w = C13720c.f36204b;

    /* renamed from: x */
    private static final Function3<String, JSONObject, ly0, f50<C13525jn>> f36191x = C13721d.f36205b;

    /* renamed from: y */
    private static final Function3<String, JSONObject, ly0, List<C13420in>> f36192y = C13722e.f36206b;

    /* renamed from: z */
    private static final Function3<String, JSONObject, ly0, f50<C13420in.C13425e>> f36193z = C13723f.f36207b;

    /* renamed from: a */
    public final v60<f50<Integer>> f36194a;

    /* renamed from: b */
    public final v60<f50<Double>> f36195b;

    /* renamed from: c */
    public final v60<f50<C13525jn>> f36196c;

    /* renamed from: d */
    public final v60<List<C13717kn>> f36197d;

    /* renamed from: e */
    public final v60<f50<C13420in.C13425e>> f36198e;

    /* renamed from: f */
    public final v60<C14206oq> f36199f;

    /* renamed from: g */
    public final v60<f50<Integer>> f36200g;

    /* renamed from: h */
    public final v60<f50<Double>> f36201h;

    /* renamed from: com.yandex.mobile.ads.impl.kn$a */
    static final class C13718a extends Lambda implements Function2<ly0, JSONObject, C13717kn> {

        /* renamed from: b */
        public static final C13718a f36202b = new C13718a();

        C13718a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13717kn(ly0, (C13717kn) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$b */
    static final class C13719b extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C13719b f36203b = new C13719b();

        C13719b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C13717kn.f36184q, ly0.mo66818b(), C13717kn.f36177j, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$c */
    static final class C13720c extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C13720c f36204b = new C13720c();

        C13720c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44621b(jSONObject, str, ky0.m38513c(), ly0.mo66818b(), ly0, dg1.f32576d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$d */
    static final class C13721d extends Lambda implements Function3<String, JSONObject, ly0, f50<C13525jn>> {

        /* renamed from: b */
        public static final C13721d f36205b = new C13721d();

        C13721d() {
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
            return zh0.m44621b(jSONObject, str, C13525jn.f35401d, ly0.mo66818b(), ly0, C13717kn.f36181n);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$e */
    static final class C13722e extends Lambda implements Function3<String, JSONObject, ly0, List<C13420in>> {

        /* renamed from: b */
        public static final C13722e f36206b = new C13722e();

        C13722e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C13420in.C13424d dVar = C13420in.f34922h;
            return zh0.m44626b(jSONObject, str, C13420in.f34932r, C13717kn.f36185r, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$f */
    static final class C13723f extends Lambda implements Function3<String, JSONObject, ly0, f50<C13420in.C13425e>> {

        /* renamed from: b */
        public static final C13723f f36207b = new C13723f();

        C13723f() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C13420in.C13425e.C13427b bVar = C13420in.C13425e.f34943c;
            f50 a = zh0.m44598a(jSONObject, str, C13420in.C13425e.f34944d, ly0.mo66818b(), ly0, C13717kn.f36182o);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, key…r, env, TYPE_HELPER_NAME)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$g */
    static final class C13724g extends Lambda implements Function3<String, JSONObject, ly0, C14121nq> {

        /* renamed from: b */
        public static final C13724g f36208b = new C13724g();

        C13724g() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14121nq.C14123b bVar = C14121nq.f37876a;
            return (C14121nq) zh0.m44622b(jSONObject, str, C14121nq.f37877b, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$h */
    static final class C13725h extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C13725h f36209b = new C13725h();

        C13725h() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C13717kn.f36188u, ly0.mo66818b(), C13717kn.f36180m, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$i */
    static final class C13726i extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C13726i f36210b = new C13726i();

        C13726i() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44621b(jSONObject, str, ky0.m38513c(), ly0.mo66818b(), ly0, dg1.f32576d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$j */
    static final class C13727j extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13727j f36211b = new C13727j();

        C13727j() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13525jn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$k */
    static final class C13728k extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13728k f36212b = new C13728k();

        C13728k() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13420in.C13425e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn$l */
    public static final class C13729l {
        private C13729l() {
        }

        public /* synthetic */ C13729l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C13717kn> mo68253a() {
            return C13717kn.f36175D;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f36177j = aVar.mo66929a(Integer.valueOf(ErrorCode.GENERAL_WRAPPER_ERROR));
        f36178k = aVar.mo66929a(C13525jn.SPRING);
        f36180m = aVar.mo66929a(0);
        cg1.C12733a aVar2 = cg1.f31917a;
        f36181n = aVar2.mo66293a(ArraysKt.first((T[]) C13525jn.values()), C13727j.f36211b);
        f36182o = aVar2.mo66293a(ArraysKt.first((T[]) C13420in.C13425e.values()), C13728k.f36212b);
    }

    public C13717kn(ly0 ly0, C13717kn knVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        v60<f50<Double>> v602;
        v60<f50<C13525jn>> v603;
        v60<List<C13717kn>> v604;
        v60<f50<C13420in.C13425e>> v605;
        v60<C14206oq> v606;
        v60<f50<Integer>> v607;
        v60<f50<Double>> v608;
        C13717kn knVar2 = knVar;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (knVar2 == null) {
            v60 = null;
        } else {
            v60 = knVar2.f36194a;
        }
        Function1<Number, Integer> d = ky0.m38514d();
        rh1<Integer> rh1 = f36183p;
        cg1<Integer> cg1 = dg1.f32574b;
        v60<f50<f50<Integer>>> b2 = di0.m35295b(jSONObject, "duration", z, v60, d, rh1, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f36194a = b2;
        if (knVar2 == null) {
            v602 = null;
        } else {
            v602 = knVar2.f36195b;
        }
        Function1<Number, Double> c = ky0.m38513c();
        cg1<Double> cg12 = dg1.f32576d;
        v60<f50<f50<Double>>> b3 = di0.m35293b(jSONObject, "end_value", z, v602, c, b, ly0, cg12);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f36195b = b3;
        if (knVar2 == null) {
            v603 = null;
        } else {
            v603 = knVar2.f36196c;
        }
        String str = "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)";
        v60<f50<f50<C13525jn>>> b4 = di0.m35293b(jSONObject, "interpolator", z, v603, C13525jn.f35400c.mo68068a(), b, ly0, f36181n);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp…TYPE_HELPER_INTERPOLATOR)");
        this.f36196c = b4;
        if (knVar2 == null) {
            v604 = null;
        } else {
            v604 = knVar2.f36197d;
        }
        v60<List<List<C13717kn>>> b5 = di0.m35296b(jSONObject, FirebaseAnalytics.Param.ITEMS, z, v604, f36175D, f36186s, b, ly0);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f36197d = b5;
        if (knVar2 == null) {
            v605 = null;
        } else {
            v605 = knVar2.f36198e;
        }
        v60<f50<f50<C13420in.C13425e>>> a = di0.m35282a(jSONObject, "name", z, v605, C13420in.C13425e.f34943c.mo67835a(), b, ly0, f36182o);
        Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(…r, env, TYPE_HELPER_NAME)");
        this.f36198e = a;
        if (knVar2 == null) {
            v606 = null;
        } else {
            v606 = knVar2.f36199f;
        }
        v60<C14206oq> b6 = di0.m35297b(jSONObject, "repeat", z, v606, C14206oq.f38297a.mo69255a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f36199f = b6;
        if (knVar2 == null) {
            v607 = null;
        } else {
            v607 = knVar2.f36200g;
        }
        v60<f50<f50<Integer>>> b7 = di0.m35295b(jSONObject, "start_delay", z, v607, ky0.m38514d(), f36187t, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b7, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f36200g = b7;
        if (knVar2 == null) {
            v608 = null;
        } else {
            v608 = knVar2.f36201h;
        }
        v60<f50<f50<Double>>> b8 = di0.m35293b(jSONObject, "start_value", z, v608, ky0.m38513c(), b, ly0, cg12);
        Intrinsics.checkNotNullExpressionValue(b8, str);
        this.f36201h = b8;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38385a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38388b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m38391c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m38393d(int i) {
        return i >= 0;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<Integer> d = w60.m43544d(this.f36194a, ly0, "duration", jSONObject, f36189v);
        if (d == null) {
            d = f36177j;
        }
        f50<Integer> f50 = d;
        f50<T> d2 = w60.m43544d(this.f36195b, ly0, "end_value", jSONObject, f36190w);
        f50<C13525jn> f502 = (f50) w60.m43543c(this.f36196c, ly0, "interpolator", jSONObject, f36191x);
        if (f502 == null) {
            f502 = f36178k;
        }
        f50<C13525jn> f503 = f502;
        List<T> a = w60.m43540a(this.f36197d, ly0, FirebaseAnalytics.Param.ITEMS, jSONObject, f36185r, f36192y);
        f50 f504 = (f50) w60.m43539a(this.f36198e, ly0, "name", jSONObject, f36193z);
        C14121nq nqVar = (C14121nq) w60.m43545e(this.f36199f, ly0, "repeat", jSONObject, f36172A);
        if (nqVar == null) {
            nqVar = f36179l;
        }
        C14121nq nqVar2 = nqVar;
        f50<Integer> d3 = w60.m43544d(this.f36200g, ly0, "start_delay", jSONObject, f36173B);
        if (d3 == null) {
            d3 = f36180m;
        }
        return new C13420in(f50, d2, f503, a, f504, nqVar2, d3, w60.m43544d(this.f36201h, ly0, "start_value", jSONObject, f36174C));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38389b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38386a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
