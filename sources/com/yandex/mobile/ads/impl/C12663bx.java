package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14138nw;
import com.yandex.mobile.ads.impl.f50;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.bx */
public class C12663bx implements qh0 {

    /* renamed from: e */
    public static final C12665b f31611e = new C12665b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final f50<Double> f31612f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Integer> f31613g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final f50<Integer> f31614h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final rh1<Double> f31615i = $$Lambda$bx$X7AFr5TT2FUkD5OY1G7aL_mTtF0.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final rh1<Integer> f31616j = $$Lambda$bx$RQonc1QUG7b834Mru6S2yF9lbU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Function2<ly0, JSONObject, C12663bx> f31617k = C12664a.f31622b;

    /* renamed from: a */
    public final f50<Double> f31618a;

    /* renamed from: b */
    public final f50<Integer> f31619b;

    /* renamed from: c */
    public final f50<Integer> f31620c;

    /* renamed from: d */
    public final C14138nw f31621d;

    /* renamed from: com.yandex.mobile.ads.impl.bx$a */
    static final class C12664a extends Lambda implements Function2<ly0, JSONObject, C12663bx> {

        /* renamed from: b */
        public static final C12664a f31622b = new C12664a();

        C12664a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C12665b bVar = C12663bx.f31611e;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            f50 a = zh0.m44601a(jSONObject, "alpha", (Function1) ky0.m38513c(), C12663bx.f31615i, b, C12663bx.f31612f, (cg1) dg1.f32576d);
            if (a == null) {
                a = C12663bx.f31612f;
            }
            f50 f50 = a;
            f50 a2 = zh0.m44601a(jSONObject, "blur", (Function1) ky0.m38514d(), C12663bx.f31616j, b, C12663bx.f31613g, (cg1) dg1.f32574b);
            if (a2 == null) {
                a2 = C12663bx.f31613g;
            }
            f50 f502 = a2;
            f50<Integer> a3 = zh0.m44599a(jSONObject, "color", ky0.m38515e(), b, ly0, C12663bx.f31614h, dg1.f32578f);
            if (a3 == null) {
                a3 = C12663bx.f31614h;
            }
            C14138nw.C14140b bVar2 = C14138nw.f37925c;
            Object a4 = zh0.m44612a(jSONObject, "offset", C14138nw.f37926d, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a4, "read(json, \"offset\", Div…int.CREATOR, logger, env)");
            return new C12663bx(f50, f502, a3, (C14138nw) a4);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bx$b */
    public static final class C12665b {
        private C12665b() {
        }

        public /* synthetic */ C12665b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f31612f = aVar.mo66929a(Double.valueOf(0.19d));
        f31613g = aVar.mo66929a(2);
        f31614h = aVar.mo66929a(0);
        $$Lambda$bx$9tMG8DJZzJ43Bxur1FjdYTQffpg r0 = $$Lambda$bx$9tMG8DJZzJ43Bxur1FjdYTQffpg.INSTANCE;
        $$Lambda$bx$wvAi6SW9SfU2Sgg60tCoTM3dok r02 = $$Lambda$bx$wvAi6SW9SfU2Sgg60tCoTM3dok.INSTANCE;
    }

    public C12663bx(f50<Double> f50, f50<Integer> f502, f50<Integer> f503, C14138nw nwVar) {
        Intrinsics.checkNotNullParameter(f50, "alpha");
        Intrinsics.checkNotNullParameter(f502, "blur");
        Intrinsics.checkNotNullParameter(f503, "color");
        Intrinsics.checkNotNullParameter(nwVar, "offset");
        this.f31618a = f50;
        this.f31619b = f502;
        this.f31620c = f503;
        this.f31621d = nwVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34419a(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34420a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34422b(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34423b(int i) {
        return i >= 0;
    }
}
