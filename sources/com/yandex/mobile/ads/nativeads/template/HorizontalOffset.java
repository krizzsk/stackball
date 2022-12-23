package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;

public final class HorizontalOffset implements Parcelable {
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new C15527a();

    /* renamed from: b */
    private final float f43950b;

    /* renamed from: c */
    private final float f43951c;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.HorizontalOffset$a */
    class C15527a implements Parcelable.Creator<HorizontalOffset> {
        C15527a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new HorizontalOffset(parcel);
        }

        public Object[] newArray(int i) {
            return new HorizontalOffset[i];
        }
    }

    public HorizontalOffset(float f, float f2) {
        this.f43950b = f;
        this.f43951c = f2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HorizontalOffset.class != obj.getClass()) {
            return false;
        }
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        if (Float.compare(horizontalOffset.f43950b, this.f43950b) == 0 && Float.compare(horizontalOffset.f43951c, this.f43951c) == 0) {
            return true;
        }
        return false;
    }

    public float getLeft() {
        return this.f43950b;
    }

    public float getRight() {
        return this.f43951c;
    }

    public int hashCode() {
        float f = this.f43950b;
        int i = 0;
        int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.f43951c;
        if (f2 != 0.0f) {
            i = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i;
    }

    public String toString() {
        return this.f43950b + ", " + this.f43951c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f43950b);
        parcel.writeFloat(this.f43951c);
    }

    protected HorizontalOffset(Parcel parcel) {
        this.f43950b = parcel.readFloat();
        this.f43951c = parcel.readFloat();
    }
}
