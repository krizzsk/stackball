package com.fyber.inneractive.sdk.player.p059c.p062c;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.p059c.C3220b;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.c.c.a */
public final class C3227a implements Parcelable, Comparator<C3229a> {
    public static final Parcelable.Creator<C3227a> CREATOR = new Parcelable.Creator<C3227a>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3227a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3227a(parcel);
        }
    };

    /* renamed from: a */
    public final C3229a[] f8141a;

    /* renamed from: b */
    public final int f8142b;

    /* renamed from: c */
    private int f8143c;

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C3229a aVar = (C3229a) obj;
        C3229a aVar2 = (C3229a) obj2;
        if (C3220b.f8105b.equals(aVar.f8148e)) {
            return C3220b.f8105b.equals(aVar2.f8148e) ? 0 : 1;
        }
        return aVar.f8148e.compareTo(aVar2.f8148e);
    }

    public C3227a(List<C3229a> list) {
        this(false, (C3229a[]) list.toArray(new C3229a[list.size()]));
    }

    public C3227a(C3229a... aVarArr) {
        this(true, aVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.fyber.inneractive.sdk.player.c.c.a$a[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C3227a(boolean r4, com.fyber.inneractive.sdk.player.p059c.p062c.C3227a.C3229a... r5) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L_0x000c
            java.lang.Object r4 = r5.clone()
            r5 = r4
            com.fyber.inneractive.sdk.player.c.c.a$a[] r5 = (com.fyber.inneractive.sdk.player.p059c.p062c.C3227a.C3229a[]) r5
        L_0x000c:
            java.util.Arrays.sort(r5, r3)
            r4 = 1
        L_0x0010:
            int r0 = r5.length
            if (r4 >= r0) goto L_0x0044
            int r0 = r4 + -1
            r0 = r5[r0]
            java.util.UUID r0 = r0.f8148e
            r1 = r5[r4]
            java.util.UUID r1 = r1.f8148e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r4 = r4 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Duplicate data for uuid: "
            r1.<init>(r2)
            r4 = r5[r4]
            java.util.UUID r4 = r4.f8148e
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0044:
            r3.f8141a = r5
            int r4 = r5.length
            r3.f8142b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p062c.C3227a.<init>(boolean, com.fyber.inneractive.sdk.player.c.c.a$a[]):void");
    }

    C3227a(Parcel parcel) {
        C3229a[] aVarArr = (C3229a[]) parcel.createTypedArray(C3229a.CREATOR);
        this.f8141a = aVarArr;
        this.f8142b = aVarArr.length;
    }

    public final int hashCode() {
        if (this.f8143c == 0) {
            this.f8143c = Arrays.hashCode(this.f8141a);
        }
        return this.f8143c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8141a, ((C3227a) obj).f8141a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f8141a, 0);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.c.a$a */
    public static final class C3229a implements Parcelable {
        public static final Parcelable.Creator<C3229a> CREATOR = new Parcelable.Creator<C3229a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C3229a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C3229a(parcel);
            }
        };

        /* renamed from: a */
        public final String f8144a;

        /* renamed from: b */
        public final byte[] f8145b;

        /* renamed from: c */
        public final boolean f8146c;

        /* renamed from: d */
        private int f8147d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final UUID f8148e;

        public final int describeContents() {
            return 0;
        }

        public C3229a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, (byte) 0);
        }

        private C3229a(UUID uuid, String str, byte[] bArr, byte b) {
            this.f8148e = (UUID) C3535a.m8781a(uuid);
            this.f8144a = (String) C3535a.m8781a(str);
            this.f8145b = (byte[]) C3535a.m8781a(bArr);
            this.f8146c = false;
        }

        C3229a(Parcel parcel) {
            this.f8148e = new UUID(parcel.readLong(), parcel.readLong());
            this.f8144a = parcel.readString();
            this.f8145b = parcel.createByteArray();
            this.f8146c = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C3229a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C3229a aVar = (C3229a) obj;
            return this.f8144a.equals(aVar.f8144a) && C3560t.m8885a((Object) this.f8148e, (Object) aVar.f8148e) && Arrays.equals(this.f8145b, aVar.f8145b);
        }

        public final int hashCode() {
            if (this.f8147d == 0) {
                this.f8147d = (((this.f8148e.hashCode() * 31) + this.f8144a.hashCode()) * 31) + Arrays.hashCode(this.f8145b);
            }
            return this.f8147d;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f8148e.getMostSignificantBits());
            parcel.writeLong(this.f8148e.getLeastSignificantBits());
            parcel.writeString(this.f8144a);
            parcel.writeByteArray(this.f8145b);
            parcel.writeByte(this.f8146c ? (byte) 1 : 0);
        }
    }
}
