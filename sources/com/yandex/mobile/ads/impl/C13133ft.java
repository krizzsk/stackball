package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.C13215gn;
import com.yandex.mobile.ads.impl.C13332hn;
import com.yandex.mobile.ads.impl.C14709tt;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ft */
public class C13133ft implements qh0 {

    /* renamed from: g */
    public static final C13138e f33713g = new C13138e((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final f50<Double> f33714h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<C13215gn> f33715i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<C13332hn> f33716j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final f50<Boolean> f33717k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final f50<C14709tt> f33718l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final cg1<C13215gn> f33719m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final cg1<C13332hn> f33720n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final cg1<C14709tt> f33721o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final rh1<Double> f33722p = $$Lambda$ft$UXb7hbpEJjemjDhcFWjxuhFzx_U.INSTANCE;

    /* renamed from: a */
    public final f50<Double> f33723a;

    /* renamed from: b */
    public final f50<C13215gn> f33724b;

    /* renamed from: c */
    public final f50<C13332hn> f33725c;

    /* renamed from: d */
    public final f50<Uri> f33726d;

    /* renamed from: e */
    public final f50<Boolean> f33727e;

    /* renamed from: f */
    public final f50<C14709tt> f33728f;

    /* renamed from: com.yandex.mobile.ads.impl.ft$a */
    static final class C13134a extends Lambda implements Function2<ly0, JSONObject, C13133ft> {

        /* renamed from: b */
        public static final C13134a f33729b = new C13134a();

        C13134a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C13133ft.f33713g.mo67080a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ft$b */
    static final class C13135b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13135b f33730b = new C13135b();

        C13135b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13215gn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ft$c */
    static final class C13136c extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13136c f33731b = new C13136c();

        C13136c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13332hn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ft$d */
    static final class C13137d extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13137d f33732b = new C13137d();

        C13137d() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C14709tt);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ft$e */
    public static final class C13138e {
        private C13138e() {
        }

        public /* synthetic */ C13138e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C13133ft mo67080a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            f50 a = zh0.m44601a(jSONObject, "alpha", (Function1) ky0.m38513c(), C13133ft.f33722p, b, C13133ft.f33714h, (cg1) dg1.f32576d);
            if (a == null) {
                a = C13133ft.f33714h;
            }
            f50 f50 = a;
            C13215gn.C13217b bVar = C13215gn.f34045c;
            f50 b2 = zh0.m44621b(jSONObject, "content_alignment_horizontal", C13215gn.f34046d, b, ly0, C13133ft.f33719m);
            if (b2 == null) {
                b2 = C13133ft.f33715i;
            }
            f50 f502 = b2;
            C13332hn.C13334b bVar2 = C13332hn.f34465c;
            f50 b3 = zh0.m44621b(jSONObject, "content_alignment_vertical", C13332hn.f34466d, b, ly0, C13133ft.f33720n);
            if (b3 == null) {
                b3 = C13133ft.f33716j;
            }
            f50 f503 = b3;
            ny0 ny0 = b;
            ly0 ly02 = ly0;
            f50<Uri> a2 = zh0.m44598a(jSONObject, "image_url", ky0.m38516f(), ny0, ly02, dg1.f32577e);
            Intrinsics.checkNotNullExpressionValue(a2, "readExpression(json, \"im…er, env, TYPE_HELPER_URI)");
            f50<Boolean> a3 = zh0.m44599a(jSONObject, "preload_required", ky0.m38512b(), ny0, ly02, C13133ft.f33717k, dg1.f32573a);
            if (a3 == null) {
                a3 = C13133ft.f33717k;
            }
            f50<Boolean> f504 = a3;
            C14709tt.C14711b bVar3 = C14709tt.f40453c;
            f50 b4 = zh0.m44621b(jSONObject, "scale", C14709tt.f40454d, b, ly0, C13133ft.f33721o);
            if (b4 == null) {
                b4 = C13133ft.f33718l;
            }
            return new C13133ft(f50, f502, f503, a2, f504, b4);
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f33714h = aVar.mo66929a(Double.valueOf(1.0d));
        f33715i = aVar.mo66929a(C13215gn.CENTER);
        f33716j = aVar.mo66929a(C13332hn.CENTER);
        f33717k = aVar.mo66929a(Boolean.FALSE);
        f33718l = aVar.mo66929a(C14709tt.FILL);
        cg1.C12733a aVar2 = cg1.f31917a;
        f33719m = aVar2.mo66293a(ArraysKt.first((T[]) C13215gn.values()), C13135b.f33730b);
        f33720n = aVar2.mo66293a(ArraysKt.first((T[]) C13332hn.values()), C13136c.f33731b);
        f33721o = aVar2.mo66293a(ArraysKt.first((T[]) C14709tt.values()), C13137d.f33732b);
        $$Lambda$ft$X88CdUDVOHlMzZ1P7ZYyWG8achY r0 = $$Lambda$ft$X88CdUDVOHlMzZ1P7ZYyWG8achY.INSTANCE;
        C13134a aVar3 = C13134a.f33729b;
    }

    public C13133ft(f50<Double> f50, f50<C13215gn> f502, f50<C13332hn> f503, f50<Uri> f504, f50<Boolean> f505, f50<C14709tt> f506) {
        Intrinsics.checkNotNullParameter(f50, "alpha");
        Intrinsics.checkNotNullParameter(f502, "contentAlignmentHorizontal");
        Intrinsics.checkNotNullParameter(f503, "contentAlignmentVertical");
        Intrinsics.checkNotNullParameter(f504, "imageUrl");
        Intrinsics.checkNotNullParameter(f505, "preloadRequired");
        Intrinsics.checkNotNullParameter(f506, "scale");
        this.f33723a = f50;
        this.f33724b = f502;
        this.f33725c = f503;
        this.f33726d = f504;
        this.f33727e = f505;
        this.f33728f = f506;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m36291a(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m36293b(double d) {
        return d >= 0.0d && d <= 1.0d;
    }
}
