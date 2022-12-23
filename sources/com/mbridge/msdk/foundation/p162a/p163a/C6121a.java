package com.mbridge.msdk.foundation.p162a.p163a;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6361q;

/* renamed from: com.mbridge.msdk.foundation.a.a.a */
/* compiled from: SharedPerferenceManager */
public class C6121a {

    /* renamed from: a */
    public static final String f15127a = C6121a.class.getSimpleName();

    /* renamed from: c */
    private static C6121a f15128c;

    /* renamed from: b */
    SharedPreferences f15129b;

    private C6121a() {
    }

    /* renamed from: a */
    public static synchronized C6121a m15293a() {
        C6121a aVar;
        synchronized (C6121a.class) {
            if (f15128c == null) {
                f15128c = new C6121a();
            }
            aVar = f15128c;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo42880a(String str, String str2) {
        try {
            Context d = C6122a.m15302b().mo42895d();
            if (d != null) {
                if (this.f15129b == null && d != null) {
                    this.f15129b = d.getSharedPreferences("mbridge", 0);
                }
                SharedPreferences.Editor edit = this.f15129b.edit();
                edit.putString(str, str2);
                edit.apply();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo42879a(String str, int i) {
        try {
            Context d = C6122a.m15302b().mo42895d();
            if (d != null) {
                if (this.f15129b == null && d != null) {
                    this.f15129b = d.getSharedPreferences("mbridge", 0);
                }
                SharedPreferences.Editor edit = this.f15129b.edit();
                edit.putInt(str, i);
                edit.apply();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final Long mo42878a(String str) {
        try {
            Context d = C6122a.m15302b().mo42895d();
            if (d == null) {
                C6361q.m16158d(f15127a, "context is null in get");
                return 0L;
            }
            if (this.f15129b == null && d != null) {
                this.f15129b = d.getSharedPreferences("mbridge", 0);
            }
            return Long.valueOf(this.f15129b.getLong(str, 0));
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: b */
    public final int mo42881b(String str, int i) {
        try {
            Context d = C6122a.m15302b().mo42895d();
            if (d == null) {
                return i;
            }
            if (this.f15129b == null) {
                this.f15129b = d.getSharedPreferences("mbridge", 0);
            }
            return this.f15129b.getInt(str, i);
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* renamed from: b */
    public final String mo42882b(String str) {
        try {
            Context d = C6122a.m15302b().mo42895d();
            if (d == null) {
                return null;
            }
            if (this.f15129b == null && d != null) {
                this.f15129b = d.getSharedPreferences("mbridge", 0);
            }
            return this.f15129b.getString(str, "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public final void mo42883c(String str) {
        Context d = C6122a.m15302b().mo42895d();
        if (d != null) {
            if (this.f15129b == null && d != null) {
                this.f15129b = d.getSharedPreferences("mbridge", 0);
            }
            this.f15129b.edit().remove(str).apply();
        }
    }
}
