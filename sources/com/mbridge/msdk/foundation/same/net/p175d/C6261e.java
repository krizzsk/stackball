package com.mbridge.msdk.foundation.same.net.p175d;

import com.mbridge.msdk.foundation.same.net.C6263e;
import com.mbridge.msdk.foundation.same.net.C6290i;
import java.io.UnsupportedEncodingException;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.e */
/* compiled from: JsonRequest */
public abstract class C6261e<T> extends C6290i<T> {

    /* renamed from: c */
    private static final String f15533c = C6261e.class.getSimpleName();

    /* renamed from: d */
    private final String f15534d;

    public C6261e(int i, String str, String str2, C6263e<T> eVar) {
        super(i, str, eVar);
        this.f15534d = str2;
    }

    /* renamed from: e */
    public final byte[] mo43844e() {
        try {
            if (this.f15534d == null) {
                return null;
            }
            return this.f15534d.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
