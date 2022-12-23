package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: com.inmobi.media.gz */
/* compiled from: PrefDao */
public final class C5330gz {

    /* renamed from: a */
    private final C5307gj f12214a;

    public C5330gz(Context context, String str) {
        this.f12214a = C5307gj.m12157a(context, str);
    }

    /* renamed from: a */
    public final void mo40674a(String str, String str2) {
        this.f12214a.mo40645a(str, str2);
    }

    /* renamed from: b */
    public final void mo40679b(String str, String str2) {
        this.f12214a.mo40645a(str, str2);
        mo40673a(System.currentTimeMillis() / 1000);
    }

    /* renamed from: a */
    public final void mo40675a(String str, Set<String> set) {
        SharedPreferences.Editor edit = this.f12214a.f12166a.edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo40676a(String str, boolean z) {
        this.f12214a.mo40646a(str, z);
    }

    /* renamed from: a */
    public final Set<String> mo40672a(String str) {
        return this.f12214a.f12166a.getStringSet(str, (Set) null);
    }

    /* renamed from: b */
    public final String mo40677b(String str) {
        return this.f12214a.mo40648b(str);
    }

    /* renamed from: c */
    public final Boolean mo40680c(String str) {
        if (this.f12214a.mo40651d(str)) {
            return Boolean.valueOf(this.f12214a.mo40649b(str, true));
        }
        return null;
    }

    /* renamed from: a */
    public final long mo40671a() {
        return this.f12214a.mo40647b("last_ts", 0);
    }

    /* renamed from: a */
    public final void mo40673a(long j) {
        this.f12214a.mo40644a("last_ts", j);
    }

    /* renamed from: d */
    public final boolean mo40681d(String str) {
        return this.f12214a.mo40651d(str);
    }

    /* renamed from: e */
    public final boolean mo40682e(String str) {
        C5307gj gjVar = this.f12214a;
        if (!gjVar.mo40651d(str)) {
            return false;
        }
        SharedPreferences.Editor edit = gjVar.f12166a.edit();
        edit.remove(str);
        edit.apply();
        return true;
    }

    /* renamed from: b */
    public final void mo40678b() {
        SharedPreferences.Editor edit = this.f12214a.f12166a.edit();
        edit.clear();
        edit.apply();
    }
}
