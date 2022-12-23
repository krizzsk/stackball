package com.yandex.mobile.ads.exo;

import android.os.Handler;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.k40;

/* renamed from: com.yandex.mobile.ads.exo.n */
public final class C12260n {

    /* renamed from: a */
    private final C12262b f29982a;

    /* renamed from: b */
    private final C12261a f29983b;

    /* renamed from: c */
    private final C12270q f29984c;

    /* renamed from: d */
    private int f29985d;

    /* renamed from: e */
    private Object f29986e;

    /* renamed from: f */
    private Handler f29987f;

    /* renamed from: g */
    private int f29988g;

    /* renamed from: h */
    private boolean f29989h;

    /* renamed from: i */
    private boolean f29990i;

    /* renamed from: j */
    private boolean f29991j;

    /* renamed from: com.yandex.mobile.ads.exo.n$a */
    public interface C12261a {
    }

    /* renamed from: com.yandex.mobile.ads.exo.n$b */
    public interface C12262b {
        /* renamed from: a */
        void mo64802a(int i, Object obj) throws k40;
    }

    public C12260n(C12261a aVar, C12262b bVar, C12270q qVar, int i, Handler handler) {
        this.f29983b = aVar;
        this.f29982a = bVar;
        this.f29984c = qVar;
        this.f29987f = handler;
        this.f29988g = i;
    }

    /* renamed from: a */
    public C12260n mo65122a(int i) {
        C13479j9.m37708b(!this.f29989h);
        this.f29985d = i;
        return this;
    }

    /* renamed from: b */
    public Handler mo65126b() {
        return this.f29987f;
    }

    /* renamed from: c */
    public Object mo65127c() {
        return this.f29986e;
    }

    /* renamed from: d */
    public C12262b mo65128d() {
        return this.f29982a;
    }

    /* renamed from: e */
    public C12270q mo65129e() {
        return this.f29984c;
    }

    /* renamed from: f */
    public int mo65130f() {
        return this.f29985d;
    }

    /* renamed from: g */
    public int mo65131g() {
        return this.f29988g;
    }

    /* renamed from: h */
    public C12260n mo65132h() {
        C13479j9.m37708b(!this.f29989h);
        this.f29989h = true;
        ((C12217h) this.f29983b).mo64932c(this);
        return this;
    }

    /* renamed from: a */
    public C12260n mo65123a(Object obj) {
        C13479j9.m37708b(!this.f29989h);
        this.f29986e = obj;
        return this;
    }

    /* renamed from: a */
    public synchronized boolean mo65125a() throws InterruptedException {
        C13479j9.m37708b(this.f29989h);
        C13479j9.m37708b(this.f29987f.getLooper().getThread() != Thread.currentThread());
        while (!this.f29991j) {
            wait();
        }
        return this.f29990i;
    }

    /* renamed from: a */
    public synchronized void mo65124a(boolean z) {
        this.f29990i = z | this.f29990i;
        this.f29991j = true;
        notifyAll();
    }
}
