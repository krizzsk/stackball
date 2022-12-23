package com.ogury.p244cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: com.ogury.cm.internal.accca */
public abstract class accca implements accbb {

    /* renamed from: a */
    public static final aaaaa f20561a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accca$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public abstract String mo52761a();

    /* renamed from: a */
    public void mo52758a(Context context) {
        bbabc.m22051b(context, "context");
        abbba abbba = abbba.f20411a;
        if (abbba.m21837f("TCF")) {
            SharedPreferences.Editor edit = context.getSharedPreferences(mo52761a(), 0).edit();
            abbba abbba2 = abbba.f20411a;
            edit.putString("iabString", abbba.m21830c().mo52680c().mo52698a());
            abbba abbba3 = abbba.f20411a;
            edit.putBoolean("gdprApplies", abbba.m21830c().mo52680c().mo52701b());
            edit.apply();
        }
    }

    /* renamed from: b */
    public final void mo52759b(Context context) {
        bbabc.m22051b(context, "context");
        context.getSharedPreferences(mo52761a(), 0).edit().clear().apply();
        abbba abbba = abbba.f20411a;
        abbba.m21825a(new Date());
    }

    /* renamed from: c */
    public void mo52760c(Context context) {
        bbabc.m22051b(context, "context");
        abbba abbba = abbba.f20411a;
        if (abbba.m21837f("TCF")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(mo52761a(), 0);
            abbba abbba2 = abbba.f20411a;
            abcab c = abbba.m21830c().mo52680c();
            String string = sharedPreferences.getString("iabString", "");
            bbabc.m22048a((Object) string, "prefs.getString(IAB_STRING_KEY, \"\")");
            c.mo52699a(string);
            abbba abbba3 = abbba.f20411a;
            abbba.m21830c().mo52680c().mo52700a(sharedPreferences.getBoolean("gdprApplies", true));
        }
    }
}
