package com.applovin.impl.adview.p009a.p011b;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoViewV2;
import com.applovin.impl.adview.C1039a;
import com.applovin.impl.adview.C1088i;
import com.applovin.impl.adview.C1101l;
import com.applovin.impl.adview.p009a.p010a.C1043c;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1345a;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p024ad.C1362i;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1399ad;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1701R;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.a.b.d */
public class C1061d extends C1044a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final ProgressBar f1879A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C1069a f1880B = new C1069a();

    /* renamed from: C */
    private final Handler f1881C;

    /* renamed from: D */
    private final boolean f1882D;

    /* renamed from: E */
    private int f1883E;

    /* renamed from: F */
    private int f1884F;

    /* renamed from: G */
    private AtomicBoolean f1885G;

    /* renamed from: H */
    private AtomicBoolean f1886H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public long f1887I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public long f1888J;

    /* renamed from: q */
    protected final AppLovinVideoViewV2 f1889q;

    /* renamed from: r */
    protected final C1088i f1890r;

    /* renamed from: s */
    protected boolean f1891s;

    /* renamed from: t */
    protected long f1892t;

    /* renamed from: u */
    protected boolean f1893u;

    /* renamed from: v */
    private final C1043c f1894v = new C1043c(this.f1831a, this.f1834d, this.f1832b);
    /* access modifiers changed from: private */

    /* renamed from: w */
    public MediaPlayer f1895w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C1039a f1896x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C1101l f1897y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final ImageView f1898z;

    /* renamed from: com.applovin.impl.adview.a.b.d$a */
    private class C1069a implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private C1069a() {
        }

        public void onClick(View view, PointF pointF) {
            C1061d.this.mo11861a(pointF);
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            C1061d.this.f1833c.mo13277b("InterActivityV2", "Video completed");
            C1061d.this.mo11866v();
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C1061d dVar = C1061d.this;
            dVar.mo11862c("Video view error (" + i + "," + i2 + ")");
            C1061d.this.f1889q.start();
            return true;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            C1505q qVar = C1061d.this.f1833c;
            qVar.mo13277b("InterActivityV2", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            if (i == 701) {
                if (C1061d.this.f1896x != null) {
                    C1061d.this.f1896x.mo11807a();
                }
                C1061d.this.f1835e.mo12908g();
                return false;
            }
            if (i == 3) {
                C1061d.this.f1890r.mo11957a();
                if (C1061d.this.f1897y != null) {
                    C1061d.this.m1545z();
                }
                if (C1061d.this.f1896x == null) {
                    return false;
                }
            } else if (i != 702 || C1061d.this.f1896x == null) {
                return false;
            }
            C1061d.this.f1896x.mo11808b();
            return false;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayer unused = C1061d.this.f1895w = mediaPlayer;
            mediaPlayer.setOnInfoListener(C1061d.this.f1880B);
            mediaPlayer.setOnErrorListener(C1061d.this.f1880B);
            float f = C1061d.this.f1891s ^ true ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
            C1061d.this.f1892t = (long) mediaPlayer.getDuration();
            C1061d.this.mo11842q();
            C1505q qVar = C1061d.this.f1833c;
            qVar.mo13277b("InterActivityV2", "MediaPlayer prepared: " + C1061d.this.f1895w);
        }
    }

    /* renamed from: com.applovin.impl.adview.a.b.d$b */
    private class C1070b implements View.OnClickListener {
        private C1070b() {
        }

        public void onClick(View view) {
            if (view == C1061d.this.f1897y) {
                if (C1061d.this.mo11841p()) {
                    C1061d.this.mo11863s();
                    C1061d.this.mo11839n();
                    C1061d.this.f1845o.mo12629b();
                    return;
                }
                C1061d.this.mo11864t();
            } else if (view == C1061d.this.f1898z) {
                C1061d.this.mo11865u();
            } else {
                C1505q qVar = C1061d.this.f1833c;
                qVar.mo13281e("InterActivityV2", "Unhandled click on widget: " + view);
            }
        }
    }

    public C1061d(C1355g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, C1469j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(gVar, appLovinFullscreenActivity, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f1881C = handler;
        this.f1890r = new C1088i(handler, this.f1832b);
        this.f1882D = this.f1831a.mo11665d();
        this.f1891s = mo11843r();
        this.f1884F = -1;
        this.f1885G = new AtomicBoolean();
        this.f1886H = new AtomicBoolean();
        this.f1887I = -2;
        this.f1888J = 0;
        if (gVar.hasVideoUrl()) {
            AppLovinVideoViewV2 appLovinVideoViewV2 = new AppLovinVideoViewV2(gVar.mo12786aP(), appLovinFullscreenActivity, jVar);
            this.f1889q = appLovinVideoViewV2;
            appLovinVideoViewV2.setOnPreparedListener(this.f1880B);
            this.f1889q.setOnCompletionListener(this.f1880B);
            this.f1889q.setOnErrorListener(this.f1880B);
            this.f1889q.setOnTouchListener(new AppLovinTouchToClickListener(jVar, C1369c.f2864aG, appLovinFullscreenActivity, this.f1880B));
            C1070b bVar = new C1070b();
            if (gVar.mo12819p() >= 0) {
                C1101l lVar = new C1101l(gVar.mo12823t(), appLovinFullscreenActivity);
                this.f1897y = lVar;
                lVar.setVisibility(8);
                this.f1897y.setOnClickListener(bVar);
            } else {
                this.f1897y = null;
            }
            if (m1535a(this.f1891s, jVar)) {
                ImageView imageView = new ImageView(appLovinFullscreenActivity);
                this.f1898z = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f1898z.setClickable(true);
                this.f1898z.setOnClickListener(bVar);
                m1540d(this.f1891s);
            } else {
                this.f1898z = null;
            }
            if (this.f1882D) {
                C1039a aVar = new C1039a(appLovinFullscreenActivity, ((Integer) jVar.mo13088a(C1369c.f3051dk)).intValue(), 16842874);
                this.f1896x = aVar;
                aVar.setColor(Color.parseColor("#75FFFFFF"));
                this.f1896x.setBackgroundColor(Color.parseColor("#00000000"));
                this.f1896x.setVisibility(8);
            } else {
                this.f1896x = null;
            }
            if (gVar.mo12757Q()) {
                ProgressBar progressBar = new ProgressBar(appLovinFullscreenActivity, (AttributeSet) null, 16842872);
                this.f1879A = progressBar;
                progressBar.setMax(10000);
                this.f1879A.setPadding(0, 0, 0, 0);
                if (C1519g.m3433d()) {
                    this.f1879A.setProgressTintList(ColorStateList.valueOf(gVar.mo12758R()));
                }
                this.f1890r.mo11958a("PROGRESS_BAR", ((Long) jVar.mo13088a(C1369c.f3046df)).longValue(), (C1088i.C1090a) new C1088i.C1090a() {
                    /* renamed from: a */
                    public void mo11867a() {
                        if (C1061d.this.f1893u) {
                            C1061d.this.f1879A.setVisibility(8);
                            return;
                        }
                        C1061d.this.f1879A.setProgress((int) ((((float) C1061d.this.f1889q.getCurrentPosition()) / ((float) C1061d.this.f1892t)) * 10000.0f));
                    }

                    /* renamed from: b */
                    public boolean mo11868b() {
                        return !C1061d.this.f1893u;
                    }
                });
                return;
            }
            this.f1879A = null;
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* renamed from: A */
    private void m1530A() {
        this.f1883E = mo11871y();
        this.f1889q.stopPlayback();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m1531B() {
        C1505q qVar;
        String str;
        if (this.f1893u) {
            qVar = this.f1833c;
            str = "Skip video resume - postitial shown";
        } else if (this.f1832b.mo13084X().mo13378a()) {
            qVar = this.f1833c;
            str = "Skip video resume - app paused";
        } else if (this.f1884F > 0) {
            C1505q qVar2 = this.f1833c;
            qVar2.mo13277b("InterActivityV2", "Resuming video at position " + this.f1884F + "ms for MediaPlayer: " + this.f1895w);
            this.f1889q.start();
            this.f1890r.mo11957a();
            this.f1884F = -1;
            mo11820a((Runnable) new Runnable() {
                public void run() {
                    if (C1061d.this.f1896x != null) {
                        C1061d.this.f1896x.mo11807a();
                        C1061d.this.mo11820a((Runnable) new Runnable() {
                            public void run() {
                                C1061d.this.f1896x.mo11808b();
                            }
                        }, 2000);
                    }
                }
            }, 250);
            return;
        } else {
            this.f1833c.mo13277b("InterActivityV2", "Invalid last video position");
            return;
        }
        qVar.mo13280d("InterActivityV2", str);
    }

    /* renamed from: a */
    private static boolean m1535a(boolean z, C1469j jVar) {
        if (!((Boolean) jVar.mo13088a(C1369c.f2985cW)).booleanValue()) {
            return false;
        }
        if (!((Boolean) jVar.mo13088a(C1369c.f2986cX)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) jVar.mo13088a(C1369c.f2988cZ)).booleanValue();
    }

    /* renamed from: d */
    private void m1540d(boolean z) {
        if (C1519g.m3433d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f1834d.getDrawable(z ? C1701R.C1702drawable.unmute_to_mute : C1701R.C1702drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f1898z.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f1898z.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aK = z ? this.f1831a.mo12781aK() : this.f1831a.mo12782aL();
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f1834d, ((Integer) this.f1832b.mo13088a(C1369c.f3042db)).intValue());
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        AppLovinSdkUtils.safePopulateImageView(this.f1898z, aK, dpToPx);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m1545z() {
        if (this.f1886H.compareAndSet(false, true)) {
            mo11819a(this.f1897y, this.f1831a.mo12819p(), new Runnable() {
                public void run() {
                    long unused = C1061d.this.f1887I = -1;
                    long unused2 = C1061d.this.f1888J = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo11858a() {
        this.f1833c.mo13277b("InterActivityV2", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
    }

    /* renamed from: a */
    public void mo11815a(int i, KeyEvent keyEvent) {
        super.mo11815a(i, keyEvent);
        if ((i == 25 || i == 24) && this.f1831a.mo12790ad() && this.f1891s) {
            mo11865u();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11861a(PointF pointF) {
        if (this.f1831a.mo11680z()) {
            this.f1833c.mo13277b("InterActivityV2", "Clicking through video");
            Uri i = this.f1831a.mo11674i();
            if (i != null) {
                C1522j.m3504a(this.f1842l, (AppLovinAd) this.f1831a);
                this.f1832b.mo13131o().trackAndLaunchVideoClick(this.f1831a, this.f1836f, i, pointF);
                this.f1835e.mo12900b();
            }
        }
    }

    /* renamed from: b */
    public void mo11859b() {
        this.f1833c.mo13277b("InterActivityV2", "Skipping video from prompt");
        mo11864t();
    }

    /* renamed from: c */
    public void mo11827c() {
        this.f1894v.mo11813a(this.f1898z, this.f1897y, this.f1896x, this.f1879A, this.f1889q, this.f1836f);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        mo11823a(!this.f1882D);
        this.f1889q.setVideoURI(this.f1831a.mo11668f());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        this.f1889q.start();
        if (this.f1882D) {
            this.f1896x.mo11807a();
        }
        this.f1836f.renderAd(this.f1831a);
        this.f1835e.mo12901b(this.f1882D ? 1 : 0);
        if (this.f1897y != null) {
            this.f1832b.mo13071K().mo13016a((C1392a) new C1399ad(this.f1832b, new Runnable() {
                public void run() {
                    C1061d.this.m1545z();
                }
            }), C1435s.C1437a.MAIN, this.f1831a.mo12820q(), true);
        }
        super.mo11826b(this.f1891s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11862c(String str) {
        C1505q qVar = this.f1833c;
        qVar.mo13281e("InterActivityV2", "Encountered media error: " + str + " for ad: " + this.f1831a);
        if (this.f1885G.compareAndSet(false, true) && this.f1831a.mo12753M()) {
            if (this.f1843m instanceof C1362i) {
                ((C1362i) this.f1843m).onAdDisplayFailed(str);
            }
            mo11831f();
        }
    }

    /* renamed from: c */
    public void mo11828c(boolean z) {
        super.mo11828c(z);
        if (z) {
            mo11869w();
        } else if (!this.f1893u) {
            mo11863s();
        }
    }

    /* renamed from: f */
    public void mo11831f() {
        this.f1890r.mo11959b();
        this.f1881C.removeCallbacksAndMessages((Object) null);
        mo11837l();
        super.mo11831f();
    }

    /* renamed from: h */
    public void mo11833h() {
        this.f1833c.mo13279c("InterActivityV2", "Destroying video components");
        try {
            if (this.f1889q != null) {
                this.f1889q.pause();
                this.f1889q.stopPlayback();
            }
            if (this.f1895w != null) {
                this.f1895w.release();
            }
        } catch (Throwable th) {
            Log.e("InterActivityV2", "Unable to destroy presenter", th);
        }
        super.mo11833h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo11837l() {
        super.mo11816a(mo11871y(), this.f1882D, mo11870x(), this.f1887I);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo11841p() {
        return this.f1831a.getType() == AppLovinAdType.INCENTIVIZED && !mo11870x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo11842q() {
        long j;
        int j2;
        long j3 = 0;
        if (this.f1831a.mo12799am() >= 0 || this.f1831a.mo12800an() >= 0) {
            int i = (this.f1831a.mo12799am() > 0 ? 1 : (this.f1831a.mo12799am() == 0 ? 0 : -1));
            C1355g gVar = this.f1831a;
            if (i >= 0) {
                j = gVar.mo12799am();
            } else {
                C1345a aVar = (C1345a) gVar;
                long j4 = this.f1892t;
                if (j4 > 0) {
                    j3 = 0 + j4;
                }
                if (aVar.mo12801ao() && ((j2 = (int) ((C1345a) this.f1831a).mo12700j()) > 0 || (j2 = (int) aVar.mo12821r()) > 0)) {
                    j3 += TimeUnit.SECONDS.toMillis((long) j2);
                }
                j = (long) (((double) j3) * (((double) this.f1831a.mo12800an()) / 100.0d));
            }
            mo11817a(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo11863s() {
        String str;
        C1505q qVar;
        this.f1833c.mo13277b("InterActivityV2", "Pausing video");
        if (this.f1889q.isPlaying()) {
            this.f1884F = this.f1889q.getCurrentPosition();
            this.f1889q.pause();
            this.f1890r.mo11960c();
            qVar = this.f1833c;
            str = "Paused video at position " + this.f1884F + "ms";
        } else {
            qVar = this.f1833c;
            str = "Nothing to pause";
        }
        qVar.mo13277b("InterActivityV2", str);
    }

    /* renamed from: t */
    public void mo11864t() {
        this.f1887I = SystemClock.elapsedRealtime() - this.f1888J;
        C1505q qVar = this.f1833c;
        qVar.mo13277b("InterActivityV2", "Skipping video with skip time: " + this.f1887I + "ms");
        this.f1835e.mo12907f();
        if (this.f1831a.mo12824u()) {
            mo11831f();
        } else {
            mo11866v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo11865u() {
        MediaPlayer mediaPlayer = this.f1895w;
        if (mediaPlayer != null) {
            boolean z = !this.f1891s;
            this.f1891s = z;
            float f = z ^ true ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
            m1540d(this.f1891s);
            mo11824a(this.f1891s, 0);
        }
    }

    /* renamed from: v */
    public void mo11866v() {
        this.f1833c.mo13277b("InterActivityV2", "Showing postitial...");
        m1530A();
        this.f1894v.mo11814a(this.f1837g, this.f1836f);
        mo11822a("javascript:al_onPoststitialShow();", (long) this.f1831a.mo12766Z());
        if (this.f1837g != null) {
            int i = (this.f1831a.mo12821r() > 0 ? 1 : (this.f1831a.mo12821r() == 0 ? 0 : -1));
            C1101l lVar = this.f1837g;
            if (i >= 0) {
                mo11819a(lVar, this.f1831a.mo12821r(), new Runnable() {
                    public void run() {
                        C1061d.this.f1839i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                lVar.setVisibility(0);
            }
        }
        this.f1893u = true;
    }

    /* renamed from: w */
    public void mo11869w() {
        mo11820a((Runnable) new Runnable() {
            public void run() {
                C1061d.this.m1531B();
            }
        }, 250);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo11870x() {
        return mo11871y() >= this.f1831a.mo12765Y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public int mo11871y() {
        long currentPosition = (long) this.f1889q.getCurrentPosition();
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.f1892t)) * 100.0f) : this.f1883E;
    }
}
