package com.smaato.sdk.flow;

import com.smaato.sdk.util.Disposable;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Flow<T> implements Publisher<T> {
    static /* synthetic */ Throwable lambda$error$0(Throwable th) throws Exception {
        return th;
    }

    /* access modifiers changed from: package-private */
    public abstract void subscribeActual(Subscriber<? super T> subscriber);

    public static <T> Flow<T> create(Action1<Emitter<? super T>> action1) {
        if (action1 != null) {
            return new FlowCreate(action1);
        }
        throw new NullPointerException("'source' specified as non-null is null");
    }

    public static <T> Flow<T> fromIterable(Iterable<T> iterable) {
        if (iterable != null) {
            return new FlowFromIterable(iterable);
        }
        throw new NullPointerException("'iterable' specified as non-null is null");
    }

    public static <T> Flow<T> fromArray(T[] tArr) {
        if (tArr != null) {
            return new FlowFromArray(tArr);
        }
        throw new NullPointerException("'array' specified as non-null is null");
    }

    public static <T> Flow<T> fromCallable(Callable<T> callable) {
        if (callable != null) {
            return new FlowFromCallable(callable);
        }
        throw new NullPointerException("'producer' specified as non-null is null");
    }

    public static <T> Flow<T> fromRunnable(Runnable runnable) {
        if (runnable != null) {
            runnable.getClass();
            return new FlowFromAction(new Action0(runnable) {
                public final /* synthetic */ Runnable f$0;

                {
                    this.f$0 = r1;
                }

                public final void invoke() {
                    this.f$0.run();
                }
            });
        }
        throw new NullPointerException("'action' specified as non-null is null");
    }

    public static <T> Flow<T> fromAction(Action0 action0) {
        if (action0 != null) {
            return new FlowFromAction(action0);
        }
        throw new NullPointerException("'action' specified as non-null is null");
    }

    @SafeVarargs
    public static <T> Flow<T> just(T... tArr) {
        if (tArr == null) {
            throw new NullPointerException("'values' specified as non-null is null");
        } else if (tArr.length == 0) {
            return empty();
        } else {
            return fromArray(tArr);
        }
    }

    @SafeVarargs
    public static <T> Flow<T> concatArray(Publisher<? extends T>... publisherArr) {
        if (publisherArr != null) {
            return new FlowConcatArray(publisherArr);
        }
        throw new NullPointerException("'sources' specified as non-null is null");
    }

    public static <T> Flow<T> empty() {
        return new FlowEmpty();
    }

    public static <T> Flow<T> maybe(Callable<? extends T> callable) {
        if (callable != null) {
            return new FlowMaybe(callable);
        }
        throw new NullPointerException("'producer' specified as non-null is null");
    }

    public static <T> Flow<T> error(Callable<? extends Throwable> callable) {
        if (callable != null) {
            return new FlowError(callable);
        }
        throw new NullPointerException("'producer' specified as non-null is null");
    }

    public static <T> Flow<T> error(Throwable th) {
        if (th != null) {
            return error((Callable<? extends Throwable>) new Callable(th) {
                public final /* synthetic */ Throwable f$0;

                {
                    this.f$0 = r1;
                }

                public final Object call() {
                    return Flow.lambda$error$0(this.f$0);
                }
            });
        }
        throw new NullPointerException("'error' specified as non-null is null");
    }

    public final Flow<T> concatWith(Publisher<? extends T> publisher) {
        if (publisher != null) {
            return concatArray(this, publisher);
        }
        throw new NullPointerException("'other' specified as non-null is null");
    }

    public final Flow<T> switchIfError(Function1<? super Throwable, ? extends Publisher<? extends T>> function1) {
        if (function1 != null) {
            return new FlowSwitchIfError(this, function1);
        }
        throw new NullPointerException("'mapper' specified as non-null is null");
    }

    public final Flow<T> switchIfEmpty(Callable<? extends Publisher<? extends T>> callable) {
        if (callable != null) {
            return new FlowSwitchIfEmpty(this, callable);
        }
        throw new NullPointerException("'producer' specified as non-null is null");
    }

    public final Flow<T> distinct() {
        return distinct(Functions.identity());
    }

    public final <K> Flow<T> distinct(Function1<? super T, K> function1) {
        if (function1 != null) {
            return new FlowDistinct(this, function1);
        }
        throw new NullPointerException("'keySelector' specified as non-null is null");
    }

    public final Flow<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.identity());
    }

    public final <K> Flow<T> distinctUntilChanged(Function1<? super T, K> function1) {
        if (function1 != null) {
            return new FlowDistinctUntilChanged(this, function1);
        }
        throw new NullPointerException("'keySelector' specified as non-null is null");
    }

    public Flow<T> startWith(T t) {
        if (t != null) {
            return new FlowStartWith(this, t);
        }
        throw new NullPointerException("'initialValue' specified as non-null is null");
    }

    public final Flow<T> filter(Predicate1<? super T> predicate1) {
        if (predicate1 != null) {
            return new FlowFilter(this, predicate1);
        }
        throw new NullPointerException("'predicate' specified as non-null is null");
    }

    public final Flow<T> replay(long j) {
        return new FlowReplay(this, j);
    }

    public final Flow<T> singleOrEmpty() {
        return new FlowSingle(this);
    }

    public final Flow<T> subscribeOn(Executor executor) {
        if (executor != null) {
            return new FlowSubscribeOn(this, executor);
        }
        throw new NullPointerException("'executor' specified as non-null is null");
    }

    public final Flow<T> observeOn(Executor executor) {
        if (executor != null) {
            return new FlowObserveOn(this, executor);
        }
        throw new NullPointerException("'executor' specified as non-null is null");
    }

    public final Flow<T> doOnSubscribe(Action1<? super Subscription> action1) {
        if (action1 != null) {
            return new FlowDoOnLifecycle(this, action1, Functions.emptyAction());
        }
        throw new NullPointerException("'onSubscribe' specified as non-null is null");
    }

    public final Flow<T> doOnNext(Action1<? super T> action1) {
        if (action1 != null) {
            return new FlowDoOnEach(this, action1, Functions.emptyConsumer(), Functions.emptyAction());
        }
        throw new NullPointerException("'onNext' specified as non-null is null");
    }

    public final Flow<T> doOnError(Action1<? super Throwable> action1) {
        if (action1 != null) {
            return new FlowDoOnEach(this, Functions.emptyConsumer(), action1, Functions.emptyAction());
        }
        throw new NullPointerException("'onError' specified as non-null is null");
    }

    public final Flow<T> doOnComplete(Action0 action0) {
        if (action0 != null) {
            return new FlowDoOnEach(this, Functions.emptyConsumer(), Functions.emptyConsumer(), action0);
        }
        throw new NullPointerException("'onComplete' specified as non-null is null");
    }

    public final Flow<T> doOnTerminate(Action0 action0) {
        if (action0 != null) {
            return new FlowDoOnLifecycle(this, Functions.emptyConsumer(), action0);
        }
        throw new NullPointerException("'onTerminate' specified as non-null is null");
    }

    public final <U> Flow<U> map(Function1<? super T, ? extends U> function1) {
        if (function1 != null) {
            return new FlowMap(this, function1);
        }
        throw new NullPointerException("'mapper' specified as non-null is null");
    }

    public final <U> Flow<U> flatMap(Function1<? super T, ? extends Publisher<? extends U>> function1) {
        if (function1 != null) {
            return new FlowFlatMap(this, function1);
        }
        throw new NullPointerException("'mapper' specified as non-null is null");
    }

    public final T blockingGet() throws Exception {
        Disposable subscribe;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            AtomicReference atomicReference = new AtomicReference();
            atomicReference.getClass();
            subscribe = subscribe(new Action1(atomicReference) {
                public final /* synthetic */ AtomicReference f$0;

                {
                    this.f$0 = r1;
                }

                public final void invoke(Object obj) {
                    this.f$0.set(obj);
                }
            });
            countDownLatch.await();
            subscribe.dispose();
            throw new NoSuchElementException("Flow did not produce any values");
        } catch (InterruptedException e) {
            throw new Exception(e);
        } catch (Throwable th) {
            subscribe.dispose();
            throw th;
        }
    }

    public final void subscribe(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            try {
                subscribeActual(subscriber);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                subscriber.onError(th);
            }
        } else {
            throw new NullPointerException("'s' specified as non-null is null");
        }
    }

    public final Disposable subscribe(Action1<? super T> action1, Action1<? super Throwable> action12, Action0 action0) {
        if (action1 == null) {
            throw new NullPointerException("'onNext' specified as non-null is null");
        } else if (action12 == null) {
            throw new NullPointerException("'onError' specified as non-null is null");
        } else if (action0 != null) {
            return subscribeWith(new LambdaSubscriber(action1, action12, action0));
        } else {
            throw new NullPointerException("'onComplete' specified as non-null is null");
        }
    }

    public final Disposable subscribe(Action1<? super T> action1, Action1<? super Throwable> action12) {
        if (action1 == null) {
            throw new NullPointerException("'onNext' specified as non-null is null");
        } else if (action12 != null) {
            return subscribe(action1, action12, Functions.emptyAction());
        } else {
            throw new NullPointerException("'onError' specified as non-null is null");
        }
    }

    public final Disposable subscribe(Action1<? super T> action1, Action0 action0) {
        if (action1 == null) {
            throw new NullPointerException("'onNext' specified as non-null is null");
        } else if (action0 != null) {
            return subscribe(action1, Functions.emptyConsumer(), action0);
        } else {
            throw new NullPointerException("'onComplete' specified as non-null is null");
        }
    }

    public final Disposable subscribe(Action1<? super T> action1) {
        if (action1 != null) {
            return subscribe(action1, Functions.emptyConsumer(), Functions.emptyAction());
        }
        throw new NullPointerException("'onNext' specified as non-null is null");
    }

    public final Disposable subscribe() {
        return subscribe(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyAction());
    }

    public final Disposable subscribeWith(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            DisposableSubscriber disposableSubscriber = new DisposableSubscriber(subscriber);
            subscribe(disposableSubscriber);
            return disposableSubscriber;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    public final FlowTest<T> test() {
        FlowTest<T> flowTest = new FlowTest<>();
        subscribe(flowTest.subscriber);
        return flowTest;
    }
}
