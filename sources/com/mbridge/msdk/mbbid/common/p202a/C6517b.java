package com.mbridge.msdk.mbbid.common.p202a;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.common.p203b.C6520a;
import com.mbridge.msdk.mbbid.common.p204c.C6522a;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.mbbid.common.a.b */
/* compiled from: RequesManager */
public final class C6517b {

    /* renamed from: a */
    private String f16256a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f16257b;

    /* renamed from: c */
    private String f16258c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f16259d;

    /* renamed from: e */
    private BidListennning f16260e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public BidResponsedEx f16261f;

    /* renamed from: g */
    private int f16262g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f16263h = false;

    /* renamed from: i */
    private long f16264i;

    /* renamed from: j */
    private long f16265j;

    /* renamed from: k */
    private boolean f16266k;

    /* renamed from: l */
    private int f16267l;

    /* renamed from: a */
    public final void mo44364a(boolean z) {
        this.f16266k = z;
    }

    /* renamed from: a */
    public final void mo44361a(int i) {
        this.f16267l = i;
    }

    /* renamed from: b */
    public final void mo44365b(int i) {
        this.f16262g = i;
    }

    /* renamed from: a */
    public final void mo44362a(long j) {
        this.f16264i = j;
    }

    /* renamed from: b */
    public final void mo44366b(long j) {
        this.f16265j = j;
    }

    public C6517b(String str, String str2, String str3) {
        this.f16256a = str;
        this.f16257b = str2;
        this.f16258c = str3;
        this.f16259d = C6122a.m15302b().mo42895d();
    }

    /* renamed from: b */
    public final void mo44367b(boolean z) {
        try {
            if (!this.f16263h) {
                this.f16263h = true;
                if (this.f16259d == null) {
                    m16745a("context is null");
                }
                C6520a aVar = new C6520a(this.f16259d);
                C6287d dVar = new C6287d();
                String e = C6122a.m15302b().mo42896e();
                dVar.mo43870a("app_id", e);
                dVar.mo43870a("sign", SameMD5.getMD5(e + C6122a.m15302b().mo42897f()));
                dVar.mo43870a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16257b);
                if (!TextUtils.isEmpty(this.f16256a)) {
                    dVar.mo43870a(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, this.f16256a);
                }
                dVar.mo43870a("bid_floor", this.f16258c);
                dVar.mo43870a(C6287d.f15600c, C6366u.m16205b(this.f16259d, this.f16257b));
                dVar.mo43870a(C6287d.f15599b, C6208d.m15701a(this.f16257b, ""));
                String str = "1";
                dVar.mo43870a("req_type", this.f16266k ? str : "2");
                dVar.mo43870a("orientation", C6349m.m16102d(this.f16259d) + "");
                if (this.f16262g == 296) {
                    if (this.f16264i <= 0 || this.f16265j <= 0) {
                        m16745a("bid required param is missing or error");
                        return;
                    }
                    dVar.mo43870a(CampaignUnit.JSON_KEY_UNIT_SIZE, this.f16265j + "x" + this.f16264i);
                    Method method = Class.forName("com.mbridge.msdk.mbbanner.common.util.BannerUtils").getMethod("getCloseIds", new Class[]{String.class});
                    if (method.invoke((Object) null, new Object[]{this.f16257b}) instanceof String) {
                        dVar.mo43870a("close_id", method.invoke((Object) null, new Object[]{this.f16257b}).toString());
                    }
                } else if (this.f16262g == 297) {
                    if (this.f16264i <= 0 || this.f16265j <= 0) {
                        m16745a("ad display area is too small");
                        return;
                    }
                    dVar.mo43870a(CampaignUnit.JSON_KEY_UNIT_SIZE, this.f16265j + "x" + this.f16264i);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f16267l);
                    sb.append("");
                    dVar.mo43870a("orientation", sb.toString());
                } else if (this.f16262g != 298) {
                    if (!z) {
                        str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                    }
                    dVar.mo43870a("rw_plus", str);
                } else if (this.f16264i <= 0 || this.f16265j <= 0) {
                    m16745a("bid required param is missing or error");
                    return;
                } else {
                    dVar.mo43870a(CampaignUnit.JSON_KEY_UNIT_SIZE, this.f16265j + "x" + this.f16264i);
                }
                C65181 r15 = new C6516a(this.f16256a, this.f16257b) {
                    /* renamed from: a */
                    public final void mo44369a(BidResponsedEx bidResponsedEx) {
                        boolean unused = C6517b.this.f16263h = false;
                        BidResponsedEx unused2 = C6517b.this.f16261f = bidResponsedEx;
                        C6522a.m16763a(C6517b.this.f16259d, C6517b.this.f16257b, bidResponsedEx.getBidId());
                        C6517b.m16743a(C6517b.this, (BidResponsed) bidResponsedEx);
                    }

                    /* renamed from: a */
                    public final void mo44368a(int i, String str) {
                        boolean unused = C6517b.this.f16263h = false;
                        C6522a.m16764b(C6517b.this.f16259d, C6517b.this.f16257b, str);
                        C6517b.this.m16745a(str);
                    }
                };
                r15.f15543d = this.f16257b;
                r15.f15544e = this.f16256a;
                aVar.mo43864a(1, C6280d.m15868c().mo43858a(false, ""), dVar, r15);
                return;
            }
            m16745a("current unit is biding");
        } catch (Exception unused) {
            m16745a("banner module is miss");
        } catch (Throwable th) {
            m16745a(th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo44363a(BidListennning bidListennning) {
        this.f16260e = bidListennning;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16745a(String str) {
        BidListennning bidListennning = this.f16260e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m16743a(C6517b bVar, BidResponsed bidResponsed) {
        BidListennning bidListennning = bVar.f16260e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
