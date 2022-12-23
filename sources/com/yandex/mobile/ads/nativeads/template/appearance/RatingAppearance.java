package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingAppearance implements Parcelable {
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new C15541a();

    /* renamed from: b */
    private final int f44053b;

    /* renamed from: c */
    private final int f44054c;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f44055a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f44056b;

        public RatingAppearance build() {
            return new RatingAppearance(this, (C15541a) null);
        }

        public Builder setBackgroundStarColor(int i) {
            this.f44055a = i;
            return this;
        }

        public Builder setProgressStarColor(int i) {
            this.f44056b = i;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance$a */
    class C15541a implements Parcelable.Creator<RatingAppearance> {
        C15541a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new RatingAppearance(parcel);
        }

        public Object[] newArray(int i) {
            return new RatingAppearance[i];
        }
    }

    /* synthetic */ RatingAppearance(Builder builder, C15541a aVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RatingAppearance.class != obj.getClass()) {
            return false;
        }
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        if (this.f44053b == ratingAppearance.f44053b && this.f44054c == ratingAppearance.f44054c) {
            return true;
        }
        return false;
    }

    public int getBackgroundStarColor() {
        return this.f44053b;
    }

    public int getProgressStarColor() {
        return this.f44054c;
    }

    public int hashCode() {
        return (this.f44053b * 31) + this.f44054c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f44053b);
        parcel.writeInt(this.f44054c);
    }

    private RatingAppearance(Builder builder) {
        this.f44053b = builder.f44055a;
        this.f44054c = builder.f44056b;
    }

    protected RatingAppearance(Parcel parcel) {
        this.f44053b = parcel.readInt();
        this.f44054c = parcel.readInt();
    }
}
