package com.mbridge.msdk.video.module.p231a.p232a;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.video.module.p233b.C7047a;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.p237b.C7170c;

/* renamed from: com.mbridge.msdk.video.module.a.a.d */
/* compiled from: ContainerViewStatisticsListener */
public class C7031d extends C7038k {
    public C7031d(CampaignEx campaignEx, C7180a aVar, C7170c cVar, String str, String str2, C7027a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
    }

    /* renamed from: a */
    public void mo48315a(int i, Object obj) {
        super.mo48315a(i, obj);
        if (!this.f17509a) {
            return;
        }
        if (i == 105 || i == 106 || i == 113) {
            C7047a.m17795d(C6122a.m15302b().mo42895d(), this.f17510b);
            if (i != 105) {
                String noticeUrl = this.f17510b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (!noticeUrl.contains(C6204a.f15398h)) {
                        noticeUrl = noticeUrl + "&" + C6204a.f15398h + "=2";
                    } else {
                        noticeUrl = noticeUrl.replace(C6204a.f15398h + "=" + Uri.parse(noticeUrl).getQueryParameter(C6204a.f15398h), C6204a.f15398h + "=2");
                    }
                }
                C6097a.m15185a(C6122a.m15302b().mo42895d(), this.f17510b, this.f17514f, noticeUrl, true, false);
            }
        } else if (i != 122) {
            switch (i) {
                case 109:
                    mo48779b(2);
                    mo48775a(2);
                    return;
                case 110:
                    mo48779b(1);
                    mo48775a(1);
                    return;
                case 111:
                    mo48775a(1);
                    return;
                default:
                    return;
            }
        } else {
            mo48774a();
        }
    }
}
