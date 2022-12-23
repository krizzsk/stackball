package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class yv0 implements qh0 {

    /* renamed from: c */
    public static final C15280b f42968c = new C15280b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f42969d = $$Lambda$yv0$iQwxlOfBmYhO37gZXVl2jKUtVQg.INSTANCE;

    /* renamed from: a */
    public final String f42970a;

    /* renamed from: b */
    public final double f42971b;

    /* renamed from: com.yandex.mobile.ads.impl.yv0$a */
    static final class C15279a extends Lambda implements Function2<ly0, JSONObject, yv0> {

        /* renamed from: b */
        public static final C15279a f42972b = new C15279a();

        C15279a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return yv0.f42968c.mo71131a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yv0$b */
    public static final class C15280b {
        private C15280b() {
        }

        public /* synthetic */ C15280b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final yv0 mo71131a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Object a = zh0.m44608a(jSONObject, "name", yv0.f42969d, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"name\", NAME_VALIDATOR, logger, env)");
            Object a2 = zh0.m44609a(jSONObject, "value", ky0.m38513c(), b, ly0);
            Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"value\", NUMBER_TO_DOUBLE, logger, env)");
            return new yv0((String) a, ((Number) a2).doubleValue());
        }
    }

    static {
        $$Lambda$yv0$jIyOQPwtmOiXoUcIsAXmSZjcgKM r0 = $$Lambda$yv0$jIyOQPwtmOiXoUcIsAXmSZjcgKM.INSTANCE;
        C15279a aVar = C15279a.f42972b;
    }

    public yv0(String str, double d) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f42970a = str;
        this.f42971b = d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m44441b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m44440a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
