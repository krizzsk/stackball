package com.adcolony.sdk;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.adcolony.sdk.C0580a0;
import com.adcolony.sdk.C0727i0;
import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.adcolony.sdk.k */
class C0739k {

    /* renamed from: c */
    static final String f1145c = "manager_tmp_table";

    /* renamed from: a */
    private final SQLiteDatabase f1146a;

    /* renamed from: b */
    private final C0727i0 f1147b;

    /* renamed from: com.adcolony.sdk.k$b */
    static class C0741b {

        /* renamed from: a */
        static final int f1155a = 2;

        /* renamed from: b */
        static final int f1156b = 1;

        C0741b() {
        }
    }

    C0739k(SQLiteDatabase sQLiteDatabase, C0727i0 i0Var) {
        this.f1146a = sQLiteDatabase;
        this.f1147b = i0Var;
    }

    /* renamed from: a */
    private void m552a(C0727i0.C0728a aVar, List<String> list) {
        m554a(aVar.mo9654h(), f1145c);
        m559c(aVar);
        m555a(f1145c, aVar.mo9654h(), list);
        m558b(f1145c);
    }

    /* renamed from: c */
    private void m560c(C0727i0.C0731c cVar, String str) {
        ArrayList<String[]> c = mo9679c(cVar.mo9660b());
        boolean z = true;
        if (cVar.mo9659a().length == c.size()) {
            boolean z2 = false;
            for (int i = 0; i < cVar.mo9659a().length; i++) {
                if (!Objects.equals(cVar.mo9659a()[i], c.get(i)[2])) {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (z) {
            m553a(cVar.mo9660b());
            m557b(cVar, str);
        }
    }

    /* renamed from: d */
    private void m561d(C0727i0.C0728a aVar) {
        List<C0727i0.C0731c> c = aVar.mo9649c();
        ArrayList<String> d = mo9680d(aVar.mo9654h());
        for (C0727i0.C0731c next : c) {
            if (d.contains(next.mo9660b())) {
                m560c(next, aVar.mo9654h());
            } else {
                m557b(next, aVar.mo9654h());
            }
            d.remove(next.mo9660b());
        }
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            m553a(it.next());
        }
    }

    /* renamed from: e */
    private void m562e(C0727i0.C0728a aVar) {
        boolean z;
        boolean z2;
        ArrayList<C0740a> g = mo9683g(aVar.mo9654h());
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        boolean z4 = false;
        for (C0727i0.C0729b next : aVar.mo9647a()) {
            int size = g.size() - 1;
            while (true) {
                if (size < 0) {
                    z = false;
                    z2 = false;
                    break;
                }
                C0740a aVar2 = g.get(size);
                if (Objects.equals(aVar2.mo9686b(), next.mo9657b())) {
                    arrayList.add(next.mo9657b());
                    z = aVar2.mo9685a(next);
                    g.remove(size);
                    z2 = true;
                    break;
                }
                size--;
            }
            if (!z2 || !z) {
                z4 = true;
            }
        }
        if (g.size() <= 0) {
            z3 = z4;
        }
        if (z3) {
            m552a(aVar, (List<String>) arrayList);
            m556b(aVar);
            return;
        }
        m561d(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9678b() {
        int version = this.f1146a.getVersion();
        this.f1146a.beginTransaction();
        boolean z = false;
        try {
            List<C0727i0.C0728a> a = this.f1147b.mo9644a();
            ArrayList<String> a2 = mo9677a();
            for (C0727i0.C0728a next : a) {
                if (a2.contains(next.mo9654h())) {
                    m562e(next);
                } else {
                    m559c(next);
                    m556b(next);
                }
                a2.remove(next.mo9654h());
            }
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                m558b(it.next());
            }
            this.f1146a.setVersion(this.f1147b.mo9645b());
            this.f1146a.setTransactionSuccessful();
            z = true;
            new C0580a0.C0581a().mo9419a("Success upgrading database from ").mo9417a(version).mo9419a(" to ").mo9417a(this.f1147b.mo9645b()).mo9421a(C0580a0.f188f);
        } catch (SQLException e) {
            new C0580a0.C0581a().mo9419a("Upgrading database from ").mo9417a(version).mo9419a(" to ").mo9417a(this.f1147b.mo9645b()).mo9419a("caused: ").mo9419a(e.toString()).mo9421a(C0580a0.f190h);
        } catch (Throwable th) {
            this.f1146a.endTransaction();
            throw th;
        }
        this.f1146a.endTransaction();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ArrayList<String> mo9682f(String str) {
        SQLiteDatabase sQLiteDatabase = this.f1146a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type='" + str + "' ORDER BY name", (String[]) null);
        ArrayList<String> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            arrayList.add(rawQuery.getString(0));
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ArrayList<C0740a> mo9683g(String str) {
        ArrayList<C0740a> arrayList = new ArrayList<>();
        Iterator<String[]> it = mo9681e("PRAGMA table_info(" + str + ")").iterator();
        while (it.hasNext()) {
            C0740a a = C0740a.m570a(it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: com.adcolony.sdk.k$a */
    static class C0740a {

        /* renamed from: d */
        private static final int f1148d = 1;

        /* renamed from: e */
        private static final int f1149e = 2;

        /* renamed from: f */
        private static final int f1150f = 4;

        /* renamed from: g */
        private static final int f1151g = 5;

        /* renamed from: a */
        private final String f1152a;

        /* renamed from: b */
        private final String f1153b;

        /* renamed from: c */
        private final String f1154c;

        private C0740a(String[] strArr) {
            this.f1152a = strArr[1];
            this.f1153b = strArr[2];
            this.f1154c = strArr[4];
        }

        /* renamed from: a */
        static C0740a m570a(String[] strArr) {
            if (strArr.length >= 5) {
                return new C0740a(strArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo9686b() {
            return this.f1152a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo9687c() {
            return this.f1153b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9685a(C0727i0.C0729b bVar) {
            return Objects.equals(this.f1152a, bVar.mo9657b()) && Objects.equals(this.f1153b, bVar.mo9658c()) && Objects.equals(this.f1154c, bVar.mo9656a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo9684a() {
            return this.f1154c;
        }
    }

    /* renamed from: a */
    private void m553a(String str) {
        SQLiteDatabase sQLiteDatabase = this.f1146a;
        sQLiteDatabase.execSQL("DROP INDEX " + str);
    }

    /* renamed from: a */
    private String m550a(C0727i0.C0728a aVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ");
        sb.append(aVar.mo9654h());
        sb.append(" (");
        for (int i = 0; i < aVar.mo9647a().size(); i++) {
            C0727i0.C0729b bVar = aVar.mo9647a().get(i);
            sb.append(bVar.mo9657b());
            sb.append(" ");
            sb.append(bVar.mo9658c());
            if (bVar.mo9656a() != null) {
                if (bVar.mo9656a() instanceof Boolean) {
                    str = ((Boolean) bVar.mo9656a()).booleanValue() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
                } else if (bVar.mo9656a() instanceof String) {
                    str = "'" + bVar.mo9656a() + "'";
                } else {
                    str = bVar.mo9656a().toString();
                }
                sb.append(" DEFAULT ");
                sb.append(str);
            }
            if (i < aVar.mo9647a().size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ArrayList<String> mo9680d(String str) {
        ArrayList<String[]> e = mo9681e("PRAGMA index_list(" + str + ")");
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String[]> it = e.iterator();
        while (it.hasNext()) {
            String[] next = it.next();
            if (next.length >= 3) {
                arrayList.add(next[1]);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m559c(C0727i0.C0728a aVar) {
        this.f1146a.execSQL(m550a(aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<String[]> mo9679c(String str) {
        return mo9681e("PRAGMA index_info(" + str + ")");
    }

    /* renamed from: a */
    private String m551a(C0727i0.C0731c cVar, String str) {
        String join = TextUtils.join(", ", cVar.mo9659a());
        return "CREATE INDEX " + cVar.mo9660b() + " ON " + str + "(" + join + ")";
    }

    /* renamed from: a */
    private void m554a(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.f1146a;
        sQLiteDatabase.execSQL("ALTER TABLE " + str + " RENAME TO " + str2);
    }

    /* renamed from: a */
    private void m555a(String str, String str2, List<String> list) {
        String join = TextUtils.join(", ", list);
        SQLiteDatabase sQLiteDatabase = this.f1146a;
        sQLiteDatabase.execSQL("INSERT INTO " + str2 + " (" + join + ") SELECT " + join + " FROM " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ArrayList<String[]> mo9681e(String str) {
        Cursor rawQuery = this.f1146a.rawQuery(str, (String[]) null);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            int columnCount = rawQuery.getColumnCount();
            String[] strArr = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                strArr[i] = rawQuery.getString(i);
            }
            arrayList.add(strArr);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo9677a() {
        ArrayList<String> f = mo9682f("table");
        for (int size = f.size() - 1; size >= 0; size--) {
            String str = f.get(size);
            if (str.startsWith("android_") || str.startsWith("sqlite_")) {
                f.remove(size);
            }
        }
        return f;
    }

    /* renamed from: b */
    private void m556b(C0727i0.C0728a aVar) {
        for (C0727i0.C0731c b : aVar.mo9649c()) {
            m557b(b, aVar.mo9654h());
        }
    }

    /* renamed from: b */
    private void m557b(C0727i0.C0731c cVar, String str) {
        this.f1146a.execSQL(m551a(cVar, str));
    }

    /* renamed from: b */
    private void m558b(String str) {
        SQLiteDatabase sQLiteDatabase = this.f1146a;
        sQLiteDatabase.execSQL("DROP TABLE " + str);
    }
}
