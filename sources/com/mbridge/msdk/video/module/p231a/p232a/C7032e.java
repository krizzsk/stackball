package com.mbridge.msdk.video.module.p231a.p232a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6158p;
import com.mbridge.msdk.foundation.same.p168c.C6219c;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;

/* renamed from: com.mbridge.msdk.video.module.a.a.e */
/* compiled from: DefaultImageLoaderListener */
public class C7032e implements C6219c {

    /* renamed from: a */
    private CampaignEx f17503a;

    /* renamed from: b */
    protected ImageView f17504b;

    /* renamed from: c */
    private String f17505c;

    public C7032e(ImageView imageView) {
        this.f17504b = imageView;
    }

    public C7032e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f17504b = imageView;
        this.f17503a = campaignEx;
        this.f17505c = str;
    }

    public void onSuccessLoad(Bitmap bitmap, String str) {
        if (bitmap == null) {
            try {
                C6361q.m16158d("ImageLoaderListener", "bitmap=null");
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        } else if (this.f17504b != null && !bitmap.isRecycled()) {
            this.f17504b.setImageBitmap(bitmap);
            this.f17504b.setVisibility(0);
        }
    }

    public void onFailedLoad(String str, String str2) {
        try {
            C6158p a = C6158p.m15475a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
            if (this.f17503a == null) {
                C6361q.m16154a("ImageLoaderListener", "campaign is null");
                return;
            }
            C6203m mVar = new C6203m();
            mVar.mo43749o("2000044");
            mVar.mo43721b(C6349m.m16123n(C6122a.m15302b().mo42895d()));
            mVar.mo43747n(this.f17503a.getId());
            mVar.mo43727d(this.f17503a.getImageUrl());
            mVar.mo43741k(this.f17503a.getRequestId());
            mVar.mo43743l(this.f17503a.getRequestIdNotice());
            mVar.mo43745m(this.f17505c);
            mVar.mo43751p(str);
            a.mo43039a(mVar);
            C6361q.m16158d("ImageLoaderListener", "desc:" + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
