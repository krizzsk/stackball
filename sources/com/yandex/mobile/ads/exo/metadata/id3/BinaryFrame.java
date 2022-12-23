package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C12238a();

    /* renamed from: c */
    public final byte[] f29905c;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.BinaryFrame$a */
    class C12238a implements Parcelable.Creator<BinaryFrame> {
        C12238a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f29905c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (!this.f29924b.equals(binaryFrame.f29924b) || !Arrays.equals(this.f29905c, binaryFrame.f29905c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f29924b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f29905c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29924b);
        parcel.writeByteArray(this.f29905c);
    }

    BinaryFrame(Parcel parcel) {
        super((String) ih1.m37372a(parcel.readString()));
        this.f29905c = (byte[]) ih1.m37372a(parcel.createByteArray());
    }
}
