package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() {
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    };
    public final String description;
    public final String value;

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.value = str3;
    }

    TextInformationFrame(Parcel parcel) {
        super((String) Util.castNonNull(parcel.readString()));
        this.description = parcel.readString();
        this.value = (String) Util.castNonNull(parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (!this.f10053id.equals(textInformationFrame.f10053id) || !Util.areEqual(this.description, textInformationFrame.description) || !Util.areEqual(this.value, textInformationFrame.value)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f10053id.hashCode()) * 31;
        String str = this.description;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f10053id + ": description=" + this.description + ": value=" + this.value;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10053id);
        parcel.writeString(this.description);
        parcel.writeString(this.value);
    }
}
