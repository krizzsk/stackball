package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C12242a();

    /* renamed from: c */
    public final String f29920c;

    /* renamed from: d */
    public final String f29921d;

    /* renamed from: e */
    public final String f29922e;

    /* renamed from: f */
    public final byte[] f29923f;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.GeobFrame$a */
    class C12242a implements Parcelable.Creator<GeobFrame> {
        C12242a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f29920c = str;
        this.f29921d = str2;
        this.f29922e = str3;
        this.f29923f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (!ih1.m37382a((Object) this.f29920c, (Object) geobFrame.f29920c) || !ih1.m37382a((Object) this.f29921d, (Object) geobFrame.f29921d) || !ih1.m37382a((Object) this.f29922e, (Object) geobFrame.f29922e) || !Arrays.equals(this.f29923f, geobFrame.f29923f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f29920c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f29921d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29922e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f29923f);
    }

    public String toString() {
        return this.f29924b + ": mimeType=" + this.f29920c + ", filename=" + this.f29921d + ", description=" + this.f29922e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29920c);
        parcel.writeString(this.f29921d);
        parcel.writeString(this.f29922e);
        parcel.writeByteArray(this.f29923f);
    }

    GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f29920c = (String) ih1.m37372a(parcel.readString());
        this.f29921d = (String) ih1.m37372a(parcel.readString());
        this.f29922e = (String) ih1.m37372a(parcel.readString());
        this.f29923f = (byte[]) ih1.m37372a(parcel.createByteArray());
    }
}
