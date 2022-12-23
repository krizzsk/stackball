package com.chartboost.sdk.impl;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.impl.C2016x1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.t1 */
public class C1982t1 extends WebChromeClient implements C2016x1.C2017a {

    /* renamed from: a */
    private View f5088a;

    /* renamed from: b */
    private ViewGroup f5089b;

    /* renamed from: c */
    private boolean f5090c = false;

    /* renamed from: d */
    private FrameLayout f5091d;

    /* renamed from: e */
    private WebChromeClient.CustomViewCallback f5092e;

    /* renamed from: f */
    private C1983a f5093f;

    /* renamed from: g */
    private final C1989v1 f5094g;

    /* renamed from: h */
    private final Handler f5095h;

    /* renamed from: i */
    private C2016x1 f5096i;

    /* renamed from: j */
    private C1996w1 f5097j;

    /* renamed from: com.chartboost.sdk.impl.t1$a */
    public interface C1983a {
        /* renamed from: a */
        void mo14805a(boolean z);
    }

    public C1982t1(View view, ViewGroup viewGroup, C1989v1 v1Var, Handler handler) {
        this.f5088a = view;
        this.f5089b = viewGroup;
        this.f5094g = v1Var;
        this.f5095h = handler;
        this.f5097j = new C1996w1(this, v1Var);
        this.f5096i = new C2016x1();
    }

    /* renamed from: a */
    private void m4816a(String str) {
        C2016x1 x1Var = this.f5096i;
        if (x1Var != null) {
            x1Var.mo14890a(str, this);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String simpleName = C1982t1.class.getSimpleName();
        Log.d(simpleName, "Chartboost Webview:" + message + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
        m4816a(message);
        return true;
    }

    public void onHideCustomView() {
        if (this.f5090c) {
            this.f5089b.setVisibility(4);
            this.f5089b.removeView(this.f5091d);
            this.f5088a.setVisibility(0);
            WebChromeClient.CustomViewCallback customViewCallback = this.f5092e;
            if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                this.f5092e.onCustomViewHidden();
            }
            this.f5090c = false;
            this.f5091d = null;
            this.f5092e = null;
            C1983a aVar = this.f5093f;
            if (aVar != null) {
                aVar.mo14805a(false);
            }
        }
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            jsPromptResult.confirm(mo14798a(jSONObject.getJSONObject("eventArgs"), jSONObject.getString("eventType")));
            return true;
        } catch (JSONException unused) {
            CBLogging.m3993b("CBWebChromeClient", "Exception caught parsing the function name from js to native");
            return true;
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.f5090c = true;
            this.f5091d = (FrameLayout) view;
            this.f5092e = customViewCallback;
            this.f5088a.setVisibility(4);
            this.f5089b.addView(this.f5091d, new ViewGroup.LayoutParams(-1, -1));
            this.f5089b.setVisibility(0);
            C1983a aVar = this.f5093f;
            if (aVar != null) {
                aVar.mo14805a(true);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo14798a(org.json.JSONObject r5, java.lang.String r6) {
        /*
            r4 = this;
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            r0.mo14862a((org.json.JSONObject) r5)
            int r5 = r6.hashCode()
            r0 = 0
            switch(r5) {
                case -2012425132: goto L_0x0107;
                case -1757019252: goto L_0x00fd;
                case -1554056650: goto L_0x00f2;
                case -1263203643: goto L_0x00e7;
                case -1086137328: goto L_0x00dc;
                case -934326481: goto L_0x00d1;
                case -715147645: goto L_0x00c7;
                case -640720077: goto L_0x00bc;
                case 3529469: goto L_0x00b1;
                case 94750088: goto L_0x00a7;
                case 94756344: goto L_0x009c;
                case 95458899: goto L_0x0090;
                case 96784904: goto L_0x0084;
                case 133423073: goto L_0x0078;
                case 160987616: goto L_0x006d;
                case 550290366: goto L_0x0061;
                case 937504109: goto L_0x0056;
                case 939594121: goto L_0x004a;
                case 1000390722: goto L_0x003e;
                case 1082777163: goto L_0x0032;
                case 1124446108: goto L_0x0026;
                case 1270488759: goto L_0x001a;
                case 1880941391: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0111
        L_0x000f:
            java.lang.String r5 = "getMaxSize"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 1
            goto L_0x0112
        L_0x001a:
            java.lang.String r5 = "tracking"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 18
            goto L_0x0112
        L_0x0026:
            java.lang.String r5 = "warning"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 16
            goto L_0x0112
        L_0x0032:
            java.lang.String r5 = "totalVideoDuration"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 13
            goto L_0x0112
        L_0x003e:
            java.lang.String r5 = "videoReplay"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 11
            goto L_0x0112
        L_0x004a:
            java.lang.String r5 = "videoPaused"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 10
            goto L_0x0112
        L_0x0056:
            java.lang.String r5 = "getOrientationProperties"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 5
            goto L_0x0112
        L_0x0061:
            java.lang.String r5 = "rewardedVideoCompleted"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 22
            goto L_0x0112
        L_0x006d:
            java.lang.String r5 = "getParameters"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 0
            goto L_0x0112
        L_0x0078:
            java.lang.String r5 = "setOrientationProperties"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 20
            goto L_0x0112
        L_0x0084:
            java.lang.String r5 = "error"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 15
            goto L_0x0112
        L_0x0090:
            java.lang.String r5 = "debug"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 17
            goto L_0x0112
        L_0x009c:
            java.lang.String r5 = "close"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 7
            goto L_0x0112
        L_0x00a7:
            java.lang.String r5 = "click"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 6
            goto L_0x0112
        L_0x00b1:
            java.lang.String r5 = "show"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 14
            goto L_0x0112
        L_0x00bc:
            java.lang.String r5 = "videoPlaying"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 9
            goto L_0x0112
        L_0x00c7:
            java.lang.String r5 = "getScreenSize"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 2
            goto L_0x0112
        L_0x00d1:
            java.lang.String r5 = "reward"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 21
            goto L_0x0112
        L_0x00dc:
            java.lang.String r5 = "videoCompleted"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 8
            goto L_0x0112
        L_0x00e7:
            java.lang.String r5 = "openUrl"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 19
            goto L_0x0112
        L_0x00f2:
            java.lang.String r5 = "currentVideoDuration"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 12
            goto L_0x0112
        L_0x00fd:
            java.lang.String r5 = "getCurrentPosition"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 3
            goto L_0x0112
        L_0x0107:
            java.lang.String r5 = "getDefaultPosition"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0111
            r5 = 4
            goto L_0x0112
        L_0x0111:
            r5 = -1
        L_0x0112:
            java.lang.String r1 = " callback triggered."
            java.lang.String r2 = "CBWebChromeClient"
            java.lang.String r3 = "JavaScript to native "
            switch(r5) {
                case 0: goto L_0x02b4;
                case 1: goto L_0x0298;
                case 2: goto L_0x027c;
                case 3: goto L_0x0260;
                case 4: goto L_0x0244;
                case 5: goto L_0x0228;
                case 6: goto L_0x0207;
                case 7: goto L_0x01fd;
                case 8: goto L_0x01f3;
                case 9: goto L_0x01e9;
                case 10: goto L_0x01df;
                case 11: goto L_0x01d5;
                case 12: goto L_0x01cb;
                case 13: goto L_0x01c1;
                case 14: goto L_0x01b7;
                case 15: goto L_0x01a2;
                case 16: goto L_0x018c;
                case 17: goto L_0x0181;
                case 18: goto L_0x0176;
                case 19: goto L_0x016b;
                case 20: goto L_0x014b;
                case 21: goto L_0x0140;
                case 22: goto L_0x0135;
                default: goto L_0x011b;
            }
        L_0x011b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            java.lang.String r6 = " callback not recognized."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            java.lang.String r5 = "Function name not recognized."
            return r5
        L_0x0135:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5177s
            r5.post(r0)
            goto L_0x0210
        L_0x0140:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5178t
            r5.post(r0)
            goto L_0x0210
        L_0x014b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r2, r5)
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5176r
            r5.post(r0)
            goto L_0x0210
        L_0x016b:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5167i
            r5.post(r0)
            goto L_0x0210
        L_0x0176:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5170l
            r5.post(r0)
            goto L_0x0210
        L_0x0181:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5165g
            r5.post(r0)
            goto L_0x0210
        L_0x018c:
            java.lang.Class<com.chartboost.sdk.impl.u1> r5 = com.chartboost.sdk.impl.C1986u1.class
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "Javascript warning occurred"
            android.util.Log.d(r5, r0)
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5175q
            r5.post(r0)
            goto L_0x0210
        L_0x01a2:
            java.lang.Class<com.chartboost.sdk.impl.u1> r5 = com.chartboost.sdk.impl.C1986u1.class
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "Javascript Error occured"
            android.util.Log.d(r5, r0)
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5166h
            r5.post(r0)
            goto L_0x0210
        L_0x01b7:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5168j
            r5.post(r0)
            goto L_0x0210
        L_0x01c1:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5169k
            r5.post(r0)
            goto L_0x0210
        L_0x01cb:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5164f
            r5.post(r0)
            goto L_0x0210
        L_0x01d5:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5174p
            r5.post(r0)
            goto L_0x0210
        L_0x01df:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5172n
            r5.post(r0)
            goto L_0x0210
        L_0x01e9:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5173o
            r5.post(r0)
            goto L_0x0210
        L_0x01f3:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5171m
            r5.post(r0)
            goto L_0x0210
        L_0x01fd:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5163e
            r5.post(r0)
            goto L_0x0210
        L_0x0207:
            android.os.Handler r5 = r4.f5095h
            com.chartboost.sdk.impl.w1 r0 = r4.f5097j
            java.lang.Runnable r0 = r0.f5162d
            r5.post(r0)
        L_0x0210:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r2, r5)
            java.lang.String r5 = "Native function successfully called."
            return r5
        L_0x0228:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r2, r5)
            com.chartboost.sdk.impl.v1 r5 = r4.f5094g
            java.lang.String r5 = r5.mo14836x()
            return r5
        L_0x0244:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r2, r5)
            com.chartboost.sdk.impl.v1 r5 = r4.f5094g
            java.lang.String r5 = r5.mo14834s()
            return r5
        L_0x0260:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r2, r5)
            com.chartboost.sdk.impl.v1 r5 = r4.f5094g
            java.lang.String r5 = r5.mo14833r()
            return r5
        L_0x027c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r2, r5)
            com.chartboost.sdk.impl.v1 r5 = r4.f5094g
            java.lang.String r5 = r5.mo14837y()
            return r5
        L_0x0298:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r2, r5)
            com.chartboost.sdk.impl.v1 r5 = r4.f5094g
            java.lang.String r5 = r5.mo14835w()
            return r5
        L_0x02b4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r2, r5)
            com.chartboost.sdk.impl.v1 r5 = r4.f5094g
            com.chartboost.sdk.Model.c r5 = r5.f4717g
            if (r5 == 0) goto L_0x0340
            com.chartboost.sdk.Model.a r5 = r5.f4464q
            if (r5 == 0) goto L_0x0340
            com.chartboost.sdk.Libraries.e$a[] r6 = new com.chartboost.sdk.Libraries.C1825e.C1826a[r0]
            org.json.JSONObject r6 = com.chartboost.sdk.Libraries.C1825e.m4025a(r6)
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f4424d
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02e3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02fd
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            com.chartboost.sdk.Libraries.C1825e.m4026a(r6, r2, r1)
            goto L_0x02e3
        L_0x02fd:
            java.util.Map<java.lang.String, com.chartboost.sdk.Model.b> r5 = r5.f4423c
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0307:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x033b
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            com.chartboost.sdk.Model.b r1 = (com.chartboost.sdk.Model.C1837b) r1
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r1.f4441a
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            java.lang.String r1 = r1.f4442b
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.chartboost.sdk.Libraries.C1825e.m4026a(r6, r0, r1)
            goto L_0x0307
        L_0x033b:
            java.lang.String r5 = r6.toString()
            return r5
        L_0x0340:
            java.lang.String r5 = "{}"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1982t1.mo14798a(org.json.JSONObject, java.lang.String):java.lang.String");
    }

    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    /* renamed from: a */
    public void mo14799a(JSONObject jSONObject) {
        mo14798a(jSONObject, "error");
    }
}
