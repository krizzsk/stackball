package com.yandex.metrica.impl.p265ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.Il */
public class C10378Il implements Parcelable {
    public static final Parcelable.Creator<C10378Il> CREATOR = new C10379a();

    /* renamed from: a */
    public final boolean f24919a;

    /* renamed from: b */
    public final boolean f24920b;

    /* renamed from: c */
    public final boolean f24921c;

    /* renamed from: d */
    public final boolean f24922d;

    /* renamed from: e */
    public final C11091bm f24923e;

    /* renamed from: f */
    public final C10437Kl f24924f;

    /* renamed from: g */
    public final C10437Kl f24925g;

    /* renamed from: h */
    public final C10437Kl f24926h;

    /* renamed from: com.yandex.metrica.impl.ob.Il$a */
    class C10379a implements Parcelable.Creator<C10378Il> {
        C10379a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C10378Il(parcel);
        }

        public Object[] newArray(int i) {
            return new C10378Il[i];
        }
    }

    public C10378Il(C10675Qi qi) {
        this(qi.mo62014f().f28189k, qi.mo62014f().f28191m, qi.mo62014f().f28190l, qi.mo62014f().f28192n, qi.mo62005T(), qi.mo62004S(), qi.mo62003R(), qi.mo62006U());
    }

    /* renamed from: a */
    public boolean mo61560a() {
        return (this.f24923e == null || this.f24924f == null || this.f24925g == null || this.f24926h == null) ? false : true;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10378Il.class != obj.getClass()) {
            return false;
        }
        C10378Il il = (C10378Il) obj;
        if (this.f24919a != il.f24919a || this.f24920b != il.f24920b || this.f24921c != il.f24921c || this.f24922d != il.f24922d) {
            return false;
        }
        C11091bm bmVar = this.f24923e;
        if (bmVar == null ? il.f24923e != null : !bmVar.equals(il.f24923e)) {
            return false;
        }
        C10437Kl kl = this.f24924f;
        if (kl == null ? il.f24924f != null : !kl.equals(il.f24924f)) {
            return false;
        }
        C10437Kl kl2 = this.f24925g;
        if (kl2 == null ? il.f24925g != null : !kl2.equals(il.f24925g)) {
            return false;
        }
        C10437Kl kl3 = this.f24926h;
        if (kl3 != null) {
            return kl3.equals(il.f24926h);
        }
        if (il.f24926h == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((this.f24919a ? 1 : 0) * true) + (this.f24920b ? 1 : 0)) * 31) + (this.f24921c ? 1 : 0)) * 31) + (this.f24922d ? 1 : 0)) * 31;
        C11091bm bmVar = this.f24923e;
        int i2 = 0;
        int hashCode = (i + (bmVar != null ? bmVar.hashCode() : 0)) * 31;
        C10437Kl kl = this.f24924f;
        int hashCode2 = (hashCode + (kl != null ? kl.hashCode() : 0)) * 31;
        C10437Kl kl2 = this.f24925g;
        int hashCode3 = (hashCode2 + (kl2 != null ? kl2.hashCode() : 0)) * 31;
        C10437Kl kl3 = this.f24926h;
        if (kl3 != null) {
            i2 = kl3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "UiAccessConfig{uiParsingEnabled=" + this.f24919a + ", uiEventSendingEnabled=" + this.f24920b + ", uiCollectingForBridgeEnabled=" + this.f24921c + ", uiRawEventSendingEnabled=" + this.f24922d + ", uiParsingConfig=" + this.f24923e + ", uiEventSendingConfig=" + this.f24924f + ", uiCollectingForBridgeConfig=" + this.f24925g + ", uiRawEventSendingConfig=" + this.f24926h + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f24919a ? (byte) 1 : 0);
        parcel.writeByte(this.f24920b ? (byte) 1 : 0);
        parcel.writeByte(this.f24921c ? (byte) 1 : 0);
        parcel.writeByte(this.f24922d ? (byte) 1 : 0);
        parcel.writeParcelable(this.f24923e, i);
        parcel.writeParcelable(this.f24924f, i);
        parcel.writeParcelable(this.f24925g, i);
        parcel.writeParcelable(this.f24926h, i);
    }

    public C10378Il(boolean z, boolean z2, boolean z3, boolean z4, C11091bm bmVar, C10437Kl kl, C10437Kl kl2, C10437Kl kl3) {
        this.f24919a = z;
        this.f24920b = z2;
        this.f24921c = z3;
        this.f24922d = z4;
        this.f24923e = bmVar;
        this.f24924f = kl;
        this.f24925g = kl2;
        this.f24926h = kl3;
    }

    protected C10378Il(Parcel parcel) {
        boolean z = true;
        this.f24919a = parcel.readByte() != 0;
        this.f24920b = parcel.readByte() != 0;
        this.f24921c = parcel.readByte() != 0;
        this.f24922d = parcel.readByte() == 0 ? false : z;
        this.f24923e = (C11091bm) parcel.readParcelable(C11091bm.class.getClassLoader());
        this.f24924f = (C10437Kl) parcel.readParcelable(C10437Kl.class.getClassLoader());
        this.f24925g = (C10437Kl) parcel.readParcelable(C10437Kl.class.getClassLoader());
        this.f24926h = (C10437Kl) parcel.readParcelable(C10437Kl.class.getClassLoader());
    }
}
