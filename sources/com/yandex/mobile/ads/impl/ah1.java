package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class ah1 implements qh0, ci0<zg1> {

    /* renamed from: c */
    private static final rh1<String> f30542c = $$Lambda$ah1$I2wwA12fPsp26b9ATXOjVTF6fAI.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f30543d = $$Lambda$ah1$eQJmpGA7ajtsv4QDA0_SRsFLBAk.INSTANCE;

    /* renamed from: e */
    private static final Function3<String, JSONObject, ly0, String> f30544e = C12385b.f30549b;

    /* renamed from: f */
    private static final Function3<String, JSONObject, ly0, Uri> f30545f = C12387d.f30551b;

    /* renamed from: a */
    public final v60<String> f30546a;

    /* renamed from: b */
    public final v60<Uri> f30547b;

    /* renamed from: com.yandex.mobile.ads.impl.ah1$a */
    static final class C12384a extends Lambda implements Function2<ly0, JSONObject, ah1> {

        /* renamed from: b */
        public static final C12384a f30548b = new C12384a();

        C12384a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new ah1(ly0, (ah1) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ah1$b */
    static final class C12385b extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C12385b f30549b = new C12385b();

        C12385b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44608a(jSONObject, str, ah1.f30543d, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, NAME_VALIDATOR, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ah1$c */
    static final class C12386c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C12386c f30550b = new C12386c();

        C12386c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return (String) zh0.m44624b(jSONObject, str, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ah1$d */
    static final class C12387d extends Lambda implements Function3<String, JSONObject, ly0, Uri> {

        /* renamed from: b */
        public static final C12387d f30551b = new C12387d();

        C12387d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44609a(jSONObject, str, ky0.m38516f(), ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, STRING_TO_URI, env.logger, env)");
            return (Uri) a;
        }
    }

    static {
        C12386c cVar = C12386c.f30550b;
        C12384a aVar = C12384a.f30548b;
    }

    public ah1(ly0 ly0, ah1 ah1, boolean z, JSONObject jSONObject) {
        v60<String> v60;
        v60<Uri> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (ah1 == null) {
            v60 = null;
        } else {
            v60 = ah1.f30546a;
        }
        v60<String> a = di0.m35278a(jSONObject, "name", z, v60, f30542c, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"name\", …E_VALIDATOR, logger, env)");
        this.f30546a = a;
        if (ah1 == null) {
            v602 = null;
        } else {
            v602 = ah1.f30547b;
        }
        v60<Uri> a2 = di0.m35281a(jSONObject, "value", z, v602, ky0.m38516f(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a2, "readField(json, \"value\",…RING_TO_URI, logger, env)");
        this.f30547b = a2;
    }

    /* renamed from: b */
    public zg1 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new zg1((String) w60.m43539a(this.f30546a, ly0, "name", jSONObject, f30544e), (Uri) w60.m43539a(this.f30547b, ly0, "value", jSONObject, f30545f));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m33737a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m33738b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
