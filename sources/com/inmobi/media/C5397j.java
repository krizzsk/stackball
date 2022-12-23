package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5114di;
import com.inmobi.media.C5145ea;
import com.inmobi.media.C5331h;
import com.inmobi.media.C5415m;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.vungle.warren.model.ReportDBAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.j */
/* compiled from: NativeAdContainer */
public class C5397j implements Application.ActivityLifecycleCallbacks, C5331h {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final String f12359x = C5397j.class.getSimpleName();

    /* renamed from: A */
    private List<C5010bf> f12360A = new ArrayList();

    /* renamed from: B */
    private C5162eh f12361B;

    /* renamed from: C */
    private int f12362C = -1;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C5397j f12363D;

    /* renamed from: E */
    private C5010bf f12364E = null;

    /* renamed from: F */
    private String f12365F = null;

    /* renamed from: G */
    private C5415m f12366G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C5397j f12367H;

    /* renamed from: I */
    private C5415m.C5432a f12368I;

    /* renamed from: J */
    private final C5331h.C5332a f12369J = new C5331h.C5332a() {
        /* renamed from: a */
        public final void mo40700a() {
            String unused = C5397j.f12359x;
            C5409c h = C5397j.this.mo40781h();
            if (h != null) {
                h.mo40826a();
            }
        }

        /* renamed from: a */
        public final void mo40701a(Object obj) {
            C5409c h;
            if (C5397j.this.mo40788o() != null && (h = C5397j.this.mo40781h()) != null) {
                h.mo40829b();
            }
        }

        /* renamed from: b */
        public final void mo40702b(Object obj) {
            C5409c h = C5397j.this.mo40781h();
            if (h != null) {
                h.mo40833f();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C5316gq f12370K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C5456r<C5397j> f12371L = new C5456r<C5397j>(this) {
        /* renamed from: a */
        public final void mo39944a() {
            if (!C5397j.this.f12382k && C5397j.this.getPlacementType() == 0 && C5397j.this.f12372a.f11404c) {
                String unused = C5397j.f12359x;
                C5397j.m12513a(C5397j.this);
            }
        }
    };

    /* renamed from: a */
    protected C5016bj f12372a;

    /* renamed from: b */
    C5220ev f12373b;

    /* renamed from: c */
    public final String f12374c;

    /* renamed from: d */
    public final long f12375d;

    /* renamed from: e */
    public final String f12376e;

    /* renamed from: f */
    public final boolean f12377f;

    /* renamed from: g */
    protected String f12378g;

    /* renamed from: h */
    protected Set<C5096cx> f12379h;

    /* renamed from: i */
    protected C5098cz f12380i;

    /* renamed from: j */
    protected boolean f12381j;

    /* renamed from: k */
    public boolean f12382k;

    /* renamed from: l */
    protected boolean f12383l;

    /* renamed from: m */
    public C5397j f12384m;

    /* renamed from: n */
    protected C5409c f12385n;

    /* renamed from: o */
    protected WeakReference<Context> f12386o = new WeakReference<>((Object) null);

    /* renamed from: p */
    WeakReference<Activity> f12387p;

    /* renamed from: q */
    boolean f12388q = false;

    /* renamed from: r */
    public int f12389r = 0;

    /* renamed from: s */
    public boolean f12390s = false;

    /* renamed from: t */
    Intent f12391t = null;

    /* renamed from: u */
    public C5415m f12392u;

    /* renamed from: v */
    public byte f12393v;

    /* renamed from: w */
    public final C5114di.C5118a f12394w = new C5114di.C5118a() {
        /* renamed from: a */
        public final void mo40397a(View view, boolean z) {
            C5397j.this.mo40777a(z);
        }
    };

    /* renamed from: y */
    private byte f12395y;

    /* renamed from: z */
    private Set<Integer> f12396z = new HashSet();

    /* renamed from: com.inmobi.media.j$c */
    /* compiled from: NativeAdContainer */
    public interface C5409c {
        /* renamed from: a */
        void mo40826a();

        /* renamed from: a */
        void mo40827a(Map<String, String> map);

        /* renamed from: a */
        void mo40828a(boolean z);

        /* renamed from: b */
        void mo40829b();

        /* renamed from: c */
        void mo40830c();

        /* renamed from: d */
        void mo40831d();

        /* renamed from: e */
        void mo40832e();

        /* renamed from: f */
        void mo40833f();

        /* renamed from: g */
        void mo40834g();

        /* renamed from: h */
        void mo40835h();

        /* renamed from: i */
        void mo40836i();
    }

    /* renamed from: a */
    public final void mo40683a() {
    }

    public String getMarkupType() {
        return "inmobiJson";
    }

    public View getVideoContainerView() {
        return null;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo40797q() {
        return false;
    }

    /* renamed from: com.inmobi.media.j$b */
    /* compiled from: NativeAdContainer */
    public static final class C5408b {
        /* renamed from: a */
        public static C5397j m12593a(Context context, byte b, C5016bj bjVar, String str, Set<C5096cx> set, C5220ev evVar, long j, boolean z, String str2, String str3) {
            if (bjVar.mo40187e().contains(ShareConstants.VIDEO_URL)) {
                return new C5410k(context, b, bjVar, str, set, evVar, j, z, str2, str3);
            }
            return new C5397j(context, b, bjVar, str, set, evVar, j, z, str2, str3);
        }
    }

    C5397j(Context context, byte b, C5016bj bjVar, String str, Set<C5096cx> set, C5220ev evVar, long j, boolean z, String str2, String str3) {
        this.f12395y = b;
        this.f12372a = bjVar;
        this.f12374c = str;
        this.f12375d = j;
        this.f12377f = z;
        this.f12376e = str2;
        this.f12378g = str3;
        mo40774a((C5331h) this);
        this.f12381j = false;
        this.f12382k = false;
        this.f12373b = evVar;
        if (set != null) {
            this.f12379h = new HashSet(set);
        }
        this.f12372a.f11405d.f11398z = System.currentTimeMillis();
        mo40770a(context);
        this.f12393v = -1;
        this.f12370K = C5316gq.m12231a();
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C5397j.this.f12370K.mo40658a(C5397j.this.hashCode(), C5397j.this.f12371L);
            }
        });
    }

    /* renamed from: d */
    public final void mo40688d() {
        Activity o = mo40788o();
        if (o != null && !this.f12382k) {
            byte b = this.f12372a.f11402a;
            if (b == 1) {
                o.setRequestedOrientation(1);
            } else if (b != 2) {
                o.setRequestedOrientation(o.getRequestedOrientation());
            } else {
                o.setRequestedOrientation(0);
            }
        }
    }

    public C5331h.C5332a getFullScreenEventsListener() {
        return this.f12369J;
    }

    public byte getPlacementType() {
        return this.f12395y;
    }

    /* renamed from: a */
    public final void mo40770a(Context context) {
        this.f12386o = new WeakReference<>(context);
        C5314go.m12191a(context, (Application.ActivityLifecycleCallbacks) this);
    }

    /* renamed from: g */
    public final Context mo40780g() {
        return (Context) this.f12386o.get();
    }

    /* renamed from: a */
    public final void mo40685a(String str) {
        Context context = (Context) this.f12386o.get();
        if (context != null && C5325gu.m12259a(str)) {
            InMobiAdActivity.m11057a((C5415m) null);
            InMobiAdActivity.m11056a(mo40804x());
            Intent intent = new Intent(context, InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
            intent.putExtra(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, this.f12375d);
            intent.putExtra("creativeId", this.f12376e);
            intent.putExtra("impressionId", this.f12374c);
            intent.putExtra("allowAutoRedirection", this.f12377f);
            C5314go.m12192a(context, intent);
        }
    }

    /* renamed from: a */
    public final void mo40774a(C5331h hVar) {
        if (hVar instanceof C5397j) {
            this.f12384m = (C5397j) hVar;
        }
    }

    /* renamed from: h */
    public final C5409c mo40781h() {
        return this.f12385n;
    }

    /* renamed from: a */
    public final void mo40775a(C5409c cVar) {
        this.f12385n = cVar;
    }

    /* renamed from: i */
    public final View mo40782i() {
        C5098cz czVar = this.f12380i;
        if (czVar == null) {
            return null;
        }
        return czVar.mo40371b();
    }

    public C5220ev getAdConfig() {
        return this.f12373b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo40783j() {
        Map<String, String> a = mo40768a((C5010bf) this.f12372a.f11405d);
        mo40684a((byte) 1, a);
        mo40684a((byte) 2, a);
    }

    public C5098cz getViewableAd() {
        Context m = mo40786m();
        if (this.f12380i == null && m != null) {
            mo40783j();
            this.f12380i = new C5112dg(m, this, new C5102db(this, this.f12392u));
            Set<C5096cx> set = this.f12379h;
            if (set != null) {
                for (C5096cx next : set) {
                    try {
                        byte b = next.f11686a;
                        if (b != 1) {
                            if (b == 3) {
                                C5131dq dqVar = (C5131dq) next.f11687b.get("omidAdSession");
                                if (next.f11687b.containsKey("deferred")) {
                                    ((Boolean) next.f11687b.get("deferred")).booleanValue();
                                }
                                if (dqVar != null) {
                                    if (this.f12393v == 0) {
                                        this.f12380i = new C5136du(this, this.f12380i, dqVar);
                                    } else {
                                        this.f12380i = new C5137dv(this, this.f12380i, dqVar);
                                    }
                                }
                            }
                        } else if (this.f12393v == 0) {
                            this.f12380i = new C5126dm(this, m, this.f12380i, next.f11687b);
                        } else {
                            next.f11687b.put("zMoatIID", UUID.randomUUID().toString());
                            this.f12380i = new C5127dn(m, this.f12380i, this, next.f11687b);
                        }
                    } catch (Exception e) {
                        C5275fn.m12068a().mo40590a(new C5308gk(e));
                    }
                }
            }
        }
        return this.f12380i;
    }

    /* renamed from: k */
    public final C5016bj mo40784k() {
        return this.f12372a;
    }

    /* renamed from: c */
    public final boolean mo40687c() {
        return this.f12382k;
    }

    public void destroy() {
        if (!this.f12382k) {
            this.f12382k = true;
            this.f12362C = -1;
            C5397j jVar = this.f12363D;
            if (jVar != null) {
                jVar.mo40686b();
            }
            this.f12382k = true;
            this.f12385n = null;
            C5162eh C = m12504C();
            if (C != null) {
                C5145ea eaVar = C.f11857b;
                for (C5145ea.C5148a aVar : eaVar.f11811a) {
                    aVar.f11819a.cancel();
                }
                eaVar.f11811a.clear();
                C.mo40458a();
            }
            this.f12361B = null;
            this.f12360A.clear();
            C5098cz czVar = this.f12380i;
            if (czVar != null) {
                czVar.mo40373d();
                this.f12380i.mo40374e();
            }
            m12505D();
            this.f12386o.clear();
            WeakReference<Activity> weakReference = this.f12387p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f12372a = null;
            this.f12392u = null;
            C5397j jVar2 = this.f12367H;
            if (jVar2 != null) {
                jVar2.destroy();
                this.f12367H = null;
            }
            this.f12370K.mo40657a(hashCode());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo40785l() {
        return getPlacementType() == 0 && mo40788o() != null;
    }

    /* renamed from: m */
    public final Context mo40786m() {
        return (1 == getPlacementType() || mo40785l()) ? mo40788o() : (Context) this.f12386o.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo40787n() {
        return this.f12381j;
    }

    /* renamed from: a */
    private C5010bf m12507a(C5010bf bfVar, C5016bj bjVar, String str) {
        if (C5325gu.m12257a((Context) this.f12386o.get(), str)) {
            return bfVar;
        }
        String[] split = str.split("\\|");
        C5010bf b = bjVar.mo40182b(split[0]);
        if (b == null) {
            return m12517b(bjVar.f11407f, bfVar);
        }
        if (b.equals(bfVar)) {
            return null;
        }
        if (1 == split.length || 2 == split.length) {
            b.f11371m = 1;
            return b;
        }
        b.f11371m = C5016bj.m11390a(split[2]);
        return b;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte m12516b(java.lang.String r6) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r0)
            java.lang.String r6 = r6.trim()
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 1
            r4 = 3
            r5 = 2
            switch(r0) {
                case -934641255: goto L_0x0053;
                case -934524953: goto L_0x0049;
                case 0: goto L_0x003f;
                case 3127582: goto L_0x0035;
                case 3443508: goto L_0x002b;
                case 3532159: goto L_0x0021;
                case 110066619: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x005d
        L_0x0017:
            java.lang.String r0 = "fullscreen"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 6
            goto L_0x005e
        L_0x0021:
            java.lang.String r0 = "skip"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 2
            goto L_0x005e
        L_0x002b:
            java.lang.String r0 = "play"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 7
            goto L_0x005e
        L_0x0035:
            java.lang.String r0 = "exit"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 5
            goto L_0x005e
        L_0x003f:
            java.lang.String r0 = ""
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 1
            goto L_0x005e
        L_0x0049:
            java.lang.String r0 = "replay"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 4
            goto L_0x005e
        L_0x0053:
            java.lang.String r0 = "reload"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 3
            goto L_0x005e
        L_0x005d:
            r6 = -1
        L_0x005e:
            switch(r6) {
                case 2: goto L_0x0067;
                case 3: goto L_0x0066;
                case 4: goto L_0x0066;
                case 5: goto L_0x0065;
                case 6: goto L_0x0064;
                case 7: goto L_0x0063;
                default: goto L_0x0061;
            }
        L_0x0061:
            r6 = 0
            return r6
        L_0x0063:
            return r1
        L_0x0064:
            return r2
        L_0x0065:
            return r3
        L_0x0066:
            return r4
        L_0x0067:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5397j.m12516b(java.lang.String):byte");
    }

    /* renamed from: a */
    public final void mo40773a(C5010bf bfVar, boolean z) {
        C5010bf b;
        C5082cp f;
        if (this.f12372a.f11411j && !this.f12382k && (b = m12517b(this.f12372a, bfVar)) != null) {
            Map<String, String> a = mo40768a(b);
            b.f11367i = bfVar.f11367i;
            if (ShareConstants.VIDEO_URL.equals(b.f11360b) || b.f11366h) {
                byte b2 = b.f11367i;
                C5098cz czVar = this.f12380i;
                if (czVar != null) {
                    czVar.mo40367a((byte) 4);
                }
                if (b2 != 0) {
                    String str = b.f11376r;
                    if (2 == b.f11371m && (f = ((C5031bs) b).mo40205b().mo40363f()) != null && f.f11635e != null && !f.f11635e.trim().isEmpty()) {
                        str = f.f11635e;
                    }
                    if (!C5325gu.m12257a(m12506E(), str)) {
                        str = b.f11377s;
                        if (!C5325gu.m12257a(m12506E(), str)) {
                            return;
                        }
                    }
                    String a2 = C5328gx.m12268a(str, a);
                    if (!this.f12390s || z) {
                        m12510a(b, b2, a2);
                        return;
                    }
                    C5397j h = m12529h(this);
                    if (h != null) {
                        C5409c cVar = h.f12385n;
                        if (cVar != null) {
                            if (1 != b2 || !C5325gu.m12259a(a2)) {
                                cVar.mo40834g();
                            } else {
                                cVar.mo40830c();
                            }
                        }
                        this.f12364E = b;
                        this.f12365F = a2;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo40769a(int i, C5010bf bfVar) {
        if (!this.f12396z.contains(Integer.valueOf(i)) && !this.f12382k) {
            mo40846z();
            m12509a(i, (C5012bh) bfVar);
        }
    }

    public void setFullScreenActivityContext(Activity activity) {
        this.f12387p = new WeakReference<>(activity);
    }

    /* renamed from: o */
    public final Activity mo40788o() {
        WeakReference<Activity> weakReference = this.f12387p;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    /* renamed from: z */
    private void mo40846z() {
        C5012bh a = this.f12372a.mo40180a(0);
        if (!this.f12396z.contains(0) && a != null) {
            m12509a(0, a);
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo40768a(C5010bf bfVar) {
        C5016bj bjVar;
        HashMap hashMap = new HashMap(3);
        if (!this.f12382k && (bjVar = this.f12372a) != null) {
            hashMap.put("$LTS", String.valueOf(bjVar.f11405d.f11398z));
            C5012bh a = C5016bj.m11396a(bfVar);
            long currentTimeMillis = System.currentTimeMillis();
            if (!(a == null || 0 == a.f11398z)) {
                currentTimeMillis = a.f11398z;
            }
            hashMap.put("$STS", String.valueOf(currentTimeMillis));
            hashMap.put("$TS", String.valueOf(System.currentTimeMillis()));
            C5318gr.m12239a(m12506E(), this.f12378g, hashMap);
            hashMap.putAll(this.f12372a.mo40181a());
        }
        return hashMap;
    }

    /* renamed from: b */
    private static void m12520b(C5010bf bfVar, Map<String, String> map) {
        if (bfVar != null) {
            bfVar.mo40163a("page_view", map);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40777a(boolean z) {
        if (z) {
            m12502A();
        } else {
            m12503B();
        }
    }

    /* renamed from: b */
    static C5027bq m12518b(View view) {
        if (view != null) {
            return (C5027bq) view.findViewWithTag("timerView");
        }
        return null;
    }

    /* renamed from: c */
    protected static void m12522c(View view) {
        C5027bq b = m12518b(view);
        if (b != null) {
            b.mo40194b();
        }
    }

    /* renamed from: d */
    protected static void m12525d(View view) {
        C5027bq b = m12518b(view);
        if (b != null && b.f11451c != null && !b.f11451c.isRunning()) {
            b.f11451c.setCurrentPlayTime(b.f11450b);
            b.f11451c.start();
        }
    }

    /* renamed from: A */
    private void m12502A() {
        C5162eh C = m12504C();
        if (C != null) {
            C.f11857b.mo40429a();
        }
    }

    /* renamed from: B */
    private void m12503B() {
        C5162eh C = m12504C();
        if (C != null) {
            C.f11857b.mo40431b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo40796p() {
        final C5397j h = m12529h(this);
        if (h != null) {
            C5409c cVar = h.f12385n;
            if (cVar != null) {
                cVar.mo40830c();
            }
            this.f12370K.mo40658a(hashCode(), new C5456r<C5397j>(this) {
                /* renamed from: a */
                public final void mo39944a() {
                    if (C5397j.this.f12363D == null) {
                        C5397j.m12513a(C5397j.this);
                    }
                    int a = InMobiAdActivity.m11053a((C5331h) C5397j.this.f12363D);
                    Intent intent = new Intent((Context) C5397j.this.f12386o.get(), InMobiAdActivity.class);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", a);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
                    if (C5397j.this.f12390s) {
                        C5397j.this.f12391t = intent;
                    } else {
                        C5314go.m12192a((Context) C5397j.this.f12386o.get(), intent);
                    }
                }

                /* renamed from: b */
                public final void mo39946b() {
                    super.mo39946b();
                    C5409c h = h.mo40781h();
                    if (h != null) {
                        h.mo40826a();
                    }
                }
            });
        }
    }

    /* renamed from: r */
    public final void mo40798r() {
        if (mo40797q()) {
            this.f12388q = true;
            C5409c cVar = this.f12385n;
            if (cVar != null && this.f12372a.f11408g != null) {
                cVar.mo40827a(this.f12372a.f11408g);
            }
        }
    }

    /* renamed from: a */
    private void mo40837a(C5031bs bsVar) {
        C5082cp f = bsVar.mo40205b().mo40363f();
        if (f != null && f.f11636g) {
            for (C5030br a : f.mo40344a("closeEndCard")) {
                C5031bs.m11373a(a, mo40768a((C5010bf) bsVar));
            }
            f.f11636g = false;
        }
    }

    /* renamed from: h */
    private static C5397j m12529h(C5397j jVar) {
        C5397j jVar2;
        while (jVar != null) {
            if (jVar.mo40788o() != null || jVar == (jVar2 = jVar.f12384m)) {
                return jVar;
            }
            jVar = jVar2;
        }
        return null;
    }

    /* renamed from: C */
    private C5162eh m12504C() {
        C5159eg egVar;
        C5098cz czVar = this.f12380i;
        if (czVar == null) {
            egVar = null;
        } else {
            egVar = (C5159eg) czVar.mo40366a();
        }
        if (egVar != null) {
            this.f12361B = egVar.f11850b;
        }
        return this.f12361B;
    }

    /* renamed from: a */
    private void m12510a(C5010bf bfVar, byte b, String str) {
        if (1 == b) {
            m12523c(str);
        } else {
            m12515a(str, bfVar.f11377s, bfVar);
        }
    }

    /* renamed from: a */
    private void m12515a(String str, String str2, C5010bf bfVar) {
        String a;
        C5397j h;
        if (this.f12386o.get() != null && (a = C5325gu.m12256a((Context) this.f12386o.get(), str, str2)) != null && (h = m12529h(this)) != null) {
            C5409c cVar = h.f12385n;
            if (cVar != null && !this.f12390s) {
                cVar.mo40834g();
            }
            if (a.equals(str2)) {
                bfVar.mo40163a("TRACKER_EVENT_TYPE_FALLBACK_URL", mo40768a(bfVar));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        com.inmobi.media.C5325gu.m12261b(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0034 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12523c(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r3.f12386o
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            android.app.Activity r1 = r3.mo40788o()
            if (r1 != 0) goto L_0x0018
            com.inmobi.media.j$c r1 = r3.f12385n
            if (r1 == 0) goto L_0x0018
            r1.mo40830c()
        L_0x0018:
            java.lang.String r1 = com.inmobi.media.C5296g.m12117a(r0)
            com.inmobi.media.ev r2 = r3.getAdConfig()     // Catch:{ Exception -> 0x0034 }
            boolean r2 = r2.cctEnabled     // Catch:{ Exception -> 0x0034 }
            if (r1 == 0) goto L_0x0030
            if (r2 != 0) goto L_0x0027
            goto L_0x0030
        L_0x0027:
            com.inmobi.media.bz r1 = new com.inmobi.media.bz     // Catch:{ Exception -> 0x0034 }
            r1.<init>(r4, r0, r3)     // Catch:{ Exception -> 0x0034 }
            r1.mo40210b()     // Catch:{ Exception -> 0x0034 }
            return
        L_0x0030:
            r3.mo40685a((java.lang.String) r4)     // Catch:{ Exception -> 0x0034 }
            return
        L_0x0034:
            com.inmobi.media.C5325gu.m12261b(r0, r4)     // Catch:{ URISyntaxException -> 0x0037 }
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5397j.m12523c(java.lang.String):void");
    }

    /* renamed from: D */
    private void m12505D() {
        Context context = (Context) this.f12386o.get();
        if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public void onActivityStarted(Activity activity) {
        Context E = m12506E();
        if (E != null && E.equals(activity)) {
            mo40799s();
        }
    }

    /* renamed from: s */
    public final void mo40799s() {
        this.f12383l = false;
        m12525d(mo40782i());
        m12502A();
        C5098cz czVar = this.f12380i;
        if (czVar != null) {
            czVar.mo40368a(m12506E(), (byte) 0);
        }
    }

    public void onActivityStopped(Activity activity) {
        Context E = m12506E();
        if (E != null && E.equals(activity)) {
            mo40800t();
        }
    }

    /* renamed from: E */
    private Context m12506E() {
        Activity o = mo40788o();
        return o == null ? (Context) this.f12386o.get() : o;
    }

    /* renamed from: t */
    public void mo40800t() {
        this.f12383l = true;
        m12522c(mo40782i());
        m12503B();
        C5098cz czVar = this.f12380i;
        if (czVar != null) {
            czVar.mo40368a(m12506E(), (byte) 1);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C5098cz czVar = this.f12380i;
        if (czVar != null) {
            czVar.mo40368a(activity, (byte) 2);
        }
        m12505D();
    }

    /* renamed from: u */
    public final void mo40801u() {
        C5010bf bfVar = this.f12364E;
        if (bfVar != null && this.f12365F != null) {
            m12510a(bfVar, bfVar.f11367i, this.f12365F);
        } else if (this.f12391t != null && this.f12386o.get() != null) {
            C5314go.m12192a((Context) this.f12386o.get(), this.f12391t);
        }
    }

    /* renamed from: v */
    public final C5415m mo40802v() {
        C5415m mVar = this.f12392u;
        return mVar == null ? this.f12366G : mVar;
    }

    /* renamed from: w */
    public final void mo40803w() {
        new C5407a(this).start();
    }

    /* renamed from: com.inmobi.media.j$a */
    /* compiled from: NativeAdContainer */
    final class C5407a extends Thread {

        /* renamed from: b */
        private WeakReference<C5397j> f12408b;

        C5407a(C5397j jVar) {
            this.f12408b = new WeakReference<>(jVar);
        }

        public final void run() {
            if (C5397j.this.mo40788o() == null) {
                String unused = C5397j.f12359x;
                return;
            }
            C5397j jVar = (C5397j) this.f12408b.get();
            if (jVar != null && !jVar.f12382k) {
                try {
                    C5016bj k = jVar.mo40784k();
                    if (C5397j.this.mo40788o() != null) {
                        if (k.f11406e.length() != 0) {
                            String unused2 = C5397j.f12359x;
                            JSONObject b = k.mo40183b();
                            if (b != null) {
                                C5016bj bjVar = new C5016bj((int) C5397j.this.getPlacementType(), b, k, C5397j.this.getPlacementType() == 0, C5397j.this.getAdConfig());
                                if (bjVar.mo40186d()) {
                                    C5397j a = C5408b.m12593a(C5397j.this.mo40788o(), (byte) 0, bjVar, C5397j.this.f12374c, (Set<C5096cx>) null, C5397j.this.f12373b, C5397j.this.f12375d, C5397j.this.f12377f, C5397j.this.f12376e, C5397j.this.f12378g);
                                    String unused3 = C5397j.f12359x;
                                    a.mo40774a((C5331h) jVar);
                                    a.f12392u = jVar.f12392u;
                                    jVar.f12367H = a;
                                    return;
                                }
                                String unused4 = C5397j.f12359x;
                                return;
                            }
                            return;
                        }
                    }
                    String unused5 = C5397j.f12359x;
                } catch (Exception e) {
                    String unused6 = C5397j.f12359x;
                    C5275fn.m12068a().mo40590a(new C5308gk(e));
                }
            }
        }
    }

    /* renamed from: x */
    public final C5415m.C5432a mo40804x() {
        if (this.f12368I == null) {
            this.f12368I = new C5415m.C5432a() {
                /* renamed from: a */
                public final void mo40809a() {
                }

                /* renamed from: a */
                public final void mo40810a(C5415m mVar) {
                }

                /* renamed from: a */
                public final void mo40811a(String str, Map<String, Object> map) {
                }

                /* renamed from: a */
                public final void mo40812a(HashMap<Object, Object> hashMap) {
                }

                /* renamed from: b */
                public final void mo40813b() {
                }

                /* renamed from: b */
                public final void mo40814b(C5415m mVar) {
                }

                /* renamed from: e */
                public final void mo40821e(C5415m mVar) {
                }

                /* renamed from: f */
                public final void mo40822f() {
                }

                /* renamed from: g */
                public final void mo40823g() {
                }

                /* renamed from: c */
                public final void mo40816c() {
                    C5409c h = C5397j.this.mo40781h();
                    if (h != null) {
                        h.mo40826a();
                    }
                }

                /* renamed from: c */
                public final void mo40817c(C5415m mVar) {
                    C5409c h = C5397j.this.mo40781h();
                    if (h != null) {
                        h.mo40829b();
                    }
                }

                /* renamed from: d */
                public final void mo40819d(C5415m mVar) {
                    C5409c h = C5397j.this.mo40781h();
                    if (h != null) {
                        h.mo40833f();
                    }
                }

                /* renamed from: b */
                public final void mo40815b(HashMap<Object, Object> hashMap) {
                    C5409c h = C5397j.this.mo40781h();
                    if (h != null) {
                        h.mo40832e();
                    }
                }

                /* renamed from: d */
                public final void mo40818d() {
                    C5409c h = C5397j.this.mo40781h();
                    if (h != null) {
                        h.mo40834g();
                    }
                }

                /* renamed from: e */
                public final void mo40820e() {
                    C5409c h = C5397j.this.mo40781h();
                    if (h != null && C5397j.this.getPlacementType() == 0) {
                        h.mo40830c();
                    }
                }

                /* renamed from: h */
                public final C5394ik mo40824h() {
                    return C5394ik.m12488a();
                }
            };
        }
        return this.f12368I;
    }

    /* renamed from: a */
    public final void mo40684a(byte b, Map<String, String> map) {
        if (!this.f12382k) {
            if (b == 1) {
                this.f12372a.f11405d.mo40163a("load", map);
            } else if (b == 2) {
                this.f12372a.f11405d.mo40163a("client_fill", map);
            }
        }
    }

    /* renamed from: e */
    public final void mo40690e() {
        C5409c cVar = this.f12385n;
        if (cVar != null) {
            cVar.mo40829b();
        }
    }

    /* renamed from: f */
    public final void mo40691f() {
        C5409c cVar = this.f12385n;
        if (cVar != null) {
            cVar.mo40833f();
        }
    }

    /* renamed from: a */
    private void m12509a(int i, C5012bh bhVar) {
        if (!this.f12382k) {
            this.f12396z.add(Integer.valueOf(i));
            bhVar.f11398z = System.currentTimeMillis();
            if (this.f12381j) {
                m12520b((C5010bf) bhVar, mo40768a((C5010bf) bhVar));
            } else {
                this.f12360A.add(bhVar);
            }
        }
    }

    /* renamed from: b */
    private C5010bf m12517b(C5016bj bjVar, C5010bf bfVar) {
        C5010bf bfVar2 = null;
        if (bjVar == null) {
            return null;
        }
        String str = bfVar.f11376r;
        String str2 = bfVar.f11377s;
        if (str != null) {
            bfVar2 = m12507a(bfVar, bjVar, str);
        }
        return (bfVar2 != null || str2 == null) ? bfVar2 : m12507a(bfVar, bjVar, str2);
    }

    /* renamed from: a */
    public static C5010bf m12508a(C5016bj bjVar, C5010bf bfVar) {
        while (bjVar != null) {
            String str = bfVar.f11368j;
            if (str == null || str.length() == 0) {
                bfVar.f11370l = 0;
                return bfVar;
            }
            String[] split = str.split("\\|");
            if (1 == split.length) {
                bfVar.f11370l = m12516b(split[0]);
                return bfVar;
            }
            C5010bf b = bjVar.mo40182b(split[0]);
            if (b == null) {
                bjVar = bjVar.f11407f;
            } else if (b.equals(bfVar)) {
                return null;
            } else {
                b.f11370l = m12516b(split[1]);
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo40772a(View view, C5010bf bfVar) {
        C5409c cVar;
        if (!this.f12382k) {
            mo40846z();
            C5010bf b = m12517b(this.f12372a, bfVar);
            if (b != null) {
                Map<String, String> a = mo40768a(b);
                m12511a(b, a);
                if (!b.equals(bfVar)) {
                    m12511a(bfVar, a);
                }
            } else {
                m12511a(bfVar, mo40768a(bfVar));
            }
            C5397j h = m12529h(this);
            if (h != null) {
                if (!bfVar.f11376r.trim().isEmpty() && (cVar = h.f12385n) != null) {
                    cVar.mo40832e();
                }
                C5010bf a2 = m12508a(this.f12372a, bfVar);
                if (a2 != null) {
                    if (view != null && ShareConstants.VIDEO_URL.equals(a2.f11360b) && 5 == a2.f11370l) {
                        view.setVisibility(4);
                        bfVar.f11382x = 4;
                    }
                    mo40778b(a2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo40771a(View view) {
        C5409c cVar;
        if (!this.f12381j && !this.f12382k) {
            this.f12381j = true;
            this.f12372a.f11405d.mo40163a("Impression", mo40768a((C5010bf) this.f12372a.f11405d));
            mo40846z();
            for (C5010bf next : this.f12360A) {
                m12520b(next, mo40768a(next));
            }
            this.f12360A.clear();
            this.f12380i.mo40367a((byte) 0);
            C5397j h = m12529h(this);
            if (h != null && (cVar = h.f12385n) != null) {
                cVar.mo40831d();
            }
        }
    }

    /* renamed from: a */
    private static void m12511a(C5010bf bfVar, Map<String, String> map) {
        if (2 == bfVar.f11371m) {
            C5082cp f = ((C5031bs) bfVar).mo40205b().mo40363f();
            if (f == null || (f.f11635e == null && bfVar.f11376r != null)) {
                bfVar.mo40163a("click", map);
            } else if (f.f11634d.size() > 0) {
                for (C5030br a : f.mo40344a("click")) {
                    C5010bf.m11373a(a, map);
                }
            }
        } else {
            bfVar.mo40163a("click", map);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo40778b(C5010bf bfVar) {
        C5197ep epVar;
        byte b = bfVar.f11370l;
        if (b == 0) {
            return;
        }
        if (b == 1) {
            try {
                if (this.f12392u != null) {
                    this.f12392u.mo40860e("window.imraid.broadcastEvent('close');");
                }
                mo40686b();
            } catch (Exception e) {
                C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
        } else if (b == 3) {
            try {
                if (this.f12392u != null) {
                    this.f12392u.mo40860e("window.imraid.broadcastEvent('replay');");
                }
                if (mo40782i() != null) {
                    View i = mo40782i();
                    ViewGroup viewGroup = (ViewGroup) i.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(i);
                    }
                }
                C5397j jVar = this.f12384m;
                C5027bq b2 = m12518b(jVar.mo40782i());
                if (!(b2 == null || b2.f11451c == null || !b2.f11451c.isRunning())) {
                    b2.f11451c.setCurrentPlayTime(b2.f11449a * 1000);
                    b2.mo40193a(1.0f);
                }
                if (ShareConstants.VIDEO_URL.equals(bfVar.f11360b) && (jVar instanceof C5410k) && (epVar = (C5197ep) jVar.getVideoContainerView()) != null) {
                    C5184eo videoView = epVar.getVideoView();
                    C5031bs bsVar = (C5031bs) videoView.getTag();
                    if (bsVar != null) {
                        if (bsVar.mo40204a()) {
                            videoView.mo40495e();
                        } else {
                            videoView.mo40494d();
                        }
                    } else if (1 == getPlacementType()) {
                        videoView.mo40495e();
                    } else {
                        videoView.mo40494d();
                    }
                    mo40837a(bsVar);
                    videoView.start();
                }
            } catch (Exception e2) {
                C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                C5275fn.m12068a().mo40590a(new C5308gk(e2));
            }
        } else if (b == 4) {
            try {
                if (getPlacementType() == 0) {
                    mo40796p();
                }
            } catch (Exception e3) {
                C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in launching fullscreen ad");
                C5275fn.m12068a().mo40590a(new C5308gk(e3));
            }
        } else if (b != 5) {
            this.f12388q = true;
            C5415m mVar = this.f12392u;
            if (!(mVar == null || mVar == null)) {
                mVar.mo40860e("window.imraid.broadcastEvent('skip');");
            }
            m12522c(mo40782i());
            mo40779c(bfVar);
        }
    }

    /* renamed from: b */
    public final void mo40686b() {
        C5397j h;
        Activity activity;
        C5197ep epVar;
        try {
            if (!this.f12382k && (h = m12529h(this)) != null) {
                h.mo40798r();
                InMobiAdActivity.m11058a((Object) h);
                if ((h instanceof C5410k) && (epVar = (C5197ep) ((C5410k) h).getVideoContainerView()) != null) {
                    C5184eo videoView = epVar.getVideoView();
                    C5031bs bsVar = (C5031bs) videoView.getTag();
                    bsVar.f11380v.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                    bsVar.f11380v.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                    if (bsVar.f11383y != null) {
                        ((C5031bs) bsVar.f11383y).mo40203a(bsVar);
                    }
                    mo40837a(bsVar);
                }
                if (h.f12387p == null) {
                    activity = null;
                } else {
                    activity = (Activity) h.f12387p.get();
                }
                if (activity instanceof InMobiAdActivity) {
                    ((InMobiAdActivity) activity).f11092a = true;
                    activity.finish();
                    if (this.f12362C != -1) {
                        activity.overridePendingTransition(0, this.f12362C);
                    }
                }
                this.f12384m.f12363D = null;
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C5397j.this.f12384m.f12370K.mo40658a(C5397j.this.f12384m.hashCode(), C5397j.this.f12384m.f12371L);
                    }
                });
            }
        } catch (Exception e) {
            C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    /* renamed from: a */
    public final void mo40776a(C5415m mVar) {
        if (this.f12393v == 0 && this.f12366G == null && this.f12392u == null) {
            this.f12366G = mVar;
        }
    }

    /* renamed from: c */
    public final void mo40779c(C5010bf bfVar) {
        C5082cp f;
        C5397j jVar = this.f12367H;
        if (jVar == null || mo40782i() == null) {
            C5327gw.m12263a((byte) 2, "InMobi", "Failed to show end card");
            mo40686b();
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) mo40782i();
            View a = jVar.getViewableAd().mo40365a((View) null, viewGroup, false);
            if (a != null) {
                viewGroup.addView(a);
                a.setClickable(true);
                jVar.m12502A();
                if ((bfVar instanceof C5031bs) && (f = ((C5031bs) bfVar).mo40205b().mo40363f()) != null) {
                    f.f11636g = true;
                    return;
                }
                return;
            }
            mo40686b();
        } catch (Exception e) {
            mo40686b();
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    public /* bridge */ /* synthetic */ Object getDataModel() {
        return this.f12372a;
    }

    /* renamed from: a */
    static /* synthetic */ void m12513a(C5397j jVar) {
        JSONObject b;
        C5397j jVar2 = jVar;
        C5016bj bjVar = jVar2.f12372a;
        if (bjVar.f11406e.length() != 0 && (b = bjVar.mo40183b()) != null) {
            C5016bj bjVar2 = new C5016bj((int) jVar.getPlacementType(), b, bjVar, jVar.getPlacementType() == 0, jVar.getAdConfig());
            bjVar2.f11404c = bjVar.f11404c;
            bjVar2.f11411j = bjVar.f11411j;
            Context context = (Context) jVar2.f12386o.get();
            if (bjVar2.mo40186d() && context != null) {
                C5397j a = C5408b.m12593a(context, (byte) 0, bjVar2, jVar2.f12374c, jVar2.f12379h, jVar2.f12373b, jVar2.f12375d, jVar2.f12377f, jVar2.f12376e, jVar2.f12378g);
                jVar2.f12363D = a;
                a.mo40774a((C5331h) jVar2);
                C5409c cVar = jVar2.f12385n;
                if (cVar != null) {
                    jVar2.f12363D.f12385n = cVar;
                }
                if (bjVar.f11404c) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C5397j.this.f12363D.getViewableAd().mo40365a((View) null, new RelativeLayout(C5397j.this.mo40786m()), false);
                        }
                    });
                }
            }
        }
    }
}
