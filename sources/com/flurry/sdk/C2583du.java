package com.flurry.sdk;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.flurry.sdk.du */
public final class C2583du<ObjectType> extends C2582dt<ObjectType> {
    public C2583du(C2587dw<ObjectType> dwVar) {
        super(dwVar);
    }

    /* renamed from: a */
    public final void mo17563a(OutputStream outputStream, ObjectType objecttype) throws IOException {
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                try {
                    super.mo17563a(gZIPOutputStream2, objecttype);
                    C2619em.m5698a((Closeable) gZIPOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    C2619em.m5698a((Closeable) gZIPOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C2619em.m5698a((Closeable) gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final ObjectType mo17562a(InputStream inputStream) throws IOException {
        GZIPInputStream gZIPInputStream = null;
        if (inputStream == null) {
            return null;
        }
        try {
            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
            try {
                ObjectType a = super.mo17562a(gZIPInputStream2);
                C2619em.m5698a((Closeable) gZIPInputStream2);
                return a;
            } catch (Throwable th) {
                th = th;
                gZIPInputStream = gZIPInputStream2;
                C2619em.m5698a((Closeable) gZIPInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C2619em.m5698a((Closeable) gZIPInputStream);
            throw th;
        }
    }
}
