package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.C2768aa;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.p037d.C2857q;
import com.fyber.inneractive.sdk.p047g.p048a.C2917b;
import com.fyber.inneractive.sdk.p047g.p048a.C2928m;
import com.fyber.inneractive.sdk.p047g.p048a.C2933r;
import com.fyber.inneractive.sdk.p049h.C2941ae;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p049h.C2977r;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.p051j.C3020g;
import com.fyber.inneractive.sdk.p051j.C3022i;
import com.fyber.inneractive.sdk.p056m.C3037c;
import com.fyber.inneractive.sdk.player.enums.C3608b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p057a.C3103a;
import com.fyber.inneractive.sdk.player.p057a.C3123g;
import com.fyber.inneractive.sdk.player.p057a.C3143n;
import com.fyber.inneractive.sdk.player.p058b.C3155c;
import com.fyber.inneractive.sdk.player.p058b.C3161f;
import com.fyber.inneractive.sdk.util.C3646d;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.C3667o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.b */
public abstract class C3145b implements C3161f.C3169a, C3161f.C3170b {

    /* renamed from: a */
    protected Context f7773a;

    /* renamed from: b */
    protected C3161f f7774b;

    /* renamed from: c */
    protected String f7775c;

    /* renamed from: d */
    protected C2857q f7776d;

    /* renamed from: e */
    protected InneractiveAdRequest f7777e;

    /* renamed from: f */
    protected boolean f7778f = true;

    /* renamed from: g */
    public Bitmap f7779g;

    /* renamed from: h */
    C3667o f7780h;

    /* renamed from: i */
    C3667o.C3668a f7781i;

    /* renamed from: j */
    public boolean f7782j = false;

    /* renamed from: k */
    volatile boolean f7783k = false;

    /* renamed from: l */
    public C3103a f7784l = null;

    /* renamed from: m */
    public C3151a f7785m;

    /* renamed from: n */
    protected int f7786n = 0;

    /* renamed from: o */
    protected int f7787o;

    /* renamed from: p */
    protected C2928m f7788p;

    /* renamed from: q */
    private final Set<Vendor> f7789q;

    /* renamed from: r */
    private final C2767s f7790r;

    /* renamed from: s */
    private Runnable f7791s;

    /* renamed from: t */
    private int f7792t;

    /* renamed from: u */
    private boolean f7793u = false;

    /* renamed from: v */
    private C3123g f7794v;

    /* renamed from: w */
    private boolean f7795w = false;

    /* renamed from: x */
    private boolean f7796x = false;

    /* renamed from: y */
    private C3311f f7797y;

    /* renamed from: com.fyber.inneractive.sdk.player.b$a */
    public interface C3151a {
        /* renamed from: a */
        void mo18475a();

        /* renamed from: a */
        void mo18476a(Bitmap bitmap);

        /* renamed from: a */
        void mo18477a(C3145b bVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b$b */
    public class C3152b extends Exception {

        /* renamed from: a */
        final JSONObject f7806a;
    }

    /* renamed from: a */
    public abstract void mo18741a(C3022i iVar, VideoClickOrigin videoClickOrigin, C2933r... rVarArr);

    /* renamed from: a */
    public abstract void mo18742a(VideoClickOrigin videoClickOrigin, C2933r... rVarArr);

    /* renamed from: h */
    public abstract View mo18754h();

    /* renamed from: i */
    public abstract C3155c mo18755i();

    /* renamed from: j */
    public abstract void mo18756j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo18757k();

    /* renamed from: l */
    public abstract String mo18758l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo18759m();

    /* renamed from: n */
    public C2917b mo18760n() {
        return null;
    }

    /* renamed from: s */
    public abstract C2809u mo18765s();

    protected C3145b(Context context, Set<Vendor> set, C2767s sVar) {
        this.f7789q = set;
        this.f7773a = context;
        this.f7790r = sVar;
        m7432u();
    }

    /* renamed from: b */
    public final void mo18746b(C2928m mVar, C3311f fVar) {
        this.f7797y = fVar;
        if (mVar != null) {
            final String str = mVar.f7016j;
            this.f7788p = mVar;
            this.f7786n++;
            this.f7782j = false;
            this.f7792t = 0;
            this.f7793u = false;
            this.f7775c = str;
            IAlog.m9034b("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
            C3667o oVar = this.f7780h;
            C2767s sVar = null;
            if (oVar != null) {
                oVar.mo19580a();
                this.f7781i = null;
            }
            if (this.f7781i == null) {
                this.f7781i = new C3667o.C3668a() {
                    /* renamed from: a */
                    public final void mo18768a(Bitmap bitmap) {
                        if (C3145b.this.f7781i != null) {
                            C3145b.this.mo18739a(bitmap);
                            C3145b.this.f7780h = null;
                            C3145b.this.f7781i = null;
                        }
                        IAlog.m9034b("MediaPlayerController: fetching video frame success!", new Object[0]);
                    }

                    /* renamed from: a */
                    public final void mo18767a() {
                        if (C3145b.this.f7781i != null) {
                            C3145b.this.mo18739a((Bitmap) null);
                            C3145b.this.f7780h = null;
                            C3145b.this.f7781i = null;
                        }
                        IAlog.m9034b("MediaPlayerController: fetching video frame failed!", new Object[0]);
                    }
                };
            }
            if (!C3143n.m7413a().mo18736b() || this.f7774b.mo18786k()) {
                m7428a(str);
            } else {
                final C3646d dVar = new C3646d();
                C3143n a = C3143n.m7413a();
                int i = this.f7787o;
                C2857q qVar = this.f7776d;
                if (qVar != null) {
                    sVar = qVar.mo18132i();
                }
                C3123g a2 = a.mo18734a(i, str, sVar, new C3123g.C3134e() {
                    /* renamed from: a */
                    public final void mo18706a(C3103a aVar, Exception exc) {
                        if (C3145b.this.f7783k) {
                            return;
                        }
                        if (exc == null) {
                            Bitmap bitmap = dVar.f9929a;
                            if (bitmap != null) {
                                IAlog.m9034b("IAMediaPlayerFlowManager: got video first frame", new Object[0]);
                                C3145b.this.mo18739a(bitmap);
                                C3145b.this.f7780h = null;
                                C3145b.this.f7781i = null;
                            }
                            C3145b.this.f7784l = aVar;
                            C3145b.this.mo18745a(true);
                        } else if (exc instanceof C3123g.C3132c) {
                            C3145b.this.m7428a(str);
                        } else {
                            C3145b.this.mo18744a(exc);
                        }
                    }
                });
                this.f7794v = a2;
                a2.f7721o = dVar;
                this.f7794v.mo18715a();
            }
            m7426a((long) ((C3656k.m9103o() ? C2768aa.m6041a(this.f7790r) : C2768aa.m6042b(this.f7790r)) * 1000));
            mo18759m();
        }
    }

    /* renamed from: c */
    public final void mo18748c() {
        if (!this.f7774b.mo18786k()) {
            this.f7795w = true;
            if (EnumSet.of(C3608b.Idle, C3608b.Error, C3608b.Seeking).contains(this.f7774b.mo18824p())) {
                C3143n.m7413a();
                this.f7774b.mo18772a(C3143n.m7416a(this.f7784l), this.f7787o);
                IAConfigManager.m5935f();
                C2767s sVar = this.f7790r;
                m7426a(TimeUnit.SECONDS.toMillis((long) (C3656k.m9103o() ? C2768aa.m6041a(sVar) : C2768aa.m6042b(sVar))));
            }
        }
    }

    /* renamed from: a */
    public void mo18738a() {
        this.f7783k = true;
        IAlog.m9034b("IAMediaPlayerFlowManager: destroy", new Object[0]);
        View h = mo18754h();
        if (h != null && (h instanceof C3037c)) {
            ((C3037c) h).destroy();
        }
        m7433v();
        mo18671b();
        C3161f fVar = this.f7774b;
        if (fVar != null) {
            fVar.mo18769a();
            this.f7774b = null;
        }
        this.f7779g = null;
        C3123g gVar = this.f7794v;
        if (gVar != null) {
            gVar.mo18719c();
            C3143n.m7413a().mo18735b(this.f7794v.mo18720d());
        }
        this.f7797y = null;
        if (this.f7791s != null) {
            C3662m.m9137a().removeCallbacks(this.f7791s);
        }
    }

    /* renamed from: d */
    public final boolean mo18750d() {
        return this.f7778f;
    }

    /* renamed from: e */
    public final void mo18751e() {
        int i;
        Bitmap bitmap;
        if (this.f7774b == null) {
            return;
        }
        if (this.f7784l == null || this.f7782j) {
            C3161f fVar = this.f7774b;
            C3608b p = fVar.mo18824p();
            if (p == C3608b.f9847i || p == C3608b.Prepared) {
                fVar.mo18770a(1);
            } else {
                fVar.mo18781f();
            }
        } else {
            C3151a aVar = this.f7785m;
            if (!(aVar == null || (bitmap = this.f7779g) == null)) {
                aVar.mo18476a(bitmap);
            }
            if (this.f7774b.mo18824p() != C3608b.Preparing && this.f7774b.mo18824p() != C3608b.Prepared) {
                C3143n.m7413a();
                this.f7774b.mo18772a(C3143n.m7416a(this.f7784l), this.f7787o);
                if (C3656k.m9103o()) {
                    i = C2768aa.m6041a(this.f7790r);
                } else {
                    i = C2768aa.m6042b(this.f7790r);
                }
                m7426a((long) (i * 1000));
            }
        }
    }

    /* renamed from: f */
    public final C3161f mo18752f() {
        return this.f7774b;
    }

    /* renamed from: a */
    public final void mo18739a(Bitmap bitmap) {
        IAlog.m9034b("IAMediaPlayerFlowManager: saving snapshot %s", bitmap);
        this.f7779g = null;
        this.f7779g = bitmap;
    }

    /* renamed from: g */
    public final void mo18753g() {
        if (!this.f7793u) {
            mo18757k();
            this.f7793u = true;
        }
    }

    /* renamed from: a */
    public void mo18743a(C3608b bVar) {
        IAlog.m9034b("IAMediaPlayerFlowManager: onPlayerStateChanged with - %s", bVar);
        int i = C31505.f7805a[bVar.ordinal()];
        if (i == 1) {
            mo18745a(false);
        } else if (i != 2) {
            if (i == 3) {
                this.f7792t = this.f7774b.mo18782g();
            } else if (i == 4) {
                mo18671b();
                return;
            } else if (i != 5) {
                return;
            }
        } else if (this.f7791s == null) {
            C3656k.m9103o();
            m7426a((long) (IAConfigManager.f6419n.f6436h.f6607b * 1000));
            return;
        } else {
            return;
        }
        mo18671b();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b$5 */
    static /* synthetic */ class C31505 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7805a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fyber.inneractive.sdk.player.enums.b[] r0 = com.fyber.inneractive.sdk.player.enums.C3608b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7805a = r0
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Prepared     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7805a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Buffering     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7805a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Playing     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7805a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.Paused     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7805a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.f9847i     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.C3145b.C31505.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo18744a(Exception exc) {
        Object[] objArr = new Object[1];
        objArr[0] = exc != null ? exc.getMessage() : "no exception";
        IAlog.m9034b("IMediaPlayerFlowManager: onPlayerError called with: %s", objArr);
        mo18740a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, exc), exc instanceof C3152b ? ((C3152b) exc).f7806a : null);
        if (!this.f7782j && (this.f7784l == null || this.f7774b.mo18824p() == C3608b.Preparing || this.f7774b.mo18824p() == C3608b.Prepared)) {
            return;
        }
        if (this.f7784l != null) {
            C3151a aVar = this.f7785m;
            if (aVar != null) {
                aVar.mo18477a(this);
                return;
            }
            return;
        }
        IAlog.m9034b("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
        mo18740a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, exc), (JSONObject) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7428a(String str) {
        IAlog.m9034b("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
        if (!this.f7774b.mo18784i()) {
            C3667o oVar = new C3667o(this.f7773a, this.f7781i, this.f7775c, (byte) 0);
            this.f7780h = oVar;
            C3657l.m9111a(oVar, (P[]) new Void[0]);
        }
        if (!this.f7783k) {
            this.f7774b.mo18772a(str, this.f7787o);
        }
    }

    /* renamed from: a */
    protected static void m7429a(List<String> list) {
        for (final String next : list) {
            final long currentTimeMillis = System.currentTimeMillis();
            IAConfigManager.m5937h().mo18441a(new C2941ae(new C2977r<String>() {
                /* renamed from: a */
                public final /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                    String str = (String) obj;
                    IAlog.m9034b("Hit Request: Hitting URL finished: %s", next);
                    if (exc == null) {
                        IAlog.m9034b("Hit Request: Hitting URL response code: %s", str);
                    } else {
                        IAlog.m9034b("Hit Request: Hitting URL failed: %s", exc);
                    }
                    IAlog.m9034b("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            }, next));
        }
    }

    /* renamed from: b */
    private void mo18671b() {
        if (this.f7791s != null) {
            C3662m.m9137a().removeCallbacks(this.f7791s);
            this.f7791s = null;
            IAlog.m9034b("IMediaPlayerFlowManager:: cancelBufferTimeout - running timeout runnable cancelled", new Object[0]);
        }
    }

    /* renamed from: a */
    private void m7426a(long j) {
        mo18671b();
        this.f7791s = new Runnable() {
            public final void run() {
                C3145b.this.mo18761o();
            }
        };
        C3662m.m9137a().postDelayed(this.f7791s, j);
        IAlog.m9034b("IMediaPlayerFlowManager:: startBufferTimeout called with %d m/sec", Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo18761o() {
        IAlog.m9034b("IAMediaPlayerFlowManager: onBufferTimeout reached: mBufferTimeoutRunnable = %s isDestroyed = %s", this.f7791s, Boolean.valueOf(this.f7783k));
        if (this.f7791s != null && !this.f7783k) {
            this.f7796x = true;
            int g = this.f7774b.mo18782g();
            int h = this.f7774b.mo18783h();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", h);
                jSONObject.put("position", g);
            } catch (JSONException unused) {
            }
            this.f7791s = null;
            C3123g gVar = this.f7794v;
            if (gVar != null) {
                gVar.mo18719c();
                C3143n.m7413a().mo18735b(this.f7794v.mo18720d());
            }
            if (!this.f7782j) {
                C3161f fVar = this.f7774b;
                if (fVar != null) {
                    fVar.mo18769a();
                    this.f7774b = null;
                    m7432u();
                }
                mo18740a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT), (JSONObject) null);
                return;
            }
            mo18740a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT), jSONObject);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18745a(boolean z) {
        JSONArray jSONArray;
        int i;
        boolean z2 = true;
        if (z || this.f7784l == null) {
            int i2 = 0;
            IAlog.m9034b("IAMediaPlayerFlowManager: onPlayerPrepared called", new Object[0]);
            if (this.f7783k) {
                IAlog.m9034b("IMediaPlayerFlowManager: onPlayerPrepared is called, but object is already destroyed?? ignore", new Object[0]);
                return;
            }
            if (this.f7774b.mo18784i() && this.f7774b.mo18785j() != null) {
                mo18739a(this.f7774b.mo18785j());
            }
            this.f7782j = !z;
            mo18671b();
            if (this.f7797y != null) {
                C2857q qVar = this.f7776d;
                if (qVar == null || qVar.mo18129f() == null || this.f7777e == null) {
                    z2 = false;
                } else {
                    if (!m7430a(mo18763q(), mo18765s(), ((C3020g) this.f7776d.mo18129f()).f7395A) || !this.f7777e.getAllowFullscreen()) {
                        z2 = false;
                    }
                    ((C3020g) this.f7776d.mo18129f()).f7419v.setVideo(new ImpressionData.Video(z2, (long) ((int) TimeUnit.MILLISECONDS.toSeconds((long) mo18763q()))));
                }
                try {
                    C3020g gVar = this.f7776d != null ? (C3020g) this.f7776d.mo18129f() : null;
                    C2967m mVar = C2967m.EVENT_READY_ON_CLIENT;
                    InneractiveAdRequest inneractiveAdRequest = this.f7777e;
                    if (this.f7776d == null) {
                        jSONArray = null;
                    } else {
                        jSONArray = this.f7776d.mo18132i().mo18013b();
                    }
                    C2968n.C2969a aVar = new C2968n.C2969a(mVar, inneractiveAdRequest, (C3018e) gVar, jSONArray);
                    if (!(this.f7788p == null || gVar == null)) {
                        IAlog.m9034b("Video content loader: Vast load took: " + (System.currentTimeMillis() - gVar.f7431a) + " msec", new Object[0]);
                        if (this.f7776d == null || this.f7776d.mo18129f() == null || ((C3020g) this.f7776d.mo18129f()).f7426E == null) {
                            i = 0;
                        } else {
                            i2 = ((C3020g) this.f7776d.mo18129f()).f7426E.f6947h;
                            i = ((C3020g) this.f7776d.mo18129f()).f7426E.f6948i;
                        }
                        aVar.mo18433a(new C2968n.C2971b().mo18438a("duration", Integer.valueOf(mo18763q() / 1000)).mo18438a("url", this.f7788p.f7016j).mo18438a(MediaFile.BITRATE, this.f7788p.f7012f).mo18438a("mime", TextUtils.isEmpty(this.f7788p.f7010d) ? "na" : this.f7788p.f7010d).mo18438a(MediaFile.DELIVERY, this.f7788p.f7007a).mo18438a("load_time", Long.valueOf(System.currentTimeMillis() - gVar.f7431a)).mo18438a("media_file_index", Integer.valueOf(this.f7786n)).mo18438a("player", this.f7774b.mo18787l()).mo18438a("is_video_skippable", Boolean.valueOf(z2)).mo18438a("supported_media_files", Integer.valueOf(i2)).mo18438a("total_media_files", Integer.valueOf(i)));
                    }
                    aVar.mo18436b((String) null);
                } catch (Exception unused) {
                }
                this.f7797y.mo19110a();
                return;
            }
            return;
        }
        this.f7782j = true;
        C3151a aVar2 = this.f7785m;
        if (aVar2 != null) {
            aVar2.mo18475a();
        }
        if (!this.f7795w) {
            mo18751e();
        }
    }

    /* renamed from: u */
    private void m7432u() {
        C3161f a = C3310e.m8192a(this.f7773a, this.f7790r);
        this.f7774b = a;
        a.mo18820a((C3161f.C3170b) this);
        this.f7774b.mo18819a((C3161f.C3169a) this);
    }

    /* renamed from: v */
    private void m7433v() {
        C3667o oVar = this.f7780h;
        if (oVar != null) {
            oVar.mo19580a();
            this.f7781i = null;
        }
    }

    /* renamed from: p */
    public final boolean mo18762p() {
        return this.f7784l != null;
    }

    /* renamed from: q */
    public final int mo18763q() {
        if (!mo18762p()) {
            return this.f7774b.mo18783h();
        }
        try {
            return Integer.valueOf(this.f7784l.mo18673a("video.duration")).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: r */
    public final boolean mo18764r() {
        return this.f7774b != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r2 = r3.mo18070g();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m7430a(int r2, com.fyber.inneractive.sdk.config.C2809u r3, int r4) {
        /*
            r0 = 1
            if (r4 != r0) goto L_0x0004
            return r0
        L_0x0004:
            r4 = 15999(0x3e7f, float:2.242E-41)
            r1 = 0
            if (r2 > r4) goto L_0x000a
            return r1
        L_0x000a:
            com.fyber.inneractive.sdk.config.w r2 = r3.mo18070g()
            if (r2 == 0) goto L_0x0021
            com.fyber.inneractive.sdk.config.enums.Skip r3 = r2.mo18078f()
            com.fyber.inneractive.sdk.config.enums.Skip r4 = com.fyber.inneractive.sdk.config.enums.Skip.DEFAULT
            if (r3 == r4) goto L_0x0021
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = r2.mo18080h()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r3 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r2 == r3) goto L_0x0021
            return r0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.C3145b.m7430a(int, com.fyber.inneractive.sdk.config.u, int):boolean");
    }

    /* renamed from: b */
    public final void mo18747b(boolean z) {
        this.f7778f = z;
    }

    /* renamed from: c */
    public final void mo18749c(boolean z) {
        JSONArray jSONArray;
        try {
            C3020g gVar = this.f7776d != null ? (C3020g) this.f7776d.mo18129f() : null;
            C2967m mVar = C2967m.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f7777e;
            if (this.f7776d == null) {
                jSONArray = null;
            } else {
                jSONArray = this.f7776d.mo18132i().mo18013b();
            }
            C2968n.C2969a aVar = new C2968n.C2969a(mVar, inneractiveAdRequest, (C3018e) gVar, jSONArray);
            if (!(this.f7788p == null || gVar == null)) {
                aVar.mo18433a(new C2968n.C2971b().mo18438a("waudio", String.valueOf(z)).mo18438a("url", this.f7788p.f7016j).mo18438a(MediaFile.BITRATE, this.f7788p.f7012f).mo18438a("mime", TextUtils.isEmpty(this.f7788p.f7010d) ? "na" : this.f7788p.f7010d).mo18438a(MediaFile.DELIVERY, this.f7788p.f7007a).mo18438a("media_file_index", Integer.valueOf(this.f7786n)).mo18438a("player", this.f7774b.mo18787l()));
            }
            aVar.mo18436b((String) null);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18740a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        IAlog.m9036d("IAMediaPlayerFlowManager: reporting error to listeners: %s", inneractiveVideoError.getPlayerError().toString());
        C3311f fVar = this.f7797y;
        if (fVar != null) {
            try {
                fVar.mo19111a(inneractiveVideoError, jSONObject, this.f7796x);
            } catch (Exception e) {
                if (IAlog.f9870a <= 3) {
                    e.printStackTrace();
                }
            }
        }
        m7433v();
        mo18671b();
    }

    /* renamed from: a */
    public static int m7425a(C3145b bVar) {
        C2857q qVar = bVar.f7776d;
        if (qVar == null || qVar.mo18129f() == null) {
            return -1;
        }
        return ((C3020g) bVar.f7776d.mo18129f()).f7395A;
    }
}
