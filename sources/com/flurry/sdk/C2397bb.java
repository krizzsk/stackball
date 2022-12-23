package com.flurry.sdk;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.bb */
public final class C2397bb {

    /* renamed from: a */
    byte[] f5536a;

    public C2397bb() {
    }

    public C2397bb(byte[] bArr) {
        this.f5536a = bArr;
    }

    /* renamed from: com.flurry.sdk.bb$a */
    public static class C2398a implements C2587dw<C2397bb> {
        /* renamed from: a */
        public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
            C2397bb bbVar = (C2397bb) obj;
            if (outputStream != null && bbVar != null) {
                C23991 r0 = new DataOutputStream(outputStream) {
                    public final void close() {
                    }
                };
                r0.writeShort(bbVar.f5536a.length);
                r0.write(bbVar.f5536a);
                r0.writeShort(0);
                r0.flush();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r1 = new com.flurry.sdk.C2397bb.C2398a.C24002(r2, r3);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object mo17562a(java.io.InputStream r3) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                if (r3 != 0) goto L_0x0004
                return r0
            L_0x0004:
                com.flurry.sdk.bb$a$2 r1 = new com.flurry.sdk.bb$a$2
                r1.<init>(r3)
                short r3 = r1.readShort()
                if (r3 != 0) goto L_0x0010
                return r0
            L_0x0010:
                com.flurry.sdk.bb r0 = new com.flurry.sdk.bb
                r0.<init>()
                byte[] r3 = new byte[r3]
                r0.f5536a = r3
                byte[] r3 = r0.f5536a
                r1.readFully(r3)
                r1.readUnsignedShort()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2397bb.C2398a.mo17562a(java.io.InputStream):java.lang.Object");
        }
    }
}
