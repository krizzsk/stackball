package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.wr */
public class C15102wr implements qh0 {

    /* renamed from: a */
    public static final C15104b f42202a = new C15104b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final rh1<Integer> f42203b = $$Lambda$wr$4059G5gXQcoUilr9X9asG9OrSlc.INSTANCE;

    /* renamed from: com.yandex.mobile.ads.impl.wr$a */
    static final class C15103a extends Lambda implements Function2<ly0, JSONObject, C15102wr> {

        /* renamed from: b */
        public static final C15103a f42204b = new C15103a();

        C15103a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C15102wr.f42202a.mo70741a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wr$b */
    public static final class C15104b {
        private C15104b() {
        }

        public /* synthetic */ C15104b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C15102wr mo70741a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            JSONObject jSONObject2 = jSONObject;
            f50 a = zh0.m44600a(jSONObject2, "value", (Function1) ky0.m38514d(), C15102wr.f42203b, ly0.mo66818b(), (cg1) dg1.f32574b);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, \"va…er, env, TYPE_HELPER_INT)");
            return new C15102wr(a);
        }
    }

    static {
        $$Lambda$wr$o8HfqQNnPZZoTazVDRgNWNaq5_0 r0 = $$Lambda$wr$o8HfqQNnPZZoTazVDRgNWNaq5_0.INSTANCE;
        C15103a aVar = C15103a.f42204b;
    }

    public C15102wr(f50<Integer> f50) {
        Intrinsics.checkNotNullParameter(f50, "value");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m43784a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m43785b(int i) {
        return i >= 0;
    }
}
