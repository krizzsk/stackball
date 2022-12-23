package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.net.MailTo;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.util.u */
public final class C3685u extends C3657l {

    /* renamed from: com.fyber.inneractive.sdk.util.u$c */
    public enum C3688c {
        FAILED,
        OPENED_IN_INTERNAL_BROWSER,
        OPEN_IN_EXTERNAL_APPLICATION,
        OPEN_IN_EXTERNAL_BROWSER,
        OPENED_USING_CHROME_NAVIGATE
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u$d */
    public enum C3689d {
        ;
        

        /* renamed from: a */
        public static final int f9986a = 1;

        /* renamed from: b */
        public static final int f9987b = 2;

        static {
            f9988c = new int[]{1, 2};
        }
    }

    /* renamed from: a */
    public static boolean m9181a(String str) {
        if (!str.startsWith("tel:") && !str.startsWith("voicemail:") && !str.startsWith("sms:") && !str.startsWith(MailTo.MAILTO_SCHEME) && !str.startsWith("geo:") && !str.startsWith("google.streetview:")) {
            try {
                new URL(str);
                return false;
            } catch (MalformedURLException unused) {
                IAlog.m9036d("Failed to open Url: %s", str);
            }
        }
        return true;
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u$a */
    public static final class C3686a {

        /* renamed from: a */
        public final C3688c f9977a;

        /* renamed from: b */
        public final Throwable f9978b;

        /* renamed from: c */
        public final String f9979c;

        public C3686a(C3688c cVar, Throwable th, String str) {
            this.f9977a = cVar;
            this.f9978b = th;
            this.f9979c = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u$b */
    public static final class C3687b extends Exception {
        C3687b(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    private static String m9178a(Context context) {
        try {
            return context.getClass().getName();
        } catch (Throwable unused) {
            return "failed";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.util.C3685u.C3686a m9176a(android.content.Context r11, java.lang.String r12, boolean r13, int r14) {
        /*
            java.lang.String r0 = m9178a((android.content.Context) r11)
            android.net.Uri r1 = m9188h(r12)
            if (r1 == 0) goto L_0x01dc
            java.lang.String r2 = r1.getScheme()
            java.lang.String r3 = "smartlink"
            boolean r2 = r3.equalsIgnoreCase(r2)
            r3 = 1
            r4 = 0
            java.lang.String r5 = "android.intent.action.VIEW"
            r6 = 0
            if (r2 == 0) goto L_0x00eb
            com.fyber.inneractive.sdk.util.i r12 = new com.fyber.inneractive.sdk.util.i
            r12.<init>()
            java.lang.String r13 = "primaryUrl"
            java.lang.String r13 = r1.getQueryParameter(r13)
            boolean r14 = com.fyber.inneractive.sdk.util.C3665n.m9140a((android.content.Context) r11, (java.lang.String) r13)
            if (r14 == 0) goto L_0x0037
            java.lang.String r14 = "primaryTrackingUrl"
            java.util.List r14 = r1.getQueryParameters(r14)
            com.fyber.inneractive.sdk.util.am$a r2 = com.fyber.inneractive.sdk.util.C3632am.C3633a.Primary
            r12.mo19572a(r2, r13, r14)
        L_0x0037:
            java.lang.String r13 = "fallbackUrl"
            java.lang.String r13 = r1.getQueryParameter(r13)
            boolean r14 = com.fyber.inneractive.sdk.util.C3665n.m9140a((android.content.Context) r11, (java.lang.String) r13)
            if (r14 == 0) goto L_0x004e
            java.lang.String r14 = "fallbackTrackingUrl"
            java.util.List r14 = r1.getQueryParameters(r14)
            com.fyber.inneractive.sdk.util.am$a r1 = com.fyber.inneractive.sdk.util.C3632am.C3633a.FallBack
            r12.mo19572a(r1, r13, r14)
        L_0x004e:
            java.util.Queue<com.fyber.inneractive.sdk.util.am> r13 = r12.f9934a
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x0058
            r13 = 1
            goto L_0x0059
        L_0x0058:
            r13 = 0
        L_0x0059:
            if (r13 == 0) goto L_0x00dc
            java.util.Queue<com.fyber.inneractive.sdk.util.am> r12 = r12.f9934a
            java.util.PriorityQueue r12 = (java.util.PriorityQueue) r12
        L_0x005f:
            java.lang.Object r13 = r12.poll()
            com.fyber.inneractive.sdk.util.am r13 = (com.fyber.inneractive.sdk.util.C3632am) r13
            if (r13 == 0) goto L_0x006f
            android.net.Uri r14 = r13.f9898a
            boolean r14 = com.fyber.inneractive.sdk.util.C3665n.m9139a((android.content.Context) r11, (android.net.Uri) r14)
            if (r14 == 0) goto L_0x005f
        L_0x006f:
            if (r13 == 0) goto L_0x00c1
            android.content.Intent r12 = new android.content.Intent
            android.net.Uri r14 = r13.f9898a
            r12.<init>(r5, r14)
            boolean r11 = m9179a((android.content.Context) r11, (android.content.Intent) r12)
            if (r11 == 0) goto L_0x00bc
            java.util.List<java.lang.String> r12 = r13.f9899b
            java.util.Iterator r12 = r12.iterator()
        L_0x0084:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00bc
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto L_0x00a6
            int r14 = com.fyber.inneractive.sdk.util.IAlog.f9871b
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "SMART_LINK"
            r1[r6] = r2
            r1[r3] = r13
            java.lang.String r2 = "%s %s"
            com.fyber.inneractive.sdk.util.IAlog.m9030a((int) r14, (java.lang.String) r2, (java.lang.Object[]) r1)
        L_0x00a6:
            long r1 = java.lang.System.currentTimeMillis()
            com.fyber.inneractive.sdk.h.ae r14 = new com.fyber.inneractive.sdk.h.ae
            com.fyber.inneractive.sdk.util.n$1 r5 = new com.fyber.inneractive.sdk.util.n$1
            r5.<init>(r13, r1)
            r14.<init>(r5, r13)
            com.fyber.inneractive.sdk.h.s r13 = com.fyber.inneractive.sdk.config.IAConfigManager.m5937h()
            r13.mo18441a(r14)
            goto L_0x0084
        L_0x00bc:
            if (r11 == 0) goto L_0x00c1
            com.fyber.inneractive.sdk.util.u$c r11 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPEN_IN_EXTERNAL_BROWSER
            goto L_0x00c3
        L_0x00c1:
            com.fyber.inneractive.sdk.util.u$c r11 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
        L_0x00c3:
            com.fyber.inneractive.sdk.util.u$c r12 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            if (r11 != r12) goto L_0x00d6
            com.fyber.inneractive.sdk.util.u$a r11 = new com.fyber.inneractive.sdk.util.u$a
            com.fyber.inneractive.sdk.util.u$c r12 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            com.fyber.inneractive.sdk.util.u$b r13 = new com.fyber.inneractive.sdk.util.u$b
            java.lang.String r14 = "IADeeplinkUtil.tryHandleDeepLinkWithExternalApp has failed"
            r13.<init>(r14)
            r11.<init>(r12, r13, r0)
            return r11
        L_0x00d6:
            com.fyber.inneractive.sdk.util.u$a r12 = new com.fyber.inneractive.sdk.util.u$a
            r12.<init>(r11, r4, r0)
            return r12
        L_0x00dc:
            com.fyber.inneractive.sdk.util.u$a r11 = new com.fyber.inneractive.sdk.util.u$a
            com.fyber.inneractive.sdk.util.u$c r12 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            com.fyber.inneractive.sdk.util.u$b r13 = new com.fyber.inneractive.sdk.util.u$b
            java.lang.String r14 = "!fyberDeepLink.isValid()"
            r13.<init>(r14)
            r11.<init>(r12, r13, r0)
            return r11
        L_0x00eb:
            java.lang.String r2 = r1.getScheme()
            java.lang.String r7 = "intent"
            boolean r2 = r7.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00fc
            com.fyber.inneractive.sdk.util.u$a r11 = m9177a((android.net.Uri) r1, (android.content.Context) r11)
            return r11
        L_0x00fc:
            android.content.pm.PackageManager r2 = r11.getPackageManager()
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r5, r1)
            r8 = 32
            java.util.List r2 = r2.queryIntentActivities(r7, r8)
            if (r2 == 0) goto L_0x0194
            int r7 = r2.size()
            if (r7 <= 0) goto L_0x0194
            android.content.pm.PackageManager r7 = r11.getPackageManager()
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r10 = "http://www.fyber.com"
            android.net.Uri r10 = android.net.Uri.parse(r10)
            r9.<init>(r5, r10)
            java.util.List r7 = r7.queryIntentActivities(r9, r8)
            java.util.TreeSet r8 = new java.util.TreeSet
            java.util.Comparator<android.content.pm.ResolveInfo> r9 = com.fyber.inneractive.sdk.util.C3657l.f9938b
            r8.<init>(r9)
            r8.addAll(r7)
            r2.removeAll(r8)
            if (r2 == 0) goto L_0x015d
            int r7 = r2.size()
            if (r7 <= 0) goto L_0x015d
            java.lang.Object r2 = r2.get(r6)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            if (r2 == 0) goto L_0x015d
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r5, r1)
            android.content.pm.ActivityInfo r1 = r2.activityInfo
            java.lang.String r1 = r1.packageName
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            java.lang.String r2 = r2.name
            r7.setClassName(r1, r2)
            boolean r1 = r11 instanceof android.app.Activity
            if (r1 != 0) goto L_0x015e
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r7.setFlags(r1)
            goto L_0x015e
        L_0x015d:
            r7 = r4
        L_0x015e:
            if (r7 == 0) goto L_0x0194
            r11.startActivity(r7)     // Catch:{ Exception -> 0x016b }
            com.fyber.inneractive.sdk.util.u$a r11 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ Exception -> 0x016b }
            com.fyber.inneractive.sdk.util.u$c r12 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPEN_IN_EXTERNAL_APPLICATION     // Catch:{ Exception -> 0x016b }
            r11.<init>(r12, r4, r0)     // Catch:{ Exception -> 0x016b }
            return r11
        L_0x016b:
            r11 = move-exception
            java.lang.String r12 = r11.getLocalizedMessage()
            java.lang.Object[] r13 = new java.lang.Object[r6]
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r12, r13)
            com.fyber.inneractive.sdk.util.u$a r12 = new com.fyber.inneractive.sdk.util.u$a
            com.fyber.inneractive.sdk.util.u$c r13 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            com.fyber.inneractive.sdk.util.u$b r14 = new com.fyber.inneractive.sdk.util.u$b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "deep linkk failed to open with message - "
            r1.<init>(r2)
            java.lang.String r11 = r11.getMessage()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r14.<init>(r11)
            r12.<init>(r13, r14, r0)
            return r12
        L_0x0194:
            int r1 = com.fyber.inneractive.sdk.util.C3685u.C3689d.f9986a
            if (r14 != r1) goto L_0x01a7
            com.fyber.inneractive.sdk.util.u$a r11 = new com.fyber.inneractive.sdk.util.u$a
            com.fyber.inneractive.sdk.util.u$c r12 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            com.fyber.inneractive.sdk.util.u$b r13 = new com.fyber.inneractive.sdk.util.u$b
            java.lang.String r14 = "Redirect from internal browser didn't success "
            r13.<init>(r14)
            r11.<init>(r12, r13, r0)
            return r11
        L_0x01a7:
            if (r13 == 0) goto L_0x01c2
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x01be
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r12.toLowerCase(r1)
            java.lang.String r2 = "http"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x01be
            goto L_0x01bf
        L_0x01be:
            r3 = 0
        L_0x01bf:
            if (r3 != 0) goto L_0x01c2
            r13 = 0
        L_0x01c2:
            com.fyber.inneractive.sdk.util.u$a r11 = m9183b(r11, r12, r13, r14)
            com.fyber.inneractive.sdk.util.u$c r12 = r11.f9977a
            com.fyber.inneractive.sdk.util.u$c r13 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            if (r12 == r13) goto L_0x01db
            com.fyber.inneractive.sdk.util.u$a r12 = new com.fyber.inneractive.sdk.util.u$a
            com.fyber.inneractive.sdk.util.u$c r11 = r11.f9977a
            com.fyber.inneractive.sdk.util.u$b r13 = new com.fyber.inneractive.sdk.util.u$b
            java.lang.String r14 = "Used fallback for opening the click"
            r13.<init>(r14)
            r12.<init>(r11, r13, r0)
            return r12
        L_0x01db:
            return r11
        L_0x01dc:
            com.fyber.inneractive.sdk.util.u$a r11 = new com.fyber.inneractive.sdk.util.u$a
            com.fyber.inneractive.sdk.util.u$c r12 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            com.fyber.inneractive.sdk.util.u$b r13 = new com.fyber.inneractive.sdk.util.u$b
            java.lang.String r14 = "all methods has been exhausted, illegal uri"
            r13.<init>(r14)
            r11.<init>(r12, r13, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3685u.m9176a(android.content.Context, java.lang.String, boolean, int):com.fyber.inneractive.sdk.util.u$a");
    }

    /* renamed from: b */
    public static boolean m9184b(String str) {
        return str.startsWith("http%3A%2F%2F") || str.startsWith("https%3A%2F%2F");
    }

    /* renamed from: f */
    public static String m9186f(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (scheme != null && scheme.equals("fybernativebrowser") && host != null && host.equals("navigate")) {
                return parse.getQueryParameter("url");
            }
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m9187g(String str) {
        if (str != null && (!C3669p.m9149a() || IAConfigManager.m5941l())) {
            if (!(!str.startsWith("http://") && !str.startsWith("http%3A%2F%2F"))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static Uri m9188h(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            IAlog.m9034b("IAJavaUtil: getValidUri: Invalid url %s", str);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.startActivity(m9182b(r6, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        return new com.fyber.inneractive.sdk.util.C3685u.C3686a(com.fyber.inneractive.sdk.util.C3685u.C3688c.f9983d, (java.lang.Throwable) null, r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0058 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:5:0x0012=Splitter:B:5:0x0012, B:20:0x0058=Splitter:B:20:0x0058} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.fyber.inneractive.sdk.util.C3685u.C3686a m9183b(android.content.Context r6, java.lang.String r7, boolean r8, int r9) {
        /*
            java.lang.String r0 = m9178a((android.content.Context) r6)
            r1 = 0
            r2 = 1
            java.lang.String r3 = "IAJavaUtil - valid url found: '%s' opening browser"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x009d }
            r4[r1] = r7     // Catch:{ all -> 0x009d }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r3, r4)     // Catch:{ all -> 0x009d }
            r3 = 0
            if (r8 == 0) goto L_0x0049
            boolean r8 = m9189i(r7)     // Catch:{ ActivityNotFoundException -> 0x003a }
            if (r8 == 0) goto L_0x002b
            int r8 = com.fyber.inneractive.sdk.util.C3685u.C3689d.f9986a     // Catch:{ ActivityNotFoundException -> 0x003a }
            if (r9 == r8) goto L_0x002b
            android.content.Intent r8 = m9185c(r6, r7)     // Catch:{ ActivityNotFoundException -> 0x003a }
            r6.startActivity(r8)     // Catch:{ ActivityNotFoundException -> 0x003a }
            com.fyber.inneractive.sdk.util.u$a r8 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ ActivityNotFoundException -> 0x003a }
            com.fyber.inneractive.sdk.util.u$c r9 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPENED_IN_INTERNAL_BROWSER     // Catch:{ ActivityNotFoundException -> 0x003a }
            r8.<init>(r9, r3, r0)     // Catch:{ ActivityNotFoundException -> 0x003a }
            return r8
        L_0x002b:
            com.fyber.inneractive.sdk.util.u$a r8 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ ActivityNotFoundException -> 0x003a }
            com.fyber.inneractive.sdk.util.u$c r9 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED     // Catch:{ ActivityNotFoundException -> 0x003a }
            com.fyber.inneractive.sdk.util.u$b r4 = new com.fyber.inneractive.sdk.util.u$b     // Catch:{ ActivityNotFoundException -> 0x003a }
            java.lang.String r5 = "canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to false"
            r4.<init>(r5)     // Catch:{ ActivityNotFoundException -> 0x003a }
            r8.<init>(r9, r4, r0)     // Catch:{ ActivityNotFoundException -> 0x003a }
            return r8
        L_0x003a:
            android.content.Intent r8 = m9182b(r6, r7)     // Catch:{ all -> 0x009d }
            r6.startActivity(r8)     // Catch:{ all -> 0x009d }
            com.fyber.inneractive.sdk.util.u$a r6 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ all -> 0x009d }
            com.fyber.inneractive.sdk.util.u$c r8 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPEN_IN_EXTERNAL_BROWSER     // Catch:{ all -> 0x009d }
            r6.<init>(r8, r3, r0)     // Catch:{ all -> 0x009d }
            return r6
        L_0x0049:
            android.content.Intent r8 = m9182b(r6, r7)     // Catch:{ ActivityNotFoundException -> 0x0080, all -> 0x0058 }
            r6.startActivity(r8)     // Catch:{ ActivityNotFoundException -> 0x0080, all -> 0x0058 }
            com.fyber.inneractive.sdk.util.u$a r8 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ ActivityNotFoundException -> 0x0080, all -> 0x0058 }
            com.fyber.inneractive.sdk.util.u$c r4 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPEN_IN_EXTERNAL_BROWSER     // Catch:{ ActivityNotFoundException -> 0x0080, all -> 0x0058 }
            r8.<init>(r4, r3, r0)     // Catch:{ ActivityNotFoundException -> 0x0080, all -> 0x0058 }
            return r8
        L_0x0058:
            boolean r8 = m9189i(r7)     // Catch:{ all -> 0x009d }
            if (r8 == 0) goto L_0x0071
            int r8 = com.fyber.inneractive.sdk.util.C3685u.C3689d.f9986a     // Catch:{ all -> 0x009d }
            if (r9 == r8) goto L_0x0071
            android.content.Intent r8 = m9185c(r6, r7)     // Catch:{ all -> 0x009d }
            r6.startActivity(r8)     // Catch:{ all -> 0x009d }
            com.fyber.inneractive.sdk.util.u$a r6 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ all -> 0x009d }
            com.fyber.inneractive.sdk.util.u$c r8 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPENED_IN_INTERNAL_BROWSER     // Catch:{ all -> 0x009d }
            r6.<init>(r8, r3, r0)     // Catch:{ all -> 0x009d }
            return r6
        L_0x0071:
            com.fyber.inneractive.sdk.util.u$a r6 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ all -> 0x009d }
            com.fyber.inneractive.sdk.util.u$c r8 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED     // Catch:{ all -> 0x009d }
            com.fyber.inneractive.sdk.util.u$b r9 = new com.fyber.inneractive.sdk.util.u$b     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to true"
            r9.<init>(r3)     // Catch:{ all -> 0x009d }
            r6.<init>(r8, r9, r0)     // Catch:{ all -> 0x009d }
            return r6
        L_0x0080:
            boolean r6 = m9180a((android.content.Context) r6, (java.lang.String) r7)     // Catch:{ all -> 0x009d }
            if (r6 == 0) goto L_0x008e
            com.fyber.inneractive.sdk.util.u$a r6 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ all -> 0x009d }
            com.fyber.inneractive.sdk.util.u$c r8 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPENED_USING_CHROME_NAVIGATE     // Catch:{ all -> 0x009d }
            r6.<init>(r8, r3, r0)     // Catch:{ all -> 0x009d }
            return r6
        L_0x008e:
            com.fyber.inneractive.sdk.util.u$a r6 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ all -> 0x009d }
            com.fyber.inneractive.sdk.util.u$c r8 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED     // Catch:{ all -> 0x009d }
            com.fyber.inneractive.sdk.util.u$b r9 = new com.fyber.inneractive.sdk.util.u$b     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "tryOpeningChromeGracefully has failed and couldn't open the url"
            r9.<init>(r3)     // Catch:{ all -> 0x009d }
            r6.<init>(r8, r9, r0)     // Catch:{ all -> 0x009d }
            return r6
        L_0x009d:
            r6 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r1] = r7
            java.lang.String r7 = "IAJavaUtil - could not open a browser for url: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r7, r8)
            com.fyber.inneractive.sdk.util.u$a r7 = new com.fyber.inneractive.sdk.util.u$a
            com.fyber.inneractive.sdk.util.u$c r8 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            r7.<init>(r8, r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3685u.m9183b(android.content.Context, java.lang.String, boolean, int):com.fyber.inneractive.sdk.util.u$a");
    }

    /* renamed from: i */
    private static boolean m9189i(String str) {
        return !m9181a(str) && !m9184b(str);
    }

    /* renamed from: a */
    private static boolean m9180a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("googlechrome://navigate?url=%s", new Object[]{str})));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            IAlog.m9036d("Failed opening chrome for a special uri.", new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    private static Intent m9182b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    /* renamed from: c */
    private static Intent m9185c(Context context, String str) {
        Intent intent = new Intent(context, InneractiveInternalBrowserActivity.class);
        intent.putExtra(InneractiveInternalBrowserActivity.URL_EXTRA, str);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    /* renamed from: a */
    private static boolean m9179a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo next : queryIntentActivities) {
                if (next.activityInfo.exported) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        com.fyber.inneractive.sdk.util.IAlog.m9030a(com.fyber.inneractive.sdk.util.IAlog.f9871b, "%s %s", "Intent failed, url:", r8);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0055 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.fyber.inneractive.sdk.util.C3685u.C3686a m9177a(android.net.Uri r8, android.content.Context r9) {
        /*
            java.lang.String r0 = m9178a((android.content.Context) r9)
            r1 = 0
            java.lang.String r2 = r8.toString()     // Catch:{ URISyntaxException -> 0x0071 }
            r3 = 1
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)     // Catch:{ URISyntaxException -> 0x0071 }
            boolean r4 = m9179a((android.content.Context) r9, (android.content.Intent) r2)     // Catch:{ URISyntaxException -> 0x0071 }
            r5 = 0
            r6 = 2
            java.lang.String r7 = "%s %s"
            if (r4 == 0) goto L_0x002d
            int r9 = com.fyber.inneractive.sdk.util.IAlog.f9871b     // Catch:{ URISyntaxException -> 0x0071 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ URISyntaxException -> 0x0071 }
            java.lang.String r4 = "DEEPLINK"
            r2[r1] = r4     // Catch:{ URISyntaxException -> 0x0071 }
            r2[r3] = r8     // Catch:{ URISyntaxException -> 0x0071 }
            com.fyber.inneractive.sdk.util.IAlog.m9030a((int) r9, (java.lang.String) r7, (java.lang.Object[]) r2)     // Catch:{ URISyntaxException -> 0x0071 }
            com.fyber.inneractive.sdk.util.u$a r8 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ URISyntaxException -> 0x0071 }
            com.fyber.inneractive.sdk.util.u$c r9 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPEN_IN_EXTERNAL_APPLICATION     // Catch:{ URISyntaxException -> 0x0071 }
            r8.<init>(r9, r5, r0)     // Catch:{ URISyntaxException -> 0x0071 }
            return r8
        L_0x002d:
            java.lang.String r8 = "browser_fallback_url"
            java.lang.String r8 = r2.getStringExtra(r8)     // Catch:{ URISyntaxException -> 0x0071 }
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ URISyntaxException -> 0x0071 }
            if (r2 != 0) goto L_0x0062
            android.content.Intent r2 = m9182b(r9, r8)     // Catch:{ ActivityNotFoundException -> 0x0055 }
            r9.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x0055 }
            int r9 = com.fyber.inneractive.sdk.util.IAlog.f9871b     // Catch:{ ActivityNotFoundException -> 0x0055 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ ActivityNotFoundException -> 0x0055 }
            java.lang.String r4 = "Intent opened successfully, url:"
            r2[r1] = r4     // Catch:{ ActivityNotFoundException -> 0x0055 }
            r2[r3] = r8     // Catch:{ ActivityNotFoundException -> 0x0055 }
            com.fyber.inneractive.sdk.util.IAlog.m9030a((int) r9, (java.lang.String) r7, (java.lang.Object[]) r2)     // Catch:{ ActivityNotFoundException -> 0x0055 }
            com.fyber.inneractive.sdk.util.u$a r9 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ ActivityNotFoundException -> 0x0055 }
            com.fyber.inneractive.sdk.util.u$c r2 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPEN_IN_EXTERNAL_BROWSER     // Catch:{ ActivityNotFoundException -> 0x0055 }
            r9.<init>(r2, r5, r0)     // Catch:{ ActivityNotFoundException -> 0x0055 }
            return r9
        L_0x0055:
            int r9 = com.fyber.inneractive.sdk.util.IAlog.f9871b     // Catch:{ URISyntaxException -> 0x0071 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ URISyntaxException -> 0x0071 }
            java.lang.String r4 = "Intent failed, url:"
            r2[r1] = r4     // Catch:{ URISyntaxException -> 0x0071 }
            r2[r3] = r8     // Catch:{ URISyntaxException -> 0x0071 }
            com.fyber.inneractive.sdk.util.IAlog.m9030a((int) r9, (java.lang.String) r7, (java.lang.Object[]) r2)     // Catch:{ URISyntaxException -> 0x0071 }
        L_0x0062:
            com.fyber.inneractive.sdk.util.u$a r8 = new com.fyber.inneractive.sdk.util.u$a     // Catch:{ URISyntaxException -> 0x0071 }
            com.fyber.inneractive.sdk.util.u$c r9 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED     // Catch:{ URISyntaxException -> 0x0071 }
            com.fyber.inneractive.sdk.util.u$b r2 = new com.fyber.inneractive.sdk.util.u$b     // Catch:{ URISyntaxException -> 0x0071 }
            java.lang.String r3 = "tryToOpenExternalApp has failed (intent scheme)"
            r2.<init>(r3)     // Catch:{ URISyntaxException -> 0x0071 }
            r8.<init>(r9, r2, r0)     // Catch:{ URISyntaxException -> 0x0071 }
            return r8
        L_0x0071:
            r8 = move-exception
            java.lang.String r9 = r8.getLocalizedMessage()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r1)
            com.fyber.inneractive.sdk.util.u$a r9 = new com.fyber.inneractive.sdk.util.u$a
            com.fyber.inneractive.sdk.util.u$c r1 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            r9.<init>(r1, r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3685u.m9177a(android.net.Uri, android.content.Context):com.fyber.inneractive.sdk.util.u$a");
    }
}
