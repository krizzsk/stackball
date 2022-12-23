package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.environment.C5531j;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C5556E;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.C5799i;
import com.ironsource.mediationsdk.utils.C5800j;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.p143a.C5826e;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.mediationsdk.I */
final class C5568I implements C5531j {

    /* renamed from: s */
    private static C5568I f12931s;

    /* renamed from: A */
    private C5573b f12932A = new C5573b() {
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02cc A[Catch:{ Exception -> 0x037b }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[Catch:{ Exception -> 0x037b }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[Catch:{ Exception -> 0x037b }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[Catch:{ Exception -> 0x037b }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[Catch:{ Exception -> 0x037b }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4 A[Catch:{ Exception -> 0x037b }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0115 A[Catch:{ Exception -> 0x037b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.C5556E.m13257a()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.ac r1 = com.ironsource.mediationsdk.C5650ac.m13819a()     // Catch:{ Exception -> 0x037b }
                java.lang.Thread r2 = new java.lang.Thread     // Catch:{ Exception -> 0x0016 }
                com.ironsource.mediationsdk.ac$1 r3 = new com.ironsource.mediationsdk.ac$1     // Catch:{ Exception -> 0x0016 }
                r3.<init>()     // Catch:{ Exception -> 0x0016 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0016 }
                r2.start()     // Catch:{ Exception -> 0x0016 }
                goto L_0x001a
            L_0x0016:
                r1 = move-exception
                r1.printStackTrace()     // Catch:{ Exception -> 0x037b }
            L_0x001a:
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r1 = r1.f12943k     // Catch:{ Exception -> 0x037b }
                com.ironsource.c.a r2 = new com.ironsource.c.a     // Catch:{ Exception -> 0x037b }
                r2.<init>()     // Catch:{ Exception -> 0x037b }
                r3 = 0
                r4 = 0
                java.lang.String r5 = "userId"
                r6 = 1
                if (r1 == 0) goto L_0x0047
                if (r1 == 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x037b }
                if (r7 <= 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x037b }
                r8 = 64
                if (r7 > r8) goto L_0x003c
                r7 = 1
                goto L_0x003d
            L_0x003c:
                r7 = 0
            L_0x003d:
                if (r7 != 0) goto L_0x004e
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r3)     // Catch:{ Exception -> 0x037b }
            L_0x0043:
                r2.mo41202a((com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ Exception -> 0x037b }
                goto L_0x004e
            L_0x0047:
                java.lang.String r7 = "it's missing"
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r7)     // Catch:{ Exception -> 0x037b }
                goto L_0x0043
            L_0x004e:
                boolean r1 = r2.mo41203a()     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x005b
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = "userGenerated"
                r1.f12946n = r2     // Catch:{ Exception -> 0x037b }
                goto L_0x00a8
            L_0x005b:
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x037b }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = com.ironsource.mediationsdk.C5556E.m13258a((android.content.Context) r2)     // Catch:{ Exception -> 0x037b }
                r1.f12943k = r2     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r1 = r1.f12943k     // Catch:{ Exception -> 0x037b }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x037b }
                if (r1 != 0) goto L_0x007c
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = "GAID"
            L_0x0079:
                r1.f12946n = r2     // Catch:{ Exception -> 0x037b }
                goto L_0x00a1
            L_0x007c:
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x037b }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = com.ironsource.environment.C5527g.m13180y(r2)     // Catch:{ Exception -> 0x037b }
                r1.f12943k = r2     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r1 = r1.f12943k     // Catch:{ Exception -> 0x037b }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x037b }
                if (r1 != 0) goto L_0x009b
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = "UUID"
                goto L_0x0079
            L_0x009b:
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = ""
                r1.f12943k = r2     // Catch:{ Exception -> 0x037b }
            L_0x00a1:
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r1 = r1.f12943k     // Catch:{ Exception -> 0x037b }
                r0.mo41366a((java.lang.String) r1, (boolean) r4)     // Catch:{ Exception -> 0x037b }
            L_0x00a8:
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C5749e.m14210a()     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = "userIdType"
                com.ironsource.mediationsdk.I r4 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r4 = r4.f12946n     // Catch:{ Exception -> 0x037b }
                r1.mo42053a(r2, r4)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r1 = r1.f12943k     // Catch:{ Exception -> 0x037b }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x037b }
                if (r1 != 0) goto L_0x00ca
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C5749e.m14210a()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r2 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = r2.f12943k     // Catch:{ Exception -> 0x037b }
                r1.mo42053a(r5, r2)     // Catch:{ Exception -> 0x037b }
            L_0x00ca:
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r1 = r1.f12944l     // Catch:{ Exception -> 0x037b }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x037b }
                if (r1 != 0) goto L_0x00e1
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C5749e.m14210a()     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = "appKey"
                com.ironsource.mediationsdk.I r4 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r4 = r4.f12944l     // Catch:{ Exception -> 0x037b }
                r1.mo42053a(r2, r4)     // Catch:{ Exception -> 0x037b }
            L_0x00e1:
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.sdk.a.e r1 = r1.f12950r     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r2 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = r2.f12943k     // Catch:{ Exception -> 0x037b }
                r1.mo42156a((java.lang.String) r2)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x037b }
                r2.<init>()     // Catch:{ Exception -> 0x037b }
                long r4 = r2.getTime()     // Catch:{ Exception -> 0x037b }
                r1.f12949q = r4     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x037b }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r4 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.lang.String r4 = r4.f12943k     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.E$a r5 = r11.f12968c     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.j r2 = r0.mo41358a((android.content.Context) r2, (java.lang.String) r4, (com.ironsource.mediationsdk.C5556E.C5558a) r5)     // Catch:{ Exception -> 0x037b }
                r1.f12945m = r2     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.j r1 = r1.f12945m     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x02cc
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                android.os.Handler r1 = r1.f12940h     // Catch:{ Exception -> 0x037b }
                r1.removeCallbacks(r11)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.j r1 = r1.f12945m     // Catch:{ Exception -> 0x037b }
                boolean r1 = r1.mo42127a()     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x02a1
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I$a r2 = com.ironsource.mediationsdk.C5568I.C5572a.INITIATED     // Catch:{ Exception -> 0x037b }
                r1.mo41445a((com.ironsource.mediationsdk.C5568I.C5572a) r2)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                boolean r2 = r0.mo41392m()     // Catch:{ Exception -> 0x037b }
                r1.mo41448b(r2)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.sdk.a.e r1 = r1.f12950r     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r2 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.j r2 = r2.f12945m     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.i r2 = r2.f14083c     // Catch:{ Exception -> 0x037b }
                com.ironsource.sdk.g.d r2 = r2.f13748e     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.b r2 = r2.mo42556h()     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = r2.f13712a     // Catch:{ Exception -> 0x037b }
                r1.mo42158b(r2)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.sdk.a.e r1 = r1.f12950r     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r2 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.j r2 = r2.f12945m     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.i r2 = r2.f14083c     // Catch:{ Exception -> 0x037b }
                com.ironsource.sdk.g.d r2 = r2.f13748e     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.n r2 = r2.mo42551c()     // Catch:{ Exception -> 0x037b }
                org.json.JSONObject r2 = r2.f14119b     // Catch:{ Exception -> 0x037b }
                r1.mo42157a((org.json.JSONObject) r2)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.sdk.a.e r1 = r1.f12950r     // Catch:{ Exception -> 0x037b }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x037b }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x037b }
                boolean r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSession(r2)     // Catch:{ Exception -> 0x037b }
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x037b }
                r1.mo42155a((java.lang.Boolean) r2)     // Catch:{ Exception -> 0x037b }
                java.util.Date r1 = new java.util.Date     // Catch:{ Exception -> 0x037b }
                r1.<init>()     // Catch:{ Exception -> 0x037b }
                long r1 = r1.getTime()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r4 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                long r4 = r4.f12949q     // Catch:{ Exception -> 0x037b }
                long r1 = r1 - r4
                boolean r4 = r0.mo41392m()     // Catch:{ Exception -> 0x037b }
                org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch:{ Exception -> 0x037b }
                java.lang.String r5 = "duration"
                r4.put(r5, r1)     // Catch:{ Exception -> 0x019a }
                java.lang.String r1 = "sessionDepth"
                int r0 = r0.f12864t     // Catch:{ Exception -> 0x019a }
                r4.put(r1, r0)     // Catch:{ Exception -> 0x019a }
                goto L_0x019e
            L_0x019a:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ Exception -> 0x037b }
            L_0x019e:
                com.ironsource.mediationsdk.a.c r0 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x037b }
                r1 = 514(0x202, float:7.2E-43)
                r0.<init>(r1, r4)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.a.g r1 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ Exception -> 0x037b }
                r1.mo41689b((com.ironsource.mediationsdk.p137a.C5641c) r0)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.j r0 = r0.f12945m     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.i r0 = r0.f14083c     // Catch:{ Exception -> 0x037b }
                com.ironsource.sdk.g.d r0 = r0.f13748e     // Catch:{ Exception -> 0x037b }
                boolean r0 = r0.mo42552d()     // Catch:{ Exception -> 0x037b }
                if (r0 == 0) goto L_0x01cf
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x037b }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x037b }
                if (r0 == 0) goto L_0x01cf
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x037b }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(r0)     // Catch:{ Exception -> 0x037b }
            L_0x01cf:
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.j r0 = r0.f12945m     // Catch:{ Exception -> 0x037b }
                org.json.JSONObject r1 = r0.f14084d     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x0229
                com.ironsource.mediationsdk.model.i r1 = r0.f14083c     // Catch:{ Exception -> 0x037b }
                if (r1 != 0) goto L_0x01dc
                goto L_0x0229
            L_0x01dc:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x037b }
                r3.<init>()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.i r1 = r0.f14083c     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.q r1 = r1.f13744a     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x01fa
                com.ironsource.mediationsdk.model.o r1 = r0.f14011a     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x01fa
                com.ironsource.mediationsdk.model.o r1 = r0.f14011a     // Catch:{ Exception -> 0x037b }
                java.util.ArrayList<java.lang.String> r1 = r1.f13782a     // Catch:{ Exception -> 0x037b }
                int r1 = r1.size()     // Catch:{ Exception -> 0x037b }
                if (r1 <= 0) goto L_0x01fa
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ Exception -> 0x037b }
                r3.add(r1)     // Catch:{ Exception -> 0x037b }
            L_0x01fa:
                com.ironsource.mediationsdk.model.i r1 = r0.f14083c     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.j r1 = r1.f13745b     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x0213
                com.ironsource.mediationsdk.model.o r1 = r0.f14011a     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x0213
                com.ironsource.mediationsdk.model.o r1 = r0.f14011a     // Catch:{ Exception -> 0x037b }
                java.util.ArrayList<java.lang.String> r1 = r1.f13785d     // Catch:{ Exception -> 0x037b }
                int r1 = r1.size()     // Catch:{ Exception -> 0x037b }
                if (r1 <= 0) goto L_0x0213
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ Exception -> 0x037b }
                r3.add(r1)     // Catch:{ Exception -> 0x037b }
            L_0x0213:
                com.ironsource.mediationsdk.model.i r1 = r0.f14083c     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.k r1 = r1.f13746c     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x021e
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ Exception -> 0x037b }
                r3.add(r1)     // Catch:{ Exception -> 0x037b }
            L_0x021e:
                com.ironsource.mediationsdk.model.i r0 = r0.f14083c     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.g r0 = r0.f13747d     // Catch:{ Exception -> 0x037b }
                if (r0 == 0) goto L_0x0229
                com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x037b }
                r3.add(r0)     // Catch:{ Exception -> 0x037b }
            L_0x0229:
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f12942j     // Catch:{ Exception -> 0x037b }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x037b }
            L_0x0231:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x024b
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C5799i) r1     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r2 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                boolean r2 = r2.f12938f     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r4 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.j r4 = r4.f12945m     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.i r4 = r4.f14083c     // Catch:{ Exception -> 0x037b }
                r1.mo41327a(r3, r2, r4)     // Catch:{ Exception -> 0x037b }
                goto L_0x0231
            L_0x024b:
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.sdk.SegmentListener r0 = r0.f12947o     // Catch:{ Exception -> 0x037b }
                if (r0 == 0) goto L_0x0270
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.j r0 = r0.f12945m     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.i r0 = r0.f14083c     // Catch:{ Exception -> 0x037b }
                com.ironsource.sdk.g.d r0 = r0.f13748e     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.r r0 = r0.mo42550b()     // Catch:{ Exception -> 0x037b }
                if (r0 == 0) goto L_0x0270
                java.lang.String r1 = r0.f13802a     // Catch:{ Exception -> 0x037b }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x037b }
                if (r1 != 0) goto L_0x0270
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.sdk.SegmentListener r1 = r1.f12947o     // Catch:{ Exception -> 0x037b }
                java.lang.String r0 = r0.f13802a     // Catch:{ Exception -> 0x037b }
                r1.onSegmentReceived(r0)     // Catch:{ Exception -> 0x037b }
            L_0x0270:
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.j r0 = r0.f12945m     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.i r0 = r0.f14083c     // Catch:{ Exception -> 0x037b }
                com.ironsource.sdk.g.d r0 = r0.f13748e     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.model.c r0 = r0.mo42553e()     // Catch:{ Exception -> 0x037b }
                boolean r1 = r0.f13713a     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x037f
                java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()     // Catch:{ Exception -> 0x037b }
                com.ironsource.environment.e r2 = com.ironsource.environment.C5521e.m13114a()     // Catch:{ Exception -> 0x037b }
                com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x037b }
                android.content.Context r3 = r1.getApplicationContext()     // Catch:{ Exception -> 0x037b }
                java.util.HashSet<java.lang.String> r4 = r0.f13714b     // Catch:{ Exception -> 0x037b }
                java.lang.String r5 = r0.f13715c     // Catch:{ Exception -> 0x037b }
                java.lang.String r6 = r0.f13716d     // Catch:{ Exception -> 0x037b }
                boolean r7 = r0.f13717e     // Catch:{ Exception -> 0x037b }
                int r9 = r0.f13718f     // Catch:{ Exception -> 0x037b }
                boolean r10 = r0.f13719g     // Catch:{ Exception -> 0x037b }
                r2.mo41246a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x037b }
                goto L_0x037f
            L_0x02a1:
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                boolean r0 = r0.f12939g     // Catch:{ Exception -> 0x037b }
                if (r0 != 0) goto L_0x037a
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I$a r1 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_FAILED     // Catch:{ Exception -> 0x037b }
                r0.mo41445a((com.ironsource.mediationsdk.C5568I.C5572a) r1)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                r0.f12939g = r6     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f12942j     // Catch:{ Exception -> 0x037b }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x037b }
            L_0x02ba:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x037f
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C5799i) r1     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = "serverResponseIsNotValid"
                r1.mo41325a(r2)     // Catch:{ Exception -> 0x037b }
                goto L_0x02ba
            L_0x02cc:
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                int r0 = r0.f12934b     // Catch:{ Exception -> 0x037b }
                r1 = 3
                if (r0 != r1) goto L_0x02ef
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                r0.f12948p = r6     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f12942j     // Catch:{ Exception -> 0x037b }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x037b }
            L_0x02df:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x02ef
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C5799i) r1     // Catch:{ Exception -> 0x037b }
                r1.mo41336f()     // Catch:{ Exception -> 0x037b }
                goto L_0x02df
            L_0x02ef:
                boolean r0 = r11.f12966a     // Catch:{ Exception -> 0x037b }
                if (r0 == 0) goto L_0x0323
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                int r0 = r0.f12934b     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                int r1 = r1.f12935c     // Catch:{ Exception -> 0x037b }
                if (r0 >= r1) goto L_0x0323
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                r0.f12938f = r6     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                android.os.Handler r0 = r0.f12940h     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                int r1 = r1.f12933a     // Catch:{ Exception -> 0x037b }
                int r1 = r1 * 1000
                long r1 = (long) r1     // Catch:{ Exception -> 0x037b }
                r0.postDelayed(r11, r1)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                int r0 = r0.f12934b     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                int r1 = r1.f12936d     // Catch:{ Exception -> 0x037b }
                if (r0 >= r1) goto L_0x0323
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                int r1 = r1.f12933a     // Catch:{ Exception -> 0x037b }
                int r1 = r1 * 2
                r0.f12933a = r1     // Catch:{ Exception -> 0x037b }
            L_0x0323:
                boolean r0 = r11.f12966a     // Catch:{ Exception -> 0x037b }
                if (r0 == 0) goto L_0x0331
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                int r0 = r0.f12934b     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                int r1 = r1.f12937e     // Catch:{ Exception -> 0x037b }
                if (r0 != r1) goto L_0x0373
            L_0x0331:
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                boolean r0 = r0.f12939g     // Catch:{ Exception -> 0x037b }
                if (r0 != 0) goto L_0x0373
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                r0.f12939g = r6     // Catch:{ Exception -> 0x037b }
                java.lang.String r0 = r11.f12967b     // Catch:{ Exception -> 0x037b }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x037b }
                if (r0 == 0) goto L_0x0347
                java.lang.String r0 = "noServerResponse"
                r11.f12967b = r0     // Catch:{ Exception -> 0x037b }
            L_0x0347:
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f12942j     // Catch:{ Exception -> 0x037b }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x037b }
            L_0x034f:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x037b }
                if (r1 == 0) goto L_0x0361
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C5799i) r1     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = r11.f12967b     // Catch:{ Exception -> 0x037b }
                r1.mo41325a(r2)     // Catch:{ Exception -> 0x037b }
                goto L_0x034f
            L_0x0361:
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.I$a r1 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_FAILED     // Catch:{ Exception -> 0x037b }
                r0.mo41445a((com.ironsource.mediationsdk.C5568I.C5572a) r1)     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ Exception -> 0x037b }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x037b }
                java.lang.String r2 = "Mediation availability false reason: No server response"
                r0.log(r1, r2, r6)     // Catch:{ Exception -> 0x037b }
            L_0x0373:
                com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.this     // Catch:{ Exception -> 0x037b }
                int r1 = r0.f12934b     // Catch:{ Exception -> 0x037b }
                int r1 = r1 + r6
                r0.f12934b = r1     // Catch:{ Exception -> 0x037b }
            L_0x037a:
                return
            L_0x037b:
                r0 = move-exception
                r0.printStackTrace()
            L_0x037f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5568I.C55691.run():void");
        }
    };

    /* renamed from: a */
    int f12933a;

    /* renamed from: b */
    int f12934b;

    /* renamed from: c */
    int f12935c;

    /* renamed from: d */
    int f12936d;

    /* renamed from: e */
    int f12937e;

    /* renamed from: f */
    boolean f12938f;

    /* renamed from: g */
    boolean f12939g = false;

    /* renamed from: h */
    Handler f12940h;

    /* renamed from: i */
    CountDownTimer f12941i;

    /* renamed from: j */
    List<C5799i> f12942j = new ArrayList();

    /* renamed from: k */
    String f12943k;

    /* renamed from: l */
    String f12944l;

    /* renamed from: m */
    C5800j f12945m;

    /* renamed from: n */
    String f12946n;

    /* renamed from: o */
    SegmentListener f12947o;

    /* renamed from: p */
    boolean f12948p;

    /* renamed from: q */
    long f12949q;

    /* renamed from: r */
    C5826e f12950r;

    /* renamed from: t */
    private final String f12951t = "appKey";

    /* renamed from: u */
    private final String f12952u = getClass().getSimpleName();

    /* renamed from: v */
    private HandlerThread f12953v = null;

    /* renamed from: w */
    private boolean f12954w = false;

    /* renamed from: x */
    private AtomicBoolean f12955x;

    /* renamed from: y */
    private NetworkStateReceiver f12956y;

    /* renamed from: z */
    private C5572a f12957z = C5572a.NOT_INIT;

    /* renamed from: com.ironsource.mediationsdk.I$a */
    enum C5572a {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* renamed from: com.ironsource.mediationsdk.I$b */
    abstract class C5573b implements Runnable {

        /* renamed from: a */
        boolean f12966a = true;

        /* renamed from: b */
        String f12967b;

        /* renamed from: c */
        protected C5556E.C5558a f12968c = new C5556E.C5558a() {
            /* renamed from: a */
            public final void mo41396a(String str) {
                C5573b.this.f12966a = false;
                C5573b.this.f12967b = str;
            }
        };

        C5573b() {
        }
    }

    private C5568I() {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        this.f12953v = handlerThread;
        handlerThread.start();
        this.f12940h = new Handler(this.f12953v.getLooper());
        this.f12933a = 1;
        this.f12934b = 0;
        this.f12935c = 62;
        this.f12936d = 12;
        this.f12937e = 5;
        this.f12955x = new AtomicBoolean(true);
        this.f12938f = false;
        this.f12948p = false;
        this.f12950r = new C5826e();
    }

    /* renamed from: a */
    public static synchronized C5568I m13411a() {
        C5568I i;
        synchronized (C5568I.class) {
            if (f12931s == null) {
                f12931s = new C5568I();
            }
            i = f12931s;
        }
        return i;
    }

    /* renamed from: a */
    public final synchronized void mo41444a(Context context, String str, String str2) {
        Handler handler;
        Runnable r5;
        try {
            if (this.f12955x == null || !this.f12955x.compareAndSet(true, false)) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                logger.log(ironSourceTag, this.f12952u + ": Multiple calls to init are not allowed", 2);
                return;
            }
            mo41445a(C5572a.INIT_IN_PROGRESS);
            this.f12943k = str2;
            this.f12944l = str;
            if (IronSourceUtils.isNetworkConnected(context)) {
                handler = this.f12940h;
                r5 = this.f12932A;
            } else {
                this.f12954w = true;
                if (this.f12956y == null) {
                    this.f12956y = new NetworkStateReceiver(context, this);
                }
                context.registerReceiver(this.f12956y, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                handler = new Handler(Looper.getMainLooper());
                r5 = new Runnable() {
                    public final void run() {
                        C5568I.this.f12941i = new CountDownTimer(60000, MBInterstitialActivity.WEB_LOAD_TIME) {
                            public final void onFinish() {
                                if (!C5568I.this.f12939g) {
                                    C5568I.this.f12939g = true;
                                    for (C5799i a : C5568I.this.f12942j) {
                                        a.mo41325a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                                    }
                                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                                }
                            }

                            public final void onTick(long j) {
                                if (j <= 45000) {
                                    C5568I.this.f12948p = true;
                                    for (C5799i f : C5568I.this.f12942j) {
                                        f.mo41336f();
                                    }
                                }
                            }
                        }.start();
                    }
                };
            }
            handler.post(r5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo41445a(C5572a aVar) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setInitStatus(old status: " + this.f12957z + ", new status: " + aVar + ")", 0);
        this.f12957z = aVar;
    }

    /* renamed from: a */
    public final void mo41446a(C5799i iVar) {
        if (iVar != null) {
            this.f12942j.add(iVar);
        }
    }

    /* renamed from: a */
    public final void mo41252a(boolean z) {
        if (this.f12954w && z) {
            CountDownTimer countDownTimer = this.f12941i;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f12954w = false;
            this.f12938f = true;
            this.f12940h.post(this.f12932A);
        }
    }

    /* renamed from: b */
    public final synchronized C5572a mo41447b() {
        return this.f12957z;
    }

    /* renamed from: b */
    public final void mo41448b(boolean z) {
        Map<String, String> map;
        if (z && TextUtils.isEmpty(C5556E.m13257a().f12859o) && (map = this.f12945m.f14083c.f13748e.mo42555g().f13732a) != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                if (IronSourceUtils.doesClassExist(next)) {
                    String str = map.get(next);
                    if (!TextUtils.isEmpty(str)) {
                        next = str;
                    }
                    C5556E.m13257a().mo41375d(next);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo41449c() {
        return this.f12948p;
    }
}
