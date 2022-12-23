package com.yandex.mobile.ads.exo.video;

import android.os.Handler;
import android.view.Surface;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.video.C12344d;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C14283pj;
import com.yandex.mobile.ads.impl.ih1;

/* renamed from: com.yandex.mobile.ads.exo.video.d */
public interface C12344d {

    /* renamed from: com.yandex.mobile.ads.exo.video.d$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(C12344d dVar, int i, long j) {
        }

        public static void $default$a(C12344d dVar, Surface surface) {
        }

        public static void $default$b(C12344d dVar, Format format) {
        }

        public static void $default$b(C12344d dVar, C14283pj pjVar) {
        }

        public static void $default$b(C12344d dVar, String str, long j, long j2) {
        }

        public static void $default$d(C12344d dVar, C14283pj pjVar) {
        }

        public static void $default$onVideoSizeChanged(C12344d dVar, int i, int i2, int i3, float f) {
        }
    }

    /* renamed from: a */
    void mo65163a(int i, long j);

    /* renamed from: a */
    void mo65165a(Surface surface);

    /* renamed from: b */
    void mo65170b(Format format);

    /* renamed from: b */
    void mo65171b(C14283pj pjVar);

    /* renamed from: b */
    void mo65172b(String str, long j, long j2);

    /* renamed from: d */
    void mo65174d(C14283pj pjVar);

    void onVideoSizeChanged(int i, int i2, int i3, float f);

    /* renamed from: com.yandex.mobile.ads.exo.video.d$a */
    public static final class C12345a {

        /* renamed from: a */
        private final Handler f30380a;

        /* renamed from: b */
        private final C12344d f30381b;

        public C12345a(Handler handler, C12344d dVar) {
            this.f30380a = dVar != null ? (Handler) C13479j9.m37703a(handler) : null;
            this.f30381b = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m32558c(C14283pj pjVar) {
            synchronized (pjVar) {
            }
            C12344d dVar = this.f30381b;
            int i = ih1.f34858a;
            dVar.mo65171b(pjVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m32559d(C14283pj pjVar) {
            C12344d dVar = this.f30381b;
            int i = ih1.f34858a;
            dVar.mo65174d(pjVar);
        }

        /* renamed from: a */
        public void mo65453a(String str, long j, long j2) {
            Handler handler = this.f30380a;
            if (handler != null) {
                handler.post(new Runnable(str, j, j2) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ long f$2;
                    public final /* synthetic */ long f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r5;
                    }

                    public final void run() {
                        C12344d.C12345a.this.m32557b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo65456b(C14283pj pjVar) {
            Handler handler = this.f30380a;
            if (handler != null) {
                handler.post(new Runnable(pjVar) {
                    public final /* synthetic */ C14283pj f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C12344d.C12345a.this.m32559d(this.f$1);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m32557b(String str, long j, long j2) {
            C12344d dVar = this.f30381b;
            int i = ih1.f34858a;
            dVar.mo65172b(str, j, j2);
        }

        /* renamed from: a */
        public void mo65451a(Format format) {
            Handler handler = this.f30380a;
            if (handler != null) {
                handler.post(new Runnable(format) {
                    public final /* synthetic */ Format f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C12344d.C12345a.this.m32556b(this.f$1);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m32556b(Format format) {
            C12344d dVar = this.f30381b;
            int i = ih1.f34858a;
            dVar.mo65170b(format);
        }

        /* renamed from: a */
        public void mo65450a(int i, long j) {
            Handler handler = this.f30380a;
            if (handler != null) {
                handler.post(new Runnable(i, j) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ long f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C12344d.C12345a.this.m32555b(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m32555b(int i, long j) {
            C12344d dVar = this.f30381b;
            int i2 = ih1.f34858a;
            dVar.mo65163a(i, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m32553a(int i, int i2, int i3, float f) {
            C12344d dVar = this.f30381b;
            int i4 = ih1.f34858a;
            dVar.onVideoSizeChanged(i, i2, i3, f);
        }

        /* renamed from: b */
        public void mo65454b(int i, int i2, int i3, float f) {
            Handler handler = this.f30380a;
            if (handler != null) {
                handler.post(new Runnable(i, i2, i3, f) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ int f$2;
                    public final /* synthetic */ int f$3;
                    public final /* synthetic */ float f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    public final void run() {
                        C12344d.C12345a.this.m32553a(this.f$1, this.f$2, this.f$3, this.f$4);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m32554a(Surface surface) {
            C12344d dVar = this.f30381b;
            int i = ih1.f34858a;
            dVar.mo65165a(surface);
        }

        /* renamed from: b */
        public void mo65455b(Surface surface) {
            Handler handler = this.f30380a;
            if (handler != null) {
                handler.post(new Runnable(surface) {
                    public final /* synthetic */ Surface f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C12344d.C12345a.this.m32554a(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo65452a(C14283pj pjVar) {
            synchronized (pjVar) {
            }
            Handler handler = this.f30380a;
            if (handler != null) {
                handler.post(new Runnable(pjVar) {
                    public final /* synthetic */ C14283pj f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C12344d.C12345a.this.m32558c(this.f$1);
                    }
                });
            }
        }
    }
}
