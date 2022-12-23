package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.p168c.C6216b;
import com.mbridge.msdk.foundation.same.p168c.C6219c;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.video.dynview.C6923a;
import com.mbridge.msdk.video.dynview.p220c.C6931a;
import com.mbridge.msdk.video.dynview.p221d.C6934c;
import com.mbridge.msdk.video.dynview.p230i.C6983c;
import com.mbridge.msdk.video.module.p231a.p232a.C7032e;
import com.mbridge.msdk.video.signal.factory.C7158b;
import com.mbridge.msdk.widget.C7215a;
import org.json.JSONException;
import org.json.JSONObject;

public class MBridgeClickCTAView extends MBridgeBaseView {

    /* renamed from: j */
    private ViewGroup f17283j;

    /* renamed from: k */
    private ImageView f17284k;

    /* renamed from: l */
    private TextView f17285l;

    /* renamed from: m */
    private TextView f17286m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public TextView f17287n;

    /* renamed from: o */
    private String f17288o;

    /* renamed from: p */
    private float f17289p;

    /* renamed from: q */
    private float f17290q;

    /* renamed from: r */
    private int f17291r;

    /* renamed from: s */
    private ObjectAnimator f17292s;

    public void init(Context context) {
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f17292s = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f17288o = str;
    }

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48578c() {
        super.mo48578c();
        if (this.f17279f) {
            if (this.f17275b != null && C6366u.m16221f(this.f17275b.getMof_template_url())) {
                setOnClickListener(new C7215a() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo48366a(View view) {
                        MBridgeClickCTAView.m17633b(MBridgeClickCTAView.this);
                    }
                });
            }
            this.f17286m.setOnClickListener(new C7215a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo48366a(View view) {
                    MBridgeClickCTAView.m17633b(MBridgeClickCTAView.this);
                }
            });
        }
    }

    public void preLoadData(C7158b bVar) {
        if (this.f17275b != null) {
            if (C6366u.m16221f(this.f17275b.getMof_template_url())) {
                C6923a.m17464a().mo48419a(new C6983c().mo48505a(this, "mbridge_reward_layer_floor_bottom", 3, this.f17275b.getCampaignUnitId()), new C6934c() {
                    /* renamed from: a */
                    public final void mo48343a(View view) {
                        this.addView(view);
                        MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                        mBridgeClickCTAView.f17279f = mBridgeClickCTAView.m17634b();
                        MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                        TextView unused = mBridgeClickCTAView2.f17287n = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                        MBridgeClickCTAView.this.mo48578c();
                    }

                    /* renamed from: a */
                    public final void mo48344a(C6931a aVar) {
                        C6361q.m16158d(MBridgeBaseView.TAG, "errorMsg:" + aVar.mo48442b());
                    }
                });
            } else {
                int findLayout = findLayout("mbridge_reward_clickable_cta");
                if (findLayout >= 0) {
                    this.f17276c.inflate(findLayout, this);
                    this.f17279f = m17634b();
                    mo48578c();
                    setWrapContent();
                }
            }
            if (this.f17279f) {
                this.f17286m.setText(this.f17275b.getAdCall());
                if (!TextUtils.isEmpty(this.f17275b.getIconUrl())) {
                    this.f17285l.setText(this.f17275b.getAppName());
                    TextView textView = this.f17287n;
                    if (textView != null) {
                        textView.setText(this.f17275b.getAppDesc());
                    }
                    C6216b.m15729a(this.f17274a.getApplicationContext()).mo43786a(this.f17275b.getIconUrl(), (C6219c) new C7032e(this.f17284k, this.f17275b, this.f17288o) {
                        public final void onFailedLoad(String str, String str2) {
                            super.onFailedLoad(str, str2);
                            MBridgeClickCTAView.this.m17631a();
                        }
                    });
                    return;
                }
                m17631a();
            }
        }
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f17291r = configuration.orientation;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17631a() {
        this.f17283j.setBackgroundColor(0);
        this.f17284k.setVisibility(8);
        this.f17287n.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m17634b() {
        this.f17283j = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f17284k = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f17285l = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.f17286m = textView;
        return isNotNULL(this.f17283j, this.f17284k, this.f17285l, textView);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f17289p = motionEvent.getRawX();
        this.f17290q = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f17292s;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f17292s;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m17633b(MBridgeClickCTAView mBridgeClickCTAView) {
        JSONObject jSONObject;
        JSONException e;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C6204a.f15397g, mBridgeClickCTAView.mo48577a(0));
            } catch (JSONException e2) {
                e = e2;
            }
        } catch (JSONException e3) {
            JSONException jSONException = e3;
            jSONObject = null;
            e = jSONException;
            e.printStackTrace();
            mBridgeClickCTAView.f17278e.mo48315a(105, jSONObject);
        }
        mBridgeClickCTAView.f17278e.mo48315a(105, jSONObject);
    }
}
