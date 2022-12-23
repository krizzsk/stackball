package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;

public class ServerSideReward implements Parcelable {
    public static final Parcelable.Creator<ServerSideReward> CREATOR = new C12114a();

    /* renamed from: b */
    private final String f29199b;

    /* renamed from: com.yandex.mobile.ads.base.model.reward.ServerSideReward$a */
    class C12114a implements Parcelable.Creator<ServerSideReward> {
        C12114a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new ServerSideReward(parcel);
        }

        public Object[] newArray(int i) {
            return new ServerSideReward[i];
        }
    }

    public ServerSideReward(String str) {
        this.f29199b = str;
    }

    /* renamed from: c */
    public String mo64569c() {
        return this.f29199b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29199b);
    }

    protected ServerSideReward(Parcel parcel) {
        this.f29199b = parcel.readString();
    }
}
