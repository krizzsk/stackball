package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: com.my.tracker.obfuscated.q */
public final class C7864q {

    /* renamed from: f */
    static int f20137f = 3;

    /* renamed from: g */
    static volatile C7864q f20138g;

    /* renamed from: a */
    final C7828m f20139a;

    /* renamed from: b */
    final C7808e f20140b;

    /* renamed from: c */
    final Context f20141c;

    /* renamed from: d */
    InstallReferrerClient f20142d;

    /* renamed from: e */
    int f20143e;

    /* renamed from: com.my.tracker.obfuscated.q$a */
    final class C7865a implements InstallReferrerStateListener {
        C7865a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            C7877u0.m21547a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + C7864q.this.f20143e);
            C7864q.this.mo52485a((InstallReferrerStateListener) this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            C7877u0.m21547a("ReferrerHandler: install referrer setup is finished");
            if (i == -1) {
                C7864q.this.mo52485a((InstallReferrerStateListener) this);
            } else {
                C7864q.this.mo52484a(i);
            }
        }
    }

    C7864q(C7828m mVar, C7808e eVar, Context context) {
        this.f20139a = mVar;
        this.f20140b = eVar;
        this.f20141c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m21496a(C7828m mVar, C7808e eVar, Context context) {
        if (f20138g == null) {
            synchronized (C7864q.class) {
                if (f20138g == null) {
                    C7864q qVar = new C7864q(mVar, eVar, context);
                    C7806d.m21130a(new Runnable() {
                        public final void run() {
                            C7864q.m21497a(C7864q.this);
                        }
                    });
                    f20138g = qVar;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m21497a(C7864q qVar) {
        qVar.mo52488b();
        qVar.mo52483a();
    }

    /* renamed from: a */
    public static void m21498a(String str, Context context, Runnable runnable) {
        C7864q qVar = f20138g;
        if (qVar == null) {
            C7823k0 a = C7823k0.m21211a(context);
            if (!a.mo52335p()) {
                a.mo52332m(str);
            }
            runnable.run();
            return;
        }
        qVar.mo52487a(str, runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m21500c() {
        try {
            C7877u0.m21547a("ReferrerHandler: initialize InstallReferrerClient");
            this.f20142d = InstallReferrerClient.newBuilder(this.f20141c).build();
            mo52485a((InstallReferrerStateListener) new C7865a());
        } catch (Throwable th) {
            C7877u0.m21552b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52483a() {
        if (!C7823k0.m21211a(this.f20141c).mo52333n()) {
            C7806d.m21132c(new Runnable() {
                public final void run() {
                    C7864q.this.m21500c();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52484a(int i) {
        if (this.f20142d == null) {
            C7877u0.m21551b("ReferrerHandler: install referrer client is null");
            return;
        }
        if (i == 0) {
            try {
                C7877u0.m21547a("ReferrerHandler: retrieving install referrer");
                C7806d.m21130a(new Runnable(this.f20142d.getInstallReferrer()) {
                    public final /* synthetic */ ReferrerDetails f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7864q.this.m21499b(this.f$1);
                    }
                });
            } catch (Throwable th) {
                C7877u0.m21552b("ReferrerHandler: error occurred while retrieving install referrer", th);
            }
        } else {
            C7877u0.m21547a("ReferrerHandler: InstallReferrerResponse code: " + i);
        }
        try {
            this.f20142d.endConnection();
        } catch (Throwable unused) {
        }
        this.f20142d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52485a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.f20142d;
        if (installReferrerClient == null) {
            C7877u0.m21547a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.f20143e;
        if (i >= f20137f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.f20142d = null;
            return;
        }
        this.f20143e = i + 1;
        try {
            C7877u0.m21547a("ReferrerHandler: connect to referrer client");
            this.f20142d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            C7877u0.m21552b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            mo52485a(installReferrerStateListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void m21499b(ReferrerDetails referrerDetails) {
        C7823k0 a = C7823k0.m21211a(this.f20141c);
        if (a.mo52333n()) {
            C7877u0.m21547a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        C7877u0.m21547a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        String str = installReferrer;
        this.f20139a.mo52358a(str, C7814h.m21186b(this.f20141c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f20140b.mo52279a(installReferrer);
        a.mo52336q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52487a(String str, Runnable runnable) {
        C7823k0 a = C7823k0.m21211a(this.f20141c);
        if (a.mo52335p()) {
            C7877u0.m21547a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.f20139a.mo52359a(str, C7814h.m21186b(this.f20141c), runnable);
        this.f20140b.mo52279a(str);
        a.mo52338s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52488b() {
        C7823k0 a = C7823k0.m21211a(this.f20141c);
        if (!a.mo52335p()) {
            String l = a.mo52329l();
            if (!TextUtils.isEmpty(l)) {
                mo52487a(l, (Runnable) null);
            }
        }
    }
}
