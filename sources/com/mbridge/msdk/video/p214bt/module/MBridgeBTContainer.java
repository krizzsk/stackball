package com.mbridge.msdk.video.p214bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.tools.C6337h;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.dynview.C6923a;
import com.mbridge.msdk.video.dynview.p218a.C6924a;
import com.mbridge.msdk.video.dynview.p221d.C6932a;
import com.mbridge.msdk.video.module.p233b.C7047a;
import com.mbridge.msdk.video.p214bt.module.p216a.C6912a;
import com.mbridge.msdk.video.p214bt.module.p216a.C6913b;
import com.mbridge.msdk.video.p214bt.module.p217b.C6922h;
import com.mbridge.msdk.video.p214bt.p215a.C6877c;
import com.mbridge.msdk.video.signal.C7067b;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.video.signal.factory.C7158b;
import com.mbridge.msdk.video.signal.p235a.C7062j;
import com.mbridge.msdk.videocommon.C7165a;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import com.tapjoy.TJAdUnitConstants;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTContainer */
public class MBridgeBTContainer extends AbstractJSContainer implements C7067b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f16943a = MBridgeBTContainer.class.getSimpleName();

    /* renamed from: A */
    private boolean f16944A = false;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public List<CampaignEx> f16945B;

    /* renamed from: C */
    private List<C7180a> f16946C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C6912a f16947D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C6922h f16948E;

    /* renamed from: F */
    private C6913b f16949F;

    /* renamed from: G */
    private String f16950G;

    /* renamed from: H */
    private String f16951H;

    /* renamed from: I */
    private String f16952I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f16953J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f16954K;

    /* renamed from: L */
    private C6932a f16955L;

    /* renamed from: b */
    private int f16956b = 0;

    /* renamed from: c */
    private int f16957c = 1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public FrameLayout f16958d;

    /* renamed from: e */
    private MBridgeBTLayout f16959e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WindVaneWebView f16960f;

    /* renamed from: g */
    private LayoutInflater f16961g;

    /* renamed from: h */
    private Context f16962h;

    /* renamed from: i */
    private boolean f16963i = false;

    /* renamed from: y */
    private boolean f16964y = true;

    /* renamed from: z */
    private String f16965z;

    public void click(int i, String str) {
    }

    public void handlerH5Exception(int i, String str) {
    }

    public MBridgeBTContainer(Context context) {
        super(context);
        init(context);
    }

    public MBridgeBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public void init(Context context) {
        this.f16962h = context;
        this.f16961g = LayoutInflater.from(context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:44|(4:46|(4:49|(2:51|77)(1:76)|74|47)|75|52)|53|54|55|56|57|58|(1:80)(2:62|81)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0217 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r8 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "_"
            java.lang.String r2 = "mbridge_bt_container"
            int r2 = r8.findLayout(r2)     // Catch:{ all -> 0x0272 }
            if (r2 >= 0) goto L_0x0012
            java.lang.String r0 = "mbridge_bt_container layout null"
            r8.mo48267a((java.lang.String) r0)     // Catch:{ all -> 0x0272 }
            return
        L_0x0012:
            android.view.LayoutInflater r3 = r8.f16961g     // Catch:{ all -> 0x0272 }
            android.view.View r2 = r3.inflate(r2, r8)     // Catch:{ all -> 0x0272 }
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2     // Catch:{ all -> 0x0272 }
            r8.f16958d = r2     // Catch:{ all -> 0x0272 }
            if (r2 != 0) goto L_0x0024
            java.lang.String r0 = "ViewIds null"
            r8.mo48267a((java.lang.String) r0)     // Catch:{ all -> 0x0272 }
            return
        L_0x0024:
            r8.f16951H = r0     // Catch:{ all -> 0x0272 }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r8.f16945B     // Catch:{ all -> 0x0272 }
            r3 = 0
            if (r2 == 0) goto L_0x0046
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r8.f16945B     // Catch:{ all -> 0x0272 }
            int r2 = r2.size()     // Catch:{ all -> 0x0272 }
            if (r2 <= 0) goto L_0x0046
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r8.f16945B     // Catch:{ all -> 0x0272 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ all -> 0x0272 }
            java.lang.String r4 = r2.getMof_template_url()     // Catch:{ all -> 0x0272 }
            java.lang.String r2 = r2.getRequestId()     // Catch:{ all -> 0x0272 }
            r8.f16951H = r2     // Catch:{ all -> 0x0272 }
            goto L_0x0047
        L_0x0046:
            r4 = r0
        L_0x0047:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0272 }
            r2.<init>()     // Catch:{ all -> 0x0272 }
            java.lang.String r5 = r8.f17839k     // Catch:{ all -> 0x0272 }
            r2.append(r5)     // Catch:{ all -> 0x0272 }
            r2.append(r1)     // Catch:{ all -> 0x0272 }
            java.lang.String r5 = r8.f16951H     // Catch:{ all -> 0x0272 }
            r2.append(r5)     // Catch:{ all -> 0x0272 }
            r2.append(r1)     // Catch:{ all -> 0x0272 }
            r2.append(r4)     // Catch:{ all -> 0x0272 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.videocommon.a$a r2 = com.mbridge.msdk.videocommon.C7165a.m18055a((java.lang.String) r2)     // Catch:{ all -> 0x0272 }
            if (r2 == 0) goto L_0x008f
            java.lang.String r5 = r2.mo49058b()     // Catch:{ all -> 0x0272 }
            r8.f16965z = r5     // Catch:{ all -> 0x0272 }
            java.lang.String r5 = f16943a     // Catch:{ all -> 0x0272 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0272 }
            r6.<init>()     // Catch:{ all -> 0x0272 }
            java.lang.String r7 = "get BT wraper.getTag = "
            r6.append(r7)     // Catch:{ all -> 0x0272 }
            java.lang.String r7 = r8.f16965z     // Catch:{ all -> 0x0272 }
            r6.append(r7)     // Catch:{ all -> 0x0272 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r5, r6)     // Catch:{ all -> 0x0272 }
            r2.mo49056a((java.lang.String) r0)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r0 = r2.mo49054a()     // Catch:{ all -> 0x0272 }
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            r8.f16960f = r0     // Catch:{ all -> 0x0272 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0272 }
            r0.<init>()     // Catch:{ all -> 0x0272 }
            java.lang.String r2 = r8.f17839k     // Catch:{ all -> 0x0272 }
            r0.append(r2)     // Catch:{ all -> 0x0272 }
            r0.append(r1)     // Catch:{ all -> 0x0272 }
            java.lang.String r2 = r8.f16951H     // Catch:{ all -> 0x0272 }
            r0.append(r2)     // Catch:{ all -> 0x0272 }
            r0.append(r1)     // Catch:{ all -> 0x0272 }
            r0.append(r4)     // Catch:{ all -> 0x0272 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.videocommon.C7165a.m18063b(r0)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r0 = r8.f16960f     // Catch:{ all -> 0x0272 }
            if (r0 == 0) goto L_0x023e
            com.mbridge.msdk.video.signal.factory.b r0 = new com.mbridge.msdk.video.signal.factory.b     // Catch:{ all -> 0x0272 }
            android.app.Activity r1 = r8.f17838j     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r8.f16960f     // Catch:{ all -> 0x0272 }
            r0.<init>(r1, r8, r2)     // Catch:{ all -> 0x0272 }
            r8.registerJsFactory(r0)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r1 = r8.f16960f     // Catch:{ all -> 0x0272 }
            r1.setApiManagerJSFactory(r0)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r1 = r8.f16960f     // Catch:{ all -> 0x0272 }
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ all -> 0x0272 }
            if (r1 == 0) goto L_0x00d4
            java.lang.String r0 = "preload template webview is null or load error"
            r8.mo48267a((java.lang.String) r0)     // Catch:{ all -> 0x0272 }
            return
        L_0x00d4:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r1 = r8.f16960f     // Catch:{ all -> 0x0272 }
            java.lang.Object r1 = r1.getObject()     // Catch:{ all -> 0x0272 }
            boolean r1 = r1 instanceof com.mbridge.msdk.video.signal.p235a.C7062j     // Catch:{ all -> 0x0272 }
            if (r1 == 0) goto L_0x0170
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r1 = r8.f16960f     // Catch:{ all -> 0x0272 }
            java.lang.Object r1 = r1.getObject()     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.signal.a.j r1 = (com.mbridge.msdk.video.signal.p235a.C7062j) r1     // Catch:{ all -> 0x0272 }
            r0.mo49051a(r1)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r0 = r8.f16960f     // Catch:{ all -> 0x0272 }
            if (r0 == 0) goto L_0x0165
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0272 }
            r0.<init>()     // Catch:{ all -> 0x0272 }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C6204a.f15400j     // Catch:{ all -> 0x0272 }
            android.content.Context r2 = r8.getContext()     // Catch:{ all -> 0x0272 }
            float r2 = com.mbridge.msdk.foundation.tools.C6366u.m16215d((android.content.Context) r2)     // Catch:{ all -> 0x0272 }
            double r4 = (double) r2     // Catch:{ all -> 0x0272 }
            r0.put(r1, r4)     // Catch:{ all -> 0x0272 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            r1.<init>()     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            java.lang.String r2 = "name"
            com.mbridge.msdk.videocommon.b.c r4 = r8.f17843o     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            java.lang.String r4 = r4.mo49082a()     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            java.lang.String r2 = "amount"
            com.mbridge.msdk.videocommon.b.c r4 = r8.f17843o     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            int r4 = r4.mo49085b()     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            java.lang.String r2 = "id"
            java.lang.String r4 = r8.f17844p     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            java.lang.String r2 = "userId"
            java.lang.String r4 = r8.f17842n     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            r0.put(r2, r4)     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            java.lang.String r2 = "reward"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            java.lang.String r1 = "playVideoMute"
            int r2 = r8.f17845q     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            java.lang.String r1 = "extra"
            java.lang.String r2 = r8.f16952I     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0148, Exception -> 0x013d }
            goto L_0x0152
        L_0x013d:
            r1 = move-exception
            java.lang.String r2 = f16943a     // Catch:{ all -> 0x0272 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r2, r1)     // Catch:{ all -> 0x0272 }
            goto L_0x0152
        L_0x0148:
            r1 = move-exception
            java.lang.String r2 = f16943a     // Catch:{ all -> 0x0272 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r2, r1)     // Catch:{ all -> 0x0272 }
        L_0x0152:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.signal.f r1 = r8.getJSNotifyProxy()     // Catch:{ all -> 0x0272 }
            r1.mo48833a((java.lang.Object) r0)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.signal.c r0 = r8.getJSCommon()     // Catch:{ all -> 0x0272 }
            r1 = 1
            r0.mo48810b((boolean) r1)     // Catch:{ all -> 0x0272 }
        L_0x0165:
            com.mbridge.msdk.video.signal.c r0 = r8.getJSCommon()     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.signal.a.c r0 = (com.mbridge.msdk.video.signal.p235a.C7053c) r0     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.signal.c$a r0 = r0.f17556l     // Catch:{ all -> 0x0272 }
            r0.mo48316a()     // Catch:{ all -> 0x0272 }
        L_0x0170:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r0 = r8.f16960f     // Catch:{ all -> 0x0272 }
            r0.setBackgroundColor(r3)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.bt.a.c r0 = com.mbridge.msdk.video.p214bt.p215a.C6877c.m17219a()     // Catch:{ all -> 0x0272 }
            java.lang.String r1 = r8.f17839k     // Catch:{ all -> 0x0272 }
            java.lang.String r2 = r8.f16951H     // Catch:{ all -> 0x0272 }
            java.util.LinkedHashMap r0 = r0.mo48201b((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0272 }
            if (r0 == 0) goto L_0x0238
            java.lang.String r1 = r8.f16965z     // Catch:{ all -> 0x0272 }
            boolean r1 = r0.containsKey(r1)     // Catch:{ all -> 0x0272 }
            if (r1 == 0) goto L_0x0238
            java.lang.String r1 = r8.f16965z     // Catch:{ all -> 0x0272 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0272 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0272 }
            boolean r2 = r1 instanceof com.mbridge.msdk.video.p214bt.module.MBridgeBTLayout     // Catch:{ all -> 0x0272 }
            if (r2 == 0) goto L_0x01e9
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r1 = (com.mbridge.msdk.video.p214bt.module.MBridgeBTLayout) r1     // Catch:{ all -> 0x0272 }
            r8.f16959e = r1     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r8.f16960f     // Catch:{ all -> 0x0272 }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0272 }
            r5 = -1
            r4.<init>(r5, r5)     // Catch:{ all -> 0x0272 }
            r1.addView(r2, r3, r4)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r1 = r8.f16959e     // Catch:{ all -> 0x0272 }
            java.lang.String r2 = r8.f16965z     // Catch:{ all -> 0x0272 }
            r1.setTag(r2)     // Catch:{ all -> 0x0272 }
            java.lang.String r1 = r8.f16965z     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r2 = r8.f16959e     // Catch:{ all -> 0x0272 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0272 }
            java.util.Collection r1 = r0.values()     // Catch:{ all -> 0x0272 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0272 }
        L_0x01bc:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0272 }
            if (r2 == 0) goto L_0x01df
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0272 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0272 }
            boolean r4 = r2 instanceof com.mbridge.msdk.video.p214bt.module.MBridgeBTRootLayout     // Catch:{ all -> 0x0272 }
            if (r4 == 0) goto L_0x01bc
            com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout r2 = (com.mbridge.msdk.video.p214bt.module.MBridgeBTRootLayout) r2     // Catch:{ all -> 0x0272 }
            java.lang.String r4 = r2.getInstanceId()     // Catch:{ all -> 0x0272 }
            r8.f16950G = r4     // Catch:{ all -> 0x0272 }
            android.widget.FrameLayout r4 = r8.f16958d     // Catch:{ all -> 0x0272 }
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0272 }
            r6.<init>(r5, r5)     // Catch:{ all -> 0x0272 }
            r4.addView(r2, r6)     // Catch:{ all -> 0x0272 }
            goto L_0x01bc
        L_0x01df:
            java.lang.String r1 = r8.f16950G     // Catch:{ all -> 0x0272 }
            r0.remove(r1)     // Catch:{ all -> 0x0272 }
            java.lang.String r1 = r8.f16950G     // Catch:{ all -> 0x0272 }
            r0.put(r1, r8)     // Catch:{ all -> 0x0272 }
        L_0x01e9:
            com.mbridge.msdk.video.bt.a.c r0 = com.mbridge.msdk.video.p214bt.p215a.C6877c.m17219a()     // Catch:{ all -> 0x0272 }
            java.lang.String r1 = r8.f17839k     // Catch:{ all -> 0x0272 }
            int r2 = r8.f17845q     // Catch:{ all -> 0x0272 }
            r0.mo48197a((java.lang.String) r1, (int) r2)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.bt.a.c r0 = com.mbridge.msdk.video.p214bt.p215a.C6877c.m17219a()     // Catch:{ all -> 0x0272 }
            java.lang.String r1 = r8.f16965z     // Catch:{ all -> 0x0272 }
            java.lang.String r2 = r8.f16951H     // Catch:{ all -> 0x0272 }
            r0.mo48198a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.bt.a.c r0 = com.mbridge.msdk.video.p214bt.p215a.C6877c.m17219a()     // Catch:{ all -> 0x0272 }
            java.lang.String r1 = r8.f16950G     // Catch:{ all -> 0x0272 }
            java.lang.String r2 = r8.f16951H     // Catch:{ all -> 0x0272 }
            r0.mo48198a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0272 }
            java.util.concurrent.ThreadPoolExecutor r0 = com.mbridge.msdk.foundation.same.p171f.C6233b.m15776a()     // Catch:{ all -> 0x0217 }
            com.mbridge.msdk.video.bt.module.MBridgeBTContainer$1 r1 = new com.mbridge.msdk.video.bt.module.MBridgeBTContainer$1     // Catch:{ all -> 0x0217 }
            r1.<init>()     // Catch:{ all -> 0x0217 }
            r0.execute(r1)     // Catch:{ all -> 0x0217 }
            goto L_0x021e
        L_0x0217:
            java.lang.String r0 = f16943a     // Catch:{ all -> 0x0272 }
            java.lang.String r1 = "remove campaign failed"
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r1)     // Catch:{ all -> 0x0272 }
        L_0x021e:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r8.f16945B     // Catch:{ all -> 0x0272 }
            if (r0 == 0) goto L_0x0287
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r8.f16945B     // Catch:{ all -> 0x0272 }
            int r0 = r0.size()     // Catch:{ all -> 0x0272 }
            if (r0 <= 0) goto L_0x0287
            com.mbridge.msdk.videocommon.d.c r0 = r8.f17841m     // Catch:{ all -> 0x0272 }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r8.f16945B     // Catch:{ all -> 0x0272 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch:{ all -> 0x0272 }
            r8.mo49028a((com.mbridge.msdk.videocommon.p239d.C7179c) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r1)     // Catch:{ all -> 0x0272 }
            goto L_0x0287
        L_0x0238:
            java.lang.String r0 = "big template webviewLayout is null"
            r8.mo48267a((java.lang.String) r0)     // Catch:{ all -> 0x0272 }
            return
        L_0x023e:
            boolean r0 = com.mbridge.msdk.foundation.tools.C6366u.m16221f((java.lang.String) r4)     // Catch:{ all -> 0x0272 }
            if (r0 == 0) goto L_0x026c
            android.content.Context r0 = r8.f16962h     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.dynview.d.a r1 = r8.f16955L     // Catch:{ all -> 0x0272 }
            if (r1 != 0) goto L_0x0250
            java.lang.String r0 = "ChoiceOneCallback is null"
            r8.mo48267a((java.lang.String) r0)     // Catch:{ all -> 0x0272 }
            goto L_0x0287
        L_0x0250:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0272 }
            r1.<init>()     // Catch:{ all -> 0x0272 }
            java.lang.String r2 = "choice_one_callback"
            com.mbridge.msdk.video.dynview.d.a r3 = r8.f16955L     // Catch:{ all -> 0x0272 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.dynview.C6923a.m17464a()     // Catch:{ all -> 0x0272 }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r8.f16945B     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.bt.module.MBridgeBTContainer$2 r3 = new com.mbridge.msdk.video.bt.module.MBridgeBTContainer$2     // Catch:{ all -> 0x0272 }
            r3.<init>()     // Catch:{ all -> 0x0272 }
            com.mbridge.msdk.video.dynview.g.a r4 = new com.mbridge.msdk.video.dynview.g.a     // Catch:{ all -> 0x0272 }
            r4.<init>(r0, r2, r3, r1)     // Catch:{ all -> 0x0272 }
            goto L_0x0287
        L_0x026c:
            java.lang.String r0 = "big template webview is null"
            r8.mo48267a((java.lang.String) r0)     // Catch:{ all -> 0x0272 }
            goto L_0x0287
        L_0x0272:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onCreate exception "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.mo48267a((java.lang.String) r0)
        L_0x0287:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.module.MBridgeBTContainer.onCreate():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48267a(String str) {
        C6922h hVar = this.f16948E;
        if (hVar != null) {
            hVar.mo47005a(str);
        }
        super.mo48267a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48320a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls != null && pv_urls.size() > 0) {
                    for (String a : pv_urls) {
                        CampaignEx campaignEx2 = campaignEx;
                        C6097a.m15185a(C6122a.m15302b().mo42895d(), campaignEx2, this.f17839k, a, false, true);
                    }
                }
            } catch (Throwable th) {
                C6361q.m16158d(f16943a, th.getMessage());
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> b = C6877c.m17219a().mo48201b(this.f17839k, this.f16951H);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBTempContainer) {
                        ((MBTempContainer) next).onConfigurationChanged(configuration);
                    } else if (next instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) next).onConfigurationChanged(configuration);
                    } else if (next instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) next).onConfigurationChanged(configuration);
                    }
                }
            }
        } catch (Throwable th) {
            C6361q.m16154a(f16943a, th.getMessage());
        }
    }

    public void onResume() {
        super.onResume();
        try {
            LinkedHashMap<String, View> b = C6877c.m17219a().mo48201b(this.f17839k, this.f16951H);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) next).onResume();
                    }
                }
            }
        } catch (Throwable th) {
            C6361q.m16154a(f16943a, th.getMessage());
        }
    }

    public void onStop() {
        super.onStop();
        try {
            LinkedHashMap<String, View> b = C6877c.m17219a().mo48201b(this.f17839k, this.f16951H);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) next).onStop();
                    }
                }
            }
        } catch (Throwable th) {
            C6361q.m16154a(f16943a, th.getMessage());
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b = C6877c.m17219a().mo48201b(this.f17839k, this.f16951H);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBTempContainer) {
                        ((MBTempContainer) next).onBackPressed();
                    } else if (next instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) next).onBackPressed();
                    } else if (next instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) next).onBackPressed();
                    }
                }
            }
        } catch (Throwable th) {
            C6361q.m16154a(f16943a, th.getMessage());
        }
    }

    public void onPause() {
        super.onPause();
        try {
            LinkedHashMap<String, View> b = C6877c.m17219a().mo48201b(this.f17839k, this.f16951H);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) next).onPause();
                    }
                }
            }
        } catch (Throwable th) {
            C6361q.m16154a(f16943a, th.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onAdClose() {
        if (this.f17838j != null) {
            this.f17838j.finish();
        }
    }

    public void onDestroy() {
        if (!this.f16944A) {
            this.f16944A = true;
            super.onDestroy();
            try {
                if (this.f16960f != null) {
                    ViewGroup viewGroup = (ViewGroup) this.f16960f.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                    }
                    this.f16960f.clearWebView();
                    this.f16960f.release();
                }
                if (this.f16949F != null) {
                    this.f16949F = null;
                }
                if (this.f16947D != null) {
                    this.f16947D = null;
                }
                if (this.f16962h != null) {
                    this.f16962h = null;
                }
                if (this.f16945B != null && this.f16945B.size() > 0) {
                    for (CampaignEx next : this.f16945B) {
                        if (!(next == null || next.getRewardTemplateMode() == null)) {
                            C7165a.m18063b(this.f17839k + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo43510d());
                        }
                    }
                }
                C6877c.m17219a().mo48209e(this.f16965z);
                C6877c.m17219a().mo48211f(this.f17839k);
                C6877c.m17219a().mo48201b(this.f17839k, this.f16951H).remove(this.f16965z);
                C6877c.m17219a().mo48201b(this.f17839k, this.f16951H).remove(this.f16950G);
                C6877c.m17219a().mo48201b(this.f17839k, this.f16951H).clear();
            } catch (Throwable th) {
                C6361q.m16154a(f16943a, th.getMessage());
            }
        }
    }

    public void reactDeveloper(Object obj, String str) {
        if (this.f16947D == null || TextUtils.isEmpty(str)) {
            mo49030a(obj, "listener is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            String optString = jSONObject.optString("unitId", getUnitId());
            String optString2 = jSONObject.optString(MBridgeConstans.PLACEMENT_ID, getPlacementId());
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            CampaignEx campaignEx = this.f16945B.get(0);
            boolean z = true;
            if (optInt == 1 && optJSONObject != null) {
                boolean optBoolean = optJSONObject.optBoolean("expired");
                if (campaignEx != null) {
                    if (optBoolean) {
                        campaignEx.setSpareOfferFlag(1);
                    } else {
                        campaignEx.setSpareOfferFlag(0);
                    }
                }
            }
            setCBT(campaignEx);
            JSONObject jSONObject2 = null;
            switch (optInt) {
                case 1:
                    this.f16947D.mo47082a();
                    this.f16947D.mo47083a(2, optString2, optString);
                    break;
                case 2:
                    if (optJSONObject != null) {
                        jSONObject2 = optJSONObject.optJSONObject("error");
                    }
                    String str2 = "";
                    if (jSONObject2 != null) {
                        str2 = jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    this.f16947D.mo47084a(str2);
                    this.f16947D.mo47083a(4, optString2, optString);
                    break;
                case 3:
                    this.f16947D.mo47085a(optString2, optString);
                    this.f16947D.mo47083a(5, optString2, optString);
                    break;
                case 4:
                    this.f16947D.mo47089b(optString2, optString);
                    this.f16947D.mo47083a(6, optString2, optString);
                    break;
                case 5:
                    this.f16947D.mo47088a(jSONObject.optBoolean("isAutoClick"), optString2, optString);
                    break;
                case 6:
                    if (optJSONObject != null) {
                        if (optJSONObject.optInt("convert") != 1) {
                            z = false;
                        }
                        jSONObject2 = optJSONObject.optJSONObject("reward");
                        String optString3 = optJSONObject.optString("extra");
                        if (!TextUtils.isEmpty(optString3)) {
                            this.f16952I = optString3;
                        }
                    } else {
                        z = false;
                    }
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                    C7170c a = C7170c.m18098a(jSONObject2);
                    if (a == null) {
                        a = this.f17843o;
                    }
                    this.f16947D.mo47083a(7, optString2, optString);
                    if (this.f17846r && (this.f17848t == C6204a.f15403m || this.f17848t == C6204a.f15404n)) {
                        this.f16947D.mo47086a(this.f16953J, this.f16954K);
                    }
                    if (!z) {
                        a.mo49083a(0);
                    }
                    this.f16947D.mo47087a(z, a);
                    C6361q.m16154a(f16943a, "sendToServerRewardInfo");
                    if (!this.f17846r && z) {
                        if (parseCampaignWithBackData == null) {
                            C7047a.m17788a(campaignEx, a, optString, this.f17842n, this.f16952I);
                            break;
                        } else {
                            C7047a.m17788a(parseCampaignWithBackData, a, optString, this.f17842n, this.f16952I);
                            break;
                        }
                    }
            }
            mo49029a(obj);
        } catch (JSONException e) {
            mo49030a(obj, e.getMessage());
            C6361q.m16154a(f16943a, e.getMessage());
        }
    }

    public void appendSubView(MBridgeBTContainer mBridgeBTContainer, MBTempContainer mBTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context d = C6122a.m15302b().mo42895d();
                int optInt = jSONObject.optInt("left", -999);
                int optInt2 = jSONObject.optInt("top", -999);
                int optInt3 = jSONObject.optInt("right", -999);
                int optInt4 = jSONObject.optInt(TJAdUnitConstants.String.BOTTOM, -999);
                if (!(optInt == -999 || d == null)) {
                    layoutParams.leftMargin = C6366u.m16203b(d, (float) optInt);
                }
                if (!(optInt2 == -999 || d == null)) {
                    layoutParams.topMargin = C6366u.m16203b(d, (float) optInt2);
                }
                if (!(optInt3 == -999 || d == null)) {
                    layoutParams.rightMargin = C6366u.m16203b(d, (float) optInt3);
                }
                if (!(optInt4 == -999 || d == null)) {
                    layoutParams.bottomMargin = C6366u.m16203b(d, (float) optInt4);
                }
                int optInt5 = jSONObject.optInt("width");
                int optInt6 = jSONObject.optInt("height");
                if (optInt5 > 0) {
                    layoutParams.width = optInt5;
                }
                if (optInt6 > 0) {
                    layoutParams.height = optInt6;
                }
            }
            mBridgeBTContainer.addView(mBTempContainer, layoutParams);
            mBTempContainer.setActivity(this.f17838j);
            mBTempContainer.setMute(this.f17845q);
            mBTempContainer.setBidCampaign(this.f16963i);
            mBTempContainer.setIV(this.f17846r);
            mBTempContainer.setBigOffer(this.f16964y);
            mBTempContainer.setIVRewardEnable(this.f17848t, this.f17849u, this.f17850v);
            mBTempContainer.setShowRewardListener(this.f16948E);
            mBTempContainer.setCampaignDownLoadTask(m17349d(mBTempContainer.getCampaign()));
            if (this.f16949F == null) {
                this.f16949F = new C6913b() {
                    /* renamed from: a */
                    public final void mo48345a(String str) {
                        if (MBridgeBTContainer.this.f16960f != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("id", str);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(MBridgeConstans.PLACEMENT_ID, MBridgeBTContainer.this.f17840l);
                                jSONObject2.put("unitId", MBridgeBTContainer.this.f17839k);
                                jSONObject.put("data", jSONObject2);
                                String a = MBridgeBTContainer.f16943a;
                                C6361q.m16154a(a, " BT Call H5 onAdShow " + jSONObject.toString());
                            } catch (JSONException e) {
                                C6361q.m16154a(MBridgeBTContainer.f16943a, e.getMessage());
                            }
                            C6563g.m16891a().mo44522a((WebView) MBridgeBTContainer.this.f16960f, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        }
                    }

                    /* renamed from: a */
                    public final void mo48349a(String str, boolean z, C7170c cVar) {
                        if (MBridgeBTContainer.this.f16960f != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("id", str);
                                JSONObject jSONObject2 = new JSONObject();
                                if (cVar != null) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("name", cVar.mo49082a());
                                    jSONObject3.put("amount", cVar.mo49085b());
                                    jSONObject2.put("reward", jSONObject3);
                                }
                                jSONObject2.put("isComplete", z);
                                jSONObject.put("data", jSONObject2);
                                String a = MBridgeBTContainer.f16943a;
                                C6361q.m16154a(a, " BT Call H5 onAdClose " + jSONObject.toString());
                            } catch (JSONException e) {
                                C6361q.m16154a(MBridgeBTContainer.f16943a, e.getMessage());
                            }
                            C6563g.m16891a().mo44522a((WebView) MBridgeBTContainer.this.f16960f, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            C6563g.m16891a().mo44522a((WebView) MBridgeBTContainer.this.f16960f, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        }
                    }

                    /* renamed from: a */
                    public final void mo48350a(boolean z, int i) {
                        boolean unused = MBridgeBTContainer.this.f16953J = z;
                        int unused2 = MBridgeBTContainer.this.f16954K = i;
                    }

                    /* renamed from: a */
                    public final void mo48347a(String str, String str2) {
                        if (MBridgeBTContainer.this.f16960f != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("id", str);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(MBridgeConstans.PLACEMENT_ID, MBridgeBTContainer.this.f17840l);
                                jSONObject2.put("unitId", MBridgeBTContainer.this.f17839k);
                                jSONObject2.put("error", str2);
                                jSONObject.put("data", jSONObject2);
                                String a = MBridgeBTContainer.f16943a;
                                C6361q.m16154a(a, " BT Call H5 onShowFail " + jSONObject.toString());
                            } catch (JSONException e) {
                                C6361q.m16154a(MBridgeBTContainer.f16943a, e.getMessage());
                            }
                            C6563g.m16891a().mo44522a((WebView) MBridgeBTContainer.this.f16960f, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        }
                    }

                    /* renamed from: a */
                    public final void mo48348a(String str, String str2, String str3) {
                        if (MBridgeBTContainer.this.f16960f != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("id", str);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                                jSONObject2.put("unitId", str3);
                                jSONObject.put("data", jSONObject2);
                                String a = MBridgeBTContainer.f16943a;
                                C6361q.m16154a(a, " BT Call H5 onVideoAdClicked " + jSONObject.toString());
                            } catch (JSONException e) {
                                C6361q.m16154a(MBridgeBTContainer.f16943a, e.getMessage());
                            }
                            C6563g.m16891a().mo44522a((WebView) MBridgeBTContainer.this.f16960f, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        }
                    }

                    /* renamed from: b */
                    public final void mo48351b(String str, String str2, String str3) {
                        if (MBridgeBTContainer.this.f16960f != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("id", str);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("convert", true);
                                jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                                jSONObject2.put("unitId", str3);
                                jSONObject.put("data", jSONObject2);
                                String a = MBridgeBTContainer.f16943a;
                                C6361q.m16154a(a, " BT Call H5 onVideoComplete " + jSONObject.toString());
                            } catch (JSONException e) {
                                C6361q.m16154a(MBridgeBTContainer.f16943a, e.getMessage());
                            }
                            C6563g.m16891a().mo44522a((WebView) MBridgeBTContainer.this.f16960f, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        }
                    }

                    /* renamed from: c */
                    public final void mo48352c(String str, String str2, String str3) {
                        if (MBridgeBTContainer.this.f16960f != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("id", str);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                                jSONObject2.put("unitId", str3);
                                jSONObject.put("data", jSONObject2);
                                String a = MBridgeBTContainer.f16943a;
                                C6361q.m16154a(a, " BT Call H5 onEndcardShow " + jSONObject.toString());
                            } catch (JSONException e) {
                                C6361q.m16154a(MBridgeBTContainer.f16943a, e.getMessage());
                            }
                            C6563g.m16891a().mo44522a((WebView) MBridgeBTContainer.this.f16960f, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        }
                    }

                    /* renamed from: a */
                    public final void mo48346a(String str, int i, String str2, String str3) {
                        if (MBridgeBTContainer.this.f16948E != null) {
                            MBridgeBTContainer.this.f16948E.mo47004a(i, str2, str3);
                        }
                    }
                };
            }
            mBTempContainer.setMBridgeTempCallback(this.f16949F);
            mBTempContainer.setWebViewFront(getJSCommon().mo48800a());
            mBTempContainer.init(this.f16962h);
            mBTempContainer.onCreate();
        } catch (Throwable th) {
            C6361q.m16154a(f16943a, th.getMessage());
        }
    }

    /* renamed from: d */
    private C7180a m17349d(CampaignEx campaignEx) {
        List<C7180a> list = this.f16946C;
        if (list == null || campaignEx == null) {
            return null;
        }
        for (C7180a next : list) {
            if (next.mo49191g().getId().equals(campaignEx.getId())) {
                C6361q.m16154a(f16943a, "tempContainer task initSuccess");
                return next;
            }
        }
        return null;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f16960f != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.f16956b);
                jSONObject2.put("id", this.f16965z);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C6563g.m16891a().mo44522a((WebView) this.f16960f, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C6877c.m17219a().mo48194a((WebView) this.f16960f, "broadcast", this.f16965z);
            }
        }
    }

    public int findID(String str) {
        return C6347k.m16084a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return C6347k.m16084a(getContext(), str, "layout");
    }

    public void setBTContainerCallback(C6912a aVar) {
        this.f16947D = aVar;
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f16945B = list;
    }

    public void setCampaignDownLoadTasks(List<C7180a> list) {
        this.f16946C = list;
    }

    public void setJSFactory(C7158b bVar) {
        this.f17852x = bVar;
    }

    public void setShowRewardVideoListener(C6922h hVar) {
        this.f16948E = hVar;
    }

    public void setChoiceOneCallback(C6932a aVar) {
        this.f16955L = aVar;
    }

    public void setCBT(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        if (campaignEx.getSpareOfferFlag() != 1) {
            campaignEx.setCbt(0);
        } else if (this.f17841m == null) {
        } else {
            if (this.f17841m.mo49168y() == 1) {
                campaignEx.setCbt(1);
            } else {
                campaignEx.setCbt(0);
            }
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        try {
            if (this.f16945B != null && this.f16945B.size() > 0 && C6366u.m16221f(this.f16945B.get(0).getMof_template_url())) {
                C6923a.m17464a();
                if (C6924a.f17066a == 0) {
                    if (i6 != 0) {
                        C6924a.f17066a = i6;
                    } else if (i7 != 0) {
                        C6924a.f17066a = i7;
                    } else if (i8 != 0) {
                        C6924a.f17066a = i8;
                    } else if (i9 != 0) {
                        C6924a.f17066a = i9;
                    }
                }
            }
            String a = C6337h.m16062a(i, i2, i3, i4, i5);
            C6361q.m16158d(f16943a, a);
            if (this.f16960f != null) {
                if ((this.f16960f.getObject() instanceof C7062j) && !TextUtils.isEmpty(a)) {
                    ((C7062j) this.f16960f.getObject()).mo48809b(a);
                    C6563g.m16891a().mo44522a((WebView) this.f16960f, "oncutoutfetched", Base64.encodeToString(a.getBytes(), 0));
                }
            }
            C6877c.m17219a().mo48192a(i, i2, i3, i4, i5);
            LinkedHashMap<String, View> b = C6877c.m17219a().mo48201b(this.f17839k, this.f16951H);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) next).setNotchPadding(i6, i7, i8, i9);
                    }
                    if (next instanceof MBTempContainer) {
                        ((MBTempContainer) next).setNotchPadding(i, i2, i3, i4, i5);
                    }
                    if ((next instanceof WindVaneWebView) && !TextUtils.isEmpty(a)) {
                        C6563g.m16891a().mo44524a((Object) next, "oncutoutfetched", Base64.encodeToString(a.getBytes(), 0));
                    }
                }
            }
        } catch (Throwable th) {
            C6361q.m16154a(f16943a, th.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f16952I = str;
    }
}
