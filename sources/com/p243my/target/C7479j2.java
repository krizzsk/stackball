package com.p243my.target;

/* renamed from: com.my.target.j2 */
public class C7479j2 extends C7768z1 {
    public final String source;

    public C7479j2(String str) {
        this.source = str;
    }

    public static C7479j2 newContent(C7435h2 h2Var, String str) {
        C7479j2 j2Var = new C7479j2(str);
        j2Var.f19746id = h2Var.f19746id;
        j2Var.trackingLink = h2Var.trackingLink;
        j2Var.deeplink = h2Var.deeplink;
        j2Var.urlscheme = h2Var.urlscheme;
        j2Var.bundleId = h2Var.bundleId;
        j2Var.navigationType = h2Var.navigationType;
        j2Var.directLink = h2Var.directLink;
        j2Var.openInBrowser = h2Var.openInBrowser;
        return j2Var;
    }

    public String getSource() {
        return this.source;
    }
}
