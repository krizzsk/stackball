package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13794kx;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.yr */
public class C15266yr implements qh0 {

    /* renamed from: c */
    public static final C15269c f42914c = new C15269c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final f50<C13794kx> f42915d = f50.f33229a.mo66929a(C13794kx.DP);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final cg1<C13794kx> f42916e = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13794kx.values()), C15268b.f42922b);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final rh1<Integer> f42917f = $$Lambda$yr$rOe7SGLWT_drqk8BxTyznApguTA.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Function2<ly0, JSONObject, C15266yr> f42918g = C15267a.f42921b;

    /* renamed from: a */
    public final f50<C13794kx> f42919a;

    /* renamed from: b */
    public final f50<Integer> f42920b;

    /* renamed from: com.yandex.mobile.ads.impl.yr$a */
    static final class C15267a extends Lambda implements Function2<ly0, JSONObject, C15266yr> {

        /* renamed from: b */
        public static final C15267a f42921b = new C15267a();

        C15267a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C15266yr.f42914c.mo71109a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yr$b */
    static final class C15268b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C15268b f42922b = new C15268b();

        C15268b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13794kx);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yr$c */
    public static final class C15269c {
        private C15269c() {
        }

        public /* synthetic */ C15269c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C15266yr mo71109a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C13794kx.C13796b bVar = C13794kx.f36440c;
            f50 b2 = zh0.m44621b(jSONObject, "unit", C13794kx.f36441d, b, ly0, C15266yr.f42916e);
            if (b2 == null) {
                b2 = C15266yr.f42915d;
            }
            f50 a = zh0.m44600a(jSONObject, "value", (Function1) ky0.m38514d(), C15266yr.f42917f, b, (cg1) dg1.f32574b);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, \"va…er, env, TYPE_HELPER_INT)");
            return new C15266yr(b2, a);
        }
    }

    static {
        $$Lambda$yr$vmS3Iw4kUt6rSyHn85f2zrX630 r0 = $$Lambda$yr$vmS3Iw4kUt6rSyHn85f2zrX630.INSTANCE;
    }

    public C15266yr(f50<C13794kx> f50, f50<Integer> f502) {
        Intrinsics.checkNotNullParameter(f50, "unit");
        Intrinsics.checkNotNullParameter(f502, "value");
        this.f42919a = f50;
        this.f42920b = f502;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m44396a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m44398b(int i) {
        return i >= 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15266yr(f50 f50, f50 f502, int i) {
        this((i & 1) != 0 ? f42915d : null, f502);
    }
}
