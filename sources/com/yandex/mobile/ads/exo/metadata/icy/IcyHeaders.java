package com.yandex.mobile.ads.exo.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.ih1;

public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new C12235a();

    /* renamed from: b */
    public final int f29892b;

    /* renamed from: c */
    public final String f29893c;

    /* renamed from: d */
    public final String f29894d;

    /* renamed from: e */
    public final String f29895e;

    /* renamed from: f */
    public final boolean f29896f;

    /* renamed from: g */
    public final int f29897g;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders$a */
    class C12235a implements Parcelable.Creator<IcyHeaders> {
        C12235a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        public Object[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        C13479j9.m37705a(i2 == -1 || i2 > 0);
        this.f29892b = i;
        this.f29893c = str;
        this.f29894d = str2;
        this.f29895e = str3;
        this.f29896f = z;
        this.f29897g = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders m32053a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r14.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0037 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0022
            r8 = r6
            r1 = 1
            goto L_0x0051
        L_0x0022:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0038 }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x0038 }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x0038 }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x0038 }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x0038 }
            android.util.Log.w(r2, r7)     // Catch:{ NumberFormatException -> 0x0038 }
            goto L_0x004f
        L_0x0037:
            r6 = -1
        L_0x0038:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            android.util.Log.w(r2, r1)
            r8 = r6
            r1 = 0
            goto L_0x0051
        L_0x004f:
            r1 = 0
            r8 = -1
        L_0x0051:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r14.get(r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
            if (r6 == 0) goto L_0x0065
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r9 = r7
        L_0x0066:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r14.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0079
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r10 = r7
        L_0x007a:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r14.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008d
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = 1
            goto L_0x008e
        L_0x008d:
            r11 = r7
        L_0x008e:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r14.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = 1
            goto L_0x00a8
        L_0x00a7:
            r12 = 0
        L_0x00a8:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r14 = r14.get(r6)
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x00e9
            java.lang.Object r14 = r14.get(r5)
            java.lang.String r14 = (java.lang.String) r14
            int r5 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x00d4 }
            if (r5 <= 0) goto L_0x00c0
            r13 = r5
            goto L_0x00eb
        L_0x00c0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d3 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00d3 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00d3 }
            r4.append(r14)     // Catch:{ NumberFormatException -> 0x00d3 }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00d3 }
            android.util.Log.w(r2, r4)     // Catch:{ NumberFormatException -> 0x00d3 }
            goto L_0x00e9
        L_0x00d3:
            r3 = r5
        L_0x00d4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            android.util.Log.w(r2, r14)
            r4 = r1
            r13 = r3
            goto L_0x00eb
        L_0x00e9:
            r4 = r1
            r13 = -1
        L_0x00eb:
            if (r4 == 0) goto L_0x00f3
            com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders r14 = new com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x00f3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders.m32053a(java.util.Map):com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders");
    }

    /* renamed from: a */
    public /* synthetic */ byte[] mo64872a() {
        return Metadata.Entry.CC.$default$a(this);
    }

    /* renamed from: b */
    public /* synthetic */ Format mo64873b() {
        return Metadata.Entry.CC.$default$b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.f29892b != icyHeaders.f29892b || !ih1.m37382a((Object) this.f29893c, (Object) icyHeaders.f29893c) || !ih1.m37382a((Object) this.f29894d, (Object) icyHeaders.f29894d) || !ih1.m37382a((Object) this.f29895e, (Object) icyHeaders.f29895e) || this.f29896f != icyHeaders.f29896f || this.f29897g != icyHeaders.f29897g) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = (this.f29892b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f29893c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29894d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29895e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f29896f ? 1 : 0)) * 31) + this.f29897g;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f29894d + "\", genre=\"" + this.f29893c + "\", bitrate=" + this.f29892b + ", metadataInterval=" + this.f29897g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29892b);
        parcel.writeString(this.f29893c);
        parcel.writeString(this.f29894d);
        parcel.writeString(this.f29895e);
        boolean z = this.f29896f;
        int i2 = ih1.f34858a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f29897g);
    }

    IcyHeaders(Parcel parcel) {
        this.f29892b = parcel.readInt();
        this.f29893c = parcel.readString();
        this.f29894d = parcel.readString();
        this.f29895e = parcel.readString();
        this.f29896f = ih1.m37381a(parcel);
        this.f29897g = parcel.readInt();
    }
}
