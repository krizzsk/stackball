package com.inmobi.media;

import android.content.ContentValues;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.ar */
/* compiled from: AssetDao */
public class C4967ar {

    /* renamed from: a */
    public static final String[] f11256a = {"id", "pending_attempts", "url", "disk_uri", "ts", "created_ts", "ttl", "soft_ttl"};

    /* renamed from: b */
    private static final String f11257b = C4967ar.class.getSimpleName();

    /* renamed from: com.inmobi.media.ar$a */
    /* compiled from: AssetDao */
    static class C4968a {

        /* renamed from: a */
        static final C4967ar f11258a = new C4967ar((byte) 0);
    }

    /* synthetic */ C4967ar(byte b) {
        this();
    }

    /* renamed from: a */
    public static C4967ar m11264a() {
        return C4968a.f11258a;
    }

    private C4967ar() {
        C5306gi a = C5306gi.m12146a();
        a.mo40638a("asset", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, disk_uri TEXT, ts TEXT NOT NULL, created_ts TEXT NOT NULL, ttl TEXT NOT NULL, soft_ttl TEXT NOT NULL)");
        a.mo40641b();
    }

    /* renamed from: a */
    public final synchronized void mo40118a(C4949ai aiVar) {
        if (m11265b(aiVar) <= 0) {
            ContentValues d = m11270d(aiVar);
            C5306gi a = C5306gi.m12146a();
            a.mo40635a("asset", d);
            a.mo40641b();
        }
    }

    /* renamed from: b */
    static C4949ai m11266b() {
        List<ContentValues> a = C5306gi.m12146a().mo40636a("asset", f11256a, (String) null, (String[]) null, (String) null, (String) null, "ts ASC ", (String) null);
        if (a.size() == 0) {
            return null;
        }
        return m11262a(a.get(0));
    }

    /* renamed from: c */
    static List<C4949ai> m11268c() {
        ArrayList<C4949ai> arrayList = new ArrayList<>();
        C5306gi a = C5306gi.m12146a();
        for (ContentValues a2 : a.mo40636a("asset", f11256a, (String) null, (String[]) null, (String) null, (String) null, "ts ASC ", (String) null)) {
            arrayList.add(m11262a(a2));
        }
        a.mo40641b();
        ArrayList arrayList2 = new ArrayList();
        for (C4949ai aiVar : arrayList) {
            if (!aiVar.mo40053a()) {
                arrayList2.add(aiVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: d */
    static List<C4949ai> m11271d() {
        ArrayList arrayList = new ArrayList();
        C5306gi a = C5306gi.m12146a();
        if (a.mo40633a("asset") == 0) {
            return arrayList;
        }
        List<ContentValues> a2 = a.mo40636a("asset", f11256a, "disk_uri IS NOT NULL", (String[]) null, (String) null, (String) null, "created_ts DESC ", (String) null);
        a.mo40641b();
        for (ContentValues a3 : a2) {
            arrayList.add(m11262a(a3));
        }
        return arrayList;
    }

    /* renamed from: e */
    public static String m11272e() {
        List<C4949ai> d = m11271d();
        if (d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C4949ai aiVar : d) {
            try {
                jSONArray.put(URLEncoder.encode(aiVar.f11192d, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    static C4949ai m11263a(String str) {
        C5306gi a = C5306gi.m12146a();
        List<ContentValues> a2 = a.mo40636a("asset", f11256a, "url=? ", new String[]{str}, (String) null, (String) null, "created_ts DESC ", "1");
        a.mo40641b();
        if (a2.isEmpty()) {
            return null;
        }
        return m11262a(a2.get(0));
    }

    /* renamed from: f */
    public static List<String> m11273f() {
        ArrayList arrayList = new ArrayList();
        C5306gi a = C5306gi.m12146a();
        if (a.mo40633a("asset") == 0) {
            return arrayList;
        }
        List<ContentValues> a2 = a.mo40636a("asset", new String[]{"url"}, (String) null, (String[]) null, (String) null, (String) null, "created_ts DESC ", (String) null);
        a.mo40641b();
        for (ContentValues asString : a2) {
            arrayList.add(asString.getAsString("url"));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static C4949ai m11267b(String str) {
        C5306gi a = C5306gi.m12146a();
        List<ContentValues> a2 = a.mo40636a("asset", f11256a, "url=? ", new String[]{str}, (String) null, (String) null, "created_ts DESC ", "1");
        a.mo40641b();
        if (a2.isEmpty()) {
            return null;
        }
        return m11262a(a2.get(0));
    }

    /* renamed from: b */
    public static int m11265b(C4949ai aiVar) {
        C5306gi a = C5306gi.m12146a();
        int b = a.mo40639b("asset", m11270d(aiVar), "url = ?", new String[]{String.valueOf(aiVar.f11192d)});
        a.mo40641b();
        return b;
    }

    /* renamed from: c */
    public static void m11269c(C4949ai aiVar) {
        C5306gi a = C5306gi.m12146a();
        a.mo40634a("asset", "id = ?", new String[]{String.valueOf(aiVar.f11190b)});
        a.mo40641b();
    }

    /* renamed from: a */
    public static C4949ai m11262a(ContentValues contentValues) {
        return new C4949ai(contentValues.getAsInteger("id").intValue(), contentValues.getAsString("url"), contentValues.getAsString("disk_uri"), contentValues.getAsInteger("pending_attempts").intValue(), Long.valueOf(contentValues.getAsString("ts")).longValue(), Long.valueOf(contentValues.getAsString("created_ts")).longValue(), Long.valueOf(contentValues.getAsString("ttl")).longValue(), Long.valueOf(contentValues.getAsString("soft_ttl")).longValue());
    }

    /* renamed from: d */
    private static ContentValues m11270d(C4949ai aiVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(aiVar.f11190b));
        contentValues.put("url", aiVar.f11192d);
        contentValues.put("disk_uri", aiVar.f11193e);
        contentValues.put("pending_attempts", Integer.valueOf(aiVar.f11191c));
        contentValues.put("ts", Long.toString(aiVar.f11194f));
        contentValues.put("created_ts", Long.toString(aiVar.f11195g));
        contentValues.put("ttl", Long.toString(aiVar.f11196h));
        contentValues.put("soft_ttl", Long.toString(aiVar.f11197i));
        return contentValues;
    }
}
