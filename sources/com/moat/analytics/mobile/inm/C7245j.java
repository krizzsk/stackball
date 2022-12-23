package com.moat.analytics.mobile.inm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.AppEventsConstants;
import com.moat.analytics.mobile.inm.C7264s;
import com.moat.analytics.mobile.inm.C7276w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.moat.analytics.mobile.inm.j */
class C7245j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f18164a = 0;

    /* renamed from: b */
    private boolean f18165b = false;

    /* renamed from: c */
    private boolean f18166c = false;

    /* renamed from: d */
    private final AtomicBoolean f18167d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f18168e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f18169f = false;

    /* renamed from: g */
    private boolean f18170g = false;

    /* renamed from: h */
    private final WeakReference<WebView> f18171h;

    /* renamed from: i */
    private final Map<C7227b, String> f18172i;

    /* renamed from: j */
    private final LinkedList<String> f18173j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final long f18174k;

    /* renamed from: l */
    private final String f18175l;

    /* renamed from: m */
    private final List<String> f18176m;

    /* renamed from: n */
    private final C7249a f18177n;

    /* renamed from: o */
    private final BroadcastReceiver f18178o = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                C7245j.this.m18465d();
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
            if (System.currentTimeMillis() - C7245j.this.f18174k > 30000) {
                C7245j.this.m18480i();
            }
        }
    };

    /* renamed from: p */
    private final BroadcastReceiver f18179p = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                C7245j.this.m18469e();
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
        }
    };

    /* renamed from: com.moat.analytics.mobile.inm.j$a */
    enum C7249a {
        WEBVIEW,
        NATIVE_DISPLAY,
        NATIVE_VIDEO
    }

    C7245j(WebView webView, C7249a aVar) {
        this.f18171h = new WeakReference<>(webView);
        this.f18177n = aVar;
        this.f18173j = new LinkedList<>();
        this.f18176m = new ArrayList();
        this.f18172i = new WeakHashMap();
        this.f18174k = System.currentTimeMillis();
        this.f18175l = String.format("javascript:(function(d,k){function l(){function d(a,b){var c=ipkn[b]||ipkn[kuea];if(c){var h=function(b){var c=b.b;c.ts=b.i;c.ticks=b.g;c.buffered=!0;a(c)};h(c.first);c.a.forEach(function(a){h(a)})}}function e(a){var b=a.a,c=a.c,h=a.b;a=a.f;var d=[];if(c)b[c]&&d.push(b[c].fn[0]);else for(key in b)if(b[key])for(var g=0,e=b[key].fn.length;g<e;g++)d.push(b[key].fn[g]);g=0;for(e=d.length;g<e;g++){var f=d[g];if('function'===typeof f)try{h?f(h):f()}catch(k){}a&&delete b[c]}}function f(a,b,c){'function'===typeof a&& (b===kuea&&c[b]?c[b].fn.push(a):c[b]={ts:+new Date,fn:[a]},c===yhgt&&d(a,b))}kuea=+new Date;iymv={};briz=!1;ewat=+new Date;bnkr=[];bjmk={};dptk={};uqaj={};ryup={};yhgt={};ipkn={};csif={};this.h=function(a){this.namespace=a.namespace;this.version=a.version;this.appName=a.appName;this.deviceOS=a.deviceOS;this.isNative=a.isNative;this.versionHash=a.versionHash;this.aqzx=a.aqzx;this.appId=a.appId;this.metadata=a};this.nvsj=function(a){briz||(f(a,ewat,iymv),briz=!0)};this.bpsy=function(a,b){var c=b||kuea; c!==kuea&&bjmk[c]||f(a,c,bjmk)};this.qmrv=function(a,b){var c=b||kuea;c!==kuea&&uqaj[c]||f(a,c,uqaj)};this.lgpr=function(a,b){f(a,b||kuea,yhgt)};this.hgen=function(a,b){f(a,b||kuea,csif)};this.xrnk=function(a){delete yhgt[a||kuea]};this.vgft=function(a){return dptk[a||kuea]||!1};this.lkpu=function(a){return ryup[a||kuea]||!1};this.crts=function(a){var b={a:iymv,b:a,c:ewat};briz?e(b):bnkr.push(a)};this.mqjh=function(a){var b=a||kuea;dptk[b]=!0;var c={a:bjmk,f:!0};b!==kuea&&(c.b=a,c.c=a);e(c)};this.egpw= function(a){var b=a||kuea;ryup[b]=!0;var c={a:uqaj,f:!0};b!==kuea&&(c.b=a,c.c=a);e(c)};this.sglu=function(a){var b=a.adKey||kuea,c={a:yhgt,b:a.event||a,g:1,i:+new Date,f:!1};b!==kuea&&(c.c=a.adKey);a=0<Object.keys(yhgt).length;if(!a||!this.isNative)if(ipkn[b]){var d=ipkn[b].a.slice(-1)[0]||ipkn[b].first;JSON.stringify(c.b)==JSON.stringify(d.b)?d.g+=1:(5<=ipkn[b].a.length&&ipkn[b].a.shift(),ipkn[b].a.push(c))}else ipkn[b]={first:c,a:[]};a&&e(c);return a};this.ucbx=function(a){e({c:a.adKey||kuea,a:csif, b:a.event,f:!1})}}'undefined'===typeof d.MoatMAK&&(d.MoatMAK=new l,d.MoatMAK.h(k),d.__zMoatInit__=!0)})(window,%s);", new Object[]{m18478h()});
        if (m18468d("Initialize")) {
            IntentFilter intentFilter = new IntentFilter("UPDATE_METADATA");
            IntentFilter intentFilter2 = new IntentFilter("UPDATE_VIEW_INFO");
            LocalBroadcastManager.getInstance(C7264s.m18557c()).registerReceiver(this.f18178o, intentFilter);
            LocalBroadcastManager.getInstance(C7264s.m18557c()).registerReceiver(this.f18179p, intentFilter2);
            m18465d();
            C7242i.m18446a().mo49384a(C7264s.m18557c(), this);
            C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "bridge initialization succeeded");
        }
    }

    /* renamed from: a */
    private boolean m18459a(WebView webView) {
        return webView.getSettings().getJavaScriptEnabled();
    }

    /* renamed from: b */
    static /* synthetic */ int m18461b(C7245j jVar) {
        int i = jVar.f18164a;
        jVar.f18164a = i + 1;
        return i;
    }

    /* renamed from: c */
    private void m18463c() {
        for (Map.Entry<C7227b, String> key : this.f18172i.entrySet()) {
            C7227b bVar = (C7227b) key.getKey();
            if (bVar.mo49346e()) {
                m18477g(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.mqjh(\"%s\");}", new Object[]{bVar.f18106e}));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m18465d() {
        try {
            if (C7276w.m18582a().f18242a != C7276w.C7284d.OFF) {
                if (!this.f18166c) {
                    C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "Attempting to establish communication (setting environment variables).");
                    this.f18166c = true;
                }
                m18477g(this.f18175l);
            }
        } catch (Exception e) {
            C7261p.m18546a("JavaScriptBridge", (Object) this, "Attempt failed to establish communication (did not set environment variables).", (Throwable) e);
        }
    }

    /* renamed from: d */
    private void m18466d(C7227b bVar) {
        C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "Stopping view update loop");
        if (bVar != null) {
            C7242i.m18446a().mo49385a(bVar);
        }
    }

    /* renamed from: d */
    private boolean m18468d(String str) {
        WebView g = m18475g();
        if (g == null) {
            C7261p.m18544a(6, "JavaScriptBridge", (Object) this, "WebView is null. Can't ".concat(String.valueOf(str)));
            throw new C7252m("WebView is null");
        } else if (m18459a(g)) {
            return true;
        } else {
            C7261p.m18544a(6, "JavaScriptBridge", (Object) this, "JavaScript is not enabled in the given WebView. Can't ".concat(String.valueOf(str)));
            throw new C7252m("JavaScript is not enabled in the WebView");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m18469e() {
        try {
            if (C7276w.m18582a().f18242a != C7276w.C7284d.OFF) {
                if (this.f18170g) {
                    C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "Can't send info, already cleaned up");
                    return;
                }
                if (m18474f()) {
                    if (!this.f18165b || m18475g().getUrl() != null) {
                        if (m18475g().getUrl() != null) {
                            this.f18165b = true;
                        }
                        for (Map.Entry<C7227b, String> key : this.f18172i.entrySet()) {
                            C7227b bVar = (C7227b) key.getKey();
                            if (bVar == null || bVar.mo49347f() == null) {
                                C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "Tracker has no subject");
                                if (bVar != null) {
                                    if (!bVar.f18107f) {
                                    }
                                }
                                mo49396c(bVar);
                            }
                            if (bVar.mo49346e()) {
                                if (!this.f18167d.get()) {
                                    m18477g(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.mqjh(\"%s\");}", new Object[]{bVar.f18106e}));
                                }
                                String format = String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.sglu(%s);}", new Object[]{bVar.mo49349h()});
                                if (Build.VERSION.SDK_INT >= 19) {
                                    m18475g().evaluateJavascript(format, new ValueCallback<String>() {
                                        /* renamed from: a */
                                        public void onReceiveValue(String str) {
                                            String str2 = "null";
                                            if (str == null || str.equalsIgnoreCase(str2) || str.equalsIgnoreCase("false")) {
                                                C7245j jVar = C7245j.this;
                                                StringBuilder sb = new StringBuilder("Received value is:");
                                                if (str != null) {
                                                    str2 = "(String)".concat(String.valueOf(str));
                                                }
                                                sb.append(str2);
                                                C7261p.m18544a(3, "JavaScriptBridge", (Object) jVar, sb.toString());
                                                if (C7245j.this.f18164a >= 150) {
                                                    C7261p.m18544a(3, "JavaScriptBridge", (Object) C7245j.this, "Giving up on finding ad");
                                                    C7245j.this.mo49393b();
                                                }
                                                C7245j.m18461b(C7245j.this);
                                                if (str != null && str.equalsIgnoreCase("false") && !C7245j.this.f18168e) {
                                                    boolean unused = C7245j.this.f18168e = true;
                                                    C7261p.m18544a(3, "JavaScriptBridge", (Object) C7245j.this, "Bridge connection established");
                                                }
                                            } else if (str.equalsIgnoreCase("true")) {
                                                if (!C7245j.this.f18169f) {
                                                    boolean unused2 = C7245j.this.f18169f = true;
                                                    C7261p.m18544a(3, "JavaScriptBridge", (Object) C7245j.this, "Javascript has found ad");
                                                    C7245j.this.mo49389a();
                                                }
                                                int unused3 = C7245j.this.f18164a = 0;
                                            } else {
                                                C7261p.m18544a(3, "JavaScriptBridge", (Object) C7245j.this, "Received unusual value from Javascript:".concat(String.valueOf(str)));
                                            }
                                        }
                                    });
                                } else {
                                    m18475g().loadUrl(format);
                                }
                            }
                        }
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder("WebView became null");
                sb.append(m18475g() == null ? "" : "based on null url");
                sb.append(", stopping tracking loop");
                C7261p.m18544a(3, "JavaScriptBridge", (Object) this, sb.toString());
                mo49393b();
            }
        } catch (Exception e) {
            C7252m.m18508a(e);
            mo49393b();
        }
    }

    /* renamed from: e */
    private void m18471e(String str) {
        if (this.f18176m.size() >= 50) {
            this.f18176m.subList(0, 25).clear();
        }
        this.f18176m.add(str);
    }

    /* renamed from: f */
    private void m18473f(String str) {
        if (this.f18167d.get()) {
            m18477g(str);
        } else {
            m18471e(str);
        }
    }

    /* renamed from: f */
    private boolean m18474f() {
        return m18475g() != null;
    }

    /* renamed from: g */
    private WebView m18475g() {
        return (WebView) this.f18171h.get();
    }

    /* renamed from: g */
    private void m18477g(String str) {
        if (this.f18170g) {
            C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "Can't send, already cleaned up");
        } else if (m18474f()) {
            C7261p.m18548b(2, "JavaScriptBridge", this, str);
            if (Build.VERSION.SDK_INT >= 19) {
                m18475g().evaluateJavascript(str, (ValueCallback) null);
            } else {
                m18475g().loadUrl(str);
            }
        }
    }

    /* renamed from: h */
    private String m18478h() {
        try {
            C7264s.C7266a d = C7264s.m18558d();
            C7264s.C7267b e = C7264s.m18559e();
            HashMap hashMap = new HashMap();
            String a = d.mo49423a();
            String b = d.mo49424b();
            String c = d.mo49425c();
            String num = Integer.toString(Build.VERSION.SDK_INT);
            String b2 = C7264s.m18555b();
            C7249a aVar = this.f18177n;
            C7249a aVar2 = C7249a.WEBVIEW;
            String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            String str2 = aVar == aVar2 ? str : "1";
            String str3 = e.f18235e ? "1" : str;
            String str4 = e.f18234d ? "1" : str;
            if (!((C7250k) MoatAnalytics.getInstance()).mo49404b()) {
                str = "1";
            }
            hashMap.put("versionHash", "c334ae83accfebb8da23104450c896463c9cfab7");
            hashMap.put("appName", a);
            hashMap.put("namespace", "INM");
            hashMap.put("version", "2.5.0");
            hashMap.put("deviceOS", num);
            hashMap.put("isNative", str2);
            hashMap.put("appId", b);
            hashMap.put("source", c);
            hashMap.put(ServerParameters.CARRIER, e.f18232b);
            hashMap.put("sim", e.f18231a);
            hashMap.put("phone", String.valueOf(e.f18233c));
            hashMap.put("buildFp", Build.FINGERPRINT);
            hashMap.put("buildModel", Build.MODEL);
            hashMap.put("buildMfg", Build.MANUFACTURER);
            hashMap.put("buildBrand", Build.BRAND);
            hashMap.put("buildProduct", Build.PRODUCT);
            hashMap.put("buildTags", Build.TAGS);
            hashMap.put("f1", str4);
            hashMap.put("f2", str3);
            hashMap.put("locationEnabled", str);
            if (b2 != null) {
                hashMap.put("aqzx", b2);
            }
            return new JSONObject(hashMap).toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m18480i() {
        C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "Stopping metadata reporting loop");
        C7242i.m18446a().mo49386a(this);
        LocalBroadcastManager.getInstance(C7264s.m18557c()).unregisterReceiver(this.f18178o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49389a() {
        C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "webViewReady");
        if (this.f18167d.compareAndSet(false, true)) {
            C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "webViewReady first time");
            m18480i();
            for (String g : this.f18176m) {
                m18477g(g);
            }
            this.f18176m.clear();
        }
        m18463c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49390a(C7227b bVar) {
        if (bVar != null) {
            C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "adding tracker" + bVar.f18106e);
            this.f18172i.put(bVar, "");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49391a(String str) {
        m18473f(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.crts(%s);}", new Object[]{str}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49392a(String str, JSONObject jSONObject) {
        if (this.f18170g) {
            C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "Can't dispatch, already cleaned up");
            return;
        }
        String jSONObject2 = jSONObject.toString();
        if (!this.f18167d.get() || !m18474f()) {
            this.f18173j.add(jSONObject2);
            return;
        }
        m18477g(String.format("javascript:%s.dispatchEvent(%s);", new Object[]{str, jSONObject2}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo49393b() {
        C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "Cleaning up");
        this.f18170g = true;
        m18480i();
        for (Map.Entry<C7227b, String> key : this.f18172i.entrySet()) {
            m18466d((C7227b) key.getKey());
        }
        this.f18172i.clear();
        LocalBroadcastManager.getInstance(C7264s.m18557c()).unregisterReceiver(this.f18179p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo49394b(C7227b bVar) {
        if (m18468d("startTracking")) {
            C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "Starting tracking on tracker" + bVar.f18106e);
            m18477g(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.mqjh(\"%s\");}", new Object[]{bVar.f18106e}));
            C7242i.m18446a().mo49383a(C7264s.m18557c(), bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo49395b(String str) {
        C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "markUserInteractionEvent:".concat(String.valueOf(str)));
        m18473f(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.ucbx(%s);}", new Object[]{str}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo49396c(C7227b bVar) {
        C7252m mVar = null;
        if (!this.f18170g) {
            try {
                if (m18468d("stopTracking")) {
                    try {
                        C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "Ending tracking on tracker" + bVar.f18106e);
                        m18477g(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.egpw(\"%s\");}", new Object[]{bVar.f18106e}));
                    } catch (Exception e) {
                        C7261p.m18546a("JavaScriptBridge", (Object) this, "Failed to end impression.", (Throwable) e);
                    }
                }
            } catch (C7252m e2) {
                mVar = e2;
            }
            if (this.f18177n == C7249a.NATIVE_DISPLAY) {
                m18466d(bVar);
            } else {
                mo49393b();
            }
            this.f18172i.remove(bVar);
        }
        if (mVar != null) {
            throw mVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo49397c(String str) {
        C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "flushDispatchQueue");
        if (this.f18173j.size() >= 200) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < 10; i++) {
                linkedList.addFirst(this.f18173j.removeFirst());
            }
            int min = Math.min(Math.min(this.f18173j.size() / 200, 10) + 200, this.f18173j.size());
            for (int i2 = 0; i2 < min; i2++) {
                this.f18173j.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                this.f18173j.addFirst((String) it.next());
            }
        }
        if (!this.f18173j.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            int i3 = 1;
            while (!this.f18173j.isEmpty() && i3 < 200) {
                i3++;
                String removeFirst = this.f18173j.removeFirst();
                if (sb.length() + removeFirst.length() > 2000) {
                    break;
                }
                sb.append(str2);
                sb.append(removeFirst);
                str2 = ",";
            }
            m18477g(String.format("javascript:%s.dispatchMany([%s])", new Object[]{str, sb.toString()}));
        }
        this.f18173j.clear();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            super.finalize();
            C7261p.m18544a(3, "JavaScriptBridge", (Object) this, "finalize");
            mo49393b();
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }
}
