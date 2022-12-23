package com.mbridge.msdk.video.p214bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.video.p214bt.p215a.C6877c;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.BTBaseView */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* renamed from: n */
    protected static int f16873n = 0;

    /* renamed from: o */
    protected static int f16874o = 1;

    /* renamed from: a */
    protected Context f16875a;

    /* renamed from: b */
    protected CampaignEx f16876b;

    /* renamed from: c */
    protected String f16877c;

    /* renamed from: d */
    protected String f16878d;

    /* renamed from: e */
    protected C7179c f16879e;

    /* renamed from: f */
    protected LayoutInflater f16880f;

    /* renamed from: g */
    protected int f16881g;

    /* renamed from: h */
    protected boolean f16882h;

    /* renamed from: i */
    protected float f16883i;

    /* renamed from: j */
    protected float f16884j;

    /* renamed from: k */
    protected Rect f16885k;

    /* renamed from: l */
    protected int f16886l;

    /* renamed from: m */
    protected int f16887m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo48235a() {
    }

    public abstract void init(Context context);

    public abstract void onDestory();

    public String getUnitId() {
        return this.f16877c;
    }

    public void setUnitId(String str) {
        this.f16877c = str;
    }

    public String getInstanceId() {
        return this.f16878d;
    }

    public void setInstanceId(String str) {
        this.f16878d = str;
    }

    public BTBaseView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16878d = "";
        this.f16881g = 1;
        this.f16882h = false;
        this.f16875a = context;
        this.f16880f = LayoutInflater.from(context);
        init(context);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f16881g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f16881g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f16876b = campaignEx;
    }

    public void setRewardUnitSetting(C7179c cVar) {
        this.f16879e = cVar;
    }

    public int findID(String str) {
        return C6347k.m16084a(this.f16875a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C6347k.m16084a(this.f16875a.getApplicationContext(), str, "layout");
    }

    public int findColor(String str) {
        return C6347k.m16084a(this.f16875a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return C6347k.m16084a(this.f16875a.getApplicationContext(), str, "drawable");
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
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

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            return;
        }
        layoutParams.height = -2;
        layoutParams.width = -2;
    }

    public void defaultShow() {
        C6361q.m16154a(TAG, "defaultShow");
    }

    public boolean isLandscape() {
        return this.f16875a.getResources().getConfiguration().orientation == 2;
    }

    public void setLayoutCenter(int i, int i2) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i != -999) {
                parentRelativeLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentRelativeLayoutParams.height = i2;
            }
            setLayoutParams(parentRelativeLayoutParams);
        } else if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i != -999) {
                parentLinearLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentLinearLayoutParams.height = i2;
            }
            setLayoutParams(parentLinearLayoutParams);
        } else if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i != -999) {
                parentFrameLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentFrameLayoutParams.height = i2;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i2;
            parentRelativeLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentRelativeLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentRelativeLayoutParams.height = i4;
            }
            setLayoutParams(parentRelativeLayoutParams);
        } else if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i2;
            parentLinearLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentLinearLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentLinearLayoutParams.height = i4;
            }
            setLayoutParams(parentLinearLayoutParams);
        } else if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i2;
            parentFrameLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentFrameLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentFrameLayoutParams.height = i4;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public CampaignEx getCampaign() {
        return this.f16876b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f16883i = motionEvent.getRawX();
        this.f16884j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final JSONObject mo48234a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C6204a.f15395e, C6366u.m16186a(C6122a.m15302b().mo42895d(), this.f16883i));
                jSONObject2.put(C6204a.f15396f, C6366u.m16186a(C6122a.m15302b().mo42895d(), this.f16884j));
                jSONObject2.put(C6204a.f15398h, i);
                try {
                    this.f16881g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(C6204a.f15399i, this.f16881g);
                jSONObject2.put(C6204a.f15400j, (double) C6366u.m16215d(getContext()));
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            return jSONObject;
        }
    }

    public Rect getRect() {
        return this.f16885k;
    }

    public void setRect(Rect rect) {
        this.f16885k = rect;
    }

    public void setLayout(int i, int i2) {
        this.f16886l = i;
        this.f16887m = i2;
    }

    public int getViewWidth() {
        return this.f16886l;
    }

    public int getViewHeight() {
        return this.f16887m;
    }

    /* renamed from: a */
    protected static void m17280a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f16873n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            C6563g.m16891a().mo44522a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C6877c.m17219a().mo48193a(webView, e.getMessage());
            C6361q.m16154a(TAG, e.getMessage());
        }
    }
}
