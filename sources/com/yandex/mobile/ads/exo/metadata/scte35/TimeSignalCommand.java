package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.de1;
import com.yandex.mobile.ads.impl.fy0;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C12258a();

    /* renamed from: b */
    public final long f29977b;

    /* renamed from: c */
    public final long f29978c;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.TimeSignalCommand$a */
    class C12258a implements Parcelable.Creator<TimeSignalCommand> {
        C12258a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), (C12258a) null);
        }

        public Object[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    /* synthetic */ TimeSignalCommand(long j, long j2, C12258a aVar) {
        this(j, j2);
    }

    /* renamed from: a */
    static TimeSignalCommand m32099a(fy0 fy0, long j, de1 de1) {
        long a = m32098a(fy0, j);
        return new TimeSignalCommand(a, de1.mo66566b(a));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f29977b);
        parcel.writeLong(this.f29978c);
    }

    private TimeSignalCommand(long j, long j2) {
        this.f29977b = j;
        this.f29978c = j2;
    }

    /* renamed from: a */
    static long m32098a(fy0 fy0, long j) {
        long r = (long) fy0.mo67126r();
        if ((128 & r) != 0) {
            return 8589934591L & ((((r & 1) << 32) | fy0.mo67128t()) + j);
        }
        return -9223372036854775807L;
    }
}
