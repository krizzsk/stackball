package com.amazon.device.ads;

class AdSlot {
    private final String KEY_SLOT_ID = "slotId";
    private final AdController adController;
    private AdError adError;
    private final AdTargetingOptions adOptions;
    private boolean deferredLoad = false;
    private final String slotID;
    private int slotNumber;

    AdSlot(AdController adController2, AdTargetingOptions adTargetingOptions) {
        this.adController = adController2;
        if (adTargetingOptions == null) {
            this.adOptions = new AdTargetingOptions();
            this.slotID = null;
            return;
        }
        this.adOptions = adTargetingOptions;
        this.slotID = adTargetingOptions.getAdvancedOption("slotId");
    }

    public AdSlot setDeferredLoad(boolean z) {
        this.deferredLoad = z;
        return this;
    }

    public AdTargetingOptions getAdTargetingOptions() {
        return this.adOptions;
    }

    public AdSize getRequestedAdSize() {
        return this.adController.getAdSize();
    }

    /* access modifiers changed from: package-private */
    public void setSlotNumber(int i) {
        this.slotNumber = i;
    }

    /* access modifiers changed from: package-private */
    public int getSlotNumber() {
        return this.slotNumber;
    }

    /* access modifiers changed from: package-private */
    public void setAdError(AdError adError2) {
        this.adError = adError2;
    }

    /* access modifiers changed from: package-private */
    public AdError getAdError() {
        return this.adError;
    }

    /* access modifiers changed from: package-private */
    public String getMaxSize() {
        return this.adController.getMaxSize();
    }

    /* access modifiers changed from: package-private */
    public MetricsCollector getMetricsCollector() {
        return this.adController.getMetricsCollector();
    }

    /* access modifiers changed from: package-private */
    public void setAdData(AdData adData) {
        this.adController.setAdData(adData);
    }

    /* access modifiers changed from: package-private */
    public boolean isFetched() {
        return this.adController.getAdData() != null && this.adController.getAdData().getIsFetched();
    }

    /* access modifiers changed from: package-private */
    public void adFailed(AdError adError2) {
        this.adController.adFailed(adError2);
    }

    /* access modifiers changed from: package-private */
    public void initializeAd() {
        this.adController.initialize(this.slotID);
    }

    /* access modifiers changed from: package-private */
    public boolean prepareForAdLoad(long j) {
        return this.adController.prepareForAdLoad(j, this.deferredLoad);
    }

    /* access modifiers changed from: package-private */
    public boolean isValid() {
        return this.adController.isValid();
    }

    /* access modifiers changed from: package-private */
    public void setConnectionInfo(ConnectionInfo connectionInfo) {
        this.adController.setConnectionInfo(connectionInfo);
    }

    /* access modifiers changed from: package-private */
    public boolean canBeUsed() {
        return this.adController.canBeUsed();
    }
}
