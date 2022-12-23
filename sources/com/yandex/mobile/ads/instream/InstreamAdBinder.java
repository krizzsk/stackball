package com.yandex.mobile.ads.instream;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.C15309zg;
import com.yandex.mobile.ads.impl.bk1;
import com.yandex.mobile.ads.impl.gf0;
import com.yandex.mobile.ads.impl.gg0;
import com.yandex.mobile.ads.impl.if0;
import com.yandex.mobile.ads.impl.mj1;
import com.yandex.mobile.ads.impl.ng0;
import com.yandex.mobile.ads.impl.ng1;
import com.yandex.mobile.ads.impl.nj1;
import com.yandex.mobile.ads.impl.oj1;
import com.yandex.mobile.ads.impl.pj1;
import com.yandex.mobile.ads.impl.qk1;
import com.yandex.mobile.ads.impl.se0;
import com.yandex.mobile.ads.impl.te0;
import com.yandex.mobile.ads.impl.uk1;
import com.yandex.mobile.ads.impl.wg0;
import com.yandex.mobile.ads.impl.xg0;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import java.util.Collections;
import java.util.List;

public class InstreamAdBinder implements ng1 {

    /* renamed from: a */
    private final InstreamAdPlayer f43517a;

    /* renamed from: b */
    private final VideoPlayer f43518b;

    /* renamed from: c */
    private final gg0 f43519c;

    /* renamed from: d */
    private final C15417c f43520d;

    /* renamed from: e */
    private final te0 f43521e = te0.m42325a();

    /* renamed from: f */
    private final if0 f43522f = new if0(this);

    /* renamed from: g */
    private final wg0 f43523g = new wg0(this);

    /* renamed from: h */
    private final se0 f43524h;

    /* renamed from: i */
    private final pj1 f43525i;

    /* renamed from: j */
    private final uk1 f43526j = new uk1();

    public InstreamAdBinder(Context context, InstreamAd instreamAd, InstreamAdPlayer instreamAdPlayer, VideoPlayer videoPlayer) {
        this.f43517a = instreamAdPlayer;
        this.f43518b = videoPlayer;
        C15417c cVar = new C15417c(context, m44865a(instreamAd), new gf0(instreamAdPlayer), new C15419e(videoPlayer));
        this.f43520d = cVar;
        gg0 gg0 = new gg0();
        this.f43519c = gg0;
        cVar.mo71328a((xg0) gg0);
        se0 se0 = new se0();
        this.f43524h = se0;
        pj1 pj1 = new pj1();
        this.f43525i = pj1;
        cVar.mo71327a((oj1) new C15309zg(pj1, se0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71289a(mj1 mj1) {
        this.f43524h.mo69959a(mj1);
    }

    public void bind(InstreamAdView instreamAdView) {
        mo71291a(instreamAdView, Collections.emptyList());
    }

    public void invalidateAdPlayer() {
        this.f43522f.mo67780b(this.f43517a);
        this.f43520d.mo71326a();
    }

    public void invalidateVideoPlayer() {
        this.f43523g.mo70703b(this.f43518b);
        this.f43520d.mo71330b();
    }

    public void prepareAd() {
        this.f43520d.mo71331c();
    }

    public void setInstreamAdListener(InstreamAdListener instreamAdListener) {
        this.f43519c.mo67303a(instreamAdListener);
    }

    public void setVideoAdPlaybackListener(qk1 qk1) {
        this.f43525i.mo69372a(qk1 != null ? this.f43526j.mo70365a(qk1) : null);
    }

    public void unbind() {
        if (this.f43521e.mo70172a(this)) {
            this.f43520d.mo71332d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71290a(nj1 nj1) {
        this.f43524h.mo69960a(nj1);
    }

    /* renamed from: a */
    private ng0 m44865a(InstreamAd instreamAd) {
        if (instreamAd instanceof ng0) {
            return (ng0) instreamAd;
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71291a(InstreamAdView instreamAdView, List<bk1> list) {
        InstreamAdBinder a = this.f43521e.mo70170a((View) instreamAdView);
        if (!equals(a)) {
            if (a != null) {
                a.unbind();
            }
            if (this.f43521e.mo70172a(this)) {
                this.f43520d.mo71332d();
            }
            this.f43521e.mo70171a(instreamAdView, this);
        }
        this.f43522f.mo67779a(this.f43517a);
        this.f43523g.mo70702a(this.f43518b);
        this.f43520d.mo71329a(instreamAdView, list);
    }
}
