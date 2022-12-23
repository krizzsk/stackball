package com.tapjoy;

import android.os.AsyncTask;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public class TJWebViewJSInterface {

    /* renamed from: a */
    WebView f22126a;

    /* renamed from: b */
    TJWebViewJSInterfaceListener f22127b;

    /* renamed from: c */
    private final ConcurrentLinkedQueue f22128c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    private boolean f22129d;

    public TJWebViewJSInterface(WebView webView, TJWebViewJSInterfaceListener tJWebViewJSInterfaceListener) {
        this.f22126a = webView;
        this.f22127b = tJWebViewJSInterfaceListener;
    }

    @JavascriptInterface
    public void dispatchMethod(String str) {
        TapjoyLog.m24273d("TJWebViewJSInterface", "dispatchMethod params: " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getJSONObject("data").getString("method");
            TapjoyLog.m24273d("TJWebViewJSInterface", "method: " + string);
            if (this.f22127b != null) {
                this.f22127b.onDispatchMethod(string, jSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callback(ArrayList arrayList, String str, String str2) {
        try {
            callbackToJavaScript(new JSONArray(arrayList), str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callback(Map map, String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject(map));
            callbackToJavaScript(jSONArray, str, str2);
        } catch (Exception e) {
            TapjoyLog.m24275e("TJWebViewJSInterface", "Exception in callback to JS: " + e.toString());
            e.printStackTrace();
        }
    }

    public void callbackToJavaScript(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TJAdUnitConstants.String.ARGUMENTS, obj);
            if (str != null && str.length() > 0) {
                jSONObject.put("method", str);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (str2 != null && str2.length() > 0) {
                jSONObject2.put(TJAdUnitConstants.String.CALLBACK_ID, str2);
            }
            jSONObject2.put("data", jSONObject);
            String str3 = "javascript:if(window.AndroidWebViewJavascriptBridge) AndroidWebViewJavascriptBridge._handleMessageFromAndroid('" + jSONObject2 + "');";
            if (!this.f22129d) {
                this.f22128c.add(str3);
                return;
            }
            new C9041a(this.f22126a).execute(new String[]{str3});
        } catch (Exception e) {
            TapjoyLog.m24275e("TJWebViewJSInterface", "Exception in callback to JS: " + e.toString());
            e.printStackTrace();
        }
    }

    public void flushMessageQueue() {
        if (!this.f22129d) {
            while (true) {
                String str = (String) this.f22128c.poll();
                if (str != null) {
                    new C9041a(this.f22126a).execute(new String[]{str});
                } else {
                    this.f22129d = true;
                    return;
                }
            }
        }
    }

    /* renamed from: com.tapjoy.TJWebViewJSInterface$a */
    class C9041a extends AsyncTask {

        /* renamed from: a */
        WebView f22130a;

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return ((String[]) objArr)[0];
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            if (this.f22130a == null) {
                return;
            }
            if (!str.startsWith("javascript:") || Build.VERSION.SDK_INT < 19) {
                try {
                    this.f22130a.loadUrl(str);
                } catch (Exception e) {
                    TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.INTERNAL_ERROR;
                    TapjoyLog.m24274e("TJWebViewJSInterface", new TapjoyErrorMessage(errorType, "Exception in loadUrl. Device not supported. " + e.toString()));
                }
            } else {
                try {
                    this.f22130a.evaluateJavascript(str.replaceFirst("javascript:", ""), (ValueCallback) null);
                } catch (Exception e2) {
                    TapjoyErrorMessage.ErrorType errorType2 = TapjoyErrorMessage.ErrorType.INTERNAL_ERROR;
                    TapjoyLog.m24274e("TJWebViewJSInterface", new TapjoyErrorMessage(errorType2, "Exception in evaluateJavascript. Device not supported. " + e2.toString()));
                }
            }
        }

        public C9041a(WebView webView) {
            this.f22130a = webView;
        }
    }
}
