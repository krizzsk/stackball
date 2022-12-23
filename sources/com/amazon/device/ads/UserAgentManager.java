package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.ThreadUtils;

class UserAgentManager {
    private final ThreadUtils.ThreadRunner threadRunner;
    private String userAgentStringWithSDKVersion;
    private String userAgentStringWithoutSDKVersion;
    /* access modifiers changed from: private */
    public final WebViewFactory webViewFactory;

    public UserAgentManager() {
        this(new ThreadUtils.ThreadRunner(), WebViewFactory.getInstance());
    }

    UserAgentManager(ThreadUtils.ThreadRunner threadRunner2, WebViewFactory webViewFactory2) {
        this.threadRunner = threadRunner2;
        this.webViewFactory = webViewFactory2;
    }

    public String getUserAgentString() {
        return this.userAgentStringWithSDKVersion;
    }

    public void setUserAgentString(String str) {
        if (str != null && !str.equals(this.userAgentStringWithoutSDKVersion) && !str.equals(this.userAgentStringWithSDKVersion)) {
            this.userAgentStringWithoutSDKVersion = str;
            this.userAgentStringWithSDKVersion = str + " " + Version.getUserAgentSDKVersion();
        }
    }

    public void populateUserAgentString(final Context context) {
        this.threadRunner.execute(new Runnable() {
            public void run() {
                UserAgentManager userAgentManager = UserAgentManager.this;
                userAgentManager.setUserAgentString(userAgentManager.webViewFactory.createWebView(context).getSettings().getUserAgentString());
            }
        }, ThreadUtils.ExecutionStyle.RUN_ASAP, ThreadUtils.ExecutionThread.MAIN_THREAD);
    }
}
