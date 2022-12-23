package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;

public final class ImageAppearance implements Parcelable {
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new C15538a();

    /* renamed from: b */
    private final SizeConstraint f44015b;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public SizeConstraint f44016a;

        public ImageAppearance build() {
            return new ImageAppearance(this, (C15538a) null);
        }

        public Builder setWidthConstraint(SizeConstraint sizeConstraint) {
            this.f44016a = sizeConstraint;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance$a */
    class C15538a implements Parcelable.Creator<ImageAppearance> {
        C15538a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new ImageAppearance(parcel);
        }

        public Object[] newArray(int i) {
            return new ImageAppearance[i];
        }
    }

    /* synthetic */ ImageAppearance(Builder builder, C15538a aVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImageAppearance.class != obj.getClass()) {
            return false;
        }
        ImageAppearance imageAppearance = (ImageAppearance) obj;
        SizeConstraint sizeConstraint = this.f44015b;
        if (sizeConstraint != null) {
            if (!sizeConstraint.equals(imageAppearance.f44015b)) {
                return false;
            }
            return true;
        } else if (imageAppearance.f44015b == null) {
            return true;
        }
        return false;
    }

    public SizeConstraint getWidthConstraint() {
        return this.f44015b;
    }

    public int hashCode() {
        SizeConstraint sizeConstraint = this.f44015b;
        if (sizeConstraint != null) {
            return sizeConstraint.hashCode();
        }
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f44015b, i);
    }

    private ImageAppearance(Builder builder) {
        this.f44015b = builder.f44016a;
    }

    protected ImageAppearance(Parcel parcel) {
        this.f44015b = (SizeConstraint) parcel.readParcelable(SizeConstraint.class.getClassLoader());
    }
}
