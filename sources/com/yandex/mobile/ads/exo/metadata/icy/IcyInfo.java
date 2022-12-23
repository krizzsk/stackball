package com.yandex.mobile.ads.exo.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C13479j9;
import java.util.Arrays;

public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new C12236a();

    /* renamed from: b */
    public final byte[] f29898b;

    /* renamed from: c */
    public final String f29899c;

    /* renamed from: d */
    public final String f29900d;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.icy.IcyInfo$a */
    class C12236a implements Parcelable.Creator<IcyInfo> {
        C12236a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f29898b = bArr;
        this.f29899c = str;
        this.f29900d = str2;
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
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f29898b, ((IcyInfo) obj).f29898b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f29898b);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f29899c, this.f29900d, Integer.valueOf(this.f29898b.length)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f29898b);
        parcel.writeString(this.f29899c);
        parcel.writeString(this.f29900d);
    }

    IcyInfo(Parcel parcel) {
        this.f29898b = (byte[]) C13479j9.m37703a(parcel.createByteArray());
        this.f29899c = parcel.readString();
        this.f29900d = parcel.readString();
    }
}
