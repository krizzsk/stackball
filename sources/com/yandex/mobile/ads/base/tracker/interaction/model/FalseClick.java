package com.yandex.mobile.ads.base.tracker.interaction.model;

import android.os.Parcel;
import android.os.Parcelable;

public class FalseClick implements Parcelable {
    public static final Parcelable.Creator<FalseClick> CREATOR = new C12128a();

    /* renamed from: b */
    private final String f29382b;

    /* renamed from: c */
    private final long f29383c;

    /* renamed from: com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick$a */
    class C12128a implements Parcelable.Creator<FalseClick> {
        C12128a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new FalseClick(parcel);
        }

        public Object[] newArray(int i) {
            return new FalseClick[i];
        }
    }

    public FalseClick(String str, long j) {
        this.f29382b = str;
        this.f29383c = j;
    }

    /* renamed from: c */
    public long mo64661c() {
        return this.f29383c;
    }

    /* renamed from: d */
    public String mo64662d() {
        return this.f29382b;
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
        FalseClick falseClick = (FalseClick) obj;
        if (this.f29383c != falseClick.f29383c) {
            return false;
        }
        return this.f29382b.equals(falseClick.f29382b);
    }

    public int hashCode() {
        long j = this.f29383c;
        return (this.f29382b.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29382b);
        parcel.writeLong(this.f29383c);
    }

    public FalseClick(Parcel parcel) {
        this.f29382b = parcel.readString();
        this.f29383c = parcel.readLong();
    }
}
