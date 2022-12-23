package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.gm0;
import com.yandex.mobile.ads.nativeads.MediaView;

public class ds1 extends gm0 {

    /* renamed from: c */
    private final vn1<pu0, kj1> f32759c;

    public ds1(MediaView mediaView, qn1 qn1) {
        super(mediaView);
        this.f32759c = new vn1<>(qn1);
    }

    /* renamed from: a */
    public void mo65866a(View view) {
        this.f32759c.mo70504a();
        super.mo65866a((MediaView) view);
    }

    /* renamed from: a */
    public void mo65824a(dm0 dm0) {
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        MediaView mediaView = (MediaView) view;
        kj1 c = ((dm0) obj).mo66639c();
        if (c != null) {
            this.f32759c.mo70508b(c);
        }
    }

    /* renamed from: e */
    public gm0.C13214a mo65827e() {
        return gm0.C13214a.f34039d;
    }

    /* renamed from: a */
    public void mo65867a(C13690k9 k9Var, yn1 yn1, Object obj) {
        dm0 dm0 = (dm0) obj;
        this.f32759c.mo70505a(k9Var, yn1, dm0 != null ? dm0.mo66639c() : null);
    }

    /* renamed from: b */
    public boolean mo66669b(dm0 dm0) {
        if (dm0.mo66639c() != null) {
            return this.f32759c.mo70506a(dm0.mo66639c());
        }
        return false;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo65825a(View view, Object obj) {
        MediaView mediaView = (MediaView) view;
        return mo66669b((dm0) obj);
    }

    /* renamed from: a */
    public void mo66668a() {
        this.f32759c.mo70507b();
    }
}
