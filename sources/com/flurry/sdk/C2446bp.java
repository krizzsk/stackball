package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.flurry.sdk.bp */
public class C2446bp {

    /* renamed from: d */
    private static final String f5708d = C2446bp.class.getSimpleName();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final List<C2414bl> f5709a = new ArrayList();
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public boolean f5710b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public long f5711c;

    /* renamed from: com.flurry.sdk.bp$a */
    public static class C2447a implements C2587dw<C2446bp> {
        /* renamed from: a */
        public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            C24481 r0 = new DataInputStream(inputStream) {
                public final void close() {
                }
            };
            C2446bp bpVar = new C2446bp();
            r0.readUTF();
            r0.readUTF();
            boolean unused = bpVar.f5710b = r0.readBoolean();
            long unused2 = bpVar.f5711c = r0.readLong();
            while (true) {
                int readUnsignedShort = r0.readUnsignedShort();
                if (readUnsignedShort == 0) {
                    return bpVar;
                }
                byte[] bArr = new byte[readUnsignedShort];
                r0.readFully(bArr);
                bpVar.f5709a.add(0, new C2414bl(bArr));
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
            throw new UnsupportedOperationException("Serialization not supported");
        }
    }
}
