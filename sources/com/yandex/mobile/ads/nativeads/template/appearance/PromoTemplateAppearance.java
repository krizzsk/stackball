package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;

public final class PromoTemplateAppearance implements Parcelable {
    public static final Parcelable.Creator<PromoTemplateAppearance> CREATOR = new C15540a();

    /* renamed from: b */
    private final BannerAppearance f44045b;

    /* renamed from: c */
    private final TextAppearance f44046c;

    /* renamed from: d */
    private final TextAppearance f44047d;

    /* renamed from: e */
    private final TextAppearance f44048e;

    /* renamed from: f */
    private final ImageAppearance f44049f;

    /* renamed from: g */
    private final ImageAppearance f44050g;

    /* renamed from: h */
    private final ButtonAppearance f44051h;

    /* renamed from: i */
    private final ButtonAppearance f44052i;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.PromoTemplateAppearance$a */
    class C15540a implements Parcelable.Creator<PromoTemplateAppearance> {
        C15540a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new PromoTemplateAppearance(parcel);
        }

        public Object[] newArray(int i) {
            return new PromoTemplateAppearance[i];
        }
    }

    protected PromoTemplateAppearance(Parcel parcel) {
        this.f44045b = (BannerAppearance) parcel.readParcelable(BannerAppearance.class.getClassLoader());
        this.f44046c = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f44047d = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f44048e = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f44049f = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f44050g = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f44051h = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
        this.f44052i = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PromoTemplateAppearance.class != obj.getClass()) {
            return false;
        }
        PromoTemplateAppearance promoTemplateAppearance = (PromoTemplateAppearance) obj;
        BannerAppearance bannerAppearance = this.f44045b;
        if (bannerAppearance == null ? promoTemplateAppearance.f44045b != null : !bannerAppearance.equals(promoTemplateAppearance.f44045b)) {
            return false;
        }
        TextAppearance textAppearance = this.f44046c;
        if (textAppearance == null ? promoTemplateAppearance.f44046c != null : !textAppearance.equals(promoTemplateAppearance.f44046c)) {
            return false;
        }
        TextAppearance textAppearance2 = this.f44047d;
        if (textAppearance2 == null ? promoTemplateAppearance.f44047d != null : !textAppearance2.equals(promoTemplateAppearance.f44047d)) {
            return false;
        }
        TextAppearance textAppearance3 = this.f44048e;
        if (textAppearance3 == null ? promoTemplateAppearance.f44048e != null : !textAppearance3.equals(promoTemplateAppearance.f44048e)) {
            return false;
        }
        ImageAppearance imageAppearance = this.f44049f;
        if (imageAppearance == null ? promoTemplateAppearance.f44049f != null : !imageAppearance.equals(promoTemplateAppearance.f44049f)) {
            return false;
        }
        ImageAppearance imageAppearance2 = this.f44050g;
        if (imageAppearance2 == null ? promoTemplateAppearance.f44050g != null : !imageAppearance2.equals(promoTemplateAppearance.f44050g)) {
            return false;
        }
        ButtonAppearance buttonAppearance = this.f44051h;
        if (buttonAppearance == null ? promoTemplateAppearance.f44051h != null : !buttonAppearance.equals(promoTemplateAppearance.f44051h)) {
            return false;
        }
        ButtonAppearance buttonAppearance2 = this.f44052i;
        if (buttonAppearance2 != null) {
            return buttonAppearance2.equals(promoTemplateAppearance.f44052i);
        }
        if (promoTemplateAppearance.f44052i == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        BannerAppearance bannerAppearance = this.f44045b;
        int i = 0;
        int hashCode = (bannerAppearance != null ? bannerAppearance.hashCode() : 0) * 31;
        TextAppearance textAppearance = this.f44046c;
        int hashCode2 = (hashCode + (textAppearance != null ? textAppearance.hashCode() : 0)) * 31;
        TextAppearance textAppearance2 = this.f44047d;
        int hashCode3 = (hashCode2 + (textAppearance2 != null ? textAppearance2.hashCode() : 0)) * 31;
        TextAppearance textAppearance3 = this.f44048e;
        int hashCode4 = (hashCode3 + (textAppearance3 != null ? textAppearance3.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance = this.f44049f;
        int hashCode5 = (hashCode4 + (imageAppearance != null ? imageAppearance.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance2 = this.f44050g;
        int hashCode6 = (hashCode5 + (imageAppearance2 != null ? imageAppearance2.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance = this.f44051h;
        int hashCode7 = (hashCode6 + (buttonAppearance != null ? buttonAppearance.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance2 = this.f44052i;
        if (buttonAppearance2 != null) {
            i = buttonAppearance2.hashCode();
        }
        return hashCode7 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f44045b, i);
        parcel.writeParcelable(this.f44046c, i);
        parcel.writeParcelable(this.f44047d, i);
        parcel.writeParcelable(this.f44048e, i);
        parcel.writeParcelable(this.f44049f, i);
        parcel.writeParcelable(this.f44050g, i);
        parcel.writeParcelable(this.f44051h, i);
        parcel.writeParcelable(this.f44052i, i);
    }
}
