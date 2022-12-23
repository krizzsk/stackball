package com.mbridge.msdk.foundation.p164db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.net.URLEncoder;

/* renamed from: com.mbridge.msdk.foundation.db.p */
/* compiled from: VideoReportDataDao */
public class C6158p extends C6137a<C6203m> {

    /* renamed from: a */
    private static final String f15228a = C6158p.class.getName();

    /* renamed from: b */
    private static C6158p f15229b = null;

    private C6158p(C6146e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public static synchronized C6158p m15475a(C6146e eVar) {
        C6158p pVar;
        synchronized (C6158p.class) {
            if (f15229b == null) {
                f15229b = new C6158p(eVar);
            }
            pVar = f15229b;
        }
        return pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x030e, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0330 A[SYNTHETIC, Splitter:B:117:0x0330] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0338 A[Catch:{ all -> 0x0334 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.C6203m> mo43040a(java.lang.String r26) {
        /*
            r25 = this;
            r0 = r26
            monitor-enter(r25)
            boolean r1 = android.text.TextUtils.isEmpty(r26)     // Catch:{ all -> 0x033f }
            if (r1 != 0) goto L_0x033c
            android.database.sqlite.SQLiteDatabase r2 = r25.getReadableDatabase()     // Catch:{ Exception -> 0x0320, all -> 0x031d }
            java.lang.String r3 = "reward_report"
            r4 = 0
            java.lang.String r5 = "key=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0320, all -> 0x031d }
            r12 = 0
            r6[r12] = r0     // Catch:{ Exception -> 0x0320, all -> 0x031d }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0320, all -> 0x031d }
            if (r13 == 0) goto L_0x0316
            int r1 = r13.getCount()     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            if (r1 <= 0) goto L_0x0316
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            r14.<init>()     // Catch:{ Exception -> 0x0313, all -> 0x030f }
        L_0x002c:
            boolean r1 = r13.moveToNext()     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            if (r1 == 0) goto L_0x0306
            java.lang.String r1 = "key"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r3 = r13.getString(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "networkType"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            int r4 = r13.getInt(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "network_str"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r7 = r13.getString(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "isCompleteView"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            r13.getInt(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "watchedMillis"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            r13.getInt(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "videoLength"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            int r18 = r13.getInt(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "offerUrl"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r5 = r13.getString(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "reason"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r8 = r13.getString(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "result"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            int r6 = r13.getInt(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "duration"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r21 = r13.getString(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "videoSize"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            int r22 = r13.getInt(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "campaignId"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r9 = r13.getString(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = "video_url"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r2 = "unitId"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r15 = r13.getString(r2)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r2 = "rid"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r10 = "rid_n"
            int r10 = r13.getColumnIndex(r10)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r10 = r13.getString(r10)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r12 = "ad_type"
            int r12 = r13.getColumnIndex(r12)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r12 = r13.getString(r12)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r11 = "resource_type"
            int r11 = r13.getColumnIndex(r11)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r11 = r13.getString(r11)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            r16 = r2
            java.lang.String r2 = "device_id"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            r17 = r2
            java.lang.String r2 = "creative"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            r19 = r2
            java.lang.String r2 = "2000021"
            boolean r2 = r0.equals(r2)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            if (r2 == 0) goto L_0x0127
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0124 }
            r12 = r16
            r2 = r11
            r6 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0124 }
            r11.mo43747n(r9)     // Catch:{ Exception -> 0x0124 }
            r11.mo43729e((java.lang.String) r1)     // Catch:{ Exception -> 0x0124 }
            r11.mo43741k(r12)     // Catch:{ Exception -> 0x0124 }
            r11.mo43743l(r10)     // Catch:{ Exception -> 0x0124 }
            r11.mo43745m(r15)     // Catch:{ Exception -> 0x0124 }
            r1 = r0
            r3 = r13
            r24 = r14
            goto L_0x02bc
        L_0x0124:
            r0 = move-exception
            goto L_0x0322
        L_0x0127:
            r2 = r16
            r16 = r15
            java.lang.String r15 = "2000022"
            boolean r15 = r0.equals(r15)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            if (r15 == 0) goto L_0x015d
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0124 }
            r24 = r14
            r14 = r16
            r15 = r11
            r16 = r3
            r17 = r4
            r19 = r5
            r20 = r6
            r23 = r7
            r15.<init>((java.lang.String) r16, (int) r17, (int) r18, (java.lang.String) r19, (int) r20, (java.lang.String) r21, (int) r22, (java.lang.String) r23)     // Catch:{ Exception -> 0x0124 }
            r11.mo43747n(r9)     // Catch:{ Exception -> 0x0124 }
            r11.mo43729e((java.lang.String) r1)     // Catch:{ Exception -> 0x0124 }
            r11.mo43741k(r2)     // Catch:{ Exception -> 0x0124 }
            r11.mo43743l(r10)     // Catch:{ Exception -> 0x0124 }
            r11.mo43745m(r14)     // Catch:{ Exception -> 0x0124 }
            r11.mo43751p(r8)     // Catch:{ Exception -> 0x0124 }
            r11.mo43735h((java.lang.String) r12)     // Catch:{ Exception -> 0x0124 }
            goto L_0x0179
        L_0x015d:
            r24 = r14
            r14 = r16
            java.lang.String r1 = "2000025"
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            if (r1 == 0) goto L_0x017d
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0124 }
            r15 = r11
            r16 = r3
            r17 = r4
            r19 = r5
            r20 = r6
            r23 = r7
            r15.<init>((java.lang.String) r16, (int) r17, (int) r18, (java.lang.String) r19, (int) r20, (java.lang.String) r21, (int) r22, (java.lang.String) r23)     // Catch:{ Exception -> 0x0124 }
        L_0x0179:
            r1 = r0
            r3 = r13
            goto L_0x02bc
        L_0x017d:
            java.lang.String r1 = "2000024"
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            if (r1 == 0) goto L_0x018d
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0124 }
            r2 = r11
            r6 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0124 }
            goto L_0x0179
        L_0x018d:
            java.lang.String r1 = "2000039"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            if (r1 == 0) goto L_0x01a5
            java.lang.String r1 = "h5_click_data"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x0124 }
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0124 }
            r11.<init>(r1)     // Catch:{ Exception -> 0x0124 }
            goto L_0x0179
        L_0x01a5:
            java.lang.String r1 = "2000043"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x0313, all -> 0x030f }
            if (r1 == 0) goto L_0x0216
            java.lang.String r1 = "type"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0211, all -> 0x020a }
            java.lang.String r15 = r13.getString(r1)     // Catch:{ Exception -> 0x0211, all -> 0x020a }
            java.lang.String r1 = "endcard_url"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x0211, all -> 0x020a }
            java.lang.String r5 = r13.getString(r1)     // Catch:{ Exception -> 0x0211, all -> 0x020a }
            com.mbridge.msdk.foundation.entity.m r7 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0211, all -> 0x020a }
            r1 = r7
            r4 = r2
            r16 = r13
            r3 = r17
            r13 = r19
            r2 = r26
            r0 = r3
            r3 = r6
            r6 = r4
            r4 = r21
            r13 = r6
            r6 = r9
            r17 = r0
            r0 = r7
            r7 = r14
            r14 = r9
            r9 = r15
            r1.<init>((java.lang.String) r2, (int) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x0205, all -> 0x0203 }
            r0.mo43741k(r13)     // Catch:{ Exception -> 0x0205, all -> 0x0203 }
            r0.mo43743l(r10)     // Catch:{ Exception -> 0x0205, all -> 0x0203 }
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x0205, all -> 0x0203 }
            if (r1 != 0) goto L_0x01ec
            r0.mo43747n(r14)     // Catch:{ Exception -> 0x0205, all -> 0x0203 }
        L_0x01ec:
            r0.mo43735h((java.lang.String) r12)     // Catch:{ Exception -> 0x0205, all -> 0x0203 }
            r0.mo43719a((java.lang.String) r11)     // Catch:{ Exception -> 0x0205, all -> 0x0203 }
            r1 = r17
            r0.mo43722b((java.lang.String) r1)     // Catch:{ Exception -> 0x0205, all -> 0x0203 }
            r2 = r19
            r0.mo43725c((java.lang.String) r2)     // Catch:{ Exception -> 0x0205, all -> 0x0203 }
            r1 = r26
            r11 = r0
            r3 = r16
            goto L_0x02bc
        L_0x0203:
            r0 = move-exception
            goto L_0x020d
        L_0x0205:
            r0 = move-exception
            r13 = r16
            goto L_0x0322
        L_0x020a:
            r0 = move-exception
            r16 = r13
        L_0x020d:
            r10 = r16
            goto L_0x0336
        L_0x0211:
            r0 = move-exception
            r16 = r13
            goto L_0x0322
        L_0x0216:
            r0 = r9
            r16 = r13
            r1 = r17
            r13 = r2
            r2 = r19
            java.lang.String r3 = "2000045"
            r5 = r1
            r1 = r26
            boolean r3 = r3.equals(r1)     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
            if (r3 == 0) goto L_0x0256
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
            r11.<init>()     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
            r11.mo43749o(r1)     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
            r11.mo43721b((int) r4)     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
            r11.mo43724c((int) r6)     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
            r11.mo43747n(r0)     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
            java.lang.String r0 = "template_url"
            r3 = r16
            int r0 = r3.getColumnIndex(r0)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43737i(r0)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43751p(r8)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43741k(r13)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43743l(r10)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43745m(r14)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            goto L_0x02bc
        L_0x0256:
            r3 = r16
            java.lang.String r7 = "2000044"
            boolean r7 = r7.equals(r1)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            if (r7 == 0) goto L_0x0288
            com.mbridge.msdk.foundation.entity.m r11 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.<init>()     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43749o(r1)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43721b((int) r4)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43747n(r0)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            java.lang.String r0 = "image_url"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43727d((java.lang.String) r0)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43751p(r8)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43741k(r13)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43743l(r10)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11.mo43745m(r14)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            goto L_0x02bc
        L_0x0288:
            java.lang.String r7 = "2000054"
            boolean r7 = r7.equals(r1)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            if (r7 == 0) goto L_0x02bb
            com.mbridge.msdk.foundation.entity.m r7 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.<init>()     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43749o(r1)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43719a((java.lang.String) r11)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43745m(r14)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43722b((java.lang.String) r5)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43735h((java.lang.String) r12)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43747n(r0)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43741k(r13)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43743l(r10)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43724c((int) r6)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43751p(r8)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43721b((int) r4)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r7.mo43725c((java.lang.String) r2)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r11 = r7
            goto L_0x02bc
        L_0x02bb:
            r11 = 0
        L_0x02bc:
            if (r11 == 0) goto L_0x02c4
            r0 = r24
            r0.add(r11)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            goto L_0x02c6
        L_0x02c4:
            r0 = r24
        L_0x02c6:
            java.lang.String r2 = "id"
            int r2 = r3.getColumnIndex(r2)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            int r2 = r3.getInt(r2)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            android.database.sqlite.SQLiteDatabase r4 = r25.getWritableDatabase()     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            java.lang.String r5 = "reward_report"
            java.lang.String r6 = "id = ?"
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r9.<init>()     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r9.append(r2)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            java.lang.String r2 = ""
            r9.append(r2)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            java.lang.String r2 = r9.toString()     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r9 = 0
            r8[r9] = r2     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r4.delete(r5, r6, r8)     // Catch:{ Exception -> 0x02fb, all -> 0x02f9 }
            r14 = r0
            r0 = r1
            r13 = r3
            r11 = 1
            r12 = 0
            goto L_0x002c
        L_0x02f9:
            r0 = move-exception
            goto L_0x0311
        L_0x02fb:
            r0 = move-exception
        L_0x02fc:
            r13 = r3
            goto L_0x0322
        L_0x02fe:
            r0 = move-exception
            r3 = r16
            goto L_0x0311
        L_0x0302:
            r0 = move-exception
            r3 = r16
            goto L_0x02fc
        L_0x0306:
            r3 = r13
            r0 = r14
            if (r3 == 0) goto L_0x030d
            r3.close()     // Catch:{ all -> 0x033f }
        L_0x030d:
            monitor-exit(r25)
            return r0
        L_0x030f:
            r0 = move-exception
            r3 = r13
        L_0x0311:
            r10 = r3
            goto L_0x0336
        L_0x0313:
            r0 = move-exception
            r3 = r13
            goto L_0x0322
        L_0x0316:
            r3 = r13
            if (r3 == 0) goto L_0x033c
            r3.close()     // Catch:{ all -> 0x033f }
            goto L_0x033c
        L_0x031d:
            r0 = move-exception
            r10 = 0
            goto L_0x0336
        L_0x0320:
            r0 = move-exception
            r13 = 0
        L_0x0322:
            r0.printStackTrace()     // Catch:{ all -> 0x0334 }
            java.lang.String r1 = f15228a     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0334 }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r0)     // Catch:{ all -> 0x0334 }
            if (r13 == 0) goto L_0x033c
            r13.close()     // Catch:{ all -> 0x033f }
            goto L_0x033c
        L_0x0334:
            r0 = move-exception
            r10 = r13
        L_0x0336:
            if (r10 == 0) goto L_0x033b
            r10.close()     // Catch:{ all -> 0x033f }
        L_0x033b:
            throw r0     // Catch:{ all -> 0x033f }
        L_0x033c:
            monitor-exit(r25)
            r1 = 0
            return r1
        L_0x033f:
            r0 = move-exception
            monitor-exit(r25)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6158p.mo43040a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r0 == 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != 0) goto L_0x001b;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo43038a() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "select count(*) from reward_report"
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch:{ Exception -> 0x0021 }
            android.database.Cursor r0 = r3.rawQuery(r2, r0)     // Catch:{ Exception -> 0x0021 }
            if (r0 == 0) goto L_0x0019
            boolean r2 = r0.moveToFirst()     // Catch:{ Exception -> 0x0021 }
            if (r2 == 0) goto L_0x0019
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x0021 }
        L_0x0019:
            if (r0 == 0) goto L_0x0028
        L_0x001b:
            r0.close()     // Catch:{ all -> 0x0030 }
            goto L_0x0028
        L_0x001f:
            r1 = move-exception
            goto L_0x002a
        L_0x0021:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0028
            goto L_0x001b
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ all -> 0x0030 }
        L_0x002f:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p164db.C6158p.mo43038a():int");
    }

    /* renamed from: a */
    public final synchronized long mo43039a(C6203m mVar) {
        if (mVar != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(SDKConstants.PARAM_KEY, mVar.mo43746n());
                contentValues.put("networkType", Integer.valueOf(mVar.mo43759u()));
                contentValues.put("network_str", mVar.mo43760v());
                contentValues.put("isCompleteView", Integer.valueOf(mVar.mo43761w()));
                contentValues.put("watchedMillis", Integer.valueOf(mVar.mo43748o()));
                contentValues.put("videoLength", Integer.valueOf(mVar.mo43750p()));
                if (!TextUtils.isEmpty(mVar.mo43752q())) {
                    contentValues.put("offerUrl", mVar.mo43752q());
                }
                if (!TextUtils.isEmpty(mVar.mo43754r())) {
                    contentValues.put(IronSourceConstants.EVENTS_ERROR_REASON, URLEncoder.encode(mVar.mo43754r(), "utf-8"));
                }
                contentValues.put(IronSourceConstants.EVENTS_RESULT, Integer.valueOf(mVar.mo43762x()));
                contentValues.put("duration", mVar.mo43756s());
                contentValues.put("videoSize", Long.valueOf(mVar.mo43757t()));
                contentValues.put("type", mVar.mo43732g());
                String f = mVar.mo43730f();
                if (!TextUtils.isEmpty(f)) {
                    contentValues.put(CampaignEx.ENDCARD_URL, f);
                }
                String e = mVar.mo43728e();
                if (!TextUtils.isEmpty(e)) {
                    contentValues.put("video_url", e);
                }
                String j = mVar.mo43738j();
                if (!TextUtils.isEmpty(j)) {
                    contentValues.put("rid", j);
                }
                String k = mVar.mo43740k();
                if (!TextUtils.isEmpty(k)) {
                    contentValues.put("rid_n", k);
                }
                String i = mVar.mo43736i();
                if (!TextUtils.isEmpty(i)) {
                    contentValues.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_TEMPLATE_URL, i);
                }
                String d = mVar.mo43726d();
                if (!TextUtils.isEmpty(d)) {
                    contentValues.put("image_url", d);
                }
                String h = mVar.mo43734h();
                if (!TextUtils.isEmpty(h)) {
                    contentValues.put("ad_type", URLEncoder.encode(h, "utf-8"));
                }
                contentValues.put("unitId", mVar.mo43742l());
                contentValues.put("campaignId", mVar.mo43744m());
                if ("2000039".equals(mVar.mo43746n())) {
                    String f2 = C6203m.m15634f(mVar);
                    if (C6369x.m16236b(f2)) {
                        contentValues.put("h5_click_data", f2);
                    }
                }
                String a = mVar.mo43717a();
                if (!TextUtils.isEmpty(a)) {
                    contentValues.put("resource_type", URLEncoder.encode(a, "utf-8"));
                }
                String b = mVar.mo43720b();
                if (!TextUtils.isEmpty(b)) {
                    contentValues.put("device_id", URLEncoder.encode(b, "utf-8"));
                }
                String c = mVar.mo43723c();
                if (!TextUtils.isEmpty(c)) {
                    contentValues.put(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE, URLEncoder.encode(c, "utf-8"));
                }
                return getWritableDatabase().insert("reward_report", (String) null, contentValues);
            } catch (Exception e2) {
                e2.printStackTrace();
                C6361q.m16158d(f15228a, e2.getMessage());
            }
        }
        return -1;
    }
}
