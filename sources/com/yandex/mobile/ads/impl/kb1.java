package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class kb1 implements qh0 {

    /* renamed from: c */
    public static final C13697b f36086c = new C13697b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f36087d = $$Lambda$kb1$EuJ2R3Ir4o6sFje_3TdVzj0fgcc.INSTANCE;

    /* renamed from: a */
    public final String f36088a;

    /* renamed from: b */
    public final String f36089b;

    /* renamed from: com.yandex.mobile.ads.impl.kb1$a */
    static final class C13696a extends Lambda implements Function2<ly0, JSONObject, kb1> {

        /* renamed from: b */
        public static final C13696a f36090b = new C13696a();

        C13696a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return kb1.f36086c.mo68197a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kb1$b */
    public static final class C13697b {
        private C13697b() {
        }

        public /* synthetic */ C13697b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final kb1 mo68197a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Object a = zh0.m44608a(jSONObject, "name", kb1.f36087d, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"name\", NAME_VALIDATOR, logger, env)");
            Object a2 = zh0.m44607a(jSONObject, "value", b, ly0);
            Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"value\", logger, env)");
            return new kb1((String) a, (String) a2);
        }
    }

    static {
        $$Lambda$kb1$lW003Q0jrLmIe_d31J1wSle6jk r0 = $$Lambda$kb1$lW003Q0jrLmIe_d31J1wSle6jk.INSTANCE;
        C13696a aVar = C13696a.f36090b;
    }

    public kb1(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "value");
        this.f36088a = str;
        this.f36089b = str2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38290b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38289a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
