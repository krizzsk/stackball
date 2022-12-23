package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new Parcelable.Creator<BinaryFrame>() {
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    };
    public final byte[] data;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.data = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (!this.f16405id.equals(binaryFrame.f16405id) || !Arrays.equals(this.data, binaryFrame.data)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f16405id.hashCode()) * 31) + Arrays.hashCode(this.data);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16405id);
        parcel.writeByteArray(this.data);
    }
}
