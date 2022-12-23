package com.mbridge.msdk.videocommon.p236a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6192b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6143d;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.videocommon.C7165a;
import com.mbridge.msdk.videocommon.p239d.C7176a;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.videocommon.a.a */
/* compiled from: VideoCampaignCache */
public class C7167a {

    /* renamed from: a */
    private static final String f17881a = C7167a.class.getName();

    /* renamed from: b */
    private static C7167a f17882b = null;

    /* renamed from: c */
    private C6143d f17883c;

    private C7167a() {
        try {
            Context d = C6122a.m15302b().mo42895d();
            if (d != null) {
                this.f17883c = C6143d.m15367a((C6146e) C6148f.m15420a(d));
            } else {
                C6361q.m16158d(f17881a, "RewardCampaignCache get Context is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C7167a m18072a() {
        C7167a aVar;
        synchronized (C7167a.class) {
            if (f17882b == null) {
                f17882b = new C7167a();
            }
            aVar = f17882b;
        }
        return aVar;
    }

    /* renamed from: a */
    public final List<CampaignEx> mo49061a(String str, int i) {
        List<CampaignEx> a;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (a = this.f17883c.mo42954a(str, 0, 0, i)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : a) {
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

    /* renamed from: a */
    public final List<CampaignEx> mo49064a(String str, String str2) {
        List<CampaignEx> e;
        if (this.f17883c == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (e = this.f17883c.mo42989e(str, str2)) == null || e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (CampaignEx next : e) {
            if ((next.getReadyState() == 0 || next.getLoadTimeoutState() == 1) && !m18073b(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo49071a(String str, List<CampaignEx> list, String str2, int i) {
        C6143d dVar;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && !TextUtils.isEmpty(str2) && (dVar = this.f17883c) != null) {
            dVar.mo42969a(str, list, str2, i);
        }
    }

    /* renamed from: a */
    public final void mo49070a(String str, List<CampaignEx> list) {
        C6143d dVar;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && (dVar = this.f17883c) != null) {
            dVar.mo42981b(str, list);
        }
    }

    /* renamed from: b */
    public final void mo49076b(String str, String str2) {
        if (this.f17883c != null && !TextUtils.isEmpty(str)) {
            this.f17883c.mo42993g(str, str2);
        }
    }

    /* renamed from: b */
    private boolean m18073b(CampaignEx campaignEx) {
        try {
            C7176a b = C7177b.m18135a().mo49112b();
            long d = b != null ? b.mo49098d() : 0;
            long currentTimeMillis = System.currentTimeMillis();
            if (campaignEx != null) {
                long plct = campaignEx.getPlct() * 1000;
                long timestamp = currentTimeMillis - campaignEx.getTimestamp();
                int i = (plct > 0 ? 1 : (plct == 0 ? 0 : -1));
                if (i > 0 && plct >= timestamp) {
                    return false;
                }
                if (i > 0 || d < timestamp) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    public final List<CampaignEx> mo49062a(String str, int i, boolean z) {
        return mo49063a(str, i, z, "");
    }

    /* renamed from: a */
    public final List<CampaignEx> mo49063a(String str, int i, boolean z, String str2) {
        List<CampaignEx> list;
        ArrayList arrayList = null;
        try {
            C7176a b = C7177b.m18135a().mo49112b();
            long d = b != null ? b.mo49098d() : 0;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z) {
                list = this.f17883c.mo42955a(str, 0, 0, i, str2);
            } else {
                list = this.f17883c.mo42956a(str, 0, 0, i, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (list == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : list) {
                    if (next != null && (next.getReadyState() == 0 || next.getLoadTimeoutState() == 1)) {
                        long plct = next.getPlct() * 1000;
                        long timestamp = currentTimeMillis - next.getTimestamp();
                        int i2 = (plct > 0 ? 1 : (plct == 0 ? 0 : -1));
                        if ((i2 > 0 && plct >= timestamp) || (i2 <= 0 && d >= timestamp)) {
                            arrayList2.add(next);
                        }
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

    /* renamed from: a */
    public final List<CampaignEx> mo49065a(List<CampaignEx> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        try {
            C7176a b = C7177b.m18135a().mo49112b();
            long d = b != null ? b.mo49098d() : 0;
            long currentTimeMillis = System.currentTimeMillis();
            if (list == null || list.size() <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : list) {
                    if (next != null) {
                        long plct = next.getPlct() * 1000;
                        long timestamp = currentTimeMillis - next.getTimestamp();
                        int i = (plct > 0 ? 1 : (plct == 0 ? 0 : -1));
                        if ((i > 0 && plct >= timestamp) || (i <= 0 && d >= timestamp)) {
                            arrayList2.add(next);
                        }
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

    /* renamed from: a */
    public final List<C6192b> mo49060a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return this.f17883c.mo42988e(str);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final int mo49072b(String str, int i, boolean z, String str2) {
        List<CampaignEx> list;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                list = this.f17883c.mo42955a(str, 0, 0, i, str2);
            } else {
                list = this.f17883c.mo42956a(str, 0, 0, i, false);
            }
            if (list == null) {
                return 0;
            }
            for (CampaignEx next : list) {
                if (next != null && next.getReadyState() == 0) {
                    arrayList.add(next);
                }
            }
            return arrayList.size();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public final List<CampaignEx> mo49073b(String str, int i, boolean z) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return this.f17883c.mo42956a(str, 0, 0, i, z);
            }
            return null;
        } catch (Exception e) {
            C6361q.m16158d(f17881a, e.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: c */
    public final List<CampaignEx> mo49077c(String str, int i, boolean z, String str2) {
        long p;
        List<CampaignEx> list;
        ArrayList arrayList = null;
        try {
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            if (b != null) {
                p = b.mo42726p();
            } else {
                p = C6076b.m15089a().mo42748b().mo42726p();
            }
            long j = p * 1000;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z) {
                list = this.f17883c.mo42955a(str, 0, 0, i, str2);
            } else {
                list = this.f17883c.mo42956a(str, 0, 0, i, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (list == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : list) {
                    if (next != null && next.getReadyState() == 0) {
                        long plctb = next.getPlctb() * 1000;
                        long timestamp = currentTimeMillis - next.getTimestamp();
                        int i2 = (plctb > 0 ? 1 : (plctb == 0 ? 0 : -1));
                        if ((i2 <= 0 && j >= timestamp) || (i2 > 0 && plctb >= timestamp)) {
                            arrayList2.add(next);
                        }
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

    /* renamed from: a */
    public final void mo49068a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (campaignEx.isBidCampaign()) {
                        C6208d.m15707b(str, campaignEx.getRequestId());
                    }
                    this.f17883c.mo42967a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo49067a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(campaignEx.getId())) {
                    this.f17883c.mo42980b(campaignEx.getId(), campaignEx.getRequestId());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo49074b(String str) {
        ConcurrentHashMap<String, C6192b> f;
        try {
            if (TextUtils.isEmpty(str) && (f = this.f17883c.mo42990f(str)) != null && f.size() > 0) {
                C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
                if (b == null) {
                    b = C6076b.m15089a().mo42748b();
                }
                long p = b != null ? b.mo42726p() : 0;
                long currentTimeMillis = System.currentTimeMillis();
                for (C6192b next : f.values()) {
                    if (next != null) {
                        long c = next.mo43599c();
                        if (c <= 0) {
                            c = p;
                        }
                        if (next.mo43601d() + (c * 1000) < currentTimeMillis) {
                            if (!TextUtils.isEmpty(next.mo43592a())) {
                                mo49079c(str, next.mo43592a());
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo49075b(String str, int i) {
        int size;
        try {
            List<C6192b> e = this.f17883c.mo42988e(str);
            if (e != null && e.size() > 0 && (size = e.size() - i) > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    mo49079c(str, e.get(i2).mo43592a());
                    C6208d.m15707b(str, e.get(i2).mo43592a());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: c */
    public final synchronized void mo49079c(String str, String str2) {
        try {
            this.f17883c.mo42986d(str2, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* renamed from: a */
    public final void mo49069a(String str, String str2, List<CampaignEx> list) {
        try {
            if (!TextUtils.isEmpty(str2) && list != null && list.size() > 0) {
                this.f17883c.mo42973a(list, str, str2, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void mo49066a(long j, String str) {
        try {
            this.f17883c.mo42959a(j, str);
        } catch (Exception e) {
            e.printStackTrace();
            C6361q.m16158d(f17881a, e.getMessage());
        }
        return;
    }

    /* renamed from: c */
    public final synchronized void mo49078c(String str, int i) {
        try {
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            if (b == null) {
                b = C6076b.m15089a().mo42748b();
            }
            int W = b.mo42678W();
            if (W != 0) {
                boolean z = true;
                List<CampaignEx> b2 = this.f17883c.mo42978b(str, i, W == 2);
                if (b2 != null && b2.size() > 0) {
                    for (CampaignEx next : b2) {
                        String requestIdNotice = next.getRequestIdNotice();
                        String id = next.getId();
                        String campaignUnitId = next.getCampaignUnitId();
                        String mof_template_url = next.getMof_template_url();
                        C7165a.m18063b(campaignUnitId + "_" + id + "_" + requestIdNotice + "_" + mof_template_url);
                    }
                }
                C6143d dVar = this.f17883c;
                if (W != 2) {
                    z = false;
                }
                dVar.mo42964a(str, i, z);
            } else {
                return;
            }
        } catch (Exception e) {
            C6361q.m16158d(f17881a, e.getMessage());
        }
        return;
    }
}
