package com.mbridge.msdk.p161c;

import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p161c.C6090a;

/* renamed from: com.mbridge.msdk.c.b */
/* compiled from: TimerController */
public class C6094b {

    /* renamed from: com.mbridge.msdk.c.b$a */
    /* compiled from: TimerController */
    static class C6096a {

        /* renamed from: a */
        static C6094b f15024a = new C6094b();
    }

    private C6094b() {
    }

    public static C6094b getInstance() {
        return C6096a.f15024a;
    }

    public void start() {
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        if (b == null) {
            b = C6076b.m15089a().mo42748b();
        }
        int d = b.mo42699d();
        if (d > 0) {
            C6090a.C6093a.f15023a.mo42800a((long) (d * 1000));
        }
    }

    public void addRewardList(String str, String str2) {
        C6090a.C6093a.f15023a.mo42801a(str, str2);
    }

    public void addInterstitialList(String str, String str2) {
        C6090a.C6093a.f15023a.mo42802b(str, str2);
    }
}
