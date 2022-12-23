package com.chartboost.sdk.Networking;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.chartboost.sdk.C1880a;
import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.impl.C1894a;
import com.chartboost.sdk.impl.C1965p0;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

/* renamed from: com.chartboost.sdk.Networking.i */
public class C1857i {

    /* renamed from: a */
    private final Executor f4584a;

    /* renamed from: b */
    private final C1855g f4585b;

    /* renamed from: c */
    final C1856h f4586c;

    /* renamed from: d */
    final Handler f4587d;

    /* renamed from: com.chartboost.sdk.Networking.i$a */
    class C1858a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f4588a;

        /* renamed from: b */
        final /* synthetic */ Context f4589b;

        /* renamed from: c */
        final /* synthetic */ C1838c f4590c;

        /* renamed from: d */
        final /* synthetic */ C1965p0 f4591d;

        /* renamed from: com.chartboost.sdk.Networking.i$a$a */
        class C1859a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f4593a;

            C1859a(String str) {
                this.f4593a = str;
            }

            public void run() {
                try {
                    C1857i.this.mo14345c(C1858a.this.f4589b, C1858a.this.f4590c, this.f4593a, C1858a.this.f4591d);
                } catch (Exception e) {
                    CBLogging.m3993b("CBURLOpener", "open openOnUiThread Runnable.run: " + e.toString());
                }
            }
        }

        C1858a(String str, Context context, C1838c cVar, C1965p0 p0Var) {
            this.f4588a = str;
            this.f4589b = context;
            this.f4590c = cVar;
            this.f4591d = p0Var;
        }

        /* renamed from: a */
        private void m4194a(String str) {
            C1857i.this.f4587d.post(new C1859a(str));
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[SYNTHETIC, Splitter:B:23:0x0046] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x004e A[Catch:{ Exception -> 0x0056 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = "CBURLOpener"
                java.lang.String r1 = r6.f4588a     // Catch:{ Exception -> 0x0056 }
                com.chartboost.sdk.Networking.i r2 = com.chartboost.sdk.Networking.C1857i.this     // Catch:{ Exception -> 0x0056 }
                com.chartboost.sdk.Networking.h r2 = r2.f4586c     // Catch:{ Exception -> 0x0056 }
                boolean r2 = r2.mo14340d()     // Catch:{ Exception -> 0x0056 }
                if (r2 == 0) goto L_0x0052
                r2 = 0
                java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
                java.lang.String r4 = r6.f4588a     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
                java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
                java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
                r2 = 0
                r3.setInstanceFollowRedirects(r2)     // Catch:{ Exception -> 0x0037 }
                r2 = 10000(0x2710, float:1.4013E-41)
                r3.setConnectTimeout(r2)     // Catch:{ Exception -> 0x0037 }
                r3.setReadTimeout(r2)     // Catch:{ Exception -> 0x0037 }
                java.lang.String r2 = "Location"
                java.lang.String r2 = r3.getHeaderField(r2)     // Catch:{ Exception -> 0x0037 }
                if (r2 == 0) goto L_0x0031
                r1 = r2
            L_0x0031:
                if (r3 == 0) goto L_0x0052
                r3.disconnect()     // Catch:{ Exception -> 0x0056 }
                goto L_0x0052
            L_0x0037:
                r2 = move-exception
                goto L_0x003f
            L_0x0039:
                r1 = move-exception
                goto L_0x004c
            L_0x003b:
                r3 = move-exception
                r5 = r3
                r3 = r2
                r2 = r5
            L_0x003f:
                java.lang.String r4 = "Exception raised while opening a HTTP Conection"
                com.chartboost.sdk.Libraries.CBLogging.m3992a(r0, r4, r2)     // Catch:{ all -> 0x004a }
                if (r3 == 0) goto L_0x0052
                r3.disconnect()     // Catch:{ Exception -> 0x0056 }
                goto L_0x0052
            L_0x004a:
                r1 = move-exception
                r2 = r3
            L_0x004c:
                if (r2 == 0) goto L_0x0051
                r2.disconnect()     // Catch:{ Exception -> 0x0056 }
            L_0x0051:
                throw r1     // Catch:{ Exception -> 0x0056 }
            L_0x0052:
                r6.m4194a(r1)     // Catch:{ Exception -> 0x0056 }
                goto L_0x006f
            L_0x0056:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "open followTask: "
                r2.append(r3)
                java.lang.String r1 = r1.toString()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.chartboost.sdk.Libraries.CBLogging.m3993b(r0, r1)
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.Networking.C1857i.C1858a.run():void");
        }
    }

    public C1857i(Executor executor, C1855g gVar, C1856h hVar, Handler handler) {
        this.f4584a = executor;
        this.f4585b = gVar;
        this.f4586c = hVar;
        this.f4587d = handler;
    }

    /* renamed from: a */
    public void mo14342a(C1838c cVar, boolean z, String str, CBError.CBClickError cBClickError, C1965p0 p0Var) {
        C1965p0 p0Var2;
        if (cVar != null) {
            cVar.f4445B = false;
            if (cVar.mo14268G()) {
                cVar.f4449b = 4;
            }
        }
        if (!z) {
            C1880a aVar = C2026k.f5247d;
            if (aVar != null) {
                aVar.didFailToRecordClick(str, cBClickError);
            }
        } else if (cVar != null && (p0Var2 = cVar.f4471x) != null) {
            this.f4585b.mo14335a(p0Var2);
        } else if (p0Var != null) {
            this.f4585b.mo14335a(p0Var);
        }
    }

    /* renamed from: b */
    public void mo14344b(Context context, C1838c cVar, String str, C1965p0 p0Var) {
        try {
            String scheme = new URI(str).getScheme();
            if (scheme == null) {
                m4188a(str, cVar);
                mo14342a(cVar, false, str, CBError.CBClickError.URI_INVALID, p0Var);
            } else if (scheme.equals("http") || scheme.equals("https")) {
                this.f4584a.execute(new C1858a(str, context, cVar, p0Var));
            } else {
                mo14345c(context, cVar, str, p0Var);
            }
        } catch (URISyntaxException unused) {
            m4188a(str, cVar);
            mo14342a(cVar, false, str, CBError.CBClickError.URI_INVALID, p0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14345c(Context context, C1838c cVar, String str, C1965p0 p0Var) {
        if (cVar != null && cVar.mo14268G()) {
            cVar.f4449b = 5;
        }
        if (context == null) {
            mo14342a(cVar, false, str, CBError.CBClickError.NO_HOST_ACTIVITY, p0Var);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        } catch (Exception unused) {
            if (str.startsWith("market://")) {
                try {
                    str = "http://market.android.com/" + str.substring(9);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    if (!(context instanceof Activity)) {
                        intent2.addFlags(268435456);
                    }
                    intent2.setData(Uri.parse(str));
                    context.startActivity(intent2);
                } catch (Exception e) {
                    CBLogging.m3992a("CBURLOpener", "Exception raised openeing an inavld playstore URL", e);
                    mo14342a(cVar, false, str, CBError.CBClickError.URI_UNRECOGNIZED, p0Var);
                    return;
                }
            } else {
                mo14342a(cVar, false, str, CBError.CBClickError.URI_UNRECOGNIZED, p0Var);
            }
        }
        mo14342a(cVar, true, str, (CBError.CBClickError) null, p0Var);
    }

    /* renamed from: a */
    private void m4188a(String str, C1838c cVar) {
        String str2;
        String str3 = "";
        if (cVar != null) {
            C1894a e = cVar.mo14280e();
            str2 = cVar.f4460m;
            if (e != null) {
                str3 = e.f4749b;
            }
        } else {
            str2 = str3;
        }
        C1874e.m4311e(new C1868a("click_invalid_url_error", str, str3, str2));
    }

    /* renamed from: a */
    public boolean mo14343a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            CBLogging.m3992a("CBURLOpener", "Cannot open URL", e);
            return false;
        }
    }

    /* renamed from: a */
    public void mo14341a(Context context, C1838c cVar, String str, C1965p0 p0Var) {
        mo14344b(context, cVar, str, p0Var);
    }
}
