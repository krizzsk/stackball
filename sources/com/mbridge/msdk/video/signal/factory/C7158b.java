package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.p214bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.signal.C7050a;
import com.mbridge.msdk.video.signal.C7067b;
import com.mbridge.msdk.video.signal.C7068c;
import com.mbridge.msdk.video.signal.C7155e;
import com.mbridge.msdk.video.signal.C7156f;
import com.mbridge.msdk.video.signal.C7160h;
import com.mbridge.msdk.video.signal.C7161i;
import com.mbridge.msdk.video.signal.p235a.C7060h;
import com.mbridge.msdk.video.signal.p235a.C7061i;
import com.mbridge.msdk.video.signal.p235a.C7062j;
import com.mbridge.msdk.video.signal.p235a.C7063k;
import com.mbridge.msdk.video.signal.p235a.C7064l;
import com.mbridge.msdk.video.signal.p235a.C7065m;
import com.mbridge.msdk.video.signal.p235a.C7066n;

/* renamed from: com.mbridge.msdk.video.signal.factory.b */
/* compiled from: JSFactory */
public final class C7158b extends C7157a {

    /* renamed from: h */
    private Activity f17860h;

    /* renamed from: i */
    private WebView f17861i;

    /* renamed from: j */
    private MBridgeVideoView f17862j;

    /* renamed from: k */
    private MBridgeContainerView f17863k;

    /* renamed from: l */
    private CampaignEx f17864l;

    /* renamed from: m */
    private MBridgeBTContainer f17865m;

    /* renamed from: n */
    private C7068c.C7069a f17866n;

    /* renamed from: o */
    private String f17867o;

    public C7158b(Activity activity) {
        this.f17860h = activity;
    }

    public C7158b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f17860h = activity;
        this.f17865m = mBridgeBTContainer;
        this.f17861i = webView;
    }

    public C7158b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C7068c.C7069a aVar) {
        this.f17860h = activity;
        this.f17861i = webView;
        this.f17862j = mBridgeVideoView;
        this.f17863k = mBridgeContainerView;
        this.f17864l = campaignEx;
        this.f17866n = aVar;
        this.f17867o = mBridgeVideoView.getUnitId();
    }

    public final C7050a getActivityProxy() {
        if (this.f17861i == null) {
            return super.getActivityProxy();
        }
        if (this.f17853a == null) {
            this.f17853a = new C7060h(this.f17861i);
        }
        return this.f17853a;
    }

    public final C7156f getJSNotifyProxy() {
        if (this.f17861i == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f17856d == null) {
            this.f17856d = new C7064l(this.f17861i);
        }
        return this.f17856d;
    }

    public final C7068c getJSCommon() {
        if (this.f17860h == null || this.f17864l == null) {
            return super.getJSCommon();
        }
        if (this.f17854b == null) {
            this.f17854b = new C7062j(this.f17860h, this.f17864l);
        }
        this.f17854b.mo48803a(this.f17860h);
        this.f17854b.mo48806a(this.f17867o);
        this.f17854b.mo48804a(this.f17866n);
        return this.f17854b;
    }

    public final C7161i getJSVideoModule() {
        if (this.f17862j == null) {
            return super.getJSVideoModule();
        }
        if (this.f17855c == null) {
            this.f17855c = new C7066n(this.f17862j);
        }
        return this.f17855c;
    }

    public final C7155e getJSContainerModule() {
        if (this.f17863k == null) {
            return super.getJSContainerModule();
        }
        if (this.f17857e == null) {
            this.f17857e = new C7063k(this.f17863k);
        }
        return this.f17857e;
    }

    public final C7160h getIJSRewardVideoV1() {
        if (this.f17863k == null || this.f17860h == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f17858f == null) {
            this.f17858f = new C7065m(this.f17860h, this.f17863k);
        }
        return this.f17858f;
    }

    public final C7067b getJSBTModule() {
        if (this.f17860h == null || this.f17865m == null) {
            return super.getJSBTModule();
        }
        if (this.f17859g == null) {
            this.f17859g = new C7061i(this.f17860h, this.f17865m);
        }
        return this.f17859g;
    }

    /* renamed from: a */
    public final void mo49051a(C7062j jVar) {
        this.f17854b = jVar;
    }
}
