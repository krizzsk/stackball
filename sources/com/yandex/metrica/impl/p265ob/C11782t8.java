package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10089A;
import com.yandex.metrica.impl.p265ob.C10591O8;
import com.yandex.metrica.impl.p265ob.C10856Vi;
import com.yandex.metrica.impl.p265ob.C10972Yn;
import com.yandex.metrica.impl.p265ob.C11740s8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.yandex.metrica.impl.ob.t8 */
public class C11782t8 {

    /* renamed from: o */
    private static final HashSet<Integer> f28270o;

    /* renamed from: a */
    private final ReentrantReadWriteLock f28271a;

    /* renamed from: b */
    private final Lock f28272b;

    /* renamed from: c */
    private final Lock f28273c;

    /* renamed from: d */
    private final C11906w8 f28274d;

    /* renamed from: e */
    private final C11783a f28275e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Object f28276f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final List<ContentValues> f28277g = new ArrayList(3);

    /* renamed from: h */
    private final Context f28278h;

    /* renamed from: i */
    private final C11229f4 f28279i;

    /* renamed from: j */
    private final AtomicLong f28280j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final List<C10806Ub> f28281k;

    /* renamed from: l */
    private final C11740s8 f28282l;

    /* renamed from: m */
    private volatile C11055ao<C10856Vi.C10858b, Object> f28283m;

    /* renamed from: n */
    private final C11094bo<C10856Vi.C10858b, Object> f28284n;

    /* renamed from: com.yandex.metrica.impl.ob.t8$a */
    private class C11783a extends C11890vn {

        /* renamed from: b */
        private final C11229f4 f28285b;

        C11783a(C11229f4 f4Var) {
            this.f28285b = f4Var;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public void run() {
            /*
                r4 = this;
            L_0x0000:
                boolean r0 = r4.mo63616c()
                if (r0 == 0) goto L_0x008b
                monitor-enter(r4)     // Catch:{ all -> 0x0017 }
                com.yandex.metrica.impl.ob.t8 r0 = com.yandex.metrica.impl.p265ob.C11782t8.this     // Catch:{ all -> 0x0014 }
                boolean r0 = com.yandex.metrica.impl.p265ob.C11782t8.m30395a((com.yandex.metrica.impl.p265ob.C11782t8) r0)     // Catch:{ all -> 0x0014 }
                if (r0 == 0) goto L_0x0012
                r4.wait()     // Catch:{ all -> 0x0014 }
            L_0x0012:
                monitor-exit(r4)     // Catch:{ all -> 0x0014 }
                goto L_0x001a
            L_0x0014:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0014 }
                throw r0     // Catch:{ all -> 0x0017 }
            L_0x0017:
                r4.mo63993d()
            L_0x001a:
                com.yandex.metrica.impl.ob.t8 r0 = com.yandex.metrica.impl.p265ob.C11782t8.this
                java.lang.Object r0 = r0.f28276f
                monitor-enter(r0)
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0088 }
                com.yandex.metrica.impl.ob.t8 r2 = com.yandex.metrica.impl.p265ob.C11782t8.this     // Catch:{ all -> 0x0088 }
                java.util.List r2 = r2.f28277g     // Catch:{ all -> 0x0088 }
                r1.<init>(r2)     // Catch:{ all -> 0x0088 }
                com.yandex.metrica.impl.ob.t8 r2 = com.yandex.metrica.impl.p265ob.C11782t8.this     // Catch:{ all -> 0x0088 }
                java.util.List r2 = r2.f28277g     // Catch:{ all -> 0x0088 }
                r2.clear()     // Catch:{ all -> 0x0088 }
                monitor-exit(r0)     // Catch:{ all -> 0x0088 }
                com.yandex.metrica.impl.ob.t8 r0 = com.yandex.metrica.impl.p265ob.C11782t8.this
                r0.mo63712a((java.util.List<android.content.ContentValues>) r1)
                monitor-enter(r4)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0085 }
                r0.<init>()     // Catch:{ all -> 0x0085 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0085 }
            L_0x0045:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0085 }
                if (r2 == 0) goto L_0x005f
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0085 }
                android.content.ContentValues r2 = (android.content.ContentValues) r2     // Catch:{ all -> 0x0085 }
                com.yandex.metrica.impl.ob.t8 r3 = com.yandex.metrica.impl.p265ob.C11782t8.this     // Catch:{ all -> 0x0085 }
                int r2 = r3.m30388a((android.content.ContentValues) r2)     // Catch:{ all -> 0x0085 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0085 }
                r0.add(r2)     // Catch:{ all -> 0x0085 }
                goto L_0x0045
            L_0x005f:
                com.yandex.metrica.impl.ob.t8 r1 = com.yandex.metrica.impl.p265ob.C11782t8.this     // Catch:{ all -> 0x0085 }
                java.util.List r1 = r1.f28281k     // Catch:{ all -> 0x0085 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0085 }
            L_0x0069:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0085 }
                if (r2 == 0) goto L_0x0079
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0085 }
                com.yandex.metrica.impl.ob.Ub r2 = (com.yandex.metrica.impl.p265ob.C10806Ub) r2     // Catch:{ all -> 0x0085 }
                r2.mo62226a(r0)     // Catch:{ all -> 0x0085 }
                goto L_0x0069
            L_0x0079:
                com.yandex.metrica.impl.ob.f4 r0 = r4.f28285b     // Catch:{ all -> 0x0085 }
                com.yandex.metrica.impl.ob.Vb r0 = r0.mo62879l()     // Catch:{ all -> 0x0085 }
                r0.mo62377c()     // Catch:{ all -> 0x0085 }
                monitor-exit(r4)
                goto L_0x0000
            L_0x0085:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L_0x0088:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0088 }
                throw r1
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11782t8.C11783a.run():void");
        }
    }

    static {
        HashSet<Integer> hashSet = new HashSet<>();
        f28270o = hashSet;
        hashSet.add(Integer.valueOf(C11413k1.EVENT_TYPE_INIT.mo63170b()));
        hashSet.add(Integer.valueOf(C11413k1.EVENT_TYPE_START.mo63170b()));
    }

    public C11782t8(C11229f4 f4Var, C11906w8 w8Var, C11740s8 s8Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f28271a = reentrantReadWriteLock;
        this.f28272b = reentrantReadWriteLock.readLock();
        this.f28273c = reentrantReadWriteLock.writeLock();
        AtomicLong atomicLong = new AtomicLong();
        this.f28280j = atomicLong;
        this.f28281k = new ArrayList();
        this.f28284n = new C11094bo<>();
        this.f28274d = w8Var;
        this.f28278h = f4Var.mo62874g();
        this.f28279i = f4Var;
        this.f28282l = s8Var;
        atomicLong.set(m30399d());
        C11783a aVar = new C11783a(f4Var);
        this.f28275e = aVar;
        aVar.setName(m30391a((C11369j4) f4Var));
        m30394a(f4Var.mo62888v());
    }

    /* renamed from: e */
    public void mo63717e() {
        this.f28275e.start();
    }

    /* renamed from: a */
    private void m30394a(C10675Qi qi) {
        Object obj;
        Object obj2;
        C10856Vi.C10857a aVar = null;
        C10856Vi.C10857a aVar2 = (!qi.mo62014f().f28194p || qi.mo62002Q() == null) ? null : qi.mo62002Q().f26093b;
        if (qi.mo62014f().f28194p && qi.mo62002Q() != null) {
            aVar = qi.mo62002Q().f26092a;
        }
        EnumMap enumMap = new EnumMap(C10856Vi.C10858b.class);
        C10856Vi.C10858b bVar = C10856Vi.C10858b.WIFI;
        if (aVar2 == null) {
            obj = new C11123co();
        } else {
            obj = new C11359io(new C11326ho(new C11509lo(), new C11539mo()), new C10580Nm(), aVar2.f26094a, aVar2.f26095b);
        }
        enumMap.put(bVar, obj);
        C10856Vi.C10858b bVar2 = C10856Vi.C10858b.CELL;
        if (aVar == null) {
            obj2 = new C11123co();
        } else {
            obj2 = new C11359io(new C11326ho(new C10972Yn.C10973a(), new C11008Zn()), new C10580Nm(), aVar.f26094a, aVar.f26095b);
        }
        enumMap.put(bVar2, obj2);
        this.f28283m = new C11055ao<>(enumMap);
    }

    /* renamed from: d */
    private long m30399d() {
        long j;
        this.f28272b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f28274d.getReadableDatabase();
            if (readableDatabase != null) {
                j = C11327i.m29164a(readableDatabase, "reports");
                this.f28272b.unlock();
                return j;
            }
        } catch (Throwable unused) {
        }
        j = 0;
        this.f28272b.unlock();
        return j;
    }

    /* renamed from: b */
    public Cursor mo63713b(long j, C12017z6 z6Var) throws SQLiteException {
        Cursor cursor;
        this.f28272b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f28274d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.query("reports", (String[]) null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(z6Var.mo64185a())}, (String) null, (String) null, "number ASC", (String) null);
                this.f28272b.unlock();
                return cursor;
            }
        } catch (Throwable unused) {
        }
        cursor = null;
        this.f28272b.unlock();
        return cursor;
    }

    /* renamed from: c */
    public long mo63716c() {
        this.f28272b.lock();
        try {
            return this.f28280j.get();
        } finally {
            this.f28272b.unlock();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r1);
        r4.f28272b.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0034 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.content.ContentValues> mo63714b() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.Lock r1 = r4.f28272b
            r1.lock()
            r1 = 0
            com.yandex.metrica.impl.ob.w8 r2 = r4.f28274d     // Catch:{ all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x002b
            java.lang.String r3 = com.yandex.metrica.impl.p265ob.C10591O8.C10598e.f25331c     // Catch:{ all -> 0x0034 }
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch:{ all -> 0x0034 }
        L_0x0019:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x002b
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            android.database.DatabaseUtils.cursorRowToContentValues(r1, r2)     // Catch:{ all -> 0x0034 }
            r0.add(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0019
        L_0x002b:
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f28272b
            r1.unlock()
            goto L_0x0041
        L_0x0034:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0042 }
            r0.<init>()     // Catch:{ all -> 0x0042 }
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f28272b
            r1.unlock()
        L_0x0041:
            return r0
        L_0x0042:
            r0 = move-exception
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f28272b
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11782t8.mo63714b():java.util.List");
    }

    /* renamed from: a */
    public long mo63704a(Set<Integer> set) {
        this.f28272b.lock();
        Cursor cursor = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.f28274d.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM reports");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                int i = 0;
                for (Integer next : set) {
                    if (i > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + next);
                    i++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), (String[]) null);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        C10796U2.m27886a(cursor);
        this.f28272b.unlock();
        return j;
    }

    /* renamed from: b */
    public void mo63715b(C10675Qi qi) {
        m30394a(qi);
    }

    /* renamed from: a */
    public void mo63710a(C10806Ub ub) {
        this.f28281k.add(ub);
    }

    /* renamed from: a */
    private static String m30391a(C11369j4 j4Var) {
        return "DatabaseWorker [" + ((C11229f4) j4Var).mo62872e().mo62717c() + "]";
    }

    /* renamed from: a */
    public void mo63709a(long j, C12017z6 z6Var, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(j));
        contentValues.put("start_time", Long.valueOf(j2));
        contentValues.put("server_time_offset", Long.valueOf(C10470Lm.m26853c().mo61544a()));
        contentValues.put("obtained_before_first_sync", Boolean.valueOf(C10470Lm.m26853c().mo61747e()));
        contentValues.put("type", Integer.valueOf(z6Var.mo64185a()));
        new C11668q0(this.f28278h).mo63523a(this.f28279i.mo62880m()).mo63522a(contentValues).mo63524a();
        this.f28273c.lock();
        try {
            SQLiteDatabase writableDatabase = this.f28274d.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", (String) null, contentValues);
            }
        } catch (Throwable unused) {
        }
        this.f28273c.unlock();
    }

    /* renamed from: a */
    public void mo63711a(C11407jn jnVar, int i, C11904w6 w6Var, C10089A.C10090a aVar, C11333i4 i4Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("number", Long.valueOf(w6Var.mo64012a()));
        contentValues.put("global_number", Integer.valueOf(C10385J0.m26646d(i) ? i4Var.mo63030a() : 0));
        contentValues.put("number_of_type", Integer.valueOf(i4Var.mo63031a(i)));
        contentValues.put("time", Long.valueOf(w6Var.mo64015b()));
        contentValues.put("session_id", Long.valueOf(w6Var.mo64017c()));
        contentValues.put("session_type", Integer.valueOf(w6Var.mo64019d().mo64185a()));
        new C11668q0(this.f28278h).mo63523a(this.f28279i.mo62880m()).mo63522a(contentValues).mo63525a(jnVar, aVar, f28270o.contains(Integer.valueOf(i)) ? this.f28284n : this.f28283m);
        synchronized (this.f28276f) {
            this.f28277g.add(contentValues);
        }
        synchronized (this.f28275e) {
            this.f28275e.notifyAll();
        }
    }

    /* renamed from: a */
    public int mo63703a(long j) {
        this.f28273c.lock();
        int i = 0;
        try {
            int i2 = C10591O8.f25316a;
            SQLiteDatabase writableDatabase = this.f28274d.getWritableDatabase();
            if (writableDatabase != null) {
                i = writableDatabase.delete("sessions", C10591O8.C10598e.f25332d, new String[]{String.valueOf(j)});
            }
        } catch (Throwable unused) {
        }
        this.f28273c.unlock();
        return i;
    }

    /* renamed from: a */
    public void mo63707a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f28273c.lock();
            if (this.f28280j.get() > this.f28279i.mo62880m().mo63080K() && (writableDatabase = this.f28274d.getWritableDatabase()) != null) {
                this.f28280j.addAndGet((long) (-m30389a(writableDatabase)));
            }
        } catch (Throwable unused) {
        }
        this.f28273c.unlock();
    }

    /* renamed from: a */
    private int m30389a(SQLiteDatabase sQLiteDatabase) {
        try {
            String format = String.format("%1$s IN (SELECT %1$s FROM %2$s ORDER BY CASE WHEN %3$s IN (%4$s) THEN 2 WHEN %3$s IN (%5$s) THEN 1 ELSE 0 END, %6$s LIMIT (SELECT count() FROM %2$s) / %7$s)", new Object[]{"id", "reports", "type", TextUtils.join(", ", C10385J0.f24953i), TextUtils.join(", ", C10385J0.f24954j), "id", 10});
            return this.f28282l.mo63625a(sQLiteDatabase, "reports", format, C11740s8.C11742b.DB_OVERFLOW, this.f28279i.mo62872e().mo62715a(), true).f28129b;
        } catch (Throwable th) {
            ((C10552Nh) C10611Oh.m27142a()).reportError("deleteExcessiveReports exception", th);
            return 0;
        }
    }

    /* renamed from: a */
    public void mo63708a(long j, int i, int i2, boolean z) throws SQLiteException {
        List<ContentValues> list;
        if (i2 > 0) {
            this.f28273c.lock();
            try {
                Locale locale = Locale.US;
                String format = String.format(locale, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", new Object[]{"session_id", Long.toString(j), "session_type", Integer.toString(i), "id", "reports", Integer.toString(i2 - 1)});
                SQLiteDatabase writableDatabase = this.f28274d.getWritableDatabase();
                if (writableDatabase != null) {
                    C11740s8.C11741a a = this.f28282l.mo63625a(writableDatabase, "reports", format, C11740s8.C11742b.BAD_REQUEST, this.f28279i.mo62872e().mo62715a(), z);
                    if (a.f28128a != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ContentValues a2 : a.f28128a) {
                            arrayList.add(Integer.valueOf(m30388a(a2)));
                        }
                        for (C10806Ub b : this.f28281k) {
                            b.mo62228b(arrayList);
                        }
                    }
                    if (this.f28279i.mo62884q().mo64227c() && (list = a.f28128a) != null) {
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            m30393a(list.get(i3), "Event removed from db");
                        }
                    }
                    this.f28280j.addAndGet((long) (-a.f28129b));
                }
            } catch (Throwable unused) {
            }
            this.f28273c.unlock();
        }
    }

    /* renamed from: a */
    public Cursor mo63706a(Map<String, String> map) {
        Cursor cursor;
        this.f28272b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f28274d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.query("sessions", (String[]) null, m30392a("id >= ?", map), m30396a(new String[]{Long.toString(0)}, map), (String) null, (String) null, "id ASC", (String) null);
                this.f28272b.unlock();
                return cursor;
            }
        } catch (Throwable unused) {
        }
        cursor = null;
        this.f28272b.unlock();
        return cursor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63712a(List<ContentValues> list) {
        SQLiteDatabase sQLiteDatabase;
        if (!list.isEmpty()) {
            this.f28273c.lock();
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = this.f28274d.getWritableDatabase();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.beginTransaction();
                        for (ContentValues next : list) {
                            sQLiteDatabase.insertOrThrow("reports", (String) null, next);
                            this.f28280j.incrementAndGet();
                            m30393a(next, "Event saved to db");
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        this.f28280j.get();
                    } catch (Throwable unused) {
                        sQLiteDatabase2 = sQLiteDatabase;
                        sQLiteDatabase = sQLiteDatabase2;
                        C10796U2.m27887a(sQLiteDatabase);
                        this.f28273c.unlock();
                    }
                }
            } catch (Throwable unused2) {
                sQLiteDatabase = sQLiteDatabase2;
                C10796U2.m27887a(sQLiteDatabase);
                this.f28273c.unlock();
            }
            C10796U2.m27887a(sQLiteDatabase);
            this.f28273c.unlock();
        }
    }

    /* renamed from: a */
    public ContentValues mo63705a(long j, C12017z6 z6Var) {
        ContentValues contentValues = new ContentValues();
        this.f28272b.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f28274d.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery(String.format(locale, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", new Object[]{Long.valueOf(j), Integer.valueOf(z6Var.mo64185a())}), (String[]) null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
            C10796U2.m27886a(cursor);
            this.f28272b.unlock();
        } catch (Throwable unused) {
            C10796U2.m27886a((Cursor) null);
            this.f28272b.unlock();
        }
        return contentValues;
    }

    /* renamed from: a */
    private static String m30392a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        for (String next : map.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(next + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String[] m30396a(String[] strArr, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        for (Map.Entry<String, String> value : map.entrySet()) {
            arrayList.add(value.getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    private void m30393a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (C10385J0.m26645c(asInteger != null ? asInteger.intValue() : -1)) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(": ");
            String asString = contentValues.getAsString("name");
            int i = C10585O2.f25307a;
            String str2 = "";
            if (asString == null) {
                asString = str2;
            }
            sb.append(asString);
            String asString2 = contentValues.getAsString("value");
            if (asString2 != null) {
                str2 = asString2;
            }
            if (C10385J0.m26647e(m30388a(contentValues)) && !TextUtils.isEmpty(str2)) {
                sb.append(" with value ");
                sb.append(str2);
            }
            this.f28279i.mo62884q().mo64223b(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m30388a(ContentValues contentValues) {
        return contentValues.getAsInteger("type").intValue();
    }

    /* renamed from: a */
    static boolean m30395a(C11782t8 t8Var) {
        boolean isEmpty;
        synchronized (t8Var.f28276f) {
            isEmpty = t8Var.f28277g.isEmpty();
        }
        return isEmpty;
    }
}
