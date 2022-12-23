package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Yn */
public class C10972Yn extends C11168do<C10859Vj> {

    /* renamed from: com.yandex.metrica.impl.ob.Yn$a */
    public static class C10973a implements C11219eo<C10859Vj> {
        /* renamed from: a */
        public C11168do mo62557a(Object obj) {
            return new C10972Yn((C10859Vj) obj);
        }
    }

    public C10972Yn(C10859Vj vj) {
        super(vj);
    }

    /* renamed from: a */
    public boolean mo62555a(C11168do<C10859Vj> doVar) {
        T t = (C10859Vj) doVar.f26753a;
        T t2 = this.f26753a;
        if (t2 == t) {
            return true;
        }
        if (((C10859Vj) t2).mo62399c() != t.mo62399c()) {
            return false;
        }
        if (((C10859Vj) this.f26753a).mo62407k() == null ? t.mo62407k() != null : !((C10859Vj) this.f26753a).mo62407k().equals(t.mo62407k())) {
            return false;
        }
        if (((C10859Vj) this.f26753a).mo62408l() == null ? t.mo62408l() != null : !((C10859Vj) this.f26753a).mo62408l().equals(t.mo62408l())) {
            return false;
        }
        if (((C10859Vj) this.f26753a).mo62401e() == null ? t.mo62401e() != null : !((C10859Vj) this.f26753a).mo62401e().equals(t.mo62401e())) {
            return false;
        }
        if (((C10859Vj) this.f26753a).mo62398b() == null ? t.mo62398b() != null : !((C10859Vj) this.f26753a).mo62398b().equals(t.mo62398b())) {
            return false;
        }
        if (((C10859Vj) this.f26753a).mo62409m() == null ? t.mo62409m() != null : !((C10859Vj) this.f26753a).mo62409m().equals(t.mo62409m())) {
            return false;
        }
        if (((C10859Vj) this.f26753a).mo62411o() != null) {
            return ((C10859Vj) this.f26753a).mo62411o().equals(t.mo62411o());
        }
        if (t.mo62411o() == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((C10859Vj) this.f26753a).mo62407k() != null ? ((C10859Vj) this.f26753a).mo62407k().hashCode() : 0) * 31) + (((C10859Vj) this.f26753a).mo62408l() != null ? ((C10859Vj) this.f26753a).mo62408l().hashCode() : 0)) * 31) + (((C10859Vj) this.f26753a).mo62401e() != null ? ((C10859Vj) this.f26753a).mo62401e().hashCode() : 0)) * 31) + (((C10859Vj) this.f26753a).mo62398b() != null ? ((C10859Vj) this.f26753a).mo62398b().hashCode() : 0)) * 31) + (((C10859Vj) this.f26753a).mo62409m() != null ? ((C10859Vj) this.f26753a).mo62409m().hashCode() : 0)) * 31) + ((C10859Vj) this.f26753a).mo62399c()) * 31;
        if (((C10859Vj) this.f26753a).mo62411o() != null) {
            i = ((C10859Vj) this.f26753a).mo62411o().hashCode();
        }
        return hashCode + i;
    }
}
