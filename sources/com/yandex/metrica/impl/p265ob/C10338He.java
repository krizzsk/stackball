package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.He */
public class C10338He implements C11834v2<C10459Le> {

    /* renamed from: a */
    private final Context f24833a;

    public C10338He(Context context) {
        this.f24833a = context;
    }

    /* renamed from: a */
    public C10459Le invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        try {
            cursor = this.f24833a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/preload_info"), (String[]) null, (String) null, (String[]) null, (String) null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("tracking_id"));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("additional_parameters"));
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            if (!TextUtils.isEmpty(string2)) {
                                jSONObject = new JSONObject(string2);
                                C10122B2.m26034a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                                C10459Le le = new C10459Le(string, jSONObject, !TextUtils.isEmpty(string), false, C10202E0.SATELLITE);
                                C10796U2.m27886a(cursor);
                                return le;
                            }
                        } catch (Throwable unused) {
                        }
                        jSONObject = jSONObject2;
                        C10122B2.m26034a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                        C10459Le le2 = new C10459Le(string, jSONObject, !TextUtils.isEmpty(string), false, C10202E0.SATELLITE);
                        C10796U2.m27886a(cursor);
                        return le2;
                    }
                    C10122B2.m26034a("No Preload Info data in Satellite content provider", new Object[0]);
                    C10796U2.m27886a(cursor);
                    return null;
                } catch (Throwable unused2) {
                }
            } else {
                C10122B2.m26034a("No Satellite content provider found", new Object[0]);
                C10796U2.m27886a(cursor);
                return null;
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
    }
}
