package com.mbridge.msdk.mbbid.out;

public class BannerBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a */
    private int f16276a;

    /* renamed from: b */
    private int f16277b;

    public BannerBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f16276a = i2;
        this.f16277b = i;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f16276a = i2;
        this.f16277b = i;
    }

    public int getHeight() {
        return this.f16276a;
    }

    public void setHeight(int i) {
        this.f16276a = i;
    }

    public int getWidth() {
        return this.f16277b;
    }

    public void setWidth(int i) {
        this.f16277b = i;
    }
}
