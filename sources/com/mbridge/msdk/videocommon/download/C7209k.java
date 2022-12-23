package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import com.mbridge.msdk.videocommon.download.C7200h;
import com.mbridge.msdk.videocommon.listener.C7212a;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: com.mbridge.msdk.videocommon.download.k */
/* compiled from: UnitCacheCtroller */
public final class C7209k {

    /* renamed from: a */
    C6086d f18037a = null;

    /* renamed from: b */
    C6086d f18038b = null;

    /* renamed from: c */
    private List<CampaignEx> f18039c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f18040d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C7212a f18041e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ConcurrentHashMap<String, C7212a> f18042f;

    /* renamed from: g */
    private C7185d f18043g = new C7185d() {
        /* renamed from: a */
        public final void mo49216a(long j, int i) {
            if (i == 5 || i == 4) {
                boolean unused = C7209k.this.f18040d = true;
                C7209k.this.mo49240a();
            }
            if (i == 2) {
                boolean unused2 = C7209k.this.f18040d = true;
            }
        }
    };

    /* renamed from: h */
    private CopyOnWriteArrayList<Map<String, C7180a>> f18044h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    private Context f18045i = C6122a.m15302b().mo42895d();

    /* renamed from: j */
    private ExecutorService f18046j;

    /* renamed from: k */
    private long f18047k = 3600;

    /* renamed from: l */
    private String f18048l;

    /* renamed from: m */
    private C7179c f18049m;

    /* renamed from: n */
    private int f18050n = 2;

    /* renamed from: o */
    private int f18051o = 1;

    public C7209k(Context context, List<CampaignEx> list, ExecutorService executorService, String str, int i) {
        List<CampaignEx> list2 = this.f18039c;
        if (!(list2 == null || list == null)) {
            list2.addAll(list);
        }
        this.f18046j = executorService;
        this.f18048l = str;
        this.f18051o = i;
        m18336b(this.f18039c);
    }

    public C7209k(Context context, CampaignEx campaignEx, ExecutorService executorService, String str, int i) {
        List<CampaignEx> list = this.f18039c;
        if (!(list == null || campaignEx == null)) {
            list.add(campaignEx);
        }
        this.f18046j = executorService;
        this.f18048l = str;
        this.f18051o = i;
        m18336b(this.f18039c);
    }

    /* renamed from: a */
    public final void mo49242a(C7212a aVar) {
        this.f18041e = aVar;
    }

    /* renamed from: a */
    public final void mo49243a(String str, C7212a aVar) {
        if (this.f18042f == null) {
            this.f18042f = new ConcurrentHashMap<>();
        }
        this.f18042f.put(str, aVar);
    }

    /* renamed from: a */
    public final void mo49244a(List<CampaignEx> list) {
        List<CampaignEx> list2 = this.f18039c;
        if (!(list2 == null || list == null)) {
            list2.addAll(list);
        }
        m18336b(this.f18039c);
    }

    /* renamed from: a */
    public final void mo49241a(CampaignEx campaignEx) {
        List<CampaignEx> list = this.f18039c;
        if (!(list == null || campaignEx == null)) {
            list.add(campaignEx);
        }
        m18336b(this.f18039c);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01f1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18336b(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0211
            int r0 = r13.size()
            if (r0 != 0) goto L_0x000a
            goto L_0x0211
        L_0x000a:
            r12.m18342e()
            r12.m18340d()
            int r0 = r12.f18051o
            r1 = 94
            r2 = 287(0x11f, float:4.02E-43)
            r3 = 1
            if (r0 == r3) goto L_0x00ee
            if (r0 == r2) goto L_0x009f
            r4 = 298(0x12a, float:4.18E-43)
            if (r0 == r4) goto L_0x0061
            if (r0 == r1) goto L_0x009f
            r4 = 95
            if (r0 == r4) goto L_0x0027
            goto L_0x0128
        L_0x0027:
            java.lang.String r0 = r12.f18048l     // Catch:{ Exception -> 0x0059 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0059 }
            if (r0 != 0) goto L_0x0128
            com.mbridge.msdk.b.b r0 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x0059 }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r4 = r4.mo42896e()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r5 = r12.f18048l     // Catch:{ Exception -> 0x0059 }
            com.mbridge.msdk.b.d r0 = r0.mo42755e(r4, r5)     // Catch:{ Exception -> 0x0059 }
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = r12.f18048l     // Catch:{ Exception -> 0x0059 }
            com.mbridge.msdk.b.d r0 = com.mbridge.msdk.p158b.C6086d.m15135e(r0)     // Catch:{ Exception -> 0x0059 }
        L_0x0049:
            if (r0 == 0) goto L_0x0128
            long r4 = r0.mo42783i()     // Catch:{ Exception -> 0x0059 }
            r12.f18047k = r4     // Catch:{ Exception -> 0x0059 }
            int r0 = r0.mo42785k()     // Catch:{ Exception -> 0x0059 }
            r12.f18050n = r0     // Catch:{ Exception -> 0x0059 }
            goto L_0x0128
        L_0x0059:
            java.lang.String r13 = "UnitCacheCtroller"
            java.lang.String r0 = "make sure your had put feeds jar into your project"
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r13, r0)
            return
        L_0x0061:
            com.mbridge.msdk.b.b r0 = com.mbridge.msdk.p158b.C6076b.m15089a()
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r4 = r4.mo42896e()
            java.lang.String r5 = r12.f18048l
            com.mbridge.msdk.b.d r0 = r0.mo42757f(r4, r5)
            r12.f18038b = r0
            if (r0 != 0) goto L_0x008b
            com.mbridge.msdk.b.b r0 = com.mbridge.msdk.p158b.C6076b.m15089a()
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r4 = r4.mo42896e()
            java.lang.String r5 = r12.f18048l
            com.mbridge.msdk.b.d r0 = r0.mo42753d(r4, r5)
            r12.f18038b = r0
        L_0x008b:
            com.mbridge.msdk.b.d r0 = r12.f18038b
            if (r0 == 0) goto L_0x0128
            long r4 = r0.mo42783i()
            r12.f18047k = r4
            com.mbridge.msdk.b.d r0 = r12.f18038b
            int r0 = r0.mo42785k()
            r12.f18050n = r0
            goto L_0x0128
        L_0x009f:
            java.lang.String r0 = "com.mbridge.msdk.videocommon.d.a"
            java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00e6 }
            com.mbridge.msdk.videocommon.d.b r0 = com.mbridge.msdk.videocommon.p239d.C7177b.m18135a()     // Catch:{ Exception -> 0x00e6 }
            com.mbridge.msdk.videocommon.d.a r0 = r0.mo49112b()     // Catch:{ Exception -> 0x00e6 }
            if (r0 != 0) goto L_0x00b5
            com.mbridge.msdk.videocommon.d.b r4 = com.mbridge.msdk.videocommon.p239d.C7177b.m18135a()     // Catch:{ Exception -> 0x00e6 }
            r4.mo49113c()     // Catch:{ Exception -> 0x00e6 }
        L_0x00b5:
            if (r0 == 0) goto L_0x00bd
            long r4 = r0.mo49100e()     // Catch:{ Exception -> 0x00e6 }
            r12.f18047k = r4     // Catch:{ Exception -> 0x00e6 }
        L_0x00bd:
            java.lang.String r0 = r12.f18048l     // Catch:{ Exception -> 0x00e6 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00e6 }
            if (r0 != 0) goto L_0x00d9
            com.mbridge.msdk.videocommon.d.b r0 = com.mbridge.msdk.videocommon.p239d.C7177b.m18135a()     // Catch:{ Exception -> 0x00e6 }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r4 = r4.mo42896e()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r5 = r12.f18048l     // Catch:{ Exception -> 0x00e6 }
            com.mbridge.msdk.videocommon.d.c r0 = r0.mo49107a(r4, r5)     // Catch:{ Exception -> 0x00e6 }
            r12.f18049m = r0     // Catch:{ Exception -> 0x00e6 }
        L_0x00d9:
            com.mbridge.msdk.videocommon.d.c r0 = r12.f18049m     // Catch:{ Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x0128
            com.mbridge.msdk.videocommon.d.c r0 = r12.f18049m     // Catch:{ Exception -> 0x00e6 }
            int r0 = r0.mo49162u()     // Catch:{ Exception -> 0x00e6 }
            r12.f18050n = r0     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0128
        L_0x00e6:
            java.lang.String r13 = "UnitCacheCtroller"
            java.lang.String r0 = "make sure your had put reward jar into your project"
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r13, r0)
            return
        L_0x00ee:
            java.lang.String r0 = r12.f18048l     // Catch:{ Exception -> 0x020a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x020a }
            if (r0 != 0) goto L_0x0128
            com.mbridge.msdk.b.b r0 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x020a }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x020a }
            java.lang.String r4 = r4.mo42896e()     // Catch:{ Exception -> 0x020a }
            java.lang.String r5 = r12.f18048l     // Catch:{ Exception -> 0x020a }
            com.mbridge.msdk.b.d r0 = r0.mo42755e(r4, r5)     // Catch:{ Exception -> 0x020a }
            r12.f18037a = r0     // Catch:{ Exception -> 0x020a }
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = r12.f18048l     // Catch:{ Exception -> 0x020a }
            com.mbridge.msdk.b.d r0 = com.mbridge.msdk.p158b.C6086d.m15134d(r0)     // Catch:{ Exception -> 0x020a }
            r12.f18037a = r0     // Catch:{ Exception -> 0x020a }
        L_0x0114:
            com.mbridge.msdk.b.d r0 = r12.f18037a     // Catch:{ Exception -> 0x020a }
            if (r0 == 0) goto L_0x0128
            com.mbridge.msdk.b.d r0 = r12.f18037a     // Catch:{ Exception -> 0x020a }
            long r4 = r0.mo42783i()     // Catch:{ Exception -> 0x020a }
            r12.f18047k = r4     // Catch:{ Exception -> 0x020a }
            com.mbridge.msdk.b.d r0 = r12.f18037a     // Catch:{ Exception -> 0x020a }
            int r0 = r0.mo42785k()     // Catch:{ Exception -> 0x020a }
            r12.f18050n = r0     // Catch:{ Exception -> 0x020a }
        L_0x0128:
            r0 = 0
            r4 = 0
        L_0x012a:
            int r5 = r13.size()
            if (r4 >= r5) goto L_0x01fa
            java.lang.Object r5 = r13.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5
            if (r5 == 0) goto L_0x01f6
            int r6 = r12.f18051o
            if (r6 == r1) goto L_0x015e
            if (r6 != r2) goto L_0x013f
            goto L_0x015e
        L_0x013f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.getId()
            r6.append(r7)
            java.lang.String r7 = r5.getVideoUrlEncode()
            r6.append(r7)
            java.lang.String r7 = r5.getBidToken()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x017c
        L_0x015e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.getRequestId()
            r6.append(r7)
            java.lang.String r7 = r5.getId()
            r6.append(r7)
            java.lang.String r7 = r5.getVideoUrlEncode()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x017c:
            boolean r7 = r12.m18338c(r5)
            if (r7 != 0) goto L_0x018d
            java.lang.String r7 = r5.getVideoUrlEncode()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x018d
            goto L_0x01f6
        L_0x018d:
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r7 = r12.f18044h
            if (r7 == 0) goto L_0x01f6
            monitor-enter(r7)
            r8 = 0
        L_0x0193:
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r9 = r12.f18044h     // Catch:{ all -> 0x01f1 }
            int r9 = r9.size()     // Catch:{ all -> 0x01f1 }
            if (r8 >= r9) goto L_0x01cc
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r9 = r12.f18044h     // Catch:{ all -> 0x01f1 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x01f1 }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x01f1 }
            if (r9 == 0) goto L_0x01c9
            boolean r10 = r9.containsKey(r6)     // Catch:{ all -> 0x01f1 }
            if (r10 == 0) goto L_0x01c9
            java.lang.Object r10 = r9.get(r6)     // Catch:{ all -> 0x01f1 }
            com.mbridge.msdk.videocommon.download.a r10 = (com.mbridge.msdk.videocommon.download.C7180a) r10     // Catch:{ all -> 0x01f1 }
            r10.mo49175a((com.mbridge.msdk.foundation.entity.CampaignEx) r5)     // Catch:{ all -> 0x01f1 }
            int r11 = r12.f18050n     // Catch:{ all -> 0x01f1 }
            r10.mo49172a((int) r11)     // Catch:{ all -> 0x01f1 }
            r10.mo49179a((boolean) r0)     // Catch:{ all -> 0x01f1 }
            r9.remove(r6)     // Catch:{ all -> 0x01f1 }
            r9.put(r6, r10)     // Catch:{ all -> 0x01f1 }
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r10 = r12.f18044h     // Catch:{ all -> 0x01f1 }
            r10.set(r8, r9)     // Catch:{ all -> 0x01f1 }
            r8 = 1
            goto L_0x01cd
        L_0x01c9:
            int r8 = r8 + 1
            goto L_0x0193
        L_0x01cc:
            r8 = 0
        L_0x01cd:
            if (r8 != 0) goto L_0x01f1
            com.mbridge.msdk.videocommon.download.a r8 = new com.mbridge.msdk.videocommon.download.a     // Catch:{ all -> 0x01f1 }
            android.content.Context r9 = r12.f18045i     // Catch:{ all -> 0x01f1 }
            java.lang.String r10 = r12.f18048l     // Catch:{ all -> 0x01f1 }
            int r11 = r12.f18050n     // Catch:{ all -> 0x01f1 }
            r8.<init>(r9, r5, r10, r11)     // Catch:{ all -> 0x01f1 }
            int r5 = r12.f18050n     // Catch:{ all -> 0x01f1 }
            r8.mo49172a((int) r5)     // Catch:{ all -> 0x01f1 }
            int r5 = r12.f18051o     // Catch:{ all -> 0x01f1 }
            r8.mo49188d((int) r5)     // Catch:{ all -> 0x01f1 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x01f1 }
            r5.<init>()     // Catch:{ all -> 0x01f1 }
            r5.put(r6, r8)     // Catch:{ all -> 0x01f1 }
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r6 = r12.f18044h     // Catch:{ all -> 0x01f1 }
            r6.add(r5)     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            monitor-exit(r7)     // Catch:{ all -> 0x01f3 }
            goto L_0x01f6
        L_0x01f3:
            r13 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01f3 }
            throw r13
        L_0x01f6:
            int r4 = r4 + 1
            goto L_0x012a
        L_0x01fa:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13 = r12.f18039c
            if (r13 == 0) goto L_0x0209
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x0209
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13 = r12.f18039c
            r13.clear()
        L_0x0209:
            return
        L_0x020a:
            java.lang.String r13 = "UnitCacheCtroller"
            java.lang.String r0 = "make sure your had put native video jar into your project"
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r13, r0)
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C7209k.m18336b(java.util.List):void");
    }

    /* renamed from: d */
    private void m18340d() {
        CopyOnWriteArrayList<Map<String, C7180a>> copyOnWriteArrayList = this.f18044h;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    while (i < this.f18044h.size()) {
                        Map map = this.f18044h.get(i);
                        for (Map.Entry value : map.entrySet()) {
                            C7180a aVar = (C7180a) value.getValue();
                            if (aVar != null) {
                                if (currentTimeMillis - aVar.mo49185c() > this.f18047k * 1000 && aVar.mo49190f() == 1) {
                                    aVar.mo49182b("download timeout");
                                    aVar.mo49172a(this.f18050n);
                                    aVar.mo49197m();
                                    this.f18044h.remove(map);
                                    i--;
                                }
                                if (!(aVar.mo49190f() == 1 || aVar.mo49190f() == 5 || aVar.mo49190f() == 0)) {
                                    aVar.mo49197m();
                                    this.f18044h.remove(map);
                                    i--;
                                }
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private void m18342e() {
        CopyOnWriteArrayList<Map<String, C7180a>> copyOnWriteArrayList = this.f18044h;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i = 0;
                    while (i < this.f18044h.size()) {
                        Map map = this.f18044h.get(i);
                        for (Map.Entry value : map.entrySet()) {
                            C7180a aVar = (C7180a) value.getValue();
                            if (aVar != null) {
                                if (aVar.mo49191g() != null) {
                                    if (aVar.mo49184b()) {
                                        aVar.mo49196l();
                                        this.f18044h.remove(map);
                                        i--;
                                    }
                                }
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
                C6361q.m16158d("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* renamed from: a */
    public final List<C7180a> mo49239a(String str, int i, boolean z, List<CampaignEx> list) {
        long j;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<Map<String, C7180a>> copyOnWriteArrayList = this.f18044h;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i3 = 0;
                    while (i3 < this.f18044h.size()) {
                        Map map = this.f18044h.get(i3);
                        for (Map.Entry value : map.entrySet()) {
                            C7180a aVar = (C7180a) value.getValue();
                            if (aVar != null) {
                                if (aVar.mo49191g() != null) {
                                    CampaignEx g = aVar.mo49191g();
                                    boolean z2 = false;
                                    for (CampaignEx next : list) {
                                        if (g != null && next != null && !TextUtils.isEmpty(g.getRequestId()) && !TextUtils.isEmpty(next.getRequestId()) && g.getId().equals(next.getId()) && g.getRequestId().equals(next.getRequestId())) {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        if (!z || g.isBidCampaign()) {
                                            if (z || !g.isBidCampaign()) {
                                                String str2 = g.getendcard_url();
                                                String videoUrlEncode = g.getVideoUrlEncode();
                                                String str3 = "";
                                                if (!(g == null || g.getRewardTemplateMode() == null)) {
                                                    str3 = g.getRewardTemplateMode().mo43510d();
                                                }
                                                g.getRewardTemplateMode();
                                                if (i2 == 94 || i2 == 287) {
                                                    if (m18329a(i2, g, str3)) {
                                                        if (m18337b(str2, g)) {
                                                            if (aVar.mo49184b()) {
                                                                aVar.mo49196l();
                                                            } else if (C6369x.m16235a(videoUrlEncode)) {
                                                                arrayList.add(aVar);
                                                            } else if (m18330a(aVar, m18334b(g))) {
                                                                arrayList.add(aVar);
                                                            }
                                                        }
                                                    }
                                                }
                                                boolean isEmpty = TextUtils.isEmpty(aVar.mo49195k());
                                                int f = aVar.mo49190f();
                                                if (f != 5) {
                                                    long c = aVar.mo49185c();
                                                    if (aVar.mo49190f() == 1) {
                                                        j = currentTimeMillis;
                                                        if (currentTimeMillis - c > this.f18047k * 1000) {
                                                            aVar.mo49182b("download timeout");
                                                            aVar.mo49197m();
                                                            this.f18044h.remove(map);
                                                            i3--;
                                                            if (i2 != 1) {
                                                                if (i2 == 94) {
                                                                }
                                                            }
                                                            currentTimeMillis = j;
                                                        }
                                                    } else {
                                                        j = currentTimeMillis;
                                                    }
                                                    if (f != 4) {
                                                        if (f != 2) {
                                                            if (f == 1) {
                                                                if (!aVar.mo49184b()) {
                                                                    if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY && m18330a(aVar, m18334b(g)) && m18332a(str2, g)) {
                                                                        arrayList.add(aVar);
                                                                    }
                                                                }
                                                                currentTimeMillis = j;
                                                            }
                                                            if ((i2 == 94 || i2 == 287) && m18330a(aVar, m18334b(g)) && m18332a(str2, g)) {
                                                                arrayList.add(aVar);
                                                            }
                                                            currentTimeMillis = j;
                                                        }
                                                    }
                                                    this.f18044h.remove(map);
                                                    aVar.mo49197m();
                                                    i3--;
                                                    currentTimeMillis = j;
                                                } else if (aVar.mo49184b()) {
                                                    aVar.mo49196l();
                                                    this.f18044h.remove(map);
                                                    i3--;
                                                } else if (!isEmpty) {
                                                    aVar.mo49173a(0, 0);
                                                    if (i2 == 95) {
                                                        arrayList.add(aVar);
                                                    }
                                                } else if (!m18332a(str2, g)) {
                                                    return null;
                                                } else {
                                                    arrayList.add(aVar);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            j = currentTimeMillis;
                            currentTimeMillis = j;
                        }
                        long j2 = currentTimeMillis;
                        i3++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private int m18334b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return m18341e(campaignEx);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x025b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x025d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x025e, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0265, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0026, B:14:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c7 A[Catch:{ Exception -> 0x025d, all -> 0x025b }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073 A[Catch:{ Exception -> 0x025d, all -> 0x025b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mbridge.msdk.videocommon.download.C7180a mo49237a(int r25, boolean r26) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r26
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r3 = r1.f18044h
            r4 = 0
            if (r3 == 0) goto L_0x0266
            monitor-enter(r3)
            int r5 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            r6 = 287(0x11f, float:4.02E-43)
            r7 = 94
            r8 = 1
            if (r5 == r7) goto L_0x0028
            int r5 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            if (r5 != r6) goto L_0x001a
            goto L_0x0028
        L_0x001a:
            com.mbridge.msdk.videocommon.a.a r5 = com.mbridge.msdk.videocommon.p236a.C7167a.m18072a()     // Catch:{ Exception -> 0x025d }
            java.lang.String r9 = r1.f18048l     // Catch:{ Exception -> 0x025d }
            java.util.List r5 = r5.mo49061a((java.lang.String) r9, (int) r8)     // Catch:{ Exception -> 0x025d }
            if (r5 != 0) goto L_0x0066
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            return r4
        L_0x0028:
            com.mbridge.msdk.videocommon.a.a r5 = com.mbridge.msdk.videocommon.p236a.C7167a.m18072a()     // Catch:{ Exception -> 0x025d }
            java.lang.String r9 = r1.f18048l     // Catch:{ Exception -> 0x025d }
            java.util.List r5 = r5.mo49062a((java.lang.String) r9, (int) r8, (boolean) r2)     // Catch:{ Exception -> 0x025d }
            if (r5 == 0) goto L_0x003a
            int r9 = r5.size()     // Catch:{ Exception -> 0x025d }
            if (r9 != 0) goto L_0x004a
        L_0x003a:
            if (r0 == r7) goto L_0x003e
            if (r0 != r6) goto L_0x004a
        L_0x003e:
            com.mbridge.msdk.videocommon.a.a r5 = com.mbridge.msdk.videocommon.p236a.C7167a.m18072a()     // Catch:{ Exception -> 0x025d }
            java.lang.String r9 = r1.f18048l     // Catch:{ Exception -> 0x025d }
            java.lang.String r10 = ""
            java.util.List r5 = r5.mo49077c(r9, r8, r2, r10)     // Catch:{ Exception -> 0x025d }
        L_0x004a:
            if (r5 == 0) goto L_0x0251
            java.lang.String r9 = "UnitCacheCtroller"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025d }
            r10.<init>()     // Catch:{ Exception -> 0x025d }
            java.lang.String r11 = "UnitCache isReady campaignList = "
            r10.append(r11)     // Catch:{ Exception -> 0x025d }
            int r11 = r5.size()     // Catch:{ Exception -> 0x025d }
            r10.append(r11)     // Catch:{ Exception -> 0x025d }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x025d }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r9, r10)     // Catch:{ Exception -> 0x025d }
        L_0x0066:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x025d }
            r12 = 0
        L_0x006b:
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r13 = r1.f18044h     // Catch:{ Exception -> 0x025d }
            int r13 = r13.size()     // Catch:{ Exception -> 0x025d }
            if (r12 >= r13) goto L_0x0261
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r13 = r1.f18044h     // Catch:{ Exception -> 0x025d }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ Exception -> 0x025d }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ Exception -> 0x025d }
            java.util.Set r14 = r13.entrySet()     // Catch:{ Exception -> 0x025d }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x025d }
        L_0x0083:
            boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x025d }
            if (r15 == 0) goto L_0x0243
            java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x025d }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ Exception -> 0x025d }
            java.lang.Object r15 = r15.getValue()     // Catch:{ Exception -> 0x025d }
            com.mbridge.msdk.videocommon.download.a r15 = (com.mbridge.msdk.videocommon.download.C7180a) r15     // Catch:{ Exception -> 0x025d }
            if (r15 == 0) goto L_0x0236
            com.mbridge.msdk.foundation.entity.CampaignEx r16 = r15.mo49191g()     // Catch:{ Exception -> 0x025d }
            if (r16 != 0) goto L_0x009f
            goto L_0x0236
        L_0x009f:
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r15.mo49191g()     // Catch:{ Exception -> 0x025d }
            java.util.Iterator r17 = r5.iterator()     // Catch:{ Exception -> 0x025d }
            r18 = 0
        L_0x00a9:
            boolean r19 = r17.hasNext()     // Catch:{ Exception -> 0x025d }
            if (r19 == 0) goto L_0x00c7
            java.lang.Object r19 = r17.next()     // Catch:{ Exception -> 0x025d }
            com.mbridge.msdk.foundation.entity.CampaignEx r19 = (com.mbridge.msdk.foundation.entity.CampaignEx) r19     // Catch:{ Exception -> 0x025d }
            java.lang.String r4 = r8.getId()     // Catch:{ Exception -> 0x025d }
            java.lang.String r11 = r19.getId()     // Catch:{ Exception -> 0x025d }
            boolean r4 = r4.equals(r11)     // Catch:{ Exception -> 0x025d }
            if (r4 == 0) goto L_0x00c5
            r18 = 1
        L_0x00c5:
            r4 = 0
            goto L_0x00a9
        L_0x00c7:
            if (r18 != 0) goto L_0x00cb
            goto L_0x0236
        L_0x00cb:
            if (r2 == 0) goto L_0x00d3
            boolean r4 = r8.isBidCampaign()     // Catch:{ Exception -> 0x025d }
            if (r4 == 0) goto L_0x0236
        L_0x00d3:
            if (r2 != 0) goto L_0x00dd
            boolean r4 = r8.isBidCampaign()     // Catch:{ Exception -> 0x025d }
            if (r4 == 0) goto L_0x00dd
            goto L_0x0236
        L_0x00dd:
            java.lang.String r4 = r8.getendcard_url()     // Catch:{ Exception -> 0x025d }
            java.lang.String r11 = r8.getVideoUrlEncode()     // Catch:{ Exception -> 0x025d }
            java.lang.String r17 = ""
            if (r8 == 0) goto L_0x00f7
            com.mbridge.msdk.foundation.entity.CampaignEx$c r18 = r8.getRewardTemplateMode()     // Catch:{ Exception -> 0x025d }
            if (r18 == 0) goto L_0x00f7
            com.mbridge.msdk.foundation.entity.CampaignEx$c r17 = r8.getRewardTemplateMode()     // Catch:{ Exception -> 0x025d }
            java.lang.String r17 = r17.mo43510d()     // Catch:{ Exception -> 0x025d }
        L_0x00f7:
            r21 = r17
            r8.getRewardTemplateMode()     // Catch:{ Exception -> 0x025d }
            int r6 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            if (r6 == r7) goto L_0x0104
            r6 = 287(0x11f, float:4.02E-43)
            if (r0 != r6) goto L_0x0138
        L_0x0104:
            int r6 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            r7 = r21
            boolean r6 = r1.m18329a(r6, r8, r7)     // Catch:{ Exception -> 0x025d }
            if (r6 != 0) goto L_0x0114
        L_0x010e:
            r6 = r12
            r0 = 1
            r7 = 94
            goto L_0x0238
        L_0x0114:
            boolean r6 = r1.m18337b((java.lang.String) r4, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x025d }
            if (r6 == 0) goto L_0x0138
            boolean r6 = r15.mo49184b()     // Catch:{ Exception -> 0x025d }
            if (r6 == 0) goto L_0x0124
            r15.mo49196l()     // Catch:{ Exception -> 0x025d }
            goto L_0x010e
        L_0x0124:
            boolean r6 = com.mbridge.msdk.foundation.tools.C6369x.m16235a(r11)     // Catch:{ Exception -> 0x025d }
            if (r6 == 0) goto L_0x012c
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            return r15
        L_0x012c:
            int r6 = r1.m18334b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x025d }
            boolean r6 = m18330a((com.mbridge.msdk.videocommon.download.C7180a) r15, (int) r6)     // Catch:{ Exception -> 0x025d }
            if (r6 == 0) goto L_0x0138
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            return r15
        L_0x0138:
            java.lang.String r6 = r15.mo49195k()     // Catch:{ Exception -> 0x025d }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x025d }
            int r7 = r15.mo49190f()     // Catch:{ Exception -> 0x025d }
            int r11 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            r0 = 298(0x12a, float:4.18E-43)
            if (r11 != r0) goto L_0x0156
            int r0 = r1.m18334b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x025d }
            boolean r0 = m18330a((com.mbridge.msdk.videocommon.download.C7180a) r15, (int) r0)     // Catch:{ Exception -> 0x025d }
            if (r0 == 0) goto L_0x0156
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            return r15
        L_0x0156:
            r0 = 5
            r11 = 95
            if (r7 != r0) goto L_0x018b
            boolean r0 = r15.mo49184b()     // Catch:{ Exception -> 0x025d }
            if (r0 == 0) goto L_0x0174
            r15.mo49196l()     // Catch:{ Exception -> 0x025d }
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r0 = r1.f18044h     // Catch:{ Exception -> 0x025d }
            r0.remove(r13)     // Catch:{ Exception -> 0x025d }
        L_0x0169:
            int r12 = r12 + -1
        L_0x016b:
            r0 = r25
            r4 = 0
            r6 = 287(0x11f, float:4.02E-43)
            r7 = 94
            goto L_0x0240
        L_0x0174:
            if (r6 != 0) goto L_0x0180
            r0 = 0
            r15.mo49173a((int) r0, (int) r0)     // Catch:{ Exception -> 0x025d }
            int r4 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            if (r4 != r11) goto L_0x010e
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            return r15
        L_0x0180:
            boolean r0 = r1.m18332a((java.lang.String) r4, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x025d }
            if (r0 == 0) goto L_0x0188
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            return r15
        L_0x0188:
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            r2 = 0
            return r2
        L_0x018b:
            r0 = 0
            long r20 = r15.mo49185c()     // Catch:{ Exception -> 0x025d }
            int r6 = r15.mo49190f()     // Catch:{ Exception -> 0x025d }
            r0 = 1
            if (r6 != r0) goto L_0x01bf
            long r20 = r9 - r20
            r6 = r12
            long r11 = r1.f18047k     // Catch:{ Exception -> 0x025d }
            r22 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r22
            int r22 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r22 <= 0) goto L_0x01c0
            java.lang.String r11 = "download timeout"
            r15.mo49182b((java.lang.String) r11)     // Catch:{ Exception -> 0x025d }
            r15.mo49197m()     // Catch:{ Exception -> 0x025d }
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r11 = r1.f18044h     // Catch:{ Exception -> 0x025d }
            r11.remove(r13)     // Catch:{ Exception -> 0x025d }
            int r12 = r6 + -1
            int r6 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            r11 = 1
            if (r6 == r11) goto L_0x016b
            int r6 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            r11 = 94
            if (r6 != r11) goto L_0x01c1
            goto L_0x016b
        L_0x01bf:
            r6 = r12
        L_0x01c0:
            r12 = r6
        L_0x01c1:
            int r6 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            r0 = 95
            if (r6 != r0) goto L_0x01d8
            boolean r0 = r15.mo49184b()     // Catch:{ Exception -> 0x025d }
            if (r0 == 0) goto L_0x01d6
            r15.mo49196l()     // Catch:{ Exception -> 0x025d }
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r0 = r1.f18044h     // Catch:{ Exception -> 0x025d }
            r0.remove(r13)     // Catch:{ Exception -> 0x025d }
            goto L_0x0169
        L_0x01d6:
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            return r15
        L_0x01d8:
            r0 = 4
            if (r7 == r0) goto L_0x0224
            r0 = 2
            if (r7 != r0) goto L_0x01df
            goto L_0x0224
        L_0x01df:
            r0 = 1
            if (r7 != r0) goto L_0x0203
            boolean r6 = r15.mo49184b()     // Catch:{ Exception -> 0x025d }
            if (r6 == 0) goto L_0x01ed
            r7 = 94
            r11 = 287(0x11f, float:4.02E-43)
            goto L_0x0233
        L_0x01ed:
            boolean r6 = com.mbridge.msdk.MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY     // Catch:{ Exception -> 0x025d }
            if (r6 != 0) goto L_0x0203
            int r6 = r1.m18334b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x025d }
            boolean r6 = m18330a((com.mbridge.msdk.videocommon.download.C7180a) r15, (int) r6)     // Catch:{ Exception -> 0x025d }
            if (r6 == 0) goto L_0x0203
            boolean r6 = r1.m18332a((java.lang.String) r4, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x025d }
            if (r6 == 0) goto L_0x0203
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            return r15
        L_0x0203:
            int r6 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            r7 = 94
            if (r6 == r7) goto L_0x0210
            int r6 = r1.f18051o     // Catch:{ Exception -> 0x025d }
            r11 = 287(0x11f, float:4.02E-43)
            if (r6 != r11) goto L_0x0233
            goto L_0x0212
        L_0x0210:
            r11 = 287(0x11f, float:4.02E-43)
        L_0x0212:
            int r6 = r1.m18334b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x025d }
            boolean r6 = m18330a((com.mbridge.msdk.videocommon.download.C7180a) r15, (int) r6)     // Catch:{ Exception -> 0x025d }
            if (r6 == 0) goto L_0x0233
            boolean r4 = r1.m18332a((java.lang.String) r4, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ Exception -> 0x025d }
            if (r4 == 0) goto L_0x0233
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            return r15
        L_0x0224:
            r0 = 1
            r7 = 94
            r11 = 287(0x11f, float:4.02E-43)
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r4 = r1.f18044h     // Catch:{ Exception -> 0x025d }
            r4.remove(r13)     // Catch:{ Exception -> 0x025d }
            r15.mo49197m()     // Catch:{ Exception -> 0x025d }
            int r12 = r12 + -1
        L_0x0233:
            r0 = r25
            goto L_0x023d
        L_0x0236:
            r6 = r12
            r0 = 1
        L_0x0238:
            r11 = 287(0x11f, float:4.02E-43)
            r0 = r25
            r12 = r6
        L_0x023d:
            r4 = 0
            r6 = 287(0x11f, float:4.02E-43)
        L_0x0240:
            r8 = 1
            goto L_0x0083
        L_0x0243:
            r6 = r12
            r0 = 1
            r11 = 287(0x11f, float:4.02E-43)
            int r12 = r6 + 1
            r0 = r25
            r4 = 0
            r6 = 287(0x11f, float:4.02E-43)
            r8 = 1
            goto L_0x006b
        L_0x0251:
            java.lang.String r0 = "UnitCacheCtroller"
            java.lang.String r2 = "UnitCache isReady campaignList = 0"
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r2)     // Catch:{ Exception -> 0x025d }
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            r2 = 0
            return r2
        L_0x025b:
            r0 = move-exception
            goto L_0x0264
        L_0x025d:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x025b }
        L_0x0261:
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            r2 = 0
            goto L_0x0267
        L_0x0264:
            monitor-exit(r3)     // Catch:{ all -> 0x025b }
            throw r0
        L_0x0266:
            r2 = r4
        L_0x0267:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C7209k.mo49237a(int, boolean):com.mbridge.msdk.videocommon.download.a");
    }

    /* renamed from: a */
    public static boolean m18330a(C7180a aVar, int i) {
        long h = aVar.mo49192h();
        long e = aVar.mo49189e();
        if (TextUtils.isEmpty(aVar.mo49171a())) {
            return true;
        }
        if (i == 0) {
            return aVar.mo49191g() != null && !TextUtils.isEmpty(aVar.mo49191g().getVideoUrlEncode());
        }
        if (e > 0 && h * 100 >= e * ((long) i)) {
            if (i != 100 || aVar.mo49190f() == 5) {
                return true;
            }
            aVar.mo49197m();
            return false;
        }
    }

    /* renamed from: a */
    private boolean m18332a(String str, CampaignEx campaignEx) {
        try {
            if (!C6366u.m16221f(campaignEx.getMof_template_url()) && !C6369x.m16235a(str) && !m18337b(str, campaignEx)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C6361q.m16155a("UnitCacheCtroller", th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: b */
    private boolean m18337b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if ((campaignEx.getLoadTimeoutState() != 1 || m18338c(campaignEx)) && !C6369x.m16236b(C7191g.m18286a().mo49220b(str)) && !C6369x.m16236b(C7200h.C7202a.f18026a.mo49224b(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m18329a(int i, CampaignEx campaignEx, String str) {
        if (!C6366u.m16221f(campaignEx.getMof_template_url()) && !TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0 && C7191g.m18286a().mo49220b(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final C7180a mo49245b(int i, boolean z) {
        try {
            return mo49237a(i, z);
        } catch (Throwable th) {
            C6361q.m16155a("UnitCacheCtroller", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: a */
    public final C7180a mo49238a(String str) {
        CopyOnWriteArrayList<Map<String, C7180a>> copyOnWriteArrayList = this.f18044h;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                Iterator<Map<String, C7180a>> it = this.f18044h.iterator();
                while (it.hasNext()) {
                    Map next = it.next();
                    if (next != null && next.containsKey(str)) {
                        C7180a aVar = (C7180a) next.get(str);
                        return aVar;
                    }
                }
            } catch (Throwable unused) {
                C6361q.m16158d("UnitCacheCtroller", "failed to get campaignTast by cid");
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m18333a(CopyOnWriteArrayList<Map<String, C7180a>> copyOnWriteArrayList) {
        try {
            Iterator<Map<String, C7180a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Map next = it.next();
                if (next != null) {
                    for (Map.Entry value : next.entrySet()) {
                        if (((C7180a) value.getValue()).mo49190f() == 1) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0189 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49240a() {
        /*
            r16 = this;
            r1 = r16
            r16.m18340d()
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r2 = r1.f18044h
            if (r2 == 0) goto L_0x01d0
            monitor-enter(r2)
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r0 = r1.f18044h     // Catch:{ all -> 0x01cd }
            boolean r0 = r1.m18333a((java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.C7180a>>) r0)     // Catch:{ all -> 0x01cd }
            r3 = 1
            if (r0 != 0) goto L_0x0015
            r1.f18040d = r3     // Catch:{ all -> 0x01cd }
        L_0x0015:
            java.util.concurrent.CopyOnWriteArrayList<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>> r0 = r1.f18044h     // Catch:{ all -> 0x01cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01cd }
        L_0x001b:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x01cd }
            if (r4 == 0) goto L_0x01cb
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x01cd }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x01cd }
            if (r4 != 0) goto L_0x002a
            goto L_0x001b
        L_0x002a:
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x01cd }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x01cd }
        L_0x0032:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01cd }
            if (r5 == 0) goto L_0x001b
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01cd }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x01cd }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x01cd }
            com.mbridge.msdk.videocommon.download.a r5 = (com.mbridge.msdk.videocommon.download.C7180a) r5     // Catch:{ all -> 0x01cd }
            if (r5 != 0) goto L_0x0047
            goto L_0x0032
        L_0x0047:
            boolean r6 = r5.mo49184b()     // Catch:{ all -> 0x01cd }
            if (r6 == 0) goto L_0x004e
            goto L_0x0032
        L_0x004e:
            int r6 = r1.f18051o     // Catch:{ all -> 0x01cd }
            r7 = 95
            if (r6 != r7) goto L_0x0056
            r1.f18040d = r3     // Catch:{ all -> 0x01cd }
        L_0x0056:
            int r6 = r5.mo49190f()     // Catch:{ all -> 0x01cd }
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r5.mo49191g()     // Catch:{ all -> 0x01cd }
            if (r8 == 0) goto L_0x0072
            if (r6 != 0) goto L_0x0072
            com.mbridge.msdk.videocommon.download.c r6 = com.mbridge.msdk.videocommon.download.C7184c.getInstance()     // Catch:{ all -> 0x01cd }
            java.lang.String r9 = r8.getId()     // Catch:{ all -> 0x01cd }
            java.lang.String r10 = r8.getVideoUrlEncode()     // Catch:{ all -> 0x01cd }
            int r6 = r6.mo49209b(r9, r10)     // Catch:{ all -> 0x01cd }
        L_0x0072:
            com.mbridge.msdk.videocommon.download.k$2 r9 = new com.mbridge.msdk.videocommon.download.k$2     // Catch:{ all -> 0x01cd }
            r9.<init>(r8)     // Catch:{ all -> 0x01cd }
            r5.mo49177a((com.mbridge.msdk.videocommon.listener.C7212a) r9)     // Catch:{ all -> 0x01cd }
            int r9 = r1.m18334b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ all -> 0x01cd }
            int r10 = r1.f18051o     // Catch:{ all -> 0x01cd }
            if (r10 != r3) goto L_0x0092
            com.mbridge.msdk.b.d r9 = r1.f18037a     // Catch:{ all -> 0x01cd }
            if (r9 != 0) goto L_0x008e
            java.lang.String r9 = r1.f18048l     // Catch:{ all -> 0x01cd }
            com.mbridge.msdk.b.d r9 = com.mbridge.msdk.p158b.C6086d.m15134d(r9)     // Catch:{ all -> 0x01cd }
            r1.f18037a = r9     // Catch:{ all -> 0x01cd }
        L_0x008e:
            int r9 = r1.m18339d(r8)     // Catch:{ all -> 0x01cd }
        L_0x0092:
            r5.mo49186c((int) r9)     // Catch:{ all -> 0x01cd }
            int r10 = r1.f18051o     // Catch:{ all -> 0x01cd }
            r11 = 94
            r12 = 287(0x11f, float:4.02E-43)
            r13 = 298(0x12a, float:4.18E-43)
            if (r10 == r11) goto L_0x00f7
            int r10 = r1.f18051o     // Catch:{ all -> 0x01cd }
            if (r10 == r12) goto L_0x00f7
            int r10 = r1.f18051o     // Catch:{ all -> 0x01cd }
            if (r10 != r7) goto L_0x00a8
            goto L_0x00f7
        L_0x00a8:
            int r10 = r1.f18051o     // Catch:{ all -> 0x01cd }
            if (r10 != r13) goto L_0x00cf
            com.mbridge.msdk.b.d r10 = r1.f18038b     // Catch:{ all -> 0x01cd }
            if (r10 != 0) goto L_0x00c4
            com.mbridge.msdk.b.b r10 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ all -> 0x01cd }
            com.mbridge.msdk.foundation.controller.a r11 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01cd }
            java.lang.String r11 = r11.mo42896e()     // Catch:{ all -> 0x01cd }
            java.lang.String r12 = r1.f18048l     // Catch:{ all -> 0x01cd }
            com.mbridge.msdk.b.d r10 = r10.mo42751c(r11, r12)     // Catch:{ all -> 0x01cd }
            r1.f18038b = r10     // Catch:{ all -> 0x01cd }
        L_0x00c4:
            com.mbridge.msdk.b.d r10 = r1.f18038b     // Catch:{ all -> 0x01cd }
            if (r10 == 0) goto L_0x00cf
            com.mbridge.msdk.b.d r10 = r1.f18038b     // Catch:{ all -> 0x01cd }
            int r10 = r10.mo42780g()     // Catch:{ all -> 0x01cd }
            goto L_0x00d0
        L_0x00cf:
            r10 = 0
        L_0x00d0:
            int r11 = r1.f18051o     // Catch:{ all -> 0x01cd }
            if (r11 != r3) goto L_0x0122
            com.mbridge.msdk.b.d r11 = r1.f18037a     // Catch:{ all -> 0x01cd }
            if (r11 != 0) goto L_0x00ec
            com.mbridge.msdk.b.b r11 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ all -> 0x01cd }
            com.mbridge.msdk.foundation.controller.a r12 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01cd }
            java.lang.String r12 = r12.mo42896e()     // Catch:{ all -> 0x01cd }
            java.lang.String r15 = r1.f18048l     // Catch:{ all -> 0x01cd }
            com.mbridge.msdk.b.d r11 = r11.mo42751c(r12, r15)     // Catch:{ all -> 0x01cd }
            r1.f18037a = r11     // Catch:{ all -> 0x01cd }
        L_0x00ec:
            com.mbridge.msdk.b.d r11 = r1.f18037a     // Catch:{ all -> 0x01cd }
            if (r11 == 0) goto L_0x0122
            com.mbridge.msdk.b.d r10 = r1.f18037a     // Catch:{ all -> 0x01cd }
            int r10 = r10.mo42780g()     // Catch:{ all -> 0x01cd }
            goto L_0x0122
        L_0x00f7:
            com.mbridge.msdk.videocommon.d.c r10 = r1.f18049m     // Catch:{ all -> 0x01cd }
            if (r10 != 0) goto L_0x0116
            com.mbridge.msdk.videocommon.d.b r10 = com.mbridge.msdk.videocommon.p239d.C7177b.m18135a()     // Catch:{ all -> 0x01cd }
            com.mbridge.msdk.foundation.controller.a r11 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x01cd }
            java.lang.String r11 = r11.mo42896e()     // Catch:{ all -> 0x01cd }
            java.lang.String r15 = r1.f18048l     // Catch:{ all -> 0x01cd }
            int r14 = r1.f18051o     // Catch:{ all -> 0x01cd }
            if (r14 != r12) goto L_0x010f
            r12 = 1
            goto L_0x0110
        L_0x010f:
            r12 = 0
        L_0x0110:
            com.mbridge.msdk.videocommon.d.c r10 = r10.mo49108a((java.lang.String) r11, (java.lang.String) r15, (boolean) r12)     // Catch:{ all -> 0x01cd }
            r1.f18049m = r10     // Catch:{ all -> 0x01cd }
        L_0x0116:
            com.mbridge.msdk.videocommon.d.c r10 = r1.f18049m     // Catch:{ all -> 0x01cd }
            if (r10 == 0) goto L_0x0121
            com.mbridge.msdk.videocommon.d.c r10 = r1.f18049m     // Catch:{ all -> 0x01cd }
            int r10 = r10.mo49154q()     // Catch:{ all -> 0x01cd }
            goto L_0x0122
        L_0x0121:
            r10 = 0
        L_0x0122:
            r5.mo49180b((int) r10)     // Catch:{ all -> 0x01cd }
            java.lang.String r11 = "UnitCacheCtroller"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r12.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r14 = "ready_rate : "
            r12.append(r14)     // Catch:{ all -> 0x01cd }
            r12.append(r9)     // Catch:{ all -> 0x01cd }
            java.lang.String r14 = " cd_rate : "
            r12.append(r14)     // Catch:{ all -> 0x01cd }
            r12.append(r10)     // Catch:{ all -> 0x01cd }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x01cd }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r11, r10)     // Catch:{ all -> 0x01cd }
            int r10 = r1.m18334b((com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ all -> 0x01cd }
            boolean r10 = m18330a((com.mbridge.msdk.videocommon.download.C7180a) r5, (int) r10)     // Catch:{ all -> 0x01cd }
            if (r10 == 0) goto L_0x0189
            com.mbridge.msdk.videocommon.listener.a r5 = r1.f18041e     // Catch:{ all -> 0x01cd }
            if (r5 == 0) goto L_0x0164
            int r5 = r1.f18051o     // Catch:{ all -> 0x01cd }
            r6 = 297(0x129, float:4.16E-43)
            if (r5 == r6) goto L_0x015b
            int r5 = r1.f18051o     // Catch:{ all -> 0x01cd }
            if (r5 != r13) goto L_0x0164
        L_0x015b:
            com.mbridge.msdk.videocommon.listener.a r5 = r1.f18041e     // Catch:{ all -> 0x01cd }
            java.lang.String r6 = r8.getVideoUrlEncode()     // Catch:{ all -> 0x01cd }
            r5.mo47024a(r6)     // Catch:{ all -> 0x01cd }
        L_0x0164:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.listener.a> r5 = r1.f18042f     // Catch:{ all -> 0x01cd }
            if (r5 == 0) goto L_0x0032
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.listener.a> r5 = r1.f18042f     // Catch:{ all -> 0x01cd }
            int r5 = r5.size()     // Catch:{ all -> 0x01cd }
            if (r5 <= 0) goto L_0x0032
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.listener.a> r5 = r1.f18042f     // Catch:{ all -> 0x01cd }
            java.lang.String r6 = r8.getRequestId()     // Catch:{ all -> 0x01cd }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x01cd }
            com.mbridge.msdk.videocommon.listener.a r5 = (com.mbridge.msdk.videocommon.listener.C7212a) r5     // Catch:{ all -> 0x01cd }
            if (r5 == 0) goto L_0x0032
            if (r8 == 0) goto L_0x0032
            java.lang.String r6 = r8.getVideoUrlEncode()     // Catch:{ all -> 0x01cd }
            r5.mo47024a(r6)     // Catch:{ all -> 0x01cd }
            goto L_0x0032
        L_0x0189:
            if (r6 == r3) goto L_0x0032
            r8 = 5
            if (r6 == r8) goto L_0x0032
            r8 = 4
            if (r6 == r8) goto L_0x0032
            android.content.Context r8 = r1.f18045i     // Catch:{ all -> 0x01cd }
            int r8 = com.mbridge.msdk.foundation.tools.C6349m.m16123n(r8)     // Catch:{ all -> 0x01cd }
            r10 = 9
            r11 = 2
            if (r8 == r10) goto L_0x01a2
            int r8 = r1.f18050n     // Catch:{ all -> 0x01cd }
            if (r8 != r11) goto L_0x01a2
            monitor-exit(r2)     // Catch:{ all -> 0x01cd }
            return
        L_0x01a2:
            if (r6 == r11) goto L_0x01aa
            boolean r6 = r1.f18040d     // Catch:{ all -> 0x01cd }
            if (r6 != 0) goto L_0x01aa
            goto L_0x0032
        L_0x01aa:
            com.mbridge.msdk.videocommon.download.d r6 = r1.f18043g     // Catch:{ all -> 0x01cd }
            r5.mo49176a((com.mbridge.msdk.videocommon.download.C7185d) r6)     // Catch:{ all -> 0x01cd }
            boolean r6 = m18330a((com.mbridge.msdk.videocommon.download.C7180a) r5, (int) r9)     // Catch:{ all -> 0x01cd }
            if (r6 == 0) goto L_0x01b7
            goto L_0x0032
        L_0x01b7:
            int r6 = r1.f18051o     // Catch:{ all -> 0x01cd }
            if (r6 == r3) goto L_0x01c3
            int r6 = r1.f18051o     // Catch:{ all -> 0x01cd }
            if (r6 == r7) goto L_0x01c3
            int r6 = r1.f18051o     // Catch:{ all -> 0x01cd }
            if (r6 != r13) goto L_0x01c6
        L_0x01c3:
            r6 = 0
            r1.f18040d = r6     // Catch:{ all -> 0x01cd }
        L_0x01c6:
            r5.mo49193i()     // Catch:{ all -> 0x01cd }
            goto L_0x0032
        L_0x01cb:
            monitor-exit(r2)     // Catch:{ all -> 0x01cd }
            goto L_0x01d0
        L_0x01cd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01cd }
            throw r0
        L_0x01d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C7209k.mo49240a():void");
    }

    /* renamed from: b */
    public final void mo49246b() {
        CopyOnWriteArrayList<Map<String, C7180a>> copyOnWriteArrayList = this.f18044h;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, C7180a>> it = this.f18044h.iterator();
                    while (it.hasNext()) {
                        Map next = it.next();
                        if (next != null) {
                            for (Map.Entry value : next.entrySet()) {
                                C7180a aVar = (C7180a) value.getValue();
                                if (aVar != null) {
                                    if (aVar.mo49190f() == 1) {
                                        aVar.mo49182b("playing and stop download");
                                        aVar.mo49197m();
                                        this.f18044h.remove(next);
                                        return;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public final CopyOnWriteArrayList<Map<String, C7180a>> mo49248c() {
        return this.f18044h;
    }

    /* renamed from: c */
    private boolean m18338c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    private int m18339d(CampaignEx campaignEx) {
        try {
            if (this.f18037a != null) {
                return this.f18037a.mo42779f();
            }
            return 100;
        } catch (Exception unused) {
            return 100;
        }
    }

    /* renamed from: b */
    public final void mo49247b(String str) {
        try {
            synchronized (this.f18044h) {
                if (!TextUtils.isEmpty(str) && this.f18044h != null && this.f18044h.size() > 0) {
                    Iterator<Map<String, C7180a>> it = this.f18044h.iterator();
                    while (it.hasNext()) {
                        Map next = it.next();
                        if (next != null) {
                            for (Map.Entry entry : next.entrySet()) {
                                if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), str)) {
                                    this.f18044h.remove(next);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private int m18341e(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f18038b == null) {
                    this.f18038b = C6076b.m15089a().mo42751c(C6122a.m15302b().mo42896e(), this.f18048l);
                }
                return this.f18038b.mo42779f();
            } else if (campaignEx.getAdType() == 42) {
                return m18339d((CampaignEx) null);
            } else {
                if (this.f18049m == null) {
                    this.f18049m = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f18048l, false);
                }
                return this.f18049m.mo49152p();
            }
        } catch (Throwable th) {
            C6361q.m16155a("UnitCacheCtroller", th.getMessage(), th);
            return 100;
        }
    }
}
