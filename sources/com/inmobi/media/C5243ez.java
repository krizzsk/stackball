package com.inmobi.media;

import android.content.ContentValues;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ez */
/* compiled from: ConfigDao */
public class C5243ez {

    /* renamed from: a */
    private static final String f12009a = C5243ez.class.getSimpleName();

    /* renamed from: b */
    private static final String[] f12010b = {"account_id", "config_value", "config_type", "update_ts"};

    /* renamed from: d */
    private static String[] m12009d(String str, String str2) {
        return new String[]{str2, str};
    }

    /* renamed from: a */
    private static C5238ex m12002a(ContentValues contentValues) throws JSONException {
        String asString = contentValues.getAsString("config_value");
        if (asString == null) {
            return null;
        }
        return C5238ex.m11981a(contentValues.getAsString("config_type"), new JSONObject(asString), contentValues.getAsString("account_id"));
    }

    public C5243ez() {
        C5306gi a = C5306gi.m12146a();
        a.mo40638a("config_db", "(account_id TEXT NOT NULL,config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(account_id,config_type))");
        a.mo40641b();
    }

    /* renamed from: a */
    public static void m12005a(C5238ex exVar) {
        try {
            if (exVar.mo40564g() != null) {
                C5306gi a = C5306gi.m12146a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_id", exVar.mo40564g());
                JSONObject c = exVar.mo40558c();
                if (c == null) {
                    c = new JSONObject();
                }
                contentValues.put("config_value", c.toString());
                contentValues.put("config_type", exVar.mo40557b());
                contentValues.put("update_ts", Long.valueOf(System.currentTimeMillis()));
                a.mo40637a("config_db", contentValues, "account_id=? AND config_type=?", m12009d(exVar.mo40557b(), exVar.mo40564g()));
                a.mo40641b();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C5238ex m12003a(String str, String str2) {
        C5238ex exVar;
        try {
            C5306gi a = C5306gi.m12146a();
            List<ContentValues> a2 = a.mo40636a("config_db", f12010b, "account_id=? AND config_type=?", m12009d(str, str2), (String) null, (String) null, (String) null, (String) null);
            exVar = !a2.isEmpty() ? m12002a(a2.get(0)) : null;
            try {
                a.mo40641b();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            exVar = null;
        }
        return exVar == null ? C5238ex.m11980a(str, (String) null) : exVar;
    }

    /* renamed from: a */
    public static LinkedList<C5238ex> m12004a() {
        LinkedList<C5238ex> linkedList = new LinkedList<>();
        try {
            C5306gi a = C5306gi.m12146a();
            List<ContentValues> a2 = a.mo40636a("config_db", f12010b, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
            if (!a2.isEmpty()) {
                for (ContentValues a3 : a2) {
                    linkedList.add(m12002a(a3));
                }
            }
            a.mo40641b();
        } catch (Exception unused) {
        }
        return linkedList;
    }

    /* renamed from: b */
    public static boolean m12007b(String str, String str2) {
        try {
            C5306gi a = C5306gi.m12146a();
            int b = a.mo40640b("config_db", "account_id=? AND config_type=?", m12009d(str, str2));
            a.mo40641b();
            if (b <= 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: c */
    public static long m12008c(String str, String str2) {
        long j = 0;
        try {
            C5306gi a = C5306gi.m12146a();
            List<ContentValues> a2 = a.mo40636a("config_db", f12010b, "account_id=? AND config_type=?", m12009d(str, str2), (String) null, (String) null, (String) null, (String) null);
            if (!a2.isEmpty()) {
                j = a2.get(0).getAsLong("update_ts").longValue();
            }
            a.mo40641b();
        } catch (Exception unused) {
        }
        return j;
    }

    /* renamed from: a */
    public static void m12006a(String str, String str2, long j) {
        try {
            C5306gi a = C5306gi.m12146a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_ts", Long.valueOf(j));
            a.mo40639b("config_db", contentValues, "account_id=? AND config_type=?", m12009d(str, str2));
            a.mo40641b();
        } catch (Exception unused) {
        }
    }
}
