package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C12245a();

    /* renamed from: c */
    public final String f29933c;

    /* renamed from: d */
    public final byte[] f29934d;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.PrivFrame$a */
    class C12245a implements Parcelable.Creator<PrivFrame> {
        C12245a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f29933c = str;
        this.f29934d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (!ih1.m37382a((Object) this.f29933c, (Object) privFrame.f29933c) || !Arrays.equals(this.f29934d, privFrame.f29934d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f29933c;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f29934d);
    }

    public String toString() {
        return this.f29924b + ": owner=" + this.f29933c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29933c);
        parcel.writeByteArray(this.f29934d);
    }

    PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f29933c = (String) ih1.m37372a(parcel.readString());
        this.f29934d = (byte[]) ih1.m37372a(parcel.createByteArray());
    }
}
