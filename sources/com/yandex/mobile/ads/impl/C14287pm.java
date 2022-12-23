package com.yandex.mobile.ads.impl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.p243my.target.ads.Reward;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.pm */
public class C14287pm implements qh0 {

    /* renamed from: d */
    public static final C14291d f38708d = new C14291d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final f50<C14292e> f38709e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final f50<C14295f> f38710f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final cg1<C14292e> f38711g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final cg1<C14295f> f38712h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final rh1<String> f38713i = $$Lambda$pm$rk8uW_NBbv1NSujL5cBl4UNsY0.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final rh1<String> f38714j = $$Lambda$pm$qiE_GzIUcHtOH9sExcOEusW0LE.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final rh1<String> f38715k = $$Lambda$pm$DAnbRbOMZgyBO9f6w4wYAI5bNik.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Function2<ly0, JSONObject, C14287pm> f38716l = C14288a.f38720b;

    /* renamed from: a */
    public final f50<String> f38717a;

    /* renamed from: b */
    public final f50<String> f38718b;

    /* renamed from: c */
    public final f50<C14295f> f38719c;

    /* renamed from: com.yandex.mobile.ads.impl.pm$a */
    static final class C14288a extends Lambda implements Function2<ly0, JSONObject, C14287pm> {

        /* renamed from: b */
        public static final C14288a f38720b = new C14288a();

        C14288a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14291d dVar = C14287pm.f38708d;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            rh1 b2 = C14287pm.f38713i;
            cg1<String> cg1 = dg1.f32575c;
            JSONObject jSONObject2 = jSONObject;
            ny0 ny0 = b;
            ly0 ly02 = ly0;
            cg1<String> cg12 = cg1;
            f50<String> b3 = zh0.m44620b(jSONObject2, "description", b2, ny0, ly02, cg12);
            f50<String> b4 = zh0.m44620b(jSONObject2, ViewHierarchyConstants.HINT_KEY, C14287pm.f38714j, ny0, ly02, cg12);
            C14292e.C14294b bVar = C14292e.f38723c;
            f50 b5 = zh0.m44621b(jSONObject, "mode", C14292e.f38724d, ny0, ly02, C14287pm.f38711g);
            if (b5 == null) {
                b5 = C14287pm.f38709e;
            }
            f50 f50 = b5;
            ny0 ny02 = b;
            ly0 ly03 = ly0;
            f50<String> b6 = zh0.m44620b(jSONObject, "state_description", C14287pm.f38715k, ny02, ly03, cg1);
            C14295f.C14297b bVar2 = C14295f.f38731c;
            f50 b7 = zh0.m44621b(jSONObject, "type", C14295f.f38732d, ny02, ly03, C14287pm.f38712h);
            if (b7 == null) {
                b7 = C14287pm.f38710f;
            }
            return new C14287pm(b3, b4, f50, b6, b7);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pm$b */
    static final class C14289b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14289b f38721b = new C14289b();

        C14289b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C14292e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pm$c */
    static final class C14290c extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14290c f38722b = new C14290c();

        C14290c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C14295f);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pm$d */
    public static final class C14291d {
        private C14291d() {
        }

        public /* synthetic */ C14291d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pm$e */
    public enum C14292e {
        f38725e(Reward.DEFAULT),
        MERGE("merge"),
        EXCLUDE("exclude");
        

        /* renamed from: c */
        public static final C14294b f38723c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final Function1<String, C14292e> f38724d = null;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f38729b;

        /* renamed from: com.yandex.mobile.ads.impl.pm$e$a */
        static final class C14293a extends Lambda implements Function1<String, C14292e> {

            /* renamed from: b */
            public static final C14293a f38730b = null;

            static {
                f38730b = new C14293a();
            }

            C14293a() {
                super(1);
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(str, "string");
                C14292e eVar = C14292e.f38725e;
                if (Intrinsics.areEqual((Object) str, (Object) eVar.f38729b)) {
                    return eVar;
                }
                C14292e eVar2 = C14292e.MERGE;
                if (Intrinsics.areEqual((Object) str, (Object) eVar2.f38729b)) {
                    return eVar2;
                }
                C14292e eVar3 = C14292e.EXCLUDE;
                if (Intrinsics.areEqual((Object) str, (Object) eVar3.f38729b)) {
                    return eVar3;
                }
                return null;
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.pm$e$b */
        public static final class C14294b {
            private C14294b() {
            }

            public /* synthetic */ C14294b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Function1<String, C14292e> mo69386a() {
                return C14292e.f38724d;
            }
        }

        static {
            f38723c = new C14294b((DefaultConstructorMarker) null);
            f38724d = C14293a.f38730b;
        }

        private C14292e(String str) {
            this.f38729b = str;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pm$f */
    public enum C14295f {
        NONE("none"),
        BUTTON("button"),
        f38735g("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER("header"),
        TAB_BAR("tab_bar");
        

        /* renamed from: c */
        public static final C14297b f38731c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final Function1<String, C14295f> f38732d = null;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f38741b;

        /* renamed from: com.yandex.mobile.ads.impl.pm$f$a */
        static final class C14296a extends Lambda implements Function1<String, C14295f> {

            /* renamed from: b */
            public static final C14296a f38742b = null;

            static {
                f38742b = new C14296a();
            }

            C14296a() {
                super(1);
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(str, "string");
                C14295f fVar = C14295f.NONE;
                if (Intrinsics.areEqual((Object) str, (Object) fVar.f38741b)) {
                    return fVar;
                }
                C14295f fVar2 = C14295f.BUTTON;
                if (Intrinsics.areEqual((Object) str, (Object) fVar2.f38741b)) {
                    return fVar2;
                }
                C14295f fVar3 = C14295f.f38735g;
                if (Intrinsics.areEqual((Object) str, (Object) fVar3.f38741b)) {
                    return fVar3;
                }
                C14295f fVar4 = C14295f.TEXT;
                if (Intrinsics.areEqual((Object) str, (Object) fVar4.f38741b)) {
                    return fVar4;
                }
                C14295f fVar5 = C14295f.EDIT_TEXT;
                if (Intrinsics.areEqual((Object) str, (Object) fVar5.f38741b)) {
                    return fVar5;
                }
                C14295f fVar6 = C14295f.HEADER;
                if (Intrinsics.areEqual((Object) str, (Object) fVar6.f38741b)) {
                    return fVar6;
                }
                C14295f fVar7 = C14295f.TAB_BAR;
                if (Intrinsics.areEqual((Object) str, (Object) fVar7.f38741b)) {
                    return fVar7;
                }
                return null;
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.pm$f$b */
        public static final class C14297b {
            private C14297b() {
            }

            public /* synthetic */ C14297b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Function1<String, C14295f> mo69387a() {
                return C14295f.f38732d;
            }
        }

        static {
            f38731c = new C14297b((DefaultConstructorMarker) null);
            f38732d = C14296a.f38742b;
        }

        private C14295f(String str) {
            this.f38741b = str;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f38709e = aVar.mo66929a(C14292e.f38725e);
        f38710f = aVar.mo66929a(C14295f.NONE);
        cg1.C12733a aVar2 = cg1.f31917a;
        f38711g = aVar2.mo66293a(ArraysKt.first((T[]) C14292e.values()), C14289b.f38721b);
        f38712h = aVar2.mo66293a(ArraysKt.first((T[]) C14295f.values()), C14290c.f38722b);
        $$Lambda$pm$NDl1NETaEkzX0ivKy7nEbNFaAGg r0 = $$Lambda$pm$NDl1NETaEkzX0ivKy7nEbNFaAGg.INSTANCE;
        $$Lambda$pm$SSQ6PwrBhMJ2YZYXN4V47tO3QXQ r02 = $$Lambda$pm$SSQ6PwrBhMJ2YZYXN4V47tO3QXQ.INSTANCE;
        $$Lambda$pm$3ra_u1wf0SwMAZG1L0qrFrG1MQ r03 = $$Lambda$pm$3ra_u1wf0SwMAZG1L0qrFrG1MQ.INSTANCE;
    }

    public C14287pm() {
        this((f50) null, (f50) null, (f50) null, (f50) null, (f50) null, 31);
    }

    public C14287pm(f50<String> f50, f50<String> f502, f50<C14292e> f503, f50<String> f504, f50<C14295f> f505) {
        Intrinsics.checkNotNullParameter(f503, "mode");
        Intrinsics.checkNotNullParameter(f505, "type");
        this.f38717a = f50;
        this.f38718b = f504;
        this.f38719c = f505;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m40853a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m40855b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m40857c(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m40859d(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m40861e(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m40863f(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14287pm(f50 f50, f50 f502, f50 f503, f50 f504, f50 f505, int i) {
        this((f50<String>) null, (f50<String>) null, (i & 4) != 0 ? f38709e : null, (f50<String>) null, (i & 16) != 0 ? f38710f : null);
    }
}
