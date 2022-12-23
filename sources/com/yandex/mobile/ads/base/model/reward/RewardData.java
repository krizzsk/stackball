package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;

public class RewardData implements Parcelable {
    public static final Parcelable.Creator<RewardData> CREATOR = new C12112a();

    /* renamed from: b */
    private final boolean f29193b;

    /* renamed from: c */
    private final ClientSideReward f29194c;

    /* renamed from: d */
    private final ServerSideReward f29195d;

    /* renamed from: com.yandex.mobile.ads.base.model.reward.RewardData$a */
    class C12112a implements Parcelable.Creator<RewardData> {
        C12112a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new RewardData(parcel);
        }

        public Object[] newArray(int i) {
            return new RewardData[i];
        }
    }

    /* renamed from: com.yandex.mobile.ads.base.model.reward.RewardData$b */
    public static class C12113b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f29196a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ClientSideReward f29197b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public ServerSideReward f29198c;

        /* renamed from: a */
        public RewardData mo64568a() {
            return new RewardData(this, (C12112a) null);
        }

        /* renamed from: a */
        public C12113b mo64567a(boolean z) {
            this.f29196a = z;
            return this;
        }

        /* renamed from: a */
        public C12113b mo64565a(ClientSideReward clientSideReward) {
            this.f29197b = clientSideReward;
            return this;
        }

        /* renamed from: a */
        public C12113b mo64566a(ServerSideReward serverSideReward) {
            this.f29198c = serverSideReward;
            return this;
        }
    }

    /* synthetic */ RewardData(C12113b bVar, C12112a aVar) {
        this(bVar);
    }

    /* renamed from: c */
    public ClientSideReward mo64558c() {
        return this.f29194c;
    }

    /* renamed from: d */
    public ServerSideReward mo64559d() {
        return this.f29195d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo64561e() {
        return this.f29193b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f29193b ? (byte) 1 : 0);
        parcel.writeParcelable(this.f29194c, i);
        parcel.writeParcelable(this.f29195d, i);
    }

    private RewardData(C12113b bVar) {
        this.f29194c = bVar.f29197b;
        this.f29195d = bVar.f29198c;
        this.f29193b = bVar.f29196a;
    }

    protected RewardData(Parcel parcel) {
        this.f29193b = parcel.readByte() != 0;
        this.f29194c = (ClientSideReward) parcel.readParcelable(ClientSideReward.class.getClassLoader());
        this.f29195d = (ServerSideReward) parcel.readParcelable(ServerSideReward.class.getClassLoader());
    }
}
