package com.ogury.p244cm.internal;

import com.ogury.p244cm.ConsentActivity;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ogury.cm.internal.abcca */
public final class abcca {

    /* renamed from: a */
    public static final abcca f20481a = new abcca();

    private abcca() {
    }

    /* renamed from: a */
    public static String m21909a(byte[] bArr) throws Exception {
        bbabc.m22051b(bArr, "str");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(bArr)), "UTF-8"));
        try {
            return ConsentActivity.aaaaa.m21627a((Reader) bufferedReader);
        } finally {
            ConsentActivity.aaaaa.m21628a((Closeable) bufferedReader);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static byte[] m21910a(String str) throws Exception {
        bbabc.m22051b(str, "str");
        if (str.length() == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            Charset forName = Charset.forName("UTF-8");
            bbabc.m22048a((Object) forName, "Charset.forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            bbabc.m22048a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            gZIPOutputStream.write(bytes);
            ConsentActivity.aaaaa.m21628a((Closeable) gZIPOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bbabc.m22048a((Object) byteArray, "obj.toByteArray()");
            return byteArray;
        } catch (Throwable th) {
            ConsentActivity.aaaaa.m21628a((Closeable) gZIPOutputStream);
            throw th;
        }
    }
}
