package com.mbridge.msdk.video.module.p231a.p232a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.p237b.C7170c;

/* renamed from: com.mbridge.msdk.video.module.a.a.h */
/* compiled from: PlayableStatisticsOnNotifyListener */
public final class C7035h extends C7038k {
    public C7035h(CampaignEx campaignEx, C7180a aVar, C7170c cVar, String str, String str2, C7027a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
    }

    /* renamed from: a */
    public final void mo48315a(int i, Object obj) {
        if (i == 100) {
            mo48784g();
            mo48783f();
            mo48782e();
            mo48775a(2);
        } else if (i == 109) {
            mo48779b(2);
        } else if (i != 122) {
            String str = "";
            if (i == 118) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                mo48776a(3, str);
            } else if (i == 119) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                mo48776a(4, str);
            }
        } else {
            mo48774a();
        }
        super.mo48315a(i, obj);
    }
}
