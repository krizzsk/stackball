package com.mbridge.msdk.video.p214bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.video.p214bt.p215a.C6877c;
import com.mbridge.msdk.video.signal.p235a.C7062j;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.C7215a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC */
public class MBridgeBTNativeEC extends BTBaseView {

    /* renamed from: A */
    private StarLevelView f16970A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f16971B = false;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f16972C = false;

    /* renamed from: D */
    private int f16973D = 0;

    /* renamed from: E */
    private Runnable f16974E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public View f16975F;

    /* renamed from: G */
    private View f16976G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f16977H;

    /* renamed from: I */
    private C7062j f16978I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public WebView f16979J;

    /* renamed from: p */
    private ViewGroup f16980p;

    /* renamed from: q */
    private ViewGroup f16981q;

    /* renamed from: r */
    private RelativeLayout f16982r;

    /* renamed from: s */
    private ImageView f16983s;

    /* renamed from: t */
    private RoundImageView f16984t;

    /* renamed from: u */
    private ImageView f16985u;

    /* renamed from: v */
    private ImageView f16986v;

    /* renamed from: w */
    private ImageView f16987w;

    /* renamed from: x */
    private TextView f16988x;

    /* renamed from: y */
    private TextView f16989y;

    /* renamed from: z */
    private TextView f16990z;

    public void onDestory() {
    }

    public MBridgeBTNativeEC(Context context) {
        super(context);
    }

    public MBridgeBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setUnitId(String str) {
        this.f16977H = str;
    }

    public void setJSCommon(C7062j jVar) {
        this.f16978I = jVar;
    }

    public void setCreateWebView(WebView webView) {
        this.f16979J = webView;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16974E == null) {
            this.f16974E = new Runnable() {
                public final void run() {
                    boolean unused = MBridgeBTNativeEC.this.f16972C = true;
                    if (MBridgeBTNativeEC.this.f16975F != null) {
                        MBridgeBTNativeEC.this.f16975F.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f16974E;
        if (runnable != null) {
            postDelayed(runnable, (long) (this.f16973D * 1000));
        }
        if (!this.f16882h && this.f16979J != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f16878d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.f16977H);
                jSONObject.put("data", jSONObject2);
                C6361q.m16154a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e) {
                C6361q.m16154a(BTBaseView.TAG, e.getMessage());
            }
            C6563g.m16891a().mo44522a(this.f16979J, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.f16979J != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f16878d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.f16977H);
                jSONObject3.put("data", jSONObject4);
                C6361q.m16154a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e2) {
                C6361q.m16154a(BTBaseView.TAG, e2.getMessage());
            }
            C6563g.m16891a().mo44522a(this.f16979J, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f16974E;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7.f16983s.setVisibility(8);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00ca */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0155 A[Catch:{ all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x016f A[Catch:{ all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0178 A[Catch:{ all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void preLoadData() {
        /*
            r7 = this;
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f16876b     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0188
            boolean r0 = r7.f16882h     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0188
            com.mbridge.msdk.videocommon.d.c r0 = r7.f16879e     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0014
            com.mbridge.msdk.videocommon.d.c r0 = r7.f16879e     // Catch:{ all -> 0x017e }
            int r0 = r0.mo49148n()     // Catch:{ all -> 0x017e }
            r7.f16973D = r0     // Catch:{ all -> 0x017e }
        L_0x0014:
            com.mbridge.msdk.video.module.a.a.e r0 = new com.mbridge.msdk.video.module.a.a.e     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.videocommon.view.RoundImageView r1 = r7.f16984t     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f16876b     // Catch:{ all -> 0x017e }
            java.lang.String r3 = r7.f16977H     // Catch:{ all -> 0x017e }
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x017e }
            android.content.Context r1 = r7.f16875a     // Catch:{ all -> 0x017e }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.foundation.same.c.b r1 = com.mbridge.msdk.foundation.same.p168c.C6216b.m15729a((android.content.Context) r1)     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f16876b     // Catch:{ all -> 0x017e }
            java.lang.String r2 = r2.getImageUrl()     // Catch:{ all -> 0x017e }
            r1.mo43786a((java.lang.String) r2, (com.mbridge.msdk.foundation.same.p168c.C6219c) r0)     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.video.module.a.a.j r0 = new com.mbridge.msdk.video.module.a.a.j     // Catch:{ all -> 0x017e }
            android.widget.ImageView r1 = r7.f16985u     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x017e }
            android.content.Context r2 = r2.mo42895d()     // Catch:{ all -> 0x017e }
            r3 = 1090519040(0x41000000, float:8.0)
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r2, (float) r3)     // Catch:{ all -> 0x017e }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x017e }
            android.content.Context r1 = r7.f16875a     // Catch:{ all -> 0x017e }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.foundation.same.c.b r1 = com.mbridge.msdk.foundation.same.p168c.C6216b.m15729a((android.content.Context) r1)     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f16876b     // Catch:{ all -> 0x017e }
            java.lang.String r2 = r2.getIconUrl()     // Catch:{ all -> 0x017e }
            r1.mo43786a((java.lang.String) r2, (com.mbridge.msdk.foundation.same.p168c.C6219c) r0)     // Catch:{ all -> 0x017e }
            android.widget.TextView r0 = r7.f16988x     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r7.f16876b     // Catch:{ all -> 0x017e }
            java.lang.String r1 = r1.getAppName()     // Catch:{ all -> 0x017e }
            r0.setText(r1)     // Catch:{ all -> 0x017e }
            android.widget.TextView r0 = r7.f16989y     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r7.f16876b     // Catch:{ all -> 0x017e }
            java.lang.String r1 = r1.getAppDesc()     // Catch:{ all -> 0x017e }
            r0.setText(r1)     // Catch:{ all -> 0x017e }
            android.widget.TextView r0 = r7.f16990z     // Catch:{ all -> 0x017e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x017e }
            r1.<init>()     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f16876b     // Catch:{ all -> 0x017e }
            int r2 = r2.getNumberRating()     // Catch:{ all -> 0x017e }
            r1.append(r2)     // Catch:{ all -> 0x017e }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x017e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x017e }
            r0.setText(r1)     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.videocommon.view.StarLevelView r0 = r7.f16970A     // Catch:{ all -> 0x017e }
            r0.removeAllViews()     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f16876b     // Catch:{ all -> 0x017e }
            double r0 = r0.getRating()     // Catch:{ all -> 0x017e }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x009f
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
        L_0x009f:
            com.mbridge.msdk.videocommon.view.StarLevelView r2 = r7.f16970A     // Catch:{ all -> 0x017e }
            r2.initScore(r0)     // Catch:{ all -> 0x017e }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x017e }
            r1 = 17
            r2 = 8
            if (r0 >= r1) goto L_0x00b2
            android.widget.ImageView r0 = r7.f16983s     // Catch:{ all -> 0x017e }
            r0.setVisibility(r2)     // Catch:{ all -> 0x017e }
            return
        L_0x00b2:
            com.mbridge.msdk.videocommon.view.RoundImageView r0 = r7.f16984t     // Catch:{ all -> 0x00ca }
            android.graphics.drawable.Drawable r0 = r0.getDrawable()     // Catch:{ all -> 0x00ca }
            android.graphics.Bitmap r0 = r7.m17373a((android.graphics.drawable.Drawable) r0)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00cf
            android.graphics.Bitmap r0 = r7.blurBitmap(r0)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00cf
            android.widget.ImageView r1 = r7.f16983s     // Catch:{ all -> 0x00ca }
            r1.setImageBitmap(r0)     // Catch:{ all -> 0x00ca }
            goto L_0x00cf
        L_0x00ca:
            android.widget.ImageView r0 = r7.f16983s     // Catch:{ all -> 0x017e }
            r0.setVisibility(r2)     // Catch:{ all -> 0x017e }
        L_0x00cf:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f16876b     // Catch:{ all -> 0x017e }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x017e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x017e }
            if (r0 != 0) goto L_0x00ec
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r7.f16876b     // Catch:{ all -> 0x017e }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x017e }
            java.lang.String r1 = "alecfc=1"
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x00ec
            r0 = 1
            r7.f16971B = r0     // Catch:{ all -> 0x017e }
        L_0x00ec:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x017e }
            java.lang.String r0 = r0.getLanguage()     // Catch:{ all -> 0x017e }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x017e }
            java.lang.String r3 = "drawable"
            if (r1 != 0) goto L_0x0124
            java.lang.String r1 = "zh"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0124
            android.widget.ImageView r0 = r7.f16986v     // Catch:{ all -> 0x017e }
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ all -> 0x017e }
            android.content.res.Resources r4 = r7.getResources()     // Catch:{ all -> 0x017e }
            java.lang.String r5 = "mbridge_reward_flag_cn"
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x017e }
            java.lang.String r6 = r6.mo42884a()     // Catch:{ all -> 0x017e }
            int r3 = r4.getIdentifier(r5, r3, r6)     // Catch:{ all -> 0x017e }
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)     // Catch:{ all -> 0x017e }
            r0.setImageDrawable(r1)     // Catch:{ all -> 0x017e }
            goto L_0x0143
        L_0x0124:
            android.widget.ImageView r0 = r7.f16986v     // Catch:{ all -> 0x017e }
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ all -> 0x017e }
            android.content.res.Resources r4 = r7.getResources()     // Catch:{ all -> 0x017e }
            java.lang.String r5 = "mbridge_reward_flag_en"
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x017e }
            java.lang.String r6 = r6.mo42884a()     // Catch:{ all -> 0x017e }
            int r3 = r4.getIdentifier(r5, r3, r6)     // Catch:{ all -> 0x017e }
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)     // Catch:{ all -> 0x017e }
            r0.setImageDrawable(r1)     // Catch:{ all -> 0x017e }
        L_0x0143:
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x017e }
            java.lang.String r0 = r0.mo42896e()     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.b.b r1 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.b.a r0 = r1.mo42749b(r0)     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = r0.mo42666K()     // Catch:{ all -> 0x017e }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x017e }
            if (r1 == 0) goto L_0x0164
            android.widget.ImageView r1 = r7.f16987w     // Catch:{ all -> 0x017e }
            r1.setVisibility(r2)     // Catch:{ all -> 0x017e }
        L_0x0164:
            android.widget.ImageView r1 = r7.f16987w     // Catch:{ all -> 0x017e }
            com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC$2 r3 = new com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC$2     // Catch:{ all -> 0x017e }
            r3.<init>(r0)     // Catch:{ all -> 0x017e }
            r1.setOnClickListener(r3)     // Catch:{ all -> 0x017e }
            goto L_0x0174
        L_0x016f:
            android.widget.ImageView r0 = r7.f16987w     // Catch:{ all -> 0x017e }
            r0.setVisibility(r2)     // Catch:{ all -> 0x017e }
        L_0x0174:
            boolean r0 = r7.f16972C     // Catch:{ all -> 0x017e }
            if (r0 != 0) goto L_0x0188
            android.view.View r0 = r7.f16975F     // Catch:{ all -> 0x017e }
            r0.setVisibility(r2)     // Catch:{ all -> 0x017e }
            goto L_0x0188
        L_0x017e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "BTBaseView"
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r1, r0)
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.module.MBridgeBTNativeEC.preLoadData():void");
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f16881g = configuration.orientation;
        if (this.f16881g == 2) {
            removeView(this.f16980p);
            m17375a((View) this.f16981q);
            return;
        }
        removeView(this.f16981q);
        m17375a((View) this.f16980p);
    }

    /* renamed from: a */
    private void m17375a(View view) {
        if (view == null) {
            init(this.f16875a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        m17379b(view);
        mo48235a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48235a() {
        if (this.f16882h) {
            this.f16982r.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeBTNativeEC.this.f16971B) {
                        MBridgeBTNativeEC.m17377a(MBridgeBTNativeEC.this, 1);
                        MBridgeBTNativeEC.m17376a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                    }
                }
            });
            this.f16975F.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeBTNativeEC.this.f16979J != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", MBridgeBTNativeEC.this.f16878d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("unitId", MBridgeBTNativeEC.this.f16977H);
                            jSONObject.put("data", jSONObject2);
                            C6361q.m16154a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                        } catch (JSONException e) {
                            C6361q.m16154a(BTBaseView.TAG, e.getMessage());
                        }
                        C6563g.m16891a().mo44522a(MBridgeBTNativeEC.this.f16979J, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            });
            this.f16976G.setOnClickListener(new C7215a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo48366a(View view) {
                    MBridgeBTNativeEC.m17377a(MBridgeBTNativeEC.this, 0);
                    MBridgeBTNativeEC.m17376a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f16985u.setOnClickListener(new C7215a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo48366a(View view) {
                    MBridgeBTNativeEC.m17377a(MBridgeBTNativeEC.this, 0);
                    MBridgeBTNativeEC.m17376a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f16984t.setOnClickListener(new C7215a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo48366a(View view) {
                    MBridgeBTNativeEC.m17377a(MBridgeBTNativeEC.this, 0);
                    MBridgeBTNativeEC.m17376a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
        }
    }

    /* renamed from: b */
    private boolean m17379b(View view) {
        try {
            this.f16982r = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.f16983s = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.f16984t = (RoundImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.f16985u = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.f16986v = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.f16987w = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.f16988x = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.f16989y = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            this.f16990z = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.f16970A = (StarLevelView) view.findViewById(findID("mbridge_sv_starlevel"));
            this.f16975F = view.findViewById(findID("mbridge_iv_close"));
            View findViewById = view.findViewById(findID("mbridge_tv_cta"));
            this.f16976G = findViewById;
            return isNotNULL(this.f16983s, this.f16984t, this.f16985u, this.f16988x, this.f16989y, this.f16990z, this.f16970A, this.f16975F, findViewById);
        } catch (Throwable th) {
            C6361q.m16155a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(this.f16875a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            bitmap.recycle();
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private Bitmap m17373a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            C6361q.m16154a(BTBaseView.TAG, th.getMessage());
            return null;
        }
    }

    public void init(Context context) {
        boolean z;
        int findLayout = findLayout(isLandscape() ? "mbridge_reward_endcard_native_land" : "mbridge_reward_endcard_native_hor");
        if (findLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.f16880f.inflate(findLayout, (ViewGroup) null);
                this.f16981q = viewGroup;
                addView(viewGroup);
                z = m17379b((View) this.f16981q);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f16880f.inflate(findLayout, (ViewGroup) null);
                this.f16980p = viewGroup2;
                addView(viewGroup2);
                z = m17379b((View) this.f16980p);
            }
            this.f16882h = z;
            mo48235a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m17377a(com.mbridge.msdk.video.p214bt.module.MBridgeBTNativeEC r2, int r3) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0015 }
            r1.<init>()     // Catch:{ JSONException -> 0x0015 }
            java.lang.String r0 = com.mbridge.msdk.foundation.same.C6204a.f15397g     // Catch:{ JSONException -> 0x0010 }
            org.json.JSONObject r3 = r2.mo48234a(r3)     // Catch:{ JSONException -> 0x0010 }
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x0010 }
            goto L_0x001a
        L_0x0010:
            r3 = move-exception
            r0 = r1
            goto L_0x0016
        L_0x0013:
            r2 = move-exception
            goto L_0x002e
        L_0x0015:
            r3 = move-exception
        L_0x0016:
            r3.printStackTrace()     // Catch:{ all -> 0x0013 }
            r1 = r0
        L_0x001a:
            com.mbridge.msdk.video.signal.a.j r3 = r2.f16978I     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0037
            com.mbridge.msdk.video.signal.a.j r2 = r2.f16978I     // Catch:{ all -> 0x0013 }
            r3 = 1
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0013 }
            goto L_0x002a
        L_0x0028:
            java.lang.String r0 = ""
        L_0x002a:
            r2.click(r3, r0)     // Catch:{ all -> 0x0013 }
            goto L_0x0037
        L_0x002e:
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "BTBaseView"
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r3, r2)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.module.MBridgeBTNativeEC.m17377a(com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC, int):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m17376a(MBridgeBTNativeEC mBridgeBTNativeEC, float f, float f2) {
        if (mBridgeBTNativeEC.f16979J != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", f16873n);
                jSONObject.put("id", mBridgeBTNativeEC.f16878d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f));
                jSONObject2.put("y", String.valueOf(f2));
                jSONObject.put("data", jSONObject2);
                C6563g.m16891a().mo44522a(mBridgeBTNativeEC.f16979J, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                C6877c.m17219a().mo48194a(mBridgeBTNativeEC.f16979J, "onClicked", mBridgeBTNativeEC.f16878d);
            }
        }
    }
}
