package com.ironsource.mediationsdk.model;

public class InterstitialPlacement {

    /* renamed from: a */
    private int f13682a;

    /* renamed from: b */
    private String f13683b;

    /* renamed from: c */
    private boolean f13684c;

    /* renamed from: d */
    private C5729m f13685d;

    public InterstitialPlacement(int i, String str, boolean z, C5729m mVar) {
        this.f13682a = i;
        this.f13683b = str;
        this.f13684c = z;
        this.f13685d = mVar;
    }

    public C5729m getPlacementAvailabilitySettings() {
        return this.f13685d;
    }

    public int getPlacementId() {
        return this.f13682a;
    }

    public String getPlacementName() {
        return this.f13683b;
    }

    public boolean isDefault() {
        return this.f13684c;
    }

    public String toString() {
        return "placement name: " + this.f13683b;
    }
}
