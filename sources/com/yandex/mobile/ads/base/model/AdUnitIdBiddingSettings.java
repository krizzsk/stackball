package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.hn0;
import java.util.ArrayList;
import java.util.List;

public class AdUnitIdBiddingSettings implements Parcelable {
    public static final Parcelable.Creator<AdUnitIdBiddingSettings> CREATOR = new C12107a();

    /* renamed from: b */
    private final String f29182b;

    /* renamed from: c */
    private final List<hn0> f29183c;

    /* renamed from: d */
    private final String f29184d;

    /* renamed from: com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings$a */
    class C12107a implements Parcelable.Creator<AdUnitIdBiddingSettings> {
        C12107a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new AdUnitIdBiddingSettings(parcel);
        }

        public Object[] newArray(int i) {
            return new AdUnitIdBiddingSettings[i];
        }
    }

    public AdUnitIdBiddingSettings(String str, List<hn0> list, String str2) {
        this.f29182b = str;
        this.f29183c = list;
        this.f29184d = str2;
    }

    /* renamed from: c */
    public String mo64530c() {
        return this.f29182b;
    }

    /* renamed from: d */
    public List<hn0> mo64531d() {
        return this.f29183c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo64533e() {
        return this.f29184d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdUnitIdBiddingSettings adUnitIdBiddingSettings = (AdUnitIdBiddingSettings) obj;
        if (!this.f29182b.equals(adUnitIdBiddingSettings.f29182b) || !this.f29183c.equals(adUnitIdBiddingSettings.f29183c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f29182b.hashCode() * 31) + this.f29183c.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f29183c);
        parcel.writeString(this.f29182b);
        parcel.writeString(this.f29184d);
    }

    protected AdUnitIdBiddingSettings(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f29183c = arrayList;
        parcel.readList(arrayList, hn0.class.getClassLoader());
        this.f29182b = parcel.readString();
        this.f29184d = parcel.readString();
    }
}
