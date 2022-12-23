package com.ogury.p244cm.internal;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.ogury.p244cm.internal.bacab;
import java.util.Collection;

/* renamed from: com.ogury.cm.internal.bacaa */
public abstract class bacaa<E> implements Collection<E> {

    /* renamed from: com.ogury.cm.internal.bacaa$aaaaa */
    static final class aaaaa extends bbaca implements bbaab<E, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ bacaa f20604a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(bacaa bacaa) {
            super(1);
            this.f20604a = bacaa;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52626a(Object obj) {
            return obj == this.f20604a ? "(this Collection)" : String.valueOf(obj);
        }
    }

    protected bacaa() {
    }

    /* renamed from: a */
    public abstract int mo52791a();

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (bbabc.m22050a(a, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        bbabc.m22051b(collection, MessengerShareContentUtility.ELEMENTS);
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return mo52791a();
    }

    public Object[] toArray() {
        return bbaba.m22043a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        bbabc.m22051b(tArr, "array");
        T[] a = bbaba.m22044a(this, tArr);
        if (a != null) {
            return a;
        }
        throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public String toString() {
        CharSequence charSequence = ", ";
        CharSequence charSequence2 = "[";
        CharSequence charSequence3 = "]";
        CharSequence charSequence4 = "...";
        bbabc.m22051b(this, "receiver$0");
        bbabc.m22051b(charSequence, "separator");
        bbabc.m22051b(charSequence2, "prefix");
        bbabc.m22051b(charSequence3, "postfix");
        bbabc.m22051b(charSequence4, "truncated");
        String sb = ((StringBuilder) bacab.aaaaa.m22023a(this, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, new aaaaa(this))).toString();
        bbabc.m22048a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }
}
