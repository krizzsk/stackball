package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.os.Build;
import com.ironsource.environment.C5517c;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.b */
public abstract class C6044b implements C6046d {

    /* renamed from: a */
    public C6045c f14813a;

    protected C6044b(JSONObject jSONObject, Context context) {
        C6045c cVar;
        if (jSONObject.optInt("connectivityStrategy") == 1) {
            cVar = new C6043a(this);
        } else {
            cVar = (Build.VERSION.SDK_INT < 23 || !C5517c.m13104b(context, "android.permission.ACCESS_NETWORK_STATE")) ? new C6043a(this) : new C6047e(this);
        }
        this.f14813a = cVar;
        String simpleName = C6044b.class.getSimpleName();
        Logger.m14957i(simpleName, "created ConnectivityAdapter with strategy " + this.f14813a.getClass().getSimpleName());
    }

    /* renamed from: a */
    public void mo42352a() {
    }

    /* renamed from: a */
    public final void mo42589a(Context context) {
        this.f14813a.mo42586a(context);
    }

    /* renamed from: a */
    public void mo42353a(String str) {
    }

    /* renamed from: a */
    public void mo42354a(String str, JSONObject jSONObject) {
    }

    /* renamed from: b */
    public final void mo42590b(Context context) {
        this.f14813a.mo42587b(context);
    }
}
