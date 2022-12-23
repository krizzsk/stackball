package com.amazon.device.ads;

import android.content.Context;
import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: WebUtils */
class WebUtils2 {
    private final WebUtilsStatic webUtilsAdapter = new WebUtilsStatic();

    WebUtils2() {
    }

    public boolean isUrlValid(String str) {
        try {
            new URI(str);
            return true;
        } catch (NullPointerException | URISyntaxException unused) {
            return false;
        }
    }

    public boolean launchActivityForIntentLink(String str, Context context) {
        return this.webUtilsAdapter.launchActivityForIntentLink(str, context);
    }

    public String getURLEncodedString(String str) {
        return this.webUtilsAdapter.getURLEncodedString(str);
    }

    public String getURLDecodedString(String str) {
        return this.webUtilsAdapter.getURLDecodedString(str);
    }

    public String getScheme(String str) {
        return this.webUtilsAdapter.getScheme(str);
    }

    public String encloseHtml(String str, boolean z) {
        return this.webUtilsAdapter.encloseHtml(str, z);
    }

    public void executeWebRequestInThread(String str, boolean z) {
        this.webUtilsAdapter.executeWebRequestInThread(str, z);
    }

    /* compiled from: WebUtils */
    private static class WebUtilsStatic {
        private WebUtilsStatic() {
        }

        /* access modifiers changed from: package-private */
        public boolean launchActivityForIntentLink(String str, Context context) {
            return WebUtils.launchActivityForIntentLink(str, context);
        }

        /* access modifiers changed from: package-private */
        public String getURLEncodedString(String str) {
            return WebUtils.getURLEncodedString(str);
        }

        /* access modifiers changed from: package-private */
        public String getURLDecodedString(String str) {
            return WebUtils.getURLDecodedString(str);
        }

        /* access modifiers changed from: package-private */
        public String getScheme(String str) {
            return WebUtils.getScheme(str);
        }

        /* access modifiers changed from: package-private */
        public String encloseHtml(String str, boolean z) {
            return WebUtils.encloseHtml(str, z);
        }

        /* access modifiers changed from: package-private */
        public void executeWebRequestInThread(String str, boolean z) {
            WebUtils.executeWebRequestInThread(str, z);
        }
    }
}
