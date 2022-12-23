package com.tapjoy.internal;

import java.nio.CharBuffer;

/* renamed from: com.tapjoy.internal.jy */
public final class C9475jy {
    /* renamed from: a */
    private static long m25458a(Readable readable, Appendable appendable) {
        CharBuffer allocate = CharBuffer.allocate(2048);
        long j = 0;
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return j;
            }
            allocate.flip();
            appendable.append(allocate, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static String m25459a(Readable readable) {
        StringBuilder sb = new StringBuilder();
        m25458a(readable, sb);
        return sb.toString();
    }
}
