package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public abstract class w00 implements qh0 {

    /* renamed from: a */
    public static final C15021d f41826a = new C15021d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, w00> f41827b = C15020c.f41830b;

    /* renamed from: com.yandex.mobile.ads.impl.w00$a */
    public static class C15018a extends w00 {

        /* renamed from: c */
        private final C14452rc f41828c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15018a(C14452rc rcVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(rcVar, "value");
            this.f41828c = rcVar;
        }

        /* renamed from: b */
        public C14452rc mo70613b() {
            return this.f41828c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.w00$b */
    public static class C15019b extends w00 {

        /* renamed from: c */
        private final C13409ig f41829c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15019b(C13409ig igVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(igVar, "value");
            this.f41829c = igVar;
        }

        /* renamed from: b */
        public C13409ig mo70614b() {
            return this.f41829c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.w00$c */
    static final class C15020c extends Lambda implements Function2<ly0, JSONObject, w00> {

        /* renamed from: b */
        public static final C15020c f41830b = new C15020c();

        C15020c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C15021d dVar = w00.f41826a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        return new C15023f(yv0.f42968c.mo71131a(ly0, jSONObject));
                    }
                    break;
                case -891985903:
                    if (str.equals("string")) {
                        return new C15024g(kb1.f36086c.mo68197a(ly0, jSONObject));
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        return new C15025h(zg1.f43114c.mo71216a(ly0, jSONObject));
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        return new C15019b(C13409ig.f34849c.mo67781a(ly0, jSONObject));
                    }
                    break;
                case 1958052158:
                    if (str.equals("integer")) {
                        return new C15022e(dh0.f32582c.mo66585a(ly0, jSONObject));
                    }
                    break;
                case 2005892378:
                    if (str.equals("bool_int")) {
                        return new C15018a(C14452rc.f39429c.mo69751a(ly0, jSONObject));
                    }
                    break;
            }
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            x00 x00 = a instanceof x00 ? (x00) a : null;
            if (x00 != null) {
                return x00.mo65774a(ly0, jSONObject);
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.w00$d */
    public static final class C15021d {
        private C15021d() {
        }

        public /* synthetic */ C15021d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.w00$e */
    public static class C15022e extends w00 {

        /* renamed from: c */
        private final dh0 f41831c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15022e(dh0 dh0) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(dh0, "value");
            this.f41831c = dh0;
        }

        /* renamed from: b */
        public dh0 mo70615b() {
            return this.f41831c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.w00$f */
    public static class C15023f extends w00 {

        /* renamed from: c */
        private final yv0 f41832c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15023f(yv0 yv0) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(yv0, "value");
            this.f41832c = yv0;
        }

        /* renamed from: b */
        public yv0 mo70616b() {
            return this.f41832c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.w00$g */
    public static class C15024g extends w00 {

        /* renamed from: c */
        private final kb1 f41833c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15024g(kb1 kb1) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(kb1, "value");
            this.f41833c = kb1;
        }

        /* renamed from: b */
        public kb1 mo70617b() {
            return this.f41833c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.w00$h */
    public static class C15025h extends w00 {

        /* renamed from: c */
        private final zg1 f41834c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15025h(zg1 zg1) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(zg1, "value");
            this.f41834c = zg1;
        }

        /* renamed from: b */
        public zg1 mo70618b() {
            return this.f41834c;
        }
    }

    private w00() {
    }

    public /* synthetic */ w00(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
