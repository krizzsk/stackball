package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.aq */
public final class C2345aq {

    /* renamed from: a */
    long f5390a;

    /* renamed from: b */
    boolean f5391b;

    /* renamed from: c */
    byte[] f5392c;

    /* renamed from: com.flurry.sdk.aq$a */
    public static class C2346a implements C2587dw<C2345aq> {
        /* renamed from: a */
        public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
            C2345aq aqVar = (C2345aq) obj;
            if (outputStream != null && aqVar != null) {
                C23471 r0 = new DataOutputStream(outputStream) {
                    public final void close() {
                    }
                };
                r0.writeLong(aqVar.f5390a);
                r0.writeBoolean(aqVar.f5391b);
                r0.writeInt(aqVar.f5392c.length);
                r0.write(aqVar.f5392c);
                r0.flush();
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            C23482 r0 = new DataInputStream(inputStream) {
                public final void close() {
                }
            };
            C2345aq aqVar = new C2345aq();
            aqVar.f5390a = r0.readLong();
            aqVar.f5391b = r0.readBoolean();
            aqVar.f5392c = new byte[r0.readInt()];
            r0.readFully(aqVar.f5392c);
            return aqVar;
        }
    }
}
