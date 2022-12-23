package com.yandex.mobile.ads.exo.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.security.CertificateUtil;
import com.yandex.mobile.ads.impl.ih1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new C12264a();

    /* renamed from: b */
    public final String f29992b;

    /* renamed from: c */
    public final String f29993c;

    /* renamed from: d */
    public final Uri f29994d;

    /* renamed from: e */
    public final List<StreamKey> f29995e;

    /* renamed from: f */
    public final String f29996f;

    /* renamed from: g */
    public final byte[] f29997g;

    /* renamed from: com.yandex.mobile.ads.exo.offline.DownloadRequest$a */
    class C12264a implements Parcelable.Creator<DownloadRequest> {
        C12264a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    DownloadRequest(Parcel parcel) {
        this.f29992b = (String) ih1.m37372a(parcel.readString());
        this.f29993c = (String) ih1.m37372a(parcel.readString());
        this.f29994d = Uri.parse((String) ih1.m37372a(parcel.readString()));
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f29995e = Collections.unmodifiableList(arrayList);
        this.f29996f = parcel.readString();
        this.f29997g = (byte[]) ih1.m37372a(parcel.createByteArray());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.f29992b.equals(downloadRequest.f29992b) || !this.f29993c.equals(downloadRequest.f29993c) || !this.f29994d.equals(downloadRequest.f29994d) || !this.f29995e.equals(downloadRequest.f29995e) || !ih1.m37382a((Object) this.f29996f, (Object) downloadRequest.f29996f) || !Arrays.equals(this.f29997g, downloadRequest.f29997g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f29993c.hashCode() * 31) + this.f29992b.hashCode()) * 31) + this.f29993c.hashCode()) * 31) + this.f29994d.hashCode()) * 31) + this.f29995e.hashCode()) * 31;
        String str = this.f29996f;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f29997g);
    }

    public String toString() {
        return this.f29993c + CertificateUtil.DELIMITER + this.f29992b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29992b);
        parcel.writeString(this.f29993c);
        parcel.writeString(this.f29994d.toString());
        parcel.writeInt(this.f29995e.size());
        for (int i2 = 0; i2 < this.f29995e.size(); i2++) {
            parcel.writeParcelable(this.f29995e.get(i2), 0);
        }
        parcel.writeString(this.f29996f);
        parcel.writeByteArray(this.f29997g);
    }
}
