package com.smaato.sdk.util;

@FunctionalInterface
public interface BiConsumer<T1, T2> {
    public static final BiConsumer<?, ?> EMPTY = $$Lambda$BiConsumer$BiSqMpSizG6TvyQ6u2pCk3bQ1lM.INSTANCE;

    void accept(T1 t1, T2 t2);

    /* renamed from: com.smaato.sdk.util.BiConsumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void lambda$static$0(Object obj, Object obj2) {
        }

        public static <T1, T2> BiConsumer<T1, T2> empty() {
            return BiConsumer.EMPTY;
        }
    }
}
