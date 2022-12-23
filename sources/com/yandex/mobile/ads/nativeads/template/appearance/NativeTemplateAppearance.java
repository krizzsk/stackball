package com.yandex.mobile.ads.nativeads.template.appearance;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;

public final class NativeTemplateAppearance implements Parcelable {
    public static final Parcelable.Creator<NativeTemplateAppearance> CREATOR = new C15539a();

    /* renamed from: n */
    static final int f44017n = Color.parseColor("#7f7f7f");

    /* renamed from: o */
    static final int f44018o = Color.parseColor("#ffd200");

    /* renamed from: p */
    static final int f44019p = Color.parseColor("#ffd200");

    /* renamed from: q */
    static final int f44020q = Color.parseColor("#f4c900");

    /* renamed from: b */
    private final BannerAppearance f44021b;

    /* renamed from: c */
    private final TextAppearance f44022c;

    /* renamed from: d */
    private final TextAppearance f44023d;

    /* renamed from: e */
    private final TextAppearance f44024e;

    /* renamed from: f */
    private final TextAppearance f44025f;

    /* renamed from: g */
    private final TextAppearance f44026g;

    /* renamed from: h */
    private final TextAppearance f44027h;

    /* renamed from: i */
    private final TextAppearance f44028i;

    /* renamed from: j */
    private final ImageAppearance f44029j;

    /* renamed from: k */
    private final ImageAppearance f44030k;

    /* renamed from: l */
    private final ButtonAppearance f44031l;

    /* renamed from: m */
    private final RatingAppearance f44032m;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public BannerAppearance f44033a = m45313b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public TextAppearance f44034b = m45312a();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public TextAppearance f44035c = m45316c();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public TextAppearance f44036d = m45319e();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public TextAppearance f44037e = m45327i();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public TextAppearance f44038f = m45329j();
        /* access modifiers changed from: private */

        /* renamed from: g */
        public TextAppearance f44039g = m45332k();
        /* access modifiers changed from: private */

        /* renamed from: h */
        public TextAppearance f44040h = m45334l();
        /* access modifiers changed from: private */

        /* renamed from: i */
        public ImageAppearance f44041i = m45323g();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public ImageAppearance f44042j = m45321f();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public ButtonAppearance f44043k = m45317d();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public RatingAppearance f44044l = m45325h();

        public NativeTemplateAppearance build() {
            return new NativeTemplateAppearance(this, (C15539a) null);
        }

        public Builder withAgeAppearance(TextAppearance textAppearance) {
            this.f44034b = C15543a.m45342a(this.f44034b, textAppearance);
            return this;
        }

        public Builder withBannerAppearance(BannerAppearance bannerAppearance) {
            BannerAppearance bannerAppearance2 = this.f44033a;
            if (bannerAppearance != null && !bannerAppearance2.equals(bannerAppearance)) {
                int backgroundColor = bannerAppearance.getBackgroundColor();
                int borderColor = bannerAppearance.getBorderColor();
                float borderWidth = bannerAppearance.getBorderWidth();
                HorizontalOffset imageMargins = bannerAppearance.getImageMargins();
                BannerAppearance.Builder builder = new BannerAppearance.Builder();
                if (backgroundColor == 0) {
                    backgroundColor = bannerAppearance2.getBackgroundColor();
                }
                BannerAppearance.Builder backgroundColor2 = builder.setBackgroundColor(backgroundColor);
                if (borderColor == 0) {
                    borderColor = bannerAppearance2.getBorderColor();
                }
                BannerAppearance.Builder borderColor2 = backgroundColor2.setBorderColor(borderColor);
                float f = 0.0f;
                if (borderWidth < 0.0f) {
                    borderWidth = bannerAppearance2.getBorderWidth();
                }
                BannerAppearance.Builder borderWidth2 = borderColor2.setBorderWidth(borderWidth);
                HorizontalOffset contentPadding = bannerAppearance2.getContentPadding();
                HorizontalOffset contentPadding2 = bannerAppearance.getContentPadding();
                if (contentPadding2 != null && !contentPadding.equals(contentPadding2)) {
                    float left = contentPadding2.getLeft() >= 0.0f ? contentPadding2.getLeft() : 0.0f;
                    if (contentPadding2.getRight() >= 0.0f) {
                        f = contentPadding2.getRight();
                    }
                    contentPadding = new HorizontalOffset(left, f);
                }
                BannerAppearance.Builder contentPadding3 = borderWidth2.setContentPadding(contentPadding);
                if (imageMargins == null) {
                    imageMargins = bannerAppearance2.getImageMargins();
                }
                bannerAppearance2 = contentPadding3.setImageMargins(imageMargins).build();
            }
            this.f44033a = bannerAppearance2;
            return this;
        }

        public Builder withBodyAppearance(TextAppearance textAppearance) {
            this.f44035c = C15543a.m45342a(this.f44035c, textAppearance);
            return this;
        }

        public Builder withCallToActionAppearance(ButtonAppearance buttonAppearance) {
            ButtonAppearance buttonAppearance2 = this.f44043k;
            if (buttonAppearance != null && !buttonAppearance2.equals(buttonAppearance)) {
                TextAppearance a = C15543a.m45342a(buttonAppearance2.getTextAppearance(), buttonAppearance.getTextAppearance());
                int borderColor = buttonAppearance.getBorderColor();
                float borderWidth = buttonAppearance.getBorderWidth();
                int normalColor = buttonAppearance.getNormalColor();
                int pressedColor = buttonAppearance.getPressedColor();
                ButtonAppearance.Builder textAppearance = new ButtonAppearance.Builder().setTextAppearance(a);
                if (borderColor == 0) {
                    borderColor = buttonAppearance2.getBorderColor();
                }
                ButtonAppearance.Builder borderColor2 = textAppearance.setBorderColor(borderColor);
                if (borderWidth < 0.0f) {
                    borderWidth = buttonAppearance2.getBorderWidth();
                }
                ButtonAppearance.Builder borderWidth2 = borderColor2.setBorderWidth(borderWidth);
                if (normalColor == 0) {
                    normalColor = buttonAppearance2.getNormalColor();
                }
                ButtonAppearance.Builder normalColor2 = borderWidth2.setNormalColor(normalColor);
                if (pressedColor == 0) {
                    pressedColor = buttonAppearance2.getPressedColor();
                }
                buttonAppearance2 = normalColor2.setPressedColor(pressedColor).build();
            }
            this.f44043k = buttonAppearance2;
            return this;
        }

        public Builder withDomainAppearance(TextAppearance textAppearance) {
            this.f44036d = C15543a.m45342a(this.f44036d, textAppearance);
            return this;
        }

        public Builder withFaviconAppearance(ImageAppearance imageAppearance) {
            this.f44042j = C15543a.m45341a(this.f44042j, imageAppearance);
            return this;
        }

        public Builder withImageAppearance(ImageAppearance imageAppearance) {
            this.f44041i = C15543a.m45341a(this.f44041i, imageAppearance);
            return this;
        }

        public Builder withRatingAppearance(RatingAppearance ratingAppearance) {
            RatingAppearance ratingAppearance2 = this.f44044l;
            if (ratingAppearance != null && !ratingAppearance2.equals(ratingAppearance)) {
                int backgroundStarColor = ratingAppearance.getBackgroundStarColor();
                int progressStarColor = ratingAppearance.getProgressStarColor();
                RatingAppearance.Builder builder = new RatingAppearance.Builder();
                if (backgroundStarColor == 0) {
                    backgroundStarColor = ratingAppearance2.getBackgroundStarColor();
                }
                RatingAppearance.Builder backgroundStarColor2 = builder.setBackgroundStarColor(backgroundStarColor);
                if (progressStarColor == 0) {
                    progressStarColor = ratingAppearance2.getProgressStarColor();
                }
                ratingAppearance2 = backgroundStarColor2.setProgressStarColor(progressStarColor).build();
            }
            this.f44044l = ratingAppearance2;
            return this;
        }

        public Builder withReviewCountAppearance(TextAppearance textAppearance) {
            this.f44037e = C15543a.m45342a(this.f44037e, textAppearance);
            return this;
        }

        public Builder withSponsoredAppearance(TextAppearance textAppearance) {
            this.f44038f = C15543a.m45342a(this.f44038f, textAppearance);
            return this;
        }

        public Builder withTitleAppearance(TextAppearance textAppearance) {
            this.f44039g = C15543a.m45342a(this.f44039g, textAppearance);
            return this;
        }

        public Builder withWarningAppearance(TextAppearance textAppearance) {
            this.f44040h = C15543a.m45342a(this.f44040h, textAppearance);
            return this;
        }

        /* renamed from: a */
        private TextAppearance m45312a() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f44017n).setTextSize(15.0f).setFontFamilyName((String) null).setFontStyle(0).build();
        }

        /* renamed from: b */
        private BannerAppearance m45313b() {
            return new BannerAppearance.Builder().setBackgroundColor(-1).setBorderColor(lo1.m38863a((int) ViewCompat.MEASURED_STATE_MASK, 90.0f)).setBorderWidth(1.0f).setContentPadding(new HorizontalOffset(10.0f, 10.0f)).setImageMargins(new HorizontalOffset(0.0f, 10.0f)).build();
        }

        /* renamed from: c */
        private TextAppearance m45316c() {
            return new TextAppearance.Builder().setTextColor(ViewCompat.MEASURED_STATE_MASK).setTextSize(13.0f).setFontFamilyName((String) null).setFontStyle(0).build();
        }

        /* renamed from: d */
        private ButtonAppearance m45317d() {
            return new ButtonAppearance.Builder().setBorderColor(NativeTemplateAppearance.f44018o).setBorderWidth(1.0f).setNormalColor(-1).setPressedColor(NativeTemplateAppearance.f44019p).setTextAppearance(new TextAppearance.Builder().setTextColor(ViewCompat.MEASURED_STATE_MASK).setTextSize(13.0f).setFontFamilyName((String) null).setFontStyle(0).build()).build();
        }

        /* renamed from: e */
        private TextAppearance m45319e() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f44017n).setTextSize(13.0f).setFontFamilyName((String) null).setFontStyle(0).build();
        }

        /* renamed from: f */
        private ImageAppearance m45321f() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.FIXED, 16.0f)).build();
        }

        /* renamed from: g */
        private ImageAppearance m45323g() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.PREFERRED_RATIO, 0.3f)).build();
        }

        /* renamed from: h */
        private RatingAppearance m45325h() {
            return new RatingAppearance.Builder().setBackgroundStarColor(-3355444).setProgressStarColor(NativeTemplateAppearance.f44020q).build();
        }

        /* renamed from: i */
        private TextAppearance m45327i() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f44017n).setTextSize(13.0f).setFontFamilyName((String) null).setFontStyle(0).build();
        }

        /* renamed from: j */
        private TextAppearance m45329j() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f44017n).setTextSize(11.0f).setFontFamilyName((String) null).setFontStyle(0).build();
        }

        /* renamed from: k */
        private TextAppearance m45332k() {
            return new TextAppearance.Builder().setTextColor(ViewCompat.MEASURED_STATE_MASK).setTextSize(15.0f).setFontFamilyName((String) null).setFontStyle(1).build();
        }

        /* renamed from: l */
        private TextAppearance m45334l() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f44017n).setTextSize(13.0f).setFontFamilyName((String) null).setFontStyle(0).build();
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance$a */
    class C15539a implements Parcelable.Creator<NativeTemplateAppearance> {
        C15539a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new NativeTemplateAppearance(parcel);
        }

        public Object[] newArray(int i) {
            return new NativeTemplateAppearance[i];
        }
    }

    /* synthetic */ NativeTemplateAppearance(Builder builder, C15539a aVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NativeTemplateAppearance.class != obj.getClass()) {
            return false;
        }
        NativeTemplateAppearance nativeTemplateAppearance = (NativeTemplateAppearance) obj;
        BannerAppearance bannerAppearance = this.f44021b;
        if (bannerAppearance == null ? nativeTemplateAppearance.f44021b != null : !bannerAppearance.equals(nativeTemplateAppearance.f44021b)) {
            return false;
        }
        TextAppearance textAppearance = this.f44022c;
        if (textAppearance == null ? nativeTemplateAppearance.f44022c != null : !textAppearance.equals(nativeTemplateAppearance.f44022c)) {
            return false;
        }
        TextAppearance textAppearance2 = this.f44023d;
        if (textAppearance2 == null ? nativeTemplateAppearance.f44023d != null : !textAppearance2.equals(nativeTemplateAppearance.f44023d)) {
            return false;
        }
        TextAppearance textAppearance3 = this.f44024e;
        if (textAppearance3 == null ? nativeTemplateAppearance.f44024e != null : !textAppearance3.equals(nativeTemplateAppearance.f44024e)) {
            return false;
        }
        TextAppearance textAppearance4 = this.f44025f;
        if (textAppearance4 == null ? nativeTemplateAppearance.f44025f != null : !textAppearance4.equals(nativeTemplateAppearance.f44025f)) {
            return false;
        }
        TextAppearance textAppearance5 = this.f44026g;
        if (textAppearance5 == null ? nativeTemplateAppearance.f44026g != null : !textAppearance5.equals(nativeTemplateAppearance.f44026g)) {
            return false;
        }
        TextAppearance textAppearance6 = this.f44027h;
        if (textAppearance6 == null ? nativeTemplateAppearance.f44027h != null : !textAppearance6.equals(nativeTemplateAppearance.f44027h)) {
            return false;
        }
        TextAppearance textAppearance7 = this.f44028i;
        if (textAppearance7 == null ? nativeTemplateAppearance.f44028i != null : !textAppearance7.equals(nativeTemplateAppearance.f44028i)) {
            return false;
        }
        ImageAppearance imageAppearance = this.f44030k;
        if (imageAppearance == null ? nativeTemplateAppearance.f44030k != null : !imageAppearance.equals(nativeTemplateAppearance.f44030k)) {
            return false;
        }
        ImageAppearance imageAppearance2 = this.f44029j;
        if (imageAppearance2 == null ? nativeTemplateAppearance.f44029j != null : !imageAppearance2.equals(nativeTemplateAppearance.f44029j)) {
            return false;
        }
        ButtonAppearance buttonAppearance = this.f44031l;
        if (buttonAppearance == null ? nativeTemplateAppearance.f44031l != null : !buttonAppearance.equals(nativeTemplateAppearance.f44031l)) {
            return false;
        }
        RatingAppearance ratingAppearance = this.f44032m;
        if (ratingAppearance != null) {
            if (!ratingAppearance.equals(nativeTemplateAppearance.f44032m)) {
                return false;
            }
            return true;
        } else if (nativeTemplateAppearance.f44032m == null) {
            return true;
        }
        return false;
    }

    public TextAppearance getAgeAppearance() {
        return this.f44022c;
    }

    public BannerAppearance getBannerAppearance() {
        return this.f44021b;
    }

    public TextAppearance getBodyAppearance() {
        return this.f44023d;
    }

    public ButtonAppearance getCallToActionAppearance() {
        return this.f44031l;
    }

    public TextAppearance getDomainAppearance() {
        return this.f44024e;
    }

    public ImageAppearance getFaviconAppearance() {
        return this.f44029j;
    }

    public ImageAppearance getImageAppearance() {
        return this.f44030k;
    }

    public RatingAppearance getRatingAppearance() {
        return this.f44032m;
    }

    public TextAppearance getReviewCountAppearance() {
        return this.f44025f;
    }

    public TextAppearance getSponsoredAppearance() {
        return this.f44026g;
    }

    public TextAppearance getTitleAppearance() {
        return this.f44027h;
    }

    public TextAppearance getWarningAppearance() {
        return this.f44028i;
    }

    public int hashCode() {
        BannerAppearance bannerAppearance = this.f44021b;
        int i = 0;
        int hashCode = (bannerAppearance != null ? bannerAppearance.hashCode() : 0) * 31;
        TextAppearance textAppearance = this.f44022c;
        int hashCode2 = (hashCode + (textAppearance != null ? textAppearance.hashCode() : 0)) * 31;
        TextAppearance textAppearance2 = this.f44023d;
        int hashCode3 = (hashCode2 + (textAppearance2 != null ? textAppearance2.hashCode() : 0)) * 31;
        TextAppearance textAppearance3 = this.f44024e;
        int hashCode4 = (hashCode3 + (textAppearance3 != null ? textAppearance3.hashCode() : 0)) * 31;
        TextAppearance textAppearance4 = this.f44025f;
        int hashCode5 = (hashCode4 + (textAppearance4 != null ? textAppearance4.hashCode() : 0)) * 31;
        TextAppearance textAppearance5 = this.f44026g;
        int hashCode6 = (hashCode5 + (textAppearance5 != null ? textAppearance5.hashCode() : 0)) * 31;
        TextAppearance textAppearance6 = this.f44027h;
        int hashCode7 = (hashCode6 + (textAppearance6 != null ? textAppearance6.hashCode() : 0)) * 31;
        TextAppearance textAppearance7 = this.f44028i;
        int hashCode8 = (hashCode7 + (textAppearance7 != null ? textAppearance7.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance = this.f44030k;
        int hashCode9 = (hashCode8 + (imageAppearance != null ? imageAppearance.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance2 = this.f44029j;
        int hashCode10 = (hashCode9 + (imageAppearance2 != null ? imageAppearance2.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance = this.f44031l;
        int hashCode11 = (hashCode10 + (buttonAppearance != null ? buttonAppearance.hashCode() : 0)) * 31;
        RatingAppearance ratingAppearance = this.f44032m;
        if (ratingAppearance != null) {
            i = ratingAppearance.hashCode();
        }
        return hashCode11 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f44021b, i);
        parcel.writeParcelable(this.f44022c, i);
        parcel.writeParcelable(this.f44023d, i);
        parcel.writeParcelable(this.f44024e, i);
        parcel.writeParcelable(this.f44025f, i);
        parcel.writeParcelable(this.f44026g, i);
        parcel.writeParcelable(this.f44027h, i);
        parcel.writeParcelable(this.f44028i, i);
        parcel.writeParcelable(this.f44029j, i);
        parcel.writeParcelable(this.f44030k, i);
        parcel.writeParcelable(this.f44031l, i);
        parcel.writeParcelable(this.f44032m, i);
    }

    private NativeTemplateAppearance(Builder builder) {
        this.f44021b = builder.f44033a;
        this.f44022c = builder.f44034b;
        this.f44023d = builder.f44035c;
        this.f44024e = builder.f44036d;
        this.f44025f = builder.f44037e;
        this.f44026g = builder.f44038f;
        this.f44027h = builder.f44039g;
        this.f44028i = builder.f44040h;
        this.f44030k = builder.f44041i;
        this.f44029j = builder.f44042j;
        this.f44031l = builder.f44043k;
        this.f44032m = builder.f44044l;
    }

    protected NativeTemplateAppearance(Parcel parcel) {
        this.f44021b = (BannerAppearance) parcel.readParcelable(BannerAppearance.class.getClassLoader());
        this.f44022c = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f44023d = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f44024e = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f44025f = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f44026g = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f44027h = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f44028i = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f44029j = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f44030k = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f44031l = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
        this.f44032m = (RatingAppearance) parcel.readParcelable(RatingAppearance.class.getClassLoader());
    }
}
