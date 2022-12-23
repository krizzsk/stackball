package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.gm0;
import com.yandex.mobile.ads.nativeads.MediaView;

public class bs1 extends gm0 {

    /* renamed from: c */
    private final vn1<lp0, fl0> f31426c;

    public bs1(MediaView mediaView, np0 np0) {
        super(mediaView);
        this.f31426c = new vn1<>(np0);
    }

    /* renamed from: a */
    public void mo65866a(View view) {
        this.f31426c.mo70504a();
        super.mo65866a((MediaView) view);
    }

    /* renamed from: a */
    public void mo65824a(dm0 dm0) {
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        MediaView mediaView = (MediaView) view;
        dm0 dm0 = (dm0) obj;
        if (dm0.mo66638b() != null) {
            this.f31426c.mo70508b(dm0.mo66638b());
        }
    }

    /* renamed from: e */
    public gm0.C13214a mo65827e() {
        return gm0.C13214a.WEB_VIEW;
    }

    /* renamed from: b */
    public boolean mo66112b(dm0 dm0) {
        if (dm0.mo66638b() != null) {
            return this.f31426c.mo70506a(dm0.mo66638b());
        }
        return false;
    }

    /* renamed from: a */
    public void mo65867a(C13690k9 k9Var, yn1 yn1, Object obj) {
        dm0 dm0 = (dm0) obj;
        this.f31426c.mo70505a(k9Var, yn1, dm0 != null ? dm0.mo66638b() : null);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo65825a(View view, Object obj) {
        MediaView mediaView = (MediaView) view;
        return mo66112b((dm0) obj);
    }
}
