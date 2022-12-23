package com.ironsource.mediationsdk.integration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.adcolony.sdk.AdColonyAppOptions;
import com.ironsource.mediationsdk.C5556E;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegrationHelper {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m14040a(android.app.Activity r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "SupersonicAds"
            java.lang.String r1 = "IntegrationHelper"
            r2 = 0
            boolean r3 = r7.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x011b }
            if (r3 == 0) goto L_0x0011
            java.lang.String r3 = "--------------- IronSource  --------------"
        L_0x000d:
            android.util.Log.i(r1, r3)     // Catch:{ Exception -> 0x011b }
            goto L_0x0025
        L_0x0011:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b }
            java.lang.String r4 = "--------------- "
            r3.<init>(r4)     // Catch:{ Exception -> 0x011b }
            r3.append(r7)     // Catch:{ Exception -> 0x011b }
            java.lang.String r4 = " --------------"
            r3.append(r4)     // Catch:{ Exception -> 0x011b }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x011b }
            goto L_0x000d
        L_0x0025:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b }
            java.lang.String r4 = "com.ironsource.adapters."
            r3.<init>(r4)     // Catch:{ Exception -> 0x011b }
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x011b }
            java.lang.String r4 = r7.toLowerCase(r4)     // Catch:{ Exception -> 0x011b }
            r3.append(r4)     // Catch:{ Exception -> 0x011b }
            java.lang.String r4 = "."
            r3.append(r4)     // Catch:{ Exception -> 0x011b }
            r3.append(r7)     // Catch:{ Exception -> 0x011b }
            java.lang.String r4 = "Adapter"
            r3.append(r4)     // Catch:{ Exception -> 0x011b }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x011b }
            com.ironsource.mediationsdk.IntegrationData r4 = m14044b((android.app.Activity) r6, (java.lang.String) r3)     // Catch:{ Exception -> 0x011b }
            if (r4 != 0) goto L_0x004d
            return r2
        L_0x004d:
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x011b }
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = r4.version     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = "4.1"
            boolean r0 = r0.startsWith(r5)     // Catch:{ Exception -> 0x011b }
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = r4.version     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = "4.3"
            boolean r0 = r0.startsWith(r5)     // Catch:{ Exception -> 0x011b }
            if (r0 == 0) goto L_0x0068
            goto L_0x009b
        L_0x0068:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b }
            r0.<init>()     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = r4.name     // Catch:{ Exception -> 0x011b }
            r0.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = " adapter "
            r0.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = r4.version     // Catch:{ Exception -> 0x011b }
            r0.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = " is incompatible with SDK version "
            r0.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ Exception -> 0x011b }
            r0.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = ", please update your adapter to version 4.1"
            r0.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = ".*"
            r0.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011b }
            android.util.Log.e(r1, r0)     // Catch:{ Exception -> 0x011b }
            r0 = 0
            goto L_0x00a1
        L_0x009b:
            java.lang.String r0 = "Adapter - VERIFIED"
            android.util.Log.i(r1, r0)     // Catch:{ Exception -> 0x011b }
            r0 = 1
        L_0x00a1:
            if (r0 != 0) goto L_0x00a4
            return r2
        L_0x00a4:
            java.lang.Class r0 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r3 = "getAdapterSDKVersion"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00cb }
            java.lang.reflect.Method r0 = r0.getMethod(r3, r5)     // Catch:{ Exception -> 0x00cb }
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00cb }
            java.lang.Object r0 = r0.invoke(r3, r5)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00cb }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = "SDK Version - "
            r3.<init>(r5)     // Catch:{ Exception -> 0x00cb }
            r3.append(r0)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00cb }
            android.util.Log.i(r1, r0)     // Catch:{ Exception -> 0x00cb }
            goto L_0x00d2
        L_0x00cb:
            java.lang.String r0 = "validateSDKVersion"
            java.lang.String r3 = "Unable to get SDK version"
            android.util.Log.w(r0, r3)     // Catch:{ Exception -> 0x011b }
        L_0x00d2:
            java.lang.String[] r0 = r4.activities     // Catch:{ Exception -> 0x011b }
            boolean r0 = m14045b((android.app.Activity) r6, (java.lang.String[]) r0)     // Catch:{ Exception -> 0x011b }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r4.externalLibs     // Catch:{ Exception -> 0x011b }
            boolean r3 = m14043a(r3)     // Catch:{ Exception -> 0x011b }
            if (r3 != 0) goto L_0x00e1
            r0 = 0
        L_0x00e1:
            java.lang.String[] r3 = r4.services     // Catch:{ Exception -> 0x011b }
            boolean r3 = m14041a((android.app.Activity) r6, (java.lang.String[]) r3)     // Catch:{ Exception -> 0x011b }
            if (r3 != 0) goto L_0x00ea
            r0 = 0
        L_0x00ea:
            java.lang.String[] r3 = r4.providers     // Catch:{ Exception -> 0x011b }
            boolean r3 = m14042a((android.content.Context) r6, (java.lang.String[]) r3)     // Catch:{ Exception -> 0x011b }
            if (r3 != 0) goto L_0x00f3
            r0 = 0
        L_0x00f3:
            boolean r3 = r4.validateWriteExternalStorage     // Catch:{ Exception -> 0x011b }
            if (r3 == 0) goto L_0x0119
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x011b }
            r4 = 18
            if (r3 > r4) goto L_0x0119
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch:{ Exception -> 0x011b }
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r6 = r6.getPackageName()     // Catch:{ Exception -> 0x011b }
            int r6 = r3.checkPermission(r4, r6)     // Catch:{ Exception -> 0x011b }
            if (r6 != 0) goto L_0x0113
            java.lang.String r6 = "android.permission.WRITE_EXTERNAL_STORAGE - VERIFIED"
            android.util.Log.i(r1, r6)     // Catch:{ Exception -> 0x011b }
            goto L_0x0119
        L_0x0113:
            java.lang.String r6 = "android.permission.WRITE_EXTERNAL_STORAGE - MISSING"
            android.util.Log.e(r1, r6)     // Catch:{ Exception -> 0x011b }
            goto L_0x011a
        L_0x0119:
            r2 = r0
        L_0x011a:
            return r2
        L_0x011b:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "isAdapterValid "
            r0.<init>(r3)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.e(r1, r7, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.m14040a(android.app.Activity, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static boolean m14041a(Activity activity, String[] strArr) {
        boolean z = true;
        if (strArr == null) {
            return true;
        }
        PackageManager packageManager = activity.getPackageManager();
        Log.i("IntegrationHelper", "*** Services ***");
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                if (packageManager.queryIntentServices(new Intent(activity, Class.forName(str)), 65536).size() > 0) {
                    Log.i("IntegrationHelper", str + " - VERIFIED");
                    i++;
                } else {
                    Log.e("IntegrationHelper", str + " - MISSING");
                    z = false;
                    i++;
                }
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m14042a(Context context, String[] strArr) {
        String str;
        boolean z;
        List<PackageInfo> installedPackages;
        ArrayList arrayList = new ArrayList();
        if (!(context == null || (installedPackages = context.getPackageManager().getInstalledPackages(8)) == null)) {
            for (PackageInfo packageInfo : installedPackages) {
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        arrayList.add(providerInfo.name);
                    }
                }
            }
        }
        boolean z2 = true;
        if (strArr != null) {
            Log.i("IntegrationHelper", "*** Content Providers ***");
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                if (!arrayList.contains(str2)) {
                    str = "- MISSING";
                    z = false;
                } else {
                    z = z2;
                    str = "- VERIFIED";
                }
                Log.d("IntegrationHelper", str2 + str);
                i++;
                z2 = z;
            }
        }
        return z2;
    }

    /* renamed from: a */
    private static boolean m14043a(ArrayList<Pair<String, String>> arrayList) {
        boolean z = true;
        if (arrayList == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** External Libraries ***");
        Iterator<Pair<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            try {
                Class.forName((String) next.first);
                Log.i("IntegrationHelper", ((String) next.second) + " - VERIFIED");
            } catch (ClassNotFoundException unused) {
                z = false;
                Log.e("IntegrationHelper", ((String) next.second) + " - MISSING");
            }
        }
        return z;
    }

    /* renamed from: b */
    private static IntegrationData m14044b(Activity activity, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", new Class[]{Activity.class}).invoke((Object) null, new Object[]{activity});
            Log.i("IntegrationHelper", "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException unused) {
            str2 = "Adapter - MISSING";
            Log.e("IntegrationHelper", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "Adapter version - NOT VERIFIED";
            Log.e("IntegrationHelper", str2);
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m14045b(Activity activity, String[] strArr) {
        boolean z = true;
        if (strArr == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** Activities ***");
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                if (activity.getPackageManager().queryIntentActivities(new Intent(activity, Class.forName(str)), 65536).size() > 0) {
                    Log.i("IntegrationHelper", str + " - VERIFIED");
                    i++;
                } else {
                    Log.e("IntegrationHelper", str + " - MISSING");
                    z = false;
                    i++;
                }
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
        }
        return z;
    }

    public static void validateIntegration(Activity activity) {
        String str;
        String str2;
        final Activity activity2 = activity;
        Log.i("IntegrationHelper", "Verifying Integration:");
        Log.i("IntegrationHelper", "*** Permissions ***");
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", activity.getPackageName()) == 0) {
            Log.i("IntegrationHelper", "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e("IntegrationHelper", "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", activity.getPackageName()) == 0) {
            Log.i("IntegrationHelper", "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e("IntegrationHelper", "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
        String[] strArr = {"AdColony", AdColonyAppOptions.ADMOB, "Amazon", "AppLovin", "Chartboost", "Facebook", AdColonyAppOptions.FYBER, "HyprMX", "InMobi", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "Maio", "MyTarget", "Pangle", "Smaato", "Tapjoy", "UnityAds", BuildConfig.OMSDK_PARTNER_NAME};
        for (int i = 0; i < 17; i++) {
            String str3 = strArr[i];
            if (m14040a(activity2, str3)) {
                if (str3.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                    str2 = ">>>> IronSource - VERIFIED";
                } else {
                    str2 = ">>>> " + str3 + " - VERIFIED";
                }
                Log.i("IntegrationHelper", str2);
            } else {
                if (str3.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                    str = ">>>> IronSource - NOT VERIFIED";
                } else {
                    str = ">>>> " + str3 + " - NOT VERIFIED";
                }
                Log.e("IntegrationHelper", str);
            }
        }
        new Thread() {
            public final void run() {
                try {
                    Log.w("IntegrationHelper", "--------------- Google Play Services --------------");
                    if (activity2.getPackageManager().getApplicationInfo(activity2.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                        Log.i("IntegrationHelper", "Google Play Services - VERIFIED");
                        C5556E.m13257a();
                        String a = C5556E.m13258a((Context) activity2);
                        if (!TextUtils.isEmpty(a)) {
                            Log.i("IntegrationHelper", "GAID is: " + a + " (use this for test devices)");
                            return;
                        }
                        return;
                    }
                    Log.e("IntegrationHelper", "Google Play Services - MISSING");
                } catch (Exception unused) {
                    Log.e("IntegrationHelper", "Google Play Services - MISSING");
                }
            }
        }.start();
    }
}
