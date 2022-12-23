package com.appsflyer.internal.model.event;

import android.content.Context;
import com.appsflyer.AFEvent;
import com.appsflyer.AFHelper;

public abstract class BackgroundEvent extends AFEvent {

    /* renamed from: Ɩ */
    private final boolean f4214;

    /* renamed from: ȷ */
    private final boolean f4215;

    /* renamed from: і */
    private boolean f4216;

    BackgroundEvent() {
        this((String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Context) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundEvent(String str, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        boolean z = true;
        this.f4214 = bool != null ? bool.booleanValue() : true;
        this.f4215 = bool2 != null ? bool2.booleanValue() : z;
    }

    public BackgroundEvent trackingStopped(boolean z) {
        this.f4216 = z;
        return this;
    }

    public boolean trackingStopped() {
        return this.f4216;
    }

    public boolean readResponse() {
        return this.f4214;
    }

    public boolean proxyMode() {
        return this.f4215;
    }

    public String body() {
        return AFHelper.toJsonObject(params()).toString();
    }
}
