package com.fyber.inneractive.sdk.p037d;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.C2813y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2689b;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p049h.C2941ae;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p049h.C2972o;
import com.fyber.inneractive.sdk.p049h.C2977r;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3620ab;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.d.h */
public abstract class C2837h<AdContent extends C2836g, EventsListener extends InneractiveUnitController.EventsListener> implements InneractiveInternalBrowserActivity.InternalBrowserListener, InneractiveAdRenderer {

    /* renamed from: a */
    protected InneractiveAdSpot f6748a;

    /* renamed from: b */
    protected AdContent f6749b;

    /* renamed from: c */
    protected EventsListener f6750c;

    /* renamed from: d */
    boolean f6751d = false;

    /* renamed from: e */
    protected boolean f6752e = false;

    /* renamed from: f */
    protected boolean f6753f = false;
    /* access modifiers changed from: protected */

    /* renamed from: g */
    public boolean f6754g = true;

    /* renamed from: h */
    private boolean f6755h = false;

    /* renamed from: i */
    private boolean f6756i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Runnable f6757j;

    public boolean canRefreshAd() {
        return true;
    }

    /* renamed from: q */
    public boolean mo18150q() {
        return false;
    }

    /* renamed from: r */
    public int mo18151r() {
        return -1;
    }

    /* renamed from: s */
    public int mo18152s() {
        return -1;
    }

    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f6748a = inneractiveAdSpot;
        this.f6749b = inneractiveAdSpot.getAdContent();
        this.f6750c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fyber.inneractive.sdk.util.C3685u.C3686a mo18136a(android.content.Context r18, java.lang.String r19, com.fyber.inneractive.sdk.util.C3629aj r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r0.f6754g
            java.lang.String r4 = "none"
            r5 = 0
            if (r3 == 0) goto L_0x02a6
            boolean r3 = r0.f6751d
            if (r3 == 0) goto L_0x0013
            goto L_0x02a6
        L_0x0013:
            r17.mo18148n()
            boolean r3 = android.text.TextUtils.isEmpty(r19)
            if (r3 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - is empty"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            com.fyber.inneractive.sdk.util.u$a r1 = new com.fyber.inneractive.sdk.util.u$a
            com.fyber.inneractive.sdk.util.u$c r2 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r5 = "empty url"
            r3.<init>(r5)
            r1.<init>(r2, r3, r4)
            return r1
        L_0x0032:
            java.lang.String r3 = com.fyber.inneractive.sdk.util.C3685u.m9186f(r19)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r6 = 1
            if (r4 != 0) goto L_0x0040
            r4 = r3
        L_0x003e:
            r3 = 0
            goto L_0x004c
        L_0x0040:
            java.lang.String r3 = "FYBER_OPEN_BROWSER"
            r4 = r19
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x004b
            goto L_0x003e
        L_0x004b:
            r3 = 1
        L_0x004c:
            int r7 = com.fyber.inneractive.sdk.util.C3685u.C3689d.f9987b
            com.fyber.inneractive.sdk.util.u$a r3 = com.fyber.inneractive.sdk.util.C3685u.m9176a(r1, r4, r3, r7)
            int r7 = com.fyber.inneractive.sdk.util.IAlog.f9871b
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r10 = "VAST_EVENT"
            r9[r5] = r10
            r9[r6] = r3
            r10 = 2
            r9[r10] = r4
            java.lang.String r11 = "%s EVENT_CLICK %s %s"
            com.fyber.inneractive.sdk.util.IAlog.m9030a((int) r7, (java.lang.String) r11, (java.lang.Object[]) r9)
            com.fyber.inneractive.sdk.util.u$c r7 = r3.f9977a
            com.fyber.inneractive.sdk.util.u$c r9 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            java.lang.String r11 = "url"
            r12 = 0
            if (r7 != r9) goto L_0x00dd
            com.fyber.inneractive.sdk.h.l r1 = com.fyber.inneractive.sdk.p049h.C2966l.CLICK_PARSING_FAILURE
            boolean r2 = r0.f6752e
            if (r2 != 0) goto L_0x00d3
            r0.f6752e = r6
            java.lang.Throwable r2 = r3.f9978b
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = "null-exception!"
            goto L_0x0083
        L_0x007d:
            java.lang.Throwable r2 = r3.f9978b
            java.lang.String r2 = r2.getMessage()
        L_0x0083:
            AdContent r7 = r0.f6749b     // Catch:{ all -> 0x00d3 }
            if (r7 != 0) goto L_0x008d
            com.fyber.inneractive.sdk.h.n$a r7 = new com.fyber.inneractive.sdk.h.n$a     // Catch:{ all -> 0x00d3 }
            r7.<init>((com.fyber.inneractive.sdk.p049h.C2966l) r1)     // Catch:{ all -> 0x00d3 }
            goto L_0x00a8
        L_0x008d:
            com.fyber.inneractive.sdk.h.n$a r7 = new com.fyber.inneractive.sdk.h.n$a     // Catch:{ all -> 0x00d3 }
            AdContent r8 = r0.f6749b     // Catch:{ all -> 0x00d3 }
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r8 = r8.mo18130g()     // Catch:{ all -> 0x00d3 }
            AdContent r9 = r0.f6749b     // Catch:{ all -> 0x00d3 }
            com.fyber.inneractive.sdk.j.e r9 = r9.mo18129f()     // Catch:{ all -> 0x00d3 }
            AdContent r10 = r0.f6749b     // Catch:{ all -> 0x00d3 }
            com.fyber.inneractive.sdk.config.a.s r10 = r10.mo18132i()     // Catch:{ all -> 0x00d3 }
            org.json.JSONArray r10 = r10.mo18013b()     // Catch:{ all -> 0x00d3 }
            r7.<init>((com.fyber.inneractive.sdk.p049h.C2966l) r1, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) r8, (com.fyber.inneractive.sdk.p051j.C3018e) r9, (org.json.JSONArray) r10)     // Catch:{ all -> 0x00d3 }
        L_0x00a8:
            com.fyber.inneractive.sdk.h.n$b r1 = new com.fyber.inneractive.sdk.h.n$b     // Catch:{ all -> 0x00d3 }
            r1.<init>()     // Catch:{ all -> 0x00d3 }
            if (r4 != 0) goto L_0x00b2
            java.lang.String r8 = "null"
            goto L_0x00b3
        L_0x00b2:
            r8 = r4
        L_0x00b3:
            com.fyber.inneractive.sdk.h.n$b r1 = r1.mo18438a(r11, r8)     // Catch:{ all -> 0x00d3 }
            java.lang.String r8 = "message"
            boolean r9 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00d3 }
            if (r9 == 0) goto L_0x00c1
            java.lang.String r2 = "empty"
        L_0x00c1:
            com.fyber.inneractive.sdk.h.n$b r1 = r1.mo18438a(r8, r2)     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "ctx_name"
            java.lang.String r8 = r3.f9979c     // Catch:{ all -> 0x00d3 }
            com.fyber.inneractive.sdk.h.n$b r1 = r1.mo18438a(r2, r8)     // Catch:{ all -> 0x00d3 }
            r7.mo18433a((com.fyber.inneractive.sdk.p049h.C2968n.C2971b) r1)     // Catch:{ all -> 0x00d3 }
            r7.mo18436b(r12)     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - failed opening URL %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            return r3
        L_0x00dd:
            boolean r7 = r0.f6756i
            if (r7 != 0) goto L_0x01f1
            r0.f6756i = r6
            AdContent r7 = r0.f6749b
            if (r7 != 0) goto L_0x00f6
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r9 = "InneractiveAdRendererImpl: no ad content?"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r7)
            com.fyber.inneractive.sdk.h.n$a r7 = new com.fyber.inneractive.sdk.h.n$a
            com.fyber.inneractive.sdk.h.m r9 = com.fyber.inneractive.sdk.p049h.C2967m.FYBER_SUCCESS_CLICK
            r7.<init>((com.fyber.inneractive.sdk.p049h.C2967m) r9)
            goto L_0x011a
        L_0x00f6:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r9 = "InneractiveAdRendererImpl: ad content exists!"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r7)
            com.fyber.inneractive.sdk.h.n$a r7 = new com.fyber.inneractive.sdk.h.n$a
            com.fyber.inneractive.sdk.h.m r9 = com.fyber.inneractive.sdk.p049h.C2967m.FYBER_SUCCESS_CLICK
            AdContent r13 = r0.f6749b
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r13 = r13.mo18130g()
            AdContent r14 = r0.f6749b
            com.fyber.inneractive.sdk.j.e r14 = r14.mo18129f()
            AdContent r15 = r0.f6749b
            com.fyber.inneractive.sdk.config.a.s r15 = r15.mo18132i()
            org.json.JSONArray r15 = r15.mo18013b()
            r7.<init>((com.fyber.inneractive.sdk.p049h.C2967m) r9, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) r13, (com.fyber.inneractive.sdk.p051j.C3018e) r14, (org.json.JSONArray) r15)
        L_0x011a:
            com.fyber.inneractive.sdk.h.n$b r9 = new com.fyber.inneractive.sdk.h.n$b
            r9.<init>()
            com.fyber.inneractive.sdk.h.n$b r13 = r9.mo18438a(r11, r4)
            com.fyber.inneractive.sdk.util.u$c r14 = r3.f9977a
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "opened_from"
            com.fyber.inneractive.sdk.h.n$b r13 = r13.mo18438a(r15, r14)
            java.lang.String r14 = "opened_by"
            java.lang.String r15 = "renderer"
            r13.mo18438a(r14, r15)
            float r13 = r2.f9894a
            r14 = 0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x0145
            float r13 = r2.f9895b
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x0145
            r13 = 1
            goto L_0x0146
        L_0x0145:
            r13 = 0
        L_0x0146:
            if (r13 == 0) goto L_0x01eb
            boolean r13 = r17.mo18230a()
            int r15 = r17.mo18151r()
            if (r13 == 0) goto L_0x0153
            goto L_0x0157
        L_0x0153:
            int r15 = com.fyber.inneractive.sdk.util.C3657l.m9119b((int) r15)
        L_0x0157:
            if (r15 != 0) goto L_0x015b
            r13 = 0
            goto L_0x015f
        L_0x015b:
            float r13 = r2.f9894a
            float r15 = (float) r15
            float r13 = r13 / r15
        L_0x015f:
            boolean r15 = r17.mo18230a()
            int r16 = r17.mo18152s()
            if (r15 == 0) goto L_0x016a
            goto L_0x016e
        L_0x016a:
            int r16 = com.fyber.inneractive.sdk.util.C3657l.m9119b((int) r16)
        L_0x016e:
            r15 = r16
            if (r15 != 0) goto L_0x0173
            goto L_0x0178
        L_0x0173:
            float r2 = r2.f9895b
            float r14 = (float) r15
            float r14 = r2 / r14
        L_0x0178:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.Float r15 = java.lang.Float.valueOf(r13)
            r2[r5] = r15
            java.lang.Float r15 = java.lang.Float.valueOf(r14)
            r2[r6] = r15
            java.lang.String r15 = "Point location -  x - %.2f , y- %.2f"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r15, r2)
            r17.mo18230a()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r15 = new java.lang.Object[r6]
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r15[r5] = r13
            java.lang.String r13 = "%.2f"
            java.lang.String r2 = java.lang.String.format(r2, r13, r15)
            java.lang.String r15 = "td_x"
            com.fyber.inneractive.sdk.h.n$b r2 = r9.mo18438a(r15, r2)
            r17.mo18230a()
            java.util.Locale r15 = java.util.Locale.ENGLISH
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r8[r5] = r14
            java.lang.String r8 = java.lang.String.format(r15, r13, r8)
            java.lang.String r13 = "td_y"
            r2.mo18438a(r13, r8)
            boolean r2 = r17.mo18230a()
            if (r2 == 0) goto L_0x01d1
            int r2 = com.fyber.inneractive.sdk.util.C3657l.m9128s()
            if (r2 != r6) goto L_0x01c9
            java.lang.String r2 = "p"
            goto L_0x01cb
        L_0x01c9:
            java.lang.String r2 = "l"
        L_0x01cb:
            java.lang.String r8 = "o"
            r9.mo18438a(r8, r2)
            goto L_0x01eb
        L_0x01d1:
            int r2 = r17.mo18151r()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r8 = "b_w"
            r9.mo18438a(r8, r2)
            int r2 = r17.mo18152s()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r8 = "b_h"
            r9.mo18438a(r8, r2)
        L_0x01eb:
            r7.mo18433a((com.fyber.inneractive.sdk.p049h.C2968n.C2971b) r9)
            r7.mo18436b(r12)
        L_0x01f1:
            if (r1 == 0) goto L_0x0221
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.m9029a((java.lang.Object) r17)
            r1[r5] = r2
            java.lang.String r2 = "%sBlocking clicks until grace has ended"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            r0.f6754g = r5
            java.lang.Runnable r1 = r0.f6757j
            if (r1 == 0) goto L_0x020f
            android.os.Handler r1 = com.fyber.inneractive.sdk.util.C3662m.m9137a()
            java.lang.Runnable r2 = r0.f6757j
            r1.removeCallbacks(r2)
        L_0x020f:
            com.fyber.inneractive.sdk.d.h$1 r1 = new com.fyber.inneractive.sdk.d.h$1
            r1.<init>()
            r0.f6757j = r1
            android.os.Handler r1 = com.fyber.inneractive.sdk.util.C3662m.m9137a()
            java.lang.Runnable r2 = r0.f6757j
            r7 = 1500(0x5dc, double:7.41E-321)
            r1.postDelayed(r2, r7)
        L_0x0221:
            com.fyber.inneractive.sdk.util.u$c r1 = r3.f9977a
            com.fyber.inneractive.sdk.util.u$c r2 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPEN_IN_EXTERNAL_APPLICATION
            if (r1 != r2) goto L_0x0237
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "InneractiveAdRendererImpl: handleOpenResult - opened in external application"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            EventsListener r1 = r0.f6750c
            if (r1 == 0) goto L_0x02a5
            r17.mo18149o()
            goto L_0x02a5
        L_0x0237:
            com.fyber.inneractive.sdk.util.u$c r2 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPENED_IN_INTERNAL_BROWSER
            if (r1 != r2) goto L_0x0248
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "InneractiveAdRendererImpl: handleOpenResult - opened in internal browser"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            r0.f6751d = r6
            com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.setInternalBrowserListener(r17)
            goto L_0x02a5
        L_0x0248:
            com.fyber.inneractive.sdk.util.u$c r2 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPEN_IN_EXTERNAL_BROWSER
            if (r1 == r2) goto L_0x0250
            com.fyber.inneractive.sdk.util.u$c r2 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPENED_USING_CHROME_NAVIGATE
            if (r1 != r2) goto L_0x02a5
        L_0x0250:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r7 = "InneractiveAdRendererImpl: handleOpenResult - opened in external browser"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r7, r2)
            AdContent r2 = r0.f6749b
            if (r2 == 0) goto L_0x0266
            com.fyber.inneractive.sdk.j.e r2 = r2.mo18129f()
            AdContent r7 = r0.f6749b
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r7 = r7.mo18130g()
            goto L_0x0268
        L_0x0266:
            r2 = r12
            r7 = r2
        L_0x0268:
            com.fyber.inneractive.sdk.h.n$a r8 = new com.fyber.inneractive.sdk.h.n$a
            com.fyber.inneractive.sdk.h.m r9 = com.fyber.inneractive.sdk.p049h.C2967m.EXTERNAL_BROWSER_OPENED
            r8.<init>((com.fyber.inneractive.sdk.p049h.C2967m) r9, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) r7, (com.fyber.inneractive.sdk.p051j.C3018e) r2)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r5] = r11
            r2[r6] = r4
            com.fyber.inneractive.sdk.h.n$a r2 = r8.mo18435a((java.lang.Object[]) r2)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r7 = "fallback"
            r4[r5] = r7
            com.fyber.inneractive.sdk.util.u$c r5 = com.fyber.inneractive.sdk.util.C3685u.C3688c.OPENED_USING_CHROME_NAVIGATE
            if (r1 != r5) goto L_0x0287
            java.lang.String r1 = "chrome"
            goto L_0x0289
        L_0x0287:
            java.lang.String r1 = "na"
        L_0x0289:
            r4[r6] = r1
            AdContent r1 = r0.f6749b
            com.fyber.inneractive.sdk.config.a.s r1 = r1.mo18132i()
            org.json.JSONArray r1 = r1.mo18013b()
            r4[r10] = r1
            com.fyber.inneractive.sdk.h.n$a r1 = r2.mo18435a((java.lang.Object[]) r4)
            r1.mo18436b(r12)
            EventsListener r1 = r0.f6750c
            if (r1 == 0) goto L_0x02a5
            r17.mo18149o()
        L_0x02a5:
            return r3
        L_0x02a6:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - external/browser is already opened"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            com.fyber.inneractive.sdk.util.u$a r1 = new com.fyber.inneractive.sdk.util.u$a
            com.fyber.inneractive.sdk.util.u$c r2 = com.fyber.inneractive.sdk.util.C3685u.C3688c.FAILED
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r5 = "external/browser is already open"
            r3.<init>(r5)
            r1.<init>(r2, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p037d.C2837h.mo18136a(android.content.Context, java.lang.String, com.fyber.inneractive.sdk.util.aj):com.fyber.inneractive.sdk.util.u$a");
    }

    public void onApplicationInBackground() {
        mo18149o();
        mo18144f_();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f_ */
    public final void mo18144f_() {
        this.f6756i = false;
        this.f6755h = false;
    }

    public void onInternalBrowserDismissed() {
        IAlog.m9034b("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f6751d) {
            this.f6751d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener((InneractiveInternalBrowserActivity.InternalBrowserListener) null);
        }
        if (this.f6750c != null) {
            IAlog.m9034b("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.m9029a((Object) this));
            this.f6750c.onAdWillCloseInternalBrowser(this.f6748a);
        }
        mo18144f_();
    }

    public void destroy() {
        if (this.f6751d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener((InneractiveInternalBrowserActivity.InternalBrowserListener) null);
            this.f6751d = false;
        }
        if (this.f6757j != null) {
            C3662m.m9137a().removeCallbacks(this.f6757j);
            this.f6757j = null;
        }
        this.f6749b = null;
        this.f6750c = null;
        this.f6748a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo18147m() {
        C3018e f;
        if (!this.f6753f && this.f6750c != null) {
            IAlog.m9034b("%sCalling external interface onAdImpression", IAlog.m9029a((Object) this));
            this.f6750c.onAdImpression(this.f6748a);
            AdContent adcontent = this.f6749b;
            if (!(adcontent == null || (f = adcontent.mo18129f()) == null)) {
                C2813y n = IAConfigManager.m5943n();
                if (n != null) {
                    UnitDisplayType unitDisplayType = f.f7415r;
                    n.mo18087a(unitDisplayType, "LAST_DOMAIN_SHOWED", f.mo18499c());
                    n.mo18087a(unitDisplayType, "LAST_APP_BUNDLE_ID", f.f7397C);
                    if (!(unitDisplayType == UnitDisplayType.REWARDED || f.f7419v == null || f.f7419v.getVideo() == null || !f.f7419v.getVideo().isSkippable())) {
                        n.mo18088a(unitDisplayType, "LAST_VAST_SKIPED");
                    }
                    n.mo18088a(unitDisplayType, "LAST_VAST_CLICKED_TYPE", "LAST_CLICKED");
                }
                C3620ab m = IAConfigManager.m5942m();
                C2809u h = this.f6749b.mo18131h();
                ImpressionData impressionData = f.f7419v;
                if (!(h == null || m.f9878a == null)) {
                    m.f9878a.onImpression(h.mo18065b(), h.mo18064a(), impressionData);
                }
                EventsListener eventslistener = this.f6750c;
                if (eventslistener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                    ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventslistener).onAdImpression(this.f6748a, f.f7419v);
                } else if (eventslistener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                    ((InneractiveAdViewEventsListenerWithImpressionData) eventslistener).onAdImpression(this.f6748a, f.f7419v);
                }
            }
            this.f6753f = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo18148n() {
        C3018e f;
        if (this.f6750c != null) {
            IAlog.m9034b("%sCalling external interface onAdClicked", IAlog.m9029a((Object) this));
            this.f6750c.onAdClicked(this.f6748a);
        }
        AdContent adcontent = this.f6749b;
        if (adcontent != null && (f = adcontent.mo18129f()) != null) {
            IAConfigManager.m5943n().mo18087a(f.f7415r, "LAST_CLICKED", "1");
        }
    }

    /* renamed from: o */
    public final void mo18149o() {
        if (this.f6750c != null) {
            IAlog.m9034b("%sCalling external interface onAdWillOpenExternalApp", IAlog.m9029a((Object) this));
            this.f6750c.onAdWillOpenExternalApp(this.f6748a);
        }
        mo18144f_();
    }

    /* renamed from: a */
    public final void mo18139a(String str) {
        if (!this.f6755h) {
            this.f6755h = true;
            C2967m mVar = C2967m.VAST_EVENT_COMPANION_CLICKED;
            AdContent adcontent = this.f6749b;
            InneractiveAdRequest g = adcontent != null ? adcontent.mo18130g() : null;
            AdContent adcontent2 = this.f6749b;
            C3018e f = adcontent2 != null ? adcontent2.mo18129f() : null;
            AdContent adcontent3 = this.f6749b;
            C2968n.C2969a aVar = new C2968n.C2969a(mVar, g, f, adcontent3 != null ? adcontent3.mo18132i().mo18013b() : null);
            C2968n.C2971b bVar = new C2968n.C2971b();
            if (str == null) {
                str = "na";
            }
            aVar.mo18433a(bVar.mo18438a("mime", str));
            aVar.mo18436b((String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g_ */
    public final void mo18145g_() {
        AdContent adcontent = this.f6749b;
        if (adcontent != null && adcontent.mo18129f() != null) {
            String str = this.f6749b.mo18129f().f7417t;
            if (!TextUtils.isEmpty(str)) {
                IAlog.m9033a("%sfiring rewarded completion!", IAlog.m9029a((Object) this));
                IAlog.m9030a(IAlog.f9871b, "AD_REWARDED_COMPLETION", new Object[0]);
                mo18141b(str);
            }
        }
    }

    /* renamed from: b */
    public final void mo18141b(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        IAConfigManager.m5937h().mo18441a(new C2941ae(new C2977r<String>() {
            /* renamed from: a */
            public final /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                String str = (String) obj;
                IAlog.m9030a(IAlog.f9871b, "Hit Request - %s", str);
                IAlog.m9034b("Hit Request: Hitting URL finished: %s", str);
                if (exc == null) {
                    IAlog.m9034b("Hit Request: Hitting URL response code: %s", str);
                } else {
                    IAlog.m9034b("Hit Request: Hitting URL failed: %s", exc);
                }
                IAlog.m9034b("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }, str));
    }

    /* renamed from: a */
    public final void mo18137a(InneractiveUnitController.AdDisplayError adDisplayError) {
        String simpleName = adDisplayError.getClass().getSimpleName();
        String message = adDisplayError.getMessage();
        AdContent adcontent = this.f6749b;
        C3018e eVar = null;
        InneractiveAdRequest inneractiveAdRequest = adcontent != null ? adcontent.f6742f : null;
        AdContent adcontent2 = this.f6749b;
        if (adcontent2 != null) {
            eVar = adcontent2.mo18129f();
        }
        C2972o.m6654a(simpleName, message, inneractiveAdRequest, eVar);
        if (this.f6750c != null) {
            IAlog.m9034b("%sCalling external interface onAdEnteredErrorState: %s", IAlog.m9029a((Object) this), adDisplayError.getMessage());
            this.f6750c.onAdEnteredErrorState(this.f6748a, adDisplayError);
        }
    }

    /* renamed from: a */
    protected static void m6230a(int i, C2689b bVar) {
        IAConfigManager.m5943n().mo18086a(bVar, i);
    }

    /* renamed from: a */
    private boolean mo18230a() {
        AdContent adcontent = this.f6749b;
        if (adcontent != null) {
            return adcontent.mo18126a_();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo18138a(C3018e eVar) {
        String str = eVar.f7411n;
        if (str != null && str.trim().length() > 0) {
            IAlog.m9033a("%sfiring impression!", IAlog.m9029a((Object) this));
            IAlog.m9030a(IAlog.f9871b, "AD_IMPRESSION", new Object[0]);
            mo18141b(str);
        }
    }

    /* renamed from: b */
    public final void mo18140b(C3018e eVar) {
        String str = eVar.f7412o;
        if (str != null && str.trim().length() > 0) {
            IAlog.m9030a(IAlog.f9871b, "AD_CLICKED", new Object[0]);
            mo18141b(str);
        }
    }
}
