package com.amazon.device.ads;

class Version {
    private static String buildVersion = "6.0.0";
    private static String devBuild = "(DEV)";
    private static String prefixVersion = "amznAdSDK-android-";
    private static String sdkVersion = null;
    private static String userAgentPrefixVersion = "AmazonAdSDK-Android/";
    private static String userAgentSDKVersion;

    Version() {
    }

    public static String getRawSDKVersion() {
        String str = buildVersion;
        if (str == null || str.equals("")) {
            return devBuild;
        }
        if (!str.endsWith("x")) {
            return str;
        }
        return str + devBuild;
    }

    public static String getSDKVersion() {
        if (sdkVersion == null) {
            sdkVersion = prefixVersion + getRawSDKVersion();
        }
        return sdkVersion;
    }

    static void setSDKVersion(String str) {
        sdkVersion = str;
    }

    public static String getUserAgentSDKVersion() {
        if (userAgentSDKVersion == null) {
            userAgentSDKVersion = userAgentPrefixVersion + getRawSDKVersion();
        }
        return userAgentSDKVersion;
    }
}
