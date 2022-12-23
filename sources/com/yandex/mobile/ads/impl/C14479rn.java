package com.yandex.mobile.ads.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.rn */
public abstract class C14479rn implements qh0 {

    /* renamed from: a */
    public static final C14481b f39510a = new C14481b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C14479rn> f39511b = C14480a.f39512b;

    /* renamed from: com.yandex.mobile.ads.impl.rn$a */
    static final class C14480a extends Lambda implements Function2<ly0, JSONObject, C14479rn> {

        /* renamed from: b */
        public static final C14480a f39512b = new C14480a();

        C14480a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14481b bVar = C14479rn.f39510a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            int hashCode = str.hashCode();
            if (hashCode != 89650992) {
                if (hashCode != 100313435) {
                    if (hashCode == 109618859 && str.equals("solid")) {
                        return new C14484e(C13148fy.f33775b.mo67097a(ly0, jSONObject));
                    }
                } else if (str.equals("image")) {
                    return new C14483d(C13133ft.f33713g.mo67080a(ly0, jSONObject));
                }
            } else if (str.equals("gradient")) {
                return new C14482c(C14706ts.f40434c.mo70220a(ly0, jSONObject));
            }
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            C14618sn snVar = a instanceof C14618sn ? (C14618sn) a : null;
            if (snVar != null) {
                return snVar.mo65774a(ly0, jSONObject);
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rn$b */
    public static final class C14481b {
        private C14481b() {
        }

        public /* synthetic */ C14481b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rn$c */
    public static class C14482c extends C14479rn {

        /* renamed from: c */
        private final C14706ts f39513c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14482c(C14706ts tsVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(tsVar, "value");
            this.f39513c = tsVar;
        }

        /* renamed from: c */
        public C14706ts mo69793c() {
            return this.f39513c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rn$d */
    public static class C14483d extends C14479rn {

        /* renamed from: c */
        private final C13133ft f39514c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14483d(C13133ft ftVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(ftVar, "value");
            this.f39514c = ftVar;
        }

        /* renamed from: c */
        public C13133ft mo69794c() {
            return this.f39514c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rn$e */
    public static class C14484e extends C14479rn {

        /* renamed from: c */
        private final C13148fy f39515c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14484e(C13148fy fyVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(fyVar, "value");
            this.f39515c = fyVar;
        }

        /* renamed from: c */
        public C13148fy mo69795c() {
            return this.f39515c;
        }
    }

    private C14479rn() {
    }

    public /* synthetic */ C14479rn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public Object mo69792b() {
        if (this instanceof C14482c) {
            return ((C14482c) this).mo69793c();
        }
        if (this instanceof C14483d) {
            return ((C14483d) this).mo69794c();
        }
        if (this instanceof C14484e) {
            return ((C14484e) this).mo69795c();
        }
        throw new NoWhenBranchMatchedException();
    }
}
