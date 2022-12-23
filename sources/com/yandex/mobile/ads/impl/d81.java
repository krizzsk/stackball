package com.yandex.mobile.ads.impl;

public class d81 {

    /* renamed from: a */
    private String f32490a;

    /* renamed from: b */
    private Long f32491b;

    /* renamed from: c */
    private boolean f32492c;

    /* renamed from: a */
    public void mo66528a(String str) {
        this.f32490a = str;
    }

    /* renamed from: b */
    public String mo66530b() {
        return this.f32490a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d81.class != obj.getClass()) {
            return false;
        }
        d81 d81 = (d81) obj;
        if (this.f32492c != d81.f32492c) {
            return false;
        }
        String str = this.f32490a;
        if (str == null ? d81.f32490a != null : !str.equals(d81.f32490a)) {
            return false;
        }
        Long l = this.f32491b;
        if (l != null) {
            return l.equals(d81.f32491b);
        }
        if (d81.f32491b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f32490a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.f32491b;
        if (l != null) {
            i = l.hashCode();
        }
        return ((hashCode + i) * 31) + (this.f32492c ? 1 : 0);
    }

    /* renamed from: a */
    public void mo66529a(boolean z) {
        this.f32492c = z;
    }

    /* renamed from: a */
    public Long mo66526a() {
        return this.f32491b;
    }

    /* renamed from: a */
    public void mo66527a(Long l) {
        this.f32491b = l;
    }
}
