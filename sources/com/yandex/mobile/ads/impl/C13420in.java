package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.yandex.mobile.ads.impl.C13525jn;
import com.yandex.mobile.ads.impl.C14121nq;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.f50;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.in */
public class C13420in implements qh0 {

    /* renamed from: h */
    public static final C13424d f34922h = new C13424d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<Integer> f34923i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<C13525jn> f34924j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C14121nq.C14125d f34925k = new C14121nq.C14125d(new C12654bu());
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final f50<Integer> f34926l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final cg1<C13525jn> f34927m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final cg1<C13425e> f34928n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final rh1<Integer> f34929o = $$Lambda$in$7BOoLBTYIhIv1czdxXfRxAjI0Bg.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final gj0<C13420in> f34930p = $$Lambda$in$teYBa8rQ9_q8k5bxrMSOAZn4sPU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final rh1<Integer> f34931q = $$Lambda$in$_skKdVgFZlWkc1SUcuTOY8d8W6E.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final Function2<ly0, JSONObject, C13420in> f34932r = C13421a.f34940b;

    /* renamed from: a */
    public final f50<Integer> f34933a;

    /* renamed from: b */
    public final f50<Double> f34934b;

    /* renamed from: c */
    public final f50<C13525jn> f34935c;

    /* renamed from: d */
    public final List<C13420in> f34936d;

    /* renamed from: e */
    public final f50<C13425e> f34937e;

    /* renamed from: f */
    public final f50<Integer> f34938f;

    /* renamed from: g */
    public final f50<Double> f34939g;

    /* renamed from: com.yandex.mobile.ads.impl.in$a */
    static final class C13421a extends Lambda implements Function2<ly0, JSONObject, C13420in> {

        /* renamed from: b */
        public static final C13421a f34940b = new C13421a();

        C13421a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13424d dVar = C13420in.f34922h;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Function1<Number, Integer> d = ky0.m38514d();
            rh1 c = C13420in.f34929o;
            f50 b2 = C13420in.f34923i;
            cg1<Integer> cg1 = dg1.f32574b;
            f50 a = zh0.m44601a(jSONObject, "duration", (Function1) d, c, b, b2, (cg1) cg1);
            if (a == null) {
                a = C13420in.f34923i;
            }
            f50 f50 = a;
            Function1<Number, Double> c2 = ky0.m38513c();
            cg1<Double> cg12 = dg1.f32576d;
            ny0 ny0 = b;
            ly0 ly02 = ly0;
            f50<Double> b3 = zh0.m44621b(jSONObject, "end_value", c2, ny0, ly02, cg12);
            C13525jn.C13527b bVar = C13525jn.f35400c;
            f50 b4 = zh0.m44621b(jSONObject, "interpolator", C13525jn.f35401d, ny0, ly02, C13420in.f34927m);
            if (b4 == null) {
                b4 = C13420in.f34924j;
            }
            f50 f502 = b4;
            List b5 = zh0.m44626b(jSONObject, FirebaseAnalytics.Param.ITEMS, C13420in.f34932r, C13420in.f34930p, b, ly0);
            C13425e.C13427b bVar2 = C13425e.f34943c;
            f50 a2 = zh0.m44598a(jSONObject, "name", C13425e.f34944d, b, ly0, C13420in.f34928n);
            Intrinsics.checkNotNullExpressionValue(a2, "readExpression(json, \"na…r, env, TYPE_HELPER_NAME)");
            C14121nq.C14123b bVar3 = C14121nq.f37876a;
            C14121nq nqVar = (C14121nq) zh0.m44622b(jSONObject, "repeat", C14121nq.f37877b, b, ly0);
            if (nqVar == null) {
                nqVar = C13420in.f34925k;
            }
            C14121nq nqVar2 = nqVar;
            Intrinsics.checkNotNullExpressionValue(nqVar2, "JsonParser.readOptional(…) ?: REPEAT_DEFAULT_VALUE");
            f50 a3 = zh0.m44601a(jSONObject, "start_delay", (Function1) ky0.m38514d(), C13420in.f34931q, b, C13420in.f34926l, (cg1) cg1);
            if (a3 == null) {
                a3 = C13420in.f34926l;
            }
            C14121nq nqVar3 = nqVar2;
            return new C13420in(f50, b3, f502, b5, a2, nqVar3, a3, zh0.m44621b(jSONObject, "start_value", ky0.m38513c(), b, ly0, cg12));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.in$b */
    static final class C13422b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13422b f34941b = new C13422b();

        C13422b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13525jn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.in$c */
    static final class C13423c extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13423c f34942b = new C13423c();

        C13423c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13425e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.in$d */
    public static final class C13424d {
        private C13424d() {
        }

        public /* synthetic */ C13424d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.in$e */
    public enum C13425e {
        FADE("fade"),
        TRANSLATE("translate"),
        MARQUEE("marquee"),
        SCALE("scale"),
        SET("set"),
        NO_ANIMATION("no_animation");
        

        /* renamed from: c */
        public static final C13427b f34943c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final Function1<String, C13425e> f34944d = null;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f34952b;

        /* renamed from: com.yandex.mobile.ads.impl.in$e$a */
        static final class C13426a extends Lambda implements Function1<String, C13425e> {

            /* renamed from: b */
            public static final C13426a f34953b = null;

            static {
                f34953b = new C13426a();
            }

            C13426a() {
                super(1);
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(str, "string");
                C13425e eVar = C13425e.FADE;
                if (Intrinsics.areEqual((Object) str, (Object) eVar.f34952b)) {
                    return eVar;
                }
                C13425e eVar2 = C13425e.TRANSLATE;
                if (Intrinsics.areEqual((Object) str, (Object) eVar2.f34952b)) {
                    return eVar2;
                }
                C13425e eVar3 = C13425e.MARQUEE;
                if (Intrinsics.areEqual((Object) str, (Object) eVar3.f34952b)) {
                    return eVar3;
                }
                C13425e eVar4 = C13425e.SCALE;
                if (Intrinsics.areEqual((Object) str, (Object) eVar4.f34952b)) {
                    return eVar4;
                }
                C13425e eVar5 = C13425e.SET;
                if (Intrinsics.areEqual((Object) str, (Object) eVar5.f34952b)) {
                    return eVar5;
                }
                C13425e eVar6 = C13425e.NO_ANIMATION;
                if (Intrinsics.areEqual((Object) str, (Object) eVar6.f34952b)) {
                    return eVar6;
                }
                return null;
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.in$e$b */
        public static final class C13427b {
            private C13427b() {
            }

            public /* synthetic */ C13427b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Function1<String, C13425e> mo67835a() {
                return C13425e.f34944d;
            }
        }

        static {
            f34943c = new C13427b((DefaultConstructorMarker) null);
            f34944d = C13426a.f34953b;
        }

        private C13425e(String str) {
            this.f34952b = str;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f34923i = aVar.mo66929a(Integer.valueOf(ErrorCode.GENERAL_WRAPPER_ERROR));
        f34924j = aVar.mo66929a(C13525jn.SPRING);
        f34926l = aVar.mo66929a(0);
        cg1.C12733a aVar2 = cg1.f31917a;
        f34927m = aVar2.mo66293a(ArraysKt.first((T[]) C13525jn.values()), C13422b.f34941b);
        f34928n = aVar2.mo66293a(ArraysKt.first((T[]) C13425e.values()), C13423c.f34942b);
        $$Lambda$in$cNEY5c8BMqRqh6cb98RF0JChHeY r0 = $$Lambda$in$cNEY5c8BMqRqh6cb98RF0JChHeY.INSTANCE;
        $$Lambda$in$hPqPLKrOguyG15WLVaYHmyz14hM r02 = $$Lambda$in$hPqPLKrOguyG15WLVaYHmyz14hM.INSTANCE;
    }

    public C13420in(f50<Integer> f50, f50<Double> f502, f50<C13525jn> f503, List<? extends C13420in> list, f50<C13425e> f504, C14121nq nqVar, f50<Integer> f505, f50<Double> f506) {
        Intrinsics.checkNotNullParameter(f50, "duration");
        Intrinsics.checkNotNullParameter(f503, "interpolator");
        Intrinsics.checkNotNullParameter(f504, "name");
        Intrinsics.checkNotNullParameter(nqVar, "repeat");
        Intrinsics.checkNotNullParameter(f505, "startDelay");
        this.f34933a = f50;
        this.f34934b = f502;
        this.f34935c = f503;
        this.f34936d = list;
        this.f34937e = f504;
        this.f34938f = f505;
        this.f34939g = f506;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m37477a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m37480b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m37482c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m37484d(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m37478a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C13420in(com.yandex.mobile.ads.impl.f50 r12, com.yandex.mobile.ads.impl.f50 r13, com.yandex.mobile.ads.impl.f50 r14, java.util.List r15, com.yandex.mobile.ads.impl.f50 r16, com.yandex.mobile.ads.impl.C14121nq r17, com.yandex.mobile.ads.impl.f50 r18, com.yandex.mobile.ads.impl.f50 r19, int r20) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000a
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r1 = f34923i
            r3 = r1
            goto L_0x000b
        L_0x000a:
            r3 = r12
        L_0x000b:
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r4 = r2
            goto L_0x0013
        L_0x0012:
            r4 = r13
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001b
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.jn> r1 = f34924j
            r5 = r1
            goto L_0x001c
        L_0x001b:
            r5 = r2
        L_0x001c:
            r6 = 0
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0025
            com.yandex.mobile.ads.impl.nq$d r1 = f34925k
            r8 = r1
            goto L_0x0026
        L_0x0025:
            r8 = r2
        L_0x0026:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002e
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r1 = f34926l
            r9 = r1
            goto L_0x002f
        L_0x002e:
            r9 = r2
        L_0x002f:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0035
            r10 = r2
            goto L_0x0037
        L_0x0035:
            r10 = r19
        L_0x0037:
            r2 = r11
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13420in.<init>(com.yandex.mobile.ads.impl.f50, com.yandex.mobile.ads.impl.f50, com.yandex.mobile.ads.impl.f50, java.util.List, com.yandex.mobile.ads.impl.f50, com.yandex.mobile.ads.impl.nq, com.yandex.mobile.ads.impl.f50, com.yandex.mobile.ads.impl.f50, int):void");
    }
}
