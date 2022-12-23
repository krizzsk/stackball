package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class v60<T> {

    /* renamed from: a */
    private final boolean f41194a;

    /* renamed from: com.yandex.mobile.ads.impl.v60$a */
    public static final class C14867a extends v60<Object> {

        /* renamed from: b */
        public static final C14867a f41195b = new C14867a();

        private C14867a() {
            super(false, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.v60$b */
    public static final class C14868b extends v60<Object> {

        /* renamed from: b */
        public static final C14868b f41196b = new C14868b();

        private C14868b() {
            super(true, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.v60$c */
    public static final class C14869c<T> extends v60<T> {

        /* renamed from: b */
        private final String f41197b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14869c(boolean z, String str) {
            super(z, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "reference");
            this.f41197b = str;
        }

        /* renamed from: b */
        public final String mo70452b() {
            return this.f41197b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.v60$d */
    public static final class C14870d<T> extends v60<T> {

        /* renamed from: b */
        private final T f41198b;

        public C14870d(boolean z, T t) {
            super(z, (DefaultConstructorMarker) null);
            this.f41198b = t;
        }

        /* renamed from: b */
        public final T mo70453b() {
            return this.f41198b;
        }
    }

    private v60(boolean z) {
        this.f41194a = z;
    }

    public /* synthetic */ v60(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: a */
    public final boolean mo70451a() {
        return this.f41194a;
    }
}
