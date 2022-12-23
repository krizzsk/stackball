package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.en1;
import com.yandex.mobile.ads.impl.fn1;
import com.yandex.mobile.ads.impl.om1;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* renamed from: com.yandex.mobile.ads.instream.d */
public class C15418d implements VideoPlayerListener {

    /* renamed from: a */
    private final C15419e f43556a;

    /* renamed from: b */
    private final fn1 f43557b;

    /* renamed from: c */
    private final C15412b f43558c;

    /* renamed from: d */
    private om1 f43559d;

    C15418d(C15419e eVar, C15412b bVar) {
        this.f43556a = eVar;
        this.f43557b = eVar.mo71340a();
        this.f43558c = bVar;
    }

    /* renamed from: a */
    public void mo71334a(om1 om1) {
        this.f43559d = om1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo71335b() {
        int ordinal = this.f43557b.mo67050a().ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 6 || ordinal == 7) {
            this.f43557b.mo67051a(en1.INITIAL);
            om1 om1 = this.f43559d;
            if (om1 != null) {
                om1.mo69224a();
            }
        }
    }

    /* renamed from: c */
    public void mo71336c() {
        int ordinal = this.f43557b.mo67050a().ordinal();
        if (ordinal == 2 || ordinal == 3) {
            this.f43556a.mo71344d();
        }
    }

    /* renamed from: d */
    public void mo71337d() {
        this.f43557b.mo67051a(en1.PREPARING);
        this.f43556a.mo71345e();
    }

    /* renamed from: e */
    public void mo71338e() {
        int ordinal = this.f43557b.mo67050a().ordinal();
        if (ordinal == 2 || ordinal == 6) {
            this.f43556a.mo71346f();
        }
    }

    /* renamed from: f */
    public void mo71339f() {
        int ordinal = this.f43557b.mo67050a().ordinal();
        if (ordinal == 1) {
            this.f43557b.mo67051a(en1.INITIAL);
        } else if (ordinal == 2 || ordinal == 3 || ordinal == 6) {
            this.f43557b.mo67051a(en1.STOPPED);
        }
    }

    public void onVideoCompleted() {
        this.f43557b.mo67051a(en1.FINISHED);
        om1 om1 = this.f43559d;
        if (om1 != null) {
            om1.onVideoCompleted();
        }
    }

    public void onVideoError() {
        this.f43557b.mo67051a(en1.ERROR);
        om1 om1 = this.f43559d;
        if (om1 != null) {
            om1.onVideoError();
        }
    }

    public void onVideoPaused() {
        this.f43557b.mo67051a(en1.PAUSED);
        om1 om1 = this.f43559d;
        if (om1 != null) {
            om1.onVideoPaused();
        }
    }

    public void onVideoPrepared() {
        if (en1.PREPARING.equals(this.f43557b.mo67050a())) {
            this.f43557b.mo67051a(en1.PREPARED);
            this.f43558c.mo71321g();
        }
    }

    public void onVideoResumed() {
        this.f43557b.mo67051a(en1.PLAYING);
        om1 om1 = this.f43559d;
        if (om1 != null) {
            om1.onVideoResumed();
        }
    }

    /* renamed from: a */
    public void mo71333a() {
        int ordinal = this.f43557b.mo67050a().ordinal();
        if (ordinal == 0) {
            this.f43558c.mo71322h();
        } else if (ordinal == 7) {
            this.f43558c.mo71320f();
        } else if (ordinal == 4) {
            this.f43556a.mo71344d();
            this.f43558c.mo71324j();
        } else if (ordinal == 5) {
            this.f43558c.mo71317b();
        }
    }
}
