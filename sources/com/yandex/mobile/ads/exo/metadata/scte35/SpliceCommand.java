package com.yandex.mobile.ads.exo.metadata.scte35;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.metadata.Metadata;

public abstract class SpliceCommand implements Metadata.Entry {
    /* renamed from: a */
    public /* synthetic */ byte[] mo64872a() {
        return Metadata.Entry.CC.$default$a(this);
    }

    /* renamed from: b */
    public /* synthetic */ Format mo64873b() {
        return Metadata.Entry.CC.$default$b(this);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
