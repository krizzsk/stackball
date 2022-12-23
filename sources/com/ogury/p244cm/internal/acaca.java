package com.ogury.p244cm.internal;

/* renamed from: com.ogury.cm.internal.acaca */
public final class acaca {

    /* renamed from: a */
    public static final acaca f20536a = new acaca();

    private acaca() {
    }

    /* renamed from: a */
    public static String m21936a(acabc acabc) {
        StringBuilder sb;
        String str;
        bbabc.m22051b(acabc, "requestType");
        int i = acacb.f20537a[acabc.ordinal()];
        if (i == 1) {
            sb = new StringBuilder();
            sb.append("https://consent-manager-events.ogury.io/");
            str = "v3/ask";
        } else if (i == 2) {
            sb = new StringBuilder();
            sb.append("https://consent-manager-events.ogury.io/");
            str = "v3/edit";
        } else if (i == 3) {
            sb = new StringBuilder();
            sb.append("https://consent-manager-events.ogury.io/");
            str = "v3/event";
        } else if (i == 4) {
            sb = new StringBuilder();
            sb.append("https://consent-manager-events.ogury.io/");
            str = "v3/external-consent/tcfv2";
        } else if (i == 5) {
            sb = new StringBuilder();
            sb.append("https://consent-manager-events.ogury.io/");
            str = "v3/external-consent/boolean";
        } else {
            throw new babbb();
        }
        sb.append(str);
        return sb.toString();
    }
}
