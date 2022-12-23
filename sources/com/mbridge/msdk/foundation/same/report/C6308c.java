package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.controller.C6130b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a;
import com.mbridge.msdk.foundation.entity.C6193c;
import com.mbridge.msdk.foundation.entity.C6201k;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6155m;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.same.report.p183d.C6327b;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.vungle.warren.VungleApiClient;
import java.io.File;
import java.net.URLEncoder;

/* renamed from: com.mbridge.msdk.foundation.same.report.c */
/* compiled from: ReportController */
public class C6308c {

    /* renamed from: a */
    public static final String f15673a = C6308c.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f15674b;

    /* renamed from: c */
    private int f15675c = 0;

    public C6308c(Context context, int i) {
        this.f15674b = context;
        this.f15675c = i;
    }

    public C6308c(Context context) {
        this.f15674b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo43926a(int i, String str) {
        new C6326a(this.f15674b).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16028a("event", C6323d.m16029a((Campaign) null, i, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID), this.f15674b, str), new C6327b() {
            /* renamed from: a */
            public final void mo43811a(String str) {
            }

            /* renamed from: b */
            public final void mo43812b(String str) {
            }
        });
    }

    /* renamed from: a */
    public final void mo43927a(final C6201k kVar, final Boolean bool) {
        if (kVar == null) {
            return;
        }
        if (kVar.mo43704c().equals("GET")) {
            new C6326a(this.f15674b).mo43864a(0, kVar.mo43703b(), (C6287d) null, new C6327b() {
                /* renamed from: b */
                public final void mo43812b(String str) {
                }

                /* renamed from: a */
                public final void mo43811a(String str) {
                    C6155m.m15456a((C6146e) C6148f.m15420a(C6308c.this.f15674b)).mo43024a(kVar.mo43703b());
                    if (bool.booleanValue() && C6155m.m15456a((C6146e) C6148f.m15420a(C6308c.this.f15674b)).mo43027b() > 20) {
                        C6130b.m15341a().mo42931c();
                    }
                }
            });
        } else if (kVar.mo43704c().equals("POST")) {
            C6326a aVar = new C6326a(this.f15674b);
            if (!TextUtils.isEmpty(kVar.mo43705d())) {
                aVar.mo43867c(1, kVar.mo43703b(), C6323d.m16027a(kVar.mo43705d(), this.f15674b, kVar.mo43702a()), new C6327b() {
                    /* renamed from: b */
                    public final void mo43812b(String str) {
                    }

                    /* renamed from: a */
                    public final void mo43811a(String str) {
                        C6155m.m15456a((C6146e) C6148f.m15420a(C6308c.this.f15674b)).mo43025a(kVar.mo43705d(), kVar.mo43703b());
                        if (bool.booleanValue() && C6155m.m15456a((C6146e) C6148f.m15420a(C6308c.this.f15674b)).mo43027b() > 20) {
                            C6130b.m15341a().mo42931c();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo43931a(String str, String str2, String str3) {
        try {
            C6326a aVar = new C6326a(this.f15674b);
            String str4 = "click_type=" + URLEncoder.encode("1", "utf-8") + "&" + BidResponsedEx.KEY_CID + "=" + URLEncoder.encode(str, "utf-8") + "&" + MBridgeConstans.PROPERTIES_UNIT_ID + "=" + URLEncoder.encode(str2, "utf-8") + "&" + SDKConstants.PARAM_KEY + "=" + URLEncoder.encode("2000027", "utf-8") + "&" + "http_url" + "=" + URLEncoder.encode(str3, "utf-8");
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(str4);
                return;
            }
            aVar.mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(str4, this.f15674b, str2), new C6327b() {
                /* renamed from: a */
                public final void mo43811a(String str) {
                }

                /* renamed from: b */
                public final void mo43812b(String str) {
                }
            });
        } catch (Exception e) {
            C6361q.m16158d(f15673a, e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo43929a(String str, final File file) {
        new C6326a(this.f15674b).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16025a(this.f15674b, str), new C6327b() {
            /* renamed from: b */
            public final void mo43812b(String str) {
            }

            /* renamed from: a */
            public final void mo43811a(String str) {
                File file = file;
                if (file != null) {
                    file.delete();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo43932a(final String str, String str2, String str3, Frame frame) {
        C6326a aVar = new C6326a(this.f15674b);
        C6287d a = C6323d.m16027a(str2, this.f15674b, str3);
        if (frame != null) {
            a.mo43870a("session_id", frame.getSessionId());
            a.mo43870a(CampaignUnit.JSON_KEY_PARENT_SESSION_ID, frame.getParentSessionId());
        }
        aVar.mo43867c(0, C6280d.m15868c().f15565a, a, new C6327b() {
            /* renamed from: b */
            public final void mo43812b(String str) {
            }

            /* renamed from: a */
            public final void mo43811a(String str) {
                if ("click_duration".equals(str) || "load_duration".equals(str)) {
                    C6130b.m15341a().mo42931c();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo43928a(String str, C6193c cVar, String str2) {
        C6326a aVar = new C6326a(this.f15674b);
        String a = C6193c.m15508a(cVar);
        if (!TextUtils.isEmpty(a)) {
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(a);
                return;
            }
            aVar.mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(a, this.f15674b, str2), new C6327b() {
                /* renamed from: a */
                public final void mo43811a(String str) {
                }

                /* renamed from: b */
                public final void mo43812b(String str) {
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo43924a() {
        try {
            if (C6323d.m16041a()) {
                C6326a aVar = new C6326a(this.f15674b);
                String e = C6122a.m15302b().mo42896e();
                C6072a b = C6076b.m15089a().mo42749b(e);
                if (b == null) {
                    b = C6076b.m15089a().mo42748b();
                }
                int k = b.mo42716k();
                String str = "key=2000053&Appid=" + e + "&" + "uptips2" + "=" + b.mo42714j() + "&" + "info_status" + "=" + C6129a.m15330a().mo42925c() + "&" + "iseu" + "=" + k;
                String i = C6349m.m16113i();
                if (!TextUtils.isEmpty(i)) {
                    str = str + "&" + VungleApiClient.GAID + "=" + i;
                }
                String str2 = str + "&" + "GDPR_area" + "=" + b.mo42679X() + "&" + "GDPR_consent" + "=" + C6129a.m15330a().mo42927e();
                if (C6301a.m15945a().mo43913c()) {
                    C6301a.m15945a().mo43911a(str2);
                    return;
                }
                aVar.mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(str2, this.f15674b, ""), new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                    }
                });
                C6323d.m16043b();
            }
        } catch (Throwable th) {
            C6361q.m16158d(f15673a, th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo43925a(int i, int i2, String str, String str2, String str3) {
        try {
            C6326a aVar = new C6326a(this.f15674b);
            StringBuilder sb = new StringBuilder();
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000058", "utf-8"));
            sb.append("&");
            sb.append(AppsFlyerProperties.APP_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(C6122a.m15302b().mo42896e(), "utf-8"));
            sb.append("&");
            sb.append("dl_type");
            sb.append("=");
            sb.append(URLEncoder.encode(i + "", "utf-8"));
            sb.append("&");
            sb.append("dl_link_type");
            sb.append("=");
            sb.append(URLEncoder.encode(i2 + "", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append("tgt_v");
            sb.append("=");
            sb.append(URLEncoder.encode(C6349m.m16109g(this.f15674b) + "", "utf-8"));
            sb.append("&");
            sb.append("app_v_n");
            sb.append("=");
            sb.append(URLEncoder.encode(C6349m.m16107f(this.f15674b) + "", "utf-8"));
            sb.append("&");
            sb.append("app_v_c");
            sb.append("=");
            sb.append(URLEncoder.encode(C6349m.m16104e(this.f15674b) + "", "utf-8"));
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(sb.toString());
                return;
            }
            aVar.mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(sb.toString(), this.f15674b, ""), new C6327b() {
                /* renamed from: a */
                public final void mo43811a(String str) {
                }

                /* renamed from: b */
                public final void mo43812b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo43934a(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            if (!TextUtils.isEmpty(str5)) {
                C6326a aVar = new C6326a(this.f15674b);
                StringBuilder sb = new StringBuilder();
                if (z) {
                    sb.append("hb=");
                    sb.append(1);
                    sb.append("&");
                }
                sb.append(SDKConstants.PARAM_KEY);
                sb.append("=");
                sb.append(URLEncoder.encode("2000066", "utf-8"));
                sb.append("&");
                sb.append("rid");
                sb.append("=");
                sb.append(URLEncoder.encode(str, "utf-8"));
                sb.append("&");
                sb.append("rid_n");
                sb.append("=");
                sb.append(URLEncoder.encode(str2, "utf-8"));
                sb.append("&");
                sb.append(BidResponsedEx.KEY_CID);
                sb.append("=");
                sb.append(URLEncoder.encode(str3, "utf-8"));
                sb.append("&");
                sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
                sb.append("=");
                sb.append(URLEncoder.encode(str4, "utf-8"));
                sb.append("&");
                sb.append("err_method");
                sb.append("=");
                sb.append(str5);
                if (C6301a.m15945a().mo43913c()) {
                    C6301a.m15945a().mo43911a(sb.toString());
                    return;
                }
                aVar.mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(sb.toString(), this.f15674b, str4), new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo43935b(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            C6326a aVar = new C6326a(this.f15674b);
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("hb=");
                sb.append(1);
                sb.append("&");
            }
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000065", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str4, "utf-8"));
            sb.append("&");
            sb.append("click_url");
            sb.append("=");
            sb.append(URLEncoder.encode(str5, "utf-8"));
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(sb.toString());
                return;
            }
            aVar.mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(sb.toString(), this.f15674b, str4), new C6327b() {
                /* renamed from: a */
                public final void mo43811a(String str) {
                }

                /* renamed from: b */
                public final void mo43812b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo43933a(String str, String str2, String str3, String str4, String str5) {
        try {
            C6326a aVar = new C6326a(this.f15674b);
            StringBuilder sb = new StringBuilder();
            int n = C6349m.m16123n(this.f15674b);
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000071", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str4, "utf-8"));
            sb.append("&");
            sb.append(IronSourceConstants.EVENTS_ERROR_REASON);
            sb.append("=");
            sb.append(URLEncoder.encode(str5, "utf-8"));
            sb.append("&");
            sb.append("network_type");
            sb.append("=");
            sb.append(URLEncoder.encode(n + "", "utf-8"));
            sb.append("&");
            sb.append(IronSourceConstants.EVENTS_RESULT);
            sb.append("=");
            sb.append(URLEncoder.encode(AppEventsConstants.EVENT_PARAM_VALUE_NO, "utf-8"));
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(sb.toString());
                return;
            }
            aVar.mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(sb.toString(), this.f15674b, str4), new C6327b() {
                /* renamed from: a */
                public final void mo43811a(String str) {
                }

                /* renamed from: b */
                public final void mo43812b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo43930a(String str, String str2) {
        try {
            C6326a aVar = new C6326a(this.f15674b);
            String e = C6122a.m15302b().mo42896e();
            if (C6076b.m15089a().mo42749b(e) == null) {
                C6076b.m15089a().mo42748b();
            }
            String str3 = "key=2000000&Appid=" + e + "&" + IronSourceConstants.EVENTS_ERROR_REASON + "=" + str + "&" + "host" + "=" + str2;
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(str3);
                return;
            }
            aVar.mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(str3, this.f15674b, ""), new C6327b() {
                /* renamed from: a */
                public final void mo43811a(String str) {
                    C6361q.m16154a("", "reportSettingLoadFailed onSuccess");
                }

                /* renamed from: b */
                public final void mo43812b(String str) {
                    C6361q.m16154a("", "reportSettingLoadFailed onFailed:" + str);
                }
            });
        } catch (Throwable unused) {
            C6361q.m16158d(f15673a, "reportSettingLoadFailed onFailed");
        }
    }
}
