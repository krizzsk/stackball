package com.fyber.inneractive.sdk.p037d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p047g.p048a.C2916a;
import com.fyber.inneractive.sdk.p047g.p048a.C2917b;
import com.fyber.inneractive.sdk.p047g.p048a.C2922g;
import com.fyber.inneractive.sdk.p047g.p048a.C2923h;
import com.fyber.inneractive.sdk.p049h.C2943ag;
import com.fyber.inneractive.sdk.p049h.C2951b;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p049h.C2977r;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.p051j.C3020g;
import com.fyber.inneractive.sdk.player.p058b.C3155c;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.videokit.C3708R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.UnknownHostException;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.d.d */
public final class C2829d {

    /* renamed from: a */
    int f6715a = 2;

    /* renamed from: b */
    public final InneractiveAdRequest f6716b;

    /* renamed from: c */
    public final C3020g f6717c;

    /* renamed from: d */
    public C2767s f6718d;

    /* renamed from: e */
    public C2916a f6719e;

    /* renamed from: f */
    public boolean f6720f = false;

    /* renamed from: g */
    public View f6721g = null;

    /* renamed from: h */
    Context f6722h;

    /* renamed from: i */
    public C3155c f6723i;

    /* renamed from: j */
    public boolean f6724j;

    /* renamed from: k */
    public C2943ag f6725k;

    /* renamed from: l */
    public UnitDisplayType f6726l;

    /* renamed from: m */
    public boolean f6727m;

    /* renamed from: n */
    public int f6728n;

    /* renamed from: o */
    public int f6729o;

    /* renamed from: p */
    public C2809u f6730p;

    /* renamed from: q */
    int f6731q;

    public C2829d(Context context, C3020g gVar, InneractiveAdRequest inneractiveAdRequest, C2767s sVar) {
        this.f6719e = gVar.f7426E;
        this.f6722h = context;
        this.f6717c = gVar;
        this.f6716b = inneractiveAdRequest;
        this.f6718d = sVar;
        this.f6715a = IAConfigManager.m5929c().f6586a.mo18046a("companion_retry_count", 2, 0);
    }

    /* renamed from: b */
    private void m6199b() {
        JSONArray jSONArray;
        C2967m mVar = C2967m.VAST_COMPANION_LOAD_ATTEMPT;
        InneractiveAdRequest inneractiveAdRequest = this.f6716b;
        C3020g gVar = this.f6717c;
        C2767s sVar = this.f6718d;
        if (sVar == null) {
            jSONArray = null;
        } else {
            jSONArray = sVar.mo18013b();
        }
        new C2968n.C2969a(mVar, inneractiveAdRequest, (C3018e) gVar, jSONArray).mo18436b((String) null);
    }

    /* renamed from: a */
    public final void mo18118a() {
        boolean z;
        if (!this.f6720f) {
            IAlog.m9034b("%sloadNextVastCompanion called", IAlog.m9029a((Object) this));
            this.f6724j = false;
            this.f6721g = null;
            if (this.f6719e == null) {
                IAlog.m9034b("%svast data is null! Object must have already been destroyed", IAlog.m9029a((Object) this));
                z = false;
            } else {
                z = true;
            }
            if (this.f6719e.f6945f.size() == 0) {
                IAlog.m9037e("%sgetNextIAvastCompanion - No companion ads found", IAlog.m9029a((Object) this));
                z = false;
            }
            if (!z) {
                IAlog.m9034b("%sno more companion ads available.", IAlog.m9029a((Object) this));
                return;
            }
            C2916a aVar = this.f6719e;
            aVar.f6946g = aVar.f6945f.poll();
            C2917b bVar = aVar.f6946g;
            IAlog.m9034b("%sgetNextIAvastCompanion returning: %s", IAlog.m9029a((Object) this), bVar);
            this.f6731q = 0;
            if (bVar == null) {
                return;
            }
            if (bVar.f6949a != C2922g.Static || C2923h.Gif.equals(bVar.f6950b)) {
                mo18119a(bVar);
            } else {
                mo18120b(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18119a(final com.fyber.inneractive.sdk.p047g.p048a.C2917b r14) {
        /*
            r13 = this;
            com.fyber.inneractive.sdk.util.r$b r0 = com.fyber.inneractive.sdk.util.C3671r.C3674b.Mraid
            boolean r0 = com.fyber.inneractive.sdk.util.C3671r.m9162a(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            r13.m6199b()
            int r0 = r13.f6731q
            r1 = 1
            int r0 = r0 + r1
            r13.f6731q = r0
            int r0 = com.fyber.inneractive.sdk.util.IAlog.f9871b
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "COMPANION_TYPE"
            r4 = 0
            r2[r4] = r3
            com.fyber.inneractive.sdk.g.a.g r3 = r14.f6949a
            java.lang.String r3 = r3.name()
            r2[r1] = r3
            java.lang.String r3 = "%s: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9030a((int) r0, (java.lang.String) r3, (java.lang.Object[]) r2)
            com.fyber.inneractive.sdk.player.b.c r0 = new com.fyber.inneractive.sdk.player.b.c
            android.content.Context r6 = r13.f6722h
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r7 = r13.f6726l
            boolean r8 = r13.f6727m
            int r9 = r13.f6728n
            int r10 = r13.f6729o
            com.fyber.inneractive.sdk.config.u r11 = r13.f6730p
            com.fyber.inneractive.sdk.g.a.g r12 = r14.f6949a
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.f6723i = r0
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r2 = r0.f7812a
            if (r2 != 0) goto L_0x0045
            r2 = 0
            goto L_0x004b
        L_0x0045:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r2 = r0.f7812a
            com.fyber.inneractive.sdk.m.c r2 = r2.mo18556e()
        L_0x004b:
            r13.f6721g = r2
            com.fyber.inneractive.sdk.d.d$1 r10 = new com.fyber.inneractive.sdk.d.d$1
            r10.<init>(r14)
            java.lang.String r2 = r14.f6953e
            com.fyber.inneractive.sdk.g.a.g r3 = r14.f6949a
            com.fyber.inneractive.sdk.g.a.g r5 = com.fyber.inneractive.sdk.p047g.p048a.C2922g.Iframe
            java.lang.String r6 = "$__IMGSRC__$"
            if (r3 != r5) goto L_0x0072
            java.lang.String r1 = "fyb_iframe_endcard_tmpl.html"
            java.lang.String r1 = com.fyber.inneractive.sdk.util.C3657l.m9124e(r1)
            java.lang.String r2 = r14.f6953e
            java.lang.String r1 = r1.replace(r6, r2)
            java.lang.String r14 = r14.f6953e
            java.lang.String r2 = "$__SrcIframeUrl__$"
            java.lang.String r14 = r1.replace(r2, r14)
        L_0x0070:
            r7 = r14
            goto L_0x00cb
        L_0x0072:
            com.fyber.inneractive.sdk.g.a.g r3 = r14.f6949a
            com.fyber.inneractive.sdk.g.a.g r5 = com.fyber.inneractive.sdk.p047g.p048a.C2922g.Static
            if (r3 != r5) goto L_0x00ca
            com.fyber.inneractive.sdk.g.a.h r3 = r14.f6950b
            com.fyber.inneractive.sdk.g.a.h r5 = com.fyber.inneractive.sdk.p047g.p048a.C2923h.Gif
            if (r3 != r5) goto L_0x00ca
            com.fyber.inneractive.sdk.player.b.c r2 = r13.f6723i
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r3 = r2.f7812a
            if (r3 == 0) goto L_0x009d
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r2 = r2.f7812a
            com.fyber.inneractive.sdk.m.c r2 = r2.mo18556e()
            android.webkit.WebSettings r2 = r2.getSettings()
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 17
            if (r3 < r5) goto L_0x0097
            r2.setMediaPlaybackRequiresUserGesture(r4)
        L_0x0097:
            r2.setLoadWithOverviewMode(r1)
            r2.setUseWideViewPort(r1)
        L_0x009d:
            com.fyber.inneractive.sdk.player.b.c r1 = r13.f6723i
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r2 = r1.f7812a
            if (r2 == 0) goto L_0x00a7
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r1 = r1.f7812a
            r1.f9860a = r4
        L_0x00a7:
            java.lang.String r1 = "fyb_static_endcard_tmpl.html"
            java.lang.String r1 = com.fyber.inneractive.sdk.util.C3657l.m9124e(r1)
            java.lang.String r2 = r14.f6953e
            java.lang.String r1 = r1.replace(r6, r2)
            java.lang.String r2 = r14.f6954f
            if (r2 == 0) goto L_0x00c8
            java.lang.String r14 = r14.f6954f
            java.lang.String r2 = "\""
            java.lang.String r3 = "\\\""
            java.lang.String r14 = r14.replace(r2, r3)
            java.lang.String r2 = "$__IMGHREF__$"
            java.lang.String r14 = r1.replace(r2, r14)
            goto L_0x0070
        L_0x00c8:
            r7 = r1
            goto L_0x00cb
        L_0x00ca:
            r7 = r2
        L_0x00cb:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r14 = r0.f7812a
            if (r14 == 0) goto L_0x00f9
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r14 = r0.f7812a
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r0.f7813b
            boolean r1 = r1.isFullscreenUnit()
            r14.setAutoplayMRAIDVideos(r1)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r14 = r0.f7812a
            r14.setCenteringTagsRequired(r4)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r0.f7812a
            java.lang.String r6 = com.fyber.inneractive.sdk.config.C2739a.m5960b()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r14 = r0.f7813b
            boolean r1 = r0.f7814c
            java.lang.String r8 = com.fyber.inneractive.sdk.p037d.C2832e.m6207a(r14, r1)
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r14 = r0.f7813b
            java.lang.String r9 = com.fyber.inneractive.sdk.p037d.C2832e.m6206a((com.fyber.inneractive.sdk.config.enums.UnitDisplayType) r14)
            r11 = 10000(0x2710, double:4.9407E-320)
            r5.mo18544a(r6, r7, r8, r9, r10, r11)
            return
        L_0x00f9:
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r14 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSPECIFIED
            r10.mo18121a((com.fyber.inneractive.sdk.external.InneractiveErrorCode) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p037d.C2829d.mo18119a(com.fyber.inneractive.sdk.g.a.b):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18120b(final C2917b bVar) {
        m6199b();
        IAlog.m9030a(IAlog.f9871b, "%s: %s", "COMPANION_TYPE", bVar.f6949a.name());
        this.f6731q++;
        this.f6725k = new C2943ag(new C2977r<C2943ag.C2944a>() {
            /* renamed from: a */
            public final /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                C2943ag.C2944a aVar = (C2943ag.C2944a) obj;
                C2829d.this.f6721g = new ImageView(C2829d.this.f6722h);
                C2829d.this.f6721g.setId(C3708R.C3710id.inneractive_vast_endcard_static);
                C2829d.this.f6721g.setContentDescription("inneractive_vast_endcard_static");
                if (exc != null || aVar == null || aVar.f7086b != null) {
                    IAlog.m9034b("%s Fetching companion image failed!", IAlog.m9029a((Object) C2829d.this));
                    if ((aVar == null || (aVar.f7086b != null && ((exc instanceof C2951b) || (exc instanceof UnknownHostException)))) && C2829d.this.f6731q <= C2829d.this.f6715a) {
                        IAlog.m9034b("%sloadStaticCompanion retry", IAlog.m9029a((Object) this));
                        C2829d.this.mo18120b(bVar);
                        return;
                    }
                    C2968n.C2969a aVar2 = new C2968n.C2969a(C2966l.VAST_COMPANION_FAILED_LOADING, C2829d.this.f6716b, (C3018e) C2829d.this.f6717c);
                    C2968n.C2971b a = new C2968n.C2971b().mo18438a("companion_data", bVar.mo18379a());
                    if (aVar != null && !TextUtils.isEmpty(aVar.f7086b)) {
                        a.mo18438a(IronSourceConstants.EVENTS_ERROR_REASON, aVar.f7086b);
                    }
                    aVar2.mo18433a(a);
                    aVar2.mo18436b((String) null);
                    C2829d.this.mo18118a();
                } else if (aVar.f7085a != null && C2829d.this.f6721g != null) {
                    ((ImageView) C2829d.this.f6721g).setImageBitmap(aVar.f7085a);
                    C2829d.this.f6720f = true;
                }
            }
        }, bVar.f6953e);
        IAConfigManager.m5937h().mo18441a(this.f6725k);
    }
}
