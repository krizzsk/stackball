package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.yandex.mobile.ads.impl.C13690k9;
import com.yandex.mobile.ads.impl.C14265p9;
import com.yandex.mobile.ads.impl.C14748u9;
import com.yandex.mobile.ads.impl.C14875v9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.o */
class C15460o {

    /* renamed from: a */
    private final C15443a f43671a;

    /* renamed from: b */
    private final C15446d f43672b;

    /* renamed from: c */
    private final C14265p9 f43673c = new C14265p9();

    /* renamed from: d */
    private final C14875v9 f43674d = new C14875v9();

    C15460o(Context context) {
        C15443a aVar = new C15443a(context, new C15445c());
        this.f43671a = aVar;
        this.f43672b = new C15446d(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C13690k9> mo71467a(MediatedNativeAdAssets mediatedNativeAdAssets, Map<String, Bitmap> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m44983a("age", mediatedNativeAdAssets.getAge()));
        arrayList.add(m44983a("body", mediatedNativeAdAssets.getBody()));
        arrayList.add(m44983a("call_to_action", mediatedNativeAdAssets.getCallToAction()));
        arrayList.add(m44983a("domain", mediatedNativeAdAssets.getDomain()));
        arrayList.add(m44983a("favicon", this.f43671a.mo71455a(map, mediatedNativeAdAssets.getFavicon())));
        arrayList.add(m44983a(RewardPlus.ICON, this.f43671a.mo71455a(map, mediatedNativeAdAssets.getIcon())));
        arrayList.add(m44983a("media", this.f43672b.mo71457a(map, mediatedNativeAdAssets.getImage(), mediatedNativeAdAssets.getMedia())));
        arrayList.add(m44983a("price", mediatedNativeAdAssets.getPrice()));
        String valueOf = String.valueOf(mediatedNativeAdAssets.getRating());
        arrayList.add(this.f43674d.mo70458a(CampaignEx.JSON_KEY_STAR).mo68251a(valueOf) ? this.f43673c.mo69335a(CampaignEx.JSON_KEY_STAR).mo67775a(CampaignEx.JSON_KEY_STAR, valueOf) : null);
        arrayList.add(m44983a("review_count", mediatedNativeAdAssets.getReviewCount()));
        arrayList.add(m44983a("sponsored", mediatedNativeAdAssets.getSponsored()));
        arrayList.add(m44983a("title", mediatedNativeAdAssets.getTitle()));
        arrayList.add(m44983a("warning", mediatedNativeAdAssets.getWarning()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13690k9 k9Var = (C13690k9) it.next();
            if (k9Var != null) {
                arrayList2.add(k9Var);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    private <T> C13690k9 m44983a(String str, T t) {
        C14748u9 a = this.f43674d.mo70458a(str);
        if (t == null || !a.mo68251a(t)) {
            return null;
        }
        return this.f43673c.mo69335a(str).mo67775a(str, t);
    }
}
