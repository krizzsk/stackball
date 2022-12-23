package com.mbridge.msdk.mbbid.out;

public class BidLossCode {

    /* renamed from: a */
    private static int f16278a;

    private BidLossCode(int i) {
        f16278a = i;
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(3001);
    }

    public int getCurrentCode() {
        return f16278a;
    }
}
