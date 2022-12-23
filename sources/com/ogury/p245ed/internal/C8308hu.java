package com.ogury.p245ed.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: com.ogury.ed.internal.hu */
public final class C8308hu {

    /* renamed from: a */
    public static final C8309a f21460a = new C8309a((byte) 0);

    /* renamed from: b */
    private final Context f21461b;

    /* renamed from: c */
    private final SharedPreferences f21462c;

    public C8308hu(Context context) {
        C8467mq.m23881b(context, "context");
        this.f21461b = context;
        this.f21462c = context.getSharedPreferences("PERSISTED_SETS", 0);
    }

    /* renamed from: com.ogury.ed.internal.hu$a */
    public static final class C8309a {
        public /* synthetic */ C8309a(byte b) {
            this();
        }

        private C8309a() {
        }
    }

    /* renamed from: a */
    public final boolean mo53690a(String str) {
        C8467mq.m23881b(str, "identifier");
        Set<String> stringSet = this.f21462c.getStringSet("shortcutIdentifierList", (Set) null);
        if (stringSet == null) {
            return false;
        }
        return stringSet.contains(str);
    }

    /* renamed from: a */
    public final String mo53689a(String str, String str2) {
        C8467mq.m23881b(str, "id");
        C8467mq.m23881b(str2, "argsJson");
        this.f21462c.edit().putString(C8467mq.m23873a("argsJson:", (Object) str), str2).apply();
        return str;
    }

    /* renamed from: b */
    public final String mo53691b(String str) {
        C8467mq.m23881b(str, "id");
        String string = this.f21462c.getString(C8467mq.m23873a("argsJson:", (Object) str), "");
        return string == null ? "" : string;
    }

    /* renamed from: c */
    public final boolean mo53692c(String str) {
        C8467mq.m23881b(str, "id");
        String string = this.f21462c.getString(C8467mq.m23873a("argsJson:", (Object) str), "");
        return string != null && string.length() > 0;
    }
}
