package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.fy0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C12255a();

    /* renamed from: b */
    public final List<C12257c> f29963b;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceScheduleCommand$a */
    class C12255a implements Parcelable.Creator<SpliceScheduleCommand> {
        C12255a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, (C12255a) null);
        }

        public Object[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C12256b {

        /* renamed from: a */
        public final int f29964a;

        /* renamed from: b */
        public final long f29965b;

        /* synthetic */ C12256b(int i, long j, C12255a aVar) {
            this(i, j);
        }

        /* renamed from: a */
        static C12256b m32095a(Parcel parcel) {
            return new C12256b(parcel.readInt(), parcel.readLong());
        }

        private C12256b(int i, long j) {
            this.f29964a = i;
            this.f29965b = j;
        }
    }

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, C12255a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static SpliceScheduleCommand m32094a(fy0 fy0) {
        int r = fy0.mo67126r();
        ArrayList arrayList = new ArrayList(r);
        for (int i = 0; i < r; i++) {
            arrayList.add(C12257c.m32097a(fy0));
        }
        return new SpliceScheduleCommand((List<C12257c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f29963b.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C12257c cVar = this.f29963b.get(i2);
            parcel.writeLong(cVar.f29966a);
            parcel.writeByte(cVar.f29967b ? (byte) 1 : 0);
            parcel.writeByte(cVar.f29968c ? (byte) 1 : 0);
            parcel.writeByte(cVar.f29969d ? (byte) 1 : 0);
            int size2 = cVar.f29971f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C12256b bVar = cVar.f29971f.get(i3);
                parcel.writeInt(bVar.f29964a);
                parcel.writeLong(bVar.f29965b);
            }
            parcel.writeLong(cVar.f29970e);
            parcel.writeByte(cVar.f29972g ? (byte) 1 : 0);
            parcel.writeLong(cVar.f29973h);
            parcel.writeInt(cVar.f29974i);
            parcel.writeInt(cVar.f29975j);
            parcel.writeInt(cVar.f29976k);
        }
    }

    private SpliceScheduleCommand(List<C12257c> list) {
        this.f29963b = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C12257c.m32096a(parcel));
        }
        this.f29963b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C12257c {

        /* renamed from: a */
        public final long f29966a;

        /* renamed from: b */
        public final boolean f29967b;

        /* renamed from: c */
        public final boolean f29968c;

        /* renamed from: d */
        public final boolean f29969d;

        /* renamed from: e */
        public final long f29970e;

        /* renamed from: f */
        public final List<C12256b> f29971f;

        /* renamed from: g */
        public final boolean f29972g;

        /* renamed from: h */
        public final long f29973h;

        /* renamed from: i */
        public final int f29974i;

        /* renamed from: j */
        public final int f29975j;

        /* renamed from: k */
        public final int f29976k;

        private C12257c(long j, boolean z, boolean z2, boolean z3, List<C12256b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f29966a = j;
            this.f29967b = z;
            this.f29968c = z2;
            this.f29969d = z3;
            this.f29971f = Collections.unmodifiableList(list);
            this.f29970e = j2;
            this.f29972g = z4;
            this.f29973h = j3;
            this.f29974i = i;
            this.f29975j = i2;
            this.f29976k = i3;
        }

        /* renamed from: a */
        static C12257c m32097a(fy0 fy0) {
            boolean z;
            int i;
            int i2;
            int i3;
            long j;
            boolean z2;
            long j2;
            ArrayList arrayList;
            boolean z3;
            long j3;
            boolean z4;
            long t = fy0.mo67128t();
            boolean z5 = (fy0.mo67126r() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int r = fy0.mo67126r();
                boolean z6 = (r & 128) != 0;
                boolean z7 = (r & 64) != 0;
                boolean z8 = (r & 32) != 0;
                long t2 = z7 ? fy0.mo67128t() : -9223372036854775807L;
                if (!z7) {
                    int r2 = fy0.mo67126r();
                    ArrayList arrayList3 = new ArrayList(r2);
                    for (int i4 = 0; i4 < r2; i4++) {
                        arrayList3.add(new C12256b(fy0.mo67126r(), fy0.mo67128t(), (C12255a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long r3 = (long) fy0.mo67126r();
                    boolean z9 = (128 & r3) != 0;
                    j3 = ((((r3 & 1) << 32) | fy0.mo67128t()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int x = fy0.mo67132x();
                int r4 = fy0.mo67126r();
                z = z7;
                i = fy0.mo67126r();
                j = j3;
                arrayList = arrayList2;
                long j4 = t2;
                i3 = x;
                i2 = r4;
                j2 = j4;
                boolean z10 = z6;
                z2 = z4;
                z3 = z10;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j2 = -9223372036854775807L;
                z2 = false;
                j = -9223372036854775807L;
                i3 = 0;
                i2 = 0;
                i = 0;
                z = false;
            }
            return new C12257c(t, z5, z3, z, arrayList, j2, z2, j, i3, i2, i);
        }

        private C12257c(Parcel parcel) {
            this.f29966a = parcel.readLong();
            boolean z = false;
            this.f29967b = parcel.readByte() == 1;
            this.f29968c = parcel.readByte() == 1;
            this.f29969d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C12256b.m32095a(parcel));
            }
            this.f29971f = Collections.unmodifiableList(arrayList);
            this.f29970e = parcel.readLong();
            this.f29972g = parcel.readByte() == 1 ? true : z;
            this.f29973h = parcel.readLong();
            this.f29974i = parcel.readInt();
            this.f29975j = parcel.readInt();
            this.f29976k = parcel.readInt();
        }

        /* renamed from: a */
        static C12257c m32096a(Parcel parcel) {
            return new C12257c(parcel);
        }
    }
}
