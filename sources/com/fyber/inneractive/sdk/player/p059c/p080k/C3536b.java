package com.fyber.inneractive.sdk.player.p059c.p080k;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.b */
public final class C3536b {

    /* renamed from: a */
    public final File f9586a;

    /* renamed from: b */
    public final File f9587b;

    public C3536b(File file) {
        this.f9586a = file;
        this.f9587b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public final OutputStream mo19363a() throws IOException {
        if (this.f9586a.exists()) {
            if (this.f9587b.exists()) {
                this.f9586a.delete();
            } else if (!this.f9586a.renameTo(this.f9587b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f9586a + " to backup file " + this.f9587b);
            }
        }
        try {
            return new C3537a(this.f9586a);
        } catch (FileNotFoundException unused) {
            if (this.f9586a.getParentFile().mkdirs()) {
                try {
                    return new C3537a(this.f9586a);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.f9586a);
                }
            } else {
                throw new IOException("Couldn't create directory " + this.f9586a);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.k.b$a */
    private static final class C3537a extends OutputStream {

        /* renamed from: a */
        private final FileOutputStream f9588a;

        /* renamed from: b */
        private boolean f9589b = false;

        public C3537a(File file) throws FileNotFoundException {
            this.f9588a = new FileOutputStream(file);
        }

        public final void close() throws IOException {
            if (!this.f9589b) {
                this.f9589b = true;
                flush();
                try {
                    this.f9588a.getFD().sync();
                } catch (IOException e) {
                    Log.w("AtomicFile", "Failed to sync file descriptor:", e);
                }
                this.f9588a.close();
            }
        }

        public final void flush() throws IOException {
            this.f9588a.flush();
        }

        public final void write(int i) throws IOException {
            this.f9588a.write(i);
        }

        public final void write(byte[] bArr) throws IOException {
            this.f9588a.write(bArr);
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.f9588a.write(bArr, i, i2);
        }
    }
}
