package com.smaato.sdk.core.p248ad;

/* renamed from: com.smaato.sdk.core.ad.FullscreenAdDimensionMapper */
public final class FullscreenAdDimensionMapper {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.smaato.sdk.core.p248ad.AdDimension getDimension(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1762874990: goto L_0x0029;
                case 667133493: goto L_0x001f;
                case 1366559536: goto L_0x0015;
                case 1726410933: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "full_480x320"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "full_768x1024"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "full_320x480"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "full_1024x768"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            if (r0 == 0) goto L_0x0055
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x004f
            if (r0 != r1) goto L_0x003f
            com.smaato.sdk.core.ad.AdDimension r5 = com.smaato.sdk.core.p248ad.AdDimension.FULLSCREEN_LANDSCAPE_TABLET
            return r5
        L_0x003f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Unknown dimension: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L_0x004f:
            com.smaato.sdk.core.ad.AdDimension r5 = com.smaato.sdk.core.p248ad.AdDimension.FULLSCREEN_PORTRAIT_TABLET
            return r5
        L_0x0052:
            com.smaato.sdk.core.ad.AdDimension r5 = com.smaato.sdk.core.p248ad.AdDimension.FULLSCREEN_LANDSCAPE
            return r5
        L_0x0055:
            com.smaato.sdk.core.ad.AdDimension r5 = com.smaato.sdk.core.p248ad.AdDimension.FULLSCREEN_PORTRAIT
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p248ad.FullscreenAdDimensionMapper.getDimension(java.lang.String):com.smaato.sdk.core.ad.AdDimension");
    }
}
