package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C13064fn;
import com.yandex.mobile.ads.impl.C14687tm;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class g20 implements qh0, ci0<f20> {

    /* renamed from: c */
    public static final C13165d f33849c = new C13165d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final gj0<C14687tm> f33850d = $$Lambda$g20$a6KHGE0OcdUl4Ij6w3U1rYltnSg.INSTANCE;

    /* renamed from: e */
    private static final gj0<C13064fn> f33851e = $$Lambda$g20$MdzRCDjVVuodp0SghECtOIt2_10.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final gj0<C14687tm> f33852f = $$Lambda$g20$Z4p5jtSZCrII7YFfhPwCE8nZ_dM.INSTANCE;

    /* renamed from: g */
    private static final gj0<C13064fn> f33853g = $$Lambda$g20$5PELXtteiPBByvCXvjtKa2IXeCI.INSTANCE;

    /* renamed from: h */
    private static final Function3<String, JSONObject, ly0, List<C14687tm>> f33854h = C13163b.f33860b;

    /* renamed from: i */
    private static final Function3<String, JSONObject, ly0, List<C14687tm>> f33855i = C13164c.f33861b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Function2<ly0, JSONObject, g20> f33856j = C13162a.f33859b;

    /* renamed from: a */
    public final v60<List<C13064fn>> f33857a;

    /* renamed from: b */
    public final v60<List<C13064fn>> f33858b;

    /* renamed from: com.yandex.mobile.ads.impl.g20$a */
    static final class C13162a extends Lambda implements Function2<ly0, JSONObject, g20> {

        /* renamed from: b */
        public static final C13162a f33859b = new C13162a();

        C13162a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new g20(ly0, (g20) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.g20$b */
    static final class C13163b extends Lambda implements Function3<String, JSONObject, ly0, List<C14687tm>> {

        /* renamed from: b */
        public static final C13163b f33860b = new C13163b();

        C13163b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14687tm.C14690c cVar = C14687tm.f40352i;
            return zh0.m44626b(jSONObject, str, C14687tm.f40356m, g20.f33850d, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.g20$c */
    static final class C13164c extends Lambda implements Function3<String, JSONObject, ly0, List<C14687tm>> {

        /* renamed from: b */
        public static final C13164c f33861b = new C13164c();

        C13164c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14687tm.C14690c cVar = C14687tm.f40352i;
            return zh0.m44626b(jSONObject, str, C14687tm.f40356m, g20.f33852f, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.g20$d */
    public static final class C13165d {
        private C13165d() {
        }

        public /* synthetic */ C13165d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, g20> mo67176a() {
            return g20.f33856j;
        }
    }

    public g20(ly0 ly0, g20 g20, boolean z, JSONObject jSONObject) {
        v60<List<C13064fn>> v60;
        v60<List<C13064fn>> v602;
        g20 g202 = g20;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (g202 == null) {
            v60 = null;
        } else {
            v60 = g202.f33857a;
        }
        C13064fn.C13075k kVar = C13064fn.f33412i;
        v60<List<List<C13064fn>>> b2 = di0.m35296b(jSONObject, "on_fail_actions", z, v60, kVar.mo67047a(), f33851e, b, ly0);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f33857a = b2;
        if (g202 == null) {
            v602 = null;
        } else {
            v602 = g202.f33858b;
        }
        v60<List<List<C13064fn>>> b3 = di0.m35296b(jSONObject, "on_success_actions", z, v602, kVar.mo67047a(), f33853g, b, ly0);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f33858b = b3;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m36447d(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new f20(w60.m43540a(this.f33857a, ly0, "on_fail_actions", jSONObject, f33850d, f33854h), w60.m43540a(this.f33858b, ly0, "on_success_actions", jSONObject, f33852f, f33855i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m36444b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m36446c(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m36442a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
