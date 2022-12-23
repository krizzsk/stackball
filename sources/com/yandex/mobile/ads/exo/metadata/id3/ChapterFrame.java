package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new C12239a();

    /* renamed from: c */
    public final String f29906c;

    /* renamed from: d */
    public final int f29907d;

    /* renamed from: e */
    public final int f29908e;

    /* renamed from: f */
    public final long f29909f;

    /* renamed from: g */
    public final long f29910g;

    /* renamed from: h */
    private final Id3Frame[] f29911h;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.ChapterFrame$a */
    class C12239a implements Parcelable.Creator<ChapterFrame> {
        C12239a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f29906c = str;
        this.f29907d = i;
        this.f29908e = i2;
        this.f29909f = j;
        this.f29910g = j2;
        this.f29911h = id3FrameArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (this.f29907d == chapterFrame.f29907d && this.f29908e == chapterFrame.f29908e && this.f29909f == chapterFrame.f29909f && this.f29910g == chapterFrame.f29910g && ih1.m37382a((Object) this.f29906c, (Object) chapterFrame.f29906c) && Arrays.equals(this.f29911h, chapterFrame.f29911h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((this.f29907d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f29908e) * 31) + ((int) this.f29909f)) * 31) + ((int) this.f29910g)) * 31;
        String str = this.f29906c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29906c);
        parcel.writeInt(this.f29907d);
        parcel.writeInt(this.f29908e);
        parcel.writeLong(this.f29909f);
        parcel.writeLong(this.f29910g);
        parcel.writeInt(this.f29911h.length);
        for (Id3Frame writeParcelable : this.f29911h) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f29906c = (String) ih1.m37372a(parcel.readString());
        this.f29907d = parcel.readInt();
        this.f29908e = parcel.readInt();
        this.f29909f = parcel.readLong();
        this.f29910g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f29911h = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f29911h[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
