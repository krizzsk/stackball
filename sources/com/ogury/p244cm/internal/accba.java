package com.ogury.p244cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ogury.p244cm.internal.accca;
import com.ogury.p244cm.internal.bacab;
import java.util.Date;

/* renamed from: com.ogury.cm.internal.accba */
public final class accba {

    /* renamed from: a */
    public static final aaaaa f20558a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private accbb[] f20559b;

    /* renamed from: com.ogury.cm.internal.accba$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public accba() {
        this((accca) null, (accbc) null, 3, (bbabb) null);
    }

    private accba(accca accca, accbc accbc) {
        bbabc.m22051b(accca, "sharedPrefsHandlerTcf");
        bbabc.m22051b(accbc, "sharedPrefsHandlerCcpaf");
        this.f20559b = new accbb[]{accca, accbc};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ accba(accca accca, accbc accbc, int i, bbabb bbabb) {
        this(abbba.m21818a() != 2 ? new acccb() : new acccb(), new accbc());
        accca.aaaaa aaaaa2 = accca.f20561a;
        abbba abbba = abbba.f20411a;
    }

    /* renamed from: a */
    public static boolean m21962a(Context context) {
        bbabc.m22051b(context, "context");
        return context.getSharedPreferences("cacheConsentMain", 0).getBoolean("hasPaid", false);
    }

    /* renamed from: b */
    public static void m21963b(Context context, String str) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("wrongAssetKey", str).commit();
    }

    /* renamed from: b */
    public static boolean m21964b(Context context) {
        bbabc.m22051b(context, "context");
        return context.getSharedPreferences("cacheConsentMain", 0).getBoolean("isEditAvailable", true);
    }

    /* renamed from: c */
    public static void m21965c(Context context) {
        bbabc.m22051b(context, "context");
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove("wrongAssetKey").apply();
    }

    /* renamed from: d */
    public static String m21966d(Context context) {
        bbabc.m22051b(context, "context");
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("wrongAssetKey", "");
        bbabc.m22048a((Object) string, "PreferenceManager.getDef…ring(WRONG_ASSET_KEY, \"\")");
        return string;
    }

    /* renamed from: a */
    public final void mo52755a(Context context, String str) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        SharedPreferences.Editor edit = context.getSharedPreferences("cacheConsentMain", 0).edit();
        abbba abbba = abbba.f20411a;
        edit.putString("aaid", abbba.m21846o());
        abbba abbba2 = abbba.f20411a;
        edit.putBoolean("isEditAvailable", abbba.m21838g().mo52686b());
        if (str.length() > 0) {
            edit.putString("assetKey", str);
        }
        abbba abbba3 = abbba.f20411a;
        edit.putString("bundleId", abbba.m21845n());
        abbba abbba4 = abbba.f20411a;
        edit.putLong("cacheFor", abbba.m21839h().getTime());
        abbba abbba5 = abbba.f20411a;
        edit.putString("optin", abbba.m21830c().mo52676a().toString());
        abbba abbba6 = abbba.f20411a;
        edit.putBoolean("hasPaid", abbba.m21830c().mo52679b());
        abbba abbba7 = abbba.f20411a;
        edit.putString("formPath", abbba.m21838g().mo52687c());
        abbba abbba8 = abbba.f20411a;
        String[] m = abbba.m21844m();
        bbabc.m22051b(m, "receiver$0");
        edit.putString("frameworks", bacab.aaaaa.m22025a(m, (CharSequence) null, "[", "]", 0, (CharSequence) null, (bbaab) null, 57, (Object) null));
        edit.apply();
        for (accbb a : this.f20559b) {
            a.mo52758a(context);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52756a(java.lang.String r8, android.content.Context r9) {
        /*
            r7 = this;
            java.lang.String r0 = "assetKey"
            com.ogury.p244cm.internal.bbabc.m22051b(r8, r0)
            java.lang.String r1 = "context"
            com.ogury.p244cm.internal.bbabc.m22051b(r9, r1)
            java.lang.String r1 = "cacheConsentMain"
            r2 = 0
            android.content.SharedPreferences r3 = r9.getSharedPreferences(r1, r2)
            java.lang.String r4 = ""
            java.lang.String r0 = r3.getString(r0, r4)
            boolean r8 = com.ogury.p244cm.internal.bbabc.m22050a((java.lang.Object) r0, (java.lang.Object) r8)
            r0 = 1
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x0021
        L_0x001f:
            r8 = 1
            goto L_0x004a
        L_0x0021:
            java.lang.String r8 = "bundleId"
            java.lang.String r8 = r3.getString(r8, r4)
            com.ogury.cm.internal.abbba r5 = com.ogury.p244cm.internal.abbba.f20411a
            java.lang.String r5 = com.ogury.p244cm.internal.abbba.m21845n()
            boolean r8 = com.ogury.p244cm.internal.bbabc.m22050a((java.lang.Object) r8, (java.lang.Object) r5)
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x0035
            goto L_0x001f
        L_0x0035:
            java.lang.String r8 = "aaid"
            java.lang.String r8 = r3.getString(r8, r4)
            com.ogury.cm.internal.abbba r3 = com.ogury.p244cm.internal.abbba.f20411a
            java.lang.String r3 = com.ogury.p244cm.internal.abbba.m21846o()
            boolean r8 = com.ogury.p244cm.internal.bbabc.m22050a((java.lang.Object) r8, (java.lang.Object) r3)
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x0049
            goto L_0x001f
        L_0x0049:
            r8 = 0
        L_0x004a:
            if (r8 == 0) goto L_0x005a
            java.lang.String r8 = "[Consent][sync] Clearing cache..."
            com.ogury.core.internal.OguryIntegrationLogger.m22104d(r8)
            r7.mo52757e(r9)
            java.lang.String r8 = "[Consent][sync] Cache cleared!"
            com.ogury.core.internal.OguryIntegrationLogger.m22104d(r8)
            return r2
        L_0x005a:
            java.lang.String r8 = "[Consent][sync] Restoring consent data from cache..."
            com.ogury.core.internal.OguryIntegrationLogger.m22104d(r8)
            android.content.SharedPreferences r8 = r9.getSharedPreferences(r1, r2)
            com.ogury.cm.internal.abbba r1 = com.ogury.p244cm.internal.abbba.f20411a
            com.ogury.cm.internal.abbcb r1 = com.ogury.p244cm.internal.abbba.m21830c()
            java.lang.String r3 = "optin"
            java.lang.String r5 = "NO_ANSWER"
            java.lang.String r3 = r8.getString(r3, r5)
            java.lang.String r5 = "prefs.getString(OPTIN_KEY, \"NO_ANSWER\")"
            com.ogury.p244cm.internal.bbabc.m22048a((java.lang.Object) r3, (java.lang.String) r5)
            com.ogury.cm.OguryChoiceManager$Answer r3 = com.ogury.p244cm.OguryChoiceManager.Answer.valueOf(r3)
            r1.mo52677a((com.ogury.p244cm.OguryChoiceManager.Answer) r3)
            com.ogury.cm.internal.abbba r1 = com.ogury.p244cm.internal.abbba.f20411a
            r5 = 0
            java.lang.String r1 = "cacheFor"
            long r5 = r8.getLong(r1, r5)
            com.ogury.p244cm.internal.abbba.m21820a((long) r5)
            com.ogury.cm.internal.abbba r1 = com.ogury.p244cm.internal.abbba.f20411a
            com.ogury.cm.internal.abbcc r1 = com.ogury.p244cm.internal.abbba.m21838g()
            java.lang.String r3 = "formPath"
            java.lang.String r5 = "/"
            java.lang.String r3 = r8.getString(r3, r5)
            java.lang.String r5 = "prefs.getString(FORM_PATH_KEY, \"/\")"
            com.ogury.p244cm.internal.bbabc.m22048a((java.lang.Object) r3, (java.lang.String) r5)
            r1.mo52685b(r3)
            java.lang.String r1 = "frameworks"
            java.lang.String r8 = r8.getString(r1, r4)
            if (r8 == 0) goto L_0x00d8
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x00b3
            r1 = 1
            goto L_0x00b4
        L_0x00b3:
            r1 = 0
        L_0x00b4:
            if (r1 == 0) goto L_0x00d8
            com.ogury.cm.internal.abbba r1 = com.ogury.p244cm.internal.abbba.f20411a
            org.json.JSONArray r8 = com.ogury.p244cm.internal.aacaa.aaaaa.m21772b(r8)
            java.util.List r8 = com.ogury.p244cm.internal.aacaa.aaaaa.m21769a((org.json.JSONArray) r8)
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.Object[] r8 = r8.toArray(r1)
            if (r8 == 0) goto L_0x00d0
            java.lang.String[] r8 = (java.lang.String[]) r8
            com.ogury.p244cm.internal.abbba.m21826a((java.lang.String[]) r8)
            goto L_0x00d8
        L_0x00d0:
            com.ogury.cm.internal.babca r8 = new com.ogury.cm.internal.babca
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T>"
            r8.<init>(r9)
            throw r8
        L_0x00d8:
            com.ogury.cm.internal.accbb[] r8 = r7.f20559b
            int r1 = r8.length
        L_0x00db:
            if (r2 >= r1) goto L_0x00e5
            r3 = r8[r2]
            r3.mo52760c(r9)
            int r2 = r2 + 1
            goto L_0x00db
        L_0x00e5:
            java.lang.String r8 = "[Consent][sync] Consent cache restored!"
            com.ogury.core.internal.OguryIntegrationLogger.m22104d(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p244cm.internal.accba.mo52756a(java.lang.String, android.content.Context):boolean");
    }

    /* renamed from: e */
    public final void mo52757e(Context context) {
        bbabc.m22051b(context, "context");
        context.getSharedPreferences("cacheConsentMain", 0).edit().clear().apply();
        for (accbb b : this.f20559b) {
            b.mo52759b(context);
        }
        abbba abbba = abbba.f20411a;
        abbba.m21825a(new Date());
    }
}
