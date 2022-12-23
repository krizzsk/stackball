package com.flurry.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.bg */
public final class C2406bg {

    /* renamed from: a */
    public String f5554a;

    /* renamed from: b */
    public String f5555b;

    /* renamed from: c */
    public String f5556c;

    /* renamed from: d */
    private int f5557d;

    /* renamed from: e */
    private long f5558e;

    /* renamed from: f */
    private String f5559f;

    /* renamed from: g */
    private String f5560g;

    /* renamed from: h */
    private Throwable f5561h;

    /* renamed from: i */
    private Map<String, String> f5562i = new HashMap();

    /* renamed from: j */
    private Map<String, String> f5563j = new HashMap();

    /* renamed from: k */
    private List<C2627es> f5564k = new ArrayList();

    public C2406bg(int i, long j, String str, String str2, String str3, Throwable th, Map<String, String> map, Map<String, String> map2) {
        this.f5557d = i;
        this.f5558e = j;
        this.f5554a = str;
        this.f5559f = str2;
        this.f5560g = str3;
        this.f5561h = th;
        if (map != null) {
            this.f5562i = map;
        }
        if (map2 != null) {
            this.f5563j = map2;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x018a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo17617a() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x018a }
            r2.<init>()     // Catch:{ IOException -> 0x018a }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x018a }
            r3.<init>(r2)     // Catch:{ IOException -> 0x018a }
            int r1 = r10.f5557d     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeShort(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            long r4 = r10.f5558e     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeLong(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r1 = r10.f5554a     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeUTF(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r1 = r10.f5559f     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeUTF(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r1 = r10.f5560g     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeUTF(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r10.f5562i     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            int r1 = r1.size()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeShort(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r10.f5562i     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
        L_0x0038:
            boolean r4 = r1.hasNext()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            if (r4 == 0) goto L_0x0057
            java.lang.Object r4 = r1.next()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeUTF(r5)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            goto L_0x0038
        L_0x0057:
            java.util.Map<java.lang.String, java.lang.String> r1 = r10.f5563j     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            int r1 = r1.size()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeShort(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r10.f5563j     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
        L_0x006a:
            boolean r4 = r1.hasNext()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r1.next()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeUTF(r5)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            goto L_0x006a
        L_0x0089:
            java.lang.Throwable r1 = r10.f5561h     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r4 = 3
            r5 = 1
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = "uncaught"
            java.lang.String r6 = r10.f5554a     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            boolean r1 = r1.equals(r6)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r6 = 2
            if (r1 == 0) goto L_0x009e
            r3.writeByte(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            goto L_0x00a1
        L_0x009e:
            r3.writeByte(r6)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
        L_0x00a1:
            r3.writeByte(r6)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r4 = ""
            r1.<init>(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r4 = "line.separator"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.Throwable r6 = r10.f5561h     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            int r7 = r6.length     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r8 = 0
        L_0x00b9:
            if (r8 >= r7) goto L_0x00c6
            r9 = r6[r8]     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r1.append(r9)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r1.append(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            int r8 = r8 + 1
            goto L_0x00b9
        L_0x00c6:
            java.lang.Throwable r6 = r10.f5561h     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.Throwable r6 = r6.getCause()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            if (r6 == 0) goto L_0x00ef
            r1.append(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r6 = "Caused by: "
            r1.append(r6)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.Throwable r6 = r10.f5561h     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.Throwable r6 = r6.getCause()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            int r7 = r6.length     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r8 = 0
        L_0x00e2:
            if (r8 >= r7) goto L_0x00ef
            r9 = r6[r8]     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r1.append(r9)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r1.append(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            int r8 = r8 + 1
            goto L_0x00e2
        L_0x00ef:
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            int r4 = r1.length     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeInt(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.write(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            goto L_0x012b
        L_0x00ff:
            boolean r1 = r10.mo17618b()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            if (r1 == 0) goto L_0x0125
            r3.writeByte(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r1 = r10.f5556c     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            if (r1 == 0) goto L_0x0114
            r3.writeByte(r0)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            goto L_0x012b
        L_0x0114:
            r3.writeByte(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r1 = r10.f5556c     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            int r4 = r1.length     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeInt(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.write(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            goto L_0x012b
        L_0x0125:
            r3.writeByte(r5)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeByte(r0)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
        L_0x012b:
            java.lang.String r1 = r10.f5555b     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            if (r1 == 0) goto L_0x0137
            r3.writeByte(r0)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            goto L_0x0147
        L_0x0137:
            r3.writeByte(r5)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.lang.String r1 = r10.f5555b     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            int r4 = r1.length     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeInt(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.write(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
        L_0x0147:
            int r1 = com.flurry.sdk.C2628et.m5722b()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeShort(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.List<com.flurry.sdk.es> r1 = r10.f5564k     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            if (r1 == 0) goto L_0x0175
            java.util.List<com.flurry.sdk.es> r1 = r10.f5564k     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            int r1 = r1.size()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.writeShort(r1)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.List<com.flurry.sdk.es> r1 = r10.f5564k     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
        L_0x0161:
            boolean r4 = r1.hasNext()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            if (r4 == 0) goto L_0x0178
            java.lang.Object r4 = r1.next()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            com.flurry.sdk.es r4 = (com.flurry.sdk.C2627es) r4     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            byte[] r4 = r4.mo17827a()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            r3.write(r4)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            goto L_0x0161
        L_0x0175:
            r3.writeShort(r0)     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
        L_0x0178:
            r3.flush()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            byte[] r0 = r2.toByteArray()     // Catch:{ IOException -> 0x0186, all -> 0x0183 }
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r3)
            goto L_0x018f
        L_0x0183:
            r0 = move-exception
            r1 = r3
            goto L_0x0190
        L_0x0186:
            r1 = r3
            goto L_0x018a
        L_0x0188:
            r0 = move-exception
            goto L_0x0190
        L_0x018a:
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0188 }
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r1)
        L_0x018f:
            return r0
        L_0x0190:
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2406bg.mo17617a():byte[]");
    }

    /* renamed from: a */
    public final void mo17616a(List<C2627es> list) {
        if (list != null) {
            this.f5564k = list;
        }
    }

    /* renamed from: b */
    public final boolean mo17618b() {
        return "native".equals(this.f5554a);
    }
}
