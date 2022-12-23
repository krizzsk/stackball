package com.mbridge.msdk.mbbid.common;

/* renamed from: com.mbridge.msdk.mbbid.common.b */
/* compiled from: BidRequestParams */
public abstract class C6519b {

    /* renamed from: a */
    private String f16269a;

    /* renamed from: b */
    private String f16270b;

    /* renamed from: c */
    private String f16271c;

    public C6519b(String str, String str2) {
        this.f16269a = str;
        this.f16270b = str2;
    }

    public C6519b(String str, String str2, String str3) {
        this.f16269a = str;
        this.f16270b = str2;
        this.f16271c = str3;
    }

    public String getmUnitId() {
        return this.f16270b;
    }

    public void setmUnitId(String str) {
        this.f16270b = str;
    }

    public String getmFloorPrice() {
        return this.f16271c;
    }

    public void setmFloorPrice(String str) {
        this.f16271c = str;
    }

    public String getmPlacementId() {
        return this.f16269a;
    }

    public void setmPlacementId(String str) {
        this.f16269a = str;
    }
}
