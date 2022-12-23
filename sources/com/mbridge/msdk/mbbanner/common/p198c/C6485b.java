package com.mbridge.msdk.mbbanner.common.p198c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.p168c.C6216b;
import com.mbridge.msdk.foundation.same.p168c.C6219c;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.mbbanner.common.p196a.C6465b;
import com.mbridge.msdk.mbbanner.common.p196a.C6466c;
import com.mbridge.msdk.mbbanner.common.p196a.C6467d;
import com.mbridge.msdk.mbbanner.common.p197b.C6469b;
import com.mbridge.msdk.mbbanner.common.p197b.C6471d;
import com.mbridge.msdk.mbbanner.common.p197b.C6472e;
import com.mbridge.msdk.mbbanner.common.p197b.C6473f;
import com.mbridge.msdk.mbbanner.common.p200e.C6503a;
import com.mbridge.msdk.mbbanner.common.p201f.C6504a;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.common.util.C6505a;
import com.mbridge.msdk.videocommon.download.C7191g;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.mbridge.msdk.mbbanner.common.c.b */
/* compiled from: BannerLoader */
public class C6485b {

    /* renamed from: a */
    private static final String f16172a = C6485b.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f16173b;

    /* renamed from: c */
    private int f16174c = 0;

    /* renamed from: d */
    private C6466c f16175d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6505a f16176e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6469b f16177f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6471d f16178g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile boolean f16179h = false;

    /* renamed from: i */
    private Timer f16180i = new Timer();

    /* renamed from: j */
    private volatile List<String> f16181j = new ArrayList();

    /* renamed from: k */
    private volatile boolean f16182k = false;

    /* renamed from: l */
    private volatile boolean f16183l = false;

    /* renamed from: m */
    private volatile boolean f16184m = false;

    public C6485b(Context context, C6466c cVar, C6469b bVar, C6505a aVar) {
        this.f16173b = context.getApplicationContext();
        this.f16175d = cVar;
        this.f16177f = bVar;
        this.f16176e = aVar;
    }

    /* renamed from: a */
    private void m16661a(String str) {
        if (this.f16184m) {
            return;
        }
        if ((this.f16182k || this.f16183l) && this.f16181j.size() == 0) {
            this.f16179h = true;
            this.f16184m = true;
            this.f16180i.cancel();
            this.f16176e.mo44346a(this.f16177f, str);
            this.f16178g.mo44299a(str);
        }
    }

    /* renamed from: a */
    public final void mo44323a(String str, int i, String str2, boolean z) {
        if (!z) {
            this.f16180i.cancel();
            this.f16179h = true;
            this.f16176e.mo44349b(this.f16177f, str);
            this.f16178g.mo44299a(str);
        } else if (i == 1) {
            synchronized (this) {
                this.f16181j.remove(str2);
                if (this.f16181j.size() == 0) {
                    m16661a(str);
                }
            }
        } else if (i == 2) {
            this.f16183l = true;
            m16661a(str);
        } else if (i == 3) {
            this.f16182k = true;
            m16661a(str);
        }
    }

    /* renamed from: a */
    public final void mo44324a(String str, String str2, C6465b bVar, C6471d dVar) {
        boolean z;
        try {
            this.f16178g = dVar;
            C64872 r11 = new C6504a() {
                /* renamed from: a */
                public final void mo44327a(CampaignUnit campaignUnit) {
                    try {
                        C6485b.this.f16176e.mo44345a(C6485b.this.f16177f, campaignUnit, this.f15543d);
                        C6485b.m16660a(C6485b.this, this.f15543d, campaignUnit);
                    } catch (Exception e) {
                        C6485b.this.f16176e.mo44347a(C6485b.this.f16177f, e.getMessage(), this.f15543d);
                        C6485b.this.f16178g.mo44299a(this.f15543d);
                    }
                }

                /* renamed from: a */
                public final void mo44326a(int i, String str) {
                    C6485b.this.f16176e.mo44347a(C6485b.this.f16177f, str, this.f15543d);
                    C6485b.this.f16178g.mo44299a(this.f15543d);
                }
            };
            r11.f15543d = str2;
            r11.f15544e = str;
            r11.f15545f = 296;
            C6503a aVar = new C6503a(this.f16173b);
            this.f16174c = m16665b(str2);
            C6287d a = C6467d.m16595a(false, this.f16173b, str2, this.f16175d.mo44287a(), this.f16174c, bVar);
            String e = C6366u.m16219e(str2);
            if (!TextUtils.isEmpty(e)) {
                a.mo43870a("j", e);
            }
            String c = bVar.mo44285c();
            if (!TextUtils.isEmpty(c)) {
                r11.mo44344a(c);
                z = true;
            } else {
                z = false;
            }
            this.f16176e.mo44348a(z);
            if (!C6280d.m15868c().mo43860b() || z) {
                aVar.mo43864a(1, C6280d.m15868c().mo43857a(c), a, r11);
            } else {
                aVar.mo43866b(1, C6280d.m15868c().mo43857a(c), a, r11);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this.f16176e.mo44347a(this.f16177f, e2.getMessage(), str2);
            this.f16178g.mo44299a(str2);
        }
    }

    /* renamed from: a */
    private List<CampaignEx> m16659a(String str, CampaignUnit campaignUnit) {
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    for (int i = 0; i < ads.size(); i++) {
                        CampaignEx campaignEx = ads.get(i);
                        if (!(campaignEx == null || campaignEx.getOfferType() == 99 || (TextUtils.isEmpty(campaignEx.getBannerUrl()) && TextUtils.isEmpty(campaignEx.getBannerHtml()) && TextUtils.isEmpty(campaignEx.getImageUrl())))) {
                            if (C6366u.m16209b(campaignEx)) {
                                campaignEx.setRtinsType(C6366u.m16214c(this.f16173b, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (campaignEx.getWtick() != 1) {
                                if (C6366u.m16214c(this.f16173b, campaignEx.getPackageName())) {
                                    if (C6366u.m16209b(campaignEx)) {
                                        arrayList.add(campaignEx);
                                    } else {
                                        C6366u.m16197a(str, campaignEx, C6204a.f15411u);
                                    }
                                }
                            }
                            arrayList.add(campaignEx);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m16662a(String str, List<CampaignEx> list) {
        if (list != null && list.size() > 0) {
            for (CampaignEx next : list) {
                if (!TextUtils.isEmpty(next.getImageUrl())) {
                    this.f16181j.add(next.getImageUrl());
                    C6216b.m15729a(this.f16173b).mo43786a(next.getImageUrl(), (C6219c) new C6473f(this, str));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[SYNTHETIC, Splitter:B:24:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091 A[SYNTHETIC, Splitter:B:37:0x0091] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m16658a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x009a
            r0 = 0
            com.mbridge.msdk.foundation.same.b.c r2 = com.mbridge.msdk.foundation.same.p167b.C6211c.MBRIDGE_700_HTML     // Catch:{ Exception -> 0x005e }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.p167b.C6213e.m15725b(r2)     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C6370y.m16237a(r8)     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r3)     // Catch:{ Exception -> 0x005e }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x005e }
            if (r4 == 0) goto L_0x0025
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x005e }
        L_0x0025:
            java.lang.String r4 = ".html"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ Exception -> 0x005e }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x005e }
            r4.<init>(r2, r3)     // Catch:{ Exception -> 0x005e }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x005e }
            r2.getPath()     // Catch:{ Exception -> 0x005e }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005e }
            r2.<init>(r4)     // Catch:{ Exception -> 0x005e }
            byte[] r0 = r8.getBytes()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r2.write(r0)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r2.flush()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r2.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0052:
            r1 = r0
            goto L_0x006c
        L_0x0054:
            r7 = move-exception
            r0 = r2
            goto L_0x008f
        L_0x0057:
            r0 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x005f
        L_0x005c:
            r7 = move-exception
            goto L_0x008f
        L_0x005e:
            r2 = move-exception
        L_0x005f:
            r2.printStackTrace()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x006c
            r0.close()     // Catch:{ Exception -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006c:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r2 = r0.exists()
            r3 = 2
            if (r2 == 0) goto L_0x008a
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L_0x008a
            boolean r0 = r0.canRead()
            if (r0 != 0) goto L_0x0085
            goto L_0x008a
        L_0x0085:
            r0 = 1
            r6.mo44323a((java.lang.String) r7, (int) r3, (java.lang.String) r8, (boolean) r0)
            goto L_0x009a
        L_0x008a:
            r0 = 0
            r6.mo44323a((java.lang.String) r7, (int) r3, (java.lang.String) r8, (boolean) r0)
            goto L_0x009a
        L_0x008f:
            if (r0 == 0) goto L_0x0099
            r0.close()     // Catch:{ Exception -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0099:
            throw r7
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.p198c.C6485b.m16658a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private int m16665b(String str) {
        try {
            int b = this.f16175d.mo44290b();
            if (b > this.f16175d.mo44291c()) {
                return 0;
            }
            return b;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m16660a(C6485b bVar, final String str, final CampaignUnit campaignUnit) {
        if (campaignUnit == null) {
            bVar.f16176e.mo44347a(bVar.f16177f, "campaignUnit is NULL!", str);
            bVar.f16178g.mo44299a(str);
            return;
        }
        List<CampaignEx> a = bVar.m16659a(str, campaignUnit);
        new Thread(new Runnable() {
            public final void run() {
                C6152j.m15441a((C6146e) C6148f.m15420a(C6485b.this.f16173b)).mo43015b();
                CampaignUnit campaignUnit = campaignUnit;
                if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    BannerUtils.uisList(C6485b.this.f16173b, campaignUnit.getAds());
                }
            }
        }).start();
        if (a == null || a.size() == 0) {
            bVar.f16176e.mo44347a(bVar.f16177f, "Need show campaign list is NULL!", str);
            bVar.f16178g.mo44299a(str);
            return;
        }
        bVar.f16180i.schedule(new TimerTask() {
            public final void run() {
                if (!C6485b.this.f16179h) {
                    boolean unused = C6485b.this.f16179h = true;
                    C6485b.this.mo44323a(str, -1, "", false);
                }
            }
        }, (long) 60000);
        bVar.f16175d.mo44289a(campaignUnit.getSessionId());
        int i = bVar.f16174c;
        int i2 = 0;
        if (a != null) {
            try {
                if (a.size() > 0) {
                    i += a.size();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i > bVar.f16175d.mo44291c()) {
            i = 0;
        }
        if (C6369x.m16236b(str)) {
            bVar.f16175d.mo44288a(i);
        }
        CampaignEx campaignEx = a.get(0);
        String trim = campaignEx.getBannerUrl().trim();
        if (!TextUtils.isEmpty(trim)) {
            if (!TextUtils.isEmpty(trim)) {
                C7191g.m18286a().mo49219a(trim, new C6472e(bVar, str));
            }
            if (a != null && a.size() > 0) {
                while (i2 < a.size()) {
                    a.get(i2).setBannerUrl(campaignEx.getBannerUrl());
                    a.get(i2).setHasMBTplMark(true);
                    i2++;
                }
            }
        } else {
            String trim2 = campaignEx.getBannerHtml().trim();
            if (!TextUtils.isEmpty(trim2)) {
                String a2 = bVar.m16658a(str, trim2);
                if (a != null && a.size() > 0) {
                    while (i2 < a.size()) {
                        a.get(i2).setBannerHtml(a2);
                        a.get(i2).setHasMBTplMark(trim2.contains("<MBTPLMARK>"));
                        i2++;
                    }
                }
            } else {
                bVar.f16183l = true;
                bVar.f16182k = true;
            }
        }
        bVar.m16662a(str, a);
    }
}
