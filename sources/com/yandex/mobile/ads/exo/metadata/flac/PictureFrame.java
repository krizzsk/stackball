package com.yandex.mobile.ads.exo.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new C12233a();

    /* renamed from: b */
    public final int f29882b;

    /* renamed from: c */
    public final String f29883c;

    /* renamed from: d */
    public final String f29884d;

    /* renamed from: e */
    public final int f29885e;

    /* renamed from: f */
    public final int f29886f;

    /* renamed from: g */
    public final int f29887g;

    /* renamed from: h */
    public final int f29888h;

    /* renamed from: i */
    public final byte[] f29889i;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.flac.PictureFrame$a */
    class C12233a implements Parcelable.Creator<PictureFrame> {
        C12233a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f29882b = i;
        this.f29883c = str;
        this.f29884d = str2;
        this.f29885e = i2;
        this.f29886f = i3;
        this.f29887g = i4;
        this.f29888h = i5;
        this.f29889i = bArr;
    }

    /* renamed from: a */
    public /* synthetic */ byte[] mo64872a() {
        return Metadata.Entry.CC.$default$a(this);
    }

    /* renamed from: b */
    public /* synthetic */ Format mo64873b() {
        return Metadata.Entry.CC.$default$b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        if (this.f29882b == pictureFrame.f29882b && this.f29883c.equals(pictureFrame.f29883c) && this.f29884d.equals(pictureFrame.f29884d) && this.f29885e == pictureFrame.f29885e && this.f29886f == pictureFrame.f29886f && this.f29887g == pictureFrame.f29887g && this.f29888h == pictureFrame.f29888h && Arrays.equals(this.f29889i, pictureFrame.f29889i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((this.f29882b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f29883c.hashCode()) * 31) + this.f29884d.hashCode()) * 31) + this.f29885e) * 31) + this.f29886f) * 31) + this.f29887g) * 31) + this.f29888h) * 31) + Arrays.hashCode(this.f29889i);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f29883c + ", description=" + this.f29884d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29882b);
        parcel.writeString(this.f29883c);
        parcel.writeString(this.f29884d);
        parcel.writeInt(this.f29885e);
        parcel.writeInt(this.f29886f);
        parcel.writeInt(this.f29887g);
        parcel.writeInt(this.f29888h);
        parcel.writeByteArray(this.f29889i);
    }

    PictureFrame(Parcel parcel) {
        this.f29882b = parcel.readInt();
        this.f29883c = (String) ih1.m37372a(parcel.readString());
        this.f29884d = (String) ih1.m37372a(parcel.readString());
        this.f29885e = parcel.readInt();
        this.f29886f = parcel.readInt();
        this.f29887g = parcel.readInt();
        this.f29888h = parcel.readInt();
        this.f29889i = (byte[]) ih1.m37372a(parcel.createByteArray());
    }
}
