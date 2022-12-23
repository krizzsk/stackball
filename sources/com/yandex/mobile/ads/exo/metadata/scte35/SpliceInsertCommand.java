package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.de1;
import com.yandex.mobile.ads.impl.fy0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C12252a();

    /* renamed from: b */
    public final long f29947b;

    /* renamed from: c */
    public final boolean f29948c;

    /* renamed from: d */
    public final boolean f29949d;

    /* renamed from: e */
    public final boolean f29950e;

    /* renamed from: f */
    public final boolean f29951f;

    /* renamed from: g */
    public final long f29952g;

    /* renamed from: h */
    public final long f29953h;

    /* renamed from: i */
    public final List<C12253b> f29954i;

    /* renamed from: j */
    public final boolean f29955j;

    /* renamed from: k */
    public final long f29956k;

    /* renamed from: l */
    public final int f29957l;

    /* renamed from: m */
    public final int f29958m;

    /* renamed from: n */
    public final int f29959n;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceInsertCommand$a */
    class C12252a implements Parcelable.Creator<SpliceInsertCommand> {
        C12252a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, (C12252a) null);
        }

        public Object[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceInsertCommand$b */
    public static final class C12253b {

        /* renamed from: a */
        public final int f29960a;

        /* renamed from: b */
        public final long f29961b;

        /* renamed from: c */
        public final long f29962c;

        /* synthetic */ C12253b(int i, long j, long j2, C12252a aVar) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static C12253b m32093a(Parcel parcel) {
            return new C12253b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private C12253b(int i, long j, long j2) {
            this.f29960a = i;
            this.f29961b = j;
            this.f29962c = j2;
        }
    }

    /* synthetic */ SpliceInsertCommand(Parcel parcel, C12252a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static SpliceInsertCommand m32092a(fy0 fy0, long j, de1 de1) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        boolean z5;
        de1 de12 = de1;
        long t = fy0.mo67128t();
        boolean z6 = (fy0.mo67126r() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int r = fy0.mo67126r();
            boolean z7 = (r & 128) != 0;
            boolean z8 = (r & 64) != 0;
            boolean z9 = (r & 32) != 0;
            boolean z10 = (r & 16) != 0;
            long a = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.m32098a(fy0, j);
            if (!z8) {
                int r2 = fy0.mo67126r();
                ArrayList arrayList = new ArrayList(r2);
                for (int i4 = 0; i4 < r2; i4++) {
                    int r3 = fy0.mo67126r();
                    long a2 = !z10 ? TimeSignalCommand.m32098a(fy0, j) : -9223372036854775807L;
                    arrayList.add(new C12253b(r3, a2, de12.mo66566b(a2), (C12252a) null));
                }
                emptyList = arrayList;
            }
            if (z9) {
                long r4 = (long) fy0.mo67126r();
                boolean z11 = (128 & r4) != 0;
                j4 = ((((r4 & 1) << 32) | fy0.mo67128t()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i3 = fy0.mo67132x();
            z = z8;
            i2 = fy0.mo67126r();
            i = fy0.mo67126r();
            list = emptyList;
            long j5 = a;
            z2 = z5;
            j2 = j4;
            z3 = z10;
            z4 = z7;
            j3 = j5;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        return new SpliceInsertCommand(t, z6, z4, z, z3, j3, de12.mo66566b(j3), list, z2, j2, i3, i2, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f29947b);
        parcel.writeByte(this.f29948c ? (byte) 1 : 0);
        parcel.writeByte(this.f29949d ? (byte) 1 : 0);
        parcel.writeByte(this.f29950e ? (byte) 1 : 0);
        parcel.writeByte(this.f29951f ? (byte) 1 : 0);
        parcel.writeLong(this.f29952g);
        parcel.writeLong(this.f29953h);
        int size = this.f29954i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C12253b bVar = this.f29954i.get(i2);
            parcel.writeInt(bVar.f29960a);
            parcel.writeLong(bVar.f29961b);
            parcel.writeLong(bVar.f29962c);
        }
        parcel.writeByte(this.f29955j ? (byte) 1 : 0);
        parcel.writeLong(this.f29956k);
        parcel.writeInt(this.f29957l);
        parcel.writeInt(this.f29958m);
        parcel.writeInt(this.f29959n);
    }

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C12253b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f29947b = j;
        this.f29948c = z;
        this.f29949d = z2;
        this.f29950e = z3;
        this.f29951f = z4;
        this.f29952g = j2;
        this.f29953h = j3;
        this.f29954i = Collections.unmodifiableList(list);
        this.f29955j = z5;
        this.f29956k = j4;
        this.f29957l = i;
        this.f29958m = i2;
        this.f29959n = i3;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f29947b = parcel.readLong();
        boolean z = false;
        this.f29948c = parcel.readByte() == 1;
        this.f29949d = parcel.readByte() == 1;
        this.f29950e = parcel.readByte() == 1;
        this.f29951f = parcel.readByte() == 1;
        this.f29952g = parcel.readLong();
        this.f29953h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C12253b.m32093a(parcel));
        }
        this.f29954i = Collections.unmodifiableList(arrayList);
        this.f29955j = parcel.readByte() == 1 ? true : z;
        this.f29956k = parcel.readLong();
        this.f29957l = parcel.readInt();
        this.f29958m = parcel.readInt();
        this.f29959n = parcel.readInt();
    }
}
