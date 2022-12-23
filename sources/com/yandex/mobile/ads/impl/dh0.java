package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class dh0 implements qh0 {

    /* renamed from: c */
    public static final C12890b f32582c = new C12890b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f32583d = $$Lambda$dh0$bLHQ_StuphilUz2L0ryZPrDYE8A.INSTANCE;

    /* renamed from: a */
    public final String f32584a;

    /* renamed from: b */
    public final int f32585b;

    /* renamed from: com.yandex.mobile.ads.impl.dh0$a */
    static final class C12889a extends Lambda implements Function2<ly0, JSONObject, dh0> {

        /* renamed from: b */
        public static final C12889a f32586b = new C12889a();

        C12889a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return dh0.f32582c.mo66585a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dh0$b */
    public static final class C12890b {
        private C12890b() {
        }

        public /* synthetic */ C12890b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final dh0 mo66585a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Object a = zh0.m44608a(jSONObject, "name", dh0.f32583d, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"name\", NAME_VALIDATOR, logger, env)");
            Object a2 = zh0.m44609a(jSONObject, "value", ky0.m38514d(), b, ly0);
            Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"value\", NUMBER_TO_INT, logger, env)");
            return new dh0((String) a, ((Number) a2).intValue());
        }
    }

    static {
        $$Lambda$dh0$vUKWqefevXGY12rq49VGW2UTA5c r0 = $$Lambda$dh0$vUKWqefevXGY12rq49VGW2UTA5c.INSTANCE;
        C12889a aVar = C12889a.f32586b;
    }

    public dh0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f32584a = str;
        this.f32585b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m35272b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m35271a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
