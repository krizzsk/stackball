package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13452ix;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.jx */
public abstract class C13593jx implements qh0, ci0<C13452ix> {

    /* renamed from: a */
    public static final C13595b f35658a = new C13595b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C13593jx> f35659b = C13594a.f35660b;

    /* renamed from: com.yandex.mobile.ads.impl.jx$a */
    static final class C13594a extends Lambda implements Function2<ly0, JSONObject, C13593jx> {

        /* renamed from: b */
        public static final C13594a f35660b = new C13594a();

        C13594a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            Object obj3;
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13595b bVar = C13593jx.f35658a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            Object obj4 = null;
            C13593jx jxVar = a instanceof C13593jx ? (C13593jx) a : null;
            if (jxVar != null) {
                if (jxVar instanceof C13596c) {
                    str = "fixed";
                } else if (jxVar instanceof C13597d) {
                    str = "match_parent";
                } else if (jxVar instanceof C13598e) {
                    str = "wrap_content";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            int hashCode = str.hashCode();
            if (hashCode == 97445748) {
                if (str.equals("fixed")) {
                    if (jxVar != null) {
                        obj4 = jxVar.mo68103b();
                    }
                    obj3 = new C13596c(new C15347zr(ly0, (C15347zr) obj4, false, jSONObject));
                }
                throw py0.m41004a(jSONObject, "type", str);
            } else if (hashCode != 343327108) {
                if (hashCode == 1386124388 && str.equals("match_parent")) {
                    if (jxVar != null) {
                        obj4 = jxVar.mo68103b();
                    }
                    obj3 = new C13597d(new C13350hv(ly0, (C13350hv) obj4, false, jSONObject));
                }
                throw py0.m41004a(jSONObject, "type", str);
            } else {
                if (str.equals("wrap_content")) {
                    if (jxVar != null) {
                        obj4 = jxVar.mo68103b();
                    }
                    obj3 = new C13598e(new y10(ly0, (y10) obj4, false, jSONObject));
                }
                throw py0.m41004a(jSONObject, "type", str);
            }
            return obj3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jx$b */
    public static final class C13595b {
        private C13595b() {
        }

        public /* synthetic */ C13595b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C13593jx> mo68104a() {
            return C13593jx.f35659b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jx$c */
    public static class C13596c extends C13593jx {

        /* renamed from: c */
        private final C15347zr f35661c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13596c(C15347zr zrVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(zrVar, "value");
            this.f35661c = zrVar;
        }

        /* renamed from: c */
        public C15347zr mo68105c() {
            return this.f35661c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jx$d */
    public static class C13597d extends C13593jx {

        /* renamed from: c */
        private final C13350hv f35662c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13597d(C13350hv hvVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(hvVar, "value");
            this.f35662c = hvVar;
        }

        /* renamed from: c */
        public C13350hv mo68106c() {
            return this.f35662c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jx$e */
    public static class C13598e extends C13593jx {

        /* renamed from: c */
        private final y10 f35663c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13598e(y10 y10) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(y10, "value");
            this.f35663c = y10;
        }

        /* renamed from: c */
        public y10 mo68107c() {
            return this.f35663c;
        }
    }

    private C13593jx() {
    }

    public /* synthetic */ C13593jx(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public Object mo68103b() {
        if (this instanceof C13596c) {
            return ((C13596c) this).mo68105c();
        }
        if (this instanceof C13597d) {
            return ((C13597d) this).mo68106c();
        }
        if (this instanceof C13598e) {
            return ((C13598e) this).mo68107c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public C13452ix mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        if (this instanceof C13596c) {
            return new C13452ix.C13455c(((C13596c) this).mo68105c().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C13597d) {
            return new C13452ix.C13456d(((C13597d) this).mo68106c().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C13598e) {
            return new C13452ix.C13457e(((C13598e) this).mo68107c().mo65774a(ly0, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
