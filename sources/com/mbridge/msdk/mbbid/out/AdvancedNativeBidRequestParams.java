package com.mbridge.msdk.mbbid.out;

public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a */
    private int f16274a;

    /* renamed from: b */
    private int f16275b;

    public AdvancedNativeBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f16274a = i2;
        this.f16275b = i;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f16274a = i2;
        this.f16275b = i;
    }

    public int getHeight() {
        return this.f16274a;
    }

    public void setHeight(int i) {
        this.f16274a = i;
    }

    public int getWidth() {
        return this.f16275b;
    }

    public void setWidth(int i) {
        this.f16275b = i;
    }
}
