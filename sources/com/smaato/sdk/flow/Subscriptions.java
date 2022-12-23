package com.smaato.sdk.flow;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

abstract class Subscriptions {
    private static final Subscription CANCELLED_SUB = new Subscription() {
        public final void cancel() {
        }

        public final void request(long j) {
        }
    };
    static final Subscription EMPTY_SUB = new Subscription() {
        public final void cancel() {
        }

        public final void request(long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("§3.9 violated: request amount is negative [" + j + "]");
            }
        }
    };

    static boolean setOnce(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        if (atomicReference == null) {
            throw new NullPointerException("'upstream' specified as non-null is null");
        } else if (subscription == null) {
            throw new NullPointerException("'s' specified as non-null is null");
        } else if (atomicReference.compareAndSet((Object) null, subscription)) {
            return true;
        } else {
            subscription.cancel();
            return false;
        }
    }

    static boolean validate(Subscriber<?> subscriber, long j) {
        if (subscriber == null) {
            throw new NullPointerException("'s' specified as non-null is null");
        } else if (j > 0) {
            return true;
        } else {
            subscriber.onError(new IllegalArgumentException("§3.9 violated: request amount is negative [" + j + "]"));
            return false;
        }
    }

    static void requested(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        if (atomicLong != null) {
            do {
                j2 = atomicLong.get();
                j3 = Long.MAX_VALUE;
                if (Long.MAX_VALUE != j2) {
                    long j4 = j2 + j;
                    if (j4 >= 0) {
                        j3 = j4;
                    }
                } else {
                    return;
                }
            } while (!atomicLong.compareAndSet(j2, j3));
            return;
        }
        throw new NullPointerException("'demand' specified as non-null is null");
    }

    static void produced(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        if (atomicLong != null) {
            do {
                j2 = atomicLong.get();
                if (j2 != Long.MAX_VALUE) {
                    j3 = j2 - j;
                    if (j3 < 0) {
                        throw new IllegalStateException("More produced than requested: ".concat(String.valueOf(j3)));
                    }
                } else {
                    return;
                }
            } while (!atomicLong.compareAndSet(j2, j3));
            return;
        }
        throw new NullPointerException("'demand' specified as non-null is null");
    }

    static void error(Subscriber<?> subscriber, Throwable th) {
        if (subscriber != null) {
            subscriber.onSubscribe(EMPTY_SUB);
            subscriber.onError(th);
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static void empty(Subscriber<?> subscriber) {
        if (subscriber != null) {
            subscriber.onSubscribe(EMPTY_SUB);
            subscriber.onComplete();
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static void cancel(AtomicReference<Subscription> atomicReference) {
        Subscription andSet;
        if (atomicReference != null) {
            Subscription subscription = atomicReference.get();
            Subscription subscription2 = CANCELLED_SUB;
            if (subscription2 != subscription && CANCELLED_SUB != (andSet = atomicReference.getAndSet(subscription2)) && andSet != null) {
                andSet.cancel();
                return;
            }
            return;
        }
        throw new NullPointerException("'upstream' specified as non-null is null");
    }
}
