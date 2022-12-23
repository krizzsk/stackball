package com.chartboost.sdk;

import com.chartboost.sdk.Banner.C1812a;
import com.chartboost.sdk.Banner.C1813b;
import com.chartboost.sdk.Model.C1844h;
import java.util.HashMap;

/* renamed from: com.chartboost.sdk.b */
public class C1881b {

    /* renamed from: a */
    private HashMap<String, C1812a> f4689a = new HashMap<>();

    /* renamed from: a */
    public void mo14477a(String str, C1812a aVar) {
        this.f4689a.put(str, aVar);
    }

    /* renamed from: b */
    public void mo14480b(String str, String str2) {
        C1813b bVar = this.f4689a.get(str);
        if (bVar != null) {
            bVar.mo14141c(str2);
        }
    }

    /* renamed from: c */
    public void mo14483c(String str, String str2) {
        C1813b bVar = this.f4689a.get(str);
        if (bVar != null) {
            bVar.mo14140b(str2);
        }
    }

    /* renamed from: a */
    public C1812a mo14476a(String str) {
        return this.f4689a.get(str);
    }

    /* renamed from: a */
    public void mo14478a(String str, String str2) {
        C1813b bVar = this.f4689a.get(str);
        if (bVar != null) {
            bVar.mo14137a(str2);
        }
    }

    /* renamed from: b */
    public boolean mo14482b(String str) {
        C1813b bVar = this.f4689a.get(str);
        if (bVar != null) {
            return bVar.mo14139a();
        }
        return false;
    }

    /* renamed from: a */
    public void mo14479a(String str, String str2, String str3) {
        C1813b bVar = this.f4689a.get(str);
        if (bVar != null) {
            bVar.mo14138a(str2, str3);
        }
    }

    /* renamed from: b */
    public boolean mo14481b() {
        C1844h.C1845a a = m4348a();
        if (a != null) {
            return a.mo14323c();
        }
        return true;
    }

    /* renamed from: a */
    private C1844h.C1845a m4348a() {
        C1844h j;
        C2022j b = C2022j.m4955b();
        if (b == null || (j = b.mo14905j()) == null) {
            return null;
        }
        return j.mo14317a();
    }
}
