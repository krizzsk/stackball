package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;

/* renamed from: com.inmobi.media.f */
/* compiled from: CustomTabHelper */
public class C5244f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f12011d = C5244f.class.getSimpleName();

    /* renamed from: a */
    public CustomTabsClient f12012a;

    /* renamed from: b */
    public CustomTabsServiceConnection f12013b;

    /* renamed from: c */
    public C5247a f12014c;

    /* renamed from: com.inmobi.media.f$a */
    /* compiled from: CustomTabHelper */
    public interface C5247a {
        /* renamed from: a */
        void mo40208a();

        /* renamed from: a */
        void mo40209a(int i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        com.inmobi.media.C5325gu.m12261b(r2, r4.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m12013a(android.content.Context r2, androidx.browser.customtabs.CustomTabsIntent r3, android.net.Uri r4, com.inmobi.media.C5331h r5) {
        /*
            java.lang.String r0 = com.inmobi.media.C5296g.m12117a(r2)
            if (r0 != 0) goto L_0x000e
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x001e }
            r5.mo40685a(r3)     // Catch:{ Exception -> 0x001e }
            return
        L_0x000e:
            android.content.Intent r5 = r3.intent     // Catch:{ Exception -> 0x001e }
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r1)     // Catch:{ Exception -> 0x001e }
            android.content.Intent r5 = r3.intent     // Catch:{ Exception -> 0x001e }
            r5.setPackage(r0)     // Catch:{ Exception -> 0x001e }
            r3.launchUrl(r2, r4)     // Catch:{ Exception -> 0x001e }
            return
        L_0x001e:
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0025 }
            com.inmobi.media.C5325gu.m12261b(r2, r3)     // Catch:{ Exception -> 0x0025 }
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5244f.m12013a(android.content.Context, androidx.browser.customtabs.CustomTabsIntent, android.net.Uri, com.inmobi.media.h):void");
    }

    /* renamed from: a */
    public final void mo40571a(Context context) {
        String a;
        if (this.f12012a == null && context != null && (a = C5296g.m12117a(context)) != null) {
            C52462 r1 = new CustomTabsServiceConnection() {
                public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                    CustomTabsClient unused = C5244f.this.f12012a = customTabsClient;
                    if (C5244f.this.f12014c != null) {
                        C5244f.this.f12014c.mo40208a();
                    }
                }

                public final void onServiceDisconnected(ComponentName componentName) {
                    CustomTabsClient unused = C5244f.this.f12012a = null;
                    if (C5244f.this.f12014c != null) {
                        C5247a unused2 = C5244f.this.f12014c;
                    }
                }

                public final void onBindingDied(ComponentName componentName) {
                    CustomTabsClient unused = C5244f.this.f12012a = null;
                    if (C5244f.this.f12014c != null) {
                        C5247a unused2 = C5244f.this.f12014c;
                    }
                }
            };
            this.f12013b = r1;
            CustomTabsClient.bindCustomTabsService(context, a, r1);
        }
    }
}
