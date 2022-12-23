package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.util.TypedValue;
import com.yandex.mobile.ads.impl.lo1;

/* renamed from: com.yandex.mobile.ads.nativeads.template.a */
abstract class C15531a {

    /* renamed from: a */
    protected final float f43992a;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.a$a */
    static class C15532a extends C15531a {
        public C15532a(float f) {
            super(f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo71787a(float f) {
            if (f < 10.0f) {
                return 10.0f;
            }
            return f;
        }

        /* renamed from: a */
        public C15535d mo71788a(Context context, int i, int i2, int i3) {
            float f = this.f43992a;
            int i4 = lo1.f36769b;
            int min = Math.min(Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics())), i);
            return new C15535d(min, Math.round(((float) i3) * (((float) min) / ((float) i2))));
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.a$b */
    static class C15533b extends C15531a {
        public C15533b(float f) {
            super(f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo71787a(float f) {
            if (f < 0.01f) {
                return 0.01f;
            }
            if (f > 1.0f) {
                return 1.0f;
            }
            return f;
        }

        /* renamed from: a */
        public C15535d mo71788a(Context context, int i, int i2, int i3) {
            int round = Math.round(((float) i) * this.f43992a);
            return new C15535d(round, Math.round(((float) i3) * (((float) round) / ((float) i2))));
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.a$c */
    static class C15534c extends C15531a {
        public C15534c(float f) {
            super(f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo71787a(float f) {
            if (f < 0.01f) {
                return 0.01f;
            }
            if (f > 1.0f) {
                return 1.0f;
            }
            return f;
        }

        /* renamed from: a */
        public C15535d mo71788a(Context context, int i, int i2, int i3) {
            int i4 = lo1.f36769b;
            int round = Math.round(TypedValue.applyDimension(1, 140.0f, context.getResources().getDisplayMetrics()));
            int round2 = Math.round(((float) i) * this.f43992a);
            if (i2 > round2) {
                i3 = Math.round(((float) i3) / (((float) i2) / ((float) round2)));
                i2 = round2;
            }
            if (i3 > round) {
                i2 = Math.round(((float) i2) / (((float) i3) / ((float) round)));
            } else {
                round = i3;
            }
            return new C15535d(i2, round);
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.a$d */
    static class C15535d {

        /* renamed from: a */
        private final int f43993a;

        /* renamed from: b */
        private final int f43994b;

        public C15535d(int i, int i2) {
            this.f43993a = i;
            this.f43994b = i2;
        }

        /* renamed from: a */
        public int mo71789a() {
            return this.f43994b;
        }

        /* renamed from: b */
        public int mo71790b() {
            return this.f43993a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C15535d.class != obj.getClass()) {
                return false;
            }
            C15535d dVar = (C15535d) obj;
            if (this.f43993a == dVar.f43993a && this.f43994b == dVar.f43994b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f43993a * 31) + this.f43994b;
        }
    }

    C15531a(float f) {
        this.f43992a = mo71787a(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract float mo71787a(float f);

    /* renamed from: a */
    public abstract C15535d mo71788a(Context context, int i, int i2, int i3);
}
