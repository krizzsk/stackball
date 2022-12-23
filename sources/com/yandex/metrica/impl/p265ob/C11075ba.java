package com.yandex.metrica.impl.p265ob;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

/* renamed from: com.yandex.metrica.impl.ob.ba */
public class C11075ba {

    /* renamed from: a */
    private final C11076a f26592a;

    /* renamed from: b */
    private final C11889vm f26593b;

    /* renamed from: com.yandex.metrica.impl.ob.ba$a */
    public static class C11076a {
    }

    public C11075ba() {
        this(new C11076a(), new C11889vm());
    }

    /* renamed from: a */
    public byte[] mo62689a(byte[] bArr, String str) {
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        Throwable th;
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C11076a aVar = this.f26592a;
            byte[] bytes = str.getBytes();
            aVar.getClass();
            C11218en enVar = new C11218en("AES/CBC/PKCS5Padding", bytes, copyOfRange);
            if (C10796U2.m27893a(bArr)) {
                return null;
            }
            byte[] a = enVar.mo62847a(bArr, 16, bArr.length - 16);
            this.f26593b.getClass();
            try {
                byteArrayInputStream = new ByteArrayInputStream(a);
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    byte[] a2 = C10823V0.m27967a((InputStream) gZIPInputStream, Integer.MAX_VALUE);
                    C10796U2.m27888a((Closeable) gZIPInputStream);
                    C10796U2.m27888a((Closeable) byteArrayInputStream);
                    return a2;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPInputStream = null;
                    C10796U2.m27888a((Closeable) gZIPInputStream);
                    C10796U2.m27888a((Closeable) byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPInputStream = null;
                byteArrayInputStream = null;
                C10796U2.m27888a((Closeable) gZIPInputStream);
                C10796U2.m27888a((Closeable) byteArrayInputStream);
                throw th;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public C11075ba(C11076a aVar, C11889vm vmVar) {
        this.f26592a = aVar;
        this.f26593b = vmVar;
    }
}
