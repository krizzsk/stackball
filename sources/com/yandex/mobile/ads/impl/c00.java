package com.yandex.mobile.ads.impl;

import com.inmobi.media.C5073cj;
import com.tapjoy.TJAdUnitConstants;
import com.yandex.mobile.ads.impl.C13420in;
import com.yandex.mobile.ads.impl.C14138nw;
import com.yandex.mobile.ads.impl.C15177xl;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class c00 implements qh0 {

    /* renamed from: h */
    public static final C12690c f31754h = new C12690c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<Integer> f31755i = f50.f33229a.mo66929a(5000);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final cg1<C12691d> f31756j = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C12691d.values()), C12689b.f31768b);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final rh1<Integer> f31757k = $$Lambda$c00$cMkRtY4oV1ePRunS6VA6pSaAb7Y.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final rh1<String> f31758l = $$Lambda$c00$x2jhBTtrxDYa8ApWriZYtlHl_XM.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Function2<ly0, JSONObject, c00> f31759m = C12688a.f31767b;

    /* renamed from: a */
    public final C13420in f31760a;

    /* renamed from: b */
    public final C13420in f31761b;

    /* renamed from: c */
    public final C15177xl f31762c;

    /* renamed from: d */
    public final f50<Integer> f31763d;

    /* renamed from: e */
    public final String f31764e;

    /* renamed from: f */
    public final C14138nw f31765f;

    /* renamed from: g */
    public final f50<C12691d> f31766g;

    /* renamed from: com.yandex.mobile.ads.impl.c00$a */
    static final class C12688a extends Lambda implements Function2<ly0, JSONObject, c00> {

        /* renamed from: b */
        public static final C12688a f31767b = new C12688a();

        C12688a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C12690c cVar = c00.f31754h;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C13420in.C13424d dVar = C13420in.f34922h;
            C13420in inVar = (C13420in) zh0.m44622b(jSONObject, "animation_in", C13420in.f34932r, b, ly0);
            C13420in inVar2 = (C13420in) zh0.m44622b(jSONObject, "animation_out", C13420in.f34932r, b, ly0);
            C15177xl.C15179b bVar = C15177xl.f42609a;
            Object a = zh0.m44612a(jSONObject, "div", C15177xl.f42610b, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"div\", Div.CREATOR, logger, env)");
            C15177xl xlVar = (C15177xl) a;
            f50 a2 = zh0.m44601a(jSONObject, "duration", (Function1) ky0.m38514d(), c00.f31757k, b, c00.f31755i, (cg1) dg1.f32574b);
            if (a2 == null) {
                a2 = c00.f31755i;
            }
            f50 f50 = a2;
            Object a3 = zh0.m44608a(jSONObject, "id", c00.f31758l, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a3, "read(json, \"id\", ID_VALIDATOR, logger, env)");
            C14138nw.C14140b bVar2 = C14138nw.f37925c;
            C12691d.C12693b bVar3 = C12691d.f31769c;
            f50 a4 = zh0.m44598a(jSONObject, "position", C12691d.f31770d, b, ly0, c00.f31756j);
            Intrinsics.checkNotNullExpressionValue(a4, "readExpression(json, \"po…nv, TYPE_HELPER_POSITION)");
            return new c00(inVar, inVar2, xlVar, f50, (String) a3, (C14138nw) zh0.m44622b(jSONObject, "offset", C14138nw.f37926d, b, ly0), a4);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.c00$b */
    static final class C12689b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C12689b f31768b = new C12689b();

        C12689b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C12691d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.c00$c */
    public static final class C12690c {
        private C12690c() {
        }

        public /* synthetic */ C12690c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.c00$d */
    public enum C12691d {
        LEFT("left"),
        TOP_LEFT("top-left"),
        TOP("top"),
        TOP_RIGHT(C5073cj.DEFAULT_POSITION),
        RIGHT("right"),
        BOTTOM_RIGHT("bottom-right"),
        BOTTOM(TJAdUnitConstants.String.BOTTOM),
        BOTTOM_LEFT("bottom-left");
        

        /* renamed from: c */
        public static final C12693b f31769c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final Function1<String, C12691d> f31770d = null;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f31780b;

        /* renamed from: com.yandex.mobile.ads.impl.c00$d$a */
        static final class C12692a extends Lambda implements Function1<String, C12691d> {

            /* renamed from: b */
            public static final C12692a f31781b = null;

            static {
                f31781b = new C12692a();
            }

            C12692a() {
                super(1);
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(str, "string");
                C12691d dVar = C12691d.LEFT;
                if (Intrinsics.areEqual((Object) str, (Object) dVar.f31780b)) {
                    return dVar;
                }
                C12691d dVar2 = C12691d.TOP_LEFT;
                if (Intrinsics.areEqual((Object) str, (Object) dVar2.f31780b)) {
                    return dVar2;
                }
                C12691d dVar3 = C12691d.TOP;
                if (Intrinsics.areEqual((Object) str, (Object) dVar3.f31780b)) {
                    return dVar3;
                }
                C12691d dVar4 = C12691d.TOP_RIGHT;
                if (Intrinsics.areEqual((Object) str, (Object) dVar4.f31780b)) {
                    return dVar4;
                }
                C12691d dVar5 = C12691d.RIGHT;
                if (Intrinsics.areEqual((Object) str, (Object) dVar5.f31780b)) {
                    return dVar5;
                }
                C12691d dVar6 = C12691d.BOTTOM_RIGHT;
                if (Intrinsics.areEqual((Object) str, (Object) dVar6.f31780b)) {
                    return dVar6;
                }
                C12691d dVar7 = C12691d.BOTTOM;
                if (Intrinsics.areEqual((Object) str, (Object) dVar7.f31780b)) {
                    return dVar7;
                }
                C12691d dVar8 = C12691d.BOTTOM_LEFT;
                if (Intrinsics.areEqual((Object) str, (Object) dVar8.f31780b)) {
                    return dVar8;
                }
                return null;
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.c00$d$b */
        public static final class C12693b {
            private C12693b() {
            }

            public /* synthetic */ C12693b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Function1<String, C12691d> mo66176a() {
                return C12691d.f31770d;
            }
        }

        static {
            f31769c = new C12693b((DefaultConstructorMarker) null);
            f31770d = C12692a.f31781b;
        }

        private C12691d(String str) {
            this.f31780b = str;
        }
    }

    static {
        $$Lambda$c00$AgEZZIY2NZgwC2zGGyI44Pja6dM r0 = $$Lambda$c00$AgEZZIY2NZgwC2zGGyI44Pja6dM.INSTANCE;
        $$Lambda$c00$xPWcjNS2yOyi_8BI_dG0FuIMfo r02 = $$Lambda$c00$xPWcjNS2yOyi_8BI_dG0FuIMfo.INSTANCE;
    }

    public c00(C13420in inVar, C13420in inVar2, C15177xl xlVar, f50<Integer> f50, String str, C14138nw nwVar, f50<C12691d> f502) {
        Intrinsics.checkNotNullParameter(xlVar, "div");
        Intrinsics.checkNotNullParameter(f50, "duration");
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(f502, "position");
        this.f31760a = inVar;
        this.f31761b = inVar2;
        this.f31762c = xlVar;
        this.f31763d = f50;
        this.f31764e = str;
        this.f31765f = nwVar;
        this.f31766g = f502;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34546a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34549b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34547a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34550b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
