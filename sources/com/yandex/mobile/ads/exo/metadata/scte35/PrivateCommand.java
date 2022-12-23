package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.ih1;

public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C12251a();

    /* renamed from: b */
    public final long f29944b;

    /* renamed from: c */
    public final long f29945c;

    /* renamed from: d */
    public final byte[] f29946d;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.PrivateCommand$a */
    class C12251a implements Parcelable.Creator<PrivateCommand> {
        C12251a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, (C12251a) null);
        }

        public Object[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    /* synthetic */ PrivateCommand(Parcel parcel, C12251a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static PrivateCommand m32089a(fy0 fy0, int i, long j) {
        long t = fy0.mo67128t();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        fy0.mo67104a(bArr, 0, i2);
        return new PrivateCommand(t, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f29944b);
        parcel.writeLong(this.f29945c);
        parcel.writeByteArray(this.f29946d);
    }

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.f29944b = j2;
        this.f29945c = j;
        this.f29946d = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f29944b = parcel.readLong();
        this.f29945c = parcel.readLong();
        this.f29946d = (byte[]) ih1.m37372a(parcel.createByteArray());
    }
}
