package com.yandex.mobile.ads.impl;

import com.facebook.share.internal.ShareConstants;
import com.yandex.mobile.ads.impl.fc0;
import com.yandex.mobile.ads.impl.q90;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class m41 {

    /* renamed from: a */
    private final fc0 f37189a;

    /* renamed from: b */
    private final String f37190b;

    /* renamed from: c */
    private final q90 f37191c;

    /* renamed from: d */
    private final o41 f37192d;

    /* renamed from: e */
    private final Map<Class<?>, Object> f37193e;

    /* renamed from: f */
    private C13191gd f37194f;

    /* renamed from: com.yandex.mobile.ads.impl.m41$a */
    public static class C13954a {

        /* renamed from: a */
        private fc0 f37195a;

        /* renamed from: b */
        private String f37196b;

        /* renamed from: c */
        private q90.C14366a f37197c;

        /* renamed from: d */
        private o41 f37198d;

        /* renamed from: e */
        private Map<Class<?>, Object> f37199e;

        public C13954a() {
            this.f37199e = new LinkedHashMap();
            this.f37196b = "GET";
            this.f37197c = new q90.C14366a();
        }

        /* renamed from: a */
        public C13954a mo68570a(fc0 fc0) {
            Intrinsics.checkNotNullParameter(fc0, "url");
            this.f37195a = fc0;
            return this;
        }

        /* renamed from: b */
        public C13954a mo68577b(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            q90.C14366a aVar = this.f37197c;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            q90.C14367b bVar = q90.f39028c;
            bVar.m41125a(str);
            bVar.m41126a(str2, str);
            aVar.mo69518a(str);
            aVar.mo69519a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C13954a mo68574a(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            q90.C14366a aVar = this.f37197c;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            q90.C14367b bVar = q90.f39028c;
            bVar.m41125a(str);
            bVar.m41126a(str2, str);
            aVar.mo69519a(str, str2);
            return this;
        }

        public C13954a(m41 m41) {
            Map<Class<?>, Object> map;
            Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
            this.f37199e = new LinkedHashMap();
            this.f37195a = m41.mo68568g();
            this.f37196b = m41.mo68567f();
            this.f37198d = m41.mo68561a();
            if (m41.mo68564c().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = MapsKt.toMutableMap(m41.mo68564c());
            }
            this.f37199e = map;
            this.f37197c = m41.mo68565d().mo69508a();
        }

        /* renamed from: a */
        public C13954a mo68572a(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            this.f37197c.mo69518a(str);
            return this;
        }

        /* renamed from: a */
        public C13954a mo68575a(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            String url2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(url2, "url.toString()");
            Intrinsics.checkNotNullParameter(url2, "<this>");
            return mo68570a(new fc0.C13043a().mo66969a((fc0) null, url2).mo66971a());
        }

        /* renamed from: a */
        public C13954a mo68571a(q90 q90) {
            Intrinsics.checkNotNullParameter(q90, "headers");
            q90.C14366a a = q90.mo69508a();
            Intrinsics.checkNotNullParameter(a, "<set-?>");
            this.f37197c = a;
            return this;
        }

        /* renamed from: a */
        public C13954a mo68573a(String str, o41 o41) {
            Intrinsics.checkNotNullParameter(str, "method");
            boolean z = false;
            if (str.length() > 0) {
                if (o41 == null) {
                    Intrinsics.checkNotNullParameter(str, "method");
                    if (Intrinsics.areEqual((Object) str, (Object) "POST") || Intrinsics.areEqual((Object) str, (Object) "PUT") || Intrinsics.areEqual((Object) str, (Object) "PATCH") || Intrinsics.areEqual((Object) str, (Object) "PROPPATCH") || Intrinsics.areEqual((Object) str, (Object) "REPORT")) {
                        z = true;
                    }
                    if (!(!z)) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!zb0.m44524a(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.f37196b = str;
                this.f37198d = o41;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        /* renamed from: a */
        public m41 mo68576a() {
            Map map;
            fc0 fc0 = this.f37195a;
            if (fc0 != null) {
                String str = this.f37196b;
                q90 a = this.f37197c.mo69520a();
                o41 o41 = this.f37198d;
                Map<Class<?>, Object> map2 = this.f37199e;
                byte[] bArr = jh1.f35305a;
                Intrinsics.checkNotNullParameter(map2, "<this>");
                if (map2.isEmpty()) {
                    map = MapsKt.emptyMap();
                } else {
                    map = Collections.unmodifiableMap(new LinkedHashMap(map2));
                    Intrinsics.checkNotNullExpressionValue(map, "{\n    Collections.unmodifiableMap(LinkedHashMap(this))\n  }");
                }
                return new m41(fc0, str, a, o41, map);
            }
            throw new IllegalStateException("url == null".toString());
        }
    }

    public m41(fc0 fc0, String str, q90 q90, o41 o41, Map<Class<?>, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(fc0, "url");
        Intrinsics.checkNotNullParameter(str, "method");
        Intrinsics.checkNotNullParameter(q90, "headers");
        Intrinsics.checkNotNullParameter(map, "tags");
        this.f37189a = fc0;
        this.f37190b = str;
        this.f37191c = q90;
        this.f37192d = o41;
        this.f37193e = map;
    }

    /* renamed from: a */
    public final o41 mo68561a() {
        return this.f37192d;
    }

    /* renamed from: b */
    public final C13191gd mo68563b() {
        C13191gd gdVar = this.f37194f;
        if (gdVar != null) {
            return gdVar;
        }
        C13191gd a = C13191gd.f33938n.mo67251a(this.f37191c);
        this.f37194f = a;
        return a;
    }

    /* renamed from: c */
    public final Map<Class<?>, Object> mo68564c() {
        return this.f37193e;
    }

    /* renamed from: d */
    public final q90 mo68565d() {
        return this.f37191c;
    }

    /* renamed from: e */
    public final boolean mo68566e() {
        return this.f37189a.mo66959h();
    }

    /* renamed from: f */
    public final String mo68567f() {
        return this.f37190b;
    }

    /* renamed from: g */
    public final fc0 mo68568g() {
        return this.f37189a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f37190b);
        sb.append(", url=");
        sb.append(this.f37189a);
        if (this.f37191c.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : this.f37191c) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) next;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.f37193e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f37193e);
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: a */
    public final String mo68562a(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this.f37191c.mo69510a(str);
    }
}
