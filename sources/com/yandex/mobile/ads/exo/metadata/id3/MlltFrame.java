package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new C12244a();

    /* renamed from: c */
    public final int f29928c;

    /* renamed from: d */
    public final int f29929d;

    /* renamed from: e */
    public final int f29930e;

    /* renamed from: f */
    public final int[] f29931f;

    /* renamed from: g */
    public final int[] f29932g;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.MlltFrame$a */
    class C12244a implements Parcelable.Creator<MlltFrame> {
        C12244a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(com.google.android.exoplayer2.metadata.id3.MlltFrame.f10055ID);
        this.f29928c = i;
        this.f29929d = i2;
        this.f29930e = i3;
        this.f29931f = iArr;
        this.f29932g = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (this.f29928c == mlltFrame.f29928c && this.f29929d == mlltFrame.f29929d && this.f29930e == mlltFrame.f29930e && Arrays.equals(this.f29931f, mlltFrame.f29931f) && Arrays.equals(this.f29932g, mlltFrame.f29932g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f29928c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f29929d) * 31) + this.f29930e) * 31) + Arrays.hashCode(this.f29931f)) * 31) + Arrays.hashCode(this.f29932g);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29928c);
        parcel.writeInt(this.f29929d);
        parcel.writeInt(this.f29930e);
        parcel.writeIntArray(this.f29931f);
        parcel.writeIntArray(this.f29932g);
    }

    MlltFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.MlltFrame.f10055ID);
        this.f29928c = parcel.readInt();
        this.f29929d = parcel.readInt();
        this.f29930e = parcel.readInt();
        this.f29931f = (int[]) ih1.m37372a(parcel.createIntArray());
        this.f29932g = (int[]) ih1.m37372a(parcel.createIntArray());
    }
}
