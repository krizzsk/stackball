package com.yandex.mobile.ads.exo.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;

public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new C12231a();

    /* renamed from: h */
    private static final Format f29872h = Format.m31679a((String) null, "application/id3", Long.MAX_VALUE);

    /* renamed from: i */
    private static final Format f29873i = Format.m31679a((String) null, "application/x-scte35", Long.MAX_VALUE);

    /* renamed from: b */
    public final String f29874b;

    /* renamed from: c */
    public final String f29875c;

    /* renamed from: d */
    public final long f29876d;

    /* renamed from: e */
    public final long f29877e;

    /* renamed from: f */
    public final byte[] f29878f;

    /* renamed from: g */
    private int f29879g;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.emsg.EventMessage$a */
    class C12231a implements Parcelable.Creator<EventMessage> {
        C12231a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        public Object[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f29874b = str;
        this.f29875c = str2;
        this.f29876d = j;
        this.f29877e = j2;
        this.f29878f = bArr;
    }

    /* renamed from: a */
    public byte[] mo64872a() {
        if (mo64873b() != null) {
            return this.f29878f;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.exo.Format mo64873b() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f29874b
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0031
            r2 = -795945609(0xffffffffd08ed577, float:-1.91708344E10)
            if (r1 == r2) goto L_0x0026
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0024
            goto L_0x0039
        L_0x0024:
            r0 = 2
            goto L_0x003c
        L_0x0026:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r0 = 1
            goto L_0x003c
        L_0x0031:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003b
        L_0x0039:
            r0 = -1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            if (r0 == 0) goto L_0x0047
            if (r0 == r4) goto L_0x0044
            if (r0 == r3) goto L_0x0044
            r0 = 0
            return r0
        L_0x0044:
            com.yandex.mobile.ads.exo.Format r0 = f29872h
            return r0
        L_0x0047:
            com.yandex.mobile.ads.exo.Format r0 = f29873i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.metadata.emsg.EventMessage.mo64873b():com.yandex.mobile.ads.exo.Format");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.f29876d != eventMessage.f29876d || this.f29877e != eventMessage.f29877e || !ih1.m37382a((Object) this.f29874b, (Object) eventMessage.f29874b) || !ih1.m37382a((Object) this.f29875c, (Object) eventMessage.f29875c) || !Arrays.equals(this.f29878f, eventMessage.f29878f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f29879g == 0) {
            String str = this.f29874b;
            int i = 0;
            int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f29875c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.f29876d;
            long j2 = this.f29877e;
            this.f29879g = ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f29878f);
        }
        return this.f29879g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f29874b + ", id=" + this.f29877e + ", durationMs=" + this.f29876d + ", value=" + this.f29875c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29874b);
        parcel.writeString(this.f29875c);
        parcel.writeLong(this.f29876d);
        parcel.writeLong(this.f29877e);
        parcel.writeByteArray(this.f29878f);
    }

    EventMessage(Parcel parcel) {
        this.f29874b = (String) ih1.m37372a(parcel.readString());
        this.f29875c = (String) ih1.m37372a(parcel.readString());
        this.f29876d = parcel.readLong();
        this.f29877e = parcel.readLong();
        this.f29878f = (byte[]) ih1.m37372a(parcel.createByteArray());
    }
}
