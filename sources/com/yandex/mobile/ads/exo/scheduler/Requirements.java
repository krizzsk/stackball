package com.yandex.mobile.ads.exo.scheduler;

import android.os.Parcel;
import android.os.Parcelable;

public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new C12276a();

    /* renamed from: b */
    private final int f30058b;

    /* renamed from: com.yandex.mobile.ads.exo.scheduler.Requirements$a */
    class C12276a implements Parcelable.Creator<Requirements> {
        C12276a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new Requirements[i];
        }
    }

    public Requirements(int i) {
        this.f30058b = (i & 2) != 0 ? i | 1 : i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Requirements.class == obj.getClass() && this.f30058b == ((Requirements) obj).f30058b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f30058b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30058b);
    }
}
