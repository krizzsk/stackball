package com.fyber.inneractive.sdk.player.p059c.p072f.p073a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a.j */
public final class C3438j extends C3435h {
    public static final Parcelable.Creator<C3438j> CREATOR = new Parcelable.Creator<C3438j>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3438j[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3438j(parcel);
        }
    };

    /* renamed from: a */
    public final String f9283a;

    /* renamed from: b */
    public final String f9284b;

    public C3438j(String str, String str2, String str3) {
        super(str);
        this.f9283a = str2;
        this.f9284b = str3;
    }

    C3438j(Parcel parcel) {
        super(parcel.readString());
        this.f9283a = parcel.readString();
        this.f9284b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3438j jVar = (C3438j) obj;
            return this.f9280f.equals(jVar.f9280f) && C3560t.m8885a((Object) this.f9283a, (Object) jVar.f9283a) && C3560t.m8885a((Object) this.f9284b, (Object) jVar.f9284b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f9280f.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f9283a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9284b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9280f);
        parcel.writeString(this.f9283a);
        parcel.writeString(this.f9284b);
    }
}
