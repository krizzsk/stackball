package com.smaato.sdk.p246ad;

import com.smaato.sdk.flow.Action0;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Function1;
import com.smaato.sdk.flow.Publisher;
import com.smaato.sdk.net.HttpClient;
import com.smaato.sdk.net.Request;
import com.smaato.sdk.net.Response;
import com.smaato.sdk.util.Schedulers;
import java.util.Arrays;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.smaato.sdk.ad.BeaconTrackerImpl */
public class BeaconTrackerImpl implements BeaconTracker {
    private final HttpClient defaultHttpClient;
    private final Schedulers schedulers;

    @Inject
    BeaconTrackerImpl(HttpClient httpClient, Schedulers schedulers2) {
        this.defaultHttpClient = httpClient;
        this.schedulers = schedulers2;
    }

    public Flow<Void> track(String... strArr) {
        if (strArr != null) {
            return track((Iterable<String>) Arrays.asList(strArr));
        }
        throw new NullPointerException("'urls' specified as non-null is null");
    }

    public Flow<Void> track(Iterable<String> iterable) {
        if (iterable != null) {
            return Flow.fromIterable(iterable).map($$Lambda$G8qTakO08zK1tdaNtZOWBwFF5SU.INSTANCE).flatMap(new Function1() {
                public final Object apply(Object obj) {
                    return BeaconTrackerImpl.this.lambda$track$1$BeaconTrackerImpl((Request) obj);
                }
            }).subscribeOn(this.schedulers.mo56385io());
        }
        throw new NullPointerException("'urls' specified as non-null is null");
    }

    public /* synthetic */ Publisher lambda$track$1$BeaconTrackerImpl(Request request) throws Throwable {
        return Flow.fromAction(new Action0(request) {
            public final /* synthetic */ Request f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke() {
                BeaconTrackerImpl.this.lambda$null$0$BeaconTrackerImpl(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$null$0$BeaconTrackerImpl(Request request) throws Throwable {
        Response execute = this.defaultHttpClient.newCall(request).execute();
        if (execute != null) {
            execute.close();
        }
    }
}
