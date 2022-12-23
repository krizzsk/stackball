package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.f20;
import com.yandex.mobile.ads.impl.f50;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class q10 implements qh0, ci0<m10> {

    /* renamed from: A */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f38929A = C14348h.f38965b;

    /* renamed from: B */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f38930B = C14349i.f38966b;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final Function2<ly0, JSONObject, q10> f38931C = C14341a.f38958b;

    /* renamed from: i */
    public static final C14350j f38932i = new C14350j((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<Integer> f38933j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final f50<Integer> f38934k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final f50<Integer> f38935l;

    /* renamed from: m */
    private static final rh1<String> f38936m = $$Lambda$q10$KUxoxrZmJROpEjnQ5M5UxOYCMRo.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final rh1<String> f38937n = $$Lambda$q10$oTR__innFMMZvyhkDBJwGsZ2ZuI.INSTANCE;

    /* renamed from: o */
    private static final rh1<Integer> f38938o = $$Lambda$q10$Rk7d6PjSmGFCfobXM7U_r0Ov8c.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final rh1<Integer> f38939p = $$Lambda$q10$u8dmETzguh4yGaHy_uqx2DPt4DI.INSTANCE;

    /* renamed from: q */
    private static final rh1<Integer> f38940q = $$Lambda$q10$8Zece_KtMRgTr0MY39lFZqR1_l8.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final rh1<Integer> f38941r = $$Lambda$q10$wOiMmfUtYgiGgFSMYsatQ8Ro4LQ.INSTANCE;

    /* renamed from: s */
    private static final rh1<Integer> f38942s = $$Lambda$q10$EWqLTc2Ujm46NX0fQ2L9p3SIcHk.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final rh1<Integer> f38943t = $$Lambda$q10$2KSLEjBSBG3sXKGXHb4rGVVaxLw.INSTANCE;

    /* renamed from: u */
    private static final Function3<String, JSONObject, ly0, f20> f38944u = C14342b.f38959b;

    /* renamed from: v */
    private static final Function3<String, JSONObject, ly0, String> f38945v = C14343c.f38960b;

    /* renamed from: w */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f38946w = C14344d.f38961b;

    /* renamed from: x */
    private static final Function3<String, JSONObject, ly0, JSONObject> f38947x = C14345e.f38962b;

    /* renamed from: y */
    private static final Function3<String, JSONObject, ly0, f50<Uri>> f38948y = C14346f.f38963b;

    /* renamed from: z */
    private static final Function3<String, JSONObject, ly0, f50<Uri>> f38949z = C14347g.f38964b;

    /* renamed from: a */
    public final v60<g20> f38950a;

    /* renamed from: b */
    public final v60<String> f38951b;

    /* renamed from: c */
    public final v60<f50<Integer>> f38952c;

    /* renamed from: d */
    public final v60<JSONObject> f38953d;

    /* renamed from: e */
    public final v60<f50<Uri>> f38954e;

    /* renamed from: f */
    public final v60<f50<Uri>> f38955f;

    /* renamed from: g */
    public final v60<f50<Integer>> f38956g;

    /* renamed from: h */
    public final v60<f50<Integer>> f38957h;

    /* renamed from: com.yandex.mobile.ads.impl.q10$a */
    static final class C14341a extends Lambda implements Function2<ly0, JSONObject, q10> {

        /* renamed from: b */
        public static final C14341a f38958b = new C14341a();

        C14341a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new q10(ly0, (q10) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q10$b */
    static final class C14342b extends Lambda implements Function3<String, JSONObject, ly0, f20> {

        /* renamed from: b */
        public static final C14342b f38959b = new C14342b();

        C14342b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            f20.C13024b bVar = f20.f33208a;
            return (f20) zh0.m44622b(jSONObject, str, f20.f33211d, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q10$c */
    static final class C14343c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C14343c f38960b = new C14343c();

        C14343c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44608a(jSONObject, str, q10.f38937n, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, LOG_ID_VALIDATOR, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q10$d */
    static final class C14344d extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14344d f38961b = new C14344d();

        C14344d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), q10.f38939p, ly0.mo66818b(), q10.f38933j, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q10$e */
    static final class C14345e extends Lambda implements Function3<String, JSONObject, ly0, JSONObject> {

        /* renamed from: b */
        public static final C14345e f38962b = new C14345e();

        C14345e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return (JSONObject) zh0.m44624b(jSONObject, str, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q10$f */
    static final class C14346f extends Lambda implements Function3<String, JSONObject, ly0, f50<Uri>> {

        /* renamed from: b */
        public static final C14346f f38963b = new C14346f();

        C14346f() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44621b(jSONObject, str, ky0.m38516f(), ly0.mo66818b(), ly0, dg1.f32577e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q10$g */
    static final class C14347g extends Lambda implements Function3<String, JSONObject, ly0, f50<Uri>> {

        /* renamed from: b */
        public static final C14347g f38964b = new C14347g();

        C14347g() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44621b(jSONObject, str, ky0.m38516f(), ly0.mo66818b(), ly0, dg1.f32577e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q10$h */
    static final class C14348h extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14348h f38965b = new C14348h();

        C14348h() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), q10.f38941r, ly0.mo66818b(), q10.f38934k, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q10$i */
    static final class C14349i extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14349i f38966b = new C14349i();

        C14349i() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), q10.f38943t, ly0.mo66818b(), q10.f38935l, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q10$j */
    public static final class C14350j {
        private C14350j() {
        }

        public /* synthetic */ C14350j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, q10> mo69470a() {
            return q10.f38931C;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f38933j = aVar.mo66929a(1);
        f38934k = aVar.mo66929a(800);
        f38935l = aVar.mo66929a(50);
    }

    public q10(ly0 ly0, q10 q10, boolean z, JSONObject jSONObject) {
        v60<g20> v60;
        v60<String> v602;
        v60<f50<Integer>> v603;
        v60<JSONObject> v604;
        v60<f50<Uri>> v605;
        v60<f50<Uri>> v606;
        v60<f50<Integer>> v607;
        v60<f50<Integer>> v608;
        q10 q102 = q10;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (q102 == null) {
            v60 = null;
        } else {
            v60 = q102.f38950a;
        }
        v60<g20> b2 = di0.m35297b(jSONObject, "download_callbacks", z, v60, g20.f33849c.mo67176a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f38950a = b2;
        if (q102 == null) {
            v602 = null;
        } else {
            v602 = q102.f38951b;
        }
        v60<String> a = di0.m35278a(jSONObject, "log_id", z, v602, f38936m, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"log_id\"…E_VALIDATOR, logger, env)");
        this.f38951b = a;
        if (q102 == null) {
            v603 = null;
        } else {
            v603 = q102.f38952c;
        }
        Function1<Number, Integer> d = ky0.m38514d();
        rh1<Integer> rh1 = f38938o;
        cg1<Integer> cg1 = dg1.f32574b;
        v60<f50<f50<Integer>>> b3 = di0.m35295b(jSONObject, "log_limit", z, v603, d, rh1, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f38952c = b3;
        if (q102 == null) {
            v604 = null;
        } else {
            v604 = q102.f38953d;
        }
        v60<JSONObject> b4 = di0.m35290b(jSONObject, "payload", z, v604, b, ly0);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalField(json, …nt?.payload, logger, env)");
        this.f38953d = b4;
        if (q102 == null) {
            v605 = null;
        } else {
            v605 = q102.f38954e;
        }
        Function1<String, Uri> f = ky0.m38516f();
        cg1<Uri> cg12 = dg1.f32577e;
        v60<f50<f50<Uri>>> b5 = di0.m35293b(jSONObject, "referer", z, v605, f, b, ly0, cg12);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f38954e = b5;
        if (q102 == null) {
            v606 = null;
        } else {
            v606 = q102.f38955f;
        }
        v60<f50<f50<Uri>>> b6 = di0.m35293b(jSONObject, "url", z, v606, ky0.m38516f(), b, ly0, cg12);
        Intrinsics.checkNotNullExpressionValue(b6, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f38955f = b6;
        if (q102 == null) {
            v607 = null;
        } else {
            v607 = q102.f38956g;
        }
        String str = "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)";
        v60<f50<f50<Integer>>> b7 = di0.m35295b(jSONObject, "visibility_duration", z, v607, ky0.m38514d(), f38940q, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b7, str);
        this.f38956g = b7;
        if (q102 == null) {
            v608 = null;
        } else {
            v608 = q102.f38957h;
        }
        v60<f50<f50<Integer>>> b8 = di0.m35295b(jSONObject, "visibility_percentage", z, v608, ky0.m38514d(), f38942s, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b8, str);
        this.f38957h = b8;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m41044a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m41047b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m41050c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m41052d(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m41054e(int i) {
        return i > 0 && i <= 100;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m41056f(int i) {
        return i > 0 && i <= 100;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f20 f20 = (f20) w60.m43545e(this.f38950a, ly0, "download_callbacks", jSONObject, f38944u);
        String str = (String) w60.m43539a(this.f38951b, ly0, "log_id", jSONObject, f38945v);
        f50<Integer> d = w60.m43544d(this.f38952c, ly0, "log_limit", jSONObject, f38946w);
        if (d == null) {
            d = f38933j;
        }
        f50<Integer> f50 = d;
        JSONObject jSONObject2 = (JSONObject) w60.m43543c(this.f38953d, ly0, "payload", jSONObject, f38947x);
        f50<T> d2 = w60.m43544d(this.f38954e, ly0, "referer", jSONObject, f38948y);
        f50<T> d3 = w60.m43544d(this.f38955f, ly0, "url", jSONObject, f38949z);
        f50<Integer> d4 = w60.m43544d(this.f38956g, ly0, "visibility_duration", jSONObject, f38929A);
        if (d4 == null) {
            d4 = f38934k;
        }
        f50<Integer> f502 = d4;
        f50<Integer> d5 = w60.m43544d(this.f38957h, ly0, "visibility_percentage", jSONObject, f38930B);
        if (d5 == null) {
            d5 = f38935l;
        }
        return new m10(f20, str, f50, jSONObject2, d2, d3, f502, d5);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m41048b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m41045a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
