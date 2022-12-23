package com.yandex.metrica.impl.p265ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.Xa */
public class C10921Xa implements Parcelable {
    public static final Parcelable.Creator<C10921Xa> CREATOR = new C10922a();

    /* renamed from: a */
    public final C10880Wa f26252a;

    /* renamed from: b */
    public final C10880Wa f26253b;

    /* renamed from: c */
    public final C10880Wa f26254c;

    /* renamed from: com.yandex.metrica.impl.ob.Xa$a */
    class C10922a implements Parcelable.Creator<C10921Xa> {
        C10922a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C10921Xa(parcel);
        }

        public Object[] newArray(int i) {
            return new C10921Xa[i];
        }
    }

    public C10921Xa() {
        this((C10880Wa) null, (C10880Wa) null, (C10880Wa) null);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfigsHolder{activationConfig=" + this.f26252a + ", clidsInfoConfig=" + this.f26253b + ", preloadInfoConfig=" + this.f26254c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f26252a, i);
        parcel.writeParcelable(this.f26253b, i);
        parcel.writeParcelable(this.f26254c, i);
    }

    public C10921Xa(C10880Wa wa, C10880Wa wa2, C10880Wa wa3) {
        this.f26252a = wa;
        this.f26253b = wa2;
        this.f26254c = wa3;
    }

    protected C10921Xa(Parcel parcel) {
        this.f26252a = (C10880Wa) parcel.readParcelable(C10880Wa.class.getClassLoader());
        this.f26253b = (C10880Wa) parcel.readParcelable(C10880Wa.class.getClassLoader());
        this.f26254c = (C10880Wa) parcel.readParcelable(C10880Wa.class.getClassLoader());
    }
}
