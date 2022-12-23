package com.smaato.sdk.video.vast.model;

/* renamed from: com.smaato.sdk.video.vast.model.Ad */
public class C8937Ad {
    public static final String AD_TYPE = "adType";
    public static final String CONDITIONAL_AD = "conditionalAd";

    /* renamed from: ID */
    public static final String f21815ID = "id";
    public static final String INLINE = "InLine";
    public static final String NAME = "Ad";
    public static final String SEQUENCE = "sequence";
    public static final String WRAPPER = "Wrapper";
    public final VideoAdType adType;
    public final Boolean conditionalAd;

    /* renamed from: id */
    public final String f21816id;
    public final InLine inLine;
    public final Integer sequence;
    public final Wrapper wrapper;

    C8937Ad(String str, InLine inLine2, Wrapper wrapper2, Integer num, Boolean bool, VideoAdType videoAdType) {
        this.inLine = inLine2;
        this.wrapper = wrapper2;
        this.f21816id = str;
        this.sequence = num;
        this.conditionalAd = bool;
        this.adType = videoAdType;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    /* renamed from: com.smaato.sdk.video.vast.model.Ad$Builder */
    public static class Builder {
        private VideoAdType adType = VideoAdType.VIDEO;
        private Boolean conditionalAd;

        /* renamed from: id */
        private String f21817id;
        private InLine inLine;
        private Integer sequence;
        private Wrapper wrapper;

        public Builder() {
        }

        public Builder(C8937Ad ad) {
            this.inLine = ad.inLine;
            this.wrapper = ad.wrapper;
            this.f21817id = ad.f21816id;
            this.sequence = ad.sequence;
            this.conditionalAd = ad.conditionalAd;
            this.adType = ad.adType;
        }

        public Builder setId(String str) {
            this.f21817id = str;
            return this;
        }

        public Builder setInLine(InLine inLine2) {
            this.inLine = inLine2;
            return this;
        }

        public Builder setWrapper(Wrapper wrapper2) {
            this.wrapper = wrapper2;
            return this;
        }

        public Builder setSequence(Integer num) {
            this.sequence = num;
            return this;
        }

        public Builder setConditionalAd(Boolean bool) {
            this.conditionalAd = bool;
            return this;
        }

        public Builder setAdType(String str) {
            VideoAdType parse = VideoAdType.parse(str);
            if (parse == null) {
                parse = this.adType;
            }
            this.adType = parse;
            return this;
        }

        public C8937Ad build() {
            return new C8937Ad(this.f21817id, this.inLine, this.wrapper, this.sequence, this.conditionalAd, this.adType);
        }
    }
}
