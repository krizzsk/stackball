package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.CommonJumpLoader;
import com.mbridge.msdk.foundation.entity.C6193c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6364t;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.mbridge.msdk.click.a */
/* compiled from: CommonClickControl */
public final class C6097a {

    /* renamed from: a */
    public static boolean f15033a = false;

    /* renamed from: b */
    public static Map<String, Long> f15034b = new HashMap();

    /* renamed from: c */
    public static Set<String> f15035c = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f15036d;

    /* renamed from: e */
    private long f15037e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6148f f15038f = null;

    /* renamed from: g */
    private Context f15039g = null;

    /* renamed from: h */
    private CommonJumpLoader f15040h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public NativeListener.NativeTrackingListener f15041i = null;

    /* renamed from: j */
    private C6308c f15042j;

    /* renamed from: k */
    private C6072a f15043k;

    /* renamed from: l */
    private boolean f15044l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f15045m = false;

    /* renamed from: n */
    private boolean f15046n = true;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f15047o;

    public C6097a(Context context, String str) {
        C6072a b = C6076b.m15089a().mo42749b(str);
        this.f15043k = b;
        if (b == null) {
            this.f15043k = C6076b.m15089a().mo42748b();
        }
        this.f15044l = this.f15043k.mo42729s();
        Context applicationContext = context.getApplicationContext();
        this.f15039g = applicationContext;
        this.f15036d = str;
        if (this.f15038f == null) {
            this.f15038f = C6148f.m15420a(applicationContext);
        }
        this.f15042j = new C6308c(this.f15039g);
    }

    /* renamed from: a */
    public final void mo42842a(String str) {
        this.f15036d = str;
    }

    /* renamed from: a */
    public final void mo42841a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f15041i = nativeTrackingListener;
    }

    /* renamed from: a */
    public final void mo42843a(boolean z) {
        this.f15046n = z;
    }

    /* renamed from: a */
    public final void mo42837a() {
        try {
            this.f15041i = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo42839a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (!(nativeAdListener == null || campaignEx == null)) {
            nativeAdListener.onAdClick(campaignEx);
        }
        mo42838a(campaignEx);
    }

    /* renamed from: b */
    private boolean m15202b(CampaignEx campaignEx) {
        Long l;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id = campaignEx.getId();
            if (f15034b == null) {
                return true;
            }
            if (f15034b.containsKey(id) && (l = f15034b.get(id)) != null) {
                if (l.longValue() > System.currentTimeMillis() || f15035c.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f15034b.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + ((long) (campaignEx.getClickTimeOutInterval() * 1000))));
            return true;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    private void m15194a(CampaignEx campaignEx, String str) {
        if (!TextUtils.isEmpty(str)) {
            m15185a(this.f15039g, campaignEx, this.f15036d, str, true, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5 A[Catch:{ all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0142 A[Catch:{ all -> 0x01c8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42838a(com.mbridge.msdk.foundation.entity.CampaignEx r12) {
        /*
            r11 = this;
            boolean r0 = r11.m15202b((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = r12.getNoticeUrl()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.db.f r1 = r11.f15038f     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.db.b r1 = com.mbridge.msdk.foundation.p164db.C6141b.m15357a(r1)     // Catch:{ all -> 0x01c8 }
            r1.mo42947a()     // Catch:{ all -> 0x01c8 }
            java.lang.String r2 = r12.getId()     // Catch:{ all -> 0x01c8 }
            java.lang.String r3 = r11.f15036d     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r2 = r1.mo42949b(r2, r3)     // Catch:{ all -> 0x01c8 }
            if (r2 == 0) goto L_0x0032
            java.lang.String r3 = r2.getNoticeurl()     // Catch:{ all -> 0x01c8 }
            if (r3 == 0) goto L_0x002a
            r3 = 0
            r2.setNoticeurl(r3)     // Catch:{ all -> 0x01c8 }
        L_0x002a:
            r12.setJumpResult(r2)     // Catch:{ all -> 0x01c8 }
            java.lang.String r3 = r11.f15036d     // Catch:{ all -> 0x01c8 }
            r1.mo42946a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (java.lang.String) r3)     // Catch:{ all -> 0x01c8 }
        L_0x0032:
            boolean r1 = com.mbridge.msdk.foundation.tools.C6366u.m16199a((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x01c8 }
            if (r1 == 0) goto L_0x0078
            com.mbridge.msdk.foundation.tools.i r1 = com.mbridge.msdk.foundation.tools.C6338i.m16066a()     // Catch:{ all -> 0x01c8 }
            r1.mo43939a((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x01c8 }
            android.content.Context r1 = r11.f15039g     // Catch:{ all -> 0x01c8 }
            java.lang.String r3 = r12.getDeepLinkURL()     // Catch:{ all -> 0x01c8 }
            boolean r1 = com.mbridge.msdk.click.C6103b.m15229d(r1, r3)     // Catch:{ all -> 0x01c8 }
            if (r1 == 0) goto L_0x0060
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c8 }
            r1.<init>()     // Catch:{ all -> 0x01c8 }
            r1.append(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = "&opdptype=1"
            r1.append(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c8 }
            r11.m15194a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (java.lang.String) r0)     // Catch:{ all -> 0x01c8 }
            return
        L_0x0060:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c8 }
            r1.<init>()     // Catch:{ all -> 0x01c8 }
            r1.append(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = "&opdptype=0"
            r1.append(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.i r1 = com.mbridge.msdk.foundation.tools.C6338i.m16066a()     // Catch:{ all -> 0x01c8 }
            r1.mo43941b((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x01c8 }
        L_0x0078:
            r11.m15194a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (java.lang.String) r0)     // Catch:{ all -> 0x01c8 }
            boolean r0 = r12.getUserActivation()     // Catch:{ all -> 0x01c8 }
            r1 = 1
            if (r0 != 0) goto L_0x00ba
            android.content.Context r0 = r11.f15039g     // Catch:{ all -> 0x01c8 }
            java.lang.String r3 = r12.getPackageName()     // Catch:{ all -> 0x01c8 }
            boolean r0 = com.mbridge.msdk.click.C6103b.m15228c(r0, r3)     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00ba
            android.content.Context r0 = r11.f15039g     // Catch:{ all -> 0x01c8 }
            java.lang.String r2 = r12.getPackageName()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.click.C6103b.m15230e(r0, r2)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00a4
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            java.lang.String r2 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            r0.onStartRedirection(r12, r2)     // Catch:{ all -> 0x01c8 }
        L_0x00a4:
            r11.m15195a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00b9
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            r0.onFinishRedirection(r12, r1)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r12 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C6364t.m16176a((com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r12)     // Catch:{ all -> 0x01c8 }
        L_0x00b9:
            return
        L_0x00ba:
            int r0 = r12.getLinkType()     // Catch:{ all -> 0x01c8 }
            int r3 = r11.m15200b()     // Catch:{ all -> 0x01c8 }
            r4 = 4
            r5 = 9
            r6 = 8
            r7 = 0
            if (r0 == r6) goto L_0x00d1
            if (r0 == r5) goto L_0x00d1
            if (r0 != r4) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            r8 = 0
            goto L_0x00d2
        L_0x00d1:
            r8 = 1
        L_0x00d2:
            r9 = 2
            if (r8 == 0) goto L_0x0142
            java.lang.String r8 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r10 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r10 == 0) goto L_0x00e2
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r10 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            r10.onStartRedirection(r12, r8)     // Catch:{ all -> 0x01c8 }
        L_0x00e2:
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01c8 }
            if (r10 == 0) goto L_0x00f5
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00f1
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            r0.onRedirectionFailed(r12, r8)     // Catch:{ all -> 0x01c8 }
        L_0x00f1:
            r11.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x01c8 }
            return
        L_0x00f5:
            if (r0 != r6) goto L_0x010b
            android.content.Context r0 = r11.f15039g     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C6364t.m16174a(r0, r8, r12, r1)     // Catch:{ all -> 0x01c8 }
            r11.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x010a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            r0.onFinishRedirection(r12, r8)     // Catch:{ all -> 0x01c8 }
        L_0x010a:
            return
        L_0x010b:
            if (r0 != r5) goto L_0x0121
            android.content.Context r0 = r11.f15039g     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C6364t.m16177b(r0, r8, r1)     // Catch:{ all -> 0x01c8 }
            r11.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x0120
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            r0.onFinishRedirection(r12, r8)     // Catch:{ all -> 0x01c8 }
        L_0x0120:
            return
        L_0x0121:
            if (r0 != r4) goto L_0x0134
            if (r3 != r9) goto L_0x012d
            android.content.Context r0 = r11.f15039g     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C6364t.m16174a(r0, r8, r12, r1)     // Catch:{ all -> 0x01c8 }
            goto L_0x0134
        L_0x012d:
            android.content.Context r0 = r11.f15039g     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C6364t.m16177b(r0, r8, r1)     // Catch:{ all -> 0x01c8 }
        L_0x0134:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x013d
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            r0.onFinishRedirection(r12, r8)     // Catch:{ all -> 0x01c8 }
        L_0x013d:
            r11.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            goto L_0x01d2
        L_0x0142:
            if (r0 != r9) goto L_0x0196
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = "market://"
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x0161
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = "https://play.google.com/"
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x015d
            goto L_0x0161
        L_0x015d:
            r11.m15195a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            goto L_0x01d2
        L_0x0161:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x016e
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            r0.onStartRedirection(r12, r1)     // Catch:{ all -> 0x01c8 }
        L_0x016e:
            android.content.Context r0 = r11.f15039g     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            boolean r0 = com.mbridge.msdk.foundation.tools.C6364t.C6365a.m16179a(r0, r1, r4)     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            r11.m15184a((int) r3, (java.lang.String) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r1)     // Catch:{ all -> 0x01c8 }
        L_0x0185:
            r11.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x0195
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            r0.onFinishRedirection(r12, r1)     // Catch:{ all -> 0x01c8 }
        L_0x0195:
            return
        L_0x0196:
            r3 = 3
            if (r0 != r3) goto L_0x019d
            r11.m15195a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x01c8 }
            goto L_0x01d2
        L_0x019d:
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x01c8 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01c8 }
            if (r3 == 0) goto L_0x01b4
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r3 == 0) goto L_0x01b0
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            r3.onRedirectionFailed(r12, r0)     // Catch:{ all -> 0x01c8 }
        L_0x01b0:
            r11.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x01c8 }
            return
        L_0x01b4:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            if (r3 == 0) goto L_0x01bd
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            r3.onFinishRedirection(r12, r0)     // Catch:{ all -> 0x01c8 }
        L_0x01bd:
            android.content.Context r3 = r11.f15039g     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r11.f15041i     // Catch:{ all -> 0x01c8 }
            com.mbridge.msdk.foundation.tools.C6364t.m16177b(r3, r0, r4)     // Catch:{ all -> 0x01c8 }
            r11.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x01c8 }
            goto L_0x01d2
        L_0x01c8:
            r12 = move-exception
            java.lang.String r0 = r12.getMessage()
            java.lang.String r1 = "MBridge SDK M"
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r1, r0, r12)
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6097a.mo42838a(com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    /* renamed from: a */
    public static void m15185a(Context context, CampaignEx campaignEx, String str, String str2, boolean z, boolean z2) {
        if (context != null) {
            new CommonJumpLoader(context.getApplicationContext()).mo42812a(str, campaignEx, new C6107d() {
                /* renamed from: a */
                public final void mo42844a(Object obj) {
                }

                /* renamed from: a */
                public final void mo42845a(Object obj, String str) {
                }

                /* renamed from: b */
                public final void mo42846b(Object obj) {
                }
            }, str2, z, z2);
        }
    }

    /* renamed from: a */
    public static void m15186a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z, boolean z2) {
        if (context != null && campaignEx != null && !TextUtils.isEmpty(str) && strArr != null) {
            CommonJumpLoader commonJumpLoader = new CommonJumpLoader(context.getApplicationContext());
            for (String a : strArr) {
                commonJumpLoader.mo42812a(str, campaignEx, new C6107d() {
                    /* renamed from: a */
                    public final void mo42844a(Object obj) {
                    }

                    /* renamed from: a */
                    public final void mo42845a(Object obj, String str) {
                    }

                    /* renamed from: b */
                    public final void mo42846b(Object obj) {
                    }
                }, a, z, z2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4 A[Catch:{ Exception -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f9 A[Catch:{ Exception -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c A[Catch:{ Exception -> 0x012d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15195a(final com.mbridge.msdk.foundation.entity.CampaignEx r8, final boolean r9) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x012d }
            r7.f15037e = r0     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r7.f15041i     // Catch:{ Exception -> 0x012d }
            r1 = 1
            if (r0 == 0) goto L_0x001e
            if (r9 != 0) goto L_0x001e
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r7.f15041i     // Catch:{ Exception -> 0x012d }
            java.lang.String r2 = r8.getClickURL()     // Catch:{ Exception -> 0x012d }
            r0.onStartRedirection(r8, r2)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r7.f15041i     // Catch:{ Exception -> 0x012d }
            boolean r0 = r0.onInterceptDefaultLoadingDialog()     // Catch:{ Exception -> 0x012d }
            r0 = r0 ^ r1
            goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            r2 = 0
            r7.f15047o = r2     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r3 = r8.getJumpResult()     // Catch:{ Exception -> 0x012d }
            if (r3 == 0) goto L_0x0039
            if (r9 != 0) goto L_0x0033
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r3 = r8.getJumpResult()     // Catch:{ Exception -> 0x012d }
            boolean r4 = r7.f15045m     // Catch:{ Exception -> 0x012d }
            r7.m15193a((com.mbridge.msdk.foundation.entity.CampaignEx) r8, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r3, (boolean) r1, (boolean) r4)     // Catch:{ Exception -> 0x012d }
        L_0x0033:
            r7.f15047o = r1     // Catch:{ Exception -> 0x012d }
            r7.f15045m = r2     // Catch:{ Exception -> 0x012d }
            r3 = 0
            goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            com.mbridge.msdk.foundation.db.f r4 = r7.f15038f     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.foundation.db.b r4 = com.mbridge.msdk.foundation.p164db.C6141b.m15357a(r4)     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = r8.getId()     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = r7.f15036d     // Catch:{ Exception -> 0x012d }
            boolean r4 = r4.mo42948a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x0052
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r4 = r8.getJumpResult()     // Catch:{ Exception -> 0x012d }
            if (r4 != 0) goto L_0x0131
        L_0x0052:
            com.mbridge.msdk.foundation.db.f r4 = r7.f15038f     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.foundation.db.b r4 = com.mbridge.msdk.foundation.p164db.C6141b.m15357a(r4)     // Catch:{ Exception -> 0x012d }
            r4.mo42947a()     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = r8.getId()     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = r7.f15036d     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r4 = r4.mo42949b(r5, r6)     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x007a
            if (r9 != 0) goto L_0x007a
            r8.setJumpResult(r4)     // Catch:{ Exception -> 0x012d }
            if (r3 == 0) goto L_0x0078
            boolean r5 = r7.f15045m     // Catch:{ Exception -> 0x012d }
            r7.m15193a((com.mbridge.msdk.foundation.entity.CampaignEx) r8, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r4, (boolean) r3, (boolean) r5)     // Catch:{ Exception -> 0x012d }
            r7.f15047o = r1     // Catch:{ Exception -> 0x012d }
            r7.f15045m = r2     // Catch:{ Exception -> 0x012d }
            goto L_0x00cf
        L_0x0078:
            r2 = r3
            goto L_0x00cf
        L_0x007a:
            java.lang.String r4 = r8.getClick_mode()     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = "6"
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x00c9
            java.lang.String r4 = r8.getPackageName()     // Catch:{ Exception -> 0x012d }
            boolean r4 = r4.isEmpty()     // Catch:{ Exception -> 0x012d }
            if (r4 != 0) goto L_0x00c9
            int r4 = r8.getLinkType()     // Catch:{ Exception -> 0x012d }
            r5 = 2
            if (r4 != r5) goto L_0x00c9
            if (r9 != 0) goto L_0x00c9
            android.content.Context r4 = r7.f15039g     // Catch:{ Exception -> 0x012d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r5.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = "market://details?id="
            r5.append(r6)     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = r8.getPackageName()     // Catch:{ Exception -> 0x012d }
            r5.append(r6)     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = r7.f15041i     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.foundation.tools.C6364t.C6365a.m16179a(r4, r5, r6)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r7.f15041i     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x00c6
            if (r3 == 0) goto L_0x00c6
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r7.f15041i     // Catch:{ Exception -> 0x012d }
            r3.onDismissLoading(r8)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r7.f15041i     // Catch:{ Exception -> 0x012d }
            r4 = 0
            r3.onFinishRedirection(r8, r4)     // Catch:{ Exception -> 0x012d }
        L_0x00c6:
            r7.f15047o = r1     // Catch:{ Exception -> 0x012d }
            r3 = 0
        L_0x00c9:
            if (r9 == 0) goto L_0x0078
            r7.f15047o = r1     // Catch:{ Exception -> 0x012d }
            r7.f15045m = r2     // Catch:{ Exception -> 0x012d }
        L_0x00cf:
            android.os.Handler r1 = new android.os.Handler     // Catch:{ Exception -> 0x012d }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x012d }
            r1.<init>(r3)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.a$3 r3 = new com.mbridge.msdk.click.a$3     // Catch:{ Exception -> 0x012d }
            r3.<init>(r0, r9, r8)     // Catch:{ Exception -> 0x012d }
            r1.post(r3)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.CommonJumpLoader r9 = r7.f15040h     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x00e9
            com.mbridge.msdk.click.CommonJumpLoader r9 = r7.f15040h     // Catch:{ Exception -> 0x012d }
            r9.mo42810a()     // Catch:{ Exception -> 0x012d }
        L_0x00e9:
            java.util.Set<java.lang.String> r9 = f15035c     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x010c
            java.util.Set<java.lang.String> r9 = f15035c     // Catch:{ Exception -> 0x012d }
            java.lang.String r1 = r8.getId()     // Catch:{ Exception -> 0x012d }
            boolean r9 = r9.contains(r1)     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x010c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r7.f15041i     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x010b
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r7.f15041i     // Catch:{ Exception -> 0x012d }
            r9.onDismissLoading(r8)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r7.f15041i     // Catch:{ Exception -> 0x012d }
            java.lang.String r0 = r8.getClickURL()     // Catch:{ Exception -> 0x012d }
            r9.onFinishRedirection(r8, r0)     // Catch:{ Exception -> 0x012d }
        L_0x010b:
            return
        L_0x010c:
            java.util.Set<java.lang.String> r9 = f15035c     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x0119
            java.util.Set<java.lang.String> r9 = f15035c     // Catch:{ Exception -> 0x012d }
            java.lang.String r1 = r8.getId()     // Catch:{ Exception -> 0x012d }
            r9.add(r1)     // Catch:{ Exception -> 0x012d }
        L_0x0119:
            com.mbridge.msdk.click.CommonJumpLoader r9 = new com.mbridge.msdk.click.CommonJumpLoader     // Catch:{ Exception -> 0x012d }
            android.content.Context r1 = r7.f15039g     // Catch:{ Exception -> 0x012d }
            r9.<init>(r1)     // Catch:{ Exception -> 0x012d }
            r7.f15040h = r9     // Catch:{ Exception -> 0x012d }
            java.lang.String r1 = r7.f15036d     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.a$4 r3 = new com.mbridge.msdk.click.a$4     // Catch:{ Exception -> 0x012d }
            r3.<init>(r8, r2, r0)     // Catch:{ Exception -> 0x012d }
            r9.mo42811a(r1, r8, r3)     // Catch:{ Exception -> 0x012d }
            goto L_0x0131
        L_0x012d:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6097a.m15195a(com.mbridge.msdk.foundation.entity.CampaignEx, boolean):void");
    }

    /* renamed from: a */
    private void m15187a(CommonJumpLoader.JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i, boolean z) {
        if (campaignEx != null && jumpLoaderResult != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis() - this.f15037e;
                C6193c cVar = new C6193c();
                int n = C6349m.m16123n(this.f15039g);
                cVar.mo43602a(n);
                cVar.mo43603a(C6349m.m16092a(this.f15039g, n));
                cVar.mo43617j(campaignEx.getRequestId());
                cVar.mo43618k(campaignEx.getRequestIdNotice());
                cVar.mo43608d(i);
                cVar.mo43616i(currentTimeMillis + "");
                cVar.mo43615h(campaignEx.getId());
                cVar.mo43612f(jumpLoaderResult.getType());
                if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                    cVar.mo43614g(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
                }
                cVar.mo43607c((this.f15037e / 1000) + "");
                cVar.mo43604b(Integer.parseInt(campaignEx.getLandingType()));
                cVar.mo43606c(campaignEx.getLinkType());
                cVar.mo43605b(this.f15036d);
                cVar.mo43612f(jumpLoaderResult.getType());
                if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                    cVar.mo43614g(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
                }
                if (this.f15044l) {
                    cVar.mo43610e(jumpLoaderResult.getStatusCode());
                    if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                        cVar.mo43611e(URLEncoder.encode(jumpLoaderResult.getHeader(), "utf-8"));
                    }
                    if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                        cVar.mo43613f(URLEncoder.encode(jumpLoaderResult.getContent(), "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                        cVar.mo43609d(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), "utf-8"));
                    }
                }
                if (z) {
                    this.f15042j.mo43928a("click_jump_error", cVar, this.f15036d);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(cVar);
                String a = C6193c.m15509a((List<C6193c>) arrayList);
                if (!C6369x.m16236b(a)) {
                    return;
                }
                if (C6301a.m15945a().mo43913c()) {
                    C6301a.m15945a().mo43911a(a);
                } else {
                    new C6308c(this.f15039g, 0).mo43932a("click_jump_success", a, (String) null, (Frame) null);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo42840a(Campaign campaign, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (campaign != null) {
                CampaignEx campaignEx = null;
                if (campaign instanceof CampaignEx) {
                    campaignEx = (CampaignEx) campaign;
                }
                if ((!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) || C6364t.C6365a.m16179a(this.f15039g, str, this.f15041i) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    Context context = this.f15039g;
                    C6364t.C6365a.m16179a(context, "market://details?id=" + campaignEx.getPackageName(), this.f15041i);
                } else if (m15200b() == 2) {
                    C6364t.m16174a(this.f15039g, campaignEx.getClickURL(), campaignEx, this.f15041i);
                } else {
                    C6364t.m16177b(this.f15039g, campaignEx.getClickURL(), this.f15041i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15188a(CommonJumpLoader.JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z) {
        m15187a(jumpLoaderResult, campaignEx, 1, z);
    }

    /* renamed from: a */
    private void m15184a(int i, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i == 2) {
                C6364t.m16174a(this.f15039g, str, campaignEx, nativeTrackingListener);
            } else {
                C6364t.m16177b(this.f15039g, str, nativeTrackingListener);
            }
        } catch (Throwable th) {
            C6361q.m16155a("MBridge SDK M", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    private boolean m15199a(CampaignEx campaignEx, CommonJumpLoader.JumpLoaderResult jumpLoaderResult, boolean z, int i) {
        boolean z2 = false;
        if (z) {
            try {
                int parseInt = Integer.parseInt(campaignEx.getLandingType());
                if (parseInt == 1) {
                    C6364t.m16177b(this.f15039g, jumpLoaderResult.getUrl(), this.f15041i);
                } else if (parseInt == 2) {
                    C6364t.m16174a(this.f15039g, jumpLoaderResult.getUrl(), campaignEx, this.f15041i);
                } else if (campaignEx.getPackageName() != null) {
                    Context context = this.f15039g;
                    if (!C6364t.C6365a.m16179a(context, "market://details?id=" + campaignEx.getPackageName(), this.f15041i)) {
                        m15184a(i, jumpLoaderResult.getUrl(), campaignEx, this.f15041i);
                    }
                } else {
                    m15184a(i, jumpLoaderResult.getUrl(), campaignEx, this.f15041i);
                }
                z2 = true;
            } catch (Throwable th) {
                C6361q.m16155a("MBridge SDK M", th.getMessage(), th);
            }
        }
        if (z2) {
            m15188a(jumpLoaderResult, campaignEx, true);
            if (this.f15041i != null) {
                this.f15041i.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else {
            m15188a(jumpLoaderResult, campaignEx, true);
            if (this.f15041i != null && z) {
                this.f15041i.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m15198a(CampaignEx campaignEx, CommonJumpLoader.JumpLoaderResult jumpLoaderResult, boolean z) {
        boolean z2 = false;
        if (z) {
            try {
                C6364t.m16177b(this.f15039g, campaignEx.getClickURL(), this.f15041i);
                z2 = true;
            } catch (Throwable th) {
                C6361q.m16155a("MBridge SDK M", th.getMessage(), th);
            }
        }
        m15188a(jumpLoaderResult, campaignEx, true);
        if (z2) {
            if (this.f15041i != null) {
                this.f15041i.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else if (this.f15041i != null) {
            this.f15041i.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
        }
        return z2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (com.mbridge.msdk.foundation.tools.C6364t.C6365a.m16179a(r2, "market://details?id=" + r7.getPackageName(), r6.f15041i) == false) goto L_0x00b2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m15193a(com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r6.f15046n     // Catch:{ Exception -> 0x0154 }
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            if (r7 == 0) goto L_0x0144
            if (r8 != 0) goto L_0x000c
            goto L_0x0144
        L_0x000c:
            int r1 = r6.m15200b()     // Catch:{ Exception -> 0x0154 }
            int r2 = r8.getCode()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0154 }
            r4 = 2
            r5 = 3
            if (r3 == 0) goto L_0x0052
            if (r9 == 0) goto L_0x0052
            int r10 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            if (r10 != r4) goto L_0x0030
            int r10 = r6.m15200b()     // Catch:{ Exception -> 0x0154 }
            r6.m15199a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9, (int) r10)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x0030:
            if (r10 != r5) goto L_0x0036
            r6.m15198a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x0036:
            android.content.Context r9 = r6.f15039g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r10 = r7.getClickURL()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.foundation.tools.C6364t.m16177b(r9, r10, r1)     // Catch:{ Exception -> 0x0154 }
            r6.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            if (r9 == 0) goto L_0x0051
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r8 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r9.onFinishRedirection(r7, r8)     // Catch:{ Exception -> 0x0154 }
        L_0x0051:
            return
        L_0x0052:
            if (r2 != r0) goto L_0x00cb
            java.lang.String r2 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x0087
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x0087
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x0154 }
            if (r2 == 0) goto L_0x0087
            if (r9 == 0) goto L_0x0087
            android.content.Context r2 = r6.f15039g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            boolean r2 = com.mbridge.msdk.foundation.tools.C6364t.C6365a.m16179a(r2, r3, r4)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x00bb
            goto L_0x00b2
        L_0x0087:
            if (r9 == 0) goto L_0x00bb
            java.lang.String r2 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x00b2
            android.content.Context r2 = r6.f15039g     // Catch:{ Exception -> 0x0154 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
            r3.<init>()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = "market://details?id="
            r3.append(r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            r3.append(r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            boolean r2 = com.mbridge.msdk.foundation.tools.C6364t.C6365a.m16179a(r2, r3, r4)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x00bb
        L_0x00b2:
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            r6.m15184a((int) r1, (java.lang.String) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r3)     // Catch:{ Exception -> 0x0154 }
        L_0x00bb:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x011c
            if (r9 == 0) goto L_0x011c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r1.onFinishRedirection(r7, r2)     // Catch:{ Exception -> 0x0154 }
            goto L_0x011c
        L_0x00cb:
            if (r2 != r5) goto L_0x00ea
            if (r9 == 0) goto L_0x00da
            android.content.Context r1 = r6.f15039g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.foundation.tools.C6364t.m16177b(r1, r2, r3)     // Catch:{ Exception -> 0x0154 }
        L_0x00da:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x011c
            if (r9 == 0) goto L_0x011c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r1.onFinishRedirection(r7, r2)     // Catch:{ Exception -> 0x0154 }
            goto L_0x011c
        L_0x00ea:
            if (r9 == 0) goto L_0x011c
            int r1 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            if (r5 != r1) goto L_0x00f6
            r6.m15198a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x00f6:
            int r1 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            if (r4 != r1) goto L_0x0104
            int r10 = r6.m15200b()     // Catch:{ Exception -> 0x0154 }
            r6.m15199a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9, (int) r10)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x0104:
            android.content.Context r1 = r6.f15039g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.foundation.tools.C6364t.m16177b(r1, r2, r3)     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x011c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r1.onFinishRedirection(r7, r2)     // Catch:{ Exception -> 0x0154 }
        L_0x011c:
            int r1 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            boolean r1 = r6.m15196a((int) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x012f
            r0 = 0
            r6.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0132
        L_0x012f:
            r6.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
        L_0x0132:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x0158
            if (r9 != 0) goto L_0x0158
            if (r10 == 0) goto L_0x0158
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r8 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r9.onFinishRedirection(r7, r8)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0158
        L_0x0144:
            if (r9 == 0) goto L_0x0153
            r6.m15188a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r7 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            if (r7 == 0) goto L_0x0153
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r7 = r6.f15041i     // Catch:{ Exception -> 0x0154 }
            r8 = 0
            r7.onRedirectionFailed(r8, r8)     // Catch:{ Exception -> 0x0154 }
        L_0x0153:
            return
        L_0x0154:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6097a.m15193a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult, boolean, boolean):void");
    }

    /* renamed from: b */
    private int m15200b() {
        try {
            if (this.f15043k != null) {
                return this.f15043k.mo42722n();
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x0014;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15196a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L_0x000c
            boolean r4 = com.mbridge.msdk.foundation.tools.C6364t.C6365a.m16180a((java.lang.String) r5)     // Catch:{ Exception -> 0x0016 }
            if (r4 == 0) goto L_0x0013
            goto L_0x0014
        L_0x000c:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0016 }
            if (r4 != 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            r2 = r1
            goto L_0x001a
        L_0x0016:
            r4 = move-exception
            r4.printStackTrace()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6097a.m15196a(int, java.lang.String):boolean");
    }

    /* renamed from: a */
    static /* synthetic */ void m15190a(C6097a aVar, CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(aVar.f15039g, LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            aVar.f15039g.startActivity(intent);
        } catch (Exception e) {
            C6361q.m16155a("MBridge SDK M", "Exception", e);
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m15206f(C6097a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            aVar.f15039g.sendBroadcast(intent);
        } catch (Exception e) {
            C6361q.m16155a("MBridge SDK M", "Exception", e);
        }
    }
}
