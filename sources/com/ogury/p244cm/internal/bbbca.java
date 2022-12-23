package com.ogury.p244cm.internal;

import java.util.Iterator;

/* renamed from: com.ogury.cm.internal.bbbca */
public final class bbbca<T, R> implements bbbba<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final bbbba<T> f20633a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bbaab<T, R> f20634b;

    /* renamed from: com.ogury.cm.internal.bbbca$aaaaa */
    public static final class aaaaa implements Iterator<R> {

        /* renamed from: a */
        final /* synthetic */ bbbca f20635a;

        /* renamed from: b */
        private final Iterator<T> f20636b;

        aaaaa(bbbca bbbca) {
            this.f20635a = bbbca;
            this.f20636b = bbbca.f20633a.mo52829a();
        }

        public final boolean hasNext() {
            return this.f20636b.hasNext();
        }

        public final R next() {
            return this.f20635a.f20634b.mo52626a(this.f20636b.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bbbca(bbbba<? extends T> bbbba, bbaab<? super T, ? extends R> bbaab) {
        bbabc.m22051b(bbbba, "sequence");
        bbabc.m22051b(bbaab, "transformer");
        this.f20633a = bbbba;
        this.f20634b = bbaab;
    }

    /* renamed from: a */
    public final Iterator<R> mo52829a() {
        return new aaaaa(this);
    }
}
