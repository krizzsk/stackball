package com.chartboost.sdk.impl;

import android.content.ActivityNotFoundException;
import android.util.Log;
import com.chartboost.sdk.Libraries.CBLogging;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.w1 */
public class C1996w1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1982t1 f5159a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1989v1 f5160b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public JSONObject f5161c;

    /* renamed from: d */
    Runnable f5162d = new C2005i();

    /* renamed from: e */
    Runnable f5163e = new C2006j();

    /* renamed from: f */
    Runnable f5164f = new C2007k();

    /* renamed from: g */
    Runnable f5165g = new C2008l();

    /* renamed from: h */
    Runnable f5166h = new C2009m();

    /* renamed from: i */
    Runnable f5167i = new C2010n();

    /* renamed from: j */
    Runnable f5168j = new C2011o();

    /* renamed from: k */
    Runnable f5169k = new C2012p();

    /* renamed from: l */
    Runnable f5170l = new C2013q();

    /* renamed from: m */
    Runnable f5171m = new C1997a();

    /* renamed from: n */
    Runnable f5172n = new C1998b();

    /* renamed from: o */
    Runnable f5173o = new C1999c();

    /* renamed from: p */
    Runnable f5174p = new C2000d();

    /* renamed from: q */
    Runnable f5175q = new C2001e();

    /* renamed from: r */
    Runnable f5176r = new C2002f();

    /* renamed from: s */
    Runnable f5177s = new C2003g();

    /* renamed from: t */
    Runnable f5178t = new C2004h();

    /* renamed from: com.chartboost.sdk.impl.w1$a */
    class C1997a implements Runnable {
        C1997a() {
        }

        public void run() {
            if (C1996w1.this.f5159a != null) {
                C1996w1.this.f5159a.onHideCustomView();
            } else {
                CBLogging.m3993b("NativeBridgeCommand", "Video completed command error - client");
            }
            if (C1996w1.this.f5160b != null) {
                C1996w1.this.f5160b.mo14821b(1);
                C1996w1.this.f5160b.mo14815F();
                return;
            }
            CBLogging.m3993b("NativeBridgeCommand", "Video completed command error - protocol");
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$b */
    class C1998b implements Runnable {
        C1998b() {
        }

        public void run() {
            if (C1996w1.this.f5160b != null) {
                try {
                    String string = C1996w1.this.f5161c.getString("name");
                    if (!C2014x.m4911b().mo14884a((CharSequence) string)) {
                        C1996w1.this.f5160b.f5126p = string;
                    }
                } catch (Exception unused) {
                    CBLogging.m3993b("NativeBridgeCommand", "Cannot find video file name");
                    if (C1996w1.this.f5160b != null) {
                        C1996w1.this.f5160b.mo14830h("Parsing exception unknown field for video pause");
                    }
                }
                C1996w1.this.f5160b.mo14821b(3);
                return;
            }
            CBLogging.m3993b("NativeBridgeCommand", "Video paused command error");
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$c */
    class C1999c implements Runnable {
        C1999c() {
        }

        public void run() {
            if (C1996w1.this.f5160b != null) {
                try {
                    String string = C1996w1.this.f5161c.getString("name");
                    if (!C2014x.m4911b().mo14884a((CharSequence) string)) {
                        C1996w1.this.f5160b.f5126p = string;
                    }
                } catch (Exception unused) {
                    CBLogging.m3993b("NativeBridgeCommand", "Cannot find video file name");
                    C1996w1.this.f5160b.mo14830h("Parsing exception unknown field for video play");
                }
                C1996w1.this.f5160b.mo14821b(2);
                return;
            }
            CBLogging.m3993b("NativeBridgeCommand", "Video playing command error");
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$d */
    class C2000d implements Runnable {
        C2000d() {
        }

        public void run() {
            if (C1996w1.this.f5160b != null) {
                try {
                    String string = C1996w1.this.f5161c.getString("name");
                    if (!C2014x.m4911b().mo14884a((CharSequence) string)) {
                        C1996w1.this.f5160b.f5126p = string;
                    }
                } catch (Exception unused) {
                    CBLogging.m3993b("NativeBridgeCommand", "Cannot find video file name");
                    C1996w1.this.f5160b.mo14830h("Parsing exception unknown field for video replay");
                }
            } else {
                CBLogging.m3993b("NativeBridgeCommand", "Video replay command error");
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$e */
    class C2001e implements Runnable {
        C2001e() {
        }

        public void run() {
            try {
                String string = C1996w1.this.f5161c.getString("message");
                String name = C1986u1.class.getName();
                Log.d(name, "JS->Native Warning message: " + string);
                C1996w1.this.f5160b.mo14830h(string);
            } catch (Exception unused) {
                CBLogging.m3993b("NativeBridgeCommand", "Warning message is empty");
                if (C1996w1.this.f5160b != null) {
                    C1996w1.this.f5160b.mo14830h("");
                }
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$f */
    class C2002f implements Runnable {
        C2002f() {
        }

        public void run() {
            try {
                C1996w1.this.f5160b.mo14825c(C1996w1.this.f5161c);
            } catch (Exception unused) {
                CBLogging.m3993b("NativeBridgeCommand", "Invalid set orientation command");
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$g */
    class C2003g implements Runnable {
        C2003g() {
        }

        public void run() {
            try {
                C1996w1.this.f5160b.mo14813D();
            } catch (Exception unused) {
                CBLogging.m3993b("NativeBridgeCommand", "Invalid rewarded video completed command");
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$h */
    class C2004h implements Runnable {
        C2004h() {
        }

        public void run() {
            try {
                C1996w1.this.f5160b.mo14811A();
            } catch (Exception unused) {
                CBLogging.m3993b("NativeBridgeCommand", "Invalid rewarded command");
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$i */
    class C2005i implements Runnable {
        C2005i() {
        }

        public void run() {
            if (C1996w1.this.f5160b != null) {
                C1996w1.this.f5160b.mo14523a((JSONObject) null);
            } else {
                CBLogging.m3993b("NativeBridgeCommand", "Click command error");
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$j */
    class C2006j implements Runnable {
        C2006j() {
        }

        public void run() {
            if (C1996w1.this.f5160b != null) {
                C1996w1.this.f5160b.mo14517a();
            } else {
                CBLogging.m3993b("NativeBridgeCommand", "Close command error");
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$k */
    class C2007k implements Runnable {
        C2007k() {
        }

        public void run() {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("######### JS->Native Video current player duration");
                float f = ((float) C1996w1.this.f5161c.getDouble("duration")) * 1000.0f;
                sb.append(f);
                CBLogging.m3991a("NativeBridgeCommand", sb.toString());
                C1996w1.this.f5160b.mo14819a(f);
            } catch (Exception unused) {
                if (C1996w1.this.f5160b != null) {
                    C1996w1.this.f5160b.mo14830h("Parsing exception unknown field for current player duration");
                }
                CBLogging.m3993b("NativeBridgeCommand", "Cannot find duration parameter for the video");
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$l */
    class C2008l implements Runnable {
        C2008l() {
        }

        public void run() {
            try {
                C1996w1.this.f5160b.mo14828f(C1996w1.this.m4907a(C1996w1.this.f5161c, "JS->Native Debug message: "));
            } catch (Exception unused) {
                CBLogging.m3993b("NativeBridgeCommand", "Exception occured while parsing the message for webview debug track event");
                if (C1996w1.this.f5160b != null) {
                    C1996w1.this.f5160b.mo14828f("Exception occured while parsing the message for webview debug track event");
                }
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$m */
    class C2009m implements Runnable {
        C2009m() {
        }

        public void run() {
            try {
                C1996w1.this.f5160b.mo14812B();
                C1996w1.this.f5160b.mo14824c(C1996w1.this.m4907a(C1996w1.this.f5161c, "JS->Native Error message: "));
            } catch (Exception unused) {
                CBLogging.m3993b("NativeBridgeCommand", "Error message is empty");
                if (C1996w1.this.f5160b != null) {
                    C1996w1.this.f5160b.mo14824c("");
                }
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$n */
    class C2010n implements Runnable {
        C2010n() {
        }

        public void run() {
            try {
                String string = C1996w1.this.f5161c.getString("url");
                if (!string.startsWith("http://") && !string.startsWith("https://")) {
                    string = "http://" + string;
                }
                C1996w1.this.f5160b.mo14520a(string, (JSONObject) null);
            } catch (ActivityNotFoundException e) {
                CBLogging.m3993b("NativeBridgeCommand", "ActivityNotFoundException occured when opening a url in a browser: " + e.toString());
            } catch (Exception e2) {
                CBLogging.m3993b("NativeBridgeCommand", "Exception while opening a browser view with MRAID url: " + e2.toString());
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$o */
    class C2011o implements Runnable {
        C2011o() {
        }

        public void run() {
            if (C1996w1.this.f5160b != null) {
                C1996w1.this.f5160b.mo14814E();
            } else {
                CBLogging.m3993b("NativeBridgeCommand", "Show command error");
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$p */
    class C2012p implements Runnable {
        C2012p() {
        }

        public void run() {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("######### JS->Native Video total player duration");
                float f = ((float) C1996w1.this.f5161c.getDouble("duration")) * 1000.0f;
                sb.append(f);
                CBLogging.m3991a("NativeBridgeCommand", sb.toString());
                C1996w1.this.f5160b.mo14820b(f);
            } catch (Exception unused) {
                if (C1996w1.this.f5160b != null) {
                    C1996w1.this.f5160b.mo14830h("Parsing exception unknown field for total player duration");
                }
                CBLogging.m3993b("NativeBridgeCommand", "Cannot find duration parameter for the video");
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w1$q */
    class C2013q implements Runnable {
        C2013q() {
        }

        public void run() {
            try {
                String string = C1996w1.this.f5161c.getString("event");
                C1996w1.this.f5160b.mo14829g(string);
                String name = C1986u1.class.getName();
                Log.d(name, "JS->Native Track VAST event message: " + string);
            } catch (Exception unused) {
                CBLogging.m3993b("NativeBridgeCommand", "Exception occured while parsing the message for webview tracking VAST events");
            }
        }
    }

    C1996w1(C1982t1 t1Var, C1989v1 v1Var) {
        this.f5159a = t1Var;
        this.f5160b = v1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14862a(JSONObject jSONObject) {
        this.f5161c = jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m4907a(JSONObject jSONObject, String str) throws JSONException {
        String string = jSONObject.getString("message");
        String name = C1986u1.class.getName();
        Log.d(name, str + string);
        return string;
    }
}
