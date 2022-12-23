package com.tapjoy.internal;

import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;

public class TJPlacementListenerNative implements TJPlacementListener {

    /* renamed from: a */
    private final long f22293a;

    private static native void onClickNative(long j, TJPlacement tJPlacement, String str);

    private static native void onContentDismissNative(long j, TJPlacement tJPlacement, String str);

    private static native void onContentReadyNative(long j, TJPlacement tJPlacement, String str);

    private static native void onContentShowNative(long j, TJPlacement tJPlacement, String str);

    private static native void onPurchaseRequestNative(long j, TJPlacement tJPlacement, String str, TJActionRequest tJActionRequest, String str2, String str3, String str4);

    private static native void onRequestFailureNative(long j, TJPlacement tJPlacement, String str, int i, String str2);

    private static native void onRequestSuccessNative(long j, TJPlacement tJPlacement, String str);

    private static native void onRewardRequestNative(long j, TJPlacement tJPlacement, String str, TJActionRequest tJActionRequest, String str2, String str3, String str4, int i);

    private TJPlacementListenerNative(long j) {
        if (j != 0) {
            this.f22293a = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void onRequestSuccess(TJPlacement tJPlacement) {
        onRequestSuccessNative(this.f22293a, tJPlacement, tJPlacement.getName());
    }

    public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
        onRequestFailureNative(this.f22293a, tJPlacement, tJPlacement.getName(), tJError.code, tJError.message);
    }

    public void onContentReady(TJPlacement tJPlacement) {
        onContentReadyNative(this.f22293a, tJPlacement, tJPlacement.getName());
    }

    public void onContentShow(TJPlacement tJPlacement) {
        onContentShowNative(this.f22293a, tJPlacement, tJPlacement.getName());
    }

    public void onContentDismiss(TJPlacement tJPlacement) {
        onContentDismissNative(this.f22293a, tJPlacement, tJPlacement.getName());
    }

    public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        onPurchaseRequestNative(this.f22293a, tJPlacement, tJPlacement.getName(), tJActionRequest, tJActionRequest.getRequestId(), tJActionRequest.getToken(), str);
    }

    public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        onRewardRequestNative(this.f22293a, tJPlacement, tJPlacement.getName(), tJActionRequest, tJActionRequest.getRequestId(), tJActionRequest.getToken(), str, i);
    }

    public void onClick(TJPlacement tJPlacement) {
        onClickNative(this.f22293a, tJPlacement, tJPlacement.getName());
    }

    static Object create(long j) {
        return new TJPlacementListenerNative(j);
    }
}
