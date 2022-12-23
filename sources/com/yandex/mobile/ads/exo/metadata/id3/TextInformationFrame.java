package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C12246a();

    /* renamed from: c */
    public final String f29935c;

    /* renamed from: d */
    public final String f29936d;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame$a */
    class C12246a implements Parcelable.Creator<TextInformationFrame> {
        C12246a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f29935c = str2;
        this.f29936d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (!this.f29924b.equals(textInformationFrame.f29924b) || !ih1.m37382a((Object) this.f29935c, (Object) textInformationFrame.f29935c) || !ih1.m37382a((Object) this.f29936d, (Object) textInformationFrame.f29936d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.f29924b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f29935c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29936d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f29924b + ": description=" + this.f29935c + ": value=" + this.f29936d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29924b);
        parcel.writeString(this.f29935c);
        parcel.writeString(this.f29936d);
    }

    TextInformationFrame(Parcel parcel) {
        super((String) ih1.m37372a(parcel.readString()));
        this.f29935c = parcel.readString();
        this.f29936d = (String) ih1.m37372a(parcel.readString());
    }
}
