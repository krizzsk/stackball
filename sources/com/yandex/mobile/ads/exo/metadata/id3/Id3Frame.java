package com.yandex.mobile.ads.exo.metadata.id3;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.metadata.Metadata;

public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: b */
    public final String f29924b;

    public Id3Frame(String str) {
        this.f29924b = str;
    }

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
        return this.f29924b;
    }
}
