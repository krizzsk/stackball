package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.yandex.mobile.ads.nativeads.C15471a0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.n9 */
public class C14063n9 {

    /* renamed from: a */
    private final C13961m9 f37677a;

    /* renamed from: b */
    private final C15471a0 f37678b;

    public C14063n9(C15471a0 a0Var, ed0 ed0, hm0 hm0, ht0 ht0) {
        this.f37678b = a0Var;
        this.f37677a = new C13961m9(ed0, hm0, ht0);
    }

    /* renamed from: a */
    public Map<String, C13838l9> mo68935a() {
        HashMap hashMap = new HashMap();
        hashMap.put("age", this.f37677a.mo68621a(this.f37678b.mo71620a()));
        hashMap.put("body", this.f37677a.mo68621a(this.f37678b.mo71621b()));
        hashMap.put("call_to_action", this.f37677a.mo68621a(this.f37678b.mo71622c()));
        C13961m9 m9Var = this.f37677a;
        TextView d = this.f37678b.mo71623d();
        m9Var.getClass();
        C15254yj yjVar = null;
        C14754uf ufVar = d != null ? new C14754uf(d) : null;
        hashMap.put("close_button", ufVar != null ? new C15254yj(ufVar) : null);
        hashMap.put("domain", this.f37677a.mo68621a(this.f37678b.mo71624e()));
        hashMap.put("favicon", this.f37677a.mo68622b(this.f37678b.mo71625f()));
        hashMap.put("feedback", this.f37677a.mo68619a(this.f37678b.mo71626g()));
        hashMap.put(RewardPlus.ICON, this.f37677a.mo68622b(this.f37678b.mo71627h()));
        hashMap.put("media", this.f37677a.mo68620a(this.f37678b.mo71628i(), this.f37678b.mo71629j()));
        C13961m9 m9Var2 = this.f37677a;
        View m = this.f37678b.mo71632m();
        m9Var2.getClass();
        j21 j21 = m != null ? new j21(m) : null;
        if (j21 != null) {
            yjVar = new C15254yj(j21);
        }
        hashMap.put(CampaignEx.JSON_KEY_STAR, yjVar);
        hashMap.put("review_count", this.f37677a.mo68621a(this.f37678b.mo71633n()));
        hashMap.put("price", this.f37677a.mo68621a(this.f37678b.mo71631l()));
        hashMap.put("sponsored", this.f37677a.mo68621a(this.f37678b.mo71634o()));
        hashMap.put("title", this.f37677a.mo68621a(this.f37678b.mo71635p()));
        hashMap.put("warning", this.f37677a.mo68621a(this.f37678b.mo71636q()));
        return hashMap;
    }
}
