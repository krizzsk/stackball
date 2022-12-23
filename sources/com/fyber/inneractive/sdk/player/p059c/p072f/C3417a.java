package com.fyber.inneractive.sdk.player.p059c.p072f;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.f.a */
public final class C3417a implements Parcelable {
    public static final Parcelable.Creator<C3417a> CREATOR = new Parcelable.Creator<C3417a>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3417a[0];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3417a(parcel);
        }
    };

    /* renamed from: a */
    public final C3419a[] f9251a;

    /* renamed from: com.fyber.inneractive.sdk.player.c.f.a$a */
    public interface C3419a extends Parcelable {
    }

    public final int describeContents() {
        return 0;
    }

    public C3417a(List<? extends C3419a> list) {
        C3419a[] aVarArr = new C3419a[list.size()];
        this.f9251a = aVarArr;
        list.toArray(aVarArr);
    }

    C3417a(Parcel parcel) {
        this.f9251a = new C3419a[parcel.readInt()];
        int i = 0;
        while (true) {
            C3419a[] aVarArr = this.f9251a;
            if (i < aVarArr.length) {
                aVarArr[i] = (C3419a) parcel.readParcelable(C3419a.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9251a, ((C3417a) obj).f9251a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9251a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9251a.length);
        for (C3419a writeParcelable : this.f9251a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
