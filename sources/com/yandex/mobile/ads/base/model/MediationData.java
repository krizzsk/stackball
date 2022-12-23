package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.hn0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediationData implements Parcelable {
    public static final Parcelable.Creator<MediationData> CREATOR = new C12109a();

    /* renamed from: b */
    private final List<hn0> f29186b;

    /* renamed from: c */
    private final Map<String, String> f29187c;

    /* renamed from: com.yandex.mobile.ads.base.model.MediationData$a */
    class C12109a implements Parcelable.Creator<MediationData> {
        C12109a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new MediationData(parcel);
        }

        public Object[] newArray(int i) {
            return new MediationData[i];
        }
    }

    public MediationData(List<hn0> list, Map<String, String> map) {
        this.f29186b = list;
        this.f29187c = map;
    }

    /* renamed from: c */
    public List<hn0> mo64546c() {
        return this.f29186b;
    }

    /* renamed from: d */
    public Map<String, String> mo64547d() {
        return this.f29187c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f29186b);
        parcel.writeInt(this.f29187c.size());
        for (Map.Entry next : this.f29187c.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    protected MediationData(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f29186b = arrayList;
        parcel.readList(arrayList, hn0.class.getClassLoader());
        int readInt = parcel.readInt();
        this.f29187c = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f29187c.put(parcel.readString(), parcel.readString());
        }
    }
}
