package com.inmobi.media;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.aw */
/* compiled from: ClickDao */
public class C4982aw {

    /* renamed from: a */
    static final String[] f11301a = {"id", "pending_attempts", "url", "ping_in_webview", "follow_redirect", "ts", "created_ts", "track_extras"};

    /* renamed from: b */
    private static final String f11302b = C4982aw.class.getSimpleName();

    C4982aw() {
        C5306gi a = C5306gi.m12146a();
        a.mo40638a("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )");
        a.mo40641b();
    }

    /* renamed from: a */
    public static boolean m11335a() {
        return C5306gi.m12146a().mo40633a("click") == 0;
    }

    /* renamed from: a */
    public final synchronized void mo40132a(C4981av avVar, int i) {
        ContentValues b = m11336b(avVar);
        C5306gi a = C5306gi.m12146a();
        if (a.mo40633a("click") >= i) {
            m11334a(m11332a(a.mo40636a("click", f11301a, "ts= (SELECT MIN(ts) FROM click LIMIT 1)", (String[]) null, (String) null, (String) null, (String) null, (String) null).get(0)));
        }
        a.mo40635a("click", b);
        a.mo40641b();
    }

    /* renamed from: a */
    public static void m11334a(C4981av avVar) {
        C5306gi a = C5306gi.m12146a();
        a.mo40634a("click", "id = ?", new String[]{String.valueOf(avVar.f11292a)});
        a.mo40641b();
    }

    /* renamed from: a */
    static C4981av m11332a(ContentValues contentValues) {
        int intValue = contentValues.getAsInteger("id").intValue();
        int intValue2 = contentValues.getAsInteger("pending_attempts").intValue();
        String asString = contentValues.getAsString("url");
        long longValue = Long.valueOf(contentValues.getAsString("ts")).longValue();
        long longValue2 = Long.valueOf(contentValues.getAsString("created_ts")).longValue();
        boolean booleanValue = Boolean.valueOf(contentValues.getAsString("follow_redirect")).booleanValue();
        boolean booleanValue2 = Boolean.valueOf(contentValues.getAsString("ping_in_webview")).booleanValue();
        String asString2 = contentValues.getAsString("track_extras");
        HashMap hashMap = new HashMap();
        if (asString2 != null) {
            try {
                hashMap.putAll(m11333a(new JSONObject(asString2)));
            } catch (Exception | JSONException unused) {
            }
        }
        return new C4981av(intValue, asString, hashMap, booleanValue, booleanValue2, intValue2, longValue, longValue2);
    }

    /* renamed from: b */
    static ContentValues m11336b(C4981av avVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(avVar.f11292a));
        contentValues.put("url", avVar.f11293b);
        contentValues.put("pending_attempts", Integer.valueOf(avVar.f11297f));
        contentValues.put("ts", Long.toString(avVar.f11295d));
        contentValues.put("created_ts", Long.toString(avVar.f11296e));
        contentValues.put("follow_redirect", Boolean.toString(avVar.f11300i));
        contentValues.put("ping_in_webview", Boolean.toString(avVar.f11299h));
        if (avVar.f11294c != null && avVar.f11294c.size() > 0) {
            contentValues.put("track_extras", new JSONObject(avVar.f11294c).toString());
        }
        return contentValues;
    }

    /* renamed from: a */
    private static Map<String, String> m11333a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, (String) jSONObject.get(next));
        }
        return hashMap;
    }
}
