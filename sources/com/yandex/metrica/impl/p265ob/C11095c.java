package com.yandex.metrica.impl.p265ob;

import com.google.android.exoplayer2.C3716C;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.c */
public final class C11095c {

    /* renamed from: a */
    public static final Object f26635a = new Object();

    /* renamed from: a */
    public static byte[] m28614a(String str) {
        try {
            return str.getBytes(C3716C.ISO88591_NAME);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e);
        }
    }
}
