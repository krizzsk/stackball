package com.chartboost.sdk.Tracking;

import android.content.SharedPreferences;
import com.chartboost.sdk.Libraries.C1822c;
import java.util.UUID;

/* renamed from: com.chartboost.sdk.Tracking.g */
public class C1876g {

    /* renamed from: a */
    private SharedPreferences f4664a;

    /* renamed from: b */
    private String f4665b;

    /* renamed from: c */
    private long f4666c = 0;

    /* renamed from: d */
    private int f4667d = 0;

    /* renamed from: e */
    private int f4668e = 0;

    /* renamed from: f */
    private int f4669f = 0;

    /* renamed from: g */
    private int f4670g = 0;

    public C1876g(SharedPreferences sharedPreferences) {
        this.f4664a = sharedPreferences;
        this.f4667d = m4317f();
    }

    /* renamed from: f */
    private int m4317f() {
        SharedPreferences sharedPreferences = this.f4664a;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("session_key", 0);
        }
        return -1;
    }

    /* renamed from: g */
    private void m4318g() {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f4664a;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putInt("session_key", this.f4667d).apply();
        }
    }

    /* renamed from: a */
    public void mo14446a() {
        this.f4665b = m4316b();
        this.f4666c = System.currentTimeMillis();
        this.f4668e = 0;
        this.f4669f = 0;
        this.f4670g = 0;
        this.f4667d++;
        m4318g();
    }

    /* renamed from: b */
    public int mo14448b(int i) {
        if (i == 0) {
            return this.f4668e;
        }
        if (i == 1) {
            return this.f4669f;
        }
        if (i != 3) {
            return 0;
        }
        return this.f4670g;
    }

    /* renamed from: c */
    public int mo14449c() {
        return this.f4667d;
    }

    /* renamed from: d */
    public long mo14450d() {
        return System.currentTimeMillis() - this.f4666c;
    }

    /* renamed from: e */
    public String mo14451e() {
        return this.f4665b;
    }

    /* renamed from: b */
    private String m4316b() {
        String uuid = UUID.randomUUID().toString();
        String a = C1822c.m4015a(uuid);
        return a != null ? a : uuid;
    }

    /* renamed from: a */
    public void mo14447a(int i) {
        if (i == 0) {
            this.f4668e++;
        } else if (i == 1) {
            this.f4669f++;
        } else if (i == 3) {
            this.f4670g++;
        }
    }
}
