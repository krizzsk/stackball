package com.ogury.p244cm.internal;

import com.ogury.p244cm.internal.bbacb;

/* renamed from: com.ogury.cm.internal.abacb */
public final class abacb<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public bbaaa<? extends T> f20401a;

    /* renamed from: com.ogury.cm.internal.abacb$aaaaa */
    static final class aaaaa extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ abacb f20402a;

        /* renamed from: b */
        final /* synthetic */ bbaab f20403b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(abacb abacb, bbaab bbaab) {
            super(0);
            this.f20402a = abacb;
            this.f20403b = bbaab;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            final bbacb.aaaab aaaab = new bbacb.aaaab();
            aaaab.f20619a = this.f20402a.f20401a.mo52622a();
            abbac abbac = abbac.f20408a;
            abbac.m21817b().mo52670a(new bbaaa<babcc>(this) {

                /* renamed from: a */
                final /* synthetic */ aaaaa f20404a;

                {
                    this.f20404a = r1;
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Object mo52622a() {
                    this.f20404a.f20403b.mo52626a(aaaab.f20619a);
                    return babcc.f20603a;
                }
            });
            return babcc.f20603a;
        }
    }

    public abacb(bbaaa<? extends T> bbaaa) {
        bbabc.m22051b(bbaaa, "action");
        this.f20401a = bbaaa;
    }

    /* renamed from: a */
    public final void mo52672a(bbaab<? super T, babcc> bbaab) {
        bbabc.m22051b(bbaab, "callback");
        abbac abbac = abbac.f20408a;
        abbac.m21816a().mo52670a(new aaaaa(this, bbaab));
    }
}
