package com.mbridge.msdk.video.signal.p235a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.h */
/* compiled from: JSActivityProxy */
public final class C7060h extends C7051a {

    /* renamed from: a */
    private WebView f17560a;

    /* renamed from: b */
    private int f17561b = 0;

    public C7060h(WebView webView) {
        this.f17560a = webView;
    }

    /* renamed from: a */
    public final void mo48790a() {
        super.mo48790a();
        this.f17561b = 1;
        C6563g.m16891a().mo44522a(this.f17560a, "onSystemPause", "");
    }

    /* renamed from: b */
    public final void mo48793b() {
        super.mo48793b();
        this.f17561b = 0;
        C6563g.m16891a().mo44522a(this.f17560a, "onSystemResume", "");
    }

    /* renamed from: f */
    public final void mo48797f() {
        super.mo48797f();
        C6563g.m16891a().mo44522a(this.f17560a, "onSystemDestory", "");
    }

    /* renamed from: a */
    public final void mo48792a(Configuration configuration) {
        super.mo48792a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            C6563g.m16891a().mo44522a(this.f17560a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public final void mo48798g() {
        super.mo48798g();
        C6563g.m16891a().mo44522a(this.f17560a, "onSystemBackPressed", "");
    }

    /* renamed from: a */
    public final void mo48791a(int i) {
        super.mo48791a(i);
        this.f17561b = i;
    }

    /* renamed from: h */
    public final int mo48799h() {
        return this.f17561b;
    }
}
