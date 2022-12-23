package com.yandex.mobile.ads.exo.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class TrackGroupArray implements Parcelable {
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new C12278a();

    /* renamed from: e */
    public static final TrackGroupArray f30062e = new TrackGroupArray(new TrackGroup[0]);

    /* renamed from: b */
    public final int f30063b;

    /* renamed from: c */
    private final TrackGroup[] f30064c;

    /* renamed from: d */
    private int f30065d;

    /* renamed from: com.yandex.mobile.ads.exo.source.TrackGroupArray$a */
    class C12278a implements Parcelable.Creator<TrackGroupArray> {
        C12278a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        public Object[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f30064c = trackGroupArr;
        this.f30063b = trackGroupArr.length;
    }

    /* renamed from: a */
    public TrackGroup mo65240a(int i) {
        return this.f30064c[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.f30063b != trackGroupArray.f30063b || !Arrays.equals(this.f30064c, trackGroupArray.f30064c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f30065d == 0) {
            this.f30065d = Arrays.hashCode(this.f30064c);
        }
        return this.f30065d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30063b);
        for (int i2 = 0; i2 < this.f30063b; i2++) {
            parcel.writeParcelable(this.f30064c[i2], 0);
        }
    }

    /* renamed from: a */
    public int mo65239a(TrackGroup trackGroup) {
        for (int i = 0; i < this.f30063b; i++) {
            if (this.f30064c[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f30063b = readInt;
        this.f30064c = new TrackGroup[readInt];
        for (int i = 0; i < this.f30063b; i++) {
            this.f30064c[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
