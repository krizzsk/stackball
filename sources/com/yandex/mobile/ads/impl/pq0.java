package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.nativeads.C15511m0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class pq0 {

    /* renamed from: a */
    private ej0 f38795a;

    /* renamed from: b */
    private C15511m0 f38796b;

    /* renamed from: c */
    private List<C13690k9> f38797c;

    /* renamed from: d */
    private String f38798d;

    /* renamed from: e */
    private AdImpressionData f38799e;

    /* renamed from: f */
    private String f38800f;

    /* renamed from: g */
    private y60 f38801g;

    /* renamed from: h */
    private y60 f38802h;

    /* renamed from: i */
    private final Set<String> f38803i = new HashSet();

    /* renamed from: j */
    private final Set<k81> f38804j = new HashSet();

    /* renamed from: a */
    public void mo69401a(ej0 ej0) {
        this.f38795a = ej0;
    }

    /* renamed from: b */
    public List<C13690k9> mo69407b() {
        return this.f38797c;
    }

    /* renamed from: c */
    public void mo69412c(List<C13690k9> list) {
        this.f38797c = list;
    }

    /* renamed from: d */
    public void mo69414d(String str) {
        C15511m0 m0Var;
        C15511m0[] values = C15511m0.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                m0Var = null;
                break;
            }
            m0Var = values[i];
            if (m0Var.mo71709a().equals(str)) {
                break;
            }
            i++;
        }
        this.f38796b = m0Var;
    }

    /* renamed from: e */
    public ej0 mo69415e() {
        return this.f38795a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pq0.class != obj.getClass()) {
            return false;
        }
        pq0 pq0 = (pq0) obj;
        ej0 ej0 = this.f38795a;
        if (ej0 == null ? pq0.f38795a != null : !ej0.equals(pq0.f38795a)) {
            return false;
        }
        if (this.f38796b != pq0.f38796b) {
            return false;
        }
        List<C13690k9> list = this.f38797c;
        if (list == null ? pq0.f38797c != null : !list.equals(pq0.f38797c)) {
            return false;
        }
        String str = this.f38798d;
        if (str == null ? pq0.f38798d != null : !str.equals(pq0.f38798d)) {
            return false;
        }
        AdImpressionData adImpressionData = this.f38799e;
        if (adImpressionData == null ? pq0.f38799e != null : !adImpressionData.equals(pq0.f38799e)) {
            return false;
        }
        String str2 = this.f38800f;
        if (str2 == null ? pq0.f38800f != null : !str2.equals(pq0.f38800f)) {
            return false;
        }
        y60 y60 = this.f38801g;
        if (y60 == null ? pq0.f38801g != null : !y60.equals(pq0.f38801g)) {
            return false;
        }
        y60 y602 = this.f38802h;
        if (y602 == null ? pq0.f38802h != null : !y602.equals(pq0.f38802h)) {
            return false;
        }
        if (!this.f38803i.equals(pq0.f38803i)) {
            return false;
        }
        return this.f38804j.equals(pq0.f38804j);
    }

    /* renamed from: f */
    public List<String> mo69418f() {
        return new ArrayList(this.f38803i);
    }

    /* renamed from: g */
    public C15511m0 mo69419g() {
        return this.f38796b;
    }

    /* renamed from: h */
    public List<k81> mo69420h() {
        return new ArrayList(this.f38804j);
    }

    public int hashCode() {
        ej0 ej0 = this.f38795a;
        int i = 0;
        int hashCode = (ej0 != null ? ej0.hashCode() : 0) * 31;
        C15511m0 m0Var = this.f38796b;
        int hashCode2 = (hashCode + (m0Var != null ? m0Var.hashCode() : 0)) * 31;
        List<C13690k9> list = this.f38797c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f38798d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        AdImpressionData adImpressionData = this.f38799e;
        int hashCode5 = (hashCode4 + (adImpressionData != null ? adImpressionData.hashCode() : 0)) * 31;
        String str2 = this.f38800f;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        y60 y60 = this.f38801g;
        int hashCode7 = (hashCode6 + (y60 != null ? y60.hashCode() : 0)) * 31;
        y60 y602 = this.f38802h;
        if (y602 != null) {
            i = y602.hashCode();
        }
        return ((((hashCode7 + i) * 31) + this.f38803i.hashCode()) * 31) + this.f38804j.hashCode();
    }

    /* renamed from: a */
    public void mo69402a(k81 k81) {
        this.f38804j.add(k81);
    }

    /* renamed from: b */
    public C13690k9 mo69406b(String str) {
        List<C13690k9> list = this.f38797c;
        if (list == null) {
            return null;
        }
        for (C13690k9 next : list) {
            if (next.mo68167b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo69411c(String str) {
        this.f38798d = str;
    }

    /* renamed from: e */
    public void mo69416e(String str) {
        this.f38800f = str;
    }

    /* renamed from: a */
    public void mo69404a(String str) {
        this.f38803i.add(str);
    }

    /* renamed from: c */
    public AdImpressionData mo69410c() {
        return this.f38799e;
    }

    /* renamed from: a */
    public void mo69405a(List<String> list) {
        this.f38803i.addAll(list);
    }

    /* renamed from: d */
    public String mo69413d() {
        return this.f38800f;
    }

    /* renamed from: a */
    public void mo69400a(AdImpressionData adImpressionData) {
        this.f38799e = adImpressionData;
    }

    /* renamed from: b */
    public void mo69409b(List<k81> list) {
        this.f38804j.addAll(list);
    }

    /* renamed from: a */
    public String mo69399a() {
        return this.f38798d;
    }

    /* renamed from: b */
    public void mo69408b(y60 y60) {
        this.f38802h = y60;
    }

    /* renamed from: a */
    public void mo69403a(y60 y60) {
        this.f38801g = y60;
    }
}
