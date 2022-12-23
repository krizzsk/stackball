package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.gm0;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;

public class as1 extends gm0 {

    /* renamed from: c */
    private final vn1<ImageView, hd0> f30677c;

    public as1(MediaView mediaView, od0 od0) {
        super(mediaView);
        this.f30677c = new vn1<>(od0);
    }

    /* renamed from: a */
    public void mo65866a(View view) {
        this.f30677c.mo70504a();
        super.mo65866a((MediaView) view);
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        MediaView mediaView = (MediaView) view;
        dm0 dm0 = (dm0) obj;
        hd0 a = m33867a(dm0.mo66637a());
        if (dm0.mo66638b() == null && a != null) {
            this.f30677c.mo70508b(a);
        }
    }

    /* renamed from: e */
    public gm0.C13214a mo65827e() {
        return gm0.C13214a.f34041f;
    }

    /* renamed from: a */
    public void mo65867a(C13690k9 k9Var, yn1 yn1, Object obj) {
        dm0 dm0 = (dm0) obj;
        this.f30677c.mo70505a(k9Var, yn1, m33867a(dm0 != null ? dm0.mo66637a() : null));
    }

    /* renamed from: b */
    public boolean mo65868b(dm0 dm0) {
        hd0 a = m33867a(dm0.mo66637a());
        if (dm0.mo66638b() != null || a == null) {
            return false;
        }
        return this.f30677c.mo70506a(a);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo65825a(View view, Object obj) {
        MediaView mediaView = (MediaView) view;
        return mo65868b((dm0) obj);
    }

    /* renamed from: a */
    public void mo65824a(dm0 dm0) {
        hd0 a = m33867a(dm0.mo66637a());
        if (dm0.mo66638b() == null && a != null) {
            this.f30677c.mo70508b(a);
        }
    }

    /* renamed from: a */
    private hd0 m33867a(List<hd0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
