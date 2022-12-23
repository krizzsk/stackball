package com.fyber.inneractive.sdk.player.p059c.p081l;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.l.b */
public final class C3563b implements Parcelable {
    public static final Parcelable.Creator<C3563b> CREATOR = new Parcelable.Creator<C3563b>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3563b[0];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3563b(parcel);
        }
    };

    /* renamed from: a */
    public final int f9670a;

    /* renamed from: b */
    public final int f9671b;

    /* renamed from: c */
    public final int f9672c;

    /* renamed from: d */
    public final byte[] f9673d;

    /* renamed from: e */
    private int f9674e;

    public final int describeContents() {
        return 0;
    }

    public C3563b(int i, int i2, int i3, byte[] bArr) {
        this.f9670a = i;
        this.f9671b = i2;
        this.f9672c = i3;
        this.f9673d = bArr;
    }

    C3563b(Parcel parcel) {
        this.f9670a = parcel.readInt();
        this.f9671b = parcel.readInt();
        this.f9672c = parcel.readInt();
        this.f9673d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3563b bVar = (C3563b) obj;
            return this.f9670a == bVar.f9670a && this.f9671b == bVar.f9671b && this.f9672c == bVar.f9672c && Arrays.equals(this.f9673d, bVar.f9673d);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f9670a);
        sb.append(", ");
        sb.append(this.f9671b);
        sb.append(", ");
        sb.append(this.f9672c);
        sb.append(", ");
        sb.append(this.f9673d != null);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f9674e == 0) {
            this.f9674e = ((((((this.f9670a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f9671b) * 31) + this.f9672c) * 31) + Arrays.hashCode(this.f9673d);
        }
        return this.f9674e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9670a);
        parcel.writeInt(this.f9671b);
        parcel.writeInt(this.f9672c);
        parcel.writeInt(this.f9673d != null ? 1 : 0);
        byte[] bArr = this.f9673d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
