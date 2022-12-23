package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.inmobi.media.C5073cj;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.mq */
public class C14001mq implements qh0, ci0<C13873lq> {

    /* renamed from: e */
    public static final C14007f f37459e = new C14007f((DefaultConstructorMarker) null);

    /* renamed from: f */
    private static final rh1<Integer> f37460f = $$Lambda$mq$c9KkY413P79DmxmuDXywxiu_EJM.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final rh1<Integer> f37461g = $$Lambda$mq$88LbraHLv3lZmDCkhlctuNDVu8w.INSTANCE;

    /* renamed from: h */
    private static final rh1<Integer> f37462h = $$Lambda$mq$E5lSsjXgi84rvsSz5QGGBYKozk.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final rh1<Integer> f37463i = $$Lambda$mq$nutj8d9RMK_YPiNRjLaI6OMkkwE.INSTANCE;

    /* renamed from: j */
    private static final rh1<Integer> f37464j = $$Lambda$mq$gB5meZPRudaN4Z4Fo04Wg8SCzyM.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final rh1<Integer> f37465k = $$Lambda$mq$FvsWJ_eyEosHbdTe2B1PvclcqfM.INSTANCE;

    /* renamed from: l */
    private static final rh1<Integer> f37466l = $$Lambda$mq$49loIqCPDtwfKdsOPINzDFWyTmw.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final rh1<Integer> f37467m = $$Lambda$mq$5uS80QXNbIBtrwgv5K1u8HwTZ8.INSTANCE;

    /* renamed from: n */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f37468n = C14002a.f37477b;

    /* renamed from: o */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f37469o = C14003b.f37478b;

    /* renamed from: p */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f37470p = C14005d.f37480b;

    /* renamed from: q */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f37471q = C14006e.f37481b;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final Function2<ly0, JSONObject, C14001mq> f37472r = C14004c.f37479b;

    /* renamed from: a */
    public final v60<f50<Integer>> f37473a;

    /* renamed from: b */
    public final v60<f50<Integer>> f37474b;

    /* renamed from: c */
    public final v60<f50<Integer>> f37475c;

    /* renamed from: d */
    public final v60<f50<Integer>> f37476d;

    /* renamed from: com.yandex.mobile.ads.impl.mq$a */
    static final class C14002a extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14002a f37477b = new C14002a();

        C14002a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14001mq.f37461g, ly0.mo66818b(), (f50) null, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mq$b */
    static final class C14003b extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14003b f37478b = new C14003b();

        C14003b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14001mq.f37463i, ly0.mo66818b(), (f50) null, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mq$c */
    static final class C14004c extends Lambda implements Function2<ly0, JSONObject, C14001mq> {

        /* renamed from: b */
        public static final C14004c f37479b = new C14004c();

        C14004c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14001mq(ly0, (C14001mq) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mq$d */
    static final class C14005d extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14005d f37480b = new C14005d();

        C14005d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14001mq.f37465k, ly0.mo66818b(), (f50) null, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mq$e */
    static final class C14006e extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14006e f37481b = new C14006e();

        C14006e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14001mq.f37467m, ly0.mo66818b(), (f50) null, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mq$f */
    public static final class C14007f {
        private C14007f() {
        }

        public /* synthetic */ C14007f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14001mq> mo68846a() {
            return C14001mq.f37472r;
        }
    }

    public C14001mq(ly0 ly0, C14001mq mqVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        v60<f50<Integer>> v602;
        v60<f50<Integer>> v603;
        v60<f50<Integer>> v604;
        C14001mq mqVar2 = mqVar;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (mqVar2 == null) {
            v60 = null;
        } else {
            v60 = mqVar2.f37473a;
        }
        Function1<Number, Integer> d = ky0.m38514d();
        rh1<Integer> rh1 = f37460f;
        cg1<Integer> cg1 = dg1.f32574b;
        v60<f50<f50<Integer>>> b2 = di0.m35295b(jSONObject, "bottom-left", z, v60, d, rh1, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f37473a = b2;
        if (mqVar2 == null) {
            v602 = null;
        } else {
            v602 = mqVar2.f37474b;
        }
        String str = "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)";
        v60<f50<f50<Integer>>> b3 = di0.m35295b(jSONObject, "bottom-right", z, v602, ky0.m38514d(), f37462h, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b3, str);
        this.f37474b = b3;
        if (mqVar2 == null) {
            v603 = null;
        } else {
            v603 = mqVar2.f37475c;
        }
        v60<f50<f50<Integer>>> b4 = di0.m35295b(jSONObject, "top-left", z, v603, ky0.m38514d(), f37464j, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b4, str);
        this.f37475c = b4;
        if (mqVar2 == null) {
            v604 = null;
        } else {
            v604 = mqVar2.f37476d;
        }
        v60<f50<f50<Integer>>> b5 = di0.m35295b(jSONObject, C5073cj.DEFAULT_POSITION, z, v604, ky0.m38514d(), f37466l, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b5, str);
        this.f37476d = b5;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m39691a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m39693b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m39695c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m39697d(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m39699e(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m39700f(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m39701g(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m39702h(int i) {
        return i >= 0;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C13873lq(w60.m43544d(this.f37473a, ly0, "bottom-left", jSONObject, f37468n), w60.m43544d(this.f37474b, ly0, "bottom-right", jSONObject, f37469o), w60.m43544d(this.f37475c, ly0, "top-left", jSONObject, f37470p), w60.m43544d(this.f37476d, ly0, C5073cj.DEFAULT_POSITION, jSONObject, f37471q));
    }
}
