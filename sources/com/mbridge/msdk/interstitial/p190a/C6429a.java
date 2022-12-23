package com.mbridge.msdk.interstitial.p190a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6196f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.net.p178g.C6275b;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.interstitial.p191b.C6433a;
import com.mbridge.msdk.interstitial.p192c.C6434a;
import com.mbridge.msdk.interstitial.p193d.C6439a;
import com.mbridge.msdk.interstitial.p193d.C6440b;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.interstitial.a.a */
/* compiled from: IntersAdapter */
public final class C6429a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f15998a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f15999b;

    /* renamed from: c */
    private String f16000c;

    /* renamed from: d */
    private int f16001d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f16002e;

    /* renamed from: f */
    private int f16003f;

    /* renamed from: g */
    private String f16004g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C6434a.C6436a f16005h;

    /* renamed from: i */
    private C6086d f16006i;

    /* renamed from: j */
    private Handler f16007j;

    public C6429a(Context context, String str, String str2, String str3, boolean z) {
        this.f15998a = context;
        this.f15999b = str;
        this.f16000c = str2;
        this.f16004g = str3;
        this.f16002e = z;
        C6086d e = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), str);
        this.f16006i = e;
        if (e == null) {
            this.f16006i = C6086d.m15136f(this.f15999b);
        }
        this.f16007j = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                try {
                    int i = message.what;
                    if (i != 3) {
                        if (i == 4) {
                            if (C6429a.this.f16005h != null && message.obj != null && (message.obj instanceof String)) {
                                C6429a.this.f16005h.mo44161b(C6429a.this.f16002e, (String) message.obj);
                            }
                        }
                    } else if (C6429a.this.f16005h != null && message.obj != null && (message.obj instanceof String)) {
                        C6429a.this.f16005h.mo44160a(C6429a.this.f16002e, (String) message.obj);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* renamed from: a */
    public final CampaignEx mo44141a() {
        try {
            if (TextUtils.isEmpty(this.f15999b)) {
                return null;
            }
            m16433e();
            List<CampaignEx> f = m16434f();
            if (f != null) {
                if (f.size() > 0) {
                    for (int i = 0; i < f.size(); i++) {
                        CampaignEx campaignEx = f.get(i);
                        if (campaignEx != null && (!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || !TextUtils.isEmpty(campaignEx.getMraid()))) {
                            return campaignEx;
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo44143b() {
        if (this.f15998a == null) {
            m16427b("context is null");
        } else if (TextUtils.isEmpty(this.f15999b)) {
            m16427b("unitid is null");
        } else {
            C6086d dVar = this.f16006i;
            if (dVar == null) {
                m16427b("unitSetting is null please call load");
            } else if (dVar.mo42790q() <= 0) {
                m16427b("controller don't request ad");
            } else {
                m16433e();
                List<CampaignEx> f = m16434f();
                String str = "";
                if (f == null || f.size() <= 0) {
                    try {
                        if (this.f15998a == null) {
                            m16427b("context is null");
                        } else if (TextUtils.isEmpty(this.f15999b)) {
                            m16427b("unitid is null");
                        } else if (this.f16006i == null) {
                            m16427b("unitSetting is null please call load");
                        } else {
                            String e = C6122a.m15302b().mo42896e();
                            String md5 = SameMD5.getMD5(C6122a.m15302b().mo42896e() + C6122a.m15302b().mo42897f());
                            int i = this.f16002e ? 3 : 2;
                            this.f16003f = 1;
                            if (this.f16006i.mo42791r() > 0) {
                                this.f16003f = this.f16006i.mo42791r();
                            }
                            int q = this.f16006i.mo42790q() > 0 ? this.f16006i.mo42790q() : 1;
                            String a = C6208d.m15701a(this.f15999b, "interstitial");
                            this.f16001d = m16436h();
                            String j = m16438j();
                            if (TextUtils.isEmpty(this.f16004g)) {
                                this.f16004g = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                            C6287d dVar2 = new C6287d();
                            C6275b.m15859a(dVar2, "app_id", e);
                            C6275b.m15859a(dVar2, MBridgeConstans.PROPERTIES_UNIT_ID, this.f15999b);
                            if (!TextUtils.isEmpty(this.f16000c)) {
                                C6275b.m15859a(dVar2, MBridgeConstans.PLACEMENT_ID, this.f16000c);
                            }
                            C6275b.m15859a(dVar2, "sign", md5);
                            C6275b.m15859a(dVar2, "category", this.f16004g);
                            C6275b.m15859a(dVar2, "req_type", i + str);
                            C6275b.m15859a(dVar2, "ad_num", q + str);
                            C6275b.m15859a(dVar2, "tnum", this.f16003f + str);
                            C6275b.m15859a(dVar2, "only_impression", "1" + str);
                            C6275b.m15859a(dVar2, "ping_mode", "1");
                            C6275b.m15859a(dVar2, C6287d.f15599b, a);
                            C6275b.m15859a(dVar2, C6287d.f15600c, m16430d());
                            C6275b.m15859a(dVar2, CampaignEx.JSON_KEY_AD_SOURCE_ID, 1 + str);
                            C6275b.m15859a(dVar2, C6287d.f15598a, j);
                            C6275b.m15859a(dVar2, "ad_type", 279 + str);
                            C6275b.m15859a(dVar2, "offset", this.f16001d + str);
                            String e2 = C6366u.m16219e(this.f15999b);
                            if (!TextUtils.isEmpty(e2)) {
                                dVar2.mo43870a("j", e2);
                            }
                            C6439a aVar = new C6439a(this.f15998a);
                            C64312 r1 = new C6440b() {
                                /* renamed from: a */
                                public final void mo44147a(CampaignUnit campaignUnit) {
                                    try {
                                        C6429a.m16421a(C6429a.this, campaignUnit);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        C6429a.this.m16427b("can't show because unknow error");
                                        C6429a.this.m16437i();
                                    }
                                }

                                /* renamed from: a */
                                public final void mo44146a(int i, String str) {
                                    C6361q.m16158d("IntersAdapter", str);
                                    C6429a.this.m16427b(str);
                                    C6429a.this.m16437i();
                                }
                            };
                            r1.f15543d = this.f15999b;
                            r1.f15544e = this.f16000c;
                            r1.f15545f = 279;
                            if (C6280d.m15868c().mo43860b()) {
                                aVar.mo43866b(1, C6280d.m15868c().f15572h, dVar2, r1);
                            } else {
                                aVar.mo43864a(1, C6280d.m15868c().f15570f, dVar2, r1);
                            }
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        m16427b("can't show because unknow error");
                        m16437i();
                    }
                } else {
                    CampaignEx campaignEx = f.get(0);
                    if (campaignEx != null) {
                        str = campaignEx.getRequestId();
                    }
                    m16423a(str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16423a(String str) {
        if (this.f16007j != null) {
            Message obtain = Message.obtain();
            obtain.obj = str;
            obtain.what = 3;
            this.f16007j.sendMessage(obtain);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m16427b(String str) {
        try {
            if (this.f16007j != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 4;
                this.f16007j.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private String m16430d() {
        String str = "";
        try {
            JSONArray a = C6366u.m16194a(this.f15998a, this.f15999b);
            if (a.length() > 0) {
                str = C6366u.m16192a(a);
            }
            C6361q.m16156b("IntersAdapter", "get excludes:" + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: e */
    private void m16433e() {
        try {
            if (C6433a.m16445a() != null) {
                C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
                if (b == null) {
                    b = C6076b.m15089a().mo42748b();
                }
                C6433a.m16445a().mo44150a(b.mo42733v() * 1000, this.f15999b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private List<CampaignEx> m16434f() {
        try {
            if (C6433a.m16445a() != null) {
                return C6433a.m16445a().mo44149a(this.f15999b, 1);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo44142a(C6434a.C6436a aVar) {
        this.f16005h = aVar;
    }

    /* renamed from: a */
    private List<CampaignEx> m16420a(List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int r = this.f16006i.mo42791r();
                    int i = 0;
                    while (true) {
                        if (i >= list.size() || i >= this.f16003f) {
                            break;
                        } else if (arrayList.size() >= r) {
                            break;
                        } else {
                            CampaignEx campaignEx = list.get(i);
                            if (campaignEx == null || campaignEx.getOfferType() != 1 || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                if (campaignEx != null && ((!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || campaignEx.isMraid()) && campaignEx.getOfferType() != 99)) {
                                    if (C6366u.m16209b(campaignEx)) {
                                        campaignEx.setRtinsType(C6366u.m16214c(this.f15998a, campaignEx.getPackageName()) ? 1 : 2);
                                    }
                                    if (campaignEx.getWtick() != 1) {
                                        if (C6366u.m16214c(this.f15998a, campaignEx.getPackageName())) {
                                            if (C6366u.m16209b(campaignEx)) {
                                                arrayList.add(campaignEx);
                                            } else {
                                                C6366u.m16197a(this.f15999b, campaignEx, C6204a.f15411u);
                                            }
                                        }
                                    }
                                    arrayList.add(campaignEx);
                                }
                            }
                            i++;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf A[SYNTHETIC, Splitter:B:29:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00eb A[SYNTHETIC, Splitter:B:41:0x00eb] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> m16424b(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "5"
            java.lang.String r1 = ""
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r11.size()
            r2.<init>(r3)
            java.util.Iterator r11 = r11.iterator()
        L_0x0011:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x00f9
            java.lang.Object r3 = r11.next()
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            boolean r4 = r3.isMraid()
            if (r4 == 0) goto L_0x00f4
            java.lang.String r4 = r3.getMraid()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00f4
            r4 = 0
            com.mbridge.msdk.foundation.same.b.c r5 = com.mbridge.msdk.foundation.same.p167b.C6211c.MBRIDGE_700_HTML     // Catch:{ Exception -> 0x00ad }
            java.lang.String r5 = com.mbridge.msdk.foundation.same.p167b.C6213e.m15725b(r5)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = r3.getMraid()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = com.mbridge.msdk.foundation.tools.C6370y.m16237a(r6)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r6)     // Catch:{ Exception -> 0x00ad }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00ad }
            if (r7 == 0) goto L_0x004e
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00ad }
        L_0x004e:
            java.lang.String r7 = ".html"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Exception -> 0x00ad }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x00ad }
            r7.<init>(r5, r6)     // Catch:{ Exception -> 0x00ad }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00ad }
            r5.<init>(r7)     // Catch:{ Exception -> 0x00ad }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r4.<init>()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            com.mbridge.msdk.b.b.a r6 = com.mbridge.msdk.p158b.p160b.C6077a.m15106a()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r6 = r6.mo42759b()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            if (r8 != 0) goto L_0x007e
            java.lang.String r8 = "<script>"
            r4.append(r8)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r4.append(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r6 = "</script>"
            r4.append(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
        L_0x007e:
            java.lang.String r6 = r3.getMraid()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r4.append(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r5.write(r4)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r5.flush()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r4 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r3.setMraid(r4)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r4 = r10.f15999b     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            com.mbridge.msdk.foundation.same.report.C6305b.m15963a(r3, r1, r4, r0)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r5.close()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c7
        L_0x00a3:
            r11 = move-exception
            r4 = r5
            goto L_0x00e9
        L_0x00a6:
            r4 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
            goto L_0x00ae
        L_0x00ab:
            r11 = move-exception
            goto L_0x00e9
        L_0x00ad:
            r5 = move-exception
        L_0x00ae:
            r5.printStackTrace()     // Catch:{ all -> 0x00ab }
            r3.setMraid(r1)     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = r10.f15999b     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.foundation.same.report.C6305b.m15963a(r3, r5, r6, r0)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x00c7
            r4.close()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c7
        L_0x00c3:
            r4 = move-exception
            r4.printStackTrace()
        L_0x00c7:
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r3.getMraid()
            r4.<init>(r5)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L_0x00e2
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L_0x00e2
            boolean r4 = r4.canRead()
            if (r4 != 0) goto L_0x00f4
        L_0x00e2:
            java.lang.String r3 = "mraid resource write fail"
            r10.m16427b((java.lang.String) r3)
            goto L_0x0011
        L_0x00e9:
            if (r4 == 0) goto L_0x00f3
            r4.close()     // Catch:{ Exception -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00f3:
            throw r11
        L_0x00f4:
            r2.add(r3)
            goto L_0x0011
        L_0x00f9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.interstitial.p190a.C6429a.m16424b(java.util.List):java.util.List");
    }

    /* renamed from: g */
    private int m16435g() {
        try {
            Map<String, Integer> map = C6434a.f16018d;
            int intValue = (TextUtils.isEmpty(this.f15999b) || map == null || !map.containsKey(this.f15999b)) ? 1 : map.get(this.f15999b).intValue();
            if (intValue <= 0) {
                return 1;
            }
            return intValue;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* renamed from: h */
    private int m16436h() {
        int i = 0;
        try {
            int a = !TextUtils.isEmpty(this.f15999b) ? C6434a.m16451a(this.f15999b) : 0;
            if (a <= m16435g()) {
                i = a;
            }
            C6361q.m16156b("IntersAdapter", "getCurrentOffset:" + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m16437i() {
        try {
            if (!TextUtils.isEmpty(this.f15999b)) {
                C6434a.m16456a(this.f15999b, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    private String m16438j() {
        try {
            if (!TextUtils.isEmpty(C6434a.f16016a)) {
                return C6434a.f16016a;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public final boolean mo44144c() {
        return this.f16002e;
    }

    /* renamed from: a */
    static /* synthetic */ void m16421a(C6429a aVar, CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            aVar.m16427b("no server ads available");
            return;
        }
        final ArrayList<CampaignEx> ads = campaignUnit.getAds();
        final List<CampaignEx> a = aVar.m16420a((List<CampaignEx>) ads);
        if (campaignUnit != null) {
            String sessionId = campaignUnit.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                C6361q.m16156b("IntersAdapter", "onload sessionId:" + sessionId);
                C6434a.f16016a = sessionId;
            }
        }
        try {
            aVar.f16001d += aVar.f16003f;
            if (aVar.f16001d > aVar.m16435g()) {
                aVar.f16001d = 0;
            }
            if (!TextUtils.isEmpty(aVar.f15999b)) {
                C6434a.m16456a(aVar.f15999b, aVar.f16001d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            public final void run() {
                List list = a;
                if (list == null || list.size() <= 0) {
                    C6429a.this.m16427b("no ads available");
                } else {
                    String d = C6429a.this.f15999b;
                    List<CampaignEx> a = C6429a.this.m16424b((List<CampaignEx>) a);
                    if (C6433a.m16445a() != null) {
                        C6433a a2 = C6433a.m16445a();
                        try {
                            if (!TextUtils.isEmpty(d) && a != null && a.size() > 0) {
                                for (CampaignEx b : a) {
                                    a2.mo44153b(b, d);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    CampaignEx campaignEx = (CampaignEx) a.get(0);
                    C6429a.this.m16423a(campaignEx != null ? campaignEx.getRequestId() : "");
                }
                C6152j.m15441a((C6146e) C6148f.m15420a(C6429a.this.f15998a)).mo43015b();
                List list2 = ads;
                if (list2 != null && list2.size() > 0) {
                    C6429a.m16426b(C6429a.this, ads);
                }
            }
        }).start();
    }

    /* renamed from: b */
    static /* synthetic */ void m16426b(C6429a aVar, List list) {
        if (aVar.f15998a != null && list != null && list.size() != 0) {
            C6152j a = C6152j.m15441a((C6146e) C6148f.m15420a(aVar.f15998a));
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) list.get(i);
                if (!(campaignEx == null || a == null || a.mo43013a(campaignEx.getId()))) {
                    C6196f fVar = new C6196f();
                    fVar.mo43631a(campaignEx.getId());
                    fVar.mo43629a(campaignEx.getFca());
                    fVar.mo43633b(campaignEx.getFcb());
                    fVar.mo43637d(0);
                    fVar.mo43635c(0);
                    fVar.mo43630a(System.currentTimeMillis());
                    a.mo43012a(fVar);
                }
            }
        }
    }
}
