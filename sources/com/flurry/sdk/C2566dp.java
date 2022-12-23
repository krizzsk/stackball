package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* renamed from: com.flurry.sdk.dp */
public final class C2566dp {

    /* renamed from: a */
    String f6040a;

    /* renamed from: b */
    byte[] f6041b;

    /* synthetic */ C2566dp(byte b) {
        this();
    }

    private C2566dp() {
        this.f6040a = null;
        this.f6041b = null;
    }

    public C2566dp(byte[] bArr) {
        this.f6040a = null;
        this.f6041b = null;
        this.f6040a = UUID.randomUUID().toString();
        this.f6041b = bArr;
    }

    /* renamed from: a */
    public static String m5574a(String str) {
        return ".yflurrydatasenderblock.".concat(String.valueOf(str));
    }

    /* renamed from: com.flurry.sdk.dp$a */
    public static class C2568a implements C2587dw<C2566dp> {

        /* renamed from: a */
        private int f6042a = 1;

        /* renamed from: a */
        public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
            C2566dp dpVar = (C2566dp) obj;
            if (outputStream != null && dpVar != null) {
                C25691 r0 = new DataOutputStream(outputStream) {
                    public final void close() {
                    }
                };
                int length = dpVar.f6041b.length;
                if (this.f6042a == 1) {
                    r0.writeShort(length);
                } else {
                    r0.writeInt(length);
                }
                r0.write(dpVar.f6041b);
                r0.writeShort(0);
                r0.flush();
            }
        }

        public C2568a(int i) {
            this.f6042a = i;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
            int i;
            if (inputStream == null) {
                return null;
            }
            C25702 r1 = new DataInputStream(inputStream) {
                public final void close() {
                }
            };
            C2566dp dpVar = new C2566dp((byte) 0);
            if (this.f6042a == 1) {
                i = r1.readShort();
            } else {
                i = r1.readInt();
            }
            if (i == 0) {
                return null;
            }
            dpVar.f6041b = new byte[i];
            r1.readFully(dpVar.f6041b);
            r1.readUnsignedShort();
            return dpVar;
        }
    }

    /* renamed from: b */
    public static C2508ct<C2566dp> m5575b(String str) {
        return new C2508ct<>(C2494ck.m5371a().f5832a.getFileStreamPath(m5574a(str)), ".yflurrydatasenderblock.", 2, new C2592dz<C2566dp>() {
            /* renamed from: a */
            public final C2587dw<C2566dp> mo17575a(int i) {
                return new C2568a(i);
            }
        });
    }
}
