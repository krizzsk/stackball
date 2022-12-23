package com.ogury.p245ed.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ogury.ed.internal.fk */
public final class C8229fk {

    /* renamed from: a */
    public static final C8230a f21305a = new C8230a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C8229fk f21306c;

    /* renamed from: b */
    private final SharedPreferences f21307b;

    public /* synthetic */ C8229fk(Context context, byte b) {
        this(context);
    }

    private C8229fk(Context context) {
        this.f21307b = context.getSharedPreferences("profig", 0);
    }

    /* renamed from: com.ogury.ed.internal.fk$a */
    public static final class C8230a {
        public /* synthetic */ C8230a(byte b) {
            this();
        }

        private C8230a() {
        }

        /* renamed from: a */
        public static C8229fk m23074a(Context context) {
            C8467mq.m23881b(context, "context");
            if (C8229fk.f21306c == null) {
                Context applicationContext = context.getApplicationContext();
                C8467mq.m23878a((Object) applicationContext, "context.applicationContext");
                C8229fk.f21306c = new C8229fk(applicationContext, (byte) 0);
            }
            C8229fk l = C8229fk.f21306c;
            C8467mq.m23877a((Object) l);
            return l;
        }
    }

    /* renamed from: a */
    public final void mo53507a(int i) {
        this.f21307b.edit().putInt("numberOfProfigApiCalls", i).apply();
    }

    /* renamed from: a */
    public final int mo53506a() {
        return this.f21307b.getInt("numberOfProfigApiCalls", 0);
    }

    /* renamed from: b */
    public final String mo53510b() {
        SharedPreferences sharedPreferences = this.f21307b;
        C8467mq.m23878a((Object) sharedPreferences, "sharedPref");
        return C8260gk.m23199a(sharedPreferences, "md5Profig", "");
    }

    /* renamed from: a */
    public final void mo53509a(String str) {
        C8467mq.m23881b(str, "md5Profig");
        this.f21307b.edit().putString("md5Profig", str).apply();
    }

    /* renamed from: b */
    public final void mo53511b(String str) {
        C8467mq.m23881b(str, "aaid");
        this.f21307b.edit().putString("aaid", str).apply();
    }

    /* renamed from: c */
    public final String mo53512c() {
        SharedPreferences sharedPreferences = this.f21307b;
        C8467mq.m23878a((Object) sharedPreferences, "sharedPref");
        return C8260gk.m23199a(sharedPreferences, "aaid", "");
    }

    /* renamed from: c */
    public final void mo53513c(String str) {
        C8467mq.m23881b(str, "fullProfigResponse");
        this.f21307b.edit().putString("fullProfigResponseJson", str).apply();
    }

    /* renamed from: d */
    public final String mo53514d() {
        SharedPreferences sharedPreferences = this.f21307b;
        C8467mq.m23878a((Object) sharedPreferences, "sharedPref");
        return C8260gk.m23199a(sharedPreferences, "fullProfigResponseJson", "");
    }

    /* renamed from: e */
    public final void mo53516e() {
        this.f21307b.edit().putLong("numberOfDays", System.currentTimeMillis() / TimeUnit.DAYS.toMillis(1)).apply();
    }

    /* renamed from: f */
    public final long mo53518f() {
        return this.f21307b.getLong("numberOfDays", 0);
    }

    /* renamed from: d */
    public final void mo53515d(String str) {
        C8467mq.m23881b(str, "appVersion");
        this.f21307b.edit().putString("appVersion", str).apply();
    }

    /* renamed from: g */
    public final String mo53519g() {
        String string = this.f21307b.getString("appVersion", C8265go.m23207a());
        return string == null ? "" : string;
    }

    /* renamed from: a */
    public final void mo53508a(long j) {
        this.f21307b.edit().putLong("last_profig_sync", j).apply();
    }

    /* renamed from: h */
    public final long mo53520h() {
        return this.f21307b.getLong("last_profig_sync", 0);
    }

    /* renamed from: e */
    public final void mo53517e(String str) {
        C8467mq.m23881b(str, "apiKey");
        this.f21307b.edit().putString(TapjoyConstants.TJC_API_KEY, str).apply();
    }

    /* renamed from: i */
    public final String mo53521i() {
        SharedPreferences sharedPreferences = this.f21307b;
        C8467mq.m23878a((Object) sharedPreferences, "sharedPref");
        return C8260gk.m23199a(sharedPreferences, TapjoyConstants.TJC_API_KEY, "");
    }

    /* renamed from: j */
    public final void mo53522j() {
        this.f21307b.edit().putLong("profigSyncRequired", System.currentTimeMillis()).apply();
    }

    /* renamed from: k */
    public final boolean mo53523k() {
        return this.f21307b.getLong("profigSyncRequired", 0) >= mo53520h();
    }
}
