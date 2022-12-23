package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;

public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C12241a();

    /* renamed from: c */
    public final String f29917c;

    /* renamed from: d */
    public final String f29918d;

    /* renamed from: e */
    public final String f29919e;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.CommentFrame$a */
    class C12241a implements Parcelable.Creator<CommentFrame> {
        C12241a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f29917c = str;
        this.f29918d = str2;
        this.f29919e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (!ih1.m37382a((Object) this.f29918d, (Object) commentFrame.f29918d) || !ih1.m37382a((Object) this.f29917c, (Object) commentFrame.f29917c) || !ih1.m37382a((Object) this.f29919e, (Object) commentFrame.f29919e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f29917c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f29918d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29919e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f29924b + ": language=" + this.f29917c + ", description=" + this.f29918d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29924b);
        parcel.writeString(this.f29917c);
        parcel.writeString(this.f29919e);
    }

    CommentFrame(Parcel parcel) {
        super("COMM");
        this.f29917c = (String) ih1.m37372a(parcel.readString());
        this.f29918d = (String) ih1.m37372a(parcel.readString());
        this.f29919e = (String) ih1.m37372a(parcel.readString());
    }
}
