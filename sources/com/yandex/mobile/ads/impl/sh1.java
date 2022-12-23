package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class sh1 {

    /* renamed from: a */
    private final Set<Function1<sh1, Unit>> f39984a;

    /* renamed from: com.yandex.mobile.ads.impl.sh1$a */
    public static class C14594a extends sh1 {

        /* renamed from: b */
        private final String f39985b;

        /* renamed from: c */
        private final boolean f39986c;

        /* renamed from: d */
        private boolean f39987d = mo69981c();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14594a(String str, boolean z) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "name");
            this.f39985b = str;
            this.f39986c = z;
        }

        /* renamed from: a */
        public String mo69974a() {
            return this.f39985b;
        }

        /* renamed from: c */
        public boolean mo69981c() {
            return this.f39986c;
        }

        /* renamed from: d */
        public boolean mo69982d() {
            return this.f39987d;
        }

        /* renamed from: a */
        public void mo69980a(boolean z) {
            this.f39987d = z;
            mo69975a((sh1) this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh1$b */
    public static class C14595b extends sh1 {

        /* renamed from: b */
        private final String f39988b;

        /* renamed from: c */
        private final int f39989c;

        /* renamed from: d */
        private int f39990d = mo69984c();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14595b(String str, int i) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "name");
            this.f39988b = str;
            this.f39989c = i;
        }

        /* renamed from: a */
        public String mo69974a() {
            return this.f39988b;
        }

        /* renamed from: c */
        public int mo69984c() {
            return this.f39989c;
        }

        /* renamed from: d */
        public int mo69985d() {
            return this.f39990d;
        }

        /* renamed from: a */
        public void mo69983a(int i) {
            this.f39990d = i;
            mo69975a((sh1) this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh1$c */
    public static class C14596c extends sh1 {

        /* renamed from: b */
        private final String f39991b;

        /* renamed from: c */
        private final double f39992c;

        /* renamed from: d */
        private double f39993d = mo69987c();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14596c(String str, double d) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "name");
            this.f39991b = str;
            this.f39992c = d;
        }

        /* renamed from: a */
        public String mo69974a() {
            return this.f39991b;
        }

        /* renamed from: c */
        public double mo69987c() {
            return this.f39992c;
        }

        /* renamed from: d */
        public double mo69988d() {
            return this.f39993d;
        }

        /* renamed from: a */
        public void mo69986a(double d) {
            this.f39993d = d;
            mo69975a((sh1) this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh1$d */
    public static class C14597d extends sh1 {

        /* renamed from: b */
        private final String f39994b;

        /* renamed from: c */
        private final int f39995c;

        /* renamed from: d */
        private int f39996d = mo69990c();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14597d(String str, int i) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "name");
            this.f39994b = str;
            this.f39995c = i;
        }

        /* renamed from: a */
        public String mo69974a() {
            return this.f39994b;
        }

        /* renamed from: c */
        public int mo69990c() {
            return this.f39995c;
        }

        /* renamed from: d */
        public int mo69991d() {
            return this.f39996d;
        }

        /* renamed from: a */
        public void mo69989a(int i) {
            this.f39996d = i;
            mo69975a((sh1) this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh1$e */
    public static class C14598e extends sh1 {

        /* renamed from: b */
        private final String f39997b;

        /* renamed from: c */
        private final String f39998c;

        /* renamed from: d */
        private String f39999d = mo69992c();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14598e(String str, String str2) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "defaultValue");
            this.f39997b = str;
            this.f39998c = str2;
        }

        /* renamed from: a */
        public String mo69974a() {
            return this.f39997b;
        }

        /* renamed from: c */
        public String mo69992c() {
            return this.f39998c;
        }

        /* renamed from: d */
        public String mo69994d() {
            return this.f39999d;
        }

        /* renamed from: c */
        public void mo69993c(String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            this.f39999d = str;
            mo69975a((sh1) this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sh1$f */
    public static class C14599f extends sh1 {

        /* renamed from: b */
        private final String f40000b;

        /* renamed from: c */
        private final Uri f40001c;

        /* renamed from: d */
        private Uri f40002d = mo69996c();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14599f(String str, Uri uri) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(uri, "defaultValue");
            this.f40000b = str;
            this.f40001c = uri;
        }

        /* renamed from: a */
        public String mo69974a() {
            return this.f40000b;
        }

        /* renamed from: c */
        public Uri mo69996c() {
            return this.f40001c;
        }

        /* renamed from: d */
        public Uri mo69997d() {
            return this.f40002d;
        }

        /* renamed from: a */
        public void mo69995a(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "value");
            this.f40002d = uri;
            mo69975a((sh1) this);
        }
    }

    private sh1() {
        this.f39984a = new LinkedHashSet();
    }

    public /* synthetic */ sh1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo69974a();

    /* renamed from: a */
    public void mo69976a(Function1<? super sh1, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "observer");
        this.f39984a.add(function1);
    }

    /* renamed from: b */
    public Object mo69977b() {
        if (this instanceof C14598e) {
            return ((C14598e) this).mo69994d();
        }
        if (this instanceof C14597d) {
            return Integer.valueOf(((C14597d) this).mo69991d());
        }
        if (this instanceof C14594a) {
            return Boolean.valueOf(((C14594a) this).mo69982d());
        }
        if (this instanceof C14596c) {
            return Double.valueOf(((C14596c) this).mo69988d());
        }
        if (this instanceof C14595b) {
            return Integer.valueOf(((C14595b) this).mo69985d());
        }
        if (this instanceof C14599f) {
            return ((C14599f) this).mo69997d();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69975a(sh1 sh1) {
        Intrinsics.checkNotNullParameter(sh1, "v");
        for (Function1 invoke : this.f39984a) {
            invoke.invoke(sh1);
        }
    }

    /* renamed from: b */
    public void mo69979b(Function1<? super sh1, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "observer");
        this.f39984a.remove(function1);
    }

    /* renamed from: b */
    public void mo69978b(String str) throws vh1 {
        Intrinsics.checkNotNullParameter(str, "newValue");
        if (this instanceof C14598e) {
            ((C14598e) this).mo69993c(str);
        } else if (this instanceof C14597d) {
            try {
                ((C14597d) this).mo69989a(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                throw new vh1((String) null, e, 1);
            }
        } else if (this instanceof C14594a) {
            ((C14594a) this).mo69980a(m41977a(str));
        } else if (this instanceof C14596c) {
            try {
                ((C14596c) this).mo69986a(Double.parseDouble(str));
            } catch (NumberFormatException e2) {
                throw new vh1((String) null, e2, 1);
            }
        } else if (this instanceof C14595b) {
            Integer invoke = ky0.m38515e().invoke(str);
            if (invoke != null) {
                ((C14595b) this).mo69983a(invoke.intValue());
                return;
            }
            throw new vh1("Wrong value format for color variable: '" + str + '\'', (Throwable) null, 2);
        } else if (this instanceof C14599f) {
            C14599f fVar = (C14599f) this;
            try {
                Uri parse = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(parse, "{\n            Uri.parse(this)\n        }");
                fVar.mo69995a(parse);
            } catch (IllegalArgumentException e3) {
                throw new vh1((String) null, e3, 1);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m41977a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x002d }
            int r2 = com.yandex.mobile.ads.impl.ky0.f36455g     // Catch:{ IllegalArgumentException -> 0x002b }
            if (r6 == 0) goto L_0x0029
            if (r6 != r1) goto L_0x000d
            goto L_0x002a
        L_0x000d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x002b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x002b }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x002b }
            java.lang.String r4 = "Unable to convert "
            r3.append(r4)     // Catch:{ IllegalArgumentException -> 0x002b }
            r3.append(r6)     // Catch:{ IllegalArgumentException -> 0x002b }
            java.lang.String r6 = " to boolean"
            r3.append(r6)     // Catch:{ IllegalArgumentException -> 0x002b }
            java.lang.String r6 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x002b }
            r2.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x002b }
            throw r2     // Catch:{ IllegalArgumentException -> 0x002b }
        L_0x0029:
            r1 = 0
        L_0x002a:
            return r1
        L_0x002b:
            r6 = move-exception
            goto L_0x0034
        L_0x002d:
            r6 = move-exception
            com.yandex.mobile.ads.impl.vh1 r2 = new com.yandex.mobile.ads.impl.vh1     // Catch:{ IllegalArgumentException -> 0x002b }
            r2.<init>(r0, r6, r1)     // Catch:{ IllegalArgumentException -> 0x002b }
            throw r2     // Catch:{ IllegalArgumentException -> 0x002b }
        L_0x0034:
            com.yandex.mobile.ads.impl.vh1 r2 = new com.yandex.mobile.ads.impl.vh1
            r2.<init>(r0, r6, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sh1.m41977a(java.lang.String):boolean");
    }
}
