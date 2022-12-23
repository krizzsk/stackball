package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.tr */
public class C14701tr implements qh0, ci0<C14008mr> {

    /* renamed from: c */
    public static final C14705d f40419c = new C14705d((DefaultConstructorMarker) null);

    /* renamed from: d */
    private static final rh1<String> f40420d = $$Lambda$tr$qISB2jyCsT1YcsD1yaRV2LEVnE.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final rh1<String> f40421e = $$Lambda$tr$dQRrb07jDgZu4vXeGMwP35mdRk.INSTANCE;

    /* renamed from: f */
    private static final Function3<String, JSONObject, ly0, String> f40422f = C14703b.f40428b;

    /* renamed from: g */
    private static final Function3<String, JSONObject, ly0, JSONObject> f40423g = C14704c.f40429b;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Function2<ly0, JSONObject, C14701tr> f40424h = C14702a.f40427b;

    /* renamed from: a */
    public final v60<String> f40425a;

    /* renamed from: b */
    public final v60<JSONObject> f40426b;

    /* renamed from: com.yandex.mobile.ads.impl.tr$a */
    static final class C14702a extends Lambda implements Function2<ly0, JSONObject, C14701tr> {

        /* renamed from: b */
        public static final C14702a f40427b = new C14702a();

        C14702a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14701tr(ly0, (C14701tr) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tr$b */
    static final class C14703b extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C14703b f40428b = new C14703b();

        C14703b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44608a(jSONObject, str, C14701tr.f40421e, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, ID_VALIDATOR, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tr$c */
    static final class C14704c extends Lambda implements Function3<String, JSONObject, ly0, JSONObject> {

        /* renamed from: b */
        public static final C14704c f40429b = new C14704c();

        C14704c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return (JSONObject) zh0.m44624b(jSONObject, str, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tr$d */
    public static final class C14705d {
        private C14705d() {
        }

        public /* synthetic */ C14705d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14701tr> mo70219a() {
            return C14701tr.f40424h;
        }
    }

    public C14701tr(ly0 ly0, C14701tr trVar, boolean z, JSONObject jSONObject) {
        v60<String> v60;
        v60<JSONObject> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (trVar == null) {
            v60 = null;
        } else {
            v60 = trVar.f40425a;
        }
        v60<String> a = di0.m35278a(jSONObject, "id", z, v60, f40420d, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"id\", to…E_VALIDATOR, logger, env)");
        this.f40425a = a;
        if (trVar == null) {
            v602 = null;
        } else {
            v602 = trVar.f40426b;
        }
        v60<JSONObject> b2 = di0.m35290b(jSONObject, NativeProtocol.WEB_DIALOG_PARAMS, z, v602, b, ly0);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalField(json, …ent?.params, logger, env)");
        this.f40426b = b2;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C14008mr((String) w60.m43539a(this.f40425a, ly0, "id", jSONObject, f40422f), (JSONObject) w60.m43543c(this.f40426b, ly0, NativeProtocol.WEB_DIALOG_PARAMS, jSONObject, f40423g));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42459b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42457a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
