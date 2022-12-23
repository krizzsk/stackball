package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.p037d.C2836g;

public interface InneractiveAdSpot {

    public interface RequestListener {
        void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot);
    }

    void addUnitController(InneractiveUnitController inneractiveUnitController);

    void destroy();

    C2836g getAdContent();

    InneractiveAdRequest getCurrentProcessedRequest();

    String getLocalUniqueId();

    InneractiveMediationName getMediationName();

    String getMediationNameString();

    String getMediationVersion();

    String getRequestedSpotId();

    InneractiveUnitController getSelectedUnitController();

    boolean isReady();

    void removeUnitController(InneractiveUnitController inneractiveUnitController);

    void requestAd(InneractiveAdRequest inneractiveAdRequest);

    void setMediationName(InneractiveMediationName inneractiveMediationName);

    void setMediationName(String str);

    void setMediationVersion(String str);

    void setRequestListener(RequestListener requestListener);

    public static abstract class RequestListenerAdapter implements RequestListener {
        public abstract void onInneractiveAdRequestResult(InneractiveAdSpot inneractiveAdSpot, boolean z, InneractiveErrorCode inneractiveErrorCode);

        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            onInneractiveAdRequestResult(inneractiveAdSpot, false, inneractiveErrorCode);
        }

        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            onInneractiveAdRequestResult(inneractiveAdSpot, true, (InneractiveErrorCode) null);
        }
    }
}
