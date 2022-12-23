package com.smaato.sdk.core.network.execution;

import java.io.IOException;

@FunctionalInterface
public interface IoFunction<I, R> {
    R apply(I i) throws IOException;
}
