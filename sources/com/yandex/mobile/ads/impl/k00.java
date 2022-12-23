package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C13420in;
import com.yandex.mobile.ads.impl.C13717kn;
import com.yandex.mobile.ads.impl.C14138nw;
import com.yandex.mobile.ads.impl.C15177xl;
import com.yandex.mobile.ads.impl.c00;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class k00 implements qh0, ci0<c00> {

    /* renamed from: h */
    public static final C13674j f35893h = new C13674j((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<Integer> f35894i = f50.f33229a.mo66929a(5000);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final cg1<c00.C12691d> f35895j = cg1.f31917a.mo66293a(ArraysKt.first((T[]) c00.C12691d.values()), C13673i.f35923b);

    /* renamed from: k */
    private static final rh1<Integer> f35896k = $$Lambda$k00$Q2IiaRXS1aEUMj8BZmYCzE.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final rh1<Integer> f35897l = $$Lambda$k00$cfEL0TpGmyNhIVEhhtZM_hTuEIE.INSTANCE;

    /* renamed from: m */
    private static final rh1<String> f35898m = $$Lambda$k00$kPvfBAQRyNYeMRJW4SoEpyWOEqA.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final rh1<String> f35899n = $$Lambda$k00$WGpzl6l_BFz6PoTGbrTPdp6fn34.INSTANCE;

    /* renamed from: o */
    private static final Function3<String, JSONObject, ly0, C13420in> f35900o = C13665a.f35915b;

    /* renamed from: p */
    private static final Function3<String, JSONObject, ly0, C13420in> f35901p = C13666b.f35916b;

    /* renamed from: q */
    private static final Function3<String, JSONObject, ly0, C15177xl> f35902q = C13668d.f35918b;

    /* renamed from: r */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f35903r = C13669e.f35919b;

    /* renamed from: s */
    private static final Function3<String, JSONObject, ly0, String> f35904s = C13670f.f35920b;

    /* renamed from: t */
    private static final Function3<String, JSONObject, ly0, C14138nw> f35905t = C13671g.f35921b;

    /* renamed from: u */
    private static final Function3<String, JSONObject, ly0, f50<c00.C12691d>> f35906u = C13672h.f35922b;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final Function2<ly0, JSONObject, k00> f35907v = C13667c.f35917b;

    /* renamed from: a */
    public final v60<C13717kn> f35908a;

    /* renamed from: b */
    public final v60<C13717kn> f35909b;

    /* renamed from: c */
    public final v60<C13806kz> f35910c;

    /* renamed from: d */
    public final v60<f50<Integer>> f35911d;

    /* renamed from: e */
    public final v60<String> f35912e;

    /* renamed from: f */
    public final v60<C14228ow> f35913f;

    /* renamed from: g */
    public final v60<f50<c00.C12691d>> f35914g;

    /* renamed from: com.yandex.mobile.ads.impl.k00$a */
    static final class C13665a extends Lambda implements Function3<String, JSONObject, ly0, C13420in> {

        /* renamed from: b */
        public static final C13665a f35915b = new C13665a();

        C13665a() {
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
            return (C13420in) zh0.m44622b(jSONObject, str, C13420in.f34932r, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k00$b */
    static final class C13666b extends Lambda implements Function3<String, JSONObject, ly0, C13420in> {

        /* renamed from: b */
        public static final C13666b f35916b = new C13666b();

        C13666b() {
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
            return (C13420in) zh0.m44622b(jSONObject, str, C13420in.f34932r, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k00$c */
    static final class C13667c extends Lambda implements Function2<ly0, JSONObject, k00> {

        /* renamed from: b */
        public static final C13667c f35917b = new C13667c();

        C13667c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new k00(ly0, (k00) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k00$d */
    static final class C13668d extends Lambda implements Function3<String, JSONObject, ly0, C15177xl> {

        /* renamed from: b */
        public static final C13668d f35918b = new C13668d();

        C13668d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C15177xl.C15179b bVar = C15177xl.f42609a;
            Object a = zh0.m44612a(jSONObject, str, C15177xl.f42610b, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, Div.CREATOR, env.logger, env)");
            return (C15177xl) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k00$e */
    static final class C13669e extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C13669e f35919b = new C13669e();

        C13669e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), k00.f35897l, ly0.mo66818b(), k00.f35894i, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k00$f */
    static final class C13670f extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13670f f35920b = new C13670f();

        C13670f() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44608a(jSONObject, str, k00.f35899n, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, ID_VALIDATOR, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k00$g */
    static final class C13671g extends Lambda implements Function3<String, JSONObject, ly0, C14138nw> {

        /* renamed from: b */
        public static final C13671g f35921b = new C13671g();

        C13671g() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14138nw.C14140b bVar = C14138nw.f37925c;
            return (C14138nw) zh0.m44622b(jSONObject, str, C14138nw.f37926d, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k00$h */
    static final class C13672h extends Lambda implements Function3<String, JSONObject, ly0, f50<c00.C12691d>> {

        /* renamed from: b */
        public static final C13672h f35922b = new C13672h();

        C13672h() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            c00.C12691d.C12693b bVar = c00.C12691d.f31769c;
            f50 a = zh0.m44598a(jSONObject, str, c00.C12691d.f31770d, ly0.mo66818b(), ly0, k00.f35895j);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, key…nv, TYPE_HELPER_POSITION)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k00$i */
    static final class C13673i extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13673i f35923b = new C13673i();

        C13673i() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof c00.C12691d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k00$j */
    public static final class C13674j {
        private C13674j() {
        }

        public /* synthetic */ C13674j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, k00> mo68113a() {
            return k00.f35907v;
        }
    }

    public k00(ly0 ly0, k00 k00, boolean z, JSONObject jSONObject) {
        v60<C13717kn> v60;
        v60<C13717kn> v602;
        v60<C13806kz> v603;
        v60<f50<Integer>> v604;
        v60<String> v605;
        v60<C14228ow> v606;
        v60<f50<c00.C12691d>> v607;
        k00 k002 = k00;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (k002 == null) {
            v60 = null;
        } else {
            v60 = k002.f35908a;
        }
        C13717kn.C13729l lVar = C13717kn.f36176i;
        v60<C13717kn> b2 = di0.m35297b(jSONObject, "animation_in", z, v60, lVar.mo68253a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f35908a = b2;
        if (k002 == null) {
            v602 = null;
        } else {
            v602 = k002.f35909b;
        }
        v60<C13717kn> b3 = di0.m35297b(jSONObject, "animation_out", z, v602, lVar.mo68253a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f35909b = b3;
        if (k002 == null) {
            v603 = null;
        } else {
            v603 = k002.f35910c;
        }
        v60<C13806kz> a = di0.m35286a(jSONObject, "div", z, v603, C13806kz.f36464a.mo68285a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"div\", t…ate.CREATOR, logger, env)");
        this.f35910c = a;
        if (k002 == null) {
            v604 = null;
        } else {
            v604 = k002.f35911d;
        }
        v60<f50<f50<Integer>>> b4 = di0.m35295b(jSONObject, "duration", z, v604, ky0.m38514d(), f35896k, b, ly0, dg1.f32574b);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f35911d = b4;
        if (k002 == null) {
            v605 = null;
        } else {
            v605 = k002.f35912e;
        }
        v60<String> a2 = di0.m35278a(jSONObject, "id", z, v605, f35898m, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a2, "readField(json, \"id\", to…E_VALIDATOR, logger, env)");
        this.f35912e = a2;
        if (k002 == null) {
            v606 = null;
        } else {
            v606 = k002.f35913f;
        }
        v60<C14228ow> b5 = di0.m35297b(jSONObject, "offset", z, v606, C14228ow.f38395c.mo69276a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f35913f = b5;
        if (k002 == null) {
            v607 = null;
        } else {
            v607 = k002.f35914g;
        }
        v60<f50<f50<c00.C12691d>>> a3 = di0.m35282a(jSONObject, "position", z, v607, c00.C12691d.f31769c.mo66176a(), b, ly0, f35895j);
        Intrinsics.checkNotNullExpressionValue(a3, "readFieldWithExpression(…nv, TYPE_HELPER_POSITION)");
        this.f35914g = a3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38134a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38137b(int i) {
        return i >= 0;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        C13420in inVar = (C13420in) w60.m43545e(this.f35908a, ly0, "animation_in", jSONObject, f35900o);
        C13420in inVar2 = (C13420in) w60.m43545e(this.f35909b, ly0, "animation_out", jSONObject, f35901p);
        C15177xl xlVar = (C15177xl) w60.m43546f(this.f35910c, ly0, "div", jSONObject, f35902q);
        f50<Integer> d = w60.m43544d(this.f35911d, ly0, "duration", jSONObject, f35903r);
        if (d == null) {
            d = f35894i;
        }
        return new c00(inVar, inVar2, xlVar, d, (String) w60.m43539a(this.f35912e, ly0, "id", jSONObject, f35904s), (C14138nw) w60.m43545e(this.f35913f, ly0, "offset", jSONObject, f35905t), (f50) w60.m43539a(this.f35914g, ly0, "position", jSONObject, f35906u));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38138b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38135a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
