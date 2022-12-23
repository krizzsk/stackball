package com.mbridge.msdk.foundation.same.net.p178g;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.foundation.same.net.p177f.C6272c;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.c */
/* compiled from: RequestControlUtil */
public final class C6276c {

    /* renamed from: a */
    private final String f15557a;

    /* renamed from: b */
    private int f15558b;

    /* renamed from: c */
    private ArrayList<Integer> f15559c;

    /* renamed from: d */
    private ConcurrentHashMap<String, C6278a> f15560d;

    /* renamed from: com.mbridge.msdk.foundation.same.net.g.c$b */
    /* compiled from: RequestControlUtil */
    private static class C6279b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6276c f15564a = new C6276c();
    }

    private C6276c() {
        this.f15557a = "IDErrorUtil";
        this.f15559c = new ArrayList<>();
        this.f15560d = new ConcurrentHashMap<>();
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        b = b == null ? C6076b.m15089a().mo42748b() : b;
        this.f15558b = b.mo42680Y() * 1000;
        if (b.mo42681Z() == null || b.mo42681Z().size() <= 0) {
            this.f15559c.addAll(Arrays.asList(new Integer[]{-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616}));
        } else {
            this.f15559c.addAll(b.mo42681Z());
        }
    }

    /* renamed from: a */
    public static C6276c m15863a() {
        return C6279b.f15564a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43856a(java.lang.String r3, int r4, java.lang.String r5, long r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.g.c$a> r0 = r2.f15560d     // Catch:{ all -> 0x002b }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r2)
            return
        L_0x000b:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r2)
            return
        L_0x0013:
            java.util.ArrayList<java.lang.Integer> r0 = r2.f15559c     // Catch:{ all -> 0x002b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002b }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0029
            com.mbridge.msdk.foundation.same.net.g.c$a r0 = new com.mbridge.msdk.foundation.same.net.g.c$a     // Catch:{ all -> 0x002b }
            r0.<init>(r6, r4, r5)     // Catch:{ all -> 0x002b }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.g.c$a> r4 = r2.f15560d     // Catch:{ all -> 0x002b }
            r4.put(r3, r0)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p178g.C6276c.mo43856a(java.lang.String, int, java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.mbridge.msdk.foundation.same.net.p178g.C6276c.C6278a m15862a(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.g.c$a> r0 = r7.f15560d     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.containsKey(r8)     // Catch:{ all -> 0x0070 }
            r1 = 0
            if (r0 == 0) goto L_0x006e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.g.c$a> r0 = r7.f15560d     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0070 }
            com.mbridge.msdk.foundation.same.net.g.c$a r0 = (com.mbridge.msdk.foundation.same.net.p178g.C6276c.C6278a) r0     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006e
            int r2 = r0.f15562b     // Catch:{ all -> 0x0070 }
            r3 = -1
            if (r2 != r3) goto L_0x001b
            monitor-exit(r7)
            return r0
        L_0x001b:
            long r2 = r0.f15561a     // Catch:{ all -> 0x0070 }
            int r4 = r7.f15558b     // Catch:{ all -> 0x0070 }
            long r4 = (long) r4     // Catch:{ all -> 0x0070 }
            long r2 = r2 + r4
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0070 }
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x006c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.g.c$a> r0 = r7.f15560d     // Catch:{ all -> 0x0070 }
            r0.remove(r8)     // Catch:{ all -> 0x0070 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.g.c$a> r8 = r7.f15560d     // Catch:{ all -> 0x0070 }
            int r8 = r8.size()     // Catch:{ all -> 0x0070 }
            if (r8 <= 0) goto L_0x006a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.g.c$a> r8 = r7.f15560d     // Catch:{ all -> 0x0070 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x0070 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0070 }
        L_0x0040:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0070 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0070 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0070 }
            com.mbridge.msdk.foundation.same.net.g.c$a r2 = (com.mbridge.msdk.foundation.same.net.p178g.C6276c.C6278a) r2     // Catch:{ all -> 0x0070 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0070 }
            long r5 = r2.f15561a     // Catch:{ all -> 0x0070 }
            long r3 = r3 - r5
            int r2 = r7.f15558b     // Catch:{ all -> 0x0070 }
            long r5 = (long) r2     // Catch:{ all -> 0x0070 }
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0040
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.same.net.g.c$a> r2 = r7.f15560d     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x0070 }
            r2.remove(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0040
        L_0x006a:
            monitor-exit(r7)
            return r1
        L_0x006c:
            monitor-exit(r7)
            return r0
        L_0x006e:
            monitor-exit(r7)
            return r1
        L_0x0070:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p178g.C6276c.m15862a(java.lang.String):com.mbridge.msdk.foundation.same.net.g.c$a");
    }

    /* renamed from: a */
    public final C6293k mo43855a(C6287d dVar) {
        int parseInt;
        String str = dVar.mo43871b().get("app_id");
        String str2 = dVar.mo43871b().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        String str3 = dVar.mo43871b().get("ad_type");
        String str4 = dVar.mo43871b().get("token");
        String str5 = str + "_" + dVar.mo43871b().get(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID) + "_" + str2 + "_" + str3;
        C6278a a = m15862a(str5);
        if (a != null && !TextUtils.isEmpty(a.f15563c)) {
            try {
                if (a.f15562b != -1) {
                    return C6293k.m15930a(new JSONObject(a.f15563c), new C6272c(200, a.f15563c.getBytes(), (List<C6245b>) null));
                }
                if (!(!TextUtils.isEmpty(str4) || str3 == null || TextUtils.isEmpty(str3) || (parseInt = Integer.parseInt(str3)) == 287 || parseInt == 94)) {
                    if (System.currentTimeMillis() < ((long) (C6076b.m15089a().mo42753d(str, str2).mo42798x() * 1000)) + a.f15561a) {
                        return C6293k.m15930a(new JSONObject(a.f15563c), new C6272c(200, a.f15563c.getBytes(), (List<C6245b>) null));
                    }
                    this.f15560d.remove(str5);
                    return null;
                }
            } catch (Exception e) {
                C6361q.m16158d("IDErrorUtil", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.g.c$a */
    /* compiled from: RequestControlUtil */
    private static class C6278a {

        /* renamed from: a */
        public long f15561a;

        /* renamed from: b */
        public int f15562b;

        /* renamed from: c */
        public String f15563c;

        public C6278a(long j, int i, String str) {
            this.f15561a = j;
            this.f15562b = i;
            this.f15563c = str;
        }
    }
}
