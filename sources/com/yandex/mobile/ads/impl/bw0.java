package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class bw0<E> implements Iterable<E> {

    /* renamed from: f */
    static final /* synthetic */ boolean f31602f = (!bw0.class.desiredAssertionStatus());

    /* renamed from: b */
    private final List<E> f31603b = new ArrayList();

    /* renamed from: c */
    private int f31604c;

    /* renamed from: d */
    private int f31605d;

    /* renamed from: e */
    private boolean f31606e;

    /* renamed from: com.yandex.mobile.ads.impl.bw0$b */
    private class C12662b implements Iterator {

        /* renamed from: b */
        private int f31607b;

        /* renamed from: c */
        private int f31608c;

        /* renamed from: d */
        private boolean f31609d;

        public boolean hasNext() {
            int i = this.f31608c;
            while (i < this.f31607b && bw0.m34413a(bw0.this, i) == null) {
                i++;
            }
            if (i < this.f31607b) {
                return true;
            }
            if (this.f31609d) {
                return false;
            }
            this.f31609d = true;
            bw0.m34416c(bw0.this);
            return false;
        }

        public E next() {
            while (true) {
                int i = this.f31608c;
                if (i >= this.f31607b || bw0.m34413a(bw0.this, i) != null) {
                    int i2 = this.f31608c;
                } else {
                    this.f31608c++;
                }
            }
            int i22 = this.f31608c;
            if (i22 < this.f31607b) {
                bw0 bw0 = bw0.this;
                this.f31608c = i22 + 1;
                return bw0.m34413a(bw0, i22);
            }
            if (!this.f31609d) {
                this.f31609d = true;
                bw0.m34416c(bw0.this);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C12662b() {
            bw0.m34414a((bw0) bw0.this);
            this.f31607b = bw0.m34415b(bw0.this);
        }
    }

    /* renamed from: b */
    static int m34415b(bw0 bw0) {
        return bw0.f31603b.size();
    }

    /* renamed from: c */
    static void m34416c(bw0 bw0) {
        int i = bw0.f31604c - 1;
        bw0.f31604c = i;
        boolean z = f31602f;
        if (!z && i < 0) {
            throw new AssertionError();
        } else if (i <= 0 && bw0.f31606e) {
            bw0.f31606e = false;
            if (z || i == 0) {
                for (int size = bw0.f31603b.size() - 1; size >= 0; size--) {
                    if (bw0.f31603b.get(size) == null) {
                        bw0.f31603b.remove(size);
                    }
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public boolean mo66132a(E e) {
        if (e == null || this.f31603b.contains(e)) {
            return false;
        }
        boolean add = this.f31603b.add(e);
        if (f31602f || add) {
            this.f31605d++;
            return true;
        }
        throw new AssertionError();
    }

    public void clear() {
        this.f31605d = 0;
        if (this.f31604c == 0) {
            this.f31603b.clear();
            return;
        }
        int size = this.f31603b.size();
        this.f31606e |= size != 0;
        for (int i = 0; i < size; i++) {
            this.f31603b.set(i, (Object) null);
        }
    }

    public Iterator<E> iterator() {
        return new C12662b();
    }

    /* renamed from: a */
    static void m34414a(bw0 bw0) {
        bw0.f31604c++;
    }

    /* renamed from: a */
    static Object m34413a(bw0 bw0, int i) {
        return bw0.f31603b.get(i);
    }
}
