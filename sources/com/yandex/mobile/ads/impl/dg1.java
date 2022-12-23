package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Intrinsics;

public final class dg1 {

    /* renamed from: a */
    public static final cg1<Boolean> f32573a = new C12882a();

    /* renamed from: b */
    public static final cg1<Integer> f32574b = new C12885d();

    /* renamed from: c */
    public static final cg1<String> f32575c = new C12886e();

    /* renamed from: d */
    public static final cg1<Double> f32576d = new C12884c();

    /* renamed from: e */
    public static final cg1<Uri> f32577e = new C12887f();

    /* renamed from: f */
    public static final cg1<Integer> f32578f = new C12883b();

    /* renamed from: com.yandex.mobile.ads.impl.dg1$a */
    public static final class C12882a implements cg1<Boolean> {
        C12882a() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo66291a() {
            return Boolean.FALSE;
        }

        /* renamed from: a */
        public boolean mo66292a(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "value");
            return obj instanceof Boolean;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dg1$b */
    public static final class C12883b implements cg1<Integer> {
        C12883b() {
        }

        /* renamed from: a */
        public Object mo66291a() {
            return Integer.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }

        /* renamed from: a */
        public boolean mo66292a(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "value");
            return obj instanceof Integer;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dg1$c */
    public static final class C12884c implements cg1<Double> {
        C12884c() {
        }

        /* renamed from: a */
        public Object mo66291a() {
            return Double.valueOf(0.0d);
        }

        /* renamed from: a */
        public boolean mo66292a(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "value");
            return obj instanceof Double;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dg1$d */
    public static final class C12885d implements cg1<Integer> {
        C12885d() {
        }

        /* renamed from: a */
        public Object mo66291a() {
            return 0;
        }

        /* renamed from: a */
        public boolean mo66292a(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "value");
            return obj instanceof Integer;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dg1$e */
    public static final class C12886e implements cg1<String> {
        C12886e() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo66291a() {
            return "";
        }

        /* renamed from: a */
        public boolean mo66292a(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "value");
            return obj instanceof String;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dg1$f */
    public static final class C12887f implements cg1<Uri> {

        /* renamed from: b */
        private final Uri f32579b = Uri.EMPTY;

        C12887f() {
        }

        /* renamed from: a */
        public Object mo66291a() {
            return this.f32579b;
        }

        /* renamed from: a */
        public boolean mo66292a(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "value");
            return obj instanceof Uri;
        }
    }
}
