package com.fyber.inneractive.sdk.player.p059c.p078j;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.e */
public final class C3502e implements C3506g {

    /* renamed from: a */
    private final ContentResolver f9490a;

    /* renamed from: b */
    private final C3534u<? super C3502e> f9491b;

    /* renamed from: c */
    private Uri f9492c;

    /* renamed from: d */
    private AssetFileDescriptor f9493d;

    /* renamed from: e */
    private InputStream f9494e;

    /* renamed from: f */
    private long f9495f;

    /* renamed from: g */
    private boolean f9496g;

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.e$a */
    public static class C3503a extends IOException {
        public C3503a(IOException iOException) {
            super(iOException);
        }
    }

    public C3502e(Context context, C3534u<? super C3502e> uVar) {
        this.f9490a = context.getContentResolver();
        this.f9491b = uVar;
    }

    /* renamed from: a */
    public final long mo18703a(C3509i iVar) throws C3503a {
        try {
            Uri uri = iVar.f9498a;
            this.f9492c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f9490a.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
            this.f9493d = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f9494e = new FileInputStream(this.f9493d.getFileDescriptor());
                long startOffset = this.f9493d.getStartOffset();
                if (this.f9494e.skip(iVar.f9501d + startOffset) - startOffset == iVar.f9501d) {
                    if (iVar.f9502e != -1) {
                        this.f9495f = iVar.f9502e;
                    } else {
                        long length = this.f9493d.getLength();
                        this.f9495f = length;
                        if (length == -1) {
                            long available = (long) this.f9494e.available();
                            this.f9495f = available;
                            if (available == 0) {
                                this.f9495f = -1;
                            }
                        }
                    }
                    this.f9496g = true;
                    C3534u<? super C3502e> uVar = this.f9491b;
                    if (uVar != null) {
                        uVar.mo19350a();
                    }
                    return this.f9495f;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f9492c);
        } catch (IOException e) {
            throw new C3503a(e);
        }
    }

    /* renamed from: a */
    public final int mo18702a(byte[] bArr, int i, int i2) throws C3503a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9495f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C3503a(e);
            }
        }
        int read = this.f9494e.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f9495f;
            if (j2 != -1) {
                this.f9495f = j2 - ((long) read);
            }
            C3534u<? super C3502e> uVar = this.f9491b;
            if (uVar != null) {
                uVar.mo19351a(read);
            }
            return read;
        } else if (this.f9495f == -1) {
            return -1;
        } else {
            throw new C3503a(new EOFException());
        }
    }

    /* renamed from: a */
    public final Uri mo18704a() {
        return this.f9492c;
    }

    /* renamed from: b */
    public final void mo18705b() throws C3503a {
        this.f9492c = null;
        try {
            if (this.f9494e != null) {
                this.f9494e.close();
            }
            this.f9494e = null;
            try {
                if (this.f9493d != null) {
                    this.f9493d.close();
                }
                this.f9493d = null;
                if (this.f9496g) {
                    this.f9496g = false;
                    C3534u<? super C3502e> uVar = this.f9491b;
                    if (uVar != null) {
                        uVar.mo19352b();
                    }
                }
            } catch (IOException e) {
                throw new C3503a(e);
            } catch (Throwable th) {
                this.f9493d = null;
                if (this.f9496g) {
                    this.f9496g = false;
                    C3534u<? super C3502e> uVar2 = this.f9491b;
                    if (uVar2 != null) {
                        uVar2.mo19352b();
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C3503a(e2);
        } catch (Throwable th2) {
            this.f9494e = null;
            try {
                if (this.f9493d != null) {
                    this.f9493d.close();
                }
                this.f9493d = null;
                if (this.f9496g) {
                    this.f9496g = false;
                    C3534u<? super C3502e> uVar3 = this.f9491b;
                    if (uVar3 != null) {
                        uVar3.mo19352b();
                    }
                }
                throw th2;
            } catch (IOException e3) {
                throw new C3503a(e3);
            } catch (Throwable th3) {
                this.f9493d = null;
                if (this.f9496g) {
                    this.f9496g = false;
                    C3534u<? super C3502e> uVar4 = this.f9491b;
                    if (uVar4 != null) {
                        uVar4.mo19352b();
                    }
                }
                throw th3;
            }
        }
    }
}
