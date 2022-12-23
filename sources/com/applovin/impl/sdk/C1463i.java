package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import com.applovin.impl.sdk.C1457h;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1512a;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.i */
public class C1463i implements C1457h.C1462a, AppLovinWebViewActivity.EventListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final AtomicBoolean f3443a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static WeakReference<AppLovinWebViewActivity> f3444b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1469j f3445c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1505q f3446d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AppLovinUserService.OnConsentDialogDismissListener f3447e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1457h f3448f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public WeakReference<Activity> f3449g = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1512a f3450h;

    C1463i(C1469j jVar) {
        this.f3445c = jVar;
        this.f3446d = jVar.mo13139v();
        if (jVar.mo13066F() != null) {
            this.f3449g = new WeakReference<>(jVar.mo13066F());
        }
        jVar.mo13086Z().mo12602a(new C1512a() {
            public void onActivityStarted(Activity activity) {
                WeakReference unused = C1463i.this.f3449g = new WeakReference(activity);
            }
        });
        this.f3448f = new C1457h(this, jVar);
    }

    /* renamed from: a */
    private void m3028a(boolean z, long j) {
        m3036f();
        if (z) {
            mo13055a(j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m3030a(C1469j jVar) {
        if (mo13057c()) {
            C1505q.m3345i("AppLovinSdk", "Consent dialog already showing");
            return false;
        } else if (!C1520h.m3445a(jVar.mo13065D())) {
            C1505q.m3345i("AppLovinSdk", "No internet available, skip showing of consent dialog");
            return false;
        } else if (!((Boolean) jVar.mo13088a(C1369c.f2895al)).booleanValue()) {
            this.f3446d.mo13281e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            return false;
        } else if (C1553o.m3554b((String) jVar.mo13088a(C1369c.f2896am))) {
            return true;
        } else {
            this.f3446d.mo13281e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
            return false;
        }
    }

    /* renamed from: f */
    private void m3036f() {
        this.f3445c.mo13086Z().mo12604b(this.f3450h);
        if (mo13057c()) {
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) f3444b.get();
            f3444b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f3447e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f3447e = null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13053a() {
        if (this.f3449g.get() != null) {
            final Activity activity = (Activity) this.f3449g.get();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C1463i.this.mo13056a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f3445c.mo13088a(C1369c.f2898ao)).longValue());
        }
    }

    /* renamed from: a */
    public void mo13055a(final long j) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C1463i.this.f3446d.mo13277b("ConsentDialogManager", "Scheduling repeating consent alert");
                C1463i.this.f3448f.mo13048a(j, C1463i.this.f3445c, C1463i.this);
            }
        });
    }

    /* renamed from: a */
    public void mo13056a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() {
            public void run() {
                C1463i iVar = C1463i.this;
                if (!iVar.m3030a(iVar.f3445c) || C1463i.f3443a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener != null) {
                        onConsentDialogDismissListener.onDismiss();
                        return;
                    }
                    return;
                }
                WeakReference unused = C1463i.this.f3449g = new WeakReference(activity);
                AppLovinUserService.OnConsentDialogDismissListener unused2 = C1463i.this.f3447e = onConsentDialogDismissListener;
                C1512a unused3 = C1463i.this.f3450h = new C1512a() {
                    public void onActivityStarted(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            if (!C1463i.this.mo13057c() || C1463i.f3444b.get() != activity) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity;
                                WeakReference unused = C1463i.f3444b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) C1463i.this.f3445c.mo13088a(C1369c.f2896am), C1463i.this);
                            }
                            C1463i.f3443a.set(false);
                        }
                    }
                };
                C1463i.this.f3445c.mo13086Z().mo12602a(C1463i.this.f3450h);
                Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, C1463i.this.f3445c.mo13136t());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) C1463i.this.f3445c.mo13088a(C1369c.f2897an));
                activity.startActivity(intent);
            }
        });
    }

    /* renamed from: b */
    public void mo13054b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo13057c() {
        WeakReference<AppLovinWebViewActivity> weakReference = f3444b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void onReceivedEvent(String str) {
        boolean booleanValue;
        C1469j jVar;
        C1369c cVar;
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, this.f3445c.mo13065D());
            m3036f();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, this.f3445c.mo13065D());
            booleanValue = ((Boolean) this.f3445c.mo13088a(C1369c.f2899ap)).booleanValue();
            jVar = this.f3445c;
            cVar = C1369c.f2904au;
        } else if ("closed".equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f3445c.mo13088a(C1369c.f2900aq)).booleanValue();
            jVar = this.f3445c;
            cVar = C1369c.f2905av;
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f3445c.mo13088a(C1369c.f2901ar)).booleanValue();
            jVar = this.f3445c;
            cVar = C1369c.f2906aw;
        } else {
            return;
        }
        m3028a(booleanValue, ((Long) jVar.mo13088a(cVar)).longValue());
    }
}
