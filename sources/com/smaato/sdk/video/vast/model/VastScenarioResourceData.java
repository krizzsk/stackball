package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;

public final class VastScenarioResourceData {
    public final String htmlResources;
    public final String iFrameResources;
    public final StaticResource staticResources;

    /* synthetic */ VastScenarioResourceData(StaticResource staticResource, String str, String str2, byte b) {
        this(staticResource, str, str2);
    }

    private VastScenarioResourceData(StaticResource staticResource, String str, String str2) {
        this.staticResources = staticResource;
        this.iFrameResources = str;
        this.htmlResources = str2;
    }

    public static class Builder {
        private String htmlResources;
        private String iFrameResources;
        private StaticResource staticResources;

        public Builder setStaticResource(StaticResource staticResource) {
            this.staticResources = staticResource;
            return this;
        }

        public Builder setIFrameResources(String str) {
            this.iFrameResources = str;
            return this;
        }

        public Builder setHtmlResources(String str) {
            this.htmlResources = str;
            return this;
        }

        public VastScenarioResourceData build() throws VastElementMissingException {
            if (this.staticResources != null || this.iFrameResources != null || this.htmlResources != null) {
                return new VastScenarioResourceData(this.staticResources, this.iFrameResources, this.htmlResources, (byte) 0);
            }
            throw new VastElementMissingException("Cannot build VastScenarioResourceData: staticResources, iFrameResources and htmlResources are missing");
        }
    }
}
