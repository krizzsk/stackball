package com.yandex.metrica.impl.p265ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.bm */
public class C11091bm implements Parcelable {
    public static final Parcelable.Creator<C11091bm> CREATOR = new C11092a();

    /* renamed from: a */
    public final int f26619a;

    /* renamed from: b */
    public final int f26620b;

    /* renamed from: c */
    public final int f26621c;

    /* renamed from: d */
    public final long f26622d;

    /* renamed from: e */
    public final boolean f26623e;

    /* renamed from: f */
    public final boolean f26624f;

    /* renamed from: g */
    public final boolean f26625g;

    /* renamed from: h */
    public final List<C11215em> f26626h;

    /* renamed from: com.yandex.metrica.impl.ob.bm$a */
    class C11092a implements Parcelable.Creator<C11091bm> {
        C11092a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C11091bm(parcel);
        }

        public Object[] newArray(int i) {
            return new C11091bm[i];
        }
    }

    public C11091bm(int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, List<C11215em> list) {
        this.f26619a = i;
        this.f26620b = i2;
        this.f26621c = i3;
        this.f26622d = j;
        this.f26623e = z;
        this.f26624f = z2;
        this.f26625g = z3;
        this.f26626h = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11091bm.class != obj.getClass()) {
            return false;
        }
        C11091bm bmVar = (C11091bm) obj;
        if (this.f26619a == bmVar.f26619a && this.f26620b == bmVar.f26620b && this.f26621c == bmVar.f26621c && this.f26622d == bmVar.f26622d && this.f26623e == bmVar.f26623e && this.f26624f == bmVar.f26624f && this.f26625g == bmVar.f26625g) {
            return this.f26626h.equals(bmVar.f26626h);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f26622d;
        return (((((((((((((this.f26619a * 31) + this.f26620b) * 31) + this.f26621c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f26623e ? 1 : 0)) * 31) + (this.f26624f ? 1 : 0)) * 31) + (this.f26625g ? 1 : 0)) * 31) + this.f26626h.hashCode();
    }

    public String toString() {
        return "UiParsingConfig{tooLongTextBound=" + this.f26619a + ", truncatedTextBound=" + this.f26620b + ", maxVisitedChildrenInLevel=" + this.f26621c + ", afterCreateTimeout=" + this.f26622d + ", relativeTextSizeCalculation=" + this.f26623e + ", errorReporting=" + this.f26624f + ", parsingAllowedByDefault=" + this.f26625g + ", filters=" + this.f26626h + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26619a);
        parcel.writeInt(this.f26620b);
        parcel.writeInt(this.f26621c);
        parcel.writeLong(this.f26622d);
        parcel.writeByte(this.f26623e ? (byte) 1 : 0);
        parcel.writeByte(this.f26624f ? (byte) 1 : 0);
        parcel.writeByte(this.f26625g ? (byte) 1 : 0);
        parcel.writeList(this.f26626h);
    }

    protected C11091bm(Parcel parcel) {
        this.f26619a = parcel.readInt();
        this.f26620b = parcel.readInt();
        this.f26621c = parcel.readInt();
        this.f26622d = parcel.readLong();
        boolean z = true;
        this.f26623e = parcel.readByte() != 0;
        this.f26624f = parcel.readByte() != 0;
        this.f26625g = parcel.readByte() == 0 ? false : z;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C11215em.class.getClassLoader());
        this.f26626h = arrayList;
    }
}
