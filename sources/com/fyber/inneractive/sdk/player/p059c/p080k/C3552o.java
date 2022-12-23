package com.fyber.inneractive.sdk.player.p059c.p080k;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.o */
public final class C3552o extends BufferedOutputStream {

    /* renamed from: a */
    private boolean f9635a;

    public C3552o(OutputStream outputStream) {
        super(outputStream);
    }

    public C3552o(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void close() throws IOException {
        this.f9635a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            C3560t.m8882a(th);
        }
    }

    /* renamed from: a */
    public final void mo19414a(OutputStream outputStream) {
        C3535a.m8784b(this.f9635a);
        this.out = outputStream;
        this.count = 0;
        this.f9635a = false;
    }
}
