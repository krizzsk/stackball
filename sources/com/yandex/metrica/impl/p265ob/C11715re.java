package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.re */
public abstract class C11715re {

    /* renamed from: e */
    private static final C11984ye f28083e = new C11984ye("UNDEFINED_", (String) null);

    /* renamed from: a */
    protected final String f28084a;

    /* renamed from: b */
    protected final SharedPreferences f28085b;

    /* renamed from: c */
    private final Map<String, Object> f28086c = new HashMap();

    /* renamed from: d */
    private boolean f28087d = false;

    public C11715re(Context context, String str) {
        this.f28084a = str;
        this.f28085b = m30199a(context);
        new C11984ye(f28083e.mo64147b(), str);
    }

    /* renamed from: a */
    private SharedPreferences m30199a(Context context) {
        return C11327i.m29165a(context, mo63538d());
    }

    /* renamed from: b */
    public void mo63599b() {
        synchronized (this) {
            m30200a();
            this.f28086c.clear();
            this.f28087d = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo63600c() {
        return this.f28084a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo63538d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public <T extends C11715re> T mo63601e() {
        synchronized (this) {
            this.f28087d = true;
            this.f28086c.clear();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C11715re> T mo63598a(String str, Object obj) {
        synchronized (this) {
            if (obj != null) {
                this.f28086c.put(str, obj);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C11715re> T mo63597a(String str) {
        synchronized (this) {
            this.f28086c.put(str, this);
        }
        return this;
    }

    /* renamed from: a */
    private void m30200a() {
        SharedPreferences.Editor edit = this.f28085b.edit();
        if (this.f28087d) {
            edit.clear();
            edit.apply();
            return;
        }
        for (Map.Entry next : this.f28086c.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value == this) {
                edit.remove(str);
            } else if (value instanceof String) {
                edit.putString(str, (String) value);
            } else if (value instanceof Long) {
                edit.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Integer) {
                edit.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value != null) {
                throw new UnsupportedOperationException();
            }
        }
        edit.apply();
    }
}
