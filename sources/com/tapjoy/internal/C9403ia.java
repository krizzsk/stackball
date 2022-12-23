package com.tapjoy.internal;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tapjoy.internal.ia */
public final class C9403ia {

    /* renamed from: d */
    public static final C9093bi f23320d = new C9093bi() {
        /* renamed from: a */
        public final /* synthetic */ Object mo57847a(C9101bn bnVar) {
            return new C9403ia(bnVar);
        }
    };

    /* renamed from: a */
    public C9052aa f23321a = C9052aa.UNSPECIFIED;

    /* renamed from: b */
    public PointF f23322b;

    /* renamed from: c */
    public ArrayList f23323c = new ArrayList();

    public C9403ia(C9101bn bnVar) {
        bnVar.mo57868h();
        while (bnVar.mo57870j()) {
            String l = bnVar.mo57872l();
            if ("buttons".equals(l)) {
                if (bnVar.mo57871k() == C9110bs.BEGIN_ARRAY) {
                    bnVar.mo57854a((List) this.f23323c, C9400hz.f23305n);
                } else {
                    bnVar.mo57879s();
                }
            } else if ("window_aspect_ratio".equals(l)) {
                if (bnVar.mo57856a()) {
                    PointF pointF = new PointF();
                    bnVar.mo57868h();
                    while (bnVar.mo57870j()) {
                        String l2 = bnVar.mo57872l();
                        if ("width".equals(l2)) {
                            pointF.x = (float) bnVar.mo57876p();
                        } else if ("height".equals(l2)) {
                            pointF.y = (float) bnVar.mo57876p();
                        } else {
                            bnVar.mo57879s();
                        }
                    }
                    bnVar.mo57869i();
                    if (!(pointF.x == 0.0f || pointF.y == 0.0f)) {
                        this.f23322b = pointF;
                    }
                } else {
                    bnVar.mo57879s();
                }
            } else if ("orientation".equals(l)) {
                String m = bnVar.mo57873m();
                if ("landscape".equals(m)) {
                    this.f23321a = C9052aa.LANDSCAPE;
                } else if ("portrait".equals(m)) {
                    this.f23321a = C9052aa.PORTRAIT;
                }
            } else {
                bnVar.mo57879s();
            }
        }
        bnVar.mo57869i();
    }
}
