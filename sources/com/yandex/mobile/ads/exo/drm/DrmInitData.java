package com.yandex.mobile.ads.exo.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.C12874dd;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C12180a();

    /* renamed from: b */
    private final SchemeData[] f29574b;

    /* renamed from: c */
    private int f29575c;

    /* renamed from: d */
    public final String f29576d;

    /* renamed from: e */
    public final int f29577e;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C12179a();

        /* renamed from: b */
        private int f29578b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final UUID f29579c;

        /* renamed from: d */
        public final String f29580d;

        /* renamed from: e */
        public final String f29581e;

        /* renamed from: f */
        public final byte[] f29582f;

        /* renamed from: com.yandex.mobile.ads.exo.drm.DrmInitData$SchemeData$a */
        class C12179a implements Parcelable.Creator<SchemeData> {
            C12179a() {
            }

            public Object createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            public Object[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f29579c = (UUID) C13479j9.m37703a(uuid);
            this.f29580d = null;
            this.f29581e = (String) C13479j9.m37703a(str2);
            this.f29582f = bArr;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!ih1.m37382a((Object) this.f29580d, (Object) schemeData.f29580d) || !ih1.m37382a((Object) this.f29581e, (Object) schemeData.f29581e) || !ih1.m37382a((Object) this.f29579c, (Object) schemeData.f29579c) || !Arrays.equals(this.f29582f, schemeData.f29582f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f29578b == 0) {
                int hashCode = this.f29579c.hashCode() * 31;
                String str = this.f29580d;
                this.f29578b = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f29581e.hashCode()) * 31) + Arrays.hashCode(this.f29582f);
            }
            return this.f29578b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f29579c.getMostSignificantBits());
            parcel.writeLong(this.f29579c.getLeastSignificantBits());
            parcel.writeString(this.f29580d);
            parcel.writeString(this.f29581e);
            parcel.writeByteArray(this.f29582f);
        }

        /* renamed from: a */
        public boolean mo64839a(UUID uuid) {
            return C12874dd.f32535a.equals(this.f29579c) || uuid.equals(this.f29579c);
        }

        SchemeData(Parcel parcel) {
            this.f29579c = new UUID(parcel.readLong(), parcel.readLong());
            this.f29580d = parcel.readString();
            this.f29581e = (String) ih1.m37372a(parcel.readString());
            this.f29582f = parcel.createByteArray();
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.DrmInitData$a */
    class C12180a implements Parcelable.Creator<DrmInitData> {
        C12180a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        public Object[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this((String) null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    /* renamed from: a */
    public SchemeData mo64832a(int i) {
        return this.f29574b[i];
    }

    public int compare(Object obj, Object obj2) {
        SchemeData schemeData = (SchemeData) obj;
        SchemeData schemeData2 = (SchemeData) obj2;
        UUID uuid = C12874dd.f32535a;
        if (uuid.equals(schemeData.f29579c)) {
            return uuid.equals(schemeData2.f29579c) ? 0 : 1;
        }
        return schemeData.f29579c.compareTo(schemeData2.f29579c);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (!ih1.m37382a((Object) this.f29576d, (Object) drmInitData.f29576d) || !Arrays.equals(this.f29574b, drmInitData.f29574b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f29575c == 0) {
            String str = this.f29576d;
            this.f29575c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f29574b);
        }
        return this.f29575c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29576d);
        parcel.writeTypedArray(this.f29574b, 0);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this((String) null, true, schemeDataArr);
    }

    /* renamed from: a */
    public DrmInitData mo64833a(String str) {
        if (ih1.m37382a((Object) this.f29576d, (Object) str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f29574b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.yandex.mobile.ads.exo.drm.DrmInitData$SchemeData[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private DrmInitData(java.lang.String r1, boolean r2, com.yandex.mobile.ads.exo.drm.DrmInitData.SchemeData... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f29576d = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.yandex.mobile.ads.exo.drm.DrmInitData$SchemeData[] r3 = (com.yandex.mobile.ads.exo.drm.DrmInitData.SchemeData[]) r3
        L_0x000e:
            r0.f29574b = r3
            int r1 = r3.length
            r0.f29577e = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.drm.DrmInitData.<init>(java.lang.String, boolean, com.yandex.mobile.ads.exo.drm.DrmInitData$SchemeData[]):void");
    }

    DrmInitData(Parcel parcel) {
        this.f29576d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) ih1.m37372a((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f29574b = schemeDataArr;
        this.f29577e = schemeDataArr.length;
    }
}
