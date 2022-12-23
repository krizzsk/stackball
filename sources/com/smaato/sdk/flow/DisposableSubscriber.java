package com.smaato.sdk.flow;

import com.smaato.sdk.util.Disposable;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

final class DisposableSubscriber<T> implements Subscriber<T>, Subscription, Disposable {
    private volatile Subscriber<? super T> downstream;
    private final AtomicReference<Subscription> upstream = new AtomicReference<>();

    public /* synthetic */ void addTo(Collection<Disposable> collection) {
        Disposable.CC.$default$addTo(this, collection);
    }

    DisposableSubscriber(Subscriber<? super T> subscriber) {
        this.downstream = subscriber;
    }

    public final void onSubscribe(Subscription subscription) {
        if (subscription == null) {
            throw new NullPointerException("'s' specified as non-null is null");
        } else if (Subscriptions.setOnce(this.upstream, subscription)) {
            this.downstream.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        if (t == null) {
            throw new NullPointerException("'value' specified as non-null is null");
        } else if (this.downstream != null) {
            this.downstream.onNext(t);
        }
    }

    public final void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("'e' specified as non-null is null");
        } else if (this.downstream != null) {
            this.downstream.onError(th);
        }
    }

    public final void onComplete() {
        if (this.downstream != null) {
            this.downstream.onComplete();
        }
    }

    public final void request(long j) {
        if (this.downstream != null && Subscriptions.validate(this.downstream, j)) {
            this.upstream.get().request(j);
        }
    }

    public final void cancel() {
        Subscriptions.cancel(this.upstream);
        this.downstream = null;
    }

    public final void dispose() {
        cancel();
    }
}
