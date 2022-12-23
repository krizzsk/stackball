package com.p243my.target;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.n2 */
public final class C7560n2 {

    /* renamed from: a */
    public final String f19074a;

    /* renamed from: b */
    public final String f19075b;

    /* renamed from: c */
    public final String f19076c;

    /* renamed from: d */
    public final C7343c3 f19077d = C7343c3.m18845f();

    /* renamed from: e */
    public final HashMap<String, String> f19078e = new HashMap<>();

    /* renamed from: f */
    public String f19079f;

    /* renamed from: g */
    public C7618q2 f19080g;

    /* renamed from: h */
    public int f19081h = 10000;

    /* renamed from: i */
    public float f19082i = 0.0f;

    public C7560n2(String str, String str2, String str3) {
        this.f19074a = str;
        this.f19075b = str2;
        this.f19076c = str3;
    }

    /* renamed from: a */
    public static C7560n2 m19906a(String str, String str2, String str3) {
        return new C7560n2(str, str2, str3);
    }

    /* renamed from: a */
    public String mo50960a() {
        return this.f19076c;
    }

    /* renamed from: a */
    public void mo50961a(float f) {
        this.f19082i = f;
    }

    /* renamed from: a */
    public void mo50962a(int i) {
        this.f19081h = i;
    }

    /* renamed from: a */
    public void mo50963a(C7618q2 q2Var) {
        this.f19080g = q2Var;
    }

    /* renamed from: a */
    public void mo50964a(String str) {
        this.f19079f = str;
    }

    /* renamed from: a */
    public void mo50965a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str2 == null) {
                this.f19078e.remove(str);
            } else {
                this.f19078e.put(str, str2);
            }
        }
    }

    /* renamed from: b */
    public String mo50966b() {
        return this.f19074a;
    }

    /* renamed from: c */
    public Map<String, String> mo50967c() {
        return new HashMap(this.f19078e);
    }

    /* renamed from: d */
    public String mo50968d() {
        return this.f19079f;
    }

    /* renamed from: e */
    public String mo50969e() {
        return this.f19075b;
    }

    /* renamed from: f */
    public float mo50970f() {
        return this.f19082i;
    }

    /* renamed from: g */
    public C7618q2 mo50971g() {
        return this.f19080g;
    }

    /* renamed from: h */
    public C7343c3 mo50972h() {
        return this.f19077d;
    }

    /* renamed from: i */
    public int mo50973i() {
        return this.f19081h;
    }
}
