package com.fyber.inneractive.sdk.player.p059c;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p072f.C3417a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.fyber.inneractive.sdk.player.p059c.p081l.C3563b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.h */
public final class C3290h implements Parcelable {
    public static final Parcelable.Creator<C3290h> CREATOR = new Parcelable.Creator<C3290h>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3290h[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3290h(parcel);
        }
    };

    /* renamed from: A */
    private int f8487A;

    /* renamed from: a */
    public final String f8488a;

    /* renamed from: b */
    public final int f8489b;

    /* renamed from: c */
    public final String f8490c;

    /* renamed from: d */
    public final C3417a f8491d;

    /* renamed from: e */
    public final String f8492e;

    /* renamed from: f */
    public final String f8493f;

    /* renamed from: g */
    public final int f8494g;

    /* renamed from: h */
    public final List<byte[]> f8495h;

    /* renamed from: i */
    public final C3227a f8496i;

    /* renamed from: j */
    public final int f8497j;

    /* renamed from: k */
    public final int f8498k;

    /* renamed from: l */
    public final float f8499l;

    /* renamed from: m */
    public final int f8500m;

    /* renamed from: n */
    public final float f8501n;

    /* renamed from: o */
    public final int f8502o;

    /* renamed from: p */
    public final byte[] f8503p;

    /* renamed from: q */
    public final C3563b f8504q;

    /* renamed from: r */
    public final int f8505r;

    /* renamed from: s */
    public final int f8506s;

    /* renamed from: t */
    public final int f8507t;

    /* renamed from: u */
    public final int f8508u;

    /* renamed from: v */
    public final int f8509v;

    /* renamed from: w */
    public final long f8510w;

    /* renamed from: x */
    public final int f8511x;

    /* renamed from: y */
    public final String f8512y;

    /* renamed from: z */
    public final int f8513z;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static C3290h m8117a(String str, String str2, int i, int i2, List<byte[]> list, float f) {
        return m8116a(str, str2, -1, i, i2, list, -1, f, (byte[]) null, -1, (C3563b) null, (C3227a) null);
    }

    /* renamed from: a */
    public static C3290h m8116a(String str, String str2, int i, int i2, int i3, List<byte[]> list, int i4, float f, byte[] bArr, int i5, C3563b bVar, C3227a aVar) {
        return new C3290h(str, (String) null, str2, (String) null, -1, i, i2, i3, -1.0f, i4, f, bArr, i5, bVar, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, aVar, (C3417a) null);
    }

    /* renamed from: a */
    public static C3290h m8115a(String str, String str2, int i, int i2, int i3, int i4, List<byte[]> list, C3227a aVar, String str3) {
        return m8114a(str, str2, i, i2, i3, i4, -1, list, aVar, 0, str3);
    }

    /* renamed from: a */
    public static C3290h m8114a(String str, String str2, int i, int i2, int i3, int i4, int i5, List<byte[]> list, C3227a aVar, int i6, String str3) {
        return m8113a(str, str2, i, i2, i3, i4, i5, -1, -1, list, aVar, i6, str3, (C3417a) null);
    }

    /* renamed from: a */
    public static C3290h m8113a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, C3227a aVar, int i8, String str3, C3417a aVar2) {
        return new C3290h(str, (String) null, str2, (String) null, i, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3563b) null, i3, i4, i5, i6, i7, i8, str3, -1, Long.MAX_VALUE, list, aVar, aVar2);
    }

    /* renamed from: a */
    public static C3290h m8120a(String str, String str2, int i, String str3, C3227a aVar) {
        return m8119a(str, str2, i, str3, -1, aVar, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static C3290h m8118a(String str, String str2, int i, String str3, int i2) {
        return m8119a(str, str2, i, str3, i2, (C3227a) null, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static C3290h m8119a(String str, String str2, int i, String str3, int i2, C3227a aVar, long j, List<byte[]> list) {
        return new C3290h(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3563b) null, -1, -1, -1, -1, -1, i, str3, i2, j, list, aVar, (C3417a) null);
    }

    /* renamed from: a */
    public static C3290h m8122a(String str, String str2, List<byte[]> list, String str3, C3227a aVar) {
        return new C3290h(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3563b) null, -1, -1, -1, -1, -1, 0, str3, -1, Long.MAX_VALUE, list, aVar, (C3417a) null);
    }

    /* renamed from: a */
    public static C3290h m8112a(String str, long j) {
        return new C3290h((String) null, (String) null, str, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3563b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, j, (List<byte[]>) null, (C3227a) null, (C3417a) null);
    }

    /* renamed from: a */
    public static C3290h m8121a(String str, String str2, C3227a aVar) {
        return new C3290h(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3563b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, aVar, (C3417a) null);
    }

    public C3290h(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C3563b bVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, C3227a aVar, C3417a aVar2) {
        this.f8488a = str;
        this.f8492e = str2;
        this.f8493f = str3;
        this.f8490c = str4;
        this.f8489b = i;
        this.f8494g = i2;
        this.f8497j = i3;
        this.f8498k = i4;
        this.f8499l = f;
        this.f8500m = i5;
        this.f8501n = f2;
        this.f8503p = bArr;
        this.f8502o = i6;
        this.f8504q = bVar;
        this.f8505r = i7;
        this.f8506s = i8;
        this.f8507t = i9;
        this.f8508u = i10;
        this.f8509v = i11;
        this.f8511x = i12;
        this.f8512y = str5;
        this.f8513z = i13;
        this.f8510w = j;
        this.f8495h = list == null ? Collections.emptyList() : list;
        this.f8496i = aVar;
        this.f8491d = aVar2;
    }

    C3290h(Parcel parcel) {
        this.f8488a = parcel.readString();
        this.f8492e = parcel.readString();
        this.f8493f = parcel.readString();
        this.f8490c = parcel.readString();
        this.f8489b = parcel.readInt();
        this.f8494g = parcel.readInt();
        this.f8497j = parcel.readInt();
        this.f8498k = parcel.readInt();
        this.f8499l = parcel.readFloat();
        this.f8500m = parcel.readInt();
        this.f8501n = parcel.readFloat();
        this.f8503p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f8502o = parcel.readInt();
        this.f8504q = (C3563b) parcel.readParcelable(C3563b.class.getClassLoader());
        this.f8505r = parcel.readInt();
        this.f8506s = parcel.readInt();
        this.f8507t = parcel.readInt();
        this.f8508u = parcel.readInt();
        this.f8509v = parcel.readInt();
        this.f8511x = parcel.readInt();
        this.f8512y = parcel.readString();
        this.f8513z = parcel.readInt();
        this.f8510w = parcel.readLong();
        int readInt = parcel.readInt();
        this.f8495h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f8495h.add(parcel.createByteArray());
        }
        this.f8496i = (C3227a) parcel.readParcelable(C3227a.class.getClassLoader());
        this.f8491d = (C3417a) parcel.readParcelable(C3417a.class.getClassLoader());
    }

    /* renamed from: a */
    public final C3290h mo19088a(long j) {
        return new C3290h(this.f8488a, this.f8492e, this.f8493f, this.f8490c, this.f8489b, this.f8494g, this.f8497j, this.f8498k, this.f8499l, this.f8500m, this.f8501n, this.f8503p, this.f8502o, this.f8504q, this.f8505r, this.f8506s, this.f8507t, this.f8508u, this.f8509v, this.f8511x, this.f8512y, this.f8513z, j, this.f8495h, this.f8496i, this.f8491d);
    }

    /* renamed from: a */
    public final int mo19087a() {
        int i;
        int i2 = this.f8497j;
        if (i2 == -1 || (i = this.f8498k) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: b */
    public final MediaFormat mo19089b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f8493f);
        String str = this.f8512y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m8123a(mediaFormat, "max-input-size", this.f8494g);
        m8123a(mediaFormat, "width", this.f8497j);
        m8123a(mediaFormat, "height", this.f8498k);
        float f = this.f8499l;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m8123a(mediaFormat, "rotation-degrees", this.f8500m);
        m8123a(mediaFormat, "channel-count", this.f8505r);
        m8123a(mediaFormat, "sample-rate", this.f8506s);
        m8123a(mediaFormat, "encoder-delay", this.f8508u);
        m8123a(mediaFormat, "encoder-padding", this.f8509v);
        for (int i = 0; i < this.f8495h.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(this.f8495h.get(i)));
        }
        C3563b bVar = this.f8504q;
        if (bVar != null) {
            m8123a(mediaFormat, "color-transfer", bVar.f9672c);
            m8123a(mediaFormat, "color-standard", bVar.f9670a);
            m8123a(mediaFormat, "color-range", bVar.f9671b);
            byte[] bArr = bVar.f9673d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        return "Format(" + this.f8488a + ", " + this.f8492e + ", " + this.f8493f + ", " + this.f8489b + ", " + this.f8512y + ", [" + this.f8497j + ", " + this.f8498k + ", " + this.f8499l + "], [" + this.f8505r + ", " + this.f8506s + "])";
    }

    public final int hashCode() {
        if (this.f8487A == 0) {
            String str = this.f8488a;
            int i = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f8492e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f8493f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f8490c;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f8489b) * 31) + this.f8497j) * 31) + this.f8498k) * 31) + this.f8505r) * 31) + this.f8506s) * 31;
            String str5 = this.f8512y;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f8513z) * 31;
            C3227a aVar = this.f8496i;
            int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C3417a aVar2 = this.f8491d;
            if (aVar2 != null) {
                i = aVar2.hashCode();
            }
            this.f8487A = hashCode6 + i;
        }
        return this.f8487A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3290h hVar = (C3290h) obj;
            if (this.f8489b == hVar.f8489b && this.f8494g == hVar.f8494g && this.f8497j == hVar.f8497j && this.f8498k == hVar.f8498k && this.f8499l == hVar.f8499l && this.f8500m == hVar.f8500m && this.f8501n == hVar.f8501n && this.f8502o == hVar.f8502o && this.f8505r == hVar.f8505r && this.f8506s == hVar.f8506s && this.f8507t == hVar.f8507t && this.f8508u == hVar.f8508u && this.f8509v == hVar.f8509v && this.f8510w == hVar.f8510w && this.f8511x == hVar.f8511x && C3560t.m8885a((Object) this.f8488a, (Object) hVar.f8488a) && C3560t.m8885a((Object) this.f8512y, (Object) hVar.f8512y) && this.f8513z == hVar.f8513z && C3560t.m8885a((Object) this.f8492e, (Object) hVar.f8492e) && C3560t.m8885a((Object) this.f8493f, (Object) hVar.f8493f) && C3560t.m8885a((Object) this.f8490c, (Object) hVar.f8490c) && C3560t.m8885a((Object) this.f8496i, (Object) hVar.f8496i) && C3560t.m8885a((Object) this.f8491d, (Object) hVar.f8491d) && C3560t.m8885a((Object) this.f8504q, (Object) hVar.f8504q) && Arrays.equals(this.f8503p, hVar.f8503p) && this.f8495h.size() == hVar.f8495h.size()) {
                for (int i = 0; i < this.f8495h.size(); i++) {
                    if (!Arrays.equals(this.f8495h.get(i), hVar.f8495h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m8123a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8488a);
        parcel.writeString(this.f8492e);
        parcel.writeString(this.f8493f);
        parcel.writeString(this.f8490c);
        parcel.writeInt(this.f8489b);
        parcel.writeInt(this.f8494g);
        parcel.writeInt(this.f8497j);
        parcel.writeInt(this.f8498k);
        parcel.writeFloat(this.f8499l);
        parcel.writeInt(this.f8500m);
        parcel.writeFloat(this.f8501n);
        parcel.writeInt(this.f8503p != null ? 1 : 0);
        byte[] bArr = this.f8503p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f8502o);
        parcel.writeParcelable(this.f8504q, i);
        parcel.writeInt(this.f8505r);
        parcel.writeInt(this.f8506s);
        parcel.writeInt(this.f8507t);
        parcel.writeInt(this.f8508u);
        parcel.writeInt(this.f8509v);
        parcel.writeInt(this.f8511x);
        parcel.writeString(this.f8512y);
        parcel.writeInt(this.f8513z);
        parcel.writeLong(this.f8510w);
        int size = this.f8495h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f8495h.get(i2));
        }
        parcel.writeParcelable(this.f8496i, 0);
        parcel.writeParcelable(this.f8491d, 0);
    }
}
