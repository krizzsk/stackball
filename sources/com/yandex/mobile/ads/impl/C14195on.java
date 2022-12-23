package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14111nn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.on */
public abstract class C14195on implements qh0, ci0<C14111nn> {

    /* renamed from: a */
    public static final C14198c f38279a = new C14198c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C14195on> f38280b = C14197b.f38282b;

    /* renamed from: com.yandex.mobile.ads.impl.on$a */
    public static class C14196a extends C14195on {

        /* renamed from: c */
        private final C13994mn f38281c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14196a(C13994mn mnVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(mnVar, "value");
            this.f38281c = mnVar;
        }

        /* renamed from: c */
        public C13994mn mo69231c() {
            return this.f38281c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.on$b */
    static final class C14197b extends Lambda implements Function2<ly0, JSONObject, C14195on> {

        /* renamed from: b */
        public static final C14197b f38282b = new C14197b();

        C14197b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            Object obj3;
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14198c cVar = C14195on.f38279a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            Object obj4 = null;
            C14195on onVar = a instanceof C14195on ? (C14195on) a : null;
            if (onVar != null) {
                if (onVar instanceof C14196a) {
                    str = "set";
                } else if (onVar instanceof C14199d) {
                    str = "fade";
                } else if (onVar instanceof C14200e) {
                    str = "scale";
                } else if (onVar instanceof C14201f) {
                    str = "slide";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            int hashCode = str.hashCode();
            if (hashCode == 113762) {
                if (str.equals("set")) {
                    if (onVar != null) {
                        obj4 = onVar.mo69230b();
                    }
                    obj3 = new C14196a(new C13994mn(ly0, (C13994mn) obj4, false, jSONObject));
                }
                throw py0.m41004a(jSONObject, "type", str);
            } else if (hashCode == 3135100) {
                if (str.equals("fade")) {
                    if (onVar != null) {
                        obj4 = onVar.mo69230b();
                    }
                    obj3 = new C14199d(new C14907vr(ly0, (C14907vr) obj4, false, jSONObject));
                }
                throw py0.m41004a(jSONObject, "type", str);
            } else if (hashCode != 109250890) {
                if (hashCode == 109526449 && str.equals("slide")) {
                    if (onVar != null) {
                        obj4 = onVar.mo69230b();
                    }
                    obj3 = new C14201f(new C14025mx(ly0, (C14025mx) obj4, false, jSONObject));
                }
                throw py0.m41004a(jSONObject, "type", str);
            } else {
                if (str.equals("scale")) {
                    if (onVar != null) {
                        obj4 = onVar.mo69230b();
                    }
                    obj3 = new C14200e(new C14718tw(ly0, (C14718tw) obj4, false, jSONObject));
                }
                throw py0.m41004a(jSONObject, "type", str);
            }
            return obj3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.on$c */
    public static final class C14198c {
        private C14198c() {
        }

        public /* synthetic */ C14198c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14195on> mo69232a() {
            return C14195on.f38280b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.on$d */
    public static class C14199d extends C14195on {

        /* renamed from: c */
        private final C14907vr f38283c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14199d(C14907vr vrVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(vrVar, "value");
            this.f38283c = vrVar;
        }

        /* renamed from: c */
        public C14907vr mo69233c() {
            return this.f38283c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.on$e */
    public static class C14200e extends C14195on {

        /* renamed from: c */
        private final C14718tw f38284c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14200e(C14718tw twVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(twVar, "value");
            this.f38284c = twVar;
        }

        /* renamed from: c */
        public C14718tw mo69234c() {
            return this.f38284c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.on$f */
    public static class C14201f extends C14195on {

        /* renamed from: c */
        private final C14025mx f38285c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14201f(C14025mx mxVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(mxVar, "value");
            this.f38285c = mxVar;
        }

        /* renamed from: c */
        public C14025mx mo69235c() {
            return this.f38285c;
        }
    }

    private C14195on() {
    }

    public /* synthetic */ C14195on(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public Object mo69230b() {
        if (this instanceof C14196a) {
            return ((C14196a) this).mo69231c();
        }
        if (this instanceof C14199d) {
            return ((C14199d) this).mo69233c();
        }
        if (this instanceof C14200e) {
            return ((C14200e) this).mo69234c();
        }
        if (this instanceof C14201f) {
            return ((C14201f) this).mo69235c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public C14111nn mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        if (this instanceof C14196a) {
            return new C14111nn.C14112a(((C14196a) this).mo69231c().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C14199d) {
            return new C14111nn.C14115d(((C14199d) this).mo69233c().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C14200e) {
            return new C14111nn.C14116e(((C14200e) this).mo69234c().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C14201f) {
            return new C14111nn.C14117f(((C14201f) this).mo69235c().mo65774a(ly0, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
