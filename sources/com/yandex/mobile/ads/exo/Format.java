package com.yandex.mobile.ads.exo;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.video.ColorInfo;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.j40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new C12168a();

    /* renamed from: A */
    public final int f29517A;

    /* renamed from: B */
    public final String f29518B;

    /* renamed from: C */
    public final int f29519C;

    /* renamed from: D */
    public final Class<? extends j40> f29520D;

    /* renamed from: E */
    private int f29521E;

    /* renamed from: b */
    public final String f29522b;

    /* renamed from: c */
    public final String f29523c;

    /* renamed from: d */
    public final int f29524d;

    /* renamed from: e */
    public final int f29525e;

    /* renamed from: f */
    public final int f29526f;

    /* renamed from: g */
    public final String f29527g;

    /* renamed from: h */
    public final Metadata f29528h;

    /* renamed from: i */
    public final String f29529i;

    /* renamed from: j */
    public final String f29530j;

    /* renamed from: k */
    public final int f29531k;

    /* renamed from: l */
    public final List<byte[]> f29532l;

    /* renamed from: m */
    public final DrmInitData f29533m;

    /* renamed from: n */
    public final long f29534n;

    /* renamed from: o */
    public final int f29535o;

    /* renamed from: p */
    public final int f29536p;

    /* renamed from: q */
    public final float f29537q;

    /* renamed from: r */
    public final int f29538r;

    /* renamed from: s */
    public final float f29539s;

    /* renamed from: t */
    public final int f29540t;

    /* renamed from: u */
    public final byte[] f29541u;

    /* renamed from: v */
    public final ColorInfo f29542v;

    /* renamed from: w */
    public final int f29543w;

    /* renamed from: x */
    public final int f29544x;

    /* renamed from: y */
    public final int f29545y;

    /* renamed from: z */
    public final int f29546z;

    /* renamed from: com.yandex.mobile.ads.exo.Format$a */
    class C12168a implements Parcelable.Creator<Format> {
        C12168a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        public Object[] newArray(int i) {
            return new Format[i];
        }
    }

    Format(String str, String str2, int i, int i2, int i3, String str3, Metadata metadata, String str4, String str5, int i4, List<byte[]> list, DrmInitData drmInitData, long j, int i5, int i6, float f, int i7, float f2, byte[] bArr, int i8, ColorInfo colorInfo, int i9, int i10, int i11, int i12, int i13, String str6, int i14, Class<? extends j40> cls) {
        this.f29522b = str;
        this.f29523c = str2;
        this.f29524d = i;
        this.f29525e = i2;
        this.f29526f = i3;
        this.f29527g = str3;
        this.f29528h = metadata;
        this.f29529i = str4;
        this.f29530j = str5;
        this.f29531k = i4;
        this.f29532l = list == null ? Collections.emptyList() : list;
        this.f29533m = drmInitData;
        this.f29534n = j;
        this.f29535o = i5;
        this.f29536p = i6;
        this.f29537q = f;
        int i15 = 0;
        int i16 = i7;
        this.f29538r = i16 == -1 ? 0 : i16;
        this.f29539s = f2 == -1.0f ? 1.0f : f2;
        this.f29541u = bArr;
        this.f29540t = i8;
        this.f29542v = colorInfo;
        this.f29543w = i9;
        this.f29544x = i10;
        this.f29545y = i11;
        int i17 = i12;
        this.f29546z = i17 == -1 ? 0 : i17;
        int i18 = i13;
        this.f29517A = i18 != -1 ? i18 : i15;
        this.f29518B = ih1.m37395d(str6);
        this.f29519C = i14;
        this.f29520D = cls;
    }

    /* renamed from: a */
    public static Format m31680a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData) {
        return m31681a(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (ColorInfo) null, (DrmInitData) null);
    }

    /* renamed from: b */
    public Format mo64773b(int i) {
        return new Format(this.f29522b, this.f29523c, this.f29524d, this.f29525e, this.f29526f, this.f29527g, this.f29528h, this.f29529i, this.f29530j, i, this.f29532l, this.f29533m, this.f29534n, this.f29535o, this.f29536p, this.f29537q, this.f29538r, this.f29539s, this.f29541u, this.f29540t, this.f29542v, this.f29543w, this.f29544x, this.f29545y, this.f29546z, this.f29517A, this.f29518B, this.f29519C, this.f29520D);
    }

    /* renamed from: c */
    public int mo64774c() {
        int i;
        int i2 = this.f29535o;
        if (i2 == -1 || (i = this.f29536p) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.f29521E;
        if ((i2 == 0 || (i = format.f29521E) == 0 || i2 == i) && this.f29524d == format.f29524d && this.f29525e == format.f29525e && this.f29526f == format.f29526f && this.f29531k == format.f29531k && this.f29534n == format.f29534n && this.f29535o == format.f29535o && this.f29536p == format.f29536p && this.f29538r == format.f29538r && this.f29540t == format.f29540t && this.f29543w == format.f29543w && this.f29544x == format.f29544x && this.f29545y == format.f29545y && this.f29546z == format.f29546z && this.f29517A == format.f29517A && this.f29519C == format.f29519C && Float.compare(this.f29537q, format.f29537q) == 0 && Float.compare(this.f29539s, format.f29539s) == 0 && ih1.m37382a((Object) this.f29520D, (Object) format.f29520D) && ih1.m37382a((Object) this.f29522b, (Object) format.f29522b) && ih1.m37382a((Object) this.f29523c, (Object) format.f29523c) && ih1.m37382a((Object) this.f29527g, (Object) format.f29527g) && ih1.m37382a((Object) this.f29529i, (Object) format.f29529i) && ih1.m37382a((Object) this.f29530j, (Object) format.f29530j) && ih1.m37382a((Object) this.f29518B, (Object) format.f29518B) && Arrays.equals(this.f29541u, format.f29541u) && ih1.m37382a((Object) this.f29528h, (Object) format.f29528h) && ih1.m37382a((Object) this.f29542v, (Object) format.f29542v) && ih1.m37382a((Object) this.f29533m, (Object) format.f29533m) && mo64772a(format)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f29521E == 0) {
            String str = this.f29522b;
            int i = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f29523c;
            int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f29524d) * 31) + this.f29525e) * 31) + this.f29526f) * 31;
            String str3 = this.f29527g;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Metadata metadata = this.f29528h;
            int hashCode4 = (hashCode3 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str4 = this.f29529i;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f29530j;
            int hashCode6 = (((((((((((((((((((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f29531k) * 31) + ((int) this.f29534n)) * 31) + this.f29535o) * 31) + this.f29536p) * 31) + Float.floatToIntBits(this.f29537q)) * 31) + this.f29538r) * 31) + Float.floatToIntBits(this.f29539s)) * 31) + this.f29540t) * 31) + this.f29543w) * 31) + this.f29544x) * 31) + this.f29545y) * 31) + this.f29546z) * 31) + this.f29517A) * 31;
            String str6 = this.f29518B;
            int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f29519C) * 31;
            Class<? extends j40> cls = this.f29520D;
            if (cls != null) {
                i = cls.hashCode();
            }
            this.f29521E = hashCode7 + i;
        }
        return this.f29521E;
    }

    public String toString() {
        return "Format(" + this.f29522b + ", " + this.f29523c + ", " + this.f29529i + ", " + this.f29530j + ", " + this.f29527g + ", " + this.f29526f + ", " + this.f29518B + ", [" + this.f29535o + ", " + this.f29536p + ", " + this.f29537q + "], [" + this.f29543w + ", " + this.f29544x + "])";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29522b);
        parcel.writeString(this.f29523c);
        parcel.writeInt(this.f29524d);
        parcel.writeInt(this.f29525e);
        parcel.writeInt(this.f29526f);
        parcel.writeString(this.f29527g);
        int i2 = 0;
        parcel.writeParcelable(this.f29528h, 0);
        parcel.writeString(this.f29529i);
        parcel.writeString(this.f29530j);
        parcel.writeInt(this.f29531k);
        int size = this.f29532l.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.f29532l.get(i3));
        }
        parcel.writeParcelable(this.f29533m, 0);
        parcel.writeLong(this.f29534n);
        parcel.writeInt(this.f29535o);
        parcel.writeInt(this.f29536p);
        parcel.writeFloat(this.f29537q);
        parcel.writeInt(this.f29538r);
        parcel.writeFloat(this.f29539s);
        if (this.f29541u != null) {
            i2 = 1;
        }
        int i4 = ih1.f34858a;
        parcel.writeInt(i2);
        byte[] bArr = this.f29541u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f29540t);
        parcel.writeParcelable(this.f29542v, i);
        parcel.writeInt(this.f29543w);
        parcel.writeInt(this.f29544x);
        parcel.writeInt(this.f29545y);
        parcel.writeInt(this.f29546z);
        parcel.writeInt(this.f29517A);
        parcel.writeString(this.f29518B);
        parcel.writeInt(this.f29519C);
    }

    /* renamed from: a */
    public static Format m31681a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, (String) null, 0, 0, i, str3, (Metadata) null, (String) null, str2, i2, list, drmInitData, Long.MAX_VALUE, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, (String) null, -1, (Class<? extends j40>) null);
    }

    /* renamed from: a */
    public static Format m31683a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData, int i6, String str4) {
        return m31682a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, (Metadata) null);
    }

    /* renamed from: a */
    public static Format m31682a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, DrmInitData drmInitData, int i8, String str4, Metadata metadata) {
        return new Format(str, (String) null, i8, 0, i, str3, metadata, (String) null, str2, i2, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, i3, i4, i5, i6, i7, str4, -1, (Class<? extends j40>) null);
    }

    /* renamed from: a */
    public static Format m31678a(String str, String str2, int i, String str3) {
        return m31684a((String) null, str2, (String) null, -1, i, (String) null, -1, (DrmInitData) null, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static Format m31684a(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, (String) null, i2, 0, i, (String) null, (Metadata) null, (String) null, str2, -1, list, drmInitData, j, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, str4, i3, (Class<? extends j40>) null);
    }

    /* renamed from: a */
    public static Format m31685a(String str, String str2, String str3, int i, int i2, List<byte[]> list, String str4, DrmInitData drmInitData) {
        return new Format(str, (String) null, i2, 0, i, (String) null, (Metadata) null, (String) null, str2, -1, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, str4, -1, (Class<? extends j40>) null);
    }

    /* renamed from: a */
    public static Format m31679a(String str, String str2, long j) {
        return new Format(str, (String) null, 0, 0, -1, (String) null, (Metadata) null, (String) null, str2, -1, (List<byte[]>) null, (DrmInitData) null, j, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, (String) null, -1, (Class<? extends j40>) null);
    }

    /* renamed from: a */
    public static Format m31686a(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        return new Format(str, (String) null, 0, 0, i, (String) null, (Metadata) null, (String) null, str2, -1, (List<byte[]>) null, (DrmInitData) null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, (String) null, -1, (Class<? extends j40>) null);
    }

    /* renamed from: a */
    public Format mo64769a(long j) {
        return new Format(this.f29522b, this.f29523c, this.f29524d, this.f29525e, this.f29526f, this.f29527g, this.f29528h, this.f29529i, this.f29530j, this.f29531k, this.f29532l, this.f29533m, j, this.f29535o, this.f29536p, this.f29537q, this.f29538r, this.f29539s, this.f29541u, this.f29540t, this.f29542v, this.f29543w, this.f29544x, this.f29545y, this.f29546z, this.f29517A, this.f29518B, this.f29519C, this.f29520D);
    }

    /* renamed from: a */
    public Format mo64768a(int i, int i2) {
        return new Format(this.f29522b, this.f29523c, this.f29524d, this.f29525e, this.f29526f, this.f29527g, this.f29528h, this.f29529i, this.f29530j, this.f29531k, this.f29532l, this.f29533m, this.f29534n, this.f29535o, this.f29536p, this.f29537q, this.f29538r, this.f29539s, this.f29541u, this.f29540t, this.f29542v, this.f29543w, this.f29544x, this.f29545y, i, i2, this.f29518B, this.f29519C, this.f29520D);
    }

    /* renamed from: a */
    public Format mo64766a(float f) {
        return new Format(this.f29522b, this.f29523c, this.f29524d, this.f29525e, this.f29526f, this.f29527g, this.f29528h, this.f29529i, this.f29530j, this.f29531k, this.f29532l, this.f29533m, this.f29534n, this.f29535o, this.f29536p, f, this.f29538r, this.f29539s, this.f29541u, this.f29540t, this.f29542v, this.f29543w, this.f29544x, this.f29545y, this.f29546z, this.f29517A, this.f29518B, this.f29519C, this.f29520D);
    }

    /* renamed from: a */
    public Format mo64770a(DrmInitData drmInitData, Metadata metadata) {
        if (drmInitData != this.f29533m) {
            Metadata metadata2 = metadata;
        } else if (metadata == this.f29528h) {
            return this;
        }
        return new Format(this.f29522b, this.f29523c, this.f29524d, this.f29525e, this.f29526f, this.f29527g, metadata, this.f29529i, this.f29530j, this.f29531k, this.f29532l, drmInitData, this.f29534n, this.f29535o, this.f29536p, this.f29537q, this.f29538r, this.f29539s, this.f29541u, this.f29540t, this.f29542v, this.f29543w, this.f29544x, this.f29545y, this.f29546z, this.f29517A, this.f29518B, this.f29519C, this.f29520D);
    }

    /* renamed from: a */
    public Format mo64767a(int i) {
        return new Format(this.f29522b, this.f29523c, this.f29524d, this.f29525e, i, this.f29527g, this.f29528h, this.f29529i, this.f29530j, this.f29531k, this.f29532l, this.f29533m, this.f29534n, this.f29535o, this.f29536p, this.f29537q, this.f29538r, this.f29539s, this.f29541u, this.f29540t, this.f29542v, this.f29543w, this.f29544x, this.f29545y, this.f29546z, this.f29517A, this.f29518B, this.f29519C, this.f29520D);
    }

    /* renamed from: a */
    public Format mo64771a(Class<? extends j40> cls) {
        return new Format(this.f29522b, this.f29523c, this.f29524d, this.f29525e, this.f29526f, this.f29527g, this.f29528h, this.f29529i, this.f29530j, this.f29531k, this.f29532l, this.f29533m, this.f29534n, this.f29535o, this.f29536p, this.f29537q, this.f29538r, this.f29539s, this.f29541u, this.f29540t, this.f29542v, this.f29543w, this.f29544x, this.f29545y, this.f29546z, this.f29517A, this.f29518B, this.f29519C, cls);
    }

    /* renamed from: a */
    public boolean mo64772a(Format format) {
        if (this.f29532l.size() != format.f29532l.size()) {
            return false;
        }
        for (int i = 0; i < this.f29532l.size(); i++) {
            if (!Arrays.equals(this.f29532l.get(i), format.f29532l.get(i))) {
                return false;
            }
        }
        return true;
    }

    Format(Parcel parcel) {
        this.f29522b = parcel.readString();
        this.f29523c = parcel.readString();
        this.f29524d = parcel.readInt();
        this.f29525e = parcel.readInt();
        this.f29526f = parcel.readInt();
        this.f29527g = parcel.readString();
        this.f29528h = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f29529i = parcel.readString();
        this.f29530j = parcel.readString();
        this.f29531k = parcel.readInt();
        int readInt = parcel.readInt();
        this.f29532l = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f29532l.add(parcel.createByteArray());
        }
        this.f29533m = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f29534n = parcel.readLong();
        this.f29535o = parcel.readInt();
        this.f29536p = parcel.readInt();
        this.f29537q = parcel.readFloat();
        this.f29538r = parcel.readInt();
        this.f29539s = parcel.readFloat();
        this.f29541u = ih1.m37381a(parcel) ? parcel.createByteArray() : null;
        this.f29540t = parcel.readInt();
        this.f29542v = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f29543w = parcel.readInt();
        this.f29544x = parcel.readInt();
        this.f29545y = parcel.readInt();
        this.f29546z = parcel.readInt();
        this.f29517A = parcel.readInt();
        this.f29518B = parcel.readString();
        this.f29519C = parcel.readInt();
        this.f29520D = null;
    }
}
