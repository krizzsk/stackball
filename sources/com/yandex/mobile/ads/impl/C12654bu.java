package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.bu */
public class C12654bu implements qh0 {

    /* renamed from: a */
    public static final C12656b f31579a = new C12656b((DefaultConstructorMarker) null);

    /* renamed from: com.yandex.mobile.ads.impl.bu$a */
    static final class C12655a extends Lambda implements Function2<ly0, JSONObject, C12654bu> {

        /* renamed from: b */
        public static final C12655a f31580b = new C12655a();

        C12655a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C12656b bVar = C12654bu.f31579a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ly0.mo66818b();
            return new C12654bu();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bu$b */
    public static final class C12656b {
        private C12656b() {
        }

        public /* synthetic */ C12656b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C12655a aVar = C12655a.f31580b;
    }
}
