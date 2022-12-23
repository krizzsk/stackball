package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.C1088i;
import com.applovin.impl.adview.C1153u;
import com.applovin.impl.p008a.C1000a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1452e;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p023a.C1333b;
import com.applovin.impl.sdk.p024ad.C1345a;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p024ad.C1361h;
import com.applovin.impl.sdk.p024ad.C1362i;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p026c.C1382d;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C1512a;
import com.applovin.impl.sdk.utils.C1513b;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1554p;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1701R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.n */
public abstract class C1103n extends Activity implements C1092j, C1452e.C1454a {
    public static final String KEY_WRAPPER_ID = "com.applovin.interstitial.wrapper_id";
    public static volatile C1138o lastKnownWrapper;

    /* renamed from: A */
    private boolean f1991A;

    /* renamed from: B */
    private final Handler f1992B = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final Handler f1993C = new Handler(Looper.getMainLooper());

    /* renamed from: D */
    private FrameLayout f1994D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C1086h f1995E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public View f1996F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C1086h f1997G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public View f1998H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C1083f f1999I;

    /* renamed from: J */
    private ImageView f2000J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public WeakReference<MediaPlayer> f2001K = new WeakReference<>((Object) null);

    /* renamed from: L */
    private C1333b f2002L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C1152t f2003M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public ProgressBar f2004N;

    /* renamed from: O */
    private C1153u.C1154a f2005O;

    /* renamed from: P */
    private C1039a f2006P;

    /* renamed from: Q */
    private C1554p f2007Q;

    /* renamed from: R */
    private C1512a f2008R;

    /* renamed from: S */
    private AppLovinBroadcastManager.Receiver f2009S;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1102m f2010a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1138o f2011b;

    /* renamed from: c */
    private volatile boolean f2012c = false;
    protected int computedLengthSeconds = 0;
    protected C1088i countdownManager;
    public volatile C1355g currentAd;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1382d f2013d;

    /* renamed from: e */
    private volatile boolean f2014e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile boolean f2015f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile boolean f2016g = false;

    /* renamed from: h */
    private volatile boolean f2017h = false;

    /* renamed from: i */
    private volatile boolean f2018i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile boolean f2019j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f2020k = false;

    /* renamed from: l */
    private boolean f2021l = false;
    public C1505q logger;

    /* renamed from: m */
    private volatile boolean f2022m = false;

    /* renamed from: n */
    private boolean f2023n = true;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f2024o = false;

    /* renamed from: p */
    private long f2025p = 0;
    protected volatile boolean postitialWasDisplayed = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f2026q = 0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public long f2027r = 0;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f2028s = 0;
    public C1469j sdk;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f2029t = -2;

    /* renamed from: u */
    private int f2030u = 0;

    /* renamed from: v */
    private int f2031v = Integer.MIN_VALUE;
    protected volatile boolean videoMuted = false;
    public AppLovinVideoView videoView;

    /* renamed from: w */
    private AtomicBoolean f2032w = new AtomicBoolean(false);

    /* renamed from: x */
    private AtomicBoolean f2033x = new AtomicBoolean(false);

    /* renamed from: y */
    private AtomicBoolean f2034y = new AtomicBoolean(false);

    /* renamed from: z */
    private int f2035z = C1452e.f3420a;

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m1633A() {
        if (m1638C()) {
            m1652M();
            pauseReportRewardTask();
            this.logger.mo13277b("InterActivity", "Prompting incentivized ad close warning");
            this.f2002L.mo12629b();
            return;
        }
        skipVideo();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m1636B() {
        C1072c adWebView;
        if (this.currentAd.mo12789ac() && (adWebView = ((AdViewControllerImpl) this.f2010a.getAdViewController()).getAdWebView()) != null) {
            adWebView.mo11889a("javascript:al_onCloseButtonTapped();");
        }
        if (m1639D()) {
            this.logger.mo13277b("InterActivity", "Prompting incentivized non-video ad close warning");
            this.f2002L.mo12630c();
            return;
        }
        dismiss();
    }

    /* renamed from: C */
    private boolean m1638C() {
        return m1646G() && !isFullyWatched() && ((Boolean) this.sdk.mo13088a(C1369c.f2923bM)).booleanValue() && this.f2002L != null;
    }

    /* renamed from: D */
    private boolean m1639D() {
        return m1647H() && !m1644F() && ((Boolean) this.sdk.mo13088a(C1369c.f2928bR)).booleanValue() && this.f2002L != null;
    }

    /* renamed from: E */
    private int m1641E() {
        if (!(this.currentAd instanceof C1345a)) {
            return 0;
        }
        float j = ((C1345a) this.currentAd).mo12700j();
        if (j <= 0.0f) {
            j = (float) this.currentAd.mo12821r();
        }
        return (int) Math.min((C1557r.m3575a(System.currentTimeMillis() - this.f2025p) / ((double) j)) * 100.0d, 100.0d);
    }

    /* renamed from: F */
    private boolean m1644F() {
        return m1641E() >= this.currentAd.mo12765Y();
    }

    /* renamed from: G */
    private boolean m1646G() {
        return AppLovinAdType.INCENTIVIZED.equals(this.currentAd.getType());
    }

    /* renamed from: H */
    private boolean m1647H() {
        return !this.currentAd.hasVideoUrl() && m1646G();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r1 > 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        if (r1 > 0) goto L_0x008a;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1648I() {
        /*
            r7 = this;
            com.applovin.impl.sdk.ad.g r0 = r7.currentAd
            if (r0 == 0) goto L_0x00d9
            com.applovin.impl.sdk.ad.g r0 = r7.currentAd
            long r0 = r0.mo12799am()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0018
            com.applovin.impl.sdk.ad.g r0 = r7.currentAd
            int r0 = r0.mo12800an()
            if (r0 < 0) goto L_0x00d9
        L_0x0018:
            com.applovin.impl.sdk.utils.p r0 = r7.f2007Q
            if (r0 != 0) goto L_0x00d9
            com.applovin.impl.sdk.ad.g r0 = r7.currentAd
            long r0 = r0.mo12799am()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x002e
            com.applovin.impl.sdk.ad.g r0 = r7.currentAd
            long r0 = r0.mo12799am()
            goto L_0x00a9
        L_0x002e:
            boolean r0 = r7.isVastAd()
            if (r0 == 0) goto L_0x0069
            com.applovin.impl.sdk.ad.g r0 = r7.currentAd
            com.applovin.impl.a.a r0 = (com.applovin.impl.p008a.C1000a) r0
            com.applovin.impl.a.j r1 = r0.mo11676k()
            if (r1 == 0) goto L_0x0051
            int r4 = r1.mo11730b()
            if (r4 <= 0) goto L_0x0051
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            int r1 = r1.mo11730b()
            long r5 = (long) r1
            long r4 = r4.toMillis(r5)
            long r2 = r2 + r4
            goto L_0x005b
        L_0x0051:
            com.applovin.impl.adview.AppLovinVideoView r1 = r7.videoView
            int r1 = r1.getDuration()
            if (r1 <= 0) goto L_0x005b
            long r4 = (long) r1
            long r2 = r2 + r4
        L_0x005b:
            boolean r1 = r0.mo12801ao()
            if (r1 == 0) goto L_0x009b
            long r0 = r0.mo12821r()
            int r1 = (int) r0
            if (r1 <= 0) goto L_0x009b
            goto L_0x008a
        L_0x0069:
            com.applovin.impl.sdk.ad.g r0 = r7.currentAd
            boolean r0 = r0 instanceof com.applovin.impl.sdk.p024ad.C1345a
            if (r0 == 0) goto L_0x009b
            com.applovin.impl.sdk.ad.g r0 = r7.currentAd
            com.applovin.impl.sdk.ad.a r0 = (com.applovin.impl.sdk.p024ad.C1345a) r0
            com.applovin.impl.adview.AppLovinVideoView r1 = r7.videoView
            int r1 = r1.getDuration()
            if (r1 <= 0) goto L_0x007d
            long r4 = (long) r1
            long r2 = r2 + r4
        L_0x007d:
            boolean r1 = r0.mo12801ao()
            if (r1 == 0) goto L_0x009b
            float r1 = r0.mo12700j()
            int r1 = (int) r1
            if (r1 <= 0) goto L_0x0093
        L_0x008a:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = (long) r1
            long r0 = r0.toMillis(r4)
            long r2 = r2 + r0
            goto L_0x009b
        L_0x0093:
            long r0 = r0.mo12821r()
            int r1 = (int) r0
            if (r1 <= 0) goto L_0x009b
            goto L_0x008a
        L_0x009b:
            double r0 = (double) r2
            com.applovin.impl.sdk.ad.g r2 = r7.currentAd
            int r2 = r2.mo12800an()
            double r2 = (double) r2
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r4
            double r0 = r0 * r2
            long r0 = (long) r0
        L_0x00a9:
            com.applovin.impl.sdk.q r2 = r7.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Scheduling report reward in "
            r3.append(r4)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r4.toSeconds(r0)
            r3.append(r4)
            java.lang.String r4 = " seconds..."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "InterActivity"
            r2.mo13277b(r4, r3)
            com.applovin.impl.sdk.j r2 = r7.sdk
            com.applovin.impl.adview.n$17 r3 = new com.applovin.impl.adview.n$17
            r3.<init>()
            com.applovin.impl.sdk.utils.p r0 = com.applovin.impl.sdk.utils.C1554p.m3559a(r0, r2, r3)
            r7.f2007Q = r0
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C1103n.m1648I():void");
    }

    /* renamed from: J */
    private void m1649J() {
        View view;
        String str;
        StringBuilder sb;
        C1505q qVar;
        C1102m mVar = this.f2010a;
        if (mVar != null) {
            mVar.setAdDisplayListener(new AppLovinAdDisplayListener() {
                public void adDisplayed(AppLovinAd appLovinAd) {
                    if (!C1103n.this.f2015f) {
                        C1103n.this.m1667a(appLovinAd);
                    }
                }

                public void adHidden(AppLovinAd appLovinAd) {
                    C1103n.this.m1681b(appLovinAd);
                }
            });
            this.f2010a.setAdClickListener(new AppLovinAdClickListener() {
                public void adClicked(AppLovinAd appLovinAd) {
                    C1522j.m3504a(C1103n.this.f2011b.mo12038e(), appLovinAd);
                }
            });
            this.currentAd = this.f2011b.mo12035b();
            if (this.f2033x.compareAndSet(false, true)) {
                this.sdk.mo13131o().trackImpression(this.currentAd);
                this.currentAd.setHasShown(true);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout = new FrameLayout(this);
            this.f1994D = frameLayout;
            frameLayout.setLayoutParams(layoutParams);
            this.f1994D.setBackgroundColor(this.currentAd.mo12748H());
            this.countdownManager = new C1088i(this.f1992B, this.sdk);
            m1705j();
            if (this.currentAd.isVideoAd()) {
                this.f2022m = this.currentAd.mo11665d();
                if (this.f2022m) {
                    qVar = this.logger;
                    sb = new StringBuilder();
                    str = "Preparing stream for ";
                } else {
                    qVar = this.logger;
                    sb = new StringBuilder();
                    str = "Preparing cached video playback for ";
                }
                sb.append(str);
                sb.append(this.currentAd.mo11668f());
                qVar.mo13277b("InterActivity", sb.toString());
                C1382d dVar = this.f2013d;
                if (dVar != null) {
                    dVar.mo12901b(this.f2022m ? 1 : 0);
                }
            }
            this.videoMuted = m1704i();
            Uri f = this.currentAd.mo11668f();
            m1662a(f);
            if (f == null) {
                m1648I();
            }
            this.f1995E.bringToFront();
            if (m1714n() && (view = this.f1996F) != null) {
                view.bringToFront();
            }
            C1086h hVar = this.f1997G;
            if (hVar != null) {
                hVar.bringToFront();
            }
            if (((Boolean) this.sdk.mo13088a(C1369c.f3119fa)).booleanValue()) {
                this.f1994D.addView(this.f2010a);
                this.f2010a.setVisibility(4);
            }
            this.f2010a.renderAd(this.currentAd);
            if (!this.currentAd.hasVideoUrl()) {
                if (m1647H() && ((Boolean) this.sdk.mo13088a(C1369c.f2933bW)).booleanValue()) {
                    m1694d((AppLovinAd) this.currentAd);
                }
                showPostitial();
                return;
            }
            return;
        }
        exitWithError("AdView was null");
    }

    /* renamed from: K */
    private void m1650K() {
        if (this.videoView != null) {
            this.f2030u = getVideoPercentViewed();
            this.videoView.stopPlayback();
        }
    }

    /* renamed from: L */
    private boolean m1651L() {
        return this.videoMuted;
    }

    /* renamed from: M */
    private void m1652M() {
        AppLovinVideoView appLovinVideoView = this.videoView;
        this.sdk.mo13095a(C1371e.f3170v, Integer.valueOf(appLovinVideoView != null ? appLovinVideoView.getCurrentPosition() : 0));
        this.sdk.mo13095a(C1371e.f3171w, true);
        try {
            this.countdownManager.mo11960c();
        } catch (Throwable th) {
            this.logger.mo13278b("InterActivity", "Unable to pause countdown timers", th);
        }
        AppLovinVideoView appLovinVideoView2 = this.videoView;
        if (appLovinVideoView2 != null) {
            appLovinVideoView2.pause();
        }
    }

    /* renamed from: N */
    private void m1653N() {
        long max = Math.max(0, ((Long) this.sdk.mo13088a(C1369c.f3049di)).longValue());
        if (max > 0) {
            C1505q v = this.sdk.mo13139v();
            v.mo13277b("InterActivity", "Resuming video with delay of " + max);
            this.f1993C.postDelayed(new Runnable() {
                public void run() {
                    C1103n.this.m1654O();
                }
            }, max);
            return;
        }
        this.sdk.mo13139v().mo13277b("InterActivity", "Resuming video immediately");
        m1654O();
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m1654O() {
        AppLovinVideoView appLovinVideoView;
        if (!this.postitialWasDisplayed && (appLovinVideoView = this.videoView) != null && !appLovinVideoView.isPlaying()) {
            this.videoView.seekTo(((Integer) this.sdk.mo13112b(C1371e.f3170v, Integer.valueOf(this.videoView.getDuration()))).intValue());
            this.videoView.start();
            this.countdownManager.mo11957a();
        }
    }

    /* renamed from: P */
    private void m1655P() {
        if (!this.f2018i) {
            boolean z = true;
            this.f2018i = true;
            try {
                int videoPercentViewed = getVideoPercentViewed();
                if (this.currentAd.hasVideoUrl()) {
                    m1668a((AppLovinAd) this.currentAd, (double) videoPercentViewed, isFullyWatched());
                    if (this.f2013d != null) {
                        this.f2013d.mo12903c((long) videoPercentViewed);
                    }
                } else if ((this.currentAd instanceof C1345a) && m1647H() && ((Boolean) this.sdk.mo13088a(C1369c.f2933bW)).booleanValue()) {
                    int E = m1641E();
                    C1505q qVar = this.logger;
                    qVar.mo13277b("InterActivity", "Rewarded playable engaged at " + E + " percent");
                    C1355g gVar = this.currentAd;
                    double d = (double) E;
                    if (E < this.currentAd.mo12765Y()) {
                        z = false;
                    }
                    m1668a((AppLovinAd) gVar, d, z);
                }
                long currentTimeMillis = System.currentTimeMillis() - this.f2025p;
                this.sdk.mo13131o().trackVideoEnd(this.currentAd, TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis), videoPercentViewed, this.f2022m);
                this.sdk.mo13131o().trackFullScreenAdClosed(this.currentAd, SystemClock.elapsedRealtime() - this.f2027r, this.f2029t, this.f1991A, this.f2035z);
            } catch (Throwable th) {
                C1505q qVar2 = this.logger;
                if (qVar2 != null) {
                    qVar2.mo13278b("InterActivity", "Failed to notify end listener.", th);
                }
            }
        }
    }

    /* renamed from: a */
    private int m1656a(int i) {
        return AppLovinSdkUtils.dpToPx(this, i);
    }

    /* renamed from: a */
    private int m1657a(int i, boolean z) {
        if (z) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        } else if (i == 0) {
            return 1;
        } else {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 9;
            }
            return i == 3 ? 8 : -1;
        }
    }

    /* renamed from: a */
    private void m1660a(long j, final C1086h hVar) {
        this.f1993C.postDelayed(new Runnable() {
            public void run() {
                if (hVar.equals(C1103n.this.f1995E)) {
                    C1103n.this.m1711m();
                } else if (hVar.equals(C1103n.this.f1997G)) {
                    C1103n.this.m1715o();
                }
            }
        }, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1661a(PointF pointF) {
        if (!this.currentAd.mo11680z() || this.currentAd.mo11674i() == null) {
            m1695e();
            m1697f();
            return;
        }
        this.sdk.mo13139v().mo13277b("InterActivity", "Clicking through video...");
        clickThroughFromVideo(pointF);
    }

    /* renamed from: a */
    private void m1662a(Uri uri) {
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(this, this.sdk);
        this.videoView = appLovinVideoView;
        if (uri != null) {
            appLovinVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public void onPrepared(MediaPlayer mediaPlayer) {
                    WeakReference unused = C1103n.this.f2001K = new WeakReference(mediaPlayer);
                    float f = C1103n.this.m1704i() ^ true ? 1.0f : 0.0f;
                    mediaPlayer.setVolume(f, f);
                    int videoWidth = mediaPlayer.getVideoWidth();
                    int videoHeight = mediaPlayer.getVideoHeight();
                    C1103n.this.computedLengthSeconds = (int) TimeUnit.MILLISECONDS.toSeconds((long) mediaPlayer.getDuration());
                    C1103n.this.videoView.setVideoSize(videoWidth, videoHeight);
                    SurfaceHolder holder = C1103n.this.videoView.getHolder();
                    if (holder.getSurface() != null) {
                        mediaPlayer.setDisplay(holder);
                    }
                    mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                        public boolean onError(MediaPlayer mediaPlayer, final int i, final int i2) {
                            C1103n.this.f1993C.post(new Runnable() {
                                public void run() {
                                    C1103n nVar = C1103n.this;
                                    nVar.handleMediaError("Media player error (" + i + "," + i2 + ")");
                                }
                            });
                            return true;
                        }
                    });
                    mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                            if (i != 3) {
                                if (i == 701) {
                                    C1103n.this.m1735y();
                                    if (C1103n.this.f2013d == null) {
                                        return false;
                                    }
                                    C1103n.this.f2013d.mo12908g();
                                    return false;
                                } else if (i != 702) {
                                    return false;
                                }
                            }
                            C1103n.this.m1738z();
                            return false;
                        }
                    });
                    if (C1103n.this.f2026q == 0) {
                        C1103n.this.m1720q();
                        C1103n.this.m1707k();
                        C1103n.this.m1729v();
                        C1103n.this.m1728u();
                        C1103n.this.playVideo();
                        C1103n.this.m1648I();
                    }
                }
            });
            this.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mediaPlayer) {
                    C1103n.this.m1702h();
                }
            });
            this.videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                public boolean onError(MediaPlayer mediaPlayer, final int i, final int i2) {
                    C1103n.this.f1993C.post(new Runnable() {
                        public void run() {
                            C1103n nVar = C1103n.this;
                            nVar.handleMediaError("Video view error (" + i + "," + i2 + ")");
                        }
                    });
                    return true;
                }
            });
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            this.videoView.setVideoURI(uri);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
        this.videoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        this.videoView.setOnTouchListener(new AppLovinTouchToClickListener(this.sdk, this, new AppLovinTouchToClickListener.OnClickListener() {
            public void onClick(View view, PointF pointF) {
                C1103n.this.m1661a(pointF);
            }
        }));
        this.f1994D.addView(this.videoView);
        setContentView(this.f1994D);
        m1717p();
        m1733x();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1663a(final View view, final boolean z, long j) {
        float f = 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                if (!z) {
                    view.setVisibility(4);
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(alphaAnimation);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1667a(AppLovinAd appLovinAd) {
        C1522j.m3505a(this.f2011b.mo12037d(), appLovinAd);
        this.f2015f = true;
        this.sdk.mo13085Y().mo13266a((Object) appLovinAd);
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
            public void run() {
                C1103n nVar = C1103n.this;
                nVar.m1683b(nVar.videoMuted);
            }
        }, ((Long) this.sdk.mo13088a(C1369c.f3053dm)).longValue());
    }

    /* renamed from: a */
    private void m1668a(AppLovinAd appLovinAd, double d, boolean z) {
        C1522j.m3510a(this.f2011b.mo12036c(), appLovinAd, d, z);
    }

    /* renamed from: a */
    private void m1669a(final String str) {
        C1138o oVar = this.f2011b;
        if (oVar != null) {
            final AppLovinAdDisplayListener d = oVar.mo12037d();
            if ((d instanceof C1362i) && this.f2034y.compareAndSet(false, true)) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        ((C1362i) d).onAdDisplayFailed(str);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m1670a(final String str, long j) {
        if (j >= 0) {
            this.f1993C.postDelayed(new Runnable() {
                public void run() {
                    C1072c adWebView = ((AdViewControllerImpl) C1103n.this.f2010a.getAdViewController()).getAdWebView();
                    if (adWebView != null && C1553o.m3554b(str)) {
                        adWebView.mo11889a(str);
                    }
                }
            }, j);
        }
    }

    /* renamed from: a */
    private void m1671a(boolean z) {
        if (((Boolean) this.sdk.mo13088a(C1369c.f2984cV)).booleanValue() && C1519g.m3433d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getDrawable(z ? C1701R.C1702drawable.unmute_to_mute : C1701R.C1702drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f2000J.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f2000J.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aK = z ? this.currentAd.mo12781aK() : this.currentAd.mo12782aL();
        int a = m1656a(((Integer) this.sdk.mo13088a(C1369c.f3042db)).intValue());
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        AppLovinSdkUtils.safePopulateImageView(this.f2000J, aK, a);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: a */
    private boolean m1672a() {
        int identifier = getResources().getIdentifier((String) this.sdk.mo13088a(C1369c.f2981cS), "bool", "android");
        return identifier > 0 && getResources().getBoolean(identifier);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1676b() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    /* renamed from: b */
    private void m1677b(int i) {
        try {
            setRequestedOrientation(i);
        } catch (Throwable th) {
            this.sdk.mo13139v().mo13278b("InterActivity", "Failed to set requested orientation", th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r7 == 2) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r7 == 1) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r7 == 1) goto L_0x0028;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1678b(int r7, boolean r8) {
        /*
            r6 = this;
            com.applovin.impl.sdk.j r0 = r6.sdk
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r1 = com.applovin.impl.sdk.p025b.C1369c.f2979cQ
            java.lang.Object r0 = r0.mo13088a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.applovin.impl.adview.o r1 = r6.f2011b
            com.applovin.impl.sdk.ad.g$b r1 = r1.mo12039f()
            com.applovin.impl.sdk.ad.g$b r2 = com.applovin.impl.sdk.p024ad.C1355g.C1358b.ACTIVITY_PORTRAIT
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 != r2) goto L_0x003e
            r1 = 9
            if (r8 == 0) goto L_0x002c
            if (r7 == r5) goto L_0x0024
            if (r7 == r3) goto L_0x0024
            goto L_0x0030
        L_0x0024:
            if (r0 == 0) goto L_0x0068
            if (r7 != r5) goto L_0x0032
        L_0x0028:
            r6.m1677b((int) r1)
            goto L_0x0068
        L_0x002c:
            if (r7 == 0) goto L_0x0036
            if (r7 == r4) goto L_0x0036
        L_0x0030:
            r6.f2012c = r5
        L_0x0032:
            r6.m1677b((int) r5)
            goto L_0x0068
        L_0x0036:
            if (r0 == 0) goto L_0x0068
            if (r7 != 0) goto L_0x003b
            goto L_0x0032
        L_0x003b:
            r5 = 9
            goto L_0x0032
        L_0x003e:
            com.applovin.impl.adview.o r1 = r6.f2011b
            com.applovin.impl.sdk.ad.g$b r1 = r1.mo12039f()
            com.applovin.impl.sdk.ad.g$b r2 = com.applovin.impl.sdk.p024ad.C1355g.C1358b.ACTIVITY_LANDSCAPE
            if (r1 != r2) goto L_0x0068
            r1 = 8
            r2 = 0
            if (r8 == 0) goto L_0x0059
            if (r7 == 0) goto L_0x0052
            if (r7 == r4) goto L_0x0052
            goto L_0x005d
        L_0x0052:
            if (r0 == 0) goto L_0x0068
            if (r7 != r4) goto L_0x0057
            goto L_0x0028
        L_0x0057:
            r1 = 0
            goto L_0x0028
        L_0x0059:
            if (r7 == r5) goto L_0x0063
            if (r7 == r3) goto L_0x0063
        L_0x005d:
            r6.f2012c = r5
            r6.m1677b((int) r2)
            goto L_0x0068
        L_0x0063:
            if (r0 == 0) goto L_0x0068
            if (r7 != r5) goto L_0x0028
            goto L_0x0057
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C1103n.m1678b(int, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1681b(AppLovinAd appLovinAd) {
        dismiss();
        m1686c(appLovinAd);
    }

    /* renamed from: b */
    private void m1682b(String str) {
        C1355g gVar = this.currentAd;
        if (gVar != null && gVar.mo12791ae()) {
            m1670a(str, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1683b(boolean z) {
        C1072c adWebView;
        if (this.currentAd.mo12788ab() && (adWebView = ((AdViewControllerImpl) this.f2010a.getAdViewController()).getAdWebView()) != null) {
            try {
                adWebView.mo11889a(z ? "javascript:al_mute();" : "javascript:al_unmute();");
            } catch (Throwable th) {
                this.logger.mo13278b("InterActivity", "Unable to forward mute setting to template.", th);
            }
        }
    }

    /* renamed from: c */
    private void m1686c(AppLovinAd appLovinAd) {
        if (!this.f2016g) {
            this.f2016g = true;
            C1138o oVar = this.f2011b;
            if (oVar != null) {
                C1522j.m3516b(oVar.mo12037d(), appLovinAd);
            }
            this.sdk.mo13085Y().mo13269b((Object) appLovinAd);
        }
    }

    /* renamed from: c */
    private void m1687c(boolean z) {
        this.videoMuted = z;
        MediaPlayer mediaPlayer = (MediaPlayer) this.f2001K.get();
        if (mediaPlayer != null) {
            float f = (float) (z ? 0 : 1);
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException e) {
                C1505q qVar = this.logger;
                qVar.mo13278b("InterActivity", "Failed to set MediaPlayer muted: " + z, e);
            }
        }
    }

    /* renamed from: c */
    private boolean m1688c() {
        C1469j jVar;
        if (this.f2011b == null || (jVar = this.sdk) == null || ((Boolean) jVar.mo13088a(C1369c.f2973cK)).booleanValue()) {
            return true;
        }
        if (!((Boolean) this.sdk.mo13088a(C1369c.f2974cL)).booleanValue() || !this.f2019j) {
            return ((Boolean) this.sdk.mo13088a(C1369c.f2975cM)).booleanValue() && this.postitialWasDisplayed;
        }
        return true;
    }

    /* renamed from: d */
    private void m1692d() {
        int i;
        if (this.sdk == null || !isFinishing()) {
            if (!(this.currentAd == null || (i = this.f2031v) == Integer.MIN_VALUE)) {
                m1677b(i);
            }
            finish();
        }
    }

    /* renamed from: d */
    private void m1694d(AppLovinAd appLovinAd) {
        if (!this.f2017h) {
            this.f2017h = true;
            C1522j.m3509a(this.f2011b.mo12036c(), appLovinAd);
        }
    }

    /* renamed from: e */
    private void m1695e() {
        C1083f fVar;
        if (((Boolean) this.sdk.mo13088a(C1369c.f2982cT)).booleanValue() && (fVar = this.f1999I) != null && fVar.getVisibility() != 8) {
            m1663a((View) this.f1999I, this.f1999I.getVisibility() == 4, 750);
        }
    }

    /* renamed from: f */
    private void m1697f() {
        C1152t tVar;
        C1151s y = this.currentAd.mo12828y();
        if (y != null && y.mo12058e() && !this.postitialWasDisplayed && (tVar = this.f2003M) != null) {
            m1663a((View) this.f2003M, tVar.getVisibility() == 4, y.mo12060f());
        }
    }

    /* renamed from: g */
    private void m1700g() {
        C1469j jVar = this.sdk;
        if (jVar != null) {
            jVar.mo13095a(C1371e.f3171w, false);
            this.sdk.mo13095a(C1371e.f3170v, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m1702h() {
        this.f2014e = true;
        showPostitial();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m1704i() {
        return ((Integer) this.sdk.mo13112b(C1371e.f3170v, 0)).intValue() > 0 ? this.videoMuted : ((Boolean) this.sdk.mo13088a(C1369c.f3041da)).booleanValue() ? this.sdk.mo13128l().isMuted() : ((Boolean) this.sdk.mo13088a(C1369c.f2987cY)).booleanValue();
    }

    /* renamed from: j */
    private void m1705j() {
        C1086h a = C1086h.m1600a(this.currentAd.mo12822s(), this);
        this.f1995E = a;
        a.setVisibility(8);
        this.f1995E.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C1103n.this.m1636B();
            }
        });
        int a2 = m1656a(this.currentAd.mo12793ag());
        int i = 3;
        int i2 = (this.currentAd.mo12796aj() ? 3 : 5) | 48;
        if (!this.currentAd.mo12797ak()) {
            i = 5;
        }
        int i3 = i | 48;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2, i2 | 48);
        this.f1995E.mo11952a(a2);
        int a3 = m1656a(this.currentAd.mo12794ah());
        int a4 = m1656a(this.currentAd.mo12795ai());
        layoutParams.setMargins(a4, a3, a4, a3);
        this.f1994D.addView(this.f1995E, layoutParams);
        C1086h a5 = C1086h.m1600a(this.currentAd.mo12823t(), this);
        this.f1997G = a5;
        a5.setVisibility(8);
        this.f1997G.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C1103n.this.m1633A();
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a2, a2, i3);
        layoutParams2.setMargins(a4, a3, a4, a3);
        this.f1997G.mo11952a(a2);
        this.f1994D.addView(this.f1997G, layoutParams2);
        this.f1997G.bringToFront();
        if (m1714n()) {
            int a6 = m1656a(((Integer) this.sdk.mo13088a(C1369c.f2935bY)).intValue());
            View view = new View(this);
            this.f1996F = view;
            view.setBackgroundColor(0);
            this.f1996F.setVisibility(8);
            View view2 = new View(this);
            this.f1998H = view2;
            view2.setBackgroundColor(0);
            this.f1998H.setVisibility(8);
            int i4 = a2 + a6;
            int a7 = a3 - m1656a(5);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i4, i4, i2);
            layoutParams3.setMargins(a7, a7, a7, a7);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i4, i4, i3);
            layoutParams4.setMargins(a7, a7, a7, a7);
            this.f1996F.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C1103n.this.f1995E.performClick();
                }
            });
            this.f1998H.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C1103n.this.f1997G.performClick();
                }
            });
            this.f1994D.addView(this.f1996F, layoutParams3);
            this.f1996F.bringToFront();
            this.f1994D.addView(this.f1998H, layoutParams4);
            this.f1998H.bringToFront();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m1707k() {
        if (this.f2000J == null) {
            try {
                this.videoMuted = m1704i();
                this.f2000J = new ImageView(this);
                if (!m1710l()) {
                    int a = m1656a(((Integer) this.sdk.mo13088a(C1369c.f3042db)).intValue());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a, ((Integer) this.sdk.mo13088a(C1369c.f3044dd)).intValue());
                    this.f2000J.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    int a2 = m1656a(((Integer) this.sdk.mo13088a(C1369c.f3043dc)).intValue());
                    layoutParams.setMargins(a2, a2, a2, a2);
                    if ((this.videoMuted ? this.currentAd.mo12781aK() : this.currentAd.mo12782aL()) != null) {
                        C1505q v = this.sdk.mo13139v();
                        v.mo13277b("InterActivity", "Added mute button with params: " + layoutParams);
                        m1671a(this.videoMuted);
                        this.f2000J.setClickable(true);
                        this.f2000J.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                C1103n.this.toggleMute();
                            }
                        });
                        this.f1994D.addView(this.f2000J, layoutParams);
                        this.f2000J.bringToFront();
                        return;
                    }
                    this.sdk.mo13139v().mo13281e("InterActivity", "Attempting to add mute button but could not find uri");
                    return;
                }
                this.sdk.mo13139v().mo13277b("InterActivity", "Mute button should be hidden");
            } catch (Exception e) {
                this.sdk.mo13139v().mo13276a("InterActivity", "Failed to attach mute button", (Throwable) e);
            }
        }
    }

    /* renamed from: l */
    private boolean m1710l() {
        if (!((Boolean) this.sdk.mo13088a(C1369c.f2985cW)).booleanValue()) {
            return true;
        }
        if (!((Boolean) this.sdk.mo13088a(C1369c.f2986cX)).booleanValue() || m1704i()) {
            return false;
        }
        return !((Boolean) this.sdk.mo13088a(C1369c.f2988cZ)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m1711m() {
        runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (C1103n.this.f2019j) {
                        C1103n.this.f1995E.setVisibility(0);
                        return;
                    }
                    long unused = C1103n.this.f2027r = SystemClock.elapsedRealtime();
                    boolean unused2 = C1103n.this.f2019j = true;
                    if (C1103n.this.m1714n() && C1103n.this.f1996F != null) {
                        C1103n.this.f1996F.setVisibility(0);
                        C1103n.this.f1996F.bringToFront();
                    }
                    C1103n.this.f1995E.setVisibility(0);
                    C1103n.this.f1995E.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(400);
                    alphaAnimation.setRepeatCount(0);
                    C1103n.this.f1995E.startAnimation(alphaAnimation);
                } catch (Throwable unused3) {
                    C1103n.this.dismiss();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m1714n() {
        return ((Integer) this.sdk.mo13088a(C1369c.f2935bY)).intValue() > 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m1715o() {
        runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (!C1103n.this.f2020k && C1103n.this.f1997G != null) {
                        long unused = C1103n.this.f2029t = -1;
                        long unused2 = C1103n.this.f2028s = SystemClock.elapsedRealtime();
                        boolean unused3 = C1103n.this.f2020k = true;
                        C1103n.this.f1997G.setVisibility(0);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(400);
                        alphaAnimation.setRepeatCount(0);
                        C1103n.this.f1997G.startAnimation(alphaAnimation);
                        if (C1103n.this.m1714n() && C1103n.this.f1998H != null) {
                            C1103n.this.f1998H.setVisibility(0);
                            C1103n.this.f1998H.bringToFront();
                        }
                    }
                } catch (Throwable th) {
                    C1505q qVar = C1103n.this.logger;
                    qVar.mo13280d("InterActivity", "Unable to show skip button: " + th);
                }
            }
        });
    }

    /* renamed from: p */
    private void m1717p() {
        C1086h hVar;
        if (this.currentAd.mo12819p() >= 0) {
            if (!this.f2021l || (hVar = this.f1997G) == null) {
                hVar = this.f1995E;
            }
            m1660a(C1557r.m3615b((float) this.currentAd.mo12819p()), hVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m1720q() {
        boolean z = ((Boolean) this.sdk.mo13088a(C1369c.f2972cJ)).booleanValue() && m1725t() > 0;
        if (this.f1999I == null && z) {
            this.f1999I = new C1083f(this);
            int G = this.currentAd.mo12747G();
            this.f1999I.setTextColor(G);
            this.f1999I.setTextSize((float) ((Integer) this.sdk.mo13088a(C1369c.f2971cI)).intValue());
            this.f1999I.setFinishedStrokeColor(G);
            this.f1999I.setFinishedStrokeWidth((float) ((Integer) this.sdk.mo13088a(C1369c.f2970cH)).intValue());
            this.f1999I.setMax(m1725t());
            this.f1999I.setProgress(m1725t());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m1656a(((Integer) this.sdk.mo13088a(C1369c.f2969cG)).intValue()), m1656a(((Integer) this.sdk.mo13088a(C1369c.f2969cG)).intValue()), ((Integer) this.sdk.mo13088a(C1369c.f2968cF)).intValue());
            int a = m1656a(((Integer) this.sdk.mo13088a(C1369c.f2967cE)).intValue());
            layoutParams.setMargins(a, a, a, a);
            this.f1994D.addView(this.f1999I, layoutParams);
            this.f1999I.bringToFront();
            this.f1999I.setVisibility(0);
            final long s = m1723s();
            this.countdownManager.mo11958a("COUNTDOWN_CLOCK", 1000, (C1088i.C1090a) new C1088i.C1090a() {
                /* renamed from: a */
                public void mo11867a() {
                    if (C1103n.this.f1999I != null) {
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(s - ((long) C1103n.this.videoView.getCurrentPosition()));
                        if (seconds <= 0) {
                            C1103n.this.f1999I.setVisibility(8);
                            boolean unused = C1103n.this.f2024o = true;
                        } else if (C1103n.this.m1722r()) {
                            C1103n.this.f1999I.setProgress((int) seconds);
                        }
                    }
                }

                /* renamed from: b */
                public boolean mo11868b() {
                    return C1103n.this.m1722r();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public boolean m1722r() {
        return !this.f2024o && !this.postitialWasDisplayed && this.videoView.isPlaying();
    }

    /* renamed from: s */
    private long m1723s() {
        return TimeUnit.SECONDS.toMillis((long) m1725t());
    }

    /* renamed from: t */
    private int m1725t() {
        int F = this.currentAd.mo12746F();
        return (F <= 0 && ((Boolean) this.sdk.mo13088a(C1369c.f3052dl)).booleanValue()) ? this.computedLengthSeconds + 1 : F;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m1728u() {
        if (this.f2004N == null && this.currentAd.mo12757Q()) {
            this.logger.mo13279c("InterActivity", "Attaching video progress bar...");
            ProgressBar progressBar = new ProgressBar(this, (AttributeSet) null, 16842872);
            this.f2004N = progressBar;
            progressBar.setMax(((Integer) this.sdk.mo13088a(C1369c.f3047dg)).intValue());
            this.f2004N.setPadding(0, 0, 0, 0);
            if (C1519g.m3433d()) {
                try {
                    this.f2004N.setProgressTintList(ColorStateList.valueOf(this.currentAd.mo12758R()));
                } catch (Throwable th) {
                    this.logger.mo13278b("InterActivity", "Unable to update progress bar color.", th);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.videoView.getWidth(), 20, 80);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.sdk.mo13088a(C1369c.f3048dh)).intValue());
            this.f1994D.addView(this.f2004N, layoutParams);
            this.f2004N.bringToFront();
            this.countdownManager.mo11958a("PROGRESS_BAR", ((Long) this.sdk.mo13088a(C1369c.f3046df)).longValue(), (C1088i.C1090a) new C1088i.C1090a() {
                /* renamed from: a */
                public void mo11867a() {
                    if (C1103n.this.f2004N == null) {
                        return;
                    }
                    if (C1103n.this.shouldContinueFullLengthVideoCountdown()) {
                        C1103n.this.f2004N.setProgress((int) ((((float) C1103n.this.videoView.getCurrentPosition()) / ((float) C1103n.this.videoView.getDuration())) * ((float) ((Integer) C1103n.this.sdk.mo13088a(C1369c.f3047dg)).intValue())));
                        return;
                    }
                    C1103n.this.f2004N.setVisibility(8);
                }

                /* renamed from: b */
                public boolean mo11868b() {
                    return C1103n.this.shouldContinueFullLengthVideoCountdown();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m1729v() {
        final C1151s y = this.currentAd.mo12828y();
        if (C1553o.m3554b(this.currentAd.mo12827x()) && y != null && this.f2003M == null) {
            this.logger.mo13279c("InterActivity", "Attaching video button...");
            this.f2003M = m1732w();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) ((((double) y.mo12054a()) / 100.0d) * ((double) this.videoView.getWidth())), (int) ((((double) y.mo12055b()) / 100.0d) * ((double) this.videoView.getHeight())), y.mo12057d());
            int a = m1656a(y.mo12056c());
            layoutParams.setMargins(a, a, a, a);
            this.f1994D.addView(this.f2003M, layoutParams);
            this.f2003M.bringToFront();
            if (y.mo12064i() > 0.0f) {
                this.f2003M.setVisibility(4);
                this.f1993C.postDelayed(new Runnable() {
                    public void run() {
                        long g = y.mo12061g();
                        C1103n nVar = C1103n.this;
                        nVar.m1663a((View) nVar.f2003M, true, g);
                        C1103n.this.f2003M.bringToFront();
                    }
                }, C1557r.m3615b(y.mo12064i()));
            }
            if (y.mo12065j() > 0.0f) {
                this.f1993C.postDelayed(new Runnable() {
                    public void run() {
                        long h = y.mo12062h();
                        C1103n nVar = C1103n.this;
                        nVar.m1663a((View) nVar.f2003M, false, h);
                    }
                }, C1557r.m3615b(y.mo12065j()));
            }
        }
    }

    /* renamed from: w */
    private C1152t m1732w() {
        C1505q qVar = this.logger;
        qVar.mo13277b("InterActivity", "Create video button with HTML = " + this.currentAd.mo12827x());
        C1153u uVar = new C1153u(this.sdk);
        this.f2005O = new C1153u.C1154a() {
            /* renamed from: a */
            public void mo12005a(C1152t tVar) {
                C1103n.this.logger.mo13277b("InterActivity", "Clicking through from video button...");
                C1103n.this.clickThroughFromVideo(tVar.getAndClearLastClickLocation());
            }

            /* renamed from: b */
            public void mo12006b(C1152t tVar) {
                C1103n.this.logger.mo13277b("InterActivity", "Closing ad from video button...");
                C1103n.this.dismiss();
            }

            /* renamed from: c */
            public void mo12007c(C1152t tVar) {
                C1103n.this.logger.mo13277b("InterActivity", "Skipping video from video button...");
                C1103n.this.skipVideo();
            }
        };
        uVar.mo12068a(new WeakReference(this.f2005O));
        C1152t a = C1152t.m1792a(this.sdk, uVar, getApplicationContext());
        a.mo12067a(this.currentAd.mo12827x());
        return a;
    }

    /* renamed from: x */
    private void m1733x() {
        if (this.f2022m && this.currentAd.mo12759S()) {
            C1039a aVar = new C1039a(this, ((Integer) this.sdk.mo13088a(C1369c.f3051dk)).intValue(), this.currentAd.mo12761U());
            this.f2006P = aVar;
            aVar.setColor(this.currentAd.mo12762V());
            this.f2006P.setBackgroundColor(this.currentAd.mo12763W());
            this.f2006P.setVisibility(8);
            this.f1994D.addView(this.f2006P, new FrameLayout.LayoutParams(-1, -1, 17));
            this.f1994D.bringChildToFront(this.f2006P);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m1735y() {
        C1039a aVar = this.f2006P;
        if (aVar != null) {
            aVar.mo11807a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m1738z() {
        C1039a aVar = this.f2006P;
        if (aVar != null) {
            aVar.mo11808b();
        }
    }

    public void clickThroughFromVideo(PointF pointF) {
        try {
            this.sdk.mo13131o().trackAndLaunchVideoClick(this.currentAd, this.f2010a, this.currentAd.mo11674i(), pointF);
            C1522j.m3504a(this.f2011b.mo12038e(), (AppLovinAd) this.currentAd);
            if (this.f2013d != null) {
                this.f2013d.mo12900b();
            }
        } catch (Throwable th) {
            this.sdk.mo13139v().mo13278b("InterActivity", "Encountered error while clicking through video.", th);
        }
    }

    public void continueVideo() {
        m1654O();
    }

    public void dismiss() {
        long currentTimeMillis = System.currentTimeMillis() - this.f2025p;
        C1505q.m3342f("InterActivity", "Dismissing ad after " + currentTimeMillis + " milliseconds elapsed");
        C1469j jVar = this.sdk;
        if (jVar != null) {
            if (((Boolean) jVar.mo13088a(C1369c.f2983cU)).booleanValue()) {
                stopService(new Intent(getBaseContext(), AppKilledService.class));
                this.sdk.mo13108ae().unregisterReceiver(this.f2009S);
            }
            this.sdk.mo13107ad().mo13041b((C1452e.C1454a) this);
        }
        m1700g();
        m1655P();
        if (this.f2011b != null) {
            if (this.currentAd != null) {
                m1686c((AppLovinAd) this.currentAd);
                C1382d dVar = this.f2013d;
                if (dVar != null) {
                    dVar.mo12902c();
                    this.f2013d = null;
                }
                m1670a("javascript:al_onPoststitialDismiss();", (long) this.currentAd.mo12787aa());
            }
            this.f2011b.mo12040g();
        }
        lastKnownWrapper = null;
        m1692d();
    }

    public void exitWithError(String str) {
        m1669a(str);
        try {
            C1505q.m3341c("InterActivity", "Failed to properly render an Interstitial Activity, due to error: " + str, new Throwable("Initialized = " + C1138o.f2085b + "; CleanedUp = " + C1138o.f2086c));
            m1686c((AppLovinAd) new C1361h(this.currentAd != null ? this.currentAd.getAdZone() : C1349d.m2454a(str, this.sdk), this.sdk));
        } catch (Exception e) {
            C1505q.m3341c("InterActivity", "Failed to show a video ad due to error:", e);
        }
        dismiss();
    }

    public boolean getPostitialWasDisplayed() {
        return this.postitialWasDisplayed;
    }

    public int getVideoPercentViewed() {
        if (this.f2014e) {
            return 100;
        }
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            int duration = appLovinVideoView.getDuration();
            return duration > 0 ? (int) ((((double) this.videoView.getCurrentPosition()) / ((double) duration)) * 100.0d) : this.f2030u;
        }
        this.logger.mo13281e("InterActivity", "No video view detected on video end");
        return 0;
    }

    public void handleMediaError(String str) {
        this.logger.mo13281e("InterActivity", str);
        if (this.f2032w.compareAndSet(false, true) && this.currentAd.mo12753M()) {
            m1669a(str);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public boolean isFullyWatched() {
        return getVideoPercentViewed() >= this.currentAd.mo12765Y();
    }

    /* access modifiers changed from: protected */
    public boolean isVastAd() {
        return this.currentAd instanceof C1000a;
    }

    public void onBackPressed() {
        C1086h hVar;
        if (this.currentAd != null) {
            if (this.currentAd.mo12779aI() && !this.postitialWasDisplayed) {
                return;
            }
            if (this.currentAd.mo12780aJ() && this.postitialWasDisplayed) {
                return;
            }
        }
        if (m1688c()) {
            this.logger.mo13277b("InterActivity", "Back button was pressed; forwarding to Android for handling...");
        } else {
            try {
                if (!this.postitialWasDisplayed && this.f2021l && this.f1997G != null && this.f1997G.getVisibility() == 0 && this.f1997G.getAlpha() > 0.0f) {
                    this.logger.mo13277b("InterActivity", "Back button was pressed; forwarding as a click to skip button.");
                    hVar = this.f1997G;
                } else if (this.f1995E == null || this.f1995E.getVisibility() != 0 || this.f1995E.getAlpha() <= 0.0f) {
                    this.logger.mo13277b("InterActivity", "Back button was pressed, but was not eligible for dismissal.");
                    m1682b("javascript:al_onBackPressed();");
                    return;
                } else {
                    this.logger.mo13277b("InterActivity", "Back button was pressed; forwarding as a click to close button.");
                    hVar = this.f1995E;
                }
                hVar.performClick();
                m1682b("javascript:al_onBackPressed();");
                return;
            } catch (Exception unused) {
            }
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "InterActivity"
            super.onCreate(r9)
            if (r9 == 0) goto L_0x0012
            java.lang.String r1 = "instance_impression_tracked"
            boolean r1 = r9.getBoolean(r1)
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f2033x
            r2.set(r1)
        L_0x0012:
            r1 = 1
            r8.requestWindowFeature(r1)
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            android.content.Intent r2 = r8.getIntent()     // Catch:{ all -> 0x01aa }
            java.lang.String r3 = "com.applovin.interstitial.wrapper_id"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ all -> 0x01aa }
            if (r2 == 0) goto L_0x01a7
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x01aa }
            if (r3 != 0) goto L_0x01a7
            com.applovin.impl.adview.o r2 = com.applovin.impl.adview.C1138o.m1748a((java.lang.String) r2)     // Catch:{ all -> 0x01aa }
            r8.f2011b = r2     // Catch:{ all -> 0x01aa }
            if (r2 != 0) goto L_0x003c
            com.applovin.impl.adview.o r2 = lastKnownWrapper     // Catch:{ all -> 0x01aa }
            if (r2 == 0) goto L_0x003c
            com.applovin.impl.adview.o r2 = lastKnownWrapper     // Catch:{ all -> 0x01aa }
            r8.f2011b = r2     // Catch:{ all -> 0x01aa }
        L_0x003c:
            com.applovin.impl.adview.o r2 = r8.f2011b     // Catch:{ all -> 0x01aa }
            if (r2 == 0) goto L_0x0193
            com.applovin.impl.adview.o r2 = r8.f2011b     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.ad.g r2 = r2.mo12035b()     // Catch:{ all -> 0x01aa }
            com.applovin.impl.adview.o r3 = r8.f2011b     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.j r3 = r3.mo12032a()     // Catch:{ all -> 0x01aa }
            r8.sdk = r3     // Catch:{ all -> 0x01aa }
            com.applovin.impl.adview.o r3 = r8.f2011b     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.j r3 = r3.mo12032a()     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.q r3 = r3.mo13139v()     // Catch:{ all -> 0x01aa }
            r8.logger = r3     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.j r3 = r8.sdk     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r4 = com.applovin.impl.sdk.p025b.C1369c.f2983cU     // Catch:{ all -> 0x01aa }
            java.lang.Object r3 = r3.mo13088a(r4)     // Catch:{ all -> 0x01aa }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x01aa }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x01aa }
            if (r3 == 0) goto L_0x0091
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x01aa }
            android.content.Context r4 = r8.getBaseContext()     // Catch:{ all -> 0x01aa }
            java.lang.Class<com.applovin.impl.sdk.utils.AppKilledService> r5 = com.applovin.impl.sdk.utils.AppKilledService.class
            r3.<init>(r4, r5)     // Catch:{ all -> 0x01aa }
            com.applovin.impl.adview.n$1 r4 = new com.applovin.impl.adview.n$1     // Catch:{ all -> 0x01aa }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x01aa }
            r8.f2009S = r4     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.j r4 = r8.sdk     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.AppLovinBroadcastManager r4 = r4.mo13108ae()     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.AppLovinBroadcastManager$Receiver r5 = r8.f2009S     // Catch:{ all -> 0x01aa }
            android.content.IntentFilter r6 = new android.content.IntentFilter     // Catch:{ all -> 0x01aa }
            java.lang.String r7 = "com.applovin.app_killed"
            r6.<init>(r7)     // Catch:{ all -> 0x01aa }
            r4.registerReceiver(r5, r6)     // Catch:{ all -> 0x01aa }
            r8.startService(r3)     // Catch:{ all -> 0x01aa }
        L_0x0091:
            if (r2 == 0) goto L_0x018d
            com.applovin.impl.sdk.c.d r3 = new com.applovin.impl.sdk.c.d     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.j r4 = r8.sdk     // Catch:{ all -> 0x01aa }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x01aa }
            r8.f2013d = r3     // Catch:{ all -> 0x01aa }
            boolean r3 = r2.mo12807au()     // Catch:{ all -> 0x01aa }
            if (r3 == 0) goto L_0x00ab
            com.applovin.impl.sdk.j r3 = r8.sdk     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.e r3 = r3.mo13107ad()     // Catch:{ all -> 0x01aa }
            r3.mo13040a((com.applovin.impl.sdk.C1452e.C1454a) r8)     // Catch:{ all -> 0x01aa }
        L_0x00ab:
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r8.findViewById(r3)     // Catch:{ all -> 0x01aa }
            if (r3 == 0) goto L_0x00c7
            boolean r4 = r2.hasVideoUrl()     // Catch:{ all -> 0x01aa }
            if (r4 == 0) goto L_0x00c2
            int r4 = r2.mo12748H()     // Catch:{ all -> 0x01aa }
        L_0x00be:
            r3.setBackgroundColor(r4)     // Catch:{ all -> 0x01aa }
            goto L_0x00c7
        L_0x00c2:
            int r4 = r2.mo12749I()     // Catch:{ all -> 0x01aa }
            goto L_0x00be
        L_0x00c7:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01aa }
            r8.f2025p = r3     // Catch:{ all -> 0x01aa }
            boolean r3 = r2.mo12741A()     // Catch:{ all -> 0x01aa }
            if (r3 == 0) goto L_0x00dc
            android.view.Window r3 = r8.getWindow()     // Catch:{ all -> 0x01aa }
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r3.setFlags(r4, r4)     // Catch:{ all -> 0x01aa }
        L_0x00dc:
            boolean r3 = r2.mo12742B()     // Catch:{ all -> 0x01aa }
            if (r3 == 0) goto L_0x00eb
            android.view.Window r3 = r8.getWindow()     // Catch:{ all -> 0x01aa }
            r4 = 128(0x80, float:1.794E-43)
            r3.addFlags(r4)     // Catch:{ all -> 0x01aa }
        L_0x00eb:
            int r3 = com.applovin.impl.sdk.utils.C1557r.m3629e((android.content.Context) r8)     // Catch:{ all -> 0x01aa }
            boolean r4 = com.applovin.sdk.AppLovinSdkUtils.isTablet(r8)     // Catch:{ all -> 0x01aa }
            int r5 = r8.m1657a((int) r3, (boolean) r4)     // Catch:{ all -> 0x01aa }
            if (r9 != 0) goto L_0x00fc
            r8.f2031v = r5     // Catch:{ all -> 0x01aa }
            goto L_0x0104
        L_0x00fc:
            java.lang.String r6 = "original_orientation"
            int r9 = r9.getInt(r6, r5)     // Catch:{ all -> 0x01aa }
            r8.f2031v = r9     // Catch:{ all -> 0x01aa }
        L_0x0104:
            boolean r9 = r2.mo12745E()     // Catch:{ all -> 0x01aa }
            if (r9 == 0) goto L_0x0132
            r9 = -1
            if (r5 == r9) goto L_0x0127
            com.applovin.impl.sdk.q r9 = r8.logger     // Catch:{ all -> 0x01aa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01aa }
            r2.<init>()     // Catch:{ all -> 0x01aa }
            java.lang.String r3 = "Locking activity orientation to current orientation: "
            r2.append(r3)     // Catch:{ all -> 0x01aa }
            r2.append(r5)     // Catch:{ all -> 0x01aa }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01aa }
            r9.mo13277b(r0, r2)     // Catch:{ all -> 0x01aa }
            r8.m1677b((int) r5)     // Catch:{ all -> 0x01aa }
            goto L_0x013a
        L_0x0127:
            com.applovin.impl.sdk.q r9 = r8.logger     // Catch:{ all -> 0x01aa }
            java.lang.String r2 = "Unable to detect current orientation. Locking to targeted orientation..."
            r9.mo13281e(r0, r2)     // Catch:{ all -> 0x01aa }
        L_0x012e:
            r8.m1678b((int) r3, (boolean) r4)     // Catch:{ all -> 0x01aa }
            goto L_0x013a
        L_0x0132:
            com.applovin.impl.sdk.q r9 = r8.logger     // Catch:{ all -> 0x01aa }
            java.lang.String r2 = "Locking activity orientation to targeted orientation..."
            r9.mo13277b(r0, r2)     // Catch:{ all -> 0x01aa }
            goto L_0x012e
        L_0x013a:
            com.applovin.impl.adview.m r9 = new com.applovin.impl.adview.m     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.j r2 = r8.sdk     // Catch:{ all -> 0x01aa }
            com.applovin.sdk.AppLovinSdk r2 = r2.mo13078R()     // Catch:{ all -> 0x01aa }
            com.applovin.sdk.AppLovinAdSize r3 = com.applovin.sdk.AppLovinAdSize.INTERSTITIAL     // Catch:{ all -> 0x01aa }
            r9.<init>(r2, r3, r8)     // Catch:{ all -> 0x01aa }
            r8.f2010a = r9     // Catch:{ all -> 0x01aa }
            com.applovin.adview.AdViewController r9 = r9.getAdViewController()     // Catch:{ all -> 0x01aa }
            com.applovin.impl.adview.AdViewControllerImpl r9 = (com.applovin.impl.adview.AdViewControllerImpl) r9     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.c.d r2 = r8.f2013d     // Catch:{ all -> 0x01aa }
            r9.setStatsManagerHelper(r2)     // Catch:{ all -> 0x01aa }
            com.applovin.impl.adview.o r9 = r8.f2011b     // Catch:{ all -> 0x01aa }
            r9.mo12033a((com.applovin.impl.adview.C1092j) r8)     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.j r9 = r8.sdk     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r2 = com.applovin.impl.sdk.p025b.C1369c.f3050dj     // Catch:{ all -> 0x01aa }
            java.lang.Object r9 = r9.mo13088a(r2)     // Catch:{ all -> 0x01aa }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x01aa }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x01aa }
            r8.f2021l = r9     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.a.b r9 = new com.applovin.impl.sdk.a.b     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.j r2 = r8.sdk     // Catch:{ all -> 0x01aa }
            r9.<init>(r8, r2)     // Catch:{ all -> 0x01aa }
            r8.f2002L = r9     // Catch:{ all -> 0x01aa }
            com.applovin.impl.adview.n$12 r2 = new com.applovin.impl.adview.n$12     // Catch:{ all -> 0x01aa }
            r2.<init>()     // Catch:{ all -> 0x01aa }
            r9.mo12628a((com.applovin.impl.sdk.p023a.C1333b.C1341a) r2)     // Catch:{ all -> 0x01aa }
            com.applovin.impl.adview.n$23 r9 = new com.applovin.impl.adview.n$23     // Catch:{ all -> 0x01aa }
            r9.<init>()     // Catch:{ all -> 0x01aa }
            r8.f2008R = r9     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.j r9 = r8.sdk     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.a r9 = r9.mo13086Z()     // Catch:{ all -> 0x01aa }
            com.applovin.impl.sdk.utils.a r2 = r8.f2008R     // Catch:{ all -> 0x01aa }
            r9.mo12602a(r2)     // Catch:{ all -> 0x01aa }
            goto L_0x01bb
        L_0x018d:
            java.lang.String r9 = "No current ad found."
        L_0x018f:
            r8.exitWithError(r9)     // Catch:{ all -> 0x01aa }
            goto L_0x01bb
        L_0x0193:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01aa }
            r9.<init>()     // Catch:{ all -> 0x01aa }
            java.lang.String r2 = "Wrapper is null; initialized state: "
            r9.append(r2)     // Catch:{ all -> 0x01aa }
            boolean r2 = com.applovin.impl.adview.C1138o.f2085b     // Catch:{ all -> 0x01aa }
            r9.append(r2)     // Catch:{ all -> 0x01aa }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01aa }
            goto L_0x018f
        L_0x01a7:
            java.lang.String r9 = "Wrapper ID is null"
            goto L_0x018f
        L_0x01aa:
            r9 = move-exception
            com.applovin.impl.sdk.q r2 = r8.logger     // Catch:{ all -> 0x01cc }
            if (r2 == 0) goto L_0x01b6
            com.applovin.impl.sdk.q r2 = r8.logger     // Catch:{ all -> 0x01cc }
            java.lang.String r3 = "Encountered error during onCreate."
            r2.mo13278b(r0, r3, r9)     // Catch:{ all -> 0x01cc }
        L_0x01b6:
            java.lang.String r9 = "An error was encountered during interstitial ad creation."
            r8.exitWithError(r9)     // Catch:{ all -> 0x01cc }
        L_0x01bb:
            android.os.StrictMode.setThreadPolicy(r1)
            r8.m1700g()
            com.applovin.impl.sdk.c.d r9 = r8.f2013d
            if (r9 == 0) goto L_0x01c8
            r9.mo12898a()
        L_0x01c8:
            r8.m1649J()
            return
        L_0x01cc:
            r9 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C1103n.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r4.currentAd != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r4.currentAd == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        m1655P();
        m1686c((com.applovin.sdk.AppLovinAd) r4.currentAd);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        super.onDestroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0084, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r4 = this;
            com.applovin.impl.adview.m r0 = r4.f2010a     // Catch:{ all -> 0x0067 }
            r1 = 0
            if (r0 == 0) goto L_0x001d
            com.applovin.impl.adview.m r0 = r4.f2010a     // Catch:{ all -> 0x0067 }
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ all -> 0x0067 }
            boolean r2 = r0 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0016
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x0067 }
            com.applovin.impl.adview.m r2 = r4.f2010a     // Catch:{ all -> 0x0067 }
            r0.removeView(r2)     // Catch:{ all -> 0x0067 }
        L_0x0016:
            com.applovin.impl.adview.m r0 = r4.f2010a     // Catch:{ all -> 0x0067 }
            r0.destroy()     // Catch:{ all -> 0x0067 }
            r4.f2010a = r1     // Catch:{ all -> 0x0067 }
        L_0x001d:
            com.applovin.impl.adview.AppLovinVideoView r0 = r4.videoView     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x002b
            com.applovin.impl.adview.AppLovinVideoView r0 = r4.videoView     // Catch:{ all -> 0x0067 }
            r0.pause()     // Catch:{ all -> 0x0067 }
            com.applovin.impl.adview.AppLovinVideoView r0 = r4.videoView     // Catch:{ all -> 0x0067 }
            r0.stopPlayback()     // Catch:{ all -> 0x0067 }
        L_0x002b:
            com.applovin.impl.sdk.j r0 = r4.sdk     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0047
            java.lang.ref.WeakReference<android.media.MediaPlayer> r0 = r4.f2001K     // Catch:{ all -> 0x0067 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0067 }
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x003c
            r0.release()     // Catch:{ all -> 0x0067 }
        L_0x003c:
            com.applovin.impl.sdk.j r0 = r4.sdk     // Catch:{ all -> 0x0067 }
            com.applovin.impl.sdk.a r0 = r0.mo13086Z()     // Catch:{ all -> 0x0067 }
            com.applovin.impl.sdk.utils.a r2 = r4.f2008R     // Catch:{ all -> 0x0067 }
            r0.mo12604b(r2)     // Catch:{ all -> 0x0067 }
        L_0x0047:
            com.applovin.impl.adview.i r0 = r4.countdownManager     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0050
            com.applovin.impl.adview.i r0 = r4.countdownManager     // Catch:{ all -> 0x0067 }
            r0.mo11959b()     // Catch:{ all -> 0x0067 }
        L_0x0050:
            android.os.Handler r0 = r4.f1993C     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0059
            android.os.Handler r0 = r4.f1993C     // Catch:{ all -> 0x0067 }
            r0.removeCallbacksAndMessages(r1)     // Catch:{ all -> 0x0067 }
        L_0x0059:
            android.os.Handler r0 = r4.f1992B     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0062
            android.os.Handler r0 = r4.f1992B     // Catch:{ all -> 0x0067 }
            r0.removeCallbacksAndMessages(r1)     // Catch:{ all -> 0x0067 }
        L_0x0062:
            com.applovin.impl.sdk.ad.g r0 = r4.currentAd
            if (r0 == 0) goto L_0x0081
            goto L_0x0079
        L_0x0067:
            r0 = move-exception
            com.applovin.impl.sdk.q r1 = r4.logger     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0075
            com.applovin.impl.sdk.q r1 = r4.logger     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "InterActivity"
            java.lang.String r3 = "Unable to destroy video view"
            r1.mo13276a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0085 }
        L_0x0075:
            com.applovin.impl.sdk.ad.g r0 = r4.currentAd
            if (r0 == 0) goto L_0x0081
        L_0x0079:
            r4.m1655P()
            com.applovin.impl.sdk.ad.g r0 = r4.currentAd
            r4.m1686c((com.applovin.sdk.AppLovinAd) r0)
        L_0x0081:
            super.onDestroy()
            return
        L_0x0085:
            r0 = move-exception
            com.applovin.impl.sdk.ad.g r1 = r4.currentAd
            if (r1 == 0) goto L_0x0092
            r4.m1655P()
            com.applovin.impl.sdk.ad.g r1 = r4.currentAd
            r4.m1686c((com.applovin.sdk.AppLovinAd) r1)
        L_0x0092:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C1103n.onDestroy():void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if ((i == 25 || i == 24) && this.currentAd.mo12790ad() && m1651L()) {
            toggleMute();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.logger.mo13277b("InterActivity", "App paused...");
        this.f2026q = System.currentTimeMillis();
        if (this.postitialWasDisplayed) {
            m1652M();
        }
        this.f2002L.mo12627a();
        pauseReportRewardTask();
        m1682b("javascript:al_onAppPaused();");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r0 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r2 == false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r5 = this;
            super.onResume()
            com.applovin.impl.sdk.q r0 = r5.logger
            java.lang.String r1 = "InterActivity"
            java.lang.String r2 = "App resumed..."
            r0.mo13277b(r1, r2)
            boolean r0 = r5.f2023n
            if (r0 != 0) goto L_0x00ae
            com.applovin.impl.sdk.c.d r0 = r5.f2013d
            if (r0 == 0) goto L_0x001e
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r5.f2026q
            long r1 = r1 - r3
            r0.mo12905d(r1)
        L_0x001e:
            com.applovin.impl.sdk.j r0 = r5.sdk
            com.applovin.impl.sdk.b.e<java.lang.Boolean> r1 = com.applovin.impl.sdk.p025b.C1371e.f3171w
            r2 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.mo13112b(r1, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 0
            if (r0 == 0) goto L_0x0070
            com.applovin.impl.sdk.a.b r0 = r5.f2002L
            boolean r0 = r0.mo12631d()
            if (r0 != 0) goto L_0x0070
            boolean r0 = r5.postitialWasDisplayed
            if (r0 != 0) goto L_0x0070
            r5.m1653N()
            r5.m1735y()
            com.applovin.impl.sdk.ad.g r0 = r5.currentAd
            if (r0 == 0) goto L_0x00aa
            com.applovin.impl.sdk.j r0 = r5.sdk
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r1 = com.applovin.impl.sdk.p025b.C1369c.f2966cD
            java.lang.Object r0 = r0.mo13088a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00aa
            com.applovin.impl.sdk.ad.g r0 = r5.currentAd
            boolean r0 = r0.mo12744D()
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r5.postitialWasDisplayed
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r5.f2021l
            if (r0 == 0) goto L_0x00aa
            com.applovin.impl.adview.h r0 = r5.f1997G
            if (r0 == 0) goto L_0x00aa
            goto L_0x00a7
        L_0x0070:
            com.applovin.impl.sdk.ad.g r0 = r5.currentAd
            boolean r0 = r0 instanceof com.applovin.impl.sdk.p024ad.C1345a
            if (r0 == 0) goto L_0x0081
            com.applovin.impl.sdk.ad.g r0 = r5.currentAd
            com.applovin.impl.sdk.ad.a r0 = (com.applovin.impl.sdk.p024ad.C1345a) r0
            boolean r0 = r0.mo12701k()
            if (r0 == 0) goto L_0x0081
            r2 = 1
        L_0x0081:
            com.applovin.impl.sdk.ad.g r0 = r5.currentAd
            if (r0 == 0) goto L_0x00aa
            com.applovin.impl.sdk.j r0 = r5.sdk
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r1 = com.applovin.impl.sdk.p025b.C1369c.f2966cD
            java.lang.Object r0 = r0.mo13088a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00aa
            com.applovin.impl.sdk.ad.g r0 = r5.currentAd
            boolean r0 = r0.mo12743C()
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r5.postitialWasDisplayed
            if (r0 == 0) goto L_0x00aa
            com.applovin.impl.adview.h r0 = r5.f1995E
            if (r0 == 0) goto L_0x00aa
            if (r2 != 0) goto L_0x00aa
        L_0x00a7:
            r5.m1660a((long) r3, (com.applovin.impl.adview.C1086h) r0)
        L_0x00aa:
            r5.resumeReportRewardTask()
            goto L_0x00c9
        L_0x00ae:
            com.applovin.impl.sdk.a.b r0 = r5.f2002L
            boolean r0 = r0.mo12631d()
            if (r0 != 0) goto L_0x00c9
            boolean r0 = r5.postitialWasDisplayed
            if (r0 != 0) goto L_0x00c9
            com.applovin.impl.sdk.ad.g r0 = r5.currentAd
            if (r0 == 0) goto L_0x00c9
            com.applovin.impl.sdk.ad.g r0 = r5.currentAd
            boolean r0 = r0.mo12760T()
            if (r0 == 0) goto L_0x00c9
            r5.m1735y()
        L_0x00c9:
            java.lang.String r0 = "javascript:al_onAppResumed();"
            r5.m1682b((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C1103n.onResume():void");
    }

    public void onRingerModeChanged(int i) {
        String str;
        if (this.f2035z != C1452e.f3420a) {
            this.f1991A = true;
        }
        C1072c adWebView = ((AdViewControllerImpl) this.f2010a.getAdViewController()).getAdWebView();
        if (adWebView != null) {
            if (C1452e.m2996a(i) && !C1452e.m2996a(this.f2035z)) {
                str = "javascript:al_muteSwitchOn();";
            } else if (i == 2) {
                str = "javascript:al_muteSwitchOff();";
            }
            adWebView.mo11889a(str);
        }
        this.f2035z = i;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("instance_impression_tracked", this.f2033x.get());
        bundle.putInt("original_orientation", this.f2031v);
    }

    public void onWindowFocusChanged(boolean z) {
        String str;
        super.onWindowFocusChanged(z);
        C1469j jVar = this.sdk;
        if (z) {
            if (jVar != null) {
                this.logger.mo13277b("InterActivity", "Window gained focus");
                try {
                    if (!C1519g.m3432c() || !((Boolean) this.sdk.mo13088a(C1369c.f3045de)).booleanValue() || !m1672a()) {
                        getWindow().setFlags(1024, 1024);
                    } else {
                        m1676b();
                        if (((Long) this.sdk.mo13088a(C1369c.f2976cN)).longValue() > 0) {
                            this.f1993C.postDelayed(new Runnable() {
                                public void run() {
                                    C1103n.this.m1676b();
                                }
                            }, ((Long) this.sdk.mo13088a(C1369c.f2976cN)).longValue());
                        }
                    }
                    if (((Boolean) this.sdk.mo13088a(C1369c.f2977cO)).booleanValue() && !this.postitialWasDisplayed) {
                        m1653N();
                        resumeReportRewardTask();
                    }
                } catch (Throwable th) {
                    this.logger.mo13278b("InterActivity", "Setting window flags failed.", th);
                }
                this.f2023n = false;
                m1682b("javascript:al_onWindowFocusChanged( " + z + " );");
            }
            str = "Window gained focus. SDK is null.";
        } else if (jVar != null) {
            this.logger.mo13277b("InterActivity", "Window lost focus");
            if (((Boolean) this.sdk.mo13088a(C1369c.f2977cO)).booleanValue() && !this.postitialWasDisplayed) {
                m1652M();
                pauseReportRewardTask();
            }
            this.f2023n = false;
            m1682b("javascript:al_onWindowFocusChanged( " + z + " );");
        } else {
            str = "Window lost focus. SDK is null.";
        }
        C1505q.m3342f("InterActivity", str);
        this.f2023n = false;
        m1682b("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    public void pauseReportRewardTask() {
        C1554p pVar = this.f2007Q;
        if (pVar != null) {
            pVar.mo13345b();
        }
    }

    /* access modifiers changed from: protected */
    public void playVideo() {
        m1694d((AppLovinAd) this.currentAd);
        this.videoView.start();
        this.countdownManager.mo11957a();
    }

    public void resumeReportRewardTask() {
        C1554p pVar = this.f2007Q;
        if (pVar != null) {
            pVar.mo13346c();
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldContinueFullLengthVideoCountdown() {
        return !this.f2014e && !this.postitialWasDisplayed;
    }

    public void showPostitial() {
        try {
            m1650K();
            if (this.f2010a != null) {
                ViewParent parent = this.f2010a.getParent();
                if ((parent instanceof ViewGroup) && (!((Boolean) this.sdk.mo13088a(C1369c.f3119fa)).booleanValue() || parent != this.f1994D)) {
                    ((ViewGroup) parent).removeView(this.f2010a);
                }
                FrameLayout frameLayout = ((Boolean) this.sdk.mo13088a(C1369c.f3119fa)).booleanValue() ? this.f1994D : new FrameLayout(this);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setBackgroundColor(this.currentAd.mo12749I());
                if (((Boolean) this.sdk.mo13088a(C1369c.f3119fa)).booleanValue()) {
                    this.f2010a.setVisibility(0);
                } else {
                    frameLayout.addView(this.f2010a);
                }
                if (this.f1994D != null) {
                    if (((Boolean) this.sdk.mo13088a(C1369c.f3119fa)).booleanValue()) {
                        C1513b.m3409a(this.f1994D, this.f2010a);
                    } else {
                        this.f1994D.removeAllViewsInLayout();
                    }
                }
                if (m1714n() && this.f1996F != null) {
                    if (this.f1996F.getParent() instanceof ViewGroup) {
                        ((ViewGroup) this.f1996F.getParent()).removeView(this.f1996F);
                    }
                    frameLayout.addView(this.f1996F);
                    this.f1996F.bringToFront();
                }
                if (this.f1995E != null) {
                    ViewParent parent2 = this.f1995E.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ((ViewGroup) parent2).removeView(this.f1995E);
                    }
                    frameLayout.addView(this.f1995E);
                    this.f1995E.bringToFront();
                }
                if (!((Boolean) this.sdk.mo13088a(C1369c.f3119fa)).booleanValue()) {
                    setContentView(frameLayout);
                }
                if (((Boolean) this.sdk.mo13088a(C1369c.f3087eU)).booleanValue()) {
                    this.f2010a.setVisibility(4);
                    this.f2010a.setVisibility(0);
                }
                m1670a("javascript:al_onPoststitialShow();", (long) this.currentAd.mo12766Z());
            }
            if ((this.currentAd instanceof C1345a) && ((C1345a) this.currentAd).mo12701k()) {
                this.logger.mo13277b("InterActivity", "Skip showing of close button");
            } else if (this.currentAd.mo12821r() >= 0) {
                m1660a(C1557r.m3615b((float) this.currentAd.mo12821r()), this.f1995E);
            } else if (this.currentAd.mo12821r() == -2) {
                this.f1995E.setVisibility(0);
            } else {
                m1660a(0, this.f1995E);
            }
            this.postitialWasDisplayed = true;
        } catch (Throwable th) {
            this.logger.mo13278b("InterActivity", "Encountered error while showing postitial. Dismissing...", th);
            dismiss();
        }
    }

    public void skipVideo() {
        this.f2029t = SystemClock.elapsedRealtime() - this.f2028s;
        C1382d dVar = this.f2013d;
        if (dVar != null) {
            dVar.mo12907f();
        }
        if (this.currentAd.mo12824u()) {
            dismiss();
        } else {
            showPostitial();
        }
    }

    public void toggleMute() {
        boolean z = !m1651L();
        try {
            m1687c(z);
            m1671a(z);
            m1683b(z);
        } catch (Throwable th) {
            this.logger.mo13278b("InterActivity", "Unable to set volume to " + z, th);
        }
    }
}
