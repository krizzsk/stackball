package com.inmobi.media;

import android.content.ContentValues;
import android.util.Log;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fp */
/* compiled from: CrashEvent */
public class C5279fp {

    /* renamed from: g */
    private static final String f12057g = C5279fp.class.getSimpleName();

    /* renamed from: a */
    int f12058a;

    /* renamed from: b */
    String f12059b;

    /* renamed from: c */
    String f12060c;

    /* renamed from: d */
    String f12061d;

    /* renamed from: e */
    long f12062e;

    /* renamed from: f */
    protected String f12063f;

    public C5279fp(Thread thread, Throwable th) {
        this("crashReporting", "CrashEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", th.getClass().getSimpleName());
            jSONObject.put("message", th.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(th));
            jSONObject.put("thread", thread.getName());
            this.f12063f = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public C5279fp(String str, String str2) {
        this.f12059b = UUID.randomUUID().toString();
        this.f12061d = str;
        this.f12060c = str2;
        this.f12063f = null;
        this.f12062e = System.currentTimeMillis();
    }

    private C5279fp(String str, String str2, String str3, String str4) {
        this.f12059b = str;
        this.f12061d = str2;
        this.f12060c = str3;
        this.f12063f = str4;
        this.f12062e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final String mo40601a() {
        String str = this.f12063f;
        return str == null ? "" : str;
    }

    public String toString() {
        return this.f12060c + "@" + this.f12061d + " ";
    }

    /* renamed from: a */
    public static C5279fp m12086a(ContentValues contentValues) {
        String asString = contentValues.getAsString("eventId");
        String asString2 = contentValues.getAsString("eventType");
        String asString3 = contentValues.getAsString("componentType");
        String asString4 = contentValues.getAsString("payload");
        long longValue = Long.valueOf(contentValues.getAsString("ts")).longValue();
        C5279fp fpVar = new C5279fp(asString, asString3, asString2, asString4);
        fpVar.f12062e = longValue;
        fpVar.f12058a = contentValues.getAsInteger("id").intValue();
        return fpVar;
    }
}
