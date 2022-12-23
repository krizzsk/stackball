package com.fyber.inneractive.sdk.p056m;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2743c;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p056m.C3037c;
import com.fyber.inneractive.sdk.p056m.C3059g;
import com.fyber.inneractive.sdk.p056m.C3066l;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.C3631al;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.C3669p;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.C3685u;
import com.fyber.inneractive.sdk.util.C3691w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.fyber.inneractive.sdk.m.a */
public abstract class C3028a<L extends C3066l> implements C3036b, C3037c.C3038a, C3059g.C3060a, C3691w.C3696b {

    /* renamed from: a */
    private boolean f7448a;

    /* renamed from: b */
    protected boolean f7449b = false;
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public C3037c f7450c;

    /* renamed from: d */
    C3057e f7451d;

    /* renamed from: e */
    C3058f f7452e;

    /* renamed from: f */
    protected C3034b f7453f;

    /* renamed from: g */
    protected L f7454g;

    /* renamed from: h */
    float f7455h = 0.0f;

    /* renamed from: i */
    Rect f7456i = new Rect();

    /* renamed from: j */
    protected boolean f7457j;

    /* renamed from: k */
    protected boolean f7458k;

    /* renamed from: l */
    C3033a f7459l;

    /* renamed from: m */
    Runnable f7460m;

    /* renamed from: n */
    long f7461n;

    /* renamed from: o */
    long f7462o;

    /* renamed from: p */
    AsyncTask<Void, Void, String> f7463p;

    /* renamed from: q */
    protected String f7464q;

    /* renamed from: r */
    protected String f7465r;

    /* renamed from: s */
    protected InneractiveAdRequest f7466s;

    /* renamed from: t */
    protected C2836g f7467t;

    /* renamed from: u */
    private final Runnable f7468u;

    /* renamed from: v */
    private final Runnable f7469v;

    /* renamed from: com.fyber.inneractive.sdk.m.a$a */
    protected interface C3033a {
        /* renamed from: a */
        String mo18574a();

        /* renamed from: b */
        String mo18575b();

        /* renamed from: c */
        void mo18576c();

        /* renamed from: d */
        void mo18577d();
    }

    /* renamed from: com.fyber.inneractive.sdk.m.a$b */
    public interface C3034b {
        /* renamed from: a */
        void mo18121a(InneractiveErrorCode inneractiveErrorCode);

        /* renamed from: a */
        void mo18122a(C3028a aVar);
    }

    /* renamed from: a */
    public abstract String mo18541a(String str, String str2, String str3);

    /* renamed from: a */
    public abstract boolean mo18549a(String str, C3629aj ajVar);

    /* renamed from: com.fyber.inneractive.sdk.m.a$c */
    class C3035c implements C3033a {

        /* renamed from: a */
        String f7478a;

        /* renamed from: b */
        C3629aj f7479b;

        /* renamed from: a */
        public final String mo18574a() {
            return "open";
        }

        /* renamed from: b */
        public final String mo18575b() {
            return null;
        }

        /* renamed from: d */
        public final void mo18577d() {
        }

        C3035c(String str, C3629aj ajVar) {
            this.f7479b = ajVar;
            this.f7478a = str;
        }

        /* renamed from: c */
        public final void mo18576c() {
            C3028a.this.mo18552b(this.f7478a, this.f7479b);
        }

        public final String toString() {
            return "action: open url: " + this.f7478a;
        }
    }

    protected C3028a(Context context, boolean z) {
        this.f7458k = z;
        this.f7450c = mo18606b(context);
        this.f7448a = false;
        this.f7469v = new Runnable() {
            public final void run() {
                IAlog.m9033a("Removing clicked state after timeout", new Object[0]);
                C3028a.this.mo18564m();
            }
        };
        this.f7468u = new Runnable() {
            public final void run() {
                if (C3028a.this.f7458k) {
                    IAlog.m9034b("No user web action detected for : %s blocking.", C3028a.this.f7459l);
                    C3028a aVar = C3028a.this;
                    aVar.mo18543a(aVar.f7459l.mo18574a(), C3028a.this.f7459l.mo18575b());
                    C3028a.this.f7459l.mo18577d();
                    C3028a.this.mo18564m();
                } else {
                    IAlog.m9034b("User web action detected for: %s", C3028a.this.f7459l);
                    C3028a.this.f7459l.mo18576c();
                }
                C3028a.this.f7459l = null;
            }
        };
    }

    /* renamed from: c */
    public void mo18553c() {
        mo18551b(false);
    }

    /* renamed from: b */
    public void mo18551b(boolean z) {
        AsyncTask<Void, Void, String> asyncTask = this.f7463p;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        if (this.f7450c != null) {
            C3691w.m9191a().mo19599a(this.f7450c);
            C3670q.m9157a((View) this.f7450c);
            this.f7450c.setWebChromeClient((WebChromeClient) null);
            this.f7450c.setWebViewClient((WebViewClient) null);
            this.f7450c.destroy();
        }
        C3058f fVar = this.f7452e;
        if (fVar != null) {
            fVar.f7546a = null;
        }
        if (this.f7469v != null) {
            C3662m.m9137a().removeCallbacks(this.f7469v);
        }
        if (this.f7468u != null) {
            C3662m.m9137a().removeCallbacks(this.f7468u);
        }
        this.f7454g = null;
        if (!z) {
            this.f7453f = null;
        }
        this.f7450c = null;
        this.f7451d = null;
        this.f7452e = null;
        this.f7467t = null;
        this.f7466s = null;
    }

    /* renamed from: d */
    public final boolean mo18555d() {
        return this.f7450c != null;
    }

    /* renamed from: a */
    public final void mo18544a(String str, String str2, String str3, String str4, C3034b bVar, long j) {
        this.f7453f = bVar;
        this.f7461n = j;
        try {
            mo18561j();
            final String str5 = str2;
            final String str6 = str3;
            final String str7 = str4;
            final String str8 = str;
            C30313 r0 = new AsyncTask<Void, Void, String>() {
                /* access modifiers changed from: protected */
                public final /* synthetic */ void onPostExecute(Object obj) {
                    String str = (String) obj;
                    String str2 = C3669p.m9149a() ? "http://" : "https://";
                    if (!TextUtils.isEmpty(str) && !isCancelled()) {
                        C3028a.this.f7463p = null;
                        if (!TextUtils.isEmpty(str8)) {
                            C3028a aVar = C3028a.this;
                            aVar.f7464q = str2 + str8;
                        } else {
                            C3028a aVar2 = C3028a.this;
                            aVar2.f7464q = str2 + "wv.inner-active.mobi/";
                        }
                        if (C3028a.this.f7450c != null) {
                            C3028a.this.f7450c.loadDataWithBaseURL(C3028a.this.f7464q, str, WebRequest.CONTENT_TYPE_HTML, "utf-8", (String) null);
                            C3028a.this.f7465r = str;
                            return;
                        }
                        C3028a.this.m7125a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
                    } else if (!isCancelled()) {
                        C3028a.this.m7125a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
                    }
                }

                /* access modifiers changed from: protected */
                public final /* synthetic */ Object doInBackground(Object[] objArr) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String a = C3028a.this.mo18541a(str5, str6, str7);
                    IAlog.m9034b("%sbuild html string took %d msec", IAlog.m9029a((Object) C3028a.this), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    return a;
                }
            };
            this.f7463p = r0;
            C3657l.m9111a(r0, (P[]) new Void[0]);
            mo18599a();
        } catch (Throwable unused) {
            m7125a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
    }

    /* renamed from: a */
    public final boolean mo18546a(Context context) {
        this.f7450c = mo18606b(context);
        try {
            mo18561j();
            this.f7450c.loadDataWithBaseURL(this.f7464q, this.f7465r, WebRequest.CONTENT_TYPE_HTML, "utf-8", (String) null);
            mo18599a();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setListener(L l) {
        this.f7454g = l;
    }

    /* renamed from: e */
    public final C3037c mo18556e() {
        return this.f7450c;
    }

    /* renamed from: a */
    public final void mo18542a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        C3037c cVar = this.f7450c;
        if (cVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(cVar, layoutParams);
            } else {
                viewGroup.addView(cVar);
            }
            C3691w.m9191a().mo19598a(viewGroup.getContext(), (View) this.f7450c, (C3691w.C3696b) this);
            mo18557f();
        }
    }

    /* renamed from: f */
    public final void mo18557f() {
        this.f7450c.setTapListener(this);
    }

    /* renamed from: h */
    public final void mo18559h() {
        mo18564m();
    }

    /* renamed from: i */
    public final void mo18560i() {
        mo18564m();
    }

    /* renamed from: b */
    public final void mo18550b(String str) {
        C3037c cVar = this.f7450c;
        if (cVar != null) {
            cVar.mo18579a(str);
        }
    }

    /* renamed from: b */
    private static C3037c mo18606b(Context context) {
        return new C3037c(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo18561j() {
        int i;
        int i2;
        int i3;
        boolean z;
        C2767s i4;
        C2743c cVar;
        WebSettings settings = this.f7450c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.m5941l() && C3669p.m9149a() && Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        if (this.f7448a && Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        C3037c cVar2 = this.f7450c;
        cVar2.setHorizontalScrollBarEnabled(false);
        cVar2.setHorizontalScrollbarOverlay(false);
        cVar2.setVerticalScrollBarEnabled(false);
        cVar2.setVerticalScrollbarOverlay(false);
        cVar2.getSettings().setSupportZoom(false);
        C3037c cVar3 = this.f7450c;
        if (Build.VERSION.SDK_INT < 18) {
            try {
                cVar3.getSettings().setPluginState(WebSettings.PluginState.ON);
            } catch (Exception unused) {
                IAlog.m9034b("Failed to modify WebView plugin state.", new Object[0]);
            }
        }
        this.f7450c.setFocusable(true);
        this.f7450c.setBackgroundColor(0);
        C3057e eVar = new C3057e();
        this.f7451d = eVar;
        this.f7450c.setWebChromeClient(eVar);
        C2836g gVar = this.f7467t;
        if (gVar == null || (i4 = gVar.mo18132i()) == null || (cVar = (C2743c) i4.mo18010a(C2743c.class)) == null) {
            z = false;
            i3 = TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL;
            i2 = TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL;
            i = 2;
        } else {
            boolean a = cVar.mo17984a("agg_res", false);
            int max = Math.max(cVar.mo17981a("agg_res_ct", (int) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL), 50);
            i2 = Math.max(cVar.mo17981a("agg_res_rt", (int) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL), 50);
            i = Math.max(cVar.mo17981a("agg_res_retries", 2), 1);
            z = a;
            i3 = max;
        }
        C3058f fVar = new C3058f(this, z, i3, i2, i);
        this.f7452e = fVar;
        this.f7450c.setWebViewClient(fVar);
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                C3037c.setWebContentsDebuggingEnabled(true);
            }
        } catch (Exception unused2) {
            IAlog.m9034b("Could not set web contents debugging flag", new Object[0]);
        }
        this.f7450c.setListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7125a(InneractiveErrorCode inneractiveErrorCode) {
        C3034b bVar = this.f7453f;
        if (bVar != null) {
            bVar.mo18121a(inneractiveErrorCode);
        }
        mo18551b(true);
    }

    /* renamed from: a */
    public final void mo18474a(float f, Rect rect) {
        if (f != this.f7455h || !rect.equals(this.f7456i)) {
            this.f7455h = f;
            this.f7456i.set(rect);
            C3037c cVar = this.f7450c;
            if (cVar != null) {
                cVar.mo18580a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo18552b(String str, C3629aj ajVar) {
        L l = this.f7454g;
        if (l == null || l.mo18460a(str, ajVar).f9977a == C3685u.C3688c.FAILED) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void mo18563l() {
        L l = this.f7454g;
        if (l != null) {
            l.mo18467b();
        }
        mo18551b(true);
    }

    /* renamed from: c */
    public final void mo18554c(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("http://") && !C3669p.m9149a()) {
            IAlog.m9034b("%s Found a portential unsecure resource url: %s", IAlog.m9029a((Object) this), str);
        }
    }

    /* renamed from: m */
    public final void mo18564m() {
        IAlog.m9034b("IAWebViewController resetClick()", new Object[0]);
        if (this.f7469v != null) {
            C3662m.m9137a().removeCallbacks(this.f7469v);
        }
        if (this.f7468u != null) {
            C3662m.m9137a().removeCallbacks(this.f7468u);
        }
        this.f7457j = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18543a(String str, String str2) {
        L l = this.f7454g;
        if (l != null) {
            l.mo18463a(str, str2);
        }
        IAlog.m9030a(IAlog.f9871b, "AD_AUTO_CLICK_DETECTED", new Object[0]);
    }

    /* renamed from: a */
    private void mo18599a() {
        IAlog.m9034b("IAWebViewController: Starting load timeout with %d", Long.valueOf(this.f7461n));
        this.f7462o = System.currentTimeMillis();
        this.f7460m = new Runnable() {
            public final void run() {
                C3028a.m7126a(C3028a.this);
            }
        };
        C3662m.m9137a().postDelayed(this.f7460m, this.f7461n);
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f7466s = inneractiveAdRequest;
    }

    public void setAdContent(C2836g gVar) {
        this.f7467t = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo18548a(C3033a aVar) {
        IAlog.m9033a("IAWebViewController Web view click detected", new Object[0]);
        if (this.f7457j) {
            IAlog.m9033a("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            aVar.mo18576c();
            mo18564m();
            return true;
        }
        if (this.f7458k) {
            IAlog.m9033a("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            mo19531b();
            this.f7459l = aVar;
            if (this.f7468u != null) {
                C3662m.m9137a().postDelayed(this.f7468u, (long) IAConfigManager.m5929c().f6586a.mo18046a("click_timeout", 1000, 1000));
            }
        } else {
            mo19531b();
            aVar.mo18576c();
        }
        return false;
    }

    /* renamed from: b */
    private void mo19531b() {
        if (this.f7468u != null) {
            C3662m.m9137a().removeCallbacks(this.f7468u);
        }
        this.f7459l = null;
    }

    /* renamed from: g */
    public final void mo18558g() {
        IAlog.m9034b("IAWebViewController onClicked()", new Object[0]);
        if (this.f7459l != null) {
            IAlog.m9033a("Native click detected in time. Processing pending click", new Object[0]);
            this.f7459l.mo18576c();
            if (this.f7468u != null) {
                C3662m.m9137a().removeCallbacks(this.f7468u);
            }
            this.f7459l = null;
            mo18564m();
            return;
        }
        if (this.f7469v != null) {
            C3662m.m9137a().postDelayed(this.f7469v, (long) IAConfigManager.m5929c().f6586a.mo18046a("click_timeout", 1000, 1000));
        }
        this.f7457j = true;
    }

    /* renamed from: a */
    public boolean mo18547a(WebView webView, String str) {
        IAlog.m9034b("%shandleUrl called with: %s", IAlog.m9029a((Object) this), str);
        if (this.f7450c == null) {
            IAlog.m9034b("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (C3631al.m9052a(str)) {
            this.f7450c.loadUrl("chrome://crash");
            return true;
        } else {
            C3629aj k = mo18562k();
            if (mo18549a(str, k)) {
                return true;
            }
            mo18548a((C3033a) new C3035c(str, k));
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C3629aj mo18562k() {
        C3037c cVar = this.f7450c;
        if (cVar != null) {
            return cVar.getLastClickedLocation();
        }
        return new C3629aj();
    }

    /* renamed from: a */
    public void mo18545a(boolean z) {
        IAlog.m9034b("%sonWebViewVisibilityChanged called with: %s", IAlog.m9029a((Object) this), Boolean.valueOf(z));
        L l = this.f7454g;
        if (l != null) {
            l.mo18468b(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo18565n() {
        IAlog.m9034b("%sIAWebViewController: onWebviewLoaded - load took %d msec", IAlog.m9029a((Object) this), Long.valueOf(System.currentTimeMillis() - this.f7462o));
        if (this.f7460m != null) {
            C3662m.m9137a().removeCallbacks(this.f7460m);
            this.f7460m = null;
        }
        C3034b bVar = this.f7453f;
        if (bVar != null) {
            bVar.mo18122a(this);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m7126a(C3028a aVar) {
        AsyncTask<Void, Void, String> asyncTask = aVar.f7463p;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            aVar.f7463p = null;
        }
        IAlog.m9034b("%sonLoadTimeout after %d msec", IAlog.m9029a((Object) aVar), Long.valueOf(aVar.f7461n));
        aVar.m7125a(InneractiveErrorCode.LOAD_TIMEOUT);
    }
}
