package com.yandex.metrica.impl.p265ob;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.qn */
public class C11696qn {

    /* renamed from: a */
    private final C11665pn f28034a;

    /* renamed from: b */
    private volatile C11725rn f28035b;

    /* renamed from: c */
    private volatile C11769sn f28036c;

    /* renamed from: d */
    private volatile C11769sn f28037d;

    /* renamed from: e */
    private volatile Handler f28038e;

    public C11696qn() {
        this(new C11665pn());
    }

    /* renamed from: a */
    public C11769sn mo63560a() {
        if (this.f28036c == null) {
            synchronized (this) {
                if (this.f28036c == null) {
                    this.f28034a.getClass();
                    this.f28036c = new C11725rn("YMM-APT");
                }
            }
        }
        return this.f28036c;
    }

    /* renamed from: b */
    public C11725rn mo63561b() {
        if (this.f28035b == null) {
            synchronized (this) {
                if (this.f28035b == null) {
                    this.f28034a.getClass();
                    this.f28035b = new C11725rn("YMM-YM");
                }
            }
        }
        return this.f28035b;
    }

    /* renamed from: c */
    public Handler mo63562c() {
        if (this.f28038e == null) {
            synchronized (this) {
                if (this.f28038e == null) {
                    this.f28034a.getClass();
                    this.f28038e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return this.f28038e;
    }

    /* renamed from: d */
    public C11769sn mo63563d() {
        if (this.f28037d == null) {
            synchronized (this) {
                if (this.f28037d == null) {
                    this.f28034a.getClass();
                    this.f28037d = new C11725rn("YMM-RS");
                }
            }
        }
        return this.f28037d;
    }

    C11696qn(C11665pn pnVar) {
        this.f28034a = pnVar;
    }
}
