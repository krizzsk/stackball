package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import com.mbridge.msdk.videocommon.listener.C7212a;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.videocommon.download.c */
/* compiled from: DownLoadManager */
public class C7184c {

    /* renamed from: a */
    private static C7184c f17996a;

    /* renamed from: b */
    private ThreadPoolExecutor f17997b;

    /* renamed from: c */
    private boolean f17998c = false;

    /* renamed from: d */
    private ConcurrentHashMap<String, C7209k> f17999d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private Map<String, List<Map<String, C7180a>>> f18000e;

    /* renamed from: f */
    private Map<String, List<CampaignEx>> f18001f;

    /* renamed from: g */
    private Map<String, List<C7180a>> f18002g;

    private C7184c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f17997b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static C7184c getInstance() {
        if (f17996a == null) {
            synchronized (C7184c.class) {
                if (f17996a == null) {
                    f17996a = new C7184c();
                }
            }
        }
        return f17996a;
    }

    /* renamed from: a */
    public final C7180a mo49203a(String str, String str2) {
        C7209k c = mo49212c(str);
        if (c != null) {
            return c.mo49238a(str2);
        }
        return null;
    }

    /* renamed from: a */
    public final List<CampaignEx> mo49204a(String str) {
        Map<String, List<CampaignEx>> map = this.f18001f;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f18001f.get(str);
    }

    /* renamed from: b */
    public final List<C7180a> mo49210b(String str) {
        Map<String, List<C7180a>> map = this.f18002g;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f18002g.get(str);
    }

    /* renamed from: c */
    public final C7209k mo49212c(String str) {
        ConcurrentHashMap<String, C7209k> concurrentHashMap = this.f17999d;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f17999d.get(str);
    }

    /* renamed from: a */
    public final boolean mo49207a(int i, String str, boolean z) {
        try {
            C7209k c = mo49212c(str);
            if (c == null || c.mo49237a(i, z) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0141, code lost:
        if (r10.size() > 0) goto L_0x0143;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49208a(int r7, java.lang.String r8, boolean r9, int r10, boolean r11, int r12, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13) {
        /*
            r6 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0204
            int r1 = r13.size()     // Catch:{ Exception -> 0x01fc }
            if (r1 != 0) goto L_0x000b
            goto L_0x0204
        L_0x000b:
            com.mbridge.msdk.videocommon.download.k r1 = r6.mo49212c(r8)     // Catch:{ Exception -> 0x01fc }
            if (r1 == 0) goto L_0x0204
            java.util.List r7 = r1.mo49239a(r8, r7, r9, r13)     // Catch:{ Exception -> 0x01fc }
            r9 = 1
            if (r7 == 0) goto L_0x0144
            int r1 = r7.size()     // Catch:{ Exception -> 0x01fc }
            if (r1 != 0) goto L_0x0020
            goto L_0x0144
        L_0x0020:
            if (r11 == 0) goto L_0x00e6
            if (r12 != 0) goto L_0x0083
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x01fc }
            r10.<init>()     // Catch:{ Exception -> 0x01fc }
            java.util.Iterator r11 = r7.iterator()     // Catch:{ Exception -> 0x01fc }
        L_0x002d:
            boolean r12 = r11.hasNext()     // Catch:{ Exception -> 0x01fc }
            if (r12 == 0) goto L_0x007b
            java.lang.Object r12 = r11.next()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.videocommon.download.a r12 = (com.mbridge.msdk.videocommon.download.C7180a) r12     // Catch:{ Exception -> 0x01fc }
            java.util.Iterator r1 = r13.iterator()     // Catch:{ Exception -> 0x01fc }
        L_0x003d:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x01fc }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x01fc }
            if (r12 == 0) goto L_0x003d
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r12.mo49191g()     // Catch:{ Exception -> 0x01fc }
            if (r3 == 0) goto L_0x003d
            if (r2 == 0) goto L_0x003d
            java.lang.String r3 = r2.getId()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r12.mo49191g()     // Catch:{ Exception -> 0x01fc }
            java.lang.String r4 = r4.getId()     // Catch:{ Exception -> 0x01fc }
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x01fc }
            if (r3 == 0) goto L_0x003d
            java.lang.String r2 = r2.getRequestId()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r12.mo49191g()     // Catch:{ Exception -> 0x01fc }
            java.lang.String r3 = r3.getRequestId()     // Catch:{ Exception -> 0x01fc }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x01fc }
            if (r2 == 0) goto L_0x003d
            r10.add(r12)     // Catch:{ Exception -> 0x01fc }
            goto L_0x003d
        L_0x007b:
            int r10 = r10.size()     // Catch:{ Exception -> 0x01fc }
            if (r10 <= 0) goto L_0x0144
            goto L_0x0143
        L_0x0083:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x01fc }
            r11.<init>()     // Catch:{ Exception -> 0x01fc }
            java.util.Iterator r12 = r7.iterator()     // Catch:{ Exception -> 0x01fc }
        L_0x008c:
            boolean r1 = r12.hasNext()     // Catch:{ Exception -> 0x01fc }
            if (r1 == 0) goto L_0x00da
            java.lang.Object r1 = r12.next()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.videocommon.download.a r1 = (com.mbridge.msdk.videocommon.download.C7180a) r1     // Catch:{ Exception -> 0x01fc }
            java.util.Iterator r2 = r13.iterator()     // Catch:{ Exception -> 0x01fc }
        L_0x009c:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x01fc }
            if (r3 == 0) goto L_0x008c
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3     // Catch:{ Exception -> 0x01fc }
            if (r1 == 0) goto L_0x009c
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r1.mo49191g()     // Catch:{ Exception -> 0x01fc }
            if (r4 == 0) goto L_0x009c
            if (r3 == 0) goto L_0x009c
            java.lang.String r4 = r3.getId()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r1.mo49191g()     // Catch:{ Exception -> 0x01fc }
            java.lang.String r5 = r5.getId()     // Catch:{ Exception -> 0x01fc }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x01fc }
            if (r4 == 0) goto L_0x009c
            java.lang.String r3 = r3.getRequestId()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r1.mo49191g()     // Catch:{ Exception -> 0x01fc }
            java.lang.String r4 = r4.getRequestId()     // Catch:{ Exception -> 0x01fc }
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x01fc }
            if (r3 == 0) goto L_0x009c
            r11.add(r1)     // Catch:{ Exception -> 0x01fc }
            goto L_0x009c
        L_0x00da:
            int r12 = r11.size()     // Catch:{ Exception -> 0x01fc }
            if (r12 < r10) goto L_0x00e1
            goto L_0x0143
        L_0x00e1:
            int r9 = r11.size()     // Catch:{ Exception -> 0x01fc }
            goto L_0x0144
        L_0x00e6:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x01fc }
            r10.<init>()     // Catch:{ Exception -> 0x01fc }
            java.util.Iterator r11 = r7.iterator()     // Catch:{ Exception -> 0x01fc }
        L_0x00ef:
            boolean r12 = r11.hasNext()     // Catch:{ Exception -> 0x01fc }
            if (r12 == 0) goto L_0x013d
            java.lang.Object r12 = r11.next()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.videocommon.download.a r12 = (com.mbridge.msdk.videocommon.download.C7180a) r12     // Catch:{ Exception -> 0x01fc }
            java.util.Iterator r1 = r13.iterator()     // Catch:{ Exception -> 0x01fc }
        L_0x00ff:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x01fc }
            if (r2 == 0) goto L_0x00ef
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x01fc }
            if (r12 == 0) goto L_0x00ff
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r12.mo49191g()     // Catch:{ Exception -> 0x01fc }
            if (r3 == 0) goto L_0x00ff
            if (r2 == 0) goto L_0x00ff
            java.lang.String r3 = r2.getId()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r12.mo49191g()     // Catch:{ Exception -> 0x01fc }
            java.lang.String r4 = r4.getId()     // Catch:{ Exception -> 0x01fc }
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x01fc }
            if (r3 == 0) goto L_0x00ff
            java.lang.String r2 = r2.getRequestId()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r12.mo49191g()     // Catch:{ Exception -> 0x01fc }
            java.lang.String r3 = r3.getRequestId()     // Catch:{ Exception -> 0x01fc }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x01fc }
            if (r2 == 0) goto L_0x00ff
            r10.add(r12)     // Catch:{ Exception -> 0x01fc }
            goto L_0x00ff
        L_0x013d:
            int r10 = r10.size()     // Catch:{ Exception -> 0x01fc }
            if (r10 <= 0) goto L_0x0144
        L_0x0143:
            r0 = 1
        L_0x0144:
            if (r0 == 0) goto L_0x0204
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r9 = r6.f18000e     // Catch:{ Exception -> 0x01fc }
            if (r9 != 0) goto L_0x0152
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x01fc }
            r9.<init>()     // Catch:{ Exception -> 0x01fc }
            r6.f18000e = r9     // Catch:{ Exception -> 0x01fc }
            goto L_0x015f
        L_0x0152:
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r9 = r6.f18000e     // Catch:{ Exception -> 0x01fc }
            boolean r9 = r9.containsKey(r8)     // Catch:{ Exception -> 0x01fc }
            if (r9 == 0) goto L_0x015f
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r9 = r6.f18000e     // Catch:{ Exception -> 0x01fc }
            r9.remove(r8)     // Catch:{ Exception -> 0x01fc }
        L_0x015f:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r9 = r6.f18002g     // Catch:{ Exception -> 0x01fc }
            if (r9 != 0) goto L_0x016b
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x01fc }
            r9.<init>()     // Catch:{ Exception -> 0x01fc }
            r6.f18002g = r9     // Catch:{ Exception -> 0x01fc }
            goto L_0x0178
        L_0x016b:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r9 = r6.f18002g     // Catch:{ Exception -> 0x01fc }
            boolean r9 = r9.containsKey(r8)     // Catch:{ Exception -> 0x01fc }
            if (r9 == 0) goto L_0x0178
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r9 = r6.f18002g     // Catch:{ Exception -> 0x01fc }
            r9.remove(r8)     // Catch:{ Exception -> 0x01fc }
        L_0x0178:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r9 = r6.f18001f     // Catch:{ Exception -> 0x01fc }
            if (r9 != 0) goto L_0x0184
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x01fc }
            r9.<init>()     // Catch:{ Exception -> 0x01fc }
            r6.f18001f = r9     // Catch:{ Exception -> 0x01fc }
            goto L_0x0191
        L_0x0184:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r9 = r6.f18001f     // Catch:{ Exception -> 0x01fc }
            boolean r9 = r9.containsKey(r8)     // Catch:{ Exception -> 0x01fc }
            if (r9 == 0) goto L_0x0191
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r9 = r6.f18001f     // Catch:{ Exception -> 0x01fc }
            r9.remove(r8)     // Catch:{ Exception -> 0x01fc }
        L_0x0191:
            if (r7 == 0) goto L_0x0204
            int r9 = r7.size()     // Catch:{ Exception -> 0x01fc }
            if (r9 <= 0) goto L_0x0204
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x01fc }
            r9.<init>()     // Catch:{ Exception -> 0x01fc }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x01fc }
            r10.<init>()     // Catch:{ Exception -> 0x01fc }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x01fc }
            r11.<init>()     // Catch:{ Exception -> 0x01fc }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x01fc }
        L_0x01ac:
            boolean r12 = r7.hasNext()     // Catch:{ Exception -> 0x01fc }
            if (r12 == 0) goto L_0x01ec
            java.lang.Object r12 = r7.next()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.videocommon.download.a r12 = (com.mbridge.msdk.videocommon.download.C7180a) r12     // Catch:{ Exception -> 0x01fc }
            java.util.concurrent.ConcurrentHashMap r13 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x01fc }
            r13.<init>()     // Catch:{ Exception -> 0x01fc }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r12.mo49191g()     // Catch:{ Exception -> 0x01fc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fc }
            r2.<init>()     // Catch:{ Exception -> 0x01fc }
            java.lang.String r3 = r1.getId()     // Catch:{ Exception -> 0x01fc }
            r2.append(r3)     // Catch:{ Exception -> 0x01fc }
            java.lang.String r3 = r1.getVideoUrlEncode()     // Catch:{ Exception -> 0x01fc }
            r2.append(r3)     // Catch:{ Exception -> 0x01fc }
            java.lang.String r3 = r1.getBidToken()     // Catch:{ Exception -> 0x01fc }
            r2.append(r3)     // Catch:{ Exception -> 0x01fc }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01fc }
            r13.put(r2, r12)     // Catch:{ Exception -> 0x01fc }
            r9.add(r13)     // Catch:{ Exception -> 0x01fc }
            r10.add(r1)     // Catch:{ Exception -> 0x01fc }
            r11.add(r12)     // Catch:{ Exception -> 0x01fc }
            goto L_0x01ac
        L_0x01ec:
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r7 = r6.f18000e     // Catch:{ Exception -> 0x01fc }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x01fc }
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r7 = r6.f18001f     // Catch:{ Exception -> 0x01fc }
            r7.put(r8, r10)     // Catch:{ Exception -> 0x01fc }
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r7 = r6.f18002g     // Catch:{ Exception -> 0x01fc }
            r7.put(r8, r11)     // Catch:{ Exception -> 0x01fc }
            goto L_0x0204
        L_0x01fc:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r8 == 0) goto L_0x0204
            r7.printStackTrace()
        L_0x0204:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C7184c.mo49208a(int, java.lang.String, boolean, int, boolean, int, java.util.List):boolean");
    }

    public void load(String str) {
        C7209k c = mo49212c(str);
        if (c != null) {
            c.mo49240a();
        }
    }

    public C7209k createUnitCache(Context context, String str, List<CampaignEx> list, int i, C7212a aVar) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0) {
            return null;
        }
        if (this.f17999d.containsKey(str)) {
            C7209k kVar = this.f17999d.get(str);
            if (i == 94 || i == 287) {
                kVar.mo49243a(list.get(0).getRequestId(), aVar);
            } else {
                kVar.mo49242a(aVar);
            }
            kVar.mo49244a(list);
            return kVar;
        }
        C7209k kVar2 = new C7209k(context, list, (ExecutorService) this.f17997b, str, i);
        if (aVar != null) {
            kVar2.mo49242a(aVar);
        }
        this.f17999d.put(str, kVar2);
        return kVar2;
    }

    public C7209k createUnitCache(Context context, String str, CampaignEx campaignEx, int i, C7212a aVar) {
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (this.f17999d.containsKey(str)) {
            C7209k kVar = this.f17999d.get(str);
            if (i == 94 || i == 287) {
                kVar.mo49243a(campaignEx.getRequestId(), aVar);
            } else {
                kVar.mo49242a(aVar);
            }
            kVar.mo49241a(campaignEx);
            return kVar;
        }
        C7209k kVar2 = new C7209k(context, campaignEx, (ExecutorService) this.f17997b, str, i);
        if (aVar != null) {
            kVar2.mo49242a(aVar);
        }
        this.f17999d.put(str, kVar2);
        return kVar2;
    }

    /* renamed from: a */
    public final void mo49206a(boolean z) {
        this.f17998c = z;
        ConcurrentHashMap<String, C7209k> concurrentHashMap = this.f17999d;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C7209k> value : concurrentHashMap.entrySet()) {
                C7209k kVar = (C7209k) value.getValue();
                if (kVar != null) {
                    kVar.mo49246b();
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo49209b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, C7180a>> c;
        C7180a aVar;
        CampaignEx g;
        ConcurrentHashMap<String, C7209k> concurrentHashMap = this.f17999d;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C7209k> value : concurrentHashMap.entrySet()) {
                C7209k kVar = (C7209k) value.getValue();
                if (!(kVar == null || (c = kVar.mo49248c()) == null)) {
                    int size = c.size();
                    for (int i = 0; i < size; i++) {
                        Map map = c.get(i);
                        if (map != null) {
                            Iterator it = map.entrySet().iterator();
                            if (!(!it.hasNext() || (aVar = (C7180a) ((Map.Entry) it.next()).getValue()) == null || (g = aVar.mo49191g()) == null)) {
                                String videoUrlEncode = g.getVideoUrlEncode();
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                                    return aVar.mo49190f();
                                }
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo49211b(boolean z) {
        if (!z) {
            this.f17998c = false;
        } else if (this.f17998c) {
            return;
        }
        ConcurrentHashMap<String, C7209k> concurrentHashMap = this.f17999d;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C7209k> value : concurrentHashMap.entrySet()) {
                ((C7209k) value.getValue()).mo49240a();
            }
        }
    }

    /* renamed from: a */
    public final void mo49205a() {
        ConcurrentHashMap<String, C7209k> concurrentHashMap = this.f17999d;
        if (concurrentHashMap != null) {
            for (Map.Entry next : concurrentHashMap.entrySet()) {
                C7209k kVar = (C7209k) next.getValue();
                String str = (String) next.getKey();
                try {
                    Class.forName("com.mbridge.msdk.videocommon.d.a");
                    C7179c a = C7177b.m18135a().mo49107a(C6122a.m15302b().mo42896e(), str);
                    if (a != null) {
                        if (a.mo49162u() == 2) {
                            kVar.mo49246b();
                        } else {
                            kVar.mo49240a();
                        }
                    }
                } catch (Exception e) {
                    C6361q.m16158d("DownLoadManager", e.getMessage());
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            C6086d e2 = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), str);
                            if (e2 == null) {
                                e2 = C6086d.m15135e(str);
                            }
                            if (e2.mo42785k() == 2) {
                                kVar.mo49246b();
                            } else {
                                kVar.mo49240a();
                            }
                        }
                    } catch (Exception e3) {
                        C6361q.m16158d("DownLoadManager", e3.getMessage());
                    }
                }
            }
        }
    }
}
