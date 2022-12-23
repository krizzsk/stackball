package com.ogury.p245ed.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.p245ed.OguryAdImpressionListener;

/* renamed from: com.ogury.ed.internal.e */
public final class C8182e implements C8381k {

    /* renamed from: a */
    public static final C8183a f21170a = new C8183a((byte) 0);

    /* renamed from: b */
    private final OguryAdImpressionListener f21171b;

    public C8182e(OguryAdImpressionListener oguryAdImpressionListener) {
        C8467mq.m23881b(oguryAdImpressionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f21171b = oguryAdImpressionListener;
    }

    /* renamed from: com.ogury.ed.internal.e$a */
    public static final class C8183a {
        public /* synthetic */ C8183a(byte b) {
            this();
        }

        private C8183a() {
        }

        /* renamed from: a */
        public static C8182e m22793a(OguryAdImpressionListener oguryAdImpressionListener) {
            if (oguryAdImpressionListener != null) {
                return new C8182e(oguryAdImpressionListener);
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo53327a() {
        this.f21171b.onAdImpression();
    }
}
