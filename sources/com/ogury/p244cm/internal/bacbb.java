package com.ogury.p244cm.internal;

/* renamed from: com.ogury.cm.internal.bacbb */
public final class bacbb {

    /* renamed from: com.ogury.cm.internal.bacbb$aaaaa */
    public static final class aaaaa extends Thread {

        /* renamed from: a */
        final /* synthetic */ bbaaa f20613a;

        aaaaa(bbaaa bbaaa) {
            this.f20613a = bbaaa;
        }

        public final void run() {
            this.f20613a.mo52622a();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Thread m22034a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, bbaaa bbaaa, int i2, Object obj) {
        bbabc.m22051b(bbaaa, "block");
        aaaaa aaaaa2 = new aaaaa(bbaaa);
        aaaaa2.start();
        return aaaaa2;
    }
}
