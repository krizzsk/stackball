package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.qn */
public class C14397qn implements qh0, ci0<C14298pn> {

    /* renamed from: b */
    public static final C14400c f39184b = new C14400c((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final rh1<Double> f39185c = $$Lambda$qn$a40QBqW2xNsPN96Eu8yj4TuqYGA.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<Double> f39186d = $$Lambda$qn$RQYPMRPXjkXK1ysLnT85AWFQuZE.INSTANCE;

    /* renamed from: e */
    private static final Function3<String, JSONObject, ly0, f50<Double>> f39187e = C14399b.f39191b;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Function2<ly0, JSONObject, C14397qn> f39188f = C14398a.f39190b;

    /* renamed from: a */
    public final v60<f50<Double>> f39189a;

    /* renamed from: com.yandex.mobile.ads.impl.qn$a */
    static final class C14398a extends Lambda implements Function2<ly0, JSONObject, C14397qn> {

        /* renamed from: b */
        public static final C14398a f39190b = new C14398a();

        C14398a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14397qn(ly0, (C14397qn) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qn$b */
    static final class C14399b extends Lambda implements Function3<String, JSONObject, ly0, f50<Double>> {

        /* renamed from: b */
        public static final C14399b f39191b = new C14399b();

        C14399b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            f50 a = zh0.m44600a(jSONObject, str, (Function1) ky0.m38513c(), C14397qn.f39186d, ly0.mo66818b(), (cg1) dg1.f32576d);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, key… env, TYPE_HELPER_DOUBLE)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qn$c */
    public static final class C14400c {
        private C14400c() {
        }

        public /* synthetic */ C14400c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14397qn> mo69623a() {
            return C14397qn.f39188f;
        }
    }

    public C14397qn(ly0 ly0, C14397qn qnVar, boolean z, JSONObject jSONObject) {
        v60<f50<Double>> v60;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (qnVar == null) {
            v60 = null;
        } else {
            v60 = qnVar.f39189a;
        }
        v60<f50<f50<Double>>> a = di0.m35284a(jSONObject, "ratio", z, v60, ky0.m38513c(), f39185c, b, ly0, dg1.f32576d);
        Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(… env, TYPE_HELPER_DOUBLE)");
        this.f39189a = a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m41296a(double d) {
        return d > 0.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m41298b(double d) {
        return d > 0.0d;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C14298pn(w60.m43541b(this.f39189a, ly0, "ratio", jSONObject, f39187e));
    }
}
