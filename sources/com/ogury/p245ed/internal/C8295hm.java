package com.ogury.p245ed.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* renamed from: com.ogury.ed.internal.hm */
public final class C8295hm {

    /* renamed from: a */
    private final Context f21417a;

    /* renamed from: b */
    private final FrameLayout f21418b;

    /* renamed from: c */
    private final C8185eb f21419c;

    public C8295hm(Context context, FrameLayout frameLayout, C8185eb ebVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(frameLayout, "activityRoot");
        C8467mq.m23881b(ebVar, "ad");
        this.f21417a = context;
        this.f21418b = frameLayout;
        this.f21419c = ebVar;
    }

    /* renamed from: a */
    public final C8362jh mo53661a(C8310hv hvVar) {
        C8467mq.m23881b(hvVar, "webViewArgs");
        FrameLayout.LayoutParams b = m23329a(hvVar, (FrameLayout.LayoutParams) null);
        C8362jh a = C8365jk.m23712a(this.f21417a, this.f21419c);
        if (a == null) {
            return null;
        }
        a.setTag(hvVar.mo53701c());
        C8296hn.m23336a(a);
        this.f21418b.addView(a, b);
        return a;
    }

    /* renamed from: a */
    public static void m23330a(WebView webView, C8310hv hvVar) {
        C8467mq.m23881b(webView, "webView");
        C8467mq.m23881b(hvVar, "webViewArgs");
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        webView.setLayoutParams(m23329a(hvVar, layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null));
    }

    /* renamed from: a */
    public final void mo53662a(WebView webView) {
        C8467mq.m23881b(webView, "webView");
        this.f21418b.removeView(webView);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static FrameLayout.LayoutParams m23329a(C8310hv hvVar, FrameLayout.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        m23333b(hvVar, layoutParams);
        m23331a(layoutParams, hvVar);
        return layoutParams;
    }

    /* renamed from: b */
    private static void m23333b(C8310hv hvVar, FrameLayout.LayoutParams layoutParams) {
        if (hvVar.mo53709g() != -1) {
            layoutParams.leftMargin = C8258gi.m23195b(hvVar.mo53709g());
        }
        if (hvVar.mo53708f() != -1) {
            layoutParams.topMargin = C8258gi.m23195b(hvVar.mo53708f());
        }
    }

    /* renamed from: a */
    private static void m23331a(FrameLayout.LayoutParams layoutParams, C8310hv hvVar) {
        int i = -1;
        layoutParams.width = hvVar.mo53707e() <= 0 ? -1 : C8258gi.m23195b(hvVar.mo53707e());
        if (hvVar.mo53705d() > 0) {
            i = C8258gi.m23195b(hvVar.mo53705d());
        }
        layoutParams.height = i;
    }
}
