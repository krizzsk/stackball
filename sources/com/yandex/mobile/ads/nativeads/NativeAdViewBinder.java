package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class NativeAdViewBinder {

    /* renamed from: a */
    private final View f43743a;

    /* renamed from: b */
    private final TextView f43744b;

    /* renamed from: c */
    private final TextView f43745c;

    /* renamed from: d */
    private final TextView f43746d;

    /* renamed from: e */
    private final TextView f43747e;

    /* renamed from: f */
    private final ImageView f43748f;

    /* renamed from: g */
    private final ImageView f43749g;

    /* renamed from: h */
    private final ImageView f43750h;

    /* renamed from: i */
    private final MediaView f43751i;

    /* renamed from: j */
    private final TextView f43752j;

    /* renamed from: k */
    private final View f43753k;

    /* renamed from: l */
    private final TextView f43754l;

    /* renamed from: m */
    private final TextView f43755m;

    /* renamed from: n */
    private final TextView f43756n;

    /* renamed from: o */
    private final TextView f43757o;

    /* access modifiers changed from: package-private */
    public TextView getAgeView() {
        return this.f43744b;
    }

    /* access modifiers changed from: package-private */
    public TextView getBodyView() {
        return this.f43745c;
    }

    /* access modifiers changed from: package-private */
    public TextView getCallToActionView() {
        return this.f43746d;
    }

    /* access modifiers changed from: package-private */
    public TextView getDomainView() {
        return this.f43747e;
    }

    /* access modifiers changed from: package-private */
    public ImageView getFaviconView() {
        return this.f43748f;
    }

    /* access modifiers changed from: package-private */
    public ImageView getFeedbackView() {
        return this.f43749g;
    }

    /* access modifiers changed from: package-private */
    public ImageView getIconView() {
        return this.f43750h;
    }

    /* access modifiers changed from: package-private */
    public MediaView getMediaView() {
        return this.f43751i;
    }

    /* access modifiers changed from: package-private */
    public View getNativeAdView() {
        return this.f43743a;
    }

    /* access modifiers changed from: package-private */
    public TextView getPriceView() {
        return this.f43752j;
    }

    /* access modifiers changed from: package-private */
    public View getRatingView() {
        return this.f43753k;
    }

    /* access modifiers changed from: package-private */
    public TextView getReviewCountView() {
        return this.f43754l;
    }

    /* access modifiers changed from: package-private */
    public TextView getSponsoredView() {
        return this.f43755m;
    }

    /* access modifiers changed from: package-private */
    public TextView getTitleView() {
        return this.f43756n;
    }

    /* access modifiers changed from: package-private */
    public TextView getWarningView() {
        return this.f43757o;
    }

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final View f43758a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public TextView f43759b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public TextView f43760c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public TextView f43761d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public TextView f43762e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public ImageView f43763f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public ImageView f43764g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public ImageView f43765h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public MediaView f43766i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public TextView f43767j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public View f43768k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public TextView f43769l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public TextView f43770m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public TextView f43771n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public TextView f43772o;

        @Deprecated
        Builder(View view) {
            this.f43758a = view;
        }

        public NativeAdViewBinder build() {
            return new NativeAdViewBinder(this);
        }

        public Builder setAgeView(TextView textView) {
            this.f43759b = textView;
            return this;
        }

        public Builder setBodyView(TextView textView) {
            this.f43760c = textView;
            return this;
        }

        public Builder setCallToActionView(TextView textView) {
            this.f43761d = textView;
            return this;
        }

        public Builder setDomainView(TextView textView) {
            this.f43762e = textView;
            return this;
        }

        public Builder setFaviconView(ImageView imageView) {
            this.f43763f = imageView;
            return this;
        }

        public Builder setFeedbackView(ImageView imageView) {
            this.f43764g = imageView;
            return this;
        }

        public Builder setIconView(ImageView imageView) {
            this.f43765h = imageView;
            return this;
        }

        public Builder setMediaView(MediaView mediaView) {
            this.f43766i = mediaView;
            return this;
        }

        public Builder setPriceView(TextView textView) {
            this.f43767j = textView;
            return this;
        }

        public <T extends View & Rating> Builder setRatingView(T t) {
            this.f43768k = t;
            return this;
        }

        public Builder setReviewCountView(TextView textView) {
            this.f43769l = textView;
            return this;
        }

        public Builder setSponsoredView(TextView textView) {
            this.f43770m = textView;
            return this;
        }

        public Builder setTitleView(TextView textView) {
            this.f43771n = textView;
            return this;
        }

        public Builder setWarningView(TextView textView) {
            this.f43772o = textView;
            return this;
        }

        public Builder(NativeAdView nativeAdView) {
            this.f43758a = nativeAdView;
        }
    }

    private NativeAdViewBinder(Builder builder) {
        this.f43743a = builder.f43758a;
        this.f43744b = builder.f43759b;
        this.f43745c = builder.f43760c;
        this.f43746d = builder.f43761d;
        this.f43747e = builder.f43762e;
        this.f43748f = builder.f43763f;
        this.f43749g = builder.f43764g;
        this.f43750h = builder.f43765h;
        this.f43751i = builder.f43766i;
        this.f43752j = builder.f43767j;
        this.f43753k = builder.f43768k;
        this.f43754l = builder.f43769l;
        this.f43755m = builder.f43770m;
        this.f43756n = builder.f43771n;
        this.f43757o = builder.f43772o;
    }
}
