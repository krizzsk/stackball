package com.p243my.target;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.my.target.u8 */
public class C7695u8 {

    /* renamed from: a */
    public static volatile C7695u8 f19491a;

    /* renamed from: b */
    public final SharedPreferences f19492b;

    public C7695u8(SharedPreferences sharedPreferences) {
        this.f19492b = sharedPreferences;
    }

    /* renamed from: a */
    public static C7695u8 m20613a(Context context) {
        C7695u8 u8Var = f19491a;
        if (u8Var == null) {
            synchronized (C7695u8.class) {
                u8Var = f19491a;
                if (u8Var == null) {
                    u8Var = new C7695u8(context.getSharedPreferences("mytarget_prefs", 0));
                    f19491a = u8Var;
                }
            }
        }
        return u8Var;
    }

    /* renamed from: a */
    public int mo51689a() {
        return mo51690a("sdk_flags");
    }

    /* renamed from: a */
    public final int mo51690a(String str) {
        try {
            return this.f19492b.getInt(str, -1);
        } catch (Throwable th) {
            C7374e0.m18991c("PrefsCache exception: " + th);
            return 0;
        }
    }

    /* renamed from: a */
    public void mo51691a(int i) {
        mo51692a("sdk_flags", i);
    }

    /* renamed from: a */
    public final void mo51692a(String str, int i) {
        try {
            SharedPreferences.Editor edit = this.f19492b.edit();
            edit.putInt(str, i);
            edit.commit();
        } catch (Throwable th) {
            C7374e0.m18991c("PrefsCache exception: " + th);
        }
    }

    /* renamed from: a */
    public final void mo51693a(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.f19492b.edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Throwable th) {
            C7374e0.m18991c("PrefsCache exception: " + th);
        }
    }

    /* renamed from: b */
    public String mo51694b() {
        return mo51695b("hlimit");
    }

    /* renamed from: b */
    public final String mo51695b(String str) {
        try {
            String string = this.f19492b.getString(str, (String) null);
            return string != null ? string : "";
        } catch (Throwable th) {
            C7374e0.m18991c("PrefsCache exception: " + th);
            return "";
        }
    }

    /* renamed from: c */
    public String mo51696c() {
        return mo51695b("hoaid");
    }

    /* renamed from: c */
    public void mo51697c(String str) {
        mo51693a("hoaid", str);
    }

    /* renamed from: d */
    public String mo51698d() {
        return mo51695b("instanceId");
    }

    /* renamed from: d */
    public void mo51699d(String str) {
        mo51693a("hlimit", str);
    }

    /* renamed from: e */
    public void mo51700e(String str) {
        mo51693a("instanceId", str);
    }
}
