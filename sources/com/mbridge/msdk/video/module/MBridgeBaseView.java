package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.video.module.p231a.p232a.C7033f;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";

    /* renamed from: a */
    protected Context f17274a;

    /* renamed from: b */
    protected CampaignEx f17275b;

    /* renamed from: c */
    protected LayoutInflater f17276c;

    /* renamed from: d */
    protected int f17277d;

    /* renamed from: e */
    protected C7027a f17278e;

    /* renamed from: f */
    protected boolean f17279f;

    /* renamed from: g */
    protected float f17280g;

    /* renamed from: h */
    protected float f17281h;

    /* renamed from: i */
    protected boolean f17282i;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo48578c() {
    }

    public abstract void init(Context context);

    public MBridgeBaseView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f17277d = 1;
        this.f17278e = new C7033f();
        this.f17279f = false;
        this.f17274a = context;
        this.f17276c = LayoutInflater.from(context);
        this.f17282i = z;
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17277d = 1;
        this.f17278e = new C7033f();
        this.f17279f = false;
        this.f17274a = context;
        this.f17276c = LayoutInflater.from(context);
        init(context);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f17277d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f17277d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setNotifyListener(C7027a aVar) {
        this.f17278e = aVar;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f17275b = campaignEx;
    }

    public int findID(String str) {
        return C6347k.m16084a(this.f17274a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C6347k.m16084a(this.f17274a.getApplicationContext(), str, "layout");
    }

    public int findColor(String str) {
        return C6347k.m16084a(this.f17274a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return C6347k.m16084a(this.f17274a.getApplicationContext(), str, "drawable");
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
        return this.f17274a.getResources().getConfiguration().orientation == 2;
    }

    public void setLayoutCenter(int i, int i2) {
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
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
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

    public CampaignEx getCampaign() {
        return this.f17275b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f17280g = motionEvent.getRawX();
        this.f17281h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo48579d() {
        return mo48577a(0).toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final JSONObject mo48577a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C6204a.f15395e, C6366u.m16186a(C6122a.m15302b().mo42895d(), this.f17280g));
                jSONObject2.put(C6204a.f15396f, C6366u.m16186a(C6122a.m15302b().mo42895d(), this.f17281h));
                jSONObject2.put(C6204a.f15398h, i);
                try {
                    this.f17277d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(C6204a.f15399i, this.f17277d);
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
}
