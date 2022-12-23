package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13184ga;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.yandex.mobile.ads.impl.kb */
public abstract class C13695kb implements C13184ga {

    /* renamed from: b */
    protected C13184ga.C13185a f36079b;

    /* renamed from: c */
    protected C13184ga.C13185a f36080c;

    /* renamed from: d */
    private C13184ga.C13185a f36081d;

    /* renamed from: e */
    private C13184ga.C13185a f36082e;

    /* renamed from: f */
    private ByteBuffer f36083f;

    /* renamed from: g */
    private ByteBuffer f36084g;

    /* renamed from: h */
    private boolean f36085h;

    public C13695kb() {
        ByteBuffer byteBuffer = C13184ga.f33912a;
        this.f36083f = byteBuffer;
        this.f36084g = byteBuffer;
        C13184ga.C13185a aVar = C13184ga.C13185a.f33913e;
        this.f36081d = aVar;
        this.f36082e = aVar;
        this.f36079b = aVar;
        this.f36080c = aVar;
    }

    /* renamed from: a */
    public final C13184ga.C13185a mo67212a(C13184ga.C13185a aVar) throws C13184ga.C13186b {
        this.f36081d = aVar;
        this.f36082e = mo68192b(aVar);
        return mo67216c() ? this.f36082e : C13184ga.C13185a.f33913e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C13184ga.C13185a mo68192b(C13184ga.C13185a aVar) throws C13184ga.C13186b;

    /* renamed from: b */
    public final void mo67215b() {
        this.f36085h = true;
        mo68195h();
    }

    /* renamed from: c */
    public boolean mo67216c() {
        return this.f36082e != C13184ga.C13185a.f33913e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo68193d() {
        return this.f36084g.hasRemaining();
    }

    /* renamed from: e */
    public boolean mo67217e() {
        return this.f36085h && this.f36084g == C13184ga.f33912a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo68194f() {
    }

    public final void flush() {
        this.f36084g = C13184ga.f33912a;
        this.f36085h = false;
        this.f36079b = this.f36081d;
        this.f36080c = this.f36082e;
        mo68194f();
    }

    /* renamed from: g */
    public final void mo67219g() {
        flush();
        this.f36083f = C13184ga.f33912a;
        C13184ga.C13185a aVar = C13184ga.C13185a.f33913e;
        this.f36081d = aVar;
        this.f36082e = aVar;
        this.f36079b = aVar;
        this.f36080c = aVar;
        mo68196i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo68195h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo68196i() {
    }

    /* renamed from: a */
    public ByteBuffer mo67213a() {
        ByteBuffer byteBuffer = this.f36084g;
        this.f36084g = C13184ga.f33912a;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ByteBuffer mo68191a(int i) {
        if (this.f36083f.capacity() < i) {
            this.f36083f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f36083f.clear();
        }
        ByteBuffer byteBuffer = this.f36083f;
        this.f36084g = byteBuffer;
        return byteBuffer;
    }
}
