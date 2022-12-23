package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.chartboost.sdk.impl.x */
public class C2014x {

    /* renamed from: b */
    private static C2014x f5196b = new C2014x(new Handler(Looper.getMainLooper()));

    /* renamed from: a */
    public final Handler f5197a;

    public C2014x(Handler handler) {
        this.f5197a = handler;
    }

    /* renamed from: b */
    public static C2014x m4911b() {
        return f5196b;
    }

    /* renamed from: a */
    public boolean mo14883a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: c */
    public boolean mo14885c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public String mo14882a() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: a */
    public AdvertisingIdClient.Info mo14881a(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException, IllegalStateException {
        return AdvertisingIdClient.getAdvertisingIdInfo(context);
    }

    /* renamed from: a */
    public boolean mo14884a(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }

    /* renamed from: a */
    public Bitmap mo14880a(byte[] bArr) {
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, (BitmapFactory.Options) null);
    }
}
