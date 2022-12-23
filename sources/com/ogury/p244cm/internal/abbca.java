package com.ogury.p244cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.ads.AdRequest;
import com.ogury.p244cm.internal.aaccc;

/* renamed from: com.ogury.cm.internal.abbca */
public final class abbca {

    /* renamed from: a */
    public static final aaaaa f20428a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final SharedPreferences f20429b;

    /* renamed from: c */
    private final Context f20430c;

    /* renamed from: d */
    private final accba f20431d;

    /* renamed from: e */
    private final aabbb f20432e;

    /* renamed from: com.ogury.cm.internal.abbca$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    private abbca(Context context, accba accba, aabbb aabbb) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(accba, "sharedPrefsHandler");
        bbabc.m22051b(aabbb, "consentExternalCache");
        this.f20430c = context;
        this.f20431d = accba;
        this.f20432e = aabbb;
        SharedPreferences sharedPreferences = context.getSharedPreferences("migration", 0);
        bbabc.m22048a((Object) sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f20429b = sharedPreferences;
    }

    public /* synthetic */ abbca(Context context, accba accba, aabbb aabbb, int i, bbabb bbabb) {
        this(context, new accba((accca) null, (accbc) null, 3, (bbabb) null), new aabbb(context, abaab.f20382a));
    }

    /* renamed from: a */
    public final void mo52675a() {
        String string = this.f20429b.getString("migrated_version", AdRequest.VERSION);
        bbabc.m22048a((Object) string, "sharedPreferences.getStr…TED_VERSION_KEY, \"0.0.0\")");
        aaccc.aaaaa aaaaa2 = aaccc.f20375a;
        bbabc.m22051b(string, "version");
        bbcac b = new bbcbb("(0|[1-9]\\d*)?(?:\\.)?(0|[1-9]\\d*)?(?:\\.)?(0|[1-9]\\d*)?(?:-([\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*))?(?:\\+([\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*))?").mo52862b(string);
        if (b != null) {
            boolean z = true;
            int parseInt = b.mo52859a().get(1).length() == 0 ? 0 : Integer.parseInt(b.mo52859a().get(1));
            int parseInt2 = b.mo52859a().get(2).length() == 0 ? 0 : Integer.parseInt(b.mo52859a().get(2));
            int parseInt3 = b.mo52859a().get(3).length() == 0 ? 0 : Integer.parseInt(b.mo52859a().get(3));
            String str = b.mo52859a().get(4).length() == 0 ? null : b.mo52859a().get(4);
            if (b.mo52859a().get(5).length() != 0) {
                z = false;
            }
            aaccc aaccc = new aaccc(parseInt, parseInt2, parseInt3, str, z ? null : b.mo52859a().get(5));
            if (new aaccc(aaccc.mo52658a(), aaccc.mo52660b(), aaccc.mo52661c(), (String) null, (String) null, 24, (bbabb) null).compareTo(new aaccc(3, 3, 0, (String) null, (String) null, 24, (bbabb) null)) == -1) {
                this.f20431d.mo52757e(this.f20430c);
                this.f20432e.mo52651a();
            }
            SharedPreferences.Editor edit = this.f20429b.edit();
            edit.putString("migrated_version", "3.3.0");
            edit.apply();
            return;
        }
        throw new IllegalArgumentException("Invalid version string [" + string + ']');
    }
}
