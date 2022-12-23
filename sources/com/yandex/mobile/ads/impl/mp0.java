package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

public class mp0 extends C14374qb {

    /* renamed from: b */
    final ap0 f37455b;

    /* renamed from: com.yandex.mobile.ads.impl.mp0$a */
    static class C14000a implements jp0 {

        /* renamed from: a */
        private final WeakReference<jb0> f37456a;

        C14000a(jb0 jb0) {
            this.f37456a = new WeakReference<>(jb0);
        }

        /* renamed from: a */
        public void mo68074a(String str) {
            jb0 jb0 = (jb0) this.f37456a.get();
            if (jb0 != null) {
                jb0.mo66857a(str);
            }
        }

        public void onAdLoaded() {
            jb0 jb0 = (jb0) this.f37456a.get();
            if (jb0 != null) {
                jb0.onAdLoaded();
            }
        }
    }

    public mp0(cy0 cy0, jb0 jb0) {
        super(cy0);
        ap0 ap0 = new ap0(cy0);
        this.f37455b = ap0;
        ap0.mo65834a((jp0) new C14000a(jb0));
    }

    /* renamed from: a */
    public void mo66543a(String str) {
        this.f37455b.mo65837a(str);
    }

    /* renamed from: c */
    public void mo66544c() {
        super.mo66544c();
        this.f37455b.mo65841c();
    }

    /* renamed from: a */
    public void mo68845a(jb0 jb0) {
        super.mo68845a((jb0) new ep0(this.f37455b, jb0));
    }
}
