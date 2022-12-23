package com.p243my.target;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p243my.target.C7305a5;
import com.p243my.target.C7772z4;
import com.p243my.target.C7774z5;

/* renamed from: com.my.target.b5 */
public class C7330b5 implements C7305a5, C7774z5.C7775a {

    /* renamed from: a */
    public final C7774z5 f18362a;

    /* renamed from: b */
    public final C7363d6 f18363b;

    /* renamed from: c */
    public C7772z4.C7773a f18364c;

    /* renamed from: d */
    public C7305a5.C7306a f18365d;

    /* renamed from: e */
    public C7523l2 f18366e;

    public C7330b5(Context context) {
        this(new C7774z5(context), new C7363d6(context));
    }

    public C7330b5(C7774z5 z5Var, C7363d6 d6Var) {
        this.f18362a = z5Var;
        this.f18363b = d6Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        d6Var.addView(z5Var, 0);
        z5Var.setLayoutParams(layoutParams);
        z5Var.setBannerWebViewListener(this);
    }

    /* renamed from: a */
    public static C7330b5 m18782a(Context context) {
        return new C7330b5(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m18783e(String str) {
        mo49744f(str);
        this.f18362a.setOnLayoutListener((C7774z5.C7778d) null);
    }

    /* renamed from: a */
    public void mo49732a() {
    }

    /* renamed from: a */
    public void mo49733a(int i) {
        mo49581a((C7305a5.C7306a) null);
        mo49736a((C7772z4.C7773a) null);
        if (this.f18362a.getParent() != null) {
            ((ViewGroup) this.f18362a.getParent()).removeView(this.f18362a);
        }
        this.f18362a.mo49584a(i);
    }

    /* renamed from: a */
    public void mo49734a(WebView webView) {
        C7772z4.C7773a aVar = this.f18364c;
        if (aVar != null) {
            aVar.mo50582a(webView);
        }
    }

    /* renamed from: a */
    public void mo49581a(C7305a5.C7306a aVar) {
        this.f18365d = aVar;
    }

    /* renamed from: a */
    public void mo49735a(C7523l2 l2Var) {
        this.f18366e = l2Var;
        String source = l2Var.getSource();
        if (source == null) {
            mo49741c("failed to load, null html");
            return;
        }
        if (this.f18362a.getMeasuredHeight() == 0 || this.f18362a.getMeasuredWidth() == 0) {
            this.f18362a.setOnLayoutListener(new C7774z5.C7778d(source) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                /* renamed from: a */
                public final void mo49458a() {
                    C7330b5.this.m18783e(this.f$1);
                }
            });
        } else {
            mo49744f(source);
        }
        C7305a5.C7306a aVar = this.f18365d;
        if (aVar != null) {
            aVar.onLoad();
        }
    }

    /* renamed from: a */
    public void mo49736a(C7772z4.C7773a aVar) {
        this.f18364c = aVar;
    }

    /* renamed from: a */
    public void mo49737a(String str) {
    }

    /* renamed from: a */
    public void mo49738a(boolean z) {
    }

    /* renamed from: b */
    public void mo49739b() {
    }

    /* renamed from: b */
    public void mo49740b(String str) {
        if (this.f18366e != null) {
            mo49742d(str);
        }
    }

    /* renamed from: c */
    public final void mo49741c(String str) {
        C7305a5.C7306a aVar = this.f18365d;
        if (aVar != null) {
            aVar.onNoAd(str);
        }
    }

    /* renamed from: d */
    public final void mo49742d(String str) {
        C7523l2 l2Var;
        C7772z4.C7773a aVar = this.f18364c;
        if (aVar != null && (l2Var = this.f18366e) != null) {
            aVar.mo50584a(l2Var, str);
        }
    }

    /* renamed from: f */
    public void mo49743f() {
        C7523l2 l2Var;
        C7772z4.C7773a aVar = this.f18364c;
        if (aVar != null && (l2Var = this.f18366e) != null) {
            aVar.mo50583a((C7768z1) l2Var);
        }
    }

    /* renamed from: f */
    public final void mo49744f(String str) {
        this.f18362a.setData(str);
    }

    public C7363d6 getView() {
        return this.f18363b;
    }
}
