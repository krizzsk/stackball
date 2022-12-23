package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.C14589sf;

/* renamed from: com.yandex.mobile.ads.nativeads.e */
public final class C15484e extends NativeAdAssets {

    /* renamed from: p */
    private C15497h0 f43832p;

    C15484e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71656a(C14589sf sfVar) {
        this.f43832p = sfVar != null ? new C15497h0(sfVar) : null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15484e.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C15497h0 h0Var = this.f43832p;
        C15497h0 h0Var2 = ((C15484e) obj).f43832p;
        if (h0Var != null) {
            return h0Var.equals(h0Var2);
        }
        if (h0Var2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        C15497h0 h0Var = this.f43832p;
        return hashCode + (h0Var != null ? h0Var.hashCode() : 0);
    }
}
