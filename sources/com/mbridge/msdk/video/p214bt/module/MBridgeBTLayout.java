package com.mbridge.msdk.video.p214bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.video.p214bt.p215a.C6877c;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTLayout */
public class MBridgeBTLayout extends BTBaseView {

    /* renamed from: p */
    private WebView f16969p;

    public void init(Context context) {
    }

    public void onDestory() {
    }

    public MBridgeBTLayout(Context context) {
        super(context);
    }

    public MBridgeBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setWebView(WebView webView) {
        this.f16969p = webView;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f16969p != null) {
            try {
                if (this.f16876b == null || !C6366u.m16221f(this.f16876b.getMof_template_url())) {
                    JSONObject jSONObject = new JSONObject();
                    if (configuration.orientation == 2) {
                        jSONObject.put("orientation", "landscape");
                    } else {
                        jSONObject.put("orientation", "portrait");
                    }
                    jSONObject.put("instanceId", this.f16878d);
                    C6563g.m16891a().mo44522a(this.f16969p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onBackPressed() {
        if (this.f16969p != null) {
            C6877c.m17219a().mo48194a(this.f16969p, "onSystemBackPressed", this.f16878d);
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f16969p != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f16873n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C6563g.m16891a().mo44522a(this.f16969p, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C6877c.m17219a().mo48194a(this.f16969p, "broadcast", getInstanceId());
            }
        }
    }
}
