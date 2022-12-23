package com.mbridge.msdk.video.p214bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.base.C6536c;
import com.mbridge.msdk.mbsignalcommon.mraid.C6551b;
import com.mbridge.msdk.mbsignalcommon.p206b.C6531a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.p214bt.p215a.C6877c;
import com.mbridge.msdk.video.signal.p235a.C7062j;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTWebView */
public class MBridgeBTWebView extends BTBaseView implements C6551b {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f17036p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f17037q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f17038r;

    /* renamed from: s */
    private boolean f17039s = false;

    /* renamed from: t */
    private ImageView f17040t;

    /* renamed from: u */
    private boolean f17041u = false;

    /* renamed from: v */
    private C7179c f17042v;

    /* renamed from: w */
    private List<CampaignEx> f17043w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public WindVaneWebView f17044x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C7062j f17045y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public WebView f17046z;

    public void expand(String str, boolean z) {
    }

    public C7179c getRewardUnitSetting() {
        return this.f17042v;
    }

    public void setRewardUnitSetting(C7179c cVar) {
        this.f17042v = cVar;
    }

    public List<CampaignEx> getCampaigns() {
        return this.f17043w;
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f17043w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f17046z = webView;
    }

    public String getFileURL() {
        return this.f17036p;
    }

    public void setFileURL(String str) {
        this.f17036p = str;
        if (!TextUtils.isEmpty(str)) {
            boolean contains = str.contains("play.google.com");
            setWebviewClickable(!contains);
            if (contains) {
                C6536c cVar = new C6536c();
                WindVaneWebView windVaneWebView = this.f17044x;
                if (windVaneWebView != null) {
                    windVaneWebView.setFilter(cVar);
                }
            }
        }
    }

    public String getFilePath() {
        return this.f17037q;
    }

    public void setFilePath(String str) {
        this.f17037q = str;
    }

    public String getHtml() {
        return this.f17038r;
    }

    public void setHtml(String str) {
        this.f17038r = str;
    }

    public WindVaneWebView getWebView() {
        return this.f17044x;
    }

    public MBridgeBTWebView(Context context) {
        super(context);
    }

    public MBridgeBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setWebviewClickable(boolean z) {
        WindVaneWebView windVaneWebView = this.f17044x;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z);
        }
    }

    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.f17044x = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.f17044x.setVisibility(0);
        C7062j jVar = new C7062j((Activity) null, this.f16876b, this.f17043w);
        this.f17045y = jVar;
        jVar.mo48806a(this.f16877c);
        this.f17044x.setObject(this.f17045y);
        this.f17044x.setMraidObject(this);
        this.f17044x.setWebViewListener(new C6531a() {
            /* renamed from: a */
            public final void mo44406a(Object obj) {
                super.mo44406a(obj);
                try {
                    String str = "";
                    String c = MBridgeBTWebView.this.f17045y != null ? MBridgeBTWebView.this.f17045y.mo48812c() : str;
                    if (!TextUtils.isEmpty(c)) {
                        str = Base64.encodeToString(c.getBytes(), 2);
                        C6361q.m16154a("RVWindVaneWebView", "getEndScreenInfo success");
                    } else {
                        C6361q.m16154a("RVWindVaneWebView", "getEndScreenInfo failed");
                    }
                    C6563g.m16891a().mo44523a(obj, str);
                } catch (Throwable th) {
                    C6361q.m16154a("RVWindVaneWebView", th.getMessage());
                }
            }

            /* renamed from: a */
            public final void mo44023a(WebView webView, String str) {
                super.mo44023a(webView, str);
                if (MBridgeBTWebView.this.f17046z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f16878d);
                        jSONObject.put("code", BTBaseView.f16873n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f16878d);
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 1);
                        jSONObject.put("data", jSONObject2);
                        C6563g.m16891a().mo44522a(MBridgeBTWebView.this.f17046z, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C6877c.m17219a().mo48193a(MBridgeBTWebView.this.f17046z, e.getMessage());
                        C6361q.m16154a("RVWindVaneWebView", e.getMessage());
                    }
                }
                C6563g.m16891a().mo44521a(MBridgeBTWebView.this.f17044x);
            }

            /* renamed from: a */
            public final void mo44021a(WebView webView, int i, String str, String str2) {
                super.mo44021a(webView, i, str, str2);
                if (MBridgeBTWebView.this.f17046z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f16878d);
                        jSONObject.put("code", BTBaseView.f16873n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f16878d);
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 2);
                        jSONObject2.put("error", str);
                        jSONObject.put("data", jSONObject2);
                        C6563g.m16891a().mo44522a(MBridgeBTWebView.this.f17046z, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C6877c.m17219a().mo48193a(MBridgeBTWebView.this.f17046z, e.getMessage());
                        C6361q.m16154a("RVWindVaneWebView", e.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo44022a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.mo44022a(webView, sslErrorHandler, sslError);
                if (MBridgeBTWebView.this.f17046z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f16878d);
                        jSONObject.put("code", BTBaseView.f16873n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f16878d);
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 2);
                        jSONObject2.put("error", sslError.toString());
                        jSONObject.put("data", jSONObject2);
                        C6563g.m16891a().mo44522a(MBridgeBTWebView.this.f17046z, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C6877c.m17219a().mo48193a(MBridgeBTWebView.this.f17046z, e.getMessage());
                        C6361q.m16154a("RVWindVaneWebView", e.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo44020a(WebView webView, int i) {
                super.mo44020a(webView, i);
            }
        });
        addView(this.f17044x, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (MBridgeBTWebView.this.f17046z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f16873n);
                        jSONObject.put("id", MBridgeBTWebView.this.f16878d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put("data", jSONObject2);
                        C6563g.m16891a().mo44522a(MBridgeBTWebView.this.f17046z, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        C6877c.m17219a().mo48194a(MBridgeBTWebView.this.f17046z, "onClicked", MBridgeBTWebView.this.f16878d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.f17040t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f17040t.setLayoutParams(layoutParams);
            this.f17040t.setVisibility(this.f17039s ? 4 : 8);
            if (this.f16876b != null && this.f16876b.isMraid()) {
                this.f17040t.setVisibility(4);
            }
            this.f17040t.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBridgeBTWebView.this.close();
                }
            });
            addView(this.f17040t);
        } catch (Throwable th) {
            C6361q.m16154a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.f17044x;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f17036p)) {
            this.f17044x.loadUrl(this.f17036p);
        } else if (!TextUtils.isEmpty(this.f17037q)) {
            this.f17044x.loadUrl(this.f17037q);
        } else if (!TextUtils.isEmpty(this.f17038r)) {
            this.f17044x.loadDataWithBaseURL("", this.f17038r, WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
        }
    }

    public void webviewLoad(int i) {
        if (this.f17045y == null) {
            this.f17045y = new C7062j((Activity) null, this.f16876b, this.f17043w);
        }
        if (this.f16876b != null) {
            this.f17045y.mo48838a(this.f16876b);
        } else {
            List<CampaignEx> list = this.f17043w;
            if (list != null && list.size() > 0) {
                this.f17045y.mo48839a(this.f17043w);
                if (this.f17043w.size() == 1) {
                    this.f17045y.mo48838a(this.f17043w.get(0));
                }
            }
        }
        C7179c cVar = this.f17042v;
        if (cVar != null) {
            this.f17045y.mo48805a(cVar);
        }
        this.f17045y.mo48806a(this.f16877c);
        this.f17045y.mo48840c(this.f16878d);
        if (i == 1) {
            this.f17045y.mo48845n();
        }
        WindVaneWebView windVaneWebView = this.f17044x;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.f17045y);
        }
        if (this.f16876b != null && this.f16876b.isMraid()) {
            this.f17040t.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.f17044x;
        if (windVaneWebView == null) {
            return false;
        }
        windVaneWebView.reload();
        return true;
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.f17044x;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.f17044x.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.f17044x;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.f17044x.goForward();
        return true;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f17044x != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f16873n);
                jSONObject2.put("id", this.f16878d);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C6563g.m16891a().mo44522a((WebView) this.f17044x, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C6877c.m17219a().mo48194a((WebView) this.f17044x, "broadcast", this.f16878d);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f17044x != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", "landscape");
                } else {
                    jSONObject.put("orientation", "portrait");
                }
                jSONObject.put("instanceId", this.f16878d);
                C6563g.m16891a().mo44522a((WebView) this.f17044x, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onBackPressed() {
        if (this.f17044x != null) {
            C6877c.m17219a().mo48194a((WebView) this.f17044x, "onSystemBackPressed", this.f16878d);
        }
    }

    public void onDestory() {
        if (!this.f17041u) {
            this.f17041u = true;
            try {
                if (this.f17044x != null) {
                    C6877c.m17219a().mo48194a((WebView) this.f17044x, "onSystemDestory", this.f16878d);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        try {
                            if (MBridgeBTWebView.this.f17044x != null) {
                                MBridgeBTWebView.this.f17044x.clearWebView();
                                MBridgeBTWebView.this.f17044x.release();
                            }
                            String unused = MBridgeBTWebView.this.f17036p = null;
                            String unused2 = MBridgeBTWebView.this.f17037q = null;
                            String unused3 = MBridgeBTWebView.this.f17038r = null;
                            if (MBridgeBTWebView.this.f17046z != null) {
                                WebView unused4 = MBridgeBTWebView.this.f17046z = null;
                            }
                        } catch (Throwable th) {
                            C6361q.m16154a(BTBaseView.TAG, th.getMessage());
                        }
                    }
                }, 500);
                setOnClickListener((View.OnClickListener) null);
                removeAllViews();
            } catch (Throwable th) {
                C6361q.m16154a(BTBaseView.TAG, th.getMessage());
            }
        }
    }

    public void open(String str) {
        String clickURL;
        try {
            clickURL = this.f16876b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f16876b.setClickURL(str);
                CampaignEx mraidCampaign = getMraidCampaign();
                if (mraidCampaign != null) {
                    new C6308c(getContext()).mo43935b(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f16877c, str, this.f16876b.isBidCampaign());
                }
            }
        } catch (Throwable th) {
            C6361q.m16158d(BTBaseView.TAG, th.getMessage());
            return;
        }
        new C6097a(getContext(), this.f16877c).mo42838a(this.f16876b);
        this.f16876b.setClickURL(clickURL);
    }

    public void close() {
        WebView webView = this.f17046z;
        if (webView != null) {
            m17280a(webView, "onPlayerCloseBtnClicked", this.f16878d);
        }
    }

    public void unload() {
        close();
    }

    public CampaignEx getMraidCampaign() {
        return this.f16876b;
    }

    public void useCustomClose(boolean z) {
        try {
            this.f17040t.setVisibility(z ? 4 : 0);
        } catch (Throwable th) {
            C6361q.m16158d(BTBaseView.TAG, th.getMessage());
        }
    }
}
