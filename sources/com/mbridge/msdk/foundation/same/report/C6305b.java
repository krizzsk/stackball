package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p171f.C6231a;
import com.mbridge.msdk.foundation.tools.C6349m;

/* renamed from: com.mbridge.msdk.foundation.same.report.b */
/* compiled from: PlayableReportUtils */
public final class C6305b {

    /* renamed from: a */
    private static Handler f15666a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m15963a(CampaignEx campaignEx, String str, String str2, String str3) {
        if (campaignEx != null && campaignEx.isMraid()) {
            C6203m mVar = new C6203m("2000043", TextUtils.isEmpty(campaignEx.getMraid()) ^ true ? 1 : 3, AppEventsConstants.EVENT_PARAM_VALUE_NO, "", campaignEx.getId(), str2, str, String.valueOf(campaignEx.getKeyIaRst()));
            mVar.mo43747n(campaignEx.getId());
            mVar.mo43741k(campaignEx.getRequestId());
            mVar.mo43743l(campaignEx.getRequestIdNotice());
            mVar.mo43735h(str3);
            mVar.mo43721b(C6349m.m16123n(C6122a.m15302b().mo42895d()));
            mVar.mo43718a(campaignEx.isMraid() ? C6203m.f15357a : C6203m.f15358b);
            m15965a(mVar, str2);
        }
    }

    /* renamed from: a */
    public static void m15965a(C6203m mVar, String str) {
        if (mVar != null) {
            mVar.mo43722b(C6349m.m16113i());
            String d = C6203m.m15630d(mVar);
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(d);
            } else {
                m15967a(d, C6122a.m15302b().mo42895d(), str);
            }
        }
    }

    /* renamed from: a */
    public static void m15964a(C6203m mVar, Context context, String str) {
        if (mVar != null) {
            mVar.mo43749o("2000060");
            mVar.mo43745m(str);
            mVar.mo43721b(C6349m.m16123n(context));
            String b = C6203m.m15626b(mVar);
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(b);
            } else {
                m15967a(b, context, str);
            }
        }
    }

    /* renamed from: b */
    public static void m15969b(C6203m mVar, String str) {
        if (mVar != null) {
            mVar.mo43749o("2000059");
            mVar.mo43745m(str);
            mVar.mo43721b(C6349m.m16123n(C6122a.m15302b().mo42895d()));
            mVar.mo43722b(C6349m.m16113i());
            String c = C6203m.m15628c(mVar);
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(c);
            } else {
                m15967a(c, C6122a.m15302b().mo42895d(), str);
            }
        }
    }

    /* renamed from: a */
    public static void m15967a(String str, Context context, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            m15966a(new C6231a(str, str2));
        }
    }

    /* renamed from: b */
    public static void m15968b(C6203m mVar, Context context, String str) {
        String g = C6203m.m15636g(mVar);
        if (C6301a.m15945a().mo43913c()) {
            C6301a.m15945a().mo43911a(g);
        } else {
            m15967a(g, context, str);
        }
    }

    /* renamed from: c */
    public static void m15970c(C6203m mVar, Context context, String str) {
        String h = C6203m.m15638h(mVar);
        if (C6301a.m15945a().mo43913c()) {
            C6301a.m15945a().mo43911a(h);
        } else {
            m15967a(h, context, str);
        }
    }

    /* renamed from: d */
    public static void m15971d(C6203m mVar, Context context, String str) {
        if (mVar != null) {
            mVar.mo43749o("2000063");
            mVar.mo43745m(str);
            mVar.mo43721b(C6349m.m16123n(context));
            String a = C6203m.m15624a(mVar);
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(a);
            } else {
                m15967a(a, context, str);
            }
        }
    }

    /* renamed from: a */
    private static void m15966a(Runnable runnable) {
        Handler handler = f15666a;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
