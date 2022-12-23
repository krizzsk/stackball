package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14687tm;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class s00 implements qh0 {

    /* renamed from: d */
    public static final C14553c f39775d = new C14553c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final f50<C14554d> f39776e = f50.f33229a.mo66929a(C14554d.ON_CONDITION);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final cg1<C14554d> f39777f = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C14554d.values()), C14552b.f39784b);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final gj0<C14687tm> f39778g = $$Lambda$s00$ooaiayQ7FrFVvWt1vbKTAuHdHyw.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Function2<ly0, JSONObject, s00> f39779h = C14551a.f39783b;

    /* renamed from: a */
    public final List<C14687tm> f39780a;

    /* renamed from: b */
    public final String f39781b;

    /* renamed from: c */
    public final f50<C14554d> f39782c;

    /* renamed from: com.yandex.mobile.ads.impl.s00$a */
    static final class C14551a extends Lambda implements Function2<ly0, JSONObject, s00> {

        /* renamed from: b */
        public static final C14551a f39783b = new C14551a();

        C14551a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14553c cVar = s00.f39775d;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C14687tm.C14690c cVar2 = C14687tm.f40352i;
            List a = zh0.m44614a(jSONObject, "actions", C14687tm.f40356m, s00.f39778g, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "readList(json, \"actions\"…S_VALIDATOR, logger, env)");
            Object a2 = zh0.m44607a(jSONObject, "condition", b, ly0);
            Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"condition\", logger, env)");
            String str = (String) a2;
            C14554d.C14556b bVar = C14554d.f39785c;
            f50 b2 = zh0.m44621b(jSONObject, "mode", C14554d.f39786d, b, ly0, s00.f39777f);
            if (b2 == null) {
                b2 = s00.f39776e;
            }
            return new s00(a, str, b2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.s00$b */
    static final class C14552b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14552b f39784b = new C14552b();

        C14552b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C14554d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.s00$c */
    public static final class C14553c {
        private C14553c() {
        }

        public /* synthetic */ C14553c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.s00$d */
    public enum C14554d {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");
        

        /* renamed from: c */
        public static final C14556b f39785c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final Function1<String, C14554d> f39786d = null;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f39790b;

        /* renamed from: com.yandex.mobile.ads.impl.s00$d$a */
        static final class C14555a extends Lambda implements Function1<String, C14554d> {

            /* renamed from: b */
            public static final C14555a f39791b = null;

            static {
                f39791b = new C14555a();
            }

            C14555a() {
                super(1);
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(str, "string");
                C14554d dVar = C14554d.ON_CONDITION;
                if (Intrinsics.areEqual((Object) str, (Object) dVar.f39790b)) {
                    return dVar;
                }
                C14554d dVar2 = C14554d.ON_VARIABLE;
                if (Intrinsics.areEqual((Object) str, (Object) dVar2.f39790b)) {
                    return dVar2;
                }
                return null;
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.s00$d$b */
        public static final class C14556b {
            private C14556b() {
            }

            public /* synthetic */ C14556b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            f39785c = new C14556b((DefaultConstructorMarker) null);
            f39786d = C14555a.f39791b;
        }

        private C14554d(String str) {
            this.f39790b = str;
        }
    }

    public s00(List<? extends C14687tm> list, String str, f50<C14554d> f50) {
        Intrinsics.checkNotNullParameter(list, "actions");
        Intrinsics.checkNotNullParameter(str, "condition");
        Intrinsics.checkNotNullParameter(f50, "mode");
        this.f39780a = list;
        this.f39781b = str;
        this.f39782c = f50;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m41769a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
