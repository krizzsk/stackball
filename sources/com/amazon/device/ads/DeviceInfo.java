package com.amazon.device.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appsflyer.ServerParameters;
import java.util.Locale;
import org.json.JSONObject;

class DeviceInfo {
    private static final String LOGTAG = DeviceInfo.class.getSimpleName();
    public static final String ORIENTATION_LANDSCAPE = "landscape";
    public static final String ORIENTATION_PORTRAIT = "portrait";
    public static final String ORIENTATION_UNKNOWN = "unknown";

    /* renamed from: dt */
    private static final String f1613dt = "android";

    /* renamed from: os */
    private static final String f1614os = "Android";
    private boolean bad_mac;
    private boolean bad_serial;
    private boolean bad_udid;
    private final AndroidBuildInfo buildInfo;
    private String carrier;
    private String country;
    private final MobileAdsInfoStore infoStore;
    private Size landscapeScreenSize;
    private String language;
    private final MobileAdsLogger logger;
    private boolean macFetched;
    private String make;
    private String model;
    private String networkCountry;
    private String osVersion;
    private Size portraitScreenSize;
    private float scalingFactor;
    private String scalingFactorAsString;
    private boolean serialFetched;
    private String sha1_mac;
    private String sha1_serial;
    private String sha1_udid;
    private boolean udidFetched;
    private UserAgentManager userAgentManager;

    public String getDeviceType() {
        return "android";
    }

    public String getOS() {
        return f1614os;
    }

    public DeviceInfo(Context context, UserAgentManager userAgentManager2) {
        this(context, userAgentManager2, MobileAdsInfoStore.getInstance(), new MobileAdsLoggerFactory(), new AndroidBuildInfo());
    }

    DeviceInfo(Context context, UserAgentManager userAgentManager2, MobileAdsInfoStore mobileAdsInfoStore, MobileAdsLoggerFactory mobileAdsLoggerFactory, AndroidBuildInfo androidBuildInfo) {
        this.make = Build.MANUFACTURER;
        this.model = Build.MODEL;
        this.osVersion = Build.VERSION.RELEASE;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.infoStore = mobileAdsInfoStore;
        this.buildInfo = androidBuildInfo;
        setCountry();
        setNetworkCountry(context);
        setCarrier(context);
        setLanguage();
        setScalingFactor(context);
        this.userAgentManager = userAgentManager2;
    }

    public void setUserAgentManager(UserAgentManager userAgentManager2) {
        this.userAgentManager = userAgentManager2;
    }

    private void setMacAddressIfNotFetched() {
        if (!this.macFetched) {
            setMacAddress();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMacAddress() {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to get Wifi connection information: %s"
            com.amazon.device.ads.MobileAdsInfoStore r1 = r7.infoStore
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = "wifi"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002f
            r4 = 0
            android.net.wifi.WifiInfo r0 = r1.getConnectionInfo()     // Catch:{ SecurityException -> 0x0025, ExceptionInInitializerError -> 0x001a }
            goto L_0x0030
        L_0x001a:
            r1 = move-exception
            com.amazon.device.ads.MobileAdsLogger r5 = r7.logger
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r1
            r5.mo11019d(r0, r6)
            goto L_0x002f
        L_0x0025:
            r1 = move-exception
            com.amazon.device.ads.MobileAdsLogger r5 = r7.logger
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r1
            r5.mo11019d(r0, r6)
        L_0x002f:
            r0 = r2
        L_0x0030:
            if (r0 != 0) goto L_0x0035
            r7.sha1_mac = r2
            goto L_0x0066
        L_0x0035:
            java.lang.String r0 = r0.getMacAddress()
            if (r0 == 0) goto L_0x0062
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0042
            goto L_0x0062
        L_0x0042:
            java.lang.String r1 = "((([0-9a-fA-F]){1,2}[-:]){5}([0-9a-fA-F]){1,2})"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.find()
            if (r1 != 0) goto L_0x0057
            r7.sha1_mac = r2
            r7.bad_mac = r3
            goto L_0x0066
        L_0x0057:
            java.lang.String r0 = com.amazon.device.ads.StringUtils.sha1(r0)
            java.lang.String r0 = com.amazon.device.ads.WebUtils.getURLEncodedString(r0)
            r7.sha1_mac = r0
            goto L_0x0066
        L_0x0062:
            r7.sha1_mac = r2
            r7.bad_mac = r3
        L_0x0066:
            r7.macFetched = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DeviceInfo.setMacAddress():void");
    }

    private void setSerialIfNotFetched() {
        if (!this.serialFetched) {
            setSerial();
        }
    }

    private void setSerial() {
        String str;
        try {
            str = (String) Build.class.getDeclaredField("SERIAL").get(Build.class);
        } catch (Exception unused) {
            str = null;
        }
        if (str == null || str.length() == 0 || str.equalsIgnoreCase("unknown")) {
            this.bad_serial = true;
        } else {
            this.sha1_serial = WebUtils.getURLEncodedString(StringUtils.sha1(str));
        }
        this.serialFetched = true;
    }

    private void setUdidIfNotFetched() {
        if (!this.udidFetched) {
            setUdid();
        }
    }

    private void setUdid() {
        String string = Settings.Secure.getString(this.infoStore.getApplicationContext().getContentResolver(), "android_id");
        if (StringUtils.isNullOrEmpty(string) || string.equalsIgnoreCase("9774d56d682e549c")) {
            this.sha1_udid = null;
            this.bad_udid = true;
        } else {
            this.sha1_udid = WebUtils.getURLEncodedString(StringUtils.sha1(string));
        }
        this.udidFetched = true;
    }

    private void setLanguage() {
        String language2 = Locale.getDefault().getLanguage();
        if (language2 == null || language2.length() <= 0) {
            language2 = null;
        }
        this.language = language2;
    }

    private void setCountry() {
        String country2 = Locale.getDefault().getCountry();
        if (country2 == null || country2.length() <= 0) {
            country2 = null;
        }
        this.country = country2;
    }

    private void setNetworkCountry(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            this.networkCountry = (networkCountryIso == null || networkCountryIso.length() <= 0) ? null : networkCountryIso.toUpperCase();
        }
    }

    private void setCarrier(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName == null || networkOperatorName.length() <= 0) {
                networkOperatorName = null;
            }
            this.carrier = networkOperatorName;
        }
    }

    private void setScalingFactor(Context context) {
        if (!this.make.equals("motorola") || !this.model.equals("MB502")) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.scalingFactor = displayMetrics.scaledDensity;
        } else {
            this.scalingFactor = 1.0f;
        }
        this.scalingFactorAsString = Float.toString(this.scalingFactor);
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getOSVersion() {
        return this.osVersion;
    }

    public String getMacSha1() {
        setMacAddressIfNotFetched();
        return this.sha1_mac;
    }

    public boolean isMacBad() {
        setMacAddressIfNotFetched();
        return this.bad_mac;
    }

    public String getSerialSha1() {
        setSerialIfNotFetched();
        return this.sha1_serial;
    }

    public boolean isSerialBad() {
        setSerialIfNotFetched();
        return this.bad_serial;
    }

    public String getUdidSha1() {
        setUdidIfNotFetched();
        return this.sha1_udid;
    }

    public boolean isUdidBad() {
        setUdidIfNotFetched();
        return this.bad_udid;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getCountry() {
        return this.country;
    }

    public String getNetworkCountry() {
        return this.networkCountry;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getScalingFactorAsString() {
        return this.scalingFactorAsString;
    }

    public float getScalingFactorAsFloat() {
        return this.scalingFactor;
    }

    public String getUserAgentString() {
        return this.userAgentManager.getUserAgentString();
    }

    public void setUserAgentString(String str) {
        this.userAgentManager.setUserAgentString(str);
    }

    public void populateUserAgentString(Context context) {
        this.userAgentManager.populateUserAgentString(context);
    }

    public String getOrientation() {
        int determineCanonicalScreenOrientation = DisplayUtils.determineCanonicalScreenOrientation(this.infoStore.getApplicationContext(), this.buildInfo);
        if (determineCanonicalScreenOrientation != 0) {
            if (determineCanonicalScreenOrientation != 1) {
                if (determineCanonicalScreenOrientation != 8) {
                    if (determineCanonicalScreenOrientation != 9) {
                        return "unknown";
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    public Size getScreenSize(String str) {
        Size size;
        Size size2;
        if (str.equals("portrait") && (size2 = this.portraitScreenSize) != null) {
            return size2;
        }
        if (str.equals("landscape") && (size = this.landscapeScreenSize) != null) {
            return size;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.infoStore.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        String str2 = String.valueOf(displayMetrics.widthPixels) + "x" + String.valueOf(displayMetrics.heightPixels);
        if (str.equals("portrait")) {
            Size size3 = new Size(str2);
            this.portraitScreenSize = size3;
            return size3;
        } else if (!str.equals("landscape")) {
            return new Size(str2);
        } else {
            Size size4 = new Size(str2);
            this.landscapeScreenSize = size4;
            return size4;
        }
    }

    public JSONObject getDInfoProperty() {
        JSONObject jSONObject = new JSONObject();
        JSONUtils.put(jSONObject, "make", getMake());
        JSONUtils.put(jSONObject, ServerParameters.MODEL, getModel());
        JSONUtils.put(jSONObject, "os", getOS());
        JSONUtils.put(jSONObject, "osVersion", getOSVersion());
        JSONUtils.put(jSONObject, "scalingFactor", getScalingFactorAsString());
        JSONUtils.put(jSONObject, "language", getLanguage());
        JSONUtils.put(jSONObject, "country", getCountry());
        JSONUtils.put(jSONObject, "networkCountry", getNetworkCountry());
        JSONUtils.put(jSONObject, ServerParameters.CARRIER, getCarrier());
        return jSONObject;
    }

    public String toJsonString() {
        return toJsonObject(getOrientation()).toString();
    }

    /* access modifiers changed from: package-private */
    public JSONObject toJsonObject(String str) {
        JSONObject dInfoProperty = getDInfoProperty();
        JSONUtils.put(dInfoProperty, "orientation", str);
        JSONUtils.put(dInfoProperty, "screenSize", getScreenSize(str).toString());
        JSONUtils.put(dInfoProperty, "connectionType", new ConnectionInfo(this.infoStore).getConnectionType());
        return dInfoProperty;
    }
}
