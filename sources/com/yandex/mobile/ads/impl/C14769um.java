package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import com.yandex.android.beacon.SendBeaconManager;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.um */
public class C14769um {

    /* renamed from: a */
    private final xi0<SendBeaconManager> f40795a;

    /* renamed from: b */
    private final boolean f40796b;

    /* renamed from: c */
    private final boolean f40797c;

    @Inject
    public C14769um(xi0<SendBeaconManager> xi0, @Named("tap_beacons_enabled") boolean z, @Named("visibility_beacons_enabled") boolean z2) {
        Intrinsics.checkNotNullParameter(xi0, "sendBeaconManagerLazy");
        this.f40795a = xi0;
        this.f40796b = z;
        this.f40797c = z2;
    }

    /* renamed from: a */
    public void mo70373a(C14687tm tmVar, j50 j50) {
        SendBeaconManager sendBeaconManager;
        Intrinsics.checkNotNullParameter(tmVar, "action");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        f50<Uri> f50 = tmVar.f40359c;
        Uri a = f50 == null ? null : f50.mo66924a(j50);
        if (this.f40796b && a != null && (sendBeaconManager = this.f40795a.get()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            f50<Uri> f502 = tmVar.f40362f;
            if (f502 != null) {
                String uri = f502.mo66924a(j50).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "referer.evaluate(resolver).toString()");
                linkedHashMap.put(HttpHeaders.REFERER, uri);
            }
            sendBeaconManager.addUrl(a, linkedHashMap, tmVar.f40361e);
        }
    }

    /* renamed from: a */
    public void mo70372a(m10 m10, j50 j50) {
        SendBeaconManager sendBeaconManager;
        Intrinsics.checkNotNullParameter(m10, "action");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        f50<Uri> f50 = m10.f37157f;
        Uri a = f50 == null ? null : f50.mo66924a(j50);
        if (this.f40797c && a != null && (sendBeaconManager = this.f40795a.get()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            f50<Uri> f502 = m10.f37156e;
            if (f502 != null) {
                String uri = f502.mo66924a(j50).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "referer.evaluate(resolver).toString()");
                linkedHashMap.put(HttpHeaders.REFERER, uri);
            }
            sendBeaconManager.addUrl(a, linkedHashMap, m10.f37155d);
        }
    }
}
