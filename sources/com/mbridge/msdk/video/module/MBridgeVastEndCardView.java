package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.signal.factory.C7158b;
import com.mbridge.msdk.widget.C7215a;

public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* renamed from: j */
    private ViewGroup f17415j;

    /* renamed from: k */
    private View f17416k;

    /* renamed from: l */
    private View f17417l;

    public void preLoadData(C7158b bVar) {
    }

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_vast");
        if (findLayout >= 0) {
            this.f17276c.inflate(findLayout, this);
            this.f17415j = (ViewGroup) findViewById(findID("mbridge_rl_content"));
            this.f17416k = findViewById(findID("mbridge_iv_vastclose"));
            View findViewById = findViewById(findID("mbridge_iv_vastok"));
            this.f17417l = findViewById;
            this.f17279f = isNotNULL(this.f17415j, this.f17416k, findViewById);
            mo48578c();
            if (this.f17279f) {
                setMatchParent();
                setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f17415j.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48578c() {
        super.mo48578c();
        if (this.f17279f) {
            this.f17416k.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBridgeVastEndCardView.this.f17278e.mo48315a(104, "");
                }
            });
            this.f17417l.setOnClickListener(new C7215a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo48366a(View view) {
                    MBridgeVastEndCardView.this.f17278e.mo48315a(108, MBridgeVastEndCardView.this.mo48579d());
                }
            });
        }
    }

    public void notifyShowListener() {
        this.f17278e.mo48315a(111, "");
    }
}
