package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;

public class LinkGenerator {

    /* renamed from: ı */
    private String f4283;

    /* renamed from: Ɩ */
    private String f4284;

    /* renamed from: ǃ */
    private String f4285;

    /* renamed from: ȷ */
    private String f4286;

    /* renamed from: ɨ */
    private Map<String, String> f4287 = new HashMap();

    /* renamed from: ɩ */
    String f4288;

    /* renamed from: ɹ */
    private String f4289;

    /* renamed from: ɾ */
    private Map<String, String> f4290 = new HashMap();

    /* renamed from: Ι */
    private String f4291;

    /* renamed from: ι */
    String f4292;

    /* renamed from: І */
    private String f4293;

    /* renamed from: і */
    private String f4294;

    /* renamed from: Ӏ */
    private String f4295;

    /* renamed from: ӏ */
    private String f4296;

    public LinkGenerator(String str) {
        this.f4283 = str;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.f4286 = str;
        return this;
    }

    public String getBrandDomain() {
        return this.f4286;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f4284 = str;
        return this;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.f4296 = str;
        return this;
    }

    public String getChannel() {
        return this.f4285;
    }

    public LinkGenerator setChannel(String str) {
        this.f4285 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.f4289 = str;
        return this;
    }

    public String getMediaSource() {
        return this.f4283;
    }

    public Map<String, String> getParameters() {
        return this.f4290;
    }

    public String getCampaign() {
        return this.f4291;
    }

    public LinkGenerator setCampaign(String str) {
        this.f4291 = str;
        return this;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.f4290.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.f4290.putAll(map);
        }
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.f4295 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f4294 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f4293 = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.f4288 = String.format("https://%s/%s", new Object[]{ServerConfigHandler.getUrl("%sapp.%s"), str3});
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.f4288 = String.format("https://%s/%s", new Object[]{str2, str});
        }
        return this;
    }

    /* renamed from: ι */
    private StringBuilder m3928() {
        StringBuilder sb = new StringBuilder();
        String str = this.f4288;
        if (str == null || !str.startsWith("http")) {
            sb.append(ServerConfigHandler.getUrl(Constants.f4277));
        } else {
            sb.append(this.f4288);
        }
        if (this.f4292 != null) {
            sb.append('/');
            sb.append(this.f4292);
        }
        this.f4287.put(Constants.URL_MEDIA_SOURCE, this.f4283);
        sb.append('?');
        sb.append("pid=");
        sb.append(m3927(this.f4283, "media source"));
        String str2 = this.f4295;
        if (str2 != null) {
            this.f4287.put("af_referrer_uid", str2);
            sb.append(Typography.amp);
            sb.append("af_referrer_uid=");
            sb.append(m3927(this.f4295, "referrerUID"));
        }
        String str3 = this.f4285;
        if (str3 != null) {
            this.f4287.put("af_channel", str3);
            sb.append(Typography.amp);
            sb.append("af_channel=");
            sb.append(m3927(this.f4285, "channel"));
        }
        String str4 = this.f4289;
        if (str4 != null) {
            this.f4287.put("af_referrer_customer_id", str4);
            sb.append(Typography.amp);
            sb.append("af_referrer_customer_id=");
            sb.append(m3927(this.f4289, "referrerCustomerId"));
        }
        String str5 = this.f4291;
        if (str5 != null) {
            this.f4287.put(Constants.URL_CAMPAIGN, str5);
            sb.append(Typography.amp);
            sb.append("c=");
            sb.append(m3927(this.f4291, "campaign"));
        }
        String str6 = this.f4294;
        if (str6 != null) {
            this.f4287.put("af_referrer_name", str6);
            sb.append(Typography.amp);
            sb.append("af_referrer_name=");
            sb.append(m3927(this.f4294, "referrerName"));
        }
        String str7 = this.f4293;
        if (str7 != null) {
            this.f4287.put("af_referrer_image_url", str7);
            sb.append(Typography.amp);
            sb.append("af_referrer_image_url=");
            sb.append(m3927(this.f4293, "referrerImageURL"));
        }
        if (this.f4296 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f4296);
            String str8 = "";
            sb2.append(this.f4296.endsWith("/") ? str8 : "/");
            String str9 = this.f4284;
            if (str9 != null) {
                sb2.append(str9);
            }
            this.f4287.put("af_dp", sb2.toString());
            sb.append(Typography.amp);
            sb.append("af_dp=");
            sb.append(m3927(this.f4296, "baseDeeplink"));
            if (this.f4284 != null) {
                if (!this.f4296.endsWith("/")) {
                    str8 = "%2F";
                }
                sb.append(str8);
                sb.append(m3927(this.f4284, "deeplinkPath"));
            }
        }
        for (String next : this.f4290.keySet()) {
            String obj = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(next);
            sb3.append("=");
            sb3.append(m3927(this.f4290.get(next), next));
            if (!obj.contains(sb3.toString())) {
                sb.append(Typography.amp);
                sb.append(next);
                sb.append('=');
                sb.append(m3927(this.f4290.get(next), next));
            }
        }
        return sb;
    }

    /* renamed from: Ι */
    private static String m3927(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            AFLogger.afErrorLog(sb.toString(), e);
            return "";
        } catch (Throwable th) {
            AFLogger.afErrorLog(th);
            return "";
        }
    }

    public String generateLink() {
        return m3928().toString();
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        if (!this.f4290.isEmpty()) {
            for (Map.Entry next : this.f4290.entrySet()) {
                this.f4287.put(next.getKey(), next.getValue());
            }
        }
        m3928();
        String str = this.f4286;
        Map<String, String> map = this.f4287;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, AppsFlyerLibCore.getInstance(), context, AppsFlyerLib.getInstance().isStopped());
        createOneLinkHttpTask.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        createOneLinkHttpTask.setListener(responseListener);
        createOneLinkHttpTask.setBrandDomain(str);
        AFExecutor.getInstance().getThreadPoolExecutor().execute(createOneLinkHttpTask);
    }
}
