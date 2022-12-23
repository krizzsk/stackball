package com.tapjoy.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.util.LinkedList;

/* renamed from: com.tapjoy.internal.au */
public final class C9078au extends C9076at implements C9081ax, Closeable, Flushable {

    /* renamed from: a */
    private final C9081ax f22368a;

    /* renamed from: b */
    private final LinkedList f22369b = new LinkedList();

    /* renamed from: c */
    private final LinkedList f22370c = new LinkedList();

    /* renamed from: d */
    private int f22371d;

    /* renamed from: e */
    private boolean f22372e;

    /* renamed from: a */
    public static C9078au m24312a(C9081ax axVar) {
        return new C9078au(axVar);
    }

    private C9078au(C9081ax axVar) {
        this.f22368a = axVar;
        int size = axVar.size();
        this.f22371d = size;
        this.f22372e = size == 0;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
        super.finalize();
    }

    public final void close() {
        try {
            flush();
        } finally {
            C9081ax axVar = this.f22368a;
            if (axVar instanceof Closeable) {
                ((Closeable) axVar).close();
            }
        }
    }

    public final void flush() {
        if (!this.f22370c.isEmpty()) {
            this.f22368a.addAll(this.f22370c);
            if (this.f22372e) {
                this.f22369b.addAll(this.f22370c);
            }
            this.f22370c.clear();
        }
    }

    public final int size() {
        return this.f22371d;
    }

    public final boolean offer(Object obj) {
        this.f22370c.add(obj);
        this.f22371d++;
        return true;
    }

    public final Object poll() {
        Object obj;
        if (this.f22371d <= 0) {
            return null;
        }
        if (!this.f22369b.isEmpty()) {
            obj = this.f22369b.remove();
            this.f22368a.mo57778b(1);
        } else if (this.f22372e) {
            obj = this.f22370c.remove();
        } else {
            obj = this.f22368a.remove();
            if (this.f22371d == this.f22370c.size() + 1) {
                this.f22372e = true;
            }
        }
        this.f22371d--;
        return obj;
    }

    public final Object peek() {
        if (this.f22371d <= 0) {
            return null;
        }
        if (!this.f22369b.isEmpty()) {
            return this.f22369b.element();
        }
        if (this.f22372e) {
            return this.f22370c.element();
        }
        Object peek = this.f22368a.peek();
        this.f22369b.add(peek);
        if (this.f22371d == this.f22369b.size() + this.f22370c.size()) {
            this.f22372e = true;
        }
        return peek;
    }

    /* renamed from: a */
    public final Object mo57777a(int i) {
        if (i < 0 || i >= this.f22371d) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.f22369b.size();
        if (i < size) {
            return this.f22369b.get(i);
        }
        if (this.f22372e) {
            return this.f22370c.get(i - size);
        }
        if (i >= this.f22368a.size()) {
            return this.f22370c.get(i - this.f22368a.size());
        }
        Object obj = null;
        while (size <= i) {
            obj = this.f22368a.mo57777a(size);
            this.f22369b.add(obj);
            size++;
        }
        if (i + 1 + this.f22370c.size() == this.f22371d) {
            this.f22372e = true;
        }
        return obj;
    }

    /* renamed from: b */
    public final void mo57778b(int i) {
        if (i <= 0 || i > this.f22371d) {
            throw new IndexOutOfBoundsException();
        }
        if (i <= this.f22369b.size()) {
            C9080aw.m24317a(this.f22369b, i);
            this.f22368a.mo57778b(i);
        } else {
            this.f22369b.clear();
            int size = (this.f22370c.size() + i) - this.f22371d;
            if (size < 0) {
                this.f22368a.mo57778b(i);
            } else {
                this.f22368a.clear();
                this.f22372e = true;
                if (size > 0) {
                    C9080aw.m24317a(this.f22370c, size);
                }
            }
        }
        this.f22371d -= i;
    }
}
