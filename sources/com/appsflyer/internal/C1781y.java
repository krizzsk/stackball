package com.appsflyer.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFDeepLinkManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import com.tapjoy.TapjoyConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.y */
public final class C1781y extends OneLinkHttpTask {

    /* renamed from: Ι */
    private static List<String> f4253 = Arrays.asList(new String[]{"onelink.me", "onelnk.com", "app.aflink.com"});

    /* renamed from: ı */
    private String f4254;

    /* renamed from: ǃ */
    private String f4255;

    /* renamed from: ɩ */
    public boolean f4256 = false;

    /* renamed from: ι */
    public C1782b f4257;

    /* renamed from: com.appsflyer.internal.y$b */
    public interface C1782b {
        /* renamed from: ǃ */
        void mo13957(String str);

        /* renamed from: ɩ */
        void mo13958(Map<String, String> map);
    }

    public C1781y(Uri uri, AppsFlyerLibCore appsFlyerLibCore) {
        super(appsFlyerLibCore);
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            boolean z = false;
            for (String contains : f4253) {
                if (uri.getHost().contains(contains)) {
                    z = true;
                }
            }
            if (AFDeepLinkManager.f3933 != null) {
                StringBuilder sb = new StringBuilder("Validate if link ");
                sb.append(uri);
                sb.append(" belongs to custom domains: ");
                sb.append(Arrays.asList(AFDeepLinkManager.f3933));
                AFLogger.afRDLog(sb.toString());
                for (String str : AFDeepLinkManager.f3933) {
                    if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                        AFLogger.afDebugLog("Link matches custom domain: ".concat(String.valueOf(str)));
                        this.f4256 = true;
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.oneLinkId = split[1];
                this.f4255 = split[2];
                this.f4254 = uri.toString();
            }
        }
    }

    /* renamed from: ɩ */
    public final boolean mo14108() {
        return !TextUtils.isEmpty(this.oneLinkId) && !TextUtils.isEmpty(this.f4255) && !this.oneLinkId.equals(TapjoyConstants.TJC_APP_PLACEMENT);
    }

    public final void initRequest(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    public final String getOneLinkUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl(BASE_URL));
        sb.append("/");
        sb.append(this.oneLinkId);
        sb.append("?id=");
        sb.append(this.f4255);
        return sb.toString();
    }

    public final void handleResponse(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.f4257.mo13958(hashMap);
        } catch (JSONException e) {
            this.f4257.mo13957("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    public final void onErrorResponse() {
        String str = this.f4254;
        if (str == null) {
            str = "Can't get one link data";
        }
        this.f4257.mo13957(str);
    }
}
