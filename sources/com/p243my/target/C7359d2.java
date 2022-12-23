package com.p243my.target;

/* renamed from: com.my.target.d2 */
public class C7359d2 extends C7327b2 {
    public String source;
    public float timeToReward;

    public static C7359d2 fromCompanion(C7302a2 a2Var) {
        C7359d2 newBanner = newBanner();
        newBanner.setId(a2Var.getId());
        newBanner.setSource(a2Var.getHtmlResource());
        newBanner.getStatHolder().mo49802a(a2Var.getStatHolder(), 0.0f);
        newBanner.trackingLink = a2Var.trackingLink;
        return newBanner;
    }

    public static C7359d2 newBanner() {
        return new C7359d2();
    }

    public String getSource() {
        return this.source;
    }

    public float getTimeToReward() {
        return this.timeToReward;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTimeToReward(float f) {
        this.timeToReward = f;
    }
}
