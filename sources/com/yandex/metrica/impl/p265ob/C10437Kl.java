package com.yandex.metrica.impl.p265ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Kl */
public class C10437Kl implements Parcelable {
    public static final Parcelable.Creator<C10437Kl> CREATOR = new C10438a();

    /* renamed from: a */
    public final boolean f25063a;

    /* renamed from: b */
    public final boolean f25064b;

    /* renamed from: c */
    public final boolean f25065c;

    /* renamed from: d */
    public final boolean f25066d;

    /* renamed from: e */
    public final boolean f25067e;

    /* renamed from: f */
    public final boolean f25068f;

    /* renamed from: g */
    public final boolean f25069g;

    /* renamed from: h */
    public final boolean f25070h;

    /* renamed from: i */
    public final boolean f25071i;

    /* renamed from: j */
    public final boolean f25072j;

    /* renamed from: k */
    public final int f25073k;

    /* renamed from: l */
    public final int f25074l;

    /* renamed from: m */
    public final int f25075m;

    /* renamed from: n */
    public final int f25076n;

    /* renamed from: o */
    public final int f25077o;

    /* renamed from: p */
    public final List<C11215em> f25078p;

    /* renamed from: com.yandex.metrica.impl.ob.Kl$a */
    class C10438a implements Parcelable.Creator<C10437Kl> {
        C10438a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C10437Kl(parcel);
        }

        public Object[] newArray(int i) {
            return new C10437Kl[i];
        }
    }

    public C10437Kl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, int i2, int i3, int i4, int i5, List<C11215em> list) {
        this.f25063a = z;
        this.f25064b = z2;
        this.f25065c = z3;
        this.f25066d = z4;
        this.f25067e = z5;
        this.f25068f = z6;
        this.f25069g = z7;
        this.f25070h = z8;
        this.f25071i = z9;
        this.f25072j = z10;
        this.f25073k = i;
        this.f25074l = i2;
        this.f25075m = i3;
        this.f25076n = i4;
        this.f25077o = i5;
        this.f25078p = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10437Kl.class != obj.getClass()) {
            return false;
        }
        C10437Kl kl = (C10437Kl) obj;
        if (this.f25063a == kl.f25063a && this.f25064b == kl.f25064b && this.f25065c == kl.f25065c && this.f25066d == kl.f25066d && this.f25067e == kl.f25067e && this.f25068f == kl.f25068f && this.f25069g == kl.f25069g && this.f25070h == kl.f25070h && this.f25071i == kl.f25071i && this.f25072j == kl.f25072j && this.f25073k == kl.f25073k && this.f25074l == kl.f25074l && this.f25075m == kl.f25075m && this.f25076n == kl.f25076n && this.f25077o == kl.f25077o) {
            return this.f25078p.equals(kl.f25078p);
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((this.f25063a ? 1 : 0) * true) + (this.f25064b ? 1 : 0)) * 31) + (this.f25065c ? 1 : 0)) * 31) + (this.f25066d ? 1 : 0)) * 31) + (this.f25067e ? 1 : 0)) * 31) + (this.f25068f ? 1 : 0)) * 31) + (this.f25069g ? 1 : 0)) * 31) + (this.f25070h ? 1 : 0)) * 31) + (this.f25071i ? 1 : 0)) * 31) + (this.f25072j ? 1 : 0)) * 31) + this.f25073k) * 31) + this.f25074l) * 31) + this.f25075m) * 31) + this.f25076n) * 31) + this.f25077o) * 31) + this.f25078p.hashCode();
    }

    public String toString() {
        return "UiCollectingConfig{textSizeCollecting=" + this.f25063a + ", relativeTextSizeCollecting=" + this.f25064b + ", textVisibilityCollecting=" + this.f25065c + ", textStyleCollecting=" + this.f25066d + ", infoCollecting=" + this.f25067e + ", nonContentViewCollecting=" + this.f25068f + ", textLengthCollecting=" + this.f25069g + ", viewHierarchical=" + this.f25070h + ", ignoreFiltered=" + this.f25071i + ", webViewUrlsCollecting=" + this.f25072j + ", tooLongTextBound=" + this.f25073k + ", truncatedTextBound=" + this.f25074l + ", maxEntitiesCount=" + this.f25075m + ", maxFullContentLength=" + this.f25076n + ", webViewUrlLimit=" + this.f25077o + ", filters=" + this.f25078p + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f25063a ? (byte) 1 : 0);
        parcel.writeByte(this.f25064b ? (byte) 1 : 0);
        parcel.writeByte(this.f25065c ? (byte) 1 : 0);
        parcel.writeByte(this.f25066d ? (byte) 1 : 0);
        parcel.writeByte(this.f25067e ? (byte) 1 : 0);
        parcel.writeByte(this.f25068f ? (byte) 1 : 0);
        parcel.writeByte(this.f25069g ? (byte) 1 : 0);
        parcel.writeByte(this.f25070h ? (byte) 1 : 0);
        parcel.writeByte(this.f25071i ? (byte) 1 : 0);
        parcel.writeByte(this.f25072j ? (byte) 1 : 0);
        parcel.writeInt(this.f25073k);
        parcel.writeInt(this.f25074l);
        parcel.writeInt(this.f25075m);
        parcel.writeInt(this.f25076n);
        parcel.writeInt(this.f25077o);
        parcel.writeList(this.f25078p);
    }

    protected C10437Kl(Parcel parcel) {
        boolean z = true;
        this.f25063a = parcel.readByte() != 0;
        this.f25064b = parcel.readByte() != 0;
        this.f25065c = parcel.readByte() != 0;
        this.f25066d = parcel.readByte() != 0;
        this.f25067e = parcel.readByte() != 0;
        this.f25068f = parcel.readByte() != 0;
        this.f25069g = parcel.readByte() != 0;
        this.f25070h = parcel.readByte() != 0;
        this.f25071i = parcel.readByte() != 0;
        this.f25072j = parcel.readByte() == 0 ? false : z;
        this.f25073k = parcel.readInt();
        this.f25074l = parcel.readInt();
        this.f25075m = parcel.readInt();
        this.f25076n = parcel.readInt();
        this.f25077o = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C11215em.class.getClassLoader());
        this.f25078p = arrayList;
    }
}
