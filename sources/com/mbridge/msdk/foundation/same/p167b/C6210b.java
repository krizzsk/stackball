package com.mbridge.msdk.foundation.same.p167b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.b */
/* compiled from: DirectoryContext */
public abstract class C6210b {

    /* renamed from: a */
    protected C6209a f15433a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<C6209a> mo43782b();

    public C6210b(String str) {
        C6209a aVar = new C6209a();
        aVar.mo43775a(str);
        aVar.mo43773a(C6211c.AD_ROOT);
        List<C6209a> b = mo43782b();
        if (b != null && b.size() > 0) {
            aVar.mo43776a(b);
        }
        this.f15433a = aVar;
    }

    /* renamed from: a */
    public final C6209a mo43780a() {
        return this.f15433a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C6209a mo43781a(ArrayList<C6209a> arrayList, C6211c cVar, String str) {
        C6209a aVar = new C6209a();
        aVar.mo43773a(cVar);
        aVar.mo43775a(str);
        arrayList.add(aVar);
        return aVar;
    }
}
