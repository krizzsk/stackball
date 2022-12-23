package com.mbridge.msdk.mbbid.common.p204c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.same.report.p183d.C6327b;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;

/* renamed from: com.mbridge.msdk.mbbid.common.c.a */
/* compiled from: BidReport */
public class C6522a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f16273a = C6522a.class.getName();

    /* renamed from: a */
    public static void m16763a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("key=");
                sb.append("2000064");
                sb.append("&");
                sb.append("result=");
                sb.append("1");
                sb.append("&");
                sb.append("network_type=");
                sb.append(C6349m.m16123n(context));
                sb.append("&");
                sb.append("bidid=");
                sb.append(str2);
                if (C6301a.m15945a().mo43913c()) {
                    C6301a.m15945a().mo43911a(sb.toString());
                    return;
                }
                new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(sb.toString(), context, str), new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                        C6361q.m16158d(C6522a.f16273a, str);
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                        C6361q.m16158d(C6522a.f16273a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f16273a, e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m16764b(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a("key=" + "2000064" + "&" + "result=" + "2" + "&" + "network_type=" + C6349m.m16123n(context) + "&" + "reason=" + str2, context, str), new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                        C6361q.m16158d(C6522a.f16273a, str);
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                        C6361q.m16158d(C6522a.f16273a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f16273a, e.getMessage());
            }
        }
    }
}
