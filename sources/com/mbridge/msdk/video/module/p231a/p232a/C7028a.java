package com.mbridge.msdk.video.module.p231a.p232a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6361q;

/* renamed from: com.mbridge.msdk.video.module.a.a.a */
/* compiled from: CommonContainerNotifyListener */
public class C7028a extends C7033f {

    /* renamed from: a */
    private Activity f17498a;

    /* renamed from: b */
    private CampaignEx f17499b;

    public C7028a(Activity activity, CampaignEx campaignEx) {
        this.f17498a = activity;
        this.f17499b = campaignEx;
    }

    /* renamed from: a */
    public void mo48315a(int i, Object obj) {
        super.mo48315a(i, obj);
        if (i == 106 && this.f17498a != null && this.f17499b != null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String a = C6103b.m15223a(this.f17499b.getClickURL(), "-999", "-999");
                if (!TextUtils.isEmpty(a)) {
                    intent.setData(Uri.parse(a));
                    this.f17498a.startActivity(intent);
                }
            } catch (Throwable th) {
                C6361q.m16155a("NotifyListener", th.getMessage(), th);
            }
            this.f17498a.finish();
        }
    }
}
