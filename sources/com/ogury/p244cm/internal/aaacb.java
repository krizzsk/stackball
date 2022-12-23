package com.ogury.p244cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.amazon.device.ads.AdConstants;

/* renamed from: com.ogury.cm.internal.aaacb */
public final class aaacb {

    /* renamed from: a */
    private final SharedPreferences f20326a;

    /* renamed from: b */
    private SharedPreferences.OnSharedPreferenceChangeListener f20327b = new SharedPreferences.OnSharedPreferenceChangeListener(this) {

        /* renamed from: a */
        final /* synthetic */ aaacb f20329a;

        {
            this.f20329a = r1;
        }

        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            aaaaa a;
            if (bbabc.m22050a((Object) str, (Object) AdConstants.IABCONSENT_CONSENT_STRING_TCF2) && (a = this.f20329a.f20328c) != null) {
                a.mo52635a();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: c */
    public aaaaa f20328c;

    /* renamed from: com.ogury.cm.internal.aaacb$aaaaa */
    public interface aaaaa {
        /* renamed from: a */
        void mo52635a();
    }

    public aaacb(Context context) {
        bbabc.m22051b(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        bbabc.m22048a((Object) defaultSharedPreferences, "PreferenceManager.getDef…haredPreferences(context)");
        this.f20326a = defaultSharedPreferences;
    }

    /* renamed from: a */
    public final int mo52638a() {
        return this.f20326a.getInt("IABTCF_PolicyVersion", 0);
    }

    /* renamed from: a */
    public final void mo52639a(aaaaa aaaaa2) {
        this.f20328c = aaaaa2;
        this.f20326a.registerOnSharedPreferenceChangeListener(this.f20327b);
    }

    /* renamed from: b */
    public final boolean mo52640b() {
        return this.f20326a.getInt(AdConstants.IABCONSENT_SUBJECT_TO_GDPR_TCF2, 0) == 1;
    }

    /* renamed from: c */
    public final boolean mo52641c() {
        return this.f20326a.contains(AdConstants.IABCONSENT_CONSENT_STRING_TCF2);
    }

    /* renamed from: d */
    public final String mo52642d() {
        String string = this.f20326a.getString(AdConstants.IABCONSENT_CONSENT_STRING_TCF2, "");
        bbabc.m22048a((Object) string, "sharedPreferences.getString(\"IABTCF_TCString\", \"\")");
        return string;
    }

    /* renamed from: e */
    public final int mo52643e() {
        return this.f20326a.getInt("IABTCF_CmpSdkID", 0);
    }
}
