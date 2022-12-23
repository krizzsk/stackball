package com.yandex.mobile.ads.common;

import android.os.Parcel;
import android.os.Parcelable;

public class AdImpressionData implements ImpressionData, Parcelable {
    public static final Parcelable.Creator<AdImpressionData> CREATOR = new C12137a();

    /* renamed from: b */
    private final String f29422b;

    /* renamed from: com.yandex.mobile.ads.common.AdImpressionData$a */
    class C12137a implements Parcelable.Creator<AdImpressionData> {
        C12137a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new AdImpressionData(parcel);
        }

        public Object[] newArray(int i) {
            return new AdImpressionData[i];
        }
    }

    public AdImpressionData(String str) {
        this.f29422b = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f29422b.equals(((AdImpressionData) obj).f29422b);
    }

    public String getRawData() {
        return this.f29422b;
    }

    public int hashCode() {
        return this.f29422b.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29422b);
    }

    protected AdImpressionData(Parcel parcel) {
        this.f29422b = parcel.readString();
    }
}
