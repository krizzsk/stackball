package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.fy */
public class C13148fy implements qh0 {

    /* renamed from: b */
    public static final C13150b f33775b = new C13150b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final f50<Integer> f33776a;

    /* renamed from: com.yandex.mobile.ads.impl.fy$a */
    static final class C13149a extends Lambda implements Function2<ly0, JSONObject, C13148fy> {

        /* renamed from: b */
        public static final C13149a f33777b = new C13149a();

        C13149a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C13148fy.f33775b.mo67097a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fy$b */
    public static final class C13150b {
        private C13150b() {
        }

        public /* synthetic */ C13150b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C13148fy mo67097a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            JSONObject jSONObject2 = jSONObject;
            f50<Integer> a = zh0.m44598a(jSONObject2, "color", ky0.m38515e(), ly0.mo66818b(), ly0, dg1.f32578f);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, \"co…, env, TYPE_HELPER_COLOR)");
            return new C13148fy(a);
        }
    }

    static {
        C13149a aVar = C13149a.f33777b;
    }

    public C13148fy(f50<Integer> f50) {
        Intrinsics.checkNotNullParameter(f50, "color");
        this.f33776a = f50;
    }
}
