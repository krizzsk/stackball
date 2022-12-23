package com.chartboost.sdk.impl;

import android.text.TextUtils;
import com.chartboost.sdk.Banner.C1812a;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostError;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.C1894a;

/* renamed from: com.chartboost.sdk.impl.a0 */
class C1896a0 {
    /* renamed from: a */
    static void m4454a(C2022j jVar, String str, int i, C2018y yVar) {
        String str2 = yVar != null ? yVar.f4429i : "";
        if (i == 0) {
            m4459b(jVar, str, str2);
        } else if (i == 1) {
            m4460c(jVar, str, str2);
        } else if (i == 3) {
            m4456a(jVar, str, str2);
        }
    }

    /* renamed from: b */
    private static void m4459b(C2022j jVar, String str, String str2) {
        C1894a aVar = jVar.f5232v;
        aVar.getClass();
        m4453a(jVar, new C1894a.C1895a(4, str, CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE, (ChartboostError) null, false, str2));
    }

    /* renamed from: c */
    private static void m4460c(C2022j jVar, String str, String str2) {
        C1894a aVar = jVar.f5236z;
        aVar.getClass();
        m4453a(jVar, new C1894a.C1895a(4, str, CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE, (ChartboostError) null, false, str2));
    }

    /* renamed from: d */
    static void m4461d(C2022j jVar, String str, String str2) {
        C1812a a = jVar.f5222l.mo14476a(str);
        if (a != null) {
            C1904d g = a.mo14142g();
            if (g != null) {
                g.getClass();
                m4453a(jVar, new C1894a.C1895a(6, str, (CBError.CBImpressionError) null, new ChartboostCacheError(ChartboostCacheError.Code.INTERNAL), false, str2));
                return;
            }
            CBLogging.m3991a("OpenRTBErrorsHelper", "Banner trait is null");
        }
    }

    /* renamed from: e */
    private static void m4462e(C2022j jVar, String str, String str2) {
        C1894a g = jVar.mo14902g();
        g.getClass();
        m4453a(jVar, new C1894a.C1895a(4, str, CBError.CBImpressionError.INTERNAL, (ChartboostError) null, false, str2));
    }

    /* renamed from: f */
    private static void m4463f(C2022j jVar, String str, String str2) {
        C1894a i = jVar.mo14904i();
        i.getClass();
        m4453a(jVar, new C1894a.C1895a(4, str, CBError.CBImpressionError.INTERNAL, (ChartboostError) null, false, str2));
    }

    /* renamed from: a */
    private static void m4456a(C2022j jVar, String str, String str2) {
        C1812a a = jVar.f5222l.mo14476a(str);
        if (a != null) {
            C1904d g = a.mo14142g();
            g.getClass();
            m4453a(jVar, new C1894a.C1895a(4, str, (CBError.CBImpressionError) null, new ChartboostCacheError(ChartboostCacheError.Code.ASSET_DOWNLOAD_FAILURE), false, str2));
        }
    }

    /* renamed from: a */
    static void m4455a(C2022j jVar, String str, int i, String str2) {
        if (i == 0) {
            m4462e(jVar, str, str2);
        } else if (i == 1) {
            m4463f(jVar, str, str2);
        } else if (i == 3) {
            m4461d(jVar, str, str2);
        }
    }

    /* renamed from: a */
    private static void m4453a(C2022j jVar, C1894a.C1895a aVar) {
        jVar.mo14906k().post(aVar);
    }

    /* renamed from: a */
    static boolean m4458a(String str, String str2) {
        return m4457a(str) && m4457a(str2);
    }

    /* renamed from: a */
    private static boolean m4457a(String str) {
        return !TextUtils.isEmpty(str);
    }
}
