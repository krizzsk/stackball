package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class lx0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f36963a;

    /* renamed from: com.yandex.mobile.ads.impl.lx0$a */
    public static final class C13912a extends lx0 {

        /* renamed from: b */
        private final int f36964b;

        /* renamed from: c */
        private final int f36965c;

        public C13912a(int i, int i2) {
            super(i2, (DefaultConstructorMarker) null);
            this.f36964b = i;
            this.f36965c = i2;
        }

        /* renamed from: a */
        public int mo68527a() {
            if (this.f36963a <= 0) {
                return -1;
            }
            return Math.min(this.f36964b + 1, this.f36965c - 1);
        }

        /* renamed from: b */
        public int mo68528b() {
            if (this.f36963a <= 0) {
                return -1;
            }
            return Math.max(0, this.f36964b - 1);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lx0$b */
    public static final class C13913b extends lx0 {

        /* renamed from: b */
        private final int f36966b;

        /* renamed from: c */
        private final int f36967c;

        public C13913b(int i, int i2) {
            super(i2, (DefaultConstructorMarker) null);
            this.f36966b = i;
            this.f36967c = i2;
        }

        /* renamed from: a */
        public int mo68527a() {
            if (this.f36963a <= 0) {
                return -1;
            }
            return (this.f36966b + 1) % this.f36967c;
        }

        /* renamed from: b */
        public int mo68528b() {
            if (this.f36963a <= 0) {
                return -1;
            }
            int i = this.f36967c;
            return ((this.f36966b - 1) + i) % i;
        }
    }

    private lx0(int i) {
        this.f36963a = i;
    }

    public /* synthetic */ lx0(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* renamed from: a */
    public abstract int mo68527a();

    /* renamed from: b */
    public abstract int mo68528b();
}
