package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;

public class ej0 {

    /* renamed from: a */
    private final List<C13370i> f32987a;

    /* renamed from: b */
    private final FalseClick f32988b;

    /* renamed from: c */
    private final String f32989c;

    /* renamed from: d */
    private final String f32990d;

    public ej0(List<C13370i> list, FalseClick falseClick, String str, String str2) {
        this.f32987a = list;
        this.f32988b = falseClick;
        this.f32989c = str;
        this.f32990d = str2;
    }

    /* renamed from: a */
    public List<C13370i> mo66834a() {
        return this.f32987a;
    }

    /* renamed from: b */
    public FalseClick mo66835b() {
        return this.f32988b;
    }

    /* renamed from: c */
    public String mo66836c() {
        return this.f32989c;
    }

    /* renamed from: d */
    public String mo66837d() {
        return this.f32990d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ej0.class != obj.getClass()) {
            return false;
        }
        ej0 ej0 = (ej0) obj;
        List<C13370i> list = this.f32987a;
        if (list == null ? ej0.f32987a != null : !list.equals(ej0.f32987a)) {
            return false;
        }
        FalseClick falseClick = this.f32988b;
        if (falseClick == null ? ej0.f32988b != null : !falseClick.equals(ej0.f32988b)) {
            return false;
        }
        String str = this.f32989c;
        if (str == null ? ej0.f32989c != null : !str.equals(ej0.f32989c)) {
            return false;
        }
        String str2 = this.f32990d;
        String str3 = ej0.f32990d;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        List<C13370i> list = this.f32987a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        FalseClick falseClick = this.f32988b;
        int hashCode2 = (hashCode + (falseClick != null ? falseClick.hashCode() : 0)) * 31;
        String str = this.f32989c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f32990d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }
}
