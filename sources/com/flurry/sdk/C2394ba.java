package com.flurry.sdk;

import android.content.Context;
import android.os.Build;
import com.flurry.sdk.C2397bb;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;

/* renamed from: com.flurry.sdk.ba */
public class C2394ba {

    /* renamed from: a */
    public static final String f5528a = C2394ba.class.getName();

    /* renamed from: c */
    private static C2394ba f5529c = null;

    /* renamed from: b */
    public String f5530b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2508ct<List<C2397bb>> f5531d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C2397bb> f5532e;

    /* renamed from: f */
    private boolean f5533f;

    private C2394ba() {
    }

    /* renamed from: a */
    public static synchronized C2394ba m5156a() {
        C2394ba baVar;
        synchronized (C2394ba.class) {
            if (f5529c == null) {
                C2394ba baVar2 = new C2394ba();
                f5529c = baVar2;
                Context context = C2494ck.m5371a().f5832a;
                baVar2.f5531d = new C2508ct<>(context.getFileStreamPath(".yflurrypulselogging." + Long.toString(C2619em.m5709g(C2494ck.m5371a().f5833b), 16)), ".yflurrypulselogging.", 1, new C2592dz<List<C2397bb>>() {
                    /* renamed from: a */
                    public final C2587dw<List<C2397bb>> mo17575a(int i) {
                        return new C2584dv(new C2397bb.C2398a());
                    }
                });
                baVar2.f5533f = ((Boolean) C2611eg.m5674a().mo17819a("UseHttps")).booleanValue();
                String str = f5528a;
                C2530db.m5474a(4, str, "initSettings, UseHttps = " + baVar2.f5533f);
                List<C2397bb> a = baVar2.f5531d.mo17716a();
                baVar2.f5532e = a;
                if (a == null) {
                    baVar2.f5532e = new ArrayList();
                }
            }
            baVar = f5529c;
        }
        return baVar;
    }

    /* renamed from: a */
    public final synchronized void mo17611a(C2385az azVar) {
        try {
            this.f5532e.add(new C2397bb(azVar.mo17603d()));
            C2530db.m5474a(4, f5528a, "Saving persistent Pulse logging data.");
            this.f5531d.mo17717a(this.f5532e);
        } catch (IOException unused) {
            C2530db.m5474a(6, f5528a, "Error when generating pulse log report in addReport part");
        }
    }

    /* renamed from: b */
    public final synchronized void mo17612b() {
        try {
            m5158a(m5161d());
        } catch (IOException unused) {
            C2530db.m5474a(6, f5528a, "Report not send due to exception in generate data");
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [byte[], RequestObjectType] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m5158a(byte[] r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.flurry.sdk.by r0 = com.flurry.sdk.C2468by.m5319a()     // Catch:{ all -> 0x007f }
            boolean r0 = r0.f5763c     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x0013
            r6 = 5
            java.lang.String r0 = f5528a     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "Reports were not sent! No Internet connection!"
            com.flurry.sdk.C2530db.m5474a((int) r6, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return
        L_0x0013:
            if (r6 == 0) goto L_0x0075
            int r0 = r6.length     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x0019
            goto L_0x0075
        L_0x0019:
            java.lang.String r0 = r5.f5530b     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r5.f5530b     // Catch:{ all -> 0x007f }
            goto L_0x0022
        L_0x0020:
            java.lang.String r0 = "https://data.flurry.com/pcr.do"
        L_0x0022:
            r1 = 4
            java.lang.String r2 = f5528a     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "PulseLoggingManager: start upload data "
            r3.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = java.util.Arrays.toString(r6)     // Catch:{ all -> 0x007f }
            r3.append(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = " to "
            r3.append(r4)     // Catch:{ all -> 0x007f }
            r3.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007f }
            com.flurry.sdk.C2530db.m5474a((int) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x007f }
            com.flurry.sdk.di r1 = new com.flurry.sdk.di     // Catch:{ all -> 0x007f }
            r1.<init>()     // Catch:{ all -> 0x007f }
            r1.f5970g = r0     // Catch:{ all -> 0x007f }
            r0 = 100000(0x186a0, float:1.4013E-40)
            r1.f6169u = r0     // Catch:{ all -> 0x007f }
            com.flurry.sdk.dk$a r0 = com.flurry.sdk.C2542dk.C2545a.kPost     // Catch:{ all -> 0x007f }
            r1.f5971h = r0     // Catch:{ all -> 0x007f }
            r0 = 1
            r1.f5974k = r0     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = "application/octet-stream"
            r1.mo17759a(r0, r2)     // Catch:{ all -> 0x007f }
            com.flurry.sdk.ds r0 = new com.flurry.sdk.ds     // Catch:{ all -> 0x007f }
            r0.<init>()     // Catch:{ all -> 0x007f }
            r1.f5955c = r0     // Catch:{ all -> 0x007f }
            r1.f5954b = r6     // Catch:{ all -> 0x007f }
            com.flurry.sdk.ba$2 r6 = new com.flurry.sdk.ba$2     // Catch:{ all -> 0x007f }
            r6.<init>()     // Catch:{ all -> 0x007f }
            r1.f5953a = r6     // Catch:{ all -> 0x007f }
            com.flurry.sdk.cg r6 = com.flurry.sdk.C2485cg.m5355a()     // Catch:{ all -> 0x007f }
            r6.mo17728a((java.lang.Object) r5, r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return
        L_0x0075:
            r6 = 3
            java.lang.String r0 = f5528a     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "No report need be sent"
            com.flurry.sdk.C2530db.m5474a((int) r6, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return
        L_0x007f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2394ba.m5158a(byte[]):void");
    }

    /* renamed from: d */
    private byte[] m5161d() throws IOException {
        DataOutputStream dataOutputStream;
        IOException e;
        DataOutputStream dataOutputStream2 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                if (this.f5532e != null) {
                    if (!this.f5532e.isEmpty()) {
                        dataOutputStream.writeShort(1);
                        dataOutputStream.writeShort(1);
                        dataOutputStream.writeLong(System.currentTimeMillis());
                        dataOutputStream.writeUTF(C2494ck.m5371a().f5833b);
                        dataOutputStream.writeUTF(C2476cb.m5335a().mo17667e());
                        dataOutputStream.writeShort(C2495cl.m5382b());
                        dataOutputStream.writeShort(3);
                        C2476cb.m5335a();
                        dataOutputStream.writeUTF(C2476cb.m5340d());
                        dataOutputStream.writeBoolean(C2451bs.m5276a().mo17652f());
                        ArrayList<C2335ag> arrayList = new ArrayList<>();
                        for (Map.Entry next : Collections.unmodifiableMap(C2451bs.m5276a().f5716a).entrySet()) {
                            C2335ag agVar = new C2335ag();
                            agVar.f5366a = ((C2475ca) next.getKey()).f5789d;
                            if (((C2475ca) next.getKey()).f5790e) {
                                agVar.f5367b = new String((byte[]) next.getValue());
                            } else {
                                agVar.f5367b = C2619em.m5704b((byte[]) next.getValue());
                            }
                            arrayList.add(agVar);
                        }
                        dataOutputStream.writeShort(arrayList.size());
                        for (C2335ag agVar2 : arrayList) {
                            dataOutputStream.writeShort(agVar2.f5366a);
                            byte[] bytes = agVar2.f5367b.getBytes();
                            dataOutputStream.writeShort(bytes.length);
                            dataOutputStream.write(bytes);
                        }
                        dataOutputStream.writeShort(6);
                        dataOutputStream.writeShort(C2363at.f5433b - 1);
                        dataOutputStream.writeUTF(Build.MODEL);
                        dataOutputStream.writeShort(C2363at.f5434c - 1);
                        dataOutputStream.writeUTF(Build.BOARD);
                        dataOutputStream.writeShort(C2363at.f5435d - 1);
                        dataOutputStream.writeUTF(Build.ID);
                        dataOutputStream.writeShort(C2363at.f5436e - 1);
                        dataOutputStream.writeUTF(Build.DEVICE);
                        dataOutputStream.writeShort(C2363at.f5437f - 1);
                        dataOutputStream.writeUTF(Build.PRODUCT);
                        dataOutputStream.writeShort(C2363at.f5438g - 1);
                        dataOutputStream.writeUTF(Build.VERSION.RELEASE);
                        dataOutputStream.writeShort(this.f5532e.size());
                        for (C2397bb bbVar : this.f5532e) {
                            dataOutputStream.write(bbVar.f5536a);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        CRC32 crc32 = new CRC32();
                        crc32.update(byteArray);
                        dataOutputStream.writeInt((int) crc32.getValue());
                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        C2619em.m5698a((Closeable) dataOutputStream);
                        return byteArray2;
                    }
                }
                byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                C2619em.m5698a((Closeable) dataOutputStream);
                return byteArray3;
            } catch (IOException e2) {
                e = e2;
                try {
                    C2530db.m5475a(6, f5528a, "Error when generating report", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream2 = dataOutputStream;
                    C2619em.m5698a((Closeable) dataOutputStream2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            dataOutputStream = null;
            e = e3;
            C2530db.m5475a(6, f5528a, "Error when generating report", e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            C2619em.m5698a((Closeable) dataOutputStream2);
            throw th;
        }
    }
}
