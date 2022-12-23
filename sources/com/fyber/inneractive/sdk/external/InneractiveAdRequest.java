package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.p037d.C2859s;

public class InneractiveAdRequest extends C2859s {

    /* renamed from: f */
    private String f6878f;

    /* renamed from: g */
    private InneractiveUserConfig f6879g;

    /* renamed from: h */
    private String f6880h;

    /* renamed from: i */
    private C2809u f6881i;

    /* renamed from: j */
    private boolean f6882j = false;

    public InneractiveAdRequest(String str) {
        this.f6878f = str;
        this.f6879g = new InneractiveUserConfig();
    }

    public String getSpotId() {
        return this.f6878f;
    }

    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        this.f6879g = inneractiveUserConfig;
    }

    public void setKeywords(String str) {
        this.f6880h = str;
    }

    public void setMuteVideo(boolean z) {
        this.f6882j = z;
    }

    public InneractiveUserConfig getUserParams() {
        return this.f6879g;
    }

    public String getKeywords() {
        return this.f6880h;
    }

    public void setSelectedUnitConfig(C2809u uVar) {
        this.f6881i = uVar;
    }

    public C2809u getSelectedUnitConfig() {
        return this.f6881i;
    }

    public boolean getMuteVideo() {
        return this.f6882j;
    }
}
