package com.yandex.mobile.ads.video.models.p268ad;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.mobile.ads.video.models.ad.JavaScriptResource */
public final class JavaScriptResource implements Parcelable {
    public static final Parcelable.Creator<JavaScriptResource> CREATOR = new C15560a();

    /* renamed from: b */
    private final String f44111b;

    /* renamed from: c */
    private final String f44112c;

    /* renamed from: d */
    private final boolean f44113d;

    /* renamed from: com.yandex.mobile.ads.video.models.ad.JavaScriptResource$a */
    class C15560a implements Parcelable.Creator<JavaScriptResource> {
        C15560a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new JavaScriptResource(parcel, (C15560a) null);
        }

        public Object[] newArray(int i) {
            return new JavaScriptResource[i];
        }
    }

    /* synthetic */ JavaScriptResource(Parcel parcel, C15560a aVar) {
        this(parcel);
    }

    /* renamed from: c */
    public String mo71962c() {
        return this.f44111b;
    }

    /* renamed from: d */
    public String mo71963d() {
        return this.f44112c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JavaScriptResource.class != obj.getClass()) {
            return false;
        }
        JavaScriptResource javaScriptResource = (JavaScriptResource) obj;
        if (this.f44113d == javaScriptResource.f44113d && this.f44111b.equals(javaScriptResource.f44111b)) {
            return this.f44112c.equals(javaScriptResource.f44112c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f44111b.hashCode() * 31) + (this.f44113d ? 1 : 0)) * 31) + this.f44112c.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44111b);
        parcel.writeInt(this.f44113d ? 1 : 0);
        parcel.writeString(this.f44112c);
    }

    public JavaScriptResource(String str, String str2, boolean z) {
        this.f44111b = str;
        this.f44112c = str2;
        this.f44113d = z;
    }

    private JavaScriptResource(Parcel parcel) {
        this.f44111b = parcel.readString();
        this.f44113d = parcel.readInt() != 0;
        this.f44112c = parcel.readString();
    }
}
