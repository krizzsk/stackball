package com.flurry.sdk;

import com.flurry.sdk.C2368av;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.flurry.sdk.az */
public final class C2385az {

    /* renamed from: f */
    private static final String f5502f = C2394ba.class.getName();

    /* renamed from: a */
    public long f5503a;
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public C2402bd f5504b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public int f5505c;

    /* renamed from: d */
    public String f5506d;
    /* access modifiers changed from: package-private */

    /* renamed from: e */
    public Map<Long, C2368av> f5507e;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f5508g = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f5509h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f5510i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f5511j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public AtomicInteger f5512k;

    public C2385az(String str, boolean z, long j, long j2, C2402bd bdVar, Map<Long, C2368av> map) {
        this.f5506d = str;
        this.f5510i = z;
        this.f5503a = j;
        this.f5509h = j2;
        this.f5504b = bdVar;
        this.f5507e = map;
        if (map != null) {
            for (Long l : map.keySet()) {
                map.get(l).f5454g = this;
            }
            this.f5511j = map.size();
        } else {
            this.f5511j = 0;
        }
        this.f5512k = new AtomicInteger(0);
    }

    /* renamed from: a */
    public final List<C2368av> mo17600a() {
        if (this.f5507e != null) {
            return new ArrayList(this.f5507e.values());
        }
        return Collections.emptyList();
    }

    /* renamed from: b */
    public final synchronized boolean mo17601b() {
        return this.f5512k.intValue() >= this.f5511j;
    }

    /* renamed from: c */
    public final synchronized void mo17602c() {
        this.f5512k.incrementAndGet();
    }

    /* renamed from: d */
    public final byte[] mo17603d() throws IOException {
        DataOutputStream dataOutputStream;
        IOException e;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(this.f5504b.f5550e);
                dataOutputStream.writeLong(this.f5503a);
                dataOutputStream.writeLong(this.f5509h);
                dataOutputStream.writeBoolean(this.f5510i);
                if (this.f5510i) {
                    dataOutputStream.writeShort(this.f5505c);
                    dataOutputStream.writeUTF(this.f5506d);
                }
                dataOutputStream.writeShort(this.f5507e.size());
                if (this.f5507e != null) {
                    for (Map.Entry next : this.f5507e.entrySet()) {
                        C2368av avVar = (C2368av) next.getValue();
                        dataOutputStream.writeLong(((Long) next.getKey()).longValue());
                        dataOutputStream.writeUTF(avVar.f6001r);
                        dataOutputStream.writeShort(avVar.f5453f.size());
                        Iterator<C2372aw> it = avVar.f5453f.iterator();
                        while (it.hasNext()) {
                            C2372aw next2 = it.next();
                            dataOutputStream.writeShort(next2.f5465a);
                            dataOutputStream.writeLong(next2.f5466b);
                            dataOutputStream.writeLong(next2.f5467c);
                            dataOutputStream.writeBoolean(next2.f5468d);
                            dataOutputStream.writeShort(next2.f5469e);
                            dataOutputStream.writeShort(next2.f5470f.f5484e);
                            if ((next2.f5469e < 200 || next2.f5469e >= 400) && next2.f5471g != null) {
                                byte[] bytes = next2.f5471g.getBytes();
                                dataOutputStream.writeShort(bytes.length);
                                dataOutputStream.write(bytes);
                            }
                            dataOutputStream.writeShort(next2.f5472h);
                            dataOutputStream.writeInt((int) next2.f5475k);
                        }
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C2619em.m5698a((Closeable) dataOutputStream);
                return byteArray;
            } catch (IOException e2) {
                e = e2;
                try {
                    C2530db.m5475a(6, f5502f, "Error when generating report", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    C2619em.m5698a((Closeable) dataOutputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            dataOutputStream = null;
            e = e3;
            C2530db.m5475a(6, f5502f, "Error when generating report", e);
            throw e;
        } catch (Throwable th2) {
            dataOutputStream = null;
            th = th2;
            C2619em.m5698a((Closeable) dataOutputStream);
            throw th;
        }
    }

    /* renamed from: com.flurry.sdk.az$a */
    public static class C2386a implements C2587dw<C2385az> {

        /* renamed from: a */
        C2584dv<C2368av> f5513a = new C2584dv<>(new C2368av.C2369a());

        /* renamed from: a */
        public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
            C2385az azVar = (C2385az) obj;
            if (outputStream != null && azVar != null) {
                C23871 r0 = new DataOutputStream(outputStream) {
                    public final void close() {
                    }
                };
                r0.writeLong(azVar.f5503a);
                r0.writeLong(azVar.f5508g);
                r0.writeLong(azVar.f5509h);
                r0.writeInt(azVar.f5504b.f5550e);
                r0.writeBoolean(azVar.f5510i);
                r0.writeInt(azVar.f5505c);
                if (azVar.f5506d != null) {
                    r0.writeUTF(azVar.f5506d);
                } else {
                    r0.writeUTF("");
                }
                r0.writeInt(azVar.f5511j);
                r0.writeInt(azVar.f5512k.intValue());
                r0.flush();
                this.f5513a.mo17563a(outputStream, azVar.mo17600a());
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
            InputStream inputStream2 = inputStream;
            if (inputStream2 == null) {
                return null;
            }
            C23882 r2 = new DataInputStream(inputStream2) {
                public final void close() {
                }
            };
            long readLong = r2.readLong();
            long readLong2 = r2.readLong();
            long readLong3 = r2.readLong();
            C2402bd a = C2402bd.m5169a(r2.readInt());
            boolean readBoolean = r2.readBoolean();
            int readInt = r2.readInt();
            String readUTF = r2.readUTF();
            int readInt2 = r2.readInt();
            int readInt3 = r2.readInt();
            C2385az azVar = r3;
            C2385az azVar2 = new C2385az(readUTF, readBoolean, readLong, readLong3, a, (Map<Long, C2368av>) null);
            long unused = azVar.f5508g = readLong2;
            int unused2 = azVar.f5505c = readInt;
            int unused3 = azVar.f5511j = readInt2;
            AtomicInteger unused4 = azVar.f5512k = new AtomicInteger(readInt3);
            C2385az azVar3 = azVar;
            List<C2368av> b = this.f5513a.mo17562a(inputStream);
            if (b != null) {
                Map unused5 = azVar3.f5507e = new HashMap();
                for (C2368av next : b) {
                    next.f5454g = azVar3;
                    azVar3.f5507e.put(Long.valueOf(next.f5448a), next);
                }
            }
            return azVar3;
        }
    }
}
