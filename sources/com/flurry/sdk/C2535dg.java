package com.flurry.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: com.flurry.sdk.dg */
public class C2535dg<ObjectType> {

    /* renamed from: a */
    public static final String f5948a = C2535dg.class.getSimpleName();

    /* renamed from: d */
    private static final byte[] f5949d = {113, -92, -8, 125, 121, 107, -65, -61, -74, -114, -32, 0, -57, -87, -35, -56, -6, -52, 51, 126, -104, 49, 79, -52, 118, -84, 99, -52, -14, -126, -27, -64};

    /* renamed from: b */
    public String f5950b;

    /* renamed from: c */
    public C2587dw<ObjectType> f5951c;

    public C2535dg(String str, C2587dw<ObjectType> dwVar) {
        this.f5950b = str;
        this.f5951c = dwVar;
    }

    /* renamed from: a */
    public static int m5499a(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        C2505cr crVar = new C2505cr();
        crVar.update(bArr);
        return crVar.mo17709b();
    }

    /* renamed from: b */
    public static void m5500b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int length2 = f5949d.length;
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) ((bArr[i] ^ f5949d[i % length2]) ^ ((i * 31) % 251));
            }
        }
    }

    /* renamed from: c */
    public final ObjectType mo17750c(byte[] bArr) throws IOException {
        if (bArr != null) {
            m5501d(bArr);
            byte[] bArr2 = (byte[]) new C2583du(new C2581ds()).mo17562a(new ByteArrayInputStream(bArr));
            String str = f5948a;
            C2530db.m5474a(3, str, "Decoding: " + this.f5950b + ": " + new String(bArr2));
            return this.f5951c.mo17562a(new ByteArrayInputStream(bArr2));
        }
        throw new IOException("Decoding: " + this.f5950b + ": Nothing to decode");
    }

    /* renamed from: d */
    private static void m5501d(byte[] bArr) {
        m5500b(bArr);
    }
}
