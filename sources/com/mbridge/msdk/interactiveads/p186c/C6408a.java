package com.mbridge.msdk.interactiveads.p186c;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.Toast;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.interactiveads.activity.InteractiveShowActivity;
import com.mbridge.msdk.interactiveads.out.InteractiveAdsListener;
import com.mbridge.msdk.interactiveads.p184a.C6386a;
import com.mbridge.msdk.interactiveads.p184a.C6397c;
import com.mbridge.msdk.interactiveads.p185b.C6407a;
import com.mbridge.msdk.interactiveads.p187d.C6411b;
import com.mbridge.msdk.interactiveads.p187d.C6413d;
import com.mbridge.msdk.interactiveads.p189f.C6417a;
import com.mbridge.msdk.interactiveads.view.MBEntrancePictureView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6083c;
import com.mbridge.msdk.p158b.C6086d;
import com.mbridge.msdk.videocommon.download.C7206j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.interactiveads.c.a */
/* compiled from: InteractiveController */
public final class C6408a implements C6411b {

    /* renamed from: a */
    public static String f15948a = null;

    /* renamed from: c */
    public static String f15949c = null;

    /* renamed from: f */
    public static boolean f15950f = false;

    /* renamed from: r */
    private static Map<String, Integer> f15951r = new HashMap();

    /* renamed from: b */
    public InteractiveAdsListener f15952b;

    /* renamed from: d */
    public int f15953d = 0;

    /* renamed from: e */
    public C6386a f15954e;

    /* renamed from: g */
    private String f15955g = "InteractiveController";

    /* renamed from: h */
    private C6086d f15956h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Context f15957i;

    /* renamed from: j */
    private ViewGroup f15958j;

    /* renamed from: k */
    private String f15959k;

    /* renamed from: l */
    private MBEntrancePictureView f15960l;

    /* renamed from: m */
    private boolean f15961m = false;

    /* renamed from: n */
    private String f15962n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public MBridgeIds f15963o;

    /* renamed from: p */
    private Handler f15964p;

    /* renamed from: q */
    private CampaignEx f15965q;

    /* renamed from: a */
    public final void mo44070a(int i) {
    }

    public C6408a() {
        try {
            this.f15964p = new Handler(Looper.getMainLooper()) {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void handleMessage(android.os.Message r5) {
                    /*
                        r4 = this;
                        if (r5 != 0) goto L_0x0003
                        return
                    L_0x0003:
                        int r0 = r5.what
                        r1 = 2
                        java.lang.String r2 = "can't show because unknow error"
                        java.lang.String r3 = ""
                        if (r0 == r1) goto L_0x006b
                        r1 = 4
                        if (r0 == r1) goto L_0x0040
                        r5 = 6
                        if (r0 == r5) goto L_0x002c
                        r5 = 7
                        if (r0 == r5) goto L_0x0017
                        goto L_0x00a1
                    L_0x0017:
                        com.mbridge.msdk.interactiveads.c.a r5 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.interactiveads.out.InteractiveAdsListener r5 = r5.f15952b
                        if (r5 == 0) goto L_0x00a1
                        com.mbridge.msdk.interactiveads.c.a r5 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.interactiveads.out.InteractiveAdsListener r5 = r5.f15952b
                        com.mbridge.msdk.interactiveads.c.a r0 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f15963o
                        r5.onInteractiveClosed(r0)
                        goto L_0x00a1
                    L_0x002c:
                        com.mbridge.msdk.interactiveads.c.a r5 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.interactiveads.out.InteractiveAdsListener r5 = r5.f15952b
                        if (r5 == 0) goto L_0x00a1
                        com.mbridge.msdk.interactiveads.c.a r5 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.interactiveads.out.InteractiveAdsListener r5 = r5.f15952b
                        com.mbridge.msdk.interactiveads.c.a r0 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f15963o
                        r5.onInteractiveAdClick(r0)
                        goto L_0x00a1
                    L_0x0040:
                        com.mbridge.msdk.interactiveads.c.a r0 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.interactiveads.out.InteractiveAdsListener r0 = r0.f15952b
                        if (r0 == 0) goto L_0x00a1
                        java.lang.Object r0 = r5.obj
                        if (r0 == 0) goto L_0x0055
                        java.lang.Object r0 = r5.obj
                        boolean r0 = r0 instanceof java.lang.String
                        if (r0 == 0) goto L_0x0055
                        java.lang.Object r5 = r5.obj
                        r3 = r5
                        java.lang.String r3 = (java.lang.String) r3
                    L_0x0055:
                        boolean r5 = android.text.TextUtils.isEmpty(r3)
                        if (r5 == 0) goto L_0x005c
                        goto L_0x005d
                    L_0x005c:
                        r2 = r3
                    L_0x005d:
                        com.mbridge.msdk.interactiveads.c.a r5 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.interactiveads.out.InteractiveAdsListener r5 = r5.f15952b
                        com.mbridge.msdk.interactiveads.c.a r0 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f15963o
                        r5.onInteractiveShowFail(r0, r2)
                        goto L_0x00a1
                    L_0x006b:
                        com.mbridge.msdk.interactiveads.c.a r0 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.interactiveads.out.InteractiveAdsListener r0 = r0.f15952b
                        if (r0 == 0) goto L_0x00a1
                        java.lang.Object r0 = r5.obj
                        if (r0 == 0) goto L_0x0080
                        java.lang.Object r0 = r5.obj
                        boolean r0 = r0 instanceof java.lang.String
                        if (r0 == 0) goto L_0x0080
                        java.lang.Object r5 = r5.obj
                        r3 = r5
                        java.lang.String r3 = (java.lang.String) r3
                    L_0x0080:
                        boolean r5 = android.text.TextUtils.isEmpty(r3)
                        if (r5 == 0) goto L_0x0087
                        goto L_0x0088
                    L_0x0087:
                        r2 = r3
                    L_0x0088:
                        com.mbridge.msdk.interactiveads.c.a r5 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        android.content.Context r5 = r5.f15957i
                        java.lang.String r0 = com.mbridge.msdk.interactiveads.p186c.C6408a.f15948a
                        r1 = 0
                        com.mbridge.msdk.interactiveads.p189f.C6417a.m16394a(r5, r2, r0, r1)
                        com.mbridge.msdk.interactiveads.c.a r5 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.interactiveads.out.InteractiveAdsListener r5 = r5.f15952b
                        com.mbridge.msdk.interactiveads.c.a r0 = com.mbridge.msdk.interactiveads.p186c.C6408a.this
                        com.mbridge.msdk.out.MBridgeIds r0 = r0.f15963o
                        r5.onInteractiveLoadFail(r0, r2)
                    L_0x00a1:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.interactiveads.p186c.C6408a.C64091.handleMessage(android.os.Message):void");
                }
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m16347a(String str, int i) {
        try {
            if (f15951r != null && C6369x.m16236b(str)) {
                f15951r.put(str, Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static int m16345a(String str) {
        Integer num;
        try {
            if (!C6369x.m16236b(str) || f15951r == null || !f15951r.containsKey(str) || (num = f15951r.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public final boolean mo44076a(Context context, Map<String, Object> map) {
        try {
            this.f15961m = false;
            if (!(map == null || context == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID))) {
                if (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String) {
                    String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                    f15948a = str;
                    if (!TextUtils.isEmpty(str)) {
                        C6121a.m15293a().mo42880a("interactive_unitid", f15948a);
                    }
                    if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                        this.f15962n = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                    }
                    this.f15963o = new MBridgeIds(this.f15962n, f15948a);
                    this.f15957i = context;
                    this.f15961m = true;
                    C7206j.m18320a().mo49236b();
                    C6417a.m16392a(context, f15948a);
                    return this.f15961m;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            this.f15961m = false;
        }
    }

    /* renamed from: a */
    public final boolean mo44077a(Context context, Map<String, Object> map, ViewGroup viewGroup, String str) {
        this.f15961m = mo44076a(context, map);
        if (!(viewGroup == null || str == null)) {
            try {
                this.f15958j = viewGroup;
                this.f15959k = str;
                mo44078b();
            } catch (Exception e) {
                e.printStackTrace();
                this.f15961m = false;
            }
        }
        return this.f15961m;
    }

    /* renamed from: a */
    public final void mo44072a(ViewGroup viewGroup) {
        this.f15958j = viewGroup;
    }

    /* renamed from: b */
    public final void mo44079b(String str) {
        this.f15959k = str;
    }

    /* renamed from: a */
    public final void mo44069a() {
        try {
            if (this.f15957i == null) {
                m16349e("context is null");
            } else if (TextUtils.isEmpty(f15948a)) {
                m16349e("unitid is null");
            } else if (!this.f15961m) {
                m16349e("init error");
            } else {
                try {
                    new C6083c().mo42767a(this.f15957i, C6122a.m15302b().mo42896e(), C6122a.m15302b().mo42897f(), C6121a.m15293a().mo42882b("interactive_unitid"));
                } catch (Exception e) {
                    try {
                        e.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                C6086d e3 = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), f15948a);
                this.f15956h = e3;
                if (e3 == null) {
                    this.f15956h = C6086d.m15137g(f15948a);
                }
                try {
                    if (this.f15954e == null || !f15948a.equals(this.f15954e.mo44007b())) {
                        this.f15954e = new C6386a(this.f15957i, f15948a, this.f15962n);
                    }
                    this.f15954e.mo44001a((C6411b) this);
                    this.f15954e.mo44008c();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            m16349e("can't show because unknow error");
        }
    }

    /* renamed from: b */
    public final void mo44078b() {
        Context context = this.f15957i;
        if (context != null && this.f15958j != null && this.f15959k != null) {
            if (this.f15960l == null && context != null) {
                this.f15960l = new MBEntrancePictureView(this.f15957i, (AttributeSet) null);
                InteractiveShowActivity.interactiveStatusListener = this;
            }
            this.f15960l.setUnitId(f15948a);
            this.f15960l.refreshUI(this.f15957i, this.f15959k, this.f15965q);
            this.f15958j.removeAllViews();
            this.f15958j.addView(this.f15960l);
        }
    }

    /* renamed from: c */
    public final void mo44080c() {
        f15950f = true;
        if (C6407a.f15946e) {
            Toast.makeText(this.f15957i, "current page is showing", 0).show();
        } else if (this.f15965q != null) {
            Intent intent = new Intent(this.f15957i, InteractiveShowActivity.class);
            intent.putExtra("campaign", this.f15965q);
            intent.putExtra("unitId", f15948a);
            intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f15962n);
            InteractiveShowActivity.interactiveStatusListener = this;
            this.f15957i.startActivity(intent);
        } else {
            Intent intent2 = new Intent(this.f15957i, InteractiveShowActivity.class);
            intent2.putExtra("unitId", f15948a);
            intent2.putExtra(MBridgeConstans.PLACEMENT_ID, this.f15962n);
            InteractiveShowActivity.interactiveStatusListener = this;
            this.f15957i.startActivity(intent2);
        }
    }

    /* renamed from: e */
    private void m16349e(String str) {
        try {
            if (this.f15964p != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 2;
                this.f15964p.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo44074a(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            InteractiveAdsListener interactiveAdsListener = this.f15952b;
            if (interactiveAdsListener != null) {
                interactiveAdsListener.onInteractiveLoadFail(this.f15963o, "data is null");
                C6417a.m16394a(this.f15957i, "data is null", f15948a, (CampaignEx) null);
                return;
            }
            return;
        }
        CampaignEx campaignEx = list.get(0);
        this.f15965q = campaignEx;
        if (TextUtils.isEmpty(campaignEx.getKeyIaUrl())) {
            InteractiveAdsListener interactiveAdsListener2 = this.f15952b;
            if (interactiveAdsListener2 != null) {
                interactiveAdsListener2.onInteractiveLoadFail(this.f15963o, "data is null");
                C6417a.m16394a(this.f15957i, "data is null", f15948a, campaignEx);
                return;
            }
            return;
        }
        if (this.f15958j != null) {
            String keyIaIcon = campaignEx.getKeyIaIcon();
            if (!(this.f15957i == null || keyIaIcon == null)) {
                this.f15959k = keyIaIcon;
                MBEntrancePictureView mBEntrancePictureView = this.f15960l;
                if (mBEntrancePictureView != null) {
                    mBEntrancePictureView.setUnitId(f15948a);
                    this.f15960l.refreshUI(this.f15957i, keyIaIcon, campaignEx);
                }
            }
            C6417a.m16390a(this.f15957i, campaignEx, 1, 4, f15948a);
        }
        InteractiveAdsListener interactiveAdsListener3 = this.f15952b;
        if (interactiveAdsListener3 != null) {
            interactiveAdsListener3.onInteractivelLoadSuccess(this.f15963o, campaignEx.getKeyIaRst());
        }
    }

    /* renamed from: a */
    public final void mo44073a(CampaignEx campaignEx) {
        this.f15965q = campaignEx;
        this.f15953d = 1;
        InteractiveAdsListener interactiveAdsListener = this.f15952b;
        if (interactiveAdsListener != null) {
            interactiveAdsListener.onInterActiveMaterialLoadSuccess(this.f15963o);
        }
    }

    /* renamed from: d */
    public final String mo44082d() {
        CampaignEx campaignEx = this.f15965q;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f15965q.getRequestId();
    }

    /* renamed from: e */
    public final void mo44084e() {
        InteractiveAdsListener interactiveAdsListener = this.f15952b;
        if (interactiveAdsListener != null) {
            interactiveAdsListener.onInteractiveShowSuccess(this.f15963o);
        }
    }

    /* renamed from: c */
    public final void mo44081c(String str) {
        this.f15953d = -1;
        InteractiveAdsListener interactiveAdsListener = this.f15952b;
        if (interactiveAdsListener != null) {
            interactiveAdsListener.onInteractiveShowFail(this.f15963o, str);
        }
    }

    /* renamed from: d */
    public final void mo44083d(String str) {
        InteractiveAdsListener interactiveAdsListener = this.f15952b;
        if (interactiveAdsListener != null) {
            interactiveAdsListener.onInteractiveLoadFail(this.f15963o, str);
        }
    }

    /* renamed from: a */
    public final void mo44071a(int i, JSONArray jSONArray, C6413d dVar) {
        C6397c.m16305a(this.f15957i).f15905a = jSONArray;
        C6397c.m16305a(this.f15957i).mo44029a(true);
        f15951r.put(f15948a, 0);
        if (this.f15954e == null) {
            this.f15954e = new C6386a(this.f15957i, f15948a, this.f15962n);
        }
        this.f15954e.mo44001a((C6411b) this);
        this.f15954e.mo44002a("loadmore", dVar);
    }

    /* renamed from: f */
    public final void mo44085f() {
        InteractiveAdsListener interactiveAdsListener = this.f15952b;
        if (interactiveAdsListener != null) {
            interactiveAdsListener.onInteractiveClosed(this.f15963o);
        }
    }

    /* renamed from: g */
    public final void mo44086g() {
        InteractiveAdsListener interactiveAdsListener = this.f15952b;
        if (interactiveAdsListener != null) {
            interactiveAdsListener.onInteractiveAdClick(this.f15963o);
        }
    }

    /* renamed from: a */
    public final void mo44075a(boolean z) {
        InteractiveAdsListener interactiveAdsListener = this.f15952b;
        if (interactiveAdsListener != null) {
            interactiveAdsListener.onInteractivePlayingComplete(this.f15963o, z);
        }
    }
}
