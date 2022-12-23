package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.impl.C13296ha;

/* renamed from: com.yandex.mobile.ads.impl.ha */
public interface C13296ha {

    /* renamed from: com.yandex.mobile.ads.impl.ha$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(C13296ha haVar, int i) {
        }

        public static void $default$a(C13296ha haVar, int i, long j, long j2) {
        }

        public static void $default$a(C13296ha haVar, Format format) {
        }

        public static void $default$a(C13296ha haVar, C14283pj pjVar) {
        }

        public static void $default$a(C13296ha haVar, String str, long j, long j2) {
        }

        public static void $default$c(C13296ha haVar, C14283pj pjVar) {
        }
    }

    /* renamed from: a */
    void mo65162a(int i);

    /* renamed from: a */
    void mo65164a(int i, long j, long j2);

    /* renamed from: a */
    void mo65166a(Format format);

    /* renamed from: a */
    void mo65168a(C14283pj pjVar);

    /* renamed from: a */
    void mo65169a(String str, long j, long j2);

    /* renamed from: c */
    void mo65173c(C14283pj pjVar);

    /* renamed from: com.yandex.mobile.ads.impl.ha$a */
    public static final class C13297a {

        /* renamed from: a */
        private final Handler f34336a;

        /* renamed from: b */
        private final C13296ha f34337b;

        public C13297a(Handler handler, C13296ha haVar) {
            this.f34336a = haVar != null ? (Handler) C13479j9.m37703a(handler) : null;
            this.f34337b = haVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m36884c(C14283pj pjVar) {
            synchronized (pjVar) {
            }
            C13296ha haVar = this.f34337b;
            int i = ih1.f34858a;
            haVar.mo65168a(pjVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m36885d(C14283pj pjVar) {
            C13296ha haVar = this.f34337b;
            int i = ih1.f34858a;
            haVar.mo65173c(pjVar);
        }

        /* renamed from: a */
        public void mo67502a(String str, long j, long j2) {
            Handler handler = this.f34336a;
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
                        C13296ha.C13297a.this.m36883b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo67503b(C14283pj pjVar) {
            Handler handler = this.f34336a;
            if (handler != null) {
                handler.post(new Runnable(pjVar) {
                    public final /* synthetic */ C14283pj f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C13296ha.C13297a.this.m36885d(this.f$1);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m36883b(String str, long j, long j2) {
            C13296ha haVar = this.f34337b;
            int i = ih1.f34858a;
            haVar.mo65169a(str, j, j2);
        }

        /* renamed from: a */
        public void mo67500a(Format format) {
            Handler handler = this.f34336a;
            if (handler != null) {
                handler.post(new Runnable(format) {
                    public final /* synthetic */ Format f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C13296ha.C13297a.this.m36882b(this.f$1);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m36882b(Format format) {
            C13296ha haVar = this.f34337b;
            int i = ih1.f34858a;
            haVar.mo65166a(format);
        }

        /* renamed from: a */
        public void mo67499a(int i, long j, long j2) {
            Handler handler = this.f34336a;
            if (handler != null) {
                handler.post(new Runnable(i, j, j2) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ long f$2;
                    public final /* synthetic */ long f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r5;
                    }

                    public final void run() {
                        C13296ha.C13297a.this.m36881b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m36881b(int i, long j, long j2) {
            C13296ha haVar = this.f34337b;
            int i2 = ih1.f34858a;
            haVar.mo65164a(i, j, j2);
        }

        /* renamed from: a */
        public void mo67501a(C14283pj pjVar) {
            synchronized (pjVar) {
            }
            Handler handler = this.f34336a;
            if (handler != null) {
                handler.post(new Runnable(pjVar) {
                    public final /* synthetic */ C14283pj f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C13296ha.C13297a.this.m36884c(this.f$1);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m36880b(int i) {
            C13296ha haVar = this.f34337b;
            int i2 = ih1.f34858a;
            haVar.mo65162a(i);
        }

        /* renamed from: a */
        public void mo67498a(int i) {
            Handler handler = this.f34336a;
            if (handler != null) {
                handler.post(new Runnable(i) {
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C13296ha.C13297a.this.m36880b(this.f$1);
                    }
                });
            }
        }
    }
}
