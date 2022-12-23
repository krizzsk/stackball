package com.yandex.mobile.ads.video.parser.vmap.configurator;

import android.os.Parcel;
import android.os.Parcelable;

public class AdBreakParameters implements Parcelable {
    public static final Parcelable.Creator<AdBreakParameters> CREATOR = new C15573a();

    /* renamed from: b */
    private final String f44173b;

    /* renamed from: c */
    private final String f44174c;

    /* renamed from: d */
    private final String f44175d;

    /* renamed from: com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters$a */
    class C15573a implements Parcelable.Creator<AdBreakParameters> {
        C15573a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new AdBreakParameters(parcel);
        }

        public Object[] newArray(int i) {
            return new AdBreakParameters[i];
        }
    }

    /* renamed from: com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters$b */
    public static class C15574b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f44176a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f44177b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f44178c;

        /* renamed from: a */
        public C15574b mo72013a(String str) {
            this.f44177b = str;
            return this;
        }

        /* renamed from: b */
        public C15574b mo72014b(String str) {
            this.f44176a = str;
            return this;
        }

        /* renamed from: c */
        public C15574b mo72015c(String str) {
            this.f44178c = str;
            return this;
        }
    }

    /* synthetic */ AdBreakParameters(C15574b bVar, C15573a aVar) {
        this(bVar);
    }

    /* renamed from: c */
    public String mo72006c() {
        return this.f44174c;
    }

    /* renamed from: d */
    public String mo72007d() {
        return this.f44173b;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo72009e() {
        return this.f44175d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44173b);
        parcel.writeString(this.f44174c);
        parcel.writeString(this.f44175d);
    }

    private AdBreakParameters(C15574b bVar) {
        this.f44173b = bVar.f44176a;
        this.f44174c = bVar.f44177b;
        this.f44175d = bVar.f44178c;
    }

    protected AdBreakParameters(Parcel parcel) {
        this.f44173b = parcel.readString();
        this.f44174c = parcel.readString();
        this.f44175d = parcel.readString();
    }
}
