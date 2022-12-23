package com.mbridge.msdk.interstitial.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.same.report.C6305b;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.interstitial.p191b.C6433a;
import com.mbridge.msdk.interstitial.p192c.C6434a;
import com.mbridge.msdk.mbsignalcommon.mraid.C6549a;
import com.mbridge.msdk.mbsignalcommon.mraid.C6551b;
import com.mbridge.msdk.mbsignalcommon.mraid.C6552c;
import com.mbridge.msdk.mbsignalcommon.mraid.C6553d;
import com.mbridge.msdk.mbsignalcommon.windvane.C6560d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import com.p243my.target.ads.Reward;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class MBInterstitialActivity extends MBBaseActivity implements C6551b {
    public static final String INTENT_CAMAPIGN = "campaign";
    public static final String INTENT_UNIT_ID = "unitId";
    public static final long WATI_JS_INVOKE = 2000;
    public static final long WEB_LOAD_TIME = 15000;

    /* renamed from: a */
    Runnable f16049a = new Runnable() {
        public final void run() {
            if (!MBInterstitialActivity.this.f16052d) {
                boolean unused = MBInterstitialActivity.this.f16051c = true;
                if (MBInterstitialActivity.this.f16056h != null) {
                    MBInterstitialActivity.this.f16056h.mo44164a("load page timeout");
                    if (MBInterstitialActivity.this.f16054f != null) {
                        MBInterstitialActivity.this.f16054f.setVisibility(8);
                        MBInterstitialActivity.this.f16054f.setWebViewListener((C6560d) null);
                        MBInterstitialActivity.this.f16054f.release();
                    }
                    MBInterstitialActivity.this.hideLoading();
                }
            }
        }
    };

    /* renamed from: b */
    Runnable f16050b = new Runnable() {
        public final void run() {
            if (!MBInterstitialActivity.this.mIsMBPage) {
                if (MBInterstitialActivity.this.f16053e != null && MBInterstitialActivity.this.f16053e.isMraid()) {
                    MBInterstitialActivity.m16512h(MBInterstitialActivity.this);
                }
                C6433a.m16445a().mo44151a(MBInterstitialActivity.this.f16053e, MBInterstitialActivity.this.mUnitid);
                if (!MBInterstitialActivity.this.f16051c) {
                    boolean unused = MBInterstitialActivity.this.f16052d = true;
                    MBInterstitialActivity.this.hideLoading();
                    MBInterstitialActivity.this.showWebView();
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f16051c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f16052d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public CampaignEx f16053e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WindVaneWebView f16054f;

    /* renamed from: g */
    private ImageView f16055g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C6434a.C6438c f16056h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f16057i;

    /* renamed from: j */
    private C6553d f16058j;

    /* renamed from: k */
    private long f16059k;

    /* renamed from: l */
    private boolean f16060l;

    /* renamed from: m */
    private boolean f16061m;
    public boolean mIsMBPage = false;
    public ProgressBar mProgressBar;
    public String mUnitid;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f16062n = new Handler() {
        public final void handleMessage(Message message) {
        }
    };

    /* renamed from: o */
    private C6097a f16063o;

    public void expand(String str, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            int a = C6347k.m16084a(getApplicationContext(), "mbridge_interstitial_activity", "layout");
            if (a != -1) {
                setContentView(a);
                initView();
                m16499a();
                this.f16055g.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        MBInterstitialActivity.this.finish();
                    }
                });
                if (!(this.f16054f == null || this.f16053e == null)) {
                    BrowserView.MBDownloadListener mBDownloadListener = new BrowserView.MBDownloadListener(this.f16053e);
                    mBDownloadListener.setTitle(this.f16053e.getAppName());
                    this.f16054f.setCampaignId(this.f16053e.getId());
                    this.f16054f.setDownloadListener(mBDownloadListener);
                }
                m16502b();
                try {
                    if (this.f16053e != null && (!TextUtils.isEmpty(this.f16053e.getHtmlUrl()) || this.f16053e.isMraid())) {
                        C6361q.m16156b("MBInterstitialActivity", "url:" + this.f16053e.getHtmlUrl());
                        goneWebView();
                        this.f16054f.setWebViewListener(new C6560d() {
                            /* renamed from: a */
                            public final void mo44020a(WebView webView, int i) {
                            }

                            /* renamed from: a */
                            public final void mo44060a(WebView webView, String str, Bitmap bitmap) {
                            }

                            /* renamed from: b */
                            public final void mo44061b(WebView webView, int i) {
                            }

                            /* renamed from: b */
                            public final boolean mo44062b(WebView webView, String str) {
                                return true;
                            }

                            /* renamed from: c */
                            public final void mo44063c(WebView webView, int i) {
                            }

                            /* renamed from: a */
                            public final void mo44022a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                                boolean unused = MBInterstitialActivity.this.f16057i = true;
                            }

                            /* renamed from: a */
                            public final void mo44021a(WebView webView, int i, String str, String str2) {
                                try {
                                    boolean unused = MBInterstitialActivity.this.f16057i = true;
                                    if (MBInterstitialActivity.this.f16056h != null) {
                                        MBInterstitialActivity.this.f16056h.mo44164a(str);
                                    }
                                    MBInterstitialActivity.m16500a(MBInterstitialActivity.this, 3, str);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            /* renamed from: a */
                            public final void mo44023a(WebView webView, String str) {
                                try {
                                    if (!MBInterstitialActivity.this.f16057i) {
                                        MBInterstitialActivity.m16500a(MBInterstitialActivity.this, 1, "");
                                        if (!(MBInterstitialActivity.this.f16049a == null || MBInterstitialActivity.this.f16062n == null)) {
                                            MBInterstitialActivity.this.f16062n.removeCallbacks(MBInterstitialActivity.this.f16049a);
                                        }
                                        if (MBInterstitialActivity.this.f16056h != null) {
                                            MBInterstitialActivity.this.f16056h.mo44163a();
                                        }
                                        if (!MBInterstitialActivity.this.mIsMBPage) {
                                            MBInterstitialActivity.this.f16062n.postDelayed(MBInterstitialActivity.this.f16050b, 2000);
                                        }
                                        MBInterstitialActivity.m16508d(MBInterstitialActivity.this);
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    if (MBInterstitialActivity.this.f16056h != null) {
                                        MBInterstitialActivity.this.f16056h.mo44164a("load page failed");
                                    }
                                }
                            }
                        });
                        String htmlUrl = this.f16053e.getHtmlUrl();
                        if (this.f16053e.isMraid()) {
                            File file = new File(this.f16053e.getMraid());
                            if (file.exists() && file.isFile() && file.canRead()) {
                                htmlUrl = "file:////" + this.f16053e.getMraid();
                            }
                        }
                        this.f16059k = System.currentTimeMillis();
                        this.f16054f.loadUrl(htmlUrl);
                        this.f16062n.postDelayed(this.f16049a, WEB_LOAD_TIME);
                    } else if (this.f16056h != null) {
                        this.f16056h.mo44164a("htmlurl is null");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                m16499a();
                m16502b();
                if (this.f16056h != null) {
                    this.f16056h.mo44164a("not found resource");
                }
                finish();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        CampaignEx campaignEx = this.f16053e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C6549a.m16848a().mo44479b(this.f16054f, "true");
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        CampaignEx campaignEx = this.f16053e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C6549a.m16848a().mo44479b(this.f16054f, "false");
        }
    }

    /* renamed from: a */
    private void m16499a() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mUnitid = intent.getStringExtra("unitId");
            this.f16053e = (CampaignEx) intent.getSerializableExtra("campaign");
        }
        CampaignEx campaignEx = this.f16053e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C6553d dVar = new C6553d(this);
            this.f16058j = dVar;
            dVar.mo44484c();
            this.f16058j.mo44482a(new C6553d.C6555b() {
                /* renamed from: a */
                public final void mo44211a(double d) {
                    C6549a.m16848a().mo44471a((WebView) MBInterstitialActivity.this.f16054f, d);
                }
            });
        }
        CampaignEx campaignEx2 = this.f16053e;
        if (campaignEx2 != null) {
            C6103b.m15225a((Context) this, campaignEx2.getMaitve(), this.f16053e.getMaitve_src());
        }
    }

    public void initView() {
        this.f16054f = (WindVaneWebView) findViewById(C6347k.m16084a(getApplicationContext(), "mbridge_interstitial_wv", "id"));
        this.mProgressBar = (ProgressBar) findViewById(C6347k.m16084a(getApplicationContext(), "mbridge_interstitial_pb", "id"));
        this.f16055g = (ImageView) findViewById(C6347k.m16084a(getApplicationContext(), "mbridge_interstitial_iv_close", "id"));
    }

    /* renamed from: b */
    private void m16502b() {
        try {
            if (C6434a.f16019e != null && !TextUtils.isEmpty(this.mUnitid) && C6434a.f16019e.containsKey(this.mUnitid)) {
                this.f16056h = C6434a.f16019e.get(this.mUnitid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showWebView() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.f16054f != null) {
                        MBInterstitialActivity.this.f16054f.setVisibility(0);
                        if (MBInterstitialActivity.this.f16053e.isMraid()) {
                            MBInterstitialActivity.m16514j(MBInterstitialActivity.this);
                        }
                        MBInterstitialActivity.m16515k(MBInterstitialActivity.this);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goneWebView() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.f16054f != null) {
                        MBInterstitialActivity.this.f16054f.setVisibility(8);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showLoading() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.mProgressBar != null) {
                        MBInterstitialActivity.this.mProgressBar.setVisibility(0);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hideLoading() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.mProgressBar != null) {
                        MBInterstitialActivity.this.mProgressBar.setVisibility(8);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f16056h != null) {
                this.f16056h.mo44165b();
            }
            if (this.f16063o != null) {
                this.f16063o.mo42843a(false);
                this.f16063o.mo42841a((NativeListener.NativeTrackingListener) null);
                this.f16063o.mo42837a();
            }
            if (this.f16058j != null) {
                this.f16058j.mo44485d();
            }
            if (!this.f16060l) {
                m16506c();
            }
            if (C6434a.f16019e != null && !TextUtils.isEmpty(this.mUnitid)) {
                C6434a.f16019e.remove(this.mUnitid);
            }
            this.f16056h = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void finish() {
        super.finish();
        if (!this.f16060l) {
            m16506c();
        }
        if (!this.f16061m) {
            reportPlayableClosed();
        }
    }

    public void reportPlayableClosed() {
        if (this.f16053e != null) {
            C6203m mVar = new C6203m("2000061", this.f16053e.getId(), this.f16053e.getRequestId(), this.f16053e.getRequestIdNotice(), this.mUnitid, C6349m.m16123n(C6122a.m15302b().mo42895d()));
            mVar.mo43718a(this.f16053e.isMraid() ? C6203m.f15357a : C6203m.f15358b);
            C6305b.m15968b(mVar, C6122a.m15302b().mo42895d(), this.mUnitid);
            this.f16061m = true;
        }
    }

    /* renamed from: c */
    private void m16506c() {
        C6308c cVar = new C6308c(getApplicationContext());
        CampaignEx campaignEx = this.f16053e;
        if (campaignEx != null) {
            cVar.mo43934a(campaignEx.getRequestId(), this.f16053e.getRequestIdNotice(), this.f16053e.getId(), this.mUnitid, C6552c.m16863a(this.f16053e.getId()), this.f16053e.isBidCampaign());
            C6552c.m16864b(this.f16053e.getId());
            this.f16060l = true;
        }
    }

    public void onIntersClick() {
        try {
            if (this.f16056h != null) {
                this.f16056h.mo44166c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C6086d getIntersUnitSetting() {
        try {
            if (TextUtils.isEmpty(this.mUnitid)) {
                return null;
            }
            C6086d e = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), this.mUnitid);
            return e == null ? C6086d.m15136f(this.mUnitid) : e;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void clickTracking() {
        try {
            if (this.f16053e == null) {
                return;
            }
            if (!C6369x.m16235a(this.mUnitid)) {
                onIntersClick();
                C6097a aVar = new C6097a(getApplicationContext(), this.mUnitid);
                this.f16063o = aVar;
                aVar.mo42841a((NativeListener.NativeTrackingListener) new NativeListener.NativeTrackingListener() {
                    public final void onDismissLoading(Campaign campaign) {
                    }

                    public final void onDownloadFinish(Campaign campaign) {
                    }

                    public final void onDownloadProgress(int i) {
                    }

                    public final void onDownloadStart(Campaign campaign) {
                    }

                    public final boolean onInterceptDefaultLoadingDialog() {
                        return false;
                    }

                    public final void onShowLoading(Campaign campaign) {
                    }

                    public final void onStartRedirection(Campaign campaign, String str) {
                        try {
                            MBInterstitialActivity.this.showLoading();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    public final void onRedirectionFailed(Campaign campaign, String str) {
                        MBInterstitialActivity.this.hideLoading();
                    }

                    public final void onFinishRedirection(Campaign campaign, String str) {
                        try {
                            MBInterstitialActivity.this.hideLoading();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                this.f16063o.mo42838a(this.f16053e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void open(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f16053e.setClickURL(str);
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new C6308c(getApplicationContext()).mo43935b(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.mUnitid, str, mraidCampaign.isBidCampaign());
            }
        }
        clickTracking();
    }

    public void close() {
        finish();
    }

    public void unload() {
        close();
    }

    public CampaignEx getMraidCampaign() {
        return this.f16053e;
    }

    public void useCustomClose(boolean z) {
        if (z) {
            this.f16055g.setImageDrawable(new ColorDrawable(0));
        } else {
            this.f16055g.setImageResource(C6347k.m16084a(getApplicationContext(), "mbridge_interstitial_close", "drawable"));
        }
    }

    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) {
        int b = C6366u.m16203b((Context) this, 10.0f);
        if (i2 <= 0) {
            i2 = b;
        }
        if (i3 <= 0) {
            i3 = b;
        }
        if (i4 <= 0) {
            i4 = b;
        }
        if (i5 <= 0) {
            i5 = b;
        }
        if (this.f16055g != null) {
            int b2 = C6366u.m16203b((Context) this, 25.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b2, b2);
            layoutParams.addRule(11);
            layoutParams.setMargins(i2, i4, i3, i5);
            this.f16055g.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m16500a(MBInterstitialActivity mBInterstitialActivity, int i, String str) {
        CampaignEx campaignEx = mBInterstitialActivity.f16053e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C6203m mVar = new C6203m();
            mVar.mo43741k(mBInterstitialActivity.f16053e.getRequestId());
            mVar.mo43743l(mBInterstitialActivity.f16053e.getRequestIdNotice());
            mVar.mo43747n(mBInterstitialActivity.f16053e.getId());
            mVar.mo43724c(i);
            mVar.mo43753q(String.valueOf(System.currentTimeMillis() - mBInterstitialActivity.f16059k));
            mVar.mo43731f("");
            mVar.mo43751p(str);
            mVar.mo43735h(CampaignEx.CLICKMODE_ON);
            mVar.mo43718a(mBInterstitialActivity.f16053e.isMraid() ? C6203m.f15357a : C6203m.f15358b);
            C6305b.m15969b(mVar, mBInterstitialActivity.mUnitid);
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m16508d(MBInterstitialActivity mBInterstitialActivity) {
        CampaignEx campaignEx = mBInterstitialActivity.f16053e;
        if (campaignEx != null && campaignEx.isMraid()) {
            int i = mBInterstitialActivity.getResources().getConfiguration().orientation;
            String str = i != 0 ? i != 1 ? i != 2 ? "UNDEFINED" : "landscape" : "portrait" : "undefined";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("orientation", str);
                jSONObject.put("locked", "true");
            } catch (Exception e) {
                e.printStackTrace();
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            mBInterstitialActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            hashMap.put("state", Reward.DEFAULT);
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            C6549a.m16848a().mo44477b(mBInterstitialActivity.f16054f, (float) C6349m.m16111h(mBInterstitialActivity), (float) C6349m.m16112i(mBInterstitialActivity));
            C6549a.m16848a().mo44480c(mBInterstitialActivity.f16054f, (float) displayMetrics.widthPixels, (float) displayMetrics.heightPixels);
            C6549a.m16848a().mo44476a((WebView) mBInterstitialActivity.f16054f, (Map<String, Object>) hashMap);
            C6549a.m16848a().mo44471a((WebView) mBInterstitialActivity.f16054f, mBInterstitialActivity.f16058j.mo44481a());
            C6549a.m16848a().mo44470a(mBInterstitialActivity.f16054f);
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m16512h(MBInterstitialActivity mBInterstitialActivity) {
        List<String> pv_urls;
        try {
            if (!TextUtils.isEmpty(mBInterstitialActivity.f16053e.getImpressionURL())) {
                C6097a.m15185a(C6122a.m15302b().mo42895d(), mBInterstitialActivity.f16053e, mBInterstitialActivity.mUnitid, mBInterstitialActivity.f16053e.getImpressionURL(), false, true);
            }
            if (!TextUtils.isEmpty(mBInterstitialActivity.f16053e.getOnlyImpressionURL())) {
                C6097a.m15185a(C6122a.m15302b().mo42895d(), mBInterstitialActivity.f16053e, mBInterstitialActivity.mUnitid, mBInterstitialActivity.f16053e.getOnlyImpressionURL(), false, true);
            }
            C6208d.m15706b(mBInterstitialActivity.mUnitid, mBInterstitialActivity.f16053e, "interstitial");
            C6152j.m15441a((C6146e) C6148f.m15420a((Context) mBInterstitialActivity)).mo43016b(mBInterstitialActivity.f16053e.getId());
            if (mBInterstitialActivity.f16053e != null && (pv_urls = mBInterstitialActivity.f16053e.getPv_urls()) != null && pv_urls.size() > 0) {
                for (String a : pv_urls) {
                    C6097a.m15185a(C6122a.m15302b().mo42895d(), mBInterstitialActivity.f16053e, mBInterstitialActivity.mUnitid, a, false, true);
                }
            }
        } catch (Throwable th) {
            C6361q.m16154a("MBInterstitialActivity", th.getMessage());
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m16514j(MBInterstitialActivity mBInterstitialActivity) {
        try {
            C6203m mVar = new C6203m();
            mVar.mo43741k(mBInterstitialActivity.f16053e.getRequestId());
            mVar.mo43743l(mBInterstitialActivity.f16053e.getRequestIdNotice());
            mVar.mo43747n(mBInterstitialActivity.f16053e.getId());
            mVar.mo43718a(mBInterstitialActivity.f16053e.isMraid() ? C6203m.f15357a : C6203m.f15358b);
            C6305b.m15964a(mVar, mBInterstitialActivity.getApplicationContext(), mBInterstitialActivity.mUnitid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    static /* synthetic */ void m16515k(MBInterstitialActivity mBInterstitialActivity) {
        CampaignEx campaignEx = mBInterstitialActivity.f16053e;
        if (campaignEx != null && campaignEx.isMraid()) {
            mBInterstitialActivity.f16054f.post(new Runnable() {
                public final void run() {
                    C6549a.m16848a().mo44473a(MBInterstitialActivity.this.f16054f, (float) MBInterstitialActivity.this.f16054f.getLeft(), (float) MBInterstitialActivity.this.f16054f.getTop(), (float) MBInterstitialActivity.this.f16054f.getWidth(), (float) MBInterstitialActivity.this.f16054f.getHeight());
                    C6549a.m16848a().mo44478b(MBInterstitialActivity.this.f16054f, (float) MBInterstitialActivity.this.f16054f.getLeft(), (float) MBInterstitialActivity.this.f16054f.getTop(), (float) MBInterstitialActivity.this.f16054f.getWidth(), (float) MBInterstitialActivity.this.f16054f.getHeight());
                }
            });
        }
    }
}
