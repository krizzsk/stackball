package com.ironsource.mediationsdk.model;

public class Placement {

    /* renamed from: a */
    private int f13700a;

    /* renamed from: b */
    private String f13701b;

    /* renamed from: c */
    private boolean f13702c;

    /* renamed from: d */
    private String f13703d;

    /* renamed from: e */
    private int f13704e;

    /* renamed from: f */
    private C5729m f13705f;

    public Placement(int i, String str, boolean z, String str2, int i2, C5729m mVar) {
        this.f13700a = i;
        this.f13701b = str;
        this.f13702c = z;
        this.f13703d = str2;
        this.f13704e = i2;
        this.f13705f = mVar;
    }

    public C5729m getPlacementAvailabilitySettings() {
        return this.f13705f;
    }

    public int getPlacementId() {
        return this.f13700a;
    }

    public String getPlacementName() {
        return this.f13701b;
    }

    public int getRewardAmount() {
        return this.f13704e;
    }

    public String getRewardName() {
        return this.f13703d;
    }

    public boolean isDefault() {
        return this.f13702c;
    }

    public String toString() {
        return "placement name: " + this.f13701b + ", reward name: " + this.f13703d + " , amount: " + this.f13704e;
    }
}
