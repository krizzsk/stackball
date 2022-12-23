package com.inmobi.unification.sdk.model;

public final class ASRequestParams {

    /* renamed from: a */
    public String f12629a;

    /* renamed from: b */
    public String f12630b;

    /* renamed from: c */
    public String f12631c;

    /* renamed from: d */
    public boolean f12632d;

    public static class Builder {
        private String a9Params;
        private boolean hasDynamicMediation;
        private String pubKeys;
        private String vcUserId;

        public Builder setPubKeys(String str) {
            this.pubKeys = str;
            return this;
        }

        public Builder setA9Params(String str) {
            this.a9Params = str;
            return this;
        }

        public Builder setVcUserId(String str) {
            this.vcUserId = str;
            return this;
        }

        public Builder setHasDynamicMediation(boolean z) {
            this.hasDynamicMediation = z;
            return this;
        }

        public ASRequestParams build() {
            ASRequestParams aSRequestParams = new ASRequestParams();
            aSRequestParams.f12629a = this.pubKeys;
            aSRequestParams.f12630b = this.a9Params;
            aSRequestParams.f12631c = this.vcUserId;
            aSRequestParams.f12632d = this.hasDynamicMediation;
            return aSRequestParams;
        }
    }
}
