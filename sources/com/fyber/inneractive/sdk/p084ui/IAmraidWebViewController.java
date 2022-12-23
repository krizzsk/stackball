package com.fyber.inneractive.sdk.p084ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.fyber.inneractive.mraidkit.C2674R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.mraid.C3094t;
import com.fyber.inneractive.sdk.mraid.C3097w;
import com.fyber.inneractive.sdk.mraid.C3100z;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.p056m.C3037c;
import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController */
public class IAmraidWebViewController extends C3039d<C3039d.C3051c> {

    /* renamed from: F */
    private boolean f9852F = false;

    /* renamed from: G */
    private boolean f9853G = false;

    /* renamed from: H */
    private boolean f9854H = false;

    /* renamed from: I */
    private boolean f9855I = true;

    /* renamed from: J */
    private boolean f9856J = false;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C3039d.C3052d f9857K;

    /* renamed from: L */
    private final Runnable f9858L = new Runnable() {
        public final void run() {
            if (IAmraidWebViewController.this.f7450c != null) {
                IAmraidWebViewController.this.f7450c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        if (IAmraidWebViewController.this.f7450c == null) {
                            return false;
                        }
                        IAmraidWebViewController.this.f7450c.getViewTreeObserver().removeOnPreDrawListener(this);
                        IAmraidWebViewController.this.mo18599a();
                        IAmraidWebViewController.this.mo18602a((C3094t) new C3097w(IAmraidWebViewController.this.f9857K));
                        if (IAmraidWebViewController.this.f9857K == C3039d.C3052d.INTERSTITIAL) {
                            IAmraidWebViewController.this.mo18550b("showInterstitial();");
                        }
                        IAmraidWebViewController.this.mo18619w();
                        IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                        iAmraidWebViewController.mo18606b(iAmraidWebViewController.mo18618v());
                        IAmraidWebViewController.this.m9015z();
                        return false;
                    }
                });
            }
        }
    };

    /* renamed from: M */
    private final Runnable f9859M = new Runnable() {
        public final void run() {
            if (IAmraidWebViewController.this.f7450c != null) {
                IAmraidWebViewController.this.f7450c.mo18579a("if (FyMraidVideo.getCurrentTime() < 0.2) { var ifr = document.createElement('iframe'); var container = document.body || document.documentElement; container.appendChild(ifr); ifr.setAttribute('sandbox', ''); ifr.setAttribute('style', 'position: fixed; bottom: -20px; border: none; visibility: hidden; height: 20px; z-index: -99999'); ifr.setAttribute('src','FyMraidVideo://fyMraidVideoAdPlaybackFailure'); console.log('dispatched closure event'); } else { console.log('video has progressed'); };");
            }
        }
    };

    /* renamed from: a */
    public boolean f9860a;

    public IAmraidWebViewController(Context context, boolean z, C3039d.C3052d dVar, int i, int i2, boolean z2) {
        super(context, z, dVar, i, i2);
        this.f9860a = z2;
        this.f7450c.setId(C2674R.C2676id.inneractive_webview_mraid);
        this.f9857K = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo18541a(String str, String str2, String str3) {
        System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            IAlog.m9034b("loadHtml called with an empty HTML!", new Object[0]);
            return null;
        }
        sb.append("<html><head>");
        sb.append("<link rel=\"icon\" href=\"data:,\">");
        if (this.f9860a) {
            sb.append(C3657l.m9124e("ia_js_load_monitor.txt"));
        }
        sb.append("<script> window.iaPreCachedAd = true; </script>");
        boolean a = IAConfigManager.m5929c().f6586a.mo18049a("use_js_inline", false);
        if (!a || IAConfigManager.m5947r().f6364a == null) {
            sb.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js\"></script>");
        } else {
            sb.append("<script type=\"text/javascript\">");
            sb.append(IAConfigManager.m5947r().f6364a);
            sb.append("</script>");
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        sb.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script>");
        sb.append("</head>");
        sb.append("<style>body{text-align:center !important;margin:0;padding:0;}");
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        sb.append("</style>");
        sb.append("<body id=\"iaBody\">");
        if (this.f9855I) {
            if (this.f7509v != null && this.f7509v.equals(C3039d.C3052d.INTERSTITIAL)) {
                z = true;
            }
            if (z) {
                if (!a || IAConfigManager.m5947r().f6365b == null) {
                    sb.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                } else {
                    sb.append("<style type=\"text/css\">");
                    sb.append(IAConfigManager.m5947r().f6365b);
                    sb.append("</style>");
                }
                if (!a || IAConfigManager.m5947r().f6366c == null) {
                    sb.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                } else {
                    sb.append("<script type=\"text/javascript\">");
                    sb.append(IAConfigManager.m5947r().f6366c);
                    sb.append("</script>");
                }
            }
        }
        String e = C3657l.m9124e("ia_mraid_bridge.txt");
        sb.append("<div id='iaScriptBr' style='display:none;'>");
        sb.append(e);
        sb.append("</div>");
        if (IAlog.f9870a >= 2) {
            sb.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
        }
        sb.append(str);
        sb.append("</body></html>");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo18549a(String str, C3629aj ajVar) {
        Uri parse = Uri.parse(str);
        String uri = parse.toString();
        parse.getScheme();
        if (!uri.startsWith("iaadfinishedloading")) {
            return super.mo18549a(str, ajVar);
        }
        if (uri.endsWith("success")) {
            IAlog.m9033a("received iaadfinishedloading success", new Object[0]);
            if (!(this.f7449b || this.f7453f == null || this.f7450c == null)) {
                this.f7450c.mo18580a();
                this.f7449b = true;
                mo18565n();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo18603a(String str) {
        if (this.f7454g != null) {
            ((C3039d.C3051c) this.f7454g).mo18466a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18599a() {
        super.mo18599a();
        boolean a = (this.f7450c == null || this.f7450c.getContext() == null) ? false : C3656k.m9087a(new Intent(this.f7450c.getContext(), InneractiveRichMediaVideoPlayerActivityCore.class));
        C3100z zVar = new C3100z();
        zVar.f7617b = C3656k.m9098j();
        zVar.f7616a = C3656k.m9099k();
        zVar.f7618c = C3656k.m9101m();
        zVar.f7620e = a;
        zVar.f7619d = C3656k.m9100l();
        mo18602a((C3094t) zVar);
    }

    /* renamed from: b */
    public final void mo19531b() {
        if (this.f7450c != null) {
            this.f9852F = true;
            if (Build.VERSION.SDK_INT >= 17 && this.f9854H) {
                this.f7450c.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            C3662m.m9137a().postDelayed(this.f9858L, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m9015z() {
        if (this.f9852F && this.f9853G && this.f9854H && this.f7450c != null) {
            this.f7450c.mo18579a("FyMraidVideo.play()");
            if (this.f9859M != null) {
                C3662m.m9137a().postDelayed(this.f9859M, 5000);
            }
            if (this.f9856J) {
                this.f7450c.mo18579a("FyMraidVideo.mute(true)");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo18547a(WebView webView, String str) {
        JSONArray jSONArray;
        C3018e eVar;
        JSONArray jSONArray2;
        IAlog.m9034b("IAmraidWebViewController: handleUrl = %s", str);
        if (this.f7450c == null) {
            IAlog.m9034b("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (str == null || !str.toLowerCase().startsWith("FyMraidVideo".toLowerCase())) {
            return super.mo18547a(webView, str);
        } else {
            if (str.toLowerCase().endsWith("fyMraidVideoAd".toLowerCase())) {
                IAlog.m9033a("Dispatching MRAID Video detection event", new Object[0]);
                C2967m mVar = C2967m.MRAID_VIDEO_DETECTED;
                InneractiveAdRequest inneractiveAdRequest = this.f7466s;
                if (this.f7467t == null) {
                    eVar = null;
                } else {
                    eVar = this.f7467t.mo18129f();
                }
                if (this.f7467t == null) {
                    jSONArray2 = null;
                } else {
                    jSONArray2 = this.f7467t.mo18132i().mo18013b();
                }
                new C2968n.C2969a(mVar, inneractiveAdRequest, eVar, jSONArray2).mo18436b((String) null);
                this.f9853G = true;
                m9015z();
            } else if (str.toLowerCase().endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase())) {
                IAlog.m9037e("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                if (this.f7454g != null) {
                    mo18608c(false);
                    C2966l lVar = C2966l.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                    InneractiveAdRequest inneractiveAdRequest2 = this.f7466s;
                    C3018e f = this.f7467t == null ? null : this.f7467t.mo18129f();
                    if (this.f7467t == null) {
                        jSONArray = null;
                    } else {
                        jSONArray = this.f7467t.mo18132i().mo18013b();
                    }
                    new C2968n.C2969a(lVar, inneractiveAdRequest2, f, jSONArray).mo18435a("video_timeout_in_msecs", "5000").mo18436b((String) null);
                }
                if (this.f7454g != null) {
                    ((C3039d.C3051c) this.f7454g).mo18462a((InneractiveUnitController.AdDisplayError) new MraidVideoFailedToDisplayError("an MRAID video has not started playing in a timely fashion"));
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo18545a(boolean z) {
        super.mo18545a(z);
        if (this.f9853G && this.f9852F && this.f9854H && this.f7450c != null) {
            C3037c cVar = this.f7450c;
            StringBuilder sb = new StringBuilder("FyMraidVideo.");
            sb.append(z ? "play" : CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            sb.append("();");
            cVar.mo18579a(sb.toString());
        }
        if (this.f7450c != null && z) {
            C3662m.m9137a().post(new Runnable() {
                public final void run() {
                    if (IAmraidWebViewController.this.f7450c != null) {
                        try {
                            IAmraidWebViewController.this.f7450c.invalidate();
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$MraidVideoFailedToDisplayError */
    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        MraidVideoFailedToDisplayError(String str) {
            super(str);
        }
    }

    public void setAutoplayMRAIDVideos(boolean z) {
        this.f9854H = z;
    }

    public void setCenteringTagsRequired(boolean z) {
        this.f9855I = z;
    }

    /* renamed from: c */
    public final void mo18553c() {
        super.mo18553c();
        C3662m.m9137a().removeCallbacks(this.f9859M);
        C3662m.m9137a().removeCallbacks(this.f9858L);
    }

    public void setMuteMraidVideo(boolean z) {
        this.f9856J = z;
    }
}
