package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.util.an */
public final class C3634an {

    /* renamed from: a */
    volatile String f9905a = null;

    /* renamed from: b */
    public Context f9906b = null;

    /* renamed from: c */
    public AtomicBoolean f9907c = new AtomicBoolean(false);

    /* renamed from: d */
    private Runnable f9908d = new Runnable() {
        public final void run() {
            C3634an.m9053a(C3634an.this);
        }
    };

    /* renamed from: a */
    public final String mo19554a() {
        if (!TextUtils.isEmpty(this.f9905a)) {
            return this.f9905a;
        }
        if (this.f9908d != null) {
            C3662m.m9137a().removeCallbacks(this.f9908d);
            C3662m.m9137a().postDelayed(this.f9908d, 50);
        }
        return System.getProperty("http.agent");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19555a(final String str) {
        this.f9905a = str;
        if (!TextUtils.isEmpty(this.f9905a)) {
            IAlog.m9034b("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
            this.f9907c.compareAndSet(false, true);
        }
        C3662m.f9942a.execute(new Runnable() {
            public final void run() {
                C3634an.this.f9906b.getSharedPreferences("fyber.ua", 0).edit().putString("ua", str).apply();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo19556b() {
        String str;
        try {
            str = new WebView(this.f9906b).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            mo19555a(str);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m9053a(C3634an anVar) {
        if (Build.VERSION.SDK_INT >= 17) {
            C3662m.f9942a.execute(new Runnable() {
                public final void run() {
                    if (C3634an.this.f9906b != null) {
                        String str = null;
                        try {
                            str = WebSettings.getDefaultUserAgent(C3634an.this.f9906b);
                        } catch (Throwable unused) {
                        }
                        if (!TextUtils.isEmpty(str)) {
                            C3634an.this.mo19555a(str);
                        }
                    }
                }
            });
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            anVar.mo19556b();
        } else {
            C3662m.m9137a().post(new Runnable() {
                public final void run() {
                    C3634an.this.mo19556b();
                }
            });
        }
    }
}
