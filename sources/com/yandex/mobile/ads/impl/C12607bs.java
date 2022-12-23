package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14479rn;
import com.yandex.mobile.ads.impl.C14687tm;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.bs */
public class C12607bs implements qh0 {

    /* renamed from: e */
    public static final C12609b f31402e = new C12609b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final gj0<C14479rn> f31403f = $$Lambda$bs$2ZD02nrXfQndwaZht9KiauJMlEY.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final gj0<C14687tm> f31404g = $$Lambda$bs$84wjrEzeAVcMygxF68hKO8A4ZCE.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final gj0<C14687tm> f31405h = $$Lambda$bs$S8LOYQBqSKYHiUx86_MwOmkAmaU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Function2<ly0, JSONObject, C12607bs> f31406i = C12608a.f31411b;

    /* renamed from: a */
    public final List<C14479rn> f31407a;

    /* renamed from: b */
    public final C12610c f31408b;

    /* renamed from: c */
    public final List<C14687tm> f31409c;

    /* renamed from: d */
    public final List<C14687tm> f31410d;

    /* renamed from: com.yandex.mobile.ads.impl.bs$a */
    static final class C12608a extends Lambda implements Function2<ly0, JSONObject, C12607bs> {

        /* renamed from: b */
        public static final C12608a f31411b = new C12608a();

        C12608a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C12609b bVar = C12607bs.f31402e;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C14479rn.C14481b bVar2 = C14479rn.f39510a;
            ny0 ny0 = b;
            ly0 ly02 = ly0;
            List b2 = zh0.m44626b(jSONObject, "background", C14479rn.f39511b, C12607bs.f31403f, ny0, ly02);
            C12610c.C12612b bVar3 = C12610c.f31412f;
            C14687tm.C14690c cVar = C14687tm.f40352i;
            JSONObject jSONObject2 = jSONObject;
            return new C12607bs(b2, (C12610c) zh0.m44622b(jSONObject, "next_focus_ids", C12610c.f31418l, b, ly0), zh0.m44626b(jSONObject2, "on_blur", C14687tm.f40356m, C12607bs.f31404g, ny0, ly02), zh0.m44626b(jSONObject2, "on_focus", C14687tm.f40356m, C12607bs.f31405h, ny0, ly02));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bs$b */
    public static final class C12609b {
        private C12609b() {
        }

        public /* synthetic */ C12609b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bs$c */
    public static class C12610c implements qh0 {

        /* renamed from: f */
        public static final C12612b f31412f = new C12612b((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final rh1<String> f31413g = $$Lambda$bs$c$RR3h68yWbtjCMlRXuGmuEQNriI.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final rh1<String> f31414h = $$Lambda$bs$c$4XKT8APN5nckjvdgN0Gk0fvAya4.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final rh1<String> f31415i = $$Lambda$bs$c$PMugxjesr46ejm8x2A1BFJbaA9A.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public static final rh1<String> f31416j = $$Lambda$bs$c$RU4_FRzPwNLOqXMv5Xp4nHVjZ9w.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public static final rh1<String> f31417k = $$Lambda$bs$c$K17pdULxqiofda4Jqjj4FT9Y4FQ.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static final Function2<ly0, JSONObject, C12610c> f31418l = C12611a.f31424b;

        /* renamed from: a */
        public final f50<String> f31419a;

        /* renamed from: b */
        public final f50<String> f31420b;

        /* renamed from: c */
        public final f50<String> f31421c;

        /* renamed from: d */
        public final f50<String> f31422d;

        /* renamed from: e */
        public final f50<String> f31423e;

        /* renamed from: com.yandex.mobile.ads.impl.bs$c$a */
        static final class C12611a extends Lambda implements Function2<ly0, JSONObject, C12610c> {

            /* renamed from: b */
            public static final C12611a f31424b = new C12611a();

            C12611a() {
                super(2);
            }

            public Object invoke(Object obj, Object obj2) {
                ly0 ly0 = (ly0) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                Intrinsics.checkNotNullParameter(ly0, "env");
                Intrinsics.checkNotNullParameter(jSONObject, "it");
                C12612b bVar = C12610c.f31412f;
                Intrinsics.checkNotNullParameter(ly0, "env");
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                ny0 b = ly0.mo66818b();
                rh1 b2 = C12610c.f31413g;
                JSONObject jSONObject2 = jSONObject;
                ny0 ny0 = b;
                ly0 ly02 = ly0;
                cg1<String> cg1 = dg1.f32575c;
                return new C12610c(zh0.m44620b(jSONObject2, "down", b2, ny0, ly02, cg1), zh0.m44620b(jSONObject2, "forward", C12610c.f31414h, ny0, ly02, cg1), zh0.m44620b(jSONObject2, "left", C12610c.f31415i, ny0, ly02, cg1), zh0.m44620b(jSONObject2, "right", C12610c.f31416j, ny0, ly02, cg1), zh0.m44620b(jSONObject2, "up", C12610c.f31417k, ny0, ly02, cg1));
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.bs$c$b */
        public static final class C12612b {
            private C12612b() {
            }

            public /* synthetic */ C12612b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            $$Lambda$bs$c$2MMhTVCwRqaaSKYQxL70zmX2LzU r0 = $$Lambda$bs$c$2MMhTVCwRqaaSKYQxL70zmX2LzU.INSTANCE;
            $$Lambda$bs$c$uJWM0mLqsl94PMkM5I4AL0tmYA r02 = $$Lambda$bs$c$uJWM0mLqsl94PMkM5I4AL0tmYA.INSTANCE;
            $$Lambda$bs$c$cXoQswJz62ERS3Udf7CDuiFQDIs r03 = $$Lambda$bs$c$cXoQswJz62ERS3Udf7CDuiFQDIs.INSTANCE;
            $$Lambda$bs$c$_ZmB62fmNFdTgq4hIMUmah8FxU r04 = $$Lambda$bs$c$_ZmB62fmNFdTgq4hIMUmah8FxU.INSTANCE;
            $$Lambda$bs$c$9_htU8WivXBB2eK5Bqeri1HbXrg r05 = $$Lambda$bs$c$9_htU8WivXBB2eK5Bqeri1HbXrg.INSTANCE;
        }

        public C12610c() {
            this((f50) null, (f50) null, (f50) null, (f50) null, (f50) null, 31);
        }

        public C12610c(f50<String> f50, f50<String> f502, f50<String> f503, f50<String> f504, f50<String> f505) {
            this.f31419a = f50;
            this.f31420b = f502;
            this.f31421c = f503;
            this.f31422d = f504;
            this.f31423e = f505;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final boolean m34331g(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final boolean m34332h(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final boolean m34333i(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final boolean m34334j(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static final boolean m34320a(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final boolean m34322b(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m34324c(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final boolean m34326d(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final boolean m34328e(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final boolean m34330f(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        public /* synthetic */ C12610c(f50 f50, f50 f502, f50 f503, f50 f504, f50 f505, int i) {
            this((f50<String>) null, (f50<String>) null, (f50<String>) null, (f50<String>) null, (f50<String>) null);
        }
    }

    public C12607bs() {
        this((List) null, (C12610c) null, (List) null, (List) null, 15);
    }

    public C12607bs(List<? extends C14479rn> list, C12610c cVar, List<? extends C14687tm> list2, List<? extends C14687tm> list3) {
        this.f31407a = list;
        this.f31408b = cVar;
        this.f31409c = list2;
        this.f31410d = list3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34313a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34315b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m34317c(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    public /* synthetic */ C12607bs(List list, C12610c cVar, List list2, List list3, int i) {
        this((List<? extends C14479rn>) null, (C12610c) null, (List<? extends C14687tm>) null, (List<? extends C14687tm>) null);
    }
}
