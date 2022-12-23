package com.fyber.inneractive.sdk.player.p059c.p078j;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.c */
public final class C3498c implements C3506g {

    /* renamed from: a */
    private final AssetManager f9484a;

    /* renamed from: b */
    private final C3534u<? super C3498c> f9485b;

    /* renamed from: c */
    private Uri f9486c;

    /* renamed from: d */
    private InputStream f9487d;

    /* renamed from: e */
    private long f9488e;

    /* renamed from: f */
    private boolean f9489f;

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.c$a */
    public static final class C3499a extends IOException {
        public C3499a(IOException iOException) {
            super(iOException);
        }
    }

    public C3498c(Context context, C3534u<? super C3498c> uVar) {
        this.f9484a = context.getAssets();
        this.f9485b = uVar;
    }

    /* renamed from: a */
    public final long mo18703a(C3509i iVar) throws C3499a {
        try {
            Uri uri = iVar.f9498a;
            this.f9486c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f9484a.open(path, 1);
            this.f9487d = open;
            if (open.skip(iVar.f9501d) >= iVar.f9501d) {
                if (iVar.f9502e != -1) {
                    this.f9488e = iVar.f9502e;
                } else {
                    long available = (long) this.f9487d.available();
                    this.f9488e = available;
                    if (available == 2147483647L) {
                        this.f9488e = -1;
                    }
                }
                this.f9489f = true;
                C3534u<? super C3498c> uVar = this.f9485b;
                if (uVar != null) {
                    uVar.mo19350a();
                }
                return this.f9488e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C3499a(e);
        }
    }

    /* renamed from: a */
    public final int mo18702a(byte[] bArr, int i, int i2) throws C3499a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9488e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C3499a(e);
            }
        }
        int read = this.f9487d.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f9488e;
            if (j2 != -1) {
                this.f9488e = j2 - ((long) read);
            }
            C3534u<? super C3498c> uVar = this.f9485b;
            if (uVar != null) {
                uVar.mo19351a(read);
            }
            return read;
        } else if (this.f9488e == -1) {
            return -1;
        } else {
            throw new C3499a(new EOFException());
        }
    }

    /* renamed from: a */
    public final Uri mo18704a() {
        return this.f9486c;
    }

    /* renamed from: b */
    public final void mo18705b() throws C3499a {
        this.f9486c = null;
        try {
            if (this.f9487d != null) {
                this.f9487d.close();
            }
            this.f9487d = null;
            if (this.f9489f) {
                this.f9489f = false;
                C3534u<? super C3498c> uVar = this.f9485b;
                if (uVar != null) {
                    uVar.mo19352b();
                }
            }
        } catch (IOException e) {
            throw new C3499a(e);
        } catch (Throwable th) {
            this.f9487d = null;
            if (this.f9489f) {
                this.f9489f = false;
                C3534u<? super C3498c> uVar2 = this.f9485b;
                if (uVar2 != null) {
                    uVar2.mo19352b();
                }
            }
            throw th;
        }
    }
}
