package com.ogury.p245ed.internal;

import android.util.SparseArray;
import com.ogury.core.OguryError;
import com.ogury.p245ed.OguryAdFormatErrorCode;

/* renamed from: com.ogury.ed.internal.d */
public final class C8128d {

    /* renamed from: a */
    public static final C8128d f21064a = new C8128d();

    /* renamed from: b */
    private static final SparseArray<OguryError> f21065b;

    private C8128d() {
    }

    static {
        SparseArray<OguryError> sparseArray = new SparseArray<>();
        sparseArray.put(0, new OguryError(2000, "The ad failed to load"));
        sparseArray.put(1, new OguryError(0, "The device has no internet connection"));
        sparseArray.put(2, new OguryError(2001, "Ad serving has been disabled for this placement/application"));
        sparseArray.put(3, new OguryError(2002, "An internal SDK error occurred"));
        sparseArray.put(4, new OguryError(2003, "The loaded ad is expired. You must call the show method within 4 hours after the load."));
        sparseArray.put(5, new OguryError(2004, "The start method has not been called before a call to the load or show methods."));
        sparseArray.put(6, new OguryError(2006, "An error occurred during the initialization of the SDK."));
        sparseArray.put(7, new OguryError(OguryAdFormatErrorCode.ACTIVITY_IN_BACKGROUND, "Showing an ad while the application is in background is not allowed"));
        sparseArray.put(8, new OguryError(2005, "Another ad is already displayed on the screen."));
        sparseArray.put(9, new OguryError(OguryAdFormatErrorCode.SHOW_FAILED, "The ad failed to show"));
        f21065b = sparseArray;
    }

    /* renamed from: a */
    public static OguryError m22651a(int i) {
        OguryError oguryError = f21065b.get(i, new OguryError(i, "Unkown error"));
        C8467mq.m23878a((Object) oguryError, "errors.get(oldError, Ogu…orMessages.UNKOWN_ERROR))");
        return oguryError;
    }
}
