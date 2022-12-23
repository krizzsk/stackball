package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ts */
public class C14706ts implements qh0 {

    /* renamed from: c */
    public static final C14708b f40434c = new C14708b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final f50<Integer> f40435d = f50.f33229a.mo66929a(0);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final rh1<Integer> f40436e = $$Lambda$ts$CieyKahVOtLTOoz7N34ryWDQBCU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final gj0<Integer> f40437f = $$Lambda$ts$A6UKGKodJxJwkBMbmZQ6Y3AxN8.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Function2<ly0, JSONObject, C14706ts> f40438g = C14707a.f40441b;

    /* renamed from: a */
    public final f50<Integer> f40439a;

    /* renamed from: b */
    public final n50<Integer> f40440b;

    /* renamed from: com.yandex.mobile.ads.impl.ts$a */
    static final class C14707a extends Lambda implements Function2<ly0, JSONObject, C14706ts> {

        /* renamed from: b */
        public static final C14707a f40441b = new C14707a();

        C14707a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C14706ts.f40434c.mo70220a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ts$b */
    public static final class C14708b {
        private C14708b() {
        }

        public /* synthetic */ C14708b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C14706ts mo70220a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            f50 a = zh0.m44601a(jSONObject, "angle", (Function1) ky0.m38514d(), C14706ts.f40436e, b, C14706ts.f40435d, (cg1) dg1.f32574b);
            if (a == null) {
                a = C14706ts.f40435d;
            }
            f50 f50 = a;
            n50<Integer> a2 = zh0.m44602a(jSONObject, "colors", ky0.m38515e(), C14706ts.f40437f, b, ly0, dg1.f32578f);
            Intrinsics.checkNotNullExpressionValue(a2, "readExpressionsList(json…, env, TYPE_HELPER_COLOR)");
            return new C14706ts(f50, a2);
        }
    }

    static {
        $$Lambda$ts$Vl7BhoWlUJAwfSKlgyW4uZBk3Gw r0 = $$Lambda$ts$Vl7BhoWlUJAwfSKlgyW4uZBk3Gw.INSTANCE;
    }

    public C14706ts(f50<Integer> f50, n50<Integer> n50) {
        Intrinsics.checkNotNullParameter(f50, "angle");
        Intrinsics.checkNotNullParameter(n50, "colors");
        this.f40439a = f50;
        this.f40440b = n50;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42469a(int i) {
        return i >= 0 && i <= 360;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42472b(int i) {
        return i >= 0 && i <= 360;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42470a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 2;
    }
}
