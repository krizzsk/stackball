package com.mbridge.msdk.video.module.p231a.p232a;

import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.video.module.p233b.C7047a;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.download.C7184c;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.module.a.a.o */
/* compiled from: VideoViewStatisticsListener */
public class C7046o extends C7038k {

    /* renamed from: j */
    protected double f17535j = 1.0d;

    /* renamed from: k */
    private boolean f17536k;

    /* renamed from: l */
    private boolean f17537l;

    /* renamed from: m */
    private boolean f17538m;

    /* renamed from: n */
    private boolean f17539n;

    /* renamed from: o */
    private boolean f17540o = false;

    /* renamed from: p */
    private Map<Integer, String> f17541p;

    /* renamed from: q */
    private int f17542q = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7046o(CampaignEx campaignEx, C7170c cVar, C7180a aVar, String str, String str2, C7027a aVar2, double d, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        if (this.f17509a) {
            this.f17541p = campaignEx.getAdvImpList();
        }
        this.f17535j = d;
    }

    /* renamed from: a */
    public void mo48315a(int i, Object obj) {
        int i2;
        if (!(i == 2 || i == 6)) {
            if (i != 7) {
                int i3 = 0;
                if (i == 15) {
                    mo48784g();
                    mo48783f();
                    mo48782e();
                    if (obj == null || !(obj instanceof MBridgeVideoView.C7025a)) {
                        i2 = 0;
                    } else {
                        int i4 = ((MBridgeVideoView.C7025a) obj).f17481a;
                        i3 = ((MBridgeVideoView.C7025a) obj).f17482b;
                        i2 = i4;
                    }
                    if (i3 == 0 && this.f17510b != null) {
                        i3 = this.f17510b.getVideoLength();
                    }
                    C7047a.m17787a(C6122a.m15302b().mo42895d(), this.f17510b, i2, i3, this.f17517i);
                    C7047a.m17790a(this.f17510b, this.f17541p, this.f17514f, i2);
                    if (!this.f17539n) {
                        this.f17539n = true;
                        C7047a.m17789a(this.f17510b, this.f17514f);
                    }
                    if (!this.f17540o && ((double) i2) >= ((double) i3) * this.f17535j) {
                        this.f17540o = true;
                        i = 17;
                    }
                    C6361q.m16158d("NotifyListener", "onPlayProgress:" + i2);
                    this.f17542q = i2;
                } else if (i != 16) {
                    switch (i) {
                        case 11:
                            C7184c.getInstance().mo49211b(false);
                            mo48781d();
                            break;
                        case 12:
                            if (obj != null && (obj instanceof String)) {
                                mo48777a((String) obj);
                            }
                            mo48781d();
                            mo48778b();
                            mo48780c();
                            mo48785h();
                            C7184c.getInstance().mo49211b(false);
                            break;
                        case 13:
                            try {
                                mo48778b();
                                mo48780c();
                                break;
                            } catch (Throwable th) {
                                C6361q.m16155a("NotifyListener", th.getMessage(), th);
                                return;
                            }
                    }
                }
            } else if (this.f17509a && obj != null && (obj instanceof Integer)) {
                int intValue = ((Integer) obj).intValue();
                if (intValue == 2) {
                    if (!this.f17537l) {
                        this.f17537l = true;
                        C7047a.m17793b(C6122a.m15302b().mo42895d(), this.f17510b);
                    }
                } else if (intValue == 1 && !this.f17536k) {
                    this.f17536k = true;
                    C7047a.m17794c(C6122a.m15302b().mo42895d(), this.f17510b);
                }
            }
            this.f17516h.mo48315a(i, obj);
        }
        if (this.f17509a && !this.f17538m) {
            this.f17538m = true;
            mo48781d();
            C7047a.m17796e(C6122a.m15302b().mo42895d(), this.f17510b);
        }
        this.f17516h.mo48315a(i, obj);
    }
}
