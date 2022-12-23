package com.smaato.sdk.core.util.p251fi;

/* renamed from: com.smaato.sdk.core.util.fi.NullableFunction */
public interface NullableFunction<T, R> {
    R apply(T t);

    /* renamed from: com.smaato.sdk.core.util.fi.NullableFunction$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object lambda$identity$0(Object obj) {
            return obj;
        }

        public static <T> NullableFunction<T, T> identity() {
            return $$Lambda$NullableFunction$ybqyGb3em48ciXiIgEZzqWwEmds.INSTANCE;
        }
    }
}
