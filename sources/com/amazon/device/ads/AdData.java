package com.amazon.device.ads;

import java.util.Iterator;
import java.util.Set;

class AdData implements Iterable<AAXCreative> {
    static final String DEFAULT_METRICS_ENDPOINT = "https://fls-na.amazon.com/1/action-impressions/1/OE/mobile-ads-sas/action";
    private int adHeight;
    private int adWidth;
    private String creative;
    private Set<AAXCreative> creativeTypes;
    private long expirationTimeMs = -1;
    private boolean fetched;
    private String impPixelUrl;
    private String instrPixelUrl;
    private AdProperties properties;

    /* access modifiers changed from: protected */
    public String getCreative() {
        return this.creative;
    }

    /* access modifiers changed from: protected */
    public void setCreative(String str) {
        this.creative = str;
    }

    /* access modifiers changed from: protected */
    public AdProperties getProperties() {
        return this.properties;
    }

    /* access modifiers changed from: protected */
    public void setProperties(AdProperties adProperties) {
        this.properties = adProperties;
    }

    /* access modifiers changed from: protected */
    public Set<AAXCreative> getCreativeTypes() {
        return this.creativeTypes;
    }

    /* access modifiers changed from: protected */
    public void setCreativeTypes(Set<AAXCreative> set) {
        this.creativeTypes = set;
    }

    /* access modifiers changed from: protected */
    public String getInstrumentationPixelUrl() {
        String str = this.instrPixelUrl;
        return str != null ? str : DEFAULT_METRICS_ENDPOINT;
    }

    /* access modifiers changed from: protected */
    public void setInstrumentationPixelUrl(String str) {
        this.instrPixelUrl = str;
    }

    /* access modifiers changed from: protected */
    public String getImpressionPixelUrl() {
        return this.impPixelUrl;
    }

    /* access modifiers changed from: protected */
    public void setImpressionPixelUrl(String str) {
        this.impPixelUrl = str;
    }

    public boolean getIsFetched() {
        return this.fetched;
    }

    public void setFetched(boolean z) {
        this.fetched = z;
    }

    /* access modifiers changed from: protected */
    public void setHeight(int i) {
        this.adHeight = i;
    }

    public int getHeight() {
        return this.adHeight;
    }

    /* access modifiers changed from: protected */
    public void setWidth(int i) {
        this.adWidth = i;
    }

    public int getWidth() {
        return this.adWidth;
    }

    /* access modifiers changed from: protected */
    public void setExpirationTimeMillis(long j) {
        this.expirationTimeMs = j;
    }

    public boolean isExpired() {
        if (this.expirationTimeMs >= 0 && System.currentTimeMillis() > this.expirationTimeMs) {
            return true;
        }
        return false;
    }

    public long getTimeToExpire() {
        return this.expirationTimeMs - System.currentTimeMillis();
    }

    public Iterator<AAXCreative> iterator() {
        return this.creativeTypes.iterator();
    }
}
