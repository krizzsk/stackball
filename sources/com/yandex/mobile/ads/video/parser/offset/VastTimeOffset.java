package com.yandex.mobile.ads.video.parser.offset;

import android.os.Parcel;
import android.os.Parcelable;

public class VastTimeOffset implements Parcelable {
    public static final Parcelable.Creator<VastTimeOffset> CREATOR = new C15569a();

    /* renamed from: b */
    private final C15570b f44157b;

    /* renamed from: c */
    private final float f44158c;

    /* renamed from: com.yandex.mobile.ads.video.parser.offset.VastTimeOffset$a */
    class C15569a implements Parcelable.Creator<VastTimeOffset> {
        C15569a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new VastTimeOffset(parcel);
        }

        public Object[] newArray(int i) {
            return new VastTimeOffset[i];
        }
    }

    /* renamed from: com.yandex.mobile.ads.video.parser.offset.VastTimeOffset$b */
    public enum C15570b {
        MILLISECONDS,
        PERCENTS,
        POSITION
    }

    public VastTimeOffset(C15570b bVar, float f) {
        this.f44157b = bVar;
        this.f44158c = f;
    }

    /* renamed from: c */
    public C15570b mo71999c() {
        return this.f44157b;
    }

    /* renamed from: d */
    public float mo72000d() {
        return this.f44158c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C15570b bVar = this.f44157b;
        parcel.writeInt(bVar == null ? -1 : bVar.ordinal());
        parcel.writeFloat(this.f44158c);
    }

    protected VastTimeOffset(Parcel parcel) {
        C15570b bVar;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            bVar = null;
        } else {
            bVar = C15570b.values()[readInt];
        }
        this.f44157b = bVar;
        this.f44158c = parcel.readFloat();
    }
}
