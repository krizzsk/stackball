package com.smaato.sdk.core.network.trackers;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.execution.ErrorMapper;
import com.smaato.sdk.core.network.execution.NetworkActions;
import com.smaato.sdk.core.network.execution.NetworkTask;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.p251fi.Function;
import java.util.concurrent.ExecutorService;

class BeaconTask extends NetworkTask<Whatever> {
    BeaconTask(Logger logger, NetworkActions networkActions, ErrorMapper<Exception> errorMapper, ExecutorService executorService, String str, SomaApiContext somaApiContext, Task.Listener<Whatever, Exception> listener) {
        super(executorService, new Function(str, somaApiContext, logger, errorMapper, listener) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ SomaApiContext f$2;
            public final /* synthetic */ Logger f$3;
            public final /* synthetic */ ErrorMapper f$4;
            public final /* synthetic */ Task.Listener f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final Object apply(Object obj) {
                return BeaconTask.createRunnable((NetworkTask) obj, NetworkActions.this, new BeaconNetworkRequest(this.f$1), this.f$2, $$Lambda$BeaconTask$PqAAnYwEeppkb3eWgQ89ar8XfI.INSTANCE, BeaconTask.standardResultHandler(this.f$3, this.f$4, (NetworkTask) obj, this.f$5));
            }
        });
    }
}
