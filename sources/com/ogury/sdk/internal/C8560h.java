package com.ogury.sdk.internal;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.ogury.core.internal.network.OguryNetworkClient;
import com.ogury.core.internal.network.OguryNetworkResponse;
import org.json.JSONException;

/* renamed from: com.ogury.sdk.internal.h */
/* compiled from: MonitoringInfoSender.kt */
public final class C8560h {

    /* renamed from: a */
    private final C8558f f21782a;

    /* renamed from: b */
    private final C8559g f21783b;

    static {
        new C8561a((byte) 0);
    }

    public C8560h(C8558f fVar, C8559g gVar) {
        C8567m.m24059b(fVar, "monitoringInfoHelper");
        C8567m.m24059b(gVar, "monitoringInfoJsonSerializer");
        this.f21782a = fVar;
        this.f21783b = gVar;
    }

    /* renamed from: a */
    public final OguryNetworkResponse mo54043a(C8552b bVar) throws JSONException {
        C8567m.m24059b(bVar, "monitoringInfo");
        OguryNetworkResponse post = new OguryNetworkClient(PathInterpolatorCompat.MAX_NUM_POINTS, PathInterpolatorCompat.MAX_NUM_POINTS).post("https://sdk-monitoring.ogury.co/sdk-versions", this.f21783b.mo54042a(bVar), new C8564j(this.f21782a));
        C8567m.m24057a((Object) post, "oguryNetworkClient.post(…er(monitoringInfoHelper))");
        return post;
    }

    /* renamed from: com.ogury.sdk.internal.h$a */
    /* compiled from: MonitoringInfoSender.kt */
    public static final class C8561a {
        private C8561a() {
        }

        public /* synthetic */ C8561a(byte b) {
            this();
        }
    }
}
