package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.p037d.C2857q;
import com.fyber.inneractive.sdk.p047g.p048a.C2928m;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p050i.C3013i;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.p051j.C3020g;
import com.fyber.inneractive.sdk.player.C3101a;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.g */
public final class C3312g implements C3311f {

    /* renamed from: a */
    public C3020g f8551a;

    /* renamed from: b */
    public C3314a f8552b;

    /* renamed from: c */
    public C2928m f8553c;

    /* renamed from: d */
    public C3101a.C3102a f8554d;

    /* renamed from: e */
    C2767s f8555e;

    /* renamed from: f */
    private C3101a f8556f;

    /* renamed from: g */
    private InneractiveAdRequest f8557g;

    /* renamed from: h */
    private boolean f8558h = false;

    /* renamed from: com.fyber.inneractive.sdk.player.g$a */
    public interface C3314a {
        /* renamed from: b */
        void mo18123b(InneractiveInfrastructureError inneractiveInfrastructureError);

        /* renamed from: h */
        void mo18107h();
    }

    public C3312g(C3020g gVar, InneractiveAdRequest inneractiveAdRequest, C2857q qVar, C3314a aVar) {
        this.f8557g = inneractiveAdRequest;
        this.f8551a = gVar;
        this.f8552b = aVar;
        this.f8555e = qVar.mo18132i();
        this.f8556f = new C3101a(qVar);
    }

    /* renamed from: b */
    public final void mo19114b() {
        C3101a.C3102a aVar = this.f8554d;
        if (aVar != null) {
            aVar.mo18668a(this.f8553c, (C3311f) this);
        } else {
            this.f8552b.mo18123b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
        }
    }

    /* renamed from: c */
    public final void mo19115c() {
        try {
            C3101a aVar = this.f8556f;
            if (aVar.f7622b == null) {
                aVar.f7622b = new C3304d(C3657l.m9125p(), (C3020g) aVar.f7621a.mo18129f(), aVar.f7621a.mo18131h(), aVar.f7621a.mo18130g(), aVar.f7621a);
            }
            this.f8554d = aVar.f7622b;
        } catch (Throwable th) {
            this.f8552b.mo18123b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th));
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.g$1 */
    static /* synthetic */ class C33131 {

        /* renamed from: a */
        static final /* synthetic */ int[] f8559a;

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
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error[] r0 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8559a = r0
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_NO_MEDIA_FILES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8559a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8559a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8559a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8559a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.C3312g.C33131.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static C2966l m8195a(InneractiveVideoError.Error error) {
        int i = C33131.f8559a[error.ordinal()];
        if (i == 1) {
            return C2966l.VAST_ERROR_NO_MEDIA_FILES;
        }
        if (i == 2) {
            return C2966l.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
        }
        if (i == 3) {
            return C2966l.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
        }
        if (i == 4) {
            return C2966l.VAST_ERROR_PRE_BUFFER_TIMEOUT;
        }
        if (i == 5) {
            return C2966l.VAST_ERROR_BUFFER_TIMEOUT;
        }
        IAlog.m9034b("IAReportError, Does not know player error " + error.getErrorString(), new Object[0]);
        return C2966l.VAST_UNKNOWN_PLAYER_ERROR;
    }

    /* renamed from: d */
    public final void mo19116d() {
        C3101a aVar = this.f8556f;
        if (aVar.f7623c != null) {
            aVar.f7623c.mo18667a();
        }
        if (aVar.f7622b != null) {
            aVar.f7622b.mo18667a();
        }
    }

    /* renamed from: a */
    public final void mo19110a() {
        if (!this.f8558h) {
            this.f8558h = true;
            C3314a aVar = this.f8552b;
            if (aVar != null) {
                aVar.mo18107h();
            }
        }
    }

    /* renamed from: a */
    public final void mo19111a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject, boolean z) {
        InneractiveErrorCode inneractiveErrorCode;
        if (inneractiveVideoError != null) {
            C2968n.C2969a aVar = new C2968n.C2969a(m8195a(inneractiveVideoError.getPlayerError()), this.f8557g, (C3018e) this.f8551a, this.f8555e.mo18013b());
            if (jSONObject != null) {
                aVar.mo18434a(jSONObject.toString());
            }
            aVar.mo18436b((String) null);
            IAlog.m9034b("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
            inneractiveErrorCode = z ? InneractiveErrorCode.LOAD_TIMEOUT : null;
            IAlog.m9034b("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
            if (inneractiveVideoError.getPlayerError().isFatal()) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            }
            if (inneractiveErrorCode == null) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            }
        } else {
            inneractiveErrorCode = null;
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            new C2968n.C2969a(C2966l.VPAID_ERROR_UNSECURE_CONTENT, this.f8557g, (C3018e) this.f8551a, this.f8555e.mo18013b()).mo18436b((String) null);
        }
        this.f8553c = null;
        C3020g gVar = this.f8551a;
        if (!(gVar == null || gVar.f7426E == null)) {
            this.f8553c = this.f8551a.f7426E.mo18375a();
        }
        if (this.f8553c == null) {
            mo19117e();
            C3314a aVar2 = this.f8552b;
            if (aVar2 != null) {
                if (inneractiveVideoError != null) {
                    aVar2.mo18123b(new InneractiveInfrastructureError(inneractiveErrorCode, inneractiveVideoError.getCause()));
                } else {
                    aVar2.mo18123b(new InneractiveInfrastructureError(inneractiveErrorCode));
                }
                mo19116d();
            }
        } else if (!this.f8558h) {
            mo19115c();
            mo19114b();
        }
    }

    /* renamed from: e */
    public final void mo19117e() {
        new C2968n.C2969a(m8195a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError()), this.f8557g, (C3018e) this.f8551a, this.f8555e.mo18013b()).mo18436b((String) null);
    }

    /* renamed from: a */
    public final void mo19113a(String str, String... strArr) {
        C3101a.C3102a aVar = this.f8554d;
        if (aVar != null) {
            aVar.mo18670a(str, strArr);
        }
    }

    /* renamed from: a */
    public final C3013i mo19112a(boolean z) {
        return this.f8554d.mo18666a(z, this);
    }
}
