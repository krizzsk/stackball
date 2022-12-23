package com.fyber.inneractive.sdk.player.p059c.p072f.p073a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a.f */
public final class C3430f extends C3435h {
    public static final Parcelable.Creator<C3430f> CREATOR = new Parcelable.Creator<C3430f>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3430f[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3430f(parcel);
        }
    };

    /* renamed from: a */
    public final String f9271a;

    /* renamed from: b */
    public final String f9272b;

    /* renamed from: c */
    public final String f9273c;

    /* renamed from: d */
    public final byte[] f9274d;

    public C3430f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f9271a = str;
        this.f9272b = str2;
        this.f9273c = str3;
        this.f9274d = bArr;
    }

    C3430f(Parcel parcel) {
        super("GEOB");
        this.f9271a = parcel.readString();
        this.f9272b = parcel.readString();
        this.f9273c = parcel.readString();
        this.f9274d = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3430f fVar = (C3430f) obj;
            return C3560t.m8885a((Object) this.f9271a, (Object) fVar.f9271a) && C3560t.m8885a((Object) this.f9272b, (Object) fVar.f9272b) && C3560t.m8885a((Object) this.f9273c, (Object) fVar.f9273c) && Arrays.equals(this.f9274d, fVar.f9274d);
        }
    }

    public final int hashCode() {
        String str = this.f9271a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f9272b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9273c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f9274d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9271a);
        parcel.writeString(this.f9272b);
        parcel.writeString(this.f9273c);
        parcel.writeByteArray(this.f9274d);
    }
}
