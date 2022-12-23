package com.ogury.p244cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: com.ogury.cm.internal.accbc */
public final class accbc implements accbb {

    /* renamed from: a */
    public static final aaaaa f20560a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accbc$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    private static abcaa m21973a() {
        abbba abbba = abbba.f20411a;
        return abbba.m21830c().mo52681d();
    }

    /* renamed from: a */
    public final void mo52758a(Context context) {
        bbabc.m22051b(context, "context");
        abbba abbba = abbba.f20411a;
        if (abbba.m21837f("CCPAF")) {
            SharedPreferences.Editor edit = context.getSharedPreferences("cacheConsentCcpaf", 0).edit();
            edit.putString("uspString", m21973a().mo52688a());
            edit.putBoolean("explicitNotice", m21973a().mo52692b());
            edit.putBoolean("optOutSale", m21973a().mo52694c());
            edit.putBoolean("lspa", m21973a().mo52696d());
            edit.putBoolean("ccpaApplies", m21973a().mo52697e());
            edit.apply();
        }
    }

    /* renamed from: b */
    public final void mo52759b(Context context) {
        bbabc.m22051b(context, "context");
        context.getSharedPreferences("cacheConsentCcpaf", 0).edit().clear().apply();
        abbba abbba = abbba.f20411a;
        abbba.m21825a(new Date());
    }

    /* renamed from: c */
    public final void mo52760c(Context context) {
        bbabc.m22051b(context, "context");
        abbba abbba = abbba.f20411a;
        if (abbba.m21837f("CCPAF")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("cacheConsentCcpaf", 0);
            abcaa a = m21973a();
            String string = sharedPreferences.getString("uspString", "");
            bbabc.m22048a((Object) string, "prefs.getString(USP_STRING, \"\")");
            a.mo52689a(string);
            a.mo52690a(sharedPreferences.getBoolean("explicitNotice", false));
            a.mo52691b(sharedPreferences.getBoolean("optOutSale", false));
            a.mo52693c(sharedPreferences.getBoolean("lspa", false));
            a.mo52695d(sharedPreferences.getBoolean("ccpaApplies", false));
        }
    }
}
