package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.pn */
public class C14298pn implements qh0 {

    /* renamed from: b */
    public static final C14300b f38745b = new C14300b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final rh1<Double> f38746c = $$Lambda$pn$YX9tr2MrGrWqSpSvUoar3VBzpTQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function2<ly0, JSONObject, C14298pn> f38747d = C14299a.f38749b;

    /* renamed from: a */
    public final f50<Double> f38748a;

    /* renamed from: com.yandex.mobile.ads.impl.pn$a */
    static final class C14299a extends Lambda implements Function2<ly0, JSONObject, C14298pn> {

        /* renamed from: b */
        public static final C14299a f38749b = new C14299a();

        C14299a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14300b bVar = C14298pn.f38745b;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            f50 a = zh0.m44600a(jSONObject, "ratio", (Function1) ky0.m38513c(), C14298pn.f38746c, ly0.mo66818b(), (cg1) dg1.f32576d);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, \"ra… env, TYPE_HELPER_DOUBLE)");
            return new C14298pn(a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pn$b */
    public static final class C14300b {
        private C14300b() {
        }

        public /* synthetic */ C14300b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        $$Lambda$pn$woQCVzsXAObijtH1zcfwAl4yn4 r0 = $$Lambda$pn$woQCVzsXAObijtH1zcfwAl4yn4.INSTANCE;
    }

    public C14298pn(f50<Double> f50) {
        Intrinsics.checkNotNullParameter(f50, "ratio");
        this.f38748a = f50;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m40875a(double d) {
        return d > 0.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m40877b(double d) {
        return d > 0.0d;
    }
}
