package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new Parcelable.Creator<GeobFrame>() {
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    };

    /* renamed from: ID */
    public static final String f10052ID = "GEOB";
    public final byte[] data;
    public final String description;
    public final String filename;
    public final String mimeType;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.mimeType = str;
        this.filename = str2;
        this.description = str3;
        this.data = bArr;
    }

    GeobFrame(Parcel parcel) {
        super("GEOB");
        this.mimeType = (String) Util.castNonNull(parcel.readString());
        this.filename = (String) Util.castNonNull(parcel.readString());
        this.description = (String) Util.castNonNull(parcel.readString());
        this.data = (byte[]) Util.castNonNull(parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (!Util.areEqual(this.mimeType, geobFrame.mimeType) || !Util.areEqual(this.filename, geobFrame.filename) || !Util.areEqual(this.description, geobFrame.description) || !Arrays.equals(this.data, geobFrame.data)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.mimeType;
        int i = 0;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.filename;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.description;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.data);
    }

    public String toString() {
        return this.f10053id + ": mimeType=" + this.mimeType + ", filename=" + this.filename + ", description=" + this.description;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.filename);
        parcel.writeString(this.description);
        parcel.writeByteArray(this.data);
    }
}
