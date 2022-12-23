package com.inmobi.media;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.gd */
/* compiled from: NetworkResponse */
public class C5300gd {

    /* renamed from: d */
    private static final String f12144d = C5300gd.class.getSimpleName();

    /* renamed from: a */
    public C5298gb f12145a;

    /* renamed from: b */
    public int f12146b;

    /* renamed from: c */
    public Map<String, List<String>> f12147c;

    /* renamed from: e */
    private String f12148e;

    /* renamed from: f */
    private byte[] f12149f;

    /* renamed from: a */
    public final boolean mo40624a() {
        return this.f12145a != null;
    }

    /* renamed from: b */
    public final String mo40625b() {
        if (this.f12148e == null) {
            this.f12148e = m12137a(this.f12149f);
        }
        return this.f12148e;
    }

    /* renamed from: a */
    public static String m12137a(byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return "";
    }

    /* renamed from: c */
    public final byte[] mo40627c() {
        byte[] bArr = this.f12149f;
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: b */
    public final void mo40626b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.f12149f = new byte[0];
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f12149f = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* renamed from: d */
    public final long mo40628d() {
        try {
            if (this.f12148e != null) {
                return ((long) this.f12148e.length()) + 0;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }
}
