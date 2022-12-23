package com.smaato.sdk.core.csm;

import com.smaato.sdk.core.csm.Network;

final class AutoValue_Network extends Network {
    private final String adUnitId;
    private final String className;
    private final String clickUrl;
    private final String customData;
    private final int height;
    private final String impression;
    private final String name;
    private final int priority;
    private final int width;

    /* synthetic */ AutoValue_Network(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, byte b) {
        this(str, str2, str3, str4, str5, str6, i, i2, i3);
    }

    private AutoValue_Network(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3) {
        this.name = str;
        this.impression = str2;
        this.clickUrl = str3;
        this.adUnitId = str4;
        this.className = str5;
        this.customData = str6;
        this.priority = i;
        this.width = i2;
        this.height = i3;
    }

    public final String getName() {
        return this.name;
    }

    public final String getImpression() {
        return this.impression;
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getCustomData() {
        return this.customData;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String toString() {
        return "Network{name=" + this.name + ", impression=" + this.impression + ", clickUrl=" + this.clickUrl + ", adUnitId=" + this.adUnitId + ", className=" + this.className + ", customData=" + this.customData + ", priority=" + this.priority + ", width=" + this.width + ", height=" + this.height + "}";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.adUnitId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r1 = r4.className;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r1 = r4.customData;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.smaato.sdk.core.csm.Network
            r2 = 0
            if (r1 == 0) goto L_0x0087
            com.smaato.sdk.core.csm.Network r5 = (com.smaato.sdk.core.csm.Network) r5
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0087
            java.lang.String r1 = r4.impression
            java.lang.String r3 = r5.getImpression()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0087
            java.lang.String r1 = r4.clickUrl
            java.lang.String r3 = r5.getClickUrl()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0087
            java.lang.String r1 = r4.adUnitId
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = r5.getAdUnitId()
            if (r1 != 0) goto L_0x0087
            goto L_0x0044
        L_0x003a:
            java.lang.String r3 = r5.getAdUnitId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0087
        L_0x0044:
            java.lang.String r1 = r4.className
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = r5.getClassName()
            if (r1 != 0) goto L_0x0087
            goto L_0x0059
        L_0x004f:
            java.lang.String r3 = r5.getClassName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0087
        L_0x0059:
            java.lang.String r1 = r4.customData
            if (r1 != 0) goto L_0x0064
            java.lang.String r1 = r5.getCustomData()
            if (r1 != 0) goto L_0x0087
            goto L_0x006e
        L_0x0064:
            java.lang.String r3 = r5.getCustomData()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0087
        L_0x006e:
            int r1 = r4.priority
            int r3 = r5.getPriority()
            if (r1 != r3) goto L_0x0087
            int r1 = r4.width
            int r3 = r5.getWidth()
            if (r1 != r3) goto L_0x0087
            int r1 = r4.height
            int r5 = r5.getHeight()
            if (r1 != r5) goto L_0x0087
            return r0
        L_0x0087:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.csm.AutoValue_Network.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.impression.hashCode()) * 1000003) ^ this.clickUrl.hashCode()) * 1000003;
        String str = this.adUnitId;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.className;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.customData;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((hashCode3 ^ i) * 1000003) ^ this.priority) * 1000003) ^ this.width) * 1000003) ^ this.height;
    }

    static final class Builder extends Network.Builder {
        private String adUnitId;
        private String className;
        private String clickUrl;
        private String customData;
        private Integer height;
        private String impression;
        private String name;
        private Integer priority;
        private Integer width;

        Builder() {
        }

        public final Network.Builder setName(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final Network.Builder setImpression(String str) {
            if (str != null) {
                this.impression = str;
                return this;
            }
            throw new NullPointerException("Null impression");
        }

        public final Network.Builder setClickUrl(String str) {
            if (str != null) {
                this.clickUrl = str;
                return this;
            }
            throw new NullPointerException("Null clickUrl");
        }

        public final Network.Builder setAdUnitId(String str) {
            this.adUnitId = str;
            return this;
        }

        public final Network.Builder setClassName(String str) {
            this.className = str;
            return this;
        }

        public final Network.Builder setCustomData(String str) {
            this.customData = str;
            return this;
        }

        public final Network.Builder setPriority(int i) {
            this.priority = Integer.valueOf(i);
            return this;
        }

        public final Network.Builder setWidth(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }

        public final Network.Builder setHeight(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        public final Network build() {
            String str = "";
            if (this.name == null) {
                str = str + " name";
            }
            if (this.impression == null) {
                str = str + " impression";
            }
            if (this.clickUrl == null) {
                str = str + " clickUrl";
            }
            if (this.priority == null) {
                str = str + " priority";
            }
            if (this.width == null) {
                str = str + " width";
            }
            if (this.height == null) {
                str = str + " height";
            }
            if (str.isEmpty()) {
                return new AutoValue_Network(this.name, this.impression, this.clickUrl, this.adUnitId, this.className, this.customData, this.priority.intValue(), this.width.intValue(), this.height.intValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
