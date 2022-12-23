package com.mbridge.msdk.reward.p209a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6192b;
import com.mbridge.msdk.foundation.entity.C6195e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.p164db.C6143d;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6149g;
import com.mbridge.msdk.foundation.p164db.C6151i;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.tools.C6355o;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6368w;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p161c.C6094b;
import com.mbridge.msdk.reward.adapter.C6757a;
import com.mbridge.msdk.reward.adapter.C6758b;
import com.mbridge.msdk.reward.adapter.C6759c;
import com.mbridge.msdk.reward.adapter.C6779d;
import com.mbridge.msdk.reward.p210b.C6801a;
import com.mbridge.msdk.system.C6812a;
import com.mbridge.msdk.video.p214bt.module.p217b.C6922h;
import com.mbridge.msdk.videocommon.C7165a;
import com.mbridge.msdk.videocommon.download.C7184c;
import com.mbridge.msdk.videocommon.download.C7191g;
import com.mbridge.msdk.videocommon.download.C7200h;
import com.mbridge.msdk.videocommon.download.C7206j;
import com.mbridge.msdk.videocommon.listener.C7212a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.mbridge.msdk.videocommon.p236a.C7167a;
import com.mbridge.msdk.videocommon.p237b.C7169b;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import com.mbridge.msdk.videocommon.p238c.C7175c;
import com.mbridge.msdk.videocommon.p239d.C7176a;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.a.a */
/* compiled from: RewardVideoController */
public class C6738a {

    /* renamed from: I */
    private static Map<String, Integer> f16420I = new HashMap();

    /* renamed from: J */
    private static ConcurrentHashMap<String, String> f16421J = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static String f16422a;

    /* renamed from: b */
    public static Map<String, C6753d> f16423b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f16424A = false;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f16425B = false;

    /* renamed from: C */
    private boolean f16426C = false;

    /* renamed from: D */
    private boolean f16427D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f16428E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f16429F = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public ArrayList<Integer> f16430G = new ArrayList<>(7);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f16431H = false;

    /* renamed from: K */
    private Queue<Integer> f16432K;

    /* renamed from: L */
    private String f16433L;

    /* renamed from: M */
    private C6148f f16434M = null;

    /* renamed from: N */
    private volatile boolean f16435N = true;

    /* renamed from: O */
    private volatile boolean f16436O = false;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public volatile boolean f16437P = false;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public volatile boolean f16438Q = false;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public volatile boolean f16439R = false;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public volatile boolean f16440S = false;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public volatile boolean f16441T = false;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public List<CampaignEx> f16442U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public List<CampaignEx> f16443V;

    /* renamed from: c */
    volatile boolean f16444c = false;

    /* renamed from: d */
    volatile boolean f16445d = false;

    /* renamed from: e */
    volatile boolean f16446e = false;

    /* renamed from: f */
    volatile boolean f16447f = false;

    /* renamed from: g */
    volatile boolean f16448g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Context f16449h;

    /* renamed from: i */
    private int f16450i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6779d f16451j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C7179c f16452k;

    /* renamed from: l */
    private C7176a f16453l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile InterVideoOutListener f16454m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile C6752c f16455n;

    /* renamed from: o */
    private String f16456o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f16457p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public MBridgeIds f16458q;

    /* renamed from: r */
    private String f16459r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile String f16460s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f16461t;

    /* renamed from: u */
    private int f16462u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Handler f16463v = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            Message message2 = message;
            switch (message2.what) {
                case 8:
                    if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                        boolean z = (C6738a.this.f16443V == null || C6738a.this.f16443V.size() <= 0) ? false : !TextUtils.isEmpty(((CampaignEx) C6738a.this.f16443V.get(0)).getMof_template_url());
                        int nscpt = ((CampaignEx) C6738a.this.f16442U.get(0)).getNscpt();
                        if (C6738a.this.f16451j == null || !C6738a.this.f16451j.mo47043a((List<CampaignEx>) C6738a.this.f16442U, z, nscpt)) {
                            if (C6738a.this.f16455n != null && C6738a.this.f16428E) {
                                C7165a.m18056a();
                                C7165a.m18060b();
                                C6752c.m16992a(C6738a.this.f16455n, "load timeout");
                                return;
                            }
                            return;
                        } else if (C6738a.this.f16455n != null && C6738a.this.f16428E) {
                            C6752c.m16993a(C6738a.this.f16455n, C6738a.this.f16460s, C6738a.this.f16457p);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 9:
                    if (C6738a.this.f16454m != null && C6738a.this.f16428E) {
                        Object obj = message2.obj;
                        if (obj instanceof String) {
                            obj.toString();
                        }
                        Bundle data = message.getData();
                        if (data != null && data.containsKey(MBridgeConstans.PLACEMENT_ID)) {
                            boolean isEmpty = TextUtils.isEmpty(data.getString(MBridgeConstans.PLACEMENT_ID));
                        }
                        try {
                            if (C6738a.this.f16425B) {
                                C6738a.m16941j(C6738a.this);
                            }
                            C6738a.this.f16454m.onVideoLoadSuccess(C6738a.this.f16458q);
                            return;
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                case 16:
                case 18:
                    if (C6738a.this.f16454m != null && C6738a.this.f16428E) {
                        Object obj2 = message2.obj;
                        String obj3 = obj2 instanceof String ? obj2.toString() : "";
                        C7165a.m18056a();
                        C7165a.m18060b();
                        try {
                            if (C6738a.this.f16425B) {
                                C6738a.m16941j(C6738a.this);
                            }
                            C6738a.this.f16454m.onVideoLoadFail(C6738a.this.f16458q, obj3);
                            return;
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                e2.printStackTrace();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                case 17:
                    if (C6738a.this.f16454m != null && C6738a.this.f16428E) {
                        Object obj4 = message2.obj;
                        if (obj4 instanceof String) {
                            obj4.toString();
                        }
                        Bundle data2 = message.getData();
                        if (data2 != null && data2.containsKey(MBridgeConstans.PLACEMENT_ID)) {
                            boolean isEmpty2 = TextUtils.isEmpty(data2.getString(MBridgeConstans.PLACEMENT_ID));
                        }
                        try {
                            if (C6738a.this.f16425B) {
                                C6738a.m16941j(C6738a.this);
                            }
                            C6738a.this.f16454m.onLoadSuccess(C6738a.this.f16458q);
                            return;
                        } catch (Exception e3) {
                            if (MBridgeConstans.DEBUG) {
                                e3.printStackTrace();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                case 1001001:
                    C6738a.this.mo46986d(false);
                    return;
                case 1001002:
                    int D = C6738a.this.f16452k != null ? C6738a.this.f16452k.mo49117D() : 0;
                    if (C6738a.this.f16451j != null) {
                        if (C6738a.this.f16451j.mo47046b()) {
                            if (C6738a.this.f16455n != null) {
                                C6361q.m16154a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady exception");
                                if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                    Context d = C6122a.m15302b().mo42895d();
                                    C6801a.m17157c((CampaignEx) C6738a.this.f16442U.get(0), d, "load timeout task called onVideoLoadSuccess after " + D + "s exception", C6738a.this.f16457p, C6738a.this.f16425B, "", "");
                                    C6801a.m17153a(C6738a.this.f16449h, C6738a.this.f16442U, C6738a.this.f16457p, 0);
                                }
                                C6752c.m16997b(C6738a.this.f16455n, C6738a.this.f16460s, C6738a.this.f16457p);
                                return;
                            }
                            return;
                        } else if (C6738a.this.f16451j.mo47051f(false)) {
                            if (!C6738a.this.f16451j.mo47046b()) {
                                C6738a.this.f16451j.mo47050e(false);
                                if (C6738a.this.f16451j.mo47051f(true)) {
                                    if (!C6738a.this.f16451j.mo47046b()) {
                                        if (C6738a.this.f16455n != null) {
                                            C6361q.m16154a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + D + "s exception");
                                        }
                                        C6738a.this.f16451j.mo47050e(true);
                                        return;
                                    } else if (C6738a.this.f16455n != null) {
                                        C6361q.m16154a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState exception");
                                        C6738a.this.f16451j.mo47049d(true);
                                        if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                            Context d2 = C6122a.m15302b().mo42895d();
                                            C6801a.m17157c((CampaignEx) C6738a.this.f16442U.get(0), d2, "load timeout task called onVideoLoadSuccess after " + D + "s exception", C6738a.this.f16457p, C6738a.this.f16425B, "", "");
                                            C6801a.m17153a(C6738a.this.f16449h, C6738a.this.f16442U, C6738a.this.f16457p, 0);
                                        }
                                        C6752c.m16997b(C6738a.this.f16455n, C6738a.this.f16460s, C6738a.this.f16457p);
                                        return;
                                    } else {
                                        return;
                                    }
                                } else if (C6738a.this.f16455n != null) {
                                    C6361q.m16154a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + D + "s exception");
                                    return;
                                } else {
                                    return;
                                }
                            } else if (C6738a.this.f16455n != null) {
                                C6361q.m16154a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState exception");
                                C6738a.this.f16451j.mo47049d(false);
                                if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                    Context d3 = C6122a.m15302b().mo42895d();
                                    C6801a.m17157c((CampaignEx) C6738a.this.f16442U.get(0), d3, "load timeout task called onVideoLoadSuccess after " + D + "s exception", C6738a.this.f16457p, C6738a.this.f16425B, "", "");
                                    C6801a.m17153a(C6738a.this.f16449h, C6738a.this.f16442U, C6738a.this.f16457p, 0);
                                }
                                C6752c.m16997b(C6738a.this.f16455n, C6738a.this.f16460s, C6738a.this.f16457p);
                                return;
                            } else {
                                return;
                            }
                        } else if (C6738a.this.f16451j.mo47051f(true)) {
                            if (!C6738a.this.f16451j.mo47046b()) {
                                if (C6738a.this.f16455n != null) {
                                    C6361q.m16154a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + D + " s");
                                }
                                C6738a.this.f16451j.mo47050e(true);
                                return;
                            } else if (C6738a.this.f16455n != null) {
                                C6361q.m16154a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState");
                                C6738a.this.f16451j.mo47049d(true);
                                if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                    Context d4 = C6122a.m15302b().mo42895d();
                                    C6801a.m17157c((CampaignEx) C6738a.this.f16442U.get(0), d4, "load timeout task called onVideoLoadSuccess after " + D + "s exception", C6738a.this.f16457p, C6738a.this.f16425B, "", "");
                                    C6801a.m17153a(C6738a.this.f16449h, C6738a.this.f16442U, C6738a.this.f16457p, 0);
                                }
                                C6752c.m16997b(C6738a.this.f16455n, C6738a.this.f16460s, C6738a.this.f16457p);
                                return;
                            } else {
                                return;
                            }
                        } else if (C6738a.this.f16455n != null) {
                            C6361q.m16154a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + D + " s");
                            return;
                        } else {
                            return;
                        }
                    } else if (C6738a.this.f16455n != null) {
                        C6361q.m16154a("RewardVideoController", "load timeout task called for onVideoLoadFail by mRewardMvVideoAdapter is null exception");
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f16464w = 2;

    /* renamed from: x */
    private int f16465x;

    /* renamed from: y */
    private int f16466y;

    /* renamed from: z */
    private int f16467z;

    /* renamed from: a */
    public final void mo46979a(boolean z) {
        this.f16424A = z;
    }

    /* renamed from: b */
    public final void mo46984b(boolean z) {
        this.f16425B = z;
    }

    /* renamed from: a */
    public final void mo46974a(int i) {
        this.f16464w = i;
    }

    /* renamed from: a */
    public final String mo46973a() {
        C6779d dVar = this.f16451j;
        return dVar != null ? dVar.mo47034a(this.f16431H) : "";
    }

    /* renamed from: a */
    public final void mo46978a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            Context context = this.f16449h;
            C6368w.m16233a(context, "MBridge_ConfirmTitle" + this.f16457p, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            Context context2 = this.f16449h;
            C6368w.m16233a(context2, "MBridge_ConfirmContent" + this.f16457p, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            Context context3 = this.f16449h;
            C6368w.m16233a(context3, "MBridge_CancelText" + this.f16457p, str4.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            Context context4 = this.f16449h;
            C6368w.m16233a(context4, "MBridge_ConfirmText" + this.f16457p, str3.trim());
        }
    }

    /* renamed from: c */
    public final void mo46985c(boolean z) {
        this.f16429F = z;
    }

    /* renamed from: a */
    public final void mo46975a(int i, int i2, int i3) {
        this.f16465x = i;
        this.f16466y = i2;
        if (i2 == C6204a.f15406p) {
            this.f16467z = i3 < 0 ? 5 : i3;
        }
        if (this.f16466y == C6204a.f15405o) {
            this.f16467z = i3 < 0 ? 80 : i3;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            int i4 = 1;
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i == C6204a.f15403m ? 0 : 1);
            if (i2 == C6204a.f15405o) {
                i4 = 0;
            }
            jSONObject.put("ivRewardPlayValueMode", i4);
            jSONObject.put("ivRewardPlayValue", i3);
            C6076b.m15089a();
            String str = this.f16457p;
            String jSONObject2 = jSONObject.toString();
            C6121a a = C6121a.m15293a();
            a.mo42880a("ivreward_" + str, jSONObject2);
        } catch (Exception unused) {
            C6361q.m16158d("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    /* renamed from: a */
    public static void m16913a(String str, int i) {
        try {
            if (f16420I != null && C6369x.m16236b(str)) {
                f16420I.put(str, Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static int m16908a(String str) {
        Integer num;
        try {
            if (!C6369x.m16236b(str) || f16420I == null || !f16420I.containsKey(str) || (num = f16420I.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static void m16914a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (concurrentHashMap = f16421J) != null && !concurrentHashMap.containsKey(str)) {
            f16421J.put(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo46981b() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (this.f16431H && (concurrentHashMap = f16421J) != null && !concurrentHashMap.containsKey(mo46973a())) {
            f16421J.remove(mo46973a());
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && C6122a.m15302b().mo42895d() != null) {
            C6151i a = C6151i.m15437a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
            C6195e eVar = new C6195e();
            eVar.mo43622a(System.currentTimeMillis());
            eVar.mo43625b(str);
            eVar.mo43623a(campaignEx.getId());
            a.mo43010a(eVar);
        }
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$d */
    /* compiled from: RewardVideoController */
    private final class C6753d implements C6922h {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C6738a f16518b;

        /* renamed from: c */
        private int f16519c;

        /* renamed from: d */
        private Handler f16520d;

        /* renamed from: e */
        private int f16521e;

        private C6753d(C6738a aVar, int i, Handler handler) {
            this.f16521e = 0;
            this.f16518b = aVar;
            this.f16519c = i;
            this.f16520d = handler;
        }

        /* renamed from: a */
        public final void mo47003a() {
            try {
                if (this.f16518b != null) {
                    boolean unused = this.f16518b.f16431H = true;
                    if (this.f16518b.f16451j != null) {
                        this.f16518b.f16451j.f16676b = "";
                    }
                    this.f16518b.mo46982b(this.f16519c);
                    if (C6738a.this.f16425B) {
                        C6738a.m16941j(C6738a.this);
                    }
                    if (this.f16518b.f16454m != null) {
                        this.f16518b.f16454m.onAdShow(C6738a.this.f16458q);
                        this.f16521e = 2;
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo47008a(boolean z, C7170c cVar) {
            try {
                if (this.f16518b != null && this.f16518b.f16454m != null) {
                    if (cVar == null) {
                        cVar = C7170c.m18100b(this.f16518b.f16461t);
                    }
                    if (C6738a.this.f16425B) {
                        C6738a.m16941j(C6738a.this);
                        C6738a.this.mo46981b();
                    }
                    this.f16518b.f16454m.onAdClose(C6738a.this.f16458q, new RewardInfo(z, cVar.mo49082a(), String.valueOf(cVar.mo49085b())));
                    this.f16521e = 7;
                    boolean unused = this.f16518b.f16431H = false;
                    C6738a.this.f16430G.clear();
                    this.f16518b = null;
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo47005a(String str) {
            try {
                if (this.f16518b != null) {
                    if (C6738a.this.f16425B) {
                        C6738a.m16941j(C6738a.this);
                    }
                    boolean unused = this.f16518b.f16431H = false;
                    if (this.f16518b.f16454m != null) {
                        try {
                            if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                Context d = C6122a.m15302b().mo42895d();
                                C6801a.m17157c((CampaignEx) C6738a.this.f16442U.get(0), d, "show failed: " + str, C6738a.this.f16457p, C6738a.this.f16425B, "", "");
                            }
                            this.f16518b.f16454m.onShowFail(C6738a.this.f16458q, str);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                        }
                        this.f16521e = 4;
                    }
                }
            } catch (Exception e2) {
                this.f16521e = 0;
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo47009a(boolean z, String str, String str2) {
            try {
                if (this.f16518b != null && this.f16518b.f16454m != null) {
                    if (C6738a.this.f16425B) {
                        C6738a.m16941j(C6738a.this);
                    }
                    boolean unused = this.f16518b.f16431H = false;
                    try {
                        this.f16518b.f16454m.onVideoAdClicked(z, C6738a.this.f16458q);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo47006a(String str, String str2) {
            try {
                if (this.f16518b != null && this.f16518b.f16454m != null) {
                    try {
                        this.f16518b.f16454m.onVideoComplete(C6738a.this.f16458q);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    this.f16521e = 5;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo47007a(boolean z, int i) {
            try {
                if (this.f16518b != null && this.f16518b.f16454m != null) {
                    try {
                        this.f16518b.f16454m.onAdCloseWithIVReward(C6738a.this.f16458q, new RewardInfo(z, i));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: b */
        public final void mo47010b(String str, String str2) {
            try {
                if (this.f16518b != null && this.f16518b.f16454m != null) {
                    try {
                        this.f16518b.f16454m.onEndcardShow(C6738a.this.f16458q);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    this.f16521e = 6;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo47004a(int i, String str, String str2) {
            this.f16521e = i;
            C6738a aVar = this.f16518b;
            if (aVar != null && !aVar.f16425B && !this.f16518b.f16424A && this.f16518b.f16452k != null && this.f16518b.f16452k.mo49159s(this.f16521e) && this.f16518b.f16455n != null && this.f16518b.f16455n.f16513c.get() != 1 && this.f16518b.f16455n.f16513c.get() != 3 && !C6738a.this.f16430G.contains(Integer.valueOf(this.f16521e))) {
                C6738a.this.f16430G.add(Integer.valueOf(this.f16521e));
                int A = this.f16518b.f16452k.mo49114A() * 1000;
                if (this.f16521e == 4) {
                    A = PathInterpolatorCompat.MAX_NUM_POINTS;
                }
                Handler handler = this.f16520d;
                if (handler != null) {
                    handler.removeMessages(1001001);
                    this.f16520d.sendEmptyMessageDelayed(1001001, (long) A);
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        if (C6753d.this.f16518b != null) {
                            C6753d.this.f16518b.mo46986d(false);
                        }
                    }
                }, (long) A);
            }
        }
    }

    /* renamed from: a */
    public final void mo46976a(InterVideoOutListener interVideoOutListener) {
        this.f16454m = interVideoOutListener;
        this.f16455n = new C6752c(interVideoOutListener, this.f16463v, this.f16457p);
    }

    /* renamed from: b */
    public final void mo46983b(String str, String str2) {
        List<CampaignEx> a;
        try {
            this.f16449h = C6122a.m15302b().mo42895d();
            this.f16457p = str2;
            this.f16460s = str;
            this.f16458q = new MBridgeIds(this.f16460s, this.f16457p);
            this.f16453l = C7177b.m18135a().mo49112b();
            C6801a.m17151a(this.f16449h, this.f16457p);
            C6355o.m16145b();
            C7206j.m18320a().mo49236b();
            C7200h.m18303a().mo49225b();
            C7177b.m18135a().mo49109a(this.f16457p);
            if (!TextUtils.isEmpty(this.f16457p) && (a = C7167a.m18072a().mo49061a(this.f16457p, 1)) != null && a.size() > 0) {
                C7184c.getInstance().createUnitCache(this.f16449h, this.f16457p, a, 94, (C7212a) null);
            }
            if (this.f16434M == null) {
                this.f16434M = C6148f.m15420a(C6122a.m15302b().mo42895d());
            }
        } catch (Throwable th) {
            C6361q.m16155a("RewardVideoController", th.getMessage(), th);
        }
    }

    /* renamed from: d */
    public final void mo46986d(boolean z) {
        mo46980a(z, "");
    }

    /* renamed from: c */
    private void m16923c() {
        C6143d.m15367a((C6146e) C6148f.m15420a(this.f16449h)).mo42960a(this.f16457p);
    }

    /* renamed from: d */
    private void m16927d() {
        try {
            List<CampaignEx> b = C6143d.m15367a((C6146e) C6148f.m15420a(this.f16449h)).mo42976b(this.f16457p);
            if (b != null && b.size() > 0) {
                for (CampaignEx next : b) {
                    if (!TextUtils.isEmpty(next.getMof_template_url())) {
                        C7165a.m18063b(this.f16457p + "_" + next.getRequestId() + "_" + next.getMof_template_url());
                        if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().mo43510d())) {
                            C7165a.m18063b(this.f16457p + "_" + next.getId() + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo43510d());
                        }
                    } else {
                        C7165a.m18061b(next.getAdType(), next);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo46980a(boolean z, String str) {
        if (this.f16455n == null || this.f16455n.f16513c.get() != 1) {
            if (this.f16455n == null || this.f16455n.f16513c.get() != 3) {
                this.f16435N = true;
                this.f16455n.f16513c.set(1);
            } else {
                this.f16435N = false;
            }
            this.f16428E = z;
            this.f16463v.removeMessages(1001001);
            this.f16438Q = false;
            this.f16437P = false;
            this.f16439R = false;
            this.f16440S = false;
            m16927d();
            m16923c();
            C6759c.m17019a().mo47019b();
            try {
                if (TextUtils.isEmpty(str)) {
                    if (this.f16424A) {
                        C6094b.getInstance().addInterstitialList(this.f16460s, this.f16457p);
                    } else {
                        C6094b.getInstance().addRewardList(this.f16460s, this.f16457p);
                    }
                }
                if (!this.f16425B || !TextUtils.isEmpty(str)) {
                    if (C6812a.f16823a != null) {
                        C7179c a = C7177b.m18135a().mo49107a(C6122a.m15302b().mo42896e(), this.f16457p);
                        this.f16452k = a;
                        if (a == null) {
                            this.f16433L = C6122a.m15302b().mo42896e();
                            C7177b.m18135a().mo49111a(this.f16433L, C6122a.m15302b().mo42897f(), this.f16457p, new C7175c() {
                                /* renamed from: a */
                                public final void mo46989a(String str) {
                                }

                                /* renamed from: b */
                                public final void mo46990b(String str) {
                                }
                            });
                            this.f16452k = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f16457p, this.f16424A);
                        }
                        if (!TextUtils.isEmpty(this.f16460s)) {
                            this.f16452k.mo49125b(this.f16460s);
                        }
                        int D = this.f16452k.mo49117D() * 1000;
                        if (this.f16463v != null) {
                            this.f16463v.sendEmptyMessageDelayed(1001002, (long) D);
                        }
                        this.f16432K = this.f16452k.mo49115B();
                        try {
                            if (m16934f()) {
                                m16930e();
                            }
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            m16919b(z, str);
                        } catch (Exception e2) {
                            if (this.f16442U != null && this.f16442U.size() > 0) {
                                Context context = this.f16449h;
                                C6801a.m17157c(this.f16442U.get(0), context, "load exception: " + e2.getMessage(), this.f16457p, this.f16425B, "", "");
                            }
                            if (this.f16455n != null) {
                                C6752c.m16992a(this.f16455n, "load exception");
                            }
                        }
                    } else if (this.f16455n != null) {
                        if (this.f16442U != null && this.f16442U.size() > 0) {
                            C6801a.m17156b(this.f16442U.get(0), this.f16449h, "init error", this.f16457p, this.f16425B, "", "");
                        }
                        C6752c.m16998c(this.f16455n, "init error");
                    }
                } else if (this.f16455n != null) {
                    if (this.f16442U != null && this.f16442U.size() > 0) {
                        C6801a.m17156b(this.f16442U.get(0), this.f16449h, "bidToken is empty", this.f16457p, this.f16425B, "", "");
                    }
                    C6752c.m16998c(this.f16455n, "bidToken is empty");
                }
            } catch (Exception e3) {
                if (this.f16455n != null) {
                    C6752c.m16992a(this.f16455n, "load exception");
                    List<CampaignEx> list = this.f16442U;
                    if (list != null && list.size() > 0) {
                        Context context2 = this.f16449h;
                        C6801a.m17156b(this.f16442U.get(0), context2, "load exception " + e3.getMessage(), this.f16457p, this.f16425B, "", "");
                    }
                }
                if (MBridgeConstans.DEBUG) {
                    e3.printStackTrace();
                }
            }
        } else if (this.f16428E) {
            if (z) {
                List<CampaignEx> list2 = this.f16442U;
                if (list2 != null && list2.size() > 0) {
                    C6801a.m17156b(this.f16442U.get(0), this.f16449h, "current unit is loading", this.f16457p, this.f16425B, "", "");
                }
                this.f16455n.m16994a("errorCode: 3501 errorMessage: current unit is loading");
            }
        } else if (z) {
            this.f16428E = z;
        }
    }

    /* renamed from: b */
    private void m16919b(boolean z, String str) {
        if (this.f16455n == null) {
            return;
        }
        if (!this.f16425B) {
            this.f16441T = m16921b(this.f16457p);
            if (!this.f16441T) {
                this.f16441T = false;
                C6779d dVar = this.f16451j;
                if (dVar != null) {
                    dVar.mo47042a(this.f16442U);
                }
                this.f16455n.mo47002a(this.f16425B);
                m16916a(this.f16432K, z, str);
            } else if (!m16942j()) {
                List<CampaignEx> list = this.f16442U;
                if (list != null && list.size() > 0) {
                    C6752c.m16999c(this.f16455n, this.f16460s, this.f16457p);
                    CampaignEx campaignEx = list.get(0);
                    this.f16455n.mo47002a(this.f16425B);
                    C6779d dVar2 = this.f16451j;
                    if (dVar2 == null || !dVar2.mo47043a(list, true ^ TextUtils.isEmpty(campaignEx.getMof_template_url()), campaignEx.getNscpt())) {
                        m16915a(list, this.f16451j);
                    } else {
                        C6801a.m17153a(this.f16449h, this.f16442U, this.f16457p, 0);
                        C6752c.m16997b(this.f16455n, this.f16460s, this.f16457p);
                    }
                    if (this.f16435N) {
                        C6779d dVar3 = this.f16451j;
                        if (dVar3 != null) {
                            dVar3.mo47042a(this.f16442U);
                        }
                        m16916a(this.f16432K, z, str);
                    }
                }
            } else {
                this.f16441T = false;
                C6779d dVar4 = this.f16451j;
                if (dVar4 != null) {
                    dVar4.mo47042a(this.f16442U);
                }
                this.f16455n.mo47002a(this.f16425B);
                m16916a(this.f16432K, z, str);
            }
        } else {
            List<CampaignEx> a = C7167a.m18072a().mo49064a(this.f16457p, str);
            if (a == null || a.size() <= 0) {
                C7167a.m18072a().mo49076b(this.f16457p, str);
                this.f16441T = false;
                this.f16455n.mo47002a(this.f16425B);
                m16916a(this.f16432K, z, str);
            } else if (!m16942j()) {
                this.f16441T = true;
                this.f16455n.mo47002a(this.f16425B);
                C6752c.m16999c(this.f16455n, this.f16460s, this.f16457p);
                CampaignEx campaignEx2 = a.get(0);
                m16914a(campaignEx2.getRequestId(), str);
                C6779d dVar5 = this.f16451j;
                if (dVar5 == null || !dVar5.mo47043a(a, true ^ TextUtils.isEmpty(campaignEx2.getMof_template_url()), campaignEx2.getNscpt())) {
                    m16915a(a, this.f16451j);
                    return;
                }
                C6801a.m17153a(this.f16449h, this.f16442U, this.f16457p, 0);
                C6752c.m16997b(this.f16455n, this.f16460s, this.f16457p);
            } else {
                C7167a.m18072a().mo49076b(this.f16457p, str);
                this.f16441T = false;
                C6779d dVar6 = this.f16451j;
                if (dVar6 != null) {
                    dVar6.mo47042a(a);
                }
                this.f16455n.mo47002a(this.f16425B);
                m16916a(this.f16432K, z, str);
            }
        }
    }

    /* renamed from: a */
    private void m16915a(List<CampaignEx> list, C6779d dVar) {
        final CampaignEx campaignEx = list.get(0);
        final boolean z = !TextUtils.isEmpty(campaignEx.getMof_template_url());
        final int nscpt = campaignEx.getNscpt();
        this.f16444c = false;
        this.f16445d = false;
        this.f16446e = false;
        this.f16447f = false;
        this.f16448g = false;
        C6759c a = C6759c.m17019a();
        Context context = this.f16449h;
        boolean z2 = this.f16425B;
        int i = this.f16424A ? 287 : 94;
        final boolean z3 = z;
        final CampaignEx campaignEx2 = campaignEx;
        final C6779d dVar2 = dVar;
        final int i2 = nscpt;
        int i3 = nscpt;
        final boolean z4 = z;
        CampaignEx campaignEx3 = campaignEx;
        a.mo47016a(context, z, nscpt, z2, i, this.f16460s, this.f16457p, campaignEx.getRequestId(), list, new C6759c.C6766c() {
            /* renamed from: a */
            public final void mo46991a(String str, String str2, String str3, List<CampaignEx> list) {
                String str4 = str2;
                List<CampaignEx> list2 = list;
                C6738a.this.f16444c = true;
                if (!z3) {
                    for (final CampaignEx next : list) {
                        if (next == null || next.getRewardTemplateMode() == null || TextUtils.isEmpty(next.getRewardTemplateMode().mo43510d()) || C6738a.this.f16463v == null) {
                            C6779d dVar = dVar2;
                            if (dVar == null || !dVar.mo47043a(list2, z3, i2)) {
                                String str5 = str;
                                C6738a aVar = C6738a.this;
                                C6738a.m16912a(aVar, str4, aVar.f16443V);
                                if (C6738a.this.f16455n != null && !C6738a.this.f16447f) {
                                    C6738a.this.f16447f = true;
                                    C6361q.m16154a("RewardVideoController", "Cache onVideoLoadFailForCache");
                                    if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                        C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), C6738a.this.f16449h, "have no temp but isReady false", C6738a.this.f16457p, C6738a.this.f16425B, str3, next.getRequestIdNotice());
                                    }
                                    C6752c.m17000d(C6738a.this.f16455n, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                }
                            } else if (C6738a.this.f16455n != null && !C6738a.this.f16448g) {
                                C6738a.this.f16448g = true;
                                C6361q.m16154a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                C6801a.m17153a(C6738a.this.f16449h, list2, C6738a.this.f16457p, 0);
                                C6752c.m16997b(C6738a.this.f16455n, str, str4);
                            }
                        } else {
                            final List<CampaignEx> list3 = list;
                            final String str6 = str;
                            final String str7 = str2;
                            final String str8 = str3;
                            C6738a.this.f16463v.post(new Runnable() {
                                public final void run() {
                                    C6759c a = C6759c.m17019a();
                                    boolean r = C6738a.this.f16429F;
                                    Handler q = C6738a.this.f16463v;
                                    boolean p = C6738a.this.f16424A;
                                    boolean i = C6738a.this.f16425B;
                                    String d = next.getRewardTemplateMode().mo43510d();
                                    int s = C6738a.this.f16464w;
                                    CampaignEx campaignEx = campaignEx2;
                                    List list = list3;
                                    String b = C7191g.m18286a().mo49220b(next.getRewardTemplateMode().mo43510d());
                                    String str = str6;
                                    String str2 = str7;
                                    String str3 = str8;
                                    String requestIdNotice = next.getRequestIdNotice();
                                    C7179c l = C6738a.this.f16452k;
                                    C67431 r17 = r6;
                                    C67431 r6 = new C6759c.C6773j() {
                                        /* renamed from: a */
                                        public final void mo46994a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar) {
                                            if (dVar2 == null || !dVar2.mo47043a((List<CampaignEx>) list3, z3, i2)) {
                                                C6738a.m16912a(C6738a.this, str3, C6738a.this.f16443V);
                                                if (C6738a.this.f16455n != null && !C6738a.this.f16447f) {
                                                    C6738a.this.f16447f = true;
                                                    if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                                        C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), C6738a.this.f16449h, "temp preload success but isReady false", C6738a.this.f16457p, C6738a.this.f16425B, str4, next.getRequestIdNotice());
                                                    }
                                                    C6752c.m17000d(C6738a.this.f16455n, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                                }
                                            } else if (C6738a.this.f16455n != null && !C6738a.this.f16448g) {
                                                C6738a.this.f16448g = true;
                                                C6801a.m17153a(C6738a.this.f16449h, list3, C6738a.this.f16457p, 0);
                                                C6752c.m16997b(C6738a.this.f16455n, str2, str3);
                                            }
                                        }

                                        /* renamed from: a */
                                        public final void mo46995a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar, String str6) {
                                            C6738a.m16912a(C6738a.this, str3, C6738a.this.f16443V);
                                            if (C6738a.this.f16455n != null && !C6738a.this.f16447f) {
                                                C6738a.this.f16447f = true;
                                                if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                                    Context m = C6738a.this.f16449h;
                                                    C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), m, "temp preload failed: " + str6, C6738a.this.f16457p, C6738a.this.f16425B, str4, next.getRequestIdNotice());
                                                }
                                                C6752c d = C6738a.this.f16455n;
                                                C6752c.m17000d(d, "errorCode: 3301 errorMessage: temp preload failed: " + str6);
                                            }
                                        }
                                    };
                                    a.mo47017a(r, q, p, i, (WindVaneWebView) null, d, s, campaignEx, list, b, str, str2, str3, requestIdNotice, l, r17);
                                }
                            });
                        }
                        String str9 = str;
                    }
                    return;
                }
                String str10 = str;
                if (C6738a.this.f16445d && !C6738a.this.f16446e && C6738a.this.f16463v != null) {
                    C6738a.this.f16446e = true;
                    final String str11 = str3;
                    final String str12 = str;
                    final String str13 = str2;
                    final List<CampaignEx> list4 = list;
                    C6738a.this.f16463v.post(new Runnable() {
                        public final void run() {
                            C6759c a = C6759c.m17019a();
                            boolean r = C6738a.this.f16429F;
                            Handler q = C6738a.this.f16463v;
                            boolean p = C6738a.this.f16424A;
                            boolean i = C6738a.this.f16425B;
                            String str = str11;
                            String requestIdNotice = campaignEx2.getRequestIdNotice();
                            String str2 = str12;
                            String str3 = str13;
                            String mof_template_url = campaignEx2.getMof_template_url();
                            int s = C6738a.this.f16464w;
                            CampaignEx campaignEx = campaignEx2;
                            List list = list4;
                            String b = C7191g.m18286a().mo49220b(campaignEx2.getMof_template_url());
                            String str4 = str13;
                            C6759c cVar = a;
                            C7179c l = C6738a.this.f16452k;
                            C67451 r17 = r1;
                            C67451 r1 = new C6759c.C6773j() {
                                /* renamed from: a */
                                public final void mo46994a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar) {
                                    if (dVar2 == null || !dVar2.mo47043a((List<CampaignEx>) list4, z3, i2)) {
                                        C6738a.m16912a(C6738a.this, str3, C6738a.this.f16443V);
                                        if (C6738a.this.f16455n != null && !C6738a.this.f16447f) {
                                            C6738a.this.f16447f = true;
                                            if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                                C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), C6738a.this.f16449h, "tpl temp preload success but isReady false", C6738a.this.f16457p, C6738a.this.f16425B, str4, campaignEx2.getRequestIdNotice());
                                            }
                                            C6752c.m17000d(C6738a.this.f16455n, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                                        }
                                    } else if (C6738a.this.f16455n != null && !C6738a.this.f16448g) {
                                        C6738a.this.f16448g = true;
                                        C6361q.m16154a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                        C6801a.m17153a(C6738a.this.f16449h, list4, C6738a.this.f16457p, 0);
                                        C6752c.m16997b(C6738a.this.f16455n, str2, str3);
                                    }
                                }

                                /* renamed from: a */
                                public final void mo46995a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar, String str6) {
                                    C6738a.m16912a(C6738a.this, str3, C6738a.this.f16443V);
                                    if (C6738a.this.f16455n != null && !C6738a.this.f16447f) {
                                        C6738a.this.f16447f = true;
                                        if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                            Context m = C6738a.this.f16449h;
                                            C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), m, "tpl temp preload failed: " + str6, C6738a.this.f16457p, C6738a.this.f16425B, str4, campaignEx2.getRequestIdNotice());
                                        }
                                        C6752c d = C6738a.this.f16455n;
                                        C6752c.m17000d(d, "errorCode: 3302 errorMessage: tpl temp preload failed: " + str6);
                                    }
                                }
                            };
                            cVar.mo47018a(r, q, p, i, str, requestIdNotice, str2, str3, mof_template_url, s, campaignEx, list, b, str4, l, r17, true);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo46992a(String str, String str2, String str3, List<CampaignEx> list, String str4) {
                C6738a.this.f16444c = false;
                C6738a aVar = C6738a.this;
                C6738a.m16912a(aVar, str2, aVar.f16443V);
                if (C6738a.this.f16455n != null && !C6738a.this.f16447f) {
                    C6738a.this.f16447f = true;
                    if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                        Context m = C6738a.this.f16449h;
                        C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), m, "" + str4, C6738a.this.f16457p, C6738a.this.f16425B, str3, campaignEx2.getRequestIdNotice());
                    }
                    C6752c.m17000d(C6738a.this.f16455n, "errorCode: 3201 errorMessage: campaign resource download failed");
                }
            }
        }, new C6759c.C6772i() {
            /* renamed from: a */
            public final void mo46997a(String str, String str2, String str3, String str4) {
            }

            /* renamed from: a */
            public final void mo46998a(String str, String str2, String str3, String str4, String str5) {
                C6738a aVar = C6738a.this;
                C6738a.m16912a(aVar, str2, aVar.f16443V);
                if (z || C6738a.this.f16455n == null) {
                    if (nscpt == 1 && !C6738a.this.f16447f && C6738a.this.f16455n != null) {
                        C6738a.this.f16447f = true;
                        if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                            C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), C6738a.this.f16449h, "temp resource download failed", C6738a.this.f16457p, C6738a.this.f16425B, str3, campaignEx.getRequestIdNotice());
                        }
                        C6752c.m17000d(C6738a.this.f16455n, "errorCode: 3202 errorMessage: temp resource download failed");
                    }
                } else if (!C6738a.this.f16447f) {
                    C6738a.this.f16447f = true;
                    if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                        Context m = C6738a.this.f16449h;
                        C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), m, "" + str5, C6738a.this.f16457p, C6738a.this.f16425B, str3, campaignEx.getRequestIdNotice());
                    }
                    C6752c.m17000d(C6738a.this.f16455n, "errorCode: 3202 errorMessage: temp resource download failed");
                }
            }
        });
        if (z4) {
            final CampaignEx campaignEx4 = campaignEx3;
            final List<CampaignEx> list2 = list;
            final C6779d dVar3 = dVar;
            final int i4 = i3;
            C6759c.m17019a().mo47015a(this.f16449h, campaignEx3, this.f16460s, this.f16457p, campaignEx3.getRequestId(), new C6759c.C6772i() {
                /* renamed from: a */
                public final void mo46997a(final String str, final String str2, final String str3, String str4) {
                    C6738a.this.f16445d = true;
                    if (C6738a.this.f16444c && !C6738a.this.f16446e && C6738a.this.f16463v != null) {
                        C6738a.this.f16446e = true;
                        C6738a.this.f16463v.post(new Runnable() {
                            public final void run() {
                                C6759c a = C6759c.m17019a();
                                boolean r = C6738a.this.f16429F;
                                Handler q = C6738a.this.f16463v;
                                boolean p = C6738a.this.f16424A;
                                boolean i = C6738a.this.f16425B;
                                String str = str3;
                                String requestIdNotice = campaignEx4.getRequestIdNotice();
                                String str2 = str;
                                String str3 = str2;
                                String mof_template_url = campaignEx4.getMof_template_url();
                                int s = C6738a.this.f16464w;
                                CampaignEx campaignEx = campaignEx4;
                                List list = list2;
                                String b = C7191g.m18286a().mo49220b(campaignEx4.getMof_template_url());
                                String str4 = str2;
                                C6759c cVar = a;
                                C7179c l = C6738a.this.f16452k;
                                C67491 r17 = r1;
                                C67491 r1 = new C6759c.C6773j() {
                                    /* renamed from: a */
                                    public final void mo46994a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar) {
                                        if (!dVar3.mo47043a((List<CampaignEx>) list2, z4, i4)) {
                                            C6738a.m16912a(C6738a.this, str3, C6738a.this.f16443V);
                                            if (C6738a.this.f16455n != null && !C6738a.this.f16447f) {
                                                C6738a.this.f16447f = true;
                                                if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                                    C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), C6738a.this.f16449h, "tpl temp preload success but isReady false", C6738a.this.f16457p, C6738a.this.f16425B, str4, campaignEx4.getRequestIdNotice());
                                                }
                                                C6752c.m17000d(C6738a.this.f16455n, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                            }
                                        } else if (C6738a.this.f16455n != null && !C6738a.this.f16448g) {
                                            C6738a.this.f16448g = true;
                                            C6361q.m16154a("RewardVideoController", "Cache onVideoLoadSuccess");
                                            C6801a.m17153a(C6738a.this.f16449h, list2, C6738a.this.f16457p, 0);
                                            C6752c.m16997b(C6738a.this.f16455n, str2, str3);
                                        }
                                    }

                                    /* renamed from: a */
                                    public final void mo46995a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar, String str6) {
                                        C6738a.m16912a(C6738a.this, str3, C6738a.this.f16443V);
                                        if (C6738a.this.f16455n != null && !C6738a.this.f16447f) {
                                            C6738a.this.f16447f = true;
                                            if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                                                Context m = C6738a.this.f16449h;
                                                C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), m, "tpl temp preload failed: " + str6, C6738a.this.f16457p, C6738a.this.f16425B, str4, campaignEx4.getRequestIdNotice());
                                            }
                                            C6752c d = C6738a.this.f16455n;
                                            C6752c.m17000d(d, "errorCode: 3303 errorMessage: tpl temp preload failed: " + str6);
                                        }
                                    }
                                };
                                cVar.mo47018a(r, q, p, i, str, requestIdNotice, str2, str3, mof_template_url, s, campaignEx, list, b, str4, l, r17, true);
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo46998a(String str, String str2, String str3, String str4, String str5) {
                    C6738a aVar = C6738a.this;
                    C6738a.m16912a(aVar, str2, aVar.f16443V);
                    C6738a.this.f16445d = false;
                    if (C6738a.this.f16455n != null && !C6738a.this.f16447f) {
                        C6738a.this.f16447f = true;
                        if (C6738a.this.f16442U != null && C6738a.this.f16442U.size() > 0) {
                            Context m = C6738a.this.f16449h;
                            C6801a.m17154a((CampaignEx) C6738a.this.f16442U.get(0), m, "" + str5, C6738a.this.f16457p, C6738a.this.f16425B, str3, campaignEx4.getRequestIdNotice());
                        }
                        C6752c.m17000d(C6738a.this.f16455n, "errorCode: 3203 errorMessage: tpl temp resource download failed");
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private boolean m16921b(String str) {
        try {
            if (this.f16451j == null || !str.equals(this.f16451j.mo47033a())) {
                C6779d dVar = new C6779d(this.f16449h, this.f16460s, str);
                this.f16451j = dVar;
                dVar.mo47045b(this.f16424A);
                this.f16451j.mo47047c(this.f16425B);
            }
            this.f16451j.mo47035a(this.f16464w);
            this.f16451j.mo47040a(this.f16452k);
        } catch (Exception unused) {
        }
        List<CampaignEx> a = C7167a.m18072a().mo49062a(str, 1, this.f16425B);
        this.f16443V = C7167a.m18072a().mo49073b(str, 1, this.f16425B);
        if (a == null || a.size() <= 0) {
            List<CampaignEx> list = this.f16442U;
            if (list == null) {
                return false;
            }
            list.clear();
            return false;
        }
        List<CampaignEx> list2 = this.f16442U;
        if (list2 == null) {
            this.f16442U = new ArrayList();
        } else {
            list2.clear();
        }
        this.f16442U.addAll(a);
        return true;
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$c */
    /* compiled from: RewardVideoController */
    private final class C6752c {

        /* renamed from: b */
        private WeakReference<InterVideoOutListener> f16512b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public volatile AtomicInteger f16513c;

        /* renamed from: d */
        private Handler f16514d;

        /* renamed from: e */
        private String f16515e;

        /* renamed from: f */
        private boolean f16516f;

        private C6752c(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f16512b = new WeakReference<>(interVideoOutListener);
            this.f16513c = new AtomicInteger(0);
            this.f16514d = handler;
            this.f16515e = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m16994a(String str) {
            if (this.f16514d != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                this.f16514d.sendMessage(obtain);
            }
        }

        /* renamed from: a */
        public final void mo47002a(boolean z) {
            this.f16516f = z;
        }

        /* renamed from: a */
        static /* synthetic */ void m16993a(C6752c cVar, String str, String str2) {
            Handler handler = cVar.f16514d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = cVar.f16512b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f16513c.get() == 1 || cVar.f16513c.get() == 3) && cVar.f16514d != null) {
                    cVar.f16513c.set(2);
                    if (!C6738a.this.f16438Q) {
                        boolean unused = C6738a.this.f16438Q = true;
                        Message obtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                        obtain.setData(bundle);
                        obtain.obj = str2;
                        obtain.what = 9;
                        cVar.f16514d.sendMessage(obtain);
                    }
                }
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m16992a(C6752c cVar, String str) {
            Handler handler = cVar.f16514d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = cVar.f16512b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f16513c.get() == 1 || cVar.f16513c.get() == 3) && cVar.f16514d != null) {
                    boolean unused = C6738a.this.f16439R = true;
                    if (!C6738a.this.f16441T || str.contains("resource load timeout")) {
                        boolean unused2 = C6738a.this.f16440S = true;
                    }
                    if (C6738a.this.f16438Q) {
                        cVar.f16513c.set(2);
                    }
                    if (C6738a.this.f16439R && C6738a.this.f16440S && !C6738a.this.f16438Q) {
                        cVar.f16513c.set(2);
                        Message obtain = Message.obtain();
                        obtain.obj = str;
                        obtain.what = 16;
                        cVar.f16514d.sendMessage(obtain);
                    }
                }
            }
        }

        /* renamed from: b */
        static /* synthetic */ void m16997b(C6752c cVar, String str, String str2) {
            Handler handler = cVar.f16514d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = cVar.f16512b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f16513c.get() == 1 || cVar.f16513c.get() == 3) && cVar.f16514d != null) {
                    if (cVar.f16513c.get() == 1) {
                        cVar.f16513c.set(3);
                    }
                    if (!C6738a.this.f16438Q) {
                        boolean unused = C6738a.this.f16438Q = true;
                        Message obtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                        obtain.setData(bundle);
                        obtain.obj = str2;
                        obtain.what = 9;
                        cVar.f16514d.sendMessage(obtain);
                        if (C6738a.this.f16439R) {
                            cVar.f16513c.set(2);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        static /* synthetic */ void m16998c(C6752c cVar, String str) {
            cVar.f16513c.set(2);
            cVar.m16994a(str);
        }

        /* renamed from: c */
        static /* synthetic */ void m16999c(C6752c cVar, String str, String str2) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f16512b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null && cVar.f16514d != null && !C6738a.this.f16437P) {
                boolean unused = C6738a.this.f16437P = true;
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 17;
                cVar.f16514d.sendMessage(obtain);
            }
        }

        /* renamed from: d */
        static /* synthetic */ void m17000d(C6752c cVar, String str) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f16512b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f16513c.get() == 1 || cVar.f16513c.get() == 3) && cVar.f16514d != null) {
                    boolean unused = C6738a.this.f16440S = true;
                    if (str.contains("resource load timeout")) {
                        boolean unused2 = C6738a.this.f16439R = true;
                    }
                    if (C6738a.this.f16440S && C6738a.this.f16439R && !C6738a.this.f16438Q) {
                        cVar.f16513c.set(2);
                        Message obtain = Message.obtain();
                        obtain.obj = str;
                        obtain.what = 16;
                        cVar.f16514d.sendMessage(obtain);
                    }
                }
            }
        }

        /* renamed from: d */
        static /* synthetic */ void m17001d(C6752c cVar, String str, String str2) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f16512b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f16513c.get() == 1 || cVar.f16513c.get() == 3) && cVar.f16514d != null && !C6738a.this.f16437P) {
                    boolean unused = C6738a.this.f16437P = true;
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 17;
                    cVar.f16514d.sendMessage(obtain);
                }
            }
        }
    }

    /* renamed from: e */
    private void m16930e() {
        try {
            List<C7169b> w = this.f16452k.mo49166w();
            if (w != null && w.size() > 0) {
                for (int i = 0; i < w.size(); i++) {
                    Context context = this.f16449h;
                    C6368w.m16233a(context, this.f16460s + "_" + w.get(i).mo49080a(), 0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private boolean m16934f() {
        int i;
        try {
            List<C7169b> w = this.f16452k.mo49166w();
            if (this.f16453l == null) {
                this.f16453l = C7177b.m18135a().mo49112b();
            }
            Map<String, Integer> h = this.f16453l.mo49104h();
            if (w == null || w.size() <= 0) {
                return true;
            }
            for (int i2 = 0; i2 < w.size(); i2++) {
                C7169b bVar = w.get(i2);
                if (h.containsKey(bVar.mo49080a() + "")) {
                    i = h.get(bVar.mo49080a() + "").intValue();
                } else {
                    i = 0;
                }
                Context context = this.f16449h;
                Object b = C6368w.m16234b(context, this.f16460s + "_" + bVar.mo49080a(), 0);
                if ((b != null ? ((Integer) b).intValue() : 0) < i) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            C6361q.m16158d("RewardVideoController", e.getMessage());
            return true;
        }
    }

    /* renamed from: a */
    private void m16916a(Queue<Integer> queue, boolean z, String str) {
        int i = 8;
        if (queue != null) {
            try {
                if (queue.size() > 0) {
                    i = queue.poll().intValue();
                }
            } catch (Exception e) {
                List<CampaignEx> list = this.f16442U;
                if (list != null && list.size() > 0) {
                    C6801a.m17156b(this.f16442U.get(0), this.f16449h, "can't show because unknow error", this.f16457p, this.f16425B, "", "");
                }
                m16924c("can't show because unknow error");
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        try {
            m16910a(1, i, z, str);
        } catch (Exception e2) {
            if (this.f16442U != null) {
                if (this.f16442U.size() > 0) {
                    Context context = this.f16449h;
                    C6801a.m17156b(this.f16442U.get(0), context, "load mv api error:" + e2.getMessage(), this.f16457p, this.f16425B, "", "");
                }
            }
            m16924c("load mv api error:" + e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m16924c(String str) {
        if (this.f16455n != null) {
            this.f16440S = true;
            C6752c.m16992a(this.f16455n, str);
        }
    }

    /* renamed from: a */
    private void m16910a(int i, int i2, boolean z, String str) {
        try {
            if (this.f16451j == null || !this.f16457p.equals(this.f16451j.mo47033a())) {
                C6779d dVar = new C6779d(this.f16449h, this.f16460s, this.f16457p);
                this.f16451j = dVar;
                dVar.mo47045b(this.f16424A);
                this.f16451j.mo47047c(this.f16425B);
            }
            if (this.f16424A) {
                this.f16451j.mo47036a(this.f16465x, this.f16466y, this.f16467z);
            }
            this.f16451j.mo47035a(this.f16464w);
            this.f16451j.mo47040a(this.f16452k);
            C6750a aVar = new C6750a(this.f16451j, i, z);
            C6751b bVar = new C6751b(this.f16451j, z);
            bVar.mo47001a((Runnable) aVar);
            this.f16451j.mo47014a((C6758b) bVar);
            this.f16463v.postDelayed(aVar, (long) (i2 * 1000));
            this.f16451j.mo47038a(i, i2, z, str, this.f16429F);
        } catch (Exception e) {
            List<CampaignEx> list = this.f16442U;
            if (list != null && list.size() > 0) {
                C6801a.m17156b(this.f16442U.get(0), this.f16449h, e.getMessage(), this.f16457p, this.f16425B, "", "");
            }
            m16924c(e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo46982b(int i) {
        try {
            if (this.f16434M == null) {
                this.f16434M = C6148f.m15420a(C6122a.m15302b().mo42895d());
            }
            C6149g a = C6149g.m15428a((C6146e) this.f16434M);
            if (a != null) {
                a.mo43006a(this.f16457p);
            }
        } catch (Throwable unused) {
            C6361q.m16158d("RewardVideoController", "can't find DailyPlayCapDao");
        }
        if (i == 1) {
            Context context = this.f16449h;
            C6368w.m16233a(context, this.f16460s + "_" + i, Integer.valueOf(this.f16450i + 1));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r7 = r13.f16453l.mo49104h();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16928d(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = "_"
            java.lang.String r2 = "RewardVideoController"
            r3 = 3
            r4 = 4
            r5 = 1
            r6 = 0
            com.mbridge.msdk.videocommon.d.a r7 = r13.f16453l     // Catch:{ Exception -> 0x015a }
            if (r7 == 0) goto L_0x0027
            com.mbridge.msdk.videocommon.d.a r7 = r13.f16453l     // Catch:{ Exception -> 0x015a }
            java.util.Map r7 = r7.mo49104h()     // Catch:{ Exception -> 0x015a }
            if (r7 == 0) goto L_0x0027
            boolean r8 = r7.containsKey(r0)     // Catch:{ Exception -> 0x015a }
            if (r8 == 0) goto L_0x0027
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x015a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x015a }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x015a }
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            android.content.Context r7 = r13.f16449h     // Catch:{ Exception -> 0x015a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015a }
            r8.<init>()     // Catch:{ Exception -> 0x015a }
            java.lang.String r9 = r13.f16460s     // Catch:{ Exception -> 0x015a }
            r8.append(r9)     // Catch:{ Exception -> 0x015a }
            r8.append(r1)     // Catch:{ Exception -> 0x015a }
            r8.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x015a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x015a }
            java.lang.Object r7 = com.mbridge.msdk.foundation.tools.C6368w.m16234b(r7, r8, r9)     // Catch:{ Exception -> 0x015a }
            if (r7 == 0) goto L_0x006e
            android.content.Context r7 = r13.f16449h     // Catch:{ Exception -> 0x015a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015a }
            r8.<init>()     // Catch:{ Exception -> 0x015a }
            java.lang.String r9 = r13.f16460s     // Catch:{ Exception -> 0x015a }
            r8.append(r9)     // Catch:{ Exception -> 0x015a }
            r8.append(r1)     // Catch:{ Exception -> 0x015a }
            r8.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x015a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x015a }
            java.lang.Object r7 = com.mbridge.msdk.foundation.tools.C6368w.m16234b(r7, r8, r9)     // Catch:{ Exception -> 0x015a }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x015a }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x015a }
            r13.f16450i = r7     // Catch:{ Exception -> 0x015a }
        L_0x006e:
            com.mbridge.msdk.reward.adapter.d r7 = r13.f16451j     // Catch:{ Exception -> 0x015a }
            if (r7 != 0) goto L_0x0075
            r13.m16939i()     // Catch:{ Exception -> 0x015a }
        L_0x0075:
            com.mbridge.msdk.reward.adapter.d r7 = r13.f16451j     // Catch:{ Exception -> 0x015a }
            if (r7 == 0) goto L_0x00f3
            java.lang.String r7 = "controller 819"
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r7)     // Catch:{ Exception -> 0x015a }
            boolean r7 = r13.f16425B     // Catch:{ Exception -> 0x015a }
            if (r7 == 0) goto L_0x0087
            boolean r7 = r13.m16936g()     // Catch:{ Exception -> 0x015a }
            goto L_0x008d
        L_0x0087:
            com.mbridge.msdk.reward.adapter.d r7 = r13.f16451j     // Catch:{ Exception -> 0x015a }
            boolean r7 = r7.mo47046b()     // Catch:{ Exception -> 0x015a }
        L_0x008d:
            if (r7 == 0) goto L_0x00bc
            int r1 = r13.f16450i     // Catch:{ Exception -> 0x015a }
            if (r1 < r0) goto L_0x0096
            if (r0 <= 0) goto L_0x0096
            return
        L_0x0096:
            java.lang.String r0 = "invoke adapter show isReady"
            com.mbridge.msdk.foundation.tools.C6361q.m16156b(r2, r0)     // Catch:{ Exception -> 0x015a }
            com.mbridge.msdk.reward.a.a$d r0 = new com.mbridge.msdk.reward.a.a$d     // Catch:{ Exception -> 0x015a }
            android.os.Handler r11 = r13.f16463v     // Catch:{ Exception -> 0x015a }
            r12 = 0
            r10 = 1
            r7 = r0
            r8 = r13
            r9 = r13
            r7.<init>(r9, r10, r11)     // Catch:{ Exception -> 0x015a }
            java.util.Map<java.lang.String, com.mbridge.msdk.reward.a.a$d> r1 = f16423b     // Catch:{ Exception -> 0x015a }
            java.lang.String r7 = r13.f16457p     // Catch:{ Exception -> 0x015a }
            r1.put(r7, r0)     // Catch:{ Exception -> 0x015a }
            com.mbridge.msdk.reward.adapter.d r7 = r13.f16451j     // Catch:{ Exception -> 0x015a }
            java.lang.String r10 = r13.f16456o     // Catch:{ Exception -> 0x015a }
            int r11 = r13.f16464w     // Catch:{ Exception -> 0x015a }
            java.lang.String r12 = r13.f16459r     // Catch:{ Exception -> 0x015a }
            r8 = r0
            r9 = r14
            r7.mo47039a((com.mbridge.msdk.video.p214bt.module.p217b.C6922h) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x015a }
            return
        L_0x00bc:
            boolean r0 = r13.f16425B     // Catch:{ Exception -> 0x015a }
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r13.m16938h()     // Catch:{ Exception -> 0x015a }
            goto L_0x00cb
        L_0x00c5:
            com.mbridge.msdk.reward.adapter.d r0 = r13.f16451j     // Catch:{ Exception -> 0x015a }
            boolean r0 = r0.mo47048c()     // Catch:{ Exception -> 0x015a }
        L_0x00cb:
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = "invoke adapter show isSpareOfferReady"
            com.mbridge.msdk.foundation.tools.C6361q.m16156b(r2, r0)     // Catch:{ Exception -> 0x015a }
            com.mbridge.msdk.reward.a.a$d r0 = new com.mbridge.msdk.reward.a.a$d     // Catch:{ Exception -> 0x015a }
            android.os.Handler r11 = r13.f16463v     // Catch:{ Exception -> 0x015a }
            r12 = 0
            r10 = 1
            r7 = r0
            r8 = r13
            r9 = r13
            r7.<init>(r9, r10, r11)     // Catch:{ Exception -> 0x015a }
            java.util.Map<java.lang.String, com.mbridge.msdk.reward.a.a$d> r1 = f16423b     // Catch:{ Exception -> 0x015a }
            java.lang.String r7 = r13.f16457p     // Catch:{ Exception -> 0x015a }
            r1.put(r7, r0)     // Catch:{ Exception -> 0x015a }
            com.mbridge.msdk.reward.adapter.d r7 = r13.f16451j     // Catch:{ Exception -> 0x015a }
            java.lang.String r10 = r13.f16456o     // Catch:{ Exception -> 0x015a }
            int r11 = r13.f16464w     // Catch:{ Exception -> 0x015a }
            java.lang.String r12 = r13.f16459r     // Catch:{ Exception -> 0x015a }
            r8 = r0
            r9 = r14
            r7.mo47039a((com.mbridge.msdk.video.p214bt.module.p217b.C6922h) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x015a }
            return
        L_0x00f3:
            int r0 = r13.f16450i     // Catch:{ Exception -> 0x015a }
            if (r0 == 0) goto L_0x0118
            android.content.Context r0 = r13.f16449h     // Catch:{ Exception -> 0x015a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015a }
            r7.<init>()     // Catch:{ Exception -> 0x015a }
            java.lang.String r8 = r13.f16460s     // Catch:{ Exception -> 0x015a }
            r7.append(r8)     // Catch:{ Exception -> 0x015a }
            r7.append(r1)     // Catch:{ Exception -> 0x015a }
            r7.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x015a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x015a }
            com.mbridge.msdk.foundation.tools.C6368w.m16233a(r0, r1, r7)     // Catch:{ Exception -> 0x015a }
            r13.m16928d((java.lang.String) r14)     // Catch:{ Exception -> 0x015a }
            return
        L_0x0118:
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r14 = r13.f16454m     // Catch:{ Exception -> 0x015a }
            if (r14 == 0) goto L_0x012e
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r14 = r13.f16454m     // Catch:{ Exception -> 0x0126 }
            com.mbridge.msdk.out.MBridgeIds r0 = r13.f16458q     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = "can't show because load is failed"
            r14.onShowFail(r0, r1)     // Catch:{ Exception -> 0x0126 }
            goto L_0x012e
        L_0x0126:
            r14 = move-exception
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x015a }
            if (r0 == 0) goto L_0x012e
            r14.printStackTrace()     // Catch:{ Exception -> 0x015a }
        L_0x012e:
            boolean r14 = r13.f16424A     // Catch:{ Exception -> 0x015a }
            if (r14 != 0) goto L_0x01a5
            boolean r14 = r13.f16425B     // Catch:{ Exception -> 0x015a }
            if (r14 != 0) goto L_0x01a5
            com.mbridge.msdk.videocommon.d.c r14 = r13.f16452k     // Catch:{ Exception -> 0x015a }
            if (r14 == 0) goto L_0x01a5
            com.mbridge.msdk.videocommon.d.c r14 = r13.f16452k     // Catch:{ Exception -> 0x015a }
            boolean r14 = r14.mo49159s(r4)     // Catch:{ Exception -> 0x015a }
            if (r14 == 0) goto L_0x01a5
            com.mbridge.msdk.reward.a.a$c r14 = r13.f16455n     // Catch:{ Exception -> 0x015a }
            if (r14 == 0) goto L_0x01a5
            com.mbridge.msdk.reward.a.a$c r14 = r13.f16455n     // Catch:{ Exception -> 0x015a }
            int r14 = r14.f16513c.get()     // Catch:{ Exception -> 0x015a }
            if (r14 == r5) goto L_0x01a5
            com.mbridge.msdk.reward.a.a$c r14 = r13.f16455n     // Catch:{ Exception -> 0x015a }
            int r14 = r14.f16513c.get()     // Catch:{ Exception -> 0x015a }
            if (r14 == r3) goto L_0x01a5
            r13.mo46986d((boolean) r6)     // Catch:{ Exception -> 0x015a }
            goto L_0x01a5
        L_0x015a:
            r14 = move-exception
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto L_0x0166
            java.lang.String r0 = r14.getLocalizedMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
        L_0x0166:
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r0 = r13.f16454m
            if (r0 == 0) goto L_0x017c
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r0 = r13.f16454m     // Catch:{ Exception -> 0x0174 }
            com.mbridge.msdk.out.MBridgeIds r1 = r13.f16458q     // Catch:{ Exception -> 0x0174 }
            java.lang.String r2 = "show exception"
            r0.onShowFail(r1, r2)     // Catch:{ Exception -> 0x0174 }
            goto L_0x017c
        L_0x0174:
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto L_0x017c
            r14.printStackTrace()
        L_0x017c:
            boolean r14 = r13.f16424A
            if (r14 != 0) goto L_0x01a5
            boolean r14 = r13.f16425B
            if (r14 != 0) goto L_0x01a5
            com.mbridge.msdk.videocommon.d.c r14 = r13.f16452k
            if (r14 == 0) goto L_0x01a5
            boolean r14 = r14.mo49159s(r4)
            if (r14 == 0) goto L_0x01a5
            com.mbridge.msdk.reward.a.a$c r14 = r13.f16455n
            if (r14 == 0) goto L_0x01a5
            com.mbridge.msdk.reward.a.a$c r14 = r13.f16455n
            int r14 = r14.f16513c.get()
            if (r14 == r5) goto L_0x01a5
            com.mbridge.msdk.reward.a.a$c r14 = r13.f16455n
            int r14 = r14.f16513c.get()
            if (r14 == r3) goto L_0x01a5
            r13.mo46986d((boolean) r6)
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p209a.C6738a.m16928d(java.lang.String):void");
    }

    /* renamed from: e */
    public final boolean mo46987e(boolean z) {
        try {
            if (m16942j()) {
                return false;
            }
            if (this.f16425B) {
                try {
                    return m16936g();
                } catch (Exception unused) {
                    return false;
                }
            } else {
                if (this.f16451j == null) {
                    m16939i();
                }
                if (this.f16451j == null) {
                    return false;
                }
                boolean b = this.f16451j.mo47046b();
                return !b ? this.f16451j.mo47048c() : b;
            }
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    private boolean m16936g() {
        if (this.f16451j == null) {
            m16939i();
        }
        List<C6192b> a = C7167a.m18072a().mo49060a(this.f16457p);
        if (a == null || a.size() <= 0) {
            return false;
        }
        for (C6192b next : a) {
            if (next != null) {
                this.f16451j.mo47041a(next.mo43592a());
                if (this.f16451j.mo47046b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private boolean m16938h() {
        if (this.f16451j == null) {
            m16939i();
        }
        for (C6192b next : C7167a.m18072a().mo49060a(this.f16457p)) {
            if (next != null) {
                this.f16451j.mo47041a(next.mo43592a());
                if (this.f16451j.mo47048c()) {
                    return true;
                }
                C7167a.m18072a().mo49079c(this.f16457p, next.mo43592a());
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m16939i() {
        C6779d dVar = new C6779d(this.f16449h, this.f16460s, this.f16457p);
        this.f16451j = dVar;
        dVar.mo47045b(this.f16424A);
        this.f16451j.mo47047c(this.f16425B);
        if (this.f16424A) {
            this.f16451j.mo47036a(this.f16465x, this.f16466y, this.f16467z);
        }
        this.f16451j.mo47040a(this.f16452k);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:112|(1:114)|115|116|(1:122)|123|124|192) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x019a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46977a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "reward_date"
            r1 = 3
            r2 = 4
            r3 = 0
            r4 = 1
            r6.f16461t = r7     // Catch:{ Exception -> 0x019e }
            r6.f16456o = r8     // Catch:{ Exception -> 0x019e }
            r6.f16459r = r9     // Catch:{ Exception -> 0x019e }
            com.mbridge.msdk.reward.a.a$c r8 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x0060
            com.mbridge.msdk.reward.a.a$c r8 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            java.util.concurrent.atomic.AtomicInteger r8 = r8.f16513c     // Catch:{ Exception -> 0x019e }
            int r8 = r8.get()     // Catch:{ Exception -> 0x019e }
            if (r8 != r4) goto L_0x0060
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f16454m     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x0034
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f16454m     // Catch:{ Exception -> 0x002c }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f16458q     // Catch:{ Exception -> 0x002c }
            java.lang.String r0 = "campaing is loading"
            r7.onShowFail(r8, r0)     // Catch:{ Exception -> 0x002c }
            goto L_0x0034
        L_0x002c:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x019e }
            if (r8 == 0) goto L_0x0034
            r7.printStackTrace()     // Catch:{ Exception -> 0x019e }
        L_0x0034:
            boolean r7 = r6.f16424A     // Catch:{ Exception -> 0x019e }
            if (r7 != 0) goto L_0x005f
            boolean r7 = r6.f16425B     // Catch:{ Exception -> 0x019e }
            if (r7 != 0) goto L_0x005f
            com.mbridge.msdk.videocommon.d.c r7 = r6.f16452k     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x005f
            com.mbridge.msdk.videocommon.d.c r7 = r6.f16452k     // Catch:{ Exception -> 0x019e }
            boolean r7 = r7.mo49159s(r2)     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x005f
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x005f
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            int r7 = r7.f16513c.get()     // Catch:{ Exception -> 0x019e }
            if (r7 == r4) goto L_0x005f
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            int r7 = r7.f16513c.get()     // Catch:{ Exception -> 0x019e }
            if (r7 == r1) goto L_0x005f
            r6.mo46980a((boolean) r3, (java.lang.String) r9)     // Catch:{ Exception -> 0x019e }
        L_0x005f:
            return
        L_0x0060:
            android.content.Context r8 = r6.f16449h     // Catch:{ Exception -> 0x019e }
            if (r8 != 0) goto L_0x00a6
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f16454m     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x007a
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f16454m     // Catch:{ Exception -> 0x0072 }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f16458q     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = "context is null"
            r7.onShowFail(r8, r0)     // Catch:{ Exception -> 0x0072 }
            goto L_0x007a
        L_0x0072:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x019e }
            if (r8 == 0) goto L_0x007a
            r7.printStackTrace()     // Catch:{ Exception -> 0x019e }
        L_0x007a:
            boolean r7 = r6.f16424A     // Catch:{ Exception -> 0x019e }
            if (r7 != 0) goto L_0x00a5
            boolean r7 = r6.f16425B     // Catch:{ Exception -> 0x019e }
            if (r7 != 0) goto L_0x00a5
            com.mbridge.msdk.videocommon.d.c r7 = r6.f16452k     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x00a5
            com.mbridge.msdk.videocommon.d.c r7 = r6.f16452k     // Catch:{ Exception -> 0x019e }
            boolean r7 = r7.mo49159s(r2)     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x00a5
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x00a5
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            int r7 = r7.f16513c.get()     // Catch:{ Exception -> 0x019e }
            if (r7 == r4) goto L_0x00a5
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            int r7 = r7.f16513c.get()     // Catch:{ Exception -> 0x019e }
            if (r7 == r1) goto L_0x00a5
            r6.mo46980a((boolean) r3, (java.lang.String) r9)     // Catch:{ Exception -> 0x019e }
        L_0x00a5:
            return
        L_0x00a6:
            boolean r8 = r6.f16424A     // Catch:{ Exception -> 0x019e }
            if (r8 == 0) goto L_0x00f4
            android.content.Context r8 = r6.f16449h     // Catch:{ Exception -> 0x019e }
            boolean r8 = com.mbridge.msdk.foundation.tools.C6366u.m16213c((android.content.Context) r8)     // Catch:{ Exception -> 0x019e }
            if (r8 != 0) goto L_0x00f4
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f16454m     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x00c8
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f16454m     // Catch:{ Exception -> 0x00c0 }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f16458q     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = "network exception"
            r7.onShowFail(r8, r0)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00c8
        L_0x00c0:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x019e }
            if (r8 == 0) goto L_0x00c8
            r7.printStackTrace()     // Catch:{ Exception -> 0x019e }
        L_0x00c8:
            boolean r7 = r6.f16424A     // Catch:{ Exception -> 0x019e }
            if (r7 != 0) goto L_0x00f3
            boolean r7 = r6.f16425B     // Catch:{ Exception -> 0x019e }
            if (r7 != 0) goto L_0x00f3
            com.mbridge.msdk.videocommon.d.c r7 = r6.f16452k     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x00f3
            com.mbridge.msdk.videocommon.d.c r7 = r6.f16452k     // Catch:{ Exception -> 0x019e }
            boolean r7 = r7.mo49159s(r2)     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x00f3
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x00f3
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            int r7 = r7.f16513c.get()     // Catch:{ Exception -> 0x019e }
            if (r7 == r4) goto L_0x00f3
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            int r7 = r7.f16513c.get()     // Catch:{ Exception -> 0x019e }
            if (r7 == r1) goto L_0x00f3
            r6.mo46980a((boolean) r3, (java.lang.String) r9)     // Catch:{ Exception -> 0x019e }
        L_0x00f3:
            return
        L_0x00f4:
            boolean r8 = r6.m16942j()     // Catch:{ Exception -> 0x019e }
            if (r8 == 0) goto L_0x013c
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f16454m     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x0110
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f16454m     // Catch:{ Exception -> 0x0108 }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f16458q     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = "Play more than limit"
            r7.onShowFail(r8, r0)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0110
        L_0x0108:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x019e }
            if (r8 == 0) goto L_0x0110
            r7.printStackTrace()     // Catch:{ Exception -> 0x019e }
        L_0x0110:
            boolean r7 = r6.f16424A     // Catch:{ Exception -> 0x019e }
            if (r7 != 0) goto L_0x013b
            boolean r7 = r6.f16425B     // Catch:{ Exception -> 0x019e }
            if (r7 != 0) goto L_0x013b
            com.mbridge.msdk.videocommon.d.c r7 = r6.f16452k     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x013b
            com.mbridge.msdk.videocommon.d.c r7 = r6.f16452k     // Catch:{ Exception -> 0x019e }
            boolean r7 = r7.mo49159s(r2)     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x013b
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            if (r7 == 0) goto L_0x013b
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            int r7 = r7.f16513c.get()     // Catch:{ Exception -> 0x019e }
            if (r7 == r4) goto L_0x013b
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n     // Catch:{ Exception -> 0x019e }
            int r7 = r7.f16513c.get()     // Catch:{ Exception -> 0x019e }
            if (r7 == r1) goto L_0x013b
            r6.mo46980a((boolean) r3, (java.lang.String) r9)     // Catch:{ Exception -> 0x019e }
        L_0x013b:
            return
        L_0x013c:
            java.lang.String r8 = r6.f16456o     // Catch:{ Exception -> 0x019e }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x019e }
            if (r8 == 0) goto L_0x014a
            java.lang.String r8 = com.mbridge.msdk.foundation.tools.C6349m.m16113i()     // Catch:{ Exception -> 0x019e }
            r6.f16456o = r8     // Catch:{ Exception -> 0x019e }
        L_0x014a:
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x019a }
            java.lang.String r9 = "dd"
            r8.<init>(r9)     // Catch:{ Exception -> 0x019a }
            java.util.Date r9 = new java.util.Date     // Catch:{ Exception -> 0x019a }
            r9.<init>()     // Catch:{ Exception -> 0x019a }
            java.lang.String r8 = r8.format(r9)     // Catch:{ Exception -> 0x019a }
            android.content.Context r9 = r6.f16449h     // Catch:{ Exception -> 0x019a }
            java.lang.String r5 = "0"
            java.lang.Object r9 = com.mbridge.msdk.foundation.tools.C6368w.m16234b(r9, r0, r5)     // Catch:{ Exception -> 0x019a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x019a }
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x019a }
            if (r5 != 0) goto L_0x019a
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x019a }
            if (r5 != 0) goto L_0x019a
            boolean r9 = r9.equals(r8)     // Catch:{ Exception -> 0x019a }
            if (r9 != 0) goto L_0x019a
            android.content.Context r9 = r6.f16449h     // Catch:{ Exception -> 0x019a }
            com.mbridge.msdk.foundation.tools.C6368w.m16233a(r9, r0, r8)     // Catch:{ Exception -> 0x019a }
            android.content.Context r8 = r6.f16449h     // Catch:{ Exception -> 0x019a }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019a }
            r9.<init>()     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = r6.f16460s     // Catch:{ Exception -> 0x019a }
            r9.append(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = "_"
            r9.append(r0)     // Catch:{ Exception -> 0x019a }
            r9.append(r4)     // Catch:{ Exception -> 0x019a }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x019a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x019a }
            com.mbridge.msdk.foundation.tools.C6368w.m16233a(r8, r9, r0)     // Catch:{ Exception -> 0x019a }
        L_0x019a:
            r6.m16928d((java.lang.String) r7)     // Catch:{ Exception -> 0x019e }
            goto L_0x01eb
        L_0x019e:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r8 == 0) goto L_0x01ac
            java.lang.String r8 = r7.getLocalizedMessage()
            java.lang.String r9 = "RewardVideoController"
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r9, r8)
        L_0x01ac:
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r8 = r6.f16454m
            if (r8 == 0) goto L_0x01c2
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r8 = r6.f16454m     // Catch:{ Exception -> 0x01ba }
            com.mbridge.msdk.out.MBridgeIds r9 = r6.f16458q     // Catch:{ Exception -> 0x01ba }
            java.lang.String r0 = "show exception"
            r8.onShowFail(r9, r0)     // Catch:{ Exception -> 0x01ba }
            goto L_0x01c2
        L_0x01ba:
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r8 == 0) goto L_0x01c2
            r7.printStackTrace()
        L_0x01c2:
            boolean r7 = r6.f16424A
            if (r7 != 0) goto L_0x01eb
            boolean r7 = r6.f16425B
            if (r7 != 0) goto L_0x01eb
            com.mbridge.msdk.videocommon.d.c r7 = r6.f16452k
            if (r7 == 0) goto L_0x01eb
            boolean r7 = r7.mo49159s(r2)
            if (r7 == 0) goto L_0x01eb
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n
            if (r7 == 0) goto L_0x01eb
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n
            int r7 = r7.f16513c.get()
            if (r7 == r4) goto L_0x01eb
            com.mbridge.msdk.reward.a.a$c r7 = r6.f16455n
            int r7 = r7.f16513c.get()
            if (r7 == r1) goto L_0x01eb
            r6.mo46986d((boolean) r3)
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p209a.C6738a.mo46977a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: j */
    private boolean m16942j() {
        try {
            if (this.f16434M == null) {
                this.f16434M = C6148f.m15420a(C6122a.m15302b().mo42895d());
            }
            C6149g a = C6149g.m15428a((C6146e) this.f16434M);
            if (this.f16452k == null) {
                this.f16452k = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f16457p, this.f16424A);
            }
            int d = this.f16452k.mo49128d();
            if (a == null || !a.mo43007a(this.f16457p, d)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            C6361q.m16158d("RewardVideoController", "cap check error");
            return false;
        }
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$a */
    /* compiled from: RewardVideoController */
    public class C6750a implements Runnable {

        /* renamed from: b */
        private C6757a f16504b;

        /* renamed from: c */
        private int f16505c;

        /* renamed from: d */
        private boolean f16506d;

        public C6750a(C6757a aVar, int i, boolean z) {
            this.f16504b = aVar;
            this.f16505c = i;
            this.f16506d = z;
        }

        public final void run() {
            C6361q.m16158d("RewardVideoController", "adSource=" + this.f16505c + " CommonCancelTimeTask mIsDevCall：" + this.f16506d);
            C6801a.m17156b((CampaignEx) null, C6738a.this.f16449h, "v3 is timeout", C6738a.this.f16457p, C6738a.this.f16425B, "", "");
            C6738a.this.m16924c("v3 is timeout");
        }
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$b */
    /* compiled from: RewardVideoController */
    public class C6751b implements C6758b {

        /* renamed from: b */
        private C6757a f16508b;

        /* renamed from: c */
        private boolean f16509c;

        /* renamed from: d */
        private Runnable f16510d;

        public C6751b(C6757a aVar, boolean z) {
            this.f16508b = aVar;
            this.f16509c = z;
        }

        /* renamed from: a */
        public final void mo47001a(Runnable runnable) {
            this.f16510d = runnable;
        }

        /* renamed from: b */
        public final void mo42806b(String str) {
            if (this.f16510d != null) {
                C6738a.this.f16463v.removeCallbacks(this.f16510d);
            }
            if (C6738a.this.f16455n != null) {
                C6752c.m17001d(C6738a.this.f16455n, C6738a.this.f16460s, C6738a.this.f16457p);
            }
        }

        /* renamed from: a */
        public final void mo42804a() {
            if (this.f16510d != null) {
                C6738a.this.f16463v.removeCallbacks(this.f16510d);
            }
            if (C6738a.this.f16455n != null) {
                C6752c.m16993a(C6738a.this.f16455n, C6738a.this.f16460s, C6738a.this.f16457p);
            }
        }

        /* renamed from: a */
        public final void mo42805a(String str) {
            if (this.f16510d != null) {
                C6738a.this.f16463v.removeCallbacks(this.f16510d);
            }
            C6757a aVar = this.f16508b;
            if (aVar != null) {
                aVar.mo47014a((C6758b) null);
                this.f16508b = null;
            }
            if (C6738a.this.f16455n != null) {
                C6752c.m16992a(C6738a.this.f16455n, str);
            }
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m16941j(C6738a aVar) {
        String str;
        if (aVar.f16431H) {
            String a = aVar.mo46973a();
            if (!TextUtils.isEmpty(a)) {
                ConcurrentHashMap<String, String> concurrentHashMap = f16421J;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(a) && !TextUtils.isEmpty(f16421J.get(a))) {
                    str = f16421J.get(a);
                    aVar.f16458q.setBidToken(str);
                }
            } else {
                return;
            }
        }
        str = "";
        aVar.f16458q.setBidToken(str);
    }

    /* renamed from: a */
    static /* synthetic */ void m16912a(C6738a aVar, String str, List list) {
        if (list != null && list.size() > 0 && !aVar.f16438Q) {
            C6143d.m15367a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d())).mo42972a((List<CampaignEx>) list, str);
        }
    }
}
