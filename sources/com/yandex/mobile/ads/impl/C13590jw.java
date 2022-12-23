package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.jw */
public class C13590jw implements qh0 {

    /* renamed from: b */
    public static final C13592b f35651b = new C13592b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final rh1<Double> f35652c = $$Lambda$jw$5Zfiow230Vb8MKOEVh7hPODYzUk.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function2<ly0, JSONObject, C13590jw> f35653d = C13591a.f35655b;

    /* renamed from: a */
    public final f50<Double> f35654a;

    /* renamed from: com.yandex.mobile.ads.impl.jw$a */
    static final class C13591a extends Lambda implements Function2<ly0, JSONObject, C13590jw> {

        /* renamed from: b */
        public static final C13591a f35655b = new C13591a();

        C13591a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13592b bVar = C13590jw.f35651b;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            f50 a = zh0.m44600a(jSONObject, "value", (Function1) ky0.m38513c(), C13590jw.f35652c, ly0.mo66818b(), (cg1) dg1.f32576d);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, \"va… env, TYPE_HELPER_DOUBLE)");
            return new C13590jw(a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jw$b */
    public static final class C13592b {
        private C13592b() {
        }

        public /* synthetic */ C13592b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        $$Lambda$jw$Lbf1SBfQZ6Xco4qW9PpGGP6Oxo r0 = $$Lambda$jw$Lbf1SBfQZ6Xco4qW9PpGGP6Oxo.INSTANCE;
    }

    public C13590jw(f50<Double> f50) {
        Intrinsics.checkNotNullParameter(f50, "value");
        this.f35654a = f50;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38048a(double d) {
        return d > 0.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38050b(double d) {
        return d > 0.0d;
    }
}
