package com.appsflyer;

public class AdvertisingIdObject {

    /* renamed from: ı */
    private final String f4006;

    /* renamed from: ǃ */
    private final Boolean f4007;

    /* renamed from: ɩ */
    private Boolean f4008;

    AdvertisingIdObject(String str, Boolean bool) {
        this.f4006 = str;
        this.f4007 = bool;
    }

    public Boolean isManual() {
        return this.f4008;
    }

    public void setManual(boolean z) {
        this.f4008 = Boolean.valueOf(z);
    }

    public String getAdvertisingId() {
        return this.f4006;
    }

    public Boolean isLimitAdTracking() {
        return this.f4007;
    }
}
