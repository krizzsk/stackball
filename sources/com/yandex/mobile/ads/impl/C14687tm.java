package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.f20;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.tm */
public class C14687tm implements qh0 {

    /* renamed from: i */
    public static final C14690c f40352i = new C14690c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final cg1<C14694e> f40353j = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C14694e.values()), C14689b.f40366b);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final rh1<String> f40354k = $$Lambda$tm$Jv9qhBOUj38N87v8leyvWDEwRbk.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final gj0<C14691d> f40355l = $$Lambda$tm$HrsX4wU1dDW9yYpRFAXcjkC1xG4.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Function2<ly0, JSONObject, C14687tm> f40356m = C14688a.f40365b;

    /* renamed from: a */
    public final f20 f40357a;

    /* renamed from: b */
    public final String f40358b;

    /* renamed from: c */
    public final f50<Uri> f40359c;

    /* renamed from: d */
    public final List<C14691d> f40360d;

    /* renamed from: e */
    public final JSONObject f40361e;

    /* renamed from: f */
    public final f50<Uri> f40362f;

    /* renamed from: g */
    public final f50<C14694e> f40363g;

    /* renamed from: h */
    public final f50<Uri> f40364h;

    /* renamed from: com.yandex.mobile.ads.impl.tm$a */
    static final class C14688a extends Lambda implements Function2<ly0, JSONObject, C14687tm> {

        /* renamed from: b */
        public static final C14688a f40365b = new C14688a();

        C14688a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14690c cVar = C14687tm.f40352i;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            f20.C13024b bVar = f20.f33208a;
            Object a = zh0.m44608a(jSONObject, "log_id", C14687tm.f40354k, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"log_id\", LOG…D_VALIDATOR, logger, env)");
            Function1<String, Uri> f = ky0.m38516f();
            cg1<Uri> cg1 = dg1.f32577e;
            f50<Uri> b2 = zh0.m44621b(jSONObject, "log_url", f, b, ly0, cg1);
            C14691d.C14693b bVar2 = C14691d.f40367d;
            JSONObject jSONObject2 = jSONObject;
            ny0 ny0 = b;
            ly0 ly02 = ly0;
            f50<T> b3 = zh0.m44621b(jSONObject, "referer", ky0.m38516f(), ny0, ly02, cg1);
            C14694e.C14696b bVar3 = C14694e.f40375c;
            JSONObject jSONObject3 = jSONObject;
            return new C14687tm((f20) zh0.m44622b(jSONObject, "download_callbacks", f20.f33211d, b, ly0), (String) a, b2, zh0.m44626b(jSONObject2, "menu_items", C14691d.f40370g, C14687tm.f40355l, b, ly0), (JSONObject) zh0.m44624b(jSONObject, "payload", b, ly0), b3, zh0.m44621b(jSONObject3, "target", C14694e.f40376d, ny0, ly02, C14687tm.f40353j), zh0.m44621b(jSONObject3, "url", ky0.m38516f(), ny0, ly02, cg1));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tm$b */
    static final class C14689b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14689b f40366b = new C14689b();

        C14689b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C14694e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tm$c */
    public static final class C14690c {
        private C14690c() {
        }

        public /* synthetic */ C14690c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tm$d */
    public static class C14691d implements qh0 {

        /* renamed from: d */
        public static final C14693b f40367d = new C14693b((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static final gj0<C14687tm> f40368e = $$Lambda$tm$d$dVrUHHIHGET4REczv6yNTW6buM.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final rh1<String> f40369f = $$Lambda$tm$d$2DPrSkpw416At8XJGs20kfCKhKQ.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final Function2<ly0, JSONObject, C14691d> f40370g = C14692a.f40374b;

        /* renamed from: a */
        public final C14687tm f40371a;

        /* renamed from: b */
        public final List<C14687tm> f40372b;

        /* renamed from: c */
        public final f50<String> f40373c;

        /* renamed from: com.yandex.mobile.ads.impl.tm$d$a */
        static final class C14692a extends Lambda implements Function2<ly0, JSONObject, C14691d> {

            /* renamed from: b */
            public static final C14692a f40374b = new C14692a();

            C14692a() {
                super(2);
            }

            public Object invoke(Object obj, Object obj2) {
                ly0 ly0 = (ly0) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                Intrinsics.checkNotNullParameter(ly0, "env");
                Intrinsics.checkNotNullParameter(jSONObject, "it");
                C14693b bVar = C14691d.f40367d;
                Intrinsics.checkNotNullParameter(ly0, "env");
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                ny0 b = ly0.mo66818b();
                C14690c cVar = C14687tm.f40352i;
                JSONObject jSONObject2 = jSONObject;
                List b2 = zh0.m44626b(jSONObject2, "actions", C14687tm.f40356m, C14691d.f40368e, b, ly0);
                f50<String> a = zh0.m44597a(jSONObject2, "text", C14691d.f40369f, b, ly0, dg1.f32575c);
                Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, \"te… env, TYPE_HELPER_STRING)");
                return new C14691d((C14687tm) zh0.m44622b(jSONObject, "action", C14687tm.f40356m, b, ly0), b2, a);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.tm$d$b */
        public static final class C14693b {
            private C14693b() {
            }

            public /* synthetic */ C14693b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            $$Lambda$tm$d$RdxbyVIEaR768DBIuGcV9vOSVt0 r0 = $$Lambda$tm$d$RdxbyVIEaR768DBIuGcV9vOSVt0.INSTANCE;
        }

        public C14691d(C14687tm tmVar, List<? extends C14687tm> list, f50<String> f50) {
            Intrinsics.checkNotNullParameter(f50, "text");
            this.f40371a = tmVar;
            this.f40372b = list;
            this.f40373c = f50;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static final boolean m42390a(List list) {
            Intrinsics.checkNotNullParameter(list, "it");
            return list.size() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final boolean m42392b(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static final boolean m42389a(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tm$e */
    public enum C14694e {
        BLANK("_blank");
        

        /* renamed from: c */
        public static final C14696b f40375c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final Function1<String, C14694e> f40376d = null;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f40379b;

        /* renamed from: com.yandex.mobile.ads.impl.tm$e$a */
        static final class C14695a extends Lambda implements Function1<String, C14694e> {

            /* renamed from: b */
            public static final C14695a f40380b = null;

            static {
                f40380b = new C14695a();
            }

            C14695a() {
                super(1);
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(str, "string");
                C14694e eVar = C14694e.BLANK;
                if (Intrinsics.areEqual((Object) str, (Object) eVar.f40379b)) {
                    return eVar;
                }
                return null;
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.tm$e$b */
        public static final class C14696b {
            private C14696b() {
            }

            public /* synthetic */ C14696b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Function1<String, C14694e> mo70205a() {
                return C14694e.f40376d;
            }
        }

        static {
            f40375c = new C14696b((DefaultConstructorMarker) null);
            f40376d = C14695a.f40380b;
        }

        private C14694e(String str) {
            this.f40379b = str;
        }
    }

    static {
        $$Lambda$tm$vqhqxCljuy53pQfsdvJ2I1DLn58 r0 = $$Lambda$tm$vqhqxCljuy53pQfsdvJ2I1DLn58.INSTANCE;
    }

    public C14687tm(f20 f20, String str, f50<Uri> f50, List<? extends C14691d> list, JSONObject jSONObject, f50<Uri> f502, f50<C14694e> f503, f50<Uri> f504) {
        Intrinsics.checkNotNullParameter(str, "logId");
        this.f40357a = f20;
        this.f40358b = str;
        this.f40359c = f50;
        this.f40360d = list;
        this.f40361e = jSONObject;
        this.f40362f = f502;
        this.f40363g = f503;
        this.f40364h = f504;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42382a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42385b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42383a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
