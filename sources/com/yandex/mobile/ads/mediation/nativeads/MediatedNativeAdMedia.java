package com.yandex.mobile.ads.mediation.nativeads;

final class MediatedNativeAdMedia {

    /* renamed from: a */
    private final float f43643a;

    static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final float f43644a;

        Builder(float f) {
            this.f43644a = f;
        }

        public MediatedNativeAdMedia build() {
            return new MediatedNativeAdMedia(this);
        }
    }

    /* access modifiers changed from: package-private */
    public float getAspectRatio() {
        return this.f43643a;
    }

    private MediatedNativeAdMedia(Builder builder) {
        this.f43643a = builder.f43644a;
    }
}
