package com.p243my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;

/* renamed from: com.my.tracker.obfuscated.v */
public final class C7878v {

    /* renamed from: f */
    static int f20173f = 3;

    /* renamed from: g */
    static volatile C7878v f20174g;

    /* renamed from: a */
    final C7828m f20175a;

    /* renamed from: b */
    final C7808e f20176b;

    /* renamed from: c */
    final Context f20177c;

    /* renamed from: d */
    InstallReferrerClient f20178d;

    /* renamed from: e */
    int f20179e;

    /* renamed from: com.my.tracker.obfuscated.v$a */
    final class C7879a implements InstallReferrerStateListener {
        C7879a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            C7877u0.m21547a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + C7878v.this.f20179e);
            C7878v.this.mo52512a((InstallReferrerStateListener) this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                C7878v.this.mo52512a((InstallReferrerStateListener) this);
                return;
            }
            C7877u0.m21547a("HuaweiReferrerHandler: install referrer setup is finished");
            C7878v.this.mo52511a(i);
        }
    }

    C7878v(C7828m mVar, C7808e eVar, Context context) {
        this.f20175a = mVar;
        this.f20176b = eVar;
        this.f20177c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m21554a(C7828m mVar, C7808e eVar, Context context) {
        if (f20174g == null) {
            synchronized (C7878v.class) {
                if (f20174g == null) {
                    C7878v vVar = new C7878v(mVar, eVar, context);
                    C7806d.m21130a(new Runnable() {
                        public final void run() {
                            C7878v.this.mo52510a();
                        }
                    });
                    f20174g = vVar;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52510a() {
        if (!C7823k0.m21211a(this.f20177c).mo52333n()) {
            try {
                C7877u0.m21547a("HuaweiReferrerHandler: initialize InstallReferrerClient");
                this.f20178d = InstallReferrerClient.newBuilder(this.f20177c).build();
                mo52512a((InstallReferrerStateListener) new C7879a());
            } catch (Throwable th) {
                C7877u0.m21552b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52511a(int i) {
        if (this.f20178d == null) {
            C7877u0.m21551b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        if (i == 0) {
            try {
                C7877u0.m21547a("HuaweiReferrerHandler: retrieving install referrer");
                mo52513a(this.f20178d.getInstallReferrer());
            } catch (Throwable th) {
                C7877u0.m21552b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
            }
        } else {
            C7877u0.m21547a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);
        }
        try {
            this.f20178d.endConnection();
        } catch (Throwable unused) {
        }
        this.f20178d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52512a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.f20178d == null) {
            C7877u0.m21547a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.f20179e;
        if (i >= f20173f) {
            C7877u0.m21547a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.f20178d.endConnection();
            } catch (Throwable unused) {
            }
            this.f20178d = null;
            return;
        }
        this.f20179e = i + 1;
        try {
            C7877u0.m21547a("HuaweiReferrerHandler: connect to referrer client");
            this.f20178d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            C7877u0.m21552b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            mo52512a(installReferrerStateListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52513a(ReferrerDetails referrerDetails) {
        C7823k0 a = C7823k0.m21211a(this.f20177c);
        if (a.mo52333n()) {
            C7877u0.m21547a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        C7877u0.m21547a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        String str = installReferrer;
        this.f20175a.mo52368b(str, C7814h.m21186b(this.f20177c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f20176b.mo52279a(installReferrer);
        a.mo52336q();
    }
}
