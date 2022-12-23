package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.amazon.device.ads.AdConstants;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.dg */
public final class C12878dg implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g */
    public static final C12879a f32563g = new C12879a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static volatile C12878dg f32564h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Object f32565i = new Object();

    /* renamed from: a */
    private final SharedPreferences f32566a;

    /* renamed from: b */
    private String f32567b;

    /* renamed from: c */
    private String f32568c;

    /* renamed from: d */
    private boolean f32569d;

    /* renamed from: e */
    private String f32570e;

    /* renamed from: f */
    private String f32571f;

    /* renamed from: com.yandex.mobile.ads.impl.dg$a */
    public static final class C12879a {
        private C12879a() {
        }

        public /* synthetic */ C12879a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C12878dg mo66579a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C12878dg.f32564h == null) {
                synchronized (C12878dg.f32565i) {
                    if (C12878dg.f32564h == null) {
                        C12879a aVar = C12878dg.f32563g;
                        C12878dg.f32564h = new C12878dg(context, (DefaultConstructorMarker) null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            C12878dg a = C12878dg.f32564h;
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private C12878dg(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f32566a = defaultSharedPreferences;
        m35244e();
        m35243d();
        m35242c();
        m35245f();
        m35246g();
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public /* synthetic */ C12878dg(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* renamed from: c */
    private final void m35242c() {
        try {
            this.f32569d = this.f32566a.getBoolean("IABConsent_CMPPresent", false);
        } catch (ClassCastException unused) {
        }
    }

    /* renamed from: d */
    private final void m35243d() {
        try {
            this.f32567b = this.f32566a.getString(AdConstants.IABCONSENT_CONSENT_STRING, (String) null);
        } catch (ClassCastException unused) {
        }
    }

    /* renamed from: e */
    private final void m35244e() {
        try {
            this.f32568c = this.f32566a.getString(AdConstants.IABCONSENT_SUBJECT_TO_GDPR, (String) null);
        } catch (ClassCastException unused) {
        }
    }

    /* renamed from: f */
    private final void m35245f() {
        try {
            this.f32570e = this.f32566a.getString("IABConsent_ParsedPurposeConsents", (String) null);
        } catch (ClassCastException unused) {
        }
    }

    /* renamed from: g */
    private final void m35246g() {
        try {
            this.f32571f = this.f32566a.getString("IABConsent_ParsedVendorConsents", (String) null);
        } catch (ClassCastException unused) {
        }
    }

    /* renamed from: h */
    public final boolean mo66573h() {
        boolean z;
        synchronized (f32565i) {
            z = this.f32569d;
        }
        return z;
    }

    /* renamed from: i */
    public final String mo66574i() {
        String str;
        synchronized (f32565i) {
            str = this.f32567b;
        }
        return str;
    }

    /* renamed from: j */
    public final String mo66575j() {
        String str;
        synchronized (f32565i) {
            str = this.f32568c;
        }
        return str;
    }

    /* renamed from: k */
    public final String mo66576k() {
        String str;
        synchronized (f32565i) {
            str = this.f32570e;
        }
        return str;
    }

    /* renamed from: l */
    public final String mo66577l() {
        String str;
        synchronized (f32565i) {
            str = this.f32571f;
        }
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:(3:3|4|5)|35|36|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0072 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.Object r3 = f32565i
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0072
            int r0 = r4.hashCode()     // Catch:{ all -> 0x0076 }
            r1 = 0
            switch(r0) {
                case -934488636: goto L_0x005e;
                case 316538359: goto L_0x004a;
                case 969191740: goto L_0x0036;
                case 970901985: goto L_0x0022;
                case 1233058135: goto L_0x000e;
                default: goto L_0x000d;
            }     // Catch:{ all -> 0x0076 }
        L_0x000d:
            goto L_0x0072
        L_0x000e:
            java.lang.String r0 = "IABConsent_SubjectToGDPR"
            boolean r4 = r4.equals(r0)     // Catch:{ all -> 0x0076 }
            if (r4 != 0) goto L_0x0017
            goto L_0x0072
        L_0x0017:
            android.content.SharedPreferences r4 = r2.f32566a     // Catch:{ ClassCastException -> 0x0072 }
            java.lang.String r0 = "IABConsent_SubjectToGDPR"
            java.lang.String r4 = r4.getString(r0, r1)     // Catch:{ ClassCastException -> 0x0072 }
            r2.f32568c = r4     // Catch:{ ClassCastException -> 0x0072 }
            goto L_0x0072
        L_0x0022:
            java.lang.String r0 = "IABConsent_ParsedVendorConsents"
            boolean r4 = r4.equals(r0)     // Catch:{ all -> 0x0076 }
            if (r4 != 0) goto L_0x002b
            goto L_0x0072
        L_0x002b:
            android.content.SharedPreferences r4 = r2.f32566a     // Catch:{ ClassCastException -> 0x0072 }
            java.lang.String r0 = "IABConsent_ParsedVendorConsents"
            java.lang.String r4 = r4.getString(r0, r1)     // Catch:{ ClassCastException -> 0x0072 }
            r2.f32571f = r4     // Catch:{ ClassCastException -> 0x0072 }
            goto L_0x0072
        L_0x0036:
            java.lang.String r0 = "IABConsent_ConsentString"
            boolean r4 = r4.equals(r0)     // Catch:{ all -> 0x0076 }
            if (r4 != 0) goto L_0x003f
            goto L_0x0072
        L_0x003f:
            android.content.SharedPreferences r4 = r2.f32566a     // Catch:{ ClassCastException -> 0x0072 }
            java.lang.String r0 = "IABConsent_ConsentString"
            java.lang.String r4 = r4.getString(r0, r1)     // Catch:{ ClassCastException -> 0x0072 }
            r2.f32567b = r4     // Catch:{ ClassCastException -> 0x0072 }
            goto L_0x0072
        L_0x004a:
            java.lang.String r0 = "IABConsent_ParsedPurposeConsents"
            boolean r4 = r4.equals(r0)     // Catch:{ all -> 0x0076 }
            if (r4 != 0) goto L_0x0053
            goto L_0x0072
        L_0x0053:
            android.content.SharedPreferences r4 = r2.f32566a     // Catch:{ ClassCastException -> 0x0072 }
            java.lang.String r0 = "IABConsent_ParsedPurposeConsents"
            java.lang.String r4 = r4.getString(r0, r1)     // Catch:{ ClassCastException -> 0x0072 }
            r2.f32570e = r4     // Catch:{ ClassCastException -> 0x0072 }
            goto L_0x0072
        L_0x005e:
            java.lang.String r0 = "IABConsent_CMPPresent"
            boolean r4 = r4.equals(r0)     // Catch:{ all -> 0x0076 }
            if (r4 != 0) goto L_0x0067
            goto L_0x0072
        L_0x0067:
            android.content.SharedPreferences r4 = r2.f32566a     // Catch:{ ClassCastException -> 0x0072 }
            java.lang.String r0 = "IABConsent_CMPPresent"
            r1 = 0
            boolean r4 = r4.getBoolean(r0, r1)     // Catch:{ ClassCastException -> 0x0072 }
            r2.f32569d = r4     // Catch:{ ClassCastException -> 0x0072 }
        L_0x0072:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0076 }
            monitor-exit(r3)
            return
        L_0x0076:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12878dg.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
