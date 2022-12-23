package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.Executor;

class ws0 {

    /* renamed from: a */
    private final Context f42211a;

    /* renamed from: b */
    private final Executor f42212b = pj0.m40784a().mo69371b();

    /* renamed from: com.yandex.mobile.ads.impl.ws0$a */
    private static class C15106a implements Runnable {

        /* renamed from: b */
        private final AdResponse<String> f42213b;

        /* renamed from: c */
        private final g51 f42214c;

        /* renamed from: d */
        private final xs0 f42215d;

        C15106a(Context context, AdResponse<String> adResponse, g51 g51) {
            this.f42213b = adResponse;
            this.f42214c = g51;
            this.f42215d = new xs0(context);
        }

        public void run() {
            as0 a = this.f42215d.mo70938a(this.f42213b);
            if (a != null) {
                this.f42214c.mo67201a(a);
            } else {
                this.f42214c.mo67200a(C14559s3.f39812e);
            }
        }
    }

    ws0(Context context) {
        this.f42211a = context.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70749a(AdResponse<String> adResponse, g51 g51) {
        this.f42212b.execute(new C15106a(this.f42211a, adResponse, g51));
    }
}
