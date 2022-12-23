package com.mbridge.msdk.video.module;

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
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.video.dynview.C6923a;
import com.mbridge.msdk.video.dynview.C6925b;
import com.mbridge.msdk.video.dynview.p220c.C6931a;
import com.mbridge.msdk.video.dynview.p221d.C6934c;
import com.mbridge.msdk.video.dynview.p230i.C6983c;
import com.mbridge.msdk.video.signal.factory.C7158b;
import com.mbridge.msdk.widget.C7215a;
import org.json.JSONException;
import org.json.JSONObject;

public class MBridgeNativeEndCardView extends MBridgeBaseView {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f17378A = false;

    /* renamed from: B */
    private int f17379B = 0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public AlphaAnimation f17380C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f17381D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f17382E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f17383F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f17384G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public View f17385H;

    /* renamed from: I */
    private View f17386I;

    /* renamed from: J */
    private String f17387J;

    /* renamed from: j */
    private ViewGroup f17388j;

    /* renamed from: k */
    private ViewGroup f17389k;

    /* renamed from: l */
    private RelativeLayout f17390l;

    /* renamed from: m */
    private ImageView f17391m;

    /* renamed from: n */
    private RelativeLayout f17392n;

    /* renamed from: o */
    private ImageView f17393o;

    /* renamed from: p */
    private ImageView f17394p;

    /* renamed from: q */
    private ImageView f17395q;

    /* renamed from: r */
    private ImageView f17396r;

    /* renamed from: s */
    private TextView f17397s;

    /* renamed from: t */
    private TextView f17398t;

    /* renamed from: u */
    private TextView f17399u;

    /* renamed from: v */
    private LinearLayout f17400v;

    /* renamed from: w */
    private Runnable f17401w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public RelativeLayout f17402x;

    /* renamed from: y */
    private C7158b f17403y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f17404z = false;

    public void setCloseBtnDelay(int i) {
        this.f17379B = i;
    }

    public void setUnitId(String str) {
        this.f17387J = str;
    }

    public MBridgeNativeEndCardView(Context context) {
        super(context);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet, z);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17401w == null) {
            this.f17401w = new Runnable() {
                public final void run() {
                    boolean unused = MBridgeNativeEndCardView.this.f17378A = true;
                    if (MBridgeNativeEndCardView.this.f17385H != null) {
                        MBridgeNativeEndCardView.this.f17385H.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f17401w;
        if (runnable != null) {
            postDelayed(runnable, (long) (this.f17379B * 1000));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f17401w;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void init(Context context) {
        boolean z;
        if (this.f17282i) {
            new C6983c();
            Context context2 = getContext();
            C6923a.m17464a().mo48419a(new C6925b.C6927a().mo48432a(C6349m.m16102d(context2) == 1 ? "mbridge_reward_end_card_layout_portrait" : "mbridge_reward_end_card_layout_landscape").mo48429a(4).mo48430a(context2).mo48436b(C6349m.m16102d(context2)).mo48434a(), new C6934c() {
                /* renamed from: a */
                public final void mo48343a(View view) {
                    MBridgeNativeEndCardView.this.addView(view);
                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView.f17279f = mBridgeNativeEndCardView.m17690b(view);
                    MBridgeNativeEndCardView.this.m17683a();
                }

                /* renamed from: a */
                public final void mo48344a(C6931a aVar) {
                    C6361q.m16158d(MBridgeBaseView.TAG, "errorMsg:" + aVar.mo48442b());
                }
            });
            return;
        }
        int findLayout = findLayout(isLandscape() ? "mbridge_reward_endcard_native_land" : "mbridge_reward_endcard_native_hor");
        if (findLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.f17276c.inflate(findLayout, (ViewGroup) null);
                this.f17389k = viewGroup;
                addView(viewGroup);
                z = m17690b((View) this.f17389k);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f17276c.inflate(findLayout, (ViewGroup) null);
                this.f17388j = viewGroup2;
                addView(viewGroup2);
                z = m17690b((View) this.f17388j);
            }
            this.f17279f = z;
            m17683a();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:64|65|76) */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r5.f17391m.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x01be */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015c A[Catch:{ all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0176 A[Catch:{ all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017f A[Catch:{ all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018a A[Catch:{ all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0190 A[SYNTHETIC, Splitter:B:53:0x0190] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void preLoadData(com.mbridge.msdk.video.signal.factory.C7158b r6) {
        /*
            r5 = this;
            r5.f17403y = r6
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            if (r6 == 0) goto L_0x01ce
            boolean r6 = r5.f17279f     // Catch:{ all -> 0x01c4 }
            if (r6 == 0) goto L_0x01ce
            com.mbridge.msdk.video.module.a.a.e r6 = new com.mbridge.msdk.video.module.a.a.e     // Catch:{ all -> 0x01c4 }
            android.widget.ImageView r0 = r5.f17393o     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            java.lang.String r2 = r5.f17387J     // Catch:{ all -> 0x01c4 }
            r6.<init>(r0, r1, r2)     // Catch:{ all -> 0x01c4 }
            android.content.Context r0 = r5.f17274a     // Catch:{ all -> 0x01c4 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.same.c.b r0 = com.mbridge.msdk.foundation.same.p168c.C6216b.m15729a((android.content.Context) r0)     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = r1.getImageUrl()     // Catch:{ all -> 0x01c4 }
            r0.mo43786a((java.lang.String) r1, (com.mbridge.msdk.foundation.same.p168c.C6219c) r6)     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.video.module.a.a.j r6 = new com.mbridge.msdk.video.module.a.a.j     // Catch:{ all -> 0x01c4 }
            android.widget.ImageView r0 = r5.f17394p     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01c4 }
            android.content.Context r1 = r1.mo42895d()     // Catch:{ all -> 0x01c4 }
            r2 = 1090519040(0x41000000, float:8.0)
            int r1 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r2)     // Catch:{ all -> 0x01c4 }
            r6.<init>(r0, r1)     // Catch:{ all -> 0x01c4 }
            android.content.Context r0 = r5.f17274a     // Catch:{ all -> 0x01c4 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.same.c.b r0 = com.mbridge.msdk.foundation.same.p168c.C6216b.m15729a((android.content.Context) r0)     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = r1.getIconUrl()     // Catch:{ all -> 0x01c4 }
            r0.mo43786a((java.lang.String) r1, (com.mbridge.msdk.foundation.same.p168c.C6219c) r6)     // Catch:{ all -> 0x01c4 }
            android.widget.TextView r6 = r5.f17397s     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = r0.getAppName()     // Catch:{ all -> 0x01c4 }
            r6.setText(r0)     // Catch:{ all -> 0x01c4 }
            android.view.View r6 = r5.f17386I     // Catch:{ all -> 0x01c4 }
            if (r6 == 0) goto L_0x0072
            android.view.View r6 = r5.f17386I     // Catch:{ all -> 0x01c4 }
            boolean r6 = r6 instanceof android.widget.TextView     // Catch:{ all -> 0x01c4 }
            if (r6 == 0) goto L_0x0072
            android.view.View r6 = r5.f17386I     // Catch:{ all -> 0x01c4 }
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = r0.getAdCall()     // Catch:{ all -> 0x01c4 }
            r6.setText(r0)     // Catch:{ all -> 0x01c4 }
        L_0x0072:
            android.widget.TextView r6 = r5.f17398t     // Catch:{ all -> 0x01c4 }
            if (r6 == 0) goto L_0x0081
            android.widget.TextView r6 = r5.f17398t     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = r0.getAppDesc()     // Catch:{ all -> 0x01c4 }
            r6.setText(r0)     // Catch:{ all -> 0x01c4 }
        L_0x0081:
            android.widget.TextView r6 = r5.f17399u     // Catch:{ all -> 0x01c4 }
            if (r6 == 0) goto L_0x00a1
            android.widget.TextView r6 = r5.f17399u     // Catch:{ all -> 0x01c4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r0.<init>()     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            int r1 = r1.getNumberRating()     // Catch:{ all -> 0x01c4 }
            r0.append(r1)     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01c4 }
            r6.setText(r0)     // Catch:{ all -> 0x01c4 }
        L_0x00a1:
            android.widget.LinearLayout r6 = r5.f17400v     // Catch:{ all -> 0x01c4 }
            r6.removeAllViews()     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            double r0 = r6.getRating()     // Catch:{ all -> 0x01c4 }
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x00b4
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
        L_0x00b4:
            android.widget.LinearLayout r6 = r5.f17400v     // Catch:{ all -> 0x01c4 }
            boolean r6 = r6 instanceof com.mbridge.msdk.videocommon.view.StarLevelView     // Catch:{ all -> 0x01c4 }
            if (r6 == 0) goto L_0x00c1
            android.widget.LinearLayout r6 = r5.f17400v     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.videocommon.view.StarLevelView r6 = (com.mbridge.msdk.videocommon.view.StarLevelView) r6     // Catch:{ all -> 0x01c4 }
            r6.initScore(r0)     // Catch:{ all -> 0x01c4 }
        L_0x00c1:
            android.widget.LinearLayout r6 = r5.f17400v     // Catch:{ all -> 0x01c4 }
            boolean r6 = r6 instanceof com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView     // Catch:{ all -> 0x01c4 }
            if (r6 == 0) goto L_0x00d4
            android.widget.LinearLayout r6 = r5.f17400v     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView r6 = (com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView) r6     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            int r2 = r2.getNumberRating()     // Catch:{ all -> 0x01c4 }
            r6.setRatingAndUser(r0, r2)     // Catch:{ all -> 0x01c4 }
        L_0x00d4:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            java.lang.String r6 = r6.getendcard_url()     // Catch:{ all -> 0x01c4 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01c4 }
            if (r6 != 0) goto L_0x00f1
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f17275b     // Catch:{ all -> 0x01c4 }
            java.lang.String r6 = r6.getendcard_url()     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "alecfc=1"
            boolean r6 = r6.contains(r0)     // Catch:{ all -> 0x01c4 }
            if (r6 == 0) goto L_0x00f1
            r6 = 1
            r5.f17404z = r6     // Catch:{ all -> 0x01c4 }
        L_0x00f1:
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ all -> 0x01c4 }
            java.lang.String r6 = r6.getLanguage()     // Catch:{ all -> 0x01c4 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = "drawable"
            if (r0 != 0) goto L_0x0129
            java.lang.String r0 = "zh"
            boolean r6 = r6.equals(r0)     // Catch:{ all -> 0x01c4 }
            if (r6 == 0) goto L_0x0129
            android.widget.ImageView r6 = r5.f17395q     // Catch:{ all -> 0x01c4 }
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x01c4 }
            android.content.res.Resources r2 = r5.getResources()     // Catch:{ all -> 0x01c4 }
            java.lang.String r3 = "mbridge_reward_flag_cn"
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01c4 }
            java.lang.String r4 = r4.mo42884a()     // Catch:{ all -> 0x01c4 }
            int r1 = r2.getIdentifier(r3, r1, r4)     // Catch:{ all -> 0x01c4 }
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch:{ all -> 0x01c4 }
            r6.setImageDrawable(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x0148
        L_0x0129:
            android.widget.ImageView r6 = r5.f17395q     // Catch:{ all -> 0x01c4 }
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x01c4 }
            android.content.res.Resources r2 = r5.getResources()     // Catch:{ all -> 0x01c4 }
            java.lang.String r3 = "mbridge_reward_flag_en"
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01c4 }
            java.lang.String r4 = r4.mo42884a()     // Catch:{ all -> 0x01c4 }
            int r1 = r2.getIdentifier(r3, r1, r4)     // Catch:{ all -> 0x01c4 }
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch:{ all -> 0x01c4 }
            r6.setImageDrawable(r0)     // Catch:{ all -> 0x01c4 }
        L_0x0148:
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01c4 }
            java.lang.String r6 = r6.mo42896e()     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.b.b r0 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.b.a r6 = r0.mo42749b(r6)     // Catch:{ all -> 0x01c4 }
            r0 = 8
            if (r6 == 0) goto L_0x0176
            java.lang.String r6 = r6.mo42666K()     // Catch:{ all -> 0x01c4 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01c4 }
            if (r1 == 0) goto L_0x016b
            android.widget.ImageView r1 = r5.f17396r     // Catch:{ all -> 0x01c4 }
            r1.setVisibility(r0)     // Catch:{ all -> 0x01c4 }
        L_0x016b:
            android.widget.ImageView r1 = r5.f17396r     // Catch:{ all -> 0x01c4 }
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView$3 r2 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView$3     // Catch:{ all -> 0x01c4 }
            r2.<init>(r6)     // Catch:{ all -> 0x01c4 }
            r1.setOnClickListener(r2)     // Catch:{ all -> 0x01c4 }
            goto L_0x017b
        L_0x0176:
            android.widget.ImageView r6 = r5.f17396r     // Catch:{ all -> 0x01c4 }
            r6.setVisibility(r0)     // Catch:{ all -> 0x01c4 }
        L_0x017b:
            boolean r6 = r5.f17378A     // Catch:{ all -> 0x01c4 }
            if (r6 != 0) goto L_0x0184
            android.view.View r6 = r5.f17385H     // Catch:{ all -> 0x01c4 }
            r6.setVisibility(r0)     // Catch:{ all -> 0x01c4 }
        L_0x0184:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01c4 }
            r1 = 17
            if (r6 >= r1) goto L_0x0190
            android.widget.ImageView r6 = r5.f17391m     // Catch:{ all -> 0x01c4 }
            r6.setVisibility(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x01ce
        L_0x0190:
            android.widget.ImageView r6 = r5.f17393o     // Catch:{ all -> 0x01be }
            android.graphics.drawable.Drawable r6 = r6.getDrawable()     // Catch:{ all -> 0x01be }
            android.graphics.Bitmap r6 = r5.m17681a((android.graphics.drawable.Drawable) r6)     // Catch:{ all -> 0x01be }
            if (r6 == 0) goto L_0x01ce
            android.graphics.Bitmap r6 = r5.blurBitmap(r6)     // Catch:{ all -> 0x01be }
            if (r6 == 0) goto L_0x01ce
            android.widget.ImageView r1 = r5.f17391m     // Catch:{ all -> 0x01be }
            if (r1 == 0) goto L_0x01ab
            android.widget.ImageView r1 = r5.f17391m     // Catch:{ all -> 0x01be }
            r1.setImageBitmap(r6)     // Catch:{ all -> 0x01be }
        L_0x01ab:
            android.widget.RelativeLayout r1 = r5.f17392n     // Catch:{ all -> 0x01be }
            if (r1 == 0) goto L_0x01ce
            android.widget.RelativeLayout r1 = r5.f17392n     // Catch:{ all -> 0x01be }
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x01be }
            android.content.res.Resources r3 = r5.getResources()     // Catch:{ all -> 0x01be }
            r2.<init>(r3, r6)     // Catch:{ all -> 0x01be }
            r1.setBackground(r2)     // Catch:{ all -> 0x01be }
            goto L_0x01ce
        L_0x01be:
            android.widget.ImageView r6 = r5.f17391m     // Catch:{ all -> 0x01c4 }
            r6.setVisibility(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x01ce
        L_0x01c4:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.String r0 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r6)
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.preLoadData(com.mbridge.msdk.video.signal.factory.b):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17683a() {
        mo48578c();
        if (!this.f17279f) {
            this.f17278e.mo48315a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f17380C = alphaAnimation;
        alphaAnimation.setDuration(200);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        if (this.f17275b == null || !C6366u.m16221f(this.f17275b.getMof_template_url())) {
            this.f17402x.setVisibility(4);
            this.f17277d = configuration.orientation;
            if (this.f17277d == 2) {
                removeView(this.f17388j);
                m17684a((View) this.f17389k);
                return;
            }
            removeView(this.f17389k);
            m17684a((View) this.f17388j);
        }
    }

    public boolean canBackPress() {
        View view = this.f17385H;
        return view != null && view.getVisibility() == 0;
    }

    public void notifyShowListener() {
        this.f17278e.mo48315a(110, "");
    }

    /* renamed from: a */
    private void m17684a(View view) {
        if (view == null) {
            init(this.f17274a);
            preLoadData(this.f17403y);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            m17690b(view);
            mo48578c();
        }
        m17688b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48578c() {
        if (this.f17279f) {
            this.f17390l.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.f17404z) {
                        MBridgeNativeEndCardView.m17685a(MBridgeNativeEndCardView.this, 1);
                    }
                }
            });
            this.f17385H.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBridgeNativeEndCardView.this.f17278e.mo48315a(104, "");
                }
            });
            this.f17386I.setOnClickListener(new C7215a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo48366a(View view) {
                    MBridgeNativeEndCardView.m17685a(MBridgeNativeEndCardView.this, 0);
                }
            });
            this.f17394p.setOnClickListener(new C7215a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo48366a(View view) {
                    MBridgeNativeEndCardView.m17685a(MBridgeNativeEndCardView.this, 0);
                }
            });
            this.f17393o.setOnClickListener(new C7215a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo48366a(View view) {
                    MBridgeNativeEndCardView.m17685a(MBridgeNativeEndCardView.this, 0);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m17690b(View view) {
        try {
            this.f17390l = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.f17393o = (ImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.f17394p = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.f17395q = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.f17396r = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.f17397s = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.f17400v = (LinearLayout) view.findViewById(findID("mbridge_sv_starlevel"));
            this.f17385H = view.findViewById(findID("mbridge_iv_close"));
            this.f17386I = view.findViewById(findID("mbridge_tv_cta"));
            this.f17402x = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_controller"));
            if (this.f17282i) {
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(findID("mbridge_iv_adbanner_bg"));
                this.f17392n = relativeLayout;
                return isNotNULL(relativeLayout, this.f17393o, this.f17394p, this.f17397s, this.f17400v, this.f17385H, this.f17386I);
            }
            this.f17391m = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.f17398t = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            TextView textView = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.f17399u = textView;
            return isNotNULL(this.f17391m, this.f17393o, this.f17394p, this.f17397s, this.f17398t, textView, this.f17400v, this.f17385H, this.f17386I);
        } catch (Throwable th) {
            C6361q.m16155a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(this.f17274a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
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
    private Bitmap m17681a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            C6361q.m16154a(MBridgeBaseView.TAG, th.getMessage());
            return null;
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        C6361q.m16158d(MBridgeBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        this.f17381D = i;
        this.f17382E = i2;
        this.f17383F = i3;
        this.f17384G = i4;
        m17688b();
    }

    /* renamed from: b */
    private void m17688b() {
        if (this.f17275b == null || !C6366u.m16221f(this.f17275b.getMof_template_url())) {
            this.f17402x.postDelayed(new Runnable() {
                public final void run() {
                    MBridgeNativeEndCardView.this.f17402x.setPadding(MBridgeNativeEndCardView.this.f17381D, MBridgeNativeEndCardView.this.f17383F, MBridgeNativeEndCardView.this.f17382E, MBridgeNativeEndCardView.this.f17384G);
                    MBridgeNativeEndCardView.this.f17402x.startAnimation(MBridgeNativeEndCardView.this.f17380C);
                    MBridgeNativeEndCardView.this.f17402x.setVisibility(0);
                    if (MBridgeNativeEndCardView.this.f17385H.getVisibility() != 0 && MBridgeNativeEndCardView.this.f17378A) {
                        MBridgeNativeEndCardView.this.f17385H.setVisibility(0);
                    }
                }
            }, 200);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17685a(MBridgeNativeEndCardView mBridgeNativeEndCardView, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C6204a.f15397g, mBridgeNativeEndCardView.mo48577a(i));
            } catch (JSONException e) {
                e = e;
                jSONObject2 = jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
            e.printStackTrace();
            jSONObject = jSONObject2;
            mBridgeNativeEndCardView.f17278e.mo48315a(105, jSONObject);
        }
        mBridgeNativeEndCardView.f17278e.mo48315a(105, jSONObject);
    }
}
