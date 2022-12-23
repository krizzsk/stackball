package com.mbridge.msdk.foundation.p164db;

import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.out.Campaign;

/* renamed from: com.mbridge.msdk.foundation.db.o */
/* compiled from: VideoDao */
public final class C6157o extends C6137a<Campaign> {

    /* renamed from: a */
    private static C6157o f15227a;

    private C6157o(C6146e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public static synchronized C6157o m15466a(C6146e eVar) {
        C6157o oVar;
        synchronized (C6157o.class) {
            if (f15227a == null) {
                f15227a = new C6157o(eVar);
            }
            oVar = f15227a;
        }
        return oVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.mbridge.msdk.foundation.entity.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.mbridge.msdk.foundation.entity.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.mbridge.msdk.foundation.entity.l} */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae A[SYNTHETIC, Splitter:B:32:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8 A[SYNTHETIC, Splitter:B:40:0x00b8] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.mbridge.msdk.foundation.entity.C6202l mo43033a(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00bc }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r6)
            return r1
        L_0x000a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r0.<init>()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            java.lang.String r2 = "SELECT * FROM video WHERE video_url = '"
            r0.append(r2)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r0.append(r7)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            java.lang.String r7 = "'"
            r0.append(r7)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            java.lang.String r7 = r0.toString()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            android.database.sqlite.SQLiteDatabase r0 = r6.getReadableDatabase()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            android.database.Cursor r7 = r0.rawQuery(r7, r1)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            if (r7 == 0) goto L_0x0097
            int r0 = r7.getCount()     // Catch:{ Exception -> 0x0092 }
            if (r0 <= 0) goto L_0x0097
            com.mbridge.msdk.foundation.entity.l r0 = new com.mbridge.msdk.foundation.entity.l     // Catch:{ Exception -> 0x0092 }
            r0.<init>()     // Catch:{ Exception -> 0x0092 }
        L_0x0035:
            boolean r1 = r7.moveToNext()     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = "video_url"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0090 }
            r0.mo43709a((java.lang.String) r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "video_state"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ Exception -> 0x0090 }
            int r1 = r7.getInt(r1)     // Catch:{ Exception -> 0x0090 }
            r0.mo43711b((int) r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "pregeress_size"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ Exception -> 0x0090 }
            long r1 = r7.getLong(r1)     // Catch:{ Exception -> 0x0090 }
            r0.mo43712b((long) r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "total_size"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ Exception -> 0x0090 }
            int r1 = r7.getInt(r1)     // Catch:{ Exception -> 0x0090 }
            r0.mo43707a((int) r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "video_path"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0090 }
            r0.mo43713b((java.lang.String) r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "video_download_start"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ Exception -> 0x0090 }
            long r1 = r7.getLong(r1)     // Catch:{ Exception -> 0x0090 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r0.mo43708a((long) r1)     // Catch:{ Exception -> 0x0090 }
            goto L_0x0035
        L_0x008e:
            r1 = r0
            goto L_0x0097
        L_0x0090:
            r1 = move-exception
            goto L_0x00a3
        L_0x0092:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x00a3
        L_0x0097:
            if (r7 == 0) goto L_0x00b2
            r7.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00b2
        L_0x009d:
            r0 = move-exception
            goto L_0x00b6
        L_0x009f:
            r7 = move-exception
            r0 = r1
            r1 = r7
            r7 = r0
        L_0x00a3:
            java.lang.String r2 = "VideoDao"
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch:{ all -> 0x00b4 }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r1)     // Catch:{ all -> 0x00b4 }
            if (r7 == 0) goto L_0x00b1
            r7.close()     // Catch:{ all -> 0x00bc }
        L_0x00b1:
            r1 = r0
        L_0x00b2:
            monitor-exit(r6)
            return r1
        L_0x00b4:
            r0 = move-exception
            r1 = r7
        L_0x00b6:
            if (r1 == 0) goto L_0x00bb
            r1.close()     // Catch:{ all -> 0x00bc }
        L_0x00bb:
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6157o.mo43033a(java.lang.String):com.mbridge.msdk.foundation.entity.l");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.mbridge.msdk.foundation.entity.l, java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009f, code lost:
        if (r0 != 0) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        if (r0 == 0) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        return r7;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.mbridge.msdk.foundation.entity.C6202l mo43034a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b2 }
            r0 = 0
            if (r7 == 0) goto L_0x000a
            monitor-exit(r5)
            return r0
        L_0x000a:
            com.mbridge.msdk.foundation.entity.l r7 = new com.mbridge.msdk.foundation.entity.l     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r1.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = " WHERE video_url = '"
            r1.append(r2)     // Catch:{ all -> 0x00b2 }
            r1.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = "'"
            r1.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r1.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "SELECT * FROM video"
            r1.append(r2)     // Catch:{ all -> 0x00b2 }
            r1.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x00b2 }
            android.database.sqlite.SQLiteDatabase r1 = r5.getReadableDatabase()     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            android.database.Cursor r0 = r1.rawQuery(r6, r0)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            if (r0 == 0) goto L_0x009f
            int r6 = r0.getCount()     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            if (r6 <= 0) goto L_0x009f
        L_0x0046:
            boolean r6 = r0.moveToNext()     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            if (r6 == 0) goto L_0x009f
            java.lang.String r6 = "video_url"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            r7.mo43709a((java.lang.String) r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            java.lang.String r6 = "video_state"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            int r6 = r0.getInt(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            r7.mo43711b((int) r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            java.lang.String r6 = "pregeress_size"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            long r1 = r0.getLong(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            r7.mo43712b((long) r1)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            java.lang.String r6 = "total_size"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            int r6 = r0.getInt(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            r7.mo43707a((int) r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            java.lang.String r6 = "video_path"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            r7.mo43713b((java.lang.String) r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            java.lang.String r6 = "video_download_start"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            long r1 = r0.getLong(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r7.mo43708a((long) r1)     // Catch:{ Exception -> 0x00ac, all -> 0x00a5 }
            goto L_0x0046
        L_0x009f:
            if (r0 == 0) goto L_0x00b0
        L_0x00a1:
            r0.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00a5:
            r6 = move-exception
            if (r0 == 0) goto L_0x00ab
            r0.close()     // Catch:{ all -> 0x00b2 }
        L_0x00ab:
            throw r6     // Catch:{ all -> 0x00b2 }
        L_0x00ac:
            if (r0 == 0) goto L_0x00b0
            goto L_0x00a1
        L_0x00b0:
            monitor-exit(r5)
            return r7
        L_0x00b2:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6157o.mo43034a(java.lang.String, java.lang.String):com.mbridge.msdk.foundation.entity.l");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43037b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r0.<init>()     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            java.lang.String r1 = "video_url = '"
            r0.append(r1)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r0.append(r4)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            java.lang.String r4 = "'"
            r0.append(r4)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            java.lang.String r4 = r0.toString()     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            android.database.sqlite.SQLiteDatabase r0 = r3.getWritableDatabase()     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            if (r0 != 0) goto L_0x001f
            monitor-exit(r3)
            return
        L_0x001f:
            android.database.sqlite.SQLiteDatabase r0 = r3.getWritableDatabase()     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            java.lang.String r1 = "video"
            r2 = 0
            r0.delete(r1, r4, r2)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x002d:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6157o.mo43037b(java.lang.String):void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43035a(java.lang.String r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            r0.<init>()     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            java.lang.String r1 = "video_download_start"
            r2 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r2
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            r0.put(r1, r6)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            java.lang.String r6 = ""
            boolean r6 = r4.m15467b((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            if (r6 == 0) goto L_0x0046
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            r6.<init>()     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            java.lang.String r7 = "video_url = '"
            r6.append(r7)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            r6.append(r5)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            java.lang.String r5 = "'"
            r6.append(r5)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            android.database.sqlite.SQLiteDatabase r6 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            java.lang.String r7 = "video"
            r1 = 0
            r6.update(r7, r0, r5, r1)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0046:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6157o.mo43035a(java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0177, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo43031a(com.mbridge.msdk.foundation.entity.CampaignEx r10, long r11, java.lang.String r13, int r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            if (r10 != 0) goto L_0x0007
            monitor-exit(r9)
            return r0
        L_0x0007:
            r2 = -1
            android.database.sqlite.SQLiteDatabase r4 = r9.getWritableDatabase()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            if (r4 != 0) goto L_0x0011
            monitor-exit(r9)
            return r2
        L_0x0011:
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.<init>()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "unitid"
            java.lang.String r6 = r10.getCampaignUnitId()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "id"
            java.lang.String r6 = r10.getId()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "package_name"
            java.lang.String r6 = r10.getPackageName()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "app_name"
            java.lang.String r6 = r10.getAppName()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "app_desc"
            java.lang.String r6 = r10.getAppDesc()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "app_size"
            java.lang.String r6 = r10.getSize()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "image_size"
            java.lang.String r6 = r10.getImageSize()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "icon_url"
            java.lang.String r6 = r10.getIconUrl()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "image_url"
            java.lang.String r6 = r10.getImageUrl()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "impression_url"
            java.lang.String r6 = r10.getImpressionURL()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "notice_url"
            java.lang.String r6 = r10.getNoticeUrl()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "download_url"
            java.lang.String r6 = r10.getClickURL()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "only_impression"
            java.lang.String r6 = r10.getOnlyImpressionURL()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "ts"
            long r6 = r10.getTimestamp()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "template"
            int r6 = r10.getTemplate()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "click_mode"
            java.lang.String r6 = r10.getClick_mode()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "landing_type"
            java.lang.String r6 = r10.getLandingType()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "link_type"
            int r6 = r10.getLinkType()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "star"
            double r6 = r10.getRating()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "cti"
            int r6 = r10.getClickInterval()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "level"
            int r6 = r10.getCacheLevel()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "adSource"
            int r6 = r10.getType()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "ad_call"
            java.lang.String r6 = r10.getAdCall()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "fc_a"
            int r6 = r10.getFca()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "ad_url_list"
            java.lang.String r6 = r10.getAd_url_list()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "video_url"
            java.lang.String r6 = r10.getVideoUrlEncode()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r5 = "total_size"
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r5, r11)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r11 = "video_state"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r11, r12)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r11 = "video_download_start"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            java.lang.Long r12 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r11, r12)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r11 = "ad_bid_token"
            java.lang.String r12 = r10.getBidToken()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            r4.put(r11, r12)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            if (r11 != 0) goto L_0x0156
            java.lang.String r11 = "video_path"
            r4.put(r11, r13)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
        L_0x0156:
            java.lang.String r11 = r10.getVideoUrlEncode()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r10 = r10.getId()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            boolean r10 = r9.m15467b((java.lang.String) r11, (java.lang.String) r10)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            if (r10 == 0) goto L_0x0166
            monitor-exit(r9)
            return r0
        L_0x0166:
            android.database.sqlite.SQLiteDatabase r10 = r9.getWritableDatabase()     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            java.lang.String r11 = "video"
            r12 = 0
            long r10 = r10.insert(r11, r12, r4)     // Catch:{ Exception -> 0x0176, all -> 0x0173 }
            monitor-exit(r9)
            return r10
        L_0x0173:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x0176:
            monitor-exit(r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6157o.mo43031a(com.mbridge.msdk.foundation.entity.CampaignEx, long, java.lang.String, int):long");
    }

    /* renamed from: b */
    private synchronized boolean m15467b(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "SELECT id FROM video WHERE video_url = '" + str + "'";
        } else {
            str3 = "SELECT id FROM video WHERE video_url = '" + str + "' AND " + "id" + " = " + str2;
        }
        Cursor rawQuery = getReadableDatabase().rawQuery(str3, (String[]) null);
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        }
        rawQuery.close();
        return true;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized long mo43032a(java.lang.String r4, long r5, int r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = -1
            android.database.sqlite.SQLiteDatabase r1 = r3.getWritableDatabase()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            if (r1 != 0) goto L_0x000b
            long r4 = (long) r0
            monitor-exit(r3)
            return r4
        L_0x000b:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r1.<init>()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r2 = "pregeress_size"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r1.put(r2, r5)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r5 = "video_state"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r1.put(r5, r6)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r5 = ""
            boolean r5 = r3.m15467b((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            if (r5 == 0) goto L_0x0059
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r5.<init>()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r6 = "video_url = '"
            r5.append(r6)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r5.append(r4)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r4 = "'"
            r5.append(r4)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.Object r5 = new java.lang.Object     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r5.<init>()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            android.database.sqlite.SQLiteDatabase r6 = r3.getWritableDatabase()     // Catch:{ all -> 0x0053 }
            java.lang.String r7 = "video"
            r2 = 0
            int r0 = r6.update(r7, r1, r4, r2)     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            goto L_0x0059
        L_0x0053:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            throw r4     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
        L_0x0056:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0059:
            long r4 = (long) r0
            monitor-exit(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6157o.mo43032a(java.lang.String, long, int):long");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final synchronized long mo43036b(java.lang.String r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            if (r1 != 0) goto L_0x000b
            long r5 = (long) r0
            monitor-exit(r4)
            return r5
        L_0x000b:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            r1.<init>()     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.lang.String r2 = "total_size"
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            r1.put(r2, r6)     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.lang.String r6 = ""
            boolean r6 = r4.m15467b((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            if (r6 == 0) goto L_0x0050
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            r6.<init>()     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.lang.String r7 = "video_url = '"
            r6.append(r7)     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            r6.append(r5)     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.lang.String r5 = "'"
            r6.append(r5)     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.lang.Object r6 = new java.lang.Object     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            r6.<init>()     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            monitor-enter(r6)     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            android.database.sqlite.SQLiteDatabase r7 = r4.getWritableDatabase()     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "video"
            r3 = 0
            int r0 = r7.update(r2, r1, r5, r3)     // Catch:{ all -> 0x004a }
            monitor-exit(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0050
        L_0x004a:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x004a }
            throw r5     // Catch:{ Exception -> 0x0050, all -> 0x004d }
        L_0x004d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0050:
            long r5 = (long) r0
            monitor-exit(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6157o.mo43036b(java.lang.String, long):long");
    }
}
