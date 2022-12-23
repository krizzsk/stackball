package com.smaato.sdk.p257ub;

import com.smaato.sdk.log.Logger;
import com.smaato.sdk.p246ad.AdCache;
import com.smaato.sdk.util.Predicate;

/* renamed from: com.smaato.sdk.ub.UbCache */
public final class UbCache {
    private final AdCache<AdMarkup> adCache;

    static /* synthetic */ boolean lambda$put$0(AdMarkup adMarkup) {
        return true;
    }

    public UbCache(AdCache<AdMarkup> adCache2) {
        this.adCache = adCache2;
    }

    public final UbId put(AdMarkup adMarkup) {
        if (adMarkup != null) {
            Logger.m24079i("Saving an ad: adFormat = \"%1$s\", adSpaceId = \"%2$s\", sessionId = \"%3$s\"", adMarkup.adFormat(), adMarkup.adSpaceId(), adMarkup.sessionId());
            while (!this.adCache.put(adMarkup.adSpaceId(), adMarkup)) {
                AdMarkup andRemove = this.adCache.getAndRemove(adMarkup.adSpaceId(), $$Lambda$UbCache$TyS2LDznbfUDZ9mZHGmCLPN6nU.INSTANCE);
                if (andRemove != null) {
                    Logger.m24079i("Removed an ad: adFormat = \"%1$s\", adSpaceId = \"%2$s\", sessionId = \"%3$s\"", andRemove.adFormat(), andRemove.adSpaceId(), andRemove.sessionId());
                }
            }
            Logger.m24079i("Successfully saved an ad: adFormat = \"%1$s\", adSpaceId = \"%2$s\", sessionId = \"%3$s\"", adMarkup.adFormat(), adMarkup.adSpaceId(), adMarkup.sessionId());
            return UbId.builder().sessionId(adMarkup.sessionId()).adSpaceId(adMarkup.adSpaceId()).build();
        }
        throw new NullPointerException("'adMarkup' specified as non-null is null");
    }

    public final AdMarkup get(UbId ubId) {
        if (ubId != null) {
            return this.adCache.getAndRemove(ubId.adSpaceId(), new Predicate() {
                public final boolean test(Object obj) {
                    return ((AdMarkup) obj).sessionId().equals(UbId.this.sessionId());
                }
            });
        }
        throw new NullPointerException("'ubId' specified as non-null is null");
    }
}
