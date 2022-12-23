package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C13215gn;
import com.yandex.mobile.ads.impl.C13332hn;
import com.yandex.mobile.ads.impl.C14709tt;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.gt */
public class C13237gt implements qh0, ci0<C13133ft> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Double> f34118g;

    /* renamed from: h */
    private static final f50<C13215gn> f34119h;

    /* renamed from: i */
    private static final f50<C13332hn> f34120i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<Boolean> f34121j;

    /* renamed from: k */
    private static final f50<C14709tt> f34122k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final cg1<C13215gn> f34123l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final cg1<C13332hn> f34124m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final cg1<C14709tt> f34125n;

    /* renamed from: o */
    private static final rh1<Double> f34126o = $$Lambda$gt$GAgXwCMCP6Bp8k5PVliSOtxeA.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final rh1<Double> f34127p = $$Lambda$gt$W0axYnd4pKf3CdCDYf6LMIgPibo.INSTANCE;

    /* renamed from: q */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f34128q = C13238a.f34140b;

    /* renamed from: r */
    private static final Function3<String, JSONObject, ly0, f50<C13215gn>> f34129r = C13239b.f34141b;

    /* renamed from: s */
    private static final Function3<String, JSONObject, ly0, f50<C13332hn>> f34130s = C13240c.f34142b;

    /* renamed from: t */
    private static final Function3<String, JSONObject, ly0, f50<Uri>> f34131t = C13242e.f34144b;

    /* renamed from: u */
    private static final Function3<String, JSONObject, ly0, f50<Boolean>> f34132u = C13243f.f34145b;

    /* renamed from: v */
    private static final Function3<String, JSONObject, ly0, f50<C14709tt>> f34133v = C13244g.f34146b;

    /* renamed from: a */
    public final v60<f50<Double>> f34134a;

    /* renamed from: b */
    public final v60<f50<C13215gn>> f34135b;

    /* renamed from: c */
    public final v60<f50<C13332hn>> f34136c;

    /* renamed from: d */
    public final v60<f50<Uri>> f34137d;

    /* renamed from: e */
    public final v60<f50<Boolean>> f34138e;

    /* renamed from: f */
    public final v60<f50<C14709tt>> f34139f;

    /* renamed from: com.yandex.mobile.ads.impl.gt$a */
    static final class C13238a extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C13238a f34140b = new C13238a();

        C13238a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38513c(), C13237gt.f34127p, ly0.mo66818b(), C13237gt.f34118g, (cg1) dg1.f32576d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt$b */
    static final class C13239b extends Lambda implements Function3<String, JSONObject, ly0, f50<C13215gn>> {

        /* renamed from: b */
        public static final C13239b f34141b = new C13239b();

        C13239b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C13215gn.C13217b bVar = C13215gn.f34045c;
            return zh0.m44621b(jSONObject, str, C13215gn.f34046d, ly0.mo66818b(), ly0, C13237gt.f34123l);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt$c */
    static final class C13240c extends Lambda implements Function3<String, JSONObject, ly0, f50<C13332hn>> {

        /* renamed from: b */
        public static final C13240c f34142b = new C13240c();

        C13240c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C13332hn.C13334b bVar = C13332hn.f34465c;
            return zh0.m44621b(jSONObject, str, C13332hn.f34466d, ly0.mo66818b(), ly0, C13237gt.f34124m);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt$d */
    static final class C13241d extends Lambda implements Function2<ly0, JSONObject, C13237gt> {

        /* renamed from: b */
        public static final C13241d f34143b = new C13241d();

        C13241d() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13237gt(ly0, (C13237gt) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt$e */
    static final class C13242e extends Lambda implements Function3<String, JSONObject, ly0, f50<Uri>> {

        /* renamed from: b */
        public static final C13242e f34144b = new C13242e();

        C13242e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            f50<Uri> a = zh0.m44598a(jSONObject, str, ky0.m38516f(), ly0.mo66818b(), ly0, dg1.f32577e);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, key…er, env, TYPE_HELPER_URI)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt$f */
    static final class C13243f extends Lambda implements Function3<String, JSONObject, ly0, f50<Boolean>> {

        /* renamed from: b */
        public static final C13243f f34145b = new C13243f();

        C13243f() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44599a(jSONObject, str, ky0.m38512b(), ly0.mo66818b(), ly0, C13237gt.f34121j, dg1.f32573a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt$g */
    static final class C13244g extends Lambda implements Function3<String, JSONObject, ly0, f50<C14709tt>> {

        /* renamed from: b */
        public static final C13244g f34146b = new C13244g();

        C13244g() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14709tt.C14711b bVar = C14709tt.f40453c;
            return zh0.m44621b(jSONObject, str, C14709tt.f40454d, ly0.mo66818b(), ly0, C13237gt.f34125n);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt$h */
    static final class C13245h extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13245h f34147b = new C13245h();

        C13245h() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13215gn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt$i */
    static final class C13246i extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13246i f34148b = new C13246i();

        C13246i() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13332hn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt$j */
    static final class C13247j extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13247j f34149b = new C13247j();

        C13247j() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C14709tt);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gt$k */
    static final class C13248k extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13248k f34150b = new C13248k();

        C13248k() {
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
        f34118g = aVar.mo66929a(Double.valueOf(1.0d));
        f34119h = aVar.mo66929a(C13215gn.CENTER);
        f34120i = aVar.mo66929a(C13332hn.CENTER);
        f34121j = aVar.mo66929a(Boolean.FALSE);
        f34122k = aVar.mo66929a(C14709tt.FILL);
        cg1.C12733a aVar2 = cg1.f31917a;
        f34123l = aVar2.mo66293a(ArraysKt.first((T[]) C13215gn.values()), C13245h.f34147b);
        f34124m = aVar2.mo66293a(ArraysKt.first((T[]) C13332hn.values()), C13246i.f34148b);
        f34125n = aVar2.mo66293a(ArraysKt.first((T[]) C14709tt.values()), C13247j.f34149b);
        C13248k kVar = C13248k.f34150b;
        C13241d dVar = C13241d.f34143b;
    }

    public C13237gt(ly0 ly0, C13237gt gtVar, boolean z, JSONObject jSONObject) {
        v60<f50<Double>> v60;
        v60<f50<C13215gn>> v602;
        v60<f50<C13332hn>> v603;
        v60<f50<Uri>> v604;
        v60<f50<Boolean>> v605;
        v60<f50<C14709tt>> v606;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (gtVar == null) {
            v60 = null;
        } else {
            v60 = gtVar.f34134a;
        }
        v60<f50<f50<Double>>> b2 = di0.m35295b(jSONObject, "alpha", z, v60, ky0.m38513c(), f34126o, b, ly0, dg1.f32576d);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f34134a = b2;
        if (gtVar == null) {
            v602 = null;
        } else {
            v602 = gtVar.f34135b;
        }
        v60<f50<f50<C13215gn>>> b3 = di0.m35293b(jSONObject, "content_alignment_horizontal", z, v602, C13215gn.f34045c.mo67332a(), b, ly0, f34123l);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp…ENT_ALIGNMENT_HORIZONTAL)");
        this.f34135b = b3;
        if (gtVar == null) {
            v603 = null;
        } else {
            v603 = gtVar.f34136c;
        }
        v60<f50<f50<C13332hn>>> b4 = di0.m35293b(jSONObject, "content_alignment_vertical", z, v603, C13332hn.f34465c.mo67568a(), b, ly0, f34124m);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp…NTENT_ALIGNMENT_VERTICAL)");
        this.f34136c = b4;
        if (gtVar == null) {
            v604 = null;
        } else {
            v604 = gtVar.f34137d;
        }
        v60<f50<f50<Uri>>> a = di0.m35282a(jSONObject, "image_url", z, v604, ky0.m38516f(), b, ly0, dg1.f32577e);
        Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(…er, env, TYPE_HELPER_URI)");
        this.f34137d = a;
        if (gtVar == null) {
            v605 = null;
        } else {
            v605 = gtVar.f34138e;
        }
        v60<f50<f50<Boolean>>> b5 = di0.m35293b(jSONObject, "preload_required", z, v605, ky0.m38512b(), b, ly0, dg1.f32573a);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f34138e = b5;
        if (gtVar == null) {
            v606 = null;
        } else {
            v606 = gtVar.f34139f;
        }
        v60<f50<f50<C14709tt>>> b6 = di0.m35293b(jSONObject, "scale", z, v606, C14709tt.f40453c.mo70232a(), b, ly0, f34125n);
        Intrinsics.checkNotNullExpressionValue(b6, "readOptionalFieldWithExp…, env, TYPE_HELPER_SCALE)");
        this.f34139f = b6;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m36691a(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m36693b(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* renamed from: b */
    public C13133ft mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<Double> d = w60.m43544d(this.f34134a, ly0, "alpha", jSONObject, f34128q);
        if (d == null) {
            d = f34118g;
        }
        f50<Double> f50 = d;
        f50<C13215gn> f502 = (f50) w60.m43543c(this.f34135b, ly0, "content_alignment_horizontal", jSONObject, f34129r);
        if (f502 == null) {
            f502 = f34119h;
        }
        f50<C13215gn> f503 = f502;
        f50<C13332hn> f504 = (f50) w60.m43543c(this.f34136c, ly0, "content_alignment_vertical", jSONObject, f34130s);
        if (f504 == null) {
            f504 = f34120i;
        }
        f50<C13332hn> f505 = f504;
        f50<T> b = w60.m43541b(this.f34137d, ly0, "image_url", jSONObject, f34131t);
        f50<Boolean> d2 = w60.m43544d(this.f34138e, ly0, "preload_required", jSONObject, f34132u);
        if (d2 == null) {
            d2 = f34121j;
        }
        f50<Boolean> f506 = d2;
        f50<C14709tt> f507 = (f50) w60.m43543c(this.f34139f, ly0, "scale", jSONObject, f34133v);
        if (f507 == null) {
            f507 = f34122k;
        }
        return new C13133ft(f50, f503, f505, b, f506, f507);
    }
}
