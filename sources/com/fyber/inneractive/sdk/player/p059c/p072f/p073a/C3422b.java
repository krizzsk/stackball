package com.fyber.inneractive.sdk.player.p059c.p072f.p073a;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a.b */
public final class C3422b extends C3435h {
    public static final Parcelable.Creator<C3422b> CREATOR = new Parcelable.Creator<C3422b>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3422b[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3422b(parcel);
        }
    };

    /* renamed from: a */
    public final byte[] f9256a;

    public C3422b(String str, byte[] bArr) {
        super(str);
        this.f9256a = bArr;
    }

    C3422b(Parcel parcel) {
        super(parcel.readString());
        this.f9256a = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3422b bVar = (C3422b) obj;
            return this.f9280f.equals(bVar.f9280f) && Arrays.equals(this.f9256a, bVar.f9256a);
        }
    }

    public final int hashCode() {
        return ((this.f9280f.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f9256a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9280f);
        parcel.writeByteArray(this.f9256a);
    }
}
