package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.dr */
public final class C2577dr {

    /* renamed from: a */
    String f6054a;

    /* synthetic */ C2577dr(byte b) {
        this();
    }

    private C2577dr() {
    }

    public C2577dr(String str) {
        this.f6054a = str;
    }

    /* renamed from: com.flurry.sdk.dr$a */
    public static class C2578a implements C2587dw<C2577dr> {
        /* renamed from: a */
        public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
            C2577dr drVar = (C2577dr) obj;
            if (outputStream != null && drVar != null) {
                C25791 r0 = new DataOutputStream(outputStream) {
                    public final void close() {
                    }
                };
                r0.writeUTF(drVar.f6054a);
                r0.flush();
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            C25802 r0 = new DataInputStream(inputStream) {
                public final void close() {
                }
            };
            C2577dr drVar = new C2577dr((byte) 0);
            drVar.f6054a = r0.readUTF();
            return drVar;
        }
    }
}
