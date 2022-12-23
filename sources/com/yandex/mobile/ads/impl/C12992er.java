package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13794kx;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.er */
public class C12992er implements qh0 {

    /* renamed from: c */
    public static final C12995c f33046c = new C12995c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final f50<C13794kx> f33047d = f50.f33229a.mo66929a(C13794kx.DP);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final cg1<C13794kx> f33048e = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13794kx.values()), C12994b.f33053b);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Function2<ly0, JSONObject, C12992er> f33049f = C12993a.f33052b;

    /* renamed from: a */
    public final f50<C13794kx> f33050a;

    /* renamed from: b */
    public final f50<Double> f33051b;

    /* renamed from: com.yandex.mobile.ads.impl.er$a */
    static final class C12993a extends Lambda implements Function2<ly0, JSONObject, C12992er> {

        /* renamed from: b */
        public static final C12993a f33052b = new C12993a();

        C12993a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C12995c cVar = C12992er.f33046c;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C13794kx.C13796b bVar = C13794kx.f36440c;
            f50 b2 = zh0.m44621b(jSONObject, "unit", C13794kx.f36441d, b, ly0, C12992er.f33048e);
            if (b2 == null) {
                b2 = C12992er.f33047d;
            }
            f50 f50 = b2;
            f50<Double> a = zh0.m44598a(jSONObject, "value", ky0.m38513c(), b, ly0, dg1.f32576d);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, \"va… env, TYPE_HELPER_DOUBLE)");
            return new C12992er(f50, a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.er$b */
    static final class C12994b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C12994b f33053b = new C12994b();

        C12994b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13794kx);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.er$c */
    public static final class C12995c {
        private C12995c() {
        }

        public /* synthetic */ C12995c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12992er(f50<C13794kx> f50, f50<Double> f502) {
        Intrinsics.checkNotNullParameter(f50, "unit");
        Intrinsics.checkNotNullParameter(f502, "value");
        this.f33050a = f50;
        this.f33051b = f502;
    }
}
