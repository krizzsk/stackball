package com.ogury.p244cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: com.ogury.cm.internal.acbab */
public final class acbab implements acbaa {

    /* renamed from: a */
    public static final aaaaa f20539a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acbab$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo52746a(Context context) {
        bbabc.m22051b(context, "context");
        abbba abbba = abbba.f20411a;
        if (abbba.m21837f("CCPAF")) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
            abbba abbba2 = abbba.f20411a;
            edit.putString("IABUSPrivacy_String", abbba.m21830c().mo52681d().mo52688a());
            edit.apply();
        }
    }
}
