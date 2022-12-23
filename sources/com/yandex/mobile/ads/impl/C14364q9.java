package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.yandex.mobile.ads.impl.q9 */
public final class C14364q9 extends C13966mb {

    /* renamed from: e */
    private final AssetManager f39023e;

    /* renamed from: f */
    private Uri f39024f;

    /* renamed from: g */
    private InputStream f39025g;

    /* renamed from: h */
    private long f39026h;

    /* renamed from: i */
    private boolean f39027i;

    /* renamed from: com.yandex.mobile.ads.impl.q9$a */
    public static final class C14365a extends IOException {
        public C14365a(IOException iOException) {
            super(iOException);
        }
    }

    public C14364q9(Context context) {
        super(false);
        this.f39023e = context.getAssets();
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws C14365a {
        try {
            Uri uri = jjVar.f35322a;
            this.f39024f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo68635b(jjVar);
            InputStream open = this.f39023e.open(path, 1);
            this.f39025g = open;
            if (open.skip(jjVar.f35327f) >= jjVar.f35327f) {
                long j = jjVar.f35328g;
                if (j != -1) {
                    this.f39026h = j;
                } else {
                    long available = (long) this.f39025g.available();
                    this.f39026h = available;
                    if (available == 2147483647L) {
                        this.f39026h = -1;
                    }
                }
                this.f39027i = true;
                mo68637c(jjVar);
                return this.f39026h;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C14365a(e);
        }
    }

    public void close() throws C14365a {
        this.f39024f = null;
        try {
            InputStream inputStream = this.f39025g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f39025g = null;
            if (this.f39027i) {
                this.f39027i = false;
                mo68636c();
            }
        } catch (IOException e) {
            throw new C14365a(e);
        } catch (Throwable th) {
            this.f39025g = null;
            if (this.f39027i) {
                this.f39027i = false;
                mo68636c();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws C14365a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f39026h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C14365a(e);
            }
        }
        InputStream inputStream = this.f39025g;
        int i3 = ih1.f34858a;
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f39026h;
            if (j2 != -1) {
                this.f39026h = j2 - ((long) read);
            }
            mo68634a(read);
            return read;
        } else if (this.f39026h == -1) {
            return -1;
        } else {
            throw new C14365a(new EOFException());
        }
    }

    /* renamed from: a */
    public Uri mo65276a() {
        return this.f39024f;
    }
}
