package com.smaato.sdk.core.util.memory;

import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.core.util.memory.-$$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8 implements Consumer {
    public static final /* synthetic */ $$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8 INSTANCE = new $$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8();

    private /* synthetic */ $$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8() {
    }

    public final void accept(Object obj) {
        ((DiRegistry) obj).registerSingletonFactory(LeakProtection.class, $$Lambda$DiLeakProtection$SKNpYwv2H1tw5txLfFqj5UX3cGo.INSTANCE);
    }
}
