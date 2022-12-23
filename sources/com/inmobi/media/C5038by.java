package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.inmobi.media.by */
/* compiled from: AdNetworkResponse */
public final class C5038by {

    /* renamed from: a */
    public C5300gd f11499a;

    /* renamed from: b */
    public InMobiAdRequestStatus f11500b;

    /* renamed from: c */
    private C5037bx f11501c;

    public C5038by(C5037bx bxVar, C5300gd gdVar) {
        this.f11501c = bxVar;
        this.f11499a = gdVar;
        if (gdVar.f12145a != null) {
            int i = this.f11499a.f12145a.f12120a;
            if (i == -8) {
                this.f11500b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
            } else if (i == -7) {
                this.f11500b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                if (this.f11499a.f12145a.f12121b != null) {
                    this.f11500b.setCustomMessage(this.f11499a.f12145a.f12121b);
                }
            } else if (i != 0) {
                switch (i) {
                    case TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL /*500*/:
                    case IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE /*501*/:
                    case IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /*502*/:
                    case 503:
                    case IronSourceError.ERROR_CODE_KEY_NOT_SET /*505*/:
                        this.f11500b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                        return;
                    case 504:
                        this.f11500b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                        return;
                    default:
                        this.f11500b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                        return;
                }
            } else {
                this.f11500b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
            }
        }
    }
}
