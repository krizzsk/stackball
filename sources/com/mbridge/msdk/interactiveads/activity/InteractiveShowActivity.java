package com.mbridge.msdk.interactiveads.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6194d;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.p164db.C6143d;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6150h;
import com.mbridge.msdk.foundation.p164db.C6158p;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.same.report.C6305b;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.interactiveads.p184a.C6386a;
import com.mbridge.msdk.interactiveads.p184a.C6396b;
import com.mbridge.msdk.interactiveads.p184a.C6397c;
import com.mbridge.msdk.interactiveads.p185b.C6407a;
import com.mbridge.msdk.interactiveads.p186c.C6408a;
import com.mbridge.msdk.interactiveads.p187d.C6410a;
import com.mbridge.msdk.interactiveads.p187d.C6411b;
import com.mbridge.msdk.interactiveads.p187d.C6412c;
import com.mbridge.msdk.interactiveads.p187d.C6413d;
import com.mbridge.msdk.interactiveads.signalcommon.C6422a;
import com.mbridge.msdk.interactiveads.view.MBLoadingDialog;
import com.mbridge.msdk.mbsignalcommon.windvane.C6560d;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import com.mbridge.msdk.videocommon.C7165a;
import com.mbridge.msdk.videocommon.download.C7191g;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import com.mbridge.msdk.widget.dialog.C7218a;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class InteractiveShowActivity extends MBBaseActivity implements C6410a {
    public static final int SHOW_INIT = 0;
    public static final int SHOW_NOT_ZIP = 1;
    public static String TAG = "InteractiveShowActivity";
    public static C6411b interactiveStatusListener = null;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static long f15908p = 30000;

    /* renamed from: a */
    FrameLayout f15909a;

    /* renamed from: b */
    FrameLayout.LayoutParams f15910b;

    /* renamed from: c */
    CampaignEx f15911c;

    /* renamed from: d */
    WindVaneWebView f15912d;

    /* renamed from: e */
    View f15913e;

    /* renamed from: f */
    ImageView f15914f;

    /* renamed from: g */
    Handler f15915g = new Handler() {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                InteractiveShowActivity.this.init();
            } else if (i == 1) {
                List list = (List) message.obj;
                InteractiveShowActivity.this.interactiveAdsAdapter.mo44005a(list, ((CampaignEx) list.get(0)).getKeyIaUrl(), true, true);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f15916h = "";

    /* renamed from: i */
    private String f15917i = "";
    public C6386a interactiveAdsAdapter;
    public boolean isADShowing = false;

    /* renamed from: j */
    private MBLoadingDialog f15918j;

    /* renamed from: k */
    private C6412c f15919k;

    /* renamed from: l */
    private MBAlertDialog f15920l;

    /* renamed from: m */
    private C7218a f15921m;

    /* renamed from: n */
    private boolean f15922n = false;

    /* renamed from: o */
    private List<CampaignEx> f15923o = new ArrayList(10);

    /* renamed from: q */
    private CountDownTimer f15924q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f15925r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f15926s = false;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f15927t = false;

    /* renamed from: u */
    private CountDownTimer f15928u = null;

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m16323b() {
        CountDownTimer countDownTimer = this.f15928u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f15928u = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m16328c() {
        CountDownTimer countDownTimer = this.f15924q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f15924q = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6407a.f15947f.put(TAG, this);
        this.f15911c = (CampaignEx) getIntent().getSerializableExtra("campaign");
        this.f15916h = getIntent().getStringExtra("unitId");
        String stringExtra = getIntent().getStringExtra(MBridgeConstans.PLACEMENT_ID);
        this.f15917i = stringExtra;
        if (this.interactiveAdsAdapter == null) {
            this.interactiveAdsAdapter = new C6386a(this, this.f15916h, stringExtra);
        }
        this.interactiveAdsAdapter.mo44000a((C6410a) this);
        C6407a.f15946e = true;
        this.f15909a = new FrameLayout(this);
        this.f15910b = new FrameLayout.LayoutParams(-1, -1);
        this.f15909a.setBackgroundColor(-1);
        setContentView(this.f15909a);
        String e = C6122a.m15302b().mo42896e();
        if (this.f15916h == null) {
            this.f15916h = C6121a.m15293a().mo42882b("interactive_unitid");
        }
        C6086d e2 = C6076b.m15089a().mo42755e(e, this.f15916h);
        if (e2 != null) {
            f15908p = (long) (e2.mo42786l() * 1000);
        }
        View inflate = LayoutInflater.from(this).inflate(C6347k.m16084a(this, "mbridge_close_imageview_layout", "layout"), (ViewGroup) null);
        this.f15913e = inflate;
        if (inflate != null) {
            this.f15914f = (ImageView) inflate.findViewById(C6347k.m16084a(this, "mbridge_close_imageview", "id"));
        }
        ImageView imageView = this.f15914f;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (InteractiveShowActivity.interactiveStatusListener != null) {
                        InteractiveShowActivity.interactiveStatusListener.mo44085f();
                    }
                    InteractiveShowActivity.this.onInteractivePlayingComplete(true);
                    if (InteractiveShowActivity.this.isADShowing) {
                        InteractiveShowActivity.this.tryReportADTrackingImpression();
                    }
                    InteractiveShowActivity.this.tryReportPlayableClosed();
                    InteractiveShowActivity.this.finish();
                }
            });
        }
        showLoadingDialog();
        CountDownTimer countDownTimer = this.f15924q;
        if (countDownTimer == null) {
            this.f15925r = false;
            this.f15927t = false;
            C7179c a = C7177b.m18135a().mo49107a(C6122a.m15302b().mo42896e(), this.f15916h);
            if (a != null && a.mo49146m() > 0) {
                long m = (long) (a.mo49146m() * 1000);
                if (m < f15908p) {
                    f15908p = m;
                    this.f15927t = true;
                }
            }
            this.f15924q = new CountDownTimer(f15908p, TapjoyConstants.TIMER_INCREMENT) {
                public final void onTick(long j) {
                }

                public final void onFinish() {
                    if (InteractiveShowActivity.interactiveStatusListener != null) {
                        InteractiveShowActivity.interactiveStatusListener.mo44081c("showing is timeout");
                        InteractiveShowActivity interactiveShowActivity = InteractiveShowActivity.this;
                        new C6406a(interactiveShowActivity.f15911c, false, InteractiveShowActivity.this, "failed").start();
                    }
                    boolean unused = InteractiveShowActivity.this.f15925r = true;
                    InteractiveShowActivity.this.init();
                    if (InteractiveShowActivity.this.f15911c != null) {
                        C6203m mVar = new C6203m();
                        mVar.mo43741k(InteractiveShowActivity.this.f15911c.getRequestId());
                        mVar.mo43743l(InteractiveShowActivity.this.f15911c.getRequestIdNotice());
                        mVar.mo43747n(InteractiveShowActivity.this.f15911c.getId());
                        if (InteractiveShowActivity.this.f15927t) {
                            mVar.mo43724c(2);
                        } else {
                            mVar.mo43724c(3);
                        }
                        mVar.mo43753q(String.valueOf(InteractiveShowActivity.f15908p));
                        mVar.mo43731f(InteractiveShowActivity.this.f15911c.getKeyIaUrl());
                        mVar.mo43733g((!C6369x.m16236b(InteractiveShowActivity.this.f15911c.getKeyIaUrl()) || !InteractiveShowActivity.this.f15911c.getKeyIaUrl().contains(".zip")) ? "2" : "1");
                        mVar.mo43751p("time out");
                        mVar.mo43719a(String.valueOf(InteractiveShowActivity.this.f15911c.getKeyIaRst()));
                        mVar.mo43735h("4");
                        mVar.mo43718a(InteractiveShowActivity.this.f15911c.isMraid() ? C6203m.f15357a : C6203m.f15358b);
                        C6305b.m15969b(mVar, InteractiveShowActivity.this.f15916h);
                    }
                }
            }.start();
        } else {
            countDownTimer.cancel();
            this.f15924q.start();
        }
        this.f15916h = getIntent().getStringExtra("unitId");
        new Thread(new Runnable() {
            public final void run() {
                List<CampaignEx> a = C6396b.m16300a((Context) InteractiveShowActivity.this).mo44024a(InteractiveShowActivity.this.f15916h);
                List<CampaignEx> b = C6396b.m16300a((Context) InteractiveShowActivity.this).mo44026b(InteractiveShowActivity.this.f15916h);
                if (a == null || a.size() <= 0) {
                    if (b == null || b.size() <= 0 || !InteractiveShowActivity.m16321a(InteractiveShowActivity.this, (List) b)) {
                        InteractiveShowActivity.this.f15915g.sendEmptyMessage(0);
                    } else if (C6396b.m16300a((Context) InteractiveShowActivity.this).mo44025a(b)) {
                        InteractiveShowActivity.this.f15911c = b.get(0);
                        if (b.get(0).getKeyIaUrl().contains("zip")) {
                            InteractiveShowActivity.this.interactiveAdsAdapter.mo44004a(b, b.get(0).getKeyIaUrl(), InteractiveShowActivity.this.f15916h, (C6086d) null, true);
                        } else if (!C6407a.f15945d) {
                            Message obtain = Message.obtain();
                            obtain.obj = b;
                            obtain.what = 1;
                            InteractiveShowActivity.this.f15915g.sendMessage(obtain);
                        }
                    }
                } else if (InteractiveShowActivity.m16321a(InteractiveShowActivity.this, (List) a) && C6396b.m16300a((Context) InteractiveShowActivity.this).mo44025a(a)) {
                    InteractiveShowActivity.this.f15911c = a.get(0);
                    if (a.get(0).getKeyIaUrl().contains("zip")) {
                        InteractiveShowActivity.this.interactiveAdsAdapter.mo44004a(a, a.get(0).getKeyIaUrl(), InteractiveShowActivity.this.f15916h, (C6086d) null, true);
                    } else if (!C6407a.f15945d) {
                        Message obtain2 = Message.obtain();
                        obtain2.obj = a;
                        obtain2.what = 1;
                        InteractiveShowActivity.this.f15915g.sendMessage(obtain2);
                    }
                }
            }
        }).start();
        C6122a.m15302b().mo42885a(288);
    }

    public void setCloseButtonVisible(boolean z) {
        View view = this.f15913e;
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
    }

    public void tryReportADTrackingImpression() {
        try {
            if (this.f15911c != null && this.f15911c.getKeyIaRst() == 2 && this.f15923o != null && this.f15923o.size() > 0) {
                for (CampaignEx reportADTrackingImpression : this.f15923o) {
                    reportADTrackingImpression(C6122a.m15302b().mo42895d(), reportADTrackingImpression, this.f15916h);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reportADTrackingImpression(Context context, CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo43680k() != null) {
                    for (String str2 : campaignEx.getNativeVideoTracking().mo43680k()) {
                        if (!TextUtils.isEmpty(str2)) {
                            C6097a.m15185a(context, campaignEx, str, str2, false, false);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void reportADTrackingClick(Context context, CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo43672g() != null) {
                    for (String str2 : campaignEx.getNativeVideoTracking().mo43672g()) {
                        if (!TextUtils.isEmpty(str2)) {
                            C6097a.m15185a(context, campaignEx, str, str2, false, false);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void tryReportPlayableClosed() {
        CampaignEx campaignEx;
        if (this.f15922n && (campaignEx = this.f15911c) != null && campaignEx.getKeyIaRst() == 1) {
            C6203m mVar = new C6203m("2000061", this.f15911c.getId(), this.f15911c.getRequestId(), this.f15911c.getRequestIdNotice(), this.f15916h, C6349m.m16123n(C6122a.m15302b().mo42895d()));
            mVar.mo43718a(this.f15911c.isMraid() ? C6203m.f15357a : C6203m.f15358b);
            C6305b.m15968b(mVar, this, this.f15916h);
        }
    }

    public void reportPlayableExp(CampaignEx campaignEx, int i, String str) {
        if (campaignEx != null && campaignEx.getKeyIaRst() == 1) {
            C6305b.m15970c(new C6203m("2000062", campaignEx.getId(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), this.f15916h, C6349m.m16123n(C6122a.m15302b().mo42895d()), i, str), this, this.f15916h);
        }
    }

    /* access modifiers changed from: protected */
    public void init() {
        try {
            if (this.f15911c != null) {
                this.f15912d = m16315a(this.f15911c);
                String keyIaUrl = this.f15911c.getKeyIaUrl();
                boolean z = !TextUtils.isEmpty(keyIaUrl) && keyIaUrl.contains("forcevert=1") && Build.VERSION.SDK_INT < 14;
                boolean z2 = !TextUtils.isEmpty(keyIaUrl) && keyIaUrl.contains("anpad=1") && C6349m.m16125o(this);
                if (z || z2) {
                    setRequestedOrientation(1);
                }
                if (this.f15911c.getKeyIaOri() == 2) {
                    setRequestedOrientation(0);
                } else if (this.f15911c.getKeyIaOri() == 1) {
                    setRequestedOrientation(1);
                }
            }
            String e = C6122a.m15302b().mo42896e();
            if (this.f15916h == null) {
                this.f15916h = C6121a.m15293a().mo42882b("interactive_unitid");
            }
            C6086d e2 = C6076b.m15089a().mo42755e(e, this.f15916h);
            this.f15922n = false;
            if (this.f15912d == null || this.f15925r) {
                this.f15922n = false;
                if (e2 == null || TextUtils.isEmpty(e2.mo42778e())) {
                    if (!C6407a.f15944c) {
                        dismissLoadingDialog();
                        m16329d();
                        m16320a(true, true);
                        if (interactiveStatusListener != null && !this.f15925r) {
                            interactiveStatusListener.mo44081c("failed:no init data");
                            new C6406a(this.f15911c, false, this, "failed").start();
                            m16328c();
                        }
                    }
                    reportPlayableExp(this.f15911c, 3, "webview null, unitSetting or noAdsUrl null");
                } else {
                    this.f15926s = false;
                    if (this.f15928u == null) {
                        this.f15928u = new CountDownTimer(30000, TapjoyConstants.TIMER_INCREMENT) {
                            public final void onTick(long j) {
                            }

                            public final void onFinish() {
                                boolean unused = InteractiveShowActivity.this.f15926s = true;
                                InteractiveShowActivity.this.dismissLoadingDialog();
                                InteractiveShowActivity.this.m16329d();
                                InteractiveShowActivity.this.m16320a(true, true);
                            }
                        }.start();
                    } else {
                        this.f15928u.cancel();
                        this.f15928u.start();
                    }
                    if (!C6407a.f15944c) {
                        this.f15912d = new WindVaneWebView(this);
                        this.f15909a.removeAllViews();
                        this.f15909a.addView(this.f15912d, this.f15910b);
                        this.f15909a.addView(this.f15913e);
                        C6422a aVar = new C6422a(this, (List<CampaignEx>) null);
                        aVar.mo44120a((Activity) this);
                        this.f15912d.setObject(aVar);
                        this.f15912d.loadUrl(e2.mo42778e());
                        this.f15912d.setWebViewListener(new C6560d() {
                            /* renamed from: a */
                            public final void mo44060a(WebView webView, String str, Bitmap bitmap) {
                            }

                            /* renamed from: b */
                            public final void mo44061b(WebView webView, int i) {
                            }

                            /* renamed from: b */
                            public final boolean mo44062b(WebView webView, String str) {
                                return false;
                            }

                            /* renamed from: c */
                            public final void mo44063c(WebView webView, int i) {
                            }

                            /* renamed from: a */
                            public final void mo44021a(WebView webView, int i, String str, String str2) {
                                InteractiveShowActivity.this.m16323b();
                                InteractiveShowActivity.this.m16328c();
                                InteractiveShowActivity.this.dismissLoadingDialog();
                                InteractiveShowActivity.this.f15909a.removeAllViews();
                                InteractiveShowActivity.this.m16329d();
                                InteractiveShowActivity.this.m16320a(true, true);
                                if (InteractiveShowActivity.interactiveStatusListener != null && !InteractiveShowActivity.this.f15925r) {
                                    InteractiveShowActivity.interactiveStatusListener.mo44081c("show failed");
                                }
                            }

                            /* renamed from: a */
                            public final void mo44022a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                                InteractiveShowActivity.this.m16323b();
                                InteractiveShowActivity.this.m16328c();
                                InteractiveShowActivity.this.dismissLoadingDialog();
                                InteractiveShowActivity.this.f15909a.removeAllViews();
                                InteractiveShowActivity.this.m16329d();
                                InteractiveShowActivity.this.m16320a(true, true);
                                if (InteractiveShowActivity.interactiveStatusListener != null && !InteractiveShowActivity.this.f15925r) {
                                    InteractiveShowActivity.interactiveStatusListener.mo44081c("show failed");
                                }
                            }

                            /* renamed from: a */
                            public final void mo44023a(WebView webView, String str) {
                                if (!InteractiveShowActivity.this.f15926s) {
                                    InteractiveShowActivity interactiveShowActivity = InteractiveShowActivity.this;
                                    interactiveShowActivity.m16319a(interactiveShowActivity.f15912d);
                                }
                            }

                            /* renamed from: a */
                            public final void mo44020a(WebView webView, int i) {
                                if (i == 1) {
                                    InteractiveShowActivity.this.m16323b();
                                    InteractiveShowActivity.this.dismissLoadingDialog();
                                }
                            }
                        });
                        reportPlayableExp(this.f15911c, 3, "webview null, load noAdsUrl");
                    }
                }
            } else {
                dismissLoadingDialog();
                Object object = this.f15912d.getObject();
                if (object != null && (object instanceof C6422a)) {
                    C6422a aVar2 = (C6422a) object;
                    aVar2.mo44120a((Activity) this);
                    this.f15912d.setObject(aVar2);
                }
                this.f15909a.removeAllViews();
                this.f15909a.addView(this.f15912d, this.f15910b);
                this.f15909a.addView(this.f15913e);
                m16319a(this.f15912d);
                this.f15922n = true;
                C6397c.m16305a((Context) this);
                C6121a.m15293a().mo42880a(C6407a.f15942a, String.valueOf(0));
                C6121a.m15293a().mo42880a(C6407a.f15943b, String.valueOf(0));
                if (this.f15911c != null) {
                    String impressionURL = this.f15911c.getImpressionURL();
                    if (this.f15911c.getKeyIaRst() == 1 && !TextUtils.isEmpty(impressionURL)) {
                        C6097a.m15185a(C6122a.m15302b().mo42895d(), this.f15911c, this.f15916h, impressionURL, false, true);
                        if (!TextUtils.isEmpty(this.f15911c.getOnlyImpressionURL())) {
                            C6097a.m15185a(C6122a.m15302b().mo42895d(), this.f15911c, this.f15916h, this.f15911c.getOnlyImpressionURL(), false, true);
                        }
                        List<String> pv_urls = this.f15911c.getPv_urls();
                        if (pv_urls != null && pv_urls.size() > 0) {
                            for (String a : pv_urls) {
                                C6097a.m15185a(C6122a.m15302b().mo42895d(), this.f15911c, this.f15916h, a, false, true);
                            }
                        }
                    }
                    if (this.f15911c.getKeyIaRst() == 1) {
                        reportADTrackingImpression(C6122a.m15302b().mo42895d(), this.f15911c, this.f15916h);
                    }
                }
                if (interactiveStatusListener != null) {
                    interactiveStatusListener.mo44084e();
                    new C6406a(this.f15911c, true, this, "").start();
                }
            }
            if (this.f15911c != null) {
                C6103b.m15225a((Context) this, this.f15911c.getMaitve(), this.f15911c.getMaitve_src());
            }
        } catch (Throwable th) {
            this.f15922n = false;
            reportPlayableExp(this.f15911c, 3, th.getMessage());
            th.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16320a(boolean z, boolean z2) {
        if (z) {
            this.f15909a.removeView(this.f15913e);
        }
        this.f15909a.addView(this.f15913e);
        setCloseButtonVisible(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m16329d() {
        TextView textView = new TextView(this);
        textView.setText("Check your connection,and try again.");
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        this.f15909a.addView(textView, this.f15910b);
    }

    public void webviewLoadMore(int i, JSONArray jSONArray, C6413d dVar) {
        C6411b bVar = interactiveStatusListener;
        if (bVar != null) {
            bVar.mo44071a(i, jSONArray, dVar);
        }
    }

    /* renamed from: a */
    private WindVaneWebView m16315a(CampaignEx campaignEx) {
        try {
            C7165a.C7166a a = C7165a.m18054a(288, campaignEx);
            if (a == null || !a.mo49059c()) {
                return null;
            }
            C7165a.m18061b(288, campaignEx);
            return a.mo49054a();
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16319a(WindVaneWebView windVaneWebView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adtype", "Interactive");
            C6563g.m16891a().mo44522a((WebView) windVaneWebView, "webviewshow", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            if (this.f15911c != null) {
                C6203m mVar = new C6203m();
                mVar.mo43741k(this.f15911c.getRequestId());
                mVar.mo43743l(this.f15911c.getRequestIdNotice());
                mVar.mo43747n(this.f15911c.getId());
                mVar.mo43718a(this.f15911c.isMraid() ? C6203m.f15357a : C6203m.f15358b);
                C6305b.m15964a(mVar, getApplicationContext(), this.f15916h);
            }
        } catch (Exception e) {
            reportPlayableExp(this.f15911c, 3, e.getMessage());
            C6361q.m16158d(TAG, e.getMessage());
        }
    }

    public void onInteractivePlayingComplete(boolean z) {
        C6411b bVar;
        CampaignEx campaignEx = this.f15911c;
        if (!(campaignEx == null || campaignEx.getKeyIaRst() != 1 || (bVar = interactiveStatusListener) == null)) {
            bVar.mo44075a(z);
        }
        try {
            if (this.f15911c != null && this.f15911c.getKeyIaRst() == 1) {
                int i = 0;
                if (z) {
                    Context d = C6122a.m15302b().mo42895d();
                    CampaignEx campaignEx2 = this.f15911c;
                    String str = this.f15916h;
                    if (campaignEx2 != null) {
                        try {
                            if (campaignEx2.getNativeVideoTracking() != null && campaignEx2.getNativeVideoTracking().mo43662b() != null) {
                                String[] b = campaignEx2.getNativeVideoTracking().mo43662b();
                                int length = b.length;
                                while (i < length) {
                                    String str2 = b[i];
                                    if (!TextUtils.isEmpty(str2)) {
                                        C6097a.m15185a(d, campaignEx2, str, str2, false, false);
                                    }
                                    i++;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    Context d2 = C6122a.m15302b().mo42895d();
                    CampaignEx campaignEx3 = this.f15911c;
                    String str3 = this.f15916h;
                    if (campaignEx3 != null) {
                        try {
                            if (campaignEx3.getNativeVideoTracking() != null && campaignEx3.getNativeVideoTracking().mo43660a() != null) {
                                String[] a = campaignEx3.getNativeVideoTracking().mo43660a();
                                int length2 = a.length;
                                while (i < length2) {
                                    String str4 = a[i];
                                    if (!TextUtils.isEmpty(str4)) {
                                        C6097a.m15185a(d2, campaignEx3, str3, str4, false, false);
                                    }
                                    i++;
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public void showAlertView() {
        if (this.f15921m == null) {
            this.f15921m = new C7218a() {
                /* renamed from: a */
                public final void mo44064a() {
                    if (InteractiveShowActivity.this.f15912d != null) {
                        InteractiveShowActivity interactiveShowActivity = InteractiveShowActivity.this;
                        InteractiveShowActivity.m16324b(interactiveShowActivity, interactiveShowActivity.f15912d);
                    }
                }

                /* renamed from: b */
                public final void mo44065b() {
                    InteractiveShowActivity.this.onInteractivePlayingComplete(false);
                    if (InteractiveShowActivity.interactiveStatusListener != null) {
                        InteractiveShowActivity.interactiveStatusListener.mo44085f();
                    }
                    InteractiveShowActivity.this.tryReportADTrackingImpression();
                    InteractiveShowActivity.this.tryReportPlayableClosed();
                    InteractiveShowActivity.this.finish();
                }
            };
        }
        if (this.f15920l == null) {
            this.f15920l = new MBAlertDialog(this, this.f15921m);
        }
        this.f15920l.makePlayableAlertView();
        this.f15920l.show();
    }

    public void finish() {
        super.finish();
        C6122a.m15302b().mo42885a(0);
        C6407a.f15946e = false;
        this.interactiveAdsAdapter = null;
        C6408a.f15950f = false;
        C6407a.f15947f.clear();
        C7165a.m18057a(288);
        try {
            if (!(this.f15909a == null || this.f15912d == null)) {
                this.f15909a.removeView(this.f15912d);
                this.f15912d.removeViewInLayout(this.f15909a);
                if (this.f15913e != null) {
                    this.f15909a.removeView(this.f15913e);
                }
            }
            if (this.f15918j != null) {
                this.f15918j = null;
            }
            if (this.f15919k != null) {
                this.f15919k = null;
            }
            C6397c.m16305a((Context) this).mo44029a(false);
            if (this.f15920l != null) {
                this.f15920l.clear();
                this.f15920l = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        m16328c();
        m16323b();
    }

    public void sendImpressions(JSONArray jSONArray) {
        List<CampaignEx> a = C6143d.m15367a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d())).mo42957a(jSONArray, this.f15916h);
        if (a != null && a.size() > 0) {
            for (CampaignEx next : a) {
                String impressionURL = next.getImpressionURL();
                if (!TextUtils.isEmpty(impressionURL)) {
                    C6097a.m15185a(C6122a.m15302b().mo42895d(), next, this.f15916h, impressionURL, false, true);
                }
                C6208d.m15703a(this.f15916h, next, "interactive");
            }
        }
        this.f15923o.clear();
        this.f15923o.addAll(a);
    }

    public void click(int i, CampaignEx campaignEx) {
        if (campaignEx != null) {
            new C6097a(C6122a.m15302b().mo42895d(), this.f15916h).mo42838a(campaignEx);
            reportADTrackingClick(C6122a.m15302b().mo42895d(), campaignEx, this.f15916h);
            C6411b bVar = interactiveStatusListener;
            if (bVar != null) {
                bVar.mo44086g();
            }
            C6150h.m15433a((C6146e) C6148f.m15420a((Context) this)).mo43009a(new C6194d(Long.parseLong(campaignEx.getId()), Long.valueOf(System.currentTimeMillis()).longValue(), campaignEx.getKeyIaRst(), 1));
        }
    }

    public void handlerPlayableException(String str) {
        C6411b bVar = interactiveStatusListener;
        if (bVar != null) {
            bVar.mo44081c("Playable Render Exception");
            new C6406a(this.f15911c, false, this, "failed").start();
        }
        if (!this.f15925r) {
            this.f15925r = true;
            init();
            if (this.f15911c != null) {
                C6203m mVar = new C6203m();
                mVar.mo43741k(this.f15911c.getRequestId());
                mVar.mo43743l(this.f15911c.getRequestIdNotice());
                mVar.mo43747n(this.f15911c.getId());
                mVar.mo43751p(str);
                C6305b.m15971d(mVar, getApplicationContext(), this.f15916h);
            }
        }
    }

    public void clickPlayer(CampaignEx campaignEx) {
        if (campaignEx != null || this.f15911c != null) {
            new C6097a(C6122a.m15302b().mo42895d(), this.f15916h).mo42838a(campaignEx == null ? this.f15911c : campaignEx);
            Context d = C6122a.m15302b().mo42895d();
            if (campaignEx == null) {
                campaignEx = this.f15911c;
            }
            reportADTrackingClick(d, campaignEx, this.f15916h);
            C6411b bVar = interactiveStatusListener;
            if (bVar != null) {
                bVar.mo44086g();
            }
            C6150h.m15433a((C6146e) C6148f.m15420a((Context) this)).mo43009a(new C6194d(Long.parseLong(this.f15911c.getId()), Long.valueOf(System.currentTimeMillis()).longValue(), this.f15911c.getKeyIaRst(), 1));
        }
    }

    public void showLoadingDialog() {
        if (this.f15919k == null) {
            this.f15919k = new C6412c() {
                /* renamed from: a */
                public final void mo44066a() {
                    if (InteractiveShowActivity.interactiveStatusListener != null) {
                        InteractiveShowActivity.interactiveStatusListener.mo44081c("closed user cancel");
                        InteractiveShowActivity interactiveShowActivity = InteractiveShowActivity.this;
                        new C6406a(interactiveShowActivity.f15911c, false, InteractiveShowActivity.this, "failed").start();
                        InteractiveShowActivity.interactiveStatusListener.mo44085f();
                    }
                    InteractiveShowActivity.this.finish();
                }
            };
        }
        if (this.f15918j == null) {
            this.f15918j = new MBLoadingDialog(this, this.f15919k);
        }
        this.f15918j.show();
    }

    public void dismissLoadingDialog() {
        MBLoadingDialog mBLoadingDialog = this.f15918j;
        if (mBLoadingDialog != null && mBLoadingDialog.isShowing()) {
            this.f15918j.dismiss();
            this.f15919k = null;
        }
    }

    public void interactiveAdsMateriaShowSuccessful(CampaignEx campaignEx, boolean z) {
        CampaignEx campaignEx2;
        C6408a.f15950f = false;
        this.f15911c = campaignEx;
        C6407a.f15947f.clear();
        if (interactiveStatusListener != null && (campaignEx2 = this.f15911c) != null && !TextUtils.isEmpty(campaignEx2.getInteractiveCache()) && this.f15911c.getInteractiveCache().equals("onelevel") && !z) {
            interactiveStatusListener.mo44073a(campaignEx);
        }
        if (!this.f15925r) {
            m16328c();
            init();
        }
    }

    /* renamed from: com.mbridge.msdk.interactiveads.activity.InteractiveShowActivity$a */
    class C6406a extends Thread {

        /* renamed from: b */
        private CampaignEx f15938b;

        /* renamed from: c */
        private boolean f15939c;

        /* renamed from: d */
        private Context f15940d;

        /* renamed from: e */
        private String f15941e;

        public C6406a(CampaignEx campaignEx, boolean z, Context context, String str) {
            this.f15938b = campaignEx;
            this.f15939c = z;
            this.f15940d = context;
            this.f15941e = str;
        }

        public final void run() {
            super.run();
            if (this.f15938b != null) {
                try {
                    C6203m mVar = new C6203m();
                    mVar.mo43749o("2000054");
                    mVar.mo43719a(String.valueOf(this.f15938b.getKeyIaRst()));
                    mVar.mo43745m(InteractiveShowActivity.this.f15916h);
                    mVar.mo43722b(C6349m.m16113i());
                    mVar.mo43735h("4");
                    mVar.mo43747n(this.f15938b.getId());
                    mVar.mo43741k(this.f15938b.getRequestId());
                    mVar.mo43743l(this.f15938b.getRequestIdNotice());
                    mVar.mo43724c(this.f15939c ? 1 : 2);
                    mVar.mo43751p(this.f15939c ? "" : this.f15941e);
                    mVar.mo43721b(C6349m.m16123n(InteractiveShowActivity.this));
                    mVar.mo43725c(this.f15938b.getKeyIaUrl());
                    C6158p.m15475a((C6146e) C6148f.m15420a(this.f15940d)).mo43039a(mVar);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) {
        if (i2 <= 0) {
            i2 = 12;
        }
        if (i3 <= 0) {
            i3 = 12;
        }
        if (i4 <= 0) {
            i4 = 12;
        }
        if (i5 <= 0) {
            i5 = 12;
        }
        this.f15913e.setPadding(i2, i4, i3, i5);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m16321a(InteractiveShowActivity interactiveShowActivity, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CampaignEx campaignEx = (CampaignEx) it.next();
            if (campaignEx.getIsDownLoadZip() == 1) {
                if (TextUtils.isEmpty(C7191g.m18286a().mo49220b(campaignEx.getKeyIaUrl()))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    static /* synthetic */ void m16324b(InteractiveShowActivity interactiveShowActivity, WindVaneWebView windVaneWebView) {
        try {
            C6563g.m16891a().mo44522a((WebView) windVaneWebView, "continuePlay", "");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
