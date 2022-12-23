package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.videocommon.download.C7191g;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.videocommon.download.b */
/* compiled from: DownLoadH5SourceListener */
public final class C7183b implements C7191g.C7198c {

    /* renamed from: a */
    private static String f17991a = "DownLoadH5SourceListener";

    /* renamed from: b */
    private ConcurrentMap<String, C7183b> f17992b;

    /* renamed from: c */
    private C7206j f17993c;

    /* renamed from: d */
    private CopyOnWriteArrayList<C7191g.C7199d> f17994d;

    /* renamed from: e */
    private String f17995e;

    /* renamed from: a */
    public final void mo49199a() {
    }

    public C7183b(ConcurrentMap<String, C7183b> concurrentMap, C7206j jVar, C7191g.C7199d dVar, String str) {
        CopyOnWriteArrayList<C7191g.C7199d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f17994d = copyOnWriteArrayList;
        this.f17992b = concurrentMap;
        this.f17993c = jVar;
        copyOnWriteArrayList.add(dVar);
        this.f17995e = str;
    }

    /* renamed from: a */
    public final void mo49200a(C7191g.C7199d dVar) {
        this.f17994d.add(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49202a(java.lang.String r2, byte[] r3, java.lang.String r4) {
        /*
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, com.mbridge.msdk.videocommon.download.b> r2 = r1.f17992b     // Catch:{ Exception -> 0x0075 }
            if (r2 != 0) goto L_0x0024
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r2 = r1.f17994d     // Catch:{ Exception -> 0x0075 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0075 }
        L_0x000a:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0075 }
            com.mbridge.msdk.videocommon.download.g$d r3 = (com.mbridge.msdk.videocommon.download.C7191g.C7199d) r3     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x000a
            java.lang.String r0 = "mResDownloadingMap  is null"
            r3.mo44019a(r4, r0)     // Catch:{ Exception -> 0x0075 }
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r0 = r1.f17994d     // Catch:{ Exception -> 0x0075 }
            r0.remove(r3)     // Catch:{ Exception -> 0x0075 }
            goto L_0x000a
        L_0x0023:
            return
        L_0x0024:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.mbridge.msdk.videocommon.download.b> r2 = r1.f17992b     // Catch:{ Exception -> 0x0075 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ Exception -> 0x0075 }
            if (r2 == 0) goto L_0x0031
            java.util.concurrent.ConcurrentMap<java.lang.String, com.mbridge.msdk.videocommon.download.b> r2 = r1.f17992b     // Catch:{ Exception -> 0x0075 }
            r2.remove(r4)     // Catch:{ Exception -> 0x0075 }
        L_0x0031:
            if (r3 == 0) goto L_0x0072
            int r2 = r3.length     // Catch:{ Exception -> 0x0075 }
            if (r2 <= 0) goto L_0x0072
            com.mbridge.msdk.videocommon.download.j r2 = r1.f17993c     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = r2.mo49235a(r4, r3)     // Catch:{ Exception -> 0x0075 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x0060
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r2 = r1.f17994d     // Catch:{ Exception -> 0x0075 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0075 }
        L_0x0048:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0075 }
            com.mbridge.msdk.videocommon.download.g$d r3 = (com.mbridge.msdk.videocommon.download.C7191g.C7199d) r3     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x0048
            r3.mo44018a(r4)     // Catch:{ Exception -> 0x0075 }
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r0 = r1.f17994d     // Catch:{ Exception -> 0x0075 }
            r0.remove(r3)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0048
        L_0x005f:
            return
        L_0x0060:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075 }
            r3.<init>()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = "data save failed:"
            r3.append(r0)     // Catch:{ Exception -> 0x0075 }
            r3.append(r2)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0075 }
            goto L_0x008e
        L_0x0072:
            java.lang.String r2 = "response data is error"
            goto L_0x008e
        L_0x0075:
            r2 = move-exception
            boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r3 == 0) goto L_0x007d
            r2.printStackTrace()
        L_0x007d:
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0082 }
            goto L_0x008e
        L_0x0082:
            r2 = move-exception
            java.lang.String r3 = f17991a
            java.lang.String r0 = r2.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r3, r0, r2)
            java.lang.String r2 = ""
        L_0x008e:
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r3 = r1.f17994d
            java.util.Iterator r3 = r3.iterator()
        L_0x0094:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r3.next()
            com.mbridge.msdk.videocommon.download.g$d r0 = (com.mbridge.msdk.videocommon.download.C7191g.C7199d) r0
            if (r0 == 0) goto L_0x0094
            r0.mo44019a(r4, r2)
            goto L_0x0094
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C7183b.mo49202a(java.lang.String, byte[], java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo49201a(String str) {
        try {
            if (this.f17992b == null) {
                Iterator<C7191g.C7199d> it = this.f17994d.iterator();
                while (it.hasNext()) {
                    C7191g.C7199d next = it.next();
                    if (next != null) {
                        next.mo44019a(this.f17995e, "mResDownloadingMap  is null");
                        this.f17994d.remove(next);
                    }
                }
                return;
            }
            if (this.f17992b.containsKey(this.f17995e)) {
                this.f17992b.remove(this.f17995e);
            }
            Iterator<C7191g.C7199d> it2 = this.f17994d.iterator();
            while (it2.hasNext()) {
                C7191g.C7199d next2 = it2.next();
                if (next2 != null) {
                    next2.mo44019a(this.f17995e, str);
                    this.f17994d.remove(next2);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            str = e.getMessage();
        } catch (Throwable th) {
            C6361q.m16155a(f17991a, th.getMessage(), th);
        }
    }
}
