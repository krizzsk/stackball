package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.mobile.ads.impl.C13325hj;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class x60 extends C13966mb {

    /* renamed from: e */
    private RandomAccessFile f42439e;

    /* renamed from: f */
    private Uri f42440f;

    /* renamed from: g */
    private long f42441g;

    /* renamed from: h */
    private boolean f42442h;

    /* renamed from: com.yandex.mobile.ads.impl.x60$a */
    public static final class C15149a implements C13325hj.C13326a {
        /* renamed from: a */
        public C13325hj mo66840a() {
            return new x60();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x60$b */
    public static class C15150b extends IOException {
        public C15150b(IOException iOException) {
            super(iOException);
        }

        public C15150b(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public x60() {
        super(false);
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws C15150b {
        try {
            Uri uri = jjVar.f35322a;
            this.f42440f = uri;
            mo68635b(jjVar);
            RandomAccessFile a = m43965a(uri);
            this.f42439e = a;
            a.seek(jjVar.f35327f);
            long j = jjVar.f35328g;
            if (j == -1) {
                j = this.f42439e.length() - jjVar.f35327f;
            }
            this.f42441g = j;
            if (j >= 0) {
                this.f42442h = true;
                mo68637c(jjVar);
                return this.f42441g;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C15150b(e);
        }
    }

    public void close() throws C15150b {
        this.f42440f = null;
        try {
            RandomAccessFile randomAccessFile = this.f42439e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f42439e = null;
            if (this.f42442h) {
                this.f42442h = false;
                mo68636c();
            }
        } catch (IOException e) {
            throw new C15150b(e);
        } catch (Throwable th) {
            this.f42439e = null;
            if (this.f42442h) {
                this.f42442h = false;
                mo68636c();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static RandomAccessFile m43965a(Uri uri) throws C15150b {
        try {
            String path = uri.getPath();
            path.getClass();
            return new RandomAccessFile(path, CampaignEx.JSON_KEY_AD_R);
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C15150b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e);
            }
            throw new C15150b(e);
        }
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws C15150b {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f42441g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f42439e;
            int i3 = ih1.f34858a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f42441g -= (long) read;
                mo68634a(read);
            }
            return read;
        } catch (IOException e) {
            throw new C15150b(e);
        }
    }

    /* renamed from: a */
    public Uri mo65276a() {
        return this.f42440f;
    }
}
