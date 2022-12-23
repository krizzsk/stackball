package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLibCore;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.j0 */
public final class C7820j0 {

    /* renamed from: a */
    final C7828m f19920a;

    /* renamed from: b */
    final C7880v0 f19921b;

    /* renamed from: c */
    final Context f19922c;

    /* renamed from: com.my.tracker.obfuscated.j0$a */
    public static final class C7821a {

        /* renamed from: a */
        public final int f19923a;

        /* renamed from: b */
        public final String f19924b;

        /* renamed from: c */
        public final String f19925c;

        C7821a(int i, String str, String str2) {
            this.f19923a = i;
            this.f19924b = str;
            this.f19925c = str2;
        }
    }

    C7820j0(C7828m mVar, C7880v0 v0Var, Context context) {
        this.f19920a = mVar;
        this.f19921b = v0Var;
        this.f19922c = context.getApplicationContext();
    }

    /* renamed from: a */
    static C7821a m21202a(int i, String str, String str2) {
        try {
            C7877u0.m21547a("PreInstallHandler: converting raw data to json");
            return new C7821a(i, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            C7877u0.m21552b("PreInstallHandler error: exception when converting raw data to json with pid", th);
            C7877u0.m21547a("PreInstallHandler: nothing has been found for source: " + i);
            return null;
        }
    }

    /* renamed from: a */
    public static C7820j0 m21203a(C7828m mVar, C7880v0 v0Var, Context context) {
        return new C7820j0(mVar, v0Var, context);
    }

    /* renamed from: a */
    static String m21204a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* renamed from: a */
    public C7821a mo52295a() {
        if (!this.f19921b.mo52550q()) {
            C7877u0.m21547a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        C7821a b = mo52298b();
        if (b != null) {
            return b;
        }
        C7821a a = mo52296a(1);
        if (a != null) {
            return a;
        }
        if (this.f19921b.mo52551r()) {
            return mo52296a(2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7821a mo52296a(int i) {
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        if (i == 1) {
            str2 = "ro.mytracker.preinstall.path";
        } else if (i == 2) {
            str2 = AppsFlyerLibCore.PRE_INSTALL_SYSTEM_RO_PROP;
        } else {
            str = "PreInstallHandler: wrong property property key";
            C7877u0.m21547a(str);
            return null;
        }
        String a = C7871s0.m21530a(str2);
        if (TextUtils.isEmpty(a)) {
            sb = new StringBuilder();
            str3 = "PreInstallHandler: empty path for source: ";
        } else {
            String a2 = mo52297a(a);
            if (TextUtils.isEmpty(a2)) {
                sb = new StringBuilder();
                str3 = "PreInstallHandler: empty data for source: ";
            } else {
                C7877u0.m21547a("PreInstallHandler: raw data for source has been found: " + a2);
                return m21202a(i, a2, a);
            }
        }
        sb.append(str3);
        sb.append(i);
        str = sb.toString();
        C7877u0.m21547a(str);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r3 != null) goto L_0x006e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo52297a(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r1.<init>()     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "PreInstallHandler: searching string in file "
            r1.append(r2)     // Catch:{ all -> 0x0074 }
            r1.append(r8)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r1)     // Catch:{ all -> 0x0074 }
            android.content.Context r1 = r7.f19922c     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r2.<init>()     // Catch:{ all -> 0x0074 }
            r2.append(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = "="
            r2.append(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0074 }
            int r2 = r1.length()     // Catch:{ all -> 0x0074 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0074 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0074 }
            r4.<init>(r8)     // Catch:{ all -> 0x0074 }
            r3.<init>(r4)     // Catch:{ all -> 0x0074 }
        L_0x003a:
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x006e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r5.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = "PreInstallHandler: processing string "
            r5.append(r6)     // Catch:{ all -> 0x0072 }
            r5.append(r4)     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r5)     // Catch:{ all -> 0x0072 }
            boolean r5 = r4.startsWith(r1)     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x003a
            int r5 = r4.length()     // Catch:{ all -> 0x0072 }
            if (r5 <= r2) goto L_0x003a
            java.lang.String r4 = r4.substring(r2)     // Catch:{ all -> 0x0072 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0072 }
            if (r5 != 0) goto L_0x003a
            r3.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            return r4
        L_0x006e:
            r3.close()     // Catch:{ all -> 0x008d }
            goto L_0x008d
        L_0x0072:
            r1 = move-exception
            goto L_0x0076
        L_0x0074:
            r1 = move-exception
            r3 = r0
        L_0x0076:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r2.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "PreInstallHandler error: exception while retrieving data in file"
            r2.append(r4)     // Catch:{ all -> 0x008e }
            r2.append(r8)     // Catch:{ all -> 0x008e }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x008e }
            com.p243my.tracker.obfuscated.C7877u0.m21552b(r8, r1)     // Catch:{ all -> 0x008e }
            if (r3 == 0) goto L_0x008d
            goto L_0x006e
        L_0x008d:
            return r0
        L_0x008e:
            r8 = move-exception
            if (r3 == 0) goto L_0x0094
            r3.close()     // Catch:{ all -> 0x0094 }
        L_0x0094:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.tracker.obfuscated.C7820j0.mo52297a(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7821a mo52298b() {
        String format = String.format("ro.mtpi.%s", new Object[]{this.f19921b.mo52538f()});
        String a = C7871s0.m21530a(format);
        if (TextUtils.isEmpty(a)) {
            C7877u0.m21547a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        C7877u0.m21547a("PreInstallHandler: raw data in SystemProperties has been found: " + a);
        return m21202a(3, a, format);
    }

    @Deprecated
    /* renamed from: c */
    public void mo52299c() {
        String l = this.f19921b.mo52545l();
        if (!TextUtils.isEmpty(l)) {
            C7823k0 a = C7823k0.m21211a(this.f19922c);
            if (!a.mo52334o()) {
                C7877u0.m21547a("PreInstallHandler: checking preinstall");
                PackageManager packageManager = this.f19922c.getPackageManager();
                try {
                    String a2 = m21204a(packageManager.getResourcesForApplication(l), this.f19922c.getPackageName(), l);
                    a.mo52337r();
                    if (TextUtils.isEmpty(a2)) {
                        C7877u0.m21547a("PreInstallHandler: referrer is empty");
                        return;
                    }
                    C7877u0.m21547a("PreInstallHandler: referrer " + a2);
                    this.f19920a.mo52359a(a2, C7814h.m21186b(this.f19922c), (Runnable) null);
                    C7823k0.m21211a(this.f19922c).mo52338s();
                } catch (Throwable unused) {
                    C7877u0.m21547a("PreInstallHandler: unable to locate vendor app " + l);
                }
            }
        }
    }
}
