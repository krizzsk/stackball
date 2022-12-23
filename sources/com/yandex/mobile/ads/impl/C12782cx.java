package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C14138nw;
import com.yandex.mobile.ads.impl.f50;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.cx */
public class C12782cx implements qh0, ci0<C12663bx> {

    /* renamed from: e */
    public static final C12788f f32089e = new C12788f((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final f50<Double> f32090f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Integer> f32091g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final f50<Integer> f32092h;

    /* renamed from: i */
    private static final rh1<Double> f32093i = $$Lambda$cx$W6Jf2wQzFl6h_zES1S6CSJkhGMc.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final rh1<Double> f32094j = $$Lambda$cx$0P03X2WQNCCWLxTdwwkCB6h5dIA.INSTANCE;

    /* renamed from: k */
    private static final rh1<Integer> f32095k = $$Lambda$cx$gsky32PYSTFGEpwkDpL53zbsFk.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final rh1<Integer> f32096l = $$Lambda$cx$EraM41ABs7R1TfmiL5uR0abUE.INSTANCE;

    /* renamed from: m */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f32097m = C12783a.f32106b;

    /* renamed from: n */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f32098n = C12784b.f32107b;

    /* renamed from: o */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f32099o = C12785c.f32108b;

    /* renamed from: p */
    private static final Function3<String, JSONObject, ly0, C14138nw> f32100p = C12787e.f32110b;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final Function2<ly0, JSONObject, C12782cx> f32101q = C12786d.f32109b;

    /* renamed from: a */
    public final v60<f50<Double>> f32102a;

    /* renamed from: b */
    public final v60<f50<Integer>> f32103b;

    /* renamed from: c */
    public final v60<f50<Integer>> f32104c;

    /* renamed from: d */
    public final v60<C14228ow> f32105d;

    /* renamed from: com.yandex.mobile.ads.impl.cx$a */
    static final class C12783a extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C12783a f32106b = new C12783a();

        C12783a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38513c(), C12782cx.f32094j, ly0.mo66818b(), C12782cx.f32090f, (cg1) dg1.f32576d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cx$b */
    static final class C12784b extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C12784b f32107b = new C12784b();

        C12784b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C12782cx.f32096l, ly0.mo66818b(), C12782cx.f32091g, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cx$c */
    static final class C12785c extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C12785c f32108b = new C12785c();

        C12785c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44599a(jSONObject, str, ky0.m38515e(), ly0.mo66818b(), ly0, C12782cx.f32092h, dg1.f32578f);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cx$d */
    static final class C12786d extends Lambda implements Function2<ly0, JSONObject, C12782cx> {

        /* renamed from: b */
        public static final C12786d f32109b = new C12786d();

        C12786d() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C12782cx(ly0, (C12782cx) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cx$e */
    static final class C12787e extends Lambda implements Function3<String, JSONObject, ly0, C14138nw> {

        /* renamed from: b */
        public static final C12787e f32110b = new C12787e();

        C12787e() {
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
            Object a = zh0.m44612a(jSONObject, str, C14138nw.f37926d, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, DivPoint.CREATOR, env.logger, env)");
            return (C14138nw) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cx$f */
    public static final class C12788f {
        private C12788f() {
        }

        public /* synthetic */ C12788f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C12782cx> mo66356a() {
            return C12782cx.f32101q;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f32090f = aVar.mo66929a(Double.valueOf(0.19d));
        f32091g = aVar.mo66929a(2);
        f32092h = aVar.mo66929a(0);
    }

    public C12782cx(ly0 ly0, C12782cx cxVar, boolean z, JSONObject jSONObject) {
        v60<f50<Double>> v60;
        v60<f50<Integer>> v602;
        v60<f50<Integer>> v603;
        v60<C14228ow> v604;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (cxVar == null) {
            v60 = null;
        } else {
            v60 = cxVar.f32102a;
        }
        v60<f50<f50<Double>>> b2 = di0.m35295b(jSONObject, "alpha", z, v60, ky0.m38513c(), f32093i, b, ly0, dg1.f32576d);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp… env, TYPE_HELPER_DOUBLE)");
        this.f32102a = b2;
        if (cxVar == null) {
            v602 = null;
        } else {
            v602 = cxVar.f32103b;
        }
        v60<f50<f50<Integer>>> b3 = di0.m35295b(jSONObject, "blur", z, v602, ky0.m38514d(), f32095k, b, ly0, dg1.f32574b);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f32103b = b3;
        if (cxVar == null) {
            v603 = null;
        } else {
            v603 = cxVar.f32104c;
        }
        v60<f50<f50<Integer>>> b4 = di0.m35293b(jSONObject, "color", z, v603, ky0.m38515e(), b, ly0, dg1.f32578f);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp…, env, TYPE_HELPER_COLOR)");
        this.f32104c = b4;
        if (cxVar == null) {
            v604 = null;
        } else {
            v604 = cxVar.f32105d;
        }
        v60<C14228ow> a = di0.m35286a(jSONObject, "offset", z, v604, C14228ow.f38395c.mo69276a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"offset\"…ate.CREATOR, logger, env)");
        this.f32105d = a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34864a(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34865a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34867b(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34868b(int i) {
        return i >= 0;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<Double> d = w60.m43544d(this.f32102a, ly0, "alpha", jSONObject, f32097m);
        if (d == null) {
            d = f32090f;
        }
        f50<Integer> d2 = w60.m43544d(this.f32103b, ly0, "blur", jSONObject, f32098n);
        if (d2 == null) {
            d2 = f32091g;
        }
        f50<Integer> d3 = w60.m43544d(this.f32104c, ly0, "color", jSONObject, f32099o);
        if (d3 == null) {
            d3 = f32092h;
        }
        return new C12663bx(d, d2, d3, (C14138nw) w60.m43546f(this.f32105d, ly0, "offset", jSONObject, f32100p));
    }
}
