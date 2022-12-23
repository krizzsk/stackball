package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13590jw;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.mv */
public class C14018mv implements qh0 {

    /* renamed from: b */
    public static final C14020b f37524b = new C14020b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C13590jw f37525a;

    /* renamed from: com.yandex.mobile.ads.impl.mv$a */
    static final class C14019a extends Lambda implements Function2<ly0, JSONObject, C14018mv> {

        /* renamed from: b */
        public static final C14019a f37526b = new C14019a();

        C14019a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C14018mv.f37524b.mo68858a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mv$b */
    public static final class C14020b {
        private C14020b() {
        }

        public /* synthetic */ C14020b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C14018mv mo68858a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C13590jw.C13592b bVar = C13590jw.f35651b;
            Object a = zh0.m44612a(jSONObject, "page_width", C13590jw.f35653d, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"page_width\",…ize.CREATOR, logger, env)");
            return new C14018mv((C13590jw) a);
        }
    }

    static {
        C14019a aVar = C14019a.f37526b;
    }

    public C14018mv(C13590jw jwVar) {
        Intrinsics.checkNotNullParameter(jwVar, "pageWidth");
        this.f37525a = jwVar;
    }
}
