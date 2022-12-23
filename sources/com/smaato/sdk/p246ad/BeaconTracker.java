package com.smaato.sdk.p246ad;

import com.smaato.sdk.flow.Flow;

/* renamed from: com.smaato.sdk.ad.BeaconTracker */
public interface BeaconTracker {
    Flow<Void> track(Iterable<String> iterable);

    Flow<Void> track(String... strArr);
}
