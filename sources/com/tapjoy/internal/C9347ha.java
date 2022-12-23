package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.tapjoy.internal.ha */
public class C9347ha implements C9327go {

    /* renamed from: a */
    private static final C9347ha f23134a = new C9347ha() {
        /* renamed from: a */
        public final void mo57310a(String str) {
        }

        /* renamed from: a */
        public final void mo57311a(String str, C9324gl glVar) {
        }

        /* renamed from: a */
        public final void mo57312a(String str, String str2, C9324gl glVar) {
        }

        /* renamed from: b */
        public final void mo57313b(String str) {
        }

        /* renamed from: c */
        public final void mo57314c(String str) {
        }

        /* renamed from: d */
        public final void mo57315d(String str) {
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9327go f23135b;

    /* renamed from: c */
    private final C9085ba f23136c;

    /* synthetic */ C9347ha(byte b) {
        this();
    }

    /* renamed from: a */
    public static C9347ha m25088a(C9327go goVar) {
        if (!(!(goVar instanceof C9347ha))) {
            throw new IllegalArgumentException();
        } else if (goVar != null) {
            return new C9347ha(goVar);
        } else {
            return f23134a;
        }
    }

    private C9347ha() {
        this.f23135b = null;
        this.f23136c = null;
    }

    private C9347ha(C9327go goVar) {
        Handler handler;
        this.f23135b = goVar;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            C9464jp.m25446a(myLooper);
            handler = myLooper == Looper.getMainLooper() ? C9501u.m25539a() : new Handler(myLooper);
        } else {
            handler = null;
        }
        if (handler != null) {
            this.f23136c = C9501u.m25540a(handler);
            handler.getLooper();
        } else if (Thread.currentThread() == C9330gr.m25024b()) {
            this.f23136c = C9330gr.f23071a;
        } else {
            this.f23136c = C9501u.m25540a(C9501u.m25539a());
        }
    }

    /* renamed from: a */
    public void mo57310a(final String str) {
        this.f23136c.mo57827a(new Runnable() {
            public final void run() {
                C9347ha.this.f23135b.mo57310a(str);
            }
        });
    }

    /* renamed from: b */
    public void mo57313b(final String str) {
        this.f23136c.mo57827a(new Runnable() {
            public final void run() {
                C9347ha.this.f23135b.mo57313b(str);
            }
        });
    }

    /* renamed from: c */
    public void mo57314c(final String str) {
        this.f23136c.mo57827a(new Runnable() {
            public final void run() {
                C9347ha.this.f23135b.mo57314c(str);
            }
        });
    }

    /* renamed from: d */
    public void mo57315d(final String str) {
        this.f23136c.mo57827a(new Runnable() {
            public final void run() {
                C9347ha.this.f23135b.mo57315d(str);
            }
        });
    }

    /* renamed from: a */
    public void mo57311a(final String str, final C9324gl glVar) {
        this.f23136c.mo57827a(new Runnable() {
            public final void run() {
                C9347ha.this.f23135b.mo57311a(str, glVar);
            }
        });
    }

    /* renamed from: a */
    public void mo57312a(final String str, final String str2, final C9324gl glVar) {
        this.f23136c.mo57827a(new Runnable() {
            public final void run() {
                C9347ha.this.f23135b.mo57312a(str, str2, glVar);
            }
        });
    }
}
