package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.video.signal.factory.C7158b;
import com.mbridge.msdk.videocommon.download.C7191g;
import org.json.JSONObject;

public class MBridgeClickMiniCardView extends MBridgeH5EndCardView {

    /* renamed from: u */
    private boolean f17298u = false;

    public MBridgeClickMiniCardView(Context context) {
        super(context);
    }

    public MBridgeClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f17279f) {
            m17641a(this.f17345j);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final RelativeLayout.LayoutParams mo48574b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo48605e() {
        super.mo48605e();
        if (this.f17279f) {
            setBackgroundResource(findColor("mbridge_reward_minicard_bg"));
            m17641a(this.f17345j);
            setClickable(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo48573a() {
        String str = null;
        if (this.f17275b == null) {
            return null;
        }
        CampaignEx.C6189c rewardTemplateMode = this.f17275b.getRewardTemplateMode();
        if (rewardTemplateMode != null) {
            str = rewardTemplateMode.mo43509c();
        }
        if (TextUtils.isEmpty(str) || !str.contains(".zip")) {
            return str;
        }
        String b = C7191g.m18286a().mo49220b(str);
        return !TextUtils.isEmpty(b) ? b : str;
    }

    public void preLoadData(C7158b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void webviewshow() {
        if (this.f17348m != null) {
            this.f17348m.post(new Runnable() {
                public final void run() {
                    try {
                        C6361q.m16154a(MBridgeBaseView.TAG, "webviewshow");
                        String str = "";
                        try {
                            int[] iArr = new int[2];
                            MBridgeClickMiniCardView.this.f17348m.getLocationOnScreen(iArr);
                            C6361q.m16158d(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", C6366u.m16186a(C6122a.m15302b().mo42895d(), (float) iArr[0]));
                            jSONObject.put("startY", C6366u.m16186a(C6122a.m15302b().mo42895d(), (float) iArr[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            C6361q.m16155a(MBridgeBaseView.TAG, th.getMessage(), th);
                        }
                        C6563g.m16891a().mo44522a((WebView) MBridgeClickMiniCardView.this.f17348m, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m17641a(View view) {
        int h = C6366u.m16224h(this.f17274a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((((float) h) * 0.7f) + 0.5f);
        layoutParams.height = (int) ((((float) C6366u.m16222g(this.f17274a)) * 0.7f) + 0.5f);
        view.setLayoutParams(layoutParams);
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMBridgeClickMiniCardViewClickable(boolean z) {
        setClickable(z);
    }

    public void setMiniCardLocation(int i, int i2, int i3, int i4) {
        this.f17298u = true;
        resizeMiniCard(i3, i4);
    }

    public void resizeMiniCard(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 11) {
            View findViewById = ((Activity) this.f17274a).getWindow().findViewById(16908290);
            int width = findViewById.getWidth();
            int height = findViewById.getHeight();
            if (i > 0 && i2 > 0 && i <= width && i2 <= height) {
                ViewGroup.LayoutParams layoutParams = this.f17345j.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i2;
                this.f17345j.setLayoutParams(layoutParams);
            }
        }
    }

    public void setRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float) C6366u.m16203b(getContext(), (float) i));
            gradientDrawable.setColor(-1);
            if (Build.VERSION.SDK_INT >= 16) {
                this.f17348m.setBackground(gradientDrawable);
            } else {
                this.f17348m.setBackgroundDrawable(gradientDrawable);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.f17348m.setClipToOutline(true);
            }
        }
    }
}
