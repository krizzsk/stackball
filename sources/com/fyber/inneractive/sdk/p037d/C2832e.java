package com.fyber.inneractive.sdk.p037d;

import com.fyber.inneractive.sdk.config.C2739a;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.p051j.C3019f;
import com.fyber.inneractive.sdk.p056m.C3028a;
import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.p084ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C3647e;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.d.e */
public final class C2832e extends C2825b<C3019f, C2853m> {

    /* renamed from: g */
    C3028a.C3034b f6736g = new C3028a.C3034b() {
        /* renamed from: a */
        public final void mo18122a(C3028a aVar) {
            UnitDisplayType unitDisplayType;
            IAlog.m9034b("%sweb view returned onReady!", IAlog.m9029a((Object) C2832e.this));
            if (C2832e.this.f6701b != null) {
                unitDisplayType = ((C3019f) C2832e.this.f6701b).f7415r;
            } else {
                unitDisplayType = null;
            }
            if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
                C2832e.m6208a(C2832e.this);
            }
            C2832e.this.mo18107h();
        }

        /* renamed from: a */
        public final void mo18121a(InneractiveErrorCode inneractiveErrorCode) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            C2832e.this.mo18100a((InneractiveError) inneractiveInfrastructureError);
            IAlog.m9034b("%sweb view returned onFailedLoading!", IAlog.m9029a((Object) C2832e.this));
            C2832e.this.mo18101a(inneractiveInfrastructureError);
            if (inneractiveErrorCode == InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
                new C2968n.C2969a(C2966l.MRAID_ERROR_UNSECURE_CONTENT, C2832e.this.f6700a, C2832e.this.f6701b, C2832e.this.f6704e.mo18013b()).mo18436b((String) null);
            }
        }
    };

    /* renamed from: h */
    private IAmraidWebViewController f6737h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo18103b() {
        return "send_failed_display_creatives";
    }

    /* renamed from: a */
    public final void mo18098a() {
        int i;
        String str;
        String str2;
        this.f6702c = new C2853m(mo18106g(), this.f6704e);
        ((C2853m) this.f6702c).mo18125a(this.f6701b);
        ((C2853m) this.f6702c).f6747k = this.f6705f;
        UnitDisplayType unitDisplayType = ((C3019f) this.f6701b).f7415r;
        C3039d.C3052d dVar = C3039d.C3052d.INLINE;
        if (unitDisplayType == null) {
            this.f6736g.mo18121a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
            return;
        }
        int i2 = C28342.f6739a[unitDisplayType.ordinal()];
        boolean z = false;
        if (i2 == 1 || i2 == 2) {
            i = C3039d.C3049a.f7526a;
            if (this.f6700a == null || this.f6700a.getAllowFullscreen()) {
                dVar = C3039d.C3052d.INTERSTITIAL;
            }
        } else {
            i = C3039d.C3049a.f7526a;
        }
        try {
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(C3657l.m9125p(), C3647e.m9075a(unitDisplayType, IAConfigManager.m5929c().f6586a), dVar, i, C3039d.C3053e.f7538c, !((C3019f) this.f6701b).f7424a.contains("iaNotifyLoadFinished"));
            this.f6737h = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.f6702c);
            this.f6737h.setAdRequest(this.f6700a);
            if (!(this.f6700a == null || this.f6700a.getSelectedUnitConfig() == null || this.f6700a.getSelectedUnitConfig().mo18071h() == null)) {
                this.f6737h.setMuteMraidVideo(((C2853m) this.f6702c).mo18135k() && this.f6700a.getSelectedUnitConfig().mo18071h().mo18057a() != UnitDisplayType.REWARDED);
            }
            ((C2853m) this.f6702c).f6798a = this.f6737h;
            if (this.f6701b != null) {
                UnitDisplayType unitDisplayType2 = ((C3019f) this.f6701b).f7415r;
                if (this.f6700a == null || this.f6700a.getAllowFullscreen()) {
                    z = true;
                }
                String a = m6207a(unitDisplayType2, z);
                str = m6206a(unitDisplayType2);
                str2 = a;
            } else {
                str2 = "";
                str = str2;
            }
            this.f6737h.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit());
            IAmraidWebViewController iAmraidWebViewController2 = this.f6737h;
            String b = C2739a.m5960b();
            iAmraidWebViewController2.mo18544a(b, "" + ((C3019f) this.f6701b).f7424a, str2, str, this.f6736g, TimeUnit.SECONDS.toMillis((long) IAConfigManager.m5935f().f6592a.f6586a.mo18046a("DisplayAdLoadTimeOutInSeconds", 10, 3)));
        } catch (Throwable th) {
            mo18101a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th));
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.d.e$2 */
    static /* synthetic */ class C28342 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6739a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6739a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6739a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p037d.C2832e.C28342.<clinit>():void");
        }
    }

    /* renamed from: e */
    public final void mo18104e() {
        IAmraidWebViewController iAmraidWebViewController;
        if (!(this.f6702c == null || (iAmraidWebViewController = this.f6737h) == null)) {
            iAmraidWebViewController.mo18553c();
            this.f6737h = null;
        }
        super.mo18104e();
    }

    /* renamed from: a */
    public static String m6207a(UnitDisplayType unitDisplayType, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (unitDisplayType != null && unitDisplayType.isFullscreenUnit() && !z) {
            sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m6206a(UnitDisplayType unitDisplayType) {
        StringBuilder sb = new StringBuilder();
        if (unitDisplayType != null && !unitDisplayType.isFullscreenUnit()) {
            if (unitDisplayType == UnitDisplayType.BANNER) {
                sb.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static /* synthetic */ void m6208a(C2832e eVar) {
        try {
            new C2968n.C2969a(C2967m.EVENT_READY_ON_CLIENT, eVar.f6700a, (C3018e) eVar.f6702c != null ? (C3019f) ((C2853m) eVar.f6702c).mo18129f() : null).mo18436b((String) null);
        } catch (Exception unused) {
        }
    }
}
