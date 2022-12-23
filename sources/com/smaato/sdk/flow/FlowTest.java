package com.smaato.sdk.flow;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowTest<T> {
    /* access modifiers changed from: private */
    public final AtomicLong completions = new AtomicLong();
    /* access modifiers changed from: private */
    public final List<Throwable> errors = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public final CountDownLatch latch = new CountDownLatch(1);
    final Subscriber<T> subscriber = new Subscriber<T>() {
        public final void onSubscribe(Subscription subscription) {
            if (subscription != null) {
                subscription.request(Long.MAX_VALUE);
                return;
            }
            throw new NullPointerException("'s' specified as non-null is null");
        }

        public final void onNext(T t) {
            if (t != null) {
                FlowTest.this.values.add(t);
                return;
            }
            throw new NullPointerException("'value' specified as non-null is null");
        }

        public final void onError(Throwable th) {
            if (th != null) {
                FlowTest.this.errors.add(th);
                FlowTest.this.latch.countDown();
                return;
            }
            throw new NullPointerException("'e' specified as non-null is null");
        }

        public final void onComplete() {
            FlowTest.this.completions.incrementAndGet();
            FlowTest.this.latch.countDown();
        }
    };
    /* access modifiers changed from: private */
    public final List<T> values = new CopyOnWriteArrayList();

    public final FlowTest<T> await(long j, TimeUnit timeUnit) throws InterruptedException {
        if (this.latch.getCount() == 0) {
            return this;
        }
        this.latch.await(j, timeUnit);
        return this;
    }

    public final List<T> values() {
        return Collections.unmodifiableList(this.values);
    }

    public final Throwable error() {
        assertHasErrors();
        return this.errors.get(0);
    }

    public final FlowTest<T> assertComplete() {
        long j = this.completions.get();
        if (j == 0) {
            throw fail("Not completed");
        } else if (j <= 1) {
            return this;
        } else {
            throw fail("Multiple completions: ".concat(String.valueOf(j)));
        }
    }

    public final FlowTest<T> assertNotComplete() {
        long j = this.completions.get();
        int i = (j > 1 ? 1 : (j == 1 ? 0 : -1));
        if (i == 0) {
            throw fail("Completed!");
        } else if (i <= 0) {
            return this;
        } else {
            throw fail("Multiple completions: ".concat(String.valueOf(j)));
        }
    }

    public final FlowTest<T> assertNoErrors() {
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Error(s) present: " + this.errors);
    }

    public final FlowTest<T> assertHasErrors() {
        if (this.errors.isEmpty()) {
            throw fail("Has no errors");
        } else if (this.errors.size() <= 1) {
            return this;
        } else {
            throw fail("Has multiple errors: " + this.errors.size());
        }
    }

    private AssertionError fail(String str) {
        AssertionError assertionError = new AssertionError(str + " (latch = " + this.latch.getCount() + ", values = " + this.values.size() + ", errors = " + this.errors.size() + ", completions = " + this.completions + ")");
        if (!this.errors.isEmpty() && this.errors.size() == 1) {
            assertionError.initCause(this.errors.get(0));
        }
        return assertionError;
    }
}
