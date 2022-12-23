package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.ko */
class C11474ko extends C11168do<C10977Z2> {
    C11474ko(C11509lo loVar, C10977Z2 z2) {
        super(z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo62555a(C11168do<C10977Z2> doVar) {
        C10977Z2 z2 = (C10977Z2) this.f26753a;
        if (z2.f26380a == null ? ((C10977Z2) doVar.f26753a).f26380a != null : !z2.f26380a.equals(((C10977Z2) doVar.f26753a).f26380a)) {
            return false;
        }
        C10977Z2 z22 = (C10977Z2) this.f26753a;
        if (z22.f26381b != null) {
            return z22.f26381b.equals(((C10977Z2) doVar.f26753a).f26381b);
        }
        if (((C10977Z2) doVar.f26753a).f26381b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        C10977Z2 z2 = (C10977Z2) this.f26753a;
        int i = 0;
        int hashCode = (z2.f26380a != null ? z2.f26380a.hashCode() : 0) * 31;
        C10977Z2 z22 = (C10977Z2) this.f26753a;
        if (z22.f26381b != null) {
            i = z22.f26381b.hashCode();
        }
        return hashCode + i;
    }
}
