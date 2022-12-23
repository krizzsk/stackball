package com.fyber.inneractive.sdk.player.p059c.p072f.p073a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a.e */
public final class C3428e extends C3435h {
    public static final Parcelable.Creator<C3428e> CREATOR = new Parcelable.Creator<C3428e>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3428e[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3428e(parcel);
        }
    };

    /* renamed from: a */
    public final String f9268a;

    /* renamed from: b */
    public final String f9269b;

    /* renamed from: c */
    public final String f9270c;

    public C3428e(String str, String str2, String str3) {
        super("COMM");
        this.f9268a = str;
        this.f9269b = str2;
        this.f9270c = str3;
    }

    C3428e(Parcel parcel) {
        super("COMM");
        this.f9268a = parcel.readString();
        this.f9269b = parcel.readString();
        this.f9270c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3428e eVar = (C3428e) obj;
            return C3560t.m8885a((Object) this.f9269b, (Object) eVar.f9269b) && C3560t.m8885a((Object) this.f9268a, (Object) eVar.f9268a) && C3560t.m8885a((Object) this.f9270c, (Object) eVar.f9270c);
        }
    }

    public final int hashCode() {
        String str = this.f9268a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f9269b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9270c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9280f);
        parcel.writeString(this.f9268a);
        parcel.writeString(this.f9270c);
    }
}
