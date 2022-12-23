package com.yandex.metrica.impl.p265ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.em */
public class C11215em implements Parcelable {
    public static final Parcelable.Creator<C11215em> CREATOR = new C11216a();

    /* renamed from: a */
    public final C11217b f26845a;

    /* renamed from: b */
    public final String f26846b;

    /* renamed from: com.yandex.metrica.impl.ob.em$a */
    class C11216a implements Parcelable.Creator<C11215em> {
        C11216a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C11215em(parcel);
        }

        public Object[] newArray(int i) {
            return new C11215em[i];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$b */
    public enum C11217b {
        EQUALS(0),
        CONTAINS(1),
        MATCHES(2),
        DOES_NOT_MATCH(3);
        

        /* renamed from: a */
        public final int f26852a;

        private C11217b(int i) {
            this.f26852a = i;
        }

        /* renamed from: a */
        public static C11217b m28893a(int i) {
            C11217b[] values = values();
            for (int i2 = 0; i2 < 4; i2++) {
                C11217b bVar = values[i2];
                if (bVar.f26852a == i) {
                    return bVar;
                }
            }
            return EQUALS;
        }
    }

    public C11215em(C11217b bVar, String str) {
        this.f26845a = bVar;
        this.f26846b = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11215em.class != obj.getClass()) {
            return false;
        }
        C11215em emVar = (C11215em) obj;
        if (this.f26845a != emVar.f26845a) {
            return false;
        }
        return this.f26846b.equals(emVar.f26846b);
    }

    public int hashCode() {
        return (this.f26845a.hashCode() * 31) + this.f26846b.hashCode();
    }

    public String toString() {
        return "UiParsingFilter{type=" + this.f26845a + ", value='" + this.f26846b + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26845a.f26852a);
        parcel.writeString(this.f26846b);
    }

    protected C11215em(Parcel parcel) {
        this.f26845a = C11217b.m28893a(parcel.readInt());
        this.f26846b = (String) C11993ym.m30961a(parcel.readString(), "");
    }
}
