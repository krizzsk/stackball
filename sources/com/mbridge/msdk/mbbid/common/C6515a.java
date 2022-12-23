package com.mbridge.msdk.mbbid.common;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.share.Constants;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.tools.C6348l;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6363s;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;

/* renamed from: com.mbridge.msdk.mbbid.common.a */
/* compiled from: AreaBidCommon */
public final class C6515a {
    /* renamed from: a */
    public static String m16740a(Context context, String str) {
        String str2 = "";
        StringBuffer stringBuffer = new StringBuffer();
        if (context != null) {
            try {
                if (C6122a.m15302b().mo42895d() == null) {
                    C6122a.m15302b().mo42886a(context);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        if (b == null) {
            b = C6076b.m15089a().mo42748b();
        }
        stringBuffer.append(C6349m.m16113i());
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C6349m.m16099c());
        stringBuffer.append("|");
        stringBuffer.append(C6349m.m16096b());
        stringBuffer.append("|");
        stringBuffer.append(C6349m.m16123n(context));
        stringBuffer.append("|");
        stringBuffer.append(MBConfiguration.SDK_VERSION);
        stringBuffer.append("|");
        stringBuffer.append(C6349m.m16111h(context));
        stringBuffer.append("x");
        stringBuffer.append(C6349m.m16112i(context));
        stringBuffer.append("|");
        stringBuffer.append(C6349m.m16103d());
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C6366u.m16189a(20));
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(C6204a.f15391a);
        stringBuffer.append("|");
        stringBuffer.append(C6349m.m16124o());
        stringBuffer.append("|");
        stringBuffer.append(C6349m.m16122n());
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C6363s.m16167b());
        stringBuffer.append("|");
        stringBuffer.append(C6363s.m16164a());
        stringBuffer.append("|");
        stringBuffer.append(str2);
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(C6121a.m15293a().mo42882b("b"));
        stringBuffer.append("|");
        stringBuffer.append(C6121a.m15293a().mo42882b(Constants.URL_CAMPAIGN));
        stringBuffer.append("|");
        stringBuffer.append(str2);
        String b2 = b != null ? b.mo42690b() : str2;
        stringBuffer.append("|");
        stringBuffer.append(b2);
        stringBuffer.append("|");
        stringBuffer.append(C6366u.m16211c());
        stringBuffer.append("|");
        String d = C6366u.m16216d();
        if (!TextUtils.isEmpty(d)) {
            str2 = d;
        }
        stringBuffer.append(str2);
        stringBuffer.append("|");
        stringBuffer.append(C6366u.m16223g(str));
        return C6348l.m16087a(stringBuffer.toString());
    }
}
