package com.fyber.inneractive.sdk.player.p059c.p072f.p073a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a.a */
public final class C3420a extends C3435h {
    public static final Parcelable.Creator<C3420a> CREATOR = new Parcelable.Creator<C3420a>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3420a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3420a(parcel);
        }
    };

    /* renamed from: a */
    public final String f9252a;

    /* renamed from: b */
    public final String f9253b;

    /* renamed from: c */
    public final int f9254c;

    /* renamed from: d */
    public final byte[] f9255d;

    public C3420a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f9252a = str;
        this.f9253b = str2;
        this.f9254c = i;
        this.f9255d = bArr;
    }

    C3420a(Parcel parcel) {
        super("APIC");
        this.f9252a = parcel.readString();
        this.f9253b = parcel.readString();
        this.f9254c = parcel.readInt();
        this.f9255d = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3420a aVar = (C3420a) obj;
            return this.f9254c == aVar.f9254c && C3560t.m8885a((Object) this.f9252a, (Object) aVar.f9252a) && C3560t.m8885a((Object) this.f9253b, (Object) aVar.f9253b) && Arrays.equals(this.f9255d, aVar.f9255d);
        }
    }

    public final int hashCode() {
        int i = (this.f9254c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f9252a;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9253b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f9255d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9252a);
        parcel.writeString(this.f9253b);
        parcel.writeInt(this.f9254c);
        parcel.writeByteArray(this.f9255d);
    }
}
