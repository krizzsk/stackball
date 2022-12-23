package com.ogury.p245ed.internal;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ogury.p245ed.internal.C8343iu;
import com.ogury.p245ed.internal.C8356jd;

/* renamed from: com.ogury.ed.internal.jh */
public final class C8362jh extends WebView {

    /* renamed from: a */
    private C8185eb f21598a;

    /* renamed from: b */
    private MutableContextWrapper f21599b;

    /* renamed from: c */
    private boolean f21600c;

    /* renamed from: d */
    private C8366jl f21601d;

    /* renamed from: e */
    private String f21602e;

    /* renamed from: f */
    private C8282hb f21603f;

    /* renamed from: g */
    private boolean f21604g;

    /* renamed from: h */
    private C8291hj f21605h;

    /* renamed from: i */
    private C8364jj f21606i;

    /* renamed from: j */
    private boolean f21607j;

    /* renamed from: k */
    private boolean f21608k;

    /* renamed from: l */
    private C8363ji f21609l;

    /* renamed from: m */
    private C8320id f21610m;

    /* renamed from: n */
    private C8262gm f21611n;

    /* renamed from: o */
    private C8356jd f21612o;

    /* renamed from: p */
    private final C8512ob f21613p;

    public /* synthetic */ C8362jh(Context context, C8185eb ebVar) {
        this(context, ebVar, new MutableContextWrapper(context));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8362jh(Context context, C8185eb ebVar, MutableContextWrapper mutableContextWrapper) {
        super(mutableContextWrapper);
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(ebVar, "ad");
        C8467mq.m23881b(mutableContextWrapper, "mutableContext");
        this.f21598a = ebVar;
        this.f21599b = mutableContextWrapper;
        this.f21600c = true;
        this.f21602e = "loading";
        this.f21603f = new C8282hb(this);
        this.f21605h = new C8340is(this);
        this.f21606i = new C8364jj(this);
        this.f21610m = C8320id.f21501a;
        this.f21611n = C8262gm.f21374a;
        C8356jd.C8357a aVar = C8356jd.f21588a;
        this.f21612o = C8356jd.C8357a.m23676a(context, this.f21598a);
        this.f21613p = new C8512ob("bunaZiua");
        setAdUnit(this.f21598a.mo53365m());
        setWebViewClient(this.f21606i);
    }

    public final boolean getShowSdkCloseButton() {
        return this.f21600c;
    }

    public final void setShowSdkCloseButton(boolean z) {
        this.f21600c = z;
    }

    public final C8366jl getVisibilityChangedListener() {
        return this.f21601d;
    }

    public final void setVisibilityChangedListener(C8366jl jlVar) {
        this.f21601d = jlVar;
    }

    public final String getAdState() {
        return this.f21602e;
    }

    public final void setAdState(String str) {
        C8467mq.m23881b(str, "<set-?>");
        this.f21602e = str;
    }

    public final C8282hb getMraidCommandExecutor() {
        C8282hb hbVar = this.f21603f;
        return hbVar == null ? new C8282hb(this) : hbVar;
    }

    public final boolean getContainsMraid() {
        return this.f21604g;
    }

    public final void setContainsMraid(boolean z) {
        this.f21604g = z;
    }

    public final C8291hj getMraidUrlHandler() {
        return this.f21605h;
    }

    public final void setMraidUrlHandler(C8291hj hjVar) {
        C8467mq.m23881b(hjVar, "<set-?>");
        this.f21605h = hjVar;
    }

    /* renamed from: a */
    public final boolean mo53803a() {
        return this.f21607j;
    }

    public final void setResumed(boolean z) {
        this.f21607j = z;
    }

    /* renamed from: b */
    public final boolean mo53805b() {
        return this.f21608k;
    }

    public final void setMultiBrowserOpened(boolean z) {
        this.f21608k = z;
    }

    public final C8363ji getClientAdapter() {
        return this.f21609l;
    }

    public final void setClientAdapter(C8363ji jiVar) {
        this.f21609l = jiVar;
        C8364jj jjVar = this.f21606i;
        if (jjVar != null) {
            jjVar.mo53840a(jiVar);
        }
    }

    public final void setTestTopActivityMonitor(C8262gm gmVar) {
        C8467mq.m23881b(gmVar, "topActivityMonitor");
        this.f21611n = gmVar;
    }

    public final void setTestMraidLifecycle(C8356jd jdVar) {
        C8467mq.m23881b(jdVar, "mraidLifecycle");
        this.f21612o = jdVar;
    }

    public final void setMraidCommandExecutor(C8282hb hbVar) {
        C8467mq.m23881b(hbVar, "mraidCommandExecutor");
        this.f21603f = hbVar;
    }

    public final void setTestCacheStore(C8320id idVar) {
        C8467mq.m23881b(idVar, "mraidCacheStore");
        this.f21610m = idVar;
    }

    public final void setTestMraidViewClientWrapper(C8364jj jjVar) {
        C8467mq.m23881b(jjVar, "mraidWebViewClientWrapper");
        this.f21606i = jjVar;
    }

    public final C8364jj getMraidWebViewClient() {
        return this.f21606i;
    }

    private final void setAdUnit(C8195ek ekVar) {
        C8364jj jjVar = this.f21606i;
        if (jjVar != null) {
            jjVar.mo53659a(ekVar);
        }
    }

    /* renamed from: c */
    public final void mo53806c() {
        this.f21612o.mo53798a(this);
    }

    /* renamed from: j */
    private final void m23685j() {
        this.f21612o.mo53799b(this);
    }

    /* renamed from: d */
    public final void mo53807d() {
        this.f21612o.mo53800c(this);
    }

    /* renamed from: e */
    public final void mo53808e() {
        this.f21612o.mo53801d(this);
    }

    public final void setOnVisibilityChangedListener(C8366jl jlVar) {
        C8467mq.m23881b(jlVar, "visibilityListener");
        this.f21601d = jlVar;
    }

    /* renamed from: a */
    public final void mo53802a(String str) {
        C8467mq.m23881b(str, "url");
        if (this.f21613p.mo53999a(str)) {
            this.f21604g = true;
            m23685j();
            C8363ji jiVar = this.f21609l;
            if (jiVar != null) {
                jiVar.mo53195a((WebView) this);
            }
        }
        this.f21605h.mo53657a(str, this, this.f21598a);
    }

    /* renamed from: b */
    public final void mo53804b(String str) {
        C8467mq.m23881b(str, "url");
        getMraidCommandExecutor().mo53652c(str);
    }

    /* renamed from: f */
    public final void mo53809f() {
        getMraidCommandExecutor().mo53649c();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        C8467mq.m23881b(view, "changedView");
        C8366jl jlVar = this.f21601d;
        if (jlVar != null) {
            jlVar.mo53191a();
        }
        super.onVisibilityChanged(view, i);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        if (webViewClient != null && !C8467mq.m23880a((Object) this.f21606i, (Object) webViewClient)) {
            new IllegalAccessError("Cannot change the webview client for MraidWebView");
        }
        super.setWebViewClient(webViewClient);
    }

    /* renamed from: g */
    public final void mo53810g() {
        C8320id.m23475a(this.f21598a.mo53338b());
        C8363ji jiVar = this.f21609l;
        if (jiVar != null) {
            jiVar.mo53747a();
        }
    }

    /* renamed from: h */
    public final boolean mo53819h() {
        return this.f21607j && !this.f21608k;
    }

    public final String toString() {
        return C8467mq.m23873a("MraidWebView>> ", (Object) Integer.toHexString(System.identityHashCode(this)));
    }

    /* renamed from: i */
    public final void mo53820i() {
        this.f21601d = null;
        setClientAdapter((C8363ji) null);
        C8343iu.C8344a aVar = C8343iu.f21550a;
        this.f21605h = C8343iu.C8344a.m23608a();
        this.f21603f = null;
        setWebViewClient((WebViewClient) null);
        this.f21606i = null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity a = C8262gm.m23203a();
        if (a != null) {
            this.f21599b.setBaseContext(a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MutableContextWrapper mutableContextWrapper = this.f21599b;
        mutableContextWrapper.setBaseContext(mutableContextWrapper.getBaseContext().getApplicationContext());
    }
}
