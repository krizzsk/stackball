package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.yandex.mobile.ads.impl.da */
public final class C12864da {

    /* renamed from: f */
    public static final C12864da f32499f = new C12864da(0, 0, 1, 1);

    /* renamed from: a */
    public final int f32500a;

    /* renamed from: b */
    public final int f32501b;

    /* renamed from: c */
    public final int f32502c;

    /* renamed from: d */
    public final int f32503d;

    /* renamed from: e */
    private AudioAttributes f32504e;

    /* renamed from: a */
    public AudioAttributes mo66536a() {
        if (this.f32504e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f32500a).setFlags(this.f32501b).setUsage(this.f32502c);
            if (ih1.f34858a >= 29) {
                usage.setAllowedCapturePolicy(this.f32503d);
            }
            this.f32504e = usage.build();
        }
        return this.f32504e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12864da.class != obj.getClass()) {
            return false;
        }
        C12864da daVar = (C12864da) obj;
        if (this.f32500a == daVar.f32500a && this.f32501b == daVar.f32501b && this.f32502c == daVar.f32502c && this.f32503d == daVar.f32503d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f32500a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f32501b) * 31) + this.f32502c) * 31) + this.f32503d;
    }

    private C12864da(int i, int i2, int i3, int i4) {
        this.f32500a = i;
        this.f32501b = i2;
        this.f32502c = i3;
        this.f32503d = i4;
    }
}
