package com.yandex.mobile.ads.mediation.nativeads;

import android.graphics.drawable.Drawable;

final class MediatedNativeAdImage {

    /* renamed from: a */
    private final int f43635a;

    /* renamed from: b */
    private final int f43636b;

    /* renamed from: c */
    private final String f43637c;

    /* renamed from: d */
    private final Drawable f43638d;

    static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f43639a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f43640b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f43641c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Drawable f43642d;

        Builder(String str) {
            this.f43641c = str;
        }

        public MediatedNativeAdImage build() {
            return new MediatedNativeAdImage(this);
        }

        /* access modifiers changed from: package-private */
        public Builder setDrawable(Drawable drawable) {
            this.f43642d = drawable;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setHeight(int i) {
            this.f43640b = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setWidth(int i) {
            this.f43639a = i;
            return this;
        }
    }

    public Drawable getDrawable() {
        return this.f43638d;
    }

    /* access modifiers changed from: package-private */
    public int getHeight() {
        return this.f43636b;
    }

    /* access modifiers changed from: package-private */
    public String getUrl() {
        return this.f43637c;
    }

    /* access modifiers changed from: package-private */
    public int getWidth() {
        return this.f43635a;
    }

    private MediatedNativeAdImage(Builder builder) {
        this.f43637c = builder.f43641c;
        this.f43635a = builder.f43639a;
        this.f43636b = builder.f43640b;
        this.f43638d = builder.f43642d;
    }
}
