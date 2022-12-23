package com.tapjoy.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.bg */
public final class C9091bg {
    /* renamed from: a */
    public static String m24334a(File file, Charset charset) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return C9475jy.m25459a(new InputStreamReader(fileInputStream, charset));
        } finally {
            C9476jz.m25460a(fileInputStream);
        }
    }

    /* renamed from: a */
    public static void m24335a(OutputStream outputStream, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, C9066ak.f22357c);
        outputStreamWriter.write(str);
        outputStreamWriter.flush();
    }

    @Nullable
    /* renamed from: a */
    public static String m24333a(File file) {
        try {
            return m24334a(file, C9066ak.f22357c);
        } catch (IOException unused) {
            return null;
        }
    }
}
