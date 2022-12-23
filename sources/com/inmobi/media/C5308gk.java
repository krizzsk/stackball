package com.inmobi.media;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gk */
/* compiled from: CatchEvent */
public final class C5308gk extends C5279fp {

    /* renamed from: g */
    private static final String f12167g = C5313gn.class.getSimpleName();

    public C5308gk(Throwable th) {
        super("crashReporting", "catchEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", th.getClass().getSimpleName());
            jSONObject.put("message", th.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(th));
            jSONObject.put("thread", Thread.currentThread().getName());
            this.f12063f = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }
}
