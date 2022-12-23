package com.yandex.mobile.ads.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ix */
public abstract class C13452ix implements qh0 {

    /* renamed from: a */
    public static final C13454b f35059a = new C13454b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C13452ix> f35060b = C13453a.f35061b;

    /* renamed from: com.yandex.mobile.ads.impl.ix$a */
    static final class C13453a extends Lambda implements Function2<ly0, JSONObject, C13452ix> {

        /* renamed from: b */
        public static final C13453a f35061b = new C13453a();

        C13453a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13454b bVar = C13452ix.f35059a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            int hashCode = str.hashCode();
            if (hashCode != 97445748) {
                if (hashCode != 343327108) {
                    if (hashCode == 1386124388 && str.equals("match_parent")) {
                        return new C13456d(C13250gv.f34155b.mo67353a(ly0, jSONObject));
                    }
                } else if (str.equals("wrap_content")) {
                    return new C13457e(x10.f42356a.mo70787a(ly0, jSONObject));
                }
            } else if (str.equals("fixed")) {
                return new C13455c(C15266yr.f42914c.mo71109a(ly0, jSONObject));
            }
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            C13593jx jxVar = a instanceof C13593jx ? (C13593jx) a : null;
            if (jxVar != null) {
                return jxVar.mo65774a(ly0, jSONObject);
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ix$b */
    public static final class C13454b {
        private C13454b() {
        }

        public /* synthetic */ C13454b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ix$c */
    public static class C13455c extends C13452ix {

        /* renamed from: c */
        private final C15266yr f35062c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13455c(C15266yr yrVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(yrVar, "value");
            this.f35062c = yrVar;
        }

        /* renamed from: c */
        public C15266yr mo67900c() {
            return this.f35062c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ix$d */
    public static class C13456d extends C13452ix {

        /* renamed from: c */
        private final C13250gv f35063c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13456d(C13250gv gvVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(gvVar, "value");
            this.f35063c = gvVar;
        }

        /* renamed from: c */
        public C13250gv mo67901c() {
            return this.f35063c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ix$e */
    public static class C13457e extends C13452ix {

        /* renamed from: c */
        private final x10 f35064c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13457e(x10 x10) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(x10, "value");
            this.f35064c = x10;
        }

        /* renamed from: c */
        public x10 mo67902c() {
            return this.f35064c;
        }
    }

    private C13452ix() {
    }

    public /* synthetic */ C13452ix(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public Object mo67899b() {
        if (this instanceof C13455c) {
            return ((C13455c) this).mo67900c();
        }
        if (this instanceof C13456d) {
            return ((C13456d) this).mo67901c();
        }
        if (this instanceof C13457e) {
            return ((C13457e) this).mo67902c();
        }
        throw new NoWhenBranchMatchedException();
    }
}
