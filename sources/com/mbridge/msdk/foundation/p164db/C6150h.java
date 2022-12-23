package com.mbridge.msdk.foundation.p164db;

import android.content.ContentValues;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.foundation.entity.C6194d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.db.h */
/* compiled from: DisplayResourceTypeDao */
public class C6150h extends C6137a<C6194d> {

    /* renamed from: a */
    private static final String f15218a = C6150h.class.getName();

    /* renamed from: b */
    private static C6150h f15219b;

    private C6150h(C6146e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public static synchronized C6150h m15433a(C6146e eVar) {
        C6150h hVar;
        synchronized (C6150h.class) {
            if (f15219b == null) {
                f15219b = new C6150h(eVar);
            }
            hVar = f15219b;
        }
        return hVar;
    }

    /* renamed from: a */
    public final synchronized void mo43009a(C6194d dVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("campaign_id", Long.valueOf(dVar.f15296a));
            contentValues.put("click_time", Long.valueOf(dVar.f15297b));
            contentValues.put("is_click", Integer.valueOf(dVar.f15299d));
            contentValues.put("resource_type", Integer.valueOf(dVar.f15298c));
            if (getWritableDatabase() != null) {
                getWritableDatabase().insert("display_resource_type", (String) null, contentValues);
            } else {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final String mo43008a() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        List<C6194d> a = m15434a(currentTimeMillis);
        if (a == null) {
            return "";
        }
        long j = 86400000;
        String[] strArr = {"1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", CampaignEx.CLICKMODE_ON, "6", "7"};
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            arrayList.add(new JSONArray());
        }
        try {
            for (C6194d next : a) {
                JSONArray jSONArray = (JSONArray) arrayList.get((int) ((currentTimeMillis - next.f15297b) / j));
                if (jSONArray.length() == 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(String.valueOf(next.f15298c), next.f15299d);
                    jSONArray.put(jSONObject2);
                } else {
                    int i2 = 0;
                    while (true) {
                        z = true;
                        if (i2 >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                        String valueOf = String.valueOf(next.f15298c);
                        if (jSONObject3.has(valueOf)) {
                            if (jSONObject3.getInt(valueOf) == 0 && next.f15299d == 1) {
                                jSONObject3.put(valueOf, next.f15299d);
                            }
                            z = false;
                        } else {
                            i2++;
                        }
                    }
                    if (z) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(String.valueOf(next.f15298c), next.f15299d);
                        jSONArray.put(jSONObject4);
                    }
                }
                j = 86400000;
            }
            for (int i3 = 0; i3 < 7; i3++) {
                jSONObject.put(strArr[i3], arrayList.get(i3));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<com.mbridge.msdk.foundation.entity.d>] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089 A[SYNTHETIC, Splitter:B:32:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093 A[SYNTHETIC, Splitter:B:40:0x0093] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.util.List<com.mbridge.msdk.foundation.entity.C6194d> m15434a(long r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r10 = r10 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r0.<init>()     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = "select * from display_resource_type where click_time >= "
            r0.append(r1)     // Catch:{ all -> 0x0097 }
            r0.append(r10)     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0097 }
            android.database.sqlite.SQLiteDatabase r11 = r9.getReadableDatabase()     // Catch:{ all -> 0x0097 }
            r0 = 0
            if (r11 != 0) goto L_0x001f
            monitor-exit(r9)
            return r0
        L_0x001f:
            android.database.sqlite.SQLiteDatabase r11 = r9.getReadableDatabase()     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            android.database.Cursor r10 = r11.rawQuery(r10, r0)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            if (r10 == 0) goto L_0x0078
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x0073 }
            if (r11 == 0) goto L_0x0078
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x0073 }
            int r1 = r10.getCount()     // Catch:{ Exception -> 0x0073 }
            r11.<init>(r1)     // Catch:{ Exception -> 0x0073 }
        L_0x0038:
            java.lang.String r0 = "click_time"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ Exception -> 0x0071 }
            long r4 = r10.getLong(r0)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = "campaign_id"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ Exception -> 0x0071 }
            long r2 = r10.getLong(r0)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = "resource_type"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ Exception -> 0x0071 }
            int r6 = r10.getInt(r0)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = "is_click"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ Exception -> 0x0071 }
            int r7 = r10.getInt(r0)     // Catch:{ Exception -> 0x0071 }
            com.mbridge.msdk.foundation.entity.d r0 = new com.mbridge.msdk.foundation.entity.d     // Catch:{ Exception -> 0x0071 }
            r1 = r0
            r1.<init>(r2, r4, r6, r7)     // Catch:{ Exception -> 0x0071 }
            r11.add(r0)     // Catch:{ Exception -> 0x0071 }
            boolean r0 = r10.moveToNext()     // Catch:{ Exception -> 0x0071 }
            if (r0 != 0) goto L_0x0038
            r0 = r11
            goto L_0x0078
        L_0x0071:
            r0 = move-exception
            goto L_0x0084
        L_0x0073:
            r11 = move-exception
            r8 = r0
            r0 = r11
            r11 = r8
            goto L_0x0084
        L_0x0078:
            if (r10 == 0) goto L_0x008d
            r10.close()     // Catch:{ all -> 0x0097 }
            goto L_0x008d
        L_0x007e:
            r11 = move-exception
            goto L_0x0091
        L_0x0080:
            r10 = move-exception
            r11 = r0
            r0 = r10
            r10 = r11
        L_0x0084:
            r0.printStackTrace()     // Catch:{ all -> 0x008f }
            if (r10 == 0) goto L_0x008c
            r10.close()     // Catch:{ all -> 0x0097 }
        L_0x008c:
            r0 = r11
        L_0x008d:
            monitor-exit(r9)
            return r0
        L_0x008f:
            r11 = move-exception
            r0 = r10
        L_0x0091:
            if (r0 == 0) goto L_0x0096
            r0.close()     // Catch:{ all -> 0x0097 }
        L_0x0096:
            throw r11     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6150h.m15434a(long):java.util.List");
    }
}
