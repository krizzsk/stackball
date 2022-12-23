package com.ogury.core.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: com.ogury.core.internal.e */
/* compiled from: OguryTokenManager.kt */
public final class C7976e {

    /* renamed from: a */
    private final SharedPreferences f20768a;

    static {
        new C7977a((byte) 0);
    }

    public C7976e(Context context) {
        C7921ai.m22144b(context, "context");
        this.f20768a = context.getSharedPreferences("ogury_core_token_file", 0);
    }

    /* renamed from: com.ogury.core.internal.e$a */
    /* compiled from: OguryTokenManager.kt */
    public static final class C7977a {
        private C7977a() {
        }

        public /* synthetic */ C7977a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo52963a(String str) {
        C7921ai.m22144b(str, "keyName");
        String string = this.f20768a.getString(str, (String) null);
        CharSequence charSequence = string;
        if (!(charSequence == null || charSequence.length() == 0)) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        C7921ai.m22142a((Object) uuid, "UUID.randomUUID().toString()");
        C7921ai.m22144b(str, "keyName");
        C7921ai.m22144b(uuid, "keyValue");
        this.f20768a.edit().putString(str, uuid).apply();
        return uuid;
    }
}
