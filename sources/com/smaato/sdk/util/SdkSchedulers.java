package com.smaato.sdk.util;

import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.inject.Providers;
import javax.inject.Singleton;

@Singleton
public class SdkSchedulers implements Schedulers {
    private final Provider<Scheduler> comp = Providers.doubleCheck($$Lambda$SdkSchedulers$NMJlAmqV827j7yUgXBnlAHdqUs.INSTANCE);

    /* renamed from: io */
    private final Provider<Scheduler> f21808io = Providers.doubleCheck($$Lambda$SdkSchedulers$p1B2uh1VzLZR8UJd2HH2Cz4j_JM.INSTANCE);
    private final Provider<Scheduler> main = Providers.doubleCheck($$Lambda$rqoEv55pgot2VkHLTBkP0YCq4do.INSTANCE);

    static /* synthetic */ Scheduler lambda$new$0() {
        return new AsyncScheduler(new SdkThreadFactory("io", 1));
    }

    static /* synthetic */ Scheduler lambda$new$1() {
        return new AsyncScheduler(new SdkThreadFactory("comp", 1));
    }

    /* renamed from: io */
    public final Scheduler mo56385io() {
        return this.f21808io.get();
    }

    public final Scheduler comp() {
        return this.comp.get();
    }

    public final Scheduler main() {
        return this.main.get();
    }
}
