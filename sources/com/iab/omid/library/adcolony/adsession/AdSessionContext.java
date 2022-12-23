package com.iab.omid.library.adcolony.adsession;

import android.webkit.WebView;
import com.iab.omid.library.adcolony.p092d.C4581e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class AdSessionContext {

    /* renamed from: a */
    private final Partner f10233a;

    /* renamed from: b */
    private final WebView f10234b;

    /* renamed from: c */
    private final List<VerificationScriptResource> f10235c;

    /* renamed from: d */
    private final Map<String, VerificationScriptResource> f10236d = new HashMap();

    /* renamed from: e */
    private final String f10237e;

    /* renamed from: f */
    private final String f10238f;

    /* renamed from: g */
    private final String f10239g;

    /* renamed from: h */
    private final AdSessionContextType f10240h;

    private AdSessionContext(Partner partner, WebView webView, String str, List<VerificationScriptResource> list, String str2, String str3, AdSessionContextType adSessionContextType) {
        ArrayList arrayList = new ArrayList();
        this.f10235c = arrayList;
        this.f10233a = partner;
        this.f10234b = webView;
        this.f10237e = str;
        this.f10240h = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            for (VerificationScriptResource put : list) {
                String uuid = UUID.randomUUID().toString();
                this.f10236d.put(uuid, put);
            }
        }
        this.f10239g = str2;
        this.f10238f = str3;
    }

    public static AdSessionContext createHtmlAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        C4581e.m9613a((Object) partner, "Partner is null");
        C4581e.m9613a((Object) webView, "WebView is null");
        if (str2 != null) {
            C4581e.m9614a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, webView, (String) null, (List<VerificationScriptResource>) null, str, str2, AdSessionContextType.HTML);
    }

    public static AdSessionContext createJavascriptAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        C4581e.m9613a((Object) partner, "Partner is null");
        C4581e.m9613a((Object) webView, "WebView is null");
        if (str2 != null) {
            C4581e.m9614a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, webView, (String) null, (List<VerificationScriptResource>) null, str, str2, AdSessionContextType.JAVASCRIPT);
    }

    public static AdSessionContext createNativeAdSessionContext(Partner partner, String str, List<VerificationScriptResource> list, String str2, String str3) {
        C4581e.m9613a((Object) partner, "Partner is null");
        C4581e.m9613a((Object) str, "OM SDK JS script content is null");
        C4581e.m9613a((Object) list, "VerificationScriptResources is null");
        if (str3 != null) {
            C4581e.m9614a(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, (WebView) null, str, list, str2, str3, AdSessionContextType.NATIVE);
    }

    public AdSessionContextType getAdSessionContextType() {
        return this.f10240h;
    }

    public String getContentUrl() {
        return this.f10239g;
    }

    public String getCustomReferenceData() {
        return this.f10238f;
    }

    public Map<String, VerificationScriptResource> getInjectedResourcesMap() {
        return Collections.unmodifiableMap(this.f10236d);
    }

    public String getOmidJsScriptContent() {
        return this.f10237e;
    }

    public Partner getPartner() {
        return this.f10233a;
    }

    public List<VerificationScriptResource> getVerificationScriptResources() {
        return Collections.unmodifiableList(this.f10235c);
    }

    public WebView getWebView() {
        return this.f10234b;
    }
}
