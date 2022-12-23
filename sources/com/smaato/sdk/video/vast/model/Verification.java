package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

public final class Verification {
    public static final String JAVASCRIPT_RESOURCE = "JavaScriptResource";
    public static final String NAME = "Verification";
    public static final String VENDOR = "vendor";
    public static final String VERIFICATION_PARAMETERS = "VerificationParameters";
    public static final String VIEWABLE_IMPRESSION = "ViewableImpression";
    public final List<JavaScriptResource> javaScriptResources;
    public final String vendor;
    public final String verificationParameters;
    public final ViewableImpression viewableImpression;

    /* synthetic */ Verification(List list, String str, String str2, ViewableImpression viewableImpression2, byte b) {
        this(list, str, str2, viewableImpression2);
    }

    private Verification(List<JavaScriptResource> list, String str, String str2, ViewableImpression viewableImpression2) {
        this.vendor = str;
        this.javaScriptResources = list;
        this.verificationParameters = str2;
        this.viewableImpression = viewableImpression2;
    }

    public static class Builder {
        private List<JavaScriptResource> javaScriptResource;
        private String vendor;
        private String verificationParameters;
        private ViewableImpression viewableImpression;

        public Builder setVendor(String str) {
            this.vendor = str;
            return this;
        }

        public Builder setJavaScriptResources(List<JavaScriptResource> list) {
            this.javaScriptResource = list;
            return this;
        }

        public Builder setVerificationParameters(String str) {
            this.verificationParameters = str;
            return this;
        }

        public Builder setViewableImpression(ViewableImpression viewableImpression2) {
            this.viewableImpression = viewableImpression2;
            return this;
        }

        public Verification build() throws VastElementMissingException {
            this.javaScriptResource = VastModels.toImmutableList(this.javaScriptResource);
            VastModels.requireNonNull(this.vendor, "Cannot build Verification: vendor is missing");
            return new Verification(this.javaScriptResource, this.vendor, this.verificationParameters, this.viewableImpression, (byte) 0);
        }
    }
}
