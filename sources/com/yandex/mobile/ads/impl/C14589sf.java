package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C15497h0;

/* renamed from: com.yandex.mobile.ads.impl.sf */
public class C14589sf {

    /* renamed from: a */
    private final String f39948a;

    /* renamed from: b */
    private final C15497h0.C15498a f39949b;

    public C14589sf(C15497h0.C15498a aVar, String str) {
        this.f39949b = aVar;
        this.f39948a = str;
    }

    /* renamed from: a */
    public String mo69962a() {
        return this.f39948a;
    }

    /* renamed from: b */
    public C15497h0.C15498a mo69963b() {
        return this.f39949b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14589sf.class != obj.getClass()) {
            return false;
        }
        C14589sf sfVar = (C14589sf) obj;
        String str = this.f39948a;
        if (str == null ? sfVar.f39948a != null : !str.equals(sfVar.f39948a)) {
            return false;
        }
        if (this.f39949b == sfVar.f39949b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f39948a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C15497h0.C15498a aVar = this.f39949b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }
}
