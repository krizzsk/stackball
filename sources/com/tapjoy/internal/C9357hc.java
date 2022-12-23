package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.tapjoy.TapjoyConnectFlag;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.internal.C9229eu;
import com.tapjoy.internal.C9247fa;
import com.tapjoy.internal.C9259fe;
import com.tapjoy.internal.C9268fh;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.tapjoy.internal.hc */
public final class C9357hc {

    /* renamed from: a */
    public static final String f23153a = UUID.randomUUID().toString();

    /* renamed from: d */
    private static C9357hc f23154d;

    /* renamed from: b */
    public final C9268fh.C9269a f23155b = new C9268fh.C9269a();

    /* renamed from: c */
    public final C9368hj f23156c;

    /* renamed from: e */
    private final C9247fa.C9248a f23157e = new C9247fa.C9248a();

    /* renamed from: f */
    private final C9229eu.C9230a f23158f = new C9229eu.C9230a();

    /* renamed from: g */
    private final Context f23159g;

    /* renamed from: a */
    public static synchronized C9357hc m25129a(Context context) {
        C9357hc hcVar;
        synchronized (C9357hc.class) {
            if (f23154d == null) {
                f23154d = new C9357hc(context, C9368hj.m25178a(context));
            }
            hcVar = f23154d;
        }
        return hcVar;
    }

    private C9357hc(Context context, C9368hj hjVar) {
        C9376hn.m25195a();
        this.f23157e.f22794p = "12.4.2/Android";
        this.f23157e.f22785g = "Android";
        this.f23157e.f22786h = Build.VERSION.RELEASE;
        this.f23157e.f22783e = Build.MANUFACTURER;
        this.f23157e.f22784f = Build.MODEL;
        this.f23157e.f22790l = Locale.getDefault().toString();
        this.f23157e.f22791m = TimeZone.getDefault().getID();
        Context applicationContext = context.getApplicationContext();
        this.f23159g = applicationContext;
        C9247fa.C9248a aVar = this.f23157e;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        File file = new File(C9344gz.m25065c(applicationContext), "deviceid");
        String string = sharedPreferences.getString(TapjoyConstants.PREF_ANALYTICS_ID, (String) null);
        if (C9465jq.m25449c(string)) {
            String b = file.exists() ? C9465jq.m25448b(C9091bg.m24333a(file)) : null;
            string = b == null ? UUID.randomUUID().toString() : b;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(TapjoyConstants.PREF_ANALYTICS_ID, string);
            edit.apply();
        }
        aVar.f22782d = string;
        if (!C9300ga.m24930b().mo58209a(TapjoyConnectFlag.DISABLE_ANDROID_ID_AS_ANALYTICS_ID, true)) {
            C9247fa.C9248a aVar2 = this.f23157e;
            String string2 = Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
            aVar2.f22798t = !"9774d56d682e549c".equals(string2) ? C9465jq.m25448b(string2) : null;
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (!C9465jq.m25449c(simCountryIso)) {
                this.f23157e.f22795q = simCountryIso.toUpperCase(Locale.US);
            }
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!C9465jq.m25449c(networkCountryIso)) {
                this.f23157e.f22796r = networkCountryIso.toUpperCase(Locale.US);
            }
        }
        String packageName = applicationContext.getPackageName();
        this.f23157e.f22792n = packageName;
        C9247fa.C9248a aVar3 = this.f23157e;
        Signature[] e = C9509z.m25557e(packageManager, packageName);
        aVar3.f22793o = C9465jq.m25447a((e == null || e.length <= 0) ? null : Base64.encodeToString(C9127ch.m24464a(e[0].toByteArray()), 2));
        this.f23158f.f22667c = C9509z.m25553a(packageManager, packageName);
        this.f23158f.f22668d = Integer.valueOf(C9509z.m25554b(packageManager, packageName));
        String installerPackageName = packageManager.getInstallerPackageName(packageName);
        if (!C9465jq.m25449c(installerPackageName)) {
            this.f23158f.f22670f = installerPackageName;
        }
        String a = m25130a(packageManager, packageName);
        if (!C9465jq.m25449c(a)) {
            this.f23158f.f22671g = a;
        }
        mo58284a();
        this.f23156c = hjVar;
        String a2 = hjVar.f23200c.mo58486a();
        if (a2 != null && a2.length() > 0) {
            C9247fa.C9248a aVar4 = this.f23157e;
            aVar4.f22794p = a2 + " 12.4.2/Android";
        }
        String b2 = this.f23156c.mo58308b();
        if (b2 != null) {
            this.f23155b.f22906d = b2;
        }
        C9268fh.C9269a aVar5 = this.f23155b;
        C9368hj hjVar2 = this.f23156c;
        long j = hjVar2.f23199b.getLong("it", 0);
        if (j == 0) {
            Context context2 = hjVar2.f23198a;
            j = C9509z.m25555c(context2.getPackageManager(), context2.getPackageName());
            if (j == 0) {
                j = C9344gz.m25066d(hjVar2.f23198a).lastModified();
                if (j == 0) {
                    Context context3 = hjVar2.f23198a;
                    j = new File(C9509z.m25556d(context3.getPackageManager(), context3.getPackageName())).lastModified();
                    if (j == 0) {
                        j = System.currentTimeMillis();
                    }
                }
            }
            hjVar2.f23199b.edit().putLong("it", j).apply();
        }
        aVar5.f22905c = Long.valueOf(j);
        int b3 = this.f23156c.f23203f.mo58454b();
        this.f23155b.f22907e = Integer.valueOf(m25128a(7, b3));
        this.f23155b.f22908f = Integer.valueOf(m25128a(30, b3));
        int b4 = this.f23156c.f23205h.mo58454b();
        if (b4 > 0) {
            this.f23155b.f22910h = Integer.valueOf(b4);
        }
        long a3 = this.f23156c.f23206i.mo58480a();
        if (a3 > 0) {
            this.f23155b.f22911i = Long.valueOf(a3);
        }
        long a4 = this.f23156c.f23207j.mo58480a();
        if (a4 > 0) {
            this.f23155b.f22912j = Long.valueOf(a4);
        }
        long a5 = this.f23156c.f23208k.mo58480a();
        if (a5 > 0) {
            this.f23155b.f22913k = Long.valueOf(a5);
        }
        String a6 = this.f23156c.f23209l.mo58486a();
        if (a6 != null) {
            this.f23155b.f22914l = a6;
        }
        int b5 = this.f23156c.f23210m.mo58454b();
        if (b5 > 0) {
            this.f23155b.f22915m = Integer.valueOf(b5);
        }
        double a7 = this.f23156c.f23211n.mo58331a();
        if (a7 != 0.0d) {
            this.f23155b.f22916n = Double.valueOf(a7);
        }
        long a8 = this.f23156c.f23212o.mo58480a();
        if (a8 > 0) {
            this.f23155b.f22917o = Long.valueOf(a8);
        }
        double a9 = this.f23156c.f23213p.mo58331a();
        if (a9 != 0.0d) {
            this.f23155b.f22918p = Double.valueOf(a9);
        }
        String a10 = this.f23156c.f23204g.mo58486a();
        if (a10 != null) {
            try {
                byte[] decode = Base64.decode(a10, 2);
                this.f23155b.f22909g.clear();
                this.f23155b.f22909g.addAll(((C9262ff) C9262ff.f22855c.mo57996a(decode)).f22856d);
            } catch (IllegalArgumentException unused) {
                this.f23156c.f23204g.mo58484c();
            } catch (IOException unused2) {
                this.f23156c.f23204g.mo58484c();
            }
        }
        this.f23158f.f22669e = this.f23156c.f23214q.mo58486a();
        this.f23155b.f22921s = this.f23156c.f23215r.mo58486a();
        int intValue = this.f23156c.f23216s.mo58451a().intValue();
        this.f23155b.f22922t = intValue != -1 ? Integer.valueOf(intValue) : null;
        int intValue2 = this.f23156c.f23217t.mo58451a().intValue();
        this.f23155b.f22923u = intValue2 != -1 ? Integer.valueOf(intValue2) : null;
        this.f23155b.f22924v = this.f23156c.f23218u.mo58486a();
        this.f23155b.f22925w = this.f23156c.f23219v.mo58486a();
        this.f23155b.f22926x = this.f23156c.f23220w.mo58486a();
        this.f23155b.f22927y = this.f23156c.f23221x.mo58486a();
        this.f23155b.f22928z = this.f23156c.f23222y.mo58486a();
        String a11 = this.f23156c.f23223z.mo58486a();
        if (a11 != null) {
            try {
                byte[] decode2 = Base64.decode(a11, 2);
                this.f23155b.f22903A.clear();
                this.f23155b.f22903A.addAll(((C9265fg) C9265fg.f22858c.mo57996a(decode2)).f22859d);
            } catch (IllegalArgumentException unused3) {
                this.f23156c.f23223z.mo58484c();
            } catch (IOException unused4) {
                this.f23156c.f23223z.mo58484c();
            }
        }
        String a12 = this.f23156c.f23194A.mo58486a();
        boolean booleanValue = this.f23156c.f23195B.mo58255a().booleanValue();
        if (a12 != null) {
            this.f23155b.f22919q = a12;
            this.f23155b.f22920r = Boolean.valueOf(booleanValue);
        } else {
            this.f23155b.f22919q = null;
            this.f23155b.f22920r = null;
        }
        this.f23155b.f22904B = this.f23156c.f23196C.mo58255a();
    }

    /* renamed from: a */
    private static String m25130a(PackageManager packageManager, String str) {
        Object obj;
        try {
            Bundle bundle = packageManager.getApplicationInfo(str, 128).metaData;
            if (bundle == null || (obj = bundle.get("com.tapjoy.appstore")) == null) {
                return null;
            }
            return obj.toString().trim();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0057 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58284a() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x0057 }
            r0.<init>()     // Catch:{ Exception -> 0x0057 }
            android.content.Context r1 = r4.f23159g     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x0057 }
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch:{ Exception -> 0x0057 }
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch:{ Exception -> 0x0057 }
            r1.getMetrics(r0)     // Catch:{ Exception -> 0x0057 }
            android.app.Activity r1 = com.tapjoy.internal.C9330gr.m25022a()     // Catch:{ Exception -> 0x0057 }
            if (r1 == 0) goto L_0x0036
            android.view.Window r1 = r1.getWindow()     // Catch:{ Exception -> 0x0057 }
            if (r1 == 0) goto L_0x0036
            int r2 = r0.heightPixels     // Catch:{ Exception -> 0x0057 }
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ Exception -> 0x0057 }
            r3.<init>()     // Catch:{ Exception -> 0x0057 }
            android.view.View r1 = r1.getDecorView()     // Catch:{ Exception -> 0x0057 }
            r1.getWindowVisibleDisplayFrame(r3)     // Catch:{ Exception -> 0x0057 }
            int r1 = r3.top     // Catch:{ Exception -> 0x0057 }
            int r2 = r2 - r1
            r0.heightPixels = r2     // Catch:{ Exception -> 0x0057 }
        L_0x0036:
            com.tapjoy.internal.fa$a r1 = r4.f23157e     // Catch:{ Exception -> 0x0057 }
            int r2 = r0.densityDpi     // Catch:{ Exception -> 0x0057 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0057 }
            r1.f22787i = r2     // Catch:{ Exception -> 0x0057 }
            com.tapjoy.internal.fa$a r1 = r4.f23157e     // Catch:{ Exception -> 0x0057 }
            int r2 = r0.widthPixels     // Catch:{ Exception -> 0x0057 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0057 }
            r1.f22788j = r2     // Catch:{ Exception -> 0x0057 }
            com.tapjoy.internal.fa$a r1 = r4.f23157e     // Catch:{ Exception -> 0x0057 }
            int r0 = r0.heightPixels     // Catch:{ Exception -> 0x0057 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0057 }
            r1.f22789k = r0     // Catch:{ Exception -> 0x0057 }
            goto L_0x0057
        L_0x0055:
            r0 = move-exception
            goto L_0x0059
        L_0x0057:
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            return
        L_0x0059:
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9357hc.mo58284a():void");
    }

    /* renamed from: b */
    public final C9250fb mo58290b() {
        C9250fb fbVar;
        synchronized (this) {
            this.f23157e.f22790l = Locale.getDefault().toString();
            this.f23157e.f22791m = TimeZone.getDefault().getID();
            boolean z = false;
            long currentTimeMillis = System.currentTimeMillis() - 259200000;
            Iterator it = this.f23155b.f22909g.iterator();
            while (it.hasNext()) {
                if (((C9259fe) it.next()).f22850g.longValue() <= currentTimeMillis) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                m25131g();
            }
            fbVar = new C9250fb(this.f23157e.mo58102b(), this.f23158f.mo58087b(), this.f23155b.mo58124b());
        }
        return fbVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo58293c() {
        String a;
        synchronized (this) {
            a = this.f23156c.f23201d.mo58486a();
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00dc  */
    @javax.annotation.Nullable
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tapjoy.internal.C9253fc mo58295d() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0141 }
            r2 = 1
            int r3 = r0.get(r2)     // Catch:{ all -> 0x0141 }
            int r3 = r3 * 10000
            r4 = 2
            int r5 = r0.get(r4)     // Catch:{ all -> 0x0141 }
            int r5 = r5 * 100
            int r3 = r3 + r5
            int r3 = r3 + 100
            r5 = 5
            int r6 = r0.get(r5)     // Catch:{ all -> 0x0141 }
            int r3 = r3 + r6
            com.tapjoy.internal.hj r6 = r1.f23156c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.k r6 = r6.f23202e     // Catch:{ all -> 0x0141 }
            java.lang.Integer r6 = r6.mo58451a()     // Catch:{ all -> 0x0141 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0141 }
            r7 = 0
            if (r6 == r3) goto L_0x013f
            if (r6 != 0) goto L_0x004a
            com.tapjoy.internal.fh$a r0 = r1.f23155b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0141 }
            r0.f22907e = r4     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fh$a r0 = r1.f23155b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0141 }
            r0.f22908f = r4     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fc r0 = new com.tapjoy.internal.fc     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = "fq7_0_1"
            java.lang.String r5 = "fq30_0_1"
            r0.<init>(r4, r5, r7)     // Catch:{ all -> 0x0141 }
            goto L_0x012f
        L_0x004a:
            com.tapjoy.internal.hj r8 = r1.f23156c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.k r8 = r8.f23203f     // Catch:{ all -> 0x0141 }
            java.lang.Integer r8 = r8.mo58451a()     // Catch:{ all -> 0x0141 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0141 }
            r9 = 7
            int r10 = m25128a((int) r9, (int) r8)     // Catch:{ all -> 0x0141 }
            r11 = 30
            int r12 = m25128a((int) r11, (int) r8)     // Catch:{ all -> 0x0141 }
            java.util.Calendar r13 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0141 }
            int r14 = r6 / 10000
            int r15 = r6 / 100
            int r15 = r15 % 100
            int r15 = r15 - r2
            int r6 = r6 % 100
            r13.set(r14, r15, r6)     // Catch:{ all -> 0x0141 }
            int r6 = r0.get(r2)     // Catch:{ all -> 0x0141 }
            int r14 = r13.get(r2)     // Catch:{ all -> 0x0141 }
            int r6 = r6 - r14
            int r6 = java.lang.Integer.signum(r6)     // Catch:{ all -> 0x0141 }
            r14 = -1
            if (r6 == r14) goto L_0x00a8
            if (r6 == r2) goto L_0x008e
            r4 = 6
            int r0 = r0.get(r4)     // Catch:{ all -> 0x0141 }
            int r4 = r13.get(r4)     // Catch:{ all -> 0x0141 }
            int r0 = r0 - r4
            goto L_0x00d4
        L_0x008e:
            java.lang.Object r14 = r0.clone()     // Catch:{ all -> 0x0141 }
            java.util.Calendar r14 = (java.util.Calendar) r14     // Catch:{ all -> 0x0141 }
            int r15 = r13.get(r2)     // Catch:{ all -> 0x0141 }
            int r4 = r13.get(r4)     // Catch:{ all -> 0x0141 }
            int r13 = r13.get(r5)     // Catch:{ all -> 0x0141 }
            r14.set(r15, r4, r13)     // Catch:{ all -> 0x0141 }
            long r16 = r0.getTimeInMillis()     // Catch:{ all -> 0x0141 }
            goto L_0x00c1
        L_0x00a8:
            java.lang.Object r14 = r13.clone()     // Catch:{ all -> 0x0141 }
            java.util.Calendar r14 = (java.util.Calendar) r14     // Catch:{ all -> 0x0141 }
            int r15 = r0.get(r2)     // Catch:{ all -> 0x0141 }
            int r4 = r0.get(r4)     // Catch:{ all -> 0x0141 }
            int r0 = r0.get(r5)     // Catch:{ all -> 0x0141 }
            r14.set(r15, r4, r0)     // Catch:{ all -> 0x0141 }
            long r16 = r13.getTimeInMillis()     // Catch:{ all -> 0x0141 }
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            long r18 = r14.getTimeInMillis()     // Catch:{ all -> 0x0141 }
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
            r14.add(r5, r2)     // Catch:{ all -> 0x0141 }
            int r0 = r0 + 1
            goto L_0x00c2
        L_0x00d0:
            if (r6 <= 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            int r0 = -r0
        L_0x00d4:
            int r4 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0141 }
            if (r4 < r11) goto L_0x00dc
            r15 = 0
            goto L_0x00e4
        L_0x00dc:
            if (r0 < 0) goto L_0x00e1
            int r15 = r8 << r0
            goto L_0x00e4
        L_0x00e1:
            int r0 = -r0
            int r15 = r8 >> r0
        L_0x00e4:
            r2 = r2 | r15
            int r0 = m25128a((int) r9, (int) r2)     // Catch:{ all -> 0x0141 }
            int r4 = m25128a((int) r11, (int) r2)     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fh$a r5 = r1.f23155b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0141 }
            r5.f22907e = r6     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fh$a r5 = r1.f23155b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0141 }
            r5.f22908f = r6     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fc r5 = new com.tapjoy.internal.fc     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "fq7_"
            r6.<init>(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r10)     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "_"
            r6.append(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r0)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "fq30_"
            r6.<init>(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r12)     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "_"
            r6.append(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0141 }
            r5.<init>(r0, r4, r7)     // Catch:{ all -> 0x0141 }
            r0 = r5
        L_0x012f:
            com.tapjoy.internal.hj r4 = r1.f23156c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.k r4 = r4.f23202e     // Catch:{ all -> 0x0141 }
            r4.mo58452a((int) r3)     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.hj r3 = r1.f23156c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.k r3 = r3.f23203f     // Catch:{ all -> 0x0141 }
            r3.mo58452a((int) r2)     // Catch:{ all -> 0x0141 }
            monitor-exit(r20)     // Catch:{ all -> 0x0141 }
            return r0
        L_0x013f:
            monitor-exit(r20)     // Catch:{ all -> 0x0141 }
            return r7
        L_0x0141:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0141 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9357hc.mo58295d():com.tapjoy.internal.fc");
    }

    /* renamed from: a */
    private static int m25128a(int i, int i2) {
        return Integer.bitCount(((1 << i) - 1) & i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo58288a(String str, long j, boolean z) {
        synchronized (this) {
            int size = this.f23155b.f22909g.size();
            int i = 0;
            while (i < size) {
                C9259fe feVar = (C9259fe) this.f23155b.f22909g.get(i);
                if (!feVar.f22849f.equals(str)) {
                    i++;
                } else if (!z) {
                    return false;
                } else {
                    C9259fe.C9260a b = feVar.mo58112b();
                    b.f22853d = Long.valueOf(j);
                    this.f23155b.f22909g.set(i, b.mo58115b());
                    return true;
                }
            }
            this.f23155b.f22909g.add(new C9259fe(str, Long.valueOf(j)));
            m25131g();
            return true;
        }
    }

    /* renamed from: g */
    private void m25131g() {
        this.f23156c.f23204g.mo58487a(Base64.encodeToString(C9262ff.f22855c.mo57999b(new C9262ff(this.f23155b.f22909g)), 2));
    }

    /* renamed from: a */
    public final boolean mo58287a(String str) {
        boolean z;
        synchronized (this) {
            this.f23156c.f23214q.mo58487a(str);
            z = true;
            if (str != null) {
                if (C9463jo.m25444a(this.f23158f.f22669e, str)) {
                    z = false;
                }
                this.f23158f.f22669e = str;
            } else {
                if (this.f23158f.f22669e == null) {
                    z = false;
                }
                this.f23158f.f22669e = null;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo58292b(String str) {
        boolean z;
        synchronized (this) {
            this.f23156c.f23215r.mo58487a(str);
            z = !C9463jo.m25444a(this.f23155b.f22921s, str);
            if (z) {
                this.f23155b.f22921s = str;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo58286a(Integer num) {
        boolean z;
        synchronized (this) {
            this.f23156c.f23216s.mo58453a(num);
            z = !C9463jo.m25444a(this.f23155b.f22922t, num);
            if (z) {
                this.f23155b.f22922t = num;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo58291b(Integer num) {
        boolean z;
        synchronized (this) {
            this.f23156c.f23217t.mo58453a(num);
            z = !C9463jo.m25444a(this.f23155b.f22923u, num);
            if (z) {
                this.f23155b.f22923u = num;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo58285a(int i, String str) {
        boolean z;
        synchronized (this) {
            z = false;
            if (i == 1) {
                this.f23156c.f23218u.mo58487a(str);
                z = !C9463jo.m25444a(this.f23155b.f22924v, str);
                if (z) {
                    this.f23155b.f22924v = str;
                }
            } else if (i == 2) {
                this.f23156c.f23219v.mo58487a(str);
                z = !C9463jo.m25444a(this.f23155b.f22925w, str);
                if (z) {
                    this.f23155b.f22925w = str;
                }
            } else if (i == 3) {
                this.f23156c.f23220w.mo58487a(str);
                z = !C9463jo.m25444a(this.f23155b.f22926x, str);
                if (z) {
                    this.f23155b.f22926x = str;
                }
            } else if (i == 4) {
                this.f23156c.f23221x.mo58487a(str);
                z = !C9463jo.m25444a(this.f23155b.f22927y, str);
                if (z) {
                    this.f23155b.f22927y = str;
                }
            } else if (i == 5) {
                this.f23156c.f23222y.mo58487a(str);
                z = !C9463jo.m25444a(this.f23155b.f22928z, str);
                if (z) {
                    this.f23155b.f22928z = str;
                }
            }
        }
        return z;
    }

    /* renamed from: e */
    public final Set mo58296e() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f23155b.f22903A);
        }
        return hashSet;
    }

    /* renamed from: c */
    public final boolean mo58294c(String str) {
        synchronized (this) {
            for (int size = this.f23155b.f22909g.size() - 1; size >= 0; size--) {
                C9259fe feVar = (C9259fe) this.f23155b.f22909g.get(size);
                if (feVar.f22849f.equals(str)) {
                    C9259fe.C9260a b = feVar.mo58112b();
                    b.f22854e = Long.valueOf(System.currentTimeMillis());
                    this.f23155b.f22909g.set(size, b.mo58115b());
                    m25131g();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo58297f() {
        return ((Boolean) C9463jo.m25445b(this.f23155b.f22904B, C9268fh.f22876r)).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo58289a(boolean z) {
        boolean z2;
        synchronized (this) {
            this.f23156c.f23196C.mo58256a(z);
            z2 = z != ((Boolean) C9463jo.m25445b(this.f23155b.f22904B, C9268fh.f22876r)).booleanValue();
            this.f23155b.f22904B = Boolean.valueOf(z);
        }
        return z2;
    }
}
