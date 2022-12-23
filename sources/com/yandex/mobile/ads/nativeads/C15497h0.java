package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.C14589sf;

/* renamed from: com.yandex.mobile.ads.nativeads.h0 */
public final class C15497h0 {

    /* renamed from: a */
    private final String f43849a;

    /* renamed from: b */
    private final C15498a f43850b;

    /* renamed from: com.yandex.mobile.ads.nativeads.h0$a */
    public enum C15498a {
        TEXT,
        f43852c
    }

    C15497h0(C14589sf sfVar) {
        this.f43849a = sfVar.mo69962a();
        this.f43850b = sfVar.mo69963b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15497h0.class != obj.getClass()) {
            return false;
        }
        C15497h0 h0Var = (C15497h0) obj;
        String str = this.f43849a;
        if (str == null ? h0Var.f43849a != null : !str.equals(h0Var.f43849a)) {
            return false;
        }
        if (this.f43850b == h0Var.f43850b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f43849a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f43850b.hashCode();
    }
}
