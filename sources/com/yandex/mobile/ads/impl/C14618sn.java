package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14479rn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.sn */
public abstract class C14618sn implements qh0, ci0<C14479rn> {

    /* renamed from: a */
    public static final C14620b f40069a = new C14620b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C14618sn> f40070b = C14619a.f40071b;

    /* renamed from: com.yandex.mobile.ads.impl.sn$a */
    static final class C14619a extends Lambda implements Function2<ly0, JSONObject, C14618sn> {

        /* renamed from: b */
        public static final C14619a f40071b = new C14619a();

        C14619a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            Object obj3;
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14620b bVar = C14618sn.f40069a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            Object obj4 = null;
            C14618sn snVar = a instanceof C14618sn ? (C14618sn) a : null;
            if (snVar != null) {
                if (snVar instanceof C14621c) {
                    str = "gradient";
                } else if (snVar instanceof C14622d) {
                    str = "image";
                } else if (snVar instanceof C14623e) {
                    str = "solid";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            int hashCode = str.hashCode();
            if (hashCode == 89650992) {
                if (str.equals("gradient")) {
                    if (snVar != null) {
                        obj4 = snVar.mo70030b();
                    }
                    obj3 = new C14621c(new C14781us(ly0, (C14781us) obj4, false, jSONObject));
                }
                throw py0.m41004a(jSONObject, "type", str);
            } else if (hashCode != 100313435) {
                if (hashCode == 109618859 && str.equals("solid")) {
                    if (snVar != null) {
                        obj4 = snVar.mo70030b();
                    }
                    obj3 = new C14623e(new C13258gy(ly0, (C13258gy) obj4, false, jSONObject));
                }
                throw py0.m41004a(jSONObject, "type", str);
            } else {
                if (str.equals("image")) {
                    if (snVar != null) {
                        obj4 = snVar.mo70030b();
                    }
                    obj3 = new C14622d(new C13237gt(ly0, (C13237gt) obj4, false, jSONObject));
                }
                throw py0.m41004a(jSONObject, "type", str);
            }
            return obj3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sn$b */
    public static final class C14620b {
        private C14620b() {
        }

        public /* synthetic */ C14620b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14618sn> mo70031a() {
            return C14618sn.f40070b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sn$c */
    public static class C14621c extends C14618sn {

        /* renamed from: c */
        private final C14781us f40072c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14621c(C14781us usVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(usVar, "value");
            this.f40072c = usVar;
        }

        /* renamed from: c */
        public C14781us mo70032c() {
            return this.f40072c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sn$d */
    public static class C14622d extends C14618sn {

        /* renamed from: c */
        private final C13237gt f40073c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14622d(C13237gt gtVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(gtVar, "value");
            this.f40073c = gtVar;
        }

        /* renamed from: c */
        public C13237gt mo70033c() {
            return this.f40073c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sn$e */
    public static class C14623e extends C14618sn {

        /* renamed from: c */
        private final C13258gy f40074c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14623e(C13258gy gyVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(gyVar, "value");
            this.f40074c = gyVar;
        }

        /* renamed from: c */
        public C13258gy mo70034c() {
            return this.f40074c;
        }
    }

    private C14618sn() {
    }

    public /* synthetic */ C14618sn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public Object mo70030b() {
        if (this instanceof C14621c) {
            return ((C14621c) this).mo70032c();
        }
        if (this instanceof C14622d) {
            return ((C14622d) this).mo70033c();
        }
        if (this instanceof C14623e) {
            return ((C14623e) this).mo70034c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public C14479rn mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        if (this instanceof C14621c) {
            return new C14479rn.C14482c(((C14621c) this).mo70032c().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C14622d) {
            return new C14479rn.C14483d(((C14622d) this).mo70033c().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C14623e) {
            return new C14479rn.C14484e(((C14623e) this).mo70034c().mo65774a(ly0, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
