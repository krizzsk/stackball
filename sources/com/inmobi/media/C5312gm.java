package com.inmobi.media;

import android.content.ContentValues;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.gm */
/* compiled from: TelemetryDao */
public class C5312gm extends C5282fs {

    /* renamed from: a */
    private static final String f12180a = C5312gm.class.getSimpleName();

    public C5312gm() {
        C5306gi a = C5306gi.m12146a();
        a.mo40638a("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
        a.mo40641b();
    }

    /* renamed from: a */
    public static void m12179a(C5313gn gnVar) {
        C5306gi a = C5306gi.m12146a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventType", gnVar.f12182b);
        contentValues.put("payload", gnVar.mo40655a());
        contentValues.put("ts", String.valueOf(gnVar.f12183c));
        a.mo40635a("telemetry", contentValues);
        a.mo40641b();
    }

    /* renamed from: a */
    public static List<C5313gn> m12178a(int i) {
        C5306gi a = C5306gi.m12146a();
        List<ContentValues> a2 = a.mo40636a("telemetry", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        a.mo40641b();
        for (ContentValues a3 : a2) {
            arrayList.add(C5313gn.m12187a(a3));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo40596a(long j) {
        List<C5313gn> a = m12178a(1);
        if (a.size() <= 0 || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - a.get(0).f12183c) < j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo40597a(long j, long j2) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j;
        List<C5313gn> a = m12178a(1);
        if (a.size() <= 0 || seconds - TimeUnit.MILLISECONDS.toSeconds(a.get(0).f12183c) <= j2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo40594a() {
        C5306gi a = C5306gi.m12146a();
        int a2 = a.mo40633a("telemetry");
        a.mo40641b();
        return a2;
    }

    /* renamed from: b */
    public final void mo40598b(long j) {
        C5306gi a = C5306gi.m12146a();
        a.mo40634a("telemetry", "ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (j * 1000))});
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
            a.mo40634a("telemetry", "id IN (" + sb + ")", (String[]) null);
            a.mo40641b();
        }
    }

    /* renamed from: c */
    public final void mo40600c(long j) {
        Context c = C5314go.m12203c();
        if (c != null) {
            C5307gj.m12157a(c, "batch_processing_info").mo40644a("telemetry_last_batch_process", j);
        }
    }

    /* renamed from: c */
    public final long mo40599c() {
        Context c = C5314go.m12203c();
        if (c == null) {
            return -1;
        }
        return C5307gj.m12157a(c, "batch_processing_info").mo40647b("telemetry_last_batch_process", -1);
    }
}
