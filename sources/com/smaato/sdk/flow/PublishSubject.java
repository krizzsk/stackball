package com.smaato.sdk.flow;

import com.smaato.sdk.util.Optional;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

final class PublishSubject<T> extends Subject<T> {
    private volatile boolean done;
    private volatile Throwable error;
    private volatile T lastValue;
    private Queue<PublishSubscription<? super T>> subscribers = new ConcurrentLinkedQueue();

    PublishSubject() {
    }

    public final Optional<T> lastValue() {
        return Optional.m24104of(this.lastValue);
    }

    public final void onNext(T t) {
        if (t == null) {
            throw new NullPointerException("'value' specified as non-null is null");
        } else if (!this.done) {
            for (PublishSubscription publishSubscription : this.subscribers) {
                this.lastValue = t;
                if (t != null) {
                    publishSubscription.downstream.onNext(t);
                } else {
                    throw new NullPointerException("'value' specified as non-null is null");
                }
            }
        }
    }

    public final void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("'e' specified as non-null is null");
        } else if (!this.done) {
            if (this.error != null) {
                FlowPlugins.onError(th);
                return;
            }
            for (PublishSubscription onError : this.subscribers) {
                onError.onError(th);
                this.error = th;
            }
            this.subscribers.clear();
            this.done = true;
        }
    }

    public final void onComplete() {
        if (!this.done) {
            for (PublishSubscription onComplete : this.subscribers) {
                onComplete.onComplete();
            }
            this.subscribers.clear();
            this.done = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            PublishSubscription publishSubscription = new PublishSubscription(subscriber);
            subscriber.onSubscribe(publishSubscription);
            try {
                if (!this.done) {
                    this.subscribers.add(publishSubscription);
                } else if (this.error != null) {
                    publishSubscription.onError(this.error);
                } else {
                    publishSubscription.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                subscriber.onError(th);
            }
        } else {
            throw new NullPointerException("'s' specified as non-null is null");
        }
    }

    static class PublishSubscription<T> implements Subscription {
        final Subscriber<? super T> downstream;

        public final void cancel() {
        }

        PublishSubscription(Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        public final void onError(Throwable th) {
            if (th != null) {
                this.downstream.onError(th);
                return;
            }
            throw new NullPointerException("'e' specified as non-null is null");
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void request(long j) {
            Subscriptions.validate(this.downstream, j);
        }
    }
}
