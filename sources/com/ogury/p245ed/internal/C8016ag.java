package com.ogury.p245ed.internal;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import p269io.presage.C15576R;

/* renamed from: com.ogury.ed.internal.ag */
public final class C8016ag {

    /* renamed from: a */
    private final C8020aj f20825a;

    /* renamed from: b */
    private final ViewGroup f20826b;

    /* renamed from: c */
    private final C8171dv f20827c;

    /* renamed from: d */
    private final String f20828d;

    /* renamed from: e */
    private ImageButton f20829e = new ImageButton(this.f20826b.getContext());

    /* renamed from: f */
    private Handler f20830f = new Handler(Looper.getMainLooper());

    public C8016ag(C8020aj ajVar, ViewGroup viewGroup, C8171dv dvVar, String str) {
        C8467mq.m23881b(ajVar, "adController");
        C8467mq.m23881b(viewGroup, "root");
        C8467mq.m23881b(dvVar, "presageApi");
        C8467mq.m23881b(str, "closeButtonCallUrl");
        this.f20825a = ajVar;
        this.f20826b = viewGroup;
        this.f20827c = dvVar;
        this.f20828d = str;
        m22278d();
    }

    /* renamed from: d */
    private final void m22278d() {
        m22280f();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        this.f20829e.setLayoutParams(layoutParams2);
        this.f20829e.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C8016ag.m22277a(C8016ag.this, view);
            }
        });
        this.f20829e.setVisibility(8);
        this.f20826b.addView(this.f20829e, layoutParams2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m22277a(C8016ag agVar, View view) {
        C8467mq.m23881b(agVar, "this$0");
        agVar.f20825a.mo53166s();
        agVar.m22279e();
    }

    /* renamed from: e */
    private final void m22279e() {
        if (this.f20828d.length() > 0) {
            this.f20827c.mo53323a(this.f20828d);
        }
    }

    /* renamed from: f */
    private final void m22280f() {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f20829e.setBackground((Drawable) null);
        } else {
            this.f20829e.setBackgroundResource(0);
        }
        this.f20829e.setImageResource(C15576R.C15577drawable.btn_presage_mraid_close);
    }

    /* renamed from: a */
    public final void mo53130a(long j) {
        this.f20830f.postDelayed(new Runnable() {
            public final void run() {
                C8016ag.m22276a(C8016ag.this);
            }
        }, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m22276a(C8016ag agVar) {
        C8467mq.m23881b(agVar, "this$0");
        agVar.mo53129a();
    }

    /* renamed from: a */
    public final void mo53129a() {
        this.f20829e.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo53131b() {
        this.f20830f.removeCallbacksAndMessages((Object) null);
        this.f20829e.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo53132c() {
        this.f20830f.removeCallbacksAndMessages((Object) null);
    }
}
