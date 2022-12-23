package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;

public class hk0 implements Inroll, Pauseroll, ng1 {

    /* renamed from: a */
    private final og0 f34436a;

    /* renamed from: b */
    private final kk0 f34437b;

    /* renamed from: c */
    private final ok0 f34438c;

    /* renamed from: d */
    private final sk1 f34439d = new sk1();

    /* renamed from: e */
    private final if0 f34440e = new if0(this);

    /* renamed from: f */
    private jk0 f34441f;

    /* renamed from: g */
    private InstreamAdPlayer f34442g;

    public hk0(Context context, og0 og0, C13372i1 i1Var) {
        this.f34436a = og0;
        ok0 ok0 = new ok0();
        this.f34438c = ok0;
        this.f34437b = new kk0(context, og0, i1Var, ok0);
    }

    /* renamed from: a */
    private void m37003a() {
        jk0 jk0 = this.f34441f;
        if (jk0 != null) {
            jk0.mo68015a();
        }
        InstreamAdPlayer instreamAdPlayer = this.f34442g;
        if (instreamAdPlayer != null) {
            this.f34440e.mo67780b(instreamAdPlayer);
        }
        this.f34441f = null;
        this.f34442g = null;
    }

    public InstreamAdBreak getInstreamAdBreak() {
        return this.f34436a;
    }

    public void invalidate() {
        m37003a();
    }

    public void invalidateAdPlayer() {
        m37003a();
    }

    public void pause() {
        jk0 jk0 = this.f34441f;
        if (jk0 != null) {
            jk0.mo68018b();
        }
    }

    public void play(InstreamAdView instreamAdView) {
        jk0 jk0 = this.f34441f;
        if (jk0 != null) {
            jk0.mo68017a(instreamAdView);
        }
    }

    public void prepare(InstreamAdPlayer instreamAdPlayer) {
        m37003a();
        this.f34442g = instreamAdPlayer;
        this.f34440e.mo67779a(instreamAdPlayer);
        jk0 a = this.f34437b.mo68247a(instreamAdPlayer);
        this.f34441f = a;
        a.mo68016a((qk1) this.f34439d);
        this.f34441f.mo68019c();
    }

    public void resume() {
        jk0 jk0 = this.f34441f;
        if (jk0 != null) {
            jk0.mo68020d();
        }
    }

    public void setListener(InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f34438c.mo69193a(instreamAdBreakEventListener);
    }

    public void setVideoAdPlaybackListener(qk1 qk1) {
        this.f34439d.mo70007a(qk1);
    }
}
