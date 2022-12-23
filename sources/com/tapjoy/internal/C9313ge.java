package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.tapjoy.internal.ge */
public final class C9313ge {

    /* renamed from: e */
    private static final C9313ge f23030e;

    /* renamed from: f */
    private static C9313ge f23031f;

    /* renamed from: a */
    public Boolean f23032a = null;

    /* renamed from: b */
    public String f23033b = null;

    /* renamed from: c */
    public Boolean f23034c = null;

    /* renamed from: d */
    public boolean f23035d = false;

    /* renamed from: g */
    private Context f23036g;

    static {
        C9313ge geVar = new C9313ge();
        f23030e = geVar;
        f23031f = geVar;
    }

    /* renamed from: a */
    public static C9313ge m24951a() {
        return f23031f;
    }

    /* renamed from: a */
    public final synchronized void mo58188a(Context context) {
        if (context != null) {
            if (this.f23036g == null) {
                this.f23036g = context;
            }
        }
        C9313ge geVar = f23031f;
        if (geVar.f23036g != null) {
            SharedPreferences sharedPreferences = geVar.f23036g.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
            if (geVar.f23032a == null && sharedPreferences.contains("gdpr")) {
                geVar.f23032a = Boolean.valueOf(sharedPreferences.getBoolean("gdpr", false));
            }
            if (geVar.f23033b == null) {
                geVar.f23033b = sharedPreferences.getString("cgdpr", "");
            }
            if (geVar.f23034c == null && sharedPreferences.contains(TapjoyConstants.PREF_BELOW_CONSENT_AGE)) {
                geVar.f23034c = Boolean.valueOf(sharedPreferences.getBoolean(TapjoyConstants.PREF_BELOW_CONSENT_AGE, false));
            }
        }
        if (this.f23035d) {
            this.f23035d = false;
            C9313ge geVar2 = f23031f;
            if (geVar2.f23036g != null) {
                if (geVar2.f23032a != null) {
                    geVar2.mo58189b();
                }
                if (geVar2.f23033b != null) {
                    geVar2.mo58190c();
                }
                if (geVar2.f23034c != null) {
                    geVar2.mo58191d();
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo58189b() {
        Context context = this.f23036g;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putBoolean("gdpr", this.f23032a.booleanValue());
        edit.apply();
        return true;
    }

    /* renamed from: c */
    public final boolean mo58190c() {
        Context context = this.f23036g;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putString("cgdpr", this.f23033b);
        edit.apply();
        return true;
    }

    /* renamed from: d */
    public final boolean mo58191d() {
        Context context = this.f23036g;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putBoolean(TapjoyConstants.PREF_BELOW_CONSENT_AGE, this.f23034c.booleanValue());
        edit.apply();
        TapjoyConnectCore.setAdTrackingEnabled();
        return true;
    }
}
