package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.AppEventsConstants;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.dynview.C6923a;
import com.mbridge.msdk.video.dynview.p220c.C6931a;
import com.mbridge.msdk.video.dynview.p221d.C6934c;
import com.mbridge.msdk.video.dynview.p230i.C6983c;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.video.module.p233b.C7047a;
import com.mbridge.msdk.video.signal.C7161i;
import com.mbridge.msdk.video.signal.factory.C7158b;
import com.mbridge.msdk.video.widget.SoundImageView;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.download.C7184c;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import com.mbridge.msdk.widget.C7215a;
import com.mbridge.msdk.widget.dialog.C7218a;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import org.json.JSONException;
import org.json.JSONObject;

public class MBridgeVideoView extends MBridgeBaseView implements C7161i {
    /* access modifiers changed from: private */

    /* renamed from: P */
    public static boolean f17420P = false;

    /* renamed from: j */
    private static int f17421j;

    /* renamed from: k */
    private static int f17422k;

    /* renamed from: l */
    private static int f17423l;

    /* renamed from: m */
    private static int f17424m;

    /* renamed from: n */
    private static int f17425n;

    /* renamed from: A */
    private C7218a f17426A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f17427B = "";

    /* renamed from: C */
    private double f17428C;

    /* renamed from: D */
    private double f17429D;

    /* renamed from: E */
    private boolean f17430E = false;

    /* renamed from: F */
    private boolean f17431F = false;

    /* renamed from: G */
    private boolean f17432G = false;

    /* renamed from: H */
    private boolean f17433H = false;

    /* renamed from: I */
    private boolean f17434I = false;

    /* renamed from: J */
    private boolean f17435J = false;

    /* renamed from: K */
    private boolean f17436K = false;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f17437L = false;

    /* renamed from: M */
    private boolean f17438M = false;

    /* renamed from: N */
    private int f17439N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f17440O = false;

    /* renamed from: Q */
    private int f17441Q = 2;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f17442R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public int f17443S;

    /* renamed from: T */
    private int f17444T;

    /* renamed from: U */
    private int f17445U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f17446V = false;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f17447W = false;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public boolean f17448aa = false;
    /* access modifiers changed from: private */

    /* renamed from: ab */
    public boolean f17449ab = true;
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public boolean f17450ac = false;
    /* access modifiers changed from: private */

    /* renamed from: ad */
    public boolean f17451ad = false;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public boolean f17452ae = false;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public AlphaAnimation f17453af;

    /* renamed from: ag */
    private C7026b f17454ag = new C7026b(this);

    /* renamed from: ah */
    private boolean f17455ah = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public PlayerView f17456o;

    /* renamed from: p */
    private SoundImageView f17457p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public TextView f17458q;

    /* renamed from: r */
    private View f17459r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public FrameLayout f17460s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C7027a f17461t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f17462u = false;

    /* renamed from: v */
    private String f17463v;

    /* renamed from: w */
    private int f17464w;

    /* renamed from: x */
    private int f17465x;

    /* renamed from: y */
    private int f17466y;

    /* renamed from: z */
    private MBAlertDialog f17467z;

    public void init(Context context) {
    }

    public void setContainerViewOnNotifyListener(C7027a aVar) {
        this.f17461t = aVar;
    }

    public boolean isShowingAlertView() {
        return this.f17462u;
    }

    public void setUnitId(String str) {
        this.f17427B = str;
        C7026b bVar = this.f17454ag;
        if (bVar != null) {
            bVar.mo48771a(str);
        }
    }

    public String getUnitId() {
        return this.f17427B;
    }

    public boolean isMiniCardShowing() {
        return this.f17433H;
    }

    public boolean isShowingTransparent() {
        return this.f17438M;
    }

    public void setShowingTransparent(boolean z) {
        this.f17438M = z;
    }

    public MBridgeVideoView(Context context) {
        super(context);
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f17282i = C6366u.m16221f(campaignEx.getMof_template_url());
        }
        if (this.f17282i) {
            C6923a.m17464a().mo48419a(new C6983c().mo48505a(this, "mbridge_reward_layer_floor", 2, campaignEx.getCampaignUnitId()), new C6934c() {
                /* renamed from: a */
                public final void mo48343a(View view) {
                    ViewGroup viewGroup = this;
                    if (!(viewGroup == null || view == null)) {
                        viewGroup.addView(view);
                    }
                    view.setOnClickListener(new C7215a() {
                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public final void mo48366a(View view) {
                            JSONObject jSONObject;
                            JSONException e;
                            if (MBridgeVideoView.this.f17461t != null) {
                                try {
                                    jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put(C6204a.f15397g, MBridgeVideoView.this.mo48577a(0));
                                    } catch (JSONException e2) {
                                        e = e2;
                                    }
                                } catch (JSONException e3) {
                                    JSONException jSONException = e3;
                                    jSONObject = null;
                                    e = jSONException;
                                    e.printStackTrace();
                                    MBridgeVideoView.this.f17461t.mo48315a(105, jSONObject);
                                    C7047a.m17795d(C6122a.m15302b().mo42895d(), MBridgeVideoView.this.f17275b);
                                }
                                MBridgeVideoView.this.f17461t.mo48315a(105, jSONObject);
                                C7047a.m17795d(C6122a.m15302b().mo42895d(), MBridgeVideoView.this.f17275b);
                            }
                        }
                    });
                    MBridgeVideoView.this.m17710a();
                    boolean unused = MBridgeVideoView.f17420P = false;
                }

                /* renamed from: a */
                public final void mo48344a(C6931a aVar) {
                    C6361q.m16158d(MBridgeBaseView.TAG, "errorMsg：" + aVar.mo48442b());
                }
            });
            return;
        }
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f17276c.inflate(findLayout, this);
            m17710a();
        }
        f17420P = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17710a() {
        this.f17279f = m17721e();
        if (!this.f17279f) {
            C6361q.m16158d(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        mo48578c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f17453af = alphaAnimation;
        alphaAnimation.setDuration(200);
    }

    public void setIsIV(boolean z) {
        this.f17440O = z;
        C7026b bVar = this.f17454ag;
        if (bVar != null) {
            bVar.mo48772a(z);
        }
    }

    public void setCampaign(CampaignEx campaignEx) {
        int i;
        super.setCampaign(campaignEx);
        C7026b bVar = this.f17454ag;
        if (bVar != null) {
            bVar.mo48770a(campaignEx);
            C7026b bVar2 = this.f17454ag;
            if (campaignEx == null || TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                i = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f17427B, false).mo49152p();
            } else if (campaignEx.getReady_rate() != -1) {
                i = campaignEx.getReady_rate();
            } else {
                i = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f17427B, false).mo49152p();
            }
            bVar2.mo48769a(i, C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f17427B, false).mo49154q());
        }
    }

    public void setSoundState(int i) {
        this.f17441Q = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48578c() {
        super.mo48578c();
        if (this.f17279f) {
            if (!this.f17282i) {
                this.f17456o.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        MBridgeVideoView.this.f17278e.mo48315a(1, "");
                    }
                });
            }
            this.f17457p.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    int i = 2;
                    if (MBridgeVideoView.this.f17456o.isSilent()) {
                        i = 1;
                    }
                    MBridgeVideoView.this.f17278e.mo48315a(5, i);
                }
            });
            this.f17459r.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeVideoView.this.f17440O) {
                        boolean unused = MBridgeVideoView.this.f17452ae = true;
                        if (!MBridgeVideoView.this.f17449ab) {
                            MBridgeVideoView.this.f17278e.mo48315a(123, "");
                        } else {
                            MBridgeVideoView.this.m17714b();
                        }
                    } else {
                        MBridgeVideoView.this.m17714b();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17714b() {
        try {
            if (this.f17440O) {
                if (this.f17443S == C6204a.f15403m || this.f17443S == C6204a.f15404n) {
                    if (this.f17446V) {
                        if (this.f17443S == C6204a.f15404n) {
                            this.f17278e.mo48315a(2, m17713b(this.f17450ac));
                            return;
                        }
                        return;
                    } else if (this.f17443S == C6204a.f15404n && this.f17452ae) {
                        this.f17278e.mo48315a(2, m17713b(this.f17450ac));
                        return;
                    } else if (this.f17449ab) {
                        int curPosition = this.f17456o.getCurPosition() / 1000;
                        int videoLength = (int) ((((float) curPosition) / ((float) (this.f17456o.getDuration() == 0 ? this.f17275b.getVideoLength() : this.f17456o.getDuration()))) * 100.0f);
                        if (this.f17443S == C6204a.f15403m) {
                            m17725f();
                            if (this.f17444T == C6204a.f15405o && videoLength >= this.f17445U) {
                                this.f17278e.mo48315a(2, m17713b(this.f17450ac));
                                return;
                            } else if (this.f17444T != C6204a.f15406p || curPosition < this.f17445U) {
                                this.f17278e.mo48315a(8, "");
                            } else {
                                this.f17278e.mo48315a(2, m17713b(this.f17450ac));
                                return;
                            }
                        }
                        if (this.f17443S != C6204a.f15404n) {
                            return;
                        }
                        if (this.f17444T == C6204a.f15405o && videoLength >= this.f17445U) {
                            m17725f();
                            this.f17278e.mo48315a(8, "");
                            return;
                        } else if (this.f17444T == C6204a.f15406p && curPosition >= this.f17445U) {
                            m17725f();
                            this.f17278e.mo48315a(8, "");
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (this.f17464w <= -1 || this.f17466y != 1 || this.f17438M) {
                this.f17278e.mo48315a(2, "");
                return;
            }
            m17725f();
            this.f17278e.mo48315a(8, "");
        } catch (Exception e) {
            C6361q.m16158d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void hideAlertView(int i) {
        if (this.f17462u) {
            this.f17462u = false;
            this.f17446V = true;
            setShowingAlertViewCover(false);
            C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f17427B, false);
            C6323d.m16034a(this.f17274a, this.f17275b, C7179c.f17915a, this.f17427B, 1, i);
            if (i == 0) {
                m17727g();
                if (!this.f17440O) {
                    return;
                }
                if (this.f17443S == C6204a.f15404n || this.f17443S == C6204a.f15403m) {
                    this.f17447W = true;
                    this.f17278e.mo48315a(124, "");
                    this.f17451ad = true;
                    gonePlayingCloseView();
                    return;
                }
                return;
            }
            this.f17448aa = true;
            if (this.f17440O && this.f17443S == C6204a.f15404n) {
                m17727g();
            } else if (!this.f17440O || this.f17443S != C6204a.f15403m) {
                this.f17278e.mo48315a(2, "");
            } else {
                this.f17278e.mo48315a(2, m17713b(this.f17450ac));
            }
        }
    }

    public void alertWebViewShowed() {
        this.f17462u = true;
        setShowingAlertViewCover(true);
    }

    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.f17467z;
        if (mBAlertDialog != null) {
            mBAlertDialog.dismiss();
        }
        this.f17278e.mo48315a(125, "");
    }

    public void showAlertView() {
        if (!this.f17433H) {
            if (this.f17426A == null) {
                this.f17426A = new C7218a() {
                    /* renamed from: a */
                    public final void mo44064a() {
                        boolean unused = MBridgeVideoView.this.f17462u = false;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f17462u);
                        if (MBridgeVideoView.this.f17440O && (MBridgeVideoView.this.f17443S == C6204a.f15404n || MBridgeVideoView.this.f17443S == C6204a.f15403m)) {
                            boolean unused2 = MBridgeVideoView.this.f17447W = true;
                            MBridgeVideoView.this.f17278e.mo48315a(124, "");
                            boolean unused3 = MBridgeVideoView.this.f17451ad = true;
                            MBridgeVideoView.this.gonePlayingCloseView();
                        }
                        MBridgeVideoView.this.m17727g();
                        C6323d.m16034a(MBridgeVideoView.this.f17274a, MBridgeVideoView.this.f17275b, MBridgeVideoView.this.f17442R, MBridgeVideoView.this.f17427B, 1, 0);
                    }

                    /* renamed from: b */
                    public final void mo44065b() {
                        boolean unused = MBridgeVideoView.this.f17462u = false;
                        boolean unused2 = MBridgeVideoView.this.f17448aa = true;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f17462u);
                        C6323d.m16034a(MBridgeVideoView.this.f17274a, MBridgeVideoView.this.f17275b, MBridgeVideoView.this.f17442R, MBridgeVideoView.this.f17427B, 1, 1);
                        if (MBridgeVideoView.this.f17440O && MBridgeVideoView.this.f17443S == C6204a.f15403m) {
                            C7027a aVar = MBridgeVideoView.this.f17278e;
                            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                            aVar.mo48315a(2, mBridgeVideoView2.m17713b(mBridgeVideoView2.f17450ac));
                        } else if (!MBridgeVideoView.this.f17440O || MBridgeVideoView.this.f17443S != C6204a.f15404n) {
                            MBridgeVideoView.this.f17278e.mo48315a(2, "");
                        } else {
                            MBridgeVideoView.this.m17727g();
                        }
                    }
                };
            }
            if (this.f17467z == null) {
                this.f17467z = new MBAlertDialog(getContext(), this.f17426A);
            }
            if (this.f17440O) {
                this.f17467z.makeIVAlertView(this.f17443S, this.f17427B);
            } else {
                this.f17467z.makeRVAlertView(this.f17427B);
            }
            PlayerView playerView = this.f17456o;
            if (playerView != null && !playerView.isComplete()) {
                this.f17467z.show();
                this.f17446V = true;
                this.f17462u = true;
                setShowingAlertViewCover(true);
                C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f17427B, false);
                this.f17442R = C7179c.f17915a;
                C6323d.m16033a(this.f17274a, this.f17275b, this.f17442R, this.f17427B, 1);
            }
        }
    }

    public void preLoadData(C7158b bVar) {
        if (this.f17279f && !TextUtils.isEmpty(this.f17463v) && this.f17275b != null) {
            if (this.f17275b != null && C6369x.m16236b(this.f17275b.getVideoResolution())) {
                String videoResolution = this.f17275b.getVideoResolution();
                C6361q.m16156b(MBridgeBaseView.TAG, "MBridgeBaseView videoResolution:" + videoResolution);
                String[] split = videoResolution.split("x");
                if (split.length == 2) {
                    if (C6366u.m16202b(split[0]) > 0.0d) {
                        this.f17428C = C6366u.m16202b(split[0]);
                    }
                    if (C6366u.m16202b(split[1]) > 0.0d) {
                        this.f17429D = C6366u.m16202b(split[1]);
                    }
                    C6361q.m16156b(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.f17428C + "  mVideoH:" + this.f17429D);
                }
                if (this.f17428C <= 0.0d) {
                    this.f17428C = 1280.0d;
                }
                if (this.f17429D <= 0.0d) {
                    this.f17429D = 720.0d;
                }
            }
            this.f17456o.initBufferIngParam(this.f17465x);
            this.f17456o.initVFPData(this.f17463v, this.f17275b.getVideoUrlEncode(), this.f17454ag);
            soundOperate(this.f17441Q, -1, (String) null);
        }
        f17420P = false;
    }

    public void defaultShow() {
        super.defaultShow();
        this.f17430E = true;
        showVideoLocation(0, 0, C6366u.m16224h(this.f17274a), C6366u.m16222g(this.f17274a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.f17464w == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C6361q.m16156b(MBridgeBaseView.TAG, "showVideoLocation marginTop:" + i + " marginLeft:" + i2 + " width:" + i3 + "  height:" + i4 + " radius:" + i5 + " borderTop:" + i6 + " borderLeft:" + i7 + " borderWidth:" + i8 + " borderHeight:" + i9);
        if (this.f17279f) {
            this.f17460s.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.f17460s.getVisibility() != 0) {
                this.f17460s.setVisibility(0);
            }
            if (!(i3 > 0 && i4 > 0 && C6366u.m16224h(this.f17274a) >= i3 && C6366u.m16222g(this.f17274a) >= i4) || this.f17430E) {
                m17731h();
                return;
            }
            f17422k = i6;
            f17423l = i7;
            f17424m = i8 + 4;
            f17425n = i9 + 4;
            float f = ((float) i3) / ((float) i4);
            float f2 = 0.0f;
            try {
                f2 = (float) (this.f17428C / this.f17429D);
            } catch (Throwable th) {
                C6361q.m16155a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
            if (i5 > 0) {
                f17421j = i5;
                if (i5 > 0) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius((float) C6366u.m16203b(getContext(), (float) i5));
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(1, 0);
                    if (Build.VERSION.SDK_INT >= 16) {
                        setBackground(gradientDrawable);
                        this.f17456o.setBackground(gradientDrawable);
                    } else {
                        setBackgroundDrawable(gradientDrawable);
                        this.f17456o.setBackgroundDrawable(gradientDrawable);
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        setClipToOutline(true);
                        this.f17456o.setClipToOutline(true);
                    }
                }
            }
            if (Math.abs(f - f2) <= 0.1f || this.f17439N == 1) {
                m17731h();
                if (this.f17438M) {
                    setLayoutCenter(i3, i4);
                    if (f17420P) {
                        this.f17278e.mo48315a(114, "");
                    } else {
                        this.f17278e.mo48315a(116, "");
                    }
                } else {
                    setLayoutParam(i2, i, i3, i4);
                }
            } else {
                m17731h();
                videoOperate(1);
            }
        }
    }

    public void soundOperate(int i, int i2) {
        soundOperate(i, i2, "2");
    }

    public void soundOperate(int i, int i2, String str) {
        if (this.f17279f) {
            this.f17441Q = i;
            if (i == 1) {
                this.f17457p.setSoundStatus(false);
                this.f17456o.closeSound();
            } else if (i == 2) {
                this.f17457p.setSoundStatus(true);
                this.f17456o.openSound();
            }
            if (this.f17275b != null && C6366u.m16221f(this.f17275b.getMof_template_url())) {
                this.f17457p.setVisibility(0);
            } else if (i2 == 1) {
                this.f17457p.setVisibility(8);
            } else if (i2 == 2) {
                this.f17457p.setVisibility(0);
            }
        }
        if (str != null && str.equals("2")) {
            this.f17278e.mo48315a(7, Integer.valueOf(i));
        }
    }

    public void videoOperate(int i) {
        C6361q.m16154a(MBridgeBaseView.TAG, "VideoView videoOperate:" + i);
        if (!this.f17279f) {
            return;
        }
        if (i == 1) {
            if (getVisibility() == 0 && isfront()) {
                C6361q.m16154a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                if (!this.f17462u) {
                    m17727g();
                }
            }
        } else if (i == 2) {
            if (getVisibility() == 0 && isfront()) {
                C6361q.m16154a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                m17725f();
            }
        } else if (i == 3 && !this.f17432G) {
            this.f17456o.release();
            this.f17432G = true;
        }
    }

    public void closeVideoOperate(int i, int i2) {
        if (i == 1) {
            this.f17452ae = true;
            if (getVisibility() == 0) {
                m17714b();
            }
        }
        if (i2 == 1) {
            gonePlayingCloseView();
        } else if (i2 != 2) {
        } else {
            if ((!this.f17451ad || getVisibility() != 0) && this.f17279f && this.f17459r.getVisibility() != 0) {
                this.f17459r.setVisibility(0);
                this.f17434I = true;
            }
        }
    }

    public void progressOperate(int i, int i2) {
        if (this.f17279f) {
            C6361q.m16156b(MBridgeBaseView.TAG, "progressOperate progress:" + i);
            int videoLength = this.f17275b != null ? this.f17275b.getVideoLength() : 0;
            if (i > 0 && i <= videoLength && this.f17456o != null) {
                C6361q.m16156b(MBridgeBaseView.TAG, "progressOperate progress:" + i);
                this.f17456o.seekTo(i * 1000);
            }
            if (i2 == 1) {
                this.f17458q.setVisibility(8);
            } else if (i2 == 2) {
                this.f17458q.setVisibility(0);
            }
        }
    }

    public String getCurrentProgress() {
        try {
            int a = this.f17454ag.mo48768a();
            int i = 0;
            if (this.f17275b != null) {
                i = this.f17275b.getVideoLength();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, m17709a(a, i));
            jSONObject.put("time", a);
            jSONObject.put("duration", i + "");
            return jSONObject.toString();
        } catch (Throwable th) {
            C6361q.m16155a(MBridgeBaseView.TAG, th.getMessage(), th);
            return "{}";
        }
    }

    public void setScaleFitXY(int i) {
        this.f17439N = i;
    }

    public void setVisible(int i) {
        setVisibility(i);
    }

    public void setCover(boolean z) {
        if (this.f17279f) {
            this.f17456o.setIsCovered(z);
        }
    }

    public void setMiniEndCardState(boolean z) {
        this.f17433H = z;
    }

    public void setShowingAlertViewCover(boolean z) {
        this.f17456o.setIsCovered(z);
    }

    public boolean isH5Canvas() {
        return getLayoutParams().height < C6366u.m16222g(this.f17274a.getApplicationContext());
    }

    public int getBorderViewHeight() {
        return f17425n;
    }

    public int getBorderViewWidth() {
        return f17424m;
    }

    public int getBorderViewLeft() {
        return f17423l;
    }

    public int getBorderViewTop() {
        return f17422k;
    }

    public int getBorderViewRadius() {
        return f17421j;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f17275b == null || !C6366u.m16221f(this.f17275b.getMof_template_url())) {
            this.f17460s.setVisibility(4);
            if (this.f17279f && this.f17430E) {
                m17731h();
            }
        }
    }

    /* renamed from: a */
    private String m17709a(int i, int i2) {
        if (i2 != 0) {
            double d = (double) (((float) i) / ((float) i2));
            try {
                return C6366u.m16184a(Double.valueOf(d)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    public int getCloseAlert() {
        return this.f17466y;
    }

    public void setCloseAlert(int i) {
        this.f17466y = i;
    }

    public int getVideoSkipTime() {
        return this.f17464w;
    }

    public void setVideoSkipTime(int i) {
        this.f17464w = i;
    }

    public void setPlayURL(String str) {
        this.f17463v = str;
    }

    public void setBufferTimeout(int i) {
        this.f17465x = i;
    }

    /* renamed from: e */
    private boolean m17721e() {
        try {
            this.f17456o = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f17457p = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f17458q = (TextView) findViewById(findID("mbridge_tv_count"));
            View findViewById = findViewById(findID("mbridge_rl_playing_close"));
            this.f17459r = findViewById;
            findViewById.setVisibility(4);
            this.f17460s = (FrameLayout) findViewById(findID("mbridge_top_control"));
            return isNotNULL(this.f17456o, this.f17457p, this.f17458q, this.f17459r);
        } catch (Throwable th) {
            C6361q.m16155a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i = indexOfChild + 1;
        boolean z = false;
        while (i <= childCount - 1) {
            if (viewGroup.getChildAt(i).getVisibility() == 0 && this.f17433H) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    private void m17725f() {
        try {
            if (this.f17456o != null) {
                this.f17456o.onPause();
            }
        } catch (Throwable th) {
            C6361q.m16155a(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m17727g() {
        try {
            if (!this.f17431F) {
                boolean playVideo = this.f17456o.playVideo();
                if (!(this.f17275b == null || this.f17275b.getPlayable_ads_without_video() == 2 || playVideo || this.f17454ag == null)) {
                    this.f17454ag.onPlayError("play video failed");
                }
                this.f17431F = true;
                return;
            }
            this.f17456o.onResume();
        } catch (Exception e) {
            C6361q.m16155a(MBridgeBaseView.TAG, e.getMessage(), e);
        }
    }

    public void gonePlayingCloseView() {
        if (this.f17279f && this.f17459r.getVisibility() != 8) {
            this.f17459r.setVisibility(8);
            this.f17434I = false;
        }
        if (!this.f17455ah && !this.f17437L && !this.f17435J) {
            this.f17455ah = true;
            int i = this.f17464w;
            if (i >= 0) {
                if (i == 0) {
                    this.f17437L = true;
                } else {
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            boolean unused = MBridgeVideoView.this.f17437L = true;
                        }
                    }, (long) (this.f17464w * 1000));
                }
            }
        }
    }

    /* renamed from: h */
    private void m17731h() {
        float h = (float) C6366u.m16224h(this.f17274a);
        float g = (float) C6366u.m16222g(this.f17274a);
        double d = this.f17428C;
        if (d > 0.0d) {
            double d2 = this.f17429D;
            if (d2 > 0.0d && h > 0.0f && g > 0.0f) {
                double d3 = d / d2;
                double d4 = (double) (h / g);
                C6361q.m16156b(MBridgeBaseView.TAG, "videoWHDivide:" + d3 + "  screenWHDivide:" + d4);
                double a = C6366u.m16184a(Double.valueOf(d3));
                double a2 = C6366u.m16184a(Double.valueOf(d4));
                C6361q.m16156b(MBridgeBaseView.TAG, "videoWHDivideFinal:" + a + "  screenWHDivideFinal:" + a2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17456o.getLayoutParams();
                if (a > a2) {
                    layoutParams.width = -1;
                    layoutParams.height = (int) ((((double) h) * this.f17429D) / this.f17428C);
                    layoutParams.gravity = 17;
                } else if (a < a2) {
                    layoutParams.width = (int) (((double) g) * d3);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                this.f17456o.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        m17733i();
    }

    /* renamed from: i */
    private void m17733i() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (!isLandscape() && this.f17279f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17456o.getLayoutParams();
                int h = C6366u.m16224h(this.f17274a);
                layoutParams.width = -1;
                layoutParams.height = (h * 9) / 16;
                layoutParams.gravity = 17;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$b */
    private static final class C7026b extends DefaultVideoPlayerStatusListener {

        /* renamed from: a */
        private MBridgeVideoView f17484a;

        /* renamed from: b */
        private int f17485b;

        /* renamed from: c */
        private int f17486c;

        /* renamed from: d */
        private boolean f17487d;

        /* renamed from: e */
        private C7025a f17488e = new C7025a();

        /* renamed from: f */
        private boolean f17489f = false;

        /* renamed from: g */
        private boolean f17490g = false;

        /* renamed from: h */
        private boolean f17491h = false;

        /* renamed from: i */
        private boolean f17492i;

        /* renamed from: j */
        private String f17493j;

        /* renamed from: k */
        private CampaignEx f17494k;

        /* renamed from: l */
        private int f17495l;

        /* renamed from: m */
        private int f17496m;

        /* renamed from: n */
        private boolean f17497n = false;

        /* renamed from: a */
        public final void mo48770a(CampaignEx campaignEx) {
            this.f17494k = campaignEx;
        }

        /* renamed from: a */
        public final void mo48772a(boolean z) {
            this.f17492i = z;
        }

        /* renamed from: a */
        public final void mo48771a(String str) {
            this.f17493j = str;
        }

        /* renamed from: a */
        public final int mo48768a() {
            return this.f17485b;
        }

        /* renamed from: a */
        public final void mo48769a(int i, int i2) {
            this.f17495l = i;
            this.f17496m = i2;
        }

        public C7026b(MBridgeVideoView mBridgeVideoView) {
            this.f17484a = mBridgeVideoView;
        }

        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f17487d) {
                this.f17484a.f17278e.mo48315a(10, this.f17488e);
                this.f17487d = true;
            }
            boolean unused = MBridgeVideoView.f17420P = false;
        }

        public final void onPlayCompleted() {
            super.onPlayCompleted();
            boolean unused = this.f17484a.f17450ac = true;
            this.f17484a.f17458q.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            this.f17484a.f17456o.setClickable(false);
            String f = this.f17484a.m17713b(true);
            this.f17484a.f17278e.mo48315a(121, "");
            this.f17484a.f17278e.mo48315a(11, f);
            this.f17485b = this.f17486c;
            boolean unused2 = MBridgeVideoView.f17420P = true;
        }

        public final void onPlayError(String str) {
            C6361q.m16158d("DefaultVideoPlayerStatusListener", "errorStr" + str);
            super.onPlayError(str);
            this.f17484a.f17278e.mo48315a(12, "");
        }

        public final void onPlayProgress(int i, int i2) {
            int i3;
            int i4;
            String str;
            super.onPlayProgress(i, i2);
            if (this.f17484a.f17279f) {
                int i5 = i2 - i;
                if (i5 <= 0) {
                    i5 = 0;
                }
                this.f17484a.f17458q.setText(String.valueOf(i5));
            }
            this.f17486c = i2;
            this.f17488e.f17481a = i;
            this.f17488e.f17482b = i2;
            this.f17488e.f17483c = this.f17484a.f17451ad;
            this.f17485b = i;
            this.f17484a.f17278e.mo48315a(15, this.f17488e);
            if (this.f17484a.f17440O && !this.f17484a.f17446V && this.f17484a.f17443S == C6204a.f15404n) {
                this.f17484a.m17714b();
            }
            int i6 = this.f17495l;
            if (i6 != 100 && !this.f17497n && i6 != 0 && (i3 = this.f17496m) >= 0 && i >= (i4 = (i2 * i3) / 100)) {
                if (this.f17494k.getAdType() == 94 || this.f17494k.getAdType() == 287) {
                    str = this.f17494k.getRequestId() + this.f17494k.getId() + this.f17494k.getVideoUrlEncode();
                } else {
                    str = this.f17494k.getId() + this.f17494k.getVideoUrlEncode() + this.f17494k.getBidToken();
                }
                C7180a a = C7184c.getInstance().mo49203a(this.f17493j, str);
                if (a != null) {
                    a.mo49194j();
                    this.f17497n = true;
                    C6361q.m16158d("DefaultVideoPlayerStatusListener", "CDRate is : " + i4 + " and start download !");
                }
            }
        }

        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                this.f17484a.f17278e.mo48315a(13, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                this.f17484a.f17278e.mo48315a(14, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        /* renamed from: b */
        public final void mo48773b() {
            this.f17484a = null;
            boolean unused = MBridgeVideoView.f17420P = false;
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$a */
    public static class C7025a {

        /* renamed from: a */
        public int f17481a;

        /* renamed from: b */
        public int f17482b;

        /* renamed from: c */
        public boolean f17483c;

        public final String toString() {
            return "ProgressData{curPlayPosition=" + this.f17481a + ", allDuration=" + this.f17482b + '}';
        }
    }

    public void onBackPress() {
        if (!this.f17433H && !this.f17462u && !this.f17447W) {
            if (this.f17434I) {
                m17714b();
            } else if (this.f17435J && this.f17436K) {
                m17714b();
            } else if (!this.f17435J && this.f17437L) {
                m17714b();
            }
        }
    }

    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f17435J = true;
            this.f17437L = false;
        } else if (i == 1) {
            this.f17436K = true;
        }
    }

    public void showIVRewardAlertView(String str) {
        this.f17278e.mo48315a(8, "");
    }

    public void notifyVideoClose() {
        this.f17278e.mo48315a(2, "");
    }

    public int getMute() {
        return this.f17441Q;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.f17443S = i;
        this.f17444T = i2;
        this.f17445U = i3;
    }

    public void setDialogRole(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f17449ab = z;
        C6361q.m16158d(MBridgeBaseView.TAG, i + " " + this.f17449ab);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m17713b(boolean z) {
        if (!this.f17440O) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.f17446V) {
                jSONObject.put("Alert_window_status", C6204a.f15407q);
            }
            if (this.f17448aa) {
                jSONObject.put("Alert_window_status", C6204a.f15409s);
            }
            if (this.f17447W) {
                jSONObject.put("Alert_window_status", C6204a.f15408r);
            }
            jSONObject.put("complete_info", z ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            C6361q.m16158d(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        if (!this.f17282i) {
            StringBuilder sb = new StringBuilder();
            sb.append("NOTCH VideoView ");
            boolean z = false;
            sb.append(String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
            C6361q.m16158d(MBridgeBaseView.TAG, sb.toString());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i5 = layoutParams.leftMargin;
            int i6 = layoutParams.rightMargin;
            int i7 = layoutParams.topMargin;
            int i8 = layoutParams.bottomMargin;
            if (Math.max(Math.max(i5, i6), Math.max(i7, i8)) > Math.max(Math.max(i, i2), Math.max(i3, i4))) {
                z = true;
            }
            if (!z) {
                final int i9 = i;
                final int i10 = i3;
                final int i11 = i2;
                final int i12 = i4;
                this.f17460s.postDelayed(new Runnable() {
                    public final void run() {
                        MBridgeVideoView.this.f17460s.setPadding(i9, i10, i11, i12);
                        MBridgeVideoView.this.f17460s.startAnimation(MBridgeVideoView.this.f17453af);
                        MBridgeVideoView.this.f17460s.setVisibility(0);
                    }
                }, 200);
            }
        }
    }

    public void releasePlayer() {
        try {
            if (this.f17456o != null && !this.f17432G) {
                this.f17456o.release();
            }
            if (this.f17454ag != null) {
                this.f17454ag.mo48773b();
            }
            if (this.f17461t != null) {
                this.f17461t = null;
            }
        } catch (Exception e) {
            C6361q.m16158d(MBridgeBaseView.TAG, e.getMessage());
        }
    }
}
