package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.cd */
public final class C2478cd {

    /* renamed from: a */
    boolean f5797a;

    /* renamed from: b */
    byte[] f5798b;

    /* renamed from: c */
    byte[] f5799c;

    /* renamed from: d */
    int f5800d;

    /* synthetic */ C2478cd(byte b) {
        this();
    }

    public C2478cd(byte[] bArr, byte[] bArr2, boolean z, int i) {
        this.f5798b = bArr2;
        this.f5799c = bArr;
        this.f5797a = z;
        this.f5800d = i;
    }

    private C2478cd() {
    }

    /* renamed from: com.flurry.sdk.cd$a */
    static class C2479a implements C2587dw<C2478cd> {
        /* renamed from: a */
        public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
            C2478cd cdVar = (C2478cd) obj;
            if (outputStream != null && cdVar != null) {
                C24801 r0 = new DataOutputStream(outputStream) {
                    public final void close() {
                    }
                };
                r0.writeBoolean(cdVar.f5797a);
                if (cdVar.f5798b == null) {
                    r0.writeInt(0);
                } else {
                    r0.writeInt(cdVar.f5798b.length);
                    r0.write(cdVar.f5798b);
                }
                if (cdVar.f5799c == null) {
                    r0.writeInt(0);
                } else {
                    r0.writeInt(cdVar.f5799c.length);
                    r0.write(cdVar.f5799c);
                }
                r0.writeInt(cdVar.f5800d);
                r0.flush();
            }
        }

        C2479a() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            C24812 r1 = new DataInputStream(inputStream) {
                public final void close() {
                }
            };
            C2478cd cdVar = new C2478cd((byte) 0);
            cdVar.f5797a = r1.readBoolean();
            int readInt = r1.readInt();
            if (readInt > 0) {
                cdVar.f5798b = new byte[readInt];
                r1.read(cdVar.f5798b, 0, readInt);
            } else {
                cdVar.f5798b = null;
            }
            int readInt2 = r1.readInt();
            if (readInt2 > 0) {
                cdVar.f5799c = new byte[readInt2];
                r1.read(cdVar.f5799c, 0, readInt2);
            } else {
                cdVar.f5799c = null;
            }
            cdVar.f5800d = r1.readInt();
            return cdVar;
        }
    }
}
