package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.report.C6305b;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.mbsignalcommon.mraid.C6549a;
import com.mbridge.msdk.mbsignalcommon.mraid.C6551b;
import com.mbridge.msdk.mbsignalcommon.mraid.C6553d;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.video.signal.C7159g;
import com.mbridge.msdk.videocommon.download.C7191g;
import com.p243my.target.ads.Reward;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class MBridgeH5EndCardView extends MBridgeBaseView implements C6551b, C7159g {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f17332A = 1;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f17333B = 0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f17334C = false;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f17335D = false;

    /* renamed from: E */
    private boolean f17336E = false;

    /* renamed from: F */
    private boolean f17337F = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f17338G = false;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f17339H = false;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f17340I = false;

    /* renamed from: J */
    private boolean f17341J = false;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public String f17342K = "";

    /* renamed from: L */
    private boolean f17343L = false;

    /* renamed from: M */
    private boolean f17344M = false;

    /* renamed from: j */
    protected View f17345j;

    /* renamed from: k */
    protected RelativeLayout f17346k;

    /* renamed from: l */
    protected ImageView f17347l;

    /* renamed from: m */
    protected WindVaneWebView f17348m;

    /* renamed from: n */
    protected Handler f17349n = new Handler();

    /* renamed from: o */
    protected String f17350o;

    /* renamed from: p */
    protected boolean f17351p = false;

    /* renamed from: q */
    protected boolean f17352q = false;

    /* renamed from: r */
    protected String f17353r;

    /* renamed from: s */
    Handler f17354s = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                if (MBridgeH5EndCardView.this.f17334C) {
                    MBridgeH5EndCardView.this.f17278e.mo48315a(122, "");
                }
                MBridgeH5EndCardView.this.f17278e.mo48315a(103, "");
            }
        }
    };

    /* renamed from: t */
    boolean f17355t = false;

    /* renamed from: u */
    private boolean f17356u = false;

    /* renamed from: v */
    private boolean f17357v = false;

    /* renamed from: w */
    private int f17358w = 1;

    /* renamed from: x */
    private int f17359x = 1;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f17360y = false;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f17361z = false;

    public void expand(String str, boolean z) {
    }

    public void install(CampaignEx campaignEx) {
    }

    public void readyStatus(int i) {
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_h5");
        if (findLayout >= 0) {
            View inflate = this.f17276c.inflate(findLayout, (ViewGroup) null);
            this.f17345j = inflate;
            this.f17347l = (ImageView) inflate.findViewById(findID("mbridge_windwv_close"));
            this.f17346k = (RelativeLayout) inflate.findViewById(findID("mbridge_windwv_content_rl"));
            this.f17348m = new WindVaneWebView(getContext());
            this.f17348m.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f17346k.addView(this.f17348m);
            this.f17279f = isNotNULL(this.f17347l, this.f17348m);
            addView(this.f17345j, mo48574b());
            mo48578c();
            mo48605e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48578c() {
        super.mo48578c();
        if (this.f17279f) {
            this.f17347l.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBridgeH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f17348m != null) {
                C6563g.m16891a().mo44522a((WebView) this.f17348m, "onSystemDestory", "");
                new Thread(new C6998a(this)).start();
                return;
            }
            this.f17278e.mo48315a(103, "");
            this.f17278e.mo48315a(119, "webview is null when closing webview");
        } catch (Exception e) {
            this.f17278e.mo48315a(103, "");
            C7027a aVar = this.f17278e;
            aVar.mo48315a(119, "close webview exception" + e.getMessage());
            C6361q.m16154a(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$a */
    private class C6998a implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f17367b;

        public C6998a(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f17367b = mBridgeH5EndCardView;
        }

        public final void run() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                C6361q.m16158d("CloseRunnable", e.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f17367b;
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f17354s != null) {
                this.f17367b.f17354s.sendEmptyMessage(100);
            }
        }
    }

    public void setError(boolean z) {
        this.f17352q = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0 A[Catch:{ all -> 0x00f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4 A[Catch:{ all -> 0x00f8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void preLoadData(com.mbridge.msdk.video.signal.factory.C7158b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "wfr=1"
            java.lang.String r1 = "="
            java.lang.String r3 = r9.mo48573a()
            boolean r2 = r9.f17279f
            r8 = 0
            if (r2 == 0) goto L_0x013f
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r9.f17275b
            if (r2 == 0) goto L_0x013f
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x013f
            com.mbridge.msdk.foundation.webview.BrowserView$MBDownloadListener r2 = new com.mbridge.msdk.foundation.webview.BrowserView$MBDownloadListener
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r9.f17275b
            r2.<init>(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r9.f17275b
            java.lang.String r4 = r4.getAppName()
            r2.setTitle(r4)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r4 = r9.f17348m
            r4.setDownloadListener(r2)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f17348m
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r9.f17275b
            java.lang.String r4 = r4.getId()
            r2.setCampaignId(r4)
            r2 = 8
            r9.setCloseVisible(r2)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f17348m
            r2.setApiManagerJSFactory(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f17275b
            boolean r10 = r10.isMraid()
            if (r10 == 0) goto L_0x004e
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r10 = r9.f17348m
            r10.setMraidObject(r9)
        L_0x004e:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r10 = r9.f17348m
            com.mbridge.msdk.video.module.MBridgeH5EndCardView$3 r2 = new com.mbridge.msdk.video.module.MBridgeH5EndCardView$3
            r2.<init>()
            r10.setWebViewListener(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f17275b
            java.lang.String r10 = r10.getMraid()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r2 = "MBridgeBaseView"
            if (r10 == 0) goto L_0x0100
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f8 }
            r9.f17333B = r4     // Catch:{ all -> 0x00f8 }
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f17275b     // Catch:{ all -> 0x00f8 }
            java.lang.String r10 = r10.getendcard_url()     // Catch:{ all -> 0x00f8 }
            com.mbridge.msdk.videocommon.d.b r4 = com.mbridge.msdk.videocommon.p239d.C7177b.m18135a()     // Catch:{ all -> 0x00f8 }
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x00f8 }
            java.lang.String r5 = r5.mo42896e()     // Catch:{ all -> 0x00f8 }
            java.lang.String r6 = r9.f17353r     // Catch:{ all -> 0x00f8 }
            com.mbridge.msdk.videocommon.d.c r4 = r4.mo49107a(r5, r6)     // Catch:{ all -> 0x00f8 }
            boolean r5 = r9.f17357v     // Catch:{ all -> 0x00f8 }
            if (r5 == 0) goto L_0x0100
            boolean r5 = com.mbridge.msdk.foundation.tools.C6369x.m16236b(r10)     // Catch:{ all -> 0x00f8 }
            if (r5 == 0) goto L_0x0100
            boolean r5 = r10.contains(r0)     // Catch:{ all -> 0x00f8 }
            if (r5 != 0) goto L_0x009c
            if (r4 == 0) goto L_0x0100
            int r5 = r4.mo49146m()     // Catch:{ all -> 0x00f8 }
            if (r5 <= 0) goto L_0x0100
        L_0x009c:
            boolean r0 = r10.contains(r0)     // Catch:{ all -> 0x00f8 }
            r5 = 20
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "&"
            java.lang.String[] r10 = r10.split(r0)     // Catch:{ all -> 0x00f8 }
            if (r10 == 0) goto L_0x00ec
            int r0 = r10.length     // Catch:{ all -> 0x00f8 }
            if (r0 <= 0) goto L_0x00ec
            int r0 = r10.length     // Catch:{ all -> 0x00f8 }
            r4 = 0
        L_0x00b1:
            if (r4 >= r0) goto L_0x00ec
            r6 = r10[r4]     // Catch:{ all -> 0x00f8 }
            boolean r7 = com.mbridge.msdk.foundation.tools.C6369x.m16236b(r6)     // Catch:{ all -> 0x00f8 }
            if (r7 == 0) goto L_0x00dc
            java.lang.String r7 = "to"
            boolean r7 = r6.contains(r7)     // Catch:{ all -> 0x00f8 }
            if (r7 == 0) goto L_0x00dc
            java.lang.String[] r7 = r6.split(r1)     // Catch:{ all -> 0x00f8 }
            if (r7 == 0) goto L_0x00dc
            java.lang.String[] r7 = r6.split(r1)     // Catch:{ all -> 0x00f8 }
            int r7 = r7.length     // Catch:{ all -> 0x00f8 }
            if (r7 <= 0) goto L_0x00dc
            java.lang.String[] r10 = r6.split(r1)     // Catch:{ all -> 0x00f8 }
            r0 = 1
            r10 = r10[r0]     // Catch:{ all -> 0x00f8 }
            int r10 = com.mbridge.msdk.foundation.tools.C6366u.m16187a((java.lang.Object) r10)     // Catch:{ all -> 0x00f8 }
            goto L_0x00ee
        L_0x00dc:
            int r4 = r4 + 1
            goto L_0x00b1
        L_0x00df:
            if (r4 == 0) goto L_0x00ec
            int r10 = r4.mo49146m()     // Catch:{ all -> 0x00f8 }
            if (r10 <= 0) goto L_0x00ec
            int r10 = r4.mo49146m()     // Catch:{ all -> 0x00f8 }
            goto L_0x00ee
        L_0x00ec:
            r10 = 20
        L_0x00ee:
            if (r10 < 0) goto L_0x00f4
            r9.excuteEndCardShowTask(r10)     // Catch:{ all -> 0x00f8 }
            goto L_0x0100
        L_0x00f4:
            r9.excuteEndCardShowTask(r5)     // Catch:{ all -> 0x00f8 }
            goto L_0x0100
        L_0x00f8:
            r10 = move-exception
            java.lang.String r0 = r10.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r2, r0, r10)
        L_0x0100:
            com.mbridge.msdk.videocommon.download.h r10 = com.mbridge.msdk.videocommon.download.C7200h.m18303a()
            java.lang.String r10 = r10.mo49224b(r3)
            r9.setHtmlSource(r10)
            java.lang.String r10 = r9.f17350o
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x012d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "load url:"
            r10.append(r0)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r2, r10)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r10 = r9.f17348m
            r10.loadUrl(r3)
            goto L_0x0148
        L_0x012d:
            java.lang.String r10 = "load html..."
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r2, r10)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f17348m
            java.lang.String r4 = r9.f17350o
            r7 = 0
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "UTF-8"
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)
            goto L_0x0148
        L_0x013f:
            com.mbridge.msdk.video.module.a.a r10 = r9.f17278e
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = ""
            r10.mo48315a(r0, r1)
        L_0x0148:
            r9.f17355t = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.preLoadData(com.mbridge.msdk.video.signal.factory.b):void");
    }

    public void reportRenderResult(String str, int i) {
        if (this.f17275b != null && !this.f17352q) {
            C6203m mVar = new C6203m();
            mVar.mo43741k(this.f17275b.getRequestId());
            mVar.mo43743l(this.f17275b.getRequestIdNotice());
            mVar.mo43747n(this.f17275b.getId());
            mVar.mo43724c(i);
            mVar.mo43753q(String.valueOf(System.currentTimeMillis() - this.f17333B));
            mVar.mo43731f(this.f17275b.getendcard_url());
            mVar.mo43733g((!C6369x.m16236b(this.f17275b.getendcard_url()) || !this.f17275b.getendcard_url().contains(".zip")) ? "2" : "1");
            mVar.mo43751p(str);
            if (this.f17275b.getAdType() == 287) {
                mVar.mo43735h(ExifInterface.GPS_MEASUREMENT_3D);
            } else if (this.f17275b.getAdType() == 94) {
                mVar.mo43735h("1");
            } else if (this.f17275b.getAdType() == 42) {
                mVar.mo43735h("2");
            }
            mVar.mo43718a(this.f17275b.isMraid() ? C6203m.f15357a : C6203m.f15358b);
            C6305b.m15969b(mVar, this.f17353r);
        }
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f17275b.getendcard_url();
            int i = 15;
            if (C6369x.m16236b(str) && str.contains("wfl=1")) {
                String[] split = str.split("&");
                if (split != null && split.length > 0) {
                    for (String str2 : split) {
                        if (C6369x.m16236b(str2) && str2.contains("timeout") && str2.split("=") != null && str2.split("=").length > 0) {
                            i = C6366u.m16187a((Object) str2.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(i);
            }
        } catch (Throwable th) {
            C6361q.m16154a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void defaultShow() {
        super.defaultShow();
    }

    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f17336E = true;
        } else if (i == 1) {
            this.f17337F = true;
        }
    }

    public void toggleCloseBtn(int i) {
        int visibility = this.f17347l.getVisibility();
        if (i == 1) {
            this.f17335D = true;
            visibility = 0;
        } else if (i == 2) {
            this.f17335D = false;
            visibility = 8;
            if (this.f17355t) {
                if (!this.f17344M && !this.f17336E) {
                    this.f17344M = true;
                    int i2 = this.f17359x;
                    if (i2 == 0) {
                        this.f17339H = true;
                    } else {
                        this.f17339H = false;
                        if (i2 > -1) {
                            this.f17349n.postDelayed(new C7002e(this), (long) (this.f17359x * 1000));
                        }
                    }
                }
            } else if (!this.f17343L && !this.f17336E) {
                this.f17343L = true;
                int i3 = this.f17358w;
                if (i3 == 0) {
                    this.f17338G = true;
                } else {
                    this.f17338G = false;
                    if (i3 > -1) {
                        this.f17349n.postDelayed(new C7001d(this), (long) (this.f17358w * 1000));
                    }
                }
            }
        }
        setCloseVisible(visibility);
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$d */
    private class C7001d implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f17373b;

        public C7001d(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f17373b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f17373b;
            if (mBridgeH5EndCardView != null) {
                boolean unused = mBridgeH5EndCardView.f17338G = true;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$e */
    private class C7002e implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f17375b;

        public C7002e(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f17375b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f17375b;
            if (mBridgeH5EndCardView != null) {
                boolean unused = mBridgeH5EndCardView.f17339H = true;
            }
        }
    }

    public void handlerPlayableException(String str) {
        if (!this.f17352q) {
            this.f17352q = true;
            this.f17351p = false;
            if (this.f17275b != null) {
                C6203m mVar = new C6203m();
                mVar.mo43741k(this.f17275b.getRequestId());
                mVar.mo43743l(this.f17275b.getRequestIdNotice());
                mVar.mo43747n(this.f17275b.getId());
                mVar.mo43751p(str);
                C6305b.m15971d(mVar, this.f17274a.getApplicationContext(), this.f17353r);
            }
        }
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f17348m;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() {
                public final void run() {
                    String str;
                    try {
                        C6361q.m16154a(MBridgeBaseView.TAG, "webviewshow");
                        try {
                            int[] iArr = new int[2];
                            MBridgeH5EndCardView.this.f17348m.getLocationOnScreen(iArr);
                            C6361q.m16158d(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            Context d = C6122a.m15302b().mo42895d();
                            if (d != null) {
                                jSONObject.put("startX", C6366u.m16186a(d, (float) iArr[0]));
                                jSONObject.put("startY", C6366u.m16186a(d, (float) iArr[1]));
                                jSONObject.put(C6204a.f15400j, (double) C6366u.m16215d(d));
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            C6361q.m16155a(MBridgeBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        C6563g.m16891a().mo44522a((WebView) MBridgeH5EndCardView.this.f17348m, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                        MBridgeH5EndCardView.this.f17278e.mo48315a(109, "");
                        MBridgeH5EndCardView.m17665d(MBridgeH5EndCardView.this);
                        MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                        C6563g.m16891a().mo44522a((WebView) MBridgeH5EndCardView.this.f17348m, "oncutoutfetched", Base64.encodeToString(MBridgeH5EndCardView.this.f17342K.getBytes(), 0));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            C6563g.m16891a().mo44522a((WebView) this.f17348m, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean canBackPress() {
        ImageView imageView = this.f17347l;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public boolean isLoadSuccess() {
        return this.f17351p;
    }

    public void setUnitId(String str) {
        this.f17353r = str;
    }

    public void setCloseDelayShowTime(int i) {
        this.f17358w = i;
    }

    public void setPlayCloseBtnTm(int i) {
        this.f17359x = i;
    }

    public void setHtmlSource(String str) {
        this.f17350o = str;
    }

    public void setCloseVisible(int i) {
        if (this.f17279f) {
            this.f17347l.setVisibility(i);
        }
    }

    public void setCloseVisibleForMraid(int i) {
        if (this.f17279f) {
            this.f17340I = true;
            if (i == 4) {
                this.f17347l.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f17347l.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f17347l.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RelativeLayout.LayoutParams mo48574b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo48605e() {
        if (this.f17279f) {
            setMatchParent();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo48573a() {
        if (this.f17275b != null) {
            this.f17334C = true;
            if (this.f17275b.isMraid()) {
                this.f17357v = false;
                String mraid = this.f17275b.getMraid();
                if (TextUtils.isEmpty(mraid)) {
                    return this.f17275b.getEndScreenUrl();
                }
                File file = new File(mraid);
                try {
                    if (!file.exists() || !file.isFile() || !file.canRead()) {
                        return this.f17275b.getEndScreenUrl();
                    }
                    return "file:////" + mraid;
                } catch (Throwable th) {
                    if (!MBridgeConstans.DEBUG) {
                        return mraid;
                    }
                    th.printStackTrace();
                    return mraid;
                }
            } else {
                String str = this.f17275b.getendcard_url();
                if (!C6369x.m16235a(str)) {
                    this.f17357v = true;
                    String b = C7191g.m18286a().mo49220b(str);
                    if (TextUtils.isEmpty(b)) {
                        return str + "&native_adtype=" + this.f17275b.getAdType();
                    }
                    return b + "&native_adtype=" + this.f17275b.getAdType();
                }
                this.f17357v = false;
                return this.f17275b.getEndScreenUrl();
            }
        } else {
            this.f17334C = false;
            return null;
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$f */
    private class C7003f implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f17377b;

        public C7003f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f17377b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f17377b;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.f17340I) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                boolean unused = this.f17377b.f17335D = true;
            }
        }
    }

    public void excuteTask() {
        if (!this.f17357v && this.f17358w > -1) {
            this.f17349n.postDelayed(new C7003f(this), (long) (this.f17358w * 1000));
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$b */
    private class C6999b implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f17369b;

        public C6999b(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f17369b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f17369b;
            if (mBridgeH5EndCardView != null && !mBridgeH5EndCardView.f17361z) {
                boolean unused = this.f17369b.f17361z = true;
                this.f17369b.f17351p = false;
                MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
                this.f17369b.f17278e.mo48315a(127, "");
                C6361q.m16154a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
            }
        }
    }

    public void executeEndCardShow(int i) {
        this.f17349n.postDelayed(new C6999b(this), (long) (i * 1000));
    }

    public void excuteEndCardShowTask(int i) {
        this.f17349n.postDelayed(new C7000c(this, i), (long) (i * 1000));
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$c */
    private static class C7000c implements Runnable {

        /* renamed from: a */
        private MBridgeH5EndCardView f17370a;

        /* renamed from: b */
        private int f17371b;

        public C7000c(MBridgeH5EndCardView mBridgeH5EndCardView, int i) {
            this.f17370a = mBridgeH5EndCardView;
            this.f17371b = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x007e A[Catch:{ Exception -> 0x00a4, all -> 0x00cc }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0084 A[Catch:{ Exception -> 0x00a4, all -> 0x00cc }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                java.lang.String r0 = "MBridgeBaseView"
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f17370a
                if (r1 == 0) goto L_0x00d4
                boolean r1 = r1.f17360y     // Catch:{ all -> 0x00cc }
                if (r1 == 0) goto L_0x0012
                java.lang.String r1 = "insertEndCardReadyState hasInsertLoadEndCardReport true return"
                com.mbridge.msdk.foundation.tools.C6361q.m16156b(r0, r1)     // Catch:{ all -> 0x00cc }
                return
            L_0x0012:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f17370a     // Catch:{ all -> 0x00cc }
                r2 = 1
                boolean unused = r1.f17360y = r2     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f17370a     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r1.f17275b     // Catch:{ all -> 0x00cc }
                java.lang.String r1 = r1.getendcard_url()     // Catch:{ all -> 0x00cc }
                boolean r1 = com.mbridge.msdk.foundation.tools.C6369x.m16236b(r1)     // Catch:{ all -> 0x00cc }
                java.lang.String r2 = "1"
                java.lang.String r3 = "2"
                if (r1 == 0) goto L_0x003c
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f17370a     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r1.f17275b     // Catch:{ all -> 0x00cc }
                java.lang.String r1 = r1.getendcard_url()     // Catch:{ all -> 0x00cc }
                java.lang.String r4 = ".zip"
                boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x00cc }
                if (r1 == 0) goto L_0x003c
                r12 = r2
                goto L_0x003d
            L_0x003c:
                r12 = r3
            L_0x003d:
                r6 = 12
                java.lang.String r11 = "ready timeout"
                com.mbridge.msdk.foundation.entity.m r1 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x00cc }
                java.lang.String r5 = "2000043"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
                r4.<init>()     // Catch:{ all -> 0x00cc }
                int r7 = r13.f17371b     // Catch:{ all -> 0x00cc }
                int r7 = r7 * 1000
                r4.append(r7)     // Catch:{ all -> 0x00cc }
                java.lang.String r7 = ""
                r4.append(r7)     // Catch:{ all -> 0x00cc }
                java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f17370a     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f17275b     // Catch:{ all -> 0x00cc }
                java.lang.String r8 = r4.getendcard_url()     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f17370a     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f17275b     // Catch:{ all -> 0x00cc }
                java.lang.String r9 = r4.getId()     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f17370a     // Catch:{ all -> 0x00cc }
                java.lang.String r10 = r4.f17353r     // Catch:{ all -> 0x00cc }
                r4 = r1
                r4.<init>((java.lang.String) r5, (int) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12)     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f17370a     // Catch:{ Exception -> 0x00a4 }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f17275b     // Catch:{ Exception -> 0x00a4 }
                int r4 = r4.getAdType()     // Catch:{ Exception -> 0x00a4 }
                r5 = 287(0x11f, float:4.02E-43)
                if (r4 != r5) goto L_0x0084
                java.lang.String r2 = "3"
                r1.mo43735h((java.lang.String) r2)     // Catch:{ Exception -> 0x00a4 }
                goto L_0x00a8
            L_0x0084:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f17370a     // Catch:{ Exception -> 0x00a4 }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f17275b     // Catch:{ Exception -> 0x00a4 }
                int r4 = r4.getAdType()     // Catch:{ Exception -> 0x00a4 }
                r5 = 94
                if (r4 != r5) goto L_0x0094
                r1.mo43735h((java.lang.String) r2)     // Catch:{ Exception -> 0x00a4 }
                goto L_0x00a8
            L_0x0094:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f17370a     // Catch:{ Exception -> 0x00a4 }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f17275b     // Catch:{ Exception -> 0x00a4 }
                int r2 = r2.getAdType()     // Catch:{ Exception -> 0x00a4 }
                r4 = 42
                if (r2 != r4) goto L_0x00a8
                r1.mo43735h((java.lang.String) r3)     // Catch:{ Exception -> 0x00a4 }
                goto L_0x00a8
            L_0x00a4:
                r2 = move-exception
                r2.printStackTrace()     // Catch:{ all -> 0x00cc }
            L_0x00a8:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f17370a     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f17275b     // Catch:{ all -> 0x00cc }
                java.lang.String r2 = r2.getRequestId()     // Catch:{ all -> 0x00cc }
                r1.mo43741k(r2)     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f17370a     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f17275b     // Catch:{ all -> 0x00cc }
                java.lang.String r2 = r2.getRequestIdNotice()     // Catch:{ all -> 0x00cc }
                r1.mo43743l(r2)     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f17370a     // Catch:{ all -> 0x00cc }
                java.lang.String r2 = r2.f17353r     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.foundation.same.report.C6305b.m15965a(r1, r2)     // Catch:{ all -> 0x00cc }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f17370a     // Catch:{ all -> 0x00cc }
                boolean r0 = r1.isLoadSuccess()     // Catch:{ all -> 0x00cc }
                goto L_0x00d4
            L_0x00cc:
                r1 = move-exception
                java.lang.String r2 = r1.getMessage()
                com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r2, r1)
            L_0x00d4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.C7000c.run():void");
        }
    }

    public boolean isPlayable() {
        return this.f17357v;
    }

    public void onBackPress() {
        if (this.f17335D || ((this.f17336E && this.f17337F) || ((!this.f17336E && this.f17338G && !this.f17355t) || (!this.f17336E && this.f17339H && this.f17355t)))) {
            onCloseViewClick();
        }
    }

    public void setLoadPlayable(boolean z) {
        this.f17355t = z;
    }

    public void release() {
        Handler handler = this.f17349n;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f17349n = null;
        }
        Handler handler2 = this.f17354s;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
            this.f17354s = null;
        }
        this.f17346k.removeAllViews();
        this.f17348m.release();
        this.f17348m = null;
    }

    public void volumeChange(double d) {
        C6549a.m16848a().mo44471a((WebView) this.f17348m, d);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f17275b != null && this.f17275b.isMraid()) {
            if (z) {
                C6549a.m16848a().mo44479b(this.f17348m, "true");
            } else {
                C6549a.m16848a().mo44479b(this.f17348m, "false");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && !this.f17341J) {
            this.f17341J = true;
            setFocusableInTouchMode(true);
            requestFocus();
            requestFocusFromTouch();
        }
    }

    public void open(String str) {
        try {
            String clickURL = this.f17275b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f17275b.setClickURL(str);
                CampaignEx mraidCampaign = getMraidCampaign();
                if (mraidCampaign != null) {
                    new C6308c(getContext()).mo43935b(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f17353r, str, this.f17275b.isBidCampaign());
                }
            }
            new C6097a(getContext(), this.f17353r).mo42838a(this.f17275b);
            this.f17275b.setClickURL(clickURL);
            this.f17278e.mo48315a(126, "");
        } catch (Exception e) {
            C6361q.m16158d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e) {
            C6361q.m16158d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void unload() {
        close();
    }

    public CampaignEx getMraidCampaign() {
        return this.f17275b;
    }

    public void useCustomClose(boolean z) {
        try {
            setCloseVisibleForMraid(z ? 4 : 0);
        } catch (Exception e) {
            C6361q.m16158d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void setNotchValue(String str, int i, int i2, int i3, int i4) {
        this.f17342K = str;
        C6361q.m16158d(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f17347l.getLayoutParams();
        int b = C6366u.m16203b(getContext(), 20.0f);
        layoutParams.setMargins(i + b, i3 + b, i2 + b, i4 + b);
        this.f17347l.setLayoutParams(layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[Catch:{ NullPointerException -> 0x00b2, all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[Catch:{ NullPointerException -> 0x00b2, all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090 A[Catch:{ NullPointerException -> 0x00b2, all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096 A[Catch:{ NullPointerException -> 0x00b2, all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6 A[Catch:{ NullPointerException -> 0x00b2, all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m17658a(com.mbridge.msdk.video.module.MBridgeH5EndCardView r19, long r20, boolean r22) {
        /*
            r1 = r19
            boolean r0 = r1.f17360y     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0008
            goto L_0x0139
        L_0x0008:
            r2 = 1
            r1.f17360y = r2     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x012f }
            boolean r0 = com.mbridge.msdk.foundation.tools.C6369x.m16236b(r0)     // Catch:{ all -> 0x012f }
            java.lang.String r3 = ".zip"
            java.lang.String r4 = "1"
            java.lang.String r5 = "2"
            if (r0 == 0) goto L_0x002b
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x012f }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x002b
            r15 = r4
            goto L_0x002c
        L_0x002b:
            r15 = r5
        L_0x002c:
            r0 = 10
            java.lang.String r6 = "ready yes"
            r7 = 2
            if (r22 == 0) goto L_0x003c
            r0 = 12
            java.lang.String r6 = "ready timeout"
            r14 = r6
            r8 = 12
            r13 = 2
            goto L_0x004e
        L_0x003c:
            int r8 = r1.f17332A     // Catch:{ all -> 0x012f }
            if (r8 != r7) goto L_0x004a
            r7 = 3
            r0 = 11
            java.lang.String r6 = "ready no"
            r14 = r6
            r8 = 11
            r13 = 3
            goto L_0x004e
        L_0x004a:
            r14 = r6
            r8 = 10
            r13 = 1
        L_0x004e:
            com.mbridge.msdk.foundation.entity.m r12 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x012f }
            java.lang.String r7 = "2000043"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012f }
            r0.<init>()     // Catch:{ all -> 0x012f }
            r10 = r20
            r0.append(r10)     // Catch:{ all -> 0x012f }
            java.lang.String r6 = ""
            r0.append(r6)     // Catch:{ all -> 0x012f }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r1.f17275b     // Catch:{ all -> 0x012f }
            java.lang.String r16 = r6.getId()     // Catch:{ all -> 0x012f }
            java.lang.String r6 = r1.f17353r     // Catch:{ all -> 0x012f }
            r17 = r6
            r6 = r12
            r10 = r0
            r11 = r16
            r2 = r12
            r12 = r17
            r17 = r3
            r3 = r13
            r13 = r14
            r18 = r14
            r14 = r15
            r6.<init>((java.lang.String) r7, (int) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14)     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ NullPointerException -> 0x00b2 }
            int r0 = r0.getAdType()     // Catch:{ NullPointerException -> 0x00b2 }
            r6 = 287(0x11f, float:4.02E-43)
            if (r0 != r6) goto L_0x0096
            java.lang.String r0 = "3"
            r2.mo43735h((java.lang.String) r0)     // Catch:{ NullPointerException -> 0x00b2 }
            goto L_0x00b6
        L_0x0096:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ NullPointerException -> 0x00b2 }
            int r0 = r0.getAdType()     // Catch:{ NullPointerException -> 0x00b2 }
            r6 = 94
            if (r0 != r6) goto L_0x00a4
            r2.mo43735h((java.lang.String) r4)     // Catch:{ NullPointerException -> 0x00b2 }
            goto L_0x00b6
        L_0x00a4:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ NullPointerException -> 0x00b2 }
            int r0 = r0.getAdType()     // Catch:{ NullPointerException -> 0x00b2 }
            r6 = 42
            if (r0 != r6) goto L_0x00b6
            r2.mo43735h((java.lang.String) r5)     // Catch:{ NullPointerException -> 0x00b2 }
            goto L_0x00b6
        L_0x00b2:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x012f }
        L_0x00b6:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r0.getRequestId()     // Catch:{ all -> 0x012f }
            r2.mo43741k(r0)     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r0.getRequestIdNotice()     // Catch:{ all -> 0x012f }
            r2.mo43743l(r0)     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r1.f17353r     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.same.report.C6305b.m15965a(r2, r0)     // Catch:{ all -> 0x012f }
            boolean r0 = r19.isLoadSuccess()     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x0139
            r6 = 1
            if (r3 != r6) goto L_0x0139
            r2.mo43724c((int) r3)     // Catch:{ all -> 0x012f }
            java.lang.String r0 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x012f }
            r2.mo43753q(r0)     // Catch:{ all -> 0x012f }
            r2.mo43733g((java.lang.String) r15)     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x012f }
            r2.mo43731f((java.lang.String) r0)     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x012f }
            boolean r0 = com.mbridge.msdk.foundation.tools.C6369x.m16236b(r0)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0107
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x012f }
            r3 = r17
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r4 = r5
        L_0x0108:
            r2.mo43733g((java.lang.String) r4)     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x012f }
            r2.mo43747n(r0)     // Catch:{ all -> 0x012f }
            r6 = r18
            r2.mo43751p(r6)     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f17275b     // Catch:{ all -> 0x012f }
            boolean r0 = r0.isMraid()     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0124
            int r0 = com.mbridge.msdk.foundation.entity.C6203m.f15357a     // Catch:{ all -> 0x012f }
            goto L_0x0126
        L_0x0124:
            int r0 = com.mbridge.msdk.foundation.entity.C6203m.f15358b     // Catch:{ all -> 0x012f }
        L_0x0126:
            r2.mo43718a((int) r0)     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r1.f17353r     // Catch:{ all -> 0x012f }
            com.mbridge.msdk.foundation.same.report.C6305b.m15969b(r2, r0)     // Catch:{ all -> 0x012f }
            goto L_0x0139
        L_0x012f:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r2, r1, r0)
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.m17658a(com.mbridge.msdk.video.module.MBridgeH5EndCardView, long, boolean):void");
    }

    /* renamed from: d */
    static /* synthetic */ void m17665d(MBridgeH5EndCardView mBridgeH5EndCardView) {
        MBridgeH5EndCardView mBridgeH5EndCardView2 = mBridgeH5EndCardView;
        if (mBridgeH5EndCardView2.f17275b != null && mBridgeH5EndCardView2.f17275b.isMraid()) {
            int i = mBridgeH5EndCardView.getResources().getConfiguration().orientation;
            String str = "undefined";
            if (i != 0) {
                if (i == 1) {
                    str = "portrait";
                } else if (i == 2) {
                    str = "landscape";
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("orientation", str);
                jSONObject.put("locked", "true");
            } catch (Exception e) {
                e.printStackTrace();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            hashMap.put("state", Reward.DEFAULT);
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            if (mBridgeH5EndCardView.getContext() instanceof Activity) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) mBridgeH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                C6549a.m16848a().mo44477b(mBridgeH5EndCardView2.f17348m, (float) C6349m.m16111h(mBridgeH5EndCardView.getContext()), (float) C6349m.m16112i(mBridgeH5EndCardView.getContext()));
                C6549a.m16848a().mo44480c(mBridgeH5EndCardView2.f17348m, (float) displayMetrics.widthPixels, (float) displayMetrics.heightPixels);
            }
            C6549a a = C6549a.m16848a();
            WindVaneWebView windVaneWebView = mBridgeH5EndCardView2.f17348m;
            a.mo44473a(windVaneWebView, (float) windVaneWebView.getLeft(), (float) mBridgeH5EndCardView2.f17348m.getTop(), (float) mBridgeH5EndCardView2.f17348m.getWidth(), (float) mBridgeH5EndCardView2.f17348m.getHeight());
            C6549a a2 = C6549a.m16848a();
            WindVaneWebView windVaneWebView2 = mBridgeH5EndCardView2.f17348m;
            a2.mo44478b(windVaneWebView2, (float) windVaneWebView2.getLeft(), (float) mBridgeH5EndCardView2.f17348m.getTop(), (float) mBridgeH5EndCardView2.f17348m.getWidth(), (float) mBridgeH5EndCardView2.f17348m.getHeight());
            C6549a.m16848a().mo44476a((WebView) mBridgeH5EndCardView2.f17348m, (Map<String, Object>) hashMap);
            C6549a.m16848a().mo44471a((WebView) mBridgeH5EndCardView2.f17348m, C6553d.f16326a);
            C6549a.m16848a().mo44470a(mBridgeH5EndCardView2.f17348m);
        }
    }
}
