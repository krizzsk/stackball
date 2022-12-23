package com.mbridge.msdk.interstitial.p191b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6143d;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.tools.C6361q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.interstitial.b.a */
/* compiled from: InterstitialCamapignCache */
public class C6433a {

    /* renamed from: a */
    private static final String f16013a = C6433a.class.getName();

    /* renamed from: c */
    private static C6433a f16014c = null;

    /* renamed from: b */
    private C6143d f16015b;

    private C6433a() {
        try {
            Context d = C6122a.m15302b().mo42895d();
            if (d != null) {
                this.f16015b = C6143d.m15367a((C6146e) C6148f.m15420a(d));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C6433a m16445a() {
        C6433a aVar;
        synchronized (C6433a.class) {
            if (f16014c == null) {
                f16014c = new C6433a();
            }
            aVar = f16014c;
        }
        return aVar;
    }

    /* renamed from: a */
    public final List<CampaignEx> mo44149a(String str, int i) {
        List<CampaignEx> a;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (a = this.f16015b.mo42954a(str, i, 0, 1)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx add : a) {
                    arrayList2.add(add);
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo44151a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    this.f16015b.mo42965a(campaignEx.getId(), str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo44152a(List<CampaignEx> list, String str) {
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx a : list) {
                mo44151a(a, str);
            }
        }
    }

    /* renamed from: b */
    public final void mo44153b(CampaignEx campaignEx, String str) {
        try {
            if (this.f16015b != null && campaignEx != null && !TextUtils.isEmpty(str)) {
                this.f16015b.mo42953a(campaignEx, str, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void mo44150a(long j, String str) {
        try {
            if (!(this.f16015b == null || j == 0 || TextUtils.isEmpty(str))) {
                this.f16015b.mo42979b(j, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C6361q.m16158d(f16013a, e.getMessage());
        }
        return;
    }
}
