package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import com.yandex.mobile.ads.instream.player.p267ad.C15420a;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;

public class o11 implements bl1 {

    /* renamed from: a */
    private final vf0 f38055a;

    /* renamed from: b */
    private final C15420a f38056b = new C15420a();

    /* renamed from: c */
    private final k11 f38057c = new k11();

    public o11(vf0 vf0) {
        this.f38055a = vf0;
    }

    /* renamed from: a */
    public void mo66071a(long j, long j2) {
        qj1 a;
        uf0 a2 = this.f38055a.mo70480a();
        ProgressBar progressBar = null;
        InstreamAdView b = a2 != null ? a2.mo70346b() : null;
        if (!(b == null || (a = this.f38056b.mo71356a(b)) == null)) {
            progressBar = a.mo69609f();
        }
        ProgressBar progressBar2 = progressBar;
        if (progressBar2 != null) {
            this.f38057c.mo68115a(progressBar2, j2, j);
        }
    }
}
