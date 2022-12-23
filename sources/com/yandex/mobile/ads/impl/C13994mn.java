package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.mobile.ads.impl.C14111nn;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.mn */
public class C13994mn implements qh0, ci0<C13866ln> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final gj0<C14111nn> f37441b = $$Lambda$mn$YvlikrCdNKfQN9SefiALGdBDQWY.INSTANCE;

    /* renamed from: c */
    private static final gj0<C14195on> f37442c = $$Lambda$mn$4NS8BUJspUJXxqBr0pCzz6joMs4.INSTANCE;

    /* renamed from: d */
    private static final Function3<String, JSONObject, ly0, List<C14111nn>> f37443d = C13996b.f37446b;

    /* renamed from: a */
    public final v60<List<C14195on>> f37444a;

    /* renamed from: com.yandex.mobile.ads.impl.mn$a */
    static final class C13995a extends Lambda implements Function2<ly0, JSONObject, C13994mn> {

        /* renamed from: b */
        public static final C13995a f37445b = new C13995a();

        C13995a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13994mn(ly0, (C13994mn) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mn$b */
    static final class C13996b extends Lambda implements Function3<String, JSONObject, ly0, List<C14111nn>> {

        /* renamed from: b */
        public static final C13996b f37446b = new C13996b();

        C13996b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14111nn.C14114c cVar = C14111nn.f37864a;
            List a = zh0.m44614a(jSONObject, str, C14111nn.f37865b, C13994mn.f37441b, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "readList(json, key, DivA…LIDATOR, env.logger, env)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mn$c */
    static final class C13997c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13997c f37447b = new C13997c();

        C13997c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44607a(jSONObject, str, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, env.logger, env)");
            return (String) a;
        }
    }

    static {
        C13997c cVar = C13997c.f37447b;
        C13995a aVar = C13995a.f37445b;
    }

    public C13994mn(ly0 ly0, C13994mn mnVar, boolean z, JSONObject jSONObject) {
        v60<List<C14195on>> v60;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (mnVar == null) {
            v60 = null;
        } else {
            v60 = mnVar.f37444a;
        }
        v60<List<List<C14195on>>> a = di0.m35285a(jSONObject, FirebaseAnalytics.Param.ITEMS, z, v60, C14195on.f38279a.mo69232a(), f37442c, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readListField(json, \"ite…E_VALIDATOR, logger, env)");
        this.f37444a = a;
    }

    /* renamed from: b */
    public C13866ln mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C13866ln(w60.m43542b(this.f37444a, ly0, FirebaseAnalytics.Param.ITEMS, jSONObject, f37441b, f37443d));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m39657a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m39658b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
