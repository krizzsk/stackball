package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ig */
public class C13409ig implements qh0 {

    /* renamed from: c */
    public static final C13411b f34849c = new C13411b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f34850d = $$Lambda$ig$sWBhN9MbW30BNsrqq_amv34y6wc.INSTANCE;

    /* renamed from: a */
    public final String f34851a;

    /* renamed from: b */
    public final int f34852b;

    /* renamed from: com.yandex.mobile.ads.impl.ig$a */
    static final class C13410a extends Lambda implements Function2<ly0, JSONObject, C13409ig> {

        /* renamed from: b */
        public static final C13410a f34853b = new C13410a();

        C13410a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C13409ig.f34849c.mo67781a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ig$b */
    public static final class C13411b {
        private C13411b() {
        }

        public /* synthetic */ C13411b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C13409ig mo67781a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Object a = zh0.m44608a(jSONObject, "name", C13409ig.f34850d, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"name\", NAME_VALIDATOR, logger, env)");
            Object a2 = zh0.m44609a(jSONObject, "value", ky0.m38515e(), b, ly0);
            Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"value\", STRI…O_COLOR_INT, logger, env)");
            return new C13409ig((String) a, ((Number) a2).intValue());
        }
    }

    static {
        $$Lambda$ig$z5Rd6SbpnT9owtsXhtWwdSAS0 r0 = $$Lambda$ig$z5Rd6SbpnT9owtsXhtWwdSAS0.INSTANCE;
        C13410a aVar = C13410a.f34853b;
    }

    public C13409ig(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f34851a = str;
        this.f34852b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m37360b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m37359a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
