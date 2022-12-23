package com.yandex.metrica.impl.p265ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.Wa */
public class C10880Wa implements Parcelable {
    public static final Parcelable.Creator<C10880Wa> CREATOR = new C10881a();

    /* renamed from: a */
    public final long f26152a;

    /* renamed from: b */
    public final int f26153b;

    /* renamed from: com.yandex.metrica.impl.ob.Wa$a */
    class C10881a implements Parcelable.Creator<C10880Wa> {
        C10881a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C10880Wa(parcel);
        }

        public Object[] newArray(int i) {
            return new C10880Wa[i];
        }
    }

    public C10880Wa(long j, int i) {
        this.f26152a = j;
        this.f26153b = i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfig{expirationTimestampSeconds=" + this.f26152a + ", intervalSeconds=" + this.f26153b + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f26152a);
        parcel.writeInt(this.f26153b);
    }

    protected C10880Wa(Parcel parcel) {
        this.f26152a = parcel.readLong();
        this.f26153b = parcel.readInt();
    }
}
