package com.mbridge.msdk.foundation.same.p167b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.a */
/* compiled from: Directory */
public final class C6209a {

    /* renamed from: a */
    private C6211c f15429a;

    /* renamed from: b */
    private String f15430b;

    /* renamed from: c */
    private C6209a f15431c;

    /* renamed from: d */
    private List<C6209a> f15432d;

    /* renamed from: a */
    public final C6211c mo43772a() {
        return this.f15429a;
    }

    /* renamed from: a */
    public final void mo43773a(C6211c cVar) {
        this.f15429a = cVar;
    }

    /* renamed from: b */
    public final String mo43777b() {
        return this.f15430b;
    }

    /* renamed from: a */
    public final void mo43775a(String str) {
        this.f15430b = str;
    }

    /* renamed from: c */
    public final C6209a mo43778c() {
        return this.f15431c;
    }

    /* renamed from: d */
    public final List<C6209a> mo43779d() {
        return this.f15432d;
    }

    /* renamed from: a */
    private void m15708a(C6209a aVar) {
        if (this.f15432d == null) {
            this.f15432d = new ArrayList();
        }
        aVar.f15431c = this;
        this.f15432d.add(aVar);
    }

    /* renamed from: a */
    public final void mo43774a(C6211c cVar, String str) {
        C6209a aVar = new C6209a();
        aVar.f15429a = cVar;
        aVar.f15430b = str;
        m15708a(aVar);
    }

    /* renamed from: a */
    public final void mo43776a(List<C6209a> list) {
        if (list != null && list.size() != 0) {
            for (C6209a a : list) {
                m15708a(a);
            }
        }
    }
}
