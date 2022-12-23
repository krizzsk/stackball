package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.bi */
public class C12589bi {

    /* renamed from: a */
    private final C12731cf f31329a;

    /* renamed from: b */
    private final C14257p6 f31330b;

    /* renamed from: c */
    private final kq0 f31331c;

    /* renamed from: d */
    private final d91 f31332d;

    /* renamed from: e */
    private final k11 f31333e = new k11();

    public C12589bi(Context context, kg0 kg0, og0 og0, ck1<VideoAd> ck1, ln1 ln1, oj1 oj1) {
        this.f31329a = new C12731cf(context, og0, ck1, ln1, oj1);
        this.f31330b = new C14359q6(ck1).mo69497a();
        this.f31331c = new kq0(kg0);
        this.f31332d = new d91(kg0, ck1.mo66323c());
    }

    /* renamed from: a */
    public void mo66072a(qj1 qj1, yf0 yf0) {
        this.f31330b.mo66191a(qj1);
        View d = qj1.mo69607d();
        if (d != null) {
            this.f31329a.mo66278a(d);
        }
        this.f31331c.mo68260a(qj1, yf0);
        View g = qj1.mo69610g();
        if (g != null) {
            this.f31332d.mo66535a(g, yf0);
        }
        ProgressBar f = qj1.mo69609f();
        if (f != null) {
            this.f31333e.getClass();
            f.setProgress((int) (yf0.mo71045b() * ((float) f.getMax())));
        }
    }
}
