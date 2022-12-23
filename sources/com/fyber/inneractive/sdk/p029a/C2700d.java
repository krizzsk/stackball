package com.fyber.inneractive.sdk.p029a;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.p049h.C2939ac;
import com.fyber.inneractive.sdk.p049h.C2977r;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.a.d */
public final class C2700d {

    /* renamed from: a */
    public String f6364a;

    /* renamed from: b */
    public String f6365b;

    /* renamed from: c */
    public String f6366c;

    /* renamed from: d */
    private long f6367d;

    /* renamed from: a */
    public final void mo17907a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f6367d) >= 60 && IAConfigManager.m5929c().f6586a.mo18049a("use_js_inline", false)) {
            Application p = C3657l.m9125p();
            if (p == null) {
                IAlog.m9036d("fetchJS() failed context null", new Object[0]);
                return;
            }
            this.f6367d = System.currentTimeMillis();
            IAConfigManager.m5937h().mo18441a(new C2939ac(new C2977r<String>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                    String str = (String) obj;
                    if (str != null) {
                        C2700d.this.f6364a = str;
                    }
                }
            }, p, new C2699c("https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js", "MRAID-VIDEO.js")));
            IAConfigManager.m5937h().mo18441a(new C2939ac(new C2977r<String>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                    String str = (String) obj;
                    if (str != null) {
                        C2700d.this.f6365b = str;
                    }
                }
            }, p, new C2699c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css")));
            IAConfigManager.m5937h().mo18441a(new C2939ac(new C2977r<String>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                    String str = (String) obj;
                    if (str != null) {
                        C2700d.this.f6366c = str;
                    }
                }
            }, p, new C2699c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js")));
        }
    }
}
