package com.yandex.mobile.ads.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.yandex.mobile.ads.impl.rh */
public final class C14460rh extends C13966mb {

    /* renamed from: e */
    private final ContentResolver f39456e;

    /* renamed from: f */
    private Uri f39457f;

    /* renamed from: g */
    private AssetFileDescriptor f39458g;

    /* renamed from: h */
    private FileInputStream f39459h;

    /* renamed from: i */
    private long f39460i;

    /* renamed from: j */
    private boolean f39461j;

    /* renamed from: com.yandex.mobile.ads.impl.rh$a */
    public static class C14461a extends IOException {
        public C14461a(IOException iOException) {
            super(iOException);
        }
    }

    public C14460rh(Context context) {
        super(false);
        this.f39456e = context.getContentResolver();
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws C14461a {
        try {
            Uri uri = jjVar.f35322a;
            this.f39457f = uri;
            mo68635b(jjVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f39456e.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
            this.f39458g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f39459h = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(jjVar.f35327f + startOffset) - startOffset;
                if (skip == jjVar.f35327f) {
                    long j = jjVar.f35328g;
                    long j2 = -1;
                    if (j != -1) {
                        this.f39460i = j;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j2 = size - channel.position();
                            }
                            this.f39460i = j2;
                        } else {
                            this.f39460i = length - skip;
                        }
                    }
                    this.f39461j = true;
                    mo68637c(jjVar);
                    return this.f39460i;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + uri);
        } catch (IOException e) {
            throw new C14461a(e);
        }
    }

    public void close() throws C14461a {
        this.f39457f = null;
        try {
            FileInputStream fileInputStream = this.f39459h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f39459h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f39458g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f39458g = null;
                if (this.f39461j) {
                    this.f39461j = false;
                    mo68636c();
                }
            } catch (IOException e) {
                throw new C14461a(e);
            } catch (Throwable th) {
                this.f39458g = null;
                if (this.f39461j) {
                    this.f39461j = false;
                    mo68636c();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C14461a(e2);
        } catch (Throwable th2) {
            this.f39459h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f39458g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f39458g = null;
                if (this.f39461j) {
                    this.f39461j = false;
                    mo68636c();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C14461a(e3);
            } catch (Throwable th3) {
                this.f39458g = null;
                if (this.f39461j) {
                    this.f39461j = false;
                    mo68636c();
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws C14461a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f39460i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C14461a(e);
            }
        }
        FileInputStream fileInputStream = this.f39459h;
        int i3 = ih1.f34858a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f39460i;
            if (j2 != -1) {
                this.f39460i = j2 - ((long) read);
            }
            mo68634a(read);
            return read;
        } else if (this.f39460i == -1) {
            return -1;
        } else {
            throw new C14461a(new EOFException());
        }
    }

    /* renamed from: a */
    public Uri mo65276a() {
        return this.f39457f;
    }
}
