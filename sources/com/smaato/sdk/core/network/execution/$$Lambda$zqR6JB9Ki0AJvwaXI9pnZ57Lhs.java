package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.util.p251fi.Consumer;
import java.net.HttpURLConnection;

/* renamed from: com.smaato.sdk.core.network.execution.-$$Lambda$zqR6JB9Ki0AJvwaXI9pn-Z57Lhs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$zqR6JB9Ki0AJvwaXI9pnZ57Lhs implements Consumer {
    public static final /* synthetic */ $$Lambda$zqR6JB9Ki0AJvwaXI9pnZ57Lhs INSTANCE = new $$Lambda$zqR6JB9Ki0AJvwaXI9pnZ57Lhs();

    private /* synthetic */ $$Lambda$zqR6JB9Ki0AJvwaXI9pnZ57Lhs() {
    }

    public final void accept(Object obj) {
        HttpUrlConnections.ensureConnectionResourcesReleased((HttpURLConnection) obj);
    }
}
