package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C12237a();

    /* renamed from: c */
    public final String f29901c;

    /* renamed from: d */
    public final String f29902d;

    /* renamed from: e */
    public final int f29903e;

    /* renamed from: f */
    public final byte[] f29904f;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.ApicFrame$a */
    class C12237a implements Parcelable.Creator<ApicFrame> {
        C12237a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f29901c = str;
        this.f29902d = str2;
        this.f29903e = i;
        this.f29904f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.f29903e != apicFrame.f29903e || !ih1.m37382a((Object) this.f29901c, (Object) apicFrame.f29901c) || !ih1.m37382a((Object) this.f29902d, (Object) apicFrame.f29902d) || !Arrays.equals(this.f29904f, apicFrame.f29904f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = (this.f29903e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f29901c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29902d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f29904f);
    }

    public String toString() {
        return this.f29924b + ": mimeType=" + this.f29901c + ", description=" + this.f29902d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29901c);
        parcel.writeString(this.f29902d);
        parcel.writeInt(this.f29903e);
        parcel.writeByteArray(this.f29904f);
    }

    ApicFrame(Parcel parcel) {
        super("APIC");
        this.f29901c = (String) ih1.m37372a(parcel.readString());
        this.f29902d = parcel.readString();
        this.f29903e = parcel.readInt();
        this.f29904f = (byte[]) ih1.m37372a(parcel.createByteArray());
    }
}
