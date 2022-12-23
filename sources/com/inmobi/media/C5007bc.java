package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* renamed from: com.inmobi.media.bc */
/* compiled from: AdFetchFailureException */
public final class C5007bc extends RuntimeException {

    /* renamed from: a */
    public final InMobiAdRequestStatus f11357a;

    public C5007bc(InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f11357a = inMobiAdRequestStatus;
    }

    public final String getMessage() {
        return this.f11357a.getMessage();
    }
}
