package com.yandex.metrica.impl.p265ob;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.zo */
public abstract class C12040zo {

    /* renamed from: a */
    private volatile boolean f28936a = false;

    public C12040zo(boolean z) {
        this.f28936a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo61071a();

    /* renamed from: a */
    public void mo64219a(String str) {
        mo64218a(6, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo61569b();

    /* renamed from: b */
    public void mo64223b(String str) {
        mo64218a(4, str);
    }

    /* renamed from: c */
    public boolean mo64227c() {
        return this.f28936a;
    }

    /* renamed from: d */
    public void mo64228d() {
        this.f28936a = false;
    }

    /* renamed from: e */
    public void mo64229e() {
        this.f28936a = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo64101f() {
        return this.f28936a;
    }

    /* renamed from: d */
    private String m31101d(String str, Object[] objArr) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(mo61071a());
            if (str == null) {
                str = "";
            }
            sb.append(String.format(Locale.US, str, objArr));
            return sb.toString();
        } catch (Throwable unused) {
            return mo61071a();
        }
    }

    /* renamed from: a */
    public void mo64222a(Throwable th, String str, Object... objArr) {
        String b = mo61569b();
        Log.println(6, b, m31101d(str, objArr) + "\n" + Log.getStackTraceString(th));
    }

    /* renamed from: b */
    public void mo64224b(String str, Object... objArr) {
        Log.println(5, mo61569b(), m31101d(str, objArr));
    }

    /* renamed from: c */
    public void mo64225c(String str) {
        mo64218a(5, str);
    }

    /* renamed from: c */
    public void mo64226c(String str, Object... objArr) {
        if (mo64101f()) {
            Log.println(5, mo61569b(), m31101d(str, objArr));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo64218a(int i, String str) {
        if (mo64101f()) {
            String b = mo61569b();
            StringBuilder sb = new StringBuilder();
            sb.append(mo61071a());
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.println(i, b, sb.toString());
        }
    }

    /* renamed from: a */
    public void mo64220a(String str, Object... objArr) {
        if (mo64101f()) {
            Log.println(4, mo61569b(), m31101d(str, objArr));
        }
    }

    /* renamed from: a */
    public void mo64221a(Throwable th, String str) {
        if (this.f28936a) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo61071a());
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb.append(sb2.toString());
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
            Log.println(6, "AppMetrica", sb.toString());
        }
    }
}
