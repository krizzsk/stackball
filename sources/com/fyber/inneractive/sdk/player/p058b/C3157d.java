package com.fyber.inneractive.sdk.player.p058b;

import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.player.enums.C3608b;
import com.fyber.inneractive.sdk.player.p057a.C3114d;
import com.fyber.inneractive.sdk.player.p057a.C3118e;
import com.fyber.inneractive.sdk.player.p057a.C3123g;
import com.fyber.inneractive.sdk.player.p057a.C3143n;
import com.fyber.inneractive.sdk.player.p059c.C3226c;
import com.fyber.inneractive.sdk.player.p059c.C3236d;
import com.fyber.inneractive.sdk.player.p059c.C3279e;
import com.fyber.inneractive.sdk.player.p059c.C3283f;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.C3297n;
import com.fyber.inneractive.sdk.player.p059c.p060a.C3202e;
import com.fyber.inneractive.sdk.player.p059c.p060a.C3215h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3256c;
import com.fyber.inneractive.sdk.player.p059c.p071e.C3409c;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3450b;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3454d;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3466b;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3473e;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3506g;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3511k;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3514m;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3516o;
import com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3488e;
import com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3493j;
import com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3494k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.fyber.inneractive.sdk.player.p059c.p081l.C3566d;
import com.fyber.inneractive.sdk.player.p059c.p081l.C3571f;
import com.fyber.inneractive.sdk.player.p082d.C3580a;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.b.d */
public final class C3157d extends C3161f implements C3114d.C3116a, C3114d.C3117b {

    /* renamed from: w */
    private static final String f7819w = null;

    /* renamed from: A */
    private C3159a f7820A;

    /* renamed from: B */
    private final int f7821B;

    /* renamed from: C */
    private final int f7822C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f7823D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final boolean f7824E;

    /* renamed from: F */
    private Bitmap f7825F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f7826G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f7827H;

    /* renamed from: I */
    private final List<C3123g> f7828I;

    /* renamed from: J */
    private C3454d f7829J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f7830K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f7831L;

    /* renamed from: a */
    int f7832a = 0;

    /* renamed from: b */
    int f7833b = 0;

    /* renamed from: c */
    boolean f7834c = false;

    /* renamed from: d */
    Surface f7835d;

    /* renamed from: e */
    SurfaceHolder f7836e;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final int f7837t;

    /* renamed from: u */
    private final C2767s f7838u;

    /* renamed from: v */
    private int f7839v;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C3279e f7840x;

    /* renamed from: y */
    private C3297n[] f7841y;

    /* renamed from: z */
    private Handler f7842z;

    /* renamed from: k */
    public final boolean mo18786k() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [com.fyber.inneractive.sdk.config.a.a.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3157d(android.content.Context r5, boolean r6, com.fyber.inneractive.sdk.config.p034a.C2767s r7) {
        /*
            r4 = this;
            r4.<init>(r5)
            r5 = 0
            r4.f7832a = r5
            r4.f7833b = r5
            r4.f7834c = r5
            r0 = 0
            r4.f7835d = r0
            r4.f7836e = r0
            r1 = 6
            r4.f7821B = r1
            r2 = 3
            r4.f7822C = r2
            r4.f7823D = r5
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r4.f7828I = r3
            r4.f7829J = r0
            r4.f7831L = r5
            r4.f7824E = r6
            r4.f7838u = r7
            com.fyber.inneractive.sdk.config.j r6 = com.fyber.inneractive.sdk.config.IAConfigManager.m5929c()
            com.fyber.inneractive.sdk.config.i r6 = r6.f6586a
            java.lang.String r7 = "extractor_source_retry_count"
            int r6 = r6.mo18046a(r7, r1, r2)
            r4.f7839v = r6
            com.fyber.inneractive.sdk.config.a.s r6 = r4.f7838u
            if (r6 != 0) goto L_0x0039
            goto L_0x0042
        L_0x0039:
            java.lang.Class<com.fyber.inneractive.sdk.config.a.a.f> r7 = com.fyber.inneractive.sdk.config.p034a.p035a.C2746f.class
            com.fyber.inneractive.sdk.config.a.a.d r6 = r6.mo18010a(r7)
            r0 = r6
            com.fyber.inneractive.sdk.config.a.a.f r0 = (com.fyber.inneractive.sdk.config.p034a.p035a.C2746f) r0
        L_0x0042:
            if (r0 != 0) goto L_0x0046
            r6 = 0
            goto L_0x004c
        L_0x0046:
            java.lang.String r6 = "max_tries"
            int r6 = r0.mo17981a((java.lang.String) r6, (int) r5)
        L_0x004c:
            r4.f7837t = r6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "Creating IAExoPlayer2Controller"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p058b.C3157d.<init>(android.content.Context, boolean, com.fyber.inneractive.sdk.config.a.s):void");
    }

    /* renamed from: a */
    public final void mo18769a() {
        if (this.f7840x != null) {
            if (!this.f7823D) {
                this.f7823D = true;
                C3662m.m9138a(new Runnable() {
                    public final void run() {
                        if (C3157d.this.f7840x != null) {
                            C3157d.this.f7840x.mo19062a();
                            C3157d.this.f7840x.mo19068b();
                            C3157d.this.f7840x.mo19069c();
                            C3279e unused = C3157d.this.f7840x = null;
                        }
                    }
                });
            }
            this.f7820A.f7844a.clear();
            this.f7820A = null;
        }
        for (C3123g next : this.f7828I) {
            next.mo18719c();
            C3143n.m7413a().mo18735b(next.mo18720d());
        }
        this.f7828I.clear();
        super.mo18769a();
    }

    /* renamed from: a */
    public final void mo18773a(boolean z) {
        this.f7862r = z;
        C3279e eVar = this.f7840x;
        if (eVar != null && !this.f7823D) {
            C3297n[] nVarArr = this.f7841y;
            if (nVarArr.length >= 2) {
                eVar.mo19067a(new C3279e.C3282c(nVarArr[1], 2, new Float(0.0f)));
                this.f7834c = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo18775b(boolean z) {
        this.f7862r = z;
        if (this.f7840x != null && !this.f7823D) {
            AudioManager audioManager = (AudioManager) this.f7850f.getSystemService("audio");
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            float f = ((float) streamVolume) / ((float) streamMaxVolume);
            IAlog.m9034b(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
            if (f == 0.0f) {
                f = 0.1f;
            }
            C3297n[] nVarArr = this.f7841y;
            if (nVarArr.length >= 2) {
                this.f7840x.mo19067a(new C3279e.C3282c(nVarArr[1], 2, new Float(f)));
            }
            this.f7834c = false;
        }
    }

    /* renamed from: b */
    public final boolean mo18776b() {
        return this.f7834c;
    }

    /* renamed from: c */
    public final void mo18777c() {
        C3608b p = mo18824p();
        if (p == C3608b.Idle || p == C3608b.f9847i || p == C3608b.Paused || p == C3608b.Prepared) {
            IAlog.m9034b("%s paused called when player is in mState: %s ignoring", IAlog.m9029a((Object) this), p);
            return;
        }
        C3279e eVar = this.f7840x;
        if (eVar != null && !this.f7823D) {
            eVar.mo19066a(false);
        }
        mo18826r();
        mo18821a(C3608b.Paused);
    }

    /* renamed from: d */
    public final int mo18779d() {
        return this.f7832a;
    }

    /* renamed from: e */
    public final int mo18780e() {
        return this.f7833b;
    }

    /* renamed from: m */
    public final boolean mo18799m() {
        if (this.f7840x == null || this.f7823D || this.f7854j != C3608b.Playing) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final int mo18782g() {
        C3279e eVar = this.f7840x;
        if (eVar == null || this.f7823D) {
            return 0;
        }
        return (int) eVar.mo19072f();
    }

    /* renamed from: h */
    public final int mo18783h() {
        C3279e eVar = this.f7840x;
        if (eVar == null || this.f7823D) {
            return 0;
        }
        return (int) eVar.mo19071e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo18778c(boolean z) {
        if (this.f7840x == null && !this.f7823D) {
            this.f7830K = z;
            IAlog.m9034b("%sMediaPlayerController: creating media player", IAlog.m9029a((Object) this));
            C3159a aVar = this.f7820A;
            if (aVar != null) {
                aVar.f7844a.clear();
            }
            this.f7820A = new C3159a(this, (byte) 0);
            this.f7842z = new Handler(Looper.getMainLooper());
            C3297n[] nVarArr = new C3297n[(z ? 2 : 1)];
            this.f7841y = nVarArr;
            nVarArr[0] = new C3566d(this.f7850f, C3409c.f9239a, this.f7842z, this.f7820A);
            if (z) {
                this.f7841y[1] = new C3215h(C3409c.f9239a);
            }
            C3283f fVar = new C3283f(this.f7841y, new C3466b(), new C3226c());
            this.f7840x = fVar;
            fVar.mo19064a((C3279e.C3280a) this.f7820A);
        }
    }

    /* renamed from: a */
    public final void mo18772a(String str, int i) {
        mo18798b(str, i);
    }

    /* renamed from: b */
    public final void mo18798b(String str, int i) {
        C3514m mVar;
        C3506g.C3507a aVar;
        if (this.f7840x != null && !this.f7823D) {
            IAlog.m9034b("%sloadMediaPlayerUri called with %s", IAlog.m9029a((Object) this), str);
            this.f7827H = str;
            this.f7826G = i;
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty((CharSequence) null)) {
                C3560t.m8889b(parse);
            } else {
                C3560t.m8895g("." + null);
            }
            if (!this.f7824E || !C3143n.m7413a().mo18736b()) {
                C3511k kVar = new C3511k();
                C3514m mVar2 = new C3514m(this.f7850f, kVar, new C3516o(IAConfigManager.m5923b().mo19554a(), kVar));
                File a = C3143n.m7414a(this.f7850f, "ia-vid-cache-ex2");
                if (a != null) {
                    aVar = new C3488e(new C3494k(a, new C3493j()), mVar2);
                } else {
                    mVar = mVar2;
                    C3450b bVar = new C3450b(parse, mVar, new C3256c(), this.f7839v, this.f7842z, this.f7820A, f7819w);
                    this.f7829J = bVar;
                    m7499a((C3454d) bVar);
                }
            } else {
                aVar = new C3118e(this, this, i, this.f7838u);
            }
            mVar = aVar;
            C3450b bVar2 = new C3450b(parse, mVar, new C3256c(), this.f7839v, this.f7842z, this.f7820A, f7819w);
            this.f7829J = bVar2;
            m7499a((C3454d) bVar2);
        }
    }

    /* renamed from: a */
    private void m7499a(C3454d dVar) {
        C3279e eVar = this.f7840x;
        if (eVar != null && dVar != null) {
            eVar.mo19065a(dVar);
            mo18821a(C3608b.Preparing);
        }
    }

    /* renamed from: a */
    public final void mo18707a(Bitmap bitmap) {
        this.f7825F = bitmap;
    }

    /* renamed from: j */
    public final Bitmap mo18785j() {
        return this.f7825F;
    }

    /* renamed from: a */
    public final void mo18708a(C3123g gVar) {
        this.f7828I.add(gVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b.d$a */
    private static class C3159a implements C3279e.C3280a, C3450b.C3451a, C3571f {

        /* renamed from: a */
        final WeakReference<C3157d> f7844a;

        /* renamed from: b */
        private boolean f7845b;

        /* synthetic */ C3159a(C3157d dVar, byte b) {
            this(dVar);
        }

        private C3159a(C3157d dVar) {
            this.f7845b = false;
            this.f7844a = new WeakReference<>(dVar);
        }

        /* renamed from: a */
        private String m7532a() {
            WeakReference<C3157d> weakReference = this.f7844a;
            C3157d dVar = weakReference == null ? null : (C3157d) weakReference.get();
            return dVar == null ? getClass().getName() : IAlog.m9029a((Object) dVar);
        }

        /* renamed from: a */
        public final void mo18806a(boolean z, int i) {
            IAlog.m9034b("%sonPlayerStateChanged called with pwr = %s state = %d", m7532a(), Boolean.valueOf(z), Integer.valueOf(i));
            WeakReference<C3157d> weakReference = this.f7844a;
            C3290h hVar = null;
            C3157d dVar = weakReference == null ? null : (C3157d) weakReference.get();
            if (dVar != null && dVar.f7840x != null && !dVar.f7823D) {
                if (i == 3) {
                    if (z) {
                        dVar.mo18821a(C3608b.Playing);
                    } else if (dVar.mo18824p() == C3608b.Preparing) {
                        if (dVar.f7840x.mo19070d() != null && dVar.f7840x.mo19070d().f9404a > 0) {
                            C3473e eVar = dVar.f7840x.mo19070d().f9405b[0];
                            if (eVar != null) {
                                hVar = eVar.mo19293c();
                            }
                            if (hVar != null) {
                                int i2 = hVar.f8497j;
                                int i3 = hVar.f8498k;
                                dVar.f7832a = i2;
                                dVar.f7833b = i3;
                            }
                        }
                        this.f7845b = true;
                        dVar.mo18821a(C3608b.Prepared);
                    }
                } else if (i == 2) {
                    if (dVar.mo18824p() == C3608b.Playing) {
                        dVar.mo18821a(C3608b.Buffering);
                    }
                } else if (i == 4) {
                    dVar.mo18821a(C3608b.f9847i);
                }
            }
        }

        /* renamed from: a */
        public final void mo18804a(C3236d dVar) {
            String str;
            C3157d dVar2 = (C3157d) this.f7844a.get();
            if (dVar2 != null && dVar2.f7830K && dVar2.f7824E && !this.f7845b && (dVar.getCause() instanceof C3202e.C3208d)) {
                dVar2.mo18800n();
            } else if (dVar2 == null || !dVar2.f7824E || this.f7845b || !C3143n.m7413a().mo18736b() || dVar2.f7831L >= dVar2.f7837t) {
                if (dVar.getCause() == null) {
                    str = "empty";
                } else {
                    str = dVar.getCause().getMessage();
                }
                C3580a.C3595b bVar = new C3580a.C3595b(dVar, str);
                IAlog.m9034b("%sonPlayerError called with %s for sendErrorState", m7532a(), bVar);
                C3157d dVar3 = (C3157d) C3670q.m9152a(this.f7844a);
                if (dVar3 != null) {
                    dVar3.mo18822a((Exception) bVar);
                }
            } else {
                dVar2.mo18801o();
            }
        }

        /* renamed from: a */
        public final void mo18803a(int i, int i2) {
            WeakReference<C3157d> weakReference = this.f7844a;
            C3157d dVar = weakReference == null ? null : (C3157d) weakReference.get();
            if (dVar != null) {
                dVar.f7832a = i;
                dVar.f7833b = i2;
            }
        }

        /* renamed from: a */
        public final void mo18805a(IOException iOException) {
            if (this.f7844a != null && (iOException.getCause() instanceof C3123g.C3132c) && ((C3157d) this.f7844a.get()).f7824E) {
                ((C3157d) this.f7844a.get()).mo18798b(((C3157d) this.f7844a.get()).f7827H, ((C3157d) this.f7844a.get()).f7826G);
            }
        }
    }

    /* renamed from: l */
    public final String mo18787l() {
        return this.f7824E ? "exo_c" : "exo";
    }

    /* renamed from: i */
    public final boolean mo18784i() {
        return this.f7824E;
    }

    /* renamed from: n */
    public final void mo18800n() {
        this.f7834c = true;
        C3279e eVar = this.f7840x;
        if (eVar != null) {
            eVar.mo19069c();
            this.f7840x = null;
        }
        mo18778c(false);
        m7499a(this.f7829J);
        mo18823d(false);
    }

    /* renamed from: o */
    public final void mo18801o() {
        C3279e eVar = this.f7840x;
        if (eVar != null) {
            eVar.mo19069c();
            this.f7840x = null;
        }
        mo18778c(true);
        m7499a(this.f7829J);
        this.f7831L++;
        mo18823d(true);
    }

    /* renamed from: a */
    public final void mo18770a(int i) {
        IAlog.m9034b("%sseekTo called with %d playAfterSeek = %s", IAlog.m9029a((Object) this), Integer.valueOf(i), true);
        C3279e eVar = this.f7840x;
        if (eVar != null && !this.f7823D) {
            eVar.mo19066a(true);
            this.f7840x.mo19063a((long) i);
        }
    }

    /* renamed from: f */
    public final void mo18781f() {
        IAlog.m9034b("%sstart called", IAlog.m9029a((Object) this));
        if (this.f7840x != null && !this.f7823D) {
            mo18821a(C3608b.Start_in_progress);
            this.f7840x.mo19066a(true);
        }
    }

    /* renamed from: a */
    public final void mo18771a(Surface surface) {
        IAlog.m9034b("%ssetSurface called with %s", IAlog.m9029a((Object) this), surface);
        this.f7835d = surface;
        C3279e eVar = this.f7840x;
        if (eVar != null && !this.f7823D) {
            eVar.mo19067a(new C3279e.C3282c(this.f7841y[0], 1, surface));
        }
    }
}
