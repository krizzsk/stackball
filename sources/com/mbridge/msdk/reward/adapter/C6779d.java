package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.facebook.appevents.AppEventsConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6196f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p164db.C6143d;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6151i;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.net.C6241b;
import com.mbridge.msdk.foundation.same.net.p178g.C6275b;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbsignalcommon.p206b.C6531a;
import com.mbridge.msdk.mbsignalcommon.p206b.C6532b;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.reward.adapter.C6759c;
import com.mbridge.msdk.reward.p209a.C6738a;
import com.mbridge.msdk.reward.p210b.C6801a;
import com.mbridge.msdk.reward.p211c.C6805a;
import com.mbridge.msdk.reward.p211c.C6806b;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.video.p214bt.module.p217b.C6922h;
import com.mbridge.msdk.video.p214bt.p215a.C6877c;
import com.mbridge.msdk.video.signal.p235a.C7062j;
import com.mbridge.msdk.videocommon.C7165a;
import com.mbridge.msdk.videocommon.download.C7184c;
import com.mbridge.msdk.videocommon.download.C7191g;
import com.mbridge.msdk.videocommon.download.C7203i;
import com.mbridge.msdk.videocommon.p236a.C7167a;
import com.mbridge.msdk.videocommon.p239d.C7176a;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.adapter.d */
/* compiled from: RewardMVVideoAdapter */
public final class C6779d implements C6757a {

    /* renamed from: A */
    private int f16662A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public CampaignUnit f16663B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public List<CampaignEx> f16664C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f16665D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public long f16666E = 0;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C6798d f16667F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f16668G = false;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f16669H = false;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public Handler f16670I = new Handler(Looper.getMainLooper()) {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: com.mbridge.msdk.foundation.entity.CampaignEx} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: com.mbridge.msdk.foundation.entity.CampaignEx} */
        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: type inference failed for: r3v12 */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r11v1 */
        /* JADX WARNING: type inference failed for: r3v15 */
        /* JADX WARNING: type inference failed for: r2v16 */
        /* JADX WARNING: type inference failed for: r11v14 */
        /* JADX WARNING: type inference failed for: r11v15 */
        /* JADX WARNING: type inference failed for: r11v16 */
        /* JADX WARNING: type inference failed for: r11v17 */
        /* JADX WARNING: type inference failed for: r11v18 */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0370, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x05b4, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x05b5, code lost:
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x05bc, code lost:
            if (com.mbridge.msdk.reward.adapter.C6779d.m17094i(r1.f16701a) != null) goto L_0x05be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x05be, code lost:
            com.mbridge.msdk.reward.adapter.C6779d.m17094i(r1.f16701a).removeMessages(5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x05c7, code lost:
            removeMessages(6);
            com.mbridge.msdk.reward.adapter.C6779d.m17072a(r1.f16701a, com.mbridge.msdk.reward.adapter.C6779d.m17084d(r1.f16701a), com.mbridge.msdk.reward.adapter.C6779d.m17078b(r1.f16701a), com.mbridge.msdk.reward.adapter.C6779d.m17089f(r1.f16701a));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x05e5, code lost:
            if (r1.f16701a.f16682h == false) goto L_0x05e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x05e7, code lost:
            r1.f16701a.f16682h = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x05eb, code lost:
            if (r11 != 0) goto L_0x05ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x05ed, code lost:
            com.mbridge.msdk.reward.p210b.C6801a.m17154a(r11, com.mbridge.msdk.reward.adapter.C6779d.m17092h(r1.f16701a), r2.getMessage(), com.mbridge.msdk.reward.adapter.C6779d.m17084d(r1.f16701a), com.mbridge.msdk.reward.adapter.C6779d.m17089f(r1.f16701a), r11.getRequestId(), r11.getRequestIdNotice());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x0611, code lost:
            com.mbridge.msdk.reward.p210b.C6801a.m17154a(r11, com.mbridge.msdk.reward.adapter.C6779d.m17092h(r1.f16701a), r2.getMessage(), com.mbridge.msdk.reward.adapter.C6779d.m17084d(r1.f16701a), com.mbridge.msdk.reward.adapter.C6779d.m17089f(r1.f16701a), "", "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x0630, code lost:
            r3 = com.mbridge.msdk.reward.adapter.C6779d.m17063a(r1.f16701a);
            r3.mo42805a("errorCode: 3508 errorMessage: data load failed, exception is " + r2.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x06c0, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x06c1, code lost:
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
            com.mbridge.msdk.foundation.tools.C6361q.m16154a("RewardMVVideoAdapter", r2.getLocalizedMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x06cb, code lost:
            if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x06cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x06cd, code lost:
            r2.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x076d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x076e, code lost:
            com.mbridge.msdk.foundation.tools.C6361q.m16154a("RewardMVVideoAdapter", r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x0777, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0778, code lost:
            r0.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:269:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:275:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:289:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x02fa A[Catch:{ Exception -> 0x0222, all -> 0x076d }] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x031d A[ADDED_TO_REGION, Catch:{ Exception -> 0x0222, all -> 0x076d }] */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0375 A[SYNTHETIC, Splitter:B:114:0x0375] */
        /* JADX WARNING: Removed duplicated region for block: B:237:0x076d A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
        /* JADX WARNING: Removed duplicated region for block: B:244:0x0222 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x02bc A[Catch:{ Exception -> 0x0222, all -> 0x076d }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x02be A[Catch:{ Exception -> 0x0222, all -> 0x076d }] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:212:0x06d2=Splitter:B:212:0x06d2, B:140:0x0453=Splitter:B:140:0x0453} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r24) {
            /*
                r23 = this;
                r1 = r23
                r2 = r24
                java.lang.String r3 = "_"
                java.lang.String r4 = "RewardMVVideoAdapter"
                int r5 = r2.what     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r6 = 8
                if (r5 == r6) goto L_0x073e
                r6 = 9
                r7 = 4
                r8 = 3
                r9 = 2
                java.lang.String r10 = ""
                r11 = 0
                r12 = 6
                r13 = 5
                r14 = 0
                if (r5 == r6) goto L_0x06d2
                r6 = 16
                if (r5 == r6) goto L_0x06d2
                r6 = 17
                r15 = 1
                if (r5 == r6) goto L_0x068d
                switch(r5) {
                    case 1: goto L_0x067c;
                    case 2: goto L_0x066b;
                    case 3: goto L_0x0650;
                    case 4: goto L_0x0413;
                    case 5: goto L_0x00ab;
                    case 6: goto L_0x0029;
                    default: goto L_0x0027;
                }
            L_0x0027:
                goto L_0x077c
            L_0x0029:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r3 = r3.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r5 = r5.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r6 = r6.f16674M     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r7 = r7.f16697w     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.C6779d.m17071a((com.mbridge.msdk.reward.adapter.C6779d) r2, (java.lang.String) r3, (java.util.List) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x077c
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.os.Handler r2 = r2.f16670I     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x0062
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.os.Handler r2 = r2.f16670I     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x0062:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r2 = r2.f16681g     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 != 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.f16681g = r15     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r2 = r2.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 != 0) goto L_0x00a0
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                long r5 = r5.f16671J     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                long r2 = r2 - r5
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.content.Context r5 = r5.f16683i     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r6 = r6.f16664C     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r7 = r7.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.p210b.C6801a.m17153a(r5, r6, r7, r2)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x00a0:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.mo42804a()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                goto L_0x077c
            L_0x00ab:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r2 = r2.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x0151
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r2 = r2.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                int r2 = r2.size()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 <= 0) goto L_0x0151
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r2 = r2.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.Object r2 = r2.get(r14)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r5 = r2.getMof_template_url()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r5 != 0) goto L_0x00df
                r5 = 1
                goto L_0x00e0
            L_0x00df:
                r5 = 0
            L_0x00e0:
                int r2 = r2.getNscpt()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r7 = r7.f16664C     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r2 = r6.mo47043a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r7, (boolean) r5, (int) r2)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x0151
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r3 = r3.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r5 = r5.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r6 = r6.f16674M     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r7 = r7.f16697w     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.C6779d.m17071a((com.mbridge.msdk.reward.adapter.C6779d) r2, (java.lang.String) r3, (java.util.List) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r1.sendEmptyMessage(r12)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r1.removeMessages(r13)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r2 = r2.f16681g     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 != 0) goto L_0x0150
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r2 = r2.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 != 0) goto L_0x0147
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                long r5 = r5.f16671J     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                long r2 = r2 - r5
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.content.Context r5 = r5.f16683i     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r6 = r6.f16664C     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r7 = r7.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.p210b.C6801a.m17153a(r5, r6, r7, r2)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x0147:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.mo42804a()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x0150:
                return
            L_0x0151:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r5 = r5.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r6 = r6.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r7 = r7.f16697w     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.m17074a((java.lang.String) r5, (java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r6, (boolean) r7)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.os.Handler r2 = r2.f16670I     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x0182
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.os.Handler r2 = r2.f16670I     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.os.Handler r2 = r2.f16670I     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.removeMessages(r12)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x0182:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r2 = r2.f16682h     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 != 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.f16682h = r15     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r2 = r2.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x01ad
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r2 = r2.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                int r2 = r2.size()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 <= 0) goto L_0x01ad
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r2 = r2.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.Object r2 = r2.get(r14)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r11 = r2
                com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x01ad:
                if (r11 == 0) goto L_0x01f8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.content.Context r17 = r2.f16683i     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.<init>()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r5 = "resource load timeout is tpl: "
                r2.append(r5)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r5 = r11.getMof_template_url()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r5 != 0) goto L_0x01cb
                r5 = 1
                goto L_0x01cc
            L_0x01cb:
                r5 = 0
            L_0x01cc:
                r2.append(r5)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r18 = r2.toString()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r19 = r2.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r20 = r2.f16697w     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r11 != 0) goto L_0x01e4
                r21 = r10
                goto L_0x01ea
            L_0x01e4:
                java.lang.String r2 = r11.getRequestId()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r21 = r2
            L_0x01ea:
                if (r11 != 0) goto L_0x01ed
                goto L_0x01f1
            L_0x01ed:
                java.lang.String r10 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x01f1:
                r22 = r10
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17154a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x01f8:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r5 = "errorCode: 3401 errorMessage: resource load timeout"
                r2.mo42805a(r5)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r2 = r2.f16664C     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r2 = r2.f16664C     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                int r2 = r2.size()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 <= 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r2 = r2.f16664C     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r5 = 0
            L_0x0222:
                boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r6 == 0) goto L_0x077c
                java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r6 == 0) goto L_0x0287
                java.lang.String r7 = r6.getVideoUrlEncode()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r7 != 0) goto L_0x0287
                com.mbridge.msdk.videocommon.download.i r7 = com.mbridge.msdk.videocommon.download.C7203i.m18311a()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r8 = r6.getVideoUrlEncode()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r7 = r7.mo49228a((java.lang.String) r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r7 != 0) goto L_0x0287
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                android.content.Context r17 = r7.f16683i     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r7.<init>()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r8 = "resource load timeout exception video is tpl: "
                r7.append(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r8 = r11.getMof_template_url()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 != 0) goto L_0x0264
                r8 = 1
                goto L_0x0265
            L_0x0264:
                r8 = 0
            L_0x0265:
                r7.append(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r18 = r7.toString()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r19 = r7.f16684j     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r20 = r7.f16697w     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17157c(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r7 = 1
                goto L_0x0288
            L_0x0287:
                r7 = 0
            L_0x0288:
                if (r6 == 0) goto L_0x02e0
                java.lang.String r8 = r6.getendcard_url()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 != 0) goto L_0x02e0
                com.mbridge.msdk.videocommon.download.i r8 = com.mbridge.msdk.videocommon.download.C7203i.m18311a()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r9 = r6.getendcard_url()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r8 = r8.mo49230b(r9)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 != 0) goto L_0x02e0
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                android.content.Context r17 = r7.f16683i     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r7.<init>()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r8 = "resource load timeout exception endcard is tpl: "
                r7.append(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r8 = r11.getMof_template_url()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 != 0) goto L_0x02be
                r8 = 1
                goto L_0x02bf
            L_0x02be:
                r8 = 0
            L_0x02bf:
                r7.append(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r18 = r7.toString()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r19 = r7.f16684j     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r20 = r7.f16697w     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17157c(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r7 = 1
            L_0x02e0:
                if (r6 == 0) goto L_0x0373
                java.lang.String r8 = r6.getMof_template_url()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 != 0) goto L_0x0373
                com.mbridge.msdk.videocommon.download.i r8 = com.mbridge.msdk.videocommon.download.C7203i.m18311a()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r9 = r6.getMof_template_url()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r8 = r8.mo49230b(r9)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 != 0) goto L_0x031d
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                android.content.Context r17 = r7.f16683i     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r18 = "resource load timeout exception tpl"
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r19 = r7.f16684j     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r20 = r7.f16697w     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17157c(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r7 = 1
                goto L_0x0373
            L_0x031d:
                if (r5 != 0) goto L_0x0373
                if (r7 != 0) goto L_0x0373
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r8.<init>()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r9 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r9 = r9.f16684j     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r8.append(r9)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r8.append(r3)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r9 = r6.getRequestId()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r8.append(r9)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r8.append(r3)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r9 = r6.getMof_template_url()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r8.append(r9)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.videocommon.a$a r8 = com.mbridge.msdk.videocommon.C7165a.m18055a((java.lang.String) r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 != 0) goto L_0x0373
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0370, all -> 0x076d }
                android.content.Context r17 = r5.f16683i     // Catch:{ Exception -> 0x0370, all -> 0x076d }
                java.lang.String r18 = "resource load timeout exception tpl preload"
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0370, all -> 0x076d }
                java.lang.String r19 = r5.f16684j     // Catch:{ Exception -> 0x0370, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0370, all -> 0x076d }
                boolean r20 = r5.f16697w     // Catch:{ Exception -> 0x0370, all -> 0x076d }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0370, all -> 0x076d }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0370, all -> 0x076d }
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17157c(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0370, all -> 0x076d }
                r5 = 1
                goto L_0x0373
            L_0x0370:
                r5 = 1
                goto L_0x0222
            L_0x0373:
                if (r6 == 0) goto L_0x0222
                com.mbridge.msdk.foundation.entity.CampaignEx$c r8 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 == 0) goto L_0x0222
                com.mbridge.msdk.foundation.entity.CampaignEx$c r8 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r8 = r8.mo43510d()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 != 0) goto L_0x0222
                com.mbridge.msdk.videocommon.download.i r8 = com.mbridge.msdk.videocommon.download.C7203i.m18311a()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.foundation.entity.CampaignEx$c r9 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r9 = r9.mo43510d()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r8 = r8.mo49230b(r9)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 != 0) goto L_0x03da
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                android.content.Context r17 = r7.f16683i     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r7.<init>()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r8 = "resource load timeout exception template is tpl: "
                r7.append(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r8 = r11.getMof_template_url()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 != 0) goto L_0x03b7
                r8 = 1
                goto L_0x03b8
            L_0x03b7:
                r8 = 0
            L_0x03b8:
                r7.append(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r18 = r7.toString()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r19 = r7.f16684j     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r20 = r7.f16697w     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17157c(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                goto L_0x0222
            L_0x03da:
                java.lang.String r8 = r6.getMof_template_url()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r8 == 0) goto L_0x0222
                if (r7 != 0) goto L_0x0222
                int r7 = r6.getAdType()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.videocommon.a$a r7 = com.mbridge.msdk.videocommon.C7165a.m18054a(r7, r6)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                if (r7 != 0) goto L_0x0222
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                android.content.Context r17 = r7.f16683i     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r18 = "resource load timeout exception template preload"
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r19 = r7.f16684j     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                boolean r20 = r7.f16697w     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17157c(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0222, all -> 0x076d }
                goto L_0x0222
            L_0x0413:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 == 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r5 = r5.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r6 = r6.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r7 = r7.f16697w     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r3.m17074a((java.lang.String) r5, (java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r6, (boolean) r7)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r3 = r3.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 == 0) goto L_0x0453
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r3 = r3.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                int r3 = r3.size()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 <= 0) goto L_0x0453
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r3 = r3.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.Object r3 = r3.get(r14)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r11 = r3
                com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x0453:
                java.lang.Object r3 = r2.obj     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r3 != 0) goto L_0x04c3
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.os.Handler r2 = r2.f16670I     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r2 == 0) goto L_0x0468
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.os.Handler r2 = r2.f16670I     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
            L_0x0468:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                boolean r2 = r2.f16682h     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r2 != 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r2.f16682h = r15     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r11 == 0) goto L_0x0499
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.content.Context r17 = r2.f16683i     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r18 = "data load failed"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r19 = r2.f16684j     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                boolean r20 = r2.f16697w     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17154a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                goto L_0x04b6
            L_0x0499:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.content.Context r17 = r2.f16683i     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r18 = "data load failed"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r19 = r2.f16684j     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                boolean r20 = r2.f16697w     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17154a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
            L_0x04b6:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f16692r     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r3 = "errorCode: 3506 errorMessage: data load failed"
                r2.mo42805a(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                goto L_0x077c
            L_0x04c3:
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r3 == 0) goto L_0x0539
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.os.Handler r2 = r2.f16670I     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r2 == 0) goto L_0x04de
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.os.Handler r2 = r2.f16670I     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
            L_0x04de:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                boolean r2 = r2.f16682h     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r2 != 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r2.f16682h = r15     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r11 == 0) goto L_0x050f
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.content.Context r17 = r2.f16683i     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r18 = "data load failed, errorMsg null"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r19 = r2.f16684j     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                boolean r20 = r2.f16697w     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17154a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                goto L_0x052c
            L_0x050f:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.content.Context r17 = r2.f16683i     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r18 = "data load failed, errorMsg null"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r19 = r2.f16684j     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                boolean r20 = r2.f16697w     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17154a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
            L_0x052c:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f16692r     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r3 = "errorCode: 3507 errorMessage: data load failed, errorMsg null"
                r2.mo42805a(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                goto L_0x077c
            L_0x0539:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.os.Handler r3 = r3.f16670I     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r3 == 0) goto L_0x054a
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.os.Handler r3 = r3.f16670I     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r3.removeMessages(r13)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
            L_0x054a:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                boolean r3 = r3.f16682h     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r3 != 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r3.f16682h = r15     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                if (r11 == 0) goto L_0x057b
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.content.Context r17 = r3.f16683i     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r19 = r3.f16684j     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                boolean r20 = r3.f16697w     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r16 = r11
                r18 = r2
                com.mbridge.msdk.reward.p210b.C6801a.m17154a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                goto L_0x0598
            L_0x057b:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                android.content.Context r17 = r3.f16683i     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r19 = r3.f16684j     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                boolean r20 = r3.f16697w     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                r18 = r2
                com.mbridge.msdk.reward.p210b.C6801a.m17154a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
            L_0x0598:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f16692r     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r5.<init>()     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r6 = "errorCode: 3507 errorMessage: data load failed, errorMsg is "
                r5.append(r6)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r5.append(r2)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                r3.mo42805a(r2)     // Catch:{ Exception -> 0x05b4, all -> 0x076d }
                goto L_0x077c
            L_0x05b4:
                r0 = move-exception
                r2 = r0
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.os.Handler r3 = r3.f16670I     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 == 0) goto L_0x05c7
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.os.Handler r3 = r3.f16670I     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r3.removeMessages(r13)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x05c7:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r5 = r5.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.util.List r6 = r6.f16673L     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r7 = r7.f16697w     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r3.m17074a((java.lang.String) r5, (java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r6, (boolean) r7)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r3 = r3.f16682h     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 != 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r3.f16682h = r15     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r11 == 0) goto L_0x0611
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.content.Context r17 = r3.f16683i     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r18 = r2.getMessage()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r19 = r3.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r20 = r3.f16697w     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17154a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                goto L_0x0630
            L_0x0611:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.content.Context r17 = r3.f16683i     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r18 = r2.getMessage()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r19 = r3.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r20 = r3.f16697w     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                com.mbridge.msdk.reward.p210b.C6801a.m17154a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x0630:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r5.<init>()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r6 = "errorCode: 3508 errorMessage: data load failed, exception is "
                r5.append(r6)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r5.append(r2)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r3.mo42805a(r2)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                goto L_0x077c
            L_0x0650:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x0663
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r3 = "campaign is ok"
                r2.mo42806b(r3)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x0663:
                r2 = 60000(0xea60, double:2.9644E-319)
                r1.sendEmptyMessageDelayed(r13, r2)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                goto L_0x077c
            L_0x066b:
                java.lang.Object r3 = r2.obj     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 == 0) goto L_0x0675
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x0675:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.mo47044b((java.lang.String) r11)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                goto L_0x077c
            L_0x067c:
                java.lang.Object r3 = r2.obj     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 == 0) goto L_0x0686
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
            L_0x0686:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.mo47044b((java.lang.String) r11)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                goto L_0x077c
            L_0x068d:
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r3 = r2[r14]     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r18 = r3
                com.mbridge.msdk.foundation.entity.CampaignEx r18 = (com.mbridge.msdk.foundation.entity.CampaignEx) r18     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r3 = r2[r15]     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r19 = r3
                java.lang.String r19 = (java.lang.String) r19     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r3 = r2[r9]     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r20 = r3
                java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r3 = r2[r8]     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r21 = r3
                com.mbridge.msdk.videocommon.d.c r21 = (com.mbridge.msdk.videocommon.p239d.C7179c) r21     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r2 = r2[r7]     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r17 = r2
                java.lang.String r17 = (java.lang.String) r17     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                if (r18 == 0) goto L_0x077c
                boolean r2 = android.text.TextUtils.isEmpty(r19)     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                if (r2 != 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                r16 = r2
                com.mbridge.msdk.reward.adapter.C6779d.m17069a(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x06c0, all -> 0x076d }
                goto L_0x077c
            L_0x06c0:
                r0 = move-exception
                r2 = r0
                java.lang.String r3 = r2.getLocalizedMessage()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.foundation.tools.C6361q.m16154a(r4, r3)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 == 0) goto L_0x077c
                r2.printStackTrace()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                goto L_0x077c
            L_0x06d2:
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r3 = r2[r14]     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r17 = r3
                com.mbridge.msdk.foundation.entity.CampaignEx r17 = (com.mbridge.msdk.foundation.entity.CampaignEx) r17     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r3 = r2[r9]     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r20 = r3
                java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r3 = r2[r8]     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r21 = r3
                com.mbridge.msdk.videocommon.d.c r21 = (com.mbridge.msdk.videocommon.p239d.C7179c) r21     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r3 = r2[r7]     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r16 = r3
                java.lang.String r16 = (java.lang.String) r16     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                int r3 = r2.length     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r5 = 7
                if (r3 != r5) goto L_0x06fc
                r3 = r2[r13]     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r10 = r3
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r2 = r2[r12]     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                r11 = r2
                com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r11 = (com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView) r11     // Catch:{ Exception -> 0x072d, all -> 0x076d }
            L_0x06fc:
                r22 = r10
                r15 = r11
                if (r17 == 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                java.util.concurrent.CopyOnWriteArrayList r2 = r2.f16694t     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                if (r2 != 0) goto L_0x071f
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                java.util.List r2 = r2.f16674M     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                if (r2 == 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r14 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                java.util.List r18 = r2.f16674M     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                java.lang.String r19 = ""
                com.mbridge.msdk.reward.adapter.C6779d.m17067a(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                goto L_0x077c
            L_0x071f:
                com.mbridge.msdk.reward.adapter.d r14 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                java.util.concurrent.CopyOnWriteArrayList r18 = r2.f16694t     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                java.lang.String r19 = ""
                com.mbridge.msdk.reward.adapter.C6779d.m17067a(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x072d, all -> 0x076d }
                goto L_0x077c
            L_0x072d:
                r0 = move-exception
                r2 = r0
                java.lang.String r3 = r2.getLocalizedMessage()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.foundation.tools.C6361q.m16154a(r4, r3)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 == 0) goto L_0x077c
                r2.printStackTrace()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                goto L_0x077c
            L_0x073e:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f16692r     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 == 0) goto L_0x077c
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r2 == 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r3 = r3.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                if (r3 != 0) goto L_0x077c
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                android.content.Context r3 = r3.f16683i     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                java.lang.String r5 = r5.f16684j     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.p210b.C6801a.m17150a((android.content.Context) r3, (com.mbridge.msdk.foundation.entity.CampaignEx) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                r2.mo47046b()     // Catch:{ Exception -> 0x0777, all -> 0x076d }
                goto L_0x077c
            L_0x076d:
                r0 = move-exception
                r2 = r0
                java.lang.String r2 = r2.getMessage()
                com.mbridge.msdk.foundation.tools.C6361q.m16154a(r4, r2)
                goto L_0x077c
            L_0x0777:
                r0 = move-exception
                r2 = r0
                r2.printStackTrace()
            L_0x077c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C6779d.C67801.handleMessage(android.os.Message):void");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: J */
    public long f16671J = 0;

    /* renamed from: K */
    private String f16672K = "";
    /* access modifiers changed from: private */

    /* renamed from: L */
    public List<CampaignEx> f16673L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public List<CampaignEx> f16674M;

    /* renamed from: a */
    public String f16675a = "";

    /* renamed from: b */
    public String f16676b = "";

    /* renamed from: c */
    boolean f16677c = false;

    /* renamed from: d */
    volatile boolean f16678d = false;

    /* renamed from: e */
    volatile boolean f16679e = false;

    /* renamed from: f */
    volatile boolean f16680f = false;

    /* renamed from: g */
    volatile boolean f16681g = false;

    /* renamed from: h */
    volatile boolean f16682h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Context f16683i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f16684j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f16685k;

    /* renamed from: l */
    private int f16686l;

    /* renamed from: m */
    private int f16687m;

    /* renamed from: n */
    private int f16688n;

    /* renamed from: o */
    private boolean f16689o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f16690p;

    /* renamed from: q */
    private C6922h f16691q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public volatile C6758b f16692r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C7179c f16693s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public CopyOnWriteArrayList<CampaignEx> f16694t = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f16695u = 2;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f16696v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f16697w;

    /* renamed from: x */
    private String f16698x = "";

    /* renamed from: y */
    private int f16699y;

    /* renamed from: z */
    private int f16700z;

    /* renamed from: a */
    public final String mo47034a(boolean z) {
        List<CampaignEx> a;
        CampaignEx campaignEx;
        if (!z) {
            return this.f16675a;
        }
        if (TextUtils.isEmpty(this.f16676b) && (a = C7184c.getInstance().mo49204a(this.f16684j)) != null && a.size() > 0 && (campaignEx = a.get(0)) != null) {
            this.f16676b = campaignEx.getRequestId();
        }
        return this.f16676b;
    }

    /* renamed from: b */
    public final void mo47045b(boolean z) {
        this.f16696v = z;
    }

    /* renamed from: c */
    public final void mo47047c(boolean z) {
        this.f16697w = z;
    }

    /* renamed from: a */
    public final void mo47041a(String str) {
        this.f16698x = str;
    }

    /* renamed from: a */
    public final void mo47035a(int i) {
        this.f16695u = i;
    }

    /* renamed from: a */
    public final String mo47033a() {
        return this.f16684j;
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$b */
    /* compiled from: RewardMVVideoAdapter */
    private class C6796b implements Runnable {

        /* renamed from: b */
        private String f16756b;

        /* renamed from: c */
        private CampaignEx f16757c;

        /* renamed from: d */
        private String f16758d;

        /* renamed from: e */
        private String f16759e;

        /* renamed from: f */
        private C7179c f16760f;

        /* renamed from: g */
        private int f16761g;

        /* renamed from: h */
        private C6779d f16762h;

        public C6796b(String str, CampaignEx campaignEx, String str2, String str3, C7179c cVar, int i, C6779d dVar) {
            this.f16756b = str;
            this.f16757c = campaignEx;
            this.f16758d = str2;
            this.f16759e = str3;
            this.f16760f = cVar;
            this.f16761g = i;
            this.f16762h = dVar;
        }

        public final void run() {
            C7062j jVar;
            try {
                C7165a.C7166a aVar = new C7165a.C7166a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(C6122a.m15302b().mo42895d());
                aVar.mo49055a(windVaneWebView);
                String b = C6877c.m17219a().mo48200b();
                aVar.mo49056a(b);
                if (C6779d.this.f16663B.getAds() == null || C6779d.this.f16663B.getAds().size() <= 0) {
                    jVar = new C7062j((Activity) null, this.f16757c);
                } else {
                    jVar = new C7062j((Activity) null, this.f16757c, C6779d.this.f16663B.getAds());
                }
                C7062j jVar2 = jVar;
                jVar2.mo48801a(this.f16761g);
                jVar2.mo48806a(this.f16759e);
                jVar2.mo48840c(b);
                jVar2.mo48805a(this.f16760f);
                jVar2.mo48843d(C6779d.this.f16665D);
                windVaneWebView.setWebViewListener(new C6795a(this.f16758d, this.f16756b, aVar, this.f16757c, this.f16762h, (C6796b) null, (Handler) null));
                windVaneWebView.setObject(jVar2);
                windVaneWebView.loadUrl(this.f16758d);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                C6361q.m16154a("RewardMVVideoAdapter", th.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$c */
    /* compiled from: RewardMVVideoAdapter */
    private class C6797c implements Runnable {

        /* renamed from: b */
        private WindVaneWebView f16764b;

        /* renamed from: c */
        private String f16765c;

        /* renamed from: d */
        private CampaignEx f16766d;

        /* renamed from: e */
        private List<CampaignEx> f16767e;

        /* renamed from: f */
        private String f16768f;

        /* renamed from: g */
        private String f16769g;

        /* renamed from: h */
        private C7179c f16770h;

        /* renamed from: i */
        private int f16771i;

        /* renamed from: j */
        private C6779d f16772j;

        public C6797c(WindVaneWebView windVaneWebView, String str, CampaignEx campaignEx, List<CampaignEx> list, String str2, String str3, C7179c cVar, int i, C6779d dVar) {
            this.f16764b = windVaneWebView;
            this.f16765c = str;
            this.f16766d = campaignEx;
            this.f16767e = list;
            this.f16768f = str2;
            this.f16769g = str3;
            this.f16770h = cVar;
            this.f16771i = i;
            this.f16772j = dVar;
        }

        public final void run() {
            C7062j jVar;
            try {
                C7165a.C7166a aVar = new C7165a.C7166a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(C6122a.m15302b().mo42895d());
                aVar.mo49055a(windVaneWebView);
                if (this.f16767e == null || this.f16767e.size() <= 0) {
                    jVar = new C7062j((Activity) null, this.f16766d);
                } else {
                    jVar = new C7062j((Activity) null, this.f16766d, this.f16767e);
                }
                C7062j jVar2 = jVar;
                jVar2.mo48801a(this.f16771i);
                jVar2.mo48806a(this.f16769g);
                jVar2.mo48805a(this.f16770h);
                jVar2.mo48843d(C6779d.this.f16665D);
                windVaneWebView.setWebViewListener(new C6800f(this.f16764b, this.f16768f, this.f16765c, aVar, this.f16766d, this.f16772j, (C6797c) null, (Handler) null));
                windVaneWebView.setObject(jVar2);
                windVaneWebView.loadUrl(this.f16768f);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                C6361q.m16154a("RewardMVVideoAdapter", th.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$a */
    /* compiled from: RewardMVVideoAdapter */
    private static class C6795a extends C6531a {

        /* renamed from: a */
        private C6779d f16746a;

        /* renamed from: b */
        private String f16747b;

        /* renamed from: c */
        private String f16748c;

        /* renamed from: d */
        private C7165a.C7166a f16749d;

        /* renamed from: e */
        private CampaignEx f16750e;

        /* renamed from: f */
        private boolean f16751f;

        /* renamed from: g */
        private boolean f16752g;

        /* renamed from: h */
        private C6796b f16753h;

        /* renamed from: i */
        private Handler f16754i;

        /* renamed from: a */
        public final void mo44405a(WebView webView, String str, String str2, int i, int i2) {
        }

        public C6795a(String str, String str2, C7165a.C7166a aVar, CampaignEx campaignEx, C6779d dVar, C6796b bVar, Handler handler) {
            this.f16747b = str;
            this.f16748c = str2;
            this.f16749d = aVar;
            if (dVar != null) {
                this.f16746a = dVar;
            }
            this.f16750e = campaignEx;
            this.f16753h = bVar;
            this.f16754i = handler;
        }

        /* renamed from: a */
        public final void mo44020a(WebView webView, int i) {
            Handler handler;
            if (!this.f16752g) {
                C6796b bVar = this.f16753h;
                if (!(bVar == null || (handler = this.f16754i) == null)) {
                    handler.removeCallbacks(bVar);
                }
                C7203i.m18311a().mo49233d(this.f16747b, true);
                C7165a.C7166a aVar = this.f16749d;
                if (aVar != null) {
                    aVar.mo49057a(true);
                }
                List<CampaignEx> a = C7167a.m18072a().mo49062a(this.f16748c, 1, this.f16746a.f16697w);
                if (a != null && a.size() > 0) {
                    for (CampaignEx rewardTemplateMode : a) {
                        CampaignEx.C6189c rewardTemplateMode2 = rewardTemplateMode.getRewardTemplateMode();
                        if (rewardTemplateMode2 != null && !TextUtils.isEmpty(rewardTemplateMode2.mo43510d()) && TextUtils.equals(rewardTemplateMode2.mo43510d(), this.f16747b)) {
                            if (!TextUtils.isEmpty(this.f16750e.getMof_template_url()) || this.f16750e.getMof_tplid() != -1) {
                                this.f16750e.getMof_tplid();
                                this.f16750e.getRequestIdNotice();
                            } else {
                                this.f16750e.getRequestIdNotice();
                            }
                            C6779d dVar = this.f16746a;
                            if (dVar == null || !dVar.f16696v) {
                                if (this.f16750e.isBidCampaign()) {
                                    C7165a.m18058a(94, this.f16750e.getRequestIdNotice(), this.f16749d);
                                }
                            } else if (this.f16750e.isBidCampaign()) {
                                C7165a.m18058a(287, this.f16750e.getRequestIdNotice(), this.f16749d);
                            }
                        }
                    }
                }
                try {
                    if (this.f16746a != null) {
                        synchronized (this.f16746a) {
                            if (!(this.f16746a == null || !this.f16746a.mo47046b() || this.f16746a.f16670I == null)) {
                                Message obtain = Message.obtain();
                                obtain.what = 6;
                                C6361q.m16154a("RVWindVaneWebView", "WHAT_ON_RES_LOAD_SUCCESS TPL");
                                obtain.obj = this.f16750e;
                                this.f16746a.f16670I.sendMessage(obtain);
                                this.f16746a.f16670I.removeMessages(5);
                                this.f16746a = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C6361q.m16155a("RVWindVaneWebView", th.getMessage(), th);
                }
                this.f16752g = true;
            }
        }

        /* renamed from: a */
        public final void mo44023a(WebView webView, String str) {
            super.mo44023a(webView, str);
            if (!this.f16751f) {
                C6563g.m16891a().mo44521a(webView);
                this.f16751f = true;
            }
        }

        /* renamed from: a */
        public final void mo44021a(WebView webView, int i, String str, String str2) {
            super.mo44021a(webView, i, str, str2);
            try {
                if (this.f16746a != null) {
                    synchronized (this.f16746a) {
                        C6779d.m17070a(this.f16746a, str, str2);
                        this.f16746a = null;
                    }
                }
            } catch (Throwable th) {
                C6361q.m16155a("RVWindVaneWebView", th.getMessage(), th);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$f */
    /* compiled from: RewardMVVideoAdapter */
    private static class C6800f extends C6532b {

        /* renamed from: a */
        private C6779d f16777a;

        /* renamed from: b */
        private WindVaneWebView f16778b;

        /* renamed from: c */
        private String f16779c;

        /* renamed from: d */
        private String f16780d;

        /* renamed from: e */
        private C7165a.C7166a f16781e;

        /* renamed from: f */
        private CampaignEx f16782f;

        /* renamed from: g */
        private boolean f16783g;

        /* renamed from: h */
        private boolean f16784h;

        /* renamed from: i */
        private C6797c f16785i;

        /* renamed from: j */
        private Handler f16786j;

        public C6800f(WindVaneWebView windVaneWebView, String str, String str2, C7165a.C7166a aVar, CampaignEx campaignEx, C6779d dVar, C6797c cVar, Handler handler) {
            this.f16778b = windVaneWebView;
            this.f16779c = str;
            this.f16780d = str2;
            this.f16781e = aVar;
            if (dVar != null) {
                this.f16777a = dVar;
            }
            this.f16782f = campaignEx;
            this.f16785i = cVar;
            this.f16786j = handler;
        }

        /* renamed from: a */
        public final void mo44020a(WebView webView, int i) {
            Handler handler;
            if (!this.f16784h) {
                C6797c cVar = this.f16785i;
                if (!(cVar == null || (handler = this.f16786j) == null)) {
                    handler.removeCallbacks(cVar);
                }
                String str = this.f16780d + "_" + this.f16779c;
                C7165a.C7166a aVar = this.f16781e;
                if (aVar != null) {
                    aVar.mo49057a(true);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", 1);
                    jSONObject.put("id", str);
                    jSONObject.put("unitid", this.f16780d);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C7203i.m18311a().mo49233d(this.f16779c, true);
                C7167a.m18072a().mo49062a(this.f16780d, 1, this.f16777a.f16697w);
                C6779d dVar = this.f16777a;
                if (dVar == null || !dVar.f16696v) {
                    if (this.f16782f.isBidCampaign()) {
                        C7165a.m18058a(94, this.f16782f.getRequestIdNotice(), this.f16781e);
                    }
                } else if (this.f16782f.isBidCampaign()) {
                    C7165a.m18058a(287, this.f16782f.getRequestIdNotice(), this.f16781e);
                }
                try {
                    if (this.f16777a != null) {
                        synchronized (this.f16777a) {
                            if (!(this.f16777a == null || !this.f16777a.mo47046b() || this.f16777a.f16670I == null)) {
                                Message obtain = Message.obtain();
                                obtain.what = 6;
                                obtain.obj = this.f16782f;
                                this.f16777a.f16670I.sendMessage(obtain);
                                this.f16777a.f16670I.removeMessages(5);
                                this.f16777a = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C6361q.m16155a("WindVaneWebView", th.getMessage(), th);
                }
                this.f16784h = true;
            }
        }

        /* renamed from: a */
        public final void mo44023a(WebView webView, String str) {
            super.mo44023a(webView, str);
            if (!this.f16783g) {
                C6563g.m16891a().mo44521a(webView);
                this.f16783g = true;
            }
        }

        /* renamed from: a */
        public final void mo44021a(WebView webView, int i, String str, String str2) {
            super.mo44021a(webView, i, str, str2);
            try {
                if (this.f16777a != null) {
                    synchronized (this.f16777a) {
                        C6779d.m17070a(this.f16777a, str, str2);
                        this.f16777a = null;
                    }
                }
            } catch (Throwable th) {
                C6361q.m16155a("WindVaneWebView", th.getMessage(), th);
            }
        }
    }

    public C6779d(Context context, String str, String str2) {
        try {
            this.f16683i = context.getApplicationContext();
            this.f16684j = str2;
            this.f16685k = str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo47040a(C7179c cVar) {
        try {
            this.f16693s = cVar;
        } catch (Throwable th) {
            C6361q.m16155a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public final boolean mo47043a(List<CampaignEx> list, boolean z, int i) {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (C7184c.getInstance().mo49208a(94, this.f16684j, this.f16697w, list.size(), z, i, list)) {
                if (!z) {
                    if (!C6366u.m16221f(campaignEx.getMof_template_url()) && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().mo43510d())) {
                        C7203i a = C7203i.m18311a();
                        if (a.mo49232c(this.f16684j + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().mo43510d())) {
                            return true;
                        }
                    }
                    return true;
                } else if (C6366u.m16221f(campaignEx.getMof_template_url())) {
                    return true;
                } else {
                    C7203i a2 = C7203i.m18311a();
                    if (a2.mo49232c(this.f16684j + "_" + campaignEx.getRequestId() + "_" + campaignEx.getMof_template_url())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo47046b() {
        List<CampaignEx> a = C7167a.m18072a().mo49063a(this.f16684j, 1, this.f16697w, this.f16698x);
        if (a == null || a.size() <= 0) {
            C6361q.m16154a("RewardVideoController", "数据库可用的缓存数据条数：0");
            return false;
        }
        CampaignEx campaignEx = a.get(0);
        int b = C7167a.m18072a().mo49072b(this.f16684j, 1, this.f16697w, this.f16698x);
        if (TextUtils.isEmpty(campaignEx.getMof_template_url()) || campaignEx.getNscpt() != 1 || a.size() >= b) {
            return mo47043a(a, !TextUtils.isEmpty(campaignEx.getMof_template_url()), campaignEx.getNscpt());
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo47048c() {
        List<CampaignEx> c = C7167a.m18072a().mo49077c(this.f16684j, 1, this.f16697w, this.f16698x);
        if (c == null || c.size() <= 0) {
            C6361q.m16154a("test_isReay_db", "数据库可用的缓存数据条数：0");
            return false;
        }
        CampaignEx campaignEx = c.get(0);
        int b = C7167a.m18072a().mo49072b(this.f16684j, 1, this.f16697w, this.f16698x);
        if (TextUtils.isEmpty(campaignEx.getMof_template_url()) || campaignEx.getNscpt() != 1 || c.size() >= b) {
            return mo47043a(c, !TextUtils.isEmpty(campaignEx.getMof_template_url()), campaignEx.getNscpt());
        }
        return false;
    }

    /* renamed from: a */
    public final void mo47039a(C6922h hVar, String str, String str2, int i, String str3) {
        try {
            this.f16691q = hVar;
            if (this.f16683i != null) {
                if (!C6369x.m16235a(this.f16684j)) {
                    Intent intent = new Intent(this.f16683i, MBRewardVideoActivity.class);
                    intent.addFlags(268435456);
                    intent.putExtra(MBRewardVideoActivity.INTENT_UNITID, this.f16684j);
                    intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f16685k);
                    intent.putExtra(MBRewardVideoActivity.INTENT_REWARD, str);
                    intent.putExtra(MBRewardVideoActivity.INTENT_MUTE, i);
                    intent.putExtra(MBRewardVideoActivity.INTENT_ISIV, this.f16696v);
                    intent.putExtra(MBRewardVideoActivity.INTENT_ISBID, this.f16697w);
                    intent.putExtra(MBRewardVideoActivity.INTENT_EXTRADATA, str3);
                    List<CampaignEx> a = C7184c.getInstance().mo49204a(this.f16684j);
                    boolean z = false;
                    if (a != null && a.size() > 0) {
                        CampaignEx campaignEx = a.get(0);
                        if (campaignEx != null) {
                            this.f16676b = campaignEx.getRequestId();
                        }
                        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                            z = true;
                        }
                    } else if (this.f16691q != null) {
                        this.f16691q.mo47005a("load failed");
                        return;
                    }
                    intent.putExtra(MBRewardVideoActivity.INTENT_ISBIG_OFFER, z);
                    if (this.f16696v) {
                        intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_MODETYPE, this.f16699y);
                        intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUETYPE, this.f16700z);
                        intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUE, this.f16662A);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent.putExtra(MBRewardVideoActivity.INTENT_USERID, str2);
                    }
                    RewardUnitCacheManager.getInstance().add(this.f16685k, this.f16684j, this.f16693s);
                    this.f16683i.startActivity(intent);
                    return;
                }
            }
            if (this.f16691q != null) {
                this.f16691q.mo47005a("context or unitid is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
            C6922h hVar2 = this.f16691q;
            if (hVar2 != null) {
                hVar2.mo47005a("show failed, exception is " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void mo47037a(int i, int i2, boolean z) {
        mo47038a(i, i2, z, "", this.f16665D);
    }

    /* renamed from: a */
    public final void mo47038a(int i, int i2, boolean z, String str, boolean z2) {
        this.f16687m = i;
        this.f16688n = i2;
        this.f16689o = z;
        this.f16665D = z2;
        List<CampaignEx> list = this.f16664C;
        if (list != null) {
            list.clear();
        }
        List<CampaignEx> list2 = this.f16673L;
        if (list2 != null) {
            list2.clear();
        }
        this.f16678d = false;
        this.f16679e = false;
        this.f16680f = false;
        this.f16682h = false;
        this.f16681g = false;
        if (this.f16683i == null) {
            m17083c("Context is null");
        } else if (C6369x.m16235a(this.f16684j)) {
            m17083c("UnitId is null");
        } else if (this.f16693s == null) {
            m17083c("RewardUnitSetting is null");
        } else {
            m17093h();
            m17095i();
            m17085d();
            m17079b(str, z2);
        }
    }

    /* renamed from: a */
    private void m17075a(String str, boolean z) {
        int i;
        String str2 = str;
        String str3 = "1";
        try {
            if (this.f16683i == null) {
                m17083c("Context is null");
            } else if (C6369x.m16235a(this.f16684j)) {
                m17083c("UnitId is null");
            } else if (this.f16693s == null) {
                m17083c("RewardUnitSetting is null");
            } else if (!TextUtils.isEmpty(str) || System.currentTimeMillis() - this.f16666E >= ((long) (this.f16693s.mo49118a() * 1000))) {
                String e = C6122a.m15302b().mo42896e();
                String md5 = SameMD5.getMD5(C6122a.m15302b().mo42896e() + C6122a.m15302b().mo42897f());
                int i2 = this.f16689o ? 2 : 3;
                int i3 = 0;
                if (this.f16693s != null) {
                    i3 = this.f16693s.mo49156r();
                    i = this.f16693s.mo49158s();
                } else {
                    i = 0;
                }
                String str4 = this.f16690p;
                String a = C6208d.m15701a(this.f16684j, "reward");
                this.f16686l = m17086e();
                String g = m17091g();
                int i4 = this.f16687m;
                int i5 = this.f16696v ? 287 : 94;
                C6287d dVar = new C6287d();
                C6275b.m15859a(dVar, "app_id", e);
                C6275b.m15859a(dVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f16684j);
                if (!TextUtils.isEmpty(this.f16685k)) {
                    C6275b.m15859a(dVar, MBridgeConstans.PLACEMENT_ID, this.f16685k);
                }
                C6275b.m15859a(dVar, "sign", md5);
                C6275b.m15859a(dVar, "req_type", i2 + "");
                C6275b.m15859a(dVar, "ad_num", i3 + "");
                StringBuilder sb = new StringBuilder();
                if (this.f16696v) {
                    i = 1;
                }
                sb.append(i);
                sb.append("");
                C6275b.m15859a(dVar, "tnum", sb.toString());
                C6275b.m15859a(dVar, "only_impression", str3 + "");
                C6275b.m15859a(dVar, "ping_mode", str3);
                C6275b.m15859a(dVar, C6287d.f15599b, a);
                C6275b.m15859a(dVar, C6287d.f15600c, str4);
                C6275b.m15859a(dVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, i4 + "");
                C6275b.m15859a(dVar, C6287d.f15598a, g);
                C6275b.m15859a(dVar, "ad_type", i5 + "");
                C6275b.m15859a(dVar, "offset", this.f16686l + "");
                String a2 = C6280d.m15868c().mo43857a(str2);
                if (!TextUtils.isEmpty(str)) {
                    dVar.mo43870a("token", str2);
                }
                if (this.f16696v) {
                    if (this.f16699y != C6204a.f15404n) {
                        if (this.f16699y != C6204a.f15403m) {
                            dVar.mo43870a("ivrwd", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        }
                    }
                    dVar.mo43870a("ivrwd", str3);
                }
                C7179c a3 = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f16684j, this.f16696v);
                if (a3 != null && !TextUtils.isEmpty(a3.mo49140j())) {
                    dVar.mo43870a("u_stid", a3.mo49140j());
                }
                C7176a b = C7177b.m18135a().mo49112b();
                if (b != null && !TextUtils.isEmpty(b.mo49089a())) {
                    dVar.mo43870a("r_stid", b.mo49089a());
                }
                if (!z) {
                    str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                dVar.mo43870a("rw_plus", str3);
                String e2 = C6366u.m16219e(this.f16684j);
                if (!TextUtils.isEmpty(e2)) {
                    dVar.mo43870a("j", e2);
                }
                C6801a.m17157c((CampaignEx) null, this.f16683i, "start load offer from server", this.f16684j, this.f16697w, "", "");
                this.f16671J = System.currentTimeMillis();
                C6806b bVar = new C6806b(this.f16683i);
                C67812 r3 = new C6805a() {
                    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(3:2|3|(4:7|8|(1:10)(1:11)|12))|13|14|27) */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005f */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo47054a(com.mbridge.msdk.foundation.entity.CampaignUnit r10) {
                        /*
                            r9 = this;
                            r0 = 0
                            if (r10 == 0) goto L_0x005f
                            java.util.ArrayList r1 = r10.getAds()     // Catch:{ Exception -> 0x006d }
                            if (r1 == 0) goto L_0x005f
                            java.util.ArrayList r1 = r10.getAds()     // Catch:{ Exception -> 0x006d }
                            int r1 = r1.size()     // Catch:{ Exception -> 0x006d }
                            if (r1 <= 0) goto L_0x005f
                            java.util.ArrayList r1 = r10.getAds()     // Catch:{ Exception -> 0x005f }
                            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x005f }
                            r2 = r1
                            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x005f }
                            com.mbridge.msdk.reward.adapter.d r1 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x005f }
                            android.content.Context r3 = r1.f16683i     // Catch:{ Exception -> 0x005f }
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f }
                            r1.<init>()     // Catch:{ Exception -> 0x005f }
                            java.lang.String r4 = "load offer success tpl "
                            r1.append(r4)     // Catch:{ Exception -> 0x005f }
                            java.util.ArrayList r4 = r10.getAds()     // Catch:{ Exception -> 0x005f }
                            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x005f }
                            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4     // Catch:{ Exception -> 0x005f }
                            java.lang.String r4 = r4.getMof_template_url()     // Catch:{ Exception -> 0x005f }
                            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x005f }
                            if (r4 != 0) goto L_0x0044
                            r4 = 1
                            goto L_0x0045
                        L_0x0044:
                            r4 = 0
                        L_0x0045:
                            r1.append(r4)     // Catch:{ Exception -> 0x005f }
                            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x005f }
                            com.mbridge.msdk.reward.adapter.d r1 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x005f }
                            java.lang.String r5 = r1.f16684j     // Catch:{ Exception -> 0x005f }
                            com.mbridge.msdk.reward.adapter.d r1 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x005f }
                            boolean r6 = r1.f16697w     // Catch:{ Exception -> 0x005f }
                            java.lang.String r7 = ""
                            java.lang.String r8 = ""
                            com.mbridge.msdk.reward.p210b.C6801a.m17157c(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x005f }
                        L_0x005f:
                            com.mbridge.msdk.reward.adapter.d r1 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x006d }
                            com.mbridge.msdk.reward.adapter.C6779d.m17066a((com.mbridge.msdk.reward.adapter.C6779d) r1, (com.mbridge.msdk.foundation.entity.CampaignUnit) r10)     // Catch:{ Exception -> 0x006d }
                            com.mbridge.msdk.reward.adapter.d r1 = com.mbridge.msdk.reward.adapter.C6779d.this     // Catch:{ Exception -> 0x006d }
                            java.lang.String r10 = r10.getRequestId()     // Catch:{ Exception -> 0x006d }
                            r1.f16675a = r10     // Catch:{ Exception -> 0x006d }
                            goto L_0x00b7
                        L_0x006d:
                            r10 = move-exception
                            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
                            if (r1 == 0) goto L_0x0075
                            r10.printStackTrace()
                        L_0x0075:
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            java.util.List r10 = r10.f16664C
                            if (r10 == 0) goto L_0x0086
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            java.util.List r10 = r10.f16664C
                            r10.clear()
                        L_0x0086:
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            java.util.List r10 = r10.f16673L
                            if (r10 == 0) goto L_0x0097
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            java.util.List r10 = r10.f16673L
                            r10.clear()
                        L_0x0097:
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            r10.f16678d = r0
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            r10.f16679e = r0
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            r10.f16680f = r0
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            r10.f16682h = r0
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            r10.f16681g = r0
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            java.lang.String r0 = "exception after load success"
                            r10.m17083c((java.lang.String) r0)
                            com.mbridge.msdk.reward.adapter.d r10 = com.mbridge.msdk.reward.adapter.C6779d.this
                            r10.m17088f()
                        L_0x00b7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C6779d.C67812.mo47054a(com.mbridge.msdk.foundation.entity.CampaignUnit):void");
                    }

                    /* renamed from: a */
                    public final void mo47053a(int i, String str) {
                        Context h = C6779d.this.f16683i;
                        C6801a.m17157c((CampaignEx) null, h, "load offer failed: " + str, C6779d.this.f16684j, C6779d.this.f16697w, "", "");
                        if (i == -1) {
                            long unused = C6779d.this.f16666E = System.currentTimeMillis();
                        }
                        if (C6779d.this.f16664C != null) {
                            C6779d.this.f16664C.clear();
                        }
                        if (C6779d.this.f16673L != null) {
                            C6779d.this.f16673L.clear();
                        }
                        C6779d.this.f16678d = false;
                        C6779d.this.f16679e = false;
                        C6779d.this.f16680f = false;
                        C6779d.this.f16682h = false;
                        C6779d.this.f16681g = false;
                        C6779d.this.m17083c(str);
                        C6779d.this.m17088f();
                    }
                };
                r3.mo47069a(str2);
                r3.f15543d = this.f16684j;
                r3.f15544e = this.f16685k;
                r3.f15545f = this.f16696v ? 287 : 94;
                C6241b bVar2 = new C6241b(this.f16688n * 1000, 1);
                if (!C6280d.m15868c().mo43860b() || !TextUtils.isEmpty(str)) {
                    bVar.mo43865a(1, a2, dVar, bVar2, r3);
                } else {
                    bVar.mo43866b(1, C6280d.m15868c().mo43857a(str2), dVar, r3);
                }
            } else {
                m17083c("EXCEPTION_RETURN_EMPTY");
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            m17083c("Load exception");
            m17088f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17083c(String str) {
        if (this.f16670I == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f16670I.sendEmptyMessage(4);
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = str;
        if (str.contains("exception")) {
            this.f16670I.sendMessageAtFrontOfQueue(obtain);
        } else {
            this.f16670I.sendMessage(obtain);
        }
    }

    /* renamed from: d */
    private void m17085d() {
        if (C7167a.m18072a() != null) {
            try {
                C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
                if (b == null) {
                    b = C6076b.m15089a().mo42748b();
                }
                C7167a.m18072a().mo49066a(b.mo42726p() * 1000, this.f16684j);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo47014a(C6758b bVar) {
        this.f16692r = bVar;
    }

    /* renamed from: d */
    public final void mo47049d(boolean z) {
        List<CampaignEx> list;
        if (!z && (list = this.f16664C) != null && list.size() > 0) {
            C7167a.m18072a().mo49070a(this.f16684j, this.f16664C);
        }
    }

    /* renamed from: e */
    public final void mo47050e(boolean z) {
        if (z) {
            List<CampaignEx> list = this.f16674M;
            if (list != null && list.size() > 0) {
                for (CampaignEx next : this.f16674M) {
                    if (next != null) {
                        next.setLoadTimeoutState(0);
                        if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().mo43510d())) {
                            C7203i a = C7203i.m18311a();
                            a.mo49233d(this.f16684j + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo43510d(), false);
                        }
                    }
                }
                C7167a.m18072a().mo49071a(this.f16684j, this.f16674M, "load_timeout", 0);
                return;
            }
            return;
        }
        List<CampaignEx> list2 = this.f16664C;
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx next2 : this.f16664C) {
                if (next2 != null) {
                    next2.setLoadTimeoutState(0);
                    if (next2.getRewardTemplateMode() != null && !TextUtils.isEmpty(next2.getRewardTemplateMode().mo43510d())) {
                        C7203i a2 = C7203i.m18311a();
                        a2.mo49233d(this.f16684j + "_" + next2.getRequestId() + "_" + next2.getRewardTemplateMode().mo43510d(), false);
                    }
                }
            }
            C7167a.m18072a().mo49071a(this.f16684j, this.f16664C, "load_timeout", 0);
        }
    }

    /* renamed from: f */
    public final boolean mo47051f(boolean z) {
        if (z) {
            List<CampaignEx> list = this.f16674M;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx next : this.f16674M) {
                if (next != null) {
                    next.setLoadTimeoutState(1);
                    if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().mo43510d())) {
                        C7203i a = C7203i.m18311a();
                        a.mo49233d(this.f16684j + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo43510d(), true);
                    }
                }
            }
            C7167a.m18072a().mo49071a(this.f16684j, this.f16674M, "load_timeout", 1);
            return true;
        }
        List<CampaignEx> list2 = this.f16664C;
        if (list2 == null || list2.size() <= 0) {
            return false;
        }
        for (CampaignEx next2 : this.f16664C) {
            if (next2 != null) {
                next2.setLoadTimeoutState(1);
                if (next2.getRewardTemplateMode() != null && !TextUtils.isEmpty(next2.getRewardTemplateMode().mo43510d())) {
                    C7203i a2 = C7203i.m18311a();
                    a2.mo49233d(this.f16684j + "_" + next2.getRequestId() + "_" + next2.getRewardTemplateMode().mo43510d(), true);
                }
            }
        }
        C7167a.m18072a().mo49071a(this.f16684j, this.f16664C, "load_timeout", 1);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17074a(String str, List<CampaignEx> list, boolean z) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            C6143d.m15367a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d())).mo42971a(str, list, z);
        }
    }

    /* renamed from: a */
    private void m17065a(CampaignEx campaignEx) {
        try {
            C7167a a = C7167a.m18072a();
            if (a != null) {
                a.mo49067a(campaignEx);
            }
        } catch (Throwable th) {
            C6361q.m16155a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c6, code lost:
        if (r1 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d2, code lost:
        if (r1 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018a, code lost:
        if (com.mbridge.msdk.foundation.tools.C6369x.m16235a(r5.getVideoUrlEncode()) != false) goto L_0x018c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01be A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01d8 A[SYNTHETIC, Splitter:B:114:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0131 A[SYNTHETIC, Splitter:B:64:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0158 A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0191 A[Catch:{ Exception -> 0x01ce }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> m17064a(com.mbridge.msdk.foundation.entity.CampaignUnit r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            com.mbridge.msdk.videocommon.d.c r2 = r12.f16693s     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x0010
            com.mbridge.msdk.videocommon.d.c r2 = r12.f16693s     // Catch:{ Exception -> 0x01ce }
            int r2 = r2.mo49158s()     // Catch:{ Exception -> 0x01ce }
        L_0x0010:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == 0) goto L_0x01c6
            java.util.ArrayList r3 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            if (r3 == 0) goto L_0x01c6
            java.util.ArrayList r3 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            int r3 = r3.size()     // Catch:{ Exception -> 0x01ce }
            if (r3 <= 0) goto L_0x01c6
            java.util.ArrayList r3 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            r12.f16673L = r3     // Catch:{ Exception -> 0x01ce }
            r4 = 0
            if (r13 == 0) goto L_0x005a
            java.util.ArrayList r5 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            if (r5 == 0) goto L_0x005a
            java.util.ArrayList r5 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            int r5 = r5.size()     // Catch:{ Exception -> 0x01ce }
            if (r5 <= 0) goto L_0x005a
            java.util.ArrayList r13 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            r5 = 0
        L_0x0043:
            int r6 = r13.size()     // Catch:{ Exception -> 0x01ce }
            if (r5 >= r6) goto L_0x005a
            java.lang.Object r6 = r13.get(r5)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r12.f16684j     // Catch:{ Exception -> 0x01ce }
            r6.setCampaignUnitId(r7)     // Catch:{ Exception -> 0x01ce }
            r13.set(r5, r6)     // Catch:{ Exception -> 0x01ce }
            int r5 = r5 + 1
            goto L_0x0043
        L_0x005a:
            r13 = 0
        L_0x005b:
            int r5 = r3.size()     // Catch:{ Exception -> 0x01ce }
            if (r13 >= r5) goto L_0x01c6
            if (r13 >= r2) goto L_0x01c6
            java.lang.Object r5 = r3.get(r13)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5     // Catch:{ Exception -> 0x01ce }
            boolean r6 = r5.isMraid()     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x015c
            java.lang.String r6 = r5.getMraid()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r6 = r6.trim()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 != 0) goto L_0x01c2
            int r6 = r5.getAdType()     // Catch:{ Exception -> 0x01ce }
            r7 = 287(0x11f, float:4.02E-43)
            java.lang.String r8 = ""
            if (r6 != r7) goto L_0x008a
            java.lang.String r6 = "3"
            goto L_0x00a1
        L_0x008a:
            int r6 = r5.getAdType()     // Catch:{ Exception -> 0x01ce }
            r7 = 94
            if (r6 != r7) goto L_0x0095
            java.lang.String r6 = "1"
            goto L_0x00a1
        L_0x0095:
            int r6 = r5.getAdType()     // Catch:{ Exception -> 0x01ce }
            r7 = 42
            if (r6 != r7) goto L_0x00a0
            java.lang.String r6 = "2"
            goto L_0x00a1
        L_0x00a0:
            r6 = r8
        L_0x00a1:
            com.mbridge.msdk.foundation.same.b.c r7 = com.mbridge.msdk.foundation.same.p167b.C6211c.MBRIDGE_700_HTML     // Catch:{ Exception -> 0x011f }
            java.lang.String r7 = com.mbridge.msdk.foundation.same.p167b.C6213e.m15725b(r7)     // Catch:{ Exception -> 0x011f }
            java.lang.String r9 = r5.getMraid()     // Catch:{ Exception -> 0x011f }
            java.lang.String r9 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r9)     // Catch:{ Exception -> 0x011f }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x011f }
            if (r10 == 0) goto L_0x00bd
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x011f }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x011f }
        L_0x00bd:
            java.lang.String r10 = ".html"
            java.lang.String r9 = r9.concat(r10)     // Catch:{ Exception -> 0x011f }
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x011f }
            r10.<init>(r7, r9)     // Catch:{ Exception -> 0x011f }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x011f }
            r7.<init>(r10)     // Catch:{ Exception -> 0x011f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r1.<init>()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = "<script>"
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            com.mbridge.msdk.b.b.a r9 = com.mbridge.msdk.p158b.p160b.C6077a.m15106a()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = r9.mo42759b()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = "</script>"
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = r5.getMraid()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            byte[] r1 = r1.getBytes()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r7.write(r1)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r7.flush()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r5.setMraid(r1)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r1 = r12.f16684j     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            com.mbridge.msdk.foundation.same.report.C6305b.m15963a(r5, r8, r1, r6)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r7.close()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r1 = r7
            goto L_0x0134
        L_0x010d:
            r13 = move-exception
            r1 = r7
            goto L_0x01d6
        L_0x0111:
            r13 = move-exception
            r1 = r7
            goto L_0x01cf
        L_0x0115:
            r13 = move-exception
            r1 = r7
            goto L_0x0156
        L_0x0118:
            r1 = move-exception
            r11 = r7
            r7 = r1
            r1 = r11
            goto L_0x0120
        L_0x011d:
            r13 = move-exception
            goto L_0x0156
        L_0x011f:
            r7 = move-exception
        L_0x0120:
            r7.printStackTrace()     // Catch:{ all -> 0x011d }
            r5.setMraid(r8)     // Catch:{ all -> 0x011d }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x011d }
            java.lang.String r8 = r12.f16684j     // Catch:{ all -> 0x011d }
            com.mbridge.msdk.foundation.same.report.C6305b.m15963a(r5, r7, r8, r6)     // Catch:{ all -> 0x011d }
            if (r1 == 0) goto L_0x0134
            r1.close()     // Catch:{ Exception -> 0x01ce }
        L_0x0134:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r5.getMraid()     // Catch:{ Exception -> 0x01ce }
            r6.<init>(r7)     // Catch:{ Exception -> 0x01ce }
            boolean r7 = r6.exists()     // Catch:{ Exception -> 0x01ce }
            if (r7 == 0) goto L_0x014f
            boolean r7 = r6.isFile()     // Catch:{ Exception -> 0x01ce }
            if (r7 == 0) goto L_0x014f
            boolean r6 = r6.canRead()     // Catch:{ Exception -> 0x01ce }
            if (r6 != 0) goto L_0x015c
        L_0x014f:
            java.lang.String r5 = "mraid resource write fail"
            r12.m17083c((java.lang.String) r5)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x0156:
            if (r1 == 0) goto L_0x015b
            r1.close()     // Catch:{ Exception -> 0x01ce }
        L_0x015b:
            throw r13     // Catch:{ Exception -> 0x01ce }
        L_0x015c:
            if (r5 == 0) goto L_0x01c2
            int r6 = r5.getOfferType()     // Catch:{ Exception -> 0x01ce }
            r7 = 99
            if (r6 == r7) goto L_0x01c2
            boolean r6 = r12.m17080b((com.mbridge.msdk.foundation.entity.CampaignEx) r5)     // Catch:{ Exception -> 0x01ce }
            r7 = 1
            if (r6 == 0) goto L_0x0182
            java.lang.String r6 = r5.getendcard_url()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = com.mbridge.msdk.foundation.tools.C6369x.m16235a(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x018e
            java.lang.String r6 = r5.getMraid()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x018e
            goto L_0x018c
        L_0x0182:
            java.lang.String r6 = r5.getVideoUrlEncode()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = com.mbridge.msdk.foundation.tools.C6369x.m16235a(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x018e
        L_0x018c:
            r6 = 0
            goto L_0x018f
        L_0x018e:
            r6 = 1
        L_0x018f:
            if (r6 == 0) goto L_0x01be
            int r6 = r5.getWtick()     // Catch:{ Exception -> 0x01ce }
            if (r6 == r7) goto L_0x01ba
            android.content.Context r6 = r12.f16683i     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r5.getPackageName()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = com.mbridge.msdk.foundation.tools.C6366u.m16214c(r6, r7)     // Catch:{ Exception -> 0x01ce }
            if (r6 != 0) goto L_0x01a4
            goto L_0x01ba
        L_0x01a4:
            boolean r6 = com.mbridge.msdk.foundation.tools.C6366u.m16209b((com.mbridge.msdk.foundation.entity.CampaignEx) r5)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x01ae
            r0.add(r5)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x01ae:
            java.lang.String r6 = r12.f16684j     // Catch:{ Exception -> 0x01ce }
            int r7 = com.mbridge.msdk.foundation.same.C6204a.f15411u     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.tools.C6366u.m16197a((java.lang.String) r6, (com.mbridge.msdk.foundation.entity.CampaignEx) r5, (int) r7)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = "APP ALREADY INSTALLED"
            r12.f16672K = r5     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x01ba:
            r0.add(r5)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x01be:
            java.lang.String r5 = "No video campaign"
            r12.f16672K = r5     // Catch:{ Exception -> 0x01ce }
        L_0x01c2:
            int r13 = r13 + 1
            goto L_0x005b
        L_0x01c6:
            if (r1 == 0) goto L_0x01d5
        L_0x01c8:
            r1.close()     // Catch:{ IOException -> 0x01d5 }
            goto L_0x01d5
        L_0x01cc:
            r13 = move-exception
            goto L_0x01d6
        L_0x01ce:
            r13 = move-exception
        L_0x01cf:
            r13.printStackTrace()     // Catch:{ all -> 0x01cc }
            if (r1 == 0) goto L_0x01d5
            goto L_0x01c8
        L_0x01d5:
            return r0
        L_0x01d6:
            if (r1 == 0) goto L_0x01db
            r1.close()     // Catch:{ IOException -> 0x01db }
        L_0x01db:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C6779d.m17064a(com.mbridge.msdk.foundation.entity.CampaignUnit):java.util.List");
    }

    /* renamed from: e */
    private int m17086e() {
        try {
            int a = C6369x.m16236b(this.f16684j) ? C6738a.m16908a(this.f16684j) : 0;
            if (this.f16693s == null || a > this.f16693s.mo49160t()) {
                return 0;
            }
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m17088f() {
        try {
            if (C6369x.m16236b(this.f16684j)) {
                C6738a.m16913a(this.f16684j, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private String m17091g() {
        try {
            if (C6369x.m16236b(C6738a.f16422a)) {
                return C6738a.f16422a;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: h */
    private void m17093h() {
        try {
            if (C6208d.f15418a != null && C6208d.f15418a.size() > 0) {
                C6208d.f15418a.clear();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: i */
    private void m17095i() {
        try {
            C6151i.m15437a((C6146e) C6148f.m15420a(this.f16683i)).mo43011a(this.f16684j);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private boolean m17080b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo47042a(List<CampaignEx> list) {
        this.f16674M = list;
    }

    /* renamed from: a */
    public final void mo47036a(int i, int i2, int i3) {
        this.f16699y = i;
        this.f16700z = i2;
        this.f16662A = i3;
    }

    /* renamed from: b */
    public final void mo47044b(String str) {
        if (this.f16693s != null && TextUtils.isEmpty(str)) {
            int b = this.f16693s.mo49123b() * 1000;
            List<CampaignEx> list = this.f16674M;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.f16674M.get(0).getTimestamp() < ((long) b)) {
                    m17083c("hit ltorwc");
                    return;
                }
            }
        }
        m17075a(str, this.f16665D);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$e */
    /* compiled from: RewardMVVideoAdapter */
    public class C6799e implements Runnable {

        /* renamed from: b */
        private String f16776b;

        public C6799e(String str) {
            this.f16776b = str;
        }

        public final void run() {
            try {
                String unused = C6779d.this.f16690p = C6366u.m16205b(C6779d.this.f16683i, C6779d.this.f16684j);
                if (!C6779d.this.f16669H) {
                    if (!(C6779d.this.f16667F == null || C6779d.this.f16670I == null)) {
                        C6779d.this.f16670I.removeCallbacks(C6779d.this.f16667F);
                    }
                    boolean unused2 = C6779d.this.f16668G = true;
                    if (C6779d.this.f16670I != null) {
                        Message obtainMessage = C6779d.this.f16670I.obtainMessage();
                        obtainMessage.obj = this.f16776b;
                        obtainMessage.what = 1;
                        C6779d.this.f16670I.sendMessage(obtainMessage);
                    }
                    if (!TextUtils.isEmpty(C6779d.this.f16690p)) {
                        C6361q.m16158d("RewardMVVideoAdapter", "excludeId : " + C6779d.this.f16690p);
                    }
                }
            } catch (Exception e) {
                C6361q.m16158d("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$d */
    /* compiled from: RewardMVVideoAdapter */
    public class C6798d implements Runnable {

        /* renamed from: b */
        private String f16774b;

        public C6798d(String str) {
            this.f16774b = str;
        }

        public final void run() {
            try {
                if (!C6779d.this.f16668G) {
                    boolean unused = C6779d.this.f16669H = true;
                    if (C6779d.this.f16670I != null) {
                        Message obtainMessage = C6779d.this.f16670I.obtainMessage();
                        obtainMessage.obj = this.f16774b;
                        obtainMessage.what = 2;
                        C6779d.this.f16670I.sendMessage(obtainMessage);
                    }
                }
            } catch (Exception e) {
                C6361q.m16158d("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    private void m17079b(String str, boolean z) {
        new Thread(new C6799e(str)).start();
        if (this.f16670I != null) {
            C6798d dVar = new C6798d(str);
            this.f16667F = dVar;
            this.f16670I.postDelayed(dVar, 90000);
            return;
        }
        m17075a(str, z);
    }

    /* renamed from: a */
    static /* synthetic */ void m17071a(C6779d dVar, String str, List list, List list2, boolean z) {
        C6143d.m15367a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d())).mo42970a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2, z);
        if (z) {
            if (!(C7167a.m18072a() == null || dVar.f16663B == null)) {
                C7167a.m18072a().mo49074b(str);
            }
            if (!(C7167a.m18072a() == null || dVar.f16663B == null)) {
                C7167a.m18072a().mo49075b(str, dVar.f16663B.getVcn());
            }
            if (list != null && list.size() > 0) {
                if (!(dVar.f16663B == null || list.get(0) == null)) {
                    C6738a.m16914a(dVar.f16663B.getRequestId(), ((CampaignEx) list.get(0)).getBidToken());
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx = (CampaignEx) it.next();
                    if (campaignEx != null) {
                        C6208d.m15704a(campaignEx.getCampaignUnitId(), campaignEx.getRequestId(), campaignEx.getId(), campaignEx.getPlct(), campaignEx.getPlctb(), campaignEx.getTimestamp());
                    }
                }
            }
            if (list2 != null && list2.size() > 0) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                    if (campaignEx2 != null) {
                        C6208d.m15707b(campaignEx2.getCampaignUnitId(), campaignEx2.getRequestId());
                    }
                }
            }
        }
        if (list2 != null && list2.size() > 0) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                CampaignEx campaignEx3 = (CampaignEx) it3.next();
                if (campaignEx3.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx3.getRewardTemplateMode().mo43510d())) {
                    C7165a.m18063b(str + "_" + campaignEx3.getId() + "_" + campaignEx3.getRequestId() + "_" + campaignEx3.getRewardTemplateMode().mo43510d());
                    C7165a.m18061b(campaignEx3.getAdType(), campaignEx3);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17067a(C6779d dVar, WindVaneWebView windVaneWebView, String str, CampaignEx campaignEx, List list, String str2, String str3, C7179c cVar, String str4) {
        C7062j jVar;
        C6779d dVar2 = dVar;
        CampaignEx campaignEx2 = campaignEx;
        List list2 = list;
        try {
            C7165a.C7166a aVar = new C7165a.C7166a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(C6122a.m15302b().mo42895d());
            aVar.mo49055a(windVaneWebView2);
            if (list2 == null || list.size() <= 0) {
                jVar = new C7062j((Activity) null, campaignEx2);
            } else {
                jVar = new C7062j((Activity) null, campaignEx2, list2);
            }
            C7062j jVar2 = jVar;
            jVar2.mo48801a(dVar2.f16695u);
            jVar2.mo48806a(str3);
            jVar2.mo48805a(cVar);
            jVar2.mo48843d(dVar2.f16665D);
            C6797c cVar2 = r1;
            C6797c cVar3 = new C6797c(windVaneWebView, str3, campaignEx, list, str2, str3, cVar, dVar2.f16695u, dVar);
            windVaneWebView2.setWebViewListener(new C6800f(windVaneWebView, str, str3, aVar, campaignEx, dVar, cVar2, dVar2.f16670I));
            windVaneWebView2.setObject(jVar2);
            windVaneWebView2.loadUrl(str2);
            dVar2.f16670I.postDelayed(cVar2, 5000);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            C6361q.m16154a("RewardMVVideoAdapter", th.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17069a(C6779d dVar, String str, CampaignEx campaignEx, String str2, String str3, C7179c cVar) {
        C7062j jVar;
        C6779d dVar2 = dVar;
        CampaignEx campaignEx2 = campaignEx;
        try {
            C7165a.C7166a aVar = new C7165a.C7166a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(C6122a.m15302b().mo42895d());
            aVar.mo49055a(windVaneWebView);
            String b = C6877c.m17219a().mo48200b();
            aVar.mo49056a(b);
            if (dVar2.f16663B == null || dVar2.f16663B.getAds() == null || dVar2.f16663B.getAds().size() <= 0) {
                jVar = new C7062j((Activity) null, campaignEx2);
            } else {
                jVar = new C7062j((Activity) null, campaignEx2, dVar2.f16663B.getAds());
            }
            C7062j jVar2 = jVar;
            jVar2.mo48801a(dVar2.f16695u);
            jVar2.mo48806a(str3);
            jVar2.mo48840c(b);
            jVar2.mo48805a(cVar);
            jVar2.mo48843d(dVar2.f16665D);
            C6796b bVar = new C6796b(str3, campaignEx, str2, str3, cVar, dVar2.f16695u, dVar);
            windVaneWebView.setWebViewListener(new C6795a(str, str3, aVar, campaignEx, dVar, bVar, dVar2.f16670I));
            windVaneWebView.setObject(jVar2);
            windVaneWebView.loadUrl(str2);
            dVar2.f16670I.postDelayed(bVar, 5000);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            C6361q.m16154a("RewardMVVideoAdapter", th.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17070a(C6779d dVar, String str, String str2) {
        try {
            if (dVar.f16694t != null && !TextUtils.isEmpty(str2)) {
                Iterator<CampaignEx> it = dVar.f16694t.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CampaignEx next = it.next();
                    if (next != null) {
                        String videoUrlEncode = next.getVideoUrlEncode();
                        if (!TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                            dVar.f16694t.remove(next);
                            dVar.m17065a(next);
                            break;
                        }
                        String str3 = next.getendcard_url();
                        if (!TextUtils.isEmpty(str3) && str2.equals(str3)) {
                            dVar.f16694t.remove(next);
                            dVar.m17065a(next);
                            break;
                        }
                        CampaignEx.C6189c rewardTemplateMode = next.getRewardTemplateMode();
                        if (rewardTemplateMode != null) {
                            List<CampaignEx.C6189c.C6190a> e = rewardTemplateMode.mo43511e();
                            if (e != null) {
                                Iterator<CampaignEx.C6189c.C6190a> it2 = e.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        CampaignEx.C6189c.C6190a next2 = it2.next();
                                        if (next2 != null && next2.f15267b != null && next2.f15267b.contains(str2)) {
                                            dVar.f16694t.remove(next);
                                            dVar.m17065a(next);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            String d = rewardTemplateMode.mo43510d();
                            if (!TextUtils.isEmpty(d) && str2.equals(d)) {
                                dVar.f16694t.remove(next);
                                dVar.m17065a(next);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (dVar.f16692r != null && dVar.f16694t != null && dVar.f16694t.size() == 0) {
                    if (dVar.f16670I != null) {
                        dVar.f16670I.removeMessages(5);
                    }
                    dVar.m17083c(str);
                    dVar.f16692r.mo42805a(str);
                }
            } else if (dVar.f16692r != null) {
                if (dVar.f16670I != null) {
                    dVar.f16670I.removeMessages(5);
                }
                dVar.m17083c(str);
                dVar.f16692r.mo42805a(str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17066a(C6779d dVar, CampaignUnit campaignUnit) {
        List<CampaignEx> list;
        C6779d dVar2 = dVar;
        final CampaignUnit campaignUnit2 = campaignUnit;
        dVar2.f16663B = campaignUnit2;
        dVar2.f16664C = dVar.m17064a(campaignUnit);
        new Thread(new Runnable() {
            public final void run() {
                C6152j.m15441a((C6146e) C6148f.m15420a(C6779d.this.f16683i)).mo43015b();
                CampaignUnit campaignUnit = campaignUnit2;
                if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit2.getAds().size() > 0) {
                    C6779d.m17073a(C6779d.this, (List) campaignUnit2.getAds());
                }
            }
        }).start();
        List<CampaignEx> list2 = dVar2.f16664C;
        if (list2 == null || list2.size() <= 0) {
            C6361q.m16156b("RewardMVVideoAdapter", "onload load失败 返回的compaign 没有带视频素材");
            if (TextUtils.isEmpty(dVar2.f16672K)) {
                dVar2.f16672K = "APP ALREADY INSTALLED";
            }
            dVar2.m17083c(dVar2.f16672K);
            return;
        }
        C6361q.m16156b("RewardMVVideoAdapter", "onload load成功 size:" + dVar2.f16664C.size());
        Handler handler = dVar2.f16670I;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
        if (campaignUnit2 != null) {
            String sessionId = campaignUnit.getSessionId();
            if (C6369x.m16236b(sessionId)) {
                C6738a.f16422a = sessionId;
            }
        }
        List<CampaignEx> list3 = dVar2.f16664C;
        if (list3 != null) {
            try {
                if (list3.size() > 0) {
                    dVar2.f16686l += list3.size();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (dVar2.f16693s == null || dVar2.f16686l > dVar2.f16693s.mo49160t()) {
            dVar2.f16686l = 0;
        }
        if (C6369x.m16236b(dVar2.f16684j)) {
            C6738a.m16913a(dVar2.f16684j, dVar2.f16686l);
        }
        List<CampaignEx> list4 = dVar2.f16664C;
        if (list4 != null && list4.size() > 0) {
            String str = dVar2.f16685k;
            String str2 = dVar2.f16684j;
            List<CampaignEx> list5 = dVar2.f16664C;
            if (C7167a.m18072a() != null) {
                C7167a.m18072a().mo49069a(str, str2, list5);
            }
        }
        final CampaignEx campaignEx = dVar2.f16664C.get(0);
        final boolean z = !TextUtils.isEmpty(campaignEx.getMof_template_url());
        final int nscpt = campaignEx.getNscpt();
        dVar2.f16678d = false;
        dVar2.f16679e = false;
        dVar2.f16680f = false;
        dVar2.f16682h = false;
        dVar2.f16681g = false;
        if (campaignEx == null || !C6366u.m16221f(campaignEx.getMof_template_url()) || ((list = dVar2.f16664C) != null && list.size() >= 2)) {
            C6759c.C6778m.f16661a.mo47016a(dVar2.f16683i, z, nscpt, dVar2.f16697w, dVar2.f16696v ? 287 : 94, dVar2.f16685k, dVar2.f16684j, campaignEx.getRequestId(), dVar2.f16664C, new C6759c.C6766c() {
                /* renamed from: a */
                public final void mo46991a(String str, String str2, String str3, List<CampaignEx> list) {
                    final String str4 = str2;
                    final List<CampaignEx> list2 = list;
                    C6779d.this.f16678d = true;
                    if (list2 != null && list.size() > 0) {
                        Context h = C6779d.this.f16683i;
                        C6801a.m17157c(list2.get(0), h, "resource download success is tpl :" + z, C6779d.this.f16684j, C6779d.this.f16697w, str3, campaignEx.getRequestIdNotice());
                    }
                    if (!z) {
                        for (final CampaignEx next : list) {
                            if (next == null || next.getRewardTemplateMode() == null || TextUtils.isEmpty(next.getRewardTemplateMode().mo43510d()) || C6779d.this.f16670I == null) {
                                C6779d dVar = C6779d.this;
                                if (dVar.mo47043a((List<CampaignEx>) dVar.f16664C, z, nscpt)) {
                                    C6779d dVar2 = C6779d.this;
                                    C6779d.m17071a(dVar2, dVar2.f16684j, (List) list2, C6779d.this.f16674M, C6779d.this.f16697w);
                                    if (C6779d.this.f16670I != null) {
                                        C6779d.this.f16670I.removeMessages(5);
                                    }
                                    if (C6779d.this.f16692r != null && !C6779d.this.f16681g) {
                                        C6779d.this.f16681g = true;
                                        if (!TextUtils.isEmpty(C6779d.this.f16684j)) {
                                            C6801a.m17153a(C6779d.this.f16683i, C6779d.this.f16664C, C6779d.this.f16684j, System.currentTimeMillis() - C6779d.this.f16671J);
                                        }
                                        C6779d.this.f16692r.mo42804a();
                                    }
                                } else {
                                    C6779d dVar3 = C6779d.this;
                                    dVar3.m17074a(str4, (List<CampaignEx>) dVar3.f16673L, C6779d.this.f16697w);
                                    if (C6779d.this.f16670I != null) {
                                        C6779d.this.f16670I.removeMessages(5);
                                    }
                                    if (C6779d.this.f16692r != null && !C6779d.this.f16682h) {
                                        C6779d.this.f16682h = true;
                                        if (!TextUtils.isEmpty(C6779d.this.f16684j) && C6779d.this.f16664C != null && C6779d.this.f16664C.size() > 0) {
                                            C6801a.m17154a((CampaignEx) C6779d.this.f16664C.get(0), C6779d.this.f16683i, "have no temp but isReady false", C6779d.this.f16684j, C6779d.this.f16697w, str3, campaignEx.getRequestIdNotice());
                                        }
                                        C6779d.this.f16692r.mo42805a("errorCode: 3503 errorMessage: have no temp but isReady false");
                                    }
                                }
                            } else {
                                final String str5 = str;
                                final String str6 = str2;
                                final String str7 = str3;
                                final List<CampaignEx> list3 = list;
                                C6779d.this.f16670I.post(new Runnable() {
                                    public final void run() {
                                        C6759c a = C6759c.C6778m.f16661a;
                                        boolean l = C6779d.this.f16665D;
                                        Handler i = C6779d.this.f16670I;
                                        boolean m = C6779d.this.f16696v;
                                        boolean f = C6779d.this.f16697w;
                                        String d = next.getRewardTemplateMode().mo43510d();
                                        int o = C6779d.this.f16695u;
                                        CampaignEx campaignEx = campaignEx;
                                        List c = C6779d.this.f16664C;
                                        String b = C7191g.m18286a().mo49220b(next.getRewardTemplateMode().mo43510d());
                                        String str = str5;
                                        String str2 = str6;
                                        String str3 = str7;
                                        String requestIdNotice = next.getRequestIdNotice();
                                        C7179c p = C6779d.this.f16693s;
                                        C67841 r17 = r6;
                                        C67841 r6 = new C6759c.C6773j() {
                                            /* renamed from: a */
                                            public final void mo46994a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar) {
                                                if (C6779d.this.mo47043a((List<CampaignEx>) C6779d.this.f16664C, z, nscpt)) {
                                                    C6779d.m17071a(C6779d.this, C6779d.this.f16684j, list3, C6779d.this.f16674M, C6779d.this.f16697w);
                                                    if (C6779d.this.f16670I != null) {
                                                        C6779d.this.f16670I.removeMessages(5);
                                                    }
                                                    if (C6779d.this.f16692r != null && !C6779d.this.f16681g) {
                                                        C6779d.this.f16681g = true;
                                                        if (!TextUtils.isEmpty(C6779d.this.f16684j)) {
                                                            C6801a.m17153a(C6779d.this.f16683i, C6779d.this.f16664C, C6779d.this.f16684j, System.currentTimeMillis() - C6779d.this.f16671J);
                                                        }
                                                        C6779d.this.f16692r.mo42804a();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                C6779d.this.m17074a(str3, (List<CampaignEx>) C6779d.this.f16673L, C6779d.this.f16697w);
                                                if (C6779d.this.f16670I != null) {
                                                    C6779d.this.f16670I.removeMessages(5);
                                                }
                                                if (C6779d.this.f16692r != null && !C6779d.this.f16682h) {
                                                    C6779d.this.f16682h = true;
                                                    if (!TextUtils.isEmpty(C6779d.this.f16684j) && C6779d.this.f16664C != null && C6779d.this.f16664C.size() > 0) {
                                                        C6801a.m17154a((CampaignEx) C6779d.this.f16664C.get(0), C6779d.this.f16683i, "temp preload success but isReady false", C6779d.this.f16684j, C6779d.this.f16697w, str4, campaignEx.getRequestIdNotice());
                                                    }
                                                    C6779d.this.f16692r.mo42805a("errorCode: 3502 errorMessage: temp preload success but isReady false");
                                                }
                                            }

                                            /* renamed from: a */
                                            public final void mo46995a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar, String str6) {
                                                C6779d.this.m17074a(str3, (List<CampaignEx>) C6779d.this.f16673L, C6779d.this.f16697w);
                                                if (C6779d.this.f16670I != null) {
                                                    C6779d.this.f16670I.removeMessages(5);
                                                }
                                                if (C6779d.this.f16692r != null && !C6779d.this.f16682h) {
                                                    C6779d.this.f16682h = true;
                                                    if (!TextUtils.isEmpty(C6779d.this.f16684j) && C6779d.this.f16673L != null && C6779d.this.f16673L.size() > 0) {
                                                        Context h = C6779d.this.f16683i;
                                                        C6801a.m17154a((CampaignEx) C6779d.this.f16673L.get(0), h, "temp preload failed: " + str6, C6779d.this.f16684j, C6779d.this.f16697w, str4, campaignEx.getRequestIdNotice());
                                                    }
                                                    C6758b a = C6779d.this.f16692r;
                                                    a.mo42805a("errorCode: 3301 errorMessage: temp preload failed: " + str6);
                                                }
                                            }
                                        };
                                        a.mo47017a(l, i, m, f, (WindVaneWebView) null, d, o, campaignEx, c, b, str, str2, str3, requestIdNotice, p, r17);
                                    }
                                });
                            }
                        }
                    } else if (C6779d.this.f16679e && !C6779d.this.f16680f && C6779d.this.f16670I != null) {
                        C6779d.this.f16680f = true;
                        final String str8 = str3;
                        C6779d.this.f16670I.post(new Runnable() {
                            public final void run() {
                                C6759c a = C6759c.C6778m.f16661a;
                                boolean l = C6779d.this.f16665D;
                                Handler i = C6779d.this.f16670I;
                                boolean m = C6779d.this.f16696v;
                                boolean f = C6779d.this.f16697w;
                                String str = str8;
                                String requestIdNotice = campaignEx.getRequestIdNotice();
                                String q = C6779d.this.f16685k;
                                String str2 = str4;
                                String mof_template_url = campaignEx.getMof_template_url();
                                int o = C6779d.this.f16695u;
                                CampaignEx campaignEx = campaignEx;
                                List c = C6779d.this.f16664C;
                                String b = C7191g.m18286a().mo49220b(campaignEx.getMof_template_url());
                                String str3 = str4;
                                C6759c cVar = a;
                                C7179c p = C6779d.this.f16693s;
                                C67861 r17 = r1;
                                C67861 r1 = new C6759c.C6773j() {
                                    /* renamed from: a */
                                    public final void mo46994a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar) {
                                        if (C6779d.this.mo47043a((List<CampaignEx>) C6779d.this.f16664C, z, nscpt)) {
                                            C6779d.m17071a(C6779d.this, C6779d.this.f16684j, list2, C6779d.this.f16674M, C6779d.this.f16697w);
                                            if (C6779d.this.f16670I != null) {
                                                C6779d.this.f16670I.removeMessages(5);
                                            }
                                            if (C6779d.this.f16692r != null && !C6779d.this.f16681g) {
                                                C6779d.this.f16681g = true;
                                                if (!TextUtils.isEmpty(C6779d.this.f16684j)) {
                                                    C6801a.m17153a(C6779d.this.f16683i, C6779d.this.f16664C, C6779d.this.f16684j, System.currentTimeMillis() - C6779d.this.f16671J);
                                                }
                                                C6779d.this.f16692r.mo42804a();
                                                return;
                                            }
                                            return;
                                        }
                                        C6779d.this.m17074a(str3, (List<CampaignEx>) C6779d.this.f16673L, C6779d.this.f16697w);
                                        if (C6779d.this.f16670I != null) {
                                            C6779d.this.f16670I.removeMessages(5);
                                        }
                                        if (C6779d.this.f16692r != null && !C6779d.this.f16682h) {
                                            C6779d.this.f16682h = true;
                                            if (!TextUtils.isEmpty(C6779d.this.f16684j) && C6779d.this.f16673L != null && C6779d.this.f16673L.size() > 0) {
                                                C6801a.m17154a((CampaignEx) C6779d.this.f16673L.get(0), C6779d.this.f16683i, "tpl temp preload success but isReady false", C6779d.this.f16684j, C6779d.this.f16697w, str4, campaignEx.getRequestIdNotice());
                                            }
                                            C6779d.this.f16692r.mo42805a("errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                        }
                                    }

                                    /* renamed from: a */
                                    public final void mo46995a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar, String str6) {
                                        C6779d.this.m17074a(str3, (List<CampaignEx>) C6779d.this.f16673L, C6779d.this.f16697w);
                                        if (C6779d.this.f16670I != null) {
                                            C6779d.this.f16670I.removeMessages(5);
                                        }
                                        if (C6779d.this.f16692r != null && !C6779d.this.f16682h) {
                                            C6779d.this.f16682h = true;
                                            if (C6779d.this.f16673L != null && C6779d.this.f16673L.size() > 0) {
                                                Context h = C6779d.this.f16683i;
                                                C6801a.m17154a((CampaignEx) C6779d.this.f16673L.get(0), h, "tpl temp preload failed: " + str6, C6779d.this.f16684j, C6779d.this.f16697w, str4, campaignEx.getRequestIdNotice());
                                            }
                                            C6758b a = C6779d.this.f16692r;
                                            a.mo42805a("errorCode: 3303 errorMessage: tpl temp preload failed: " + str6);
                                        }
                                    }
                                };
                                cVar.mo47018a(l, i, m, f, str, requestIdNotice, q, str2, mof_template_url, o, campaignEx, c, b, str3, p, r17, false);
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo46992a(String str, String str2, String str3, List<CampaignEx> list, String str4) {
                    C6779d.this.f16678d = false;
                    if (list != null && list.size() > 0) {
                        Context h = C6779d.this.f16683i;
                        C6801a.m17157c(list.get(0), h, str4 + " is tpl: " + z, C6779d.this.f16684j, C6779d.this.f16697w, str3, campaignEx.getRequestIdNotice());
                    }
                    if (C6779d.this.f16692r != null && C6779d.this.f16670I != null) {
                        final String str5 = str2;
                        final List<CampaignEx> list2 = list;
                        final String str6 = str4;
                        final String str7 = str3;
                        C6779d.this.f16670I.post(new Runnable() {
                            public final void run() {
                                List list;
                                C6779d.this.m17074a(str5, (List<CampaignEx>) C6779d.this.f16673L, C6779d.this.f16697w);
                                if (C6779d.this.f16670I != null) {
                                    C6779d.this.f16670I.removeMessages(5);
                                }
                                if (!C6779d.this.f16682h && C6779d.this.f16692r != null) {
                                    C6779d.this.f16682h = true;
                                    if (!TextUtils.isEmpty(C6779d.this.f16684j) && (list = list2) != null && list.size() > 0) {
                                        Context h = C6779d.this.f16683i;
                                        C6801a.m17154a((CampaignEx) list2.get(0), h, "" + str6, C6779d.this.f16684j, C6779d.this.f16697w, str7, campaignEx.getRequestIdNotice());
                                    }
                                    C6779d.this.f16692r.mo42805a("errorCode: 3201 errorMessage: campaign resource download failed");
                                }
                            }
                        });
                    }
                }
            }, new C6759c.C6772i() {
                /* renamed from: a */
                public final void mo46997a(String str, String str2, String str3, String str4) {
                }

                /* renamed from: a */
                public final void mo46998a(String str, final String str2, final String str3, String str4, final String str5) {
                    if (!z && C6779d.this.f16692r != null && C6779d.this.f16670I != null) {
                        C6779d.this.f16670I.post(new Runnable() {
                            public final void run() {
                                C6779d.this.m17074a(str2, (List<CampaignEx>) C6779d.this.f16673L, C6779d.this.f16697w);
                                if (C6779d.this.f16670I != null) {
                                    C6779d.this.f16670I.removeMessages(5);
                                }
                                if (!C6779d.this.f16682h && C6779d.this.f16692r != null) {
                                    C6779d.this.f16682h = true;
                                    if (C6779d.this.f16673L != null && C6779d.this.f16673L.size() > 0) {
                                        Context h = C6779d.this.f16683i;
                                        C6801a.m17154a((CampaignEx) C6779d.this.f16673L.get(0), h, "" + str5, C6779d.this.f16684j, C6779d.this.f16697w, str3, campaignEx.getRequestIdNotice());
                                    }
                                    C6779d.this.f16692r.mo42805a("errorCode: 3202 errorMessage: temp resource download failed");
                                }
                            }
                        });
                    } else if (nscpt == 1 && C6779d.this.f16692r != null && C6779d.this.f16670I != null) {
                        C6779d.this.f16670I.post(new Runnable() {
                            public final void run() {
                                C6779d.this.m17074a(str2, (List<CampaignEx>) C6779d.this.f16673L, C6779d.this.f16697w);
                                if (C6779d.this.f16670I != null) {
                                    C6779d.this.f16670I.removeMessages(5);
                                }
                                if (!C6779d.this.f16682h && C6779d.this.f16692r != null) {
                                    C6779d.this.f16682h = true;
                                    if (C6779d.this.f16673L != null && C6779d.this.f16673L.size() > 0) {
                                        C6801a.m17154a((CampaignEx) C6779d.this.f16673L.get(0), C6779d.this.f16683i, "tpl temp resource download failed", C6779d.this.f16684j, C6779d.this.f16697w, str3, campaignEx.getRequestIdNotice());
                                    }
                                    C6779d.this.f16692r.mo42805a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                                }
                            }
                        });
                    }
                }
            });
            if (z) {
                C6759c.C6778m.f16661a.mo47015a(dVar2.f16683i, campaignEx, dVar2.f16685k, dVar2.f16684j, campaignEx.getRequestId(), new C6759c.C6772i() {
                    /* renamed from: a */
                    public final void mo46997a(final String str, final String str2, final String str3, String str4) {
                        C6779d.this.f16679e = true;
                        if (C6779d.this.f16678d && !C6779d.this.f16680f && C6779d.this.f16670I != null) {
                            C6779d.this.f16680f = true;
                            C6779d.this.f16670I.post(new Runnable() {
                                public final void run() {
                                    C6759c a = C6759c.C6778m.f16661a;
                                    boolean l = C6779d.this.f16665D;
                                    Handler i = C6779d.this.f16670I;
                                    boolean m = C6779d.this.f16696v;
                                    boolean f = C6779d.this.f16697w;
                                    String str = str3;
                                    String requestIdNotice = campaignEx.getRequestIdNotice();
                                    String str2 = str;
                                    String str3 = str2;
                                    String mof_template_url = campaignEx.getMof_template_url();
                                    int o = C6779d.this.f16695u;
                                    CampaignEx campaignEx = campaignEx;
                                    List c = C6779d.this.f16664C;
                                    String b = C7191g.m18286a().mo49220b(campaignEx.getMof_template_url());
                                    String str4 = str2;
                                    C6759c cVar = a;
                                    C7179c p = C6779d.this.f16693s;
                                    C67931 r17 = r1;
                                    C67931 r1 = new C6759c.C6773j() {
                                        /* renamed from: a */
                                        public final void mo46994a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar) {
                                            if (C6779d.this.mo47043a((List<CampaignEx>) C6779d.this.f16664C, z, nscpt)) {
                                                C6779d.m17071a(C6779d.this, C6779d.this.f16684j, C6779d.this.f16673L, C6779d.this.f16674M, C6779d.this.f16697w);
                                                if (C6779d.this.f16670I != null) {
                                                    C6779d.this.f16670I.removeMessages(5);
                                                }
                                                if (C6779d.this.f16692r != null && !C6779d.this.f16681g) {
                                                    C6779d.this.f16681g = true;
                                                    if (!TextUtils.isEmpty(C6779d.this.f16684j)) {
                                                        C6801a.m17153a(C6779d.this.f16683i, C6779d.this.f16664C, C6779d.this.f16684j, System.currentTimeMillis() - C6779d.this.f16671J);
                                                    }
                                                    C6779d.this.f16692r.mo42804a();
                                                    return;
                                                }
                                                return;
                                            }
                                            C6779d.this.m17074a(str3, (List<CampaignEx>) C6779d.this.f16673L, C6779d.this.f16697w);
                                            if (C6779d.this.f16670I != null) {
                                                C6779d.this.f16670I.removeMessages(5);
                                            }
                                            if (C6779d.this.f16692r != null && !C6779d.this.f16682h) {
                                                C6779d.this.f16682h = true;
                                                if (C6779d.this.f16673L != null && C6779d.this.f16673L.size() > 0) {
                                                    C6801a.m17154a((CampaignEx) C6779d.this.f16673L.get(0), C6779d.this.f16683i, "tpl temp preload success but isReady false", C6779d.this.f16684j, C6779d.this.f16697w, str4, campaignEx.getRequestIdNotice());
                                                }
                                                C6779d.this.f16692r.mo42805a("errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                            }
                                        }

                                        /* renamed from: a */
                                        public final void mo46995a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar, String str6) {
                                            C6779d.this.m17074a(str3, (List<CampaignEx>) C6779d.this.f16673L, C6779d.this.f16697w);
                                            if (C6779d.this.f16670I != null) {
                                                C6779d.this.f16670I.removeMessages(5);
                                            }
                                            if (C6779d.this.f16692r != null && !C6779d.this.f16682h) {
                                                C6779d.this.f16682h = true;
                                                if (C6779d.this.f16673L != null && C6779d.this.f16673L.size() > 0) {
                                                    Context h = C6779d.this.f16683i;
                                                    C6801a.m17154a((CampaignEx) C6779d.this.f16673L.get(0), h, "tpl temp preload failed: " + str6, C6779d.this.f16684j, C6779d.this.f16697w, str4, campaignEx.getRequestIdNotice());
                                                }
                                                C6758b a = C6779d.this.f16692r;
                                                a.mo42805a("errorCode: 3303 errorMessage: tpl temp preload failed: " + str6);
                                            }
                                        }
                                    };
                                    cVar.mo47018a(l, i, m, f, str, requestIdNotice, str2, str3, mof_template_url, o, campaignEx, c, b, str4, p, r17, false);
                                }
                            });
                        }
                    }

                    /* renamed from: a */
                    public final void mo46998a(String str, String str2, String str3, String str4, String str5) {
                        C6779d.this.f16679e = false;
                        C6779d dVar = C6779d.this;
                        dVar.m17074a(str2, (List<CampaignEx>) dVar.f16673L, C6779d.this.f16697w);
                        if (C6779d.this.f16670I != null) {
                            C6779d.this.f16670I.removeMessages(5);
                        }
                        if (C6779d.this.f16692r != null && !C6779d.this.f16682h) {
                            C6779d.this.f16682h = true;
                            if (C6779d.this.f16673L != null && C6779d.this.f16673L.size() > 0) {
                                Context h = C6779d.this.f16683i;
                                C6801a.m17154a((CampaignEx) C6779d.this.f16673L.get(0), h, "" + str5, C6779d.this.f16684j, C6779d.this.f16697w, str3, campaignEx.getRequestIdNotice());
                            }
                            C6779d.this.f16692r.mo42805a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                        }
                    }
                });
                return;
            }
            return;
        }
        dVar2.m17074a(dVar2.f16684j, dVar2.f16673L, dVar2.f16697w);
        String str3 = TextUtils.isEmpty(dVar2.f16672K) ? "no available campaign" : dVar2.f16672K;
        C6801a.m17154a(dVar2.f16664C.get(0), dVar2.f16683i, str3, dVar2.f16684j, dVar2.f16697w, campaignEx.getRequestId(), campaignEx.getRequestIdNotice());
        dVar2.f16692r.mo42805a(str3);
    }

    /* renamed from: a */
    static /* synthetic */ void m17073a(C6779d dVar, List list) {
        if (dVar.f16683i != null && list != null && list.size() != 0) {
            C6152j a = C6152j.m15441a((C6146e) C6148f.m15420a(dVar.f16683i));
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) list.get(i);
                if (!(campaignEx == null || a == null || a.mo43013a(campaignEx.getId()))) {
                    C6196f fVar = new C6196f();
                    fVar.mo43631a(campaignEx.getId());
                    fVar.mo43629a(campaignEx.getFca());
                    fVar.mo43633b(campaignEx.getFcb());
                    fVar.mo43637d(0);
                    fVar.mo43635c(0);
                    fVar.mo43630a(System.currentTimeMillis());
                    a.mo43012a(fVar);
                }
            }
        }
    }
}
