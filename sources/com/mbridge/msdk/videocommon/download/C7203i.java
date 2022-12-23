package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p168c.C6216b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.videocommon.download.i */
/* compiled from: ResDownloadCheckManager */
public final class C7203i {

    /* renamed from: b */
    private static Map<String, Boolean> f18027b = new HashMap();

    /* renamed from: a */
    private Map<String, Boolean> f18028a;

    /* renamed from: c */
    private Map<String, Boolean> f18029c;

    /* renamed from: d */
    private Map<String, Boolean> f18030d;

    /* renamed from: e */
    private Map<String, Boolean> f18031e;

    /* renamed from: com.mbridge.msdk.videocommon.download.i$a */
    /* compiled from: ResDownloadCheckManager */
    private static final class C7205a {

        /* renamed from: a */
        public static C7203i f18032a = new C7203i();
    }

    private C7203i() {
        this.f18028a = new HashMap();
        this.f18029c = new HashMap();
        this.f18030d = new HashMap();
        this.f18031e = new HashMap();
    }

    /* renamed from: a */
    public static C7203i m18311a() {
        return C7205a.f18032a;
    }

    /* renamed from: a */
    public final boolean mo49228a(String str) {
        if (this.f18028a == null || TextUtils.isEmpty(str) || !this.f18028a.containsKey(str)) {
            return false;
        }
        return this.f18028a.get(str).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo49230b(String str) {
        if (this.f18029c == null || TextUtils.isEmpty(str) || !this.f18029c.containsKey(str)) {
            return false;
        }
        return this.f18029c.get(str).booleanValue();
    }

    /* renamed from: a */
    public final void mo49227a(List<CampaignEx> list) {
        List<CampaignEx.C6189c.C6190a> e;
        List<String> list2;
        Map<String, Boolean> map;
        if (list != null && list.size() != 0) {
            for (CampaignEx next : list) {
                if (next != null) {
                    if (next != null) {
                        String videoUrlEncode = next.getVideoUrlEncode();
                        Map<String, Boolean> map2 = this.f18028a;
                        if (map2 != null && !map2.containsKey(videoUrlEncode)) {
                            this.f18028a.put(videoUrlEncode, false);
                        }
                        String str = next.getendcard_url();
                        Map<String, Boolean> map3 = this.f18029c;
                        if (map3 != null && !map3.containsKey(str)) {
                            this.f18029c.put(str, false);
                        }
                        CampaignEx.C6189c rewardTemplateMode = next.getRewardTemplateMode();
                        if (!(rewardTemplateMode == null || (e = rewardTemplateMode.mo43511e()) == null)) {
                            for (CampaignEx.C6189c.C6190a next2 : e) {
                                if (!(next2 == null || (list2 = next2.f15267b) == null || list2.size() == 0)) {
                                    for (String next3 : list2) {
                                        if (!TextUtils.isEmpty(next3) && (map = f18027b) != null && !map.containsKey(next3)) {
                                            f18027b.put(next3, Boolean.valueOf(C6216b.m15729a(C6122a.m15302b().mo42895d()).mo43788b(next3)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    String id = next.getId();
                    if (this.f18030d == null) {
                        this.f18030d = new HashMap();
                    }
                    this.f18030d.put(id, false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49226a(String str, boolean z) {
        if (this.f18028a == null) {
            this.f18028a = new HashMap();
        }
        this.f18028a.put(str, Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final void mo49229b(String str, boolean z) {
        if (this.f18029c == null) {
            this.f18029c = new HashMap();
        }
        this.f18029c.put(str, Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo49231c(String str, boolean z) {
        if (f18027b == null) {
            f18027b = new HashMap();
        }
        f18027b.put(str, Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final void mo49233d(String str, boolean z) {
        if (this.f18031e == null) {
            this.f18031e = new HashMap();
        }
        this.f18031e.put(str, Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final boolean mo49232c(String str) {
        if (!TextUtils.isEmpty(str) && this.f18031e.containsKey(str)) {
            return this.f18031e.get(str).booleanValue();
        }
        return false;
    }
}
