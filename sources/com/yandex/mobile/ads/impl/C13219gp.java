package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13086fp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.gp */
public abstract class C13219gp implements qh0, ci0<C13086fp> {

    /* renamed from: a */
    public static final C13222c f34061a = new C13222c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C13219gp> f34062b = C13221b.f34064b;

    /* renamed from: com.yandex.mobile.ads.impl.gp$a */
    public static class C13220a extends C13219gp {

        /* renamed from: c */
        private final C12749cp f34063c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13220a(C12749cp cpVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(cpVar, "value");
            this.f34063c = cpVar;
        }

        /* renamed from: c */
        public C12749cp mo67339c() {
            return this.f34063c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gp$b */
    static final class C13221b extends Lambda implements Function2<ly0, JSONObject, C13219gp> {

        /* renamed from: b */
        public static final C13221b f34064b = new C13221b();

        C13221b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            Object obj3;
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13222c cVar = C13219gp.f34061a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            Object obj4 = null;
            C13219gp gpVar = a instanceof C13219gp ? (C13219gp) a : null;
            if (gpVar != null) {
                if (gpVar instanceof C13223d) {
                    str = "set";
                } else if (gpVar instanceof C13220a) {
                    str = "change_bounds";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (Intrinsics.areEqual((Object) str, (Object) "set")) {
                if (gpVar != null) {
                    obj4 = gpVar.mo67338b();
                }
                obj3 = new C13223d(new C12987ep(ly0, (C12987ep) obj4, false, jSONObject));
            } else if (Intrinsics.areEqual((Object) str, (Object) "change_bounds")) {
                if (gpVar != null) {
                    obj4 = gpVar.mo67338b();
                }
                obj3 = new C13220a(new C12749cp(ly0, (C12749cp) obj4, false, jSONObject));
            } else {
                throw py0.m41004a(jSONObject, "type", str);
            }
            return obj3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gp$c */
    public static final class C13222c {
        private C13222c() {
        }

        public /* synthetic */ C13222c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C13219gp> mo67340a() {
            return C13219gp.f34062b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gp$d */
    public static class C13223d extends C13219gp {

        /* renamed from: c */
        private final C12987ep f34065c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13223d(C12987ep epVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(epVar, "value");
            this.f34065c = epVar;
        }

        /* renamed from: c */
        public C12987ep mo67341c() {
            return this.f34065c;
        }
    }

    private C13219gp() {
    }

    public /* synthetic */ C13219gp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public Object mo67338b() {
        if (this instanceof C13223d) {
            return ((C13223d) this).mo67341c();
        }
        if (this instanceof C13220a) {
            return ((C13220a) this).mo67339c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public C13086fp mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        if (this instanceof C13223d) {
            return new C13086fp.C13090d(((C13223d) this).mo67341c().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C13220a) {
            return new C13086fp.C13087a(((C13220a) this).mo67339c().mo65774a(ly0, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
