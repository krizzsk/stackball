package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C6305b;
import com.mbridge.msdk.foundation.tools.C6337h;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.video.dynview.p219b.C6929a;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.video.module.p231a.p232a.C7034g;
import com.mbridge.msdk.video.module.p231a.p232a.C7036i;
import com.mbridge.msdk.video.module.p231a.p232a.C7041l;
import com.mbridge.msdk.video.module.p233b.C7047a;
import com.mbridge.msdk.video.signal.C7155e;
import com.mbridge.msdk.video.signal.C7159g;
import com.mbridge.msdk.video.signal.factory.C7158b;

public class MBridgeContainerView extends MBridgeBaseView implements C7155e, C7159g {

    /* renamed from: A */
    private boolean f17300A = false;

    /* renamed from: B */
    private int f17301B;

    /* renamed from: C */
    private boolean f17302C = false;

    /* renamed from: D */
    private int f17303D;

    /* renamed from: E */
    private int f17304E;

    /* renamed from: F */
    private int f17305F;

    /* renamed from: G */
    private int f17306G;

    /* renamed from: H */
    private int f17307H;

    /* renamed from: I */
    private String f17308I;

    /* renamed from: J */
    private C7158b f17309J;

    /* renamed from: K */
    private boolean f17310K = false;

    /* renamed from: L */
    private boolean f17311L = false;

    /* renamed from: j */
    private MBridgePlayableView f17312j;

    /* renamed from: k */
    private MBridgeClickCTAView f17313k;

    /* renamed from: l */
    private MBridgeClickMiniCardView f17314l;

    /* renamed from: m */
    private MBridgeNativeEndCardView f17315m;

    /* renamed from: n */
    private MBridgeH5EndCardView f17316n;

    /* renamed from: o */
    private MBridgeVastEndCardView f17317o;

    /* renamed from: p */
    private MBridgeLandingPageView f17318p;

    /* renamed from: q */
    private MBridgeAlertWebview f17319q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f17320r;

    /* renamed from: s */
    private int f17321s;

    /* renamed from: t */
    private int f17322t = 1;

    /* renamed from: u */
    private int f17323u = 1;

    /* renamed from: v */
    private int f17324v = 1;

    /* renamed from: w */
    private boolean f17325w = false;

    /* renamed from: x */
    private boolean f17326x = false;

    /* renamed from: y */
    private boolean f17327y = false;

    /* renamed from: z */
    private boolean f17328z = true;

    public void setJSFactory(C7158b bVar) {
        this.f17309J = bVar;
    }

    public int getVideoSkipTime() {
        return this.f17301B;
    }

    public void setVideoSkipTime(int i) {
        this.f17301B = i;
    }

    public MBridgeContainerView(Context context) {
        super(context);
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        setVisibility(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f17312j, this.f17313k, this.f17314l, this.f17315m, this.f17316n, this.f17317o, this.f17318p};
        for (int i = 0; i < 7; i++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i];
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void preLoadData(final C7158b bVar) {
        this.f17309J = bVar;
        if (this.f17275b != null) {
            if (this.f17275b.getPlayable_ads_without_video() == 2) {
                if (this.f17312j == null) {
                    this.f17312j = new MBridgePlayableView(this.f17274a);
                }
                this.f17312j.setCloseDelayShowTime(this.f17323u);
                this.f17312j.setPlayCloseBtnTm(this.f17324v);
                this.f17312j.setCampaign(this.f17275b);
                this.f17312j.setNotifyListener(new C7036i(this.f17278e) {
                    /* renamed from: a */
                    public final void mo48315a(int i, Object obj) {
                        super.mo48315a(i, obj);
                        if (i == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            C6203m mVar = new C6203m();
                            mVar.mo43741k(MBridgeContainerView.this.f17275b.getRequestId());
                            mVar.mo43743l(MBridgeContainerView.this.f17275b.getRequestIdNotice());
                            mVar.mo43747n(MBridgeContainerView.this.f17275b.getId());
                            mVar.mo43718a(MBridgeContainerView.this.f17275b.isMraid() ? C6203m.f15357a : C6203m.f15358b);
                            C6305b.m15964a(mVar, MBridgeContainerView.this.f17274a, MBridgeContainerView.this.f17320r);
                        }
                    }
                });
                this.f17312j.preLoadData(bVar);
            } else {
                m17651b(this.f17321s);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                        mBridgeContainerView.m17649a(bVar, Integer.valueOf(mBridgeContainerView.f17275b.getVideo_end_type()));
                    }
                }, (long) getVideoSkipTime());
            }
            m17654g();
        }
    }

    public void showPlayableView() {
        if (this.f17275b != null) {
            removeAllViews();
            setMatchParent();
            if (this.f17312j == null) {
                preLoadData(this.f17309J);
            }
            addView(this.f17312j);
            MBridgePlayableView mBridgePlayableView = this.f17312j;
            if (mBridgePlayableView != null) {
                mBridgePlayableView.setUnitId(this.f17320r);
                if (this.f17275b != null && this.f17275b.isMraid() && this.f17275b.getPlayable_ads_without_video() == 2) {
                    this.f17312j.setCloseVisible(0);
                }
            }
            this.f17311L = true;
            bringToFront();
        }
    }

    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f17319q;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (!(viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1) && !this.f17311L) {
            removeAllViews();
            bringToFront();
            this.f17310K = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f17314l;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f17319q == null) {
            m17654g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.f17319q;
        if (!(mBridgeAlertWebview2 == null || mBridgeAlertWebview2.getParent() == null)) {
            removeView(this.f17319q);
        }
        addView(this.f17319q);
        setBackgroundColor(0);
        this.f17319q.webviewshow();
        return true;
    }

    public void showVideoClickView(int i) {
        if (this.f17275b == null) {
            return;
        }
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    MBridgeClickCTAView mBridgeClickCTAView = this.f17313k;
                    if (!(mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null)) {
                        removeView(this.f17313k);
                    }
                    MBridgeAlertWebview mBridgeAlertWebview = this.f17319q;
                    if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
                        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f17314l;
                        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getParent() == null) {
                            try {
                                if (this.f17275b != null && this.f17275b.getPlayable_ads_without_video() == 1) {
                                    setMatchParent();
                                    m17653f();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
                            if (!(mBridgeH5EndCardView == null || mBridgeH5EndCardView.getParent() == null)) {
                                removeView(this.f17316n);
                            }
                            this.f17278e.mo48315a(112, "");
                            if (this.f17275b != null && !this.f17275b.isHasReportAdTrackPause()) {
                                this.f17275b.setHasReportAdTrackPause(true);
                                C7047a.m17797f(this.f17274a, this.f17275b);
                            }
                            if (this.f17327y) {
                                this.f17278e.mo48315a(115, "");
                            } else {
                                this.f17311L = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.f17326x = true;
                            return;
                        }
                        m17655h();
                    }
                }
            } else if (!this.f17325w) {
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f17316n;
                if (!(mBridgeH5EndCardView2 == null || mBridgeH5EndCardView2.getParent() == null)) {
                    removeView(this.f17316n);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f17314l;
                if (!(mBridgeClickMiniCardView2 == null || mBridgeClickMiniCardView2.getParent() == null)) {
                    removeView(this.f17314l);
                }
                MBridgeClickCTAView mBridgeClickCTAView2 = this.f17313k;
                if (mBridgeClickCTAView2 == null || mBridgeClickCTAView2.getParent() == null) {
                    try {
                        if (this.f17275b != null && this.f17275b.getPlayable_ads_without_video() == 1) {
                            this.f17311L = true;
                            if (this.f17313k == null) {
                                m17651b(-1);
                            }
                            if (this.f17313k != null) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f17313k, 0, layoutParams);
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                }
            }
        } else if (!isLast() && !endCardShowing()) {
            m17655h();
        }
    }

    public void showEndcard(int i) {
        if (this.f17275b != null) {
            if (i == 1) {
                this.f17278e.mo48315a(104, "");
            } else if (i == 100) {
                m17647a((View) this.f17312j);
                setMatchParent();
                m17652e();
            } else if (i == 3) {
                removeAllViews();
                setMatchParent();
                if (this.f17317o == null) {
                    m17649a(this.f17309J, 3);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                addView(this.f17317o, layoutParams);
                this.f17317o.notifyShowListener();
                this.f17311L = true;
                bringToFront();
            } else if (i == 4) {
                this.f17278e.mo48315a(113, "");
                removeAllViews();
                setMatchParent();
                if (this.f17318p == null) {
                    m17649a(this.f17309J, 4);
                }
                this.f17318p.preLoadData(this.f17309J);
                addView(this.f17318p);
                this.f17311L = true;
                bringToFront();
            } else if (i != 5) {
                removeAllViews();
                setMatchParent();
                this.f17311L = true;
                bringToFront();
                m17646a();
                this.f17278e.mo48315a(117, "");
            } else {
                this.f17278e.mo48315a(106, "");
            }
        }
        this.f17325w = true;
    }

    public boolean endCardShowing() {
        return this.f17325w;
    }

    public boolean miniCardShowing() {
        return this.f17326x;
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f17314l;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    public void toggleCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.f17312j;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void notifyCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.f17312j;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        if (this.f17275b != null) {
            this.f17278e.mo48315a(122, "");
            this.f17278e.mo48315a(104, "");
        }
    }

    public void readyStatus(int i) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i);
        }
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.f17302C) {
                return;
            }
        }
        m17646a();
    }

    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f17314l;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i, i2, i3, i4);
            this.f17314l.setRadius(i5);
            this.f17314l.setCloseVisible(8);
            this.f17314l.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f17311L = true;
            bringToFront();
            m17653f();
            if (!this.f17300A) {
                this.f17300A = true;
                this.f17278e.mo48315a(109, "");
                this.f17278e.mo48315a(117, "");
            }
        }
    }

    public void resizeMiniCard(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f17314l;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i, i2);
            this.f17314l.setRadius(i3);
            removeAllViews();
            setMatchParent();
            this.f17311L = true;
            bringToFront();
            m17653f();
        }
    }

    public void configurationChanged(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f17314l;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getVisibility() == 0) {
            this.f17314l.resizeMiniCard(i, i2);
        }
    }

    public void webviewshow() {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f17312j, this.f17314l, this.f17316n, this.f17319q};
        for (int i = 0; i < 4; i++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    public void install(CampaignEx campaignEx) {
        this.f17278e.mo48315a(105, campaignEx);
    }

    public void orientation(Configuration configuration) {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f17312j, this.f17314l, this.f17316n, this.f17319q};
        for (int i = 0; i < 4; i++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public void setNotifyListener(C7027a aVar) {
        super.setNotifyListener(aVar);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f17312j, this.f17313k, this.f17314l, this.f17315m, this.f17316n, this.f17317o, this.f17318p};
        for (int i = 0; i < 7; i++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new C7034g(this.f17314l, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new C7036i(aVar));
                }
            }
        }
    }

    public void defaultShow() {
        super.defaultShow();
    }

    public void addView(View view) {
        if (view != null) {
            m17647a(view);
            super.addView(view);
            return;
        }
        C6361q.m16158d(MBridgeBaseView.TAG, "view is null");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            m17647a(view);
            super.addView(view, layoutParams);
            return;
        }
        C6361q.m16158d(MBridgeBaseView.TAG, "view is null");
    }

    public boolean canBackPress() {
        if (this.f17315m != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f17318p;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f17312j;
        if (mBridgePlayableView != null) {
            return mBridgePlayableView.canBackPress();
        }
        return false;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public void setShowingTransparent(boolean z) {
        this.f17327y = z;
    }

    public boolean getShowingTransparent() {
        return this.f17327y;
    }

    public String getUnitID() {
        return this.f17320r;
    }

    public void setUnitID(String str) {
        this.f17320r = str;
    }

    public void setVideoInteractiveType(int i) {
        this.f17321s = i;
    }

    public void setEndscreenType(int i) {
        this.f17322t = i;
    }

    public int getVideoInteractiveType() {
        return this.f17321s;
    }

    public void setCloseDelayTime(int i) {
        this.f17323u = i;
    }

    public void setPlayCloseBtnTm(int i) {
        this.f17324v = i;
    }

    /* renamed from: a */
    private void m17647a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                C6361q.m16155a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    /* renamed from: a */
    private void m17646a() {
        if (this.f17275b != null && C6366u.m16221f(this.f17275b.getMof_template_url())) {
            m17652e();
        } else if (this.f17322t != 2 || this.f17302C) {
            m17652e();
        } else {
            m17650b();
        }
    }

    /* renamed from: b */
    private void m17650b() {
        if (this.f17316n == null) {
            m17649a(this.f17309J, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
        if (mBridgeH5EndCardView == null || !mBridgeH5EndCardView.isLoadSuccess()) {
            m17652e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f17316n;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f17316n.setError(true);
            }
        } else {
            this.f17302C = true;
            addView(this.f17316n);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f17316n.excuteTask();
            this.f17316n.setNotchValue(this.f17308I, this.f17303D, this.f17304E, this.f17305F, this.f17306G);
            C6203m mVar = new C6203m();
            mVar.mo43741k(this.f17275b.getRequestId());
            mVar.mo43743l(this.f17275b.getRequestIdNotice());
            mVar.mo43747n(this.f17275b.getId());
            mVar.mo43718a(this.f17275b.isMraid() ? C6203m.f15357a : C6203m.f15358b);
            C6305b.m15964a(mVar, this.f17274a, this.f17320r);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f17316n;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f17320r);
        }
    }

    /* renamed from: e */
    private void m17652e() {
        this.f17322t = 1;
        if (this.f17315m == null) {
            m17649a(this.f17309J, 2);
        }
        addView(this.f17315m);
        onConfigurationChanged(getResources().getConfiguration());
        this.f17315m.notifyShowListener();
        this.f17311L = true;
        bringToFront();
    }

    /* renamed from: f */
    private void m17653f() {
        if (this.f17314l == null) {
            m17651b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f17327y && this.f17328z) {
            this.f17328z = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f17314l, layoutParams);
    }

    /* renamed from: g */
    private void m17654g() {
        if (this.f17319q == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f17274a);
            this.f17319q = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f17320r);
            this.f17319q.setCampaign(this.f17275b);
        }
        this.f17319q.preLoadData(this.f17309J);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17649a(C7158b bVar, Integer num) {
        this.f17309J = bVar;
        if (this.f17275b != null) {
            if (num == null) {
                num = Integer.valueOf(this.f17275b.getVideo_end_type());
            }
            if (!isLast()) {
                m17655h();
            }
            int intValue = num.intValue();
            if (intValue == 1) {
                return;
            }
            if (intValue == 3) {
                if (this.f17317o == null) {
                    this.f17317o = new MBridgeVastEndCardView(this.f17274a);
                }
                this.f17317o.setCampaign(this.f17275b);
                this.f17317o.setNotifyListener(new C7041l(this.f17278e));
                this.f17317o.preLoadData(bVar);
            } else if (intValue == 4) {
                if (this.f17318p == null) {
                    this.f17318p = new MBridgeLandingPageView(this.f17274a);
                }
                this.f17318p.setCampaign(this.f17275b);
                this.f17318p.setNotifyListener(new C7036i(this.f17278e));
            } else if (intValue == 5) {
            } else {
                if (this.f17322t != 2) {
                    if (this.f17315m == null) {
                        if (this.f17275b == null || TextUtils.isEmpty(this.f17275b.getMof_template_url()) || !C6366u.m16221f(this.f17275b.getMof_template_url())) {
                            this.f17315m = new MBridgeNativeEndCardView(this.f17274a);
                        } else {
                            this.f17315m = new MBridgeNativeEndCardView(this.f17274a, (AttributeSet) null, true);
                            C6929a.m17503a().mo48438a(this.f17315m, this.f17275b, new C7036i(this.f17278e));
                        }
                    }
                    this.f17315m.setCampaign(this.f17275b);
                    this.f17315m.setUnitId(this.f17320r);
                    this.f17315m.setCloseBtnDelay(this.f17323u);
                    this.f17315m.setNotifyListener(new C7036i(this.f17278e));
                    this.f17315m.preLoadData(bVar);
                    this.f17315m.setNotchPadding(this.f17303D, this.f17304E, this.f17305F, this.f17306G);
                } else if (this.f17275b == null || !C6366u.m16221f(this.f17275b.getMof_template_url())) {
                    if (this.f17316n == null) {
                        this.f17316n = new MBridgeH5EndCardView(this.f17274a);
                    }
                    this.f17316n.setCampaign(this.f17275b);
                    this.f17316n.setCloseDelayShowTime(this.f17323u);
                    this.f17316n.setNotifyListener(new C7036i(this.f17278e));
                    this.f17316n.setUnitId(this.f17320r);
                    this.f17316n.setNotchValue(this.f17308I, this.f17303D, this.f17304E, this.f17305F, this.f17306G);
                    this.f17316n.preLoadData(bVar);
                    if (!this.f17327y) {
                        addView(this.f17316n);
                    }
                }
            }
        }
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.indexOfChild(this) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m17655h() {
        this.f17326x = false;
        this.f17311L = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof MBridgeContainerView)) {
                    viewGroup.bringChildToFront(childAt);
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    private void m17651b(int i) {
        if (this.f17275b != null && C6366u.m16221f(this.f17275b.getMof_template_url())) {
            i = -3;
        }
        if (i == -3) {
            return;
        }
        if (i != -2) {
            if (this.f17313k == null) {
                this.f17313k = new MBridgeClickCTAView(this.f17274a);
            }
            this.f17313k.setCampaign(this.f17275b);
            this.f17313k.setUnitId(this.f17320r);
            this.f17313k.setNotifyListener(new C7036i(this.f17278e));
            this.f17313k.preLoadData(this.f17309J);
        } else if (this.f17275b != null && this.f17275b.getVideo_end_type() == 2) {
            if (this.f17314l == null) {
                this.f17314l = new MBridgeClickMiniCardView(this.f17274a);
            }
            this.f17314l.setCampaign(this.f17275b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f17314l;
            mBridgeClickMiniCardView.setNotifyListener(new C7034g(mBridgeClickMiniCardView, this.f17278e));
            this.f17314l.preLoadData(this.f17309J);
            setMatchParent();
            m17653f();
            m17655h();
        }
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f17314l;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f17314l.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f17312j;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f17326x) {
            this.f17278e.mo48315a(107, "");
        }
    }

    public void onEndcardBackPress() {
        if (this.f17315m != null || this.f17317o != null) {
            this.f17278e.mo48315a(104, "");
        } else if (this.f17318p != null) {
            this.f17278e.mo48315a(103, "");
        } else {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.onBackPress();
            }
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f17316n = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f17312j;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f17318p;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
        return mBridgeH5EndCardView == null ? this.f17312j : mBridgeH5EndCardView;
    }

    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.f17310K && !this.f17311L) {
                m17655h();
                this.f17310K = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f17319q;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.f17319q);
                MBridgeClickCTAView mBridgeClickCTAView = this.f17313k;
                if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                    setWrapContent();
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
                    }
                }
            }
        }
    }

    public void ivRewardAdsWithoutVideo(String str) {
        this.f17278e.mo48315a(103, str);
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        C6361q.m16158d(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i)}));
        this.f17307H = i;
        this.f17303D = i2;
        this.f17304E = i3;
        this.f17305F = i4;
        this.f17306G = i5;
        this.f17308I = C6337h.m16062a(i, i2, i3, i4, i5);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f17315m;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f17316n;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f17348m != null) {
            this.f17316n.setNotchValue(this.f17308I, i2, i3, i4, i5);
            C6563g.m16891a().mo44522a((WebView) this.f17316n.f17348m, "oncutoutfetched", Base64.encodeToString(this.f17308I.getBytes(), 0));
        }
    }
}
