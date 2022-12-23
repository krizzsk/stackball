package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.dx */
public final class C2588dx implements C2587dw<String> {
    /* renamed from: a */
    public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
        String str = (String) obj;
        if (outputStream != null && str != null) {
            byte[] bytes = str.getBytes("utf-8");
            outputStream.write(bytes, 0, bytes.length);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2619em.m5694a(inputStream, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toString();
    }
}
