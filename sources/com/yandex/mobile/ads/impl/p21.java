package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class p21 extends C13966mb {

    /* renamed from: e */
    private final Resources f38497e;

    /* renamed from: f */
    private Uri f38498f;

    /* renamed from: g */
    private AssetFileDescriptor f38499g;

    /* renamed from: h */
    private InputStream f38500h;

    /* renamed from: i */
    private long f38501i;

    /* renamed from: j */
    private boolean f38502j;

    /* renamed from: com.yandex.mobile.ads.impl.p21$a */
    public static class C14251a extends IOException {
        public C14251a(String str) {
            super(str);
        }

        public C14251a(IOException iOException) {
            super(iOException);
        }
    }

    public p21(Context context) {
        super(false);
        this.f38497e = context.getResources();
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws C14251a {
        try {
            Uri uri = jjVar.f35322a;
            this.f38498f = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                String lastPathSegment = uri.getLastPathSegment();
                lastPathSegment.getClass();
                int parseInt = Integer.parseInt(lastPathSegment);
                mo68635b(jjVar);
                AssetFileDescriptor openRawResourceFd = this.f38497e.openRawResourceFd(parseInt);
                this.f38499g = openRawResourceFd;
                if (openRawResourceFd != null) {
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.f38500h = fileInputStream;
                    fileInputStream.skip(openRawResourceFd.getStartOffset());
                    if (fileInputStream.skip(jjVar.f35327f) >= jjVar.f35327f) {
                        long j = jjVar.f35328g;
                        long j2 = -1;
                        if (j != -1) {
                            this.f38501i = j;
                        } else {
                            long length = openRawResourceFd.getLength();
                            if (length != -1) {
                                j2 = length - jjVar.f35327f;
                            }
                            this.f38501i = j2;
                        }
                        this.f38502j = true;
                        mo68637c(jjVar);
                        return this.f38501i;
                    }
                    throw new EOFException();
                }
                throw new C14251a("Resource is compressed: " + uri);
            }
            throw new C14251a("URI must use scheme rawresource");
        } catch (NumberFormatException unused) {
            throw new C14251a("Resource identifier must be an integer.");
        } catch (IOException e) {
            throw new C14251a(e);
        }
    }

    public void close() throws C14251a {
        this.f38498f = null;
        try {
            InputStream inputStream = this.f38500h;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f38500h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f38499g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f38499g = null;
                if (this.f38502j) {
                    this.f38502j = false;
                    mo68636c();
                }
            } catch (IOException e) {
                throw new C14251a(e);
            } catch (Throwable th) {
                this.f38499g = null;
                if (this.f38502j) {
                    this.f38502j = false;
                    mo68636c();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C14251a(e2);
        } catch (Throwable th2) {
            this.f38500h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f38499g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f38499g = null;
                if (this.f38502j) {
                    this.f38502j = false;
                    mo68636c();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C14251a(e3);
            } catch (Throwable th3) {
                this.f38499g = null;
                if (this.f38502j) {
                    this.f38502j = false;
                    mo68636c();
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws C14251a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f38501i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C14251a(e);
            }
        }
        InputStream inputStream = this.f38500h;
        int i3 = ih1.f34858a;
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f38501i;
            if (j2 != -1) {
                this.f38501i = j2 - ((long) read);
            }
            mo68634a(read);
            return read;
        } else if (this.f38501i == -1) {
            return -1;
        } else {
            throw new C14251a((IOException) new EOFException());
        }
    }

    /* renamed from: a */
    public Uri mo65276a() {
        return this.f38498f;
    }
}
