package com.yandex.metrica.impl.p265ob;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.yandex.metrica.impl.p265ob.C10255Fg;

/* renamed from: com.yandex.metrica.impl.ob.Sg */
public class C10753Sg implements C10524Mg {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final InstallReferrerClient f25779a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11769sn f25780b;

    /* renamed from: com.yandex.metrica.impl.ob.Sg$a */
    class C10754a implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ C10928Xg f25781a;

        /* renamed from: com.yandex.metrica.impl.ob.Sg$a$a */
        class C10755a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C10255Fg f25783a;

            C10755a(C10255Fg fg) {
                this.f25783a = fg;
            }

            public void run() {
                C10754a.this.f25781a.mo61927a(this.f25783a);
            }
        }

        C10754a(C10928Xg xg) {
            this.f25781a = xg;
        }

        public void onInstallReferrerServiceDisconnected() {
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == 0) {
                try {
                    ReferrerDetails installReferrer = C10753Sg.this.f25779a.getInstallReferrer();
                    C10255Fg fg = new C10255Fg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), C10255Fg.C10256a.GP);
                    ((C11725rn) C10753Sg.this.f25780b).execute(new C10755a(fg));
                } catch (Throwable th) {
                    C10753Sg.m27717a(C10753Sg.this, this.f25781a, th);
                }
            } else {
                C10753Sg sg = C10753Sg.this;
                C10928Xg xg = this.f25781a;
                C10753Sg.m27717a(sg, xg, new IllegalStateException("Referrer check failed with error " + i));
            }
            try {
                C10753Sg.this.f25779a.endConnection();
            } catch (Throwable unused) {
            }
        }
    }

    C10753Sg(InstallReferrerClient installReferrerClient, C11769sn snVar) {
        this.f25779a = installReferrerClient;
        this.f25780b = snVar;
    }

    /* renamed from: a */
    public void mo61801a(C10928Xg xg) throws Throwable {
        this.f25779a.startConnection(new C10754a(xg));
    }

    /* renamed from: a */
    static void m27717a(C10753Sg sg, C10928Xg xg, Throwable th) {
        ((C11725rn) sg.f25780b).execute(new C10785Tg(sg, xg, th));
    }
}
