package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;

public class ClientSideReward implements Parcelable {
    public static final Parcelable.Creator<ClientSideReward> CREATOR = new C12111a();

    /* renamed from: b */
    private final int f29191b;

    /* renamed from: c */
    private final String f29192c;

    /* renamed from: com.yandex.mobile.ads.base.model.reward.ClientSideReward$a */
    class C12111a implements Parcelable.Creator<ClientSideReward> {
        C12111a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new ClientSideReward(parcel);
        }

        public Object[] newArray(int i) {
            return new ClientSideReward[i];
        }
    }

    public ClientSideReward(int i, String str) {
        this.f29191b = i;
        this.f29192c = str;
    }

    /* renamed from: c */
    public int mo64552c() {
        return this.f29191b;
    }

    /* renamed from: d */
    public String mo64553d() {
        return this.f29192c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29191b);
        parcel.writeString(this.f29192c);
    }

    protected ClientSideReward(Parcel parcel) {
        this.f29191b = parcel.readInt();
        this.f29192c = parcel.readString();
    }
}
