package com.yandex.metrica;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.metrica.impl.p265ob.C10122B2;
import com.yandex.metrica.impl.p265ob.C11257g0;

public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a */
    private boolean f24032a = false;

    /* renamed from: b */
    private final UriMatcher f24033b = new UriMatcher(-1);

    public int delete(Uri uri, String str, String[] strArr) {
        C10122B2.m26040b("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f24032a = true;
    }

    public String getType(Uri uri) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r0 == 2) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        com.yandex.metrica.impl.p265ob.C10122B2.m26040b("Bad content provider uri: %s", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r6 = new com.yandex.metrica.impl.p265ob.C11300h0(new com.yandex.metrica.impl.p265ob.C10536N3(), new com.yandex.metrica.impl.p265ob.C10586O3(), new com.yandex.metrica.impl.p265ob.C10583O0(), "clids");
        r0 = getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r0 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r0 = r0.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r0 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r6.mo62984a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r6 = new com.yandex.metrica.impl.p265ob.C11300h0(new com.yandex.metrica.impl.p265ob.C10222Ee(), new com.yandex.metrica.impl.p265ob.C10253Fe(), new com.yandex.metrica.impl.p265ob.C10583O0(), "preload info");
        r0 = getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        r0 = r0.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r0 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r6.mo62984a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        com.yandex.metrica.impl.p265ob.C11257g0.m29013a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        if (r7 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r0 = r5.f24033b.match(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == 1) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r6, android.content.ContentValues r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f24032a     // Catch:{ all -> 0x0075 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            return r1
        L_0x0008:
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            if (r7 == 0) goto L_0x0071
            android.content.UriMatcher r0 = r5.f24033b
            int r0 = r0.match(r6)
            r2 = 1
            if (r0 == r2) goto L_0x004a
            r3 = 2
            if (r0 == r3) goto L_0x0022
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r0 = 0
            r7[r0] = r6
            java.lang.String r6 = "Bad content provider uri: %s"
            com.yandex.metrica.impl.p265ob.C10122B2.m26040b(r6, r7)
            goto L_0x0071
        L_0x0022:
            com.yandex.metrica.impl.ob.h0 r6 = new com.yandex.metrica.impl.ob.h0
            com.yandex.metrica.impl.ob.N3 r0 = new com.yandex.metrica.impl.ob.N3
            r0.<init>()
            com.yandex.metrica.impl.ob.O3 r2 = new com.yandex.metrica.impl.ob.O3
            r2.<init>()
            com.yandex.metrica.impl.ob.O0 r3 = new com.yandex.metrica.impl.ob.O0
            r3.<init>()
            java.lang.String r4 = "clids"
            r6.<init>(r0, r2, r3, r4)
            android.content.Context r0 = r5.getContext()
            if (r0 != 0) goto L_0x0040
            r0 = r1
            goto L_0x0044
        L_0x0040:
            android.content.Context r0 = r0.getApplicationContext()
        L_0x0044:
            if (r0 == 0) goto L_0x0071
            r6.mo62984a(r0, r7)
            goto L_0x0071
        L_0x004a:
            com.yandex.metrica.impl.ob.h0 r6 = new com.yandex.metrica.impl.ob.h0
            com.yandex.metrica.impl.ob.Ee r0 = new com.yandex.metrica.impl.ob.Ee
            r0.<init>()
            com.yandex.metrica.impl.ob.Fe r2 = new com.yandex.metrica.impl.ob.Fe
            r2.<init>()
            com.yandex.metrica.impl.ob.O0 r3 = new com.yandex.metrica.impl.ob.O0
            r3.<init>()
            java.lang.String r4 = "preload info"
            r6.<init>(r0, r2, r3, r4)
            android.content.Context r0 = r5.getContext()
            if (r0 != 0) goto L_0x0068
            r0 = r1
            goto L_0x006c
        L_0x0068:
            android.content.Context r0 = r0.getApplicationContext()
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            r6.mo62984a(r0, r7)
        L_0x0071:
            com.yandex.metrica.impl.p265ob.C11257g0.m29013a()
            return r1
        L_0x0075:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.PreloadInfoContentProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public boolean onCreate() {
        Context context;
        Context context2 = getContext();
        if (context2 == null) {
            context = null;
        } else {
            context = context2.getApplicationContext();
        }
        String str = (context != null ? context.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
        this.f24033b.addURI(str, "preloadinfo", 1);
        this.f24033b.addURI(str, "clids", 2);
        C11257g0.m29015a(this);
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C10122B2.m26040b("Query is not supported", new Object[0]);
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C10122B2.m26040b("Updating is not supported", new Object[0]);
        return -1;
    }
}
