package com.ogury.p245ed.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.ogury.ed.internal.ev */
public final class C8207ev {

    /* renamed from: a */
    public static final C8208a f21255a = new C8208a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C8207ev f21256c;

    /* renamed from: b */
    private final SharedPreferences f21257b;

    public /* synthetic */ C8207ev(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ogury.ed.internal.ev$a */
    public static final class C8208a {
        public /* synthetic */ C8208a(byte b) {
            this();
        }

        private C8208a() {
        }

        /* renamed from: a */
        public static C8207ev m22960a(Context context) {
            C8467mq.m23881b(context, "context");
            if (C8207ev.f21256c == null) {
                Context applicationContext = context.getApplicationContext();
                C8467mq.m23878a((Object) applicationContext, "context.applicationContext");
                C8207ev.f21256c = new C8207ev(applicationContext, (byte) 0);
            }
            C8207ev c = C8207ev.f21256c;
            C8467mq.m23877a((Object) c);
            return c;
        }
    }

    private C8207ev(Context context) {
        this.f21257b = context.getSharedPreferences("ogury_mraid", 0);
    }

    /* renamed from: a */
    public final void mo53449a(String str) {
        C8467mq.m23881b(str, "mraidJs");
        this.f21257b.edit().putString("mraid_js", str).commit();
    }

    /* renamed from: b */
    public final void mo53451b(String str) {
        C8467mq.m23881b(str, "mraidDownloadUrl");
        this.f21257b.edit().putString("mraid_download_url", str).apply();
    }

    /* renamed from: a */
    public final String mo53448a() {
        SharedPreferences sharedPreferences = this.f21257b;
        C8467mq.m23878a((Object) sharedPreferences, "sharedPref");
        return C8260gk.m23199a(sharedPreferences, "mraid_download_url", "");
    }

    /* renamed from: b */
    public final String mo53450b() {
        SharedPreferences sharedPreferences = this.f21257b;
        C8467mq.m23878a((Object) sharedPreferences, "sharedPref");
        return C8260gk.m23199a(sharedPreferences, "mraid_js", "");
    }
}
