package com.fyber.inneractive.sdk.player.p059c.p078j;

import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.p */
public final class C3517p implements C3506g {

    /* renamed from: a */
    private final C3534u<? super C3517p> f9557a;

    /* renamed from: b */
    private RandomAccessFile f9558b;

    /* renamed from: c */
    private Uri f9559c;

    /* renamed from: d */
    private long f9560d;

    /* renamed from: e */
    private boolean f9561e;

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.p$a */
    public static class C3518a extends IOException {
        public C3518a(IOException iOException) {
            super(iOException);
        }
    }

    public C3517p() {
        this((C3534u<? super C3517p>) null);
    }

    public C3517p(C3534u<? super C3517p> uVar) {
        this.f9557a = uVar;
    }

    /* renamed from: a */
    public final long mo18703a(C3509i iVar) throws C3518a {
        try {
            this.f9559c = iVar.f9498a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(iVar.f9498a.getPath(), CampaignEx.JSON_KEY_AD_R);
            this.f9558b = randomAccessFile;
            randomAccessFile.seek(iVar.f9501d);
            long length = iVar.f9502e == -1 ? this.f9558b.length() - iVar.f9501d : iVar.f9502e;
            this.f9560d = length;
            if (length >= 0) {
                this.f9561e = true;
                C3534u<? super C3517p> uVar = this.f9557a;
                if (uVar != null) {
                    uVar.mo19350a();
                }
                return this.f9560d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C3518a(e);
        }
    }

    /* renamed from: a */
    public final int mo18702a(byte[] bArr, int i, int i2) throws C3518a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9560d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f9558b.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f9560d -= (long) read;
                C3534u<? super C3517p> uVar = this.f9557a;
                if (uVar != null) {
                    uVar.mo19351a(read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new C3518a(e);
        }
    }

    /* renamed from: a */
    public final Uri mo18704a() {
        return this.f9559c;
    }

    /* renamed from: b */
    public final void mo18705b() throws C3518a {
        this.f9559c = null;
        try {
            if (this.f9558b != null) {
                this.f9558b.close();
            }
            this.f9558b = null;
            if (this.f9561e) {
                this.f9561e = false;
                C3534u<? super C3517p> uVar = this.f9557a;
                if (uVar != null) {
                    uVar.mo19352b();
                }
            }
        } catch (IOException e) {
            throw new C3518a(e);
        } catch (Throwable th) {
            this.f9558b = null;
            if (this.f9561e) {
                this.f9561e = false;
                C3534u<? super C3517p> uVar2 = this.f9557a;
                if (uVar2 != null) {
                    uVar2.mo19352b();
                }
            }
            throw th;
        }
    }
}
