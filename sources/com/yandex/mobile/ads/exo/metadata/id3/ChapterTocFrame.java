package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C12240a();

    /* renamed from: c */
    public final String f29912c;

    /* renamed from: d */
    public final boolean f29913d;

    /* renamed from: e */
    public final boolean f29914e;

    /* renamed from: f */
    public final String[] f29915f;

    /* renamed from: g */
    private final Id3Frame[] f29916g;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.ChapterTocFrame$a */
    class C12240a implements Parcelable.Creator<ChapterTocFrame> {
        C12240a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f29912c = str;
        this.f29913d = z;
        this.f29914e = z2;
        this.f29915f = strArr;
        this.f29916g = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.f29913d != chapterTocFrame.f29913d || this.f29914e != chapterTocFrame.f29914e || !ih1.m37382a((Object) this.f29912c, (Object) chapterTocFrame.f29912c) || !Arrays.equals(this.f29915f, chapterTocFrame.f29915f) || !Arrays.equals(this.f29916g, chapterTocFrame.f29916g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((((this.f29913d ? 1 : 0) + true) * 31) + (this.f29914e ? 1 : 0)) * 31;
        String str = this.f29912c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29912c);
        parcel.writeByte(this.f29913d ? (byte) 1 : 0);
        parcel.writeByte(this.f29914e ? (byte) 1 : 0);
        parcel.writeStringArray(this.f29915f);
        parcel.writeInt(this.f29916g.length);
        for (Id3Frame writeParcelable : this.f29916g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f29912c = (String) ih1.m37372a(parcel.readString());
        boolean z = true;
        this.f29913d = parcel.readByte() != 0;
        this.f29914e = parcel.readByte() == 0 ? false : z;
        this.f29915f = (String[]) ih1.m37372a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f29916g = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f29916g[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
