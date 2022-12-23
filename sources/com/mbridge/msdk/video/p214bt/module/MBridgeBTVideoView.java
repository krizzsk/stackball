package com.mbridge.msdk.video.p214bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.appevents.AppEventsConstants;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.p214bt.p215a.C6877c;
import com.mbridge.msdk.video.widget.SoundImageView;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.download.C7184c;
import com.mbridge.msdk.videocommon.p239d.C7176a;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView */
public class MBridgeBTVideoView extends BTBaseView {
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static boolean f16999F = false;

    /* renamed from: A */
    private int f17000A;

    /* renamed from: B */
    private boolean f17001B = false;

    /* renamed from: C */
    private int f17002C = 2;

    /* renamed from: D */
    private int f17003D = 1;

    /* renamed from: E */
    private String f17004E;

    /* renamed from: G */
    private boolean f17005G = false;

    /* renamed from: H */
    private boolean f17006H = false;

    /* renamed from: I */
    private boolean f17007I = false;

    /* renamed from: J */
    private FrameLayout f17008J;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public PlayerView f17009p;

    /* renamed from: q */
    private SoundImageView f17010q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public TextView f17011r;

    /* renamed from: s */
    private View f17012s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public WebView f17013t;

    /* renamed from: u */
    private C7180a f17014u;

    /* renamed from: v */
    private int f17015v = 0;

    /* renamed from: w */
    private int f17016w = 0;

    /* renamed from: x */
    private int f17017x = 0;

    /* renamed from: y */
    private C6907a f17018y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f17019z = 2;

    public void setCreateWebView(WebView webView) {
        this.f17013t = webView;
    }

    public void setOrientation(int i) {
        this.f17003D = i;
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void soundOperate(int i, int i2, String str) {
        if (this.f16882h) {
            this.f17019z = i;
            if (i == 1) {
                this.f17010q.setSoundStatus(false);
                this.f17009p.closeSound();
            } else if (i == 2) {
                this.f17010q.setSoundStatus(true);
                this.f17009p.openSound();
            }
            if (i2 == 1) {
                this.f17010q.setVisibility(8);
            } else if (i2 == 2) {
                this.f17010q.setVisibility(0);
            }
        }
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f16880f.inflate(findLayout, this);
            this.f16882h = m17392b();
            if (!this.f16882h) {
                C6361q.m16158d(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            mo48235a();
        }
        f16999F = false;
    }

    public void onResume() {
        PlayerView playerView = this.f17009p;
        if (playerView != null) {
            playerView.setIsCovered(false);
            this.f17009p.setDesk(true);
            if (this.f17006H) {
                this.f17009p.start(true);
            }
        }
    }

    public void onPause() {
        PlayerView playerView = this.f17009p;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.f17006H = isPlayIng;
            this.f17009p.setIsBTVideoPlaying(isPlayIng);
            this.f17009p.onPause();
        }
    }

    public void onStop() {
        PlayerView playerView = this.f17009p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f17007I) {
            this.f17002C = C6877c.m17219a().mo48206d(this.f16877c);
        }
        View view = this.f17012s;
        int i = 8;
        if (view != null) {
            view.setVisibility(this.f17016w == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f17010q;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f17017x == 0 ? 8 : 0);
        }
        TextView textView = this.f17011r;
        if (textView != null) {
            if (this.f17015v != 0) {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    public boolean playMute() {
        try {
            if (!(this.f17009p == null || this.f17013t == null)) {
                this.f17009p.closeSound();
                this.f17010q.setSoundStatus(false);
                this.f17019z = 1;
                m17280a(this.f17013t, "onPlayerMute", this.f16878d);
                return true;
            }
        } catch (Exception e) {
            C6361q.m16158d(BTBaseView.TAG, e.getMessage());
        }
        return false;
    }

    public int getMute() {
        return this.f17019z;
    }

    public boolean playUnMute() {
        try {
            if (this.f17009p == null || this.f17013t == null) {
                return false;
            }
            this.f17009p.openSound();
            this.f17010q.setSoundStatus(true);
            this.f17019z = 2;
            m17280a(this.f17013t, "onUnmute", this.f16878d);
            return true;
        } catch (Exception e) {
            C6361q.m16158d(BTBaseView.TAG, e.getMessage());
            return false;
        }
    }

    public void play() {
        try {
            if (!this.f17007I) {
                if (this.f17002C == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                if (!this.f17009p.playVideo() && this.f17018y != null) {
                    this.f17018y.onPlayError("play video failed");
                }
                this.f17007I = true;
                if (this.f17013t != null) {
                    m17280a(this.f17013t, "onPlayerPlay", this.f16878d);
                    return;
                }
                return;
            }
            if (this.f17001B) {
                this.f17009p.playVideo(0);
                this.f17001B = false;
            } else {
                this.f17009p.start(false);
            }
            if (this.f17013t != null) {
                m17280a(this.f17013t, "onPlayerPlay", this.f16878d);
            }
        } catch (Exception e) {
            C6361q.m16155a(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public void resume() {
        try {
            if (this.f17009p != null) {
                if (this.f17001B) {
                    this.f17009p.playVideo(0);
                    this.f17001B = false;
                } else {
                    this.f17009p.onResume();
                }
                if (this.f17013t != null) {
                    m17280a(this.f17013t, "onPlayerResume", this.f16878d);
                }
            }
        } catch (Exception e) {
            C6361q.m16158d(BTBaseView.TAG, e.getMessage());
        }
    }

    public void pause() {
        try {
            if (this.f17009p != null) {
                this.f17009p.pause();
                if (this.f17013t != null) {
                    m17280a(this.f17013t, "onPlayerPause", this.f16878d);
                }
            }
        } catch (Exception e) {
            C6361q.m16155a(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public void stop() {
        try {
            if (this.f17009p != null) {
                this.f17009p.pause();
                this.f17009p.stop();
                try {
                    this.f17009p.prepare();
                    this.f17009p.justSeekTo(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (this.f17013t != null) {
                    m17280a(this.f17013t, "onPlayerStop", this.f16878d);
                }
            }
        } catch (Exception e2) {
            C6361q.m16155a(BTBaseView.TAG, e2.getMessage(), e2);
        }
    }

    public void onDestory() {
        try {
            if (this.f17009p != null) {
                this.f17009p.setOnClickListener((View.OnClickListener) null);
                this.f17009p.release();
                this.f17009p = null;
            }
            if (this.f17010q != null) {
                this.f17010q.setOnClickListener((View.OnClickListener) null);
            }
            if (this.f17012s != null) {
                this.f17012s.setOnClickListener((View.OnClickListener) null);
            }
            if (this.f17013t != null) {
                this.f17013t = null;
            }
            setOnClickListener((View.OnClickListener) null);
        } catch (Throwable th) {
            C6361q.m16154a(BTBaseView.TAG, th.getMessage());
        }
    }

    /* renamed from: b */
    private boolean m17392b() {
        try {
            this.f17009p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f17010q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f17011r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f17012s = findViewById(findID("mbridge_rl_playing_close"));
            this.f17008J = (FrameLayout) findViewById(findID("mbridge_top_control"));
            this.f17009p.setIsBTVideo(true);
            return isNotNULL(this.f17009p, this.f17010q, this.f17011r, this.f17012s);
        } catch (Throwable th) {
            C6361q.m16155a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: c */
    private String m17394c() {
        try {
            String videoUrlEncode = this.f16876b.getVideoUrlEncode();
            if (this.f17014u == null || this.f17014u.mo49190f() != 5) {
                return videoUrlEncode;
            }
            String d = this.f17014u.mo49187d();
            if (C6369x.m16235a(d) || !new File(d).exists()) {
                return videoUrlEncode;
            }
            return d;
        } catch (Throwable th) {
            C6361q.m16155a(BTBaseView.TAG, th.getMessage(), th);
            return "";
        }
    }

    /* renamed from: d */
    private int m17395d() {
        int i = 5;
        try {
            C7176a b = C7177b.m18135a().mo49112b();
            if (b == null) {
                C7177b.m18135a().mo49113c();
            }
            if (b != null) {
                i = (int) b.mo49102f();
            }
            C6361q.m16156b(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48235a() {
        super.mo48235a();
        if (this.f16882h) {
            this.f17010q.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    boolean isSilent = MBridgeBTVideoView.this.f17009p.isSilent();
                    if (MBridgeBTVideoView.this.f17013t != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f16873n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f16878d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("mute", MBridgeBTVideoView.this.f17019z);
                            jSONObject.put("data", jSONObject2);
                            C6563g.m16891a().mo44522a(MBridgeBTVideoView.this.f17013t, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            C6361q.m16154a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + MBridgeBTVideoView.this.f17019z);
                        } catch (Exception e) {
                            C6877c.m17219a().mo48193a(MBridgeBTVideoView.this.f17013t, e.getMessage());
                        }
                    }
                }
            });
            this.f17012s.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f17013t != null) {
                        BTBaseView.m17280a(MBridgeBTVideoView.this.f17013t, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f16878d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f17013t != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f16873n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f16878d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put("data", jSONObject2);
                            C6563g.m16891a().mo44522a(MBridgeBTVideoView.this.f17013t, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            C6877c.m17219a().mo48194a(MBridgeBTVideoView.this.f17013t, "onClicked", MBridgeBTVideoView.this.f16878d);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView$a */
    private static final class C6907a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a */
        private MBridgeBTVideoView f17023a;

        /* renamed from: b */
        private WebView f17024b;

        /* renamed from: c */
        private String f17025c;

        /* renamed from: d */
        private String f17026d;

        /* renamed from: e */
        private int f17027e;

        /* renamed from: f */
        private int f17028f;

        /* renamed from: g */
        private boolean f17029g;

        /* renamed from: h */
        private boolean f17030h = false;

        /* renamed from: i */
        private boolean f17031i = false;

        /* renamed from: j */
        private boolean f17032j = false;

        /* renamed from: k */
        private int f17033k;

        /* renamed from: l */
        private int f17034l;

        /* renamed from: m */
        private boolean f17035m = false;

        public C6907a(MBridgeBTVideoView mBridgeBTVideoView, WebView webView) {
            this.f17023a = mBridgeBTVideoView;
            this.f17024b = webView;
            if (mBridgeBTVideoView != null) {
                this.f17025c = mBridgeBTVideoView.f16878d;
                this.f17026d = mBridgeBTVideoView.f16877c;
            }
        }

        /* renamed from: a */
        public final void mo48394a(int i, int i2) {
            this.f17033k = i;
            this.f17034l = i2;
        }

        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f17029g) {
                WebView webView = this.f17024b;
                if (webView != null) {
                    BTBaseView.m17280a(webView, "onPlayerPlay", this.f17025c);
                }
                this.f17029g = true;
            }
            boolean unused = MBridgeBTVideoView.f16999F = false;
        }

        public final void onPlayCompleted() {
            super.onPlayCompleted();
            this.f17023a.f17011r.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            this.f17023a.f17009p.setClickable(false);
            WebView webView = this.f17024b;
            if (webView != null) {
                BTBaseView.m17280a(webView, "onPlayerFinish", this.f17025c);
            }
            this.f17027e = this.f17028f;
            boolean unused = MBridgeBTVideoView.f16999F = true;
            this.f17023a.stop();
        }

        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f17024b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f16874o);
                    jSONObject.put("id", this.f17025c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f17025c);
                    jSONObject.put("data", jSONObject2);
                    C6563g.m16891a().mo44522a(this.f17024b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C6877c.m17219a().mo48193a(this.f17024b, e.getMessage());
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x011d A[Catch:{ Exception -> 0x013d }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPlayProgress(int r7, int r8) {
            /*
                r6 = this;
                java.lang.String r0 = "id"
                java.lang.String r1 = "DefaultVideoPlayerStatusListener"
                super.onPlayProgress(r7, r8)
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r6.f17023a
                boolean r2 = r2.f16882h
                if (r2 == 0) goto L_0x001f
                int r2 = r8 - r7
                if (r2 > 0) goto L_0x0012
                r2 = 0
            L_0x0012:
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r6.f17023a
                android.widget.TextView r3 = r3.f17011r
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r3.setText(r2)
            L_0x001f:
                r6.f17028f = r8
                r6.f17027e = r7
                android.webkit.WebView r2 = r6.f17024b
                if (r2 == 0) goto L_0x0089
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x007b }
                r2.<init>()     // Catch:{ Exception -> 0x007b }
                java.lang.String r3 = "code"
                int r4 = com.mbridge.msdk.video.p214bt.module.BTBaseView.f16873n     // Catch:{ Exception -> 0x007b }
                r2.put(r3, r4)     // Catch:{ Exception -> 0x007b }
                java.lang.String r3 = r6.f17025c     // Catch:{ Exception -> 0x007b }
                r2.put(r0, r3)     // Catch:{ Exception -> 0x007b }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x007b }
                r3.<init>()     // Catch:{ Exception -> 0x007b }
                java.lang.String r4 = r6.f17025c     // Catch:{ Exception -> 0x007b }
                r3.put(r0, r4)     // Catch:{ Exception -> 0x007b }
                java.lang.String r0 = "progress"
                java.lang.String r4 = com.mbridge.msdk.video.p214bt.module.MBridgeBTVideoView.m17391b(r7, r8)     // Catch:{ Exception -> 0x007b }
                r3.put(r0, r4)     // Catch:{ Exception -> 0x007b }
                java.lang.String r0 = "time"
                java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x007b }
                r3.put(r0, r4)     // Catch:{ Exception -> 0x007b }
                java.lang.String r0 = "duration"
                java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x007b }
                r3.put(r0, r4)     // Catch:{ Exception -> 0x007b }
                java.lang.String r0 = "data"
                r2.put(r0, r3)     // Catch:{ Exception -> 0x007b }
                com.mbridge.msdk.mbsignalcommon.windvane.g r0 = com.mbridge.msdk.mbsignalcommon.windvane.C6563g.m16891a()     // Catch:{ Exception -> 0x007b }
                android.webkit.WebView r3 = r6.f17024b     // Catch:{ Exception -> 0x007b }
                java.lang.String r4 = "onPlayerProgressChanged"
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x007b }
                byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x007b }
                r5 = 2
                java.lang.String r2 = android.util.Base64.encodeToString(r2, r5)     // Catch:{ Exception -> 0x007b }
                r0.mo44522a((android.webkit.WebView) r3, (java.lang.String) r4, (java.lang.String) r2)     // Catch:{ Exception -> 0x007b }
                goto L_0x0089
            L_0x007b:
                r0 = move-exception
                com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p214bt.p215a.C6877c.m17219a()
                android.webkit.WebView r3 = r6.f17024b
                java.lang.String r0 = r0.getMessage()
                r2.mo48193a((android.webkit.WebView) r3, (java.lang.String) r0)
            L_0x0089:
                int r0 = r6.f17033k     // Catch:{ Exception -> 0x013d }
                r2 = 100
                if (r0 == r2) goto L_0x0145
                boolean r0 = r6.f17035m     // Catch:{ Exception -> 0x013d }
                if (r0 != 0) goto L_0x0145
                int r0 = r6.f17034l     // Catch:{ Exception -> 0x013d }
                if (r0 != 0) goto L_0x0098
                return
            L_0x0098:
                int r0 = r6.f17034l     // Catch:{ Exception -> 0x013d }
                if (r0 < 0) goto L_0x0145
                int r0 = r6.f17034l     // Catch:{ Exception -> 0x013d }
                int r8 = r8 * r0
                int r8 = r8 / r2
                if (r7 < r8) goto L_0x0145
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r7 = r6.f17023a     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.foundation.entity.CampaignEx r7 = r7.f16876b     // Catch:{ Exception -> 0x013d }
                int r7 = r7.getAdType()     // Catch:{ Exception -> 0x013d }
                r0 = 94
                if (r7 == r0) goto L_0x00e7
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r7 = r6.f17023a     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.foundation.entity.CampaignEx r7 = r7.f16876b     // Catch:{ Exception -> 0x013d }
                int r7 = r7.getAdType()     // Catch:{ Exception -> 0x013d }
                r0 = 287(0x11f, float:4.02E-43)
                if (r7 != r0) goto L_0x00bc
                goto L_0x00e7
            L_0x00bc:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013d }
                r7.<init>()     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r6.f17023a     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f16876b     // Catch:{ Exception -> 0x013d }
                java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x013d }
                r7.append(r0)     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r6.f17023a     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f16876b     // Catch:{ Exception -> 0x013d }
                java.lang.String r0 = r0.getVideoUrlEncode()     // Catch:{ Exception -> 0x013d }
                r7.append(r0)     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r6.f17023a     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f16876b     // Catch:{ Exception -> 0x013d }
                java.lang.String r0 = r0.getBidToken()     // Catch:{ Exception -> 0x013d }
                r7.append(r0)     // Catch:{ Exception -> 0x013d }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x013d }
                goto L_0x0111
            L_0x00e7:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013d }
                r7.<init>()     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r6.f17023a     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f16876b     // Catch:{ Exception -> 0x013d }
                java.lang.String r0 = r0.getRequestId()     // Catch:{ Exception -> 0x013d }
                r7.append(r0)     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r6.f17023a     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f16876b     // Catch:{ Exception -> 0x013d }
                java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x013d }
                r7.append(r0)     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r6.f17023a     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f16876b     // Catch:{ Exception -> 0x013d }
                java.lang.String r0 = r0.getVideoUrlEncode()     // Catch:{ Exception -> 0x013d }
                r7.append(r0)     // Catch:{ Exception -> 0x013d }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x013d }
            L_0x0111:
                com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C7184c.getInstance()     // Catch:{ Exception -> 0x013d }
                java.lang.String r2 = r6.f17026d     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.videocommon.download.a r7 = r0.mo49203a(r2, r7)     // Catch:{ Exception -> 0x013d }
                if (r7 == 0) goto L_0x0145
                r7.mo49194j()     // Catch:{ Exception -> 0x013d }
                r7 = 1
                r6.f17035m = r7     // Catch:{ Exception -> 0x013d }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013d }
                r7.<init>()     // Catch:{ Exception -> 0x013d }
                java.lang.String r0 = "CDRate is : "
                r7.append(r0)     // Catch:{ Exception -> 0x013d }
                r7.append(r8)     // Catch:{ Exception -> 0x013d }
                java.lang.String r8 = " and start download !"
                r7.append(r8)     // Catch:{ Exception -> 0x013d }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x013d }
                com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r7)     // Catch:{ Exception -> 0x013d }
                goto L_0x0145
            L_0x013d:
                r7 = move-exception
                java.lang.String r7 = r7.getMessage()
                com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r7)
            L_0x0145:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.module.MBridgeBTVideoView.C6907a.onPlayProgress(int, int):void");
        }

        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.f17024b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f16873n);
                        jSONObject.put("id", this.f17025c);
                        jSONObject.put("data", new JSONObject());
                        C6563g.m16891a().mo44522a(this.f17024b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C6877c.m17219a().mo48193a(this.f17024b, e.getMessage());
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }
    }

    public void setSoundImageViewVisble(int i) {
        this.f17010q.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.f17011r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCloseViewVisable(int i) {
        this.f17012s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setShowClose(int i) {
        this.f17016w = i;
    }

    public void setShowMute(int i) {
        this.f17017x = i;
    }

    public void setShowTime(int i) {
        this.f17015v = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m17391b(int i, int i2) {
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

    public void setVolume(float f, float f2) {
        PlayerView playerView = this.f17009p;
        if (playerView != null) {
            playerView.setVolume(f, f2);
        }
    }

    public void setPlaybackParams(float f) {
        PlayerView playerView = this.f17009p;
        if (playerView != null) {
            playerView.setPlaybackParams(f);
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = this.f17008J.getPaddingLeft();
        }
        if (i2 <= 0) {
            i2 = this.f17008J.getPaddingRight();
        }
        if (i3 <= 0) {
            i3 = this.f17008J.getPaddingTop();
        }
        if (i4 <= 0) {
            i4 = this.f17008J.getPaddingBottom();
        }
        C6361q.m16158d(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        this.f17008J.setPadding(i, i3, i2, i4);
    }

    public void preLoadData() {
        int i;
        List<C7180a> b = C7184c.getInstance().mo49210b(this.f16877c);
        if (b != null && b.size() > 0 && this.f16876b != null) {
            Iterator<C7180a> it = b.iterator();
            while (true) {
                if (it.hasNext()) {
                    C7180a next = it.next();
                    if (next != null && next.mo49191g() != null && next.mo49191g().getId().equals(this.f16876b.getId())) {
                        this.f17014u = next;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f17000A = m17395d();
        this.f17004E = m17394c();
        if (this.f16882h && !TextUtils.isEmpty(this.f17004E) && this.f16876b != null) {
            C6907a aVar = new C6907a(this, this.f17013t);
            this.f17018y = aVar;
            CampaignEx campaignEx = this.f16876b;
            if (campaignEx == null) {
                i = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f16877c, false).mo49152p();
            } else if (campaignEx.getReady_rate() != -1) {
                i = campaignEx.getReady_rate();
            } else {
                i = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f16877c, false).mo49152p();
            }
            aVar.mo48394a(i, C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f16877c, false).mo49154q());
            this.f17009p.initBufferIngParam(this.f17000A);
            this.f17009p.initVFPData(this.f17004E, this.f16876b.getVideoUrlEncode(), this.f17018y);
            soundOperate(this.f17019z, -1, (String) null);
        }
        f16999F = false;
    }
}
