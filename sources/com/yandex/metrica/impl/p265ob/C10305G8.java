package com.yandex.metrica.impl.p265ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.G8 */
public class C10305G8 implements C10247F8 {

    /* renamed from: a */
    private final HashMap<String, List<String>> f24759a;

    public C10305G8(String str, HashMap<String, List<String>> hashMap) {
        this.f24759a = hashMap;
    }

    /* renamed from: a */
    public boolean mo61355a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            boolean z = true;
            for (Map.Entry next : this.f24759a.entrySet()) {
                cursor = null;
                cursor = sQLiteDatabase.query((String) next.getKey(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                if (cursor == null) {
                    C10796U2.m27886a(cursor);
                    return false;
                }
                String str = (String) next.getKey();
                List asList = Arrays.asList(cursor.getColumnNames());
                Collections.sort(asList);
                z &= ((List) next.getValue()).equals(asList);
                C10796U2.m27886a(cursor);
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
