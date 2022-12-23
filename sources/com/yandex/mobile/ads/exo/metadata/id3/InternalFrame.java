package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;

public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new C12243a();

    /* renamed from: c */
    public final String f29925c;

    /* renamed from: d */
    public final String f29926d;

    /* renamed from: e */
    public final String f29927e;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.InternalFrame$a */
    class C12243a implements Parcelable.Creator<InternalFrame> {
        C12243a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f29925c = str;
        this.f29926d = str2;
        this.f29927e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (!ih1.m37382a((Object) this.f29926d, (Object) internalFrame.f29926d) || !ih1.m37382a((Object) this.f29925c, (Object) internalFrame.f29925c) || !ih1.m37382a((Object) this.f29927e, (Object) internalFrame.f29927e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f29925c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f29926d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29927e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f29924b + ": domain=" + this.f29925c + ", description=" + this.f29926d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29924b);
        parcel.writeString(this.f29925c);
        parcel.writeString(this.f29927e);
    }

    InternalFrame(Parcel parcel) {
        super("----");
        this.f29925c = (String) ih1.m37372a(parcel.readString());
        this.f29926d = (String) ih1.m37372a(parcel.readString());
        this.f29927e = (String) ih1.m37372a(parcel.readString());
    }
}
