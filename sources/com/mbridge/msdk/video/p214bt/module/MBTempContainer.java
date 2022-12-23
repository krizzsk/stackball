package com.mbridge.msdk.video.p214bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.foundation.tools.C6337h;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.mraid.C6552c;
import com.mbridge.msdk.mbsignalcommon.mraid.C6553d;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p231a.p232a.C7028a;
import com.mbridge.msdk.video.module.p231a.p232a.C7029b;
import com.mbridge.msdk.video.module.p231a.p232a.C7030c;
import com.mbridge.msdk.video.module.p231a.p232a.C7033f;
import com.mbridge.msdk.video.module.p231a.p232a.C7035h;
import com.mbridge.msdk.video.module.p231a.p232a.C7042m;
import com.mbridge.msdk.video.module.p231a.p232a.C7045n;
import com.mbridge.msdk.video.module.p233b.C7047a;
import com.mbridge.msdk.video.p214bt.module.p216a.C6913b;
import com.mbridge.msdk.video.p214bt.module.p217b.C6916c;
import com.mbridge.msdk.video.p214bt.module.p217b.C6917d;
import com.mbridge.msdk.video.p214bt.module.p217b.C6918e;
import com.mbridge.msdk.video.p214bt.module.p217b.C6919f;
import com.mbridge.msdk.video.p214bt.module.p217b.C6922h;
import com.mbridge.msdk.video.p214bt.p215a.C6877c;
import com.mbridge.msdk.video.signal.C7068c;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.video.signal.factory.C7158b;
import com.mbridge.msdk.video.signal.p235a.C7053c;
import com.mbridge.msdk.video.signal.p235a.C7062j;
import com.mbridge.msdk.videocommon.C7165a;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.p239d.C7176a;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer */
public class MBTempContainer extends AbstractJSContainer {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final String f16888y = MBTempContainer.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public CampaignEx f16889A;

    /* renamed from: B */
    private C7180a f16890B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C6922h f16891C;

    /* renamed from: D */
    private C6913b f16892D;

    /* renamed from: E */
    private String f16893E = "";

    /* renamed from: F */
    private C7158b f16894F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f16895G = C6204a.f15407q;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f16896H;

    /* renamed from: I */
    private boolean f16897I = false;

    /* renamed from: J */
    private int f16898J;

    /* renamed from: K */
    private int f16899K;

    /* renamed from: L */
    private int f16900L;

    /* renamed from: M */
    private int f16901M;

    /* renamed from: N */
    private int f16902N;

    /* renamed from: O */
    private String f16903O = "";

    /* renamed from: P */
    private String f16904P;

    /* renamed from: Q */
    private LayoutInflater f16905Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f16906R = 0;

    /* renamed from: S */
    private int f16907S = 0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public View f16908T;

    /* renamed from: U */
    private boolean f16909U = false;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f16910V = false;

    /* renamed from: W */
    private boolean f16911W = false;

    /* renamed from: a */
    protected boolean f16912a = false;

    /* renamed from: aa */
    private boolean f16913aa;

    /* renamed from: ab */
    private boolean f16914ab = false;
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public boolean f16915ac = false;
    /* access modifiers changed from: private */

    /* renamed from: ad */
    public boolean f16916ad = false;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public boolean f16917ae = false;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f16918af = false;

    /* renamed from: ag */
    private boolean f16919ag = false;

    /* renamed from: ah */
    private C6553d f16920ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public Runnable f16921ai = new Runnable() {
        public final void run() {
            if (MBTempContainer.this.f16908T != null) {
                MBTempContainer.this.f16908T.setVisibility(8);
            }
        }
    };

    /* renamed from: b */
    protected boolean f16922b = false;

    /* renamed from: c */
    protected C6888a f16923c = new C6888a.C6889a();

    /* renamed from: d */
    protected WindVaneWebView f16924d;

    /* renamed from: e */
    protected MBridgeVideoView f16925e;

    /* renamed from: f */
    protected MBridgeContainerView f16926f;

    /* renamed from: g */
    protected Handler f16927g = new Handler();

    /* renamed from: h */
    protected Runnable f16928h = new Runnable() {
        public final void run() {
            if (MBTempContainer.this.getActivityProxy().mo48799h() == 0) {
                MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
            } else {
                int unused = MBTempContainer.this.f16906R = -3;
            }
        }
    };

    /* renamed from: i */
    protected Runnable f16929i = new Runnable() {
        public final void run() {
            if (MBTempContainer.this.getActivityProxy().mo48799h() == 0) {
                MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
            } else {
                int unused = MBTempContainer.this.f16906R = -4;
            }
        }
    };

    /* renamed from: z */
    private View f16930z;

    public void preload() {
    }

    public void setMediaPlayerUrl(String str) {
    }

    public MBTempContainer(Context context) {
        super(context);
        init(context);
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public void init(Context context) {
        this.f16905Q = LayoutInflater.from(context);
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public void registerErrorListener(C6888a aVar) {
        this.f16923c = aVar;
    }

    public int findID(String str) {
        return C6347k.m16084a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return C6347k.m16084a(getContext(), str, "layout");
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a */
    public interface C6888a {
        /* renamed from: a */
        void mo48313a(String str);

        /* renamed from: a */
        void mo48314a(boolean z);

        /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a$a */
        public static class C6889a implements C6888a {

            /* renamed from: a */
            private boolean f16938a = false;

            /* renamed from: a */
            public void mo48313a(String str) {
                C6361q.m16158d("ActivityErrorListener", str);
                this.f16938a = true;
            }

            /* renamed from: a */
            public final void mo48314a(boolean z) {
                this.f16938a = z;
            }
        }
    }

    public boolean isLoadSuccess() {
        return this.f16922b;
    }

    /* renamed from: c */
    private int m17296c() {
        C7062j b = mo49031b(this.f16889A);
        if (b != null) {
            return b.mo48825j();
        }
        return 0;
    }

    /* renamed from: d */
    private boolean m17301d() {
        C7062j b = mo49031b(this.f16889A);
        if (b != null) {
            return b.mo48828m();
        }
        return false;
    }

    /* renamed from: e */
    private boolean m17303e() {
        MBridgeVideoView mBridgeVideoView = this.f16925e;
        if (mBridgeVideoView != null) {
            return mBridgeVideoView.isShowingAlertView();
        }
        return false;
    }

    public void superDefaultLoad(int i, String str) {
        this.f16927g.removeCallbacks(this.f16928h);
        this.f16927g.removeCallbacks(this.f16929i);
        this.f16923c.mo48314a(true);
        WindVaneWebView windVaneWebView = this.f16924d;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48267a(String str) {
        C6922h hVar = this.f16891C;
        if (hVar != null) {
            hVar.mo47005a(str);
        }
        super.mo48267a(str);
    }

    public void onPause() {
        super.onPause();
        this.f16911W = true;
        try {
            getJSVideoModule().videoOperate(2);
        } catch (Throwable th) {
            C6361q.m16155a(f16888y, th.getMessage(), th);
        }
    }

    public void onResume() {
        Runnable runnable;
        super.onResume();
        int i = this.f16906R;
        if (i == -3) {
            runnable = this.f16928h;
        } else {
            runnable = i == -4 ? this.f16929i : null;
        }
        if (runnable != null) {
            runnable.run();
            this.f16906R = 0;
        }
        try {
            if (this.f16925e != null && !m17303e() && !this.f16925e.isMiniCardShowing()) {
                this.f16925e.setCover(false);
            }
            if (this.f16911W && !m17303e()) {
                getJSVideoModule().videoOperate(1);
            }
            if (this.f17838j != null) {
                C6366u.m16195a(this.f17838j.getWindow().getDecorView());
            }
            if (this.f16914ab && this.f16915ac && this.f17838j != null) {
                this.f17838j.finish();
            }
        } catch (Throwable th) {
            C6361q.m16155a(f16888y, th.getMessage(), th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onStop() {
        super.onStop();
        MBridgeVideoView mBridgeVideoView = this.f16925e;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(true);
        }
    }

    public void onDestroy() {
        if (!this.f16897I) {
            boolean z = true;
            this.f16897I = true;
            super.onDestroy();
            try {
                if (this.f16925e != null) {
                    this.f16925e.releasePlayer();
                }
                if (this.f16924d != null) {
                    ViewGroup viewGroup = (ViewGroup) this.f16924d.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                    }
                    this.f16924d.clearWebView();
                    this.f16924d.release();
                }
                if (this.f16892D != null) {
                    this.f16892D = null;
                }
                this.f16927g.removeCallbacks(this.f16928h);
                this.f16927g.removeCallbacks(this.f16929i);
                getJSCommon().mo48816e();
                if (this.f17846r) {
                    C6076b.m15089a().mo42756e(this.f17839k);
                }
                if (!this.f16909U) {
                    this.f16909U = true;
                    if (this.f16889A != null && this.f16889A.getPlayable_ads_without_video() == 2) {
                        this.f16910V = true;
                    }
                    if (this.f16891C != null) {
                        if (this.f17846r && (this.f17848t == C6204a.f15403m || this.f17848t == C6204a.f15404n)) {
                            C6922h hVar = this.f16891C;
                            if (this.f16896H != 1) {
                                z = false;
                            }
                            hVar.mo47007a(z, this.f16895G);
                        }
                        if (!this.f16910V) {
                            this.f17843o.mo49083a(0);
                        }
                        this.f16891C.mo47008a(this.f16910V, this.f17843o);
                    }
                    this.f16927g.removeCallbacks(this.f16921ai);
                    if (((!this.f17846r && !this.f17851w) || (this.f16889A != null && C6366u.m16221f(this.f16889A.getMof_template_url()))) && this.f16910V) {
                        C6361q.m16154a(f16888y, "sendToServerRewardInfo");
                        C7047a.m17788a(this.f16889A, this.f17843o, this.f17839k, this.f17842n, this.f16904P);
                    }
                    if (!this.f17851w) {
                        if (this.f17846r) {
                            C7165a.m18061b(287, this.f16889A);
                        } else {
                            C7165a.m18061b(94, this.f16889A);
                        }
                    }
                    if (this.f16926f != null) {
                        this.f16926f.release();
                    }
                }
            } catch (Throwable th) {
                C6361q.m16154a(f16888y, th.getMessage());
                return;
            }
            if (!this.f16913aa) {
                m17306f();
            }
            if (this.f16920ah != null) {
                this.f16920ah.mo44485d();
            }
            if (!this.f17851w) {
                if (isLoadSuccess()) {
                    this.f16927g.postDelayed(new Runnable() {
                        public final void run() {
                            if (MBTempContainer.this.f17838j != null) {
                                MBTempContainer.this.f17838j.finish();
                            }
                        }
                    }, 100);
                } else if (this.f17838j != null) {
                    this.f17838j.finish();
                }
            }
            if (!this.f16913aa) {
                m17306f();
            }
            C6877c.m17219a().mo48209e(this.f16893E);
        }
    }

    /* renamed from: f */
    private void m17306f() {
        C6308c cVar = new C6308c(getContext());
        CampaignEx campaignEx = this.f16889A;
        if (campaignEx != null) {
            cVar.mo43934a(campaignEx.getRequestId(), this.f16889A.getRequestIdNotice(), this.f16889A.getId(), this.f17839k, C6552c.m16863a(this.f16889A.getId()), this.f16889A.isBidCampaign());
            C6552c.m16864b(this.f16889A.getId());
            this.f16913aa = true;
        }
    }

    public void setShowingTransparent() {
        int a;
        boolean d = m17301d();
        this.f16914ab = d;
        if (!d && (a = C6347k.m16084a(getContext(), "mbridge_reward_theme", "style")) > 1 && this.f17838j != null) {
            this.f17838j.setTheme(a);
        }
    }

    public void receiveSuccess() {
        C6361q.m16154a(f16888y, "receiveSuccess ,start hybrid");
        this.f16927g.removeCallbacks(this.f16929i);
        this.f16927g.postDelayed(this.f16921ai, 250);
    }

    public void defaultLoad(int i, String str) {
        superDefaultLoad(i, str);
        if (!isLoadSuccess()) {
            m17291a(i, str);
            if (this.f17838j != null) {
                this.f17838j.finish();
            }
        } else if (this.f16889A.getPlayable_ads_without_video() == 2) {
            this.f16926f.setCampaign(this.f16889A);
            this.f16926f.setUnitID(this.f17839k);
            this.f16926f.setCloseDelayTime(this.f17841m.mo49148n());
            this.f16926f.setPlayCloseBtnTm(this.f17841m.mo49136h());
            this.f16926f.setNotifyListener(new C7035h(this.f16889A, this.f16890B, this.f17843o, mo49032b(), this.f17839k, new C6891c(), this.f17841m.mo49168y(), this.f17851w));
            this.f16926f.preLoadData(this.f16894F);
            this.f16926f.showPlayableView();
        } else {
            m17291a(i, str);
            this.f16908T.setVisibility(8);
            loadModuleDatas();
            int f = this.f17841m.mo49132f();
            int c = m17296c();
            int i2 = c != 0 ? c : f;
            CampaignEx campaignEx = this.f16889A;
            if (campaignEx != null && C6366u.m16221f(campaignEx.getMof_template_url())) {
                this.f16925e.setContainerViewOnNotifyListener(new C6890b(this.f17838j, this.f16889A));
            }
            MBridgeVideoView mBridgeVideoView = this.f16925e;
            mBridgeVideoView.setNotifyListener(new C7042m(mBridgeVideoView, this.f16926f, this.f16889A, this.f17843o, this.f16890B, mo49032b(), this.f17839k, i2, this.f17841m.mo49130e(), new C6893e(), this.f17841m.mo49167x(), this.f17841m.mo49168y(), this.f17851w));
            this.f16925e.defaultShow();
            MBridgeContainerView mBridgeContainerView = this.f16926f;
            mBridgeContainerView.setNotifyListener(new C7029b(this.f16925e, mBridgeContainerView, this.f16889A, this.f17843o, this.f16890B, mo49032b(), this.f17839k, new C6890b(this.f17838j, this.f16889A), this.f17841m.mo49168y(), this.f17851w));
            this.f16926f.defaultShow();
        }
    }

    public int getLayoutID() {
        return findLayout(this.f16914ab ? "mbridge_reward_activity_video_templete_transparent" : "mbridge_reward_activity_video_templete");
    }

    public WindVaneWebView findWindVaneWebView() {
        C7165a.C7166a aVar;
        try {
            if (!this.f17851w) {
                if (this.f17846r) {
                    aVar = C7165a.m18054a(287, this.f16889A);
                } else {
                    aVar = C7165a.m18054a(94, this.f16889A);
                }
                if (aVar == null || !aVar.mo49059c()) {
                    return null;
                }
                if (this.f17846r) {
                    C7165a.m18061b(287, this.f16889A);
                } else {
                    C7165a.m18061b(94, this.f16889A);
                }
                WindVaneWebView a = aVar.mo49054a();
                if (this.f16914ab) {
                    a.setWebViewTransparent();
                }
                return a;
            } else if (this.f16889A == null || this.f16889A.getRewardTemplateMode() == null) {
                return null;
            } else {
                C7165a.C7166a a2 = C7165a.m18055a(this.f17839k + "_" + this.f16889A.getId() + "_" + this.f16889A.getRequestId() + "_" + this.f16889A.getRewardTemplateMode().mo43510d());
                if (a2 != null) {
                    return a2.mo49054a();
                }
                return null;
            }
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    public MBridgeVideoView findMBridgeVideoView() {
        return (MBridgeVideoView) findViewById(findID("mbridge_video_templete_videoview"));
    }

    public MBridgeContainerView findMBridgeContainerView() {
        return (MBridgeContainerView) findViewById(findID("mbridge_video_templete_container"));
    }

    public boolean initViews() {
        View findViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.f16908T = findViewById;
        return findViewById != null;
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.f16926f;
        return mBridgeContainerView == null || mBridgeContainerView.canBackPress();
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        MBridgeVideoView mBridgeVideoView;
        MBridgeVideoView mBridgeVideoView2;
        if (this.f16914ab && (mBridgeVideoView2 = this.f16925e) != null) {
            mBridgeVideoView2.notifyVideoClose();
        } else if (!this.f16916ad || (mBridgeVideoView = this.f16925e) == null) {
            if (!this.f16918af || (mBridgeContainerView2 = this.f16926f) == null) {
                if (this.f16917ae && (mBridgeContainerView = this.f16926f) != null) {
                    mBridgeContainerView.onEndcardBackPress();
                }
                if (getJSCommon().mo48811b()) {
                    if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                        getActivityProxy().mo48798g();
                    }
                } else if (!canBackPress()) {
                    C6361q.m16154a(f16888y, "onBackPressed can't excute");
                } else if (this.f17838j != null && !this.f17851w && !this.f16919ag) {
                    this.f16919ag = true;
                    this.f17838j.onBackPressed();
                }
            } else {
                mBridgeContainerView2.onPlayableBackPress();
            }
        } else if (mBridgeVideoView.isMiniCardShowing()) {
            MBridgeContainerView mBridgeContainerView3 = this.f16926f;
            if (mBridgeContainerView3 != null) {
                mBridgeContainerView3.onMiniEndcardBackPress();
            }
        } else {
            this.f16925e.onBackPress();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[Catch:{ all -> 0x00a7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17291a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            com.mbridge.msdk.foundation.entity.m r0 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x00a7 }
            r0.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "2000037"
            r0.mo43749o(r1)     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r1.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "code="
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = ",desc="
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            r1.append(r5)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x00a7 }
            r0.mo43739j(r4)     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x003f
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx$c r4 = r4.getRewardTemplateMode()     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x003f
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx$c r4 = r4.getRewardTemplateMode()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.mo43510d()     // Catch:{ all -> 0x00a7 }
            goto L_0x0040
        L_0x003f:
            r4 = r5
        L_0x0040:
            r0.mo43737i(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r3.f17839k     // Catch:{ all -> 0x00a7 }
            r0.mo43745m(r4)     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0052
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r4.getId()     // Catch:{ all -> 0x00a7 }
        L_0x0052:
            r0.mo43747n(r5)     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x006e
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestId()     // Catch:{ all -> 0x00a7 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00a7 }
            if (r4 != 0) goto L_0x006e
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestId()     // Catch:{ all -> 0x00a7 }
            r0.mo43741k(r4)     // Catch:{ all -> 0x00a7 }
        L_0x006e:
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0087
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestIdNotice()     // Catch:{ all -> 0x00a7 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00a7 }
            if (r4 != 0) goto L_0x0087
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f16889A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestIdNotice()     // Catch:{ all -> 0x00a7 }
            r0.mo43743l(r4)     // Catch:{ all -> 0x00a7 }
        L_0x0087:
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x00a7 }
            int r4 = com.mbridge.msdk.foundation.tools.C6349m.m16123n(r4)     // Catch:{ all -> 0x00a7 }
            r0.mo43721b((int) r4)     // Catch:{ all -> 0x00a7 }
            android.content.Context r5 = r3.getContext()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = com.mbridge.msdk.foundation.tools.C6349m.m16092a((android.content.Context) r5, (int) r4)     // Catch:{ all -> 0x00a7 }
            r0.mo43755r(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = com.mbridge.msdk.foundation.entity.C6203m.m15632e((com.mbridge.msdk.foundation.entity.C6203m) r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r3.f17839k     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.video.module.p233b.C7047a.m17792a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x00a7 }
            goto L_0x00b1
        L_0x00a7:
            r4 = move-exception
            java.lang.String r5 = f16888y
            java.lang.String r0 = r4.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r5, r0, r4)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.module.MBTempContainer.m17291a(int, java.lang.String):void");
    }

    /* renamed from: g */
    private int m17308g() {
        try {
            C7176a b = C7177b.m18135a().mo49112b();
            if (b == null) {
                C7177b.m18135a().mo49113c();
            }
            if (b != null) {
                return (int) b.mo49102f();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$e */
    private final class C6893e extends C7033f {
        private C6893e() {
        }

        /* renamed from: a */
        public final void mo48315a(int i, Object obj) {
            super.mo48315a(i, obj);
            if (MBTempContainer.this.f17846r) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            int unused = MBTempContainer.this.f16895G = jSONObject.getInt("Alert_window_status");
                            int unused2 = MBTempContainer.this.f16896H = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e) {
                    C6361q.m16158d("NotifyListener", e.getMessage());
                }
            }
            if (i != 2) {
                if (i == 121) {
                    boolean unused3 = MBTempContainer.this.f16910V = true;
                    MBTempContainer.this.f16891C.mo47006a(MBTempContainer.this.f17840l, MBTempContainer.this.f17839k);
                    boolean unused4 = MBTempContainer.this.f16916ad = false;
                    return;
                } else if (i == 16) {
                    MBTempContainer.this.getJSCommon().mo48814d();
                    return;
                } else if (i != 17) {
                    switch (i) {
                        case 10:
                            boolean unused5 = MBTempContainer.this.f16916ad = true;
                            if (!MBTempContainer.this.f17851w) {
                                MBTempContainer.this.f16891C.mo47003a();
                                C6919f.m17451a(MBTempContainer.this.getContext(), MBTempContainer.this.f16889A, MBTempContainer.this.f17839k);
                                return;
                            }
                            return;
                        case 11:
                        case 12:
                            break;
                        default:
                            return;
                    }
                } else {
                    boolean unused6 = MBTempContainer.this.f16910V = true;
                    return;
                }
            }
            if (i == 12) {
                MBTempContainer.this.f16891C.mo47005a("play error");
                C6919f.m17452a(MBTempContainer.this.getContext(), MBTempContainer.this.f16889A, MBTempContainer.this.f17839k, "play error");
            }
            MBTempContainer.this.getJSVideoModule().videoOperate(3);
            boolean unused7 = MBTempContainer.this.f16916ad = false;
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$b */
    private final class C6890b extends C7028a {
        public C6890b(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        /* renamed from: a */
        public final void mo48315a(int i, Object obj) {
            boolean unused = MBTempContainer.this.f16917ae = true;
            String str = "";
            if (i != 108) {
                if (i != 113) {
                    if (i != 117) {
                        if (i != 126 && i != 128) {
                            switch (i) {
                                case 103:
                                case 104:
                                    MBTempContainer.m17314l(MBTempContainer.this);
                                    break;
                                case 105:
                                    C7068c jSCommon = MBTempContainer.this.getJSCommon();
                                    if (obj != null) {
                                        str = obj.toString();
                                    }
                                    jSCommon.click(1, str);
                                    break;
                                case 106:
                                    break;
                            }
                        } else {
                            MBTempContainer.this.f16891C.mo47009a(false, MBTempContainer.this.f17840l, MBTempContainer.this.f17839k);
                        }
                    } else {
                        MBTempContainer.this.f16891C.mo47010b(MBTempContainer.this.f17840l, MBTempContainer.this.f17839k);
                    }
                }
                MBTempContainer.this.f16891C.mo47009a(true, MBTempContainer.this.f17840l, MBTempContainer.this.f17839k);
            } else {
                MBTempContainer.this.getJSCommon().mo48804a((C7068c.C7069a) new C7053c.C7055b(MBTempContainer.this.getJSCommon(), new C6892d()));
                C7068c jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    str = obj.toString();
                }
                jSCommon2.click(1, str);
            }
            super.mo48315a(i, obj);
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$c */
    private final class C6891c extends C7033f {
        private C6891c() {
        }

        /* renamed from: a */
        public final void mo48315a(int i, Object obj) {
            super.mo48315a(i, obj);
            try {
                String str = (String) obj;
                if (MBTempContainer.this.f17846r && !TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int i2 = jSONObject.getInt("type");
                    int i3 = jSONObject.getInt("complete");
                    if (i2 == 2) {
                        int unused = MBTempContainer.this.f16895G = C6204a.f15409s;
                    } else if (i2 != 3) {
                        int unused2 = MBTempContainer.this.f16895G = C6204a.f15407q;
                    } else {
                        int unused3 = MBTempContainer.this.f16895G = C6204a.f15408r;
                    }
                    int unused4 = MBTempContainer.this.f16896H = i3;
                }
            } catch (Exception unused5) {
                C6361q.m16158d("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i == 120) {
                MBTempContainer.this.f16891C.mo47010b(MBTempContainer.this.f17840l, MBTempContainer.this.f17839k);
            } else if (i == 126) {
                MBTempContainer.this.f16891C.mo47009a(false, MBTempContainer.this.f17840l, MBTempContainer.this.f17839k);
            } else if (i != 127) {
                switch (i) {
                    case 100:
                        boolean unused6 = MBTempContainer.this.f16918af = true;
                        MBTempContainer.this.f16927g.postDelayed(MBTempContainer.this.f16921ai, 250);
                        MBTempContainer.this.f16891C.mo47003a();
                        return;
                    case 101:
                    case 102:
                        MBTempContainer.this.getJSCommon().mo48814d();
                        return;
                    case 103:
                        boolean unused7 = MBTempContainer.this.f16910V = true;
                        if (!MBTempContainer.this.f16889A.isMraid()) {
                            MBTempContainer.this.getJSCommon().mo48814d();
                            return;
                        }
                        break;
                    case 104:
                        break;
                    default:
                        return;
                }
                MBTempContainer.m17314l(MBTempContainer.this);
            } else {
                boolean unused8 = MBTempContainer.this.f16910V = true;
                MBTempContainer.this.getJSContainerModule().showEndcard(100);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$d */
    private class C6892d extends C7053c.C7054a {
        private C6892d() {
        }

        /* renamed from: a */
        public final void mo48316a() {
            super.mo48316a();
            MBTempContainer.this.receiveSuccess();
        }

        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.m17327y(MBTempContainer.this);
        }

        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            boolean unused = MBTempContainer.this.f16915ac = true;
            MBTempContainer.m17328z(MBTempContainer.this);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && MBTempContainer.this.f17838j != null) {
                        if (MBTempContainer.this.f17851w) {
                            MBTempContainer.m17314l(MBTempContainer.this);
                        } else {
                            MBTempContainer.this.f17838j.finish();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.m17328z(MBTempContainer.this);
            boolean unused = MBTempContainer.this.f16915ac = true;
        }

        /* renamed from: a */
        public final void mo48318a(boolean z) {
            super.mo48318a(z);
            MBTempContainer.this.f16891C.mo47009a(z, MBTempContainer.this.f17840l, MBTempContainer.this.f17839k);
        }

        /* renamed from: a */
        public final void mo48317a(int i, String str) {
            super.mo48317a(i, str);
            MBTempContainer.this.defaultLoad(i, str);
        }

        /* renamed from: b */
        public final void mo48319b() {
            super.mo48319b();
            if (MBTempContainer.this.f16927g != null) {
                MBTempContainer.this.f16927g.removeCallbacks(MBTempContainer.this.f16928h);
            }
        }
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f16889A = campaignEx;
    }

    public CampaignEx getCampaign() {
        return this.f16889A;
    }

    public void setCampaignExpired(boolean z) {
        try {
            if (this.f16889A == null) {
                return;
            }
            if (z) {
                this.f16889A.setSpareOfferFlag(1);
                if (this.f17841m == null) {
                    return;
                }
                if (this.f17841m.mo49168y() == 1) {
                    this.f16889A.setCbt(1);
                } else {
                    this.f16889A.setCbt(0);
                }
            } else {
                this.f16889A.setSpareOfferFlag(0);
                this.f16889A.setCbt(0);
            }
        } catch (Exception e) {
            C6361q.m16158d(f16888y, e.getMessage());
        }
    }

    public void setCampaignDownLoadTask(C7180a aVar) {
        this.f16890B = aVar;
    }

    public void setShowRewardListener(C6922h hVar) {
        this.f16891C = hVar;
    }

    public void setMBridgeTempCallback(C6913b bVar) {
        this.f16892D = bVar;
    }

    public void setJSFactory(C7158b bVar) {
        this.f16894F = bVar;
    }

    public void setInstanceId(String str) {
        this.f16893E = str;
    }

    public String getInstanceId() {
        return this.f16893E;
    }

    public void setWebViewFront(int i) {
        this.f16907S = i;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        this.f16898J = i;
        this.f16899K = i2;
        this.f16900L = i3;
        this.f16901M = i4;
        this.f16902N = i5;
        String a = C6337h.m16062a(i, i2, i3, i4, i5);
        this.f16903O = a;
        C6361q.m16158d(f16888y, a);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.f16903O)) {
            getJSCommon().mo48809b(this.f16903O);
            if (this.f16924d != null && !TextUtils.isEmpty(this.f16903O)) {
                C6563g.m16891a().mo44522a((WebView) this.f16924d, "oncutoutfetched", Base64.encodeToString(this.f16903O.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.f16925e;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeContainerView mBridgeContainerView = this.f16926f;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i, i2, i3, i4, i5);
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f16904P = str;
    }

    public void onCreate() {
        ViewGroup viewGroup;
        int i;
        int i2;
        if (this.f17841m == null) {
            this.f17841m = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f17839k, this.f17846r);
        }
        this.f16919ag = false;
        try {
            if (!this.f17851w) {
                this.f16891C = new C6917d(getContext(), this.f17846r, this.f17841m, this.f16889A, this.f16891C, mo49032b(), this.f17839k);
            } else if (this.f16889A == null || !C6366u.m16221f(this.f16889A.getMof_template_url())) {
                this.f16891C = new C6916c(this.f16892D, this.f16893E);
            } else {
                this.f16891C = new C6917d(getContext(), this.f17846r, this.f17841m, this.f16889A, this.f16891C, mo49032b(), this.f17839k);
            }
            registerErrorListener(new C6918e(this.f16891C));
            mo49028a(this.f17841m, this.f16889A);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                mo48267a("layoutID not found");
                return;
            }
            View inflate = this.f16905Q.inflate(layoutID, (ViewGroup) null);
            this.f16930z = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f16912a) {
                setMatchParent();
            }
            this.f16924d = findWindVaneWebView();
            MBridgeVideoView findMBridgeVideoView = findMBridgeVideoView();
            this.f16925e = findMBridgeVideoView;
            findMBridgeVideoView.setVideoLayout(this.f16889A);
            this.f16925e.setIsIV(this.f17846r);
            this.f16925e.setUnitId(this.f17839k);
            if (this.f17851w) {
                this.f16925e.setNotchPadding(this.f16899K, this.f16900L, this.f16901M, this.f16902N);
            }
            this.f16926f = findMBridgeContainerView();
            if (this.f17851w) {
                this.f16926f.setNotchPadding(this.f16898J, this.f16899K, this.f16900L, this.f16901M, this.f16902N);
            }
            if (!((this.f16925e == null || this.f16926f == null || !initViews()) ? false : true)) {
                this.f16923c.mo48313a("not found View IDS");
                if (this.f17838j != null) {
                    this.f17838j.finish();
                    return;
                }
                return;
            }
            this.f16922b = true;
            WindVaneWebView windVaneWebView = this.f16924d;
            C7158b bVar = new C7158b(this.f17838j, windVaneWebView, this.f16925e, this.f16926f, this.f16889A, new C6892d());
            this.f16894F = bVar;
            registerJsFactory(bVar);
            if (windVaneWebView != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f16930z.findViewById(C6347k.m16084a(getContext(), "mbridge_video_templete_webview_parent", "id"));
                windVaneWebView.setApiManagerJSFactory(this.f16894F);
                if (windVaneWebView.getParent() != null) {
                    defaultLoad(0, "preload template webview is null or load error");
                    return;
                }
                if (windVaneWebView.getObject() instanceof C7062j) {
                    this.f16894F.mo49051a((C7062j) windVaneWebView.getObject());
                    getJSCommon().mo48801a(this.f17845q);
                    getJSCommon().mo48806a(this.f17839k);
                    getJSCommon().mo48805a(this.f17841m);
                    getJSCommon().mo48804a((C7068c.C7069a) new C6892d());
                    if (this.f16889A != null && (this.f16889A.isMraid() || this.f16889A.isActiveOm())) {
                        C6553d dVar = new C6553d(getContext());
                        this.f16920ah = dVar;
                        dVar.mo44484c();
                        this.f16920ah.mo44481a();
                        this.f16920ah.mo44482a(new C6553d.C6555b() {
                            /* renamed from: a */
                            public final void mo44211a(double d) {
                                String a = MBTempContainer.f16888y;
                                C6361q.m16158d(a, "volume is : " + d);
                                try {
                                    if (MBTempContainer.this.f16889A.isMraid() && MBTempContainer.this.f16926f != null && MBTempContainer.this.f16926f.getH5EndCardView() != null) {
                                        MBTempContainer.this.f16926f.getH5EndCardView().volumeChange(d);
                                    }
                                } catch (Exception e) {
                                    C6361q.m16158d(MBTempContainer.f16888y, e.getMessage());
                                }
                            }
                        });
                    }
                    getJSContainerModule().readyStatus(((C7062j) windVaneWebView.getObject()).mo48846o());
                    if (this.f16924d != null) {
                        int i3 = getResources().getConfiguration().orientation;
                        if (m17301d()) {
                            i2 = C6366u.m16225i(getContext());
                            i = C6366u.m16226j(getContext());
                            if (C6366u.m16061a(getContext())) {
                                int k = C6366u.m16227k(getContext());
                                if (i3 == 2) {
                                    i2 += k;
                                } else {
                                    i += k;
                                }
                            }
                        } else {
                            i2 = C6366u.m16224h(getContext());
                            i = C6366u.m16222g(getContext());
                        }
                        int b = this.f16889A.getRewardTemplateMode().mo43508b();
                        if (mo49033c(this.f16889A) == 1) {
                            b = i3;
                        }
                        getJSNotifyProxy().mo48830a(i3, b, i2, i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C6204a.f15400j, (double) C6366u.m16215d(getContext()));
                        try {
                            if (this.f17843o != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("name", this.f17843o.mo49082a());
                                jSONObject2.put("amount", this.f17843o.mo49085b());
                                jSONObject2.put("id", this.f17844p);
                                jSONObject.put(DataKeys.USER_ID, this.f17842n);
                                jSONObject.put("reward", jSONObject2);
                                jSONObject.put("playVideoMute", this.f17845q);
                                jSONObject.put("extra", this.f16904P);
                            }
                        } catch (JSONException e) {
                            C6361q.m16154a(f16888y, e.getMessage());
                        } catch (Exception e2) {
                            C6361q.m16154a(f16888y, e2.getMessage());
                        }
                        getJSNotifyProxy().mo48833a((Object) jSONObject.toString());
                        C6563g.m16891a().mo44522a((WebView) this.f16924d, "oncutoutfetched", Base64.encodeToString(this.f16903O.getBytes(), 0));
                        getJSCommon().mo48810b(true);
                        loadModuleDatas();
                        this.f16927g.postDelayed(this.f16928h, 2000);
                    }
                    ((C7062j) windVaneWebView.getObject()).f17556l.mo48316a();
                    if (this.f17851w) {
                        getJSCommon().mo48817e(this.f16907S);
                    }
                }
                if (getJSCommon().mo48800a() == 1 && (viewGroup = (ViewGroup) this.f16930z.findViewById(C6347k.m16084a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
                    ((ViewGroup) this.f16930z).removeView(viewGroup);
                    ((ViewGroup) this.f16930z).addView(viewGroup, 1);
                }
                viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            defaultLoad(0, "preload template webview is null or load error");
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                e3.printStackTrace();
            }
        } catch (Throwable th) {
            mo48267a("onCreate error" + th);
        }
    }

    public void loadModuleDatas() {
        int i;
        C7062j b = mo49031b(this.f16889A);
        if (b != null) {
            i = b.mo48826k();
        } else {
            i = 0;
        }
        if (i != 0) {
            this.f17845q = i;
        }
        int f = this.f17841m.mo49132f();
        int c = m17296c();
        int i2 = c != 0 ? c : f;
        this.f16925e.setSoundState(this.f17845q);
        this.f16925e.setCampaign(this.f16889A);
        this.f16925e.setPlayURL(this.f16890B.mo49198n());
        this.f16925e.setVideoSkipTime(this.f17841m.mo49130e());
        this.f16925e.setCloseAlert(this.f17841m.mo49138i());
        this.f16925e.setBufferTimeout(m17308g());
        this.f16925e.setNotifyListener(new C7045n(this.f16894F, this.f16889A, this.f17843o, this.f16890B, mo49032b(), this.f17839k, i2, this.f17841m.mo49130e(), new C6893e(), this.f17841m.mo49167x(), this.f17841m.mo49168y(), this.f17851w));
        this.f16925e.setShowingTransparent(this.f16914ab);
        if (this.f17846r && (this.f17848t == C6204a.f15403m || this.f17848t == C6204a.f15404n)) {
            this.f16925e.setIVRewardEnable(this.f17848t, this.f17849u, this.f17850v);
            this.f16925e.setDialogRole(getJSCommon() != null ? getJSCommon().mo48822h() : 1);
        }
        this.f16926f.setCampaign(this.f16889A);
        this.f16926f.setUnitID(this.f17839k);
        this.f16926f.setCloseDelayTime(this.f17841m.mo49148n());
        this.f16926f.setPlayCloseBtnTm(this.f17841m.mo49136h());
        this.f16926f.setVideoInteractiveType(this.f17841m.mo49134g());
        this.f16926f.setEndscreenType(this.f17841m.mo49150o());
        this.f16926f.setVideoSkipTime(this.f17841m.mo49130e());
        this.f16926f.setShowingTransparent(this.f16914ab);
        this.f16926f.setJSFactory(this.f16894F);
        if (this.f16889A.getPlayable_ads_without_video() == 2) {
            this.f16926f.setNotifyListener(new C7035h(this.f16889A, this.f16890B, this.f17843o, mo49032b(), this.f17839k, new C6891c(), this.f17841m.mo49168y(), this.f17851w));
            this.f16926f.preLoadData(this.f16894F);
            this.f16926f.showPlayableView();
        } else {
            this.f16926f.setNotifyListener(new C7030c(this.f16894F, this.f16889A, this.f17843o, this.f16890B, mo49032b(), this.f17839k, new C6890b(this.f17838j, this.f16889A), this.f17841m.mo49168y(), this.f17851w));
            this.f16926f.preLoadData(this.f16894F);
            this.f16925e.preLoadData(this.f16894F);
        }
        if (this.f16914ab) {
            this.f16926f.setMBridgeClickMiniCardViewTransparent();
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m17314l(MBTempContainer mBTempContainer) {
        try {
            if (mBTempContainer.f16892D != null) {
                if (mBTempContainer.f17846r && (mBTempContainer.f17848t == C6204a.f15403m || mBTempContainer.f17848t == C6204a.f15404n)) {
                    C6913b bVar = mBTempContainer.f16892D;
                    boolean z = true;
                    if (mBTempContainer.f16896H != 1) {
                        z = false;
                    }
                    bVar.mo48350a(z, mBTempContainer.f16895G);
                }
                mBTempContainer.f16892D.mo48349a(mBTempContainer.f16893E, mBTempContainer.f16910V, mBTempContainer.f17843o);
            } else if (mBTempContainer.f17838j != null) {
                mBTempContainer.f17838j.finish();
            }
        } catch (Exception unused) {
            if (mBTempContainer.f17838j != null) {
                mBTempContainer.f17838j.finish();
            }
        }
    }

    /* renamed from: y */
    static /* synthetic */ void m17327y(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f17838j.runOnUiThread(new Runnable() {
                public final void run() {
                    MBTempContainer.this.f16908T.setBackgroundColor(0);
                    MBTempContainer.this.f16908T.setVisibility(0);
                    MBTempContainer.this.f16908T.bringToFront();
                }
            });
        }
    }

    /* renamed from: z */
    static /* synthetic */ void m17328z(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f17838j.runOnUiThread(new Runnable() {
                public final void run() {
                    MBTempContainer.this.f16908T.setVisibility(8);
                }
            });
        }
    }
}
