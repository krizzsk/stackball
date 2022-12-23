package com.fyber.inneractive.sdk.player.p058b;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.C2813y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2746f;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.p047g.p048a.C2917b;
import com.fyber.inneractive.sdk.p047g.p048a.C2922g;
import com.fyber.inneractive.sdk.p047g.p048a.C2933r;
import com.fyber.inneractive.sdk.p051j.C3022i;
import com.fyber.inneractive.sdk.p056m.C3037c;
import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.p084ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.player.C3145b;
import com.fyber.inneractive.sdk.player.enums.C3608b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p058b.C3161f;
import com.fyber.inneractive.sdk.player.p058b.C3185j;
import com.fyber.inneractive.sdk.player.p083e.C3598c;
import com.fyber.inneractive.sdk.player.p083e.C3601f;
import com.fyber.inneractive.sdk.player.p083e.C3602g;
import com.fyber.inneractive.sdk.util.C3617a;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.C3644b;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3685u;
import com.fyber.inneractive.sdk.util.C3690v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.videokit.C3708R;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.fyber.inneractive.sdk.player.b.h */
public abstract class C3174h<ListenerT extends C3185j> implements C3154b<ListenerT>, C3161f.C3169a, C3161f.C3170b, C3601f {

    /* renamed from: a */
    private Runnable f7882a;

    /* renamed from: b */
    private float f7883b;

    /* renamed from: c */
    private boolean f7884c;

    /* renamed from: d */
    protected C3145b f7885d;

    /* renamed from: e */
    protected C2809u f7886e;

    /* renamed from: f */
    protected C2767s f7887f;

    /* renamed from: g */
    protected C3602g f7888g;

    /* renamed from: h */
    C3161f.C3171c f7889h;

    /* renamed from: i */
    protected int f7890i;

    /* renamed from: j */
    protected ListenerT f7891j;

    /* renamed from: k */
    protected boolean f7892k;

    /* renamed from: l */
    Runnable f7893l;

    /* renamed from: m */
    Application.ActivityLifecycleCallbacks f7894m;

    /* renamed from: n */
    protected boolean f7895n;

    /* renamed from: o */
    Bitmap f7896o;

    /* renamed from: p */
    AsyncTask<?, ?, ?> f7897p;

    /* renamed from: q */
    boolean f7898q;

    /* renamed from: r */
    C3598c f7899r;

    /* renamed from: s */
    protected Skip f7900s;

    /* renamed from: t */
    private boolean f7901t;

    /* renamed from: u */
    private boolean f7902u;

    /* renamed from: v */
    private boolean f7903v;

    /* renamed from: w */
    private boolean f7904w;

    /* renamed from: x */
    private GestureDetector f7905x;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18807a(C3629aj ajVar) {
    }

    /* renamed from: a */
    public final void mo18744a(Exception exc) {
    }

    /* renamed from: c */
    public final void mo18749c(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo18810f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo18811g();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo18813i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo18814j();

    /* renamed from: l */
    public void mo18816l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo18817m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo18848r() {
    }

    /* renamed from: c */
    public boolean mo18795c() {
        C3145b bVar = this.f7885d;
        if (bVar == null) {
            return false;
        }
        if (this.f7892k || !bVar.mo18764r()) {
            return true;
        }
        C3602g gVar = this.f7888g;
        if (gVar != null && gVar.mo19517i()) {
            return true;
        }
        if (!C3145b.m7430a(this.f7885d.mo18763q(), this.f7885d.mo18765s(), C3145b.m7425a(this.f7885d)) || this.f7892k || this.f7890i != 0) {
            return false;
        }
        return true;
    }

    public C3174h(C3145b bVar, C3602g gVar, C2809u uVar, C2767s sVar, boolean z) {
        this(bVar, gVar, uVar, sVar, z, (Skip) null);
    }

    public C3174h(C3145b bVar, C3602g gVar, C2809u uVar, C2767s sVar, boolean z, Skip skip) {
        this.f7890i = 0;
        this.f7892k = false;
        this.f7883b = -0.1f;
        this.f7901t = false;
        this.f7902u = false;
        this.f7896o = null;
        this.f7897p = null;
        this.f7903v = false;
        this.f7904w = false;
        this.f7898q = false;
        this.f7900s = null;
        this.f7900s = skip;
        this.f7885d = bVar;
        this.f7886e = uVar;
        this.f7887f = sVar;
        this.f7888g = gVar;
        this.f7895n = z;
        gVar.setListener(this);
        C3145b bVar2 = this.f7885d;
        if (!(bVar2 == null || bVar2.mo18752f() == null)) {
            this.f7885d.mo18752f().mo18820a((C3161f.C3170b) this);
            this.f7885d.mo18752f().mo18819a((C3161f.C3169a) this);
        }
        this.f7905x = new GestureDetector(gVar.getContext(), new GestureDetector.SimpleOnGestureListener() {
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return true;
            }
        });
    }

    /* renamed from: a */
    public final void mo18790a(ListenerT listenert) {
        this.f7891j = listenert;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo18847q() {
        Bitmap b;
        if (this.f7899r != null) {
            IAlog.m9034b("%sdestroyTextureView", IAlog.m9029a((Object) this));
            if ((this.f7896o != null) && (b = mo18792b(false)) != null) {
                this.f7888g.setLastFrameBitmap(b);
                this.f7888g.mo19501a(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo18843f(boolean z) {
        C3145b bVar = this.f7885d;
        if (bVar == null) {
            return;
        }
        if (!bVar.mo18750d()) {
            mo18818n();
        } else if (!z || this.f7885d.mo18752f() == null) {
            this.f7885d.mo18751e();
        } else {
            this.f7885d.mo18752f().mo18770a(0);
        }
    }

    /* renamed from: s */
    private void mo18849s() {
        Runnable runnable = this.f7893l;
        if (runnable != null) {
            this.f7888g.removeCallbacks(runnable);
            this.f7893l = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo18815k() {
        this.f7888g.mo19511g(false);
        this.f7888g.mo19509f(false);
        this.f7888g.mo19504b(false, false);
        this.f7888g.mo19505c(true);
        this.f7888g.mo19503b(true);
        this.f7888g.mo19506d(true);
        mo18849s();
        if (this.f7885d != null && mo18810f() && !this.f7892k && C3145b.m7430a(this.f7885d.mo18763q(), this.f7885d.mo18765s(), C3145b.m7425a(this.f7885d)) && this.f7882a == null) {
            if (this.f7890i <= 0) {
                this.f7888g.mo19507e(true);
                mo18858x();
            } else {
                C3145b bVar = this.f7885d;
                if (bVar == null || bVar.mo18752f() == null || this.f7890i < this.f7885d.mo18752f().mo18783h() / 1000) {
                    this.f7888g.mo19507e(true);
                    m7618c(this.f7890i);
                } else {
                    this.f7888g.mo19507e(false);
                }
            }
        }
        ListenerT listenert = this.f7891j;
        if (listenert != null && !this.f7884c) {
            this.f7884c = true;
            listenert.mo18487b();
        }
        this.f7902u = false;
        this.f7904w = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo18846p() {
        mo18849s();
        this.f7888g.mo19511g(false);
        mo18818n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo18855u() {
        if (!this.f7888g.mo19496e()) {
            this.f7888g.mo19511g(false);
            mo18849s();
            mo18818n();
            this.f7884c = false;
            this.f7892k = true;
        }
    }

    /* renamed from: a */
    private void m7616a(int i, int i2) {
        Bitmap bitmap = this.f7896o;
        if (!(bitmap != null && bitmap.getWidth() == i && this.f7896o.getHeight() == i2) && i2 > 0 && i > 0) {
            AsyncTask<?, ?, ?> asyncTask = this.f7897p;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            this.f7896o = null;
            C31773 r0 = new AsyncTask<Integer, Void, Bitmap>() {
                /* access modifiers changed from: protected */
                public final /* synthetic */ Object doInBackground(Object[] objArr) {
                    Integer[] numArr = (Integer[]) objArr;
                    int intValue = numArr[0].intValue();
                    int intValue2 = numArr[1].intValue();
                    Application p = C3657l.m9125p();
                    if (p == null || p.getResources() == null || p.getResources().getDisplayMetrics() == null) {
                        return null;
                    }
                    DisplayMetrics displayMetrics = p.getResources().getDisplayMetrics();
                    Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                    if (createBitmap != null) {
                        createBitmap.setDensity(displayMetrics.densityDpi);
                    }
                    return createBitmap;
                }

                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    super.onPostExecute(bitmap);
                    C3174h hVar = C3174h.this;
                    hVar.f7896o = bitmap;
                    hVar.f7897p = null;
                }
            };
            this.f7897p = r0;
            C3657l.m9111a(r0, (P[]) new Integer[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }
    }

    /* renamed from: b */
    public final Bitmap mo18792b(boolean z) {
        C3145b bVar;
        if (!(this.f7896o == null || (bVar = this.f7885d) == null || bVar.mo18752f() == null)) {
            if (this.f7902u) {
                return this.f7885d.f7779g;
            }
            TextureView textureView = this.f7885d.mo18752f().f7857m;
            Object[] objArr = new Object[3];
            objArr[0] = IAlog.m9029a((Object) this);
            objArr[1] = textureView;
            objArr[2] = Boolean.valueOf(textureView != null && textureView.isAvailable());
            IAlog.m9034b("%sSave snapshot entered: tv = %s avail = %s", objArr);
            if (textureView != null && textureView.isAvailable()) {
                try {
                    IAlog.m9033a("creating bitmap on object - %s", this.f7896o);
                    Bitmap bitmap = textureView.getBitmap(this.f7896o);
                    if (this.f7888g.getVideoWidth() > 0 && this.f7888g.getVideoHeight() > 0) {
                        this.f7896o = null;
                        m7616a(this.f7888g.getVideoWidth(), this.f7888g.getVideoHeight());
                    }
                    if (z) {
                        C3644b bVar2 = new C3644b();
                        bVar2.f9924c = 20;
                        bVar2.f9925d = 1;
                        bVar2.f9922a = bitmap.getWidth();
                        bVar2.f9923b = bitmap.getHeight();
                        this.f7885d.mo18739a(C3617a.m9040a(this.f7888g.getContext(), bitmap, bVar2));
                        this.f7902u = true;
                    } else {
                        this.f7885d.mo18739a(bitmap);
                    }
                    IAlog.m9033a("%ssave snapshot succeeded", IAlog.m9029a((Object) this));
                    return this.f7885d.f7779g;
                } catch (Exception unused) {
                    IAlog.m9033a("%ssave snapshot failed with exception", IAlog.m9029a((Object) this));
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo18793b() {
        C3145b bVar = this.f7885d;
        if (bVar != null && bVar.mo18752f() != null) {
            if (this.f7885d.mo18752f().mo18824p() != C3608b.Paused) {
                IAlog.m9034b("%spauseVideo %s", IAlog.m9029a((Object) this), this.f7888g);
                TextureView textureView = this.f7885d.mo18752f().f7857m;
                if (textureView != null && textureView.getParent() != null && textureView.getParent().equals(this.f7888g.getTextureHost())) {
                    this.f7885d.mo18752f().mo18777c();
                    return;
                }
                return;
            }
            IAlog.m9034b("%spauseVideo called in bad state! %s", IAlog.m9029a((Object) this), this.f7885d.mo18752f().mo18824p());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo18818n() {
        boolean b = IAConfigManager.m5929c().f6586a.mo18050b(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).mo18043b("dsos");
        C3145b bVar = this.f7885d;
        if ((bVar != null && bVar.mo18752f() != null && this.f7885d.mo18752f().mo18824p().equals(C3608b.f9847i)) || ((this.f7904w && !b) || this.f7898q)) {
            C3145b bVar2 = this.f7885d;
            View h = bVar2 != null ? bVar2.mo18754h() : null;
            C3602g gVar = this.f7888g;
            gVar.mo19507e(false);
            gVar.mo19503b(false);
            gVar.mo19505c(false);
            gVar.mo19506d(false);
            gVar.mo19502a(false, false);
            if (gVar.f9815t != null) {
                gVar.f9815t.setVisibility(4);
            }
            if (h != null) {
                if (h instanceof C3037c) {
                    C3155c i = this.f7885d.mo18755i();
                    C31795 r4 = new C3039d.C3056h() {
                        /* renamed from: a */
                        public final void mo18463a(String str, String str2) {
                            IAlog.m9034b(IAlog.m9029a((Object) C3174h.this) + "web view callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
                            if (C3174h.this.f7891j != null) {
                                C3174h.this.f7891j.mo18484a(str, str2);
                            }
                        }

                        /* renamed from: a */
                        public final void mo18461a() {
                            C2917b n;
                            IAlog.m9034b("%sweb view callback: onClickedAndOpen", IAlog.m9029a((Object) C3174h.this));
                            if (C3174h.this.f7891j != null) {
                                if (!(C3174h.this.f7885d == null || (n = C3174h.this.f7885d.mo18760n()) == null)) {
                                    C3174h.this.f7885d.mo18741a((C3022i) n, VideoClickOrigin.COMPANION, C2933r.EVENT_CLICK);
                                }
                                IAlog.m9030a(IAlog.f9871b, "AD_CLICKED", new Object[0]);
                                C3174h.this.f7891j.mo18488c();
                            }
                        }

                        /* renamed from: a */
                        public final C3685u.C3686a mo18460a(String str, C3629aj ajVar) {
                            C2917b n;
                            IAlog.m9034b("%sweb view callback: onClicked", IAlog.m9029a((Object) C3174h.this));
                            if (C3174h.this.f7891j == null) {
                                return new C3685u.C3686a(C3685u.C3688c.FAILED, new Exception("mListener is null, internal SDK fatal error"), "null");
                            }
                            if (!(C3174h.this.f7885d == null || (n = C3174h.this.f7885d.mo18760n()) == null)) {
                                C3174h.this.f7885d.mo18741a((C3022i) n, VideoClickOrigin.COMPANION, C2933r.EVENT_CLICK);
                            }
                            IAlog.m9030a(IAlog.f9871b, "AD_CLICKED", new Object[0]);
                            return C3174h.this.f7891j.mo18480a(str, ajVar);
                        }

                        /* renamed from: b */
                        public final void mo18467b() {
                            if (C3174h.this.f7891j != null) {
                                C3174h.this.f7891j.mo18492e_();
                            }
                        }

                        /* renamed from: a */
                        public final boolean mo18466a(String str) {
                            View endCardView = C3174h.this.f7888g.getEndCardView();
                            if (C3174h.this.f7891j == null) {
                                return false;
                            }
                            C3174h.this.f7891j.mo18483a(endCardView, str);
                            return true;
                        }

                        /* renamed from: a */
                        public final void mo18462a(InneractiveUnitController.AdDisplayError adDisplayError) {
                            if (C3174h.this.f7891j != null) {
                                C3174h.this.f7891j.mo18489c_();
                            }
                        }

                        /* renamed from: c */
                        public final void mo18469c() {
                            if (C3174h.this.f7891j != null) {
                                C3174h.this.f7891j.mo18491d_();
                            }
                        }

                        /* renamed from: d */
                        public final void mo18470d() {
                            if (C3174h.this.f7891j != null) {
                                C3174h.this.f7891j.mo18491d_();
                            }
                        }

                        /* renamed from: e */
                        public final void mo18471e() {
                            if (C3174h.this.f7891j != null) {
                                C3174h.this.f7891j.mo18490d();
                            }
                        }

                        /* renamed from: a */
                        public final void mo18464a(boolean z) {
                            IAlog.m9034b("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.m9029a((Object) C3174h.this), Boolean.valueOf(z));
                            if (C3174h.this.f7891j != null && z) {
                                C3174h.this.f7891j.mo18494p();
                            }
                        }

                        /* renamed from: a */
                        public final void mo18465a(boolean z, Orientation orientation) {
                            IAlog.m9034b("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.m9029a((Object) C3174h.this), Boolean.valueOf(z), orientation.toString());
                            if (C3174h.this.f7891j != null) {
                                C3174h.this.f7891j.mo18485a(z, orientation);
                            }
                        }
                    };
                    if (i.f7812a != null) {
                        i.f7812a.setListener(r4);
                    }
                    C3155c i2 = this.f7885d.mo18755i();
                    if (i2.f7812a != null) {
                        IAmraidWebViewController iAmraidWebViewController = i2.f7812a;
                        C3690v.m9190a(i2.f7813b);
                        iAmraidWebViewController.mo19531b();
                    }
                    C3155c i3 = this.f7885d.mo18755i();
                    if (!(i3.f7812a != null && i3.f7812a.mo18611q())) {
                        C3155c i4 = this.f7885d.mo18755i();
                        if (i4.f7812a != null) {
                            i4.f7812a.mo18545a(true);
                        }
                    } else {
                        return;
                    }
                }
                mo18847q();
                this.f7888g.mo19501a(false);
                this.f7888g.mo19508f();
                this.f7888g.mo19509f(false);
                this.f7888g.mo19499a(h);
                this.f7885d.mo18756j();
                h.requestFocus();
                return;
            }
            if (this.f7899r != null) {
                Bitmap b2 = mo18792b(true);
                if (b2 != null) {
                    this.f7888g.setLastFrameBitmap(b2);
                }
            } else {
                Bitmap bitmap = this.f7885d.f7779g;
                if (bitmap != null) {
                    this.f7888g.setLastFrameBitmap(bitmap);
                }
            }
            this.f7888g.mo19501a(true);
            this.f7888g.mo19504b(true, ((C2746f) this.f7887f.mo18010a(C2746f.class)).mo17984a("cta_text_all_caps", false));
            this.f7888g.mo19509f(false);
        } else if (!this.f7904w || !b) {
            this.f7888g.mo19509f(true);
        } else {
            this.f7888g.mo19501a(false);
            this.f7888g.mo19509f(false);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b.h$7 */
    static /* synthetic */ class C31827 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7913a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fyber.inneractive.sdk.player.enums.b[] r0 = com.fyber.inneractive.sdk.player.enums.C3608b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7913a = r0
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Prepared     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7913a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Buffering     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7913a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Playing     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7913a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Paused     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7913a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.f9847i     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f7913a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Error     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f7913a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Preparing     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f7913a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Seeking     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p058b.C3174h.C31827.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m7617a(C3608b bVar, boolean z) {
        ListenerT listenert;
        switch (C31827.f7913a[bVar.ordinal()]) {
            case 1:
                if (this.f7903v) {
                    this.f7888g.mo19501a(true);
                    mo18818n();
                    mo18848r();
                    return;
                }
                return;
            case 2:
                if (this.f7903v) {
                    this.f7888g.mo19511g(true);
                    this.f7888g.mo19509f(false);
                    Runnable runnable = this.f7893l;
                    if (runnable == null) {
                        if (runnable == null) {
                            this.f7893l = new Runnable() {
                                public final void run() {
                                    C3174h.this.f7893l = null;
                                    C3174h.this.mo18814j();
                                }
                            };
                        }
                        int i = mo18813i();
                        IAlog.m9034b("%s Starting buffering timeout with %d", IAlog.m9029a((Object) this), Integer.valueOf(i));
                        this.f7888g.postDelayed(this.f7893l, (long) i);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (this.f7903v) {
                    mo18815k();
                    return;
                }
                return;
            case 4:
                mo18846p();
                return;
            case 5:
                if (this.f7903v) {
                    mo18855u();
                    if (z && (listenert = this.f7891j) != null) {
                        listenert.mo18493l();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                if (this.f7903v) {
                    mo18797d(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: t */
    public final void mo18838t() {
        if (this.f7903v && !this.f7901t) {
            this.f7901t = true;
            this.f7888g.mo19501a(false);
        }
    }

    /* renamed from: a */
    public final void mo18837a(int i) {
        C2809u uVar;
        C3145b bVar = this.f7885d;
        if (bVar != null && bVar.mo18752f() != null) {
            float y = m7620y();
            C3145b bVar2 = this.f7885d;
            if (!(bVar2 == null || bVar2.mo18752f() == null || !this.f7885d.mo18752f().mo18799m())) {
                float f = this.f7883b;
                if (y != f) {
                    int i2 = (y > 0.0f ? 1 : (y == 0.0f ? 0 : -1));
                    if (i2 > 0 && f >= 0.0f && mo18856v()) {
                        mo18854i(true);
                    } else if (i2 == 0 && !mo18856v()) {
                        mo18853h(true);
                    }
                }
                mo18857w();
            }
            this.f7883b = y;
            int h = this.f7885d.mo18752f().mo18783h();
            int g = this.f7885d.mo18752f().mo18782g();
            int i3 = g / 1000;
            int i4 = h / 1000;
            int i5 = i4 - i3;
            if (i5 < 0 || (!this.f7885d.mo18752f().mo18799m() && g == h)) {
                i5 = 0;
            }
            if (this.f7888g.f9808m != null || this.f7888g.f9816u != null) {
                this.f7888g.setRemainingTime(Integer.toString(i5));
                if (this.f7890i >= i4) {
                    this.f7888g.mo19507e(false);
                } else if (!mo18810f() || !C3145b.m7430a(this.f7885d.mo18763q(), this.f7885d.mo18765s(), C3145b.m7425a(this.f7885d)) || this.f7892k) {
                    this.f7888g.mo19507e(false);
                } else {
                    int i6 = this.f7890i;
                    if (i3 < i6) {
                        m7618c(i6 - i3);
                    } else {
                        this.f7890i = 0;
                        mo18858x();
                    }
                    this.f7888g.mo19507e(true);
                }
                if (this.f7885d.mo18752f().mo18824p() != C3608b.Paused) {
                    C3602g gVar = this.f7888g;
                    if (gVar.f9816u != null) {
                        if (gVar.f9801D != null) {
                            gVar.removeCallbacks(gVar.f9801D);
                            gVar.f9801D = null;
                        }
                        int i7 = i4 * 1000;
                        gVar.f9816u.setMax(i7);
                        int i8 = i7 - (i5 * 1000);
                        gVar.f9800C = i8 + 1000;
                        int i9 = i8 + 200;
                        if (gVar.f9800C > 0 && gVar.f9800C <= i7) {
                            if (i9 >= gVar.f9799B || gVar.f9799B <= 0) {
                                gVar.f9799B = i9;
                                gVar.f9816u.setProgress(gVar.f9799B);
                                gVar.f9801D = new Runnable() {
                                    public final void run() {
                                        C3602g gVar = C3602g.this;
                                        int unused = gVar.f9799B = gVar.f9799B + 200;
                                        C3602g.this.f9816u.setProgress(C3602g.this.f9799B);
                                        if (C3602g.this.f9799B == C3602g.this.f9800C) {
                                            Runnable unused2 = C3602g.this.f9801D = null;
                                            int unused3 = C3602g.this.f9799B = 0;
                                            int unused4 = C3602g.this.f9800C = 0;
                                            return;
                                        }
                                        C3602g gVar2 = C3602g.this;
                                        gVar2.postDelayed(gVar2.f9801D, 200);
                                    }
                                };
                                gVar.postDelayed(gVar.f9801D, 200);
                            } else {
                                gVar.f9816u.setProgress(gVar.f9800C);
                            }
                        }
                    }
                    int a = IAConfigManager.m5929c().f6586a.mo18046a("max_rv_tsec", 30, 1);
                    if (i4 > a && i3 > a && (uVar = this.f7886e) != null && uVar.mo18070g() != null && this.f7886e.mo18070g().mo18080h() == UnitDisplayType.REWARDED) {
                        mo18858x();
                        this.f7888g.mo19507e(true);
                    }
                }
                ListenerT listenert = this.f7891j;
                if (listenert != null) {
                    listenert.mo18482a(h, g);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo18808e(boolean z) {
        C3145b bVar;
        Application p;
        if (this.f7903v != z && (bVar = this.f7885d) != null && bVar.mo18752f() != null) {
            IAlog.m9034b("%sonVisibilityChanged: %s my video view is%s", IAlog.m9029a((Object) this), Boolean.valueOf(z), this.f7888g);
            if (z) {
                this.f7903v = true;
                C3608b p2 = this.f7885d.mo18752f().mo18824p();
                if (p2.equals(C3608b.f9847i) || this.f7888g.mo19496e()) {
                    mo18855u();
                } else if (p2.equals(C3608b.Error) || (p2.equals(C3608b.Idle) && !this.f7885d.mo18762p())) {
                    mo18797d(false);
                } else {
                    if (p2 == C3608b.Start_in_progress || p2 == C3608b.Playing) {
                        mo18815k();
                    }
                    this.f7885d.mo18753g();
                    mo18809e();
                    if (this.f7894m == null && (p = C3657l.m9125p()) != null) {
                        C31784 r0 = new Application.ActivityLifecycleCallbacks() {
                            public final void onActivityCreated(Activity activity, Bundle bundle) {
                            }

                            public final void onActivityDestroyed(Activity activity) {
                            }

                            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            }

                            public final void onActivityStarted(Activity activity) {
                            }

                            public final void onActivityStopped(Activity activity) {
                            }

                            public final void onActivityResumed(Activity activity) {
                                if (activity.equals(C3174h.this.f7888g.getContext())) {
                                    C3174h.this.f7888g.f9796h = false;
                                    C3174h.this.f7888g.mo19487c();
                                }
                            }

                            public final void onActivityPaused(Activity activity) {
                                if (activity.equals(C3174h.this.f7888g.getContext())) {
                                    C3174h.this.f7888g.f9796h = true;
                                    C3174h.this.f7888g.mo19487c();
                                }
                            }
                        };
                        this.f7894m = r0;
                        p.registerActivityLifecycleCallbacks(r0);
                    }
                }
            } else {
                this.f7903v = false;
                C3145b bVar2 = this.f7885d;
                if (!(bVar2 == null || bVar2.mo18752f() == null || !this.f7885d.mo18752f().f7853i.equals(this.f7889h))) {
                    IAlog.m9034b("%sonVisibilityChanged pausing video", IAlog.m9029a((Object) this));
                    mo18793b();
                }
                mo18847q();
            }
        }
    }

    /* renamed from: a */
    public final void mo18851a(int i, C3629aj ajVar) {
        IAlog.m9034b("onClicked called with %d", Integer.valueOf(i));
        UnitDisplayType h = this.f7886e.mo18070g().mo18080h();
        C2813y n = IAConfigManager.m5943n();
        switch (i) {
            case 1:
                if (mo18856v()) {
                    mo18854i(true);
                    C3145b bVar = this.f7885d;
                    if (bVar != null) {
                        bVar.mo18742a(VideoClickOrigin.MUTE, C2933r.EVENT_UNMUTE);
                    }
                } else {
                    mo18853h(true);
                    C3145b bVar2 = this.f7885d;
                    if (bVar2 != null) {
                        bVar2.mo18742a(VideoClickOrigin.MUTE, C2933r.EVENT_MUTE);
                    }
                }
                mo18857w();
                return;
            case 2:
                mo18812h();
                return;
            case 3:
                n.mo18087a(h, "LAST_VAST_CLICKED_TYPE", "1");
                mo18852a(false, VideoClickOrigin.CTA, ajVar);
                return;
            case 4:
                n.mo18087a(h, "LAST_VAST_CLICKED_TYPE", "2");
                C3145b bVar3 = this.f7885d;
                String str = null;
                C2917b n2 = bVar3 != null ? bVar3.mo18760n() : null;
                if (n2 != null && n2.f6949a == C2922g.Static) {
                    str = n2.f6954f;
                    C3145b bVar4 = this.f7885d;
                    if (bVar4 != null) {
                        bVar4.mo18741a((C3022i) n2, VideoClickOrigin.COMPANION, C2933r.EVENT_CLICK);
                    }
                }
                ListenerT listenert = this.f7891j;
                if (listenert != null) {
                    listenert.mo18480a(str, ajVar);
                    return;
                }
                return;
            case 5:
                mo18817m();
                return;
            case 6:
                n.mo18087a(h, "LAST_VAST_SKIPED", "1");
                mo18797d(true);
                return;
            case 7:
                mo18807a(ajVar);
                return;
            case 8:
                n.mo18087a(h, "LAST_VAST_CLICKED_TYPE", "2");
                mo18852a(true, VideoClickOrigin.COMPANION, ajVar);
                return;
            case 9:
                if (this.f7885d != null && !this.f7888g.f9796h) {
                    this.f7885d.mo18747b(true);
                    mo18843f(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18852a(boolean z, VideoClickOrigin videoClickOrigin, C3629aj ajVar) {
        ListenerT listenert = this.f7891j;
        if (listenert != null) {
            if (z) {
                C3145b bVar = this.f7885d;
                if (bVar != null) {
                    listenert.mo18480a(bVar.mo18758l(), ajVar);
                    this.f7885d.mo18742a(videoClickOrigin, C2933r.EVENT_CLICK);
                }
            } else {
                C3685u.C3686a a = listenert.mo18479a(ajVar);
                C3145b bVar2 = this.f7885d;
                if (bVar2 != null) {
                    bVar2.mo18742a(videoClickOrigin, C2933r.EVENT_CLICK);
                }
                if (a.f9977a != C3685u.C3688c.FAILED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo18812h() {
        this.f7888g.mo19507e(true);
    }

    /* renamed from: d */
    public final void mo18797d(boolean z) {
        C3145b bVar;
        ListenerT listenert;
        this.f7904w = true;
        C3145b bVar2 = this.f7885d;
        if (!(bVar2 == null || bVar2.mo18752f() == null)) {
            this.f7885d.mo18752f().mo18826r();
            this.f7885d.mo18752f().mo18777c();
        }
        if (!this.f7888g.mo19496e()) {
            this.f7888g.mo19511g(false);
            mo18849s();
            mo18818n();
            this.f7884c = false;
            this.f7892k = true;
            C2809u uVar = this.f7886e;
            if (!(uVar == null || uVar.mo18070g() == null || this.f7886e.mo18070g().mo18080h() != UnitDisplayType.REWARDED || (listenert = this.f7891j) == null)) {
                listenert.mo18493l();
            }
        }
        if (this.f7891j != null && (this.f7890i <= 0 || this.f7892k || !((bVar = this.f7885d) == null || bVar.mo18752f() == null || !this.f7885d.mo18752f().mo18824p().equals(C3608b.f9847i)))) {
            this.f7891j.mo18486a_(z);
        }
        mo18847q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo18856v() {
        C3145b bVar = this.f7885d;
        if (bVar == null || bVar.mo18752f() == null || (!this.f7885d.mo18752f().mo18776b() && m7620y() != 0.0f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo18853h(boolean z) {
        C3145b bVar = this.f7885d;
        if (!(bVar == null || bVar.mo18752f() == null)) {
            this.f7885d.mo18752f().mo18773a(z);
        }
        this.f7888g.setMuteButtonState(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo18854i(boolean z) {
        C3145b bVar = this.f7885d;
        if (!(bVar == null || bVar.mo18752f() == null)) {
            this.f7885d.mo18752f().mo18775b(z);
        }
        this.f7888g.setMuteButtonState(false);
    }

    /* renamed from: c */
    private void m7618c(int i) {
        C3602g gVar = this.f7888g;
        if (gVar != null) {
            gVar.setSkipText(gVar.getContext().getString(C3708R.string.ia_video_before_skip_format, new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: y */
    private float m7620y() {
        try {
            return (float) ((AudioManager) this.f7888g.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo18857w() {
        if (this.f7888g.f9814s != null) {
            this.f7888g.setMuteButtonState(mo18856v());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo18858x() {
        if (mo18810f()) {
            C3602g gVar = this.f7888g;
            gVar.setSkipText(gVar.getContext().getString(C3708R.string.ia_video_skip_text));
            this.f7888g.mo19516h();
            this.f7890i = 0;
        }
    }

    /* renamed from: d */
    public final void mo18796d() {
        C3598c cVar;
        C3602g gVar = this.f7888g;
        if (gVar != null) {
            gVar.mo19494d();
        }
        C3145b bVar = this.f7885d;
        if (!(bVar == null || bVar.mo18752f() == null || (cVar = this.f7899r) == null)) {
            cVar.invalidate();
            this.f7899r.requestLayout();
        }
        C3602g gVar2 = this.f7888g;
        if (gVar2 != null) {
            gVar2.invalidate();
            this.f7888g.requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo18789a(Bitmap bitmap) {
        C3145b bVar = this.f7885d;
        if (bVar != null && bVar.mo18752f() != null && this.f7885d.mo18752f().mo18824p() != C3608b.f9847i) {
            this.f7888g.mo19511g(this.f7885d.mo18750d());
            this.f7888g.mo19501a(true);
            this.f7888g.setLastFrameBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public void mo18788a() {
        Application p;
        if (!(this.f7894m == null || (p = C3657l.m9125p()) == null)) {
            p.unregisterActivityLifecycleCallbacks(this.f7894m);
        }
        IAlog.m9034b("%sdestroy called", IAlog.m9029a((Object) this));
        C3145b bVar = this.f7885d;
        if (!(bVar == null || bVar.mo18752f() == null)) {
            C3161f f = this.f7885d.mo18752f();
            if (f.f7851g != null) {
                f.f7851g.remove(this);
            }
            C3161f f2 = this.f7885d.mo18752f();
            if (f2.f7852h != null) {
                f2.f7852h.remove(this);
            }
        }
        mo18847q();
        mo18849s();
        AsyncTask<?, ?, ?> asyncTask = this.f7897p;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.f7891j = null;
    }

    /* renamed from: a */
    public void mo18791a(boolean z) {
        IAlog.m9034b("%sinitUI", IAlog.m9029a((Object) this));
        C3145b bVar = this.f7885d;
        if (bVar != null && bVar.mo18752f() != null) {
            this.f7888g.setUnitConfig(this.f7886e);
            this.f7888g.mo19498a(this.f7885d.mo18752f().mo18779d(), this.f7885d.mo18752f().mo18780e(), this.f7895n);
            if (this.f7885d.mo18752f().mo18779d() > 0 && this.f7885d.mo18752f().mo18780e() > 0) {
                m7616a(this.f7885d.mo18752f().mo18779d(), this.f7885d.mo18752f().mo18780e());
            }
            if (mo18810f()) {
                this.f7890i = mo18811g();
            } else {
                this.f7888g.mo19507e(false);
            }
            if (!z) {
                mo18837a(this.f7885d.mo18752f().mo18782g());
                m7617a(this.f7885d.mo18752f().mo18824p(), false);
            }
            mo18857w();
        }
    }

    /* renamed from: a */
    public final void mo18743a(C3608b bVar) {
        IAlog.m9034b("%sonPlayerStateChanged with %s", IAlog.m9029a((Object) this), bVar);
        m7617a(bVar, true);
    }

    /* renamed from: o */
    public void mo18845o() {
        IAlog.m9034b("%sonVideoViewDetachedFromWindow", IAlog.m9029a((Object) this));
        mo18847q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo18809e() {
        if (this.f7899r == null) {
            this.f7899r = new C3598c(this.f7888g);
        }
        IAlog.m9034b("%sconnectToTextureView called %s", IAlog.m9029a((Object) this), this.f7888g.getTextureHost());
        if (this.f7899r == null || !this.f7888g.getTextureHost().equals(this.f7899r.getParent())) {
            C3145b bVar = this.f7885d;
            if (!(bVar == null || bVar.mo18752f() == null)) {
                C3161f f = this.f7885d.mo18752f();
                C3598c cVar = this.f7899r;
                if (f.f7857m != cVar) {
                    if (f.f7857m != null) {
                        f.f7857m.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
                    }
                    f.f7857m = cVar;
                    if (f.f7860p == null) {
                        f.f7860p = new TextureView.SurfaceTextureListener() {
                            public final void onSurfaceTextureSizeChanged(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.b.f.1.onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture, int, int):void, dex: classes.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.b.f.1.onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture, int, int):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/

                            public final void onSurfaceTextureAvailable(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.b.f.1.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void, dex: classes.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.b.f.1.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/

                            public final boolean onSurfaceTextureDestroyed(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.b.f.1.onSurfaceTextureDestroyed(android.graphics.SurfaceTexture):boolean, dex: classes.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.b.f.1.onSurfaceTextureDestroyed(android.graphics.SurfaceTexture):boolean, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/

                            public final void onSurfaceTextureUpdated(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.b.f.1.onSurfaceTextureUpdated(android.graphics.SurfaceTexture):void, dex: classes.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.b.f.1.onSurfaceTextureUpdated(android.graphics.SurfaceTexture):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        };
                    }
                    f.f7857m.setSurfaceTextureListener(f.f7860p);
                    if (f.f7858n != null) {
                        IAlog.m9034b("%scalling setSurfaceTexture with cached texture", IAlog.m9029a((Object) f));
                        if (f.f7857m.getSurfaceTexture() == null || !f.f7857m.getSurfaceTexture().equals(f.f7858n)) {
                            IAlog.m9034b("%scalling setSurfaceTexture with cached texture success", IAlog.m9029a((Object) f));
                            f.f7857m.setSurfaceTexture(f.f7858n);
                        } else {
                            IAlog.m9034b("%scalling setSurfaceTexture with cached texture failed", IAlog.m9029a((Object) f));
                        }
                    }
                }
            }
            C3598c cVar2 = this.f7899r;
            if (cVar2 != null) {
                cVar2.setId(C3708R.C3710id.inn_texture_view);
            }
            IAlog.m9034b("%supdateView adding texture to parent", IAlog.m9029a((Object) this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.gravity = 17;
            if (this.f7899r.getParent() == null) {
                this.f7888g.getTextureHost().addView(this.f7899r, layoutParams);
            }
            this.f7901t = false;
            this.f7889h = new C3161f.C3171c() {
                /* renamed from: a */
                public final void mo18839a() {
                    IAlog.m9034b("%sonSurfaceTextureAvailable", IAlog.m9029a((Object) C3174h.this));
                }

                /* renamed from: b */
                public final void mo18840b() {
                    C3174h.this.f7888g.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }

                /* renamed from: c */
                public final void mo18841c() {
                    if (C3174h.this.f7885d != null && C3174h.this.f7885d.mo18752f() != null) {
                        C3161f f = C3174h.this.f7885d.mo18752f();
                        f.f7861q = true;
                        f.f7856l.post(new Runnable() {
                            public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.b.f.6.run():void, dex: classes.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.b.f.6.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                    }
                }
            };
            C3145b bVar2 = this.f7885d;
            if (!(bVar2 == null || bVar2.mo18752f() == null)) {
                this.f7885d.mo18752f().f7853i = this.f7889h;
            }
        } else {
            IAlog.m9034b("%sconnectToTextureView called but already connected", IAlog.m9029a((Object) this));
        }
        return true;
    }
}
