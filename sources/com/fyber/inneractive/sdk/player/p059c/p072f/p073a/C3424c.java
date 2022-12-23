package com.fyber.inneractive.sdk.player.p059c.p072f.p073a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a.c */
public final class C3424c extends C3435h {
    public static final Parcelable.Creator<C3424c> CREATOR = new Parcelable.Creator<C3424c>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3424c[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3424c(parcel);
        }
    };

    /* renamed from: a */
    public final String f9257a;

    /* renamed from: b */
    public final int f9258b;

    /* renamed from: c */
    public final int f9259c;

    /* renamed from: d */
    public final long f9260d;

    /* renamed from: e */
    public final long f9261e;

    /* renamed from: g */
    private final C3435h[] f9262g;

    public final int describeContents() {
        return 0;
    }

    public C3424c(String str, int i, int i2, long j, long j2, C3435h[] hVarArr) {
        super("CHAP");
        this.f9257a = str;
        this.f9258b = i;
        this.f9259c = i2;
        this.f9260d = j;
        this.f9261e = j2;
        this.f9262g = hVarArr;
    }

    C3424c(Parcel parcel) {
        super("CHAP");
        this.f9257a = parcel.readString();
        this.f9258b = parcel.readInt();
        this.f9259c = parcel.readInt();
        this.f9260d = parcel.readLong();
        this.f9261e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f9262g = new C3435h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f9262g[i] = (C3435h) parcel.readParcelable(C3435h.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3424c cVar = (C3424c) obj;
            return this.f9258b == cVar.f9258b && this.f9259c == cVar.f9259c && this.f9260d == cVar.f9260d && this.f9261e == cVar.f9261e && C3560t.m8885a((Object) this.f9257a, (Object) cVar.f9257a) && Arrays.equals(this.f9262g, cVar.f9262g);
        }
    }

    public final int hashCode() {
        int i = (((((((this.f9258b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f9259c) * 31) + ((int) this.f9260d)) * 31) + ((int) this.f9261e)) * 31;
        String str = this.f9257a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9257a);
        parcel.writeInt(this.f9258b);
        parcel.writeInt(this.f9259c);
        parcel.writeLong(this.f9260d);
        parcel.writeLong(this.f9261e);
        parcel.writeInt(this.f9262g.length);
        for (C3435h writeParcelable : this.f9262g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
