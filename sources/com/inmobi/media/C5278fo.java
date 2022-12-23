package com.inmobi.media;

import android.content.ContentValues;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.fo */
/* compiled from: CrashDao */
public class C5278fo extends C5282fs {

    /* renamed from: a */
    private static final String f12056a = C5278fo.class.getSimpleName();

    public C5278fo() {
        C5306gi a = C5306gi.m12146a();
        a.mo40638a("crash", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
        a.mo40641b();
    }

    /* renamed from: a */
    public static void m12077a(C5279fp fpVar) {
        C5306gi a = C5306gi.m12146a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", fpVar.f12059b);
        contentValues.put("componentType", fpVar.f12061d);
        contentValues.put("eventType", fpVar.f12060c);
        contentValues.put("payload", fpVar.mo40601a());
        contentValues.put("ts", String.valueOf(fpVar.f12062e));
        a.mo40635a("crash", contentValues);
        a.mo40641b();
    }

    /* renamed from: a */
    public static List<C5279fp> m12076a(int i) {
        C5306gi a = C5306gi.m12146a();
        List<ContentValues> a2 = a.mo40636a("crash", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        a.mo40641b();
        for (ContentValues a3 : a2) {
            arrayList.add(C5279fp.m12086a(a3));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo40596a(long j) {
        List<C5279fp> a = m12076a(1);
        if (a.size() <= 0 || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - a.get(0).f12062e) <= j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo40597a(long j, long j2) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j;
        List<C5279fp> a = m12076a(1);
        if (a.size() <= 0 || seconds - TimeUnit.MILLISECONDS.toSeconds(a.get(0).f12062e) < j2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo40594a() {
        C5306gi a = C5306gi.m12146a();
        int a2 = a.mo40633a("crash");
        a.mo40641b();
        return a2;
    }

    /* renamed from: b */
    public final void mo40598b(long j) {
        C5306gi a = C5306gi.m12146a();
        a.mo40634a("crash", "ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (j * 1000))});
        a.mo40641b();
    }

    /* renamed from: a */
    public final void mo40595a(List<Integer> list) {
        if (!list.isEmpty()) {
            C5306gi a = C5306gi.m12146a();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size() - 1; i++) {
                sb.append(list.get(i));
                sb.append(",");
            }
            sb.append(String.valueOf(list.get(list.size() - 1)));
            a.mo40634a("crash", "id IN (" + sb + ")", (String[]) null);
            a.mo40641b();
        }
    }

    /* renamed from: b */
    public static void m12078b() {
        C5306gi a = C5306gi.m12146a();
        List<ContentValues> a2 = a.mo40636a("crash", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", "1");
        if (!a2.isEmpty()) {
            String asString = a2.get(0).getAsString("id");
            a.mo40634a("crash", "id IN (" + asString + ")", (String[]) null);
        }
        a.mo40641b();
    }

    /* renamed from: c */
    public final void mo40600c(long j) {
        Context c = C5314go.m12203c();
        if (c != null) {
            C5307gj.m12157a(c, "batch_processing_info").mo40644a("crash_last_batch_process", j);
        }
    }

    /* renamed from: c */
    public final long mo40599c() {
        Context c = C5314go.m12203c();
        if (c != null) {
            return C5307gj.m12157a(c, "batch_processing_info").mo40647b("crash_last_batch_process", -1);
        }
        return -1;
    }
}
