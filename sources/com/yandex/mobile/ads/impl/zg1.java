package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class zg1 implements qh0 {

    /* renamed from: c */
    public static final C15311b f43114c = new C15311b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f43115d = $$Lambda$zg1$NJpMe9Oc7GOjeVh4hjMd6Zjxn8.INSTANCE;

    /* renamed from: a */
    public final String f43116a;

    /* renamed from: b */
    public final Uri f43117b;

    /* renamed from: com.yandex.mobile.ads.impl.zg1$a */
    static final class C15310a extends Lambda implements Function2<ly0, JSONObject, zg1> {

        /* renamed from: b */
        public static final C15310a f43118b = new C15310a();

        C15310a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return zg1.f43114c.mo71216a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zg1$b */
    public static final class C15311b {
        private C15311b() {
        }

        public /* synthetic */ C15311b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final zg1 mo71216a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Object a = zh0.m44608a(jSONObject, "name", zg1.f43115d, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"name\", NAME_VALIDATOR, logger, env)");
            Object a2 = zh0.m44609a(jSONObject, "value", ky0.m38516f(), b, ly0);
            Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"value\", STRING_TO_URI, logger, env)");
            return new zg1((String) a, (Uri) a2);
        }
    }

    static {
        $$Lambda$zg1$XHck7vmQbXO4gug8CUYqCmLIoo8 r0 = $$Lambda$zg1$XHck7vmQbXO4gug8CUYqCmLIoo8.INSTANCE;
        C15310a aVar = C15310a.f43118b;
    }

    public zg1(String str, Uri uri) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(uri, "value");
        this.f43116a = str;
        this.f43117b = uri;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m44595b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m44594a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
