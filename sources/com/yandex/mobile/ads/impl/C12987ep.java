package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.mobile.ads.impl.C13086fp;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ep */
public class C12987ep implements qh0, ci0<C12909dp> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final gj0<C13086fp> f33032b = $$Lambda$ep$ZPwVInwOwNC2cXXyhVmIx6LDTA.INSTANCE;

    /* renamed from: c */
    private static final gj0<C13219gp> f33033c = $$Lambda$ep$DrrVDYlAIiqtPNGJrnt2dpLuJ1E.INSTANCE;

    /* renamed from: d */
    private static final Function3<String, JSONObject, ly0, List<C13086fp>> f33034d = C12989b.f33037b;

    /* renamed from: a */
    public final v60<List<C13219gp>> f33035a;

    /* renamed from: com.yandex.mobile.ads.impl.ep$a */
    static final class C12988a extends Lambda implements Function2<ly0, JSONObject, C12987ep> {

        /* renamed from: b */
        public static final C12988a f33036b = new C12988a();

        C12988a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C12987ep(ly0, (C12987ep) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ep$b */
    static final class C12989b extends Lambda implements Function3<String, JSONObject, ly0, List<C13086fp>> {

        /* renamed from: b */
        public static final C12989b f33037b = new C12989b();

        C12989b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C13086fp.C13089c cVar = C13086fp.f33474a;
            List a = zh0.m44614a(jSONObject, str, C13086fp.f33475b, C12987ep.f33032b, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "readList(json, key, DivC…LIDATOR, env.logger, env)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ep$c */
    static final class C12990c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C12990c f33038b = new C12990c();

        C12990c() {
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
        C12990c cVar = C12990c.f33038b;
        C12988a aVar = C12988a.f33036b;
    }

    public C12987ep(ly0 ly0, C12987ep epVar, boolean z, JSONObject jSONObject) {
        v60<List<C13219gp>> v60;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (epVar == null) {
            v60 = null;
        } else {
            v60 = epVar.f33035a;
        }
        v60<List<List<C13219gp>>> a = di0.m35285a(jSONObject, FirebaseAnalytics.Param.ITEMS, z, v60, C13219gp.f34061a.mo67340a(), f33033c, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readListField(json, \"ite…E_VALIDATOR, logger, env)");
        this.f33035a = a;
    }

    /* renamed from: b */
    public C12909dp mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C12909dp(w60.m43542b(this.f33035a, ly0, FirebaseAnalytics.Param.ITEMS, jSONObject, f33032b, f33034d));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m35704a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m35705b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
