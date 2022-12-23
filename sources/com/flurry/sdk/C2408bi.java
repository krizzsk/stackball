package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.bi */
public final class C2408bi {

    /* renamed from: a */
    public String f5566a;

    /* renamed from: b */
    public boolean f5567b;

    /* renamed from: c */
    public boolean f5568c;

    /* renamed from: d */
    public long f5569d;

    /* renamed from: e */
    private final Map<String, String> f5570e;

    /* renamed from: f */
    private int f5571f;

    /* renamed from: g */
    private long f5572g;

    public C2408bi(int i, String str, Map<String, String> map, long j, boolean z) {
        HashMap hashMap = new HashMap();
        this.f5570e = hashMap;
        this.f5571f = i;
        this.f5566a = str;
        if (map != null) {
            hashMap.putAll(map);
        }
        this.f5572g = j;
        this.f5567b = z;
        this.f5568c = !z;
    }

    /* renamed from: a */
    public final void mo17620a(long j) {
        this.f5568c = true;
        this.f5569d = j - this.f5572g;
        C2530db.m5474a(3, "FlurryAgent", "Ended event '" + this.f5566a + "' (" + this.f5572g + ") after " + this.f5569d + "ms");
    }

    /* renamed from: a */
    public final synchronized void mo17621a(Map<String, String> map) {
        if (map != null) {
            this.f5570e.putAll(map);
        }
    }

    /* renamed from: a */
    public final synchronized Map<String, String> mo17619a() {
        return new HashMap(this.f5570e);
    }

    /* renamed from: b */
    public final synchronized void mo17622b(Map<String, String> map) {
        this.f5570e.clear();
        if (map != null) {
            this.f5570e.putAll(map);
        }
    }

    /* renamed from: b */
    public final synchronized byte[] mo17623b() {
        Throwable th;
        byte[] bArr;
        DataOutputStream dataOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream2.writeShort(this.f5571f);
                dataOutputStream2.writeUTF(this.f5566a);
                dataOutputStream2.writeShort(this.f5570e.size());
                for (Map.Entry next : this.f5570e.entrySet()) {
                    dataOutputStream2.writeUTF(C2619em.m5703b((String) next.getKey()));
                    dataOutputStream2.writeUTF(C2619em.m5703b((String) next.getValue()));
                }
                dataOutputStream2.writeLong(this.f5572g);
                dataOutputStream2.writeLong(this.f5569d);
                dataOutputStream2.flush();
                bArr = byteArrayOutputStream.toByteArray();
                C2619em.m5698a((Closeable) dataOutputStream2);
            } catch (IOException unused) {
                dataOutputStream = dataOutputStream2;
                try {
                    byte[] bArr2 = new byte[0];
                    C2619em.m5698a((Closeable) dataOutputStream);
                    bArr = bArr2;
                    return bArr;
                } catch (Throwable th2) {
                    dataOutputStream2 = dataOutputStream;
                    th = th2;
                    C2619em.m5698a((Closeable) dataOutputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C2619em.m5698a((Closeable) dataOutputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            byte[] bArr22 = new byte[0];
            C2619em.m5698a((Closeable) dataOutputStream);
            bArr = bArr22;
            return bArr;
        }
        return bArr;
    }
}
