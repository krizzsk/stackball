package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.C0580a0;
import com.adcolony.sdk.C0727i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.l */
class C0746l {

    /* renamed from: com.adcolony.sdk.l$a */
    class C0747a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0727i0 f1179a;

        /* renamed from: b */
        final /* synthetic */ SQLiteDatabase f1180b;

        /* renamed from: c */
        final /* synthetic */ C0748b f1181c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f1182d;

        C0747a(C0727i0 i0Var, SQLiteDatabase sQLiteDatabase, C0748b bVar, CountDownLatch countDownLatch) {
            this.f1179a = i0Var;
            this.f1180b = sQLiteDatabase;
            this.f1181c = bVar;
            this.f1182d = countDownLatch;
        }

        public void run() {
            for (C0727i0.C0728a next : this.f1179a.mo9644a()) {
                for (Map.Entry next2 : next.mo9652f().entrySet()) {
                    C0750c a = C0746l.m594a((String) next2.getValue(), this.f1180b);
                    if (a != null) {
                        this.f1181c.m596a(next.mo9651e(), (String) next2.getKey(), a);
                    }
                }
            }
            C0735j0.m537d().mo9670a(this.f1181c);
            this.f1182d.countDown();
        }
    }

    /* renamed from: com.adcolony.sdk.l$b */
    static class C0748b {

        /* renamed from: a */
        private final int f1183a;

        /* renamed from: b */
        private final Map<String, ArrayList<C0749a>> f1184b;

        /* renamed from: com.adcolony.sdk.l$b$a */
        static class C0749a {

            /* renamed from: a */
            private final String f1185a;

            /* renamed from: b */
            private final C0750c f1186b;

            /* synthetic */ C0749a(String str, C0750c cVar, C0747a aVar) {
                this(str, cVar);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public String mo9703a() {
                return this.f1185a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C0750c mo9704b() {
                return this.f1186b;
            }

            private C0749a(String str, C0750c cVar) {
                this.f1185a = str;
                this.f1186b = cVar;
            }
        }

        /* synthetic */ C0748b(int i, C0747a aVar) {
            this(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo9701b() {
            return this.f1183a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0897z0 mo9702c() {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1156b(b, "version", mo9701b());
            for (Map.Entry next : this.f1184b.entrySet()) {
                C0897z0 b2 = C0894y.m1151b();
                Iterator it = ((ArrayList) next.getValue()).iterator();
                while (it.hasNext()) {
                    C0749a aVar = (C0749a) it.next();
                    C0895y0 a = C0894y.m1134a();
                    for (String b3 : aVar.mo9704b().mo9708a((Character) ',')) {
                        a.mo10030b(b3);
                    }
                    C0894y.m1146a(b2, aVar.mo9703a(), a);
                }
                C0894y.m1147a(b, (String) next.getKey(), b2);
            }
            return b;
        }

        private C0748b(int i) {
            this.f1184b = new ConcurrentHashMap();
            this.f1183a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m596a(String str, String str2, C0750c cVar) {
            ArrayList arrayList;
            C0749a aVar = new C0749a(str2, cVar, (C0747a) null);
            if (!this.f1184b.containsKey(str) || (arrayList = this.f1184b.get(str)) == null) {
                this.f1184b.put(str, new ArrayList(Collections.singletonList(aVar)));
            } else {
                arrayList.add(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Map<String, ArrayList<C0749a>> mo9700a() {
            return this.f1184b;
        }
    }

    /* renamed from: com.adcolony.sdk.l$c */
    static class C0750c {

        /* renamed from: a */
        private final List<C0751a> f1187a = new ArrayList();

        /* renamed from: b */
        private final List<ContentValues> f1188b = new ArrayList();

        /* renamed from: com.adcolony.sdk.l$c$a */
        static class C0751a {

            /* renamed from: a */
            private final int f1189a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final String f1190b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final int f1191c;

            /* synthetic */ C0751a(int i, String str, int i2, C0747a aVar) {
                this(i, str, i2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public int mo9714c() {
                return this.f1191c;
            }

            private C0751a(int i, String str, int i2) {
                this.f1189a = i;
                this.f1190b = str;
                this.f1191c = i2;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo9712a() {
                return this.f1189a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public String mo9713b() {
                return this.f1190b;
            }
        }

        C0750c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo9709b(int i) {
            if (i < 0 || i >= this.f1187a.size()) {
                return -1;
            }
            return this.f1187a.get(i).mo9714c();
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                str = "\n";
                if (i >= this.f1187a.size()) {
                    break;
                }
                sb.append(this.f1187a.get(i).f1190b);
                if (i != this.f1187a.size() - 1) {
                    str = " | ";
                }
                sb.append(str);
                i++;
            }
            for (ContentValues next : this.f1188b) {
                for (int i2 = 0; i2 < this.f1187a.size(); i2++) {
                    sb.append(next.getAsString(mo9705a(i2)));
                    if (i2 == this.f1187a.size() - 1) {
                        str2 = str;
                    } else {
                        str2 = " | ";
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<ContentValues> mo9710b() {
            return this.f1188b;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m602a(int i, String str, int i2) {
            this.f1187a.add(new C0751a(i, str, i2, (C0747a) null));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo9705a(int i) {
            if (i < 0 || i >= this.f1187a.size()) {
                return null;
            }
            return this.f1187a.get(i).mo9713b();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m603a(Cursor cursor) {
            ContentValues contentValues = new ContentValues();
            for (C0751a next : this.f1187a) {
                int a = next.f1191c;
                if (a == 1) {
                    contentValues.put(next.mo9713b(), Long.valueOf(cursor.getLong(next.mo9712a())));
                } else if (a == 2) {
                    contentValues.put(next.mo9713b(), Double.valueOf(cursor.getDouble(next.mo9712a())));
                } else if (a != 4) {
                    contentValues.put(next.mo9713b(), cursor.getString(next.mo9712a()));
                } else {
                    contentValues.put(next.mo9713b(), cursor.getBlob(next.mo9712a()));
                }
            }
            this.f1188b.add(contentValues);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo9706a(int i, Character ch) {
            if (i < 0 || i >= this.f1188b.size()) {
                return null;
            }
            ContentValues contentValues = this.f1188b.get(i);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < this.f1187a.size()) {
                if (mo9709b(i2) == 3) {
                    sb.append("\"");
                    sb.append(contentValues.get(mo9705a(i2)));
                    sb.append("\"");
                } else {
                    sb.append(contentValues.getAsString(mo9705a(i2)));
                }
                sb.append(i2 == this.f1187a.size() + -1 ? "" : ch);
                i2++;
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<String> mo9708a(Character ch) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f1188b.size(); i++) {
                arrayList.add(mo9706a(i, ch));
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C0751a> mo9707a() {
            return this.f1187a;
        }
    }

    C0746l() {
    }

    /* renamed from: a */
    static C0748b m592a(C0727i0 i0Var, SQLiteDatabase sQLiteDatabase, Executor executor) {
        return m593a(i0Var, sQLiteDatabase, executor, -1);
    }

    /* renamed from: a */
    static C0748b m593a(C0727i0 i0Var, SQLiteDatabase sQLiteDatabase, Executor executor, long j) {
        C0748b bVar = new C0748b(i0Var.mo9645b(), (C0747a) null);
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            executor.execute(new C0747a(i0Var, sQLiteDatabase, bVar, countDownLatch));
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException | RejectedExecutionException e) {
            C0580a0.C0581a aVar = new C0580a0.C0581a();
            aVar.mo9419a("ADCDbReader.calculateFeatureVectors failed with: " + e.toString()).mo9421a(C0580a0.f192j);
        }
        return bVar;
    }

    /* renamed from: a */
    static C0750c m594a(String str, SQLiteDatabase sQLiteDatabase) {
        C0750c cVar;
        Throwable th;
        C0750c cVar2 = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(str, (String[]) null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst()) {
                        cVar = new C0750c();
                        int i = 0;
                        while (i < rawQuery.getColumnCount()) {
                            try {
                                cVar.m602a(i, rawQuery.getColumnName(i), rawQuery.getType(i));
                                i++;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    rawQuery.close();
                                } catch (Throwable th3) {
                                    try {
                                        th.addSuppressed(th3);
                                    } catch (SQLException e) {
                                        e = e;
                                        new C0580a0.C0581a().mo9419a("SQLException on execute query: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
                                        return cVar;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        new C0580a0.C0581a().mo9419a("Error on execute query: ").mo9419a(th.toString()).mo9421a(C0580a0.f192j);
                                        return cVar;
                                    }
                                }
                                throw th;
                            }
                        }
                        do {
                            cVar.m603a(rawQuery);
                        } while (rawQuery.moveToNext());
                        cVar2 = cVar;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cVar = null;
                    rawQuery.close();
                    throw th;
                }
            }
            if (rawQuery == null) {
                return cVar2;
            }
            rawQuery.close();
            return cVar2;
        } catch (SQLException e2) {
            e = e2;
            cVar = cVar2;
        } catch (Throwable th6) {
            th = th6;
            cVar = cVar2;
            new C0580a0.C0581a().mo9419a("Error on execute query: ").mo9419a(th.toString()).mo9421a(C0580a0.f192j);
            return cVar;
        }
    }
}
