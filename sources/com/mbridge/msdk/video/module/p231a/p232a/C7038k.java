package com.mbridge.msdk.video.module.p231a.p232a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6195e;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6151i;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.p164db.C6157o;
import com.mbridge.msdk.foundation.p164db.C6158p;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.same.p171f.C6233b;
import com.mbridge.msdk.foundation.same.report.C6305b;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.video.module.p233b.C7047a;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.p236a.C7167a;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import java.io.File;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.module.a.a.k */
/* compiled from: StatisticsOnNotifyListener */
public class C7038k extends C7033f {

    /* renamed from: a */
    protected boolean f17509a;

    /* renamed from: b */
    protected CampaignEx f17510b;

    /* renamed from: c */
    protected boolean f17511c = false;

    /* renamed from: d */
    protected C7180a f17512d;

    /* renamed from: e */
    protected C7170c f17513e;

    /* renamed from: f */
    protected String f17514f;

    /* renamed from: g */
    protected String f17515g;

    /* renamed from: h */
    protected C7027a f17516h = new C7033f();

    /* renamed from: i */
    protected int f17517i = 1;

    /* renamed from: j */
    private boolean f17518j = false;

    /* renamed from: k */
    private boolean f17519k = false;

    /* renamed from: l */
    private boolean f17520l = false;

    public C7038k(CampaignEx campaignEx, C7180a aVar, C7170c cVar, String str, String str2, C7027a aVar2, int i, boolean z) {
        if (!z && campaignEx != null && C6369x.m16236b(str2) && aVar != null && aVar2 != null) {
            this.f17510b = campaignEx;
            this.f17515g = str;
            this.f17514f = str2;
            this.f17512d = aVar;
            this.f17513e = cVar;
            this.f17516h = aVar2;
            this.f17509a = true;
            this.f17517i = i;
            this.f17511c = false;
        } else if (z && campaignEx != null && C6369x.m16236b(str2) && aVar2 != null) {
            this.f17510b = campaignEx;
            this.f17515g = str;
            this.f17514f = str2;
            this.f17512d = aVar;
            this.f17513e = cVar;
            this.f17516h = aVar2;
            this.f17509a = true;
            this.f17517i = i;
            this.f17511c = true;
        }
    }

    /* renamed from: a */
    public void mo48315a(int i, Object obj) {
        super.mo48315a(i, obj);
        this.f17516h.mo48315a(i, obj);
    }

    /* renamed from: a */
    public final void mo48775a(int i) {
        if (this.f17510b == null) {
            return;
        }
        if (i == 1 || i == 2) {
            C7047a.m17786a(C6122a.m15302b().mo42895d(), this.f17510b, i, this.f17517i);
        }
    }

    /* renamed from: a */
    public final void mo48774a() {
        if (this.f17509a && this.f17510b != null) {
            C6203m mVar = new C6203m("2000061", this.f17510b.getId(), this.f17510b.getRequestId(), this.f17510b.getRequestIdNotice(), this.f17514f, C6349m.m16123n(C6122a.m15302b().mo42895d()));
            mVar.mo43718a(this.f17510b.isMraid() ? C6203m.f15357a : C6203m.f15358b);
            C6305b.m15968b(mVar, C6122a.m15302b().mo42895d(), this.f17514f);
        }
    }

    /* renamed from: a */
    public final void mo48776a(int i, String str) {
        if (this.f17510b != null) {
            C6305b.m15970c(new C6203m("2000062", this.f17510b.getId(), this.f17510b.getRequestId(), this.f17510b.getRequestIdNotice(), this.f17514f, C6349m.m16123n(C6122a.m15302b().mo42895d()), i, str), C6122a.m15302b().mo42895d(), this.f17514f);
        }
    }

    /* renamed from: b */
    public final void mo48779b(int i) {
        CampaignEx campaignEx = this.f17510b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i == 1 || i == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i);
                    }
                    noticeUrl = sb.toString();
                } else if (i == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f17510b.setNoticeUrl(noticeUrl);
            }
        }
    }

    /* renamed from: b */
    public final void mo48778b() {
        try {
            if (this.f17509a && this.f17510b != null && C6369x.m16236b(this.f17514f) && C6122a.m15302b().mo42895d() != null) {
                C6151i a = C6151i.m15437a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
                C6195e eVar = new C6195e();
                eVar.mo43622a(System.currentTimeMillis());
                eVar.mo43625b(this.f17514f);
                eVar.mo43623a(this.f17510b.getId());
                a.mo43010a(eVar);
            }
        } catch (Throwable th) {
            C6361q.m16155a("NotifyListener", th.getMessage(), th);
        }
    }

    /* renamed from: c */
    public final void mo48780c() {
        try {
            if (this.f17509a && this.f17510b != null && C6369x.m16236b(this.f17514f)) {
                C7167a.m18072a().mo49068a(this.f17510b, this.f17514f);
            }
            C6233b.m15776a().execute(new Runnable() {
                public final void run() {
                    try {
                        C7167a.m18072a().mo49078c(C7038k.this.f17515g, C7038k.this.f17510b.getAdType());
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    } catch (Throwable th) {
                        C6361q.m16154a("NotifyListener", th.getMessage());
                    }
                }
            });
        } catch (Throwable th) {
            C6361q.m16155a("NotifyListener", th.getMessage(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo48781d() {
        C7180a aVar = this.f17512d;
        if (aVar != null) {
            aVar.mo49183b(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo48782e() {
        String str;
        try {
            if (this.f17510b != null && C6366u.m16221f(this.f17510b.getMof_template_url()) && C6208d.f15418a.containsKey(this.f17510b.getOnlyImpressionURL())) {
                this.f17519k = true;
            } else if (this.f17509a && !TextUtils.isEmpty(this.f17510b.getOnlyImpressionURL()) && C6208d.f15418a != null && !C6208d.f15418a.containsKey(this.f17510b.getOnlyImpressionURL()) && !this.f17519k) {
                C6208d.f15418a.put(this.f17510b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                String onlyImpressionURL = this.f17510b.getOnlyImpressionURL();
                if (this.f17510b.getSpareOfferFlag() == 1) {
                    str = onlyImpressionURL + "&to=1&cbt=" + this.f17510b.getCbt() + "&tmorl=" + this.f17517i;
                } else {
                    str = onlyImpressionURL + "&to=0&cbt=" + this.f17510b.getCbt() + "&tmorl=" + this.f17517i;
                }
                String str2 = str;
                if (!this.f17511c) {
                    C6097a.m15185a(C6122a.m15302b().mo42895d(), this.f17510b, this.f17514f, str2, false, true);
                    mo48780c();
                }
                this.f17519k = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo48783f() {
        String str;
        try {
            if (this.f17509a && !this.f17518j && !TextUtils.isEmpty(this.f17510b.getImpressionURL())) {
                this.f17518j = true;
                String impressionURL = this.f17510b.getImpressionURL();
                if (this.f17510b.getSpareOfferFlag() == 1) {
                    str = impressionURL + "&to=1&cbt=" + this.f17510b.getCbt() + "&tmorl=" + this.f17517i;
                } else {
                    str = impressionURL + "&to=0&cbt=" + this.f17510b.getCbt() + "&tmorl=" + this.f17517i;
                }
                C6097a.m15185a(C6122a.m15302b().mo42895d(), this.f17510b, this.f17514f, str, false, true);
                C7047a.m17785a(C6122a.m15302b().mo42895d(), this.f17510b);
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C6152j.m15441a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d())).mo43016b(C7038k.this.f17510b.getId());
                        } catch (Throwable th) {
                            C6361q.m16155a("NotifyListener", th.getMessage(), th);
                        }
                    }
                }).start();
                if (this.f17509a && C6208d.f15421d != null && !TextUtils.isEmpty(this.f17510b.getId())) {
                    C6208d.m15706b(this.f17514f, this.f17510b, "reward");
                }
            }
        } catch (Throwable th) {
            C6361q.m16155a("NotifyListener", th.getMessage(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo48784g() {
        List<String> pv_urls;
        try {
            if (this.f17509a && !this.f17520l && this.f17510b != null) {
                this.f17520l = true;
                if (!this.f17511c && !C6366u.m16221f(this.f17510b.getMof_template_url()) && (pv_urls = this.f17510b.getPv_urls()) != null && pv_urls.size() > 0) {
                    for (String a : pv_urls) {
                        C6097a.m15185a(C6122a.m15302b().mo42895d(), this.f17510b, this.f17514f, a, false, true);
                    }
                }
            }
        } catch (Throwable th) {
            C6361q.m16158d("NotifyListener", th.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo48785h() {
        try {
            if (this.f17509a && this.f17512d != null) {
                if (this.f17512d.mo49191g() != null && !TextUtils.isEmpty(this.f17512d.mo49191g().getVideoUrlEncode())) {
                    C6157o.m15466a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d())).mo43037b(this.f17512d.mo49191g().getVideoUrlEncode());
                }
                if (!TextUtils.isEmpty(this.f17512d.mo49187d())) {
                    File file = new File(this.f17512d.mo49187d());
                    if (file.exists() && file.isFile() && file.delete()) {
                        C6361q.m16154a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48777a(String str) {
        try {
            if (this.f17509a) {
                C6158p a = C6158p.m15475a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
                C6203m mVar = null;
                if (!TextUtils.isEmpty(this.f17510b.getNoticeUrl())) {
                    int n = C6349m.m16123n(C6122a.m15302b().mo42895d());
                    mVar = new C6203m("2000021", n, this.f17510b.getNoticeUrl(), str, C6349m.m16092a(C6122a.m15302b().mo42895d(), n));
                } else if (!TextUtils.isEmpty(this.f17510b.getClickURL())) {
                    int n2 = C6349m.m16123n(C6122a.m15302b().mo42895d());
                    mVar = new C6203m("2000021", n2, this.f17510b.getClickURL(), str, C6349m.m16092a(C6122a.m15302b().mo42895d(), n2));
                }
                if (mVar != null) {
                    mVar.mo43747n(this.f17510b.getId());
                    mVar.mo43729e(this.f17510b.getVideoUrlEncode());
                    mVar.mo43751p(str);
                    mVar.mo43741k(this.f17510b.getRequestId());
                    mVar.mo43743l(this.f17510b.getRequestIdNotice());
                    mVar.mo43745m(this.f17514f);
                    a.mo43039a(mVar);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
