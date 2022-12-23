package com.yandex.metrica.impl.p265ob;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.zn */
public class C12039zn {

    /* renamed from: a */
    private final C11995yn f28924a;

    /* renamed from: b */
    private volatile C11769sn f28925b;

    /* renamed from: c */
    private volatile Executor f28926c;

    /* renamed from: d */
    private volatile C11769sn f28927d;

    /* renamed from: e */
    private volatile C11769sn f28928e;

    /* renamed from: f */
    private volatile C11725rn f28929f;

    /* renamed from: g */
    private volatile C11769sn f28930g;

    /* renamed from: h */
    private volatile C11769sn f28931h;

    /* renamed from: i */
    private volatile C11769sn f28932i;

    /* renamed from: j */
    private volatile C11769sn f28933j;

    /* renamed from: k */
    private volatile C11769sn f28934k;

    /* renamed from: l */
    private volatile Executor f28935l;

    public C12039zn() {
        this(new C11995yn());
    }

    /* renamed from: a */
    public C11769sn mo64205a() {
        if (this.f28930g == null) {
            synchronized (this) {
                if (this.f28930g == null) {
                    this.f28924a.getClass();
                    this.f28930g = new C11725rn("YMM-CSE");
                }
            }
        }
        return this.f28930g;
    }

    /* renamed from: b */
    public C11769sn mo64207b() {
        if (this.f28933j == null) {
            synchronized (this) {
                if (this.f28933j == null) {
                    this.f28924a.getClass();
                    this.f28933j = new C11725rn("YMM-DE");
                }
            }
        }
        return this.f28933j;
    }

    /* renamed from: c */
    public C11725rn mo64209c() {
        if (this.f28929f == null) {
            synchronized (this) {
                if (this.f28929f == null) {
                    this.f28924a.getClass();
                    this.f28929f = new C11725rn("YMM-UH-1");
                }
            }
        }
        return this.f28929f;
    }

    /* renamed from: d */
    public C11769sn mo64210d() {
        if (this.f28925b == null) {
            synchronized (this) {
                if (this.f28925b == null) {
                    this.f28924a.getClass();
                    this.f28925b = new C11725rn("YMM-MC");
                }
            }
        }
        return this.f28925b;
    }

    /* renamed from: e */
    public C11769sn mo64211e() {
        if (this.f28931h == null) {
            synchronized (this) {
                if (this.f28931h == null) {
                    this.f28924a.getClass();
                    this.f28931h = new C11725rn("YMM-CTH");
                }
            }
        }
        return this.f28931h;
    }

    /* renamed from: f */
    public C11769sn mo64212f() {
        if (this.f28927d == null) {
            synchronized (this) {
                if (this.f28927d == null) {
                    this.f28924a.getClass();
                    this.f28927d = new C11725rn("YMM-MSTE");
                }
            }
        }
        return this.f28927d;
    }

    /* renamed from: g */
    public C11769sn mo64213g() {
        if (this.f28934k == null) {
            synchronized (this) {
                if (this.f28934k == null) {
                    this.f28924a.getClass();
                    this.f28934k = new C11725rn("YMM-RTM");
                }
            }
        }
        return this.f28934k;
    }

    /* renamed from: h */
    public C11769sn mo64214h() {
        if (this.f28932i == null) {
            synchronized (this) {
                if (this.f28932i == null) {
                    this.f28924a.getClass();
                    this.f28932i = new C11725rn("YMM-SDCT");
                }
            }
        }
        return this.f28932i;
    }

    /* renamed from: i */
    public Executor mo64215i() {
        if (this.f28926c == null) {
            synchronized (this) {
                if (this.f28926c == null) {
                    this.f28924a.getClass();
                    this.f28926c = new C10117An();
                }
            }
        }
        return this.f28926c;
    }

    /* renamed from: j */
    public C11769sn mo64216j() {
        if (this.f28928e == null) {
            synchronized (this) {
                if (this.f28928e == null) {
                    this.f28924a.getClass();
                    this.f28928e = new C11725rn("YMM-TP");
                }
            }
        }
        return this.f28928e;
    }

    /* renamed from: k */
    public Executor mo64217k() {
        if (this.f28935l == null) {
            synchronized (this) {
                if (this.f28935l == null) {
                    C11995yn ynVar = this.f28924a;
                    ynVar.getClass();
                    this.f28935l = new C11960xn(ynVar, new Handler(Looper.getMainLooper()));
                }
            }
        }
        return this.f28935l;
    }

    C12039zn(C11995yn ynVar) {
        this.f28924a = ynVar;
    }

    /* renamed from: a */
    public C11890vn mo64206a(Runnable runnable) {
        this.f28924a.getClass();
        return C11922wn.m30799a("YMM-HMSR", runnable);
    }

    /* renamed from: b */
    public C11890vn mo64208b(Runnable runnable) {
        this.f28924a.getClass();
        return C11922wn.m30799a("YMM-IB", runnable);
    }
}
