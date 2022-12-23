package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.nn */
public abstract class C14111nn implements qh0 {

    /* renamed from: a */
    public static final C14114c f37864a = new C14114c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C14111nn> f37865b = C14113b.f37867b;

    /* renamed from: com.yandex.mobile.ads.impl.nn$a */
    public static class C14112a extends C14111nn {

        /* renamed from: c */
        private final C13866ln f37866c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14112a(C13866ln lnVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(lnVar, "value");
            this.f37866c = lnVar;
        }

        /* renamed from: b */
        public C13866ln mo69066b() {
            return this.f37866c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nn$b */
    static final class C14113b extends Lambda implements Function2<ly0, JSONObject, C14111nn> {

        /* renamed from: b */
        public static final C14113b f37867b = new C14113b();

        C14113b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14114c cVar = C14111nn.f37864a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            int hashCode = str.hashCode();
            if (hashCode != 113762) {
                if (hashCode != 3135100) {
                    if (hashCode != 109250890) {
                        if (hashCode == 109526449 && str.equals("slide")) {
                            return new C14117f(C13904lx.f36937f.mo68525a(ly0, jSONObject));
                        }
                    } else if (str.equals("scale")) {
                        return new C14116e(C14634sw.f40138g.mo70065a(ly0, jSONObject));
                    }
                } else if (str.equals("fade")) {
                    return new C14115d(C14777ur.f40848e.mo70395a(ly0, jSONObject));
                }
            } else if (str.equals("set")) {
                return new C14112a(C13866ln.f36757b.mo68492a(ly0, jSONObject));
            }
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            C14195on onVar = a instanceof C14195on ? (C14195on) a : null;
            if (onVar != null) {
                return onVar.mo65774a(ly0, jSONObject);
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nn$c */
    public static final class C14114c {
        private C14114c() {
        }

        public /* synthetic */ C14114c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nn$d */
    public static class C14115d extends C14111nn {

        /* renamed from: c */
        private final C14777ur f37868c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14115d(C14777ur urVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(urVar, "value");
            this.f37868c = urVar;
        }

        /* renamed from: b */
        public C14777ur mo69067b() {
            return this.f37868c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nn$e */
    public static class C14116e extends C14111nn {

        /* renamed from: c */
        private final C14634sw f37869c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14116e(C14634sw swVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(swVar, "value");
            this.f37869c = swVar;
        }

        /* renamed from: b */
        public C14634sw mo69068b() {
            return this.f37869c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nn$f */
    public static class C14117f extends C14111nn {

        /* renamed from: c */
        private final C13904lx f37870c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14117f(C13904lx lxVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(lxVar, "value");
            this.f37870c = lxVar;
        }

        /* renamed from: b */
        public C13904lx mo69069b() {
            return this.f37870c;
        }
    }

    private C14111nn() {
    }

    public /* synthetic */ C14111nn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
