package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class BiddingSettings implements Parcelable {
    public static final Parcelable.Creator<BiddingSettings> CREATOR = new C12108a();

    /* renamed from: b */
    private final List<AdUnitIdBiddingSettings> f29185b;

    /* renamed from: com.yandex.mobile.ads.base.model.BiddingSettings$a */
    class C12108a implements Parcelable.Creator<BiddingSettings> {
        C12108a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new BiddingSettings(parcel);
        }

        public Object[] newArray(int i) {
            return new BiddingSettings[i];
        }
    }

    public BiddingSettings(List<AdUnitIdBiddingSettings> list) {
        this.f29185b = list;
    }

    /* renamed from: c */
    public List<AdUnitIdBiddingSettings> mo64539c() {
        return this.f29185b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f29185b.equals(((BiddingSettings) obj).f29185b);
    }

    public int hashCode() {
        return this.f29185b.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f29185b);
    }

    protected BiddingSettings(Parcel parcel) {
        this.f29185b = parcel.createTypedArrayList(AdUnitIdBiddingSettings.CREATOR);
    }
}
