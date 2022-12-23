package com.p243my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.exoplayer2.audio.AacUtil;
import com.p243my.target.C7346c6;
import com.p243my.target.C7599p3;
import com.p243my.target.C7651s5;
import com.p243my.target.C7774z5;
import com.p243my.target.common.models.VideoData;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.l0 */
public final class C7514l0 implements C7651s5.C7652a, C7774z5.C7775a {

    /* renamed from: a */
    public final C7479j2 f18917a;

    /* renamed from: b */
    public C7311a9 f18918b;

    /* renamed from: c */
    public WeakReference<C7651s5> f18919c;

    /* renamed from: d */
    public WeakReference<C7774z5> f18920d;

    /* renamed from: e */
    public C7515a f18921e;

    /* renamed from: f */
    public C7599p3 f18922f;

    /* renamed from: g */
    public C7774z5 f18923g;

    /* renamed from: h */
    public boolean f18924h;

    /* renamed from: i */
    public boolean f18925i;

    /* renamed from: com.my.target.l0$a */
    public interface C7515a {
        /* renamed from: a */
        void mo50112a(C7479j2 j2Var, String str, Context context);
    }

    public C7514l0(C7479j2 j2Var) {
        this.f18917a = j2Var;
    }

    /* renamed from: a */
    public static C7514l0 m19634a(C7479j2 j2Var) {
        return new C7514l0(j2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19635a(ProgressBar progressBar) {
        mo50751a(this.f18923g, progressBar);
    }

    /* renamed from: a */
    public void mo50748a(Context context) {
        C7651s5 a = C7651s5.m20348a(this, context);
        this.f18919c = new WeakReference<>(a);
        try {
            a.show();
        } catch (Throwable th) {
            th.printStackTrace();
            C7374e0.m18990b("Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
            mo50267q();
        }
    }

    /* renamed from: a */
    public void mo49734a(WebView webView) {
        C7599p3 p3Var = this.f18922f;
        if (p3Var != null) {
            p3Var.mo51324a((View) webView, new C7599p3.C7602c[0]);
            this.f18922f.mo51329c();
        }
    }

    /* renamed from: a */
    public void mo50749a(C7515a aVar) {
        this.f18921e = aVar;
    }

    /* renamed from: a */
    public final void m19636b(C7651s5 s5Var) {
        if (s5Var.isShowing()) {
            s5Var.dismiss();
        }
    }

    /* renamed from: a */
    public void mo50263a(C7651s5 s5Var, FrameLayout frameLayout) {
        C7346c6 c6Var = new C7346c6(frameLayout.getContext());
        c6Var.setOnCloseListener(new C7346c6.C7347a(s5Var) {
            public final /* synthetic */ C7651s5 f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: d */
            public final void mo49437d() {
                C7514l0.this.m19636b(this.f$1);
            }
        });
        frameLayout.addView(c6Var, -1, -1);
        C7774z5 z5Var = new C7774z5(frameLayout.getContext());
        this.f18923g = z5Var;
        z5Var.setVisibility(8);
        this.f18923g.setBannerWebViewListener(this);
        c6Var.addView(this.f18923g, new FrameLayout.LayoutParams(-1, -1));
        this.f18923g.setData(this.f18917a.getSource());
        ProgressBar progressBar = new ProgressBar(frameLayout.getContext(), (AttributeSet) null, 16842871);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        frameLayout.postDelayed(new Runnable(progressBar) {
            public final /* synthetic */ ProgressBar f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7514l0.this.m19635a(this.f$1);
            }
        }, 555);
    }

    /* renamed from: a */
    public final void mo50751a(C7774z5 z5Var, ProgressBar progressBar) {
        this.f18922f = C7599p3.m20069a(this.f18917a, 1, (C7413g2<VideoData>) null, z5Var.getContext());
        this.f18920d = new WeakReference<>(z5Var);
        progressBar.setVisibility(8);
        z5Var.setVisibility(0);
        C7311a9 a9Var = this.f18918b;
        if (a9Var != null) {
            a9Var.mo49622b();
        }
        C7311a9 a = C7311a9.m18722a(this.f18917a.getViewability(), this.f18917a.getStatHolder());
        this.f18918b = a;
        if (this.f18925i) {
            a.mo49623b(z5Var);
        }
        C7741x8.m20827c((List<C7328b3>) this.f18917a.getStatHolder().mo49800a("playbackStarted"), z5Var.getContext());
    }

    /* renamed from: a */
    public void mo49737a(String str) {
        C7374e0.m18989a("content JS error: " + str);
    }

    /* renamed from: b */
    public void mo49740b(String str) {
        C7651s5 s5Var;
        WeakReference<C7651s5> weakReference = this.f18919c;
        if (weakReference != null && (s5Var = (C7651s5) weakReference.get()) != null) {
            C7515a aVar = this.f18921e;
            if (aVar != null) {
                aVar.mo50112a(this.f18917a, str, s5Var.getContext());
            }
            this.f18924h = true;
            m19636b(s5Var);
        }
    }

    /* renamed from: b */
    public void mo50265b(boolean z) {
        C7774z5 z5Var;
        if (z != this.f18925i) {
            this.f18925i = z;
            C7311a9 a9Var = this.f18918b;
            if (a9Var != null) {
                if (z) {
                    WeakReference<C7774z5> weakReference = this.f18920d;
                    if (weakReference != null && (z5Var = (C7774z5) weakReference.get()) != null) {
                        this.f18918b.mo49623b(z5Var);
                        return;
                    }
                    return;
                }
                a9Var.mo49622b();
            }
        }
    }

    /* renamed from: q */
    public void mo50267q() {
        WeakReference<C7651s5> weakReference = this.f18919c;
        if (weakReference != null) {
            C7651s5 s5Var = (C7651s5) weakReference.get();
            if (!this.f18924h) {
                C7741x8.m20827c((List<C7328b3>) this.f18917a.getStatHolder().mo49800a("closedByUser"), s5Var.getContext());
            }
            this.f18919c.clear();
            this.f18919c = null;
        }
        C7311a9 a9Var = this.f18918b;
        if (a9Var != null) {
            a9Var.mo49622b();
            this.f18918b = null;
        }
        WeakReference<C7774z5> weakReference2 = this.f18920d;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.f18920d = null;
        }
        C7599p3 p3Var = this.f18922f;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
        C7774z5 z5Var = this.f18923g;
        if (z5Var != null) {
            z5Var.mo49584a(this.f18922f != null ? AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND : 0);
        }
    }
}
