package com.tapjoy;

import com.tapjoy.internal.C9465jq;
import java.io.Serializable;

public class TJPlacementData implements Serializable {

    /* renamed from: a */
    private String f22065a;

    /* renamed from: b */
    private String f22066b;

    /* renamed from: c */
    private String f22067c;

    /* renamed from: d */
    private String f22068d;

    /* renamed from: e */
    private String f22069e;

    /* renamed from: f */
    private String f22070f;

    /* renamed from: g */
    private int f22071g;

    /* renamed from: h */
    private String f22072h;

    /* renamed from: i */
    private String f22073i;

    /* renamed from: j */
    private int f22074j;

    /* renamed from: k */
    private boolean f22075k;

    /* renamed from: l */
    private String f22076l;

    /* renamed from: m */
    private boolean f22077m;

    /* renamed from: n */
    private String f22078n;

    /* renamed from: o */
    private String f22079o;

    /* renamed from: p */
    private boolean f22080p = true;

    /* renamed from: q */
    private boolean f22081q = false;

    public TJPlacementData(String str, String str2) {
        setKey(str);
        updateUrl(str2);
        setPlacementType(TapjoyConstants.TJC_APP_PLACEMENT);
    }

    public TJPlacementData(String str, String str2, String str3) {
        setBaseURL(str);
        setHttpResponse(str2);
        this.f22078n = str3;
        this.f22080p = false;
        setPlacementType(TapjoyConstants.TJC_APP_PLACEMENT);
    }

    public void resetPlacementRequestData() {
        setHttpResponse((String) null);
        setHttpStatusCode(0);
        setRedirectURL((String) null);
        setHasProgressSpinner(false);
        setPrerenderingRequested(false);
        setPreloadDisabled(false);
        setContentViewId((String) null);
    }

    public String getCallbackID() {
        return this.f22078n;
    }

    public boolean isBaseActivity() {
        return this.f22080p;
    }

    public void setKey(String str) {
        this.f22065a = str;
    }

    public void setBaseURL(String str) {
        this.f22067c = str;
    }

    public void setMediationURL(String str) {
        this.f22068d = str;
    }

    public void setAuctionMediationURL(String str) {
        this.f22069e = str;
    }

    public void setHttpResponse(String str) {
        this.f22070f = str;
    }

    public void setHttpStatusCode(int i) {
        this.f22071g = i;
    }

    public void setPlacementName(String str) {
        this.f22072h = str;
    }

    public void setPlacementType(String str) {
        this.f22073i = str;
    }

    public void setViewType(int i) {
        this.f22074j = i;
    }

    public void setRedirectURL(String str) {
        this.f22076l = str;
    }

    public void setHasProgressSpinner(boolean z) {
        this.f22075k = z;
    }

    public void setContentViewId(String str) {
        this.f22079o = str;
    }

    public String getUrl() {
        return this.f22066b;
    }

    public String getKey() {
        return this.f22065a;
    }

    public String getBaseURL() {
        return this.f22067c;
    }

    public String getMediationURL() {
        return this.f22068d;
    }

    public String getAuctionMediationURL() {
        return this.f22069e;
    }

    public String getHttpResponse() {
        return this.f22070f;
    }

    public int getHttpStatusCode() {
        return this.f22071g;
    }

    public String getPlacementName() {
        return this.f22072h;
    }

    public String getPlacementType() {
        return this.f22073i;
    }

    public int getViewType() {
        return this.f22074j;
    }

    public String getRedirectURL() {
        return this.f22076l;
    }

    public String getContentViewId() {
        return this.f22079o;
    }

    public boolean hasProgressSpinner() {
        return this.f22075k;
    }

    public void setPreloadDisabled(boolean z) {
        this.f22081q = z;
    }

    public boolean isPreloadDisabled() {
        return this.f22081q;
    }

    public boolean isPrerenderingRequested() {
        return this.f22077m;
    }

    public void setPrerenderingRequested(boolean z) {
        this.f22077m = z;
    }

    public void updateUrl(String str) {
        this.f22066b = str;
        if (!C9465jq.m25449c(str)) {
            setBaseURL(str.substring(0, str.indexOf(47, str.indexOf("//") + 3)));
        }
    }
}
