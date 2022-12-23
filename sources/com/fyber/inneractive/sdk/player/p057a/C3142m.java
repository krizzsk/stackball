package com.fyber.inneractive.sdk.player.p057a;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.a.m */
final class C3142m {

    /* renamed from: a */
    static final Charset f7763a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f7764b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m7410a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m7410a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    /* renamed from: a */
    static void m7409a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    static void m7411a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
