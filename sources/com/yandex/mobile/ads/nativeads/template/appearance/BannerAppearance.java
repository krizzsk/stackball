package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;

public final class BannerAppearance implements Parcelable {
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new C15536a();

    /* renamed from: b */
    private final HorizontalOffset f43995b;

    /* renamed from: c */
    private final HorizontalOffset f43996c;

    /* renamed from: d */
    private final int f43997d;

    /* renamed from: e */
    private final int f43998e;

    /* renamed from: f */
    private final float f43999f;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f44000a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f44001b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f44002c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public HorizontalOffset f44003d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public HorizontalOffset f44004e;

        public BannerAppearance build() {
            return new BannerAppearance(this, (C15536a) null);
        }

        public Builder setBackgroundColor(int i) {
            this.f44000a = i;
            return this;
        }

        public Builder setBorderColor(int i) {
            this.f44001b = i;
            return this;
        }

        public Builder setBorderWidth(float f) {
            this.f44002c = f;
            return this;
        }

        public Builder setContentPadding(HorizontalOffset horizontalOffset) {
            this.f44003d = horizontalOffset;
            return this;
        }

        public Builder setImageMargins(HorizontalOffset horizontalOffset) {
            this.f44004e = horizontalOffset;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance$a */
    class C15536a implements Parcelable.Creator<BannerAppearance> {
        C15536a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new BannerAppearance(parcel);
        }

        public Object[] newArray(int i) {
            return new BannerAppearance[i];
        }
    }

    /* synthetic */ BannerAppearance(Builder builder, C15536a aVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BannerAppearance.class != obj.getClass()) {
            return false;
        }
        BannerAppearance bannerAppearance = (BannerAppearance) obj;
        if (this.f43997d != bannerAppearance.f43997d || this.f43998e != bannerAppearance.f43998e || Float.compare(bannerAppearance.f43999f, this.f43999f) != 0) {
            return false;
        }
        HorizontalOffset horizontalOffset = this.f43995b;
        if (horizontalOffset == null ? bannerAppearance.f43995b != null : !horizontalOffset.equals(bannerAppearance.f43995b)) {
            return false;
        }
        HorizontalOffset horizontalOffset2 = this.f43996c;
        HorizontalOffset horizontalOffset3 = bannerAppearance.f43996c;
        return horizontalOffset2 == null ? horizontalOffset3 == null : horizontalOffset2.equals(horizontalOffset3);
    }

    public int getBackgroundColor() {
        return this.f43997d;
    }

    public int getBorderColor() {
        return this.f43998e;
    }

    public float getBorderWidth() {
        return this.f43999f;
    }

    public HorizontalOffset getContentPadding() {
        return this.f43995b;
    }

    public HorizontalOffset getImageMargins() {
        return this.f43996c;
    }

    public int hashCode() {
        int i = ((this.f43997d * 31) + this.f43998e) * 31;
        float f = this.f43999f;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        HorizontalOffset horizontalOffset = this.f43995b;
        int hashCode = (floatToIntBits + (horizontalOffset != null ? horizontalOffset.hashCode() : 0)) * 31;
        HorizontalOffset horizontalOffset2 = this.f43996c;
        if (horizontalOffset2 != null) {
            i2 = horizontalOffset2.hashCode();
        }
        return hashCode + i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f43997d);
        parcel.writeInt(this.f43998e);
        parcel.writeFloat(this.f43999f);
        parcel.writeParcelable(this.f43995b, 0);
        parcel.writeParcelable(this.f43996c, 0);
    }

    private BannerAppearance(Builder builder) {
        this.f43997d = builder.f44000a;
        this.f43998e = builder.f44001b;
        this.f43999f = builder.f44002c;
        this.f43995b = builder.f44003d;
        this.f43996c = builder.f44004e;
    }

    protected BannerAppearance(Parcel parcel) {
        this.f43997d = parcel.readInt();
        this.f43998e = parcel.readInt();
        this.f43999f = parcel.readFloat();
        this.f43995b = (HorizontalOffset) parcel.readParcelable(HorizontalOffset.class.getClassLoader());
        this.f43996c = (HorizontalOffset) parcel.readParcelable(HorizontalOffset.class.getClassLoader());
    }
}
