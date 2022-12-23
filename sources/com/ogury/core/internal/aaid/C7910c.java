package com.ogury.core.internal.aaid;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import android.provider.Settings;
import com.ogury.core.internal.C7921ai;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.core.internal.aaid.c */
/* compiled from: AdvertisingIdClient.kt */
public final class C7910c {

    /* renamed from: a */
    public static final C7910c f20683a = new C7910c();

    private C7910c() {
    }

    /* renamed from: b */
    private static C7908a m22124b(Context context) {
        C7909b bVar = new C7909b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        ServiceConnection serviceConnection = bVar;
        if (!context.bindService(intent, serviceConnection, 1)) {
            return null;
        }
        try {
            C7911d dVar = new C7911d(bVar.mo52885a(), "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return new C7908a(dVar.mo52889a(), dVar.mo52890a(true));
        } catch (Exception unused) {
            return null;
        } finally {
            context.unbindService(serviceConnection);
        }
    }

    /* renamed from: c */
    private static C7908a m22125c(Context context) {
        C7909b bVar = new C7909b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        ServiceConnection serviceConnection = bVar;
        if (!context.bindService(intent, serviceConnection, 1)) {
            return null;
        }
        try {
            C7911d dVar = new C7911d(bVar.mo52885a(), "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return new C7908a(dVar.mo52889a(), dVar.mo52890a(true));
        } catch (Exception unused) {
            return null;
        } finally {
            context.unbindService(serviceConnection);
        }
    }

    /* renamed from: d */
    private static C7908a m22126d(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            String string = Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID);
            boolean z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0;
            if (string != null) {
                return new C7908a(string, z);
            }
            throw new IllegalStateException("Amazon Fire TV Ad Id is null".toString());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C7908a mo52888a(Context context) throws Exception {
        C7921ai.m22144b(context, "context");
        if (!C7921ai.m22143a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            C7908a b = m22124b(context);
            if (b != null) {
                return b;
            }
            C7908a c = m22125c(context);
            if (c != null) {
                return c;
            }
            C7908a d = m22126d(context);
            if (d != null) {
                return d;
            }
            return null;
        }
        throw new IllegalStateException("Cannot be called from the main thread".toString());
    }
}
