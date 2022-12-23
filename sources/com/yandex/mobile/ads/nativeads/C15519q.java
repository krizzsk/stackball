package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.yandex.mobile.ads.impl.C13690k9;
import com.yandex.mobile.ads.impl.C14589sf;
import com.yandex.mobile.ads.impl.dm0;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.hd0;
import com.yandex.mobile.ads.impl.pd0;
import com.yandex.mobile.ads.impl.pq0;
import com.yandex.mobile.ads.impl.uu0;
import com.yandex.mobile.ads.impl.xc0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.yandex.mobile.ads.nativeads.q */
public class C15519q {

    /* renamed from: a */
    private final pq0 f43933a;

    /* renamed from: b */
    private final ed0 f43934b;

    /* renamed from: c */
    private final xc0 f43935c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final uu0 f43936d;

    /* renamed from: e */
    private final C15522r f43937e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Set<NativeAdImageLoadingListener> f43938f = new CopyOnWriteArraySet();

    /* renamed from: com.yandex.mobile.ads.nativeads.q$a */
    class C15520a implements pd0 {
        C15520a() {
        }

        /* renamed from: a */
        public void mo66874a(Map<String, Bitmap> map) {
            C15519q.this.f43936d.mo70408a();
            for (NativeAdImageLoadingListener nativeAdImageLoadingListener : C15519q.this.f43938f) {
                if (nativeAdImageLoadingListener != null) {
                    nativeAdImageLoadingListener.onFinishLoadingImages();
                }
            }
        }
    }

    public C15519q(Context context, pq0 pq0, ed0 ed0, uu0 uu0) {
        this.f43933a = pq0;
        this.f43934b = ed0;
        this.f43936d = uu0;
        this.f43937e = new C15522r();
        this.f43935c = new xc0(context);
    }

    /* renamed from: c */
    public String mo71738c() {
        return this.f43933a.mo69413d();
    }

    /* renamed from: d */
    public void mo71739d() {
        this.f43935c.mo70873a(this.f43935c.mo70871a((List<pq0>) Collections.singletonList(this.f43933a)), new C15520a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71735a(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f43938f.add(nativeAdImageLoadingListener);
    }

    /* renamed from: b */
    public C15511m0 mo71736b() {
        return this.f43933a.mo69419g();
    }

    /* renamed from: a */
    public NativeAdAssets mo71734a() {
        C15484e eVar = new C15484e();
        List<C13690k9> b = this.f43933a.mo69407b();
        HashMap hashMap = new HashMap();
        for (C13690k9 next : b) {
            hashMap.put(next.mo68167b(), next);
        }
        dm0 dm0 = (dm0) m45234a((C13690k9) hashMap.get("media"));
        eVar.mo71501a((String) m45234a((C13690k9) hashMap.get("age")));
        eVar.mo71504b((String) m45234a((C13690k9) hashMap.get("body")));
        eVar.mo71502a(m45234a((C13690k9) hashMap.get("feedback")) != null);
        eVar.mo71506c((String) m45234a((C13690k9) hashMap.get("call_to_action")));
        eVar.mo71656a((C14589sf) m45234a((C13690k9) hashMap.get("close_button")));
        eVar.mo71508d((String) m45234a((C13690k9) hashMap.get("domain")));
        eVar.mo71503b((hd0) m45234a((C13690k9) hashMap.get("favicon")), this.f43934b);
        eVar.mo71505c((hd0) m45234a((C13690k9) hashMap.get(RewardPlus.ICON)), this.f43934b);
        hd0 hd0 = null;
        List<hd0> a = dm0 != null ? dm0.mo66637a() : null;
        if (a != null && !a.isEmpty()) {
            hd0 = a.get(0);
        }
        eVar.mo71507d(hd0, this.f43934b);
        eVar.mo71500a(this.f43937e.mo71740a(dm0));
        eVar.mo71509e((String) m45234a((C13690k9) hashMap.get("price")));
        eVar.mo71511f((String) m45234a((C13690k9) hashMap.get(CampaignEx.JSON_KEY_STAR)));
        eVar.mo71512g((String) m45234a((C13690k9) hashMap.get("review_count")));
        eVar.mo71527h((String) m45234a((C13690k9) hashMap.get("sponsored")));
        eVar.mo71529i((String) m45234a((C13690k9) hashMap.get("title")));
        eVar.mo71531j((String) m45234a((C13690k9) hashMap.get("warning")));
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo71737b(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f43938f.remove(nativeAdImageLoadingListener);
    }

    /* renamed from: a */
    static <T> T m45234a(C13690k9<T> k9Var) {
        if (k9Var != null) {
            return k9Var.mo68169d();
        }
        return null;
    }
}
