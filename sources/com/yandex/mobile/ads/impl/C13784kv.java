package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C15266yr;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.kv */
public class C13784kv implements qh0 {

    /* renamed from: b */
    public static final C13786b f36425b = new C13786b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C15266yr f36426a;

    /* renamed from: com.yandex.mobile.ads.impl.kv$a */
    static final class C13785a extends Lambda implements Function2<ly0, JSONObject, C13784kv> {

        /* renamed from: b */
        public static final C13785a f36427b = new C13785a();

        C13785a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C13784kv.f36425b.mo68277a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kv$b */
    public static final class C13786b {
        private C13786b() {
        }

        public /* synthetic */ C13786b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C13784kv mo68277a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C15266yr.C15269c cVar = C15266yr.f42914c;
            Object a = zh0.m44612a(jSONObject, "neighbour_page_width", C15266yr.f42918g, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"neighbour_pa…ize.CREATOR, logger, env)");
            return new C13784kv((C15266yr) a);
        }
    }

    static {
        C13785a aVar = C13785a.f36427b;
    }

    public C13784kv(C15266yr yrVar) {
        Intrinsics.checkNotNullParameter(yrVar, "neighbourPageWidth");
        this.f36426a = yrVar;
    }
}
