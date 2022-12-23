package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class hq1 {

    /* renamed from: a */
    private String f34519a;

    /* renamed from: b */
    private String f34520b;

    /* renamed from: c */
    private List<String> f34521c;

    /* renamed from: d */
    private String f34522d;

    /* renamed from: e */
    private String f34523e;

    /* renamed from: f */
    private int f34524f;

    /* renamed from: g */
    private boolean f34525g;

    /* renamed from: h */
    private int f34526h;

    /* renamed from: i */
    private boolean f34527i;

    /* renamed from: j */
    private int f34528j;

    /* renamed from: k */
    private int f34529k;

    /* renamed from: l */
    private int f34530l;

    /* renamed from: m */
    private int f34531m;

    /* renamed from: n */
    private int f34532n;

    public hq1() {
        mo67611j();
    }

    /* renamed from: a */
    public void mo67596a(String[] strArr) {
        this.f34521c = Arrays.asList(strArr);
    }

    /* renamed from: b */
    public void mo67600b(String str) {
        this.f34519a = str;
    }

    /* renamed from: c */
    public void mo67603c(String str) {
        this.f34520b = str;
    }

    /* renamed from: d */
    public void mo67605d(String str) {
        this.f34522d = str;
    }

    /* renamed from: e */
    public int mo67606e() {
        int i = this.f34530l;
        if (i == -1 && this.f34531m == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f34531m == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    /* renamed from: f */
    public boolean mo67607f() {
        return this.f34527i;
    }

    /* renamed from: g */
    public boolean mo67608g() {
        return this.f34525g;
    }

    /* renamed from: h */
    public boolean mo67609h() {
        return this.f34528j == 1;
    }

    /* renamed from: i */
    public boolean mo67610i() {
        return this.f34529k == 1;
    }

    @EnsuresNonNull({"targetId", "targetTag", "targetClasses", "targetVoice"})
    /* renamed from: j */
    public void mo67611j() {
        this.f34519a = "";
        this.f34520b = "";
        this.f34521c = Collections.emptyList();
        this.f34522d = "";
        this.f34523e = null;
        this.f34525g = false;
        this.f34527i = false;
        this.f34528j = -1;
        this.f34529k = -1;
        this.f34530l = -1;
        this.f34531m = -1;
        this.f34532n = -1;
    }

    /* renamed from: a */
    public int mo67592a(String str, String str2, String[] strArr, String str3) {
        if (this.f34519a.isEmpty() && this.f34520b.isEmpty() && this.f34521c.isEmpty() && this.f34522d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a = m37046a(m37046a(m37046a(0, this.f34519a, str, 1073741824), this.f34520b, str2, 2), this.f34522d, str3, 4);
        if (a == -1 || !Arrays.asList(strArr).containsAll(this.f34521c)) {
            return 0;
        }
        return a + (this.f34521c.size() * 4);
    }

    /* renamed from: b */
    public hq1 mo67599b(boolean z) {
        this.f34531m = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public hq1 mo67601c(boolean z) {
        this.f34529k = z ? 1 : 0;
        return this;
    }

    /* renamed from: d */
    public int mo67604d() {
        return this.f34532n;
    }

    /* renamed from: b */
    public int mo67597b() {
        if (this.f34525g) {
            return this.f34524f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: c */
    public String mo67602c() {
        return this.f34523e;
    }

    /* renamed from: b */
    public hq1 mo67598b(int i) {
        this.f34524f = i;
        this.f34525g = true;
        return this;
    }

    /* renamed from: a */
    public hq1 mo67595a(boolean z) {
        this.f34530l = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public hq1 mo67594a(String str) {
        this.f34523e = ih1.m37399e(str);
        return this;
    }

    /* renamed from: a */
    public int mo67591a() {
        if (this.f34527i) {
            return this.f34526h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: a */
    public hq1 mo67593a(int i) {
        this.f34526h = i;
        this.f34527i = true;
        return this;
    }

    /* renamed from: a */
    private static int m37046a(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
