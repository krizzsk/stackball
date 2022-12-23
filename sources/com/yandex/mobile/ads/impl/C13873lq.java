package com.yandex.mobile.ads.impl;

import com.inmobi.media.C5073cj;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.lq */
public class C13873lq implements qh0 {

    /* renamed from: e */
    public static final C13875b f36780e = new C13875b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final rh1<Integer> f36781f = $$Lambda$lq$4kTQL5IShipdNemzuPxDR6ZNiw.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final rh1<Integer> f36782g = $$Lambda$lq$vdOobXmiCmkEc9B4CsGPbbTIT8Q.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final rh1<Integer> f36783h = $$Lambda$lq$VhrP7nGBiZ6aMA5soDnvW8_mII0.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final rh1<Integer> f36784i = $$Lambda$lq$B0d_hMpPxES_m0_Lp5nveBPZ07A.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Function2<ly0, JSONObject, C13873lq> f36785j = C13874a.f36790b;

    /* renamed from: a */
    public final f50<Integer> f36786a;

    /* renamed from: b */
    public final f50<Integer> f36787b;

    /* renamed from: c */
    public final f50<Integer> f36788c;

    /* renamed from: d */
    public final f50<Integer> f36789d;

    /* renamed from: com.yandex.mobile.ads.impl.lq$a */
    static final class C13874a extends Lambda implements Function2<ly0, JSONObject, C13873lq> {

        /* renamed from: b */
        public static final C13874a f36790b = new C13874a();

        C13874a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13875b bVar = C13873lq.f36780e;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Function1<Number, Integer> d = ky0.m38514d();
            rh1 a = C13873lq.f36781f;
            JSONObject jSONObject2 = jSONObject;
            ny0 ny0 = b;
            cg1<Integer> cg1 = dg1.f32574b;
            return new C13873lq(zh0.m44601a(jSONObject2, "bottom-left", (Function1) d, a, ny0, (f50) null, (cg1) cg1), zh0.m44601a(jSONObject2, "bottom-right", (Function1) ky0.m38514d(), C13873lq.f36782g, ny0, (f50) null, (cg1) cg1), zh0.m44601a(jSONObject2, "top-left", (Function1) ky0.m38514d(), C13873lq.f36783h, ny0, (f50) null, (cg1) cg1), zh0.m44601a(jSONObject2, C5073cj.DEFAULT_POSITION, (Function1) ky0.m38514d(), C13873lq.f36784i, ny0, (f50) null, (cg1) cg1));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lq$b */
    public static final class C13875b {
        private C13875b() {
        }

        public /* synthetic */ C13875b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        $$Lambda$lq$Mw6WdzxQ1SMujNfjxdCXF70s6W0 r0 = $$Lambda$lq$Mw6WdzxQ1SMujNfjxdCXF70s6W0.INSTANCE;
        $$Lambda$lq$6ZVpAOvcoGnkj0O4acGNeLzUPL0 r02 = $$Lambda$lq$6ZVpAOvcoGnkj0O4acGNeLzUPL0.INSTANCE;
        $$Lambda$lq$kTuMi1BJGJ_d0kZ7eCd4LWhydw r03 = $$Lambda$lq$kTuMi1BJGJ_d0kZ7eCd4LWhydw.INSTANCE;
        $$Lambda$lq$bCOOgZ7uKqKQUmqdLA8E0wrOKE r04 = $$Lambda$lq$bCOOgZ7uKqKQUmqdLA8E0wrOKE.INSTANCE;
    }

    public C13873lq() {
        this((f50) null, (f50) null, (f50) null, (f50) null, 15);
    }

    public C13873lq(f50<Integer> f50, f50<Integer> f502, f50<Integer> f503, f50<Integer> f504) {
        this.f36786a = f50;
        this.f36787b = f502;
        this.f36788c = f503;
        this.f36789d = f504;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38882a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38884b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m38886c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m38888d(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m38890e(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m38891f(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m38892g(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m38893h(int i) {
        return i >= 0;
    }

    public /* synthetic */ C13873lq(f50 f50, f50 f502, f50 f503, f50 f504, int i) {
        this((f50<Integer>) null, (f50<Integer>) null, (f50<Integer>) null, (f50<Integer>) null);
    }
}
