package com.yandex.mobile.ads.impl;

import android.view.TextureView;

public class um1 {

    /* renamed from: a */
    private final ru0 f40799a;

    /* renamed from: b */
    private final j11 f40800b;

    /* renamed from: com.yandex.mobile.ads.impl.um1$a */
    private static final class C14770a implements Runnable {

        /* renamed from: b */
        private final pu0 f40801b;

        /* renamed from: c */
        private final ru0 f40802c;

        C14770a(pu0 pu0, ru0 ru0) {
            this.f40801b = pu0;
            this.f40802c = ru0;
        }

        public void run() {
            this.f40802c.mo69824a(this.f40801b.mo69436a().mo69647a());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.um1$b */
    private static final class C14771b implements Runnable {

        /* renamed from: b */
        private final pu0 f40803b;

        /* renamed from: c */
        private final j11 f40804c;

        C14771b(pu0 pu0, j11 j11) {
            this.f40803b = pu0;
            this.f40804c = j11;
        }

        public void run() {
            mm1 b = this.f40803b.mo69437b();
            this.f40804c.getClass();
            b.mo68841a().setVisibility(8);
            this.f40803b.mo69438c().setVisibility(0);
        }
    }

    public um1(ru0 ru0, j11 j11) {
        this.f40799a = ru0;
        this.f40800b = j11;
    }

    /* renamed from: a */
    public void mo70375a(pu0 pu0) {
        TextureView c = pu0.mo69438c();
        c.setAlpha(0.0f);
        c.animate().setDuration(500).alpha(1.0f).withStartAction(new C14771b(pu0, this.f40800b)).withEndAction(new C14770a(pu0, this.f40799a)).start();
    }
}
