package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class x10 implements qh0 {

    /* renamed from: a */
    public static final C15138b f42356a = new C15138b((DefaultConstructorMarker) null);

    /* renamed from: com.yandex.mobile.ads.impl.x10$a */
    static final class C15137a extends Lambda implements Function2<ly0, JSONObject, x10> {

        /* renamed from: b */
        public static final C15137a f42357b = new C15137a();

        C15137a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return x10.f42356a.mo70787a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x10$b */
    public static final class C15138b {
        private C15138b() {
        }

        public /* synthetic */ C15138b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final x10 mo70787a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            return new x10(zh0.m44621b(jSONObject, "constrained", ky0.m38512b(), ly0.mo66818b(), ly0, dg1.f32573a));
        }
    }

    static {
        C15137a aVar = C15137a.f42357b;
    }

    public x10(f50<Boolean> f50) {
    }

    public /* synthetic */ x10(f50 f50, int i) {
        this((f50<Boolean>) null);
    }
}
