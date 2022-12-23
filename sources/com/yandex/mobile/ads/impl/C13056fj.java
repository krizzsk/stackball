package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: com.yandex.mobile.ads.impl.fj */
public final class C13056fj extends C13966mb {

    /* renamed from: e */
    private C13504jj f33375e;

    /* renamed from: f */
    private byte[] f33376f;

    /* renamed from: g */
    private int f33377g;

    /* renamed from: h */
    private int f33378h;

    public C13056fj() {
        super(false);
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws IOException {
        mo68635b(jjVar);
        this.f33375e = jjVar;
        this.f33378h = (int) jjVar.f35327f;
        Uri uri = jjVar.f35322a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String schemeSpecificPart = uri.getSchemeSpecificPart();
            int i = ih1.f34858a;
            String[] split = schemeSpecificPart.split(",", -1);
            if (split.length == 2) {
                String str = split[1];
                if (split[0].contains(";base64")) {
                    try {
                        this.f33376f = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        throw new jy0("Error while parsing Base64 encoded string: " + str, e);
                    }
                } else {
                    this.f33376f = ih1.m37390b(URLDecoder.decode(str, "US-ASCII"));
                }
                long j = jjVar.f35328g;
                int length = j != -1 ? ((int) j) + this.f33378h : this.f33376f.length;
                this.f33377g = length;
                if (length > this.f33376f.length || this.f33378h > length) {
                    this.f33376f = null;
                    throw new C13415ij(0);
                }
                mo68637c(jjVar);
                return ((long) this.f33377g) - ((long) this.f33378h);
            }
            throw new jy0("Unexpected URI format: " + uri);
        }
        throw new jy0("Unsupported scheme: " + scheme);
    }

    public void close() {
        if (this.f33376f != null) {
            this.f33376f = null;
            mo68636c();
        }
        this.f33375e = null;
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f33377g - this.f33378h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f33376f;
        int i4 = ih1.f34858a;
        System.arraycopy(bArr2, this.f33378h, bArr, i, min);
        this.f33378h += min;
        mo68634a(min);
        return min;
    }

    /* renamed from: a */
    public Uri mo65276a() {
        C13504jj jjVar = this.f33375e;
        if (jjVar != null) {
            return jjVar.f35322a;
        }
        return null;
    }
}
