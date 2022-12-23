package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.ds */
public final class C2581ds implements C2587dw<byte[]> {
    /* renamed from: a */
    public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
        byte[] bArr = (byte[]) obj;
        if (outputStream != null && bArr != null) {
            outputStream.write(bArr, 0, bArr.length);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2619em.m5694a(inputStream, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
