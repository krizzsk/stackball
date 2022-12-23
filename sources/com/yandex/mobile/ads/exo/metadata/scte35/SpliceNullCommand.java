package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new C12254a();

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceNullCommand$a */
    class C12254a implements Parcelable.Creator<SpliceNullCommand> {
        C12254a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        public Object[] newArray(int i) {
            return new SpliceNullCommand[i];
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
