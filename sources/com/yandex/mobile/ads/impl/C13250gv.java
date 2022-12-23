package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.gv */
public class C13250gv implements qh0 {

    /* renamed from: b */
    public static final C13252b f34155b = new C13252b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final rh1<Double> f34156c = $$Lambda$gv$AtwtZXviyOvkQ_MQnXRN_jdcFQw.INSTANCE;

    /* renamed from: a */
    public final f50<Double> f34157a;

    /* renamed from: com.yandex.mobile.ads.impl.gv$a */
    static final class C13251a extends Lambda implements Function2<ly0, JSONObject, C13250gv> {

        /* renamed from: b */
        public static final C13251a f34158b = new C13251a();

        C13251a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C13250gv.f34155b.mo67353a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gv$b */
    public static final class C13252b {
        private C13252b() {
        }

        public /* synthetic */ C13252b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C13250gv mo67353a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            return new C13250gv(zh0.m44601a(jSONObject, "weight", (Function1) ky0.m38513c(), C13250gv.f34156c, ly0.mo66818b(), (f50) null, (cg1) dg1.f32576d));
        }
    }

    static {
        $$Lambda$gv$EaKeGpsONeXdnKdcxjjKgOuKaL8 r0 = $$Lambda$gv$EaKeGpsONeXdnKdcxjjKgOuKaL8.INSTANCE;
        C13251a aVar = C13251a.f34158b;
    }

    public C13250gv() {
        this((f50) null, 1);
    }

    public C13250gv(f50<Double> f50) {
        this.f34157a = f50;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m36703a(double d) {
        return d > 0.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m36704b(double d) {
        return d > 0.0d;
    }

    public /* synthetic */ C13250gv(f50 f50, int i) {
        this((f50<Double>) null);
    }
}
