package com.smaato.sdk.video.vast.model;

public class Advertiser {

    /* renamed from: ID */
    public static final String f21818ID = "id";
    public static final String NAME = "Advertiser";

    /* renamed from: id */
    public final String f21819id;
    public final String name;

    Advertiser(String str, String str2) {
        this.f21819id = str;
        this.name = str2;
    }

    public static class Builder {

        /* renamed from: id */
        private String f21820id;
        private String name;

        public Builder setId(String str) {
            this.f21820id = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Advertiser build() {
            return new Advertiser(this.f21820id, this.name);
        }
    }
}
