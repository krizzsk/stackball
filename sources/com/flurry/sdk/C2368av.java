package com.flurry.sdk;

import com.flurry.sdk.C2372aw;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.flurry.sdk.av */
public class C2368av extends C2548dm {

    /* renamed from: t */
    private static final String f5447t = C2368av.class.getName();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final long f5448a;
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public final int f5449b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public final int f5450c;
    /* access modifiers changed from: package-private */

    /* renamed from: d */
    public final C2401bc f5451d;
    /* access modifiers changed from: package-private */

    /* renamed from: e */
    public final Map<String, String> f5452e;

    /* renamed from: f */
    public ArrayList<C2372aw> f5453f = new ArrayList<>();

    /* renamed from: g */
    public C2385az f5454g;
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public long f5455h = 30000;
    /* access modifiers changed from: package-private */

    /* renamed from: i */
    public int f5456i;
    /* access modifiers changed from: package-private */

    /* renamed from: j */
    public int f5457j;
    /* access modifiers changed from: package-private */

    /* renamed from: k */
    public String f5458k;
    /* access modifiers changed from: package-private */

    /* renamed from: l */
    public String f5459l;
    /* access modifiers changed from: package-private */

    /* renamed from: m */
    public boolean f5460m;

    public C2368av(String str, long j, String str2, long j2, int i, int i2, C2401bc bcVar, Map<String, String> map, int i3, int i4, String str3) {
        this.f6000q = str2;
        this.f6001r = str2;
        this.f5997n = j2;
        mo17580a();
        this.f5459l = str;
        this.f5448a = j;
        this.f6002s = i;
        this.f5449b = i;
        this.f5450c = i2;
        this.f5451d = bcVar;
        this.f5452e = map;
        this.f5456i = i3;
        this.f5457j = i4;
        this.f5458k = str3;
    }

    /* renamed from: a */
    public final void mo17580a() {
        super.mo17580a();
        if (this.f5999p != 1) {
            this.f5455h *= 3;
        }
    }

    /* renamed from: b */
    public final synchronized void mo17581b() {
        this.f5454g.mo17602c();
    }

    /* renamed from: c */
    public final void mo17582c() {
        Iterator<C2372aw> it = this.f5453f.iterator();
        while (it.hasNext()) {
            it.next().f5476l = this;
        }
    }

    /* renamed from: com.flurry.sdk.av$a */
    public static class C2369a implements C2587dw<C2368av> {

        /* renamed from: a */
        C2584dv<C2372aw> f5461a = new C2584dv<>(new C2372aw.C2373a());

        /* renamed from: a */
        public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
            C2368av avVar = (C2368av) obj;
            if (outputStream != null && avVar != null) {
                C23701 r0 = new DataOutputStream(outputStream) {
                    public final void close() {
                    }
                };
                if (avVar.f5459l != null) {
                    r0.writeUTF(avVar.f5459l);
                } else {
                    r0.writeUTF("");
                }
                if (avVar.f6001r != null) {
                    r0.writeUTF(avVar.f6001r);
                } else {
                    r0.writeUTF("");
                }
                r0.writeLong(avVar.f5997n);
                r0.writeInt(avVar.f5999p);
                r0.writeLong(avVar.f5448a);
                r0.writeInt(avVar.f5449b);
                r0.writeInt(avVar.f5450c);
                r0.writeInt(avVar.f5451d.f5544e);
                Map f = avVar.f5452e;
                if (f != null) {
                    r0.writeInt(avVar.f5452e.size());
                    for (String str : avVar.f5452e.keySet()) {
                        r0.writeUTF(str);
                        r0.writeUTF((String) f.get(str));
                    }
                } else {
                    r0.writeInt(0);
                }
                r0.writeLong(avVar.f5455h);
                r0.writeInt(avVar.f5456i);
                r0.writeInt(avVar.f5457j);
                if (avVar.f5458k != null) {
                    r0.writeUTF(avVar.f5458k);
                } else {
                    r0.writeUTF("");
                }
                r0.writeBoolean(avVar.f5460m);
                r0.flush();
                this.f5461a.mo17563a(outputStream, avVar.f5453f);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
            HashMap hashMap;
            InputStream inputStream2 = inputStream;
            if (inputStream2 == null) {
                return null;
            }
            C23712 r3 = new DataInputStream(inputStream2) {
                public final void close() {
                }
            };
            String readUTF = r3.readUTF();
            String str = readUTF.equals("") ? null : readUTF;
            String readUTF2 = r3.readUTF();
            long readLong = r3.readLong();
            int readInt = r3.readInt();
            long readLong2 = r3.readLong();
            int readInt2 = r3.readInt();
            int readInt3 = r3.readInt();
            C2401bc a = C2401bc.m5168a(r3.readInt());
            int readInt4 = r3.readInt();
            if (readInt4 != 0) {
                HashMap hashMap2 = new HashMap();
                int i = 0;
                while (i < readInt4) {
                    hashMap2.put(r3.readUTF(), r3.readUTF());
                    i++;
                    InputStream inputStream3 = inputStream;
                    readInt4 = readInt4;
                }
                hashMap = hashMap2;
            } else {
                hashMap = null;
            }
            long readLong3 = r3.readLong();
            int readInt5 = r3.readInt();
            int readInt6 = r3.readInt();
            String readUTF3 = r3.readUTF();
            String str2 = readUTF3.equals("") ? null : readUTF3;
            boolean readBoolean = r3.readBoolean();
            C2368av avVar = new C2368av(str, readLong2, readUTF2, readLong, readInt2, readInt3, a, hashMap, readInt5, readInt6, str2);
            long unused = avVar.f5455h = readLong3;
            boolean unused2 = avVar.f5460m = readBoolean;
            avVar.f5999p = readInt;
            avVar.f5453f = (ArrayList) this.f5461a.mo17562a(inputStream);
            avVar.mo17582c();
            return avVar;
        }
    }
}
