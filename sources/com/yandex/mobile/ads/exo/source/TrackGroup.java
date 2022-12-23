package com.yandex.mobile.ads.exo.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.impl.C13479j9;
import java.util.Arrays;

public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new C12277a();

    /* renamed from: b */
    public final int f30059b;

    /* renamed from: c */
    private final Format[] f30060c;

    /* renamed from: d */
    private int f30061d;

    /* renamed from: com.yandex.mobile.ads.exo.source.TrackGroup$a */
    class C12277a implements Parcelable.Creator<TrackGroup> {
        C12277a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        public Object[] newArray(int i) {
            return new TrackGroup[i];
        }
    }

    public TrackGroup(Format... formatArr) {
        C13479j9.m37708b(formatArr.length > 0);
        this.f30060c = formatArr;
        this.f30059b = formatArr.length;
    }

    /* renamed from: a */
    public Format mo65232a(int i) {
        return this.f30060c[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        if (this.f30059b != trackGroup.f30059b || !Arrays.equals(this.f30060c, trackGroup.f30060c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f30061d == 0) {
            this.f30061d = Arrays.hashCode(this.f30060c) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f30061d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30059b);
        for (int i2 = 0; i2 < this.f30059b; i2++) {
            parcel.writeParcelable(this.f30060c[i2], 0);
        }
    }

    /* renamed from: a */
    public int mo65231a(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.f30060c;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f30059b = readInt;
        this.f30060c = new Format[readInt];
        for (int i = 0; i < this.f30059b; i++) {
            this.f30060c[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
