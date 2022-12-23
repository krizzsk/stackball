package com.yandex.mobile.ads.impl;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.xb */
public final class C15158xb<E> extends AbstractQueue<E> implements BlockingQueue<E> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Queue<E> f42485b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ReentrantLock f42486c;

    /* renamed from: d */
    private final Condition f42487d;

    public C15158xb(Queue<E> queue) {
        Intrinsics.checkNotNullParameter(queue, "backingQueue");
        this.f42485b = queue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f42486c = reentrantLock;
        this.f42487d = reentrantLock.newCondition();
    }

    public boolean add(E e) {
        offer(e);
        return true;
    }

    public int drainTo(Collection<? super E> collection) {
        throw new UnsupportedOperationException();
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: finally extract failed */
    public boolean offer(E e) {
        this.f42486c.lock();
        try {
            this.f42485b.offer(e);
            this.f42487d.signal();
            Unit unit = Unit.INSTANCE;
            this.f42486c.unlock();
            return true;
        } catch (Throwable th) {
            this.f42486c.unlock();
            throw th;
        }
    }

    public E peek() {
        this.f42486c.lock();
        try {
            return this.f42485b.peek();
        } finally {
            this.f42486c.unlock();
        }
    }

    public E poll() {
        this.f42486c.lock();
        try {
            return this.f42485b.poll();
        } finally {
            this.f42486c.unlock();
        }
    }

    public void put(E e) {
        offer(e);
    }

    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    public boolean remove(Object obj) {
        this.f42486c.lock();
        try {
            return this.f42485b.remove(obj);
        } finally {
            this.f42486c.unlock();
        }
    }

    public final int size() {
        this.f42486c.lock();
        try {
            return this.f42485b.size();
        } finally {
            this.f42486c.unlock();
        }
    }

    public Spliterator<E> spliterator() {
        throw new UnsupportedOperationException();
    }

    public E take() throws InterruptedException {
        this.f42486c.lockInterruptibly();
        while (this.f42485b.isEmpty()) {
            try {
                this.f42487d.await();
            } finally {
                this.f42486c.unlock();
            }
        }
        return this.f42485b.poll();
    }

    public int drainTo(Collection<? super E> collection, int i) {
        throw new UnsupportedOperationException();
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        this.f42486c.lockInterruptibly();
        try {
            long nanos = timeUnit.toNanos(j);
            while (this.f42485b.isEmpty() && nanos > 0) {
                nanos = this.f42487d.awaitNanos(nanos);
            }
            return this.f42485b.poll();
        } finally {
            this.f42486c.unlock();
        }
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        offer(e);
        return true;
    }
}
