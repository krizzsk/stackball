package com.fyber.inneractive.sdk.player.p059c.p081l;

import android.os.Handler;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.p059c.p061b.C3224c;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;

/* renamed from: com.fyber.inneractive.sdk.player.c.l.f */
public interface C3571f {
    /* renamed from: a */
    void mo18803a(int i, int i2);

    /* renamed from: com.fyber.inneractive.sdk.player.c.l.f$a */
    public static final class C3572a {

        /* renamed from: a */
        final Handler f9726a;

        /* renamed from: b */
        final C3571f f9727b;

        public C3572a(Handler handler, C3571f fVar) {
            this.f9726a = fVar != null ? (Handler) C3535a.m8781a(handler) : null;
            this.f9727b = fVar;
        }

        /* renamed from: a */
        public final void mo19437a(int i, int i2, int i3, float f) {
            if (this.f9727b != null) {
                final int i4 = i;
                final int i5 = i2;
                final int i6 = i3;
                final float f2 = f;
                this.f9726a.post(new Runnable() {
                    public final void run() {
                        C3572a.this.f9727b.mo18803a(i4, i5);
                    }
                });
            }
        }

        /* renamed from: a */
        public final void mo19438a(final Surface surface) {
            if (this.f9727b != null) {
                this.f9726a.post(new Runnable() {
                    public final void run() {
                    }
                });
            }
        }

        /* renamed from: a */
        public final void mo19439a(final C3224c cVar) {
            if (this.f9727b != null) {
                this.f9726a.post(new Runnable() {
                    public final void run() {
                        cVar.mo18965a();
                    }
                });
            }
        }
    }
}
