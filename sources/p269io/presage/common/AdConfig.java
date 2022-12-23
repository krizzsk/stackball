package p269io.presage.common;

import com.ogury.p245ed.internal.C8467mq;

@Deprecated
/* renamed from: io.presage.common.AdConfig */
public final class AdConfig {
    private final String adUnitId;
    private String campaignId;
    private String creativeId;

    public AdConfig(String str) {
        C8467mq.m23881b(str, "adUnitId");
        this.adUnitId = str;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }
}
