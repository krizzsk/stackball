package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.concurrent.Future;

/* renamed from: com.smaato.sdk.core.network.execution.-$$Lambda$NetworkTask$vdSwBaGZJKC6VlAg8CpBZ8aPcgQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$NetworkTask$vdSwBaGZJKC6VlAg8CpBZ8aPcgQ implements Consumer {
    public static final /* synthetic */ $$Lambda$NetworkTask$vdSwBaGZJKC6VlAg8CpBZ8aPcgQ INSTANCE = new $$Lambda$NetworkTask$vdSwBaGZJKC6VlAg8CpBZ8aPcgQ();

    private /* synthetic */ $$Lambda$NetworkTask$vdSwBaGZJKC6VlAg8CpBZ8aPcgQ() {
    }

    public final void accept(Object obj) {
        ((Future) obj).cancel(true);
    }
}
