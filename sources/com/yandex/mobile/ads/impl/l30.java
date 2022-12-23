package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class l30 {

    /* renamed from: a */
    private int f36500a = 1;

    /* renamed from: b */
    private String f36501b;

    /* renamed from: c */
    private List<h21> f36502c = Collections.emptyList();

    /* renamed from: d */
    private Map<String, String> f36503d = Collections.emptyMap();

    /* renamed from: e */
    private String f36504e;

    /* renamed from: f */
    private String f36505f;

    /* renamed from: g */
    private String f36506g;

    /* renamed from: h */
    private String f36507h;

    /* renamed from: a */
    public void mo68314a(List<h21> list) {
        this.f36502c = list;
    }

    /* renamed from: b */
    public String mo68316b() {
        return this.f36507h;
    }

    /* renamed from: c */
    public void mo68319c(String str) {
        this.f36501b = str;
    }

    /* renamed from: d */
    public Map<String, String> mo68320d() {
        return this.f36503d;
    }

    /* renamed from: e */
    public synchronized void mo68323e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f36504e = str;
        }
    }

    /* renamed from: f */
    public List<h21> mo68324f() {
        return this.f36502c;
    }

    /* renamed from: g */
    public int mo68325g() {
        return this.f36500a;
    }

    /* renamed from: h */
    public synchronized String mo68326h() {
        return this.f36504e;
    }

    /* renamed from: a */
    public void mo68315a(Map<String, String> map) {
        this.f36503d = map;
    }

    /* renamed from: b */
    public void mo68317b(String str) {
        this.f36507h = str;
    }

    /* renamed from: c */
    public String mo68318c() {
        return this.f36501b;
    }

    /* renamed from: d */
    public void mo68321d(String str) {
        this.f36505f = str;
    }

    /* renamed from: a */
    public String mo68311a() {
        return this.f36506g;
    }

    /* renamed from: e */
    public String mo68322e() {
        return this.f36505f;
    }

    /* renamed from: a */
    public void mo68313a(String str) {
        this.f36506g = str;
    }

    /* renamed from: a */
    public void mo68312a(int i) {
        this.f36500a = i;
    }
}
