package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;

public final class SizeConstraint implements Parcelable {
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new C15530a();

    /* renamed from: b */
    private final SizeConstraintType f43989b;

    /* renamed from: c */
    private final float f43990c;

    public enum SizeConstraintType {
        FIXED,
        FIXED_RATIO,
        PREFERRED_RATIO
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.SizeConstraint$a */
    class C15530a implements Parcelable.Creator<SizeConstraint> {
        C15530a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new SizeConstraint(parcel);
        }

        public Object[] newArray(int i) {
            return new SizeConstraint[i];
        }
    }

    public SizeConstraint(SizeConstraintType sizeConstraintType, float f) {
        this.f43989b = sizeConstraintType;
        this.f43990c = f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SizeConstraint.class != obj.getClass()) {
            return false;
        }
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        if (Float.compare(sizeConstraint.f43990c, this.f43990c) == 0 && this.f43989b == sizeConstraint.f43989b) {
            return true;
        }
        return false;
    }

    public SizeConstraintType getSizeConstraintType() {
        return this.f43989b;
    }

    public float getValue() {
        return this.f43990c;
    }

    public int hashCode() {
        float f = this.f43990c;
        int i = 0;
        int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        SizeConstraintType sizeConstraintType = this.f43989b;
        if (sizeConstraintType != null) {
            i = sizeConstraintType.hashCode();
        }
        return floatToIntBits + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f43990c);
        SizeConstraintType sizeConstraintType = this.f43989b;
        parcel.writeInt(sizeConstraintType == null ? -1 : sizeConstraintType.ordinal());
    }

    protected SizeConstraint(Parcel parcel) {
        SizeConstraintType sizeConstraintType;
        this.f43990c = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            sizeConstraintType = null;
        } else {
            sizeConstraintType = SizeConstraintType.values()[readInt];
        }
        this.f43989b = sizeConstraintType;
    }
}
