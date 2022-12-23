package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.rc */
public class C14452rc implements qh0 {

    /* renamed from: c */
    public static final C14454b f39429c = new C14454b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f39430d = $$Lambda$rc$PffBGVwNRskIKW832AO52V4cefA.INSTANCE;

    /* renamed from: a */
    public final String f39431a;

    /* renamed from: b */
    public final boolean f39432b;

    /* renamed from: com.yandex.mobile.ads.impl.rc$a */
    static final class C14453a extends Lambda implements Function2<ly0, JSONObject, C14452rc> {

        /* renamed from: b */
        public static final C14453a f39433b = new C14453a();

        C14453a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C14452rc.f39429c.mo69751a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rc$b */
    public static final class C14454b {
        private C14454b() {
        }

        public /* synthetic */ C14454b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C14452rc mo69751a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Object a = zh0.m44608a(jSONObject, "name", C14452rc.f39430d, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"name\", NAME_VALIDATOR, logger, env)");
            Object a2 = zh0.m44609a(jSONObject, "value", ky0.m38512b(), b, ly0);
            Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"value\", NUMB…_TO_BOOLEAN, logger, env)");
            return new C14452rc((String) a, ((Boolean) a2).booleanValue());
        }
    }

    static {
        $$Lambda$rc$Jn2_g8clZAtIyfGxy0ajAM0_OQ r0 = $$Lambda$rc$Jn2_g8clZAtIyfGxy0ajAM0_OQ.INSTANCE;
        C14453a aVar = C14453a.f39433b;
    }

    public C14452rc(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f39431a = str;
        this.f39432b = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m41561b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m41560a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
