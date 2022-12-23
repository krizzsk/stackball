package com.fyber.inneractive.sdk.player.p059c.p072f.p073a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a.k */
public final class C3440k extends C3435h {
    public static final Parcelable.Creator<C3440k> CREATOR = new Parcelable.Creator<C3440k>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3440k[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3440k(parcel);
        }
    };

    /* renamed from: a */
    public final String f9285a;

    /* renamed from: b */
    public final String f9286b;

    public C3440k(String str, String str2, String str3) {
        super(str);
        this.f9285a = str2;
        this.f9286b = str3;
    }

    C3440k(Parcel parcel) {
        super(parcel.readString());
        this.f9285a = parcel.readString();
        this.f9286b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3440k kVar = (C3440k) obj;
            return this.f9280f.equals(kVar.f9280f) && C3560t.m8885a((Object) this.f9285a, (Object) kVar.f9285a) && C3560t.m8885a((Object) this.f9286b, (Object) kVar.f9286b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f9280f.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f9285a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9286b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9280f);
        parcel.writeString(this.f9285a);
        parcel.writeString(this.f9286b);
    }
}
