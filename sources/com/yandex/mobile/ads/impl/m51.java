package com.yandex.mobile.ads.impl;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class m51 extends BufferedOutputStream {

    /* renamed from: b */
    private boolean f37201b;

    public m51(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public void mo68578a(OutputStream outputStream) {
        C13479j9.m37708b(this.f37201b);
        this.out = outputStream;
        this.count = 0;
        this.f37201b = false;
    }

    public void close() throws IOException {
        this.f37201b = true;
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
            int i = ih1.f34858a;
            throw th;
        }
    }

    public m51(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
