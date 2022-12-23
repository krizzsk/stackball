package com.fyber.inneractive.sdk.player.p059c.p072f.p073a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a.d */
public final class C3426d extends C3435h {
    public static final Parcelable.Creator<C3426d> CREATOR = new Parcelable.Creator<C3426d>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3426d[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3426d(parcel);
        }
    };

    /* renamed from: a */
    public final String f9263a;

    /* renamed from: b */
    public final boolean f9264b;

    /* renamed from: c */
    public final boolean f9265c;

    /* renamed from: d */
    public final String[] f9266d;

    /* renamed from: e */
    private final C3435h[] f9267e;

    public C3426d(String str, boolean z, boolean z2, String[] strArr, C3435h[] hVarArr) {
        super("CTOC");
        this.f9263a = str;
        this.f9264b = z;
        this.f9265c = z2;
        this.f9266d = strArr;
        this.f9267e = hVarArr;
    }

    C3426d(Parcel parcel) {
        super("CTOC");
        this.f9263a = parcel.readString();
        boolean z = true;
        this.f9264b = parcel.readByte() != 0;
        this.f9265c = parcel.readByte() == 0 ? false : z;
        this.f9266d = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f9267e = new C3435h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f9267e[i] = (C3435h) parcel.readParcelable(C3435h.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3426d dVar = (C3426d) obj;
            return this.f9264b == dVar.f9264b && this.f9265c == dVar.f9265c && C3560t.m8885a((Object) this.f9263a, (Object) dVar.f9263a) && Arrays.equals(this.f9266d, dVar.f9266d) && Arrays.equals(this.f9267e, dVar.f9267e);
        }
    }

    public final int hashCode() {
        int i = ((((this.f9264b ? 1 : 0) + true) * 31) + (this.f9265c ? 1 : 0)) * 31;
        String str = this.f9263a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9263a);
        parcel.writeByte(this.f9264b ? (byte) 1 : 0);
        parcel.writeByte(this.f9265c ? (byte) 1 : 0);
        parcel.writeStringArray(this.f9266d);
        parcel.writeInt(this.f9267e.length);
        int i2 = 0;
        while (true) {
            C3435h[] hVarArr = this.f9267e;
            if (i2 < hVarArr.length) {
                parcel.writeParcelable(hVarArr[i2], 0);
                i2++;
            } else {
                return;
            }
        }
    }
}
