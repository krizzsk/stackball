package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.d */
public final class C2786d {

    /* renamed from: a */
    public Boolean f6574a = null;

    /* renamed from: b */
    public String f6575b = null;

    /* renamed from: c */
    public InneractiveAdManager.GdprConsentSource f6576c = null;

    /* renamed from: d */
    String f6577d = null;

    /* renamed from: e */
    public String f6578e = null;

    /* renamed from: f */
    public SharedPreferences f6579f;

    /* renamed from: a */
    public final void mo18026a() {
        Application p = C3657l.m9125p();
        if (this.f6579f == null && p != null) {
            SharedPreferences sharedPreferences = p.getSharedPreferences("IAConfigurationPreferences", 0);
            this.f6579f = sharedPreferences;
            if (sharedPreferences != null) {
                if (sharedPreferences.contains("IAGDPRBool")) {
                    this.f6574a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
                }
                if (sharedPreferences.contains("IAGdprConsentData")) {
                    this.f6575b = sharedPreferences.getString("IAGdprConsentData", (String) null);
                }
                if (sharedPreferences.contains("IACCPAConsentData")) {
                    this.f6578e = sharedPreferences.getString("IACCPAConsentData", (String) null);
                }
                if (sharedPreferences.contains("IAGdprSource")) {
                    try {
                        this.f6576c = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                    } catch (Exception unused) {
                        this.f6576c = InneractiveAdManager.GdprConsentSource.Internal;
                    }
                }
                if (sharedPreferences.contains("keyUserID")) {
                    this.f6577d = sharedPreferences.getString("keyUserID", (String) null);
                }
            }
        }
    }

    /* renamed from: b */
    public final Boolean mo18028b() {
        if (C3657l.m9125p() == null) {
            return null;
        }
        return this.f6574a;
    }

    /* renamed from: a */
    public final boolean mo18027a(String str, String str2) {
        if (C3657l.m9125p() == null) {
            return false;
        }
        mo18026a();
        if (this.f6579f == null) {
            return false;
        }
        IAlog.m9034b("Saving %s value = %s to sharedPrefs", str, str2);
        this.f6579f.edit().putString(str, str2).apply();
        return true;
    }
}
