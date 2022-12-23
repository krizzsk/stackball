package com.tapjoy;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.reflect.Method;

public class TapjoyAdIdClient {

    /* renamed from: a */
    private Context f22132a;

    /* renamed from: b */
    private String f22133b;

    /* renamed from: c */
    private boolean f22134c;

    public TapjoyAdIdClient(Context context) {
        this.f22132a = context;
    }

    public boolean setupAdIdInfo() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f22132a);
            this.f22133b = advertisingIdInfo.getId();
            this.f22134c = !advertisingIdInfo.isLimitAdTrackingEnabled();
            return true;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public boolean setupAdIdInfoReflection() {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Method method = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class});
            TapjoyLog.m24273d("TapjoyAdIdClient", "Found method: " + method);
            Object invoke = method.invoke(cls, new Object[]{this.f22132a});
            Method method2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
            Method method3 = invoke.getClass().getMethod("getId", new Class[0]);
            this.f22134c = !((Boolean) method2.invoke(invoke, new Object[0])).booleanValue();
            this.f22133b = (String) method3.invoke(invoke, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public String getAdvertisingId() {
        return this.f22133b;
    }

    public boolean isAdTrackingEnabled() {
        return this.f22134c;
    }
}
