package com.smaato.sdk.core.util.collections;

import java.util.ListIterator;

abstract class MappedListIterator<F, T> extends MappedIterator<F, T> implements ListIterator<T> {
    MappedListIterator(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return Iterators.cast(this.backingIterator).hasPrevious();
    }

    public final T previous() {
        return map(Iterators.cast(this.backingIterator).previous());
    }

    public final int nextIndex() {
        return Iterators.cast(this.backingIterator).nextIndex();
    }

    public final int previousIndex() {
        return Iterators.cast(this.backingIterator).previousIndex();
    }
}
