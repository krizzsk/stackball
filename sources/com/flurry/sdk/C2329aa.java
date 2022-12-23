package com.flurry.sdk;

import com.flurry.sdk.C2446bp;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.flurry.sdk.aa */
public final class C2329aa {

    /* renamed from: a */
    private static final String f5327a = C2329aa.class.getSimpleName();

    /* renamed from: a */
    public static C2446bp m5003a(File file) {
        DataInputStream dataInputStream;
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return null;
        }
        C2446bp.C2447a aVar = new C2446bp.C2447a();
        try {
            fileInputStream = new FileInputStream(file);
            try {
                dataInputStream = new DataInputStream(fileInputStream);
            } catch (Exception e) {
                e = e;
                dataInputStream = null;
                try {
                    C2530db.m5475a(3, f5327a, "Error loading legacy agent data.", e);
                    C2619em.m5698a((Closeable) dataInputStream);
                    C2619em.m5698a((Closeable) fileInputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    C2619em.m5698a((Closeable) dataInputStream);
                    C2619em.m5698a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
                C2619em.m5698a((Closeable) dataInputStream);
                C2619em.m5698a((Closeable) fileInputStream);
                throw th;
            }
            try {
                if (dataInputStream.readUnsignedShort() != 46586) {
                    C2530db.m5474a(3, f5327a, "Unexpected file type");
                } else {
                    int readUnsignedShort = dataInputStream.readUnsignedShort();
                    if (readUnsignedShort != 2) {
                        C2530db.m5474a(6, f5327a, "Unknown agent file version: ".concat(String.valueOf(readUnsignedShort)));
                    } else {
                        C2446bp bpVar = (C2446bp) aVar.mo17562a(dataInputStream);
                        C2619em.m5698a((Closeable) dataInputStream);
                        C2619em.m5698a((Closeable) fileInputStream);
                        return bpVar;
                    }
                }
                C2619em.m5698a((Closeable) dataInputStream);
                C2619em.m5698a((Closeable) fileInputStream);
                return null;
            } catch (Exception e2) {
                e = e2;
                C2530db.m5475a(3, f5327a, "Error loading legacy agent data.", e);
                C2619em.m5698a((Closeable) dataInputStream);
                C2619em.m5698a((Closeable) fileInputStream);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            dataInputStream = null;
            fileInputStream = null;
            C2530db.m5475a(3, f5327a, "Error loading legacy agent data.", e);
            C2619em.m5698a((Closeable) dataInputStream);
            C2619em.m5698a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            dataInputStream = null;
            C2619em.m5698a((Closeable) dataInputStream);
            C2619em.m5698a((Closeable) fileInputStream);
            throw th;
        }
    }
}
