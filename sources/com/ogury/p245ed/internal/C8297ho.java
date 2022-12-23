package com.ogury.p245ed.internal;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.ho */
public final class C8297ho {

    /* renamed from: a */
    public static final C8298a f21420a = new C8298a((byte) 0);

    /* renamed from: b */
    private final C8185eb f21421b;

    /* renamed from: c */
    private final Map<String, C8362jh> f21422c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<String, C8313hx> f21423d;

    /* renamed from: e */
    private final C8295hm f21424e;

    /* renamed from: f */
    private final C8300hp f21425f;

    /* renamed from: g */
    private final C8317ia f21426g;

    /* renamed from: h */
    private final C8147di f21427h;

    /* renamed from: i */
    private final C8345iv f21428i;

    /* renamed from: j */
    private final C8314hy f21429j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C8301hq f21430k;

    /* renamed from: l */
    private final Pattern f21431l;

    public /* synthetic */ C8297ho(C8185eb ebVar, Map map, Map map2, C8295hm hmVar, C8300hp hpVar, C8317ia iaVar, C8147di diVar, C8345iv ivVar, C8314hy hyVar, byte b) {
        this(ebVar, map, map2, hmVar, hpVar, iaVar, diVar, ivVar, hyVar);
    }

    private C8297ho(C8185eb ebVar, Map<String, C8362jh> map, Map<String, C8313hx> map2, C8295hm hmVar, C8300hp hpVar, C8317ia iaVar, C8147di diVar, C8345iv ivVar, C8314hy hyVar) {
        this.f21421b = ebVar;
        this.f21422c = map;
        this.f21423d = map2;
        this.f21424e = hmVar;
        this.f21425f = hpVar;
        this.f21426g = iaVar;
        this.f21427h = diVar;
        this.f21428i = ivVar;
        this.f21429j = hyVar;
        this.f21431l = Pattern.compile(ebVar.mo53357i());
    }

    /* renamed from: com.ogury.ed.internal.ho$a */
    public static final class C8298a {
        public /* synthetic */ C8298a(byte b) {
            this();
        }

        private C8298a() {
        }

        /* renamed from: a */
        public static C8297ho m23362a(Context context, C8185eb ebVar, FrameLayout frameLayout, C8345iv ivVar) {
            C8467mq.m23881b(context, "context");
            C8467mq.m23881b(ebVar, "ad");
            C8467mq.m23881b(frameLayout, "activityRoot");
            C8467mq.m23881b(ivVar, "mraidHandlersFactory");
            Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
            C8467mq.m23878a((Object) synchronizedMap, "synchronizedMap(mutableMapOf())");
            Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
            C8467mq.m23878a((Object) synchronizedMap2, "synchronizedMap(mutableMapOf())");
            C8295hm hmVar = new C8295hm(context, frameLayout, ebVar);
            C8300hp hpVar = new C8300hp(synchronizedMap, synchronizedMap2);
            C8185eb ebVar2 = ebVar;
            C8300hp hpVar2 = hpVar;
            C8297ho hoVar = new C8297ho(ebVar2, synchronizedMap, synchronizedMap2, hmVar, hpVar2, new C8317ia(context, hpVar), C8147di.f21106a, ivVar, new C8314hy(context, hpVar), (byte) 0);
            hoVar.f21430k = new C8301hq(hoVar, hpVar);
            return hoVar;
        }
    }

    /* renamed from: a */
    public final void mo53665a(C8431lj<C8386ke> ljVar) {
        C8467mq.m23881b(ljVar, "newWebViewCreatedCallback");
        C8301hq hqVar = this.f21430k;
        if (hqVar == null) {
            C8467mq.m23879a("multiWebViewUrlHandler");
            hqVar = null;
        }
        hqVar.mo53684a(ljVar);
    }

    /* renamed from: b */
    public final void mo53669b(C8431lj<C8386ke> ljVar) {
        C8467mq.m23881b(ljVar, "newForceCloseCallback");
        if (C8196el.m22924b(this.f21421b)) {
            C8301hq hqVar = this.f21430k;
            if (hqVar == null) {
                C8467mq.m23879a("multiWebViewUrlHandler");
                hqVar = null;
            }
            hqVar.mo53685b(ljVar);
        }
    }

    /* renamed from: a */
    public final C8291hj mo53663a() {
        C8301hq hqVar = this.f21430k;
        if (hqVar == null) {
            C8467mq.m23879a("multiWebViewUrlHandler");
            hqVar = null;
        }
        return hqVar;
    }

    /* renamed from: b */
    public final boolean mo53671b() {
        return this.f21425f.mo53683d();
    }

    /* renamed from: a */
    public final void mo53664a(C8310hv hvVar) {
        C8467mq.m23881b(hvVar, "webViewArgs");
        C8362jh a = this.f21424e.mo53661a(hvVar);
        if (a != null) {
            this.f21422c.put(hvVar.mo53701c(), a);
            this.f21423d.put(hvVar.mo53701c(), new C8313hx(hvVar.mo53710h(), hvVar.mo53711i(), hvVar.mo53693a(), false, 56));
            m23347a(a);
            WebView webView = a;
            C8268gr.m23218d(webView);
            if (hvVar.mo53712j()) {
                C8268gr.m23213a(webView);
                a.getSettings().setCacheMode(1);
            }
            m23346a(hvVar, webView);
        }
    }

    /* renamed from: a */
    private final void m23346a(C8310hv hvVar, WebView webView) {
        if (hvVar.mo53693a().length() > 0) {
            webView.loadUrl(hvVar.mo53693a());
        } else {
            webView.loadDataWithBaseURL(this.f21421b.mo53355h(), hvVar.mo53697b(), WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
        }
    }

    /* renamed from: a */
    public final void mo53667a(String str, C8362jh jhVar, boolean z) {
        C8467mq.m23881b(str, "webViewName");
        C8467mq.m23881b(jhVar, "webView");
        jhVar.setTag(str);
        this.f21422c.put(str, jhVar);
        this.f21423d.put(str, new C8313hx(false, z, "", true, 48));
    }

    /* renamed from: b */
    public final void mo53668b(C8310hv hvVar) {
        C8467mq.m23881b(hvVar, "webViewArgs");
        C8362jh jhVar = this.f21422c.get(hvVar.mo53701c());
        if (jhVar != null) {
            WebView webView = jhVar;
            C8295hm.m23330a(webView, hvVar);
            boolean z = true;
            if (!(hvVar.mo53693a().length() > 0)) {
                if (hvVar.mo53697b().length() <= 0) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            m23346a(hvVar, webView);
        }
    }

    /* renamed from: a */
    public final void mo53666a(String str) {
        C8467mq.m23881b(str, "webViewName");
        C8362jh jhVar = this.f21422c.get(str);
        if (jhVar != null) {
            this.f21424e.mo53662a((WebView) jhVar);
        }
        this.f21422c.remove(str);
        this.f21423d.remove(str);
    }

    /* renamed from: a */
    private final void m23347a(C8362jh jhVar) {
        C8291hj[] hjVarArr = new C8291hj[2];
        C8301hq hqVar = this.f21430k;
        if (hqVar == null) {
            C8467mq.m23879a("multiWebViewUrlHandler");
            hqVar = null;
        }
        hjVarArr[0] = hqVar;
        hjVarArr[1] = this.f21428i.mo53772a(jhVar);
        jhVar.setMraidUrlHandler(new C8343iu(hjVarArr));
        jhVar.setClientAdapter(new C8299b(this, jhVar));
    }

    /* renamed from: com.ogury.ed.internal.ho$b */
    public static final class C8299b extends C8363ji {

        /* renamed from: a */
        final /* synthetic */ C8297ho f21432a;

        /* renamed from: b */
        final /* synthetic */ C8362jh f21433b;

        /* renamed from: c */
        private String f21434c = "";

        /* renamed from: d */
        private boolean f21435d;

        /* renamed from: d */
        public final boolean mo53678d(WebView webView, String str) {
            C8467mq.m23881b(webView, "view");
            C8467mq.m23881b(str, "url");
            return false;
        }

        C8299b(C8297ho hoVar, C8362jh jhVar) {
            this.f21432a = hoVar;
            this.f21433b = jhVar;
        }

        /* renamed from: a */
        public final void mo53675a(WebView webView, String str) {
            C8467mq.m23881b(webView, "webView");
            C8467mq.m23881b(str, "url");
            this.f21434c = str;
            this.f21435d = true;
            this.f21432a.m23339a(webView, str);
        }

        /* renamed from: b */
        public final void mo53676b(WebView webView, String str) {
            C8467mq.m23881b(webView, "webView");
            C8467mq.m23881b(str, "url");
            this.f21432a.m23341a(webView, str, this.f21435d);
            this.f21435d = false;
        }

        /* renamed from: c */
        public final void mo53677c(WebView webView, String str) {
            C8467mq.m23881b(webView, "view");
            C8467mq.m23881b(str, "url");
            this.f21432a.m23340a(webView, this.f21434c, str);
        }

        /* renamed from: a */
        public final void mo53195a(WebView webView) {
            C8467mq.m23881b(webView, "webView");
            C8313hx hxVar = (C8313hx) this.f21432a.f21423d.get(C8296hn.m23337b(webView));
            if (hxVar != null) {
                hxVar.mo53717e();
            }
            this.f21433b.mo53806c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23339a(WebView webView, String str) {
        this.f21425f.mo53680a("started", m23349f(), m23348e(), C8296hn.m23337b(webView), str, "");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23341a(WebView webView, String str, boolean z) {
        C8300hp hpVar = this.f21425f;
        boolean f = m23349f();
        boolean e = m23348e();
        String b = C8296hn.m23337b(webView);
        String title = webView.getTitle();
        C8467mq.m23878a((Object) title, "webView.title");
        hpVar.mo53680a("finished", f, e, b, str, title);
        C8313hx hxVar = this.f21423d.get(C8296hn.m23337b(webView));
        if (hxVar != null) {
            boolean z2 = true;
            boolean z3 = (!hxVar.mo53718f() || !C8467mq.m23880a((Object) hxVar.mo53715c(), (Object) str)) && hxVar.mo53713a();
            if (z && z3) {
                if (this.f21421b.mo53357i().length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    C8147di.m22716a((C8146dh) new C8145dg(this.f21421b, str, "format", (String) null, (String) null));
                }
            }
            hxVar.mo53719g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23340a(WebView webView, String str, String str2) {
        C8313hx hxVar = this.f21423d.get(C8296hn.m23337b(webView));
        if (hxVar != null && !hxVar.mo53720h()) {
            if ((this.f21421b.mo53357i().length() > 0) && this.f21431l.matcher(str2).matches()) {
                C8185eb ebVar = this.f21421b;
                C8147di.m22716a((C8146dh) new C8145dg(ebVar, str, "format", ebVar.mo53357i(), str2));
                hxVar.mo53721i();
            }
        }
    }

    /* renamed from: c */
    public final void mo53672c() {
        for (C8362jh next : this.f21422c.values()) {
            if (next.canGoBack()) {
                next.goBack();
            }
        }
    }

    /* renamed from: d */
    public final void mo53674d() {
        this.f21425f.mo53679a();
        this.f21426g.mo53727a();
        this.f21429j.mo53722a();
        C8301hq hqVar = this.f21430k;
        if (hqVar == null) {
            C8467mq.m23879a("multiWebViewUrlHandler");
            hqVar = null;
        }
        hqVar.mo53684a((C8431lj<C8386ke>) null);
    }

    /* renamed from: e */
    private final boolean m23348e() {
        for (C8362jh canGoBack : this.f21422c.values()) {
            if (canGoBack.canGoBack()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m23349f() {
        for (C8362jh canGoForward : this.f21422c.values()) {
            if (canGoForward.canGoForward()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo53670b(String str) {
        C8467mq.m23881b(str, "webViewName");
        C8362jh jhVar = this.f21422c.get(str);
        if (jhVar != null && jhVar.canGoBack()) {
            jhVar.goBack();
        }
    }

    /* renamed from: c */
    public final void mo53673c(String str) {
        C8467mq.m23881b(str, "webViewName");
        C8362jh jhVar = this.f21422c.get(str);
        if (jhVar != null && jhVar.canGoForward()) {
            jhVar.goForward();
        }
    }
}
