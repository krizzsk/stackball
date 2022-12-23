package com.smaato.sdk.util;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Disposables extends AbstractCollection<Disposable> implements Collection<Disposable> {
    private final List<Disposable> delegate = new CopyOnWriteArrayList();

    public final boolean add(Disposable disposable) {
        return this.delegate.add(disposable);
    }

    public final int size() {
        return this.delegate.size();
    }

    public final Iterator<Disposable> iterator() {
        return this.delegate.iterator();
    }

    public final void dispose() {
        for (Disposable dispose : this.delegate) {
            dispose.dispose();
        }
        this.delegate.clear();
    }

    public final void clear() {
        dispose();
    }
}
