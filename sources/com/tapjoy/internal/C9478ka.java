package com.tapjoy.internal;

import com.tapjoy.internal.C9489kf;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: com.tapjoy.internal.ka */
public abstract class C9478ka implements C9489kf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f23568a = Logger.getLogger(C9478ka.class.getName());

    /* renamed from: b */
    private final C9489kf f23569b = new C9484kc() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo58458a() {
            new Executor() {
                public final void execute(Runnable runnable) {
                    new Thread(runnable, C9478ka.this.getClass().getSimpleName()).start();
                }
            }.execute(new Runnable() {
                public final void run() {
                    try {
                        C9478ka.this.mo58182b();
                        C94791.this.mo58476c();
                        if (C94791.this.mo58456f() == C9489kf.C9490a.RUNNING) {
                            C9478ka.this.mo58184d();
                        }
                        C9478ka.this.mo58183c();
                        C94791.this.mo58477d();
                    } catch (Throwable th) {
                        C94791.this.mo58475a(th);
                        throw C9466jr.m25450a(th);
                    }
                }
            });
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo58459b() {
            C9478ka.this.mo58181a();
        }
    };

    /* renamed from: a */
    public void mo58181a() {
    }

    /* renamed from: b */
    public void mo58182b() {
    }

    /* renamed from: c */
    public void mo58183c() {
    }

    /* renamed from: d */
    public abstract void mo58184d();

    public String toString() {
        return getClass().getSimpleName() + " [" + mo58456f() + "]";
    }

    /* renamed from: e */
    public final C9488ke mo58455e() {
        return this.f23569b.mo58455e();
    }

    /* renamed from: f */
    public final C9489kf.C9490a mo58456f() {
        return this.f23569b.mo58456f();
    }
}
