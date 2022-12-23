package com.yandex.mobile.ads.exo.offline;

import android.os.Parcel;
import android.os.Parcelable;

public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new C12265a();

    /* renamed from: b */
    public final int f29998b;

    /* renamed from: c */
    public final int f29999c;

    /* renamed from: d */
    public final int f30000d;

    /* renamed from: com.yandex.mobile.ads.exo.offline.StreamKey$a */
    class C12265a implements Parcelable.Creator<StreamKey> {
        C12265a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        public Object[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    StreamKey(Parcel parcel) {
        this.f29998b = parcel.readInt();
        this.f29999c = parcel.readInt();
        this.f30000d = parcel.readInt();
    }

    public int compareTo(Object obj) {
        StreamKey streamKey = (StreamKey) obj;
        int i = this.f29998b - streamKey.f29998b;
        if (i != 0) {
            return i;
        }
        int i2 = this.f29999c - streamKey.f29999c;
        return i2 == 0 ? this.f30000d - streamKey.f30000d : i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        if (this.f29998b == streamKey.f29998b && this.f29999c == streamKey.f29999c && this.f30000d == streamKey.f30000d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f29998b * 31) + this.f29999c) * 31) + this.f30000d;
    }

    public String toString() {
        return this.f29998b + "." + this.f29999c + "." + this.f30000d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29998b);
        parcel.writeInt(this.f29999c);
        parcel.writeInt(this.f30000d);
    }
}
