package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: com.inmobi.media.gj */
/* compiled from: KeyValueStore */
public final class C5307gj {

    /* renamed from: b */
    private static HashMap<String, C5307gj> f12164b = new HashMap<>();

    /* renamed from: c */
    private static final Object f12165c = new Object();

    /* renamed from: a */
    public SharedPreferences f12166a;

    private C5307gj(Context context, String str) {
        this.f12166a = context.getSharedPreferences(str, 0);
    }

    /* renamed from: a */
    public static String m12158a(String str) {
        return "com.im.keyValueStore.".concat(String.valueOf(str));
    }

    /* renamed from: a */
    public static C5307gj m12157a(Context context, String str) {
        String a = m12158a(str);
        C5307gj gjVar = f12164b.get(a);
        if (gjVar != null) {
            return gjVar;
        }
        synchronized (f12165c) {
            C5307gj gjVar2 = f12164b.get(a);
            if (gjVar2 != null) {
                return gjVar2;
            }
            C5307gj gjVar3 = new C5307gj(context, a);
            f12164b.put(a, gjVar3);
            return gjVar3;
        }
    }

    /* renamed from: a */
    public final void mo40645a(String str, String str2) {
        SharedPreferences.Editor edit = this.f12166a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: b */
    public final String mo40648b(String str) {
        return this.f12166a.getString(str, (String) null);
    }

    /* renamed from: a */
    public final void mo40643a(String str, int i) {
        SharedPreferences.Editor edit = this.f12166a.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: c */
    public final int mo40650c(String str) {
        return this.f12166a.getInt(str, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo40644a(String str, long j) {
        SharedPreferences.Editor edit = this.f12166a.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    /* renamed from: b */
    public final long mo40647b(String str, long j) {
        return this.f12166a.getLong(str, j);
    }

    /* renamed from: a */
    public final void mo40646a(String str, boolean z) {
        SharedPreferences.Editor edit = this.f12166a.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo40649b(String str, boolean z) {
        return this.f12166a.getBoolean(str, z);
    }

    /* renamed from: d */
    public final boolean mo40651d(String str) {
        return this.f12166a.contains(str);
    }
}
