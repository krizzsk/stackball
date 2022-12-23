package com.yandex.mobile.ads.exo.extractor.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new C12193a();

    /* renamed from: b */
    public final String f29596b;

    /* renamed from: c */
    public final byte[] f29597c;

    /* renamed from: d */
    public final int f29598d;

    /* renamed from: e */
    public final int f29599e;

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.MdtaMetadataEntry$a */
    class C12193a implements Parcelable.Creator<MdtaMetadataEntry> {
        C12193a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, (C12193a) null);
        }

        public Object[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    /* synthetic */ MdtaMetadataEntry(Parcel parcel, C12193a aVar) {
        this(parcel);
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
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        if (!this.f29596b.equals(mdtaMetadataEntry.f29596b) || !Arrays.equals(this.f29597c, mdtaMetadataEntry.f29597c) || this.f29598d != mdtaMetadataEntry.f29598d || this.f29599e != mdtaMetadataEntry.f29599e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f29596b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f29597c)) * 31) + this.f29598d) * 31) + this.f29599e;
    }

    public String toString() {
        return "mdta: key=" + this.f29596b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29596b);
        parcel.writeInt(this.f29597c.length);
        parcel.writeByteArray(this.f29597c);
        parcel.writeInt(this.f29598d);
        parcel.writeInt(this.f29599e);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f29596b = str;
        this.f29597c = bArr;
        this.f29598d = i;
        this.f29599e = i2;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.f29596b = (String) ih1.m37372a(parcel.readString());
        byte[] bArr = new byte[parcel.readInt()];
        this.f29597c = bArr;
        parcel.readByteArray(bArr);
        this.f29598d = parcel.readInt();
        this.f29599e = parcel.readInt();
    }
}
