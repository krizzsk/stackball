package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.flurry.sdk.es */
public final class C2627es {

    /* renamed from: c */
    private static SimpleDateFormat f6171c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);

    /* renamed from: a */
    String f6172a;

    /* renamed from: b */
    long f6173b;

    public C2627es(String str, long j) {
        this.f6172a = str;
        this.f6173b = j;
    }

    /* renamed from: a */
    public final byte[] mo17827a() {
        Throwable th;
        DataOutputStream dataOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream2.writeLong(this.f6173b);
                dataOutputStream2.writeUTF(this.f6172a);
                dataOutputStream2.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C2619em.m5698a((Closeable) dataOutputStream2);
                return byteArray;
            } catch (IOException unused) {
                dataOutputStream = dataOutputStream2;
                try {
                    byte[] bArr = new byte[0];
                    C2619em.m5698a((Closeable) dataOutputStream);
                    return bArr;
                } catch (Throwable th2) {
                    dataOutputStream2 = dataOutputStream;
                    th = th2;
                    C2619em.m5698a((Closeable) dataOutputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C2619em.m5698a((Closeable) dataOutputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            byte[] bArr2 = new byte[0];
            C2619em.m5698a((Closeable) dataOutputStream);
            return bArr2;
        }
    }

    public final String toString() {
        return f6171c.format(Long.valueOf(this.f6173b)) + ": " + this.f6172a + "\n";
    }
}
