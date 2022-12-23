package com.ironsource.mediationsdk.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0012"}, mo72093d2 = {"Lcom/ironsource/mediationsdk/utils/ApplicationGeneralSettings;", "", "isExternalArmEventsEnabled", "", "externalArmEventsUrl", "", "(ZLjava/lang/String;)V", "getExternalArmEventsUrl", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "mediationsdk_release"}, mo72094k = 1, mo72095mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.utils.a */
public final class C5788a {

    /* renamed from: a */
    public final boolean f13911a;

    /* renamed from: b */
    public final String f13912b;

    public C5788a() {
        this(false, (String) null, 3);
    }

    public C5788a(boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "externalArmEventsUrl");
        this.f13911a = z;
        this.f13912b = str;
    }

    private /* synthetic */ C5788a(boolean z, String str, int i) {
        this(true, "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5788a)) {
            return false;
        }
        C5788a aVar = (C5788a) obj;
        return this.f13911a == aVar.f13911a && Intrinsics.areEqual((Object) this.f13912b, (Object) aVar.f13912b);
    }

    public final int hashCode() {
        boolean z = this.f13911a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f13912b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationGeneralSettings(isExternalArmEventsEnabled=" + this.f13911a + ", externalArmEventsUrl=" + this.f13912b + ")";
    }
}
