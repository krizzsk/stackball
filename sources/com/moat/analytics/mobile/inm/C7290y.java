package com.moat.analytics.mobile.inm;

import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.moat.analytics.mobile.inm.y */
class C7290y extends C7228c implements ReactiveVideoTracker {

    /* renamed from: l */
    private Integer f18281l;

    public C7290y(String str) {
        super(str);
        C7261p.m18544a(3, "ReactiveVideoTracker", (Object) this, "Initializing.");
        C7261p.m18547a("[SUCCESS] ", mo49337a() + " created");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo49337a() {
        return "ReactiveVideoTracker";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo49355a(MoatAdEvent moatAdEvent) {
        if (moatAdEvent.f18086d == MoatAdEventType.AD_EVT_COMPLETE && !moatAdEvent.f18084b.equals(MoatAdEvent.f18082a) && !mo49356a(moatAdEvent.f18084b, this.f18281l)) {
            moatAdEvent.f18086d = MoatAdEventType.AD_EVT_STOPPED;
        }
        return super.mo49355a(moatAdEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49341a(List<String> list) {
        if (this.f18281l.intValue() >= 1000) {
            super.mo49341a(list);
            return;
        }
        throw new C7252m(String.format(Locale.ROOT, "Invalid duration = %d. Please make sure duration is in milliseconds.", new Object[]{this.f18281l}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Map<String, Object> mo49359i() {
        Integer num;
        HashMap hashMap = new HashMap();
        View view = (View) this.f18117k.get();
        int i = 0;
        if (view != null) {
            i = Integer.valueOf(view.getWidth());
            num = Integer.valueOf(view.getHeight());
        } else {
            num = 0;
        }
        hashMap.put("duration", this.f18281l);
        hashMap.put("width", i);
        hashMap.put("height", num);
        return hashMap;
    }

    public boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
        try {
            mo49343c();
            mo49345d();
            this.f18281l = num;
            return super.mo49357a(map, view);
        } catch (Exception e) {
            mo49340a("trackVideoAd", e);
            return false;
        }
    }
}
