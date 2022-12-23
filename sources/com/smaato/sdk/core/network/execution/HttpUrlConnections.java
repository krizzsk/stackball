package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.CheckedRunnable;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicReference;

final class HttpUrlConnections {
    private HttpUrlConnections() {
    }

    /* access modifiers changed from: package-private */
    public static void ensureConnectionResourcesReleased(AtomicReference<HttpURLConnection> atomicReference) {
        Objects.onNotNull(atomicReference.get(), $$Lambda$zqR6JB9Ki0AJvwaXI9pnZ57Lhs.INSTANCE);
    }

    static void ensureConnectionResourcesReleased(HttpURLConnection httpURLConnection) {
        Objects.doSilently(new CheckedRunnable(httpURLConnection) {
            public final /* synthetic */ HttpURLConnection f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.getInputStream().close();
            }
        });
        Objects.doSilently(new CheckedRunnable(httpURLConnection) {
            public final /* synthetic */ HttpURLConnection f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.getErrorStream().close();
            }
        });
        httpURLConnection.disconnect();
    }
}
