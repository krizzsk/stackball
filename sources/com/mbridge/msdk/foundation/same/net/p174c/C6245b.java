package com.mbridge.msdk.foundation.same.net.p174c;

import android.text.TextUtils;

/* renamed from: com.mbridge.msdk.foundation.same.net.c.b */
/* compiled from: Header */
public final class C6245b {

    /* renamed from: a */
    private final String f15496a;

    /* renamed from: b */
    private final String f15497b;

    public C6245b(String str, String str2) {
        this.f15496a = str;
        this.f15497b = str2;
    }

    /* renamed from: a */
    public final String mo43825a() {
        return this.f15496a;
    }

    /* renamed from: b */
    public final String mo43826b() {
        return this.f15497b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6245b bVar = (C6245b) obj;
        if (!TextUtils.equals(this.f15496a, bVar.f15496a) || !TextUtils.equals(this.f15497b, bVar.f15497b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f15496a.hashCode() * 31) + this.f15497b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f15496a + ",value=" + this.f15497b + "]";
    }
}
