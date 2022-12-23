package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p158b.p160b.C6080b;

public class WebEnvCheckEntry {
    public void check(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        windVaneWebView.loadDataWithBaseURL((String) null, "<html><script>" + C6080b.m15114a().mo42764b() + "</script></html>", WebRequest.CONTENT_TYPE_HTML, "utf-8", (String) null);
    }
}
