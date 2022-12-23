package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;

public class WindVaneWebView extends BaseWebView {

    /* renamed from: b */
    protected C6567k f16333b;

    /* renamed from: c */
    protected C6559c f16334c;

    /* renamed from: d */
    protected C6562f f16335d;

    /* renamed from: e */
    private Object f16336e;

    /* renamed from: f */
    private Object f16337f;

    /* renamed from: g */
    private String f16338g;

    /* renamed from: h */
    private C6560d f16339h;

    /* renamed from: i */
    private String f16340i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f16341j = false;

    /* renamed from: k */
    private float f16342k = 0.0f;

    /* renamed from: l */
    private float f16343l = 0.0f;

    public WindVaneWebView(Context context) {
        super(context);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setSignalCommunication(C6559c cVar) {
        this.f16334c = cVar;
        cVar.mo44512a(this);
    }

    public C6559c getSignalCommunication() {
        return this.f16334c;
    }

    public void setRid(String str) {
        this.f16340i = str;
    }

    public String getRid() {
        return this.f16340i;
    }

    public Object getJsObject(String str) {
        C6562f fVar = this.f16335d;
        if (fVar == null) {
            return null;
        }
        return fVar.mo44517a(str);
    }

    public void registerWindVanePlugin(Class cls) {
        C6562f fVar = this.f16335d;
        if (fVar != null) {
            fVar.mo44520a(cls.getSimpleName(), cls);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44420a() {
        super.mo44420a();
        getSettings().setSavePassword(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f16333b == null) {
            this.f16333b = new C6567k(this);
        }
        setWebViewChromeClient(this.f16333b);
        this.mWebViewClient = new C6568l();
        setWebViewClient(this.mWebViewClient);
        if (this.f16334c == null) {
            C6565i iVar = new C6565i(this.f16295a);
            this.f16334c = iVar;
            setSignalCommunication(iVar);
        }
        this.f16335d = new C6562f(this.f16295a, this);
    }

    public void setApiManagerContext(Context context) {
        C6562f fVar = this.f16335d;
        if (fVar != null) {
            fVar.mo44518a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        C6562f fVar = this.f16335d;
        if (fVar != null) {
            fVar.mo44519a(obj);
        }
    }

    public void setWebViewChromeClient(C6567k kVar) {
        this.f16333b = kVar;
        setWebChromeClient(kVar);
    }

    public void setObject(Object obj) {
        this.f16336e = obj;
    }

    public Object getObject() {
        return this.f16336e;
    }

    public void setMraidObject(Object obj) {
        this.f16337f = obj;
    }

    public Object getMraidObject() {
        return this.f16337f;
    }

    public void setWebViewListener(C6560d dVar) {
        this.f16339h = dVar;
        C6567k kVar = this.f16333b;
        if (kVar != null) {
            kVar.mo44528a(dVar);
        }
        if (this.mWebViewClient != null) {
            this.mWebViewClient.mo44427a(dVar);
        }
    }

    public C6560d getWebViewListener() {
        return this.f16339h;
    }

    public boolean isDestoryed() {
        return this.f16341j;
    }

    public void release() {
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener((DownloadListener) null);
            this.f16336e = null;
            int m = C6366u.m16229m(getContext());
            if (m == 0) {
                this.f16341j = true;
                destroy();
                return;
            }
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    boolean unused = WindVaneWebView.this.f16341j = true;
                    WindVaneWebView.this.destroy();
                }
            }, (long) (m * 1000));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void clearWebView() {
        if (!this.f16341j) {
            loadUrl("about:blank");
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    public String getCampaignId() {
        return this.f16338g;
    }

    public void setCampaignId(String str) {
        this.f16338g = str;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mWebViewClient != null && (this.mWebViewClient.mo44428b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f16342k = motionEvent.getRawX();
                    this.f16343l = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f16342k;
                    float y = motionEvent.getY() - this.f16343l;
                    if ((rawX >= 0.0f || rawX * -1.0f <= ((float) 48)) && ((rawX <= 0.0f || rawX <= ((float) 48)) && ((y >= 0.0f || -1.0f * y <= ((float) 48)) && (y <= 0.0f || y <= ((float) 48))))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
