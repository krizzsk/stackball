package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.tapjoy.internal.hi */
public final class C9367hi {

    /* renamed from: a */
    final C9494o f23191a;

    /* renamed from: b */
    public final C9494o f23192b = new C9494o(this.f23193c, "noMoreToday.actionIds");

    /* renamed from: c */
    private final SharedPreferences f23193c;

    public C9367hi(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("fiverocks", 0);
        this.f23193c = sharedPreferences;
        this.f23191a = new C9494o(sharedPreferences, "noMoreToday.date");
        mo58305b();
    }

    /* renamed from: a */
    static String m25176a() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
    }

    /* renamed from: b */
    public final void mo58305b() {
        String a = this.f23191a.mo58486a();
        if (a != null && !m25176a().equals(a)) {
            this.f23191a.mo58487a((String) null);
            this.f23192b.mo58487a((String) null);
        }
    }
}
