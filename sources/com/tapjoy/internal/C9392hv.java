package com.tapjoy.internal;

import android.graphics.Point;
import java.net.URL;

/* renamed from: com.tapjoy.internal.hv */
public final class C9392hv {

    /* renamed from: d */
    public static final C9093bi f23287d = new C9093bi() {
        /* renamed from: b */
        private static Point m25224b(C9101bn bnVar) {
            bnVar.mo57868h();
            Point point = null;
            while (bnVar.mo57870j()) {
                if ("offset".equals(bnVar.mo57872l())) {
                    bnVar.mo57868h();
                    int i = 0;
                    int i2 = 0;
                    while (bnVar.mo57870j()) {
                        String l = bnVar.mo57872l();
                        if ("x".equals(l)) {
                            i = bnVar.mo57878r();
                        } else if ("y".equals(l)) {
                            i2 = bnVar.mo57878r();
                        } else {
                            bnVar.mo57879s();
                        }
                    }
                    bnVar.mo57869i();
                    point = new Point(i, i2);
                } else {
                    bnVar.mo57879s();
                }
            }
            bnVar.mo57869i();
            return point;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57847a(C9101bn bnVar) {
            bnVar.mo57868h();
            C9396hx hxVar = null;
            Point point = null;
            Point point2 = null;
            while (bnVar.mo57870j()) {
                String l = bnVar.mo57872l();
                if ("image".equals(l)) {
                    String m = bnVar.mo57873m();
                    if (!C9465jq.m25449c(m)) {
                        hxVar = new C9396hx(new URL(m));
                    }
                } else if ("landscape".equals(l)) {
                    point = m25224b(bnVar);
                } else if ("portrait".equals(l)) {
                    point2 = m25224b(bnVar);
                } else {
                    bnVar.mo57879s();
                }
            }
            bnVar.mo57869i();
            return new C9392hv(hxVar, point, point2);
        }
    };

    /* renamed from: a */
    public final C9396hx f23288a;

    /* renamed from: b */
    public final Point f23289b;

    /* renamed from: c */
    public final Point f23290c;

    public C9392hv(C9396hx hxVar, Point point, Point point2) {
        this.f23288a = hxVar;
        this.f23289b = point;
        this.f23290c = point2;
    }
}
