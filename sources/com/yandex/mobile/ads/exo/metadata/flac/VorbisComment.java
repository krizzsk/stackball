package com.yandex.mobile.ads.exo.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.ih1;

public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C12234a();

    /* renamed from: b */
    public final String f29890b;

    /* renamed from: c */
    public final String f29891c;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.flac.VorbisComment$a */
    class C12234a implements Parcelable.Creator<VorbisComment> {
        C12234a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        public Object[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f29890b = str;
        this.f29891c = str2;
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
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        if (!this.f29890b.equals(vorbisComment.f29890b) || !this.f29891c.equals(vorbisComment.f29891c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f29890b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f29891c.hashCode();
    }

    public String toString() {
        return "VC: " + this.f29890b + "=" + this.f29891c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29890b);
        parcel.writeString(this.f29891c);
    }

    VorbisComment(Parcel parcel) {
        this.f29890b = (String) ih1.m37372a(parcel.readString());
        this.f29891c = (String) ih1.m37372a(parcel.readString());
    }
}
