package com.yandex.mobile.ads.exo.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new C12336a();

    /* renamed from: b */
    public final int f30311b;

    /* renamed from: c */
    public final int f30312c;

    /* renamed from: d */
    public final int f30313d;

    /* renamed from: e */
    public final byte[] f30314e;

    /* renamed from: f */
    private int f30315f;

    /* renamed from: com.yandex.mobile.ads.exo.video.ColorInfo$a */
    class C12336a implements Parcelable.Creator<ColorInfo> {
        C12336a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ColorInfo[i];
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.f30311b = i;
        this.f30312c = i2;
        this.f30313d = i3;
        this.f30314e = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        if (this.f30311b == colorInfo.f30311b && this.f30312c == colorInfo.f30312c && this.f30313d == colorInfo.f30313d && Arrays.equals(this.f30314e, colorInfo.f30314e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f30315f == 0) {
            this.f30315f = ((((((this.f30311b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f30312c) * 31) + this.f30313d) * 31) + Arrays.hashCode(this.f30314e);
        }
        return this.f30315f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f30311b);
        sb.append(", ");
        sb.append(this.f30312c);
        sb.append(", ");
        sb.append(this.f30313d);
        sb.append(", ");
        sb.append(this.f30314e != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30311b);
        parcel.writeInt(this.f30312c);
        parcel.writeInt(this.f30313d);
        int i2 = this.f30314e != null ? 1 : 0;
        int i3 = ih1.f34858a;
        parcel.writeInt(i2);
        byte[] bArr = this.f30314e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    ColorInfo(Parcel parcel) {
        this.f30311b = parcel.readInt();
        this.f30312c = parcel.readInt();
        this.f30313d = parcel.readInt();
        this.f30314e = ih1.m37381a(parcel) ? parcel.createByteArray() : null;
    }
}
