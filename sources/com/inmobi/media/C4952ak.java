package com.inmobi.media;

import android.net.Uri;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ak */
/* compiled from: AdAssetFetcher */
public final class C4952ak {

    /* renamed from: b */
    private static final String f11219b = C4952ak.class.getSimpleName();

    /* renamed from: a */
    C4969as f11220a;

    C4952ak(C4969as asVar) {
        this.f11220a = asVar;
    }

    /* renamed from: a */
    static String m11176a(C4949ai aiVar, File file, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", aiVar.f11192d);
            jSONObject.put("saved_url", Uri.fromFile(file));
            jSONObject.put("size_in_bytes", file.length());
            jSONObject.put("download_started_at", j);
            jSONObject.put("download_ended_at", j2);
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
        return jSONObject.toString().replace("\"", "\\\"");
    }

    /* renamed from: a */
    static void m11177a(long j, long j2, long j3) {
        try {
            C5369hy.m12420a().mo40732a(0);
            C5369hy.m12420a().mo40733b(j2);
            C5369hy.m12420a().mo40734c(j3 - j);
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }
}
