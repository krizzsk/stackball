package com.smaato.sdk.core.network.trackers;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationException;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationOnRedirectException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Whatever;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BeaconTracker {
    /* access modifiers changed from: private */
    public final BeaconTrackerAdQualityViolationUtils adQualityViolationUtils;
    private final BeaconsExecutioner beaconsExecutioner;
    /* access modifiers changed from: private */
    public final Logger logger;

    public BeaconTracker(Logger logger2, BeaconsExecutioner beaconsExecutioner2, BeaconTrackerAdQualityViolationUtils beaconTrackerAdQualityViolationUtils) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for BeaconTracker");
        this.beaconsExecutioner = (BeaconsExecutioner) Objects.requireNonNull(beaconsExecutioner2, "Parameter beaconsExecutioner cannot be null for BeaconTracker");
        this.adQualityViolationUtils = (BeaconTrackerAdQualityViolationUtils) Objects.requireNonNull(beaconTrackerAdQualityViolationUtils);
    }

    public void trackBeaconUrls(Collection<String> collection, SomaApiContext somaApiContext) {
        trackBeaconUrls(collection, somaApiContext, (Task.Listener<Whatever, Exception>) null);
    }

    public void trackBeaconUrls(Collection<String> collection, SomaApiContext somaApiContext, Task.Listener<Whatever, Exception> listener) {
        Objects.requireNonNull(collection, "Parameter urls cannot be null for BeaconTracker::trackBeaconUrls");
        Objects.requireNonNull(somaApiContext, "Parameter somaApiContext cannot be null for BeaconTracker::trackBeaconUrls");
        Iterator it = new ArrayList(collection).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                trackBeaconUrl(str, somaApiContext, listener);
            }
        }
    }

    public void trackBeaconUrl(final String str, final SomaApiContext somaApiContext, final Task.Listener<Whatever, Exception> listener) {
        Objects.requireNonNull(str, "Parameter url cannot be null for BeaconTracker::trackBeaconUrl");
        this.beaconsExecutioner.submitRequest(str, somaApiContext, (Task.Listener<Whatever, Exception>) new Task.Listener<Whatever, Exception>() {
            public void onSuccess(Task task, Whatever whatever) {
                BeaconTracker.this.logger.info(LogDomain.NETWORK, "Beacon was tracked successfully %s", str);
                Task.Listener listener = listener;
                if (listener != null) {
                    listener.onSuccess(task, whatever);
                }
            }

            public void onFailure(Task task, Exception exc) {
                BeaconTracker.this.logger.error(LogDomain.NETWORK, exc, "Tracking Beacon failed with error [url: %s]", str);
                BeaconTrackerAdQualityViolationUtils access$100 = BeaconTracker.this.adQualityViolationUtils;
                SomaApiContext somaApiContext = somaApiContext;
                if (exc instanceof HttpsOnlyPolicyViolationException) {
                    access$100.adQualityViolationReporter.reportAdViolation("SOMAAdViolationSSLBeacon", somaApiContext, ((HttpsOnlyPolicyViolationException) exc).violatedUrl, somaApiContext.getApiAdResponse().getRequestUrl());
                } else if (exc instanceof HttpsOnlyPolicyViolationOnRedirectException) {
                    HttpsOnlyPolicyViolationOnRedirectException httpsOnlyPolicyViolationOnRedirectException = (HttpsOnlyPolicyViolationOnRedirectException) exc;
                    access$100.adQualityViolationReporter.reportAdViolation("SOMAAdViolationSSLBeaconHTTPRedirect", somaApiContext, httpsOnlyPolicyViolationOnRedirectException.violatedUrl, httpsOnlyPolicyViolationOnRedirectException.originalUrl);
                }
                Task.Listener listener = listener;
                if (listener != null) {
                    listener.onFailure(task, exc);
                }
            }
        }).start();
    }

    public void trackBeaconUrl(String str, SomaApiContext somaApiContext) {
        trackBeaconUrl(str, somaApiContext, (Task.Listener<Whatever, Exception>) null);
    }
}
