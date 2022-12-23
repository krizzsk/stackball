package com.yandex.metrica.impl.p265ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.g1 */
public class C11258g1 implements Parcelable {
    public static final Parcelable.Creator<C11258g1> CREATOR = new C11259a();

    /* renamed from: a */
    public final String f26933a;

    /* renamed from: b */
    public final C11171e1 f26934b;

    /* renamed from: c */
    public final String f26935c;

    /* renamed from: com.yandex.metrica.impl.ob.g1$a */
    class C11259a implements Parcelable.Creator<C11258g1> {
        C11259a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C11258g1(parcel.readString(), C11171e1.m28808a(parcel.readString()), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new C11258g1[i];
        }
    }

    public C11258g1(String str, C11171e1 e1Var, String str2) {
        this.f26933a = str;
        this.f26934b = e1Var;
        this.f26935c = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11258g1.class != obj.getClass()) {
            return false;
        }
        C11258g1 g1Var = (C11258g1) obj;
        String str = this.f26933a;
        if (str == null ? g1Var.f26933a != null : !str.equals(g1Var.f26933a)) {
            return false;
        }
        if (this.f26934b != g1Var.f26934b) {
            return false;
        }
        String str2 = this.f26935c;
        if (str2 != null) {
            return str2.equals(g1Var.f26935c);
        }
        if (g1Var.f26935c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f26933a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f26934b.hashCode()) * 31;
        String str2 = this.f26935c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "IdentifiersResultInternal{mId='" + this.f26933a + '\'' + ", mStatus=" + this.f26934b + ", mErrorExplanation='" + this.f26935c + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26933a);
        parcel.writeString(this.f26934b.mo62803a());
        parcel.writeString(this.f26935c);
    }
}
