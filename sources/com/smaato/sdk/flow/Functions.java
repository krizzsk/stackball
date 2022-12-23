package com.smaato.sdk.flow;

abstract class Functions {
    private static final Action0 EMPTY_ACTION_0 = $$Lambda$Functions$vYv2E1v20cZMAtjTACb5ZeKy8fA.INSTANCE;
    private static final Action1<?> EMPTY_ACTION_1 = $$Lambda$Functions$eZysAoiYjUxlWlVbeMTeKLgUSKM.INSTANCE;
    private static final Function1<?, ?> IDENTITY = $$Lambda$Functions$avap5j2NYyalIjTgp0pTO_xv4kg.INSTANCE;

    static /* synthetic */ void lambda$static$0() throws Throwable {
    }

    static /* synthetic */ void lambda$static$1(Object obj) throws Throwable {
    }

    static /* synthetic */ Object lambda$static$2(Object obj) throws Throwable {
        return obj;
    }

    static Action0 emptyAction() {
        return EMPTY_ACTION_0;
    }

    static <T> Action1<T> emptyConsumer() {
        return EMPTY_ACTION_1;
    }

    static <T> Function1<T, T> identity() {
        return IDENTITY;
    }
}
