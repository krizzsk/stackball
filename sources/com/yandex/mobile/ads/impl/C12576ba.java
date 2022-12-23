package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.yandex.mobile.ads.impl.ba */
public final class C12576ba {

    /* renamed from: a */
    private final File f31272a;

    /* renamed from: b */
    private final File f31273b;

    /* renamed from: com.yandex.mobile.ads.impl.ba$a */
    private static final class C12577a extends OutputStream {

        /* renamed from: b */
        private final FileOutputStream f31274b;

        /* renamed from: c */
        private boolean f31275c = false;

        public C12577a(File file) throws FileNotFoundException {
            this.f31274b = new FileOutputStream(file);
        }

        public void close() throws IOException {
            if (!this.f31275c) {
                this.f31275c = true;
                this.f31274b.flush();
                try {
                    this.f31274b.getFD().sync();
                } catch (IOException e) {
                    bk0.m34271b("AtomicFile", "Failed to sync file descriptor:", e);
                }
                this.f31274b.close();
            }
        }

        public void flush() throws IOException {
            this.f31274b.flush();
        }

        public void write(int i) throws IOException {
            this.f31274b.write(i);
        }

        public void write(byte[] bArr) throws IOException {
            this.f31274b.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f31274b.write(bArr, i, i2);
        }
    }

    public C12576ba(File file) {
        this.f31272a = file;
        this.f31273b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public void mo66022a() {
        this.f31272a.delete();
        this.f31273b.delete();
    }

    /* renamed from: b */
    public boolean mo66024b() {
        return this.f31272a.exists() || this.f31273b.exists();
    }

    /* renamed from: c */
    public InputStream mo66025c() throws FileNotFoundException {
        if (this.f31273b.exists()) {
            this.f31272a.delete();
            this.f31273b.renameTo(this.f31272a);
        }
        return new FileInputStream(this.f31272a);
    }

    /* renamed from: d */
    public OutputStream mo66026d() throws IOException {
        if (this.f31272a.exists()) {
            if (this.f31273b.exists()) {
                this.f31272a.delete();
            } else if (!this.f31272a.renameTo(this.f31273b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f31272a + " to backup file " + this.f31273b);
            }
        }
        try {
            return new C12577a(this.f31272a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f31272a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f31272a, e);
            }
            try {
                return new C12577a(this.f31272a);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.f31272a, e2);
            }
        }
    }

    /* renamed from: a */
    public void mo66023a(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f31273b.delete();
    }
}
