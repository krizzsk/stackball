package com.mbridge.msdk.video.signal.p235a;

import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.l */
/* compiled from: JSNotifyProxy */
public final class C7064l extends C7057e {

    /* renamed from: a */
    private WebView f17575a;

    public C7064l(WebView webView) {
        this.f17575a = webView;
    }

    /* renamed from: a */
    public final void mo48829a(int i) {
        super.mo48829a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            C6563g.m16891a().mo44522a(this.f17575a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo48831a(int i, String str) {
        super.mo48831a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            C6563g.m16891a().mo44522a(this.f17575a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo48832a(MBridgeVideoView.C7025a aVar) {
        super.mo48832a(aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, m17906a(aVar.f17481a, aVar.f17482b));
            jSONObject.put("time", String.valueOf(aVar.f17481a));
            jSONObject.put("duration", String.valueOf(aVar.f17482b));
            C6563g.m16891a().mo44522a(this.f17575a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m17906a(int i, int i2) {
        if (i2 != 0) {
            double d = (double) (((float) i) / ((float) i2));
            try {
                return C6366u.m16184a(Double.valueOf(d)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    /* renamed from: a */
    public final void mo48833a(Object obj) {
        super.mo48833a(obj);
        C6563g.m16891a().mo44522a(this.f17575a, "webviewshow", (obj == null || !(obj instanceof String)) ? "" : Base64.encodeToString(obj.toString().getBytes(), 2));
    }

    /* renamed from: a */
    public final void mo48830a(int i, int i2, int i3, int i4) {
        super.mo48830a(i, i2, i3, i4);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "landscape";
            if (i != 2 ? i2 != 2 : i2 == 1) {
                str = "portrait";
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i3);
            jSONObject2.put("screen_height", i4);
            jSONObject.put("data", jSONObject2);
            C6563g.m16891a().mo44522a(this.f17575a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
