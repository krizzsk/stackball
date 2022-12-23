package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.impl.p265ob.C10591O8;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i9 */
public class C11341i9 extends C10628P8 {
    /* renamed from: a */
    public void mo61054a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS " + "sessions_BACKUP" + " (" + "id" + " INTEGER" + "," + "start_time" + " INTEGER" + "," + TapjoyConstants.TJC_CONNECTION_TYPE + " INTEGER" + "," + "network_type" + " TEXT" + "," + TapjoyConstants.TJC_DEVICE_COUNTRY_CODE + " INTEGER" + "," + "operator_id" + " INTEGER" + "," + "lac" + " INTEGER" + "," + "report_request_parameters" + " TEXT" + " );");
        StringBuilder sb = new StringBuilder();
        sb.append("id");
        sb.append(",");
        sb.append("start_time");
        sb.append(",");
        sb.append(TapjoyConstants.TJC_CONNECTION_TYPE);
        sb.append(",");
        sb.append("network_type");
        sb.append(",");
        sb.append(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE);
        sb.append(",");
        sb.append("operator_id");
        sb.append(",");
        sb.append("lac");
        sb.append(",");
        sb.append("report_request_parameters");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO ");
        sb2.append("sessions_BACKUP");
        sb2.append(" SELECT ");
        sb2.append(sb);
        sb2.append(" FROM ");
        sb2.append("sessions");
        sb2.append(";");
        sQLiteDatabase2.execSQL(sb2.toString());
        sQLiteDatabase2.execSQL("DROP TABLE sessions;");
        sQLiteDatabase2.execSQL(C10591O8.C10598e.f25330b);
        Cursor cursor = null;
        try {
            Cursor rawQuery = sQLiteDatabase2.rawQuery("SELECT * FROM sessions_BACKUP", (String[]) null);
            while (rawQuery.moveToNext()) {
                try {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(rawQuery, contentValues);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("id");
                    arrayList.add("start_time");
                    arrayList.add("report_request_parameters");
                    ContentValues contentValues2 = new ContentValues(contentValues);
                    for (Map.Entry next : contentValues.valueSet()) {
                        if (!arrayList.contains(next.getKey())) {
                            contentValues2.remove((String) next.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        contentValues.remove((String) it.next());
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("conn_type", contentValues.getAsInteger(TapjoyConstants.TJC_CONNECTION_TYPE));
                    jSONObject.putOpt("net_type", contentValues.get("network_type"));
                    jSONObject.putOpt("operator_id", contentValues.get("operator_id"));
                    jSONObject.putOpt("lac", contentValues.get("lac"));
                    jSONObject.putOpt(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, contentValues.get(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE));
                    contentValues2.put("network_info", jSONObject.toString());
                    sQLiteDatabase2.insertOrThrow("sessions", (String) null, contentValues2);
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                }
            }
            C10796U2.m27886a(rawQuery);
            sQLiteDatabase2.execSQL("DROP TABLE sessions_BACKUP;");
            sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "wifi_network_info" + " TEXT DEFAULT ''");
            sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "cell_info" + " TEXT DEFAULT ''");
            sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "location_info" + " TEXT DEFAULT ''");
        } catch (Throwable th2) {
            th = th2;
            C10796U2.m27886a(cursor);
            throw th;
        }
    }
}
