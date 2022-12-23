package com.applovin.impl.sdk.p025b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.b.f */
public final class C1372f {

    /* renamed from: a */
    private static SharedPreferences f3177a;

    /* renamed from: b */
    private final SharedPreferences f3178b;

    public C1372f(C1469j jVar) {
        this.f3178b = jVar.mo13065D().getSharedPreferences("com.applovin.sdk.preferences." + jVar.mo13136t(), 0);
    }

    /* renamed from: a */
    private static SharedPreferences m2653a(Context context) {
        if (f3177a == null) {
            f3177a = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f3177a;
    }

    /* renamed from: a */
    public static <T> T m2654a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        T t2;
        long j;
        int i;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (Boolean.class.equals(cls)) {
                    t2 = Boolean.valueOf(t != null ? sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()) : sharedPreferences.getBoolean(str, false));
                } else if (Float.class.equals(cls)) {
                    t2 = Float.valueOf(t != null ? sharedPreferences.getFloat(str, ((Float) t).floatValue()) : sharedPreferences.getFloat(str, 0.0f));
                } else if (Integer.class.equals(cls)) {
                    if (t != null) {
                        i = sharedPreferences.getInt(str, t.getClass().equals(Long.class) ? ((Long) t).intValue() : ((Integer) t).intValue());
                    } else {
                        i = sharedPreferences.getInt(str, 0);
                    }
                    t2 = Integer.valueOf(i);
                } else if (Long.class.equals(cls)) {
                    if (t != null) {
                        j = sharedPreferences.getLong(str, t.getClass().equals(Integer.class) ? ((Integer) t).longValue() : ((Long) t).longValue());
                    } else {
                        j = sharedPreferences.getLong(str, 0);
                    }
                    t2 = Long.valueOf(j);
                } else {
                    t2 = String.class.equals(cls) ? sharedPreferences.getString(str, (String) t) : Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t) : t;
                }
                if (t2 != null) {
                    return cls.cast(t2);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return t;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return t;
        } catch (Throwable th) {
            C1505q.m3341c("SharedPreferencesManager", "Error getting value for key: " + str, th);
            return t;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    public static <T> void m2655a(C1371e<T> eVar, Context context) {
        m2653a(context).edit().remove(eVar.mo12851a()).apply();
    }

    /* renamed from: a */
    public static <T> void m2656a(C1371e<T> eVar, T t, Context context) {
        m2657a(eVar.mo12851a(), t, m2653a(context), (SharedPreferences.Editor) null);
    }

    /* renamed from: a */
    private static <T> void m2657a(String str, T t, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z = true;
        boolean z2 = editor != null;
        if (!z2) {
            editor = sharedPreferences.edit();
        }
        if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        } else if (t instanceof Long) {
            editor.putLong(str, ((Long) t).longValue());
        } else if (t instanceof String) {
            editor.putString(str, (String) t);
        } else if (t instanceof Set) {
            editor.putStringSet(str, (Set) t);
        } else {
            C1505q.m3345i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t);
            z = false;
        }
        if (z && !z2) {
            editor.apply();
        }
    }

    /* renamed from: b */
    public static <T> T m2658b(C1371e<T> eVar, T t, Context context) {
        return m2654a(eVar.mo12851a(), t, (Class) eVar.mo12852b(), m2653a(context));
    }

    /* renamed from: a */
    public void mo12854a(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().clear().apply();
    }

    /* renamed from: a */
    public <T> void mo12855a(C1371e<T> eVar) {
        this.f3178b.edit().remove(eVar.mo12851a()).apply();
    }

    /* renamed from: a */
    public <T> void mo12856a(C1371e<T> eVar, T t) {
        mo12857a(eVar, t, this.f3178b);
    }

    /* renamed from: a */
    public <T> void mo12857a(C1371e<T> eVar, T t, SharedPreferences sharedPreferences) {
        mo12859a(eVar.mo12851a(), t, sharedPreferences);
    }

    /* renamed from: a */
    public <T> void mo12858a(String str, T t, SharedPreferences.Editor editor) {
        m2657a(str, t, (SharedPreferences) null, editor);
    }

    /* renamed from: a */
    public <T> void mo12859a(String str, T t, SharedPreferences sharedPreferences) {
        m2657a(str, t, sharedPreferences, (SharedPreferences.Editor) null);
    }

    /* renamed from: b */
    public <T> T mo12860b(C1371e<T> eVar, T t) {
        return mo12861b(eVar, t, this.f3178b);
    }

    /* renamed from: b */
    public <T> T mo12861b(C1371e<T> eVar, T t, SharedPreferences sharedPreferences) {
        return m2654a(eVar.mo12851a(), t, (Class) eVar.mo12852b(), sharedPreferences);
    }
}
