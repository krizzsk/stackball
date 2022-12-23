package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6158p;
import com.mbridge.msdk.foundation.same.p168c.C6219c;
import com.mbridge.msdk.foundation.same.report.C6305b;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.p206b.C6531a;
import com.mbridge.msdk.mbsignalcommon.p206b.C6532b;
import com.mbridge.msdk.mbsignalcommon.windvane.C6557a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.reward.p209a.C6738a;
import com.mbridge.msdk.reward.p210b.C6801a;
import com.mbridge.msdk.video.p214bt.module.p217b.C6914a;
import com.mbridge.msdk.video.p214bt.module.p217b.C6921g;
import com.mbridge.msdk.video.p214bt.p215a.C6877c;
import com.mbridge.msdk.video.signal.p235a.C7062j;
import com.mbridge.msdk.videocommon.C7165a;
import com.mbridge.msdk.videocommon.download.C7184c;
import com.mbridge.msdk.videocommon.download.C7191g;
import com.mbridge.msdk.videocommon.download.C7203i;
import com.mbridge.msdk.videocommon.listener.C7212a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.adapter.c */
/* compiled from: RewardCampaignsResourceManager */
public final class C6759c {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Map<String, C6764a> f16524c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6771h f16525a;

    /* renamed from: b */
    private ConcurrentHashMap<String, List<CampaignEx>> f16526b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f16527d;

    /* renamed from: e */
    private volatile List<WindVaneWebView> f16528e;

    /* renamed from: com.mbridge.msdk.reward.adapter.c$c */
    /* compiled from: RewardCampaignsResourceManager */
    public interface C6766c {
        /* renamed from: a */
        void mo46991a(String str, String str2, String str3, List<CampaignEx> list);

        /* renamed from: a */
        void mo46992a(String str, String str2, String str3, List<CampaignEx> list, String str4);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$i */
    /* compiled from: RewardCampaignsResourceManager */
    public interface C6772i {
        /* renamed from: a */
        void mo46997a(String str, String str2, String str3, String str4);

        /* renamed from: a */
        void mo46998a(String str, String str2, String str3, String str4, String str5);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$j */
    /* compiled from: RewardCampaignsResourceManager */
    public interface C6773j {
        /* renamed from: a */
        void mo46994a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar);

        /* renamed from: a */
        void mo46995a(String str, String str2, String str3, String str4, String str5, C7165a.C7166a aVar, String str6);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$m */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C6778m {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6759c f16661a = new C6759c();
    }

    private C6759c() {
        this.f16528e = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f16524c = new HashMap();
        handlerThread.start();
        this.f16525a = new C6771h(handlerThread.getLooper());
        this.f16526b = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public static C6759c m17019a() {
        return C6778m.f16661a;
    }

    /* renamed from: a */
    public final synchronized void mo47016a(Context context, boolean z, int i, boolean z2, int i2, String str, String str2, String str3, List<CampaignEx> list, C6766c cVar, C6772i iVar) {
        String str4 = str2;
        String str5 = str3;
        synchronized (this) {
            String str6 = str4 + "_" + str5;
            f16524c.put(str6, new C6764a(z, z2, i, list.size(), str2, str3, i2, list));
            this.f16525a.mo47028a(str, str4, str5, cVar);
            this.f16525a.mo47027a(context);
            this.f16525a.mo47029a(str6, list);
            final List<CampaignEx> list2 = list;
            final Context context2 = context;
            final String str7 = str2;
            final int i3 = i2;
            final String str8 = str;
            final String str9 = str3;
            final C6772i iVar2 = iVar;
            this.f16525a.post(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:100:0x0252  */
                /* JADX WARNING: Removed duplicated region for block: B:144:0x0338 A[SYNTHETIC] */
                /* JADX WARNING: Removed duplicated region for block: B:54:0x012d  */
                /* JADX WARNING: Removed duplicated region for block: B:77:0x01c4  */
                /* JADX WARNING: Removed duplicated region for block: B:85:0x01f2 A[SYNTHETIC, Splitter:B:85:0x01f2] */
                /* JADX WARNING: Removed duplicated region for block: B:93:0x0226 A[SYNTHETIC, Splitter:B:93:0x0226] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r21 = this;
                        r1 = r21
                        java.lang.String r2 = "RewardCampaignsResourceManager"
                        java.util.List r0 = r3
                        if (r0 == 0) goto L_0x033c
                        int r0 = r0.size()
                        if (r0 <= 0) goto L_0x033c
                        com.mbridge.msdk.videocommon.download.i r0 = com.mbridge.msdk.videocommon.download.C7203i.m18311a()     // Catch:{ Exception -> 0x0041 }
                        java.util.List r3 = r3     // Catch:{ Exception -> 0x0041 }
                        r0.mo49227a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r3)     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.videocommon.download.c r4 = com.mbridge.msdk.videocommon.download.C7184c.getInstance()     // Catch:{ Exception -> 0x0041 }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r6 = r5     // Catch:{ Exception -> 0x0041 }
                        java.util.List r7 = r3     // Catch:{ Exception -> 0x0041 }
                        int r8 = r6     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.reward.adapter.c$f r9 = new com.mbridge.msdk.reward.adapter.c$f     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.reward.adapter.c r0 = com.mbridge.msdk.reward.adapter.C6759c.this     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.reward.adapter.c$h r0 = r0.f16525a     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r3 = r7     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r10 = r5     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r11 = r8     // Catch:{ Exception -> 0x0041 }
                        r9.<init>(r0, r3, r10, r11)     // Catch:{ Exception -> 0x0041 }
                        r4.createUnitCache((android.content.Context) r5, (java.lang.String) r6, (java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r7, (int) r8, (com.mbridge.msdk.videocommon.listener.C7212a) r9)     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C7184c.getInstance()     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r3 = r5     // Catch:{ Exception -> 0x0041 }
                        r0.load(r3)     // Catch:{ Exception -> 0x0041 }
                        goto L_0x004d
                    L_0x0041:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x004d
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
                    L_0x004d:
                        java.util.List r0 = r3
                        java.util.Iterator r3 = r0.iterator()
                    L_0x0053:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L_0x033c
                        java.lang.Object r0 = r3.next()
                        r14 = r0
                        com.mbridge.msdk.foundation.entity.CampaignEx r14 = (com.mbridge.msdk.foundation.entity.CampaignEx) r14
                        com.mbridge.msdk.foundation.entity.CampaignEx$c r15 = r14.getRewardTemplateMode()
                        java.lang.String r13 = ".zip"
                        if (r15 == 0) goto L_0x0108
                        java.lang.String r0 = r14.getMof_template_url()
                        boolean r0 = com.mbridge.msdk.foundation.tools.C6366u.m16221f((java.lang.String) r0)
                        if (r0 != 0) goto L_0x0108
                        java.lang.String r0 = r15.mo43510d()
                        boolean r4 = android.text.TextUtils.isEmpty(r0)
                        if (r4 != 0) goto L_0x0108
                        boolean r4 = r0.contains(r13)
                        if (r4 == 0) goto L_0x00cc
                        com.mbridge.msdk.videocommon.download.g r12 = com.mbridge.msdk.videocommon.download.C7191g.m18286a()     // Catch:{ Exception -> 0x00bc }
                        com.mbridge.msdk.reward.adapter.c$g r11 = new com.mbridge.msdk.reward.adapter.c$g     // Catch:{ Exception -> 0x00bc }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x00bc }
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x00bc }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x00bc }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x00bc }
                        r10 = 859(0x35b, float:1.204E-42)
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C6759c.this     // Catch:{ Exception -> 0x00bc }
                        com.mbridge.msdk.reward.adapter.c$h r16 = r4.f16525a     // Catch:{ Exception -> 0x00bc }
                        com.mbridge.msdk.reward.adapter.c$i r9 = r9     // Catch:{ Exception -> 0x00bc }
                        java.util.List r4 = r3     // Catch:{ Exception -> 0x00bc }
                        r17 = r4
                        r4 = r11
                        r18 = r9
                        r9 = r14
                        r19 = r11
                        r11 = r16
                        r20 = r12
                        r12 = r18
                        r16 = r3
                        r3 = r13
                        r13 = r17
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00ba }
                        r5 = r19
                        r4 = r20
                        r4.mo49221b(r0, r5)     // Catch:{ Exception -> 0x00ba }
                        goto L_0x010b
                    L_0x00ba:
                        r0 = move-exception
                        goto L_0x00c0
                    L_0x00bc:
                        r0 = move-exception
                        r16 = r3
                        r3 = r13
                    L_0x00c0:
                        boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r4 == 0) goto L_0x010b
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
                        goto L_0x010b
                    L_0x00cc:
                        r16 = r3
                        r3 = r13
                        com.mbridge.msdk.videocommon.download.g r13 = com.mbridge.msdk.videocommon.download.C7191g.m18286a()     // Catch:{ Exception -> 0x00f9 }
                        com.mbridge.msdk.reward.adapter.c$d r12 = new com.mbridge.msdk.reward.adapter.c$d     // Catch:{ Exception -> 0x00f9 }
                        r5 = 859(0x35b, float:1.204E-42)
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x00f9 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x00f9 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x00f9 }
                        com.mbridge.msdk.reward.adapter.c$i r10 = r9     // Catch:{ Exception -> 0x00f9 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C6759c.this     // Catch:{ Exception -> 0x00f9 }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f16525a     // Catch:{ Exception -> 0x00f9 }
                        java.util.List r9 = r3     // Catch:{ Exception -> 0x00f9 }
                        r4 = r12
                        r17 = r9
                        r9 = r14
                        r18 = r15
                        r15 = r12
                        r12 = r17
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00f7 }
                        r13.mo49221b(r0, r15)     // Catch:{ Exception -> 0x00f7 }
                        goto L_0x010d
                    L_0x00f7:
                        r0 = move-exception
                        goto L_0x00fc
                    L_0x00f9:
                        r0 = move-exception
                        r18 = r15
                    L_0x00fc:
                        boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r4 == 0) goto L_0x010d
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
                        goto L_0x010d
                    L_0x0108:
                        r16 = r3
                        r3 = r13
                    L_0x010b:
                        r18 = r15
                    L_0x010d:
                        java.lang.String r0 = r14.getendcard_url()
                        boolean r4 = android.text.TextUtils.isEmpty(r0)
                        if (r4 != 0) goto L_0x01c4
                        java.lang.String r4 = r14.getMof_template_url()
                        boolean r4 = com.mbridge.msdk.foundation.tools.C6366u.m16221f((java.lang.String) r4)
                        if (r4 != 0) goto L_0x01c4
                        boolean r4 = android.text.TextUtils.isEmpty(r0)
                        if (r4 != 0) goto L_0x01c4
                        boolean r4 = r14.isMraid()
                        if (r4 != 0) goto L_0x01c4
                        boolean r4 = r0.contains(r3)
                        if (r4 == 0) goto L_0x0185
                        java.lang.String r4 = "md5filename"
                        boolean r4 = r0.contains(r4)
                        if (r4 == 0) goto L_0x0185
                        com.mbridge.msdk.videocommon.download.g r4 = com.mbridge.msdk.videocommon.download.C7191g.m18286a()
                        java.lang.String r4 = r4.mo49220b((java.lang.String) r0)
                        boolean r15 = android.text.TextUtils.isEmpty(r4)
                        com.mbridge.msdk.reward.adapter.c$g r13 = new com.mbridge.msdk.reward.adapter.c$g     // Catch:{ Exception -> 0x0176 }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x0176 }
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x0176 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x0176 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x0176 }
                        r10 = 497(0x1f1, float:6.96E-43)
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C6759c.this     // Catch:{ Exception -> 0x0176 }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f16525a     // Catch:{ Exception -> 0x0176 }
                        com.mbridge.msdk.reward.adapter.c$i r12 = r9     // Catch:{ Exception -> 0x0176 }
                        java.util.List r9 = r3     // Catch:{ Exception -> 0x0176 }
                        r4 = r13
                        r17 = r9
                        r9 = r14
                        r19 = r3
                        r3 = r13
                        r13 = r17
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0174 }
                        r3.mo47026a((boolean) r15)     // Catch:{ Exception -> 0x0174 }
                        com.mbridge.msdk.videocommon.download.g r4 = com.mbridge.msdk.videocommon.download.C7191g.m18286a()     // Catch:{ Exception -> 0x0174 }
                        r4.mo49221b(r0, r3)     // Catch:{ Exception -> 0x0174 }
                        goto L_0x01c6
                    L_0x0174:
                        r0 = move-exception
                        goto L_0x0179
                    L_0x0176:
                        r0 = move-exception
                        r19 = r3
                    L_0x0179:
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x01c6
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
                        goto L_0x01c6
                    L_0x0185:
                        r19 = r3
                        com.mbridge.msdk.videocommon.download.h r3 = com.mbridge.msdk.videocommon.download.C7200h.m18303a()
                        java.lang.String r3 = r3.mo49224b(r0)
                        boolean r3 = android.text.TextUtils.isEmpty(r3)
                        com.mbridge.msdk.reward.adapter.c$d r13 = new com.mbridge.msdk.reward.adapter.c$d     // Catch:{ Exception -> 0x01b7 }
                        r5 = 497(0x1f1, float:6.96E-43)
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x01b7 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x01b7 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x01b7 }
                        com.mbridge.msdk.reward.adapter.c$i r10 = r9     // Catch:{ Exception -> 0x01b7 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C6759c.this     // Catch:{ Exception -> 0x01b7 }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f16525a     // Catch:{ Exception -> 0x01b7 }
                        java.util.List r12 = r3     // Catch:{ Exception -> 0x01b7 }
                        r4 = r13
                        r9 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x01b7 }
                        r13.mo47023a((boolean) r3)     // Catch:{ Exception -> 0x01b7 }
                        com.mbridge.msdk.videocommon.download.g r3 = com.mbridge.msdk.videocommon.download.C7191g.m18286a()     // Catch:{ Exception -> 0x01b7 }
                        r3.mo49221b(r0, r13)     // Catch:{ Exception -> 0x01b7 }
                        goto L_0x01c6
                    L_0x01b7:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x01c6
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
                        goto L_0x01c6
                    L_0x01c4:
                        r19 = r3
                    L_0x01c6:
                        java.lang.String r0 = r14.getEndScreenUrl()
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 != 0) goto L_0x01e8
                        java.lang.String r0 = r14.getMof_template_url()
                        boolean r0 = com.mbridge.msdk.foundation.tools.C6366u.m16221f((java.lang.String) r0)
                        if (r0 != 0) goto L_0x01e8
                        com.mbridge.msdk.videocommon.download.g r0 = com.mbridge.msdk.videocommon.download.C7191g.m18286a()
                        java.lang.String r3 = r14.getEndScreenUrl()
                        r4 = 0
                        com.mbridge.msdk.videocommon.download.g$b r4 = (com.mbridge.msdk.videocommon.download.C7191g.C7197b) r4
                        r0.mo49219a(r3, r4)
                    L_0x01e8:
                        java.lang.String r0 = r14.getIconUrl()
                        boolean r3 = android.text.TextUtils.isEmpty(r0)
                        if (r3 != 0) goto L_0x021c
                        android.content.Context r3 = r4     // Catch:{ Exception -> 0x0210 }
                        com.mbridge.msdk.foundation.same.c.b r3 = com.mbridge.msdk.foundation.same.p168c.C6216b.m15729a((android.content.Context) r3)     // Catch:{ Exception -> 0x0210 }
                        com.mbridge.msdk.reward.adapter.c$e r11 = new com.mbridge.msdk.reward.adapter.c$e     // Catch:{ Exception -> 0x0210 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C6759c.this     // Catch:{ Exception -> 0x0210 }
                        com.mbridge.msdk.reward.adapter.c$h r5 = r4.f16525a     // Catch:{ Exception -> 0x0210 }
                        r6 = 0
                        java.lang.String r7 = r7     // Catch:{ Exception -> 0x0210 }
                        java.lang.String r8 = r5     // Catch:{ Exception -> 0x0210 }
                        java.lang.String r9 = r8     // Catch:{ Exception -> 0x0210 }
                        r4 = r11
                        r10 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0210 }
                        r3.mo43786a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p168c.C6219c) r11)     // Catch:{ Exception -> 0x0210 }
                        goto L_0x021c
                    L_0x0210:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x021c
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
                    L_0x021c:
                        java.lang.String r0 = r14.getImageUrl()
                        boolean r3 = android.text.TextUtils.isEmpty(r0)
                        if (r3 != 0) goto L_0x0250
                        android.content.Context r3 = r4     // Catch:{ Exception -> 0x0244 }
                        com.mbridge.msdk.foundation.same.c.b r3 = com.mbridge.msdk.foundation.same.p168c.C6216b.m15729a((android.content.Context) r3)     // Catch:{ Exception -> 0x0244 }
                        com.mbridge.msdk.reward.adapter.c$e r11 = new com.mbridge.msdk.reward.adapter.c$e     // Catch:{ Exception -> 0x0244 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C6759c.this     // Catch:{ Exception -> 0x0244 }
                        com.mbridge.msdk.reward.adapter.c$h r5 = r4.f16525a     // Catch:{ Exception -> 0x0244 }
                        r6 = 0
                        java.lang.String r7 = r7     // Catch:{ Exception -> 0x0244 }
                        java.lang.String r8 = r5     // Catch:{ Exception -> 0x0244 }
                        java.lang.String r9 = r8     // Catch:{ Exception -> 0x0244 }
                        r4 = r11
                        r10 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0244 }
                        r3.mo43786a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p168c.C6219c) r11)     // Catch:{ Exception -> 0x0244 }
                        goto L_0x0250
                    L_0x0244:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x0250
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
                    L_0x0250:
                        if (r18 == 0) goto L_0x0338
                        java.lang.String r0 = r18.mo43509c()
                        boolean r3 = android.text.TextUtils.isEmpty(r0)
                        if (r3 != 0) goto L_0x02cb
                        java.lang.String r3 = r14.getMof_template_url()
                        boolean r3 = com.mbridge.msdk.foundation.tools.C6366u.m16221f((java.lang.String) r3)
                        if (r3 != 0) goto L_0x02cb
                        r3 = r19
                        boolean r3 = r0.contains(r3)
                        if (r3 == 0) goto L_0x029e
                        com.mbridge.msdk.videocommon.download.g r3 = com.mbridge.msdk.videocommon.download.C7191g.m18286a()     // Catch:{ Exception -> 0x0291 }
                        com.mbridge.msdk.reward.adapter.c$g r15 = new com.mbridge.msdk.reward.adapter.c$g     // Catch:{ Exception -> 0x0291 }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x0291 }
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x0291 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x0291 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x0291 }
                        r10 = 313(0x139, float:4.39E-43)
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C6759c.this     // Catch:{ Exception -> 0x0291 }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f16525a     // Catch:{ Exception -> 0x0291 }
                        com.mbridge.msdk.reward.adapter.c$i r12 = r9     // Catch:{ Exception -> 0x0291 }
                        java.util.List r13 = r3     // Catch:{ Exception -> 0x0291 }
                        r4 = r15
                        r9 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0291 }
                        r3.mo49221b(r0, r15)     // Catch:{ Exception -> 0x0291 }
                        goto L_0x02cb
                    L_0x0291:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x02cb
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
                        goto L_0x02cb
                    L_0x029e:
                        com.mbridge.msdk.videocommon.download.g r3 = com.mbridge.msdk.videocommon.download.C7191g.m18286a()     // Catch:{ Exception -> 0x02bf }
                        com.mbridge.msdk.reward.adapter.c$d r13 = new com.mbridge.msdk.reward.adapter.c$d     // Catch:{ Exception -> 0x02bf }
                        r5 = 313(0x139, float:4.39E-43)
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x02bf }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x02bf }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x02bf }
                        com.mbridge.msdk.reward.adapter.c$i r10 = r9     // Catch:{ Exception -> 0x02bf }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C6759c.this     // Catch:{ Exception -> 0x02bf }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f16525a     // Catch:{ Exception -> 0x02bf }
                        java.util.List r12 = r3     // Catch:{ Exception -> 0x02bf }
                        r4 = r13
                        r9 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x02bf }
                        r3.mo49221b(r0, r13)     // Catch:{ Exception -> 0x02bf }
                        goto L_0x02cb
                    L_0x02bf:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x02cb
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
                    L_0x02cb:
                        java.util.List r0 = r18.mo43511e()
                        if (r0 == 0) goto L_0x0338
                        int r3 = r0.size()
                        if (r3 <= 0) goto L_0x0338
                        java.util.Iterator r3 = r0.iterator()
                    L_0x02db:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L_0x0338
                        java.lang.Object r0 = r3.next()
                        com.mbridge.msdk.foundation.entity.CampaignEx$c$a r0 = (com.mbridge.msdk.foundation.entity.CampaignEx.C6189c.C6190a) r0
                        if (r0 == 0) goto L_0x02db
                        java.util.List<java.lang.String> r4 = r0.f15267b
                        if (r4 == 0) goto L_0x02db
                        java.util.List<java.lang.String> r4 = r0.f15267b
                        int r4 = r4.size()
                        if (r4 <= 0) goto L_0x02db
                        java.util.List<java.lang.String> r0 = r0.f15267b
                        java.util.Iterator r11 = r0.iterator()
                    L_0x02fb:
                        boolean r0 = r11.hasNext()
                        if (r0 == 0) goto L_0x02db
                        java.lang.Object r0 = r11.next()
                        java.lang.String r0 = (java.lang.String) r0
                        boolean r4 = android.text.TextUtils.isEmpty(r0)
                        if (r4 != 0) goto L_0x02fb
                        android.content.Context r4 = r4     // Catch:{ Exception -> 0x032b }
                        com.mbridge.msdk.foundation.same.c.b r12 = com.mbridge.msdk.foundation.same.p168c.C6216b.m15729a((android.content.Context) r4)     // Catch:{ Exception -> 0x032b }
                        com.mbridge.msdk.reward.adapter.c$e r13 = new com.mbridge.msdk.reward.adapter.c$e     // Catch:{ Exception -> 0x032b }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C6759c.this     // Catch:{ Exception -> 0x032b }
                        com.mbridge.msdk.reward.adapter.c$h r5 = r4.f16525a     // Catch:{ Exception -> 0x032b }
                        r6 = 1
                        java.lang.String r7 = r7     // Catch:{ Exception -> 0x032b }
                        java.lang.String r8 = r5     // Catch:{ Exception -> 0x032b }
                        java.lang.String r9 = r8     // Catch:{ Exception -> 0x032b }
                        r4 = r13
                        r10 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x032b }
                        r12.mo43786a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p168c.C6219c) r13)     // Catch:{ Exception -> 0x032b }
                        goto L_0x02fb
                    L_0x032b:
                        r0 = move-exception
                        boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r4 == 0) goto L_0x02fb
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)
                        goto L_0x02fb
                    L_0x0338:
                        r3 = r16
                        goto L_0x0053
                    L_0x033c:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C6759c.C67601.run():void");
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo47015a(android.content.Context r14, com.mbridge.msdk.foundation.entity.CampaignEx r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.mbridge.msdk.reward.adapter.C6759c.C6772i r19) {
        /*
            r13 = this;
            r9 = r13
            r0 = r16
            r3 = r17
            r5 = r18
            r6 = r19
            monitor-enter(r13)
            com.mbridge.msdk.reward.adapter.c$h r1 = r9.f16525a     // Catch:{ all -> 0x008d }
            r7 = r14
            r1.mo47027a(r14)     // Catch:{ all -> 0x008d }
            if (r15 == 0) goto L_0x0054
            java.lang.String r1 = r15.getMof_template_url()     // Catch:{ all -> 0x008d }
            boolean r2 = com.mbridge.msdk.foundation.tools.C6366u.m16221f((java.lang.String) r1)     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0054
            com.mbridge.msdk.videocommon.download.i r2 = com.mbridge.msdk.videocommon.download.C7203i.m18311a()     // Catch:{ all -> 0x008d }
            r4 = 1
            r2.mo49229b(r1, r4)     // Catch:{ all -> 0x008d }
            android.os.Message r2 = android.os.Message.obtain()     // Catch:{ all -> 0x008d }
            r4 = 105(0x69, float:1.47E-43)
            r2.what = r4     // Catch:{ all -> 0x008d }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x008d }
            r4.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r7 = "unit_id"
            r4.putString(r7, r3)     // Catch:{ all -> 0x008d }
            java.lang.String r7 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ all -> 0x008d }
            r4.putString(r7, r0)     // Catch:{ all -> 0x008d }
            java.lang.String r7 = "request_id"
            r4.putString(r7, r5)     // Catch:{ all -> 0x008d }
            java.lang.String r7 = "url"
            r4.putString(r7, r1)     // Catch:{ all -> 0x008d }
            r2.setData(r4)     // Catch:{ all -> 0x008d }
            com.mbridge.msdk.reward.adapter.c$h r4 = r9.f16525a     // Catch:{ all -> 0x008d }
            r4.sendMessage(r2)     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x0052
            r6.mo46997a(r0, r3, r5, r1)     // Catch:{ all -> 0x008d }
        L_0x0052:
            monitor-exit(r13)
            return
        L_0x0054:
            if (r15 == 0) goto L_0x008b
            java.lang.String r1 = r15.getMof_template_url()     // Catch:{ all -> 0x008d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x008b
            com.mbridge.msdk.videocommon.download.g r10 = com.mbridge.msdk.videocommon.download.C7191g.m18286a()     // Catch:{ Exception -> 0x007d }
            java.lang.String r11 = r15.getMof_template_url()     // Catch:{ Exception -> 0x007d }
            com.mbridge.msdk.reward.adapter.c$2 r12 = new com.mbridge.msdk.reward.adapter.c$2     // Catch:{ Exception -> 0x007d }
            r1 = r12
            r2 = r13
            r3 = r17
            r4 = r16
            r5 = r18
            r6 = r19
            r7 = r14
            r8 = r15
            r1.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x007d }
            r10.mo49221b(r11, r12)     // Catch:{ Exception -> 0x007d }
            goto L_0x008b
        L_0x007d:
            r0 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = "RewardCampaignsResourceManager"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x008d }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r0)     // Catch:{ all -> 0x008d }
        L_0x008b:
            monitor-exit(r13)
            return
        L_0x008d:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C6759c.mo47015a(android.content.Context, com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.reward.adapter.c$i):void");
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$e */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C6768e implements C6219c {

        /* renamed from: a */
        private Handler f16591a;

        /* renamed from: b */
        private int f16592b;

        /* renamed from: c */
        private String f16593c;

        /* renamed from: d */
        private String f16594d;

        /* renamed from: e */
        private String f16595e;

        /* renamed from: f */
        private CampaignEx f16596f;

        public C6768e(Handler handler, int i, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f16591a = handler;
            this.f16592b = i;
            this.f16594d = str;
            this.f16593c = str2;
            this.f16595e = str3;
            this.f16596f = campaignEx;
        }

        public final void onSuccessLoad(Bitmap bitmap, String str) {
            C7203i.m18311a().mo49231c(str, true);
            Message obtain = Message.obtain();
            obtain.what = this.f16592b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16593c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16594d);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16595e);
            obtain.setData(bundle);
            this.f16591a.sendMessage(obtain);
        }

        public final void onFailedLoad(String str, String str2) {
            Message obtain = Message.obtain();
            obtain.what = this.f16592b == 0 ? ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16593c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16594d);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16595e);
            obtain.setData(bundle);
            this.f16591a.sendMessage(obtain);
            if (this.f16596f != null) {
                try {
                    C6158p a = C6158p.m15475a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
                    C6361q.m16154a("RewardCampaignsResourceManager", "campaign is null");
                    C6203m mVar = new C6203m();
                    mVar.mo43749o("2000044");
                    mVar.mo43721b(C6349m.m16123n(C6122a.m15302b().mo42895d()));
                    mVar.mo43747n(this.f16596f.getId());
                    mVar.mo43727d(this.f16596f.getImageUrl());
                    mVar.mo43741k(this.f16596f.getRequestId());
                    mVar.mo43743l(this.f16596f.getRequestIdNotice());
                    mVar.mo43745m(this.f16593c);
                    mVar.mo43751p(str);
                    a.mo43039a(mVar);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C6361q.m16158d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$f */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C6769f implements C7212a {

        /* renamed from: a */
        private Handler f16597a;

        /* renamed from: b */
        private final String f16598b;

        /* renamed from: c */
        private final String f16599c;

        /* renamed from: d */
        private final String f16600d;

        public C6769f(Handler handler, String str, String str2, String str3) {
            this.f16597a = handler;
            this.f16599c = str;
            this.f16598b = str2;
            this.f16600d = str3;
        }

        /* renamed from: a */
        public final void mo47024a(String str) {
            C7203i.m18311a().mo49226a(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16598b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16599c);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16600d);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.f16597a.sendMessage(obtain);
        }

        /* renamed from: a */
        public final void mo47025a(String str, String str2) {
            C7203i.m18311a().mo49226a(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16598b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16599c);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16600d);
            bundle.putString("url", str2);
            bundle.putString("message", str);
            obtain.setData(bundle);
            this.f16597a.sendMessage(obtain);
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$g */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C6770g implements C7191g.C7199d {

        /* renamed from: a */
        private boolean f16601a = false;

        /* renamed from: b */
        private Context f16602b;

        /* renamed from: c */
        private String f16603c;

        /* renamed from: d */
        private String f16604d;

        /* renamed from: e */
        private String f16605e;

        /* renamed from: f */
        private CampaignEx f16606f;

        /* renamed from: g */
        private int f16607g;

        /* renamed from: h */
        private Handler f16608h;

        /* renamed from: i */
        private C6772i f16609i;

        /* renamed from: j */
        private List<CampaignEx> f16610j;

        /* renamed from: k */
        private long f16611k;

        public C6770g(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i, Handler handler, C6772i iVar, List<CampaignEx> list) {
            this.f16602b = context;
            this.f16604d = str;
            this.f16603c = str2;
            this.f16605e = str3;
            this.f16606f = campaignEx;
            this.f16607g = i;
            this.f16608h = handler;
            this.f16609i = iVar;
            this.f16610j = list;
            this.f16611k = System.currentTimeMillis();
        }

        /* renamed from: a */
        public final void mo47026a(boolean z) {
            this.f16601a = z;
        }

        /* renamed from: a */
        public final void mo44018a(String str) {
            C7203i.m18311a().mo49229b(str, true);
            long currentTimeMillis = System.currentTimeMillis() - this.f16611k;
            int i = this.f16607g;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16603c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16604d);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16605e);
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.f16608h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16603c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f16604d);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16605e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f16608h.sendMessage(obtain2);
                if (this.f16601a) {
                    try {
                        C6203m mVar = new C6203m("2000043", 1, currentTimeMillis + "", str, this.f16606f.getId(), this.f16603c, "", "1");
                        mVar.mo43741k(this.f16606f.getRequestId());
                        mVar.mo43743l(this.f16606f.getRequestIdNotice());
                        mVar.mo43747n(this.f16606f.getId());
                        if (this.f16606f.getAdType() == 287) {
                            mVar.mo43735h(ExifInterface.GPS_MEASUREMENT_3D);
                        } else if (this.f16606f.getAdType() == 94) {
                            mVar.mo43735h("1");
                        }
                        C6305b.m15965a(mVar, this.f16603c);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C6361q.m16158d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = 103;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16603c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f16604d);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16605e);
                obtain3.setData(bundle3);
                this.f16608h.sendMessage(obtain3);
                C6772i iVar = this.f16609i;
                if (iVar != null) {
                    iVar.mo46997a(this.f16604d, this.f16603c, this.f16605e, str);
                }
                try {
                    C6203m mVar2 = new C6203m();
                    mVar2.mo43749o("2000045");
                    if (this.f16602b != null) {
                        mVar2.mo43721b(C6349m.m16123n(this.f16602b.getApplicationContext()));
                    }
                    mVar2.mo43724c(1);
                    if (this.f16606f != null) {
                        mVar2.mo43747n(this.f16606f.getId());
                        mVar2.mo43741k(this.f16606f.getRequestId());
                        mVar2.mo43743l(this.f16606f.getRequestIdNotice());
                    }
                    mVar2.mo43737i(str);
                    mVar2.mo43751p("");
                    mVar2.mo43745m(this.f16603c);
                    C6158p.m15475a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d())).mo43039a(mVar2);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C6361q.m16158d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo44019a(String str, String str2) {
            C7203i.m18311a().mo49229b(str2, false);
            long currentTimeMillis = System.currentTimeMillis() - this.f16611k;
            int i = this.f16607g;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16603c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16604d);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16605e);
                bundle.putString("url", str2);
                bundle.putString("message", str);
                obtain.setData(bundle);
                this.f16608h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16603c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f16604d);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16605e);
                bundle2.putString("url", str2);
                bundle2.putString("message", str);
                obtain2.setData(bundle2);
                this.f16608h.sendMessage(obtain2);
                if (this.f16601a) {
                    try {
                        C6203m mVar = new C6203m("2000043", 3, currentTimeMillis + "", str2, this.f16606f.getId(), this.f16603c, "zip download failed", "1");
                        mVar.mo43741k(this.f16606f.getRequestId());
                        mVar.mo43743l(this.f16606f.getRequestIdNotice());
                        mVar.mo43747n(this.f16606f.getId());
                        if (this.f16606f.getAdType() == 287) {
                            mVar.mo43735h(ExifInterface.GPS_MEASUREMENT_3D);
                        } else if (this.f16606f.getAdType() == 94) {
                            mVar.mo43735h("1");
                        }
                        C6305b.m15965a(mVar, this.f16603c);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C6361q.m16158d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16603c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f16604d);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16605e);
                bundle3.putString("url", str2);
                bundle3.putString("message", str);
                obtain3.setData(bundle3);
                this.f16608h.sendMessage(obtain3);
                C6772i iVar = this.f16609i;
                if (iVar != null) {
                    iVar.mo46998a(this.f16604d, this.f16603c, this.f16605e, str2, str);
                }
                try {
                    C6203m mVar2 = new C6203m();
                    mVar2.mo43749o("2000045");
                    if (this.f16602b != null) {
                        mVar2.mo43721b(C6349m.m16123n(this.f16602b.getApplicationContext()));
                    }
                    mVar2.mo43724c(3);
                    if (this.f16606f != null) {
                        mVar2.mo43747n(this.f16606f.getId());
                        mVar2.mo43741k(this.f16606f.getRequestId());
                        mVar2.mo43743l(this.f16606f.getRequestIdNotice());
                    }
                    mVar2.mo43737i(str2);
                    mVar2.mo43751p(str);
                    mVar2.mo43745m(this.f16603c);
                    C6158p.m15475a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d())).mo43039a(mVar2);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C6361q.m16158d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$d */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C6767d implements C7191g.C7197b {

        /* renamed from: a */
        private boolean f16581a = false;

        /* renamed from: b */
        private int f16582b;

        /* renamed from: c */
        private final String f16583c;

        /* renamed from: d */
        private final String f16584d;

        /* renamed from: e */
        private final String f16585e;

        /* renamed from: f */
        private CampaignEx f16586f;

        /* renamed from: g */
        private C6772i f16587g;

        /* renamed from: h */
        private Handler f16588h;

        /* renamed from: i */
        private List<CampaignEx> f16589i;

        /* renamed from: j */
        private final long f16590j;

        public C6767d(int i, String str, String str2, String str3, CampaignEx campaignEx, C6772i iVar, Handler handler, List<CampaignEx> list) {
            this.f16582b = i;
            this.f16583c = str;
            this.f16584d = str2;
            this.f16585e = str3;
            this.f16586f = campaignEx;
            this.f16587g = iVar;
            this.f16588h = handler;
            this.f16589i = list;
            this.f16590j = System.currentTimeMillis();
        }

        /* renamed from: a */
        public final void mo47023a(boolean z) {
            this.f16581a = z;
        }

        /* renamed from: a */
        public final void mo44018a(String str) {
            C7203i.m18311a().mo49229b(str, true);
            int i = this.f16582b;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16584d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16583c);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16585e);
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.f16588h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16584d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f16583c);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16585e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f16588h.sendMessage(obtain2);
                if (this.f16581a) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f16590j;
                    try {
                        C6203m mVar = new C6203m("2000043", 20, currentTimeMillis + "", str, this.f16586f.getId(), this.f16584d, "", "2");
                        mVar.mo43741k(this.f16586f.getRequestId());
                        mVar.mo43743l(this.f16586f.getRequestIdNotice());
                        mVar.mo43747n(this.f16586f.getId());
                        if (this.f16586f.getAdType() == 287) {
                            mVar.mo43735h(ExifInterface.GPS_MEASUREMENT_3D);
                        } else if (this.f16586f.getAdType() == 94) {
                            mVar.mo43735h("1");
                        }
                        C6305b.m15965a(mVar, this.f16584d);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C6361q.m16158d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = 105;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16584d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f16583c);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16585e);
                obtain3.setData(bundle3);
                this.f16588h.sendMessage(obtain3);
                C6772i iVar = this.f16587g;
                if (iVar != null) {
                    iVar.mo46997a(this.f16583c, this.f16584d, this.f16585e, str);
                }
            }
        }

        /* renamed from: a */
        public final void mo44019a(String str, String str2) {
            C7203i.m18311a().mo49229b(str, false);
            int i = this.f16582b;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16584d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16583c);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16585e);
                bundle.putString("url", str);
                bundle.putString("message", str2);
                obtain.setData(bundle);
                this.f16588h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16584d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f16583c);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16585e);
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                obtain2.setData(bundle2);
                this.f16588h.sendMessage(obtain2);
                if (this.f16581a) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f16590j;
                    try {
                        C6203m mVar = new C6203m("2000043", 21, currentTimeMillis + "", str, this.f16586f.getId(), this.f16584d, "url download failed", "2");
                        mVar.mo43741k(this.f16586f.getRequestId());
                        mVar.mo43743l(this.f16586f.getRequestIdNotice());
                        mVar.mo43747n(this.f16586f.getId());
                        if (this.f16586f.getAdType() == 287) {
                            mVar.mo43735h(ExifInterface.GPS_MEASUREMENT_3D);
                        } else if (this.f16586f.getAdType() == 94) {
                            mVar.mo43735h("1");
                        }
                        C6305b.m15965a(mVar, this.f16584d);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C6361q.m16158d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16584d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f16583c);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f16585e);
                bundle3.putString("message", str2);
                obtain3.setData(bundle3);
                this.f16588h.sendMessage(obtain3);
                C6772i iVar = this.f16587g;
                if (iVar != null) {
                    iVar.mo46998a(this.f16583c, this.f16584d, this.f16585e, str, str2);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$h */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C6771h extends Handler {

        /* renamed from: a */
        private Context f16612a;

        /* renamed from: b */
        private ConcurrentHashMap<String, C6766c> f16613b = new ConcurrentHashMap<>();

        /* renamed from: c */
        private ConcurrentHashMap<String, List<CampaignEx>> f16614c = new ConcurrentHashMap<>();

        public C6771h(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo47028a(String str, String str2, String str3, C6766c cVar) {
            ConcurrentHashMap<String, C6766c> concurrentHashMap = this.f16613b;
            concurrentHashMap.put(str2 + "_" + str3, cVar);
        }

        /* renamed from: a */
        public final void mo47027a(Context context) {
            this.f16612a = context;
        }

        /* renamed from: a */
        public final void mo47029a(String str, List<CampaignEx> list) {
            this.f16614c.put(str, list);
        }

        public final void handleMessage(Message message) {
            boolean z;
            String str;
            Message message2 = message;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
            String str2 = string2 + "_" + string3;
            C6764a aVar = (C6764a) C6759c.f16524c.get(str2);
            C6766c cVar = this.f16613b.get(str2);
            List list = this.f16614c.get(str2);
            int i = message2.what;
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                    break;
                default:
                    switch (i) {
                        case 200:
                        case ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR /*201*/:
                        case ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR /*203*/:
                        case ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR /*205*/:
                            if (aVar != null && cVar != null) {
                                String string4 = data.getString("message");
                                if (string4 == null) {
                                    string4 = "";
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("resource download failed ");
                                int i2 = message2.what;
                                sb.append(i2 != 200 ? i2 != 201 ? i2 != 203 ? i2 != 205 ? "unknown" : "tpl" : "temp" : "zip/html" : "video");
                                sb.append(" ");
                                sb.append(string4);
                                String sb2 = sb.toString();
                                try {
                                    if (!aVar.f16553a || aVar.f16561i == null) {
                                        Object obj = "resource download failed ";
                                        if (C7184c.getInstance().mo49208a(94, aVar.f16557e, aVar.f16554b, aVar.f16556d, aVar.f16553a, aVar.f16555c, list)) {
                                            cVar.mo46991a(string, string2, string3, aVar.f16560h);
                                            this.f16613b.remove(str2);
                                            C6759c.f16524c.remove(str2);
                                            this.f16614c.remove(str2);
                                            return;
                                        }
                                        cVar.mo46992a(string, string2, string3, aVar.f16560h, sb2);
                                        this.f16613b.remove(str2);
                                        C6759c.f16524c.remove(str2);
                                        this.f16614c.remove(str2);
                                        return;
                                    } else if (aVar.f16555c == 1) {
                                        cVar.mo46992a(string, string2, string3, aVar.f16560h, sb2);
                                        this.f16613b.remove(str2);
                                        C6759c.f16524c.remove(str2);
                                        this.f16614c.remove(str2);
                                        return;
                                    } else {
                                        String string5 = data.getString("url");
                                        int i3 = message2.what;
                                        if (i3 == 200) {
                                            for (int i4 = 0; i4 < aVar.f16561i.size(); i4++) {
                                                if (aVar.f16561i.get(i4).getVideoUrlEncode().equals(string5)) {
                                                    aVar.f16561i.remove(i4);
                                                }
                                            }
                                            C6759c.f16524c.remove(str2);
                                            C6759c.f16524c.put(str2, aVar);
                                        } else if (i3 == 201) {
                                            for (int i5 = 0; i5 < aVar.f16561i.size(); i5++) {
                                                CampaignEx campaignEx = aVar.f16561i.get(i5);
                                                if (campaignEx.getRewardTemplateMode() != null && campaignEx.getRewardTemplateMode().mo43509c().equals(string5)) {
                                                    aVar.f16561i.remove(i5);
                                                }
                                                if (campaignEx.getendcard_url().equals(string5)) {
                                                    aVar.f16561i.remove(i5);
                                                }
                                            }
                                            C6759c.f16524c.remove(str2);
                                            C6759c.f16524c.put(str2, aVar);
                                        } else if (i3 == 203) {
                                            for (int i6 = 0; i6 < aVar.f16561i.size(); i6++) {
                                                CampaignEx campaignEx2 = aVar.f16561i.get(i6);
                                                if (campaignEx2.getRewardTemplateMode() != null && campaignEx2.getRewardTemplateMode().mo43510d().equals(string5)) {
                                                    aVar.f16561i.remove(i6);
                                                }
                                            }
                                            C6759c.f16524c.remove(str2);
                                            C6759c.f16524c.put(str2, aVar);
                                        } else if (i3 == 205) {
                                            aVar.f16561i.clear();
                                            C6759c.f16524c.remove(str2);
                                            C6759c.f16524c.put(str2, aVar);
                                        }
                                        C7184c instance = C7184c.getInstance();
                                        str = aVar.f16557e;
                                        String str3 = "resource download failed ";
                                        try {
                                            if (instance.mo49208a(94, str, aVar.f16554b, aVar.f16556d, aVar.f16553a, aVar.f16555c, list)) {
                                                cVar.mo46991a(string, string2, string3, aVar.f16560h);
                                                this.f16613b.remove(str2);
                                                C6759c.f16524c.remove(str2);
                                                this.f16614c.remove(str2);
                                                return;
                                            } else if (aVar.f16561i.size() == 0) {
                                                str = str3;
                                                try {
                                                    cVar.mo46992a(string, string2, string3, aVar.f16560h, sb2);
                                                    this.f16613b.remove(str2);
                                                    C6759c.f16524c.remove(str2);
                                                    this.f16614c.remove(str2);
                                                    return;
                                                } catch (Exception e) {
                                                    e = e;
                                                    cVar.mo46992a(string, string2, string3, aVar.f16560h, str + e.getMessage());
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            str = str3;
                                            cVar.mo46992a(string, string2, string3, aVar.f16560h, str + e.getMessage());
                                            return;
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    str = "resource download failed ";
                                    cVar.mo46992a(string, string2, string3, aVar.f16560h, str + e.getMessage());
                                    return;
                                }
                            } else {
                                return;
                            }
                        case ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR /*202*/:
                        case 204:
                            break;
                        default:
                            return;
                    }
            }
            if (aVar != null && cVar != null) {
                try {
                    z = C7184c.getInstance().mo49208a(94, aVar.f16557e, aVar.f16554b, aVar.f16556d, aVar.f16553a, aVar.f16555c, list);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        C6361q.m16158d("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                    }
                    z = false;
                }
                if (z) {
                    cVar.mo46991a(string, string2, string3, aVar.f16560h);
                    this.f16613b.remove(str2);
                    C6759c.f16524c.remove(str2);
                    this.f16614c.remove(str2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo47017a(boolean r22, android.os.Handler r23, boolean r24, boolean r25, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r26, java.lang.String r27, int r28, com.mbridge.msdk.foundation.entity.CampaignEx r29, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, com.mbridge.msdk.videocommon.p239d.C7179c r36, com.mbridge.msdk.reward.adapter.C6759c.C6773j r37) {
        /*
            r21 = this;
            r15 = r27
            r13 = r29
            r0 = r30
            r14 = r33
            r12 = r34
            monitor-enter(r21)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            r1.<init>()     // Catch:{ all -> 0x01db }
            r1.append(r14)     // Catch:{ all -> 0x01db }
            java.lang.String r2 = "_"
            r1.append(r2)     // Catch:{ all -> 0x01db }
            r1.append(r15)     // Catch:{ all -> 0x01db }
            java.lang.String r16 = r1.toString()     // Catch:{ all -> 0x01db }
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x01b4 }
            android.content.Context r2 = r1.mo42895d()     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = "start preload temp"
            r1 = r29
            r4 = r33
            r5 = r25
            r6 = r34
            r7 = r35
            com.mbridge.msdk.reward.p210b.C6801a.m17157c(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.videocommon.a$a r11 = new com.mbridge.msdk.videocommon.a$a     // Catch:{ Exception -> 0x01b4 }
            r11.<init>()     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.reward.adapter.c r1 = com.mbridge.msdk.reward.adapter.C6759c.C6778m.f16661a     // Catch:{ Exception -> 0x01b4 }
            r2 = 0
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r1 = r1.m17017a((boolean) r2)     // Catch:{ Exception -> 0x01b4 }
            if (r1 != 0) goto L_0x0145
            r1 = 1
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = new com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView     // Catch:{ Exception -> 0x00ce, all -> 0x0057 }
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x00ce, all -> 0x0057 }
            android.content.Context r3 = r3.mo42895d()     // Catch:{ Exception -> 0x00ce, all -> 0x0057 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00ce, all -> 0x0057 }
            r10 = r2
            goto L_0x0146
        L_0x0057:
            r0 = move-exception
            if (r37 == 0) goto L_0x00cc
            r11.mo49057a((boolean) r1)     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.videocommon.download.i r2 = com.mbridge.msdk.videocommon.download.C7203i.m18311a()     // Catch:{ Exception -> 0x01b4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            r3.<init>()     // Catch:{ Exception -> 0x01b4 }
            r3.append(r14)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01b4 }
            r3.append(r12)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01b4 }
            r3.append(r15)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01b4 }
            r2.mo49233d(r3, r1)     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x01b4 }
            android.content.Context r2 = r1.mo42895d()     // Catch:{ Exception -> 0x01b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            r1.<init>()     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = "WebView exception: "
            r1.append(r3)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x01b4 }
            r1.append(r0)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x01b4 }
            r1 = r29
            r4 = r33
            r5 = r25
            r6 = r34
            r7 = r35
            com.mbridge.msdk.reward.p210b.C6801a.m17157c(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            r0.<init>()     // Catch:{ Exception -> 0x01b4 }
            r0.append(r14)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r1 = "_"
            r0.append(r1)     // Catch:{ Exception -> 0x01b4 }
            r0.append(r15)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x01b4 }
            r1 = r37
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r27
            r7 = r11
            r1.mo46994a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01b4 }
        L_0x00cc:
            monitor-exit(r21)
            return
        L_0x00ce:
            r0 = move-exception
            if (r37 == 0) goto L_0x0143
            r11.mo49057a((boolean) r1)     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.videocommon.download.i r2 = com.mbridge.msdk.videocommon.download.C7203i.m18311a()     // Catch:{ Exception -> 0x01b4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            r3.<init>()     // Catch:{ Exception -> 0x01b4 }
            r3.append(r14)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01b4 }
            r3.append(r12)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01b4 }
            r3.append(r15)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01b4 }
            r2.mo49233d(r3, r1)     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x01b4 }
            android.content.Context r2 = r1.mo42895d()     // Catch:{ Exception -> 0x01b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            r1.<init>()     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = "WebView exception: "
            r1.append(r3)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x01b4 }
            r1.append(r0)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x01b4 }
            r1 = r29
            r4 = r33
            r5 = r25
            r6 = r34
            r7 = r35
            com.mbridge.msdk.reward.p210b.C6801a.m17157c(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            r0.<init>()     // Catch:{ Exception -> 0x01b4 }
            r0.append(r14)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r1 = "_"
            r0.append(r1)     // Catch:{ Exception -> 0x01b4 }
            r0.append(r15)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x01b4 }
            r1 = r37
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r27
            r7 = r11
            r1.mo46994a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01b4 }
        L_0x0143:
            monitor-exit(r21)
            return
        L_0x0145:
            r10 = r1
        L_0x0146:
            r11.mo49055a((com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView) r10)     // Catch:{ Exception -> 0x01b4 }
            r1 = 0
            if (r0 == 0) goto L_0x0158
            int r2 = r30.size()     // Catch:{ Exception -> 0x01b4 }
            if (r2 <= 0) goto L_0x0158
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01b4 }
            r2.<init>(r1, r13, r0)     // Catch:{ Exception -> 0x01b4 }
            goto L_0x015d
        L_0x0158:
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01b4 }
            r2.<init>(r1, r13)     // Catch:{ Exception -> 0x01b4 }
        L_0x015d:
            r1 = r28
            r9 = r2
            r9.mo48801a((int) r1)     // Catch:{ Exception -> 0x01b4 }
            r9.mo48806a((java.lang.String) r14)     // Catch:{ Exception -> 0x01b4 }
            r1 = r36
            r9.mo48805a((com.mbridge.msdk.videocommon.p239d.C7179c) r1)     // Catch:{ Exception -> 0x01b4 }
            r1 = r22
            r9.mo48843d((boolean) r1)     // Catch:{ Exception -> 0x01b4 }
            com.mbridge.msdk.reward.adapter.c$k r8 = new com.mbridge.msdk.reward.adapter.c$k     // Catch:{ Exception -> 0x01b4 }
            r3 = 0
            r1 = r8
            r2 = r23
            r4 = r24
            r5 = r25
            r6 = r34
            r7 = r37
            r17 = r8
            r8 = r26
            r18 = r9
            r9 = r27
            r19 = r10
            r10 = r32
            r20 = r11
            r11 = r33
            r12 = r20
            r13 = r29
            r14 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x01b0 }
            r0 = r17
            r1 = r19
            r1.setWebViewListener(r0)     // Catch:{ Exception -> 0x01b0 }
            r2 = r18
            r1.setObject(r2)     // Catch:{ Exception -> 0x01b0 }
            r0 = r31
            r1.loadUrl(r0)     // Catch:{ Exception -> 0x01b0 }
            r5 = r34
            r1.setRid(r5)     // Catch:{ Exception -> 0x01ae }
            goto L_0x01d9
        L_0x01ae:
            r0 = move-exception
            goto L_0x01b6
        L_0x01b0:
            r0 = move-exception
            r5 = r34
            goto L_0x01b6
        L_0x01b4:
            r0 = move-exception
            r5 = r12
        L_0x01b6:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x01db }
            if (r1 == 0) goto L_0x01c3
            java.lang.String r1 = "RewardCampaignsResourceManager"
            java.lang.String r2 = r0.getLocalizedMessage()     // Catch:{ all -> 0x01db }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r2)     // Catch:{ all -> 0x01db }
        L_0x01c3:
            if (r37 == 0) goto L_0x01d9
            r7 = 0
            java.lang.String r8 = r0.getLocalizedMessage()     // Catch:{ all -> 0x01db }
            r1 = r37
            r2 = r16
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r27
            r1.mo46995a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01db }
        L_0x01d9:
            monitor-exit(r21)
            return
        L_0x01db:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C6759c.mo47017a(boolean, android.os.Handler, boolean, boolean, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.c$j):void");
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$k */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C6774k extends C6532b {

        /* renamed from: a */
        private Handler f16615a;

        /* renamed from: b */
        private Runnable f16616b;

        /* renamed from: c */
        private final boolean f16617c;

        /* renamed from: d */
        private final boolean f16618d;

        /* renamed from: e */
        private String f16619e;

        /* renamed from: f */
        private final C6773j f16620f;

        /* renamed from: g */
        private final WindVaneWebView f16621g;

        /* renamed from: h */
        private final String f16622h;

        /* renamed from: i */
        private final String f16623i;

        /* renamed from: j */
        private final String f16624j;

        /* renamed from: k */
        private final C7165a.C7166a f16625k;

        /* renamed from: l */
        private final CampaignEx f16626l;

        /* renamed from: m */
        private List<CampaignEx> f16627m;

        /* renamed from: n */
        private boolean f16628n;

        /* renamed from: o */
        private boolean f16629o;

        /* renamed from: p */
        private final Runnable f16630p;

        /* renamed from: q */
        private final Runnable f16631q;

        public C6774k(Handler handler, Runnable runnable, boolean z, boolean z2, String str, C6773j jVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, C7165a.C7166a aVar, CampaignEx campaignEx, List<CampaignEx> list) {
            Handler handler2 = handler;
            this.f16615a = handler2;
            this.f16616b = runnable;
            this.f16617c = z;
            this.f16618d = z2;
            this.f16619e = str;
            this.f16620f = jVar;
            this.f16621g = windVaneWebView;
            this.f16622h = str2;
            this.f16623i = str4;
            this.f16624j = str3;
            this.f16625k = aVar;
            this.f16626l = campaignEx;
            this.f16627m = list;
            final C6773j jVar2 = jVar;
            final C7165a.C7166a aVar2 = aVar;
            final String str5 = str4;
            C67751 r12 = r0;
            final String str6 = str;
            final String str7 = str2;
            final CampaignEx campaignEx2 = campaignEx;
            final boolean z3 = z2;
            final String str8 = str3;
            C67751 r0 = new Runnable() {
                public final void run() {
                    WindVaneWebView a;
                    C7165a.C7166a aVar;
                    if (!(jVar2 == null || (aVar = aVar2) == null)) {
                        aVar.mo49057a(true);
                        C7203i a2 = C7203i.m18311a();
                        a2.mo49233d(str5 + "_" + str6 + "_" + str7, true);
                        C6801a.m17157c(campaignEx2, C6122a.m15302b().mo42895d(), "WebView onPageFinish timeout exception after 5s", str5, z3, str6, campaignEx2.getRequestIdNotice());
                        C6773j jVar = jVar2;
                        jVar.mo46994a(str5 + "_" + str7, str8, str5, str6, str7, aVar2);
                    }
                    C7165a.C7166a aVar2 = aVar2;
                    if (aVar2 != null && (a = aVar2.mo49054a()) != null) {
                        try {
                            a.release();
                        } catch (Exception unused) {
                        }
                    }
                }
            };
            this.f16631q = r12;
            this.f16630p = new Runnable() {
                public final void run() {
                    WindVaneWebView a;
                    C7165a.C7166a aVar;
                    if (!(jVar2 == null || (aVar = aVar2) == null)) {
                        aVar.mo49057a(true);
                        C7203i a2 = C7203i.m18311a();
                        a2.mo49233d(str5 + "_" + str6 + "_" + str7, true);
                        C6801a.m17157c(campaignEx2, C6122a.m15302b().mo42895d(), "WebView readyState timeout exception after 5s", str5, z3, str6, campaignEx2.getRequestIdNotice());
                        C6773j jVar = jVar2;
                        jVar.mo46994a(str5 + "_" + str7, str8, str5, str6, str7, aVar2);
                    }
                    C7165a.C7166a aVar2 = aVar2;
                    if (aVar2 != null && (a = aVar2.mo49054a()) != null) {
                        try {
                            a.release();
                        } catch (Exception unused) {
                        }
                    }
                }
            };
            if (handler2 != null) {
                handler2.postDelayed(this.f16631q, 5000);
            }
        }

        /* renamed from: a */
        public final void mo44020a(WebView webView, int i) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.mo44020a(webView, i);
            Handler handler2 = this.f16615a;
            if (!(handler2 == null || (runnable2 = this.f16630p) == null)) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f16615a;
            if (!(handler3 == null || (runnable = this.f16631q) == null)) {
                handler3.removeCallbacks(runnable);
            }
            if (!this.f16629o) {
                C6801a.m17157c(this.f16626l, C6122a.m15302b().mo42895d(), "preload temp readState: " + i, this.f16623i, this.f16618d, this.f16619e, this.f16626l.getRequestIdNotice());
                String str = this.f16623i + "_" + this.f16622h;
                if (i == 1) {
                    Runnable runnable3 = this.f16616b;
                    if (!(runnable3 == null || (handler = this.f16615a) == null)) {
                        handler.removeCallbacks(runnable3);
                    }
                    C7203i.m18311a().mo49233d(this.f16623i + "_" + this.f16619e + "_" + this.f16622h, true);
                    C7165a.C7166a aVar = this.f16625k;
                    if (aVar != null) {
                        aVar.mo49057a(true);
                    }
                    if (this.f16617c) {
                        if (this.f16618d) {
                            C7165a.m18058a(287, this.f16626l.getRequestIdNotice(), this.f16625k);
                        } else {
                            C7165a.m18062b(287, this.f16626l.getRequestIdNotice(), this.f16625k);
                        }
                    } else if (this.f16618d) {
                        C7165a.m18058a(94, this.f16626l.getRequestIdNotice(), this.f16625k);
                    } else {
                        C7165a.m18062b(94, this.f16626l.getRequestIdNotice(), this.f16625k);
                    }
                    C6773j jVar = this.f16620f;
                    if (jVar != null) {
                        jVar.mo46994a(str, this.f16624j, this.f16623i, this.f16619e, this.f16622h, this.f16625k);
                    }
                } else {
                    C6773j jVar2 = this.f16620f;
                    if (jVar2 != null) {
                        jVar2.mo46995a(str, this.f16624j, this.f16623i, this.f16619e, this.f16622h, this.f16625k, "state " + i);
                    }
                }
                this.f16629o = true;
            }
        }

        /* renamed from: a */
        public final void mo44021a(WebView webView, int i, String str, String str2) {
            super.mo44021a(webView, i, str, str2);
            C7203i.m18311a().mo49233d(this.f16623i + "_" + this.f16619e + "_" + this.f16622h, false);
            CampaignEx campaignEx = this.f16626l;
            Context d = C6122a.m15302b().mo42895d();
            StringBuilder sb = new StringBuilder();
            sb.append("WebView onReceivedError exception: ");
            sb.append(str);
            C6801a.m17157c(campaignEx, d, sb.toString(), this.f16623i, this.f16618d, this.f16619e, this.f16626l.getRequestIdNotice());
            Handler handler = this.f16615a;
            if (handler != null) {
                if (this.f16630p != null) {
                    handler.removeCallbacks(this.f16631q);
                }
                Runnable runnable = this.f16630p;
                if (runnable != null) {
                    this.f16615a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f16623i + "_" + this.f16622h;
                if (this.f16625k != null) {
                    this.f16625k.mo49057a(false);
                }
                if (this.f16620f != null) {
                    this.f16620f.mo46995a(str3, this.f16624j, this.f16623i, this.f16619e, str2, this.f16625k, str);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C6361q.m16158d("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        /* renamed from: a */
        public final void mo44022a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.mo44022a(webView, sslErrorHandler, sslError);
            C7203i.m18311a().mo49233d(this.f16623i + "_" + this.f16619e + "_" + this.f16622h, false);
            CampaignEx campaignEx = this.f16626l;
            Context d = C6122a.m15302b().mo42895d();
            StringBuilder sb = new StringBuilder();
            sb.append("WebView onReceivedSslError exception: ");
            sb.append(sslError == null ? "SSLError" : Integer.toString(sslError.getPrimaryError()));
            C6801a.m17157c(campaignEx, d, sb.toString(), this.f16623i, this.f16618d, this.f16619e, this.f16626l.getRequestIdNotice());
            Handler handler = this.f16615a;
            if (handler != null) {
                if (this.f16630p != null) {
                    handler.removeCallbacks(this.f16631q);
                }
                Runnable runnable = this.f16630p;
                if (runnable != null) {
                    this.f16615a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f16623i + "_" + this.f16622h;
                if (this.f16625k != null) {
                    this.f16625k.mo49057a(false);
                }
                if (this.f16620f != null) {
                    this.f16620f.mo46995a(str, this.f16624j, this.f16623i, this.f16619e, this.f16622h, this.f16625k, sslError == null ? "" : Integer.toString(sslError.getPrimaryError()));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C6361q.m16158d("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        /* renamed from: a */
        public final void mo44023a(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.mo44023a(webView, str);
            Handler handler2 = this.f16615a;
            if (!(handler2 == null || (runnable2 = this.f16631q) == null)) {
                handler2.removeCallbacks(runnable2);
            }
            if (!this.f16628n) {
                C6801a.m17157c(this.f16626l, C6122a.m15302b().mo42895d(), "preload temp onPageFinish", this.f16623i, this.f16618d, this.f16619e, this.f16626l.getRequestIdNotice());
                if (!str.contains("wfr=1")) {
                    String str2 = this.f16623i + "_" + this.f16622h;
                    C7203i.m18311a().mo49233d(this.f16623i + "_" + this.f16619e + "_" + this.f16622h, true);
                    Runnable runnable3 = this.f16616b;
                    if (!(runnable3 == null || (handler = this.f16615a) == null)) {
                        handler.removeCallbacks(runnable3);
                    }
                    C7165a.C7166a aVar = this.f16625k;
                    if (aVar != null) {
                        aVar.mo49057a(true);
                    }
                    if (this.f16617c) {
                        if (this.f16626l.isBidCampaign()) {
                            C7165a.m18058a(287, this.f16626l.getRequestIdNotice(), this.f16625k);
                        } else {
                            C7165a.m18062b(287, this.f16626l.getRequestIdNotice(), this.f16625k);
                        }
                    } else if (this.f16626l.isBidCampaign()) {
                        C7165a.m18058a(94, this.f16626l.getRequestIdNotice(), this.f16625k);
                    } else {
                        C7165a.m18062b(94, this.f16626l.getRequestIdNotice(), this.f16625k);
                    }
                    C6773j jVar = this.f16620f;
                    if (jVar != null) {
                        jVar.mo46994a(str2, this.f16624j, this.f16623i, this.f16619e, this.f16622h, this.f16625k);
                    }
                } else {
                    Handler handler3 = this.f16615a;
                    if (!(handler3 == null || (runnable = this.f16630p) == null)) {
                        handler3.postDelayed(runnable, 5000);
                    }
                }
                C6563g.m16891a().mo44521a(webView);
                this.f16628n = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo47018a(boolean r25, android.os.Handler r26, boolean r27, boolean r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, com.mbridge.msdk.foundation.entity.CampaignEx r35, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r36, java.lang.String r37, java.lang.String r38, com.mbridge.msdk.videocommon.p239d.C7179c r39, com.mbridge.msdk.reward.adapter.C6759c.C6773j r40, boolean r41) {
        /*
            r24 = this;
            r1 = r24
            r15 = r29
            r14 = r32
            r0 = r35
            r13 = r36
            r12 = r41
            monitor-enter(r24)
            r1.f16527d = r12     // Catch:{ all -> 0x01f0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f0 }
            r2.<init>()     // Catch:{ all -> 0x01f0 }
            r2.append(r14)     // Catch:{ all -> 0x01f0 }
            java.lang.String r3 = "_"
            r2.append(r3)     // Catch:{ all -> 0x01f0 }
            r11 = r33
            r2.append(r11)     // Catch:{ all -> 0x01f0 }
            java.lang.String r19 = r2.toString()     // Catch:{ all -> 0x01f0 }
            r1.f16527d = r12     // Catch:{ all -> 0x01f0 }
            boolean r2 = com.mbridge.msdk.foundation.tools.C6366u.m16221f((java.lang.String) r33)     // Catch:{ all -> 0x01f0 }
            if (r2 == 0) goto L_0x0043
            if (r40 == 0) goto L_0x0041
            r0 = 0
            r34 = r40
            r35 = r19
            r36 = r31
            r37 = r32
            r38 = r29
            r39 = r33
            r40 = r0
            r34.mo46994a(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x01f0 }
        L_0x0041:
            monitor-exit(r24)
            return
        L_0x0043:
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x01c4 }
            android.content.Context r3 = r2.mo42895d()     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r4 = "start preload tpl"
            r2 = r35
            r5 = r38
            r6 = r28
            r7 = r29
            r8 = r30
            com.mbridge.msdk.reward.p210b.C6801a.m17157c(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.videocommon.a$a r10 = new com.mbridge.msdk.videocommon.a$a     // Catch:{ Exception -> 0x01c4 }
            r10.<init>()     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.reward.adapter.c r2 = com.mbridge.msdk.reward.adapter.C6759c.C6778m.f16661a     // Catch:{ Exception -> 0x01c4 }
            r3 = 1
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r2.m17017a((boolean) r3)     // Catch:{ Exception -> 0x01c4 }
            if (r2 != 0) goto L_0x0077
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = new com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x01c4 }
            android.content.Context r4 = r4.mo42895d()     // Catch:{ Exception -> 0x01c4 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x01c4 }
        L_0x0077:
            r9 = r2
            r10.mo49055a((com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView) r9)     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p214bt.p215a.C6877c.m17219a()     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r8 = r2.mo48200b()     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p214bt.p215a.C6877c.m17219a()     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r7 = r2.mo48200b()     // Catch:{ Exception -> 0x01c4 }
            r10.mo49056a((java.lang.String) r7)     // Catch:{ Exception -> 0x01c4 }
            if (r13 == 0) goto L_0x00f3
            int r4 = r36.size()     // Catch:{ Exception -> 0x01c4 }
            if (r4 <= 0) goto L_0x00f3
            com.mbridge.msdk.videocommon.download.c r4 = com.mbridge.msdk.videocommon.download.C7184c.getInstance()     // Catch:{ Exception -> 0x01c4 }
            java.util.List r4 = r4.mo49204a((java.lang.String) r14)     // Catch:{ Exception -> 0x01c4 }
            if (r4 == 0) goto L_0x00ec
            int r5 = r4.size()     // Catch:{ Exception -> 0x01c4 }
            if (r5 <= 0) goto L_0x00ec
            r5 = 0
        L_0x00a7:
            int r6 = r36.size()     // Catch:{ Exception -> 0x01c4 }
            if (r5 >= r6) goto L_0x00ec
            java.lang.Object r6 = r13.get(r5)     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ Exception -> 0x01c4 }
            java.util.Iterator r16 = r4.iterator()     // Catch:{ Exception -> 0x01c4 }
        L_0x00b7:
            boolean r17 = r16.hasNext()     // Catch:{ Exception -> 0x01c4 }
            if (r17 == 0) goto L_0x00e8
            java.lang.Object r17 = r16.next()     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.foundation.entity.CampaignEx r17 = (com.mbridge.msdk.foundation.entity.CampaignEx) r17     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r2 = r17.getId()     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r3 = r6.getId()     // Catch:{ Exception -> 0x01c4 }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x01c4 }
            if (r2 == 0) goto L_0x00e6
            java.lang.String r2 = r17.getRequestId()     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r3 = r6.getRequestId()     // Catch:{ Exception -> 0x01c4 }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x01c4 }
            if (r2 == 0) goto L_0x00e6
            r2 = 1
            r6.setReady(r2)     // Catch:{ Exception -> 0x01c4 }
            r13.set(r5, r6)     // Catch:{ Exception -> 0x01c4 }
        L_0x00e6:
            r3 = 1
            goto L_0x00b7
        L_0x00e8:
            int r5 = r5 + 1
            r3 = 1
            goto L_0x00a7
        L_0x00ec:
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01c4 }
            r3 = 0
            r2.<init>(r3, r0, r13)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x00f9
        L_0x00f3:
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01c4 }
            r3 = 0
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x01c4 }
        L_0x00f9:
            r4 = r34
            r6 = r2
            r6.mo48801a((int) r4)     // Catch:{ Exception -> 0x01c4 }
            r2 = r38
            r6.mo48806a((java.lang.String) r2)     // Catch:{ Exception -> 0x01c4 }
            r6.mo48840c((java.lang.String) r7)     // Catch:{ Exception -> 0x01c4 }
            r6.mo48842d((java.lang.String) r8)     // Catch:{ Exception -> 0x01c4 }
            r2 = 1
            r6.mo48841c((boolean) r2)     // Catch:{ Exception -> 0x01c4 }
            r3 = r39
            r6.mo48805a((com.mbridge.msdk.videocommon.p239d.C7179c) r3)     // Catch:{ Exception -> 0x01c4 }
            r2 = r25
            r6.mo48843d((boolean) r2)     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.reward.adapter.c$b r5 = new com.mbridge.msdk.reward.adapter.c$b     // Catch:{ Exception -> 0x01c4 }
            r16 = 0
            r30 = r5
            r5 = r16
            r2 = r30
            r3 = r25
            r4 = r26
            r20 = r6
            r6 = r27
            r21 = r7
            r7 = r28
            r22 = r8
            r8 = r34
            r23 = r9
            r9 = r33
            r16 = r10
            r10 = r31
            r11 = r32
            r12 = r29
            r13 = r16
            r14 = r35
            r15 = r36
            r16 = r39
            r17 = r40
            r18 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x01be }
            r0 = r30
            r2 = r23
            r2.setWebViewListener(r0)     // Catch:{ Exception -> 0x01be }
            r0 = r20
            r2.setObject(r0)     // Catch:{ Exception -> 0x01be }
            r0 = r37
            r2.loadUrl(r0)     // Catch:{ Exception -> 0x01be }
            r3 = r29
            r2.setRid(r3)     // Catch:{ Exception -> 0x01bc }
            com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout r0 = new com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout     // Catch:{ Exception -> 0x01bc }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x01bc }
            android.content.Context r4 = r4.mo42895d()     // Catch:{ Exception -> 0x01bc }
            r0.<init>(r4)     // Catch:{ Exception -> 0x01bc }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Exception -> 0x01bc }
            r5 = -1
            r4.<init>(r5, r5)     // Catch:{ Exception -> 0x01bc }
            r0.setLayoutParams(r4)     // Catch:{ Exception -> 0x01bc }
            r4 = r22
            r0.setInstanceId(r4)     // Catch:{ Exception -> 0x01bc }
            r6 = r32
            r0.setUnitId(r6)     // Catch:{ Exception -> 0x01ba }
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r7 = new com.mbridge.msdk.video.bt.module.MBridgeBTLayout     // Catch:{ Exception -> 0x01ba }
            com.mbridge.msdk.foundation.controller.a r8 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x01ba }
            android.content.Context r8 = r8.mo42895d()     // Catch:{ Exception -> 0x01ba }
            r7.<init>(r8)     // Catch:{ Exception -> 0x01ba }
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Exception -> 0x01ba }
            r8.<init>(r5, r5)     // Catch:{ Exception -> 0x01ba }
            r7.setLayoutParams(r8)     // Catch:{ Exception -> 0x01ba }
            r8 = r21
            r7.setInstanceId(r8)     // Catch:{ Exception -> 0x01ba }
            r7.setUnitId(r6)     // Catch:{ Exception -> 0x01ba }
            r7.setWebView(r2)     // Catch:{ Exception -> 0x01ba }
            com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p214bt.p215a.C6877c.m17219a()     // Catch:{ Exception -> 0x01ba }
            java.util.LinkedHashMap r2 = r2.mo48201b((java.lang.String) r6, (java.lang.String) r3)     // Catch:{ Exception -> 0x01ba }
            r2.put(r8, r7)     // Catch:{ Exception -> 0x01ba }
            r2.put(r4, r0)     // Catch:{ Exception -> 0x01ba }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Exception -> 0x01ba }
            r2.<init>(r5, r5)     // Catch:{ Exception -> 0x01ba }
            r0.addView(r7, r2)     // Catch:{ Exception -> 0x01ba }
            goto L_0x01ee
        L_0x01ba:
            r0 = move-exception
            goto L_0x01c7
        L_0x01bc:
            r0 = move-exception
            goto L_0x01c1
        L_0x01be:
            r0 = move-exception
            r3 = r29
        L_0x01c1:
            r6 = r32
            goto L_0x01c7
        L_0x01c4:
            r0 = move-exception
            r6 = r14
            r3 = r15
        L_0x01c7:
            if (r40 == 0) goto L_0x01e1
            r2 = 0
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x01f0 }
            r34 = r40
            r35 = r19
            r36 = r31
            r37 = r32
            r38 = r29
            r39 = r33
            r40 = r2
            r41 = r4
            r34.mo46995a(r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x01f0 }
        L_0x01e1:
            boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x01f0 }
            if (r2 == 0) goto L_0x01ee
            java.lang.String r2 = "RewardCampaignsResourceManager"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x01f0 }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r2, r0)     // Catch:{ all -> 0x01f0 }
        L_0x01ee:
            monitor-exit(r24)
            return
        L_0x01f0:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C6759c.mo47018a(boolean, android.os.Handler, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.List, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.c$j, boolean):void");
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$b */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C6765b extends C6531a {

        /* renamed from: a */
        private final Handler f16562a;

        /* renamed from: b */
        private final Runnable f16563b;

        /* renamed from: c */
        private final boolean f16564c;

        /* renamed from: d */
        private final boolean f16565d;

        /* renamed from: e */
        private int f16566e;

        /* renamed from: f */
        private String f16567f;

        /* renamed from: g */
        private String f16568g;

        /* renamed from: h */
        private String f16569h;

        /* renamed from: i */
        private String f16570i;

        /* renamed from: j */
        private C7165a.C7166a f16571j;

        /* renamed from: k */
        private CampaignEx f16572k;

        /* renamed from: l */
        private List<CampaignEx> f16573l;

        /* renamed from: m */
        private C7179c f16574m;

        /* renamed from: n */
        private final C6773j f16575n;

        /* renamed from: o */
        private boolean f16576o;

        /* renamed from: p */
        private boolean f16577p;

        /* renamed from: q */
        private boolean f16578q;

        /* renamed from: r */
        private int f16579r = 0;

        /* renamed from: s */
        private boolean f16580s;

        public C6765b(boolean z, Handler handler, Runnable runnable, boolean z2, boolean z3, int i, String str, String str2, String str3, String str4, C7165a.C7166a aVar, CampaignEx campaignEx, List<CampaignEx> list, C7179c cVar, C6773j jVar, boolean z4) {
            this.f16562a = handler;
            this.f16563b = runnable;
            this.f16564c = z2;
            this.f16565d = z3;
            this.f16566e = i;
            this.f16567f = str;
            this.f16569h = str2;
            this.f16568g = str3;
            this.f16570i = str4;
            this.f16571j = aVar;
            this.f16572k = campaignEx;
            this.f16573l = list;
            this.f16574m = cVar;
            this.f16575n = jVar;
            this.f16576o = z4;
            this.f16580s = z;
        }

        /* renamed from: a */
        public final void mo44020a(WebView webView, int i) {
            Runnable runnable;
            if (!this.f16578q) {
                C6801a.m17157c(this.f16572k, C6122a.m15302b().mo42895d(), "preload tpl readyState: " + i, this.f16568g, this.f16565d, this.f16570i, this.f16572k.getRequestIdNotice());
                String str = this.f16568g + "_" + this.f16567f;
                if (i == 1) {
                    if (this.f16576o) {
                        C7165a.m18065d(this.f16568g + "_" + this.f16570i);
                    } else {
                        C7165a.m18064c(this.f16568g + "_" + this.f16570i);
                    }
                    C7165a.m18059a(this.f16568g + "_" + this.f16570i + "_" + this.f16567f, this.f16571j, true, this.f16576o);
                    Handler handler = this.f16562a;
                    if (!(handler == null || (runnable = this.f16563b) == null)) {
                        handler.removeCallbacks(runnable);
                    }
                    C7203i.m18311a().mo49233d(this.f16568g + "_" + this.f16570i + "_" + this.f16567f, true);
                    C7165a.C7166a aVar = this.f16571j;
                    if (aVar != null) {
                        aVar.mo49057a(true);
                    }
                    C6773j jVar = this.f16575n;
                    if (jVar != null) {
                        jVar.mo46994a(str, this.f16569h, this.f16568g, this.f16570i, this.f16567f, this.f16571j);
                    }
                } else {
                    C7203i.m18311a().mo49233d(this.f16568g + "_" + this.f16570i + "_" + this.f16567f, false);
                    C7165a.C7166a aVar2 = this.f16571j;
                    if (aVar2 != null) {
                        aVar2.mo49057a(false);
                    }
                    C6773j jVar2 = this.f16575n;
                    if (jVar2 != null) {
                        jVar2.mo46995a(str, this.f16569h, this.f16568g, this.f16570i, this.f16567f, this.f16571j, "state 2");
                    }
                }
                this.f16578q = true;
            }
        }

        /* renamed from: a */
        public final void mo44405a(WebView webView, String str, String str2, int i, int i2) {
            boolean z = true;
            if (i == 1) {
                try {
                    C6738a aVar = new C6738a();
                    aVar.mo46984b(false);
                    if (i2 != 2) {
                        z = false;
                    }
                    aVar.mo46979a(z);
                    aVar.mo46983b(str, str2);
                    aVar.mo46976a((InterVideoOutListener) new C6914a((C6921g) null));
                    aVar.mo46986d(false);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo44407a(Object obj, String str) {
            Object obj2 = obj;
            if (obj2 != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        String optString = new JSONObject(str).optString("id");
                        C6877c.m17219a().mo48195a(obj2, optString);
                        String c = C6877c.m17219a().mo48204c(optString);
                        CampaignEx a = C6877c.m17219a().mo48191a(optString);
                        C7179c b = C6877c.m17219a().mo48199b(optString);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(a);
                        C6557a aVar = (C6557a) obj2;
                        if (aVar.f16345a instanceof WindVaneWebView) {
                            WindVaneWebView windVaneWebView = aVar.f16345a;
                            C6759c a2 = C6778m.f16661a;
                            boolean z = this.f16580s;
                            int i = this.f16579r == 0 ? 3 : 6;
                            if (windVaneWebView != null) {
                                int i2 = i;
                                if (!(a == null || b == null)) {
                                    try {
                                        if (a.getRewardTemplateMode() != null) {
                                            if (!TextUtils.isEmpty(c)) {
                                                if (TextUtils.isEmpty(a.getRewardTemplateMode().mo43510d())) {
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put("id", optString);
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 1);
                                                    jSONObject2.put("error", "data is null");
                                                    jSONObject.put("data", jSONObject2);
                                                    C6563g.m16891a().mo44522a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                                                } else {
                                                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(z, windVaneWebView, a, arrayList, c, b, optString) {

                                                        /* renamed from: a */
                                                        final /* synthetic */ boolean f16544a;

                                                        /* renamed from: b */
                                                        final /* synthetic */ WindVaneWebView f16545b;

                                                        /* renamed from: c */
                                                        final /* synthetic */ CampaignEx f16546c;

                                                        /* renamed from: d */
                                                        final /* synthetic */ List f16547d;

                                                        /* renamed from: e */
                                                        final /* synthetic */ String f16548e;

                                                        /* renamed from: f */
                                                        final /* synthetic */ C7179c f16549f;

                                                        /* renamed from: g */
                                                        final /* synthetic */ String f16550g;

                                                        {
                                                            this.f16544a = r2;
                                                            this.f16545b = r3;
                                                            this.f16546c = r4;
                                                            this.f16547d = r5;
                                                            this.f16548e = r6;
                                                            this.f16549f = r7;
                                                            this.f16550g = r8;
                                                        }

                                                        public final void run() {
                                                            C6759c.m17020a(C6759c.this, this.f16544a, this.f16545b, this.f16546c.getRewardTemplateMode().mo43510d(), 0, this.f16546c, this.f16547d, C7191g.m18286a().mo49220b(this.f16546c.getRewardTemplateMode().mo43510d()), this.f16548e, this.f16549f, this.f16550g, C6759c.this.f16527d);
                                                        }
                                                    }, (long) (i2 * 1000));
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        if (MBridgeConstans.DEBUG) {
                                            C6361q.m16158d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        C6361q.m16158d("RVWindVaneWebView", th.getMessage());
                                        return;
                                    }
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3.put("id", optString);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put(IronSourceConstants.EVENTS_RESULT, 2);
                                    jSONObject4.put("error", "data is null");
                                    jSONObject3.put("data", jSONObject4);
                                    C6563g.m16891a().mo44522a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                                } catch (Exception e2) {
                                    if (MBridgeConstans.DEBUG) {
                                        C6361q.m16158d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                                    }
                                }
                            }
                            this.f16579r++;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        /* renamed from: a */
        public final void mo44023a(WebView webView, String str) {
            Runnable runnable;
            super.mo44023a(webView, str);
            if (!this.f16577p) {
                C6801a.m17157c(this.f16572k, C6122a.m15302b().mo42895d(), "preload tpl onPageFinish", this.f16568g, this.f16565d, this.f16570i, this.f16572k.getRequestIdNotice());
                String str2 = this.f16568g + "_" + this.f16567f;
                if (!str.contains("wfr=1")) {
                    C7203i.m18311a().mo49233d(this.f16568g + "_" + this.f16570i + "_" + this.f16567f, true);
                    Handler handler = this.f16562a;
                    if (!(handler == null || (runnable = this.f16563b) == null)) {
                        handler.removeCallbacks(runnable);
                    }
                    C7165a.C7166a aVar = this.f16571j;
                    if (aVar != null) {
                        aVar.mo49057a(true);
                    }
                    C6773j jVar = this.f16575n;
                    if (jVar != null) {
                        jVar.mo46994a(str2, this.f16569h, this.f16568g, this.f16570i, this.f16567f, this.f16571j);
                    }
                }
                C6563g.m16891a().mo44521a(webView);
                this.f16577p = true;
            }
        }

        /* renamed from: a */
        public final void mo44021a(WebView webView, int i, String str, String str2) {
            super.mo44021a(webView, i, str, str2);
            C7203i.m18311a().mo49233d(this.f16568g + "_" + this.f16570i + "_" + this.f16567f, false);
            if (this.f16575n != null) {
                String str3 = this.f16568g + "_" + this.f16567f;
                C7165a.C7166a aVar = this.f16571j;
                if (aVar != null) {
                    aVar.mo49057a(false);
                }
                this.f16575n.mo46995a(str3, this.f16569h, this.f16568g, this.f16570i, this.f16567f, this.f16571j, str);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$l */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C6777l extends C6532b {

        /* renamed from: a */
        private String f16650a;

        /* renamed from: b */
        private final boolean f16651b;

        /* renamed from: c */
        private final WindVaneWebView f16652c;

        /* renamed from: d */
        private final String f16653d;

        /* renamed from: e */
        private final String f16654e;

        /* renamed from: f */
        private final C7165a.C7166a f16655f;

        /* renamed from: g */
        private final CampaignEx f16656g;

        /* renamed from: h */
        private boolean f16657h;

        /* renamed from: i */
        private String f16658i;

        /* renamed from: j */
        private boolean f16659j;

        /* renamed from: k */
        private boolean f16660k;

        public C6777l(String str, boolean z, WindVaneWebView windVaneWebView, String str2, String str3, C7165a.C7166a aVar, CampaignEx campaignEx, boolean z2, String str4) {
            this.f16651b = z;
            this.f16652c = windVaneWebView;
            this.f16653d = str2;
            this.f16654e = str3;
            this.f16655f = aVar;
            this.f16656g = campaignEx;
            this.f16650a = str;
            this.f16657h = z2;
            this.f16658i = str4;
        }

        /* renamed from: a */
        public final void mo44020a(WebView webView, int i) {
            if (!this.f16660k) {
                if (this.f16652c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f16650a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, i);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        C6563g.m16891a().mo44522a((WebView) this.f16652c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C6361q.m16158d("WindVaneWebView", e.getLocalizedMessage());
                        }
                    }
                }
                String str = this.f16654e + "_" + this.f16656g.getId() + "_" + this.f16656g.getRequestId() + "_" + this.f16653d;
                if (i == 1) {
                    C7203i.m18311a().mo49233d(this.f16654e + "_" + this.f16658i + "_" + this.f16653d, true);
                    C7165a.C7166a aVar = this.f16655f;
                    if (aVar != null) {
                        aVar.mo49057a(true);
                    }
                    if (this.f16651b) {
                        if (this.f16656g.isBidCampaign()) {
                            C7165a.m18059a(str, this.f16655f, false, this.f16657h);
                        } else {
                            C7165a.m18059a(str, this.f16655f, false, this.f16657h);
                        }
                    } else if (this.f16656g.isBidCampaign()) {
                        C7165a.m18059a(str, this.f16655f, false, this.f16657h);
                    } else {
                        C7165a.m18059a(str, this.f16655f, false, this.f16657h);
                    }
                } else {
                    C7203i.m18311a().mo49233d(this.f16654e + "_" + this.f16658i + "_" + this.f16653d, false);
                    C7165a.C7166a aVar2 = this.f16655f;
                    if (aVar2 != null) {
                        aVar2.mo49057a(false);
                    }
                }
                this.f16660k = true;
            }
        }

        /* renamed from: a */
        public final void mo44021a(WebView webView, int i, String str, String str2) {
            C7203i a = C7203i.m18311a();
            a.mo49233d(this.f16654e + "_" + this.f16658i + "_" + this.f16653d, false);
            C7165a.C7166a aVar = this.f16655f;
            if (aVar != null) {
                aVar.mo49057a(false);
            }
            if (this.f16652c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f16650a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    C6563g.m16891a().mo44522a((WebView) this.f16652c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C6361q.m16158d("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo44023a(WebView webView, String str) {
            if (!this.f16659j) {
                if (!str.contains("wfr=1")) {
                    if (this.f16652c != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", this.f16650a);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 1);
                            jSONObject2.put("error", "");
                            jSONObject.put("data", jSONObject2);
                            C6563g.m16891a().mo44522a((WebView) this.f16652c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                C6361q.m16158d("WindVaneWebView", e.getLocalizedMessage());
                            }
                        }
                    }
                    C7203i.m18311a().mo49233d(this.f16654e + "_" + this.f16658i + "_" + this.f16653d, true);
                    C7165a.C7166a aVar = this.f16655f;
                    if (aVar != null) {
                        aVar.mo49057a(true);
                    }
                    String str2 = this.f16654e + "_" + this.f16656g.getId() + "_" + this.f16656g.getRequestId() + "_" + this.f16653d;
                    if (this.f16651b) {
                        if (this.f16656g.isBidCampaign()) {
                            C7165a.m18058a(287, this.f16656g.getRequestIdNotice(), this.f16655f);
                        } else {
                            C7165a.m18059a(str2, this.f16655f, false, this.f16657h);
                        }
                    } else if (this.f16656g.isBidCampaign()) {
                        C7165a.m18058a(94, this.f16656g.getRequestIdNotice(), this.f16655f);
                    } else {
                        C7165a.m18059a(str2, this.f16655f, false, this.f16657h);
                    }
                }
                C6563g.m16891a().mo44521a(webView);
                this.f16659j = true;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$a */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C6764a {

        /* renamed from: a */
        boolean f16553a;

        /* renamed from: b */
        boolean f16554b;

        /* renamed from: c */
        int f16555c;

        /* renamed from: d */
        int f16556d;

        /* renamed from: e */
        String f16557e;

        /* renamed from: f */
        String f16558f;

        /* renamed from: g */
        int f16559g;

        /* renamed from: h */
        List<CampaignEx> f16560h;

        /* renamed from: i */
        CopyOnWriteArrayList<CampaignEx> f16561i;

        public C6764a(boolean z, boolean z2, int i, int i2, String str, String str2, int i3, List<CampaignEx> list) {
            this.f16553a = z;
            this.f16554b = z2;
            this.f16555c = i;
            this.f16556d = i2;
            this.f16557e = str;
            this.f16558f = str2;
            this.f16559g = i3;
            this.f16560h = list;
            this.f16561i = new CopyOnWriteArrayList<>(list);
        }
    }

    /* renamed from: b */
    public final synchronized void mo47019b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6759c.this.m17024d();
                }
            });
        } else {
            m17024d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m17024d() {
        try {
            if (this.f16528e == null) {
                this.f16528e = new ArrayList();
            }
            Context d = C6122a.m15302b().mo42895d();
            if (d != null) {
                this.f16528e.add(new WindVaneWebView(d));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private synchronized WindVaneWebView m17017a(boolean z) {
        if (this.f16528e == null || this.f16528e.size() <= 0) {
            Context d = C6122a.m15302b().mo42895d();
            if (d != null) {
                this.f16528e.add(new WindVaneWebView(d));
                if (z) {
                    this.f16528e.add(new WindVaneWebView(d));
                }
            }
            return null;
        }
        return this.f16528e.remove(0);
    }

    /* renamed from: a */
    static /* synthetic */ void m17020a(C6759c cVar, boolean z, WindVaneWebView windVaneWebView, String str, int i, CampaignEx campaignEx, List list, String str2, String str3, C7179c cVar2, String str4, boolean z2) {
        C7062j jVar;
        String str5;
        CampaignEx campaignEx2 = campaignEx;
        List list2 = list;
        String str6 = str3;
        try {
            C7165a.C7166a aVar = new C7165a.C7166a();
            WindVaneWebView a = C6778m.f16661a.m17017a(false);
            if (a == null) {
                a = new WindVaneWebView(C6122a.m15302b().mo42895d());
            }
            WindVaneWebView windVaneWebView2 = a;
            aVar.mo49055a(windVaneWebView2);
            if (list2 == null || list.size() <= 0) {
                jVar = new C7062j((Activity) null, campaignEx2);
                str5 = campaignEx.getRequestId();
            } else {
                List<CampaignEx> a2 = C7184c.getInstance().mo49204a(str6);
                if (a2 != null && a2.size() > 0) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        CampaignEx campaignEx3 = (CampaignEx) list2.get(i2);
                        for (CampaignEx next : a2) {
                            if (next.getId().equals(campaignEx3.getId()) && next.getRequestId().equals(campaignEx3.getRequestId())) {
                                campaignEx3.setReady(true);
                                list2.set(i2, campaignEx3);
                            }
                        }
                    }
                }
                jVar = new C7062j((Activity) null, campaignEx2, list2);
                str5 = ((CampaignEx) list2.get(0)).getRequestId();
            }
            String str7 = str5;
            C7062j jVar2 = jVar;
            jVar2.mo48801a(i);
            jVar2.mo48806a(str6);
            jVar2.mo48840c(str4);
            jVar2.mo48805a(cVar2);
            jVar2.mo48843d(z);
            windVaneWebView2.setWebViewListener(new C6777l(str4, false, windVaneWebView, str, str3, aVar, campaignEx, z2, str7));
            windVaneWebView2.setObject(jVar2);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str7);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C6361q.m16158d("RewardCampaignsResourceManager", e.getLocalizedMessage());
            }
        }
    }
}
