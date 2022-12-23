package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.bl */
public class C2414bl {

    /* renamed from: b */
    private static final String f5585b = C2414bl.class.getSimpleName();

    /* renamed from: a */
    byte[] f5586a;

    /* synthetic */ C2414bl(byte b) {
        this();
    }

    private C2414bl() {
    }

    public C2414bl(byte[] bArr) {
        this.f5586a = bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:89|90|125) */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        com.flurry.sdk.C2530db.m5474a(6, f5585b, "Error encoding purchase receipt.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0289 */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0197 A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019b A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ab A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01af A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01e3 A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e7 A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x020f A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x023e A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x024a A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }, LOOP:5: B:80:0x0248->B:81:0x024a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x027a A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02a3 A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02a7 A[Catch:{ IOException -> 0x02f0, all -> 0x02ed }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2414bl(com.flurry.sdk.C2418bm r13) throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r0 = ""
            r12.<init>()
            r1 = 6
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x02f5 }
            r3.<init>()     // Catch:{ IOException -> 0x02f5 }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x02f5 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x02f5 }
            r2 = 14
            r4.writeShort(r2)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r2 = r13.f5590a     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r2)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r0)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r2 = "11050000"
            r4.writeUTF(r2)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            long r5 = r13.f5591b     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeLong(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            long r5 = r13.f5592c     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeLong(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            long r5 = r13.f5593d     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeLong(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r2 = 1
            r4.writeBoolean(r2)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            byte r5 = r13.f5607r     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeByte(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            boolean r5 = r13.f5608s     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeBoolean(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r5 = r13.f5595f     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r6 = 0
            if (r5 != 0) goto L_0x0052
            r4.writeBoolean(r2)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r5 = r13.f5595f     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x0055
        L_0x0052:
            r4.writeBoolean(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x0055:
            java.lang.String r5 = r13.f5596g     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r5 != 0) goto L_0x0066
            r4.writeBoolean(r2)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r5 = r13.f5596g     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x0069
        L_0x0066:
            r4.writeBoolean(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x0069:
            java.util.Map<java.lang.String, java.lang.String> r5 = r13.f5597h     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r5 != 0) goto L_0x0071
            r4.writeShort(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x009f
        L_0x0071:
            int r7 = r5.size()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x0080:
            boolean r7 = r5.hasNext()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r7 == 0) goto L_0x009f
            java.lang.Object r7 = r5.next()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.Object r8 = r7.getKey()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r8)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.Object r7 = r7.getValue()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x0080
        L_0x009f:
            java.util.Map<java.lang.String, java.lang.String> r5 = r13.f5594e     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r5 != 0) goto L_0x00a7
            r4.writeShort(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x00d8
        L_0x00a7:
            int r7 = r5.size()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x00b6:
            boolean r7 = r5.hasNext()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r7 == 0) goto L_0x00d8
            java.lang.Object r7 = r5.next()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.Object r8 = r7.getKey()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r8)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.Object r7 = r7.getValue()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeByte(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x00b6
        L_0x00d8:
            java.lang.String r5 = r13.f5598i     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r5 = r13.f5599j     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r5 = r13.f5600k     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeByte(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r5 = r13.f5601l     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeByte(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r5 = r13.f5602m     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            android.location.Location r5 = r13.f5603n     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r7 = -1
            if (r5 != 0) goto L_0x00f8
            goto L_0x017a
        L_0x00f8:
            int r5 = com.flurry.sdk.C2464bw.m5309c()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeBoolean(r2)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            android.location.Location r8 = r13.f5603n     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            double r9 = r8.getLatitude()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            double r9 = com.flurry.sdk.C2619em.m5693a((double) r9, (int) r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeDouble(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            double r9 = r8.getLongitude()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            double r9 = com.flurry.sdk.C2619em.m5693a((double) r9, (int) r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeDouble(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            float r9 = r8.getAccuracy()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeFloat(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            long r9 = r8.getTime()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeLong(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            double r9 = r8.getAltitude()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeDouble(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r10 = 26
            if (r9 < r10) goto L_0x013a
            float r9 = r8.getVerticalAccuracyMeters()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeFloat(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x013e
        L_0x013a:
            r9 = 0
            r4.writeFloat(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x013e:
            float r9 = r8.getBearing()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeFloat(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            float r9 = r8.getSpeed()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeFloat(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r9 < r10) goto L_0x0173
            boolean r9 = r8.hasBearingAccuracy()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r9 == 0) goto L_0x015e
            boolean r9 = r8.hasSpeedAccuracy()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r9 == 0) goto L_0x015e
            r9 = 1
            goto L_0x015f
        L_0x015e:
            r9 = 0
        L_0x015f:
            r4.writeBoolean(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r9 == 0) goto L_0x0176
            float r9 = r8.getBearingAccuracyDegrees()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeFloat(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            float r8 = r8.getSpeedAccuracyMetersPerSecond()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeFloat(r8)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x0176
        L_0x0173:
            r4.writeBoolean(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x0176:
            if (r5 == r7) goto L_0x017a
            r5 = 1
            goto L_0x017b
        L_0x017a:
            r5 = 0
        L_0x017b:
            r4.writeBoolean(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r5 = r13.f5604o     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeInt(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r5 = r13.f5613x     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeByte(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeByte(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeByte(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            byte r5 = r13.f5605p     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeByte(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.Long r5 = r13.f5606q     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r5 != 0) goto L_0x019b
            r4.writeBoolean(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x01a7
        L_0x019b:
            r4.writeBoolean(r2)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.Long r5 = r13.f5606q     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            long r7 = r5.longValue()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeLong(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x01a7:
            java.util.Map<java.lang.String, com.flurry.sdk.bh> r5 = r13.f5609t     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r5 != 0) goto L_0x01af
            r4.writeShort(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x01df
        L_0x01af:
            int r7 = r5.size()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x01be:
            boolean r7 = r5.hasNext()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r7 == 0) goto L_0x01df
            java.lang.Object r7 = r5.next()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.Object r8 = r7.getKey()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeUTF(r8)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.Object r7 = r7.getValue()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            com.flurry.sdk.bh r7 = (com.flurry.sdk.C2407bh) r7     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r7 = r7.f5565a     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeInt(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x01be
        L_0x01df:
            java.util.List<com.flurry.sdk.bi> r5 = r13.f5610u     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r5 != 0) goto L_0x01e7
            r4.writeShort(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x0206
        L_0x01e7:
            int r7 = r5.size()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x01f2:
            boolean r7 = r5.hasNext()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r7 == 0) goto L_0x0206
            java.lang.Object r7 = r5.next()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            com.flurry.sdk.bi r7 = (com.flurry.sdk.C2408bi) r7     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            byte[] r7 = r7.mo17623b()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.write(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x01f2
        L_0x0206:
            boolean r5 = r13.f5612w     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeBoolean(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.List<com.flurry.sdk.bg> r5 = r13.f5615z     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r5 == 0) goto L_0x023e
            java.util.Iterator r7 = r5.iterator()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r8 = 0
            r9 = 0
        L_0x0215:
            boolean r10 = r7.hasNext()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r10 == 0) goto L_0x023f
            java.lang.Object r10 = r7.next()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            com.flurry.sdk.bg r10 = (com.flurry.sdk.C2406bg) r10     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            boolean r11 = r10.mo17618b()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r11 == 0) goto L_0x022a
        L_0x0227:
            int r9 = r9 + 1
            goto L_0x0215
        L_0x022a:
            byte[] r10 = r10.mo17617a()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r10 = r10.length     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r8 = r8 + r10
            r10 = 160000(0x27100, float:2.24208E-40)
            if (r8 <= r10) goto L_0x0227
            r7 = 5
            java.lang.String r8 = f5585b     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r10 = "Error Log size exceeded. No more event details logged."
            com.flurry.sdk.C2530db.m5474a((int) r7, (java.lang.String) r8, (java.lang.String) r10)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x023f
        L_0x023e:
            r9 = 0
        L_0x023f:
            int r7 = r13.f5614y     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeInt(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r7 = 0
        L_0x0248:
            if (r7 >= r9) goto L_0x025a
            java.lang.Object r8 = r5.get(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            com.flurry.sdk.bg r8 = (com.flurry.sdk.C2406bg) r8     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            byte[] r8 = r8.mo17617a()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.write(r8)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r7 = r7 + 1
            goto L_0x0248
        L_0x025a:
            r4.writeInt(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.List<java.lang.String> r5 = r13.f5611v     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r7 = r5.size()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x0273:
            boolean r7 = r5.hasNext()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r8 = 2
            if (r7 == 0) goto L_0x029b
            java.lang.Object r7 = r5.next()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            byte[] r9 = new byte[r6]     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r10 = "UTF8"
            byte[] r9 = r7.getBytes(r10)     // Catch:{ UnsupportedEncodingException -> 0x0289 }
            goto L_0x0290
        L_0x0289:
            java.lang.String r7 = f5585b     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r10 = "Error encoding purchase receipt."
            com.flurry.sdk.C2530db.m5474a((int) r1, (java.lang.String) r7, (java.lang.String) r10)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x0290:
            r4.writeByte(r8)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r7 = r9.length     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeInt(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.write(r9)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x0273
        L_0x029b:
            java.lang.String r13 = r13.f5589A     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            boolean r5 = android.text.TextUtils.isEmpty(r13)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            if (r5 == 0) goto L_0x02a7
            r4.writeShort(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            goto L_0x02e3
        L_0x02a7:
            java.lang.String r5 = ","
            java.lang.String[] r13 = r13.split(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r5 = r13.length     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r5 = r5 % r8
            if (r5 != r2) goto L_0x02d9
            r5 = r13[r6]     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            short r5 = java.lang.Short.parseShort(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r5)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r5 = r13.length     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r5 = r5 - r2
            r6 = 1
        L_0x02bd:
            if (r6 >= r5) goto L_0x02e3
            r4.writeShort(r2)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r7 = r13[r6]     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeLong(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r6 = r6 + 1
            r7 = r13[r6]     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeInt(r7)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            int r6 = r6 + 1
            goto L_0x02bd
        L_0x02d9:
            java.lang.String r13 = f5585b     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            java.lang.String r2 = "Error variant IDs."
            com.flurry.sdk.C2530db.m5474a((int) r1, (java.lang.String) r13, (java.lang.String) r2)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r4.writeShort(r6)     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
        L_0x02e3:
            byte[] r13 = r3.toByteArray()     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            r12.f5586a = r13     // Catch:{ IOException -> 0x02f0, all -> 0x02ed }
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r4)
            return
        L_0x02ed:
            r13 = move-exception
            r2 = r4
            goto L_0x02fc
        L_0x02f0:
            r13 = move-exception
            r2 = r4
            goto L_0x02f6
        L_0x02f3:
            r13 = move-exception
            goto L_0x02fc
        L_0x02f5:
            r13 = move-exception
        L_0x02f6:
            java.lang.String r3 = f5585b     // Catch:{ all -> 0x02f3 }
            com.flurry.sdk.C2530db.m5475a(r1, r3, r0, r13)     // Catch:{ all -> 0x02f3 }
            throw r13     // Catch:{ all -> 0x02f3 }
        L_0x02fc:
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2414bl.<init>(com.flurry.sdk.bm):void");
    }

    /* renamed from: com.flurry.sdk.bl$a */
    public static class C2415a implements C2587dw<C2414bl> {
        /* renamed from: a */
        public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
            C2414bl blVar = (C2414bl) obj;
            if (outputStream != null && blVar != null) {
                C24161 r0 = new DataOutputStream(outputStream) {
                    public final void close() {
                    }
                };
                int i = 0;
                if (blVar.f5586a != null) {
                    i = blVar.f5586a.length;
                }
                r0.writeShort(i);
                if (i > 0) {
                    r0.write(blVar.f5586a);
                }
                r0.flush();
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            C24172 r0 = new DataInputStream(inputStream) {
                public final void close() {
                }
            };
            C2414bl blVar = new C2414bl((byte) 0);
            int readUnsignedShort = r0.readUnsignedShort();
            if (readUnsignedShort > 0) {
                byte[] bArr = new byte[readUnsignedShort];
                r0.readFully(bArr);
                blVar.f5586a = bArr;
            }
            return blVar;
        }
    }
}
