package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;

public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C12247a();

    /* renamed from: c */
    public final String f29937c;

    /* renamed from: d */
    public final String f29938d;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.UrlLinkFrame$a */
    class C12247a implements Parcelable.Creator<UrlLinkFrame> {
        C12247a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f29937c = str2;
        this.f29938d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        if (!this.f29924b.equals(urlLinkFrame.f29924b) || !ih1.m37382a((Object) this.f29937c, (Object) urlLinkFrame.f29937c) || !ih1.m37382a((Object) this.f29938d, (Object) urlLinkFrame.f29938d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.f29924b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f29937c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29938d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f29924b + ": url=" + this.f29938d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29924b);
        parcel.writeString(this.f29937c);
        parcel.writeString(this.f29938d);
    }

    UrlLinkFrame(Parcel parcel) {
        super((String) ih1.m37372a(parcel.readString()));
        this.f29937c = parcel.readString();
        this.f29938d = (String) ih1.m37372a(parcel.readString());
    }
}
