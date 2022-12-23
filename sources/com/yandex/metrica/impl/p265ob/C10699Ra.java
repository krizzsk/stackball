package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Ra */
class C10699Ra implements C12019z8, Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<String, Object> f25586a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<String, Object> f25587b;

    /* renamed from: c */
    private final String f25588c;

    /* renamed from: d */
    private final C10700a f25589d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile boolean f25590e;

    /* renamed from: f */
    private final C10452L8 f25591f;

    /* renamed from: com.yandex.metrica.impl.ob.Ra$a */
    private class C10700a extends C11890vn {
        public C10700a(String str) {
            super(str);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|(2:11|12)|13|14|15) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x001c A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                com.yandex.metrica.impl.ob.Ra r0 = com.yandex.metrica.impl.p265ob.C10699Ra.this
                java.util.Map r0 = r0.f25586a
                monitor-enter(r0)
                com.yandex.metrica.impl.ob.Ra r1 = com.yandex.metrica.impl.p265ob.C10699Ra.this     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.p265ob.C10699Ra.m27481b((com.yandex.metrica.impl.p265ob.C10699Ra) r1)     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.ob.Ra r1 = com.yandex.metrica.impl.p265ob.C10699Ra.this     // Catch:{ all -> 0x005a }
                r2 = 1
                boolean unused = r1.f25590e = r2     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.ob.Ra r1 = com.yandex.metrica.impl.p265ob.C10699Ra.this     // Catch:{ all -> 0x005a }
                java.util.Map r1 = r1.f25586a     // Catch:{ all -> 0x005a }
                r1.notifyAll()     // Catch:{ all -> 0x005a }
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
            L_0x001c:
                boolean r0 = r3.mo63616c()
                if (r0 == 0) goto L_0x0059
                monitor-enter(r3)
                com.yandex.metrica.impl.ob.Ra r0 = com.yandex.metrica.impl.p265ob.C10699Ra.this     // Catch:{ all -> 0x0056 }
                java.util.Map r0 = r0.f25587b     // Catch:{ all -> 0x0056 }
                int r0 = r0.size()     // Catch:{ all -> 0x0056 }
                if (r0 != 0) goto L_0x0032
                r3.wait()     // Catch:{ InterruptedException -> 0x0032 }
            L_0x0032:
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0056 }
                com.yandex.metrica.impl.ob.Ra r1 = com.yandex.metrica.impl.p265ob.C10699Ra.this     // Catch:{ all -> 0x0056 }
                java.util.Map r1 = r1.f25587b     // Catch:{ all -> 0x0056 }
                r0.<init>(r1)     // Catch:{ all -> 0x0056 }
                com.yandex.metrica.impl.ob.Ra r1 = com.yandex.metrica.impl.p265ob.C10699Ra.this     // Catch:{ all -> 0x0056 }
                java.util.Map r1 = r1.f25587b     // Catch:{ all -> 0x0056 }
                r1.clear()     // Catch:{ all -> 0x0056 }
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                int r1 = r0.size()
                if (r1 <= 0) goto L_0x001c
                com.yandex.metrica.impl.ob.Ra r1 = com.yandex.metrica.impl.p265ob.C10699Ra.this
                com.yandex.metrica.impl.p265ob.C10699Ra.m27479a((com.yandex.metrica.impl.p265ob.C10699Ra) r1, (java.util.Map) r0)
                r0.clear()
                goto L_0x001c
            L_0x0056:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                throw r0
            L_0x0059:
                return
            L_0x005a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10699Ra.C10700a.run():void");
        }
    }

    public C10699Ra(C11906w8 w8Var, String str) {
        this(str, (C10452L8) new C10543N8(w8Var));
    }

    /* renamed from: a */
    static void m27479a(C10699Ra ra, Map map) {
        SQLiteDatabase sQLiteDatabase;
        ra.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            Object value = entry.getValue();
            contentValues.put(SDKConstants.PARAM_KEY, (String) entry.getKey());
            if (value == ra) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = ra.f25591f.mo61713a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString("value") == null) {
                            String asString = contentValues2.getAsString(SDKConstants.PARAM_KEY);
                            sQLiteDatabase.delete(ra.f25588c, "key = ?", new String[]{asString});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(ra.f25588c, (String) null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    C10796U2.m27887a(sQLiteDatabase);
                    ra.f25591f.mo61714a(sQLiteDatabase);
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = sQLiteDatabase2;
            C10796U2.m27887a(sQLiteDatabase);
            ra.f25591f.mo61714a(sQLiteDatabase);
        }
        C10796U2.m27887a(sQLiteDatabase);
        ra.f25591f.mo61714a(sQLiteDatabase);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0022 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m27481b(com.yandex.metrica.impl.p265ob.C10699Ra r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            com.yandex.metrica.impl.ob.L8 r4 = r13.f25591f     // Catch:{ all -> 0x0092 }
            android.database.sqlite.SQLiteDatabase r4 = r4.mo61713a()     // Catch:{ all -> 0x0092 }
            if (r4 == 0) goto L_0x0093
            java.lang.String r6 = r13.f25588c     // Catch:{ all -> 0x0093 }
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ all -> 0x0093 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0093 }
        L_0x0022:
            boolean r6 = r5.moveToNext()     // Catch:{ all -> 0x0090 }
            if (r6 == 0) goto L_0x0090
            int r6 = r5.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x0090 }
            int r7 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0090 }
            java.lang.String r7 = r5.getString(r7)     // Catch:{ all -> 0x0090 }
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0090 }
            int r8 = r5.getInt(r8)     // Catch:{ all -> 0x0090 }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0090 }
            if (r9 != 0) goto L_0x0022
            r9 = 1
            if (r8 == r9) goto L_0x0071
            r9 = 2
            if (r8 == r9) goto L_0x0068
            r9 = 3
            if (r8 == r9) goto L_0x005f
            r9 = 4
            if (r8 == r9) goto L_0x0088
            r9 = 5
            if (r8 == r9) goto L_0x0056
            goto L_0x0087
        L_0x0056:
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            goto L_0x0088
        L_0x005f:
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            goto L_0x0088
        L_0x0068:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            goto L_0x0088
        L_0x0071:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch:{ all -> 0x0090 }
            if (r8 == 0) goto L_0x007c
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            goto L_0x0088
        L_0x007c:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0090 }
            if (r7 == 0) goto L_0x0087
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0090 }
            goto L_0x0088
        L_0x0087:
            r7 = r3
        L_0x0088:
            if (r7 == 0) goto L_0x0022
            java.util.Map<java.lang.String, java.lang.Object> r8 = r13.f25586a     // Catch:{ all -> 0x0090 }
            r8.put(r6, r7)     // Catch:{ all -> 0x0090 }
            goto L_0x0022
        L_0x0090:
            r3 = r5
            goto L_0x0093
        L_0x0092:
            r4 = r3
        L_0x0093:
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r3)
            com.yandex.metrica.impl.ob.L8 r13 = r13.f25591f
            r13.mo61714a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10699Ra.m27481b(com.yandex.metrica.impl.ob.Ra):void");
    }

    public void close() {
        if (this.f25589d.mo63616c()) {
            this.f25589d.mo63993d();
        }
    }

    protected C10699Ra(String str, C10452L8 l8) {
        this.f25586a = new HashMap();
        this.f25587b = new HashMap();
        this.f25591f = l8;
        this.f25588c = str;
        C10700a aVar = new C10700a(String.format(Locale.US, "YMM-DW-%s", new Object[]{Integer.valueOf(C11922wn.m30802c())}));
        this.f25589d = aVar;
        aVar.start();
    }

    /* renamed from: c */
    private Object m27482c(String str) {
        Object obj;
        synchronized (this.f25586a) {
            m27484c();
            obj = this.f25586a.get(str);
        }
        return obj;
    }

    /* renamed from: c */
    private void m27484c() {
        if (!this.f25590e) {
            try {
                this.f25586a.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo62122b() {
        synchronized (this.f25589d) {
            this.f25589d.notifyAll();
        }
    }

    /* renamed from: b */
    public String mo62121b(String str, String str2) {
        Object c = m27482c(str);
        return c instanceof String ? (String) c : str2;
    }

    /* renamed from: b */
    public boolean mo62123b(String str, boolean z) {
        Object c = m27482c(str);
        return c instanceof Boolean ? ((Boolean) c).booleanValue() : z;
    }

    /* renamed from: b */
    public C12019z8 mo62118b(String str) {
        synchronized (this.f25586a) {
            m27484c();
            this.f25586a.remove(str);
        }
        synchronized (this.f25589d) {
            this.f25587b.put(str, this);
            this.f25589d.notifyAll();
        }
        return this;
    }

    /* renamed from: b */
    public C12019z8 mo62120b(String str, long j) {
        mo62116a(str, (Object) Long.valueOf(j));
        return this;
    }

    /* renamed from: b */
    public synchronized C12019z8 mo62119b(String str, int i) {
        mo62116a(str, (Object) Integer.valueOf(i));
        return this;
    }

    /* renamed from: a */
    public int mo62111a(String str, int i) {
        Object c = m27482c(str);
        return c instanceof Integer ? ((Integer) c).intValue() : i;
    }

    /* renamed from: a */
    public long mo62112a(String str, long j) {
        Object c = m27482c(str);
        return c instanceof Long ? ((Long) c).longValue() : j;
    }

    /* renamed from: a */
    public synchronized C12019z8 mo62113a(String str, String str2) {
        mo62116a(str, (Object) str2);
        return this;
    }

    /* renamed from: a */
    public C12019z8 mo62114a(String str, boolean z) {
        mo62116a(str, (Object) Boolean.valueOf(z));
        return this;
    }

    /* renamed from: a */
    public boolean mo62117a(String str) {
        boolean containsKey;
        synchronized (this.f25586a) {
            m27484c();
            containsKey = this.f25586a.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: a */
    public Set<String> mo62115a() {
        HashSet hashSet;
        synchronized (this.f25586a) {
            hashSet = new HashSet(this.f25586a.keySet());
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62116a(String str, Object obj) {
        synchronized (this.f25586a) {
            m27484c();
            this.f25586a.put(str, obj);
        }
        synchronized (this.f25589d) {
            this.f25587b.put(str, obj);
            this.f25589d.notifyAll();
        }
    }
}
