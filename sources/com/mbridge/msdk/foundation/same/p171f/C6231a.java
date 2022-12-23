package com.mbridge.msdk.foundation.same.p171f;

import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.same.report.p183d.C6327b;
import com.mbridge.msdk.foundation.tools.C6361q;

/* renamed from: com.mbridge.msdk.foundation.same.f.a */
/* compiled from: ReportTask */
public final class C6231a implements Runnable {

    /* renamed from: a */
    private String f15481a;

    /* renamed from: b */
    private String f15482b;

    public C6231a(String str, String str2) {
        this.f15481a = str;
        this.f15482b = str2;
    }

    public final void run() {
        try {
            new C6326a(C6122a.m15302b().mo42895d()).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(this.f15481a, C6122a.m15302b().mo42895d(), this.f15482b), new C6327b() {
                /* renamed from: a */
                public final void mo43811a(String str) {
                    C6361q.m16158d("ReportTask", str);
                }

                /* renamed from: b */
                public final void mo43812b(String str) {
                    C6361q.m16158d("ReportTask", str);
                }
            });
        } catch (Throwable th) {
            C6361q.m16158d("ReportTask", th.getMessage());
        }
    }
}
