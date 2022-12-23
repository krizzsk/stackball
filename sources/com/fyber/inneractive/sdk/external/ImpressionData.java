package com.fyber.inneractive.sdk.external;

public class ImpressionData {

    /* renamed from: a */
    private Pricing f6854a = new Pricing();

    /* renamed from: b */
    private Video f6855b;

    /* renamed from: c */
    private String f6856c;

    /* renamed from: d */
    private Long f6857d;

    /* renamed from: e */
    private String f6858e;

    /* renamed from: f */
    private String f6859f;

    /* renamed from: g */
    private String f6860g;

    /* renamed from: h */
    private String f6861h;

    /* renamed from: i */
    private String f6862i;

    public Pricing getPricing() {
        return this.f6854a;
    }

    public void setPricing(Pricing pricing) {
        this.f6854a = pricing;
    }

    public Video getVideo() {
        return this.f6855b;
    }

    public void setVideo(Video video) {
        this.f6855b = video;
    }

    public String getDemandSource() {
        return this.f6856c;
    }

    public void setDemandSource(String str) {
        this.f6856c = str;
    }

    public Long getDemandId() {
        return this.f6857d;
    }

    public void setDemandId(Long l) {
        this.f6857d = l;
    }

    public String getCountry() {
        return this.f6858e;
    }

    public void setCountry(String str) {
        this.f6858e = str;
    }

    public String getImpressionId() {
        return this.f6859f;
    }

    public void setImpressionId(String str) {
        this.f6859f = str;
    }

    public String getCreativeId() {
        return this.f6860g;
    }

    public void setCreativeId(String str) {
        this.f6860g = str;
    }

    public String getCampaignId() {
        return this.f6861h;
    }

    public void setCampaignId(String str) {
        this.f6861h = str;
    }

    public String getAdvertiserDomain() {
        return this.f6862i;
    }

    public void setAdvertiserDomain(String str) {
        this.f6862i = str;
    }

    public void setDuration(long j) {
        long unused = this.f6855b.f6866b = j;
    }

    public void setCurrency(String str) {
        String unused = this.f6854a.f6864b = str;
    }

    public void setCpmValue(String str) {
        double d;
        try {
            d = Double.parseDouble(str);
        } catch (Exception unused) {
            d = 0.0d;
        }
        double unused2 = this.f6854a.f6863a = d;
    }

    public static class Video {

        /* renamed from: a */
        private boolean f6865a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f6866b;

        public Video(boolean z, long j) {
            this.f6865a = z;
            this.f6866b = j;
        }

        public boolean isSkippable() {
            return this.f6865a;
        }

        public long getDuration() {
            return this.f6866b;
        }

        public String toString() {
            return "Video{skippable=" + this.f6865a + ", duration=" + this.f6866b + '}';
        }
    }

    public static class Pricing {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public double f6863a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f6864b;

        public void setValue(double d) {
            this.f6863a = d;
        }

        public double getValue() {
            return this.f6863a;
        }

        public String getCurrency() {
            return this.f6864b;
        }

        public String toString() {
            return "Pricing{value=" + this.f6863a + ", currency='" + this.f6864b + '\'' + '}';
        }
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f6854a + ", video=" + this.f6855b + ", demandSource='" + this.f6856c + '\'' + ", country='" + this.f6858e + '\'' + ", impressionId='" + this.f6859f + '\'' + ", creativeId='" + this.f6860g + '\'' + ", campaignId='" + this.f6861h + '\'' + ", advertiserDomain='" + this.f6862i + '\'' + '}';
    }
}
