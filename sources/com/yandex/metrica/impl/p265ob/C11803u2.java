package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10622P3;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.u2 */
public class C11803u2 implements C11834v2<C10622P3.C10623a> {

    /* renamed from: a */
    private final Context f28353a;

    public C11803u2(Context context) {
        this.f28353a = context;
    }

    public Object invoke() {
        Cursor cursor;
        try {
            cursor = this.f28353a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/clids"), (String[]) null, (String) null, (String[]) null, (String) null);
            if (cursor != null) {
                try {
                    HashMap hashMap = new HashMap();
                    while (cursor.moveToNext()) {
                        try {
                            String string = cursor.getString(cursor.getColumnIndexOrThrow("clid_key"));
                            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("clid_value"));
                            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                                C10122B2.m26034a("Invalid clid {%s : %s}", string, string2);
                            } else {
                                hashMap.put(string, string2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    C10122B2.m26034a("Clids from satellite: %s", hashMap);
                    C10622P3.C10623a aVar = new C10622P3.C10623a(hashMap, C10202E0.SATELLITE);
                    C10796U2.m27886a(cursor);
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    try {
                        C10122B2.m26035a(th, "Error while getting satellite clids", new Object[0]);
                        return null;
                    } finally {
                        C10796U2.m27886a(cursor);
                    }
                }
            } else {
                C10122B2.m26034a("No Satellite content provider found", new Object[0]);
                C10796U2.m27886a(cursor);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            C10122B2.m26035a(th, "Error while getting satellite clids", new Object[0]);
            return null;
        }
    }
}
