package com.mbridge.msdk.interactiveads.p184a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6143d;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.videocommon.download.C7191g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.interactiveads.a.b */
/* compiled from: LoadLogicManager */
public class C6396b {

    /* renamed from: a */
    private static volatile C6396b f15902a;

    /* renamed from: b */
    private WeakReference<Context> f15903b;

    private C6396b(Context context) {
        this.f15903b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static C6396b m16300a(Context context) {
        if (f15902a == null) {
            synchronized (C6396b.class) {
                if (f15902a == null) {
                    f15902a = new C6396b(context);
                }
            }
        }
        return f15902a;
    }

    /* renamed from: a */
    public final List<CampaignEx> mo44024a(String str) {
        List<CampaignEx> c = m16301c(str);
        ArrayList arrayList = new ArrayList();
        if (c != null && c.size() > 0) {
            for (CampaignEx next : c) {
                if (next.getInteractiveCache().equals("onelevel")) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo44025a(List<CampaignEx> list) {
        for (CampaignEx next : list) {
            boolean z = next.getIsDownLoadZip() == 1;
            boolean isEmpty = TextUtils.isEmpty(C7191g.m18286a().mo49220b(next.getKeyIaUrl()));
            if (z) {
                if (isEmpty) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final List<CampaignEx> mo44026b(String str) {
        List<CampaignEx> c = m16301c(str);
        ArrayList arrayList = new ArrayList();
        if (c != null && c.size() > 0) {
            for (CampaignEx next : c) {
                if (!TextUtils.isEmpty(next.getInteractiveCache()) && next.getInteractiveCache().equals("twolevel")) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private List<CampaignEx> m16301c(String str) {
        List<CampaignEx> g;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (g = C6143d.m15367a((C6146e) C6148f.m15420a((Context) this.f15903b.get())).mo42992g(str)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : g) {
                    if (next != null) {
                        arrayList2.add(next);
                    }
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
}
