package com.adcolony.sdk;

public class AdColonyAdOptions {

    /* renamed from: a */
    boolean f84a;

    /* renamed from: b */
    boolean f85b;

    /* renamed from: c */
    AdColonyUserMetadata f86c;

    /* renamed from: d */
    C0897z0 f87d = C0894y.m1151b();

    public AdColonyAdOptions enableConfirmationDialog(boolean z) {
        this.f84a = z;
        C0894y.m1158b(this.f87d, "confirmation_enabled", true);
        return this;
    }

    public AdColonyAdOptions enableResultsDialog(boolean z) {
        this.f85b = z;
        C0894y.m1158b(this.f87d, "results_enabled", true);
        return this;
    }

    public Object getOption(String str) {
        return C0894y.m1168g(this.f87d, str);
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f86c;
    }

    public AdColonyAdOptions setOption(String str, boolean z) {
        if (C0849u0.m942e(str)) {
            C0894y.m1158b(this.f87d, str, z);
        }
        return this;
    }

    @Deprecated
    public AdColonyAdOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f86c = adColonyUserMetadata;
        C0894y.m1147a(this.f87d, "user_metadata", adColonyUserMetadata.f163b);
        return this;
    }

    public AdColonyAdOptions setOption(String str, double d) {
        if (C0849u0.m942e(str)) {
            C0894y.m1145a(this.f87d, str, d);
        }
        return this;
    }

    public AdColonyAdOptions setOption(String str, String str2) {
        if (str != null) {
            C0894y.m1148a(this.f87d, str, str2);
        }
        return this;
    }
}
