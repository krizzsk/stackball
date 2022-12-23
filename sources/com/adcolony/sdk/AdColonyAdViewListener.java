package com.adcolony.sdk;

public abstract class AdColonyAdViewListener {

    /* renamed from: a */
    String f115a = "";

    /* renamed from: b */
    AdColonyAdSize f116b;

    /* renamed from: c */
    C0742k0 f117c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAdSize mo9256a() {
        return this.f116b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0742k0 mo9260b() {
        return this.f117c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9261c() {
        return this.f115a;
    }

    public void onClicked(AdColonyAdView adColonyAdView) {
    }

    public void onClosed(AdColonyAdView adColonyAdView) {
    }

    public void onLeftApplication(AdColonyAdView adColonyAdView) {
    }

    public void onOpened(AdColonyAdView adColonyAdView) {
    }

    public abstract void onRequestFilled(AdColonyAdView adColonyAdView);

    public void onRequestNotFilled(AdColonyZone adColonyZone) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9258a(C0742k0 k0Var) {
        this.f117c = k0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9259a(String str) {
        this.f115a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9257a(AdColonyAdSize adColonyAdSize) {
        this.f116b = adColonyAdSize;
    }
}
