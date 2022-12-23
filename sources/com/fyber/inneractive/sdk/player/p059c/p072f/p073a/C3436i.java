package com.fyber.inneractive.sdk.player.p059c.p072f.p073a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a.i */
public final class C3436i extends C3435h {
    public static final Parcelable.Creator<C3436i> CREATOR = new Parcelable.Creator<C3436i>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3436i[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3436i(parcel);
        }
    };

    /* renamed from: a */
    public final String f9281a;

    /* renamed from: b */
    public final byte[] f9282b;

    public C3436i(String str, byte[] bArr) {
        super("PRIV");
        this.f9281a = str;
        this.f9282b = bArr;
    }

    C3436i(Parcel parcel) {
        super("PRIV");
        this.f9281a = parcel.readString();
        this.f9282b = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3436i iVar = (C3436i) obj;
            return C3560t.m8885a((Object) this.f9281a, (Object) iVar.f9281a) && Arrays.equals(this.f9282b, iVar.f9282b);
        }
    }

    public final int hashCode() {
        String str = this.f9281a;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f9282b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9281a);
        parcel.writeByteArray(this.f9282b);
    }
}
