package com.ogury.sdk.internal;

import android.content.SharedPreferences;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ogury.sdk.internal.i */
/* compiled from: MonitoringInfoStorage.kt */
public final class C8562i {

    /* renamed from: a */
    private final SharedPreferences f21784a;

    /* renamed from: b */
    private final C8559g f21785b;

    static {
        new C8563a((byte) 0);
    }

    public C8562i(C8565k kVar, C8559g gVar) {
        C8567m.m24059b(kVar, "sharedPreferencesCreator");
        C8567m.m24059b(gVar, "monitoringInfoJsonSerializer");
        this.f21785b = gVar;
        this.f21784a = kVar.mo54047a("ogury_monitoring_info_file");
    }

    /* renamed from: a */
    public final C8552b mo54044a() {
        String str = "";
        try {
            String string = this.f21784a.getString("mInfo", str);
            if (string != null) {
                str = string;
            }
            C8567m.m24057a((Object) str, "sharedPreferences.getString(SP_KEY, \"\") ?: \"\"");
            C8567m.m24059b(str, "jsonString");
            C8552b bVar = new C8552b();
            if (!(str.length() == 0)) {
                C8567m.m24059b(str, "jsonString");
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bVar.mo54025a(next, jSONObject.getString(next));
                }
            }
            return bVar;
        } catch (Exception unused) {
            return new C8552b();
        }
    }

    /* renamed from: a */
    public final void mo54045a(C8552b bVar) {
        if (bVar != null) {
            try {
                this.f21784a.edit().putString("mInfo", this.f21785b.mo54042a(bVar)).apply();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo54046b() {
        this.f21784a.edit().clear().apply();
    }

    /* renamed from: com.ogury.sdk.internal.i$a */
    /* compiled from: MonitoringInfoStorage.kt */
    public static final class C8563a {
        private C8563a() {
        }

        public /* synthetic */ C8563a(byte b) {
            this();
        }
    }
}
