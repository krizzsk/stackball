package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: com.yandex.mobile.ads.impl.xd */
public class C15163xd {

    /* renamed from: a */
    private final Bitmap f42514a;

    /* renamed from: b */
    private final Uri f42515b;

    /* renamed from: c */
    private final byte[] f42516c = null;

    /* renamed from: d */
    private final bd0 f42517d;

    public C15163xd(Bitmap bitmap, byte[] bArr, Uri uri, bd0 bd0) {
        this.f42514a = bitmap;
        this.f42515b = uri;
        this.f42517d = bd0;
    }

    /* renamed from: a */
    public Bitmap mo70883a() {
        return this.f42514a;
    }

    /* renamed from: b */
    public byte[] mo70884b() {
        return this.f42516c;
    }

    /* renamed from: c */
    public Uri mo70885c() {
        return this.f42515b;
    }

    /* renamed from: d */
    public bd0 mo70886d() {
        return this.f42517d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15163xd.class != obj.getClass()) {
            return false;
        }
        C15163xd xdVar = (C15163xd) obj;
        if (!this.f42514a.equals(xdVar.f42514a) || this.f42517d != xdVar.f42517d) {
            return false;
        }
        Uri uri = xdVar.f42515b;
        Uri uri2 = this.f42515b;
        if (uri2 != null) {
            return uri2.equals(uri);
        }
        if (uri == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f42514a.hashCode() * 31) + this.f42517d.hashCode()) * 31;
        Uri uri = this.f42515b;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }
}
