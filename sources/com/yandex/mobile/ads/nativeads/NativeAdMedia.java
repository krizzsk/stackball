package com.yandex.mobile.ads.nativeads;

public final class NativeAdMedia {

    /* renamed from: a */
    private final float f43722a;

    NativeAdMedia(float f) {
        this.f43722a = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && NativeAdMedia.class == obj.getClass() && Float.compare(((NativeAdMedia) obj).f43722a, this.f43722a) == 0) {
            return true;
        }
        return false;
    }

    public float getAspectRatio() {
        return this.f43722a;
    }

    public int hashCode() {
        float f = this.f43722a;
        if (f != 0.0f) {
            return Float.floatToIntBits(f);
        }
        return 0;
    }
}
