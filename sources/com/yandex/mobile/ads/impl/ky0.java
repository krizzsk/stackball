package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

public final class ky0 {

    /* renamed from: a */
    private static final Function1<Boolean, Integer> f36449a = C13798a.f36456b;

    /* renamed from: b */
    private static final Function1<String, Integer> f36450b = C13803f.f36461b;

    /* renamed from: c */
    private static final Function1<String, Uri> f36451c = C13804g.f36462b;

    /* renamed from: d */
    private static final Function1<Number, Boolean> f36452d = C13800c.f36458b;

    /* renamed from: e */
    private static final Function1<Number, Double> f36453e = C13801d.f36459b;

    /* renamed from: f */
    private static final Function1<Number, Integer> f36454f = C13802e.f36460b;

    /* renamed from: g */
    public static final /* synthetic */ int f36455g = 0;

    /* renamed from: com.yandex.mobile.ads.impl.ky0$a */
    static final class C13798a extends Lambda implements Function1<Boolean, Integer> {

        /* renamed from: b */
        public static final C13798a f36456b = new C13798a();

        C13798a() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ky0$b */
    static final class C13799b extends Lambda implements Function1<Integer, String> {

        /* renamed from: b */
        public static final C13799b f36457b = new C13799b();

        C13799b() {
            super(1);
        }

        public Object invoke(Object obj) {
            String hexString = Integer.toHexString(((Number) obj).intValue());
            Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(value)");
            return Intrinsics.stringPlus("#", StringsKt.padStart(hexString, 8, '0'));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ky0$c */
    static final class C13800c extends Lambda implements Function1<Number, Boolean> {

        /* renamed from: b */
        public static final C13800c f36458b = new C13800c();

        C13800c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Number number = (Number) obj;
            Intrinsics.checkNotNullParameter(number, "n");
            int i = ky0.f36455g;
            Intrinsics.checkNotNullParameter(number, "<this>");
            int intValue = number.intValue();
            if (intValue == 0) {
                return Boolean.FALSE;
            }
            if (intValue != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ky0$d */
    static final class C13801d extends Lambda implements Function1<Number, Double> {

        /* renamed from: b */
        public static final C13801d f36459b = new C13801d();

        C13801d() {
            super(1);
        }

        public Object invoke(Object obj) {
            Number number = (Number) obj;
            Intrinsics.checkNotNullParameter(number, "n");
            return Double.valueOf(number.doubleValue());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ky0$e */
    static final class C13802e extends Lambda implements Function1<Number, Integer> {

        /* renamed from: b */
        public static final C13802e f36460b = new C13802e();

        C13802e() {
            super(1);
        }

        public Object invoke(Object obj) {
            Number number = (Number) obj;
            Intrinsics.checkNotNullParameter(number, "n");
            return Integer.valueOf(number.intValue());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ky0$f */
    static final class C13803f extends Lambda implements Function1<String, Integer> {

        /* renamed from: b */
        public static final C13803f f36461b = new C13803f();

        C13803f() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                try {
                    return Integer.valueOf(C13706kg.m38327a(str));
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ky0$g */
    static final class C13804g extends Lambda implements Function1<String, Uri> {

        /* renamed from: b */
        public static final C13804g f36462b = new C13804g();

        C13804g() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "value");
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(value)");
            return parse;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ky0$h */
    static final class C13805h extends Lambda implements Function1<Uri, String> {

        /* renamed from: b */
        public static final C13805h f36463b = new C13805h();

        C13805h() {
            super(1);
        }

        public Object invoke(Object obj) {
            Uri uri = (Uri) obj;
            Intrinsics.checkNotNullParameter(uri, "uri");
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
            return uri2;
        }
    }

    static {
        C13799b bVar = C13799b.f36457b;
        C13805h hVar = C13805h.f36463b;
    }

    /* renamed from: a */
    public static final Function1<Boolean, Integer> m38511a() {
        return f36449a;
    }

    /* renamed from: b */
    public static final Function1<Number, Boolean> m38512b() {
        return f36452d;
    }

    /* renamed from: c */
    public static final Function1<Number, Double> m38513c() {
        return f36453e;
    }

    /* renamed from: d */
    public static final Function1<Number, Integer> m38514d() {
        return f36454f;
    }

    /* renamed from: e */
    public static final Function1<String, Integer> m38515e() {
        return f36450b;
    }

    /* renamed from: f */
    public static final Function1<String, Uri> m38516f() {
        return f36451c;
    }
}
