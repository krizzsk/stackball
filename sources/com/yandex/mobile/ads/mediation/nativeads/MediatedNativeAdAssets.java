package com.yandex.mobile.ads.mediation.nativeads;

final class MediatedNativeAdAssets {

    /* renamed from: a */
    private final String f43607a;

    /* renamed from: b */
    private final String f43608b;

    /* renamed from: c */
    private final String f43609c;

    /* renamed from: d */
    private final String f43610d;

    /* renamed from: e */
    private final MediatedNativeAdImage f43611e;

    /* renamed from: f */
    private final MediatedNativeAdImage f43612f;

    /* renamed from: g */
    private final MediatedNativeAdImage f43613g;

    /* renamed from: h */
    private final MediatedNativeAdMedia f43614h;

    /* renamed from: i */
    private final String f43615i;

    /* renamed from: j */
    private final String f43616j;

    /* renamed from: k */
    private final String f43617k;

    /* renamed from: l */
    private final String f43618l;

    /* renamed from: m */
    private final String f43619m;

    /* renamed from: n */
    private final String f43620n;

    static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f43621a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f43622b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f43623c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f43624d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public MediatedNativeAdImage f43625e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public MediatedNativeAdImage f43626f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public MediatedNativeAdImage f43627g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public MediatedNativeAdMedia f43628h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f43629i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public String f43630j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public String f43631k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public String f43632l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public String f43633m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public String f43634n;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public MediatedNativeAdAssets build() {
            return new MediatedNativeAdAssets(this);
        }

        /* access modifiers changed from: package-private */
        public Builder setAge(String str) {
            this.f43621a = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setBody(String str) {
            this.f43622b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setCallToAction(String str) {
            this.f43623c = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setDomain(String str) {
            this.f43624d = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setFavicon(MediatedNativeAdImage mediatedNativeAdImage) {
            this.f43625e = mediatedNativeAdImage;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setIcon(MediatedNativeAdImage mediatedNativeAdImage) {
            this.f43626f = mediatedNativeAdImage;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setImage(MediatedNativeAdImage mediatedNativeAdImage) {
            this.f43627g = mediatedNativeAdImage;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setMedia(MediatedNativeAdMedia mediatedNativeAdMedia) {
            this.f43628h = mediatedNativeAdMedia;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setPrice(String str) {
            this.f43629i = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setRating(String str) {
            this.f43630j = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setReviewCount(String str) {
            this.f43631k = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setSponsored(String str) {
            this.f43632l = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setTitle(String str) {
            this.f43633m = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setWarning(String str) {
            this.f43634n = str;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public String getAge() {
        return this.f43607a;
    }

    /* access modifiers changed from: package-private */
    public String getBody() {
        return this.f43608b;
    }

    /* access modifiers changed from: package-private */
    public String getCallToAction() {
        return this.f43609c;
    }

    /* access modifiers changed from: package-private */
    public String getDomain() {
        return this.f43610d;
    }

    /* access modifiers changed from: package-private */
    public MediatedNativeAdImage getFavicon() {
        return this.f43611e;
    }

    /* access modifiers changed from: package-private */
    public MediatedNativeAdImage getIcon() {
        return this.f43612f;
    }

    /* access modifiers changed from: package-private */
    public MediatedNativeAdImage getImage() {
        return this.f43613g;
    }

    /* access modifiers changed from: package-private */
    public MediatedNativeAdMedia getMedia() {
        return this.f43614h;
    }

    /* access modifiers changed from: package-private */
    public String getPrice() {
        return this.f43615i;
    }

    /* access modifiers changed from: package-private */
    public String getRating() {
        return this.f43616j;
    }

    /* access modifiers changed from: package-private */
    public String getReviewCount() {
        return this.f43617k;
    }

    /* access modifiers changed from: package-private */
    public String getSponsored() {
        return this.f43618l;
    }

    /* access modifiers changed from: package-private */
    public String getTitle() {
        return this.f43619m;
    }

    /* access modifiers changed from: package-private */
    public String getWarning() {
        return this.f43620n;
    }

    private MediatedNativeAdAssets(Builder builder) {
        this.f43607a = builder.f43621a;
        this.f43608b = builder.f43622b;
        this.f43609c = builder.f43623c;
        this.f43610d = builder.f43624d;
        this.f43611e = builder.f43625e;
        this.f43612f = builder.f43626f;
        this.f43613g = builder.f43627g;
        this.f43614h = builder.f43628h;
        this.f43615i = builder.f43629i;
        this.f43616j = builder.f43630j;
        this.f43617k = builder.f43631k;
        this.f43618l = builder.f43632l;
        this.f43619m = builder.f43633m;
        this.f43620n = builder.f43634n;
    }
}
