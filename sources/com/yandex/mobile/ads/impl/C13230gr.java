package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.view.View;
import com.vungle.warren.p261ui.JavascriptBridge;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.gr */
public final class C13230gr {

    /* renamed from: a */
    public static final C13230gr f34088a = new C13230gr();

    /* renamed from: com.yandex.mobile.ads.impl.gr$a */
    public static final class C13231a implements C12926dw {
        C13231a(C13513jm jmVar, f20 f20) {
        }
    }

    private C13230gr() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m36676a(Uri uri, d10 d10) {
        Intrinsics.checkNotNullParameter(d10, "divViewFacade");
        String authority = uri == null ? null : uri.getAuthority();
        if (authority != null && Intrinsics.areEqual((Object) JavascriptBridge.MraidHandler.DOWNLOAD_ACTION, (Object) authority) && uri.getQueryParameter("url") != null && (d10 instanceof C13513jm)) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m36679a(C14687tm tmVar, C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(tmVar, "action");
        Intrinsics.checkNotNullParameter(jmVar, "view");
        f50<Uri> f50 = tmVar.f40364h;
        Uri a = f50 == null ? null : f50.mo66924a(jmVar.mo66388b());
        if (a == null) {
            return false;
        }
        return f34088a.m36677a(a, tmVar.f40357a, jmVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m36678a(m10 m10, C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(m10, "action");
        Intrinsics.checkNotNullParameter(jmVar, "view");
        f50<Uri> f50 = m10.f37157f;
        Uri a = f50 == null ? null : f50.mo66924a(jmVar.mo66388b());
        if (a == null) {
            return false;
        }
        return f34088a.m36677a(a, m10.f37152a, jmVar);
    }

    /* renamed from: a */
    private final boolean m36677a(Uri uri, f20 f20, C13513jm jmVar) {
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null) {
            return false;
        }
        ij0 b = jmVar.mo68038h().mo65816n().mo65531b(jmVar, queryParameter, new C13231a(jmVar, f20));
        Intrinsics.checkNotNullExpressionValue(b, "loadRef");
        jmVar.mo68028a(b, (View) jmVar);
        return true;
    }
}
