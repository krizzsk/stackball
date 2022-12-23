package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C12992er;
import com.yandex.mobile.ads.impl.C13104fr;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ow */
public class C14228ow implements qh0, ci0<C14138nw> {

    /* renamed from: c */
    public static final C14232d f38395c = new C14232d((DefaultConstructorMarker) null);

    /* renamed from: d */
    private static final Function3<String, JSONObject, ly0, C12992er> f38396d = C14230b.f38402b;

    /* renamed from: e */
    private static final Function3<String, JSONObject, ly0, C12992er> f38397e = C14231c.f38403b;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Function2<ly0, JSONObject, C14228ow> f38398f = C14229a.f38401b;

    /* renamed from: a */
    public final v60<C13104fr> f38399a;

    /* renamed from: b */
    public final v60<C13104fr> f38400b;

    /* renamed from: com.yandex.mobile.ads.impl.ow$a */
    static final class C14229a extends Lambda implements Function2<ly0, JSONObject, C14228ow> {

        /* renamed from: b */
        public static final C14229a f38401b = new C14229a();

        C14229a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14228ow(ly0, (C14228ow) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ow$b */
    static final class C14230b extends Lambda implements Function3<String, JSONObject, ly0, C12992er> {

        /* renamed from: b */
        public static final C14230b f38402b = new C14230b();

        C14230b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C12992er.C12995c cVar = C12992er.f33046c;
            Object a = zh0.m44612a(jSONObject, str, C12992er.f33049f, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, DivDimen…CREATOR, env.logger, env)");
            return (C12992er) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ow$c */
    static final class C14231c extends Lambda implements Function3<String, JSONObject, ly0, C12992er> {

        /* renamed from: b */
        public static final C14231c f38403b = new C14231c();

        C14231c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C12992er.C12995c cVar = C12992er.f33046c;
            Object a = zh0.m44612a(jSONObject, str, C12992er.f33049f, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, DivDimen…CREATOR, env.logger, env)");
            return (C12992er) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ow$d */
    public static final class C14232d {
        private C14232d() {
        }

        public /* synthetic */ C14232d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14228ow> mo69276a() {
            return C14228ow.f38398f;
        }
    }

    public C14228ow(ly0 ly0, C14228ow owVar, boolean z, JSONObject jSONObject) {
        v60<C13104fr> v60;
        v60<C13104fr> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (owVar == null) {
            v60 = null;
        } else {
            v60 = owVar.f38399a;
        }
        C13104fr.C13109e eVar = C13104fr.f33574c;
        v60<C13104fr> a = di0.m35286a(jSONObject, "x", z, v60, eVar.mo67068a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"x\", top…ate.CREATOR, logger, env)");
        this.f38399a = a;
        if (owVar == null) {
            v602 = null;
        } else {
            v602 = owVar.f38400b;
        }
        v60<C13104fr> a2 = di0.m35286a(jSONObject, "y", z, v602, eVar.mo67068a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a2, "readField(json, \"y\", top…ate.CREATOR, logger, env)");
        this.f38400b = a2;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C14138nw((C12992er) w60.m43546f(this.f38399a, ly0, "x", jSONObject, f38396d), (C12992er) w60.m43546f(this.f38400b, ly0, "y", jSONObject, f38397e));
    }
}
