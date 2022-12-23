package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.mbsignalcommon.base.C6538e;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.g */
/* compiled from: WindVaneCallJs */
public final class C6563g {

    /* renamed from: a */
    private static C6563g f16368a = new C6563g();

    private C6563g() {
    }

    /* renamed from: a */
    public static C6563g m16891a() {
        return f16368a;
    }

    /* renamed from: a */
    public final void mo44524a(Object obj, String str, String str2) {
        String str3;
        if (obj instanceof C6557a) {
            C6557a aVar = (C6557a) obj;
            if (TextUtils.isEmpty(str2)) {
                str3 = String.format("javascript:window.WindVane.fireEvent('%s', '');", new Object[]{str});
            } else {
                str3 = String.format("javascript:window.WindVane.fireEvent('%s','%s');", new Object[]{str, C6566j.m16902c(str2)});
            }
            if (aVar.f16345a != null && !aVar.f16345a.isDestoryed()) {
                try {
                    aVar.f16345a.loadUrl(str3);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo44522a(WebView webView, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = String.format("javascript:window.WindVane.fireEvent('%s', '');", new Object[]{str});
        } else {
            str3 = String.format("javascript:window.WindVane.fireEvent('%s','%s');", new Object[]{str, C6566j.m16902c(str2)});
        }
        if (webView == null) {
            return;
        }
        if (!(webView instanceof WindVaneWebView) || !((WindVaneWebView) webView).isDestoryed()) {
            try {
                webView.loadUrl(str3);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo44523a(Object obj, String str) {
        String str2;
        if (obj instanceof C6557a) {
            C6557a aVar = (C6557a) obj;
            if (TextUtils.isEmpty(str)) {
                str2 = String.format("javascript:window.WindVane.onSuccess(%s,'');", new Object[]{aVar.f16351g});
            } else {
                str2 = String.format("javascript:window.WindVane.onSuccess(%s,'%s');", new Object[]{aVar.f16351g, C6566j.m16902c(str)});
            }
            if (aVar.f16345a != null && !aVar.f16345a.isDestoryed()) {
                try {
                    aVar.f16345a.loadUrl(str2);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo44525b(Object obj, String str) {
        if (obj instanceof C6557a) {
            C6557a aVar = (C6557a) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.WindVane.onFailure(%s,'');", new Object[]{aVar.f16351g});
            } else {
                str = C6566j.m16902c(str);
            }
            String format = String.format("javascript:window.WindVane.onFailure(%s,'%s');", new Object[]{aVar.f16351g, str});
            if (aVar.f16345a != null && !aVar.f16345a.isDestoryed()) {
                try {
                    aVar.f16345a.loadUrl(format);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo44521a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            f16368a.mo44522a(webView, C6538e.f16308j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            f16368a.mo44522a(webView, C6538e.f16308j, "");
        } catch (Throwable unused2) {
            f16368a.mo44522a(webView, C6538e.f16308j, "");
        }
    }
}
